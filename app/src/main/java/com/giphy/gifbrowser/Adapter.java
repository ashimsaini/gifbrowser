package com.giphy.gifbrowser;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.downloader.Error;
import com.downloader.OnCancelListener;
import com.downloader.OnDownloadListener;
import com.downloader.OnPauseListener;
import com.downloader.OnProgressListener;
import com.downloader.OnStartOrResumeListener;
import com.downloader.PRDownloader;
import com.downloader.Progress;
import com.downloader.Status;
import com.giphy.gifbrowser.models.GIFModel;

import java.util.Calendar;

// Extends the Adapter class to RecyclerView.Adapter 
// and implement the unimplemented methods 
public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    GIFModel images;
    Context context;
    Dialog progressBarDialog;
    ProgressBar progressBar;
    // Constructor for initialization 
    public Adapter(Context context, GIFModel images) {
        this.context = context;
        this.images = images;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        Adapter.ViewHolder viewHolder = new Adapter.ViewHolder(view);
        return viewHolder;
    }

    // Binding data to the into specified position 
    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

        String url = images.getData().get(position).getImages().getPreviewGif().getUrl();

        View view1 = holder.itemView.findViewById(R.id.list_item_parent);
        Glide
                .with(context)
                .load(url)
                .centerCrop()
                .placeholder(R.drawable.ic_baseline_android_24)
                .error(R.drawable.ic_baseline_error_outline_24)
                .into(holder.images);

        holder.images.setOnClickListener(view -> openDialog(position));

        holder.images.setOnLongClickListener(view -> {
            openDialog(position);
            return false;
        });
    }

    private void openDialog(int position) {
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.gif_dialog);
        ImageView imageView = dialog.findViewById(R.id.iv_dialog_image);
        TextView textView = dialog.findViewById(R.id.tv_username);
        TextView textView1 = dialog.findViewById(R.id.tv_title);

        Glide
                .with(context)
                .load(images.getData().get(position).getImages().getOriginal().getUrl())
                .centerCrop()
                .placeholder(R.drawable.ic_baseline_android_24)
                .error(R.drawable.ic_baseline_error_outline_24)
                .into(imageView);
        textView.setText(images.getData().get(position).getUsername());
        textView1.setText(images.getData().get(position).getTitle());

        dialog.findViewById(R.id.iv_download_image).setOnClickListener(view -> {
            dialog.hide();
            int downloadId = PRDownloader.download(images.getData().get(position).getImages().getOriginal().getUrl(), Utils.getRootDirPath(context),
                    Calendar.getInstance().getTimeInMillis()+"_giphy.gif")
                    .build()
                    .setOnStartOrResumeListener(new OnStartOrResumeListener() {
                        @Override
                        public void onStartOrResume() {
                           showProgressBar();
                        }
                    })
                    .setOnPauseListener(new OnPauseListener() {
                        @Override
                        public void onPause() {
                            hideProgressBar();
                        }
                    })
                    .setOnCancelListener(new OnCancelListener() {
                        @Override
                        public void onCancel() {
                            hideProgressBar();
                        }
                    })
                    .setOnProgressListener(new OnProgressListener() {
                        @Override
                        public void onProgress(Progress progress) {
                            long progressPercent = progress.currentBytes * 100 / progress.totalBytes;
                            progressBar.setProgress((int) progressPercent);
                        }
                    })
                    .start(new OnDownloadListener() {
                        @Override
                        public void onDownloadComplete() {
                            hideProgressBar();
                        }

                        @Override
                        public void onError(Error error) {
                            hideProgressBar();
                        }
                    });
        });
        dialog.show();
    }

    private void hideProgressBar() {
        progressBarDialog.hide();
    }

    private void showProgressBar() {
        progressBarDialog = new Dialog(context);
        progressBarDialog.setCancelable(false);
        progressBarDialog.setContentView(R.layout.progressbar_dilaog);
        progressBar = progressBarDialog.findViewById(R.id.progressBar);
        progressBarDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        progressBarDialog.show();
    }

    @Override
    public int getItemCount() {
        // Returns number of items currently available in Adapter 
        return images != null && images.getData() != null ? images.getData().size() : 0;
    }

    // Initializing the Views 
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView images;

        public ViewHolder(View view) {
            super(view);
            images = (ImageView) view.findViewById(R.id.imageView);
        }
    }
}
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

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;

// Extends the DownloadAdapter class to RecyclerView.DownloadAdapter
// and implement the unimplemented methods
public class DownloadAdapter extends RecyclerView.Adapter<DownloadAdapter.ViewHolder> {

    ArrayList<File> images;
    Context context;
    Dialog progressBarDialog;
    ProgressBar progressBar;
    // Constructor for initialization
    public DownloadAdapter(Context context,  ArrayList<File> images) {
        this.context = context;
        this.images = images;
    }

    @NonNull
    @Override
    public DownloadAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        DownloadAdapter.ViewHolder viewHolder = new DownloadAdapter.ViewHolder(view);
        return viewHolder;
    }

    // Binding data to the into specified position
    @Override
    public void onBindViewHolder(@NonNull DownloadAdapter.ViewHolder holder, int position) {


        View view1 = holder.itemView.findViewById(R.id.list_item_parent);
        Glide
                .with(context)
                .load(images.get(position))
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
        dialog.findViewById(R.id.tv_username).setVisibility(View.INVISIBLE);
         dialog.findViewById(R.id.tv_title).setVisibility(View.INVISIBLE);

        Glide
                .with(context)
                .load(images.get(position))
                .centerCrop()
                .placeholder(R.drawable.ic_baseline_android_24)
                .error(R.drawable.ic_baseline_error_outline_24)
                .into(imageView);

        dialog.findViewById(R.id.iv_download_image).setVisibility(View.INVISIBLE);
        dialog.show();
    }

    private void hideProgressBar() {
        progressBarDialog.hide();
    }

    private void showProgressBar() {
        progressBarDialog = new Dialog(context);
        progressBarDialog.setContentView(R.layout.progressbar_dilaog);
        progressBar = progressBarDialog.findViewById(R.id.progressBar);
        progressBarDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        progressBarDialog.show();
    }

    @Override
    public int getItemCount() {
        // Returns number of items currently available in DownloadAdapter
        return images.size();
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
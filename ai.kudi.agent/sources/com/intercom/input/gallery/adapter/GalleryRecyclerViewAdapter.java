package com.intercom.input.gallery.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.intercom.composer.ImageLoader;
import com.intercom.input.gallery.C7177R;
import com.intercom.input.gallery.GalleryImage;
import java.util.List;
/* loaded from: classes2.dex */
public class GalleryRecyclerViewAdapter extends RecyclerView.AbstractC1623h<ImageViewHolder> {
    private final boolean expanded;
    private final List<GalleryImage> galleryImages;
    private final ImageLoader imageLoader;
    private final LayoutInflater layoutInflater;
    private final OnImageClickListener onImageClickListener;

    public GalleryRecyclerViewAdapter(LayoutInflater layoutInflater, List<GalleryImage> list, boolean z, OnImageClickListener onImageClickListener, ImageLoader imageLoader) {
        this.layoutInflater = layoutInflater;
        this.galleryImages = list;
        this.expanded = z;
        this.onImageClickListener = onImageClickListener;
        this.imageLoader = imageLoader;
    }

    public GalleryImage getItem(int i) {
        return this.galleryImages.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        return this.galleryImages.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public void onBindViewHolder(ImageViewHolder imageViewHolder, int i) {
        this.imageLoader.loadImageIntoView(this.galleryImages.get(i), imageViewHolder.getImageView());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public ImageViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ImageViewHolder(this.layoutInflater.inflate(this.expanded ? C7177R.C7180layout.intercom_composer_expanded_image_list_item : C7177R.C7180layout.intercom_composer_image_list_item, viewGroup, false), this.onImageClickListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public void onViewRecycled(ImageViewHolder imageViewHolder) {
        super.onViewRecycled((GalleryRecyclerViewAdapter) imageViewHolder);
        this.imageLoader.clear(imageViewHolder.getImageView());
    }
}

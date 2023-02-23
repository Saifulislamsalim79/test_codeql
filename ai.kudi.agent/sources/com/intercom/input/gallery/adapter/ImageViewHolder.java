package com.intercom.input.gallery.adapter;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.intercom.input.gallery.C7177R;
/* loaded from: classes2.dex */
class ImageViewHolder extends RecyclerView.AbstractC1620e0 {
    private final ImageView imageView;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImageViewHolder(View view, final OnImageClickListener onImageClickListener) {
        super(view);
        this.imageView = (ImageView) view.findViewById(C7177R.C7179id.thumbnail);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.intercom.input.gallery.adapter.ImageViewHolder.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                onImageClickListener.onImageClicked(ImageViewHolder.this);
            }
        });
    }

    public ImageView getImageView() {
        return this.imageView;
    }
}

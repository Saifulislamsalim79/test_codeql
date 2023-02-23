package com.intercom.composer;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.intercom.input.gallery.GalleryImage;
/* loaded from: classes2.dex */
public interface ImageLoader {
    void clear(ImageView imageView);

    Bitmap getBitmapFromView(ImageView imageView);

    void loadImageIntoView(GalleryImage galleryImage, ImageView imageView);
}

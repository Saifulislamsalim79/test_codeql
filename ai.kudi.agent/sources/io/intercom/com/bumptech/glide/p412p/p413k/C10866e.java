package io.intercom.com.bumptech.glide.p412p.p413k;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
/* compiled from: ImageViewTargetFactory.java */
/* renamed from: io.intercom.com.bumptech.glide.p.k.e */
/* loaded from: classes3.dex */
public class C10866e {
    /* renamed from: a */
    public <Z> AbstractC10870i<ImageView, Z> m12070a(ImageView imageView, Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new C10863b(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C10864c(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}

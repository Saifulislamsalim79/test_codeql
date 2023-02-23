package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.C7360t;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ImageViewAction.java */
/* renamed from: com.squareup.picasso.l */
/* loaded from: classes2.dex */
public class C7347l extends AbstractC7316a<ImageView> {

    /* renamed from: m */
    InterfaceC7336e f17396m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7347l(C7360t c7360t, ImageView imageView, C7373w c7373w, int i, int i2, int i3, Drawable drawable, String str, Object obj, InterfaceC7336e interfaceC7336e, boolean z) {
        super(c7360t, imageView, c7373w, i, i2, i3, drawable, str, obj, z);
        this.f17396m = interfaceC7336e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.squareup.picasso.AbstractC7316a
    /* renamed from: a */
    public void mo18908a() {
        super.mo18908a();
        if (this.f17396m != null) {
            this.f17396m = null;
        }
    }

    @Override // com.squareup.picasso.AbstractC7316a
    /* renamed from: b */
    public void mo18907b(Bitmap bitmap, C7360t.EnumC7366e enumC7366e) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.f17295c.get();
            if (imageView == null) {
                return;
            }
            C7360t c7360t = this.f17293a;
            C7370u.m18868c(imageView, c7360t.f17435e, bitmap, enumC7366e, this.f17296d, c7360t.f17443m);
            InterfaceC7336e interfaceC7336e = this.f17396m;
            if (interfaceC7336e != null) {
                interfaceC7336e.onSuccess();
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
    }

    @Override // com.squareup.picasso.AbstractC7316a
    /* renamed from: c */
    public void mo18906c(Exception exc) {
        ImageView imageView = (ImageView) this.f17295c.get();
        if (imageView == null) {
            return;
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        int i = this.f17299g;
        if (i != 0) {
            imageView.setImageResource(i);
        } else {
            Drawable drawable2 = this.f17300h;
            if (drawable2 != null) {
                imageView.setImageDrawable(drawable2);
            }
        }
        InterfaceC7336e interfaceC7336e = this.f17396m;
        if (interfaceC7336e != null) {
            interfaceC7336e.onError(exc);
        }
    }
}

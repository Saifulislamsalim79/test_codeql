package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.InterfaceC1405m;
import p201g.p227h.p238l.InterfaceC7758w;
/* loaded from: classes2.dex */
public class AppCompatImageView extends ImageView implements InterfaceC7758w, InterfaceC1405m {
    private final C1089e mBackgroundTintHelper;
    private final C1116k mImageHelper;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1089e c1089e = this.mBackgroundTintHelper;
        if (c1089e != null) {
            c1089e.m37223b();
        }
        C1116k c1116k = this.mImageHelper;
        if (c1116k != null) {
            c1116k.m37104b();
        }
    }

    @Override // p201g.p227h.p238l.InterfaceC7758w
    public ColorStateList getSupportBackgroundTintList() {
        C1089e c1089e = this.mBackgroundTintHelper;
        if (c1089e != null) {
            return c1089e.m37222c();
        }
        return null;
    }

    @Override // p201g.p227h.p238l.InterfaceC7758w
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1089e c1089e = this.mBackgroundTintHelper;
        if (c1089e != null) {
            return c1089e.m37221d();
        }
        return null;
    }

    @Override // androidx.core.widget.InterfaceC1405m
    public ColorStateList getSupportImageTintList() {
        C1116k c1116k = this.mImageHelper;
        if (c1116k != null) {
            return c1116k.m37103c();
        }
        return null;
    }

    @Override // androidx.core.widget.InterfaceC1405m
    public PorterDuff.Mode getSupportImageTintMode() {
        C1116k c1116k = this.mImageHelper;
        if (c1116k != null) {
            return c1116k.m37102d();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.mImageHelper.m37101e() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1089e c1089e = this.mBackgroundTintHelper;
        if (c1089e != null) {
            c1089e.m37219f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1089e c1089e = this.mBackgroundTintHelper;
        if (c1089e != null) {
            c1089e.m37218g(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C1116k c1116k = this.mImageHelper;
        if (c1116k != null) {
            c1116k.m37104b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C1116k c1116k = this.mImageHelper;
        if (c1116k != null) {
            c1116k.m37104b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C1116k c1116k = this.mImageHelper;
        if (c1116k != null) {
            c1116k.m37099g(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C1116k c1116k = this.mImageHelper;
        if (c1116k != null) {
            c1116k.m37104b();
        }
    }

    @Override // p201g.p227h.p238l.InterfaceC7758w
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1089e c1089e = this.mBackgroundTintHelper;
        if (c1089e != null) {
            c1089e.m37216i(colorStateList);
        }
    }

    @Override // p201g.p227h.p238l.InterfaceC7758w
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1089e c1089e = this.mBackgroundTintHelper;
        if (c1089e != null) {
            c1089e.m37215j(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC1405m
    public void setSupportImageTintList(ColorStateList colorStateList) {
        C1116k c1116k = this.mImageHelper;
        if (c1116k != null) {
            c1116k.m37098h(colorStateList);
        }
    }

    @Override // androidx.core.widget.InterfaceC1405m
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C1116k c1116k = this.mImageHelper;
        if (c1116k != null) {
            c1116k.m37097i(mode);
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(C1130o0.m37055b(context), attributeSet, i);
        C1126m0.m37066a(this, getContext());
        C1089e c1089e = new C1089e(this);
        this.mBackgroundTintHelper = c1089e;
        c1089e.m37220e(attributeSet, i);
        C1116k c1116k = new C1116k(this);
        this.mImageHelper = c1116k;
        c1116k.m37100f(attributeSet, i);
    }
}

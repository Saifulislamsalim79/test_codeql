package com.github.ybq.android.spinkit;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.github.ybq.android.spinkit.p093g.AbstractC2540f;
/* loaded from: classes2.dex */
public class SpinKitView extends ProgressBar {

    /* renamed from: c */
    private EnumC2521e f7141c;

    /* renamed from: d */
    private int f7142d;

    /* renamed from: e */
    private AbstractC2540f f7143e;

    public SpinKitView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2516a.SpinKitViewStyle);
    }

    /* renamed from: a */
    private void m32692a() {
        AbstractC2540f m32691a = C2519d.m32691a(this.f7141c);
        m32691a.mo32596u(this.f7142d);
        setIndeterminateDrawable(m32691a);
    }

    @Override // android.view.View
    public void onScreenStateChanged(int i) {
        AbstractC2540f abstractC2540f;
        super.onScreenStateChanged(i);
        if (i != 0 || (abstractC2540f = this.f7143e) == null) {
            return;
        }
        abstractC2540f.stop();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.f7143e != null && getVisibility() == 0) {
            this.f7143e.start();
        }
    }

    public void setColor(int i) {
        this.f7142d = i;
        AbstractC2540f abstractC2540f = this.f7143e;
        if (abstractC2540f != null) {
            abstractC2540f.mo32596u(i);
        }
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable instanceof AbstractC2540f) {
            setIndeterminateDrawable((AbstractC2540f) drawable);
            return;
        }
        throw new IllegalArgumentException("this d must be instanceof Sprite");
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        if (drawable instanceof AbstractC2540f) {
            ((AbstractC2540f) drawable).stop();
        }
    }

    public SpinKitView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, C2517b.SpinKitView);
    }

    @Override // android.widget.ProgressBar
    public AbstractC2540f getIndeterminateDrawable() {
        return this.f7143e;
    }

    public SpinKitView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2518c.SpinKitView, i, i2);
        this.f7141c = EnumC2521e.values()[obtainStyledAttributes.getInt(C2518c.SpinKitView_SpinKit_Style, 0)];
        this.f7142d = obtainStyledAttributes.getColor(C2518c.SpinKitView_SpinKit_Color, -1);
        obtainStyledAttributes.recycle();
        m32692a();
        setIndeterminate(true);
    }

    public void setIndeterminateDrawable(AbstractC2540f abstractC2540f) {
        super.setIndeterminateDrawable((Drawable) abstractC2540f);
        this.f7143e = abstractC2540f;
        if (abstractC2540f.mo32597c() == 0) {
            this.f7143e.mo32596u(this.f7142d);
        }
        onSizeChanged(getWidth(), getHeight(), getWidth(), getHeight());
        if (getVisibility() == 0) {
            this.f7143e.start();
        }
    }
}

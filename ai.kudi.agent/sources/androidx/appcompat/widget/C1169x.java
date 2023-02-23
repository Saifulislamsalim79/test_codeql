package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import p201g.p227h.p238l.InterfaceC7758w;
/* compiled from: AppCompatToggleButton.java */
/* renamed from: androidx.appcompat.widget.x */
/* loaded from: classes2.dex */
public class C1169x extends ToggleButton implements InterfaceC7758w {

    /* renamed from: c */
    private final C1089e f3576c;

    /* renamed from: d */
    private final C1160v f3577d;

    public C1169x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1089e c1089e = this.f3576c;
        if (c1089e != null) {
            c1089e.m37223b();
        }
        C1160v c1160v = this.f3577d;
        if (c1160v != null) {
            c1160v.m36971b();
        }
    }

    @Override // p201g.p227h.p238l.InterfaceC7758w
    public ColorStateList getSupportBackgroundTintList() {
        C1089e c1089e = this.f3576c;
        if (c1089e != null) {
            return c1089e.m37222c();
        }
        return null;
    }

    @Override // p201g.p227h.p238l.InterfaceC7758w
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1089e c1089e = this.f3576c;
        if (c1089e != null) {
            return c1089e.m37221d();
        }
        return null;
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1089e c1089e = this.f3576c;
        if (c1089e != null) {
            c1089e.m37219f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1089e c1089e = this.f3576c;
        if (c1089e != null) {
            c1089e.m37218g(i);
        }
    }

    @Override // p201g.p227h.p238l.InterfaceC7758w
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1089e c1089e = this.f3576c;
        if (c1089e != null) {
            c1089e.m37216i(colorStateList);
        }
    }

    @Override // p201g.p227h.p238l.InterfaceC7758w
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1089e c1089e = this.f3576c;
        if (c1089e != null) {
            c1089e.m37215j(mode);
        }
    }

    public C1169x(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1126m0.m37066a(this, getContext());
        C1089e c1089e = new C1089e(this);
        this.f3576c = c1089e;
        c1089e.m37220e(attributeSet, i);
        C1160v c1160v = new C1160v(this);
        this.f3577d = c1160v;
        c1160v.m36960m(attributeSet, i);
    }
}

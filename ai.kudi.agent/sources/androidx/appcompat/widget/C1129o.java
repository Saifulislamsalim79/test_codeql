package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.core.widget.InterfaceC1403k;
import p201g.p202a.C7452a;
import p201g.p202a.p203k.p204a.C7462a;
import p201g.p227h.p238l.InterfaceC7758w;
/* compiled from: AppCompatRadioButton.java */
/* renamed from: androidx.appcompat.widget.o */
/* loaded from: classes2.dex */
public class C1129o extends RadioButton implements InterfaceC1403k, InterfaceC7758w {

    /* renamed from: c */
    private final C1102h f3444c;

    /* renamed from: d */
    private final C1089e f3445d;

    /* renamed from: e */
    private final C1160v f3446e;

    public C1129o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7452a.radioButtonStyle);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1089e c1089e = this.f3445d;
        if (c1089e != null) {
            c1089e.m37223b();
        }
        C1160v c1160v = this.f3446e;
        if (c1160v != null) {
            c1160v.m36971b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C1102h c1102h = this.f3444c;
        return c1102h != null ? c1102h.m37170b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // p201g.p227h.p238l.InterfaceC7758w
    public ColorStateList getSupportBackgroundTintList() {
        C1089e c1089e = this.f3445d;
        if (c1089e != null) {
            return c1089e.m37222c();
        }
        return null;
    }

    @Override // p201g.p227h.p238l.InterfaceC7758w
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1089e c1089e = this.f3445d;
        if (c1089e != null) {
            return c1089e.m37221d();
        }
        return null;
    }

    @Override // androidx.core.widget.InterfaceC1403k
    public ColorStateList getSupportButtonTintList() {
        C1102h c1102h = this.f3444c;
        if (c1102h != null) {
            return c1102h.m37169c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C1102h c1102h = this.f3444c;
        if (c1102h != null) {
            return c1102h.m37168d();
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1089e c1089e = this.f3445d;
        if (c1089e != null) {
            c1089e.m37219f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1089e c1089e = this.f3445d;
        if (c1089e != null) {
            c1089e.m37218g(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C1102h c1102h = this.f3444c;
        if (c1102h != null) {
            c1102h.m37166f();
        }
    }

    @Override // p201g.p227h.p238l.InterfaceC7758w
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1089e c1089e = this.f3445d;
        if (c1089e != null) {
            c1089e.m37216i(colorStateList);
        }
    }

    @Override // p201g.p227h.p238l.InterfaceC7758w
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1089e c1089e = this.f3445d;
        if (c1089e != null) {
            c1089e.m37215j(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC1403k
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C1102h c1102h = this.f3444c;
        if (c1102h != null) {
            c1102h.m37165g(colorStateList);
        }
    }

    @Override // androidx.core.widget.InterfaceC1403k
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C1102h c1102h = this.f3444c;
        if (c1102h != null) {
            c1102h.m37164h(mode);
        }
    }

    public C1129o(Context context, AttributeSet attributeSet, int i) {
        super(C1130o0.m37055b(context), attributeSet, i);
        C1126m0.m37066a(this, getContext());
        C1102h c1102h = new C1102h(this);
        this.f3444c = c1102h;
        c1102h.m37167e(attributeSet, i);
        C1089e c1089e = new C1089e(this);
        this.f3445d = c1089e;
        c1089e.m37220e(attributeSet, i);
        C1160v c1160v = new C1160v(this);
        this.f3446e = c1160v;
        c1160v.m36960m(attributeSet, i);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C7462a.m18690d(getContext(), i));
    }
}

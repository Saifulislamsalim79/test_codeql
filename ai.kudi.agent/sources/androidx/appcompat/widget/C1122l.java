package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import p201g.p202a.C7452a;
import p201g.p202a.p203k.p204a.C7462a;
import p201g.p227h.p238l.InterfaceC7758w;
/* compiled from: AppCompatMultiAutoCompleteTextView.java */
/* renamed from: androidx.appcompat.widget.l */
/* loaded from: classes2.dex */
public class C1122l extends MultiAutoCompleteTextView implements InterfaceC7758w {

    /* renamed from: e */
    private static final int[] f3410e = {16843126};

    /* renamed from: c */
    private final C1089e f3411c;

    /* renamed from: d */
    private final C1160v f3412d;

    public C1122l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7452a.autoCompleteTextViewStyle);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1089e c1089e = this.f3411c;
        if (c1089e != null) {
            c1089e.m37223b();
        }
        C1160v c1160v = this.f3412d;
        if (c1160v != null) {
            c1160v.m36971b();
        }
    }

    @Override // p201g.p227h.p238l.InterfaceC7758w
    public ColorStateList getSupportBackgroundTintList() {
        C1089e c1089e = this.f3411c;
        if (c1089e != null) {
            return c1089e.m37222c();
        }
        return null;
    }

    @Override // p201g.p227h.p238l.InterfaceC7758w
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1089e c1089e = this.f3411c;
        if (c1089e != null) {
            return c1089e.m37221d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C1114j.m37113a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1089e c1089e = this.f3411c;
        if (c1089e != null) {
            c1089e.m37219f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1089e c1089e = this.f3411c;
        if (c1089e != null) {
            c1089e.m37218g(i);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C7462a.m18690d(getContext(), i));
    }

    @Override // p201g.p227h.p238l.InterfaceC7758w
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1089e c1089e = this.f3411c;
        if (c1089e != null) {
            c1089e.m37216i(colorStateList);
        }
    }

    @Override // p201g.p227h.p238l.InterfaceC7758w
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1089e c1089e = this.f3411c;
        if (c1089e != null) {
            c1089e.m37215j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1160v c1160v = this.f3412d;
        if (c1160v != null) {
            c1160v.m36956q(context, i);
        }
    }

    public C1122l(Context context, AttributeSet attributeSet, int i) {
        super(C1130o0.m37055b(context), attributeSet, i);
        C1126m0.m37066a(this, getContext());
        C1138r0 m37026v = C1138r0.m37026v(getContext(), attributeSet, f3410e, i, 0);
        if (m37026v.m37029s(0)) {
            setDropDownBackgroundDrawable(m37026v.m37041g(0));
        }
        m37026v.m37025w();
        C1089e c1089e = new C1089e(this);
        this.f3411c = c1089e;
        c1089e.m37220e(attributeSet, i);
        C1160v c1160v = new C1160v(this);
        this.f3412d = c1160v;
        c1160v.m36960m(attributeSet, i);
        this.f3412d.m36971b();
    }
}

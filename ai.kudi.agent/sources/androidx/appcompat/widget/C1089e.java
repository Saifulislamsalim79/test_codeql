package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import p201g.p202a.C7461j;
import p201g.p227h.p238l.C7759x;
/* compiled from: AppCompatBackgroundHelper.java */
/* renamed from: androidx.appcompat.widget.e */
/* loaded from: classes2.dex */
class C1089e {

    /* renamed from: a */
    private final View f3296a;

    /* renamed from: d */
    private C1132p0 f3299d;

    /* renamed from: e */
    private C1132p0 f3300e;

    /* renamed from: f */
    private C1132p0 f3301f;

    /* renamed from: c */
    private int f3298c = -1;

    /* renamed from: b */
    private final C1111i f3297b = C1111i.m37134b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1089e(View view) {
        this.f3296a = view;
    }

    /* renamed from: a */
    private boolean m37224a(Drawable drawable) {
        if (this.f3301f == null) {
            this.f3301f = new C1132p0();
        }
        C1132p0 c1132p0 = this.f3301f;
        c1132p0.m37054a();
        ColorStateList m17493s = C7759x.m17493s(this.f3296a);
        if (m17493s != null) {
            c1132p0.f3455d = true;
            c1132p0.f3452a = m17493s;
        }
        PorterDuff.Mode m17491t = C7759x.m17491t(this.f3296a);
        if (m17491t != null) {
            c1132p0.f3454c = true;
            c1132p0.f3453b = m17491t;
        }
        if (c1132p0.f3455d || c1132p0.f3454c) {
            C1111i.m37127i(drawable, c1132p0, this.f3296a.getDrawableState());
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private boolean m37214k() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f3299d != null : i == 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m37223b() {
        Drawable background = this.f3296a.getBackground();
        if (background != null) {
            if (m37214k() && m37224a(background)) {
                return;
            }
            C1132p0 c1132p0 = this.f3300e;
            if (c1132p0 != null) {
                C1111i.m37127i(background, c1132p0, this.f3296a.getDrawableState());
                return;
            }
            C1132p0 c1132p02 = this.f3299d;
            if (c1132p02 != null) {
                C1111i.m37127i(background, c1132p02, this.f3296a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList m37222c() {
        C1132p0 c1132p0 = this.f3300e;
        if (c1132p0 != null) {
            return c1132p0.f3452a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode m37221d() {
        C1132p0 c1132p0 = this.f3300e;
        if (c1132p0 != null) {
            return c1132p0.f3453b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m37220e(AttributeSet attributeSet, int i) {
        C1138r0 m37026v = C1138r0.m37026v(this.f3296a.getContext(), attributeSet, C7461j.ViewBackgroundHelper, i, 0);
        View view = this.f3296a;
        C7759x.m17502n0(view, view.getContext(), C7461j.ViewBackgroundHelper, attributeSet, m37026v.m37030r(), i, 0);
        try {
            if (m37026v.m37029s(C7461j.ViewBackgroundHelper_android_background)) {
                this.f3298c = m37026v.m37034n(C7461j.ViewBackgroundHelper_android_background, -1);
                ColorStateList m37130f = this.f3297b.m37130f(this.f3296a.getContext(), this.f3298c);
                if (m37130f != null) {
                    m37217h(m37130f);
                }
            }
            if (m37026v.m37029s(C7461j.ViewBackgroundHelper_backgroundTint)) {
                C7759x.m17490t0(this.f3296a, m37026v.m37045c(C7461j.ViewBackgroundHelper_backgroundTint));
            }
            if (m37026v.m37029s(C7461j.ViewBackgroundHelper_backgroundTintMode)) {
                C7759x.m17488u0(this.f3296a, C1068a0.m37281e(m37026v.m37037k(C7461j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            m37026v.m37025w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m37219f(Drawable drawable) {
        this.f3298c = -1;
        m37217h(null);
        m37223b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m37218g(int i) {
        this.f3298c = i;
        C1111i c1111i = this.f3297b;
        m37217h(c1111i != null ? c1111i.m37130f(this.f3296a.getContext(), i) : null);
        m37223b();
    }

    /* renamed from: h */
    void m37217h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f3299d == null) {
                this.f3299d = new C1132p0();
            }
            C1132p0 c1132p0 = this.f3299d;
            c1132p0.f3452a = colorStateList;
            c1132p0.f3455d = true;
        } else {
            this.f3299d = null;
        }
        m37223b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m37216i(ColorStateList colorStateList) {
        if (this.f3300e == null) {
            this.f3300e = new C1132p0();
        }
        C1132p0 c1132p0 = this.f3300e;
        c1132p0.f3452a = colorStateList;
        c1132p0.f3455d = true;
        m37223b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m37215j(PorterDuff.Mode mode) {
        if (this.f3300e == null) {
            this.f3300e = new C1132p0();
        }
        C1132p0 c1132p0 = this.f3300e;
        c1132p0.f3453b = mode;
        c1132p0.f3454c = true;
        m37223b();
    }
}

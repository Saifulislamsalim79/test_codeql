package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.C1394e;
import p201g.p202a.C7461j;
import p201g.p202a.p203k.p204a.C7462a;
import p201g.p227h.p238l.C7759x;
/* compiled from: AppCompatImageHelper.java */
/* renamed from: androidx.appcompat.widget.k */
/* loaded from: classes2.dex */
public class C1116k {

    /* renamed from: a */
    private final ImageView f3387a;

    /* renamed from: b */
    private C1132p0 f3388b;

    /* renamed from: c */
    private C1132p0 f3389c;

    /* renamed from: d */
    private C1132p0 f3390d;

    public C1116k(ImageView imageView) {
        this.f3387a = imageView;
    }

    /* renamed from: a */
    private boolean m37105a(Drawable drawable) {
        if (this.f3390d == null) {
            this.f3390d = new C1132p0();
        }
        C1132p0 c1132p0 = this.f3390d;
        c1132p0.m37054a();
        ColorStateList m36117a = C1394e.m36117a(this.f3387a);
        if (m36117a != null) {
            c1132p0.f3455d = true;
            c1132p0.f3452a = m36117a;
        }
        PorterDuff.Mode m36116b = C1394e.m36116b(this.f3387a);
        if (m36116b != null) {
            c1132p0.f3454c = true;
            c1132p0.f3453b = m36116b;
        }
        if (c1132p0.f3455d || c1132p0.f3454c) {
            C1111i.m37127i(drawable, c1132p0, this.f3387a.getDrawableState());
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private boolean m37096j() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f3388b != null : i == 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m37104b() {
        Drawable drawable = this.f3387a.getDrawable();
        if (drawable != null) {
            C1068a0.m37284b(drawable);
        }
        if (drawable != null) {
            if (m37096j() && m37105a(drawable)) {
                return;
            }
            C1132p0 c1132p0 = this.f3389c;
            if (c1132p0 != null) {
                C1111i.m37127i(drawable, c1132p0, this.f3387a.getDrawableState());
                return;
            }
            C1132p0 c1132p02 = this.f3388b;
            if (c1132p02 != null) {
                C1111i.m37127i(drawable, c1132p02, this.f3387a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList m37103c() {
        C1132p0 c1132p0 = this.f3389c;
        if (c1132p0 != null) {
            return c1132p0.f3452a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode m37102d() {
        C1132p0 c1132p0 = this.f3389c;
        if (c1132p0 != null) {
            return c1132p0.f3453b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m37101e() {
        return Build.VERSION.SDK_INT < 21 || !(this.f3387a.getBackground() instanceof RippleDrawable);
    }

    /* renamed from: f */
    public void m37100f(AttributeSet attributeSet, int i) {
        int m37034n;
        C1138r0 m37026v = C1138r0.m37026v(this.f3387a.getContext(), attributeSet, C7461j.AppCompatImageView, i, 0);
        ImageView imageView = this.f3387a;
        C7759x.m17502n0(imageView, imageView.getContext(), C7461j.AppCompatImageView, attributeSet, m37026v.m37030r(), i, 0);
        try {
            Drawable drawable = this.f3387a.getDrawable();
            if (drawable == null && (m37034n = m37026v.m37034n(C7461j.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = C7462a.m18690d(this.f3387a.getContext(), m37034n)) != null) {
                this.f3387a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C1068a0.m37284b(drawable);
            }
            if (m37026v.m37029s(C7461j.AppCompatImageView_tint)) {
                C1394e.m36115c(this.f3387a, m37026v.m37045c(C7461j.AppCompatImageView_tint));
            }
            if (m37026v.m37029s(C7461j.AppCompatImageView_tintMode)) {
                C1394e.m36114d(this.f3387a, C1068a0.m37281e(m37026v.m37037k(C7461j.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            m37026v.m37025w();
        }
    }

    /* renamed from: g */
    public void m37099g(int i) {
        if (i != 0) {
            Drawable m18690d = C7462a.m18690d(this.f3387a.getContext(), i);
            if (m18690d != null) {
                C1068a0.m37284b(m18690d);
            }
            this.f3387a.setImageDrawable(m18690d);
        } else {
            this.f3387a.setImageDrawable(null);
        }
        m37104b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m37098h(ColorStateList colorStateList) {
        if (this.f3389c == null) {
            this.f3389c = new C1132p0();
        }
        C1132p0 c1132p0 = this.f3389c;
        c1132p0.f3452a = colorStateList;
        c1132p0.f3455d = true;
        m37104b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m37097i(PorterDuff.Mode mode) {
        if (this.f3389c == null) {
            this.f3389c = new C1132p0();
        }
        C1132p0 c1132p0 = this.f3389c;
        c1132p0.f3453b = mode;
        c1132p0.f3454c = true;
        m37104b();
    }
}

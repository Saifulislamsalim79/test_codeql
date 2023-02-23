package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.content.p057e.C1355f;
import androidx.core.widget.C1398i;
import androidx.core.widget.InterfaceC1391b;
import java.lang.ref.WeakReference;
import java.util.Locale;
import p201g.p202a.C7461j;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.p240i0.C7735a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatTextHelper.java */
/* renamed from: androidx.appcompat.widget.v */
/* loaded from: classes2.dex */
public class C1160v {

    /* renamed from: a */
    private final TextView f3533a;

    /* renamed from: b */
    private C1132p0 f3534b;

    /* renamed from: c */
    private C1132p0 f3535c;

    /* renamed from: d */
    private C1132p0 f3536d;

    /* renamed from: e */
    private C1132p0 f3537e;

    /* renamed from: f */
    private C1132p0 f3538f;

    /* renamed from: g */
    private C1132p0 f3539g;

    /* renamed from: h */
    private C1132p0 f3540h;

    /* renamed from: i */
    private final C1164w f3541i;

    /* renamed from: j */
    private int f3542j = 0;

    /* renamed from: k */
    private int f3543k = -1;

    /* renamed from: l */
    private Typeface f3544l;

    /* renamed from: m */
    private boolean f3545m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatTextHelper.java */
    /* renamed from: androidx.appcompat.widget.v$a */
    /* loaded from: classes2.dex */
    public class C1161a extends C1355f.AbstractC1358c {

        /* renamed from: a */
        final /* synthetic */ int f3546a;

        /* renamed from: b */
        final /* synthetic */ int f3547b;

        /* renamed from: c */
        final /* synthetic */ WeakReference f3548c;

        C1161a(int i, int i2, WeakReference weakReference) {
            this.f3546a = i;
            this.f3547b = i2;
            this.f3548c = weakReference;
        }

        @Override // androidx.core.content.p057e.C1355f.AbstractC1358c
        /* renamed from: d */
        public void mo15033d(int i) {
        }

        @Override // androidx.core.content.p057e.C1355f.AbstractC1358c
        /* renamed from: e */
        public void mo15032e(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f3546a) != -1) {
                typeface = Typeface.create(typeface, i, (this.f3547b & 2) != 0);
            }
            C1160v.this.m36959n(this.f3548c, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatTextHelper.java */
    /* renamed from: androidx.appcompat.widget.v$b */
    /* loaded from: classes2.dex */
    public class RunnableC1162b implements Runnable {

        /* renamed from: c */
        final /* synthetic */ TextView f3550c;

        /* renamed from: d */
        final /* synthetic */ Typeface f3551d;

        /* renamed from: e */
        final /* synthetic */ int f3552e;

        RunnableC1162b(C1160v c1160v, TextView textView, Typeface typeface, int i) {
            this.f3550c = textView;
            this.f3551d = typeface;
            this.f3552e = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3550c.setTypeface(this.f3551d, this.f3552e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1160v(TextView textView) {
        this.f3533a = textView;
        this.f3541i = new C1164w(this.f3533a);
    }

    /* renamed from: B */
    private void m36974B(int i, float f) {
        this.f3541i.m36912y(i, f);
    }

    /* renamed from: C */
    private void m36973C(Context context, C1138r0 c1138r0) {
        int i;
        String m37033o;
        this.f3542j = c1138r0.m37037k(C7461j.TextAppearance_android_textStyle, this.f3542j);
        if (Build.VERSION.SDK_INT >= 28) {
            int m37037k = c1138r0.m37037k(C7461j.TextAppearance_android_textFontWeight, -1);
            this.f3543k = m37037k;
            if (m37037k != -1) {
                this.f3542j = (this.f3542j & 2) | 0;
            }
        }
        if (!c1138r0.m37029s(C7461j.TextAppearance_android_fontFamily) && !c1138r0.m37029s(C7461j.TextAppearance_fontFamily)) {
            if (c1138r0.m37029s(C7461j.TextAppearance_android_typeface)) {
                this.f3545m = false;
                int m37037k2 = c1138r0.m37037k(C7461j.TextAppearance_android_typeface, 1);
                if (m37037k2 == 1) {
                    this.f3544l = Typeface.SANS_SERIF;
                    return;
                } else if (m37037k2 == 2) {
                    this.f3544l = Typeface.SERIF;
                    return;
                } else if (m37037k2 != 3) {
                    return;
                } else {
                    this.f3544l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f3544l = null;
        if (c1138r0.m37029s(C7461j.TextAppearance_fontFamily)) {
            i = C7461j.TextAppearance_fontFamily;
        } else {
            i = C7461j.TextAppearance_android_fontFamily;
        }
        int i2 = this.f3543k;
        int i3 = this.f3542j;
        if (!context.isRestricted()) {
            try {
                Typeface m37038j = c1138r0.m37038j(i, this.f3542j, new C1161a(i2, i3, new WeakReference(this.f3533a)));
                if (m37038j != null) {
                    if (Build.VERSION.SDK_INT >= 28 && this.f3543k != -1) {
                        this.f3544l = Typeface.create(Typeface.create(m37038j, 0), this.f3543k, (this.f3542j & 2) != 0);
                    } else {
                        this.f3544l = m37038j;
                    }
                }
                this.f3545m = this.f3544l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f3544l != null || (m37033o = c1138r0.m37033o(i)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && this.f3543k != -1) {
            this.f3544l = Typeface.create(Typeface.create(m37033o, 0), this.f3543k, (this.f3542j & 2) != 0);
        } else {
            this.f3544l = Typeface.create(m37033o, this.f3542j);
        }
    }

    /* renamed from: a */
    private void m36972a(Drawable drawable, C1132p0 c1132p0) {
        if (drawable == null || c1132p0 == null) {
            return;
        }
        C1111i.m37127i(drawable, c1132p0, this.f3533a.getDrawableState());
    }

    /* renamed from: d */
    private static C1132p0 m36969d(Context context, C1111i c1111i, int i) {
        ColorStateList m37130f = c1111i.m37130f(context, i);
        if (m37130f != null) {
            C1132p0 c1132p0 = new C1132p0();
            c1132p0.f3455d = true;
            c1132p0.f3452a = m37130f;
            return c1132p0;
        }
        return null;
    }

    /* renamed from: y */
    private void m36948y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (Build.VERSION.SDK_INT >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.f3533a.getCompoundDrawablesRelative();
            TextView textView = this.f3533a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
        } else {
            if (Build.VERSION.SDK_INT >= 17) {
                Drawable[] compoundDrawablesRelative2 = this.f3533a.getCompoundDrawablesRelative();
                if (compoundDrawablesRelative2[0] != null || compoundDrawablesRelative2[2] != null) {
                    TextView textView2 = this.f3533a;
                    Drawable drawable7 = compoundDrawablesRelative2[0];
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative2[1];
                    }
                    Drawable drawable8 = compoundDrawablesRelative2[2];
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative2[3];
                    }
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                    return;
                }
            }
            Drawable[] compoundDrawables = this.f3533a.getCompoundDrawables();
            TextView textView3 = this.f3533a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    /* renamed from: z */
    private void m36947z() {
        C1132p0 c1132p0 = this.f3540h;
        this.f3534b = c1132p0;
        this.f3535c = c1132p0;
        this.f3536d = c1132p0;
        this.f3537e = c1132p0;
        this.f3538f = c1132p0;
        this.f3539g = c1132p0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public void m36975A(int i, float f) {
        if (InterfaceC1391b.f4284g || m36961l()) {
            return;
        }
        m36974B(i, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m36971b() {
        if (this.f3534b != null || this.f3535c != null || this.f3536d != null || this.f3537e != null) {
            Drawable[] compoundDrawables = this.f3533a.getCompoundDrawables();
            m36972a(compoundDrawables[0], this.f3534b);
            m36972a(compoundDrawables[1], this.f3535c);
            m36972a(compoundDrawables[2], this.f3536d);
            m36972a(compoundDrawables[3], this.f3537e);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (this.f3538f == null && this.f3539g == null) {
                return;
            }
            Drawable[] compoundDrawablesRelative = this.f3533a.getCompoundDrawablesRelative();
            m36972a(compoundDrawablesRelative[0], this.f3538f);
            m36972a(compoundDrawablesRelative[2], this.f3539g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m36970c() {
        this.f3541i.m36935b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m36968e() {
        return this.f3541i.m36927j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m36967f() {
        return this.f3541i.m36926k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m36966g() {
        return this.f3541i.m36925l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int[] m36965h() {
        return this.f3541i.m36924m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m36964i() {
        return this.f3541i.m36923n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public ColorStateList m36963j() {
        C1132p0 c1132p0 = this.f3540h;
        if (c1132p0 != null) {
            return c1132p0.f3452a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public PorterDuff.Mode m36962k() {
        C1132p0 c1132p0 = this.f3540h;
        if (c1132p0 != null) {
            return c1132p0.f3453b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean m36961l() {
        return this.f3541i.m36918s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m36960m(AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        String str;
        boolean z;
        boolean z2;
        ColorStateList colorStateList2;
        String str2;
        ColorStateList colorStateList3;
        boolean z3;
        int i2;
        Context context = this.f3533a.getContext();
        C1111i m37134b = C1111i.m37134b();
        C1138r0 m37026v = C1138r0.m37026v(context, attributeSet, C7461j.AppCompatTextHelper, i, 0);
        TextView textView = this.f3533a;
        C7759x.m17502n0(textView, textView.getContext(), C7461j.AppCompatTextHelper, attributeSet, m37026v.m37030r(), i, 0);
        int m37034n = m37026v.m37034n(C7461j.AppCompatTextHelper_android_textAppearance, -1);
        if (m37026v.m37029s(C7461j.AppCompatTextHelper_android_drawableLeft)) {
            this.f3534b = m36969d(context, m37134b, m37026v.m37034n(C7461j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (m37026v.m37029s(C7461j.AppCompatTextHelper_android_drawableTop)) {
            this.f3535c = m36969d(context, m37134b, m37026v.m37034n(C7461j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (m37026v.m37029s(C7461j.AppCompatTextHelper_android_drawableRight)) {
            this.f3536d = m36969d(context, m37134b, m37026v.m37034n(C7461j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (m37026v.m37029s(C7461j.AppCompatTextHelper_android_drawableBottom)) {
            this.f3537e = m36969d(context, m37134b, m37026v.m37034n(C7461j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (m37026v.m37029s(C7461j.AppCompatTextHelper_android_drawableStart)) {
                this.f3538f = m36969d(context, m37134b, m37026v.m37034n(C7461j.AppCompatTextHelper_android_drawableStart, 0));
            }
            if (m37026v.m37029s(C7461j.AppCompatTextHelper_android_drawableEnd)) {
                this.f3539g = m36969d(context, m37134b, m37026v.m37034n(C7461j.AppCompatTextHelper_android_drawableEnd, 0));
            }
        }
        m37026v.m37025w();
        boolean z4 = this.f3533a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (m37034n != -1) {
            C1138r0 m37028t = C1138r0.m37028t(context, m37034n, C7461j.TextAppearance);
            if (z4 || !m37028t.m37029s(C7461j.TextAppearance_textAllCaps)) {
                z = false;
                z2 = false;
            } else {
                z = m37028t.m37047a(C7461j.TextAppearance_textAllCaps, false);
                z2 = true;
            }
            m36973C(context, m37028t);
            if (Build.VERSION.SDK_INT < 23) {
                colorStateList3 = m37028t.m37029s(C7461j.TextAppearance_android_textColor) ? m37028t.m37045c(C7461j.TextAppearance_android_textColor) : null;
                colorStateList = m37028t.m37029s(C7461j.TextAppearance_android_textColorHint) ? m37028t.m37045c(C7461j.TextAppearance_android_textColorHint) : null;
                colorStateList2 = m37028t.m37029s(C7461j.TextAppearance_android_textColorLink) ? m37028t.m37045c(C7461j.TextAppearance_android_textColorLink) : null;
            } else {
                colorStateList = null;
                colorStateList2 = null;
                colorStateList3 = null;
            }
            str2 = m37028t.m37029s(C7461j.TextAppearance_textLocale) ? m37028t.m37033o(C7461j.TextAppearance_textLocale) : null;
            str = (Build.VERSION.SDK_INT < 26 || !m37028t.m37029s(C7461j.TextAppearance_fontVariationSettings)) ? null : m37028t.m37033o(C7461j.TextAppearance_fontVariationSettings);
            m37028t.m37025w();
        } else {
            colorStateList = null;
            str = null;
            z = false;
            z2 = false;
            colorStateList2 = null;
            str2 = null;
            colorStateList3 = null;
        }
        C1138r0 m37026v2 = C1138r0.m37026v(context, attributeSet, C7461j.TextAppearance, i, 0);
        if (z4 || !m37026v2.m37029s(C7461j.TextAppearance_textAllCaps)) {
            z3 = z2;
        } else {
            z = m37026v2.m37047a(C7461j.TextAppearance_textAllCaps, false);
            z3 = true;
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (m37026v2.m37029s(C7461j.TextAppearance_android_textColor)) {
                colorStateList3 = m37026v2.m37045c(C7461j.TextAppearance_android_textColor);
            }
            if (m37026v2.m37029s(C7461j.TextAppearance_android_textColorHint)) {
                colorStateList = m37026v2.m37045c(C7461j.TextAppearance_android_textColorHint);
            }
            if (m37026v2.m37029s(C7461j.TextAppearance_android_textColorLink)) {
                colorStateList2 = m37026v2.m37045c(C7461j.TextAppearance_android_textColorLink);
            }
        }
        if (m37026v2.m37029s(C7461j.TextAppearance_textLocale)) {
            str2 = m37026v2.m37033o(C7461j.TextAppearance_textLocale);
        }
        if (Build.VERSION.SDK_INT >= 26 && m37026v2.m37029s(C7461j.TextAppearance_fontVariationSettings)) {
            str = m37026v2.m37033o(C7461j.TextAppearance_fontVariationSettings);
        }
        if (Build.VERSION.SDK_INT >= 28 && m37026v2.m37029s(C7461j.TextAppearance_android_textSize) && m37026v2.m37042f(C7461j.TextAppearance_android_textSize, -1) == 0) {
            this.f3533a.setTextSize(0, 0.0f);
        }
        m36973C(context, m37026v2);
        m37026v2.m37025w();
        if (colorStateList3 != null) {
            this.f3533a.setTextColor(colorStateList3);
        }
        if (colorStateList != null) {
            this.f3533a.setHintTextColor(colorStateList);
        }
        if (colorStateList2 != null) {
            this.f3533a.setLinkTextColor(colorStateList2);
        }
        if (!z4 && z3) {
            m36954s(z);
        }
        Typeface typeface = this.f3544l;
        if (typeface != null) {
            if (this.f3543k == -1) {
                this.f3533a.setTypeface(typeface, this.f3542j);
            } else {
                this.f3533a.setTypeface(typeface);
            }
        }
        if (str != null) {
            this.f3533a.setFontVariationSettings(str);
        }
        if (str2 != null) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 24) {
                this.f3533a.setTextLocales(LocaleList.forLanguageTags(str2));
            } else if (i3 >= 21) {
                this.f3533a.setTextLocale(Locale.forLanguageTag(str2.substring(0, str2.indexOf(44))));
            }
        }
        this.f3541i.m36917t(attributeSet, i);
        if (InterfaceC1391b.f4284g && this.f3541i.m36923n() != 0) {
            int[] m36924m = this.f3541i.m36924m();
            if (m36924m.length > 0) {
                if (this.f3533a.getAutoSizeStepGranularity() != -1.0f) {
                    this.f3533a.setAutoSizeTextTypeUniformWithConfiguration(this.f3541i.m36926k(), this.f3541i.m36927j(), this.f3541i.m36925l(), 0);
                } else {
                    this.f3533a.setAutoSizeTextTypeUniformWithPresetSizes(m36924m, 0);
                }
            }
        }
        C1138r0 m37027u = C1138r0.m37027u(context, attributeSet, C7461j.AppCompatTextView);
        int m37034n2 = m37027u.m37034n(C7461j.AppCompatTextView_drawableLeftCompat, -1);
        Drawable m37133c = m37034n2 != -1 ? m37134b.m37133c(context, m37034n2) : null;
        int m37034n3 = m37027u.m37034n(C7461j.AppCompatTextView_drawableTopCompat, -1);
        Drawable m37133c2 = m37034n3 != -1 ? m37134b.m37133c(context, m37034n3) : null;
        int m37034n4 = m37027u.m37034n(C7461j.AppCompatTextView_drawableRightCompat, -1);
        Drawable m37133c3 = m37034n4 != -1 ? m37134b.m37133c(context, m37034n4) : null;
        int m37034n5 = m37027u.m37034n(C7461j.AppCompatTextView_drawableBottomCompat, -1);
        Drawable m37133c4 = m37034n5 != -1 ? m37134b.m37133c(context, m37034n5) : null;
        int m37034n6 = m37027u.m37034n(C7461j.AppCompatTextView_drawableStartCompat, -1);
        Drawable m37133c5 = m37034n6 != -1 ? m37134b.m37133c(context, m37034n6) : null;
        int m37034n7 = m37027u.m37034n(C7461j.AppCompatTextView_drawableEndCompat, -1);
        m36948y(m37133c, m37133c2, m37133c3, m37133c4, m37133c5, m37034n7 != -1 ? m37134b.m37133c(context, m37034n7) : null);
        if (m37027u.m37029s(C7461j.AppCompatTextView_drawableTint)) {
            C1398i.m36096j(this.f3533a, m37027u.m37045c(C7461j.AppCompatTextView_drawableTint));
        }
        if (m37027u.m37029s(C7461j.AppCompatTextView_drawableTintMode)) {
            i2 = -1;
            C1398i.m36095k(this.f3533a, C1068a0.m37281e(m37027u.m37037k(C7461j.AppCompatTextView_drawableTintMode, -1), null));
        } else {
            i2 = -1;
        }
        int m37042f = m37027u.m37042f(C7461j.AppCompatTextView_firstBaselineToTopHeight, i2);
        int m37042f2 = m37027u.m37042f(C7461j.AppCompatTextView_lastBaselineToBottomHeight, i2);
        int m37042f3 = m37027u.m37042f(C7461j.AppCompatTextView_lineHeight, i2);
        m37027u.m37025w();
        if (m37042f != i2) {
            C1398i.m36093m(this.f3533a, m37042f);
        }
        if (m37042f2 != i2) {
            C1398i.m36092n(this.f3533a, m37042f2);
        }
        if (m37042f3 != i2) {
            C1398i.m36091o(this.f3533a, m37042f3);
        }
    }

    /* renamed from: n */
    void m36959n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f3545m) {
            this.f3544l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (C7759x.m17536T(textView)) {
                    textView.post(new RunnableC1162b(this, textView, typeface, this.f3542j));
                } else {
                    textView.setTypeface(typeface, this.f3542j);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m36958o(boolean z, int i, int i2, int i3, int i4) {
        if (InterfaceC1391b.f4284g) {
            return;
        }
        m36970c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m36957p() {
        m36971b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m36956q(Context context, int i) {
        String m37033o;
        ColorStateList m37045c;
        ColorStateList m37045c2;
        ColorStateList m37045c3;
        C1138r0 m37028t = C1138r0.m37028t(context, i, C7461j.TextAppearance);
        if (m37028t.m37029s(C7461j.TextAppearance_textAllCaps)) {
            m36954s(m37028t.m37047a(C7461j.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (m37028t.m37029s(C7461j.TextAppearance_android_textColor) && (m37045c3 = m37028t.m37045c(C7461j.TextAppearance_android_textColor)) != null) {
                this.f3533a.setTextColor(m37045c3);
            }
            if (m37028t.m37029s(C7461j.TextAppearance_android_textColorLink) && (m37045c2 = m37028t.m37045c(C7461j.TextAppearance_android_textColorLink)) != null) {
                this.f3533a.setLinkTextColor(m37045c2);
            }
            if (m37028t.m37029s(C7461j.TextAppearance_android_textColorHint) && (m37045c = m37028t.m37045c(C7461j.TextAppearance_android_textColorHint)) != null) {
                this.f3533a.setHintTextColor(m37045c);
            }
        }
        if (m37028t.m37029s(C7461j.TextAppearance_android_textSize) && m37028t.m37042f(C7461j.TextAppearance_android_textSize, -1) == 0) {
            this.f3533a.setTextSize(0, 0.0f);
        }
        m36973C(context, m37028t);
        if (Build.VERSION.SDK_INT >= 26 && m37028t.m37029s(C7461j.TextAppearance_fontVariationSettings) && (m37033o = m37028t.m37033o(C7461j.TextAppearance_fontVariationSettings)) != null) {
            this.f3533a.setFontVariationSettings(m37033o);
        }
        m37028t.m37025w();
        Typeface typeface = this.f3544l;
        if (typeface != null) {
            this.f3533a.setTypeface(typeface, this.f3542j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m36955r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        C7735a.m17615f(editorInfo, textView.getText());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m36954s(boolean z) {
        this.f3533a.setAllCaps(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m36953t(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.f3541i.m36916u(i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m36952u(int[] iArr, int i) throws IllegalArgumentException {
        this.f3541i.m36915v(iArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m36951v(int i) {
        this.f3541i.m36914w(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m36950w(ColorStateList colorStateList) {
        if (this.f3540h == null) {
            this.f3540h = new C1132p0();
        }
        C1132p0 c1132p0 = this.f3540h;
        c1132p0.f3452a = colorStateList;
        c1132p0.f3455d = colorStateList != null;
        m36947z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m36949x(PorterDuff.Mode mode) {
        if (this.f3540h == null) {
            this.f3540h = new C1132p0();
        }
        C1132p0 c1132p0 = this.f3540h;
        c1132p0.f3453b = mode;
        c1132p0.f3454c = mode != null;
        m36947z();
    }
}

package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.C1398i;
import java.util.ArrayList;
import java.util.List;
import p201g.p227h.p238l.C7759x;
import p272h.p286c.p287a.p323c.C9267d;
import p272h.p286c.p287a.p323c.C9271f;
import p272h.p286c.p287a.p323c.p328m.C9278a;
import p272h.p286c.p287a.p323c.p328m.C9279b;
import p272h.p286c.p287a.p323c.p342z.C9321c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IndicatorViewController.java */
/* renamed from: com.google.android.material.textfield.f */
/* loaded from: classes2.dex */
public final class C4793f {

    /* renamed from: a */
    private final Context f12124a;

    /* renamed from: b */
    private final TextInputLayout f12125b;

    /* renamed from: c */
    private LinearLayout f12126c;

    /* renamed from: d */
    private int f12127d;

    /* renamed from: e */
    private FrameLayout f12128e;

    /* renamed from: f */
    private Animator f12129f;

    /* renamed from: g */
    private final float f12130g;

    /* renamed from: h */
    private int f12131h;

    /* renamed from: i */
    private int f12132i;

    /* renamed from: j */
    private CharSequence f12133j;

    /* renamed from: k */
    private boolean f12134k;

    /* renamed from: l */
    private TextView f12135l;

    /* renamed from: m */
    private CharSequence f12136m;

    /* renamed from: n */
    private int f12137n;

    /* renamed from: o */
    private ColorStateList f12138o;

    /* renamed from: p */
    private CharSequence f12139p;

    /* renamed from: q */
    private boolean f12140q;

    /* renamed from: r */
    private TextView f12141r;

    /* renamed from: s */
    private int f12142s;

    /* renamed from: t */
    private ColorStateList f12143t;

    /* renamed from: u */
    private Typeface f12144u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IndicatorViewController.java */
    /* renamed from: com.google.android.material.textfield.f$a */
    /* loaded from: classes2.dex */
    public class C4794a extends AnimatorListenerAdapter {

        /* renamed from: c */
        final /* synthetic */ int f12145c;

        /* renamed from: d */
        final /* synthetic */ TextView f12146d;

        /* renamed from: e */
        final /* synthetic */ int f12147e;

        /* renamed from: f */
        final /* synthetic */ TextView f12148f;

        C4794a(int i, TextView textView, int i2, TextView textView2) {
            this.f12145c = i;
            this.f12146d = textView;
            this.f12147e = i2;
            this.f12148f = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C4793f.this.f12131h = this.f12145c;
            C4793f.this.f12129f = null;
            TextView textView = this.f12146d;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f12147e == 1 && C4793f.this.f12135l != null) {
                    C4793f.this.f12135l.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f12148f;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f12148f.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f12148f;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public C4793f(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f12124a = context;
        this.f12125b = textInputLayout;
        this.f12130g = context.getResources().getDimensionPixelSize(C9267d.design_textinput_caption_translate_y);
    }

    /* renamed from: A */
    private void m26323A(int i, int i2) {
        TextView m26297l;
        TextView m26297l2;
        if (i == i2) {
            return;
        }
        if (i2 != 0 && (m26297l2 = m26297l(i2)) != null) {
            m26297l2.setVisibility(0);
            m26297l2.setAlpha(1.0f);
        }
        if (i != 0 && (m26297l = m26297l(i)) != null) {
            m26297l.setVisibility(4);
            if (i == 1) {
                m26297l.setText((CharSequence) null);
            }
        }
        this.f12131h = i2;
    }

    /* renamed from: I */
    private void m26315I(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: K */
    private void m26313K(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: L */
    private boolean m26312L(TextView textView, CharSequence charSequence) {
        return C7759x.m17535U(this.f12125b) && this.f12125b.isEnabled() && !(this.f12132i == this.f12131h && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    /* renamed from: O */
    private void m26309O(int i, int i2, boolean z) {
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f12129f = animatorSet;
            ArrayList arrayList = new ArrayList();
            m26301h(arrayList, this.f12140q, this.f12141r, 2, i, i2);
            m26301h(arrayList, this.f12134k, this.f12135l, 1, i, i2);
            C9279b.m15235a(animatorSet, arrayList);
            animatorSet.addListener(new C4794a(i2, m26297l(i), i, m26297l(i2)));
            animatorSet.start();
        } else {
            m26323A(i, i2);
        }
        this.f12125b.m26394r0();
        this.f12125b.m26388u0(z);
        this.f12125b.m26451E0();
    }

    /* renamed from: f */
    private boolean m26303f() {
        return (this.f12126c == null || this.f12125b.getEditText() == null) ? false : true;
    }

    /* renamed from: h */
    private void m26301h(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            list.add(m26300i(textView, i3 == i));
            if (i3 == i) {
                list.add(m26299j(textView));
            }
        }
    }

    /* renamed from: i */
    private ObjectAnimator m26300i(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, z ? 1.0f : 0.0f);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(C9278a.f21806a);
        return ofFloat;
    }

    /* renamed from: j */
    private ObjectAnimator m26299j(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.f12130g, 0.0f);
        ofFloat.setDuration(217L);
        ofFloat.setInterpolator(C9278a.f21809d);
        return ofFloat;
    }

    /* renamed from: l */
    private TextView m26297l(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return this.f12141r;
        }
        return this.f12135l;
    }

    /* renamed from: s */
    private int m26290s(boolean z, int i, int i2) {
        return z ? this.f12124a.getResources().getDimensionPixelSize(i) : i2;
    }

    /* renamed from: v */
    private boolean m26287v(int i) {
        return (i != 1 || this.f12135l == null || TextUtils.isEmpty(this.f12133j)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public void m26322B(CharSequence charSequence) {
        this.f12136m = charSequence;
        TextView textView = this.f12135l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public void m26321C(boolean z) {
        if (this.f12134k == z) {
            return;
        }
        m26302g();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f12124a);
            this.f12135l = appCompatTextView;
            appCompatTextView.setId(C9271f.textinput_error);
            if (Build.VERSION.SDK_INT >= 17) {
                this.f12135l.setTextAlignment(5);
            }
            Typeface typeface = this.f12144u;
            if (typeface != null) {
                this.f12135l.setTypeface(typeface);
            }
            m26320D(this.f12137n);
            m26319E(this.f12138o);
            m26322B(this.f12136m);
            this.f12135l.setVisibility(4);
            C7759x.m17494r0(this.f12135l, 1);
            m26305d(this.f12135l, 0);
        } else {
            m26289t();
            m26283z(this.f12135l, 0);
            this.f12135l = null;
            this.f12125b.m26394r0();
            this.f12125b.m26451E0();
        }
        this.f12134k = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public void m26320D(int i) {
        this.f12137n = i;
        TextView textView = this.f12135l;
        if (textView != null) {
            this.f12125b.m26420e0(textView, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public void m26319E(ColorStateList colorStateList) {
        this.f12138o = colorStateList;
        TextView textView = this.f12135l;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public void m26318F(int i) {
        this.f12142s = i;
        TextView textView = this.f12141r;
        if (textView != null) {
            C1398i.m36089q(textView, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public void m26317G(boolean z) {
        if (this.f12140q == z) {
            return;
        }
        m26302g();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f12124a);
            this.f12141r = appCompatTextView;
            appCompatTextView.setId(C9271f.textinput_helper_text);
            if (Build.VERSION.SDK_INT >= 17) {
                this.f12141r.setTextAlignment(5);
            }
            Typeface typeface = this.f12144u;
            if (typeface != null) {
                this.f12141r.setTypeface(typeface);
            }
            this.f12141r.setVisibility(4);
            C7759x.m17494r0(this.f12141r, 1);
            m26318F(this.f12142s);
            m26316H(this.f12143t);
            m26305d(this.f12141r, 1);
        } else {
            m26288u();
            m26283z(this.f12141r, 1);
            this.f12141r = null;
            this.f12125b.m26394r0();
            this.f12125b.m26451E0();
        }
        this.f12140q = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public void m26316H(ColorStateList colorStateList) {
        this.f12143t = colorStateList;
        TextView textView = this.f12141r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public void m26314J(Typeface typeface) {
        if (typeface != this.f12144u) {
            this.f12144u = typeface;
            m26315I(this.f12135l, typeface);
            m26315I(this.f12141r, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public void m26311M(CharSequence charSequence) {
        m26302g();
        this.f12133j = charSequence;
        this.f12135l.setText(charSequence);
        if (this.f12131h != 1) {
            this.f12132i = 1;
        }
        m26309O(this.f12131h, this.f12132i, m26312L(this.f12135l, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public void m26310N(CharSequence charSequence) {
        m26302g();
        this.f12139p = charSequence;
        this.f12141r.setText(charSequence);
        if (this.f12131h != 2) {
            this.f12132i = 2;
        }
        m26309O(this.f12131h, this.f12132i, m26312L(this.f12141r, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m26305d(TextView textView, int i) {
        if (this.f12126c == null && this.f12128e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f12124a);
            this.f12126c = linearLayout;
            linearLayout.setOrientation(0);
            this.f12125b.addView(this.f12126c, -1, -2);
            this.f12128e = new FrameLayout(this.f12124a);
            this.f12126c.addView(this.f12128e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f12125b.getEditText() != null) {
                m26304e();
            }
        }
        if (m26286w(i)) {
            this.f12128e.setVisibility(0);
            this.f12128e.addView(textView);
        } else {
            this.f12126c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f12126c.setVisibility(0);
        this.f12127d++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m26304e() {
        if (m26303f()) {
            EditText editText = this.f12125b.getEditText();
            boolean m15047g = C9321c.m15047g(this.f12124a);
            C7759x.m17560D0(this.f12126c, m26290s(m15047g, C9267d.material_helper_text_font_1_3_padding_horizontal, C7759x.m17551I(editText)), m26290s(m15047g, C9267d.material_helper_text_font_1_3_padding_top, this.f12124a.getResources().getDimensionPixelSize(C9267d.material_helper_text_default_padding_top)), m26290s(m15047g, C9267d.material_helper_text_font_1_3_padding_horizontal, C7759x.m17553H(editText)), 0);
        }
    }

    /* renamed from: g */
    void m26302g() {
        Animator animator = this.f12129f;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean m26298k() {
        return m26287v(this.f12132i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public CharSequence m26296m() {
        return this.f12136m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public CharSequence m26295n() {
        return this.f12133j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public int m26294o() {
        TextView textView = this.f12135l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public ColorStateList m26293p() {
        TextView textView = this.f12135l;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public CharSequence m26292q() {
        return this.f12139p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public int m26291r() {
        TextView textView = this.f12141r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m26289t() {
        this.f12133j = null;
        m26302g();
        if (this.f12131h == 1) {
            if (this.f12140q && !TextUtils.isEmpty(this.f12139p)) {
                this.f12132i = 2;
            } else {
                this.f12132i = 0;
            }
        }
        m26309O(this.f12131h, this.f12132i, m26312L(this.f12135l, null));
    }

    /* renamed from: u */
    void m26288u() {
        m26302g();
        if (this.f12131h == 2) {
            this.f12132i = 0;
        }
        m26309O(this.f12131h, this.f12132i, m26312L(this.f12141r, null));
    }

    /* renamed from: w */
    boolean m26286w(int i) {
        return i == 0 || i == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean m26285x() {
        return this.f12134k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean m26284y() {
        return this.f12140q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m26283z(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.f12126c == null) {
            return;
        }
        if (m26286w(i) && (frameLayout = this.f12128e) != null) {
            frameLayout.removeView(textView);
        } else {
            this.f12126c.removeView(textView);
        }
        int i2 = this.f12127d - 1;
        this.f12127d = i2;
        m26313K(this.f12126c, i2);
    }
}

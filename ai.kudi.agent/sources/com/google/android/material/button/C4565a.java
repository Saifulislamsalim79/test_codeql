package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.core.graphics.drawable.C1365a;
import com.google.android.material.internal.C4696r;
import p201g.p227h.p238l.C7759x;
import p272h.p286c.p287a.p323c.C9233b;
import p272h.p286c.p287a.p323c.C9277l;
import p272h.p286c.p287a.p323c.p324a0.C9229a;
import p272h.p286c.p287a.p323c.p324a0.C9232b;
import p272h.p286c.p287a.p323c.p326c0.C9243g;
import p272h.p286c.p287a.p323c.p326c0.C9250k;
import p272h.p286c.p287a.p323c.p326c0.InterfaceC9266n;
import p272h.p286c.p287a.p323c.p335s.C9310a;
import p272h.p286c.p287a.p323c.p342z.C9321c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MaterialButtonHelper.java */
/* renamed from: com.google.android.material.button.a */
/* loaded from: classes2.dex */
public class C4565a {

    /* renamed from: t */
    private static final boolean f11260t;

    /* renamed from: a */
    private final MaterialButton f11261a;

    /* renamed from: b */
    private C9250k f11262b;

    /* renamed from: c */
    private int f11263c;

    /* renamed from: d */
    private int f11264d;

    /* renamed from: e */
    private int f11265e;

    /* renamed from: f */
    private int f11266f;

    /* renamed from: g */
    private int f11267g;

    /* renamed from: h */
    private int f11268h;

    /* renamed from: i */
    private PorterDuff.Mode f11269i;

    /* renamed from: j */
    private ColorStateList f11270j;

    /* renamed from: k */
    private ColorStateList f11271k;

    /* renamed from: l */
    private ColorStateList f11272l;

    /* renamed from: m */
    private Drawable f11273m;

    /* renamed from: n */
    private boolean f11274n = false;

    /* renamed from: o */
    private boolean f11275o = false;

    /* renamed from: p */
    private boolean f11276p = false;

    /* renamed from: q */
    private boolean f11277q;

    /* renamed from: r */
    private LayerDrawable f11278r;

    /* renamed from: s */
    private int f11279s;

    static {
        f11260t = Build.VERSION.SDK_INT >= 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4565a(MaterialButton materialButton, C9250k c9250k) {
        this.f11261a = materialButton;
        this.f11262b = c9250k;
    }

    /* renamed from: E */
    private void m27365E(int i, int i2) {
        int m17551I = C7759x.m17551I(this.f11261a);
        int paddingTop = this.f11261a.getPaddingTop();
        int m17553H = C7759x.m17553H(this.f11261a);
        int paddingBottom = this.f11261a.getPaddingBottom();
        int i3 = this.f11265e;
        int i4 = this.f11266f;
        this.f11266f = i2;
        this.f11265e = i;
        if (!this.f11275o) {
            m27364F();
        }
        C7759x.m17560D0(this.f11261a, m17551I, (paddingTop + i) - i3, m17553H, (paddingBottom + i2) - i4);
    }

    /* renamed from: F */
    private void m27364F() {
        this.f11261a.setInternalBackground(m27359a());
        C9243g m27354f = m27354f();
        if (m27354f != null) {
            m27354f.m15410W(this.f11279s);
        }
    }

    /* renamed from: G */
    private void m27363G(C9250k c9250k) {
        if (m27354f() != null) {
            m27354f().setShapeAppearanceModel(c9250k);
        }
        if (m27346n() != null) {
            m27346n().setShapeAppearanceModel(c9250k);
        }
        if (m27355e() != null) {
            m27355e().setShapeAppearanceModel(c9250k);
        }
    }

    /* renamed from: I */
    private void m27361I() {
        C9243g m27354f = m27354f();
        C9243g m27346n = m27346n();
        if (m27354f != null) {
            m27354f.m15398e0(this.f11268h, this.f11271k);
            if (m27346n != null) {
                m27346n.m15400d0(this.f11268h, this.f11274n ? C9310a.m15082c(this.f11261a, C9233b.colorSurface) : 0);
            }
        }
    }

    /* renamed from: J */
    private InsetDrawable m27360J(Drawable drawable) {
        return new InsetDrawable(drawable, this.f11263c, this.f11265e, this.f11264d, this.f11266f);
    }

    /* renamed from: a */
    private Drawable m27359a() {
        C9243g c9243g = new C9243g(this.f11262b);
        c9243g.m15420M(this.f11261a.getContext());
        C1365a.m36187o(c9243g, this.f11270j);
        PorterDuff.Mode mode = this.f11269i;
        if (mode != null) {
            C1365a.m36186p(c9243g, mode);
        }
        c9243g.m15398e0(this.f11268h, this.f11271k);
        C9243g c9243g2 = new C9243g(this.f11262b);
        c9243g2.setTint(0);
        c9243g2.m15400d0(this.f11268h, this.f11274n ? C9310a.m15082c(this.f11261a, C9233b.colorSurface) : 0);
        if (f11260t) {
            C9243g c9243g3 = new C9243g(this.f11262b);
            this.f11273m = c9243g3;
            C1365a.m36188n(c9243g3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(C9232b.m15444d(this.f11272l), m27360J(new LayerDrawable(new Drawable[]{c9243g2, c9243g})), this.f11273m);
            this.f11278r = rippleDrawable;
            return rippleDrawable;
        }
        C9229a c9229a = new C9229a(this.f11262b);
        this.f11273m = c9229a;
        C1365a.m36187o(c9229a, C9232b.m15444d(this.f11272l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c9243g2, c9243g, this.f11273m});
        this.f11278r = layerDrawable;
        return m27360J(layerDrawable);
    }

    /* renamed from: g */
    private C9243g m27353g(boolean z) {
        LayerDrawable layerDrawable = this.f11278r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (f11260t) {
            return (C9243g) ((LayerDrawable) ((InsetDrawable) this.f11278r.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
        }
        return (C9243g) this.f11278r.getDrawable(!z ? 1 : 0);
    }

    /* renamed from: n */
    private C9243g m27346n() {
        return m27353g(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public void m27369A(ColorStateList colorStateList) {
        if (this.f11271k != colorStateList) {
            this.f11271k = colorStateList;
            m27361I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public void m27368B(int i) {
        if (this.f11268h != i) {
            this.f11268h = i;
            m27361I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public void m27367C(ColorStateList colorStateList) {
        if (this.f11270j != colorStateList) {
            this.f11270j = colorStateList;
            if (m27354f() != null) {
                C1365a.m36187o(m27354f(), this.f11270j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public void m27366D(PorterDuff.Mode mode) {
        if (this.f11269i != mode) {
            this.f11269i = mode;
            if (m27354f() == null || this.f11269i == null) {
                return;
            }
            C1365a.m36186p(m27354f(), this.f11269i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public void m27362H(int i, int i2) {
        Drawable drawable = this.f11273m;
        if (drawable != null) {
            drawable.setBounds(this.f11263c, this.f11265e, i2 - this.f11264d, i - this.f11266f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m27358b() {
        return this.f11267g;
    }

    /* renamed from: c */
    public int m27357c() {
        return this.f11266f;
    }

    /* renamed from: d */
    public int m27356d() {
        return this.f11265e;
    }

    /* renamed from: e */
    public InterfaceC9266n m27355e() {
        LayerDrawable layerDrawable = this.f11278r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f11278r.getNumberOfLayers() > 2) {
            return (InterfaceC9266n) this.f11278r.getDrawable(2);
        }
        return (InterfaceC9266n) this.f11278r.getDrawable(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public C9243g m27354f() {
        return m27353g(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public ColorStateList m27352h() {
        return this.f11272l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C9250k m27351i() {
        return this.f11262b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public ColorStateList m27350j() {
        return this.f11271k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int m27349k() {
        return this.f11268h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public ColorStateList m27348l() {
        return this.f11270j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public PorterDuff.Mode m27347m() {
        return this.f11269i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean m27345o() {
        return this.f11275o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean m27344p() {
        return this.f11277q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m27343q(TypedArray typedArray) {
        this.f11263c = typedArray.getDimensionPixelOffset(C9277l.MaterialButton_android_insetLeft, 0);
        this.f11264d = typedArray.getDimensionPixelOffset(C9277l.MaterialButton_android_insetRight, 0);
        this.f11265e = typedArray.getDimensionPixelOffset(C9277l.MaterialButton_android_insetTop, 0);
        this.f11266f = typedArray.getDimensionPixelOffset(C9277l.MaterialButton_android_insetBottom, 0);
        if (typedArray.hasValue(C9277l.MaterialButton_cornerRadius)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(C9277l.MaterialButton_cornerRadius, -1);
            this.f11267g = dimensionPixelSize;
            m27335y(this.f11262b.m15341w(dimensionPixelSize));
            this.f11276p = true;
        }
        this.f11268h = typedArray.getDimensionPixelSize(C9277l.MaterialButton_strokeWidth, 0);
        this.f11269i = C4696r.m26684e(typedArray.getInt(C9277l.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f11270j = C9321c.m15053a(this.f11261a.getContext(), typedArray, C9277l.MaterialButton_backgroundTint);
        this.f11271k = C9321c.m15053a(this.f11261a.getContext(), typedArray, C9277l.MaterialButton_strokeColor);
        this.f11272l = C9321c.m15053a(this.f11261a.getContext(), typedArray, C9277l.MaterialButton_rippleColor);
        this.f11277q = typedArray.getBoolean(C9277l.MaterialButton_android_checkable, false);
        this.f11279s = typedArray.getDimensionPixelSize(C9277l.MaterialButton_elevation, 0);
        int m17551I = C7759x.m17551I(this.f11261a);
        int paddingTop = this.f11261a.getPaddingTop();
        int m17553H = C7759x.m17553H(this.f11261a);
        int paddingBottom = this.f11261a.getPaddingBottom();
        if (typedArray.hasValue(C9277l.MaterialButton_android_background)) {
            m27341s();
        } else {
            m27364F();
        }
        C7759x.m17560D0(this.f11261a, m17551I + this.f11263c, paddingTop + this.f11265e, m17553H + this.f11264d, paddingBottom + this.f11266f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m27342r(int i) {
        if (m27354f() != null) {
            m27354f().setTint(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m27341s() {
        this.f11275o = true;
        this.f11261a.setSupportBackgroundTintList(this.f11270j);
        this.f11261a.setSupportBackgroundTintMode(this.f11269i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m27340t(boolean z) {
        this.f11277q = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m27339u(int i) {
        if (this.f11276p && this.f11267g == i) {
            return;
        }
        this.f11267g = i;
        this.f11276p = true;
        m27335y(this.f11262b.m15341w(i));
    }

    /* renamed from: v */
    public void m27338v(int i) {
        m27365E(this.f11265e, i);
    }

    /* renamed from: w */
    public void m27337w(int i) {
        m27365E(i, this.f11266f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m27336x(ColorStateList colorStateList) {
        if (this.f11272l != colorStateList) {
            this.f11272l = colorStateList;
            if (f11260t && (this.f11261a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f11261a.getBackground()).setColor(C9232b.m15444d(colorStateList));
            } else if (f11260t || !(this.f11261a.getBackground() instanceof C9229a)) {
            } else {
                ((C9229a) this.f11261a.getBackground()).setTintList(C9232b.m15444d(colorStateList));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m27335y(C9250k c9250k) {
        this.f11262b = c9250k;
        m27363G(c9250k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m27334z(boolean z) {
        this.f11274n = z;
        m27361I();
    }
}

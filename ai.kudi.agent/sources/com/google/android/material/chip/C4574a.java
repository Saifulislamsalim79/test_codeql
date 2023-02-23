package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C1365a;
import androidx.core.graphics.drawable.InterfaceC1366b;
import com.google.android.material.internal.C4689n;
import com.google.android.material.internal.C4695q;
import com.google.android.material.internal.C4696r;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p201g.p202a.p203k.p204a.C7462a;
import p201g.p227h.p228e.C7603a;
import p201g.p227h.p235j.C7651a;
import p272h.p286c.p287a.p323c.C9277l;
import p272h.p286c.p287a.p323c.p324a0.C9232b;
import p272h.p286c.p287a.p323c.p326c0.C9243g;
import p272h.p286c.p287a.p323c.p328m.C9285h;
import p272h.p286c.p287a.p323c.p330o.C9294a;
import p272h.p286c.p287a.p323c.p337u.C9312a;
import p272h.p286c.p287a.p323c.p342z.C9321c;
import p272h.p286c.p287a.p323c.p342z.C9322d;
/* compiled from: ChipDrawable.java */
/* renamed from: com.google.android.material.chip.a */
/* loaded from: classes2.dex */
public class C4574a extends C9243g implements InterfaceC1366b, Drawable.Callback, C4689n.InterfaceC4691b {

    /* renamed from: a1 */
    private static final int[] f11316a1 = {16842910};

    /* renamed from: b1 */
    private static final ShapeDrawable f11317b1 = new ShapeDrawable(new OvalShape());

    /* renamed from: A0 */
    private final Paint.FontMetrics f11318A0;

    /* renamed from: B0 */
    private final RectF f11319B0;

    /* renamed from: C0 */
    private final PointF f11320C0;

    /* renamed from: D0 */
    private final Path f11321D0;

    /* renamed from: E0 */
    private final C4689n f11322E0;

    /* renamed from: F0 */
    private int f11323F0;

    /* renamed from: G0 */
    private int f11324G0;

    /* renamed from: H0 */
    private int f11325H0;

    /* renamed from: I0 */
    private int f11326I0;

    /* renamed from: J0 */
    private int f11327J0;

    /* renamed from: K0 */
    private int f11328K0;

    /* renamed from: L0 */
    private boolean f11329L0;

    /* renamed from: M0 */
    private int f11330M0;

    /* renamed from: N0 */
    private int f11331N0;

    /* renamed from: O0 */
    private ColorFilter f11332O0;

    /* renamed from: P0 */
    private PorterDuffColorFilter f11333P0;

    /* renamed from: Q */
    private ColorStateList f11334Q;

    /* renamed from: Q0 */
    private ColorStateList f11335Q0;

    /* renamed from: R */
    private ColorStateList f11336R;

    /* renamed from: R0 */
    private PorterDuff.Mode f11337R0;

    /* renamed from: S */
    private float f11338S;

    /* renamed from: S0 */
    private int[] f11339S0;

    /* renamed from: T */
    private float f11340T;

    /* renamed from: T0 */
    private boolean f11341T0;

    /* renamed from: U */
    private ColorStateList f11342U;

    /* renamed from: U0 */
    private ColorStateList f11343U0;

    /* renamed from: V */
    private float f11344V;

    /* renamed from: V0 */
    private WeakReference<InterfaceC4575a> f11345V0;

    /* renamed from: W */
    private ColorStateList f11346W;

    /* renamed from: W0 */
    private TextUtils.TruncateAt f11347W0;

    /* renamed from: X */
    private CharSequence f11348X;

    /* renamed from: X0 */
    private boolean f11349X0;

    /* renamed from: Y */
    private boolean f11350Y;

    /* renamed from: Y0 */
    private int f11351Y0;

    /* renamed from: Z */
    private Drawable f11352Z;

    /* renamed from: Z0 */
    private boolean f11353Z0;

    /* renamed from: a0 */
    private ColorStateList f11354a0;

    /* renamed from: b0 */
    private float f11355b0;

    /* renamed from: c0 */
    private boolean f11356c0;

    /* renamed from: d0 */
    private boolean f11357d0;

    /* renamed from: e0 */
    private Drawable f11358e0;

    /* renamed from: f0 */
    private Drawable f11359f0;

    /* renamed from: g0 */
    private ColorStateList f11360g0;

    /* renamed from: h0 */
    private float f11361h0;

    /* renamed from: i0 */
    private CharSequence f11362i0;

    /* renamed from: j0 */
    private boolean f11363j0;

    /* renamed from: k0 */
    private boolean f11364k0;

    /* renamed from: l0 */
    private Drawable f11365l0;

    /* renamed from: m0 */
    private ColorStateList f11366m0;

    /* renamed from: n0 */
    private C9285h f11367n0;

    /* renamed from: o0 */
    private C9285h f11368o0;

    /* renamed from: p0 */
    private float f11369p0;

    /* renamed from: q0 */
    private float f11370q0;

    /* renamed from: r0 */
    private float f11371r0;

    /* renamed from: s0 */
    private float f11372s0;

    /* renamed from: t0 */
    private float f11373t0;

    /* renamed from: u0 */
    private float f11374u0;

    /* renamed from: v0 */
    private float f11375v0;

    /* renamed from: w0 */
    private float f11376w0;

    /* renamed from: x0 */
    private final Context f11377x0;

    /* renamed from: y0 */
    private final Paint f11378y0;

    /* renamed from: z0 */
    private final Paint f11379z0;

    /* compiled from: ChipDrawable.java */
    /* renamed from: com.google.android.material.chip.a$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC4575a {
        /* renamed from: a */
        void mo27151a();
    }

    private C4574a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f11340T = -1.0f;
        this.f11378y0 = new Paint(1);
        this.f11318A0 = new Paint.FontMetrics();
        this.f11319B0 = new RectF();
        this.f11320C0 = new PointF();
        this.f11321D0 = new Path();
        this.f11331N0 = 255;
        this.f11337R0 = PorterDuff.Mode.SRC_IN;
        Paint paint = null;
        this.f11345V0 = new WeakReference<>(null);
        m15420M(context);
        this.f11377x0 = context;
        C4689n c4689n = new C4689n(this);
        this.f11322E0 = c4689n;
        this.f11348X = "";
        c4689n.m26704e().density = context.getResources().getDisplayMetrics().density;
        this.f11379z0 = null;
        if (0 != 0) {
            paint.setStyle(Paint.Style.STROKE);
        }
        setState(f11316a1);
        m27194l2(f11316a1);
        this.f11349X0 = true;
        if (C9232b.f21638a) {
            f11317b1.setTint(-1);
        }
    }

    /* renamed from: A0 */
    private void m27289A0(Canvas canvas, Rect rect) {
        if (this.f11353Z0) {
            return;
        }
        this.f11378y0.setColor(this.f11323F0);
        this.f11378y0.setStyle(Paint.Style.FILL);
        this.f11319B0.set(rect);
        canvas.drawRoundRect(this.f11319B0, m27265I0(), m27265I0(), this.f11378y0);
    }

    /* renamed from: B0 */
    private void m27286B0(Canvas canvas, Rect rect) {
        if (m27245O2()) {
            m27187o0(rect, this.f11319B0);
            RectF rectF = this.f11319B0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f11358e0.setBounds(0, 0, (int) this.f11319B0.width(), (int) this.f11319B0.height());
            if (C9232b.f21638a) {
                this.f11359f0.setBounds(this.f11358e0.getBounds());
                this.f11359f0.jumpToCurrentState();
                this.f11359f0.draw(canvas);
            } else {
                this.f11358e0.draw(canvas);
            }
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: C0 */
    private void m27283C0(Canvas canvas, Rect rect) {
        this.f11378y0.setColor(this.f11327J0);
        this.f11378y0.setStyle(Paint.Style.FILL);
        this.f11319B0.set(rect);
        if (!this.f11353Z0) {
            canvas.drawRoundRect(this.f11319B0, m27265I0(), m27265I0(), this.f11378y0);
            return;
        }
        m15393h(new RectF(rect), this.f11321D0);
        super.m15382p(canvas, this.f11378y0, this.f11321D0, m15377u());
    }

    /* renamed from: D0 */
    private void m27280D0(Canvas canvas, Rect rect) {
        Paint paint = this.f11379z0;
        if (paint != null) {
            paint.setColor(C7603a.m18066h(-16777216, 127));
            canvas.drawRect(rect, this.f11379z0);
            if (m27248N2() || m27251M2()) {
                m27196l0(rect, this.f11319B0);
                canvas.drawRect(this.f11319B0, this.f11379z0);
            }
            if (this.f11348X != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f11379z0);
            }
            if (m27245O2()) {
                m27187o0(rect, this.f11319B0);
                canvas.drawRect(this.f11319B0, this.f11379z0);
            }
            this.f11379z0.setColor(C7603a.m18066h(-65536, 127));
            m27190n0(rect, this.f11319B0);
            canvas.drawRect(this.f11319B0, this.f11379z0);
            this.f11379z0.setColor(C7603a.m18066h(-16711936, 127));
            m27184p0(rect, this.f11319B0);
            canvas.drawRect(this.f11319B0, this.f11379z0);
        }
    }

    /* renamed from: E0 */
    private void m27277E0(Canvas canvas, Rect rect) {
        if (this.f11348X != null) {
            Paint.Align m27172t0 = m27172t0(rect, this.f11320C0);
            m27178r0(rect, this.f11319B0);
            if (this.f11322E0.m26705d() != null) {
                this.f11322E0.m26704e().drawableState = getState();
                this.f11322E0.m26699j(this.f11377x0);
            }
            this.f11322E0.m26704e().setTextAlign(m27172t0);
            int i = 0;
            boolean z = Math.round(this.f11322E0.m26703f(m27205h1().toString())) > Math.round(this.f11319B0.width());
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.f11319B0);
            }
            CharSequence charSequence = this.f11348X;
            if (z && this.f11347W0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f11322E0.m26704e(), this.f11319B0.width(), this.f11347W0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f11320C0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f11322E0.m26704e());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: M2 */
    private boolean m27251M2() {
        return this.f11364k0 && this.f11365l0 != null && this.f11329L0;
    }

    /* renamed from: N2 */
    private boolean m27248N2() {
        return this.f11350Y && this.f11352Z != null;
    }

    /* renamed from: O2 */
    private boolean m27245O2() {
        return this.f11357d0 && this.f11358e0 != null;
    }

    /* renamed from: P2 */
    private void m27242P2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: Q2 */
    private void m27239Q2() {
        this.f11343U0 = this.f11341T0 ? C9232b.m15444d(this.f11346W) : null;
    }

    /* renamed from: R2 */
    private void m27236R2() {
        this.f11359f0 = new RippleDrawable(C9232b.m15444d(m27209f1()), this.f11358e0, f11317b1);
    }

    /* renamed from: Z0 */
    private float m27221Z0() {
        Drawable drawable = this.f11329L0 ? this.f11365l0 : this.f11352Z;
        if (this.f11355b0 <= 0.0f && drawable != null) {
            float ceil = (float) Math.ceil(C4696r.m26687b(this.f11377x0, 24));
            return ((float) drawable.getIntrinsicHeight()) <= ceil ? drawable.getIntrinsicHeight() : ceil;
        }
        return this.f11355b0;
    }

    /* renamed from: a1 */
    private float m27219a1() {
        Drawable drawable = this.f11329L0 ? this.f11365l0 : this.f11352Z;
        if (this.f11355b0 <= 0.0f && drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f11355b0;
    }

    /* renamed from: b2 */
    private void m27216b2(ColorStateList colorStateList) {
        if (this.f11334Q != colorStateList) {
            this.f11334Q = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: k0 */
    private void m27199k0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        C1365a.m36189m(drawable, C1365a.m36196f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f11358e0) {
            if (drawable.isStateful()) {
                drawable.setState(m27227W0());
            }
            C1365a.m36187o(drawable, this.f11360g0);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.f11352Z;
        if (drawable == drawable2 && this.f11356c0) {
            C1365a.m36187o(drawable2, this.f11354a0);
        }
    }

    /* renamed from: l0 */
    private void m27196l0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m27248N2() || m27251M2()) {
            float f = this.f11369p0 + this.f11370q0;
            float m27219a1 = m27219a1();
            if (C1365a.m36196f(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + m27219a1;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - m27219a1;
            }
            float m27221Z0 = m27221Z0();
            float exactCenterY = rect.exactCenterY() - (m27221Z0 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + m27221Z0;
        }
    }

    /* renamed from: l1 */
    private ColorFilter m27195l1() {
        ColorFilter colorFilter = this.f11332O0;
        return colorFilter != null ? colorFilter : this.f11333P0;
    }

    /* renamed from: n0 */
    private void m27190n0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (m27245O2()) {
            float f = this.f11376w0 + this.f11375v0 + this.f11361h0 + this.f11374u0 + this.f11373t0;
            if (C1365a.m36196f(this) == 0) {
                rectF.right = rect.right - f;
            } else {
                rectF.left = rect.left + f;
            }
        }
    }

    /* renamed from: n1 */
    private static boolean m27189n1(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o0 */
    private void m27187o0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m27245O2()) {
            float f = this.f11376w0 + this.f11375v0;
            if (C1365a.m36196f(this) == 0) {
                float f2 = rect.right - f;
                rectF.right = f2;
                rectF.left = f2 - this.f11361h0;
            } else {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + this.f11361h0;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f11361h0;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* renamed from: p0 */
    private void m27184p0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m27245O2()) {
            float f = this.f11376w0 + this.f11375v0 + this.f11361h0 + this.f11374u0 + this.f11373t0;
            if (C1365a.m36196f(this) == 0) {
                float f2 = rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = i;
                rectF.right = i + f;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    /* renamed from: r0 */
    private void m27178r0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f11348X != null) {
            float m27193m0 = this.f11369p0 + m27193m0() + this.f11372s0;
            float m27181q0 = this.f11376w0 + m27181q0() + this.f11373t0;
            if (C1365a.m36196f(this) == 0) {
                rectF.left = rect.left + m27193m0;
                rectF.right = rect.right - m27181q0;
            } else {
                rectF.left = rect.left + m27181q0;
                rectF.right = rect.right - m27193m0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    /* renamed from: r1 */
    private static boolean m27177r1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: s0 */
    private float m27175s0() {
        this.f11322E0.m26704e().getFontMetrics(this.f11318A0);
        Paint.FontMetrics fontMetrics = this.f11318A0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* renamed from: s1 */
    private static boolean m27174s1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: t1 */
    private static boolean m27171t1(C9322d c9322d) {
        ColorStateList colorStateList;
        return (c9322d == null || (colorStateList = c9322d.f21904a) == null || !colorStateList.isStateful()) ? false : true;
    }

    /* renamed from: u0 */
    private boolean m27169u0() {
        return this.f11364k0 && this.f11365l0 != null && this.f11363j0;
    }

    /* renamed from: u1 */
    private void m27168u1(AttributeSet attributeSet, int i, int i2) {
        TypedArray m26690h = C4695q.m26690h(this.f11377x0, attributeSet, C9277l.Chip, i, i2, new int[0]);
        this.f11353Z0 = m26690h.hasValue(C9277l.Chip_shapeAppearance);
        m27216b2(C9321c.m15053a(this.f11377x0, m26690h, C9277l.Chip_chipSurfaceColor));
        m27273F1(C9321c.m15053a(this.f11377x0, m26690h, C9277l.Chip_chipBackgroundColor));
        m27232T1(m26690h.getDimension(C9277l.Chip_chipMinHeight, 0.0f));
        if (m26690h.hasValue(C9277l.Chip_chipCornerRadius)) {
            m27267H1(m26690h.getDimension(C9277l.Chip_chipCornerRadius, 0.0f));
        }
        m27224X1(C9321c.m15053a(this.f11377x0, m26690h, C9277l.Chip_chipStrokeColor));
        m27220Z1(m26690h.getDimension(C9277l.Chip_chipStrokeWidth, 0.0f));
        m27155y2(C9321c.m15053a(this.f11377x0, m26690h, C9277l.Chip_rippleColor));
        m27278D2(m26690h.getText(C9277l.Chip_android_text));
        C9322d m15048f = C9321c.m15048f(this.f11377x0, m26690h, C9277l.Chip_android_textAppearance);
        m15048f.f21916m = m26690h.getDimension(C9277l.Chip_android_textSize, m15048f.f21916m);
        m27275E2(m15048f);
        int i3 = m26690h.getInt(C9277l.Chip_android_ellipsize, 0);
        if (i3 == 1) {
            m27179q2(TextUtils.TruncateAt.START);
        } else if (i3 == 2) {
            m27179q2(TextUtils.TruncateAt.MIDDLE);
        } else if (i3 == 3) {
            m27179q2(TextUtils.TruncateAt.END);
        }
        m27234S1(m26690h.getBoolean(C9277l.Chip_chipIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            m27234S1(m26690h.getBoolean(C9277l.Chip_chipIconEnabled, false));
        }
        m27255L1(C9321c.m15050d(this.f11377x0, m26690h, C9277l.Chip_chipIcon));
        if (m26690h.hasValue(C9277l.Chip_chipIconTint)) {
            m27243P1(C9321c.m15053a(this.f11377x0, m26690h, C9277l.Chip_chipIconTint));
        }
        m27249N1(m26690h.getDimension(C9277l.Chip_chipIconSize, -1.0f));
        m27185o2(m26690h.getBoolean(C9277l.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            m27185o2(m26690h.getBoolean(C9277l.Chip_closeIconEnabled, false));
        }
        m27214c2(C9321c.m15050d(this.f11377x0, m26690h, C9277l.Chip_closeIcon));
        m27191m2(C9321c.m15053a(this.f11377x0, m26690h, C9277l.Chip_closeIconTint));
        m27204h2(m26690h.getDimension(C9277l.Chip_closeIconSize, 0.0f));
        m27159x1(m26690h.getBoolean(C9277l.Chip_android_checkable, false));
        m27276E1(m26690h.getBoolean(C9277l.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            m27276E1(m26690h.getBoolean(C9277l.Chip_checkedIconEnabled, false));
        }
        m27153z1(C9321c.m15050d(this.f11377x0, m26690h, C9277l.Chip_checkedIcon));
        if (m26690h.hasValue(C9277l.Chip_checkedIconTint)) {
            m27285B1(C9321c.m15053a(this.f11377x0, m26690h, C9277l.Chip_checkedIconTint));
        }
        m27284B2(C9285h.m15224b(this.f11377x0, m26690h, C9277l.Chip_showMotionSpec));
        m27176r2(C9285h.m15224b(this.f11377x0, m26690h, C9277l.Chip_hideMotionSpec));
        m27228V1(m26690h.getDimension(C9277l.Chip_chipStartPadding, 0.0f));
        m27164v2(m26690h.getDimension(C9277l.Chip_iconStartPadding, 0.0f));
        m27170t2(m26690h.getDimension(C9277l.Chip_iconEndPadding, 0.0f));
        m27263I2(m26690h.getDimension(C9277l.Chip_textStartPadding, 0.0f));
        m27269G2(m26690h.getDimension(C9277l.Chip_textEndPadding, 0.0f));
        m27200j2(m26690h.getDimension(C9277l.Chip_closeIconStartPadding, 0.0f));
        m27210e2(m26690h.getDimension(C9277l.Chip_closeIconEndPadding, 0.0f));
        m27261J1(m26690h.getDimension(C9277l.Chip_chipEndPadding, 0.0f));
        m27158x2(m26690h.getDimensionPixelSize(C9277l.Chip_android_maxWidth, Integer.MAX_VALUE));
        m26690h.recycle();
    }

    /* renamed from: v0 */
    public static C4574a m27166v0(Context context, AttributeSet attributeSet, int i, int i2) {
        C4574a c4574a = new C4574a(context, attributeSet, i, i2);
        c4574a.m27168u1(attributeSet, i, i2);
        return c4574a;
    }

    /* renamed from: w0 */
    private void m27163w0(Canvas canvas, Rect rect) {
        if (m27251M2()) {
            m27196l0(rect, this.f11319B0);
            RectF rectF = this.f11319B0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f11365l0.setBounds(0, 0, (int) this.f11319B0.width(), (int) this.f11319B0.height());
            this.f11365l0.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0152  */
    /* renamed from: w1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m27162w1(int[] r7, int[] r8) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.C4574a.m27162w1(int[], int[]):boolean");
    }

    /* renamed from: x0 */
    private void m27160x0(Canvas canvas, Rect rect) {
        if (this.f11353Z0) {
            return;
        }
        this.f11378y0.setColor(this.f11324G0);
        this.f11378y0.setStyle(Paint.Style.FILL);
        this.f11378y0.setColorFilter(m27195l1());
        this.f11319B0.set(rect);
        canvas.drawRoundRect(this.f11319B0, m27265I0(), m27265I0(), this.f11378y0);
    }

    /* renamed from: y0 */
    private void m27157y0(Canvas canvas, Rect rect) {
        if (m27248N2()) {
            m27196l0(rect, this.f11319B0);
            RectF rectF = this.f11319B0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f11352Z.setBounds(0, 0, (int) this.f11319B0.width(), (int) this.f11319B0.height());
            this.f11352Z.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: z0 */
    private void m27154z0(Canvas canvas, Rect rect) {
        if (this.f11344V <= 0.0f || this.f11353Z0) {
            return;
        }
        this.f11378y0.setColor(this.f11326I0);
        this.f11378y0.setStyle(Paint.Style.STROKE);
        if (!this.f11353Z0) {
            this.f11378y0.setColorFilter(m27195l1());
        }
        RectF rectF = this.f11319B0;
        float f = this.f11344V;
        rectF.set(rect.left + (f / 2.0f), rect.top + (f / 2.0f), rect.right - (f / 2.0f), rect.bottom - (f / 2.0f));
        float f2 = this.f11340T - (this.f11344V / 2.0f);
        canvas.drawRoundRect(this.f11319B0, f2, f2, this.f11378y0);
    }

    /* renamed from: A1 */
    public void m27288A1(int i) {
        m27153z1(C7462a.m18690d(this.f11377x0, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A2 */
    public void m27287A2(boolean z) {
        this.f11349X0 = z;
    }

    /* renamed from: B1 */
    public void m27285B1(ColorStateList colorStateList) {
        if (this.f11366m0 != colorStateList) {
            this.f11366m0 = colorStateList;
            if (m27169u0()) {
                C1365a.m36187o(this.f11365l0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: B2 */
    public void m27284B2(C9285h c9285h) {
        this.f11367n0 = c9285h;
    }

    /* renamed from: C1 */
    public void m27282C1(int i) {
        m27285B1(C7462a.m18691c(this.f11377x0, i));
    }

    /* renamed from: C2 */
    public void m27281C2(int i) {
        m27284B2(C9285h.m15223c(this.f11377x0, i));
    }

    /* renamed from: D1 */
    public void m27279D1(int i) {
        m27276E1(this.f11377x0.getResources().getBoolean(i));
    }

    /* renamed from: D2 */
    public void m27278D2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.f11348X, charSequence)) {
            return;
        }
        this.f11348X = charSequence;
        this.f11322E0.m26700i(true);
        invalidateSelf();
        m27165v1();
    }

    /* renamed from: E1 */
    public void m27276E1(boolean z) {
        if (this.f11364k0 != z) {
            boolean m27251M2 = m27251M2();
            this.f11364k0 = z;
            boolean m27251M22 = m27251M2();
            if (m27251M2 != m27251M22) {
                if (m27251M22) {
                    m27199k0(this.f11365l0);
                } else {
                    m27242P2(this.f11365l0);
                }
                invalidateSelf();
                m27165v1();
            }
        }
    }

    /* renamed from: E2 */
    public void m27275E2(C9322d c9322d) {
        this.f11322E0.m26701h(c9322d, this.f11377x0);
    }

    /* renamed from: F0 */
    public Drawable m27274F0() {
        return this.f11365l0;
    }

    /* renamed from: F1 */
    public void m27273F1(ColorStateList colorStateList) {
        if (this.f11336R != colorStateList) {
            this.f11336R = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: F2 */
    public void m27272F2(int i) {
        m27275E2(new C9322d(this.f11377x0, i));
    }

    /* renamed from: G0 */
    public ColorStateList m27271G0() {
        return this.f11366m0;
    }

    /* renamed from: G1 */
    public void m27270G1(int i) {
        m27273F1(C7462a.m18691c(this.f11377x0, i));
    }

    /* renamed from: G2 */
    public void m27269G2(float f) {
        if (this.f11373t0 != f) {
            this.f11373t0 = f;
            invalidateSelf();
            m27165v1();
        }
    }

    /* renamed from: H0 */
    public ColorStateList m27268H0() {
        return this.f11336R;
    }

    @Deprecated
    /* renamed from: H1 */
    public void m27267H1(float f) {
        if (this.f11340T != f) {
            this.f11340T = f;
            setShapeAppearanceModel(m15430C().m15341w(f));
        }
    }

    /* renamed from: H2 */
    public void m27266H2(int i) {
        m27269G2(this.f11377x0.getResources().getDimension(i));
    }

    /* renamed from: I0 */
    public float m27265I0() {
        return this.f11353Z0 ? m15427F() : this.f11340T;
    }

    @Deprecated
    /* renamed from: I1 */
    public void m27264I1(int i) {
        m27267H1(this.f11377x0.getResources().getDimension(i));
    }

    /* renamed from: I2 */
    public void m27263I2(float f) {
        if (this.f11372s0 != f) {
            this.f11372s0 = f;
            invalidateSelf();
            m27165v1();
        }
    }

    /* renamed from: J0 */
    public float m27262J0() {
        return this.f11376w0;
    }

    /* renamed from: J1 */
    public void m27261J1(float f) {
        if (this.f11376w0 != f) {
            this.f11376w0 = f;
            invalidateSelf();
            m27165v1();
        }
    }

    /* renamed from: J2 */
    public void m27260J2(int i) {
        m27263I2(this.f11377x0.getResources().getDimension(i));
    }

    /* renamed from: K0 */
    public Drawable m27259K0() {
        Drawable drawable = this.f11352Z;
        if (drawable != null) {
            return C1365a.m36185q(drawable);
        }
        return null;
    }

    /* renamed from: K1 */
    public void m27258K1(int i) {
        m27261J1(this.f11377x0.getResources().getDimension(i));
    }

    /* renamed from: K2 */
    public void m27257K2(boolean z) {
        if (this.f11341T0 != z) {
            this.f11341T0 = z;
            m27239Q2();
            onStateChange(getState());
        }
    }

    /* renamed from: L0 */
    public float m27256L0() {
        return this.f11355b0;
    }

    /* renamed from: L1 */
    public void m27255L1(Drawable drawable) {
        Drawable m27259K0 = m27259K0();
        if (m27259K0 != drawable) {
            float m27193m0 = m27193m0();
            this.f11352Z = drawable != null ? C1365a.m36184r(drawable).mutate() : null;
            float m27193m02 = m27193m0();
            m27242P2(m27259K0);
            if (m27248N2()) {
                m27199k0(this.f11352Z);
            }
            invalidateSelf();
            if (m27193m0 != m27193m02) {
                m27165v1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L2 */
    public boolean m27254L2() {
        return this.f11349X0;
    }

    /* renamed from: M0 */
    public ColorStateList m27253M0() {
        return this.f11354a0;
    }

    /* renamed from: M1 */
    public void m27252M1(int i) {
        m27255L1(C7462a.m18690d(this.f11377x0, i));
    }

    /* renamed from: N0 */
    public float m27250N0() {
        return this.f11338S;
    }

    /* renamed from: N1 */
    public void m27249N1(float f) {
        if (this.f11355b0 != f) {
            float m27193m0 = m27193m0();
            this.f11355b0 = f;
            float m27193m02 = m27193m0();
            invalidateSelf();
            if (m27193m0 != m27193m02) {
                m27165v1();
            }
        }
    }

    /* renamed from: O0 */
    public float m27247O0() {
        return this.f11369p0;
    }

    /* renamed from: O1 */
    public void m27246O1(int i) {
        m27249N1(this.f11377x0.getResources().getDimension(i));
    }

    /* renamed from: P0 */
    public ColorStateList m27244P0() {
        return this.f11342U;
    }

    /* renamed from: P1 */
    public void m27243P1(ColorStateList colorStateList) {
        this.f11356c0 = true;
        if (this.f11354a0 != colorStateList) {
            this.f11354a0 = colorStateList;
            if (m27248N2()) {
                C1365a.m36187o(this.f11352Z, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: Q0 */
    public float m27241Q0() {
        return this.f11344V;
    }

    /* renamed from: Q1 */
    public void m27240Q1(int i) {
        m27243P1(C7462a.m18691c(this.f11377x0, i));
    }

    /* renamed from: R0 */
    public Drawable m27238R0() {
        Drawable drawable = this.f11358e0;
        if (drawable != null) {
            return C1365a.m36185q(drawable);
        }
        return null;
    }

    /* renamed from: R1 */
    public void m27237R1(int i) {
        m27234S1(this.f11377x0.getResources().getBoolean(i));
    }

    /* renamed from: S0 */
    public CharSequence m27235S0() {
        return this.f11362i0;
    }

    /* renamed from: S1 */
    public void m27234S1(boolean z) {
        if (this.f11350Y != z) {
            boolean m27248N2 = m27248N2();
            this.f11350Y = z;
            boolean m27248N22 = m27248N2();
            if (m27248N2 != m27248N22) {
                if (m27248N22) {
                    m27199k0(this.f11352Z);
                } else {
                    m27242P2(this.f11352Z);
                }
                invalidateSelf();
                m27165v1();
            }
        }
    }

    /* renamed from: T0 */
    public float m27233T0() {
        return this.f11375v0;
    }

    /* renamed from: T1 */
    public void m27232T1(float f) {
        if (this.f11338S != f) {
            this.f11338S = f;
            invalidateSelf();
            m27165v1();
        }
    }

    /* renamed from: U0 */
    public float m27231U0() {
        return this.f11361h0;
    }

    /* renamed from: U1 */
    public void m27230U1(int i) {
        m27232T1(this.f11377x0.getResources().getDimension(i));
    }

    /* renamed from: V0 */
    public float m27229V0() {
        return this.f11374u0;
    }

    /* renamed from: V1 */
    public void m27228V1(float f) {
        if (this.f11369p0 != f) {
            this.f11369p0 = f;
            invalidateSelf();
            m27165v1();
        }
    }

    /* renamed from: W0 */
    public int[] m27227W0() {
        return this.f11339S0;
    }

    /* renamed from: W1 */
    public void m27226W1(int i) {
        m27228V1(this.f11377x0.getResources().getDimension(i));
    }

    /* renamed from: X0 */
    public ColorStateList m27225X0() {
        return this.f11360g0;
    }

    /* renamed from: X1 */
    public void m27224X1(ColorStateList colorStateList) {
        if (this.f11342U != colorStateList) {
            this.f11342U = colorStateList;
            if (this.f11353Z0) {
                m15396f0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: Y0 */
    public void m27223Y0(RectF rectF) {
        m27184p0(getBounds(), rectF);
    }

    /* renamed from: Y1 */
    public void m27222Y1(int i) {
        m27224X1(C7462a.m18691c(this.f11377x0, i));
    }

    /* renamed from: Z1 */
    public void m27220Z1(float f) {
        if (this.f11344V != f) {
            this.f11344V = f;
            this.f11378y0.setStrokeWidth(f);
            if (this.f11353Z0) {
                super.m15394g0(f);
            }
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.internal.C4689n.InterfaceC4691b
    /* renamed from: a */
    public void mo15200a() {
        m27165v1();
        invalidateSelf();
    }

    /* renamed from: a2 */
    public void m27218a2(int i) {
        m27220Z1(this.f11377x0.getResources().getDimension(i));
    }

    /* renamed from: b1 */
    public TextUtils.TruncateAt m27217b1() {
        return this.f11347W0;
    }

    /* renamed from: c1 */
    public C9285h m27215c1() {
        return this.f11368o0;
    }

    /* renamed from: c2 */
    public void m27214c2(Drawable drawable) {
        Drawable m27238R0 = m27238R0();
        if (m27238R0 != drawable) {
            float m27181q0 = m27181q0();
            this.f11358e0 = drawable != null ? C1365a.m36184r(drawable).mutate() : null;
            if (C9232b.f21638a) {
                m27236R2();
            }
            float m27181q02 = m27181q0();
            m27242P2(m27238R0);
            if (m27245O2()) {
                m27199k0(this.f11358e0);
            }
            invalidateSelf();
            if (m27181q0 != m27181q02) {
                m27165v1();
            }
        }
    }

    /* renamed from: d1 */
    public float m27213d1() {
        return this.f11371r0;
    }

    /* renamed from: d2 */
    public void m27212d2(CharSequence charSequence) {
        if (this.f11362i0 != charSequence) {
            this.f11362i0 = C7651a.m17925c().m17920h(charSequence);
            invalidateSelf();
        }
    }

    @Override // p272h.p286c.p287a.p323c.p326c0.C9243g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i = this.f11331N0;
        int m15145a = i < 255 ? C9294a.m15145a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        m27289A0(canvas, bounds);
        m27160x0(canvas, bounds);
        if (this.f11353Z0) {
            super.draw(canvas);
        }
        m27154z0(canvas, bounds);
        m27283C0(canvas, bounds);
        m27157y0(canvas, bounds);
        m27163w0(canvas, bounds);
        if (this.f11349X0) {
            m27277E0(canvas, bounds);
        }
        m27286B0(canvas, bounds);
        m27280D0(canvas, bounds);
        if (this.f11331N0 < 255) {
            canvas.restoreToCount(m15145a);
        }
    }

    /* renamed from: e1 */
    public float m27211e1() {
        return this.f11370q0;
    }

    /* renamed from: e2 */
    public void m27210e2(float f) {
        if (this.f11375v0 != f) {
            this.f11375v0 = f;
            invalidateSelf();
            if (m27245O2()) {
                m27165v1();
            }
        }
    }

    /* renamed from: f1 */
    public ColorStateList m27209f1() {
        return this.f11346W;
    }

    /* renamed from: f2 */
    public void m27208f2(int i) {
        m27210e2(this.f11377x0.getResources().getDimension(i));
    }

    /* renamed from: g1 */
    public C9285h m27207g1() {
        return this.f11367n0;
    }

    /* renamed from: g2 */
    public void m27206g2(int i) {
        m27214c2(C7462a.m18690d(this.f11377x0, i));
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f11331N0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f11332O0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f11338S;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f11369p0 + m27193m0() + this.f11372s0 + this.f11322E0.m26703f(m27205h1().toString()) + this.f11373t0 + m27181q0() + this.f11376w0), this.f11351Y0);
    }

    @Override // p272h.p286c.p287a.p323c.p326c0.C9243g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // p272h.p286c.p287a.p323c.p326c0.C9243g, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f11353Z0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f11340T);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f11340T);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    /* renamed from: h1 */
    public CharSequence m27205h1() {
        return this.f11348X;
    }

    /* renamed from: h2 */
    public void m27204h2(float f) {
        if (this.f11361h0 != f) {
            this.f11361h0 = f;
            invalidateSelf();
            if (m27245O2()) {
                m27165v1();
            }
        }
    }

    /* renamed from: i1 */
    public C9322d m27203i1() {
        return this.f11322E0.m26705d();
    }

    /* renamed from: i2 */
    public void m27202i2(int i) {
        m27204h2(this.f11377x0.getResources().getDimension(i));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p272h.p286c.p287a.p323c.p326c0.C9243g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return m27177r1(this.f11334Q) || m27177r1(this.f11336R) || m27177r1(this.f11342U) || (this.f11341T0 && m27177r1(this.f11343U0)) || m27171t1(this.f11322E0.m26705d()) || m27169u0() || m27174s1(this.f11352Z) || m27174s1(this.f11365l0) || m27177r1(this.f11335Q0);
    }

    /* renamed from: j1 */
    public float m27201j1() {
        return this.f11373t0;
    }

    /* renamed from: j2 */
    public void m27200j2(float f) {
        if (this.f11374u0 != f) {
            this.f11374u0 = f;
            invalidateSelf();
            if (m27245O2()) {
                m27165v1();
            }
        }
    }

    /* renamed from: k1 */
    public float m27198k1() {
        return this.f11372s0;
    }

    /* renamed from: k2 */
    public void m27197k2(int i) {
        m27200j2(this.f11377x0.getResources().getDimension(i));
    }

    /* renamed from: l2 */
    public boolean m27194l2(int[] iArr) {
        if (Arrays.equals(this.f11339S0, iArr)) {
            return false;
        }
        this.f11339S0 = iArr;
        if (m27245O2()) {
            return m27162w1(getState(), iArr);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m0 */
    public float m27193m0() {
        if (m27248N2() || m27251M2()) {
            return this.f11370q0 + m27219a1() + this.f11371r0;
        }
        return 0.0f;
    }

    /* renamed from: m1 */
    public boolean m27192m1() {
        return this.f11341T0;
    }

    /* renamed from: m2 */
    public void m27191m2(ColorStateList colorStateList) {
        if (this.f11360g0 != colorStateList) {
            this.f11360g0 = colorStateList;
            if (m27245O2()) {
                C1365a.m36187o(this.f11358e0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: n2 */
    public void m27188n2(int i) {
        m27191m2(C7462a.m18691c(this.f11377x0, i));
    }

    /* renamed from: o1 */
    public boolean m27186o1() {
        return this.f11363j0;
    }

    /* renamed from: o2 */
    public void m27185o2(boolean z) {
        if (this.f11357d0 != z) {
            boolean m27245O2 = m27245O2();
            this.f11357d0 = z;
            boolean m27245O22 = m27245O2();
            if (m27245O2 != m27245O22) {
                if (m27245O22) {
                    m27199k0(this.f11358e0);
                } else {
                    m27242P2(this.f11358e0);
                }
                invalidateSelf();
                m27165v1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m27248N2()) {
            onLayoutDirectionChanged |= C1365a.m36189m(this.f11352Z, i);
        }
        if (m27251M2()) {
            onLayoutDirectionChanged |= C1365a.m36189m(this.f11365l0, i);
        }
        if (m27245O2()) {
            onLayoutDirectionChanged |= C1365a.m36189m(this.f11358e0, i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (m27248N2()) {
            onLevelChange |= this.f11352Z.setLevel(i);
        }
        if (m27251M2()) {
            onLevelChange |= this.f11365l0.setLevel(i);
        }
        if (m27245O2()) {
            onLevelChange |= this.f11358e0.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // p272h.p286c.p287a.p323c.p326c0.C9243g, android.graphics.drawable.Drawable, com.google.android.material.internal.C4689n.InterfaceC4691b
    public boolean onStateChange(int[] iArr) {
        if (this.f11353Z0) {
            super.onStateChange(iArr);
        }
        return m27162w1(iArr, m27227W0());
    }

    /* renamed from: p1 */
    public boolean m27183p1() {
        return m27174s1(this.f11358e0);
    }

    /* renamed from: p2 */
    public void m27182p2(InterfaceC4575a interfaceC4575a) {
        this.f11345V0 = new WeakReference<>(interfaceC4575a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q0 */
    public float m27181q0() {
        if (m27245O2()) {
            return this.f11374u0 + this.f11361h0 + this.f11375v0;
        }
        return 0.0f;
    }

    /* renamed from: q1 */
    public boolean m27180q1() {
        return this.f11357d0;
    }

    /* renamed from: q2 */
    public void m27179q2(TextUtils.TruncateAt truncateAt) {
        this.f11347W0 = truncateAt;
    }

    /* renamed from: r2 */
    public void m27176r2(C9285h c9285h) {
        this.f11368o0 = c9285h;
    }

    /* renamed from: s2 */
    public void m27173s2(int i) {
        m27176r2(C9285h.m15223c(this.f11377x0, i));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // p272h.p286c.p287a.p323c.p326c0.C9243g, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f11331N0 != i) {
            this.f11331N0 = i;
            invalidateSelf();
        }
    }

    @Override // p272h.p286c.p287a.p323c.p326c0.C9243g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f11332O0 != colorFilter) {
            this.f11332O0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p272h.p286c.p287a.p323c.p326c0.C9243g, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC1366b
    public void setTintList(ColorStateList colorStateList) {
        if (this.f11335Q0 != colorStateList) {
            this.f11335Q0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p272h.p286c.p287a.p323c.p326c0.C9243g, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC1366b
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f11337R0 != mode) {
            this.f11337R0 = mode;
            this.f11333P0 = C9312a.m15077a(this, this.f11335Q0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m27248N2()) {
            visible |= this.f11352Z.setVisible(z, z2);
        }
        if (m27251M2()) {
            visible |= this.f11365l0.setVisible(z, z2);
        }
        if (m27245O2()) {
            visible |= this.f11358e0.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* renamed from: t0 */
    Paint.Align m27172t0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f11348X != null) {
            float m27193m0 = this.f11369p0 + m27193m0() + this.f11372s0;
            if (C1365a.m36196f(this) == 0) {
                pointF.x = rect.left + m27193m0;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = rect.right - m27193m0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - m27175s0();
        }
        return align;
    }

    /* renamed from: t2 */
    public void m27170t2(float f) {
        if (this.f11371r0 != f) {
            float m27193m0 = m27193m0();
            this.f11371r0 = f;
            float m27193m02 = m27193m0();
            invalidateSelf();
            if (m27193m0 != m27193m02) {
                m27165v1();
            }
        }
    }

    /* renamed from: u2 */
    public void m27167u2(int i) {
        m27170t2(this.f11377x0.getResources().getDimension(i));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v1 */
    protected void m27165v1() {
        InterfaceC4575a interfaceC4575a = this.f11345V0.get();
        if (interfaceC4575a != null) {
            interfaceC4575a.mo27151a();
        }
    }

    /* renamed from: v2 */
    public void m27164v2(float f) {
        if (this.f11370q0 != f) {
            float m27193m0 = m27193m0();
            this.f11370q0 = f;
            float m27193m02 = m27193m0();
            invalidateSelf();
            if (m27193m0 != m27193m02) {
                m27165v1();
            }
        }
    }

    /* renamed from: w2 */
    public void m27161w2(int i) {
        m27164v2(this.f11377x0.getResources().getDimension(i));
    }

    /* renamed from: x1 */
    public void m27159x1(boolean z) {
        if (this.f11363j0 != z) {
            this.f11363j0 = z;
            float m27193m0 = m27193m0();
            if (!z && this.f11329L0) {
                this.f11329L0 = false;
            }
            float m27193m02 = m27193m0();
            invalidateSelf();
            if (m27193m0 != m27193m02) {
                m27165v1();
            }
        }
    }

    /* renamed from: x2 */
    public void m27158x2(int i) {
        this.f11351Y0 = i;
    }

    /* renamed from: y1 */
    public void m27156y1(int i) {
        m27159x1(this.f11377x0.getResources().getBoolean(i));
    }

    /* renamed from: y2 */
    public void m27155y2(ColorStateList colorStateList) {
        if (this.f11346W != colorStateList) {
            this.f11346W = colorStateList;
            m27239Q2();
            onStateChange(getState());
        }
    }

    /* renamed from: z1 */
    public void m27153z1(Drawable drawable) {
        if (this.f11365l0 != drawable) {
            float m27193m0 = m27193m0();
            this.f11365l0 = drawable;
            float m27193m02 = m27193m0();
            m27242P2(this.f11365l0);
            m27199k0(this.f11365l0);
            invalidateSelf();
            if (m27193m0 != m27193m02) {
                m27165v1();
            }
        }
    }

    /* renamed from: z2 */
    public void m27152z2(int i) {
        m27155y2(C7462a.m18691c(this.f11377x0, i));
    }
}

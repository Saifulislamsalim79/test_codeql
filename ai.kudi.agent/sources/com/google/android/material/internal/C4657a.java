package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.android.material.internal.C4687m;
import p201g.p227h.p233h.C7628a;
import p201g.p227h.p235j.C7659e;
import p201g.p227h.p237k.C7675h;
import p201g.p227h.p238l.C7693e;
import p201g.p227h.p238l.C7759x;
import p272h.p286c.p287a.p323c.p328m.C9278a;
import p272h.p286c.p287a.p323c.p342z.C9318a;
import p272h.p286c.p287a.p323c.p342z.C9322d;
/* compiled from: CollapsingTextHelper.java */
/* renamed from: com.google.android.material.internal.a */
/* loaded from: classes2.dex */
public final class C4657a {

    /* renamed from: b0 */
    private static final boolean f11641b0;

    /* renamed from: c0 */
    private static final Paint f11642c0;

    /* renamed from: A */
    private boolean f11643A;

    /* renamed from: B */
    private Bitmap f11644B;

    /* renamed from: C */
    private Paint f11645C;

    /* renamed from: D */
    private float f11646D;

    /* renamed from: E */
    private float f11647E;

    /* renamed from: F */
    private int[] f11648F;

    /* renamed from: G */
    private boolean f11649G;

    /* renamed from: J */
    private TimeInterpolator f11652J;

    /* renamed from: K */
    private TimeInterpolator f11653K;

    /* renamed from: L */
    private float f11654L;

    /* renamed from: M */
    private float f11655M;

    /* renamed from: N */
    private float f11656N;

    /* renamed from: O */
    private ColorStateList f11657O;

    /* renamed from: P */
    private float f11658P;

    /* renamed from: Q */
    private float f11659Q;

    /* renamed from: R */
    private float f11660R;

    /* renamed from: S */
    private ColorStateList f11661S;

    /* renamed from: T */
    private float f11662T;

    /* renamed from: U */
    private float f11663U;

    /* renamed from: V */
    private StaticLayout f11664V;

    /* renamed from: W */
    private float f11665W;

    /* renamed from: X */
    private float f11666X;

    /* renamed from: Y */
    private float f11667Y;

    /* renamed from: Z */
    private CharSequence f11668Z;

    /* renamed from: a */
    private final View f11669a;

    /* renamed from: b */
    private boolean f11671b;

    /* renamed from: c */
    private float f11672c;

    /* renamed from: k */
    private ColorStateList f11680k;

    /* renamed from: l */
    private ColorStateList f11681l;

    /* renamed from: m */
    private float f11682m;

    /* renamed from: n */
    private float f11683n;

    /* renamed from: o */
    private float f11684o;

    /* renamed from: p */
    private float f11685p;

    /* renamed from: q */
    private float f11686q;

    /* renamed from: r */
    private float f11687r;

    /* renamed from: s */
    private Typeface f11688s;

    /* renamed from: t */
    private Typeface f11689t;

    /* renamed from: u */
    private Typeface f11690u;

    /* renamed from: v */
    private C9318a f11691v;

    /* renamed from: w */
    private C9318a f11692w;

    /* renamed from: x */
    private CharSequence f11693x;

    /* renamed from: y */
    private CharSequence f11694y;

    /* renamed from: z */
    private boolean f11695z;

    /* renamed from: g */
    private int f11676g = 16;

    /* renamed from: h */
    private int f11677h = 16;

    /* renamed from: i */
    private float f11678i = 15.0f;

    /* renamed from: j */
    private float f11679j = 15.0f;

    /* renamed from: a0 */
    private int f11670a0 = 1;

    /* renamed from: H */
    private final TextPaint f11650H = new TextPaint(129);

    /* renamed from: I */
    private final TextPaint f11651I = new TextPaint(this.f11650H);

    /* renamed from: e */
    private final Rect f11674e = new Rect();

    /* renamed from: d */
    private final Rect f11673d = new Rect();

    /* renamed from: f */
    private final RectF f11675f = new RectF();

    /* compiled from: CollapsingTextHelper.java */
    /* renamed from: com.google.android.material.internal.a$a */
    /* loaded from: classes2.dex */
    class C4658a implements C9318a.InterfaceC9319a {
        C4658a() {
        }

        @Override // p272h.p286c.p287a.p323c.p342z.C9318a.InterfaceC9319a
        /* renamed from: a */
        public void mo15058a(Typeface typeface) {
            C4657a.this.m26833S(typeface);
        }
    }

    /* compiled from: CollapsingTextHelper.java */
    /* renamed from: com.google.android.material.internal.a$b */
    /* loaded from: classes2.dex */
    class C4659b implements C9318a.InterfaceC9319a {
        C4659b() {
        }

        @Override // p272h.p286c.p287a.p323c.p342z.C9318a.InterfaceC9319a
        /* renamed from: a */
        public void mo15058a(Typeface typeface) {
            C4657a.this.m26822b0(typeface);
        }
    }

    static {
        f11641b0 = Build.VERSION.SDK_INT < 18;
        Paint paint = null;
        f11642c0 = null;
        if (0 != 0) {
            paint.setAntiAlias(true);
            f11642c0.setColor(-65281);
        }
    }

    public C4657a(View view) {
        this.f11669a = view;
    }

    /* renamed from: C */
    private void m26849C(TextPaint textPaint) {
        textPaint.setTextSize(this.f11679j);
        textPaint.setTypeface(this.f11688s);
        if (Build.VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(this.f11662T);
        }
    }

    /* renamed from: D */
    private void m26848D(TextPaint textPaint) {
        textPaint.setTextSize(this.f11678i);
        textPaint.setTypeface(this.f11689t);
        if (Build.VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(this.f11663U);
        }
    }

    /* renamed from: E */
    private void m26847E(float f) {
        this.f11675f.left = m26843I(this.f11673d.left, this.f11674e.left, f, this.f11652J);
        this.f11675f.top = m26843I(this.f11682m, this.f11683n, f, this.f11652J);
        this.f11675f.right = m26843I(this.f11673d.right, this.f11674e.right, f, this.f11652J);
        this.f11675f.bottom = m26843I(this.f11673d.bottom, this.f11674e.bottom, f, this.f11652J);
    }

    /* renamed from: F */
    private static boolean m26846F(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    /* renamed from: G */
    private boolean m26845G() {
        return C7759x.m17563C(this.f11669a) == 1;
    }

    /* renamed from: I */
    private static float m26843I(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return C9278a.m15237a(f, f2, f3);
    }

    /* renamed from: L */
    private static boolean m26840L(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* renamed from: P */
    private void m26836P(float f) {
        this.f11665W = f;
        C7759x.m17516g0(this.f11669a);
    }

    /* renamed from: T */
    private boolean m26832T(Typeface typeface) {
        C9318a c9318a = this.f11692w;
        if (c9318a != null) {
            c9318a.m15060c();
        }
        if (this.f11688s != typeface) {
            this.f11688s = typeface;
            return true;
        }
        return false;
    }

    /* renamed from: X */
    private void m26828X(float f) {
        this.f11666X = f;
        C7759x.m17516g0(this.f11669a);
    }

    /* renamed from: a */
    private static int m26825a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), (int) ((Color.red(i) * f2) + (Color.red(i2) * f)), (int) ((Color.green(i) * f2) + (Color.green(i2) * f)), (int) ((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    /* renamed from: b */
    private void m26823b() {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        float f = this.f11647E;
        m26813g(this.f11679j);
        CharSequence charSequence = this.f11694y;
        if (charSequence != null && (staticLayout2 = this.f11664V) != null) {
            this.f11668Z = TextUtils.ellipsize(charSequence, this.f11650H, staticLayout2.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.f11668Z;
        float measureText = charSequence2 != null ? this.f11650H.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        int m17805b = C7693e.m17805b(this.f11677h, this.f11695z ? 1 : 0);
        int i = m17805b & 112;
        if (i == 48) {
            this.f11683n = this.f11674e.top;
        } else if (i != 80) {
            this.f11683n = this.f11674e.centerY() - ((this.f11650H.descent() - this.f11650H.ascent()) / 2.0f);
        } else {
            this.f11683n = this.f11674e.bottom + this.f11650H.ascent();
        }
        int i2 = m17805b & 8388615;
        if (i2 == 1) {
            this.f11685p = this.f11674e.centerX() - (measureText / 2.0f);
        } else if (i2 != 5) {
            this.f11685p = this.f11674e.left;
        } else {
            this.f11685p = this.f11674e.right - measureText;
        }
        m26813g(this.f11678i);
        float height = this.f11664V != null ? staticLayout.getHeight() : 0.0f;
        CharSequence charSequence3 = this.f11694y;
        float measureText2 = charSequence3 != null ? this.f11650H.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        StaticLayout staticLayout3 = this.f11664V;
        if (staticLayout3 != null && this.f11670a0 > 1 && !this.f11695z) {
            measureText2 = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f11664V;
        this.f11667Y = staticLayout4 != null ? staticLayout4.getLineLeft(0) : 0.0f;
        int m17805b2 = C7693e.m17805b(this.f11676g, this.f11695z ? 1 : 0);
        int i3 = m17805b2 & 112;
        if (i3 == 48) {
            this.f11682m = this.f11673d.top;
        } else if (i3 != 80) {
            this.f11682m = this.f11673d.centerY() - (height / 2.0f);
        } else {
            this.f11682m = (this.f11673d.bottom - height) + this.f11650H.descent();
        }
        int i4 = m17805b2 & 8388615;
        if (i4 == 1) {
            this.f11684o = this.f11673d.centerX() - (measureText2 / 2.0f);
        } else if (i4 != 5) {
            this.f11684o = this.f11673d.left;
        } else {
            this.f11684o = this.f11673d.right - measureText2;
        }
        m26811h();
        m26816e0(f);
    }

    /* renamed from: c0 */
    private boolean m26820c0(Typeface typeface) {
        C9318a c9318a = this.f11691v;
        if (c9318a != null) {
            c9318a.m15060c();
        }
        if (this.f11689t != typeface) {
            this.f11689t = typeface;
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m26819d() {
        m26815f(this.f11672c);
    }

    /* renamed from: e */
    private boolean m26817e(CharSequence charSequence) {
        return (m26845G() ? C7659e.f18384d : C7659e.f18383c).mo17887a(charSequence, 0, charSequence.length());
    }

    /* renamed from: e0 */
    private void m26816e0(float f) {
        m26813g(f);
        boolean z = f11641b0 && this.f11646D != 1.0f;
        this.f11643A = z;
        if (z) {
            m26803l();
        }
        C7759x.m17516g0(this.f11669a);
    }

    /* renamed from: f */
    private void m26815f(float f) {
        m26847E(f);
        this.f11686q = m26843I(this.f11684o, this.f11685p, f, this.f11652J);
        this.f11687r = m26843I(this.f11682m, this.f11683n, f, this.f11652J);
        m26816e0(m26843I(this.f11678i, this.f11679j, f, this.f11653K));
        m26836P(1.0f - m26843I(0.0f, 1.0f, 1.0f - f, C9278a.f21807b));
        m26828X(m26843I(1.0f, 0.0f, f, C9278a.f21807b));
        if (this.f11681l != this.f11680k) {
            this.f11650H.setColor(m26825a(m26792v(), m26794t(), f));
        } else {
            this.f11650H.setColor(m26794t());
        }
        if (Build.VERSION.SDK_INT >= 21) {
            float f2 = this.f11662T;
            float f3 = this.f11663U;
            if (f2 != f3) {
                this.f11650H.setLetterSpacing(m26843I(f3, f2, f, C9278a.f21807b));
            } else {
                this.f11650H.setLetterSpacing(f2);
            }
        }
        this.f11650H.setShadowLayer(m26843I(this.f11658P, this.f11654L, f, null), m26843I(this.f11659Q, this.f11655M, f, null), m26843I(this.f11660R, this.f11656N, f, null), m26825a(m26793u(this.f11661S), m26793u(this.f11657O), f));
        C7759x.m17516g0(this.f11669a);
    }

    /* renamed from: g */
    private void m26813g(float f) {
        boolean z;
        float f2;
        boolean z2;
        if (this.f11693x == null) {
            return;
        }
        float width = this.f11674e.width();
        float width2 = this.f11673d.width();
        if (m26846F(f, this.f11679j)) {
            f2 = this.f11679j;
            this.f11646D = 1.0f;
            Typeface typeface = this.f11690u;
            Typeface typeface2 = this.f11688s;
            if (typeface != typeface2) {
                this.f11690u = typeface2;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            float f3 = this.f11678i;
            Typeface typeface3 = this.f11690u;
            Typeface typeface4 = this.f11689t;
            if (typeface3 != typeface4) {
                this.f11690u = typeface4;
                z = true;
            } else {
                z = false;
            }
            if (m26846F(f, this.f11678i)) {
                this.f11646D = 1.0f;
            } else {
                this.f11646D = f / this.f11678i;
            }
            float f4 = this.f11679j / this.f11678i;
            width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
            f2 = f3;
            z2 = z;
        }
        if (width > 0.0f) {
            z2 = this.f11647E != f2 || this.f11649G || z2;
            this.f11647E = f2;
            this.f11649G = false;
        }
        if (this.f11694y == null || z2) {
            this.f11650H.setTextSize(this.f11647E);
            this.f11650H.setTypeface(this.f11690u);
            this.f11650H.setLinearText(this.f11646D != 1.0f);
            this.f11695z = m26817e(this.f11693x);
            StaticLayout m26809i = m26809i(m26802l0() ? this.f11670a0 : 1, width, this.f11695z);
            this.f11664V = m26809i;
            this.f11694y = m26809i.getText();
        }
    }

    /* renamed from: h */
    private void m26811h() {
        Bitmap bitmap = this.f11644B;
        if (bitmap != null) {
            bitmap.recycle();
            this.f11644B = null;
        }
    }

    /* renamed from: i */
    private StaticLayout m26809i(int i, float f, boolean z) {
        StaticLayout staticLayout;
        try {
            C4687m m26714c = C4687m.m26714c(this.f11693x, this.f11650H, (int) f);
            m26714c.m26712e(TextUtils.TruncateAt.END);
            m26714c.m26710g(z);
            m26714c.m26713d(Layout.Alignment.ALIGN_NORMAL);
            m26714c.m26711f(false);
            m26714c.m26709h(i);
            staticLayout = m26714c.m26716a();
        } catch (C4687m.C4688a e) {
            Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
            staticLayout = null;
        }
        C7675h.m17866f(staticLayout);
        return staticLayout;
    }

    /* renamed from: k */
    private void m26805k(Canvas canvas, float f, float f2) {
        int alpha = this.f11650H.getAlpha();
        canvas.translate(f, f2);
        float f3 = alpha;
        this.f11650H.setAlpha((int) (this.f11666X * f3));
        this.f11664V.draw(canvas);
        this.f11650H.setAlpha((int) (this.f11665W * f3));
        int lineBaseline = this.f11664V.getLineBaseline(0);
        CharSequence charSequence = this.f11668Z;
        float f4 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f4, this.f11650H);
        String trim = this.f11668Z.toString().trim();
        if (trim.endsWith("…")) {
            trim = trim.substring(0, trim.length() - 1);
        }
        String str = trim;
        this.f11650H.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f11664V.getLineEnd(0), str.length()), 0.0f, f4, (Paint) this.f11650H);
    }

    /* renamed from: l */
    private void m26803l() {
        if (this.f11644B != null || this.f11673d.isEmpty() || TextUtils.isEmpty(this.f11694y)) {
            return;
        }
        m26815f(0.0f);
        int width = this.f11664V.getWidth();
        int height = this.f11664V.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.f11644B = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f11664V.draw(new Canvas(this.f11644B));
        if (this.f11645C == null) {
            this.f11645C = new Paint(3);
        }
    }

    /* renamed from: l0 */
    private boolean m26802l0() {
        return (this.f11670a0 <= 1 || this.f11695z || this.f11643A) ? false : true;
    }

    /* renamed from: q */
    private float m26797q(int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (i / 2.0f) - (m26821c() / 2.0f);
        }
        return ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) ? this.f11695z ? this.f11674e.left : this.f11674e.right - m26821c() : this.f11695z ? this.f11674e.right - m26821c() : this.f11674e.left;
    }

    /* renamed from: r */
    private float m26796r(RectF rectF, int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (i / 2.0f) + (m26821c() / 2.0f);
        }
        return ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) ? this.f11695z ? rectF.left + m26821c() : this.f11674e.right : this.f11695z ? this.f11674e.right : rectF.left + m26821c();
    }

    /* renamed from: u */
    private int m26793u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f11648F;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    /* renamed from: v */
    private int m26792v() {
        return m26793u(this.f11680k);
    }

    /* renamed from: A */
    public int m26851A() {
        return this.f11670a0;
    }

    /* renamed from: B */
    public CharSequence m26850B() {
        return this.f11693x;
    }

    /* renamed from: H */
    public final boolean m26844H() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f11681l;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f11680k) != null && colorStateList.isStateful());
    }

    /* renamed from: J */
    void m26842J() {
        this.f11671b = this.f11674e.width() > 0 && this.f11674e.height() > 0 && this.f11673d.width() > 0 && this.f11673d.height() > 0;
    }

    /* renamed from: K */
    public void m26841K() {
        if (this.f11669a.getHeight() <= 0 || this.f11669a.getWidth() <= 0) {
            return;
        }
        m26823b();
        m26819d();
    }

    /* renamed from: M */
    public void m26839M(int i, int i2, int i3, int i4) {
        if (m26840L(this.f11674e, i, i2, i3, i4)) {
            return;
        }
        this.f11674e.set(i, i2, i3, i4);
        this.f11649G = true;
        m26842J();
    }

    /* renamed from: N */
    public void m26838N(Rect rect) {
        m26839M(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: O */
    public void m26837O(int i) {
        C9322d c9322d = new C9322d(this.f11669a.getContext(), i);
        ColorStateList colorStateList = c9322d.f21904a;
        if (colorStateList != null) {
            this.f11681l = colorStateList;
        }
        float f = c9322d.f21916m;
        if (f != 0.0f) {
            this.f11679j = f;
        }
        ColorStateList colorStateList2 = c9322d.f21907d;
        if (colorStateList2 != null) {
            this.f11657O = colorStateList2;
        }
        this.f11655M = c9322d.f21911h;
        this.f11656N = c9322d.f21912i;
        this.f11654L = c9322d.f21913j;
        this.f11662T = c9322d.f21915l;
        C9318a c9318a = this.f11692w;
        if (c9318a != null) {
            c9318a.m15060c();
        }
        this.f11692w = new C9318a(new C4658a(), c9322d.m15041e());
        c9322d.m15038h(this.f11669a.getContext(), this.f11692w);
        m26841K();
    }

    /* renamed from: Q */
    public void m26835Q(ColorStateList colorStateList) {
        if (this.f11681l != colorStateList) {
            this.f11681l = colorStateList;
            m26841K();
        }
    }

    /* renamed from: R */
    public void m26834R(int i) {
        if (this.f11677h != i) {
            this.f11677h = i;
            m26841K();
        }
    }

    /* renamed from: S */
    public void m26833S(Typeface typeface) {
        if (m26832T(typeface)) {
            m26841K();
        }
    }

    /* renamed from: U */
    public void m26831U(int i, int i2, int i3, int i4) {
        if (m26840L(this.f11673d, i, i2, i3, i4)) {
            return;
        }
        this.f11673d.set(i, i2, i3, i4);
        this.f11649G = true;
        m26842J();
    }

    /* renamed from: V */
    public void m26830V(Rect rect) {
        m26831U(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: W */
    public void m26829W(int i) {
        C9322d c9322d = new C9322d(this.f11669a.getContext(), i);
        ColorStateList colorStateList = c9322d.f21904a;
        if (colorStateList != null) {
            this.f11680k = colorStateList;
        }
        float f = c9322d.f21916m;
        if (f != 0.0f) {
            this.f11678i = f;
        }
        ColorStateList colorStateList2 = c9322d.f21907d;
        if (colorStateList2 != null) {
            this.f11661S = colorStateList2;
        }
        this.f11659Q = c9322d.f21911h;
        this.f11660R = c9322d.f21912i;
        this.f11658P = c9322d.f21913j;
        this.f11663U = c9322d.f21915l;
        C9318a c9318a = this.f11691v;
        if (c9318a != null) {
            c9318a.m15060c();
        }
        this.f11691v = new C9318a(new C4659b(), c9322d.m15041e());
        c9322d.m15038h(this.f11669a.getContext(), this.f11691v);
        m26841K();
    }

    /* renamed from: Y */
    public void m26827Y(ColorStateList colorStateList) {
        if (this.f11680k != colorStateList) {
            this.f11680k = colorStateList;
            m26841K();
        }
    }

    /* renamed from: Z */
    public void m26826Z(int i) {
        if (this.f11676g != i) {
            this.f11676g = i;
            m26841K();
        }
    }

    /* renamed from: a0 */
    public void m26824a0(float f) {
        if (this.f11678i != f) {
            this.f11678i = f;
            m26841K();
        }
    }

    /* renamed from: b0 */
    public void m26822b0(Typeface typeface) {
        if (m26820c0(typeface)) {
            m26841K();
        }
    }

    /* renamed from: c */
    public float m26821c() {
        if (this.f11693x == null) {
            return 0.0f;
        }
        m26849C(this.f11651I);
        TextPaint textPaint = this.f11651I;
        CharSequence charSequence = this.f11693x;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: d0 */
    public void m26818d0(float f) {
        float m17972a = C7628a.m17972a(f, 0.0f, 1.0f);
        if (m17972a != this.f11672c) {
            this.f11672c = m17972a;
            m26819d();
        }
    }

    /* renamed from: f0 */
    public void m26814f0(int i) {
        if (i != this.f11670a0) {
            this.f11670a0 = i;
            m26811h();
            m26841K();
        }
    }

    /* renamed from: g0 */
    public void m26812g0(TimeInterpolator timeInterpolator) {
        this.f11652J = timeInterpolator;
        m26841K();
    }

    /* renamed from: h0 */
    public final boolean m26810h0(int[] iArr) {
        this.f11648F = iArr;
        if (m26844H()) {
            m26841K();
            return true;
        }
        return false;
    }

    /* renamed from: i0 */
    public void m26808i0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f11693x, charSequence)) {
            this.f11693x = charSequence;
            this.f11694y = null;
            m26811h();
            m26841K();
        }
    }

    /* renamed from: j */
    public void m26807j(Canvas canvas) {
        int save = canvas.save();
        if (this.f11694y == null || !this.f11671b) {
            return;
        }
        boolean z = false;
        float lineLeft = (this.f11686q + this.f11664V.getLineLeft(0)) - (this.f11667Y * 2.0f);
        this.f11650H.setTextSize(this.f11647E);
        float f = this.f11686q;
        float f2 = this.f11687r;
        if (this.f11643A && this.f11644B != null) {
            z = true;
        }
        float f3 = this.f11646D;
        if (f3 != 1.0f) {
            canvas.scale(f3, f3, f, f2);
        }
        if (z) {
            canvas.drawBitmap(this.f11644B, f, f2, this.f11645C);
            canvas.restoreToCount(save);
            return;
        }
        if (m26802l0()) {
            m26805k(canvas, lineLeft, f2);
        } else {
            canvas.translate(f, f2);
            this.f11664V.draw(canvas);
        }
        canvas.restoreToCount(save);
    }

    /* renamed from: j0 */
    public void m26806j0(TimeInterpolator timeInterpolator) {
        this.f11653K = timeInterpolator;
        m26841K();
    }

    /* renamed from: k0 */
    public void m26804k0(Typeface typeface) {
        boolean m26832T = m26832T(typeface);
        boolean m26820c0 = m26820c0(typeface);
        if (m26832T || m26820c0) {
            m26841K();
        }
    }

    /* renamed from: m */
    public void m26801m(RectF rectF, int i, int i2) {
        this.f11695z = m26817e(this.f11693x);
        rectF.left = m26797q(i, i2);
        rectF.top = this.f11674e.top;
        rectF.right = m26796r(rectF, i, i2);
        rectF.bottom = this.f11674e.top + m26798p();
    }

    /* renamed from: n */
    public ColorStateList m26800n() {
        return this.f11681l;
    }

    /* renamed from: o */
    public int m26799o() {
        return this.f11677h;
    }

    /* renamed from: p */
    public float m26798p() {
        m26849C(this.f11651I);
        return -this.f11651I.ascent();
    }

    /* renamed from: s */
    public Typeface m26795s() {
        Typeface typeface = this.f11688s;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    /* renamed from: t */
    public int m26794t() {
        return m26793u(this.f11681l);
    }

    /* renamed from: w */
    public int m26791w() {
        return this.f11676g;
    }

    /* renamed from: x */
    public float m26790x() {
        m26848D(this.f11651I);
        return -this.f11651I.ascent();
    }

    /* renamed from: y */
    public Typeface m26789y() {
        Typeface typeface = this.f11689t;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    /* renamed from: z */
    public float m26788z() {
        return this.f11672c;
    }
}

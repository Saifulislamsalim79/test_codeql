package p272h.p286c.p287a.p323c.p326c0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.graphics.drawable.InterfaceC1366b;
import java.util.BitSet;
import p201g.p227h.p237k.C7670c;
import p272h.p286c.p287a.p323c.C9233b;
import p272h.p286c.p287a.p323c.p325b0.C9234a;
import p272h.p286c.p287a.p323c.p326c0.C9250k;
import p272h.p286c.p287a.p323c.p326c0.C9254l;
import p272h.p286c.p287a.p323c.p326c0.C9258m;
import p272h.p286c.p287a.p323c.p335s.C9310a;
import p272h.p286c.p287a.p323c.p338v.C9313a;
/* compiled from: MaterialShapeDrawable.java */
/* renamed from: h.c.a.c.c0.g */
/* loaded from: classes2.dex */
public class C9243g extends Drawable implements InterfaceC1366b, InterfaceC9266n {

    /* renamed from: O */
    private static final String f21666O = C9243g.class.getSimpleName();

    /* renamed from: P */
    private static final Paint f21667P = new Paint(1);

    /* renamed from: A */
    private final RectF f21668A;

    /* renamed from: B */
    private final RectF f21669B;

    /* renamed from: C */
    private final Region f21670C;

    /* renamed from: D */
    private final Region f21671D;

    /* renamed from: E */
    private C9250k f21672E;

    /* renamed from: F */
    private final Paint f21673F;

    /* renamed from: G */
    private final Paint f21674G;

    /* renamed from: H */
    private final C9234a f21675H;

    /* renamed from: I */
    private final C9254l.InterfaceC9256b f21676I;

    /* renamed from: J */
    private final C9254l f21677J;

    /* renamed from: K */
    private PorterDuffColorFilter f21678K;

    /* renamed from: L */
    private PorterDuffColorFilter f21679L;

    /* renamed from: M */
    private final RectF f21680M;

    /* renamed from: N */
    private boolean f21681N;

    /* renamed from: c */
    private C9246c f21682c;

    /* renamed from: d */
    private final C9258m.AbstractC9265g[] f21683d;

    /* renamed from: e */
    private final C9258m.AbstractC9265g[] f21684e;

    /* renamed from: f */
    private final BitSet f21685f;

    /* renamed from: w */
    private boolean f21686w;

    /* renamed from: x */
    private final Matrix f21687x;

    /* renamed from: y */
    private final Path f21688y;

    /* renamed from: z */
    private final Path f21689z;

    /* compiled from: MaterialShapeDrawable.java */
    /* renamed from: h.c.a.c.c0.g$a */
    /* loaded from: classes2.dex */
    class C9244a implements C9254l.InterfaceC9256b {
        C9244a() {
        }

        @Override // p272h.p286c.p287a.p323c.p326c0.C9254l.InterfaceC9256b
        /* renamed from: a */
        public void mo15291a(C9258m c9258m, Matrix matrix, int i) {
            C9243g.this.f21685f.set(i, c9258m.m15285e());
            C9243g.this.f21683d[i] = c9258m.m15284f(matrix);
        }

        @Override // p272h.p286c.p287a.p323c.p326c0.C9254l.InterfaceC9256b
        /* renamed from: b */
        public void mo15290b(C9258m c9258m, Matrix matrix, int i) {
            C9243g.this.f21685f.set(i + 4, c9258m.m15285e());
            C9243g.this.f21684e[i] = c9258m.m15284f(matrix);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialShapeDrawable.java */
    /* renamed from: h.c.a.c.c0.g$b */
    /* loaded from: classes2.dex */
    public class C9245b implements C9250k.InterfaceC9253c {

        /* renamed from: a */
        final /* synthetic */ float f21691a;

        C9245b(C9243g c9243g, float f) {
            this.f21691a = f;
        }

        @Override // p272h.p286c.p287a.p323c.p326c0.C9250k.InterfaceC9253c
        /* renamed from: a */
        public InterfaceC9239c mo15306a(InterfaceC9239c interfaceC9239c) {
            return interfaceC9239c instanceof C9248i ? interfaceC9239c : new C9238b(this.f21691a, interfaceC9239c);
        }
    }

    /* synthetic */ C9243g(C9246c c9246c, C9244a c9244a) {
        this(c9246c);
    }

    /* renamed from: D */
    private float m15429D() {
        if (m15421L()) {
            return this.f21674G.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: J */
    private boolean m15423J() {
        C9246c c9246c = this.f21682c;
        int i = c9246c.f21708q;
        return i != 1 && c9246c.f21709r > 0 && (i == 2 || m15413T());
    }

    /* renamed from: K */
    private boolean m15422K() {
        Paint.Style style = this.f21682c.f21713v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    /* renamed from: L */
    private boolean m15421L() {
        Paint.Style style = this.f21682c.f21713v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f21674G.getStrokeWidth() > 0.0f;
    }

    /* renamed from: N */
    private void m15419N() {
        super.invalidateSelf();
    }

    /* renamed from: Q */
    private void m15416Q(Canvas canvas) {
        if (m15423J()) {
            canvas.save();
            m15414S(canvas);
            if (!this.f21681N) {
                m15384n(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.f21680M.width() - getBounds().width());
            int height = (int) (this.f21680M.height() - getBounds().height());
            if (width >= 0 && height >= 0) {
                Bitmap createBitmap = Bitmap.createBitmap(((int) this.f21680M.width()) + (this.f21682c.f21709r * 2) + width, ((int) this.f21680M.height()) + (this.f21682c.f21709r * 2) + height, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                float f = (getBounds().left - this.f21682c.f21709r) - width;
                float f2 = (getBounds().top - this.f21682c.f21709r) - height;
                canvas2.translate(-f, -f2);
                m15384n(canvas2);
                canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
                createBitmap.recycle();
                canvas.restore();
                return;
            }
            throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
        }
    }

    /* renamed from: R */
    private static int m15415R(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    /* renamed from: S */
    private void m15414S(Canvas canvas) {
        int m15372z = m15372z();
        int m15432A = m15432A();
        if (Build.VERSION.SDK_INT < 21 && this.f21681N) {
            Rect clipBounds = canvas.getClipBounds();
            int i = this.f21682c.f21709r;
            clipBounds.inset(-i, -i);
            clipBounds.offset(m15372z, m15432A);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate(m15372z, m15432A);
    }

    /* renamed from: f */
    private PorterDuffColorFilter m15397f(Paint paint, boolean z) {
        int color;
        int m15386l;
        if (!z || (m15386l = m15386l((color = paint.getColor()))) == color) {
            return null;
        }
        return new PorterDuffColorFilter(m15386l, PorterDuff.Mode.SRC_IN);
    }

    /* renamed from: g */
    private void m15395g(RectF rectF, Path path) {
        m15393h(rectF, path);
        if (this.f21682c.f21701j != 1.0f) {
            this.f21687x.reset();
            Matrix matrix = this.f21687x;
            float f = this.f21682c.f21701j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f21687x);
        }
        path.computeBounds(this.f21680M, true);
    }

    /* renamed from: h0 */
    private boolean m15392h0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f21682c.f21695d == null || color2 == (colorForState2 = this.f21682c.f21695d.getColorForState(iArr, (color2 = this.f21673F.getColor())))) {
            z = false;
        } else {
            this.f21673F.setColor(colorForState2);
            z = true;
        }
        if (this.f21682c.f21696e == null || color == (colorForState = this.f21682c.f21696e.getColorForState(iArr, (color = this.f21674G.getColor())))) {
            return z;
        }
        this.f21674G.setColor(colorForState);
        return true;
    }

    /* renamed from: i */
    private void m15391i() {
        C9250k m15339y = m15430C().m15339y(new C9245b(this, -m15429D()));
        this.f21672E = m15339y;
        this.f21677J.m15302d(m15339y, this.f21682c.f21702k, m15376v(), this.f21689z);
    }

    /* renamed from: i0 */
    private boolean m15390i0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f21678K;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f21679L;
        C9246c c9246c = this.f21682c;
        this.f21678K = m15387k(c9246c.f21698g, c9246c.f21699h, this.f21673F, true);
        C9246c c9246c2 = this.f21682c;
        this.f21679L = m15387k(c9246c2.f21697f, c9246c2.f21699h, this.f21674G, false);
        C9246c c9246c3 = this.f21682c;
        if (c9246c3.f21712u) {
            this.f21675H.m15439d(c9246c3.f21698g.getColorForState(getState(), 0));
        }
        return (C7670c.m17875a(porterDuffColorFilter, this.f21678K) && C7670c.m17875a(porterDuffColorFilter2, this.f21679L)) ? false : true;
    }

    /* renamed from: j */
    private PorterDuffColorFilter m15389j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = m15386l(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* renamed from: j0 */
    private void m15388j0() {
        float m15424I = m15424I();
        this.f21682c.f21709r = (int) Math.ceil(0.75f * m15424I);
        this.f21682c.f21710s = (int) Math.ceil(m15424I * 0.25f);
        m15390i0();
        m15419N();
    }

    /* renamed from: k */
    private PorterDuffColorFilter m15387k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList != null && mode != null) {
            return m15389j(colorStateList, mode, z);
        }
        return m15397f(paint, z);
    }

    /* renamed from: m */
    public static C9243g m15385m(Context context, float f) {
        int m15083b = C9310a.m15083b(context, C9233b.colorSurface, C9243g.class.getSimpleName());
        C9243g c9243g = new C9243g();
        c9243g.m15420M(context);
        c9243g.m15409X(ColorStateList.valueOf(m15083b));
        c9243g.m15410W(f);
        return c9243g;
    }

    /* renamed from: n */
    private void m15384n(Canvas canvas) {
        if (this.f21685f.cardinality() > 0) {
            Log.w(f21666O, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f21682c.f21710s != 0) {
            canvas.drawPath(this.f21688y, this.f21675H.m15440c());
        }
        for (int i = 0; i < 4; i++) {
            this.f21683d[i].m15241b(this.f21675H, this.f21682c.f21709r, canvas);
            this.f21684e[i].m15241b(this.f21675H, this.f21682c.f21709r, canvas);
        }
        if (this.f21681N) {
            int m15372z = m15372z();
            int m15432A = m15432A();
            canvas.translate(-m15372z, -m15432A);
            canvas.drawPath(this.f21688y, f21667P);
            canvas.translate(m15372z, m15432A);
        }
    }

    /* renamed from: o */
    private void m15383o(Canvas canvas) {
        m15381q(canvas, this.f21673F, this.f21688y, this.f21682c.f21692a, m15377u());
    }

    /* renamed from: q */
    private void m15381q(Canvas canvas, Paint paint, Path path, C9250k c9250k, RectF rectF) {
        if (c9250k.m15343u(rectF)) {
            float mo15365a = c9250k.m15344t().mo15365a(rectF) * this.f21682c.f21702k;
            canvas.drawRoundRect(rectF, mo15365a, mo15365a, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: r */
    private void m15380r(Canvas canvas) {
        m15381q(canvas, this.f21674G, this.f21689z, this.f21672E, m15376v());
    }

    /* renamed from: v */
    private RectF m15376v() {
        this.f21669B.set(m15377u());
        float m15429D = m15429D();
        this.f21669B.inset(m15429D, m15429D);
        return this.f21669B;
    }

    /* renamed from: A */
    public int m15432A() {
        C9246c c9246c;
        double d = this.f21682c.f21710s;
        double cos = Math.cos(Math.toRadians(c9246c.f21711t));
        Double.isNaN(d);
        return (int) (d * cos);
    }

    /* renamed from: B */
    public int m15431B() {
        return this.f21682c.f21709r;
    }

    /* renamed from: C */
    public C9250k m15430C() {
        return this.f21682c.f21692a;
    }

    /* renamed from: E */
    public ColorStateList m15428E() {
        return this.f21682c.f21698g;
    }

    /* renamed from: F */
    public float m15427F() {
        return this.f21682c.f21692a.m15346r().mo15365a(m15377u());
    }

    /* renamed from: G */
    public float m15426G() {
        return this.f21682c.f21692a.m15344t().mo15365a(m15377u());
    }

    /* renamed from: H */
    public float m15425H() {
        return this.f21682c.f21707p;
    }

    /* renamed from: I */
    public float m15424I() {
        return m15375w() + m15425H();
    }

    /* renamed from: M */
    public void m15420M(Context context) {
        this.f21682c.f21693b = new C9313a(context);
        m15388j0();
    }

    /* renamed from: O */
    public boolean m15418O() {
        C9313a c9313a = this.f21682c.f21693b;
        return c9313a != null && c9313a.m15073d();
    }

    /* renamed from: P */
    public boolean m15417P() {
        return this.f21682c.f21692a.m15343u(m15377u());
    }

    /* renamed from: T */
    public boolean m15413T() {
        return Build.VERSION.SDK_INT < 21 || !(m15417P() || this.f21688y.isConvex() || Build.VERSION.SDK_INT >= 29);
    }

    /* renamed from: U */
    public void m15412U(float f) {
        setShapeAppearanceModel(this.f21682c.f21692a.m15341w(f));
    }

    /* renamed from: V */
    public void m15411V(InterfaceC9239c interfaceC9239c) {
        setShapeAppearanceModel(this.f21682c.f21692a.m15340x(interfaceC9239c));
    }

    /* renamed from: W */
    public void m15410W(float f) {
        C9246c c9246c = this.f21682c;
        if (c9246c.f21706o != f) {
            c9246c.f21706o = f;
            m15388j0();
        }
    }

    /* renamed from: X */
    public void m15409X(ColorStateList colorStateList) {
        C9246c c9246c = this.f21682c;
        if (c9246c.f21695d != colorStateList) {
            c9246c.f21695d = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: Y */
    public void m15408Y(float f) {
        C9246c c9246c = this.f21682c;
        if (c9246c.f21702k != f) {
            c9246c.f21702k = f;
            this.f21686w = true;
            invalidateSelf();
        }
    }

    /* renamed from: Z */
    public void m15407Z(int i, int i2, int i3, int i4) {
        C9246c c9246c = this.f21682c;
        if (c9246c.f21700i == null) {
            c9246c.f21700i = new Rect();
        }
        this.f21682c.f21700i.set(i, i2, i3, i4);
        invalidateSelf();
    }

    /* renamed from: a0 */
    public void m15406a0(float f) {
        C9246c c9246c = this.f21682c;
        if (c9246c.f21705n != f) {
            c9246c.f21705n = f;
            m15388j0();
        }
    }

    /* renamed from: b0 */
    public void m15404b0(int i) {
        this.f21675H.m15439d(i);
        this.f21682c.f21712u = false;
        m15419N();
    }

    /* renamed from: c0 */
    public void m15402c0(int i) {
        C9246c c9246c = this.f21682c;
        if (c9246c.f21711t != i) {
            c9246c.f21711t = i;
            m15419N();
        }
    }

    /* renamed from: d0 */
    public void m15400d0(float f, int i) {
        m15394g0(f);
        m15396f0(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f21673F.setColorFilter(this.f21678K);
        int alpha = this.f21673F.getAlpha();
        this.f21673F.setAlpha(m15415R(alpha, this.f21682c.f21704m));
        this.f21674G.setColorFilter(this.f21679L);
        this.f21674G.setStrokeWidth(this.f21682c.f21703l);
        int alpha2 = this.f21674G.getAlpha();
        this.f21674G.setAlpha(m15415R(alpha2, this.f21682c.f21704m));
        if (this.f21686w) {
            m15391i();
            m15395g(m15377u(), this.f21688y);
            this.f21686w = false;
        }
        m15416Q(canvas);
        if (m15422K()) {
            m15383o(canvas);
        }
        if (m15421L()) {
            m15380r(canvas);
        }
        this.f21673F.setAlpha(alpha);
        this.f21674G.setAlpha(alpha2);
    }

    /* renamed from: e0 */
    public void m15398e0(float f, ColorStateList colorStateList) {
        m15394g0(f);
        m15396f0(colorStateList);
    }

    /* renamed from: f0 */
    public void m15396f0(ColorStateList colorStateList) {
        C9246c c9246c = this.f21682c;
        if (c9246c.f21696e != colorStateList) {
            c9246c.f21696e = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: g0 */
    public void m15394g0(float f) {
        this.f21682c.f21703l = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f21682c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f21682c.f21708q == 2) {
            return;
        }
        if (m15417P()) {
            outline.setRoundRect(getBounds(), m15427F() * this.f21682c.f21702k);
            return;
        }
        m15395g(m15377u(), this.f21688y);
        if (this.f21688y.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.f21688y);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f21682c.f21700i;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f21670C.set(getBounds());
        m15395g(m15377u(), this.f21688y);
        this.f21671D.setPath(this.f21688y, this.f21670C);
        this.f21670C.op(this.f21671D, Region.Op.DIFFERENCE);
        return this.f21670C;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final void m15393h(RectF rectF, Path path) {
        C9254l c9254l = this.f21677J;
        C9246c c9246c = this.f21682c;
        c9254l.m15301e(c9246c.f21692a, c9246c.f21702k, rectF, this.f21676I, path);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f21686w = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f21682c.f21698g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f21682c.f21697f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f21682c.f21696e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f21682c.f21695d) != null && colorStateList4.isStateful())));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public int m15386l(int i) {
        float m15424I = m15424I() + m15373y();
        C9313a c9313a = this.f21682c.f21693b;
        return c9313a != null ? c9313a.m15074c(i, m15424I) : i;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f21682c = new C9246c(this.f21682c);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f21686w = true;
        super.onBoundsChange(rect);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.C4689n.InterfaceC4691b
    public boolean onStateChange(int[] iArr) {
        boolean z = m15392h0(iArr) || m15390i0();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public void m15382p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        m15381q(canvas, paint, path, this.f21682c.f21692a, rectF);
    }

    /* renamed from: s */
    public float m15379s() {
        return this.f21682c.f21692a.m15354j().mo15365a(m15377u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C9246c c9246c = this.f21682c;
        if (c9246c.f21704m != i) {
            c9246c.f21704m = i;
            m15419N();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f21682c.f21694c = colorFilter;
        m15419N();
    }

    @Override // p272h.p286c.p287a.p323c.p326c0.InterfaceC9266n
    public void setShapeAppearanceModel(C9250k c9250k) {
        this.f21682c.f21692a = c9250k;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC1366b
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC1366b
    public void setTintList(ColorStateList colorStateList) {
        this.f21682c.f21698g = colorStateList;
        m15390i0();
        m15419N();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC1366b
    public void setTintMode(PorterDuff.Mode mode) {
        C9246c c9246c = this.f21682c;
        if (c9246c.f21699h != mode) {
            c9246c.f21699h = mode;
            m15390i0();
            m15419N();
        }
    }

    /* renamed from: t */
    public float m15378t() {
        return this.f21682c.f21692a.m15352l().mo15365a(m15377u());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public RectF m15377u() {
        this.f21668A.set(getBounds());
        return this.f21668A;
    }

    /* renamed from: w */
    public float m15375w() {
        return this.f21682c.f21706o;
    }

    /* renamed from: x */
    public ColorStateList m15374x() {
        return this.f21682c.f21695d;
    }

    /* renamed from: y */
    public float m15373y() {
        return this.f21682c.f21705n;
    }

    /* renamed from: z */
    public int m15372z() {
        C9246c c9246c;
        double d = this.f21682c.f21710s;
        double sin = Math.sin(Math.toRadians(c9246c.f21711t));
        Double.isNaN(d);
        return (int) (d * sin);
    }

    public C9243g() {
        this(new C9250k());
    }

    public C9243g(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C9250k.m15359e(context, attributeSet, i, i2).m15320m());
    }

    public C9243g(C9250k c9250k) {
        this(new C9246c(c9250k, null));
    }

    private C9243g(C9246c c9246c) {
        this.f21683d = new C9258m.AbstractC9265g[4];
        this.f21684e = new C9258m.AbstractC9265g[4];
        this.f21685f = new BitSet(8);
        this.f21687x = new Matrix();
        this.f21688y = new Path();
        this.f21689z = new Path();
        this.f21668A = new RectF();
        this.f21669B = new RectF();
        this.f21670C = new Region();
        this.f21671D = new Region();
        this.f21673F = new Paint(1);
        this.f21674G = new Paint(1);
        this.f21675H = new C9234a();
        this.f21677J = Looper.getMainLooper().getThread() == Thread.currentThread() ? C9254l.m15295k() : new C9254l();
        this.f21680M = new RectF();
        this.f21681N = true;
        this.f21682c = c9246c;
        this.f21674G.setStyle(Paint.Style.STROKE);
        this.f21673F.setStyle(Paint.Style.FILL);
        f21667P.setColor(-1);
        f21667P.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        m15390i0();
        m15392h0(getState());
        this.f21676I = new C9244a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialShapeDrawable.java */
    /* renamed from: h.c.a.c.c0.g$c */
    /* loaded from: classes2.dex */
    public static final class C9246c extends Drawable.ConstantState {

        /* renamed from: a */
        public C9250k f21692a;

        /* renamed from: b */
        public C9313a f21693b;

        /* renamed from: c */
        public ColorFilter f21694c;

        /* renamed from: d */
        public ColorStateList f21695d;

        /* renamed from: e */
        public ColorStateList f21696e;

        /* renamed from: f */
        public ColorStateList f21697f;

        /* renamed from: g */
        public ColorStateList f21698g;

        /* renamed from: h */
        public PorterDuff.Mode f21699h;

        /* renamed from: i */
        public Rect f21700i;

        /* renamed from: j */
        public float f21701j;

        /* renamed from: k */
        public float f21702k;

        /* renamed from: l */
        public float f21703l;

        /* renamed from: m */
        public int f21704m;

        /* renamed from: n */
        public float f21705n;

        /* renamed from: o */
        public float f21706o;

        /* renamed from: p */
        public float f21707p;

        /* renamed from: q */
        public int f21708q;

        /* renamed from: r */
        public int f21709r;

        /* renamed from: s */
        public int f21710s;

        /* renamed from: t */
        public int f21711t;

        /* renamed from: u */
        public boolean f21712u;

        /* renamed from: v */
        public Paint.Style f21713v;

        public C9246c(C9250k c9250k, C9313a c9313a) {
            this.f21695d = null;
            this.f21696e = null;
            this.f21697f = null;
            this.f21698g = null;
            this.f21699h = PorterDuff.Mode.SRC_IN;
            this.f21700i = null;
            this.f21701j = 1.0f;
            this.f21702k = 1.0f;
            this.f21704m = 255;
            this.f21705n = 0.0f;
            this.f21706o = 0.0f;
            this.f21707p = 0.0f;
            this.f21708q = 0;
            this.f21709r = 0;
            this.f21710s = 0;
            this.f21711t = 0;
            this.f21712u = false;
            this.f21713v = Paint.Style.FILL_AND_STROKE;
            this.f21692a = c9250k;
            this.f21693b = c9313a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C9243g c9243g = new C9243g(this, null);
            c9243g.f21686w = true;
            return c9243g;
        }

        public C9246c(C9246c c9246c) {
            this.f21695d = null;
            this.f21696e = null;
            this.f21697f = null;
            this.f21698g = null;
            this.f21699h = PorterDuff.Mode.SRC_IN;
            this.f21700i = null;
            this.f21701j = 1.0f;
            this.f21702k = 1.0f;
            this.f21704m = 255;
            this.f21705n = 0.0f;
            this.f21706o = 0.0f;
            this.f21707p = 0.0f;
            this.f21708q = 0;
            this.f21709r = 0;
            this.f21710s = 0;
            this.f21711t = 0;
            this.f21712u = false;
            this.f21713v = Paint.Style.FILL_AND_STROKE;
            this.f21692a = c9246c.f21692a;
            this.f21693b = c9246c.f21693b;
            this.f21703l = c9246c.f21703l;
            this.f21694c = c9246c.f21694c;
            this.f21695d = c9246c.f21695d;
            this.f21696e = c9246c.f21696e;
            this.f21699h = c9246c.f21699h;
            this.f21698g = c9246c.f21698g;
            this.f21704m = c9246c.f21704m;
            this.f21701j = c9246c.f21701j;
            this.f21710s = c9246c.f21710s;
            this.f21708q = c9246c.f21708q;
            this.f21712u = c9246c.f21712u;
            this.f21702k = c9246c.f21702k;
            this.f21705n = c9246c.f21705n;
            this.f21706o = c9246c.f21706o;
            this.f21707p = c9246c.f21707p;
            this.f21709r = c9246c.f21709r;
            this.f21711t = c9246c.f21711t;
            this.f21697f = c9246c.f21697f;
            this.f21713v = c9246c.f21713v;
            if (c9246c.f21700i != null) {
                this.f21700i = new Rect(c9246c.f21700i);
            }
        }
    }
}

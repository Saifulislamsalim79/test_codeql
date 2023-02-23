package p272h.p286c.p287a.p323c.p326c0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
/* compiled from: ShapeAppearancePathProvider.java */
/* renamed from: h.c.a.c.c0.l */
/* loaded from: classes2.dex */
public class C9254l {

    /* renamed from: a */
    private final C9258m[] f21741a = new C9258m[4];

    /* renamed from: b */
    private final Matrix[] f21742b = new Matrix[4];

    /* renamed from: c */
    private final Matrix[] f21743c = new Matrix[4];

    /* renamed from: d */
    private final PointF f21744d = new PointF();

    /* renamed from: e */
    private final Path f21745e = new Path();

    /* renamed from: f */
    private final Path f21746f = new Path();

    /* renamed from: g */
    private final C9258m f21747g = new C9258m();

    /* renamed from: h */
    private final float[] f21748h = new float[2];

    /* renamed from: i */
    private final float[] f21749i = new float[2];

    /* renamed from: j */
    private final Path f21750j = new Path();

    /* renamed from: k */
    private final Path f21751k = new Path();

    /* renamed from: l */
    private boolean f21752l = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ShapeAppearancePathProvider.java */
    /* renamed from: h.c.a.c.c0.l$a */
    /* loaded from: classes2.dex */
    public static class C9255a {

        /* renamed from: a */
        static final C9254l f21753a = new C9254l();
    }

    /* compiled from: ShapeAppearancePathProvider.java */
    /* renamed from: h.c.a.c.c0.l$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC9256b {
        /* renamed from: a */
        void mo15291a(C9258m c9258m, Matrix matrix, int i);

        /* renamed from: b */
        void mo15290b(C9258m c9258m, Matrix matrix, int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShapeAppearancePathProvider.java */
    /* renamed from: h.c.a.c.c0.l$c */
    /* loaded from: classes2.dex */
    public static final class C9257c {

        /* renamed from: a */
        public final C9250k f21754a;

        /* renamed from: b */
        public final Path f21755b;

        /* renamed from: c */
        public final RectF f21756c;

        /* renamed from: d */
        public final InterfaceC9256b f21757d;

        /* renamed from: e */
        public final float f21758e;

        C9257c(C9250k c9250k, float f, RectF rectF, InterfaceC9256b interfaceC9256b, Path path) {
            this.f21757d = interfaceC9256b;
            this.f21754a = c9250k;
            this.f21758e = f;
            this.f21756c = rectF;
            this.f21755b = path;
        }
    }

    public C9254l() {
        for (int i = 0; i < 4; i++) {
            this.f21741a[i] = new C9258m();
            this.f21742b[i] = new Matrix();
            this.f21743c[i] = new Matrix();
        }
    }

    /* renamed from: a */
    private float m15305a(int i) {
        return (i + 1) * 90;
    }

    /* renamed from: b */
    private void m15304b(C9257c c9257c, int i) {
        this.f21748h[0] = this.f21741a[i].m15279k();
        this.f21748h[1] = this.f21741a[i].m15278l();
        this.f21742b[i].mapPoints(this.f21748h);
        if (i == 0) {
            Path path = c9257c.f21755b;
            float[] fArr = this.f21748h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = c9257c.f21755b;
            float[] fArr2 = this.f21748h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f21741a[i].m15286d(this.f21742b[i], c9257c.f21755b);
        InterfaceC9256b interfaceC9256b = c9257c.f21757d;
        if (interfaceC9256b != null) {
            interfaceC9256b.mo15291a(this.f21741a[i], this.f21742b[i], i);
        }
    }

    /* renamed from: c */
    private void m15303c(C9257c c9257c, int i) {
        int i2 = (i + 1) % 4;
        this.f21748h[0] = this.f21741a[i].m15281i();
        this.f21748h[1] = this.f21741a[i].m15280j();
        this.f21742b[i].mapPoints(this.f21748h);
        this.f21749i[0] = this.f21741a[i2].m15279k();
        this.f21749i[1] = this.f21741a[i2].m15278l();
        this.f21742b[i2].mapPoints(this.f21749i);
        float[] fArr = this.f21748h;
        float f = fArr[0];
        float[] fArr2 = this.f21749i;
        float max = Math.max(((float) Math.hypot(f - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float m15297i = m15297i(c9257c.f21756c, i);
        this.f21747g.m15276n(0.0f, 0.0f);
        C9242f m15296j = m15296j(i, c9257c.f21754a);
        m15296j.mo15433b(max, m15297i, c9257c.f21758e, this.f21747g);
        this.f21750j.reset();
        this.f21747g.m15286d(this.f21743c[i], this.f21750j);
        if (this.f21752l && Build.VERSION.SDK_INT >= 19 && (m15296j.m15434a() || m15294l(this.f21750j, i) || m15294l(this.f21750j, i2))) {
            Path path = this.f21750j;
            path.op(path, this.f21746f, Path.Op.DIFFERENCE);
            this.f21748h[0] = this.f21747g.m15279k();
            this.f21748h[1] = this.f21747g.m15278l();
            this.f21743c[i].mapPoints(this.f21748h);
            Path path2 = this.f21745e;
            float[] fArr3 = this.f21748h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f21747g.m15286d(this.f21743c[i], this.f21745e);
        } else {
            this.f21747g.m15286d(this.f21743c[i], c9257c.f21755b);
        }
        InterfaceC9256b interfaceC9256b = c9257c.f21757d;
        if (interfaceC9256b != null) {
            interfaceC9256b.mo15290b(this.f21747g, this.f21743c[i], i);
        }
    }

    /* renamed from: f */
    private void m15300f(int i, RectF rectF, PointF pointF) {
        if (i == 1) {
            pointF.set(rectF.right, rectF.bottom);
        } else if (i == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    /* renamed from: g */
    private InterfaceC9239c m15299g(int i, C9250k c9250k) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return c9250k.m15344t();
                }
                return c9250k.m15346r();
            }
            return c9250k.m15354j();
        }
        return c9250k.m15352l();
    }

    /* renamed from: h */
    private C9240d m15298h(int i, C9250k c9250k) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return c9250k.m15345s();
                }
                return c9250k.m15347q();
            }
            return c9250k.m15355i();
        }
        return c9250k.m15353k();
    }

    /* renamed from: i */
    private float m15297i(RectF rectF, int i) {
        float[] fArr = this.f21748h;
        C9258m[] c9258mArr = this.f21741a;
        fArr[0] = c9258mArr[i].f21761c;
        fArr[1] = c9258mArr[i].f21762d;
        this.f21742b[i].mapPoints(fArr);
        if (i != 1 && i != 3) {
            return Math.abs(rectF.centerY() - this.f21748h[1]);
        }
        return Math.abs(rectF.centerX() - this.f21748h[0]);
    }

    /* renamed from: j */
    private C9242f m15296j(int i, C9250k c9250k) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return c9250k.m15349o();
                }
                return c9250k.m15348p();
            }
            return c9250k.m15350n();
        }
        return c9250k.m15356h();
    }

    /* renamed from: k */
    public static C9254l m15295k() {
        return C9255a.f21753a;
    }

    /* renamed from: l */
    private boolean m15294l(Path path, int i) {
        this.f21751k.reset();
        this.f21741a[i].m15286d(this.f21742b[i], this.f21751k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f21751k.computeBounds(rectF, true);
        path.op(this.f21751k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    /* renamed from: m */
    private void m15293m(C9257c c9257c, int i) {
        m15298h(i, c9257c.f21754a).m15435b(this.f21741a[i], 90.0f, c9257c.f21758e, c9257c.f21756c, m15299g(i, c9257c.f21754a));
        float m15305a = m15305a(i);
        this.f21742b[i].reset();
        m15300f(i, c9257c.f21756c, this.f21744d);
        Matrix matrix = this.f21742b[i];
        PointF pointF = this.f21744d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f21742b[i].preRotate(m15305a);
    }

    /* renamed from: n */
    private void m15292n(int i) {
        this.f21748h[0] = this.f21741a[i].m15281i();
        this.f21748h[1] = this.f21741a[i].m15280j();
        this.f21742b[i].mapPoints(this.f21748h);
        float m15305a = m15305a(i);
        this.f21743c[i].reset();
        Matrix matrix = this.f21743c[i];
        float[] fArr = this.f21748h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f21743c[i].preRotate(m15305a);
    }

    /* renamed from: d */
    public void m15302d(C9250k c9250k, float f, RectF rectF, Path path) {
        m15301e(c9250k, f, rectF, null, path);
    }

    /* renamed from: e */
    public void m15301e(C9250k c9250k, float f, RectF rectF, InterfaceC9256b interfaceC9256b, Path path) {
        path.rewind();
        this.f21745e.rewind();
        this.f21746f.rewind();
        this.f21746f.addRect(rectF, Path.Direction.CW);
        C9257c c9257c = new C9257c(c9250k, f, rectF, interfaceC9256b, path);
        for (int i = 0; i < 4; i++) {
            m15293m(c9257c, i);
            m15292n(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            m15304b(c9257c, i2);
            m15303c(c9257c, i2);
        }
        path.close();
        this.f21745e.close();
        if (Build.VERSION.SDK_INT < 19 || this.f21745e.isEmpty()) {
            return;
        }
        path.op(this.f21745e, Path.Op.UNION);
    }
}

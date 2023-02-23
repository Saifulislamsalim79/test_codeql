package p272h.p286c.p287a.p323c.p326c0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p272h.p286c.p287a.p323c.p325b0.C9234a;
/* compiled from: ShapePath.java */
/* renamed from: h.c.a.c.c0.m */
/* loaded from: classes2.dex */
public class C9258m {
    @Deprecated

    /* renamed from: a */
    public float f21759a;
    @Deprecated

    /* renamed from: b */
    public float f21760b;
    @Deprecated

    /* renamed from: c */
    public float f21761c;
    @Deprecated

    /* renamed from: d */
    public float f21762d;
    @Deprecated

    /* renamed from: e */
    public float f21763e;
    @Deprecated

    /* renamed from: f */
    public float f21764f;

    /* renamed from: g */
    private final List<AbstractC9264f> f21765g = new ArrayList();

    /* renamed from: h */
    private final List<AbstractC9265g> f21766h = new ArrayList();

    /* renamed from: i */
    private boolean f21767i;

    /* compiled from: ShapePath.java */
    /* renamed from: h.c.a.c.c0.m$a */
    /* loaded from: classes2.dex */
    class C9259a extends AbstractC9265g {

        /* renamed from: b */
        final /* synthetic */ List f21768b;

        /* renamed from: c */
        final /* synthetic */ Matrix f21769c;

        C9259a(C9258m c9258m, List list, Matrix matrix) {
            this.f21768b = list;
            this.f21769c = matrix;
        }

        @Override // p272h.p286c.p287a.p323c.p326c0.C9258m.AbstractC9265g
        /* renamed from: a */
        public void mo15242a(Matrix matrix, C9234a c9234a, int i, Canvas canvas) {
            for (AbstractC9265g abstractC9265g : this.f21768b) {
                abstractC9265g.mo15242a(this.f21769c, c9234a, i, canvas);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShapePath.java */
    /* renamed from: h.c.a.c.c0.m$b */
    /* loaded from: classes2.dex */
    public static class C9260b extends AbstractC9265g {

        /* renamed from: b */
        private final C9262d f21770b;

        public C9260b(C9262d c9262d) {
            this.f21770b = c9262d;
        }

        @Override // p272h.p286c.p287a.p323c.p326c0.C9258m.AbstractC9265g
        /* renamed from: a */
        public void mo15242a(Matrix matrix, C9234a c9234a, int i, Canvas canvas) {
            c9234a.m15442a(canvas, matrix, new RectF(this.f21770b.m15258k(), this.f21770b.m15254o(), this.f21770b.m15257l(), this.f21770b.m15259j()), i, this.f21770b.m15256m(), this.f21770b.m15255n());
        }
    }

    /* compiled from: ShapePath.java */
    /* renamed from: h.c.a.c.c0.m$c */
    /* loaded from: classes2.dex */
    static class C9261c extends AbstractC9265g {

        /* renamed from: b */
        private final C9263e f21771b;

        /* renamed from: c */
        private final float f21772c;

        /* renamed from: d */
        private final float f21773d;

        public C9261c(C9263e c9263e, float f, float f2) {
            this.f21771b = c9263e;
            this.f21772c = f;
            this.f21773d = f2;
        }

        @Override // p272h.p286c.p287a.p323c.p326c0.C9258m.AbstractC9265g
        /* renamed from: a */
        public void mo15242a(Matrix matrix, C9234a c9234a, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f21771b.f21782c - this.f21773d, this.f21771b.f21781b - this.f21772c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f21772c, this.f21773d);
            matrix2.preRotate(m15268c());
            c9234a.m15441b(canvas, matrix2, rectF, i);
        }

        /* renamed from: c */
        float m15268c() {
            return (float) Math.toDegrees(Math.atan((this.f21771b.f21782c - this.f21773d) / (this.f21771b.f21781b - this.f21772c)));
        }
    }

    /* compiled from: ShapePath.java */
    /* renamed from: h.c.a.c.c0.m$d */
    /* loaded from: classes2.dex */
    public static class C9262d extends AbstractC9264f {

        /* renamed from: h */
        private static final RectF f21774h = new RectF();
        @Deprecated

        /* renamed from: b */
        public float f21775b;
        @Deprecated

        /* renamed from: c */
        public float f21776c;
        @Deprecated

        /* renamed from: d */
        public float f21777d;
        @Deprecated

        /* renamed from: e */
        public float f21778e;
        @Deprecated

        /* renamed from: f */
        public float f21779f;
        @Deprecated

        /* renamed from: g */
        public float f21780g;

        public C9262d(float f, float f2, float f3, float f4) {
            m15252q(f);
            m15248u(f2);
            m15251r(f3);
            m15253p(f4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public float m15259j() {
            return this.f21778e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public float m15258k() {
            return this.f21775b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public float m15257l() {
            return this.f21777d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public float m15256m() {
            return this.f21779f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public float m15255n() {
            return this.f21780g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public float m15254o() {
            return this.f21776c;
        }

        /* renamed from: p */
        private void m15253p(float f) {
            this.f21778e = f;
        }

        /* renamed from: q */
        private void m15252q(float f) {
            this.f21775b = f;
        }

        /* renamed from: r */
        private void m15251r(float f) {
            this.f21777d = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public void m15250s(float f) {
            this.f21779f = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public void m15249t(float f) {
            this.f21780g = f;
        }

        /* renamed from: u */
        private void m15248u(float f) {
            this.f21776c = f;
        }

        @Override // p272h.p286c.p287a.p323c.p326c0.C9258m.AbstractC9264f
        /* renamed from: a */
        public void mo15243a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f21783a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            f21774h.set(m15258k(), m15254o(), m15257l(), m15259j());
            path.arcTo(f21774h, m15256m(), m15255n(), false);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    /* renamed from: h.c.a.c.c0.m$e */
    /* loaded from: classes2.dex */
    public static class C9263e extends AbstractC9264f {

        /* renamed from: b */
        private float f21781b;

        /* renamed from: c */
        private float f21782c;

        @Override // p272h.p286c.p287a.p323c.p326c0.C9258m.AbstractC9264f
        /* renamed from: a */
        public void mo15243a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f21783a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f21781b, this.f21782c);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    /* renamed from: h.c.a.c.c0.m$f */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC9264f {

        /* renamed from: a */
        protected final Matrix f21783a = new Matrix();

        /* renamed from: a */
        public abstract void mo15243a(Matrix matrix, Path path);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShapePath.java */
    /* renamed from: h.c.a.c.c0.m$g */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC9265g {

        /* renamed from: a */
        static final Matrix f21784a = new Matrix();

        AbstractC9265g() {
        }

        /* renamed from: a */
        public abstract void mo15242a(Matrix matrix, C9234a c9234a, int i, Canvas canvas);

        /* renamed from: b */
        public final void m15241b(C9234a c9234a, int i, Canvas canvas) {
            mo15242a(f21784a, c9234a, i, canvas);
        }
    }

    public C9258m() {
        m15276n(0.0f, 0.0f);
    }

    /* renamed from: b */
    private void m15288b(float f) {
        if (m15283g() == f) {
            return;
        }
        float m15283g = ((f - m15283g()) + 360.0f) % 360.0f;
        if (m15283g > 180.0f) {
            return;
        }
        C9262d c9262d = new C9262d(m15281i(), m15280j(), m15281i(), m15280j());
        c9262d.m15250s(m15283g());
        c9262d.m15249t(m15283g);
        this.f21766h.add(new C9260b(c9262d));
        m15274p(f);
    }

    /* renamed from: c */
    private void m15287c(AbstractC9265g abstractC9265g, float f, float f2) {
        m15288b(f);
        this.f21766h.add(abstractC9265g);
        m15274p(f2);
    }

    /* renamed from: g */
    private float m15283g() {
        return this.f21763e;
    }

    /* renamed from: h */
    private float m15282h() {
        return this.f21764f;
    }

    /* renamed from: p */
    private void m15274p(float f) {
        this.f21763e = f;
    }

    /* renamed from: q */
    private void m15273q(float f) {
        this.f21764f = f;
    }

    /* renamed from: r */
    private void m15272r(float f) {
        this.f21761c = f;
    }

    /* renamed from: s */
    private void m15271s(float f) {
        this.f21762d = f;
    }

    /* renamed from: t */
    private void m15270t(float f) {
        this.f21759a = f;
    }

    /* renamed from: u */
    private void m15269u(float f) {
        this.f21760b = f;
    }

    /* renamed from: a */
    public void m15289a(float f, float f2, float f3, float f4, float f5, float f6) {
        C9262d c9262d = new C9262d(f, f2, f3, f4);
        c9262d.m15250s(f5);
        c9262d.m15249t(f6);
        this.f21765g.add(c9262d);
        C9260b c9260b = new C9260b(c9262d);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        m15287c(c9260b, f5, z ? (180.0f + f7) % 360.0f : f7);
        double d = f7;
        m15272r(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))));
        m15271s(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))));
    }

    /* renamed from: d */
    public void m15286d(Matrix matrix, Path path) {
        int size = this.f21765g.size();
        for (int i = 0; i < size; i++) {
            this.f21765g.get(i).mo15243a(matrix, path);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m15285e() {
        return this.f21767i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public AbstractC9265g m15284f(Matrix matrix) {
        m15288b(m15282h());
        return new C9259a(this, new ArrayList(this.f21766h), new Matrix(matrix));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public float m15281i() {
        return this.f21761c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public float m15280j() {
        return this.f21762d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public float m15279k() {
        return this.f21759a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public float m15278l() {
        return this.f21760b;
    }

    /* renamed from: m */
    public void m15277m(float f, float f2) {
        C9263e c9263e = new C9263e();
        c9263e.f21781b = f;
        c9263e.f21782c = f2;
        this.f21765g.add(c9263e);
        C9261c c9261c = new C9261c(c9263e, m15281i(), m15280j());
        m15287c(c9261c, c9261c.m15268c() + 270.0f, c9261c.m15268c() + 270.0f);
        m15272r(f);
        m15271s(f2);
    }

    /* renamed from: n */
    public void m15276n(float f, float f2) {
        m15275o(f, f2, 270.0f, 0.0f);
    }

    /* renamed from: o */
    public void m15275o(float f, float f2, float f3, float f4) {
        m15270t(f);
        m15269u(f2);
        m15272r(f);
        m15271s(f2);
        m15274p(f3);
        m15273q((f3 + f4) % 360.0f);
        this.f21765g.clear();
        this.f21766h.clear();
        this.f21767i = false;
    }
}

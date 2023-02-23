package p272h.p286c.p360e.p361a.p363b;

import com.google.android.gms.common.internal.C2906q;
import java.util.concurrent.Executor;
import p272h.p286c.p287a.p300b.p307d.p317j.C9119td;
import p272h.p286c.p287a.p300b.p307d.p317j.C9134ud;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.e.a.b.e */
/* loaded from: classes2.dex */
public class C9401e {

    /* renamed from: a */
    private final int f22022a;

    /* renamed from: b */
    private final int f22023b;

    /* renamed from: c */
    private final int f22024c;

    /* renamed from: d */
    private final int f22025d;

    /* renamed from: e */
    private final boolean f22026e;

    /* renamed from: f */
    private final float f22027f;

    /* renamed from: g */
    private final Executor f22028g;

    /* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
    /* renamed from: h.c.e.a.b.e$a */
    /* loaded from: classes2.dex */
    public static class C9402a {

        /* renamed from: a */
        private int f22029a = 1;

        /* renamed from: b */
        private int f22030b = 1;

        /* renamed from: c */
        private int f22031c = 1;

        /* renamed from: d */
        private int f22032d = 1;

        /* renamed from: e */
        private boolean f22033e = false;

        /* renamed from: f */
        private float f22034f = 0.1f;

        /* renamed from: g */
        private Executor f22035g;

        /* renamed from: a */
        public C9401e m14825a() {
            return new C9401e(this.f22029a, this.f22030b, this.f22031c, this.f22032d, this.f22033e, this.f22034f, this.f22035g, null);
        }

        /* renamed from: b */
        public C9402a m14824b() {
            this.f22033e = true;
            return this;
        }

        /* renamed from: c */
        public C9402a m14823c(int i) {
            this.f22031c = i;
            return this;
        }
    }

    /* synthetic */ C9401e(int i, int i2, int i3, int i4, boolean z, float f, Executor executor, C9404g c9404g) {
        this.f22022a = i;
        this.f22023b = i2;
        this.f22024c = i3;
        this.f22025d = i4;
        this.f22026e = z;
        this.f22027f = f;
        this.f22028g = executor;
    }

    /* renamed from: a */
    public final float m14832a() {
        return this.f22027f;
    }

    /* renamed from: b */
    public final int m14831b() {
        return this.f22024c;
    }

    /* renamed from: c */
    public final int m14830c() {
        return this.f22023b;
    }

    /* renamed from: d */
    public final int m14829d() {
        return this.f22022a;
    }

    /* renamed from: e */
    public final int m14828e() {
        return this.f22025d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9401e) {
            C9401e c9401e = (C9401e) obj;
            return Float.floatToIntBits(this.f22027f) == Float.floatToIntBits(c9401e.f22027f) && C2906q.m31701a(Integer.valueOf(this.f22022a), Integer.valueOf(c9401e.f22022a)) && C2906q.m31701a(Integer.valueOf(this.f22023b), Integer.valueOf(c9401e.f22023b)) && C2906q.m31701a(Integer.valueOf(this.f22025d), Integer.valueOf(c9401e.f22025d)) && C2906q.m31701a(Boolean.valueOf(this.f22026e), Boolean.valueOf(c9401e.f22026e)) && C2906q.m31701a(Integer.valueOf(this.f22024c), Integer.valueOf(c9401e.f22024c)) && C2906q.m31701a(this.f22028g, c9401e.f22028g);
        }
        return false;
    }

    /* renamed from: f */
    public final Executor m14827f() {
        return this.f22028g;
    }

    /* renamed from: g */
    public final boolean m14826g() {
        return this.f22026e;
    }

    public int hashCode() {
        return C2906q.m31700b(Integer.valueOf(Float.floatToIntBits(this.f22027f)), Integer.valueOf(this.f22022a), Integer.valueOf(this.f22023b), Integer.valueOf(this.f22025d), Boolean.valueOf(this.f22026e), Integer.valueOf(this.f22024c), this.f22028g);
    }

    public String toString() {
        C9119td m15528a = C9134ud.m15528a("FaceDetectorOptions");
        m15528a.m15539b("landmarkMode", this.f22022a);
        m15528a.m15539b("contourMode", this.f22023b);
        m15528a.m15539b("classificationMode", this.f22024c);
        m15528a.m15539b("performanceMode", this.f22025d);
        m15528a.m15537d("trackingEnabled", this.f22026e);
        m15528a.m15540a("minFaceSize", this.f22027f);
        return m15528a.toString();
    }
}

package p272h.p286c.p287a.p288a.p289i.p296x.p297a;

import com.google.firebase.encoders.i.f;
/* compiled from: StorageMetrics.java */
/* renamed from: h.c.a.a.i.x.a.e */
/* loaded from: classes2.dex */
public final class C8375e {

    /* renamed from: a */
    private final long f20050a;

    /* renamed from: b */
    private final long f20051b;

    /* compiled from: StorageMetrics.java */
    /* renamed from: h.c.a.a.i.x.a.e$a */
    /* loaded from: classes2.dex */
    public static final class C8376a {

        /* renamed from: a */
        private long f20052a = 0;

        /* renamed from: b */
        private long f20053b = 0;

        C8376a() {
        }

        /* renamed from: a */
        public C8375e m16176a() {
            return new C8375e(this.f20052a, this.f20053b);
        }

        /* renamed from: b */
        public C8376a m16175b(long j) {
            this.f20052a = j;
            return this;
        }

        /* renamed from: c */
        public C8376a m16174c(long j) {
            this.f20053b = j;
            return this;
        }
    }

    static {
        new C8376a().m16176a();
    }

    C8375e(long j, long j2) {
        this.f20050a = j;
        this.f20051b = j2;
    }

    /* renamed from: c */
    public static C8376a m16177c() {
        return new C8376a();
    }

    @f(tag = 1)
    /* renamed from: a */
    public long m16179a() {
        return this.f20050a;
    }

    @f(tag = 2)
    /* renamed from: b */
    public long m16178b() {
        return this.f20051b;
    }
}

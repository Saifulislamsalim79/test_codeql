package p272h.p286c.p287a.p288a.p289i.p296x.p297a;

import com.google.firebase.encoders.i.f;
/* compiled from: TimeWindow.java */
/* renamed from: h.c.a.a.i.x.a.f */
/* loaded from: classes2.dex */
public final class C8377f {

    /* renamed from: a */
    private final long f20054a;

    /* renamed from: b */
    private final long f20055b;

    /* compiled from: TimeWindow.java */
    /* renamed from: h.c.a.a.i.x.a.f$a */
    /* loaded from: classes2.dex */
    public static final class C8378a {

        /* renamed from: a */
        private long f20056a = 0;

        /* renamed from: b */
        private long f20057b = 0;

        C8378a() {
        }

        /* renamed from: a */
        public C8377f m16170a() {
            return new C8377f(this.f20056a, this.f20057b);
        }

        /* renamed from: b */
        public C8378a m16169b(long j) {
            this.f20057b = j;
            return this;
        }

        /* renamed from: c */
        public C8378a m16168c(long j) {
            this.f20056a = j;
            return this;
        }
    }

    static {
        new C8378a().m16170a();
    }

    C8377f(long j, long j2) {
        this.f20054a = j;
        this.f20055b = j2;
    }

    /* renamed from: c */
    public static C8378a m16171c() {
        return new C8378a();
    }

    @f(tag = 2)
    /* renamed from: a */
    public long m16173a() {
        return this.f20055b;
    }

    @f(tag = 1)
    /* renamed from: b */
    public long m16172b() {
        return this.f20054a;
    }
}

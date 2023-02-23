package p272h.p286c.p287a.p288a.p289i.p296x.p297a;

import com.google.firebase.encoders.i.f;
import com.google.firebase.encoders.p143i.InterfaceC5981e;
/* compiled from: LogEventDropped.java */
/* renamed from: h.c.a.a.i.x.a.c */
/* loaded from: classes2.dex */
public final class C8370c {

    /* renamed from: a */
    private final long f20033a;

    /* renamed from: b */
    private final EnumC8372b f20034b;

    /* compiled from: LogEventDropped.java */
    /* renamed from: h.c.a.a.i.x.a.c$a */
    /* loaded from: classes2.dex */
    public static final class C8371a {

        /* renamed from: a */
        private long f20035a = 0;

        /* renamed from: b */
        private EnumC8372b f20036b = EnumC8372b.REASON_UNKNOWN;

        C8371a() {
        }

        /* renamed from: a */
        public C8370c m16189a() {
            return new C8370c(this.f20035a, this.f20036b);
        }

        /* renamed from: b */
        public C8371a m16188b(long j) {
            this.f20035a = j;
            return this;
        }

        /* renamed from: c */
        public C8371a m16187c(EnumC8372b enumC8372b) {
            this.f20036b = enumC8372b;
            return this;
        }
    }

    /* compiled from: LogEventDropped.java */
    /* renamed from: h.c.a.a.i.x.a.c$b */
    /* loaded from: classes2.dex */
    public enum EnumC8372b implements InterfaceC5981e {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        

        /* renamed from: c */
        private final int f20045c;

        EnumC8372b(int i) {
            this.f20045c = i;
        }

        @Override // com.google.firebase.encoders.p143i.InterfaceC5981e
        /* renamed from: d */
        public int mo16186d() {
            return this.f20045c;
        }
    }

    static {
        new C8371a().m16189a();
    }

    C8370c(long j, EnumC8372b enumC8372b) {
        this.f20033a = j;
        this.f20034b = enumC8372b;
    }

    /* renamed from: c */
    public static C8371a m16190c() {
        return new C8371a();
    }

    @f(tag = 1)
    /* renamed from: a */
    public long m16192a() {
        return this.f20033a;
    }

    @f(tag = 3)
    /* renamed from: b */
    public EnumC8372b m16191b() {
        return this.f20034b;
    }
}

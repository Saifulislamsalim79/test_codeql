package io.grpc.p384h1;

import com.google.common.base.C5051n;
/* compiled from: TransportTracer.java */
/* renamed from: io.grpc.h1.o2 */
/* loaded from: classes2.dex */
public final class C9730o2 {

    /* renamed from: h */
    private static final C9732b f22835h = new C9732b(InterfaceC9708l2.f22790a);

    /* renamed from: a */
    private final InterfaceC9708l2 f22836a;

    /* renamed from: b */
    private long f22837b;

    /* renamed from: c */
    private long f22838c;

    /* renamed from: d */
    private long f22839d;

    /* renamed from: e */
    private long f22840e;

    /* renamed from: f */
    private long f22841f;

    /* renamed from: g */
    private final InterfaceC9595e1 f22842g;

    /* compiled from: TransportTracer.java */
    /* renamed from: io.grpc.h1.o2$b */
    /* loaded from: classes2.dex */
    public static final class C9732b {

        /* renamed from: a */
        private final InterfaceC9708l2 f22843a;

        public C9732b(InterfaceC9708l2 interfaceC9708l2) {
            this.f22843a = interfaceC9708l2;
        }

        /* renamed from: a */
        public C9730o2 m14109a() {
            return new C9730o2(this.f22843a);
        }
    }

    /* compiled from: TransportTracer.java */
    /* renamed from: io.grpc.h1.o2$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC9733c {
    }

    /* renamed from: a */
    public static C9732b m14116a() {
        return f22835h;
    }

    /* renamed from: b */
    public void m14115b() {
        this.f22840e++;
    }

    /* renamed from: c */
    public void m14114c() {
        this.f22837b++;
        this.f22836a.mo14158a();
    }

    /* renamed from: d */
    public void m14113d() {
        this.f22842g.mo13937a(1L);
        this.f22836a.mo14158a();
    }

    /* renamed from: e */
    public void m14112e(int i) {
        if (i == 0) {
            return;
        }
        this.f22841f += i;
        this.f22836a.mo14158a();
    }

    /* renamed from: f */
    public void m14111f(boolean z) {
        if (z) {
            this.f22838c++;
        } else {
            this.f22839d++;
        }
    }

    /* renamed from: g */
    public void m14110g(InterfaceC9733c interfaceC9733c) {
        C5051n.m25780n(interfaceC9733c);
    }

    public C9730o2() {
        this.f22842g = C9609f1.m14340a();
        this.f22836a = InterfaceC9708l2.f22790a;
    }

    private C9730o2(InterfaceC9708l2 interfaceC9708l2) {
        this.f22842g = C9609f1.m14340a();
        this.f22836a = interfaceC9708l2;
    }
}

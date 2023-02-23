package io.grpc.p384h1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CallTracer.java */
/* renamed from: io.grpc.h1.m */
/* loaded from: classes2.dex */
public final class C9710m {

    /* renamed from: a */
    private final InterfaceC9708l2 f22791a;

    /* renamed from: b */
    private final InterfaceC9595e1 f22792b = C9609f1.m14340a();

    /* renamed from: c */
    private final InterfaceC9595e1 f22793c = C9609f1.m14340a();

    /* renamed from: d */
    private final InterfaceC9595e1 f22794d = C9609f1.m14340a();

    /* compiled from: CallTracer.java */
    /* renamed from: io.grpc.h1.m$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC9711a {
        C9710m create();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9710m(InterfaceC9708l2 interfaceC9708l2) {
        this.f22791a = interfaceC9708l2;
    }

    /* renamed from: a */
    public void m14157a(boolean z) {
        if (z) {
            this.f22793c.mo13937a(1L);
        } else {
            this.f22794d.mo13937a(1L);
        }
    }

    /* renamed from: b */
    public void m14156b() {
        this.f22792b.mo13937a(1L);
        this.f22791a.mo14158a();
    }
}

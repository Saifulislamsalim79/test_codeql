package io.grpc;
/* loaded from: classes2.dex */
public class StatusRuntimeException extends RuntimeException {

    /* renamed from: c */
    private final C9497c1 f22156c;

    /* renamed from: d */
    private final C10049s0 f22157d;

    /* renamed from: e */
    private final boolean f22158e;

    public StatusRuntimeException(C9497c1 c9497c1) {
        this(c9497c1, null);
    }

    /* renamed from: a */
    public final C9497c1 m14633a() {
        return this.f22156c;
    }

    /* renamed from: b */
    public final C10049s0 m14632b() {
        return this.f22157d;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this.f22158e ? super.fillInStackTrace() : this;
    }

    public StatusRuntimeException(C9497c1 c9497c1, C10049s0 c10049s0) {
        this(c9497c1, c10049s0, true);
    }

    StatusRuntimeException(C9497c1 c9497c1, C10049s0 c10049s0, boolean z) {
        super(C9497c1.m14588h(c9497c1), c9497c1.m14583m());
        this.f22156c = c9497c1;
        this.f22157d = c10049s0;
        this.f22158e = z;
        fillInStackTrace();
    }
}

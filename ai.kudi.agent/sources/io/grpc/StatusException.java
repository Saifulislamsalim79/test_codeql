package io.grpc;
/* loaded from: classes2.dex */
public class StatusException extends Exception {

    /* renamed from: c */
    private final C9497c1 f22153c;

    /* renamed from: d */
    private final C10049s0 f22154d;

    /* renamed from: e */
    private final boolean f22155e;

    public StatusException(C9497c1 c9497c1) {
        this(c9497c1, null);
    }

    /* renamed from: a */
    public final C9497c1 m14635a() {
        return this.f22153c;
    }

    /* renamed from: b */
    public final C10049s0 m14634b() {
        return this.f22154d;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this.f22155e ? super.fillInStackTrace() : this;
    }

    public StatusException(C9497c1 c9497c1, C10049s0 c10049s0) {
        this(c9497c1, c10049s0, true);
    }

    StatusException(C9497c1 c9497c1, C10049s0 c10049s0, boolean z) {
        super(C9497c1.m14588h(c9497c1), c9497c1.m14583m());
        this.f22153c = c9497c1;
        this.f22154d = c10049s0;
        this.f22155e = z;
        fillInStackTrace();
    }
}

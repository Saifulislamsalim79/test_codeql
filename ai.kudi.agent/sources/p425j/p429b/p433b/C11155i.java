package p425j.p429b.p433b;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
/* compiled from: ForwardingTimeout.java */
/* renamed from: j.b.b.i */
/* loaded from: classes3.dex */
public class C11155i extends C11171t {

    /* renamed from: a */
    private C11171t f25221a;

    public C11155i(C11171t c11171t) {
        if (c11171t != null) {
            this.f25221a = c11171t;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    /* renamed from: a */
    public final C11171t m11537a() {
        return this.f25221a;
    }

    /* renamed from: b */
    public final C11155i m11536b(C11171t c11171t) {
        if (c11171t != null) {
            this.f25221a = c11171t;
            return this;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // p425j.p429b.p433b.C11171t
    public C11171t clearDeadline() {
        return this.f25221a.clearDeadline();
    }

    @Override // p425j.p429b.p433b.C11171t
    public C11171t clearTimeout() {
        return this.f25221a.clearTimeout();
    }

    @Override // p425j.p429b.p433b.C11171t
    public long deadlineNanoTime() {
        return this.f25221a.deadlineNanoTime();
    }

    @Override // p425j.p429b.p433b.C11171t
    public boolean hasDeadline() {
        return this.f25221a.hasDeadline();
    }

    @Override // p425j.p429b.p433b.C11171t
    public void throwIfReached() throws IOException {
        this.f25221a.throwIfReached();
    }

    @Override // p425j.p429b.p433b.C11171t
    public C11171t timeout(long j, TimeUnit timeUnit) {
        return this.f25221a.timeout(j, timeUnit);
    }

    @Override // p425j.p429b.p433b.C11171t
    public long timeoutNanos() {
        return this.f25221a.timeoutNanos();
    }

    @Override // p425j.p429b.p433b.C11171t
    public C11171t deadlineNanoTime(long j) {
        return this.f25221a.deadlineNanoTime(j);
    }
}

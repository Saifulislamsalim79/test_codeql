package p576m;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
/* compiled from: Timeout.java */
/* renamed from: m.t */
/* loaded from: classes3.dex */
public class C14366t {

    /* renamed from: d */
    public static final C14366t f31663d = new C14367a();

    /* renamed from: a */
    private boolean f31664a;

    /* renamed from: b */
    private long f31665b;

    /* renamed from: c */
    private long f31666c;

    /* compiled from: Timeout.java */
    /* renamed from: m.t$a */
    /* loaded from: classes3.dex */
    final class C14367a extends C14366t {
        C14367a() {
        }

        @Override // p576m.C14366t
        /* renamed from: d */
        public C14366t mo1948d(long j) {
            return this;
        }

        @Override // p576m.C14366t
        /* renamed from: f */
        public void mo1947f() throws IOException {
        }

        @Override // p576m.C14366t
        /* renamed from: g */
        public C14366t mo1946g(long j, TimeUnit timeUnit) {
            return this;
        }
    }

    /* renamed from: a */
    public C14366t mo1953a() {
        this.f31664a = false;
        return this;
    }

    /* renamed from: b */
    public C14366t mo1952b() {
        this.f31666c = 0L;
        return this;
    }

    /* renamed from: c */
    public long mo1951c() {
        if (this.f31664a) {
            return this.f31665b;
        }
        throw new IllegalStateException("No deadline");
    }

    /* renamed from: d */
    public C14366t mo1948d(long j) {
        this.f31664a = true;
        this.f31665b = j;
        return this;
    }

    /* renamed from: e */
    public boolean mo1950e() {
        return this.f31664a;
    }

    /* renamed from: f */
    public void mo1947f() throws IOException {
        if (!Thread.interrupted()) {
            if (this.f31664a && this.f31665b - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        Thread.currentThread().interrupt();
        throw new InterruptedIOException("interrupted");
    }

    /* renamed from: g */
    public C14366t mo1946g(long j, TimeUnit timeUnit) {
        if (j >= 0) {
            if (timeUnit != null) {
                this.f31666c = timeUnit.toNanos(j);
                return this;
            }
            throw new IllegalArgumentException("unit == null");
        }
        throw new IllegalArgumentException("timeout < 0: " + j);
    }

    /* renamed from: h */
    public long mo1949h() {
        return this.f31666c;
    }
}

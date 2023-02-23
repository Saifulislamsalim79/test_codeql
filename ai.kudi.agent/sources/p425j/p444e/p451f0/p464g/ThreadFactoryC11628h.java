package p425j.p444e.p451f0.p464g;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: RxThreadFactory.java */
/* renamed from: j.e.f0.g.h */
/* loaded from: classes3.dex */
public final class ThreadFactoryC11628h extends AtomicLong implements ThreadFactory {

    /* renamed from: c */
    final String f26271c;

    /* renamed from: d */
    final int f26272d;

    /* renamed from: e */
    final boolean f26273e;

    /* compiled from: RxThreadFactory.java */
    /* renamed from: j.e.f0.g.h$a */
    /* loaded from: classes3.dex */
    static final class C11629a extends Thread {
        C11629a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public ThreadFactoryC11628h(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = this.f26271c + '-' + incrementAndGet();
        Thread c11629a = this.f26273e ? new C11629a(runnable, str) : new Thread(runnable, str);
        c11629a.setPriority(this.f26272d);
        c11629a.setDaemon(true);
        return c11629a;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return "RxThreadFactory[" + this.f26271c + "]";
    }

    public ThreadFactoryC11628h(String str, int i) {
        this(str, i, false);
    }

    public ThreadFactoryC11628h(String str, int i, boolean z) {
        this.f26271c = str;
        this.f26272d = i;
        this.f26273e = z;
    }
}

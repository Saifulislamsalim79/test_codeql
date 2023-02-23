package androidx.room;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.room.p063z0.C1856e;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p201g.p210b.p211a.p214c.InterfaceC7511a;
import p201g.p262t.p263a.InterfaceC8093g;
import p201g.p262t.p263a.InterfaceC8094h;
/* compiled from: AutoCloser.java */
/* renamed from: androidx.room.w */
/* loaded from: classes2.dex */
final class C1838w {

    /* renamed from: e */
    final long f5579e;

    /* renamed from: f */
    final Executor f5580f;

    /* renamed from: i */
    InterfaceC8093g f5583i;

    /* renamed from: a */
    private InterfaceC8094h f5575a = null;

    /* renamed from: b */
    private final Handler f5576b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    Runnable f5577c = null;

    /* renamed from: d */
    final Object f5578d = new Object();

    /* renamed from: g */
    int f5581g = 0;

    /* renamed from: h */
    long f5582h = SystemClock.uptimeMillis();

    /* renamed from: j */
    private boolean f5584j = false;

    /* renamed from: k */
    private final Runnable f5585k = new RunnableC1839a();

    /* renamed from: l */
    final Runnable f5586l = new RunnableC1840b();

    /* compiled from: AutoCloser.java */
    /* renamed from: androidx.room.w$a */
    /* loaded from: classes2.dex */
    class RunnableC1839a implements Runnable {
        RunnableC1839a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1838w c1838w = C1838w.this;
            c1838w.f5580f.execute(c1838w.f5586l);
        }
    }

    /* compiled from: AutoCloser.java */
    /* renamed from: androidx.room.w$b */
    /* loaded from: classes2.dex */
    class RunnableC1840b implements Runnable {
        RunnableC1840b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C1838w.this.f5578d) {
                if (SystemClock.uptimeMillis() - C1838w.this.f5582h < C1838w.this.f5579e) {
                    return;
                }
                if (C1838w.this.f5581g != 0) {
                    return;
                }
                if (C1838w.this.f5577c != null) {
                    C1838w.this.f5577c.run();
                    if (C1838w.this.f5583i != null && C1838w.this.f5583i.isOpen()) {
                        try {
                            C1838w.this.f5583i.close();
                            C1838w.this.f5583i = null;
                        } catch (IOException e) {
                            C1856e.m34416a(e);
                            throw null;
                        }
                    }
                    return;
                }
                throw new IllegalStateException("mOnAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1838w(long j, TimeUnit timeUnit, Executor executor) {
        this.f5579e = timeUnit.toMillis(j);
        this.f5580f = executor;
    }

    /* renamed from: a */
    public void m34449a() throws IOException {
        synchronized (this.f5578d) {
            this.f5584j = true;
            if (this.f5583i != null) {
                this.f5583i.close();
            }
            this.f5583i = null;
        }
    }

    /* renamed from: b */
    public void m34448b() {
        synchronized (this.f5578d) {
            if (this.f5581g > 0) {
                int i = this.f5581g - 1;
                this.f5581g = i;
                if (i == 0) {
                    if (this.f5583i == null) {
                        return;
                    }
                    this.f5576b.postDelayed(this.f5585k, this.f5579e);
                }
                return;
            }
            throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
        }
    }

    /* renamed from: c */
    public <V> V m34447c(InterfaceC7511a<InterfaceC8093g, V> interfaceC7511a) {
        try {
            return interfaceC7511a.mo18527a(m34445e());
        } finally {
            m34448b();
        }
    }

    /* renamed from: d */
    public InterfaceC8093g m34446d() {
        InterfaceC8093g interfaceC8093g;
        synchronized (this.f5578d) {
            interfaceC8093g = this.f5583i;
        }
        return interfaceC8093g;
    }

    /* renamed from: e */
    public InterfaceC8093g m34445e() {
        synchronized (this.f5578d) {
            this.f5576b.removeCallbacks(this.f5585k);
            this.f5581g++;
            if (!this.f5584j) {
                if (this.f5583i != null && this.f5583i.isOpen()) {
                    return this.f5583i;
                } else if (this.f5575a != null) {
                    InterfaceC8093g mo16747h0 = this.f5575a.mo16747h0();
                    this.f5583i = mo16747h0;
                    return mo16747h0;
                } else {
                    throw new IllegalStateException("AutoCloser has not been initialized. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
            }
            throw new IllegalStateException("Attempting to open already closed database.");
        }
    }

    /* renamed from: f */
    public void m34444f(InterfaceC8094h interfaceC8094h) {
        if (this.f5575a != null) {
            Log.e("ROOM", "AutoCloser initialized multiple times. Please file a bug against room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
        } else {
            this.f5575a = interfaceC8094h;
        }
    }

    /* renamed from: g */
    public boolean m34443g() {
        return !this.f5584j;
    }

    /* renamed from: h */
    public void m34442h(Runnable runnable) {
        this.f5577c = runnable;
    }
}

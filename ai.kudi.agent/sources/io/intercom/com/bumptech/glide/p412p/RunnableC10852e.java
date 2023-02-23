package io.intercom.com.bumptech.glide.p412p;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import io.intercom.com.bumptech.glide.load.EnumC10507a;
import io.intercom.com.bumptech.glide.load.engine.GlideException;
import io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10868g;
import io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10869h;
import io.intercom.com.bumptech.glide.p412p.p414l.InterfaceC10878d;
import io.intercom.com.bumptech.glide.p416r.C10893i;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: RequestFutureTarget.java */
/* renamed from: io.intercom.com.bumptech.glide.p.e */
/* loaded from: classes3.dex */
public class RunnableC10852e<R> implements InterfaceFutureC10849b<R>, InterfaceC10855f<R>, Runnable {

    /* renamed from: D */
    private static final C10854b f24740D = new C10854b();

    /* renamed from: A */
    private boolean f24741A;

    /* renamed from: B */
    private boolean f24742B;

    /* renamed from: C */
    private GlideException f24743C;

    /* renamed from: c */
    private final Handler f24744c;

    /* renamed from: d */
    private final int f24745d;

    /* renamed from: e */
    private final int f24746e;

    /* renamed from: f */
    private final boolean f24747f;

    /* renamed from: w */
    private final C10854b f24748w;

    /* renamed from: x */
    private R f24749x;

    /* renamed from: y */
    private InterfaceC10850c f24750y;

    /* renamed from: z */
    private boolean f24751z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RequestFutureTarget.java */
    /* renamed from: io.intercom.com.bumptech.glide.p.e$a */
    /* loaded from: classes3.dex */
    public static class C10853a extends ExecutionException {

        /* renamed from: c */
        private final GlideException f24752c;

        C10853a(GlideException glideException) {
            this.f24752c = glideException;
        }

        @Override // java.lang.Throwable
        public void printStackTrace() {
            printStackTrace(System.err);
        }

        @Override // java.lang.Throwable
        public void printStackTrace(PrintStream printStream) {
            super.printStackTrace(printStream);
            printStream.print("Caused by: ");
            this.f24752c.printStackTrace(printStream);
        }

        @Override // java.lang.Throwable
        public void printStackTrace(PrintWriter printWriter) {
            super.printStackTrace(printWriter);
            printWriter.print("Caused by: ");
            this.f24752c.printStackTrace(printWriter);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RequestFutureTarget.java */
    /* renamed from: io.intercom.com.bumptech.glide.p.e$b */
    /* loaded from: classes3.dex */
    public static class C10854b {
        C10854b() {
        }

        /* renamed from: a */
        void m12179a(Object obj) {
            obj.notifyAll();
        }

        /* renamed from: b */
        void m12178b(Object obj, long j) throws InterruptedException {
            obj.wait(j);
        }
    }

    public RunnableC10852e(Handler handler, int i, int i2) {
        this(handler, i, i2, true, f24740D);
    }

    /* renamed from: a */
    private void m12181a() {
        this.f24744c.post(this);
    }

    /* renamed from: b */
    private synchronized R m12180b(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f24747f && !isDone()) {
            C10893i.m12012a();
        }
        if (!this.f24751z) {
            if (!this.f24742B) {
                if (this.f24741A) {
                    return this.f24749x;
                }
                if (l == null) {
                    this.f24748w.m12178b(this, 0L);
                } else if (l.longValue() > 0) {
                    this.f24748w.m12178b(this, l.longValue());
                }
                if (!Thread.interrupted()) {
                    if (!this.f24742B) {
                        if (!this.f24751z) {
                            if (this.f24741A) {
                                return this.f24749x;
                            }
                            throw new TimeoutException();
                        }
                        throw new CancellationException();
                    }
                    throw new C10853a(this.f24743C);
                }
                throw new InterruptedException();
            }
            throw new ExecutionException(this.f24743C);
        }
        throw new CancellationException();
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean cancel(boolean z) {
        if (isDone()) {
            return false;
        }
        this.f24751z = true;
        this.f24748w.m12179a(this);
        if (z) {
            m12181a();
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public R get() throws InterruptedException, ExecutionException {
        try {
            return m12180b(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10869h
    public InterfaceC10850c getRequest() {
        return this.f24750y;
    }

    @Override // io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10869h
    public void getSize(InterfaceC10868g interfaceC10868g) {
        interfaceC10868g.mo12069d(this.f24745d, this.f24746e);
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.f24751z;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        boolean z;
        if (!this.f24751z && !this.f24741A) {
            z = this.f24742B;
        }
        return z;
    }

    @Override // io.intercom.com.bumptech.glide.p409m.InterfaceC10823i
    public void onDestroy() {
    }

    @Override // io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10869h
    public void onLoadCleared(Drawable drawable) {
    }

    @Override // io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10869h
    public synchronized void onLoadFailed(Drawable drawable) {
    }

    @Override // io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10869h
    public void onLoadStarted(Drawable drawable) {
    }

    @Override // io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10869h
    public synchronized void onResourceReady(R r, InterfaceC10878d<? super R> interfaceC10878d) {
    }

    @Override // io.intercom.com.bumptech.glide.p409m.InterfaceC10823i
    public void onStart() {
    }

    @Override // io.intercom.com.bumptech.glide.p409m.InterfaceC10823i
    public void onStop() {
    }

    @Override // io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10869h
    public void removeCallback(InterfaceC10868g interfaceC10868g) {
    }

    @Override // java.lang.Runnable
    public void run() {
        InterfaceC10850c interfaceC10850c = this.f24750y;
        if (interfaceC10850c != null) {
            interfaceC10850c.clear();
            this.f24750y = null;
        }
    }

    @Override // io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10869h
    public void setRequest(InterfaceC10850c interfaceC10850c) {
        this.f24750y = interfaceC10850c;
    }

    RunnableC10852e(Handler handler, int i, int i2, boolean z, C10854b c10854b) {
        this.f24744c = handler;
        this.f24745d = i;
        this.f24746e = i2;
        this.f24747f = z;
        this.f24748w = c10854b;
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10855f
    public synchronized boolean onLoadFailed(GlideException glideException, Object obj, InterfaceC10869h<R> interfaceC10869h, boolean z) {
        this.f24742B = true;
        this.f24743C = glideException;
        this.f24748w.m12179a(this);
        return false;
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10855f
    public synchronized boolean onResourceReady(R r, Object obj, InterfaceC10869h<R> interfaceC10869h, EnumC10507a enumC10507a, boolean z) {
        this.f24741A = true;
        this.f24749x = r;
        this.f24748w.m12179a(this);
        return false;
    }

    @Override // java.util.concurrent.Future
    public R get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return m12180b(Long.valueOf(timeUnit.toMillis(j)));
    }
}

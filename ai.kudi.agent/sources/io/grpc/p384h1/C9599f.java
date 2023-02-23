package io.grpc.p384h1;

import com.google.common.base.C5051n;
import io.grpc.InterfaceC10080v;
import io.grpc.p384h1.C9616g;
import io.grpc.p384h1.C9702l1;
import io.grpc.p384h1.InterfaceC9695k2;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ApplicationThreadDeframer.java */
/* renamed from: io.grpc.h1.f */
/* loaded from: classes2.dex */
public class C9599f implements InterfaceC9813y {

    /* renamed from: c */
    private final C9702l1.InterfaceC9704b f22479c;

    /* renamed from: d */
    private final C9616g f22480d;

    /* renamed from: e */
    private final C9702l1 f22481e;

    /* compiled from: ApplicationThreadDeframer.java */
    /* renamed from: io.grpc.h1.f$a */
    /* loaded from: classes2.dex */
    class RunnableC9600a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ int f22482c;

        RunnableC9600a(int i) {
            this.f22482c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C9599f.this.f22481e.isClosed()) {
                return;
            }
            try {
                C9599f.this.f22481e.mo13933c(this.f22482c);
            } catch (Throwable th) {
                C9599f.this.f22480d.mo13673d(th);
                C9599f.this.f22481e.close();
            }
        }
    }

    /* compiled from: ApplicationThreadDeframer.java */
    /* renamed from: io.grpc.h1.f$b */
    /* loaded from: classes2.dex */
    class RunnableC9601b implements Runnable {

        /* renamed from: c */
        final /* synthetic */ InterfaceC9802v1 f22484c;

        RunnableC9601b(InterfaceC9802v1 interfaceC9802v1) {
            this.f22484c = interfaceC9802v1;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C9599f.this.f22481e.mo13934I(this.f22484c);
            } catch (Throwable th) {
                C9599f.this.f22480d.mo13673d(th);
                C9599f.this.f22481e.close();
            }
        }
    }

    /* compiled from: ApplicationThreadDeframer.java */
    /* renamed from: io.grpc.h1.f$c */
    /* loaded from: classes2.dex */
    class C9602c implements Closeable {

        /* renamed from: c */
        final /* synthetic */ InterfaceC9802v1 f22486c;

        C9602c(C9599f c9599f, InterfaceC9802v1 interfaceC9802v1) {
            this.f22486c = interfaceC9802v1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f22486c.close();
        }
    }

    /* compiled from: ApplicationThreadDeframer.java */
    /* renamed from: io.grpc.h1.f$d */
    /* loaded from: classes2.dex */
    class RunnableC9603d implements Runnable {
        RunnableC9603d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C9599f.this.f22481e.mo13931m();
        }
    }

    /* compiled from: ApplicationThreadDeframer.java */
    /* renamed from: io.grpc.h1.f$e */
    /* loaded from: classes2.dex */
    class RunnableC9604e implements Runnable {
        RunnableC9604e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C9599f.this.f22481e.close();
        }
    }

    /* compiled from: ApplicationThreadDeframer.java */
    /* renamed from: io.grpc.h1.f$f */
    /* loaded from: classes2.dex */
    private class C9605f extends C9606g implements Closeable {

        /* renamed from: f */
        private final Closeable f22489f;

        public C9605f(C9599f c9599f, Runnable runnable, Closeable closeable) {
            super(c9599f, runnable, null);
            this.f22489f = closeable;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f22489f.close();
        }
    }

    /* compiled from: ApplicationThreadDeframer.java */
    /* renamed from: io.grpc.h1.f$g */
    /* loaded from: classes2.dex */
    private class C9606g implements InterfaceC9695k2.InterfaceC9696a {

        /* renamed from: c */
        private final Runnable f22490c;

        /* renamed from: d */
        private boolean f22491d;

        /* synthetic */ C9606g(C9599f c9599f, Runnable runnable, RunnableC9600a runnableC9600a) {
            this(runnable);
        }

        /* renamed from: c */
        private void m14341c() {
            if (this.f22491d) {
                return;
            }
            this.f22490c.run();
            this.f22491d = true;
        }

        @Override // io.grpc.p384h1.InterfaceC9695k2.InterfaceC9696a
        public InputStream next() {
            m14341c();
            return C9599f.this.f22480d.m14330f();
        }

        private C9606g(Runnable runnable) {
            this.f22491d = false;
            this.f22490c = runnable;
        }
    }

    /* compiled from: ApplicationThreadDeframer.java */
    /* renamed from: io.grpc.h1.f$h */
    /* loaded from: classes2.dex */
    interface InterfaceC9607h extends C9616g.InterfaceC9620d {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9599f(C9702l1.InterfaceC9704b interfaceC9704b, InterfaceC9607h interfaceC9607h, C9702l1 c9702l1) {
        C5051n.m25779o(interfaceC9704b, "listener");
        C9671h2 c9671h2 = new C9671h2(interfaceC9704b);
        this.f22479c = c9671h2;
        C9616g c9616g = new C9616g(c9671h2, interfaceC9607h);
        this.f22480d = c9616g;
        c9702l1.m14163i0(c9616g);
        this.f22481e = c9702l1;
    }

    @Override // io.grpc.p384h1.InterfaceC9813y
    /* renamed from: F */
    public void mo13935F(InterfaceC10080v interfaceC10080v) {
        this.f22481e.mo13935F(interfaceC10080v);
    }

    @Override // io.grpc.p384h1.InterfaceC9813y
    /* renamed from: I */
    public void mo13934I(InterfaceC9802v1 interfaceC9802v1) {
        this.f22479c.mo14161a(new C9605f(this, new RunnableC9601b(interfaceC9802v1), new C9602c(this, interfaceC9802v1)));
    }

    @Override // io.grpc.p384h1.InterfaceC9813y
    /* renamed from: c */
    public void mo13933c(int i) {
        this.f22479c.mo14161a(new C9606g(this, new RunnableC9600a(i), null));
    }

    @Override // io.grpc.p384h1.InterfaceC9813y
    public void close() {
        this.f22481e.m14162k0();
        this.f22479c.mo14161a(new C9606g(this, new RunnableC9604e(), null));
    }

    @Override // io.grpc.p384h1.InterfaceC9813y
    /* renamed from: g */
    public void mo13932g(int i) {
        this.f22481e.mo13932g(i);
    }

    @Override // io.grpc.p384h1.InterfaceC9813y
    /* renamed from: m */
    public void mo13931m() {
        this.f22479c.mo14161a(new C9606g(this, new RunnableC9603d(), null));
    }
}

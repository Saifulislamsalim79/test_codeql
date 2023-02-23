package io.grpc.p384h1;

import com.google.common.base.C5051n;
import io.grpc.p384h1.C9702l1;
import io.grpc.p384h1.InterfaceC9695k2;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ApplicationThreadDeframerListener.java */
/* renamed from: io.grpc.h1.g */
/* loaded from: classes2.dex */
public final class C9616g implements C9702l1.InterfaceC9704b {

    /* renamed from: a */
    private final InterfaceC9620d f22508a;

    /* renamed from: b */
    private final C9702l1.InterfaceC9704b f22509b;

    /* renamed from: c */
    private final Queue<InputStream> f22510c = new ArrayDeque();

    /* compiled from: ApplicationThreadDeframerListener.java */
    /* renamed from: io.grpc.h1.g$a */
    /* loaded from: classes2.dex */
    class RunnableC9617a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ int f22511c;

        RunnableC9617a(int i) {
            this.f22511c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9616g.this.f22509b.mo13675c(this.f22511c);
        }
    }

    /* compiled from: ApplicationThreadDeframerListener.java */
    /* renamed from: io.grpc.h1.g$b */
    /* loaded from: classes2.dex */
    class RunnableC9618b implements Runnable {

        /* renamed from: c */
        final /* synthetic */ boolean f22513c;

        RunnableC9618b(boolean z) {
            this.f22513c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9616g.this.f22509b.mo13677b(this.f22513c);
        }
    }

    /* compiled from: ApplicationThreadDeframerListener.java */
    /* renamed from: io.grpc.h1.g$c */
    /* loaded from: classes2.dex */
    class RunnableC9619c implements Runnable {

        /* renamed from: c */
        final /* synthetic */ Throwable f22515c;

        RunnableC9619c(Throwable th) {
            this.f22515c = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9616g.this.f22509b.mo13673d(this.f22515c);
        }
    }

    /* compiled from: ApplicationThreadDeframerListener.java */
    /* renamed from: io.grpc.h1.g$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC9620d {
        /* renamed from: e */
        void mo13671e(Runnable runnable);
    }

    public C9616g(C9702l1.InterfaceC9704b interfaceC9704b, InterfaceC9620d interfaceC9620d) {
        C5051n.m25779o(interfaceC9704b, "listener");
        this.f22509b = interfaceC9704b;
        C5051n.m25779o(interfaceC9620d, "transportExecutor");
        this.f22508a = interfaceC9620d;
    }

    @Override // io.grpc.p384h1.C9702l1.InterfaceC9704b
    /* renamed from: a */
    public void mo14161a(InterfaceC9695k2.InterfaceC9696a interfaceC9696a) {
        while (true) {
            InputStream next = interfaceC9696a.next();
            if (next == null) {
                return;
            }
            this.f22510c.add(next);
        }
    }

    @Override // io.grpc.p384h1.C9702l1.InterfaceC9704b
    /* renamed from: b */
    public void mo13677b(boolean z) {
        this.f22508a.mo13671e(new RunnableC9618b(z));
    }

    @Override // io.grpc.p384h1.C9702l1.InterfaceC9704b
    /* renamed from: c */
    public void mo13675c(int i) {
        this.f22508a.mo13671e(new RunnableC9617a(i));
    }

    @Override // io.grpc.p384h1.C9702l1.InterfaceC9704b
    /* renamed from: d */
    public void mo13673d(Throwable th) {
        this.f22508a.mo13671e(new RunnableC9619c(th));
    }

    /* renamed from: f */
    public InputStream m14330f() {
        return this.f22510c.poll();
    }
}

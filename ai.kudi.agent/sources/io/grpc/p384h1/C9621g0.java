package io.grpc.p384h1;

import com.google.common.base.C5051n;
import io.grpc.AbstractC10001l;
import io.grpc.C10049s0;
import io.grpc.C10060t0;
import io.grpc.C9497c1;
import io.grpc.C9502d;
import io.grpc.C9526h0;
import io.grpc.p384h1.InterfaceC9753r;
import io.grpc.p384h1.InterfaceC9773s;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FailingClientTransport.java */
/* renamed from: io.grpc.h1.g0 */
/* loaded from: classes2.dex */
public class C9621g0 implements InterfaceC9773s {

    /* renamed from: a */
    final C9497c1 f22517a;

    /* renamed from: b */
    private final InterfaceC9753r.EnumC9754a f22518b;

    /* compiled from: FailingClientTransport.java */
    /* renamed from: io.grpc.h1.g0$a */
    /* loaded from: classes2.dex */
    class RunnableC9622a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ InterfaceC9773s.InterfaceC9774a f22519c;

        RunnableC9622a(InterfaceC9773s.InterfaceC9774a interfaceC9774a) {
            this.f22519c = interfaceC9774a;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22519c.mo14031a(C9621g0.this.f22517a.m14593c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9621g0(C9497c1 c9497c1, InterfaceC9753r.EnumC9754a enumC9754a) {
        C5051n.m25789e(!c9497c1.m14580p(), "error must not be OK");
        this.f22517a = c9497c1;
        this.f22518b = enumC9754a;
    }

    @Override // io.grpc.p384h1.InterfaceC9773s
    /* renamed from: b */
    public InterfaceC9749q mo13637b(C10060t0<?, ?> c10060t0, C10049s0 c10049s0, C9502d c9502d, AbstractC10001l[] abstractC10001lArr) {
        return new C9608f0(this.f22517a, this.f22518b, abstractC10001lArr);
    }

    @Override // io.grpc.InterfaceC10006l0
    /* renamed from: f */
    public C9526h0 mo13324f() {
        throw new UnsupportedOperationException("Not a real transport");
    }

    @Override // io.grpc.p384h1.InterfaceC9773s
    /* renamed from: g */
    public void mo13628g(InterfaceC9773s.InterfaceC9774a interfaceC9774a, Executor executor) {
        executor.execute(new RunnableC9622a(interfaceC9774a));
    }
}

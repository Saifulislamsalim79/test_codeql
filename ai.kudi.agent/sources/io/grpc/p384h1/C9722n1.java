package io.grpc.p384h1;

import com.google.common.base.C5051n;
import io.grpc.AbstractC10001l;
import io.grpc.AbstractC9490c;
import io.grpc.C10043s;
import io.grpc.C10049s0;
import io.grpc.C10060t0;
import io.grpc.C9497c1;
import io.grpc.C9502d;
/* compiled from: MetadataApplierImpl.java */
/* renamed from: io.grpc.h1.n1 */
/* loaded from: classes2.dex */
final class C9722n1 extends AbstractC9490c.AbstractC9491a {

    /* renamed from: a */
    private final InterfaceC9723a f22819a;

    /* renamed from: b */
    private final AbstractC10001l[] f22820b;

    /* renamed from: c */
    private final Object f22821c = new Object();

    /* renamed from: d */
    private InterfaceC9749q f22822d;

    /* renamed from: e */
    boolean f22823e;

    /* renamed from: f */
    C9542b0 f22824f;

    /* compiled from: MetadataApplierImpl.java */
    /* renamed from: io.grpc.h1.n1$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC9723a {
        /* renamed from: a */
        void mo14124a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9722n1(InterfaceC9773s interfaceC9773s, C10060t0<?, ?> c10060t0, C10049s0 c10049s0, C9502d c9502d, InterfaceC9723a interfaceC9723a, AbstractC10001l[] abstractC10001lArr) {
        C10043s.m13237I();
        this.f22819a = interfaceC9723a;
        this.f22820b = abstractC10001lArr;
    }

    /* renamed from: b */
    private void m14126b(InterfaceC9749q interfaceC9749q) {
        boolean z;
        C5051n.m25773u(!this.f22823e, "already finalized");
        this.f22823e = true;
        synchronized (this.f22821c) {
            if (this.f22822d == null) {
                this.f22822d = interfaceC9749q;
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            this.f22819a.mo14124a();
            return;
        }
        C5051n.m25773u(this.f22824f != null, "delayedStream is null");
        Runnable m14474x = this.f22824f.m14474x(interfaceC9749q);
        if (m14474x != null) {
            m14474x.run();
        }
        this.f22819a.mo14124a();
    }

    /* renamed from: a */
    public void m14127a(C9497c1 c9497c1) {
        C5051n.m25789e(!c9497c1.m14580p(), "Cannot fail with OK status");
        C5051n.m25773u(!this.f22823e, "apply() or fail() already called");
        m14126b(new C9608f0(c9497c1, this.f22820b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public InterfaceC9749q m14125c() {
        synchronized (this.f22821c) {
            if (this.f22822d == null) {
                C9542b0 c9542b0 = new C9542b0();
                this.f22824f = c9542b0;
                this.f22822d = c9542b0;
                return c9542b0;
            }
            return this.f22822d;
        }
    }
}

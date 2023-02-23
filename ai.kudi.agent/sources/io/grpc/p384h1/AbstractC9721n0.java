package io.grpc.p384h1;

import com.google.common.base.C5042j;
import com.google.common.base.C5051n;
import io.grpc.AbstractC10069u0;
/* compiled from: ForwardingNameResolver.java */
/* renamed from: io.grpc.h1.n0 */
/* loaded from: classes2.dex */
abstract class AbstractC9721n0 extends AbstractC10069u0 {

    /* renamed from: a */
    private final AbstractC10069u0 f22818a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC9721n0(AbstractC10069u0 abstractC10069u0) {
        C5051n.m25779o(abstractC10069u0, "delegate can not be null");
        this.f22818a = abstractC10069u0;
    }

    @Override // io.grpc.AbstractC10069u0
    /* renamed from: b */
    public void mo13140b() {
        this.f22818a.mo13140b();
    }

    @Override // io.grpc.AbstractC10069u0
    /* renamed from: c */
    public void mo13139c() {
        this.f22818a.mo13139c();
    }

    @Override // io.grpc.AbstractC10069u0
    /* renamed from: d */
    public void mo13138d(AbstractC10069u0.AbstractC10075e abstractC10075e) {
        this.f22818a.mo13138d(abstractC10075e);
    }

    @Override // io.grpc.AbstractC10069u0
    @Deprecated
    /* renamed from: e */
    public void mo13137e(AbstractC10069u0.InterfaceC10076f interfaceC10076f) {
        this.f22818a.mo13137e(interfaceC10076f);
    }

    public String toString() {
        C5042j.C5044b m25812c = C5042j.m25812c(this);
        m25812c.m25808d("delegate", this.f22818a);
        return m25812c.toString();
    }
}

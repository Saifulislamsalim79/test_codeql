package io.grpc;

import com.google.common.base.C5051n;
import java.util.Arrays;
import java.util.List;
/* compiled from: ClientInterceptors.java */
/* renamed from: io.grpc.k */
/* loaded from: classes2.dex */
public class C9985k {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ClientInterceptors.java */
    /* renamed from: io.grpc.k$a */
    /* loaded from: classes2.dex */
    public static class C9986a extends AbstractC9508e {

        /* renamed from: a */
        private final AbstractC9508e f23699a;

        /* renamed from: b */
        private final InterfaceC9896i f23700b;

        /* synthetic */ C9986a(AbstractC9508e abstractC9508e, InterfaceC9896i interfaceC9896i, C9980j c9980j) {
            this(abstractC9508e, interfaceC9896i);
        }

        @Override // io.grpc.AbstractC9508e
        /* renamed from: a */
        public String mo13366a() {
            return this.f23699a.mo13366a();
        }

        @Override // io.grpc.AbstractC9508e
        /* renamed from: h */
        public <ReqT, RespT> AbstractC9524h<ReqT, RespT> mo13365h(C10060t0<ReqT, RespT> c10060t0, C9502d c9502d) {
            return this.f23700b.mo13338a(c10060t0, c9502d, this.f23699a);
        }

        private C9986a(AbstractC9508e abstractC9508e, InterfaceC9896i interfaceC9896i) {
            this.f23699a = abstractC9508e;
            C5051n.m25779o(interfaceC9896i, "interceptor");
            this.f23700b = interfaceC9896i;
        }
    }

    /* renamed from: a */
    public static AbstractC9508e m13368a(AbstractC9508e abstractC9508e, List<? extends InterfaceC9896i> list) {
        C5051n.m25779o(abstractC9508e, "channel");
        for (InterfaceC9896i interfaceC9896i : list) {
            abstractC9508e = new C9986a(abstractC9508e, interfaceC9896i, null);
        }
        return abstractC9508e;
    }

    /* renamed from: b */
    public static AbstractC9508e m13367b(AbstractC9508e abstractC9508e, InterfaceC9896i... interfaceC9896iArr) {
        return m13368a(abstractC9508e, Arrays.asList(interfaceC9896iArr));
    }
}

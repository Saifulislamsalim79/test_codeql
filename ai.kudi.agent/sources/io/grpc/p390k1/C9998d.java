package io.grpc.p390k1;

import com.google.common.base.C5051n;
import io.grpc.AbstractC10092z;
import io.grpc.AbstractC9508e;
import io.grpc.AbstractC9524h;
import io.grpc.C10049s0;
import io.grpc.C10060t0;
import io.grpc.C9502d;
import io.grpc.InterfaceC9896i;
/* compiled from: MetadataUtils.java */
/* renamed from: io.grpc.k1.d */
/* loaded from: classes2.dex */
public final class C9998d {

    /* compiled from: MetadataUtils.java */
    /* renamed from: io.grpc.k1.d$a */
    /* loaded from: classes2.dex */
    private static final class C9999a implements InterfaceC9896i {

        /* renamed from: a */
        private final C10049s0 f23716a;

        /* compiled from: MetadataUtils.java */
        /* renamed from: io.grpc.k1.d$a$a */
        /* loaded from: classes2.dex */
        private final class C10000a<ReqT, RespT> extends AbstractC10092z.AbstractC10093a<ReqT, RespT> {
            C10000a(AbstractC9524h<ReqT, RespT> abstractC9524h) {
                super(abstractC9524h);
            }

            @Override // io.grpc.AbstractC10092z, io.grpc.AbstractC9524h
            /* renamed from: e */
            public void mo13075e(AbstractC9524h.AbstractC9525a<RespT> abstractC9525a, C10049s0 c10049s0) {
                c10049s0.m13206k(C9999a.this.f23716a);
                super.mo13075e(abstractC9525a, c10049s0);
            }
        }

        C9999a(C10049s0 c10049s0) {
            C5051n.m25779o(c10049s0, "extraHeaders");
            this.f23716a = c10049s0;
        }

        @Override // io.grpc.InterfaceC9896i
        /* renamed from: a */
        public <ReqT, RespT> AbstractC9524h<ReqT, RespT> mo13338a(C10060t0<ReqT, RespT> c10060t0, C9502d c9502d, AbstractC9508e abstractC9508e) {
            return new C10000a(abstractC9508e.mo13365h(c10060t0, c9502d));
        }
    }

    /* renamed from: a */
    public static InterfaceC9896i m13339a(C10049s0 c10049s0) {
        return new C9999a(c10049s0);
    }
}

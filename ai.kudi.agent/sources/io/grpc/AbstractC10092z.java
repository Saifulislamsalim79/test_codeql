package io.grpc;

import io.grpc.AbstractC9524h;
/* compiled from: ForwardingClientCall.java */
/* renamed from: io.grpc.z */
/* loaded from: classes2.dex */
public abstract class AbstractC10092z<ReqT, RespT> extends AbstractC10089x0<ReqT, RespT> {

    /* compiled from: ForwardingClientCall.java */
    /* renamed from: io.grpc.z$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC10093a<ReqT, RespT> extends AbstractC10092z<ReqT, RespT> {

        /* renamed from: a */
        private final AbstractC9524h<ReqT, RespT> f23870a;

        /* JADX INFO: Access modifiers changed from: protected */
        public AbstractC10093a(AbstractC9524h<ReqT, RespT> abstractC9524h) {
            this.f23870a = abstractC9524h;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.AbstractC10089x0
        /* renamed from: f */
        public AbstractC9524h<ReqT, RespT> mo13074f() {
            return this.f23870a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.grpc.AbstractC9524h
    /* renamed from: d */
    public void mo13076d(ReqT reqt) {
        mo13074f().mo13076d(reqt);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.grpc.AbstractC9524h
    /* renamed from: e */
    public void mo13075e(AbstractC9524h.AbstractC9525a<RespT> abstractC9525a, C10049s0 c10049s0) {
        mo13074f().mo13075e(abstractC9525a, c10049s0);
    }
}

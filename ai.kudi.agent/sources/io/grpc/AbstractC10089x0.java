package io.grpc;

import com.google.common.base.C5042j;
/* compiled from: PartialForwardingClientCall.java */
/* renamed from: io.grpc.x0 */
/* loaded from: classes2.dex */
abstract class AbstractC10089x0<ReqT, RespT> extends AbstractC9524h<ReqT, RespT> {
    @Override // io.grpc.AbstractC9524h
    /* renamed from: a */
    public void mo13081a(String str, Throwable th) {
        mo13074f().mo13081a(str, th);
    }

    @Override // io.grpc.AbstractC9524h
    /* renamed from: b */
    public void mo13080b() {
        mo13074f().mo13080b();
    }

    @Override // io.grpc.AbstractC9524h
    /* renamed from: c */
    public void mo13079c(int i) {
        mo13074f().mo13079c(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public abstract AbstractC9524h<?, ?> mo13074f();

    public String toString() {
        C5042j.C5044b m25812c = C5042j.m25812c(this);
        m25812c.m25808d("delegate", mo13074f());
        return m25812c.toString();
    }
}

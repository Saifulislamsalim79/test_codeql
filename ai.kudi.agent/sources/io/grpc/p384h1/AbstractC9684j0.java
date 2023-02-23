package io.grpc.p384h1;

import com.google.common.base.C5042j;
import io.grpc.AbstractC10001l;
import io.grpc.C10049s0;
/* compiled from: ForwardingClientStreamTracer.java */
/* renamed from: io.grpc.h1.j0 */
/* loaded from: classes2.dex */
public abstract class AbstractC9684j0 extends AbstractC10001l {
    @Override // io.grpc.AbstractC9507d1
    /* renamed from: a */
    public void mo14196a(int i) {
        mo14046n().mo14196a(i);
    }

    @Override // io.grpc.AbstractC9507d1
    /* renamed from: b */
    public void mo14195b(int i, long j, long j2) {
        mo14046n().mo14195b(i, j, j2);
    }

    @Override // io.grpc.AbstractC9507d1
    /* renamed from: c */
    public void mo14194c(long j) {
        mo14046n().mo14194c(j);
    }

    @Override // io.grpc.AbstractC9507d1
    /* renamed from: d */
    public void mo14193d(long j) {
        mo14046n().mo14193d(j);
    }

    @Override // io.grpc.AbstractC9507d1
    /* renamed from: e */
    public void mo14192e(int i) {
        mo14046n().mo14192e(i);
    }

    @Override // io.grpc.AbstractC9507d1
    /* renamed from: f */
    public void mo14191f(int i, long j, long j2) {
        mo14046n().mo14191f(i, j, j2);
    }

    @Override // io.grpc.AbstractC9507d1
    /* renamed from: g */
    public void mo14190g(long j) {
        mo14046n().mo14190g(j);
    }

    @Override // io.grpc.AbstractC9507d1
    /* renamed from: h */
    public void mo13759h(long j) {
        mo14046n().mo13759h(j);
    }

    @Override // io.grpc.AbstractC10001l
    /* renamed from: j */
    public void mo13336j() {
        mo14046n().mo13336j();
    }

    @Override // io.grpc.AbstractC10001l
    /* renamed from: k */
    public void mo13335k(C10049s0 c10049s0) {
        mo14046n().mo13335k(c10049s0);
    }

    @Override // io.grpc.AbstractC10001l
    /* renamed from: l */
    public void mo13334l() {
        mo14046n().mo13334l();
    }

    /* renamed from: n */
    protected abstract AbstractC10001l mo14046n();

    public String toString() {
        C5042j.C5044b m25812c = C5042j.m25812c(this);
        m25812c.m25808d("delegate", mo14046n());
        return m25812c.toString();
    }
}

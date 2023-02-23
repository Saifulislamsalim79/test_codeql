package io.grpc.p384h1;

import com.google.common.base.C5042j;
import io.grpc.C10065u;
import io.grpc.C10082w;
import io.grpc.C9477a;
import io.grpc.C9497c1;
import io.grpc.InterfaceC10033o;
import java.io.InputStream;
/* compiled from: ForwardingClientStream.java */
/* renamed from: io.grpc.h1.h0 */
/* loaded from: classes2.dex */
abstract class AbstractC9665h0 implements InterfaceC9749q {
    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: a */
    public void mo13804a(C9497c1 c9497c1) {
        mo13886p().mo13804a(c9497c1);
    }

    @Override // io.grpc.p384h1.InterfaceC9689j2
    /* renamed from: b */
    public void mo13802b(InterfaceC10033o interfaceC10033o) {
        mo13886p().mo13802b(interfaceC10033o);
    }

    @Override // io.grpc.p384h1.InterfaceC9689j2
    /* renamed from: c */
    public void mo13800c(int i) {
        mo13886p().mo13800c(i);
    }

    @Override // io.grpc.p384h1.InterfaceC9689j2
    /* renamed from: d */
    public boolean mo13798d() {
        return mo13886p().mo13798d();
    }

    @Override // io.grpc.p384h1.InterfaceC9689j2
    /* renamed from: e */
    public void mo13796e(InputStream inputStream) {
        mo13886p().mo13796e(inputStream);
    }

    @Override // io.grpc.p384h1.InterfaceC9689j2
    /* renamed from: f */
    public void mo13794f() {
        mo13886p().mo13794f();
    }

    @Override // io.grpc.p384h1.InterfaceC9689j2
    public void flush() {
        mo13886p().flush();
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: g */
    public void mo13792g(int i) {
        mo13886p().mo13792g(i);
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: h */
    public void mo13790h(int i) {
        mo13886p().mo13790h(i);
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: i */
    public void mo13788i(C10082w c10082w) {
        mo13886p().mo13788i(c10082w);
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: j */
    public void mo13691j(String str) {
        mo13886p().mo13691j(str);
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: k */
    public void mo13785k(C9811x0 c9811x0) {
        mo13886p().mo13785k(c9811x0);
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: l */
    public void mo13783l() {
        mo13886p().mo13783l();
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: m */
    public C9477a mo13690m() {
        return mo13886p().mo13690m();
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: n */
    public void mo13782n(C10065u c10065u) {
        mo13886p().mo13782n(c10065u);
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: o */
    public void mo13781o(InterfaceC9753r interfaceC9753r) {
        mo13886p().mo13781o(interfaceC9753r);
    }

    /* renamed from: p */
    protected abstract InterfaceC9749q mo13886p();

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: q */
    public void mo13779q(boolean z) {
        mo13886p().mo13779q(z);
    }

    public String toString() {
        C5042j.C5044b m25812c = C5042j.m25812c(this);
        m25812c.m25808d("delegate", mo13886p());
        return m25812c.toString();
    }
}

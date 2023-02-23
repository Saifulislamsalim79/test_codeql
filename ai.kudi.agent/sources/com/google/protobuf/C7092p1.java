package com.google.protobuf;

import java.io.IOException;
/* compiled from: UnknownFieldSetLiteSchema.java */
/* renamed from: com.google.protobuf.p1 */
/* loaded from: classes2.dex */
class C7092p1 extends AbstractC7085n1<C7088o1, C7088o1> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC7085n1
    /* renamed from: A */
    public C7088o1 mo19749g(Object obj) {
        return ((AbstractC7141y) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC7085n1
    /* renamed from: B */
    public int mo19748h(C7088o1 c7088o1) {
        return c7088o1.m19784d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC7085n1
    /* renamed from: C */
    public int mo19747i(C7088o1 c7088o1) {
        return c7088o1.m19783e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC7085n1
    /* renamed from: D */
    public C7088o1 mo19745k(C7088o1 c7088o1, C7088o1 c7088o12) {
        return c7088o12.equals(C7088o1.m19785c()) ? c7088o1 : C7088o1.m19779i(c7088o1, c7088o12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC7085n1
    /* renamed from: E */
    public C7088o1 mo19744n() {
        return C7088o1.m19778j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC7085n1
    /* renamed from: F */
    public void mo19743o(Object obj, C7088o1 c7088o1) {
        mo19742p(obj, c7088o1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC7085n1
    /* renamed from: G */
    public void mo19742p(Object obj, C7088o1 c7088o1) {
        ((AbstractC7141y) obj).unknownFields = c7088o1;
    }

    /* renamed from: H */
    C7088o1 m19758H(C7088o1 c7088o1) {
        c7088o1.m19780h();
        return c7088o1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC7085n1
    /* renamed from: I */
    public void mo19739s(C7088o1 c7088o1, InterfaceC7131u1 interfaceC7131u1) throws IOException {
        c7088o1.m19773o(interfaceC7131u1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC7085n1
    /* renamed from: J */
    public void mo19738t(C7088o1 c7088o1, InterfaceC7131u1 interfaceC7131u1) throws IOException {
        c7088o1.m19771q(interfaceC7131u1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC7085n1
    /* renamed from: j */
    public void mo19746j(Object obj) {
        mo19749g(obj).m19780h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC7085n1
    /* renamed from: q */
    public boolean mo19741q(InterfaceC7032g1 interfaceC7032g1) {
        return false;
    }

    @Override // com.google.protobuf.AbstractC7085n1
    /* renamed from: r */
    /* bridge */ /* synthetic */ C7088o1 mo19740r(C7088o1 c7088o1) {
        C7088o1 c7088o12 = c7088o1;
        m19758H(c7088o12);
        return c7088o12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC7085n1
    /* renamed from: u */
    public void mo19755a(C7088o1 c7088o1, int i, int i2) {
        c7088o1.m19775m(C7118t1.m19562c(i, 5), Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC7085n1
    /* renamed from: v */
    public void mo19754b(C7088o1 c7088o1, int i, long j) {
        c7088o1.m19775m(C7118t1.m19562c(i, 1), Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC7085n1
    /* renamed from: w */
    public void mo19753c(C7088o1 c7088o1, int i, C7088o1 c7088o12) {
        c7088o1.m19775m(C7118t1.m19562c(i, 3), c7088o12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC7085n1
    /* renamed from: x */
    public void mo19752d(C7088o1 c7088o1, int i, AbstractC7039i abstractC7039i) {
        c7088o1.m19775m(C7118t1.m19562c(i, 2), abstractC7039i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC7085n1
    /* renamed from: y */
    public void mo19751e(C7088o1 c7088o1, int i, long j) {
        c7088o1.m19775m(C7118t1.m19562c(i, 0), Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC7085n1
    /* renamed from: z */
    public C7088o1 mo19750f(Object obj) {
        C7088o1 mo19749g = mo19749g(obj);
        if (mo19749g == C7088o1.m19785c()) {
            C7088o1 m19778j = C7088o1.m19778j();
            mo19742p(obj, m19778j);
            return m19778j;
        }
        return mo19749g;
    }
}

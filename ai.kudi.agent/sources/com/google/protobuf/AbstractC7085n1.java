package com.google.protobuf;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UnknownFieldSchema.java */
/* renamed from: com.google.protobuf.n1 */
/* loaded from: classes2.dex */
public abstract class AbstractC7085n1<T, B> {
    /* renamed from: a */
    abstract void mo19755a(B b, int i, int i2);

    /* renamed from: b */
    abstract void mo19754b(B b, int i, long j);

    /* renamed from: c */
    abstract void mo19753c(B b, int i, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo19752d(B b, int i, AbstractC7039i abstractC7039i);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo19751e(B b, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract B mo19750f(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract T mo19749g(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract int mo19748h(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract int mo19747i(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract void mo19746j(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract T mo19745k(T t, T t2);

    /* renamed from: l */
    final void m19795l(B b, InterfaceC7032g1 interfaceC7032g1) throws IOException {
        while (interfaceC7032g1.mo19921A() != Integer.MAX_VALUE && m19794m(b, interfaceC7032g1)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean m19794m(B b, InterfaceC7032g1 interfaceC7032g1) throws IOException {
        int tag = interfaceC7032g1.getTag();
        int m19564a = C7118t1.m19564a(tag);
        int m19563b = C7118t1.m19563b(tag);
        if (m19563b == 0) {
            mo19751e(b, m19564a, interfaceC7032g1.mo19909M());
            return true;
        } else if (m19563b == 1) {
            mo19754b(b, m19564a, interfaceC7032g1.mo19895c());
            return true;
        } else if (m19563b == 2) {
            mo19752d(b, m19564a, interfaceC7032g1.mo19916F());
            return true;
        } else if (m19563b != 3) {
            if (m19563b != 4) {
                if (m19563b == 5) {
                    mo19755a(b, m19564a, interfaceC7032g1.mo19889i());
                    return true;
                }
                throw InvalidProtocolBufferException.m20253f();
            }
            return false;
        } else {
            B mo19744n = mo19744n();
            int m19562c = C7118t1.m19562c(m19564a, 4);
            m19795l(mo19744n, interfaceC7032g1);
            if (m19562c == interfaceC7032g1.getTag()) {
                mo19753c(b, m19564a, mo19740r(mo19744n));
                return true;
            }
            throw InvalidProtocolBufferException.m20256c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public abstract B mo19744n();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public abstract void mo19743o(Object obj, B b);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public abstract void mo19742p(Object obj, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public abstract boolean mo19741q(InterfaceC7032g1 interfaceC7032g1);

    /* renamed from: r */
    abstract T mo19740r(B b);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public abstract void mo19739s(T t, InterfaceC7131u1 interfaceC7131u1) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public abstract void mo19738t(T t, InterfaceC7131u1 interfaceC7131u1) throws IOException;
}

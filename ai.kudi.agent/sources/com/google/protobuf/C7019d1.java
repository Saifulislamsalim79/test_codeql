package com.google.protobuf;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Protobuf.java */
/* renamed from: com.google.protobuf.d1 */
/* loaded from: classes2.dex */
public final class C7019d1 {

    /* renamed from: c */
    private static final C7019d1 f16781c = new C7019d1();

    /* renamed from: b */
    private final ConcurrentMap<Class<?>, InterfaceC7038h1<?>> f16783b = new ConcurrentHashMap();

    /* renamed from: a */
    private final InterfaceC7051i1 f16782a = new C7058j0();

    private C7019d1() {
    }

    /* renamed from: a */
    public static C7019d1 m20212a() {
        return f16781c;
    }

    /* renamed from: b */
    public <T> void m20211b(T t, InterfaceC7032g1 interfaceC7032g1, C7089p c7089p) throws IOException {
        m20208e(t).mo19421e(t, interfaceC7032g1, c7089p);
    }

    /* renamed from: c */
    public InterfaceC7038h1<?> m20210c(Class<?> cls, InterfaceC7038h1<?> interfaceC7038h1) {
        C6997a0.m20234b(cls, "messageType");
        C6997a0.m20234b(interfaceC7038h1, "schema");
        return this.f16783b.putIfAbsent(cls, interfaceC7038h1);
    }

    /* renamed from: d */
    public <T> InterfaceC7038h1<T> m20209d(Class<T> cls) {
        C6997a0.m20234b(cls, "messageType");
        InterfaceC7038h1<T> interfaceC7038h1 = (InterfaceC7038h1<T>) this.f16783b.get(cls);
        if (interfaceC7038h1 == null) {
            InterfaceC7038h1<T> mo19983a = this.f16782a.mo19983a(cls);
            InterfaceC7038h1<T> interfaceC7038h12 = (InterfaceC7038h1<T>) m20210c(cls, mo19983a);
            return interfaceC7038h12 != null ? interfaceC7038h12 : mo19983a;
        }
        return interfaceC7038h1;
    }

    /* renamed from: e */
    public <T> InterfaceC7038h1<T> m20208e(T t) {
        return m20209d(t.getClass());
    }
}

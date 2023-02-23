package com.google.protobuf;

import com.google.protobuf.C7064k0;
import java.util.Map;
/* compiled from: MapFieldSchemaLite.java */
/* renamed from: com.google.protobuf.n0 */
/* loaded from: classes2.dex */
class C7084n0 implements InterfaceC7079m0 {
    /* renamed from: i */
    private static <K, V> int m19797i(int i, Object obj, Object obj2) {
        C7076l0 c7076l0 = (C7076l0) obj;
        C7064k0 c7064k0 = (C7064k0) obj2;
        int i2 = 0;
        if (c7076l0.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : c7076l0.entrySet()) {
            i2 += c7064k0.m19871a(i, entry.getKey(), entry.getValue());
        }
        return i2;
    }

    /* renamed from: j */
    private static <K, V> C7076l0<K, V> m19796j(Object obj, Object obj2) {
        C7076l0<K, V> c7076l0 = (C7076l0) obj;
        C7076l0<K, V> c7076l02 = (C7076l0) obj2;
        if (!c7076l02.isEmpty()) {
            if (!c7076l0.m19827j()) {
                c7076l0 = c7076l0.m19824n();
            }
            c7076l0.m19825l(c7076l02);
        }
        return c7076l0;
    }

    @Override // com.google.protobuf.InterfaceC7079m0
    /* renamed from: a */
    public Object mo19805a(Object obj, Object obj2) {
        return m19796j(obj, obj2);
    }

    @Override // com.google.protobuf.InterfaceC7079m0
    /* renamed from: b */
    public Object mo19804b(Object obj) {
        ((C7076l0) obj).m19826k();
        return obj;
    }

    @Override // com.google.protobuf.InterfaceC7079m0
    /* renamed from: c */
    public C7064k0.C7065a<?, ?> mo19803c(Object obj) {
        return ((C7064k0) obj).m19869c();
    }

    @Override // com.google.protobuf.InterfaceC7079m0
    /* renamed from: d */
    public Map<?, ?> mo19802d(Object obj) {
        return (C7076l0) obj;
    }

    @Override // com.google.protobuf.InterfaceC7079m0
    /* renamed from: e */
    public Object mo19801e(Object obj) {
        return C7076l0.m19831e().m19824n();
    }

    @Override // com.google.protobuf.InterfaceC7079m0
    /* renamed from: f */
    public int mo19800f(int i, Object obj, Object obj2) {
        return m19797i(i, obj, obj2);
    }

    @Override // com.google.protobuf.InterfaceC7079m0
    /* renamed from: g */
    public boolean mo19799g(Object obj) {
        return !((C7076l0) obj).m19827j();
    }

    @Override // com.google.protobuf.InterfaceC7079m0
    /* renamed from: h */
    public Map<?, ?> mo19798h(Object obj) {
        return (C7076l0) obj;
    }
}

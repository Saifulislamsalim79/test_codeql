package com.google.firebase.database.p128q;

import com.google.firebase.database.p128q.InterfaceC5661h;
/* compiled from: LLRBRedValueNode.java */
/* renamed from: com.google.firebase.database.q.i */
/* loaded from: classes2.dex */
public class C5664i<K, V> extends AbstractC5665j<K, V> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5664i(K k, V v) {
        super(k, v, C5660g.m24234j(), C5660g.m24234j());
    }

    @Override // com.google.firebase.database.p128q.InterfaceC5661h
    /* renamed from: e */
    public boolean mo24233e() {
        return true;
    }

    @Override // com.google.firebase.database.p128q.AbstractC5665j
    /* renamed from: l */
    protected AbstractC5665j<K, V> mo24222l(K k, V v, InterfaceC5661h<K, V> interfaceC5661h, InterfaceC5661h<K, V> interfaceC5661h2) {
        if (k == null) {
            k = getKey();
        }
        if (v == null) {
            v = getValue();
        }
        if (interfaceC5661h == null) {
            interfaceC5661h = mo24232a();
        }
        if (interfaceC5661h2 == null) {
            interfaceC5661h2 = mo24228f();
        }
        return new C5664i(k, v, interfaceC5661h, interfaceC5661h2);
    }

    @Override // com.google.firebase.database.p128q.AbstractC5665j
    /* renamed from: n */
    protected InterfaceC5661h.EnumC5662a mo24220n() {
        return InterfaceC5661h.EnumC5662a.RED;
    }

    @Override // com.google.firebase.database.p128q.InterfaceC5661h
    public int size() {
        return mo24232a().size() + 1 + mo24228f().size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5664i(K k, V v, InterfaceC5661h<K, V> interfaceC5661h, InterfaceC5661h<K, V> interfaceC5661h2) {
        super(k, v, interfaceC5661h, interfaceC5661h2);
    }
}

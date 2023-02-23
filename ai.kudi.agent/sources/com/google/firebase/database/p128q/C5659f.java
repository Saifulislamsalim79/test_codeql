package com.google.firebase.database.p128q;

import com.google.firebase.database.p128q.InterfaceC5661h;
/* compiled from: LLRBBlackValueNode.java */
/* renamed from: com.google.firebase.database.q.f */
/* loaded from: classes2.dex */
public class C5659f<K, V> extends AbstractC5665j<K, V> {

    /* renamed from: e */
    private int f13906e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5659f(K k, V v, InterfaceC5661h<K, V> interfaceC5661h, InterfaceC5661h<K, V> interfaceC5661h2) {
        super(k, v, interfaceC5661h, interfaceC5661h2);
        this.f13906e = -1;
    }

    @Override // com.google.firebase.database.p128q.InterfaceC5661h
    /* renamed from: e */
    public boolean mo24233e() {
        return false;
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
        return new C5659f(k, v, interfaceC5661h, interfaceC5661h2);
    }

    @Override // com.google.firebase.database.p128q.AbstractC5665j
    /* renamed from: n */
    protected InterfaceC5661h.EnumC5662a mo24220n() {
        return InterfaceC5661h.EnumC5662a.BLACK;
    }

    @Override // com.google.firebase.database.p128q.InterfaceC5661h
    public int size() {
        if (this.f13906e == -1) {
            this.f13906e = mo24232a().size() + 1 + mo24228f().size();
        }
        return this.f13906e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.database.p128q.AbstractC5665j
    /* renamed from: u */
    public void mo24213u(InterfaceC5661h<K, V> interfaceC5661h) {
        if (this.f13906e == -1) {
            super.mo24213u(interfaceC5661h);
            return;
        }
        throw new IllegalStateException("Can't set left after using size");
    }
}

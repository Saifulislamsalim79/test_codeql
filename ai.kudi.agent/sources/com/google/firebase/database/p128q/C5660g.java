package com.google.firebase.database.p128q;

import com.google.firebase.database.p128q.InterfaceC5661h;
import java.util.Comparator;
/* compiled from: LLRBEmptyNode.java */
/* renamed from: com.google.firebase.database.q.g */
/* loaded from: classes2.dex */
public class C5660g<K, V> implements InterfaceC5661h<K, V> {

    /* renamed from: a */
    private static final C5660g f13907a = new C5660g();

    private C5660g() {
    }

    /* renamed from: j */
    public static <K, V> C5660g<K, V> m24234j() {
        return f13907a;
    }

    @Override // com.google.firebase.database.p128q.InterfaceC5661h
    /* renamed from: a */
    public InterfaceC5661h<K, V> mo24232a() {
        return this;
    }

    @Override // com.google.firebase.database.p128q.InterfaceC5661h
    /* renamed from: b */
    public InterfaceC5661h<K, V> mo24231b(K k, V v, Comparator<K> comparator) {
        return new C5664i(k, v);
    }

    @Override // com.google.firebase.database.p128q.InterfaceC5661h
    /* renamed from: c */
    public InterfaceC5661h<K, V> mo24230c(K k, Comparator<K> comparator) {
        return this;
    }

    @Override // com.google.firebase.database.p128q.InterfaceC5661h
    /* renamed from: d */
    public void mo24229d(InterfaceC5661h.AbstractC5663b<K, V> abstractC5663b) {
    }

    @Override // com.google.firebase.database.p128q.InterfaceC5661h
    /* renamed from: e */
    public boolean mo24233e() {
        return false;
    }

    @Override // com.google.firebase.database.p128q.InterfaceC5661h
    /* renamed from: f */
    public InterfaceC5661h<K, V> mo24228f() {
        return this;
    }

    @Override // com.google.firebase.database.p128q.InterfaceC5661h
    /* renamed from: g */
    public InterfaceC5661h<K, V> mo24227g(K k, V v, InterfaceC5661h.EnumC5662a enumC5662a, InterfaceC5661h<K, V> interfaceC5661h, InterfaceC5661h<K, V> interfaceC5661h2) {
        return this;
    }

    @Override // com.google.firebase.database.p128q.InterfaceC5661h
    public K getKey() {
        return null;
    }

    @Override // com.google.firebase.database.p128q.InterfaceC5661h
    public V getValue() {
        return null;
    }

    @Override // com.google.firebase.database.p128q.InterfaceC5661h
    /* renamed from: h */
    public InterfaceC5661h<K, V> mo24226h() {
        return this;
    }

    @Override // com.google.firebase.database.p128q.InterfaceC5661h
    /* renamed from: i */
    public InterfaceC5661h<K, V> mo24225i() {
        return this;
    }

    @Override // com.google.firebase.database.p128q.InterfaceC5661h
    public boolean isEmpty() {
        return true;
    }

    @Override // com.google.firebase.database.p128q.InterfaceC5661h
    public int size() {
        return 0;
    }
}

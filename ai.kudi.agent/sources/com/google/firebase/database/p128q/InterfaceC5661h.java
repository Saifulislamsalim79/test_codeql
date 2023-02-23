package com.google.firebase.database.p128q;

import java.util.Comparator;
/* compiled from: LLRBNode.java */
/* renamed from: com.google.firebase.database.q.h */
/* loaded from: classes2.dex */
public interface InterfaceC5661h<K, V> {

    /* compiled from: LLRBNode.java */
    /* renamed from: com.google.firebase.database.q.h$a */
    /* loaded from: classes2.dex */
    public enum EnumC5662a {
        RED,
        BLACK
    }

    /* compiled from: LLRBNode.java */
    /* renamed from: com.google.firebase.database.q.h$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC5663b<K, V> {
        /* renamed from: a */
        public abstract void mo23281a(K k, V v);
    }

    /* renamed from: a */
    InterfaceC5661h<K, V> mo24232a();

    /* renamed from: b */
    InterfaceC5661h<K, V> mo24231b(K k, V v, Comparator<K> comparator);

    /* renamed from: c */
    InterfaceC5661h<K, V> mo24230c(K k, Comparator<K> comparator);

    /* renamed from: d */
    void mo24229d(AbstractC5663b<K, V> abstractC5663b);

    /* renamed from: e */
    boolean mo24233e();

    /* renamed from: f */
    InterfaceC5661h<K, V> mo24228f();

    /* renamed from: g */
    InterfaceC5661h<K, V> mo24227g(K k, V v, EnumC5662a enumC5662a, InterfaceC5661h<K, V> interfaceC5661h, InterfaceC5661h<K, V> interfaceC5661h2);

    K getKey();

    V getValue();

    /* renamed from: h */
    InterfaceC5661h<K, V> mo24226h();

    /* renamed from: i */
    InterfaceC5661h<K, V> mo24225i();

    boolean isEmpty();

    int size();
}

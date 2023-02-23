package com.google.firebase.components;

import com.google.firebase.p170o.InterfaceC6560b;
/* compiled from: Lazy.java */
/* renamed from: com.google.firebase.components.w */
/* loaded from: classes2.dex */
public class C5315w<T> implements InterfaceC6560b<T> {

    /* renamed from: c */
    private static final Object f13154c = new Object();

    /* renamed from: a */
    private volatile Object f13155a = f13154c;

    /* renamed from: b */
    private volatile InterfaceC6560b<T> f13156b;

    public C5315w(InterfaceC6560b<T> interfaceC6560b) {
        this.f13156b = interfaceC6560b;
    }

    @Override // com.google.firebase.p170o.InterfaceC6560b
    public T get() {
        T t = (T) this.f13155a;
        if (t == f13154c) {
            synchronized (this) {
                t = this.f13155a;
                if (t == f13154c) {
                    t = this.f13156b.get();
                    this.f13155a = t;
                    this.f13156b = null;
                }
            }
        }
        return t;
    }
}

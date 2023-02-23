package com.bumptech.glide.load.p074o;

import com.bumptech.glide.load.engine.InterfaceC2087u;
import com.bumptech.glide.p086q.C2380j;
/* compiled from: SimpleResource.java */
/* renamed from: com.bumptech.glide.load.o.b */
/* loaded from: classes2.dex */
public class C2249b<T> implements InterfaceC2087u<T> {

    /* renamed from: c */
    protected final T f6589c;

    public C2249b(T t) {
        C2380j.m33129d(t);
        this.f6589c = t;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2087u
    /* renamed from: b */
    public void mo33303b() {
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2087u
    /* renamed from: c */
    public Class<T> mo33302c() {
        return (Class<T>) this.f6589c.getClass();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2087u
    public final T get() {
        return this.f6589c;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2087u
    public final int getSize() {
        return 1;
    }
}

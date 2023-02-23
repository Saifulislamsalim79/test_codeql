package com.bumptech.glide.p081n;

import com.bumptech.glide.p086q.C2379i;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p201g.p218e.C7521a;
/* compiled from: ModelToResourceClassCache.java */
/* renamed from: com.bumptech.glide.n.d */
/* loaded from: classes2.dex */
public class C2341d {

    /* renamed from: a */
    private final AtomicReference<C2379i> f6752a = new AtomicReference<>();

    /* renamed from: b */
    private final C7521a<C2379i, List<Class<?>>> f6753b = new C7521a<>();

    /* renamed from: a */
    public List<Class<?>> m33268a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        C2379i andSet = this.f6752a.getAndSet(null);
        if (andSet == null) {
            andSet = new C2379i(cls, cls2, cls3);
        } else {
            andSet.m33133a(cls, cls2, cls3);
        }
        synchronized (this.f6753b) {
            list = this.f6753b.get(andSet);
        }
        this.f6752a.set(andSet);
        return list;
    }

    /* renamed from: b */
    public void m33267b(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.f6753b) {
            this.f6753b.put(new C2379i(cls, cls2, cls3), list);
        }
    }
}

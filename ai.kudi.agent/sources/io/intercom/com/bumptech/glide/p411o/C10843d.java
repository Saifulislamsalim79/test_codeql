package io.intercom.com.bumptech.glide.p411o;

import io.intercom.com.bumptech.glide.p416r.C10891g;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p201g.p218e.C7521a;
/* compiled from: ModelToResourceClassCache.java */
/* renamed from: io.intercom.com.bumptech.glide.o.d */
/* loaded from: classes3.dex */
public class C10843d {

    /* renamed from: a */
    private final AtomicReference<C10891g> f24727a = new AtomicReference<>();

    /* renamed from: b */
    private final C7521a<C10891g, List<Class<?>>> f24728b = new C7521a<>();

    /* renamed from: a */
    public List<Class<?>> m12198a(Class<?> cls, Class<?> cls2) {
        List<Class<?>> list;
        C10891g andSet = this.f24727a.getAndSet(null);
        if (andSet == null) {
            andSet = new C10891g(cls, cls2);
        } else {
            andSet.m12019a(cls, cls2);
        }
        synchronized (this.f24728b) {
            list = this.f24728b.get(andSet);
        }
        this.f24727a.set(andSet);
        return list;
    }

    /* renamed from: b */
    public void m12197b(Class<?> cls, Class<?> cls2, List<Class<?>> list) {
        synchronized (this.f24728b) {
            this.f24728b.put(new C10891g(cls, cls2), list);
        }
    }
}

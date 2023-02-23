package com.bumptech.glide.p081n;

import com.bumptech.glide.load.engine.C2058i;
import com.bumptech.glide.load.engine.C2084s;
import com.bumptech.glide.load.p074o.p079h.C2285g;
import com.bumptech.glide.p086q.C2379i;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p201g.p218e.C7521a;
/* compiled from: LoadPathCache.java */
/* renamed from: com.bumptech.glide.n.c */
/* loaded from: classes2.dex */
public class C2340c {

    /* renamed from: c */
    private static final C2084s<?, ?, ?> f6749c = new C2084s<>(Object.class, Object.class, Object.class, Collections.singletonList(new C2058i(Object.class, Object.class, Object.class, Collections.emptyList(), new C2285g(), null)), null);

    /* renamed from: a */
    private final C7521a<C2379i, C2084s<?, ?, ?>> f6750a = new C7521a<>();

    /* renamed from: b */
    private final AtomicReference<C2379i> f6751b = new AtomicReference<>();

    /* renamed from: b */
    private C2379i m33271b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        C2379i andSet = this.f6751b.getAndSet(null);
        if (andSet == null) {
            andSet = new C2379i();
        }
        andSet.m33133a(cls, cls2, cls3);
        return andSet;
    }

    /* renamed from: a */
    public <Data, TResource, Transcode> C2084s<Data, TResource, Transcode> m33272a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C2084s<Data, TResource, Transcode> c2084s;
        C2379i m33271b = m33271b(cls, cls2, cls3);
        synchronized (this.f6750a) {
            c2084s = (C2084s<Data, TResource, Transcode>) this.f6750a.get(m33271b);
        }
        this.f6751b.set(m33271b);
        return c2084s;
    }

    /* renamed from: c */
    public boolean m33270c(C2084s<?, ?, ?> c2084s) {
        return f6749c.equals(c2084s);
    }

    /* renamed from: d */
    public void m33269d(Class<?> cls, Class<?> cls2, Class<?> cls3, C2084s<?, ?, ?> c2084s) {
        synchronized (this.f6750a) {
            C7521a<C2379i, C2084s<?, ?, ?>> c7521a = this.f6750a;
            C2379i c2379i = new C2379i(cls, cls2, cls3);
            if (c2084s == null) {
                c2084s = f6749c;
            }
            c7521a.put(c2379i, c2084s);
        }
    }
}

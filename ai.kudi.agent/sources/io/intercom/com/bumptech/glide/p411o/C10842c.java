package io.intercom.com.bumptech.glide.p411o;

import io.intercom.com.bumptech.glide.load.engine.C10566r;
import io.intercom.com.bumptech.glide.p416r.C10891g;
import java.util.concurrent.atomic.AtomicReference;
import p201g.p218e.C7521a;
/* compiled from: LoadPathCache.java */
/* renamed from: io.intercom.com.bumptech.glide.o.c */
/* loaded from: classes3.dex */
public class C10842c {

    /* renamed from: a */
    private final C7521a<C10891g, C10566r<?, ?, ?>> f24725a = new C7521a<>();

    /* renamed from: b */
    private final AtomicReference<C10891g> f24726b = new AtomicReference<>();

    /* renamed from: c */
    private C10891g m12200c(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        C10891g andSet = this.f24726b.getAndSet(null);
        if (andSet == null) {
            andSet = new C10891g();
        }
        andSet.m12018b(cls, cls2, cls3);
        return andSet;
    }

    /* renamed from: a */
    public boolean m12202a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        boolean containsKey;
        C10891g m12200c = m12200c(cls, cls2, cls3);
        synchronized (this.f24725a) {
            containsKey = this.f24725a.containsKey(m12200c);
        }
        this.f24726b.set(m12200c);
        return containsKey;
    }

    /* renamed from: b */
    public <Data, TResource, Transcode> C10566r<Data, TResource, Transcode> m12201b(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C10566r<Data, TResource, Transcode> c10566r;
        C10891g m12200c = m12200c(cls, cls2, cls3);
        synchronized (this.f24725a) {
            c10566r = (C10566r<Data, TResource, Transcode>) this.f24725a.get(m12200c);
        }
        this.f24726b.set(m12200c);
        return c10566r;
    }

    /* renamed from: d */
    public void m12199d(Class<?> cls, Class<?> cls2, Class<?> cls3, C10566r<?, ?, ?> c10566r) {
        synchronized (this.f24725a) {
            this.f24725a.put(new C10891g(cls, cls2, cls3), c10566r);
        }
    }
}

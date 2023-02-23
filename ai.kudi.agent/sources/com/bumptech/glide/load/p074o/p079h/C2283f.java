package com.bumptech.glide.load.p074o.p079h;

import java.util.ArrayList;
import java.util.List;
/* compiled from: TranscoderRegistry.java */
/* renamed from: com.bumptech.glide.load.o.h.f */
/* loaded from: classes2.dex */
public class C2283f {

    /* renamed from: a */
    private final List<C2284a<?, ?>> f6654a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TranscoderRegistry.java */
    /* renamed from: com.bumptech.glide.load.o.h.f$a */
    /* loaded from: classes2.dex */
    public static final class C2284a<Z, R> {

        /* renamed from: a */
        private final Class<Z> f6655a;

        /* renamed from: b */
        private final Class<R> f6656b;

        /* renamed from: c */
        final InterfaceC2282e<Z, R> f6657c;

        C2284a(Class<Z> cls, Class<R> cls2, InterfaceC2282e<Z, R> interfaceC2282e) {
            this.f6655a = cls;
            this.f6656b = cls2;
            this.f6657c = interfaceC2282e;
        }

        /* renamed from: a */
        public boolean m33408a(Class<?> cls, Class<?> cls2) {
            return this.f6655a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f6656b);
        }
    }

    /* renamed from: a */
    public synchronized <Z, R> InterfaceC2282e<Z, R> m33411a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C2285g.m33406b();
        }
        for (C2284a<?, ?> c2284a : this.f6654a) {
            if (c2284a.m33408a(cls, cls2)) {
                return (InterfaceC2282e<Z, R>) c2284a.f6657c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    /* renamed from: b */
    public synchronized <Z, R> List<Class<R>> m33410b(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C2284a<?, ?> c2284a : this.f6654a) {
            if (c2284a.m33408a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public synchronized <Z, R> void m33409c(Class<Z> cls, Class<R> cls2, InterfaceC2282e<Z, R> interfaceC2282e) {
        this.f6654a.add(new C2284a<>(cls, cls2, interfaceC2282e));
    }
}

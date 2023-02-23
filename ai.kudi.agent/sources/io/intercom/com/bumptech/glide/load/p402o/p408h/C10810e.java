package io.intercom.com.bumptech.glide.load.p402o.p408h;

import java.util.ArrayList;
import java.util.List;
/* compiled from: TranscoderRegistry.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.h.e */
/* loaded from: classes3.dex */
public class C10810e {

    /* renamed from: a */
    private final List<C10811a<?, ?>> f24683a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TranscoderRegistry.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.o.h.e$a */
    /* loaded from: classes3.dex */
    public static final class C10811a<Z, R> {

        /* renamed from: a */
        private final Class<Z> f24684a;

        /* renamed from: b */
        private final Class<R> f24685b;

        /* renamed from: c */
        final InterfaceC10809d<Z, R> f24686c;

        C10811a(Class<Z> cls, Class<R> cls2, InterfaceC10809d<Z, R> interfaceC10809d) {
            this.f24684a = cls;
            this.f24685b = cls2;
            this.f24686c = interfaceC10809d;
        }

        /* renamed from: a */
        public boolean m12268a(Class<?> cls, Class<?> cls2) {
            return this.f24684a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f24685b);
        }
    }

    /* renamed from: a */
    public synchronized <Z, R> InterfaceC10809d<Z, R> m12271a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C10812f.m12266b();
        }
        for (C10811a<?, ?> c10811a : this.f24683a) {
            if (c10811a.m12268a(cls, cls2)) {
                return (InterfaceC10809d<Z, R>) c10811a.f24686c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    /* renamed from: b */
    public synchronized <Z, R> List<Class<R>> m12270b(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C10811a<?, ?> c10811a : this.f24683a) {
            if (c10811a.m12268a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public synchronized <Z, R> void m12269c(Class<Z> cls, Class<R> cls2, InterfaceC10809d<Z, R> interfaceC10809d) {
        this.f24683a.add(new C10811a<>(cls, cls2, interfaceC10809d));
    }
}

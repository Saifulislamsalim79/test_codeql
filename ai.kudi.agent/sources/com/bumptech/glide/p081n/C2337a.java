package com.bumptech.glide.p081n;

import com.bumptech.glide.load.InterfaceC1996d;
import java.util.ArrayList;
import java.util.List;
/* compiled from: EncoderRegistry.java */
/* renamed from: com.bumptech.glide.n.a */
/* loaded from: classes2.dex */
public class C2337a {

    /* renamed from: a */
    private final List<C2338a<?>> f6745a = new ArrayList();

    /* compiled from: EncoderRegistry.java */
    /* renamed from: com.bumptech.glide.n.a$a */
    /* loaded from: classes2.dex */
    private static final class C2338a<T> {

        /* renamed from: a */
        private final Class<T> f6746a;

        /* renamed from: b */
        final InterfaceC1996d<T> f6747b;

        C2338a(Class<T> cls, InterfaceC1996d<T> interfaceC1996d) {
            this.f6746a = cls;
            this.f6747b = interfaceC1996d;
        }

        /* renamed from: a */
        boolean m33275a(Class<?> cls) {
            return this.f6746a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <T> void m33277a(Class<T> cls, InterfaceC1996d<T> interfaceC1996d) {
        this.f6745a.add(new C2338a<>(cls, interfaceC1996d));
    }

    /* renamed from: b */
    public synchronized <T> InterfaceC1996d<T> m33276b(Class<T> cls) {
        for (C2338a<?> c2338a : this.f6745a) {
            if (c2338a.m33275a(cls)) {
                return (InterfaceC1996d<T>) c2338a.f6747b;
            }
        }
        return null;
    }
}

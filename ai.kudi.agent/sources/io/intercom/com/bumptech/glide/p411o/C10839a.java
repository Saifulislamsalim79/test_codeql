package io.intercom.com.bumptech.glide.p411o;

import io.intercom.com.bumptech.glide.load.InterfaceC10510d;
import java.util.ArrayList;
import java.util.List;
/* compiled from: EncoderRegistry.java */
/* renamed from: io.intercom.com.bumptech.glide.o.a */
/* loaded from: classes3.dex */
public class C10839a {

    /* renamed from: a */
    private final List<C10840a<?>> f24721a = new ArrayList();

    /* compiled from: EncoderRegistry.java */
    /* renamed from: io.intercom.com.bumptech.glide.o.a$a */
    /* loaded from: classes3.dex */
    private static final class C10840a<T> {

        /* renamed from: a */
        private final Class<T> f24722a;

        /* renamed from: b */
        final InterfaceC10510d<T> f24723b;

        C10840a(Class<T> cls, InterfaceC10510d<T> interfaceC10510d) {
            this.f24722a = cls;
            this.f24723b = interfaceC10510d;
        }

        /* renamed from: a */
        boolean m12205a(Class<?> cls) {
            return this.f24722a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <T> void m12207a(Class<T> cls, InterfaceC10510d<T> interfaceC10510d) {
        this.f24721a.add(new C10840a<>(cls, interfaceC10510d));
    }

    /* renamed from: b */
    public synchronized <T> InterfaceC10510d<T> m12206b(Class<T> cls) {
        for (C10840a<?> c10840a : this.f24721a) {
            if (c10840a.m12205a(cls)) {
                return (InterfaceC10510d<T>) c10840a.f24723b;
            }
        }
        return null;
    }
}

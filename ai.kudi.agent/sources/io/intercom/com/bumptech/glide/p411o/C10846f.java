package io.intercom.com.bumptech.glide.p411o;

import io.intercom.com.bumptech.glide.load.InterfaceC10628k;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ResourceEncoderRegistry.java */
/* renamed from: io.intercom.com.bumptech.glide.o.f */
/* loaded from: classes3.dex */
public class C10846f {

    /* renamed from: a */
    private final List<C10847a<?>> f24734a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourceEncoderRegistry.java */
    /* renamed from: io.intercom.com.bumptech.glide.o.f$a */
    /* loaded from: classes3.dex */
    public static final class C10847a<T> {

        /* renamed from: a */
        private final Class<T> f24735a;

        /* renamed from: b */
        final InterfaceC10628k<T> f24736b;

        C10847a(Class<T> cls, InterfaceC10628k<T> interfaceC10628k) {
            this.f24735a = cls;
            this.f24736b = interfaceC10628k;
        }

        /* renamed from: a */
        boolean m12188a(Class<?> cls) {
            return this.f24735a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <Z> void m12190a(Class<Z> cls, InterfaceC10628k<Z> interfaceC10628k) {
        this.f24734a.add(new C10847a<>(cls, interfaceC10628k));
    }

    /* renamed from: b */
    public synchronized <Z> InterfaceC10628k<Z> m12189b(Class<Z> cls) {
        int size = this.f24734a.size();
        for (int i = 0; i < size; i++) {
            C10847a<?> c10847a = this.f24734a.get(i);
            if (c10847a.m12188a(cls)) {
                return (InterfaceC10628k<Z>) c10847a.f24736b;
            }
        }
        return null;
    }
}

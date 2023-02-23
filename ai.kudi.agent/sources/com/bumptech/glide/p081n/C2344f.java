package com.bumptech.glide.p081n;

import com.bumptech.glide.load.InterfaceC2125k;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ResourceEncoderRegistry.java */
/* renamed from: com.bumptech.glide.n.f */
/* loaded from: classes2.dex */
public class C2344f {

    /* renamed from: a */
    private final List<C2345a<?>> f6759a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourceEncoderRegistry.java */
    /* renamed from: com.bumptech.glide.n.f$a */
    /* loaded from: classes2.dex */
    public static final class C2345a<T> {

        /* renamed from: a */
        private final Class<T> f6760a;

        /* renamed from: b */
        final InterfaceC2125k<T> f6761b;

        C2345a(Class<T> cls, InterfaceC2125k<T> interfaceC2125k) {
            this.f6760a = cls;
            this.f6761b = interfaceC2125k;
        }

        /* renamed from: a */
        boolean m33258a(Class<?> cls) {
            return this.f6760a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <Z> void m33260a(Class<Z> cls, InterfaceC2125k<Z> interfaceC2125k) {
        this.f6759a.add(new C2345a<>(cls, interfaceC2125k));
    }

    /* renamed from: b */
    public synchronized <Z> InterfaceC2125k<Z> m33259b(Class<Z> cls) {
        int size = this.f6759a.size();
        for (int i = 0; i < size; i++) {
            C2345a<?> c2345a = this.f6759a.get(i);
            if (c2345a.m33258a(cls)) {
                return (InterfaceC2125k<Z>) c2345a.f6761b;
            }
        }
        return null;
    }
}

package com.bumptech.glide.load.p070m;

import com.bumptech.glide.load.p070m.InterfaceC2132e;
import com.bumptech.glide.p086q.C2380j;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: DataRewinderRegistry.java */
/* renamed from: com.bumptech.glide.load.m.f */
/* loaded from: classes2.dex */
public class C2134f {

    /* renamed from: b */
    private static final InterfaceC2132e.InterfaceC2133a<?> f6430b = new C2135a();

    /* renamed from: a */
    private final Map<Class<?>, InterfaceC2132e.InterfaceC2133a<?>> f6431a = new HashMap();

    /* compiled from: DataRewinderRegistry.java */
    /* renamed from: com.bumptech.glide.load.m.f$a */
    /* loaded from: classes2.dex */
    class C2135a implements InterfaceC2132e.InterfaceC2133a<Object> {
        C2135a() {
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2132e.InterfaceC2133a
        /* renamed from: a */
        public Class<Object> mo33489a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2132e.InterfaceC2133a
        /* renamed from: b */
        public InterfaceC2132e<Object> mo33488b(Object obj) {
            return new C2136b(obj);
        }
    }

    /* compiled from: DataRewinderRegistry.java */
    /* renamed from: com.bumptech.glide.load.m.f$b */
    /* loaded from: classes2.dex */
    private static final class C2136b implements InterfaceC2132e<Object> {

        /* renamed from: a */
        private final Object f6432a;

        C2136b(Object obj) {
            this.f6432a = obj;
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2132e
        /* renamed from: a */
        public Object mo33492a() {
            return this.f6432a;
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2132e
        /* renamed from: b */
        public void mo33491b() {
        }
    }

    /* renamed from: a */
    public synchronized <T> InterfaceC2132e<T> m33652a(T t) {
        InterfaceC2132e.InterfaceC2133a<?> interfaceC2133a;
        C2380j.m33129d(t);
        interfaceC2133a = this.f6431a.get(t.getClass());
        if (interfaceC2133a == null) {
            Iterator<InterfaceC2132e.InterfaceC2133a<?>> it = this.f6431a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC2132e.InterfaceC2133a<?> next = it.next();
                if (next.mo33489a().isAssignableFrom(t.getClass())) {
                    interfaceC2133a = next;
                    break;
                }
            }
        }
        if (interfaceC2133a == null) {
            interfaceC2133a = f6430b;
        }
        return (InterfaceC2132e<T>) interfaceC2133a.mo33488b(t);
    }

    /* renamed from: b */
    public synchronized void m33651b(InterfaceC2132e.InterfaceC2133a<?> interfaceC2133a) {
        this.f6431a.put(interfaceC2133a.mo33489a(), interfaceC2133a);
    }
}

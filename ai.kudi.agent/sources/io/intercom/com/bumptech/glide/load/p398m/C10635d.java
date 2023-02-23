package io.intercom.com.bumptech.glide.load.p398m;

import io.intercom.com.bumptech.glide.load.p398m.InterfaceC10633c;
import io.intercom.com.bumptech.glide.p416r.C10892h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: DataRewinderRegistry.java */
/* renamed from: io.intercom.com.bumptech.glide.load.m.d */
/* loaded from: classes3.dex */
public class C10635d {

    /* renamed from: b */
    private static final InterfaceC10633c.InterfaceC10634a<?> f24428b = new C10636a();

    /* renamed from: a */
    private final Map<Class<?>, InterfaceC10633c.InterfaceC10634a<?>> f24429a = new HashMap();

    /* compiled from: DataRewinderRegistry.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.m.d$a */
    /* loaded from: classes3.dex */
    static class C10636a implements InterfaceC10633c.InterfaceC10634a<Object> {
        C10636a() {
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10633c.InterfaceC10634a
        /* renamed from: a */
        public Class<Object> mo12355a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10633c.InterfaceC10634a
        /* renamed from: b */
        public InterfaceC10633c<Object> mo12354b(Object obj) {
            return new C10637b(obj);
        }
    }

    /* compiled from: DataRewinderRegistry.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.m.d$b */
    /* loaded from: classes3.dex */
    private static final class C10637b implements InterfaceC10633c<Object> {

        /* renamed from: a */
        private final Object f24430a;

        C10637b(Object obj) {
            this.f24430a = obj;
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10633c
        /* renamed from: a */
        public Object mo12358a() {
            return this.f24430a;
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10633c
        /* renamed from: b */
        public void mo12357b() {
        }
    }

    /* renamed from: a */
    public synchronized <T> InterfaceC10633c<T> m12589a(T t) {
        InterfaceC10633c.InterfaceC10634a<?> interfaceC10634a;
        C10892h.m12014d(t);
        interfaceC10634a = this.f24429a.get(t.getClass());
        if (interfaceC10634a == null) {
            Iterator<InterfaceC10633c.InterfaceC10634a<?>> it = this.f24429a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC10633c.InterfaceC10634a<?> next = it.next();
                if (next.mo12355a().isAssignableFrom(t.getClass())) {
                    interfaceC10634a = next;
                    break;
                }
            }
        }
        if (interfaceC10634a == null) {
            interfaceC10634a = f24428b;
        }
        return (InterfaceC10633c<T>) interfaceC10634a.mo12354b(t);
    }

    /* renamed from: b */
    public synchronized void m12588b(InterfaceC10633c.InterfaceC10634a<?> interfaceC10634a) {
        this.f24429a.put(interfaceC10634a.mo12355a(), interfaceC10634a);
    }
}

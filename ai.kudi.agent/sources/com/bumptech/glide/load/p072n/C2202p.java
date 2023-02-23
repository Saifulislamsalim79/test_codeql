package com.bumptech.glide.load.p072n;

import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p201g.p227h.p237k.InterfaceC7672e;
/* compiled from: ModelLoaderRegistry.java */
/* renamed from: com.bumptech.glide.load.n.p */
/* loaded from: classes2.dex */
public class C2202p {

    /* renamed from: a */
    private final C2207r f6514a;

    /* renamed from: b */
    private final C2203a f6515b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ModelLoaderRegistry.java */
    /* renamed from: com.bumptech.glide.load.n.p$a */
    /* loaded from: classes2.dex */
    public static class C2203a {

        /* renamed from: a */
        private final Map<Class<?>, C2204a<?>> f6516a = new HashMap();

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: ModelLoaderRegistry.java */
        /* renamed from: com.bumptech.glide.load.n.p$a$a */
        /* loaded from: classes2.dex */
        public static class C2204a<Model> {

            /* renamed from: a */
            final List<InterfaceC2199n<Model, ?>> f6517a;

            public C2204a(List<InterfaceC2199n<Model, ?>> list) {
                this.f6517a = list;
            }
        }

        C2203a() {
        }

        /* renamed from: a */
        public void m33549a() {
            this.f6516a.clear();
        }

        /* renamed from: b */
        public <Model> List<InterfaceC2199n<Model, ?>> m33548b(Class<Model> cls) {
            C2204a<?> c2204a = this.f6516a.get(cls);
            if (c2204a == null) {
                return null;
            }
            return (List<InterfaceC2199n<Model, ?>>) c2204a.f6517a;
        }

        /* renamed from: c */
        public <Model> void m33547c(Class<Model> cls, List<InterfaceC2199n<Model, ?>> list) {
            if (this.f6516a.put(cls, new C2204a<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public C2202p(InterfaceC7672e<List<Throwable>> interfaceC7672e) {
        this(new C2207r(interfaceC7672e));
    }

    /* renamed from: b */
    private static <A> Class<A> m33553b(A a) {
        return (Class<A>) a.getClass();
    }

    /* renamed from: e */
    private synchronized <A> List<InterfaceC2199n<A, ?>> m33550e(Class<A> cls) {
        List<InterfaceC2199n<A, ?>> m33548b;
        m33548b = this.f6515b.m33548b(cls);
        if (m33548b == null) {
            m33548b = Collections.unmodifiableList(this.f6514a.m33539e(cls));
            this.f6515b.m33547c(cls, m33548b);
        }
        return m33548b;
    }

    /* renamed from: a */
    public synchronized <Model, Data> void m33554a(Class<Model> cls, Class<Data> cls2, InterfaceC2201o<? extends Model, ? extends Data> interfaceC2201o) {
        this.f6514a.m33542b(cls, cls2, interfaceC2201o);
        this.f6515b.m33549a();
    }

    /* renamed from: c */
    public synchronized List<Class<?>> m33552c(Class<?> cls) {
        return this.f6514a.m33537g(cls);
    }

    /* renamed from: d */
    public <A> List<InterfaceC2199n<A, ?>> m33551d(A a) {
        List<InterfaceC2199n<A, ?>> m33550e = m33550e(m33553b(a));
        if (!m33550e.isEmpty()) {
            int size = m33550e.size();
            List<InterfaceC2199n<A, ?>> emptyList = Collections.emptyList();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                InterfaceC2199n<A, ?> interfaceC2199n = m33550e.get(i);
                if (interfaceC2199n.mo33500a(a)) {
                    if (z) {
                        emptyList = new ArrayList<>(size - i);
                        z = false;
                    }
                    emptyList.add(interfaceC2199n);
                }
            }
            if (emptyList.isEmpty()) {
                throw new Registry.NoModelLoaderAvailableException(a, m33550e);
            }
            return emptyList;
        }
        throw new Registry.NoModelLoaderAvailableException(a);
    }

    private C2202p(C2207r c2207r) {
        this.f6515b = new C2203a();
        this.f6514a = c2207r;
    }
}

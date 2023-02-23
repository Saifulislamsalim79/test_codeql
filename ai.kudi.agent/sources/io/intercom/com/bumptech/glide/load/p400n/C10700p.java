package io.intercom.com.bumptech.glide.load.p400n;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p201g.p227h.p237k.InterfaceC7672e;
/* compiled from: ModelLoaderRegistry.java */
/* renamed from: io.intercom.com.bumptech.glide.load.n.p */
/* loaded from: classes3.dex */
public class C10700p {

    /* renamed from: a */
    private final C10705r f24508a;

    /* renamed from: b */
    private final C10701a f24509b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ModelLoaderRegistry.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.p$a */
    /* loaded from: classes3.dex */
    public static class C10701a {

        /* renamed from: a */
        private final Map<Class<?>, C10702a<?>> f24510a = new HashMap();

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: ModelLoaderRegistry.java */
        /* renamed from: io.intercom.com.bumptech.glide.load.n.p$a$a */
        /* loaded from: classes3.dex */
        public static class C10702a<Model> {

            /* renamed from: a */
            final List<InterfaceC10697n<Model, ?>> f24511a;

            public C10702a(List<InterfaceC10697n<Model, ?>> list) {
                this.f24511a = list;
            }
        }

        C10701a() {
        }

        /* renamed from: a */
        public void m12500a() {
            this.f24510a.clear();
        }

        /* renamed from: b */
        public <Model> List<InterfaceC10697n<Model, ?>> m12499b(Class<Model> cls) {
            C10702a<?> c10702a = this.f24510a.get(cls);
            if (c10702a == null) {
                return null;
            }
            return (List<InterfaceC10697n<Model, ?>>) c10702a.f24511a;
        }

        /* renamed from: c */
        public <Model> void m12498c(Class<Model> cls, List<InterfaceC10697n<Model, ?>> list) {
            if (this.f24510a.put(cls, new C10702a<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public C10700p(InterfaceC7672e<List<Throwable>> interfaceC7672e) {
        this(new C10705r(interfaceC7672e));
    }

    /* renamed from: b */
    private static <A> Class<A> m12504b(A a) {
        return (Class<A>) a.getClass();
    }

    /* renamed from: e */
    private <A> List<InterfaceC10697n<A, ?>> m12501e(Class<A> cls) {
        List<InterfaceC10697n<A, ?>> m12499b = this.f24509b.m12499b(cls);
        if (m12499b == null) {
            List<InterfaceC10697n<A, ?>> unmodifiableList = Collections.unmodifiableList(this.f24508a.m12490e(cls));
            this.f24509b.m12498c(cls, unmodifiableList);
            return unmodifiableList;
        }
        return m12499b;
    }

    /* renamed from: a */
    public synchronized <Model, Data> void m12505a(Class<Model> cls, Class<Data> cls2, InterfaceC10699o<? extends Model, ? extends Data> interfaceC10699o) {
        this.f24508a.m12493b(cls, cls2, interfaceC10699o);
        this.f24509b.m12500a();
    }

    /* renamed from: c */
    public synchronized List<Class<?>> m12503c(Class<?> cls) {
        return this.f24508a.m12488g(cls);
    }

    /* renamed from: d */
    public synchronized <A> List<InterfaceC10697n<A, ?>> m12502d(A a) {
        ArrayList arrayList;
        List<InterfaceC10697n<A, ?>> m12501e = m12501e(m12504b(a));
        int size = m12501e.size();
        arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            InterfaceC10697n<A, ?> interfaceC10697n = m12501e.get(i);
            if (interfaceC10697n.mo12457a(a)) {
                arrayList.add(interfaceC10697n);
            }
        }
        return arrayList;
    }

    private C10700p(C10705r c10705r) {
        this.f24509b = new C10701a();
        this.f24508a = c10705r;
    }
}

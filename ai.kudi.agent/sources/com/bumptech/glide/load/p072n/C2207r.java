package com.bumptech.glide.load.p072n;

import com.bumptech.glide.Registry;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.p072n.InterfaceC2199n;
import com.bumptech.glide.p086q.C2380j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p201g.p227h.p237k.InterfaceC7672e;
/* compiled from: MultiModelLoaderFactory.java */
/* renamed from: com.bumptech.glide.load.n.r */
/* loaded from: classes2.dex */
public class C2207r {

    /* renamed from: e */
    private static final C2210c f6527e = new C2210c();

    /* renamed from: f */
    private static final InterfaceC2199n<Object, Object> f6528f = new C2208a();

    /* renamed from: a */
    private final List<C2209b<?, ?>> f6529a;

    /* renamed from: b */
    private final C2210c f6530b;

    /* renamed from: c */
    private final Set<C2209b<?, ?>> f6531c;

    /* renamed from: d */
    private final InterfaceC7672e<List<Throwable>> f6532d;

    /* compiled from: MultiModelLoaderFactory.java */
    /* renamed from: com.bumptech.glide.load.n.r$a */
    /* loaded from: classes2.dex */
    private static class C2208a implements InterfaceC2199n<Object, Object> {
        C2208a() {
        }

        @Override // com.bumptech.glide.load.p072n.InterfaceC2199n
        /* renamed from: a */
        public boolean mo33500a(Object obj) {
            return false;
        }

        @Override // com.bumptech.glide.load.p072n.InterfaceC2199n
        /* renamed from: b */
        public InterfaceC2199n.C2200a<Object> mo33499b(Object obj, int i, int i2, C2122h c2122h) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MultiModelLoaderFactory.java */
    /* renamed from: com.bumptech.glide.load.n.r$b */
    /* loaded from: classes2.dex */
    public static class C2209b<Model, Data> {

        /* renamed from: a */
        private final Class<Model> f6533a;

        /* renamed from: b */
        final Class<Data> f6534b;

        /* renamed from: c */
        final InterfaceC2201o<? extends Model, ? extends Data> f6535c;

        public C2209b(Class<Model> cls, Class<Data> cls2, InterfaceC2201o<? extends Model, ? extends Data> interfaceC2201o) {
            this.f6533a = cls;
            this.f6534b = cls2;
            this.f6535c = interfaceC2201o;
        }

        /* renamed from: a */
        public boolean m33536a(Class<?> cls) {
            return this.f6533a.isAssignableFrom(cls);
        }

        /* renamed from: b */
        public boolean m33535b(Class<?> cls, Class<?> cls2) {
            return m33536a(cls) && this.f6534b.isAssignableFrom(cls2);
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    /* renamed from: com.bumptech.glide.load.n.r$c */
    /* loaded from: classes2.dex */
    static class C2210c {
        C2210c() {
        }

        /* renamed from: a */
        public <Model, Data> C2205q<Model, Data> m33534a(List<InterfaceC2199n<Model, Data>> list, InterfaceC7672e<List<Throwable>> interfaceC7672e) {
            return new C2205q<>(list, interfaceC7672e);
        }
    }

    public C2207r(InterfaceC7672e<List<Throwable>> interfaceC7672e) {
        this(interfaceC7672e, f6527e);
    }

    /* renamed from: a */
    private <Model, Data> void m33543a(Class<Model> cls, Class<Data> cls2, InterfaceC2201o<? extends Model, ? extends Data> interfaceC2201o, boolean z) {
        C2209b<?, ?> c2209b = new C2209b<>(cls, cls2, interfaceC2201o);
        List<C2209b<?, ?>> list = this.f6529a;
        list.add(z ? list.size() : 0, c2209b);
    }

    /* renamed from: c */
    private <Model, Data> InterfaceC2199n<Model, Data> m33541c(C2209b<?, ?> c2209b) {
        InterfaceC2199n<? extends Object, ? extends Object> mo33496b = c2209b.f6535c.mo33496b(this);
        C2380j.m33129d(mo33496b);
        return (InterfaceC2199n<Model, Data>) mo33496b;
    }

    /* renamed from: f */
    private static <Model, Data> InterfaceC2199n<Model, Data> m33538f() {
        return (InterfaceC2199n<Model, Data>) f6528f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized <Model, Data> void m33542b(Class<Model> cls, Class<Data> cls2, InterfaceC2201o<? extends Model, ? extends Data> interfaceC2201o) {
        m33543a(cls, cls2, interfaceC2201o, true);
    }

    /* renamed from: d */
    public synchronized <Model, Data> InterfaceC2199n<Model, Data> m33540d(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C2209b<?, ?> c2209b : this.f6529a) {
                if (this.f6531c.contains(c2209b)) {
                    z = true;
                } else if (c2209b.m33535b(cls, cls2)) {
                    this.f6531c.add(c2209b);
                    arrayList.add(m33541c(c2209b));
                    this.f6531c.remove(c2209b);
                }
            }
            if (arrayList.size() > 1) {
                return this.f6530b.m33534a(arrayList, this.f6532d);
            } else if (arrayList.size() == 1) {
                return (InterfaceC2199n) arrayList.get(0);
            } else if (z) {
                return m33538f();
            } else {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th) {
            this.f6531c.clear();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized <Model> List<InterfaceC2199n<Model, ?>> m33539e(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C2209b<?, ?> c2209b : this.f6529a) {
                if (!this.f6531c.contains(c2209b) && c2209b.m33536a(cls)) {
                    this.f6531c.add(c2209b);
                    arrayList.add(m33541c(c2209b));
                    this.f6531c.remove(c2209b);
                }
            }
        } catch (Throwable th) {
            this.f6531c.clear();
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized List<Class<?>> m33537g(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C2209b<?, ?> c2209b : this.f6529a) {
            if (!arrayList.contains(c2209b.f6534b) && c2209b.m33536a(cls)) {
                arrayList.add(c2209b.f6534b);
            }
        }
        return arrayList;
    }

    C2207r(InterfaceC7672e<List<Throwable>> interfaceC7672e, C2210c c2210c) {
        this.f6529a = new ArrayList();
        this.f6531c = new HashSet();
        this.f6532d = interfaceC7672e;
        this.f6530b = c2210c;
    }
}

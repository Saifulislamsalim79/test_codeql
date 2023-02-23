package io.intercom.com.bumptech.glide.load.p400n;

import io.intercom.com.bumptech.glide.Registry;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n;
import io.intercom.com.bumptech.glide.p416r.C10892h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p201g.p227h.p237k.InterfaceC7672e;
/* compiled from: MultiModelLoaderFactory.java */
/* renamed from: io.intercom.com.bumptech.glide.load.n.r */
/* loaded from: classes3.dex */
public class C10705r {

    /* renamed from: e */
    private static final C10708c f24520e = new C10708c();

    /* renamed from: f */
    private static final InterfaceC10697n<Object, Object> f24521f = new C10706a();

    /* renamed from: a */
    private final List<C10707b<?, ?>> f24522a;

    /* renamed from: b */
    private final C10708c f24523b;

    /* renamed from: c */
    private final Set<C10707b<?, ?>> f24524c;

    /* renamed from: d */
    private final InterfaceC7672e<List<Throwable>> f24525d;

    /* compiled from: MultiModelLoaderFactory.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.r$a */
    /* loaded from: classes3.dex */
    private static class C10706a implements InterfaceC10697n<Object, Object> {
        C10706a() {
        }

        @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n
        /* renamed from: a */
        public boolean mo12457a(Object obj) {
            return false;
        }

        @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n
        /* renamed from: b */
        public InterfaceC10697n.C10698a<Object> mo12456b(Object obj, int i, int i2, C10626i c10626i) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MultiModelLoaderFactory.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.r$b */
    /* loaded from: classes3.dex */
    public static class C10707b<Model, Data> {

        /* renamed from: a */
        private final Class<Model> f24526a;

        /* renamed from: b */
        final Class<Data> f24527b;

        /* renamed from: c */
        final InterfaceC10699o<? extends Model, ? extends Data> f24528c;

        public C10707b(Class<Model> cls, Class<Data> cls2, InterfaceC10699o<? extends Model, ? extends Data> interfaceC10699o) {
            this.f24526a = cls;
            this.f24527b = cls2;
            this.f24528c = interfaceC10699o;
        }

        /* renamed from: a */
        public boolean m12487a(Class<?> cls) {
            return this.f24526a.isAssignableFrom(cls);
        }

        /* renamed from: b */
        public boolean m12486b(Class<?> cls, Class<?> cls2) {
            return m12487a(cls) && this.f24527b.isAssignableFrom(cls2);
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.r$c */
    /* loaded from: classes3.dex */
    static class C10708c {
        C10708c() {
        }

        /* renamed from: a */
        public <Model, Data> C10703q<Model, Data> m12485a(List<InterfaceC10697n<Model, Data>> list, InterfaceC7672e<List<Throwable>> interfaceC7672e) {
            return new C10703q<>(list, interfaceC7672e);
        }
    }

    public C10705r(InterfaceC7672e<List<Throwable>> interfaceC7672e) {
        this(interfaceC7672e, f24520e);
    }

    /* renamed from: a */
    private <Model, Data> void m12494a(Class<Model> cls, Class<Data> cls2, InterfaceC10699o<? extends Model, ? extends Data> interfaceC10699o, boolean z) {
        C10707b<?, ?> c10707b = new C10707b<>(cls, cls2, interfaceC10699o);
        List<C10707b<?, ?>> list = this.f24522a;
        list.add(z ? list.size() : 0, c10707b);
    }

    /* renamed from: c */
    private <Model, Data> InterfaceC10697n<Model, Data> m12492c(C10707b<?, ?> c10707b) {
        InterfaceC10697n<? extends Object, ? extends Object> mo12453b = c10707b.f24528c.mo12453b(this);
        C10892h.m12014d(mo12453b);
        return (InterfaceC10697n<Model, Data>) mo12453b;
    }

    /* renamed from: f */
    private static <Model, Data> InterfaceC10697n<Model, Data> m12489f() {
        return (InterfaceC10697n<Model, Data>) f24521f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized <Model, Data> void m12493b(Class<Model> cls, Class<Data> cls2, InterfaceC10699o<? extends Model, ? extends Data> interfaceC10699o) {
        m12494a(cls, cls2, interfaceC10699o, true);
    }

    /* renamed from: d */
    public synchronized <Model, Data> InterfaceC10697n<Model, Data> m12491d(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C10707b<?, ?> c10707b : this.f24522a) {
                if (this.f24524c.contains(c10707b)) {
                    z = true;
                } else if (c10707b.m12486b(cls, cls2)) {
                    this.f24524c.add(c10707b);
                    arrayList.add(m12492c(c10707b));
                    this.f24524c.remove(c10707b);
                }
            }
            if (arrayList.size() > 1) {
                return this.f24523b.m12485a(arrayList, this.f24525d);
            } else if (arrayList.size() == 1) {
                return (InterfaceC10697n) arrayList.get(0);
            } else if (z) {
                return m12489f();
            } else {
                throw new Registry.NoModelLoaderAvailableException(cls, cls2);
            }
        } catch (Throwable th) {
            this.f24524c.clear();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized <Model> List<InterfaceC10697n<Model, ?>> m12490e(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C10707b<?, ?> c10707b : this.f24522a) {
                if (!this.f24524c.contains(c10707b) && c10707b.m12487a(cls)) {
                    this.f24524c.add(c10707b);
                    arrayList.add(m12492c(c10707b));
                    this.f24524c.remove(c10707b);
                }
            }
        } catch (Throwable th) {
            this.f24524c.clear();
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized List<Class<?>> m12488g(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C10707b<?, ?> c10707b : this.f24522a) {
            if (!arrayList.contains(c10707b.f24527b) && c10707b.m12487a(cls)) {
                arrayList.add(c10707b.f24527b);
            }
        }
        return arrayList;
    }

    C10705r(InterfaceC7672e<List<Throwable>> interfaceC7672e, C10708c c10708c) {
        this.f24522a = new ArrayList();
        this.f24524c = new HashSet();
        this.f24525d = interfaceC7672e;
        this.f24523b = c10708c;
    }
}

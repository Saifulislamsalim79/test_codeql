package com.google.firebase.components;

import android.util.Log;
import com.google.firebase.components.C5306s;
import com.google.firebase.p165k.InterfaceC6468a;
import com.google.firebase.p167m.InterfaceC6472c;
import com.google.firebase.p167m.InterfaceC6473d;
import com.google.firebase.p170o.InterfaceC6558a;
import com.google.firebase.p170o.InterfaceC6560b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ComponentRuntime.java */
/* renamed from: com.google.firebase.components.s */
/* loaded from: classes2.dex */
public class C5306s extends AbstractC5295m implements InterfaceC6468a {

    /* renamed from: g */
    private static final InterfaceC6560b<Set<Object>> f13133g = C5294l.f13117a;

    /* renamed from: a */
    private final Map<C5296n<?>, InterfaceC6560b<?>> f13134a;

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC6560b<?>> f13135b;

    /* renamed from: c */
    private final Map<Class<?>, C5316x<?>> f13136c;

    /* renamed from: d */
    private final List<InterfaceC6560b<InterfaceC5305r>> f13137d;

    /* renamed from: e */
    private final C5314v f13138e;

    /* renamed from: f */
    private final AtomicReference<Boolean> f13139f;

    /* compiled from: ComponentRuntime.java */
    /* renamed from: com.google.firebase.components.s$b */
    /* loaded from: classes2.dex */
    public static final class C5308b {

        /* renamed from: a */
        private final Executor f13140a;

        /* renamed from: b */
        private final List<InterfaceC6560b<InterfaceC5305r>> f13141b = new ArrayList();

        /* renamed from: c */
        private final List<C5296n<?>> f13142c = new ArrayList();

        C5308b(Executor executor) {
            this.f13140a = executor;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e */
        public static /* synthetic */ InterfaceC5305r m25178e(InterfaceC5305r interfaceC5305r) {
            return interfaceC5305r;
        }

        /* renamed from: a */
        public C5308b m25182a(C5296n<?> c5296n) {
            this.f13142c.add(c5296n);
            return this;
        }

        /* renamed from: b */
        public C5308b m25181b(final InterfaceC5305r interfaceC5305r) {
            this.f13141b.add(new InterfaceC6560b() { // from class: com.google.firebase.components.d
                @Override // com.google.firebase.p170o.InterfaceC6560b
                public final Object get() {
                    return C5306s.C5308b.m25178e(InterfaceC5305r.this);
                }
            });
            return this;
        }

        /* renamed from: c */
        public C5308b m25180c(Collection<InterfaceC6560b<InterfaceC5305r>> collection) {
            this.f13141b.addAll(collection);
            return this;
        }

        /* renamed from: d */
        public C5306s m25179d() {
            return new C5306s(this.f13140a, this.f13141b, this.f13142c);
        }
    }

    /* renamed from: f */
    public static C5308b m25194f(Executor executor) {
        return new C5308b(executor);
    }

    /* renamed from: g */
    private void m25193g(List<C5296n<?>> list) {
        ArrayList<Runnable> arrayList = new ArrayList();
        synchronized (this) {
            Iterator<InterfaceC6560b<InterfaceC5305r>> it = this.f13137d.iterator();
            while (it.hasNext()) {
                try {
                    InterfaceC5305r interfaceC5305r = it.next().get();
                    if (interfaceC5305r != null) {
                        list.addAll(interfaceC5305r.getComponents());
                        it.remove();
                    }
                } catch (InvalidRegistrarException e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            if (this.f13134a.isEmpty()) {
                C5309t.m25177a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f13134a.keySet());
                arrayList2.addAll(list);
                C5309t.m25177a(arrayList2);
            }
            for (final C5296n<?> c5296n : list) {
                this.f13134a.put(c5296n, new C5315w(new InterfaceC6560b() { // from class: com.google.firebase.components.e
                    @Override // com.google.firebase.p170o.InterfaceC6560b
                    public final Object get() {
                        return C5306s.this.m25189k(c5296n);
                    }
                }));
            }
            arrayList.addAll(m25184p(list));
            arrayList.addAll(m25183q());
            m25185o();
        }
        for (Runnable runnable : arrayList) {
            runnable.run();
        }
        m25186n();
    }

    /* renamed from: h */
    private void m25192h(Map<C5296n<?>, InterfaceC6560b<?>> map, boolean z) {
        for (Map.Entry<C5296n<?>, InterfaceC6560b<?>> entry : map.entrySet()) {
            C5296n<?> key = entry.getKey();
            InterfaceC6560b<?> value = entry.getValue();
            if (key.m25221i() || (key.m25220j() && z)) {
                value.get();
            }
        }
        this.f13138e.m25154c();
    }

    /* renamed from: j */
    private static <T> List<T> m25190j(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            arrayList.add(t);
        }
        return arrayList;
    }

    /* renamed from: n */
    private void m25186n() {
        Boolean bool = this.f13139f.get();
        if (bool != null) {
            m25192h(this.f13134a, bool.booleanValue());
        }
    }

    /* renamed from: o */
    private void m25185o() {
        for (C5296n<?> c5296n : this.f13134a.keySet()) {
            for (C5313u c5313u : c5296n.m25227c()) {
                if (c5313u.m25160g() && !this.f13136c.containsKey(c5313u.m25164c())) {
                    this.f13136c.put(c5313u.m25164c(), C5316x.m25149b(Collections.emptySet()));
                } else if (this.f13135b.containsKey(c5313u.m25164c())) {
                    continue;
                } else if (!c5313u.m25161f()) {
                    if (!c5313u.m25160g()) {
                        this.f13135b.put(c5313u.m25164c(), C5317y.m25146b());
                    }
                } else {
                    throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", c5296n, c5313u.m25164c()));
                }
            }
        }
    }

    /* renamed from: p */
    private List<Runnable> m25184p(List<C5296n<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (C5296n<?> c5296n : list) {
            if (c5296n.m25219k()) {
                final InterfaceC6560b<?> interfaceC6560b = this.f13134a.get(c5296n);
                for (Class<? super Object> cls : c5296n.m25225e()) {
                    if (!this.f13135b.containsKey(cls)) {
                        this.f13135b.put(cls, interfaceC6560b);
                    } else {
                        final C5317y c5317y = (C5317y) this.f13135b.get(cls);
                        arrayList.add(new Runnable() { // from class: com.google.firebase.components.f
                            @Override // java.lang.Runnable
                            public final void run() {
                                C5317y.this.m25141g(interfaceC6560b);
                            }
                        });
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: q */
    private List<Runnable> m25183q() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry<C5296n<?>, InterfaceC6560b<?>> entry : this.f13134a.entrySet()) {
            C5296n<?> key = entry.getKey();
            if (!key.m25219k()) {
                InterfaceC6560b<?> value = entry.getValue();
                for (Class<? super Object> cls : key.m25225e()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!this.f13136c.containsKey(entry2.getKey())) {
                this.f13136c.put((Class) entry2.getKey(), C5316x.m25149b((Collection) entry2.getValue()));
            } else {
                final C5316x<?> c5316x = this.f13136c.get(entry2.getKey());
                for (final InterfaceC6560b interfaceC6560b : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: com.google.firebase.components.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5316x.this.m25150a(interfaceC6560b);
                        }
                    });
                }
            }
        }
        return arrayList;
    }

    @Override // com.google.firebase.components.InterfaceC5299o
    /* renamed from: b */
    public synchronized <T> InterfaceC6560b<T> mo25197b(Class<T> cls) {
        C5318z.m25138c(cls, "Null interface requested.");
        return (InterfaceC6560b<T>) this.f13135b.get(cls);
    }

    @Override // com.google.firebase.components.InterfaceC5299o
    /* renamed from: c */
    public synchronized <T> InterfaceC6560b<Set<T>> mo25196c(Class<T> cls) {
        C5316x<?> c5316x = this.f13136c.get(cls);
        if (c5316x != null) {
            return c5316x;
        }
        return (InterfaceC6560b<Set<T>>) f13133g;
    }

    @Override // com.google.firebase.components.InterfaceC5299o
    /* renamed from: e */
    public <T> InterfaceC6558a<T> mo25195e(Class<T> cls) {
        InterfaceC6560b<T> mo25197b = mo25197b(cls);
        if (mo25197b == null) {
            return C5317y.m25146b();
        }
        if (mo25197b instanceof C5317y) {
            return (C5317y) mo25197b;
        }
        return C5317y.m25142f(mo25197b);
    }

    /* renamed from: i */
    public void m25191i(boolean z) {
        HashMap hashMap;
        if (this.f13139f.compareAndSet(null, Boolean.valueOf(z))) {
            synchronized (this) {
                hashMap = new HashMap(this.f13134a);
            }
            m25192h(hashMap, z);
        }
    }

    /* renamed from: k */
    public /* synthetic */ Object m25189k(C5296n c5296n) {
        return c5296n.m25226d().mo20385a(new C5282a0(c5296n, this));
    }

    private C5306s(Executor executor, Iterable<InterfaceC6560b<InterfaceC5305r>> iterable, Collection<C5296n<?>> collection) {
        this.f13134a = new HashMap();
        this.f13135b = new HashMap();
        this.f13136c = new HashMap();
        this.f13139f = new AtomicReference<>();
        this.f13138e = new C5314v(executor);
        ArrayList arrayList = new ArrayList();
        arrayList.add(C5296n.m25216n(this.f13138e, C5314v.class, InterfaceC6473d.class, InterfaceC6472c.class));
        arrayList.add(C5296n.m25216n(this, InterfaceC6468a.class, new Class[0]));
        for (C5296n<?> c5296n : collection) {
            if (c5296n != null) {
                arrayList.add(c5296n);
            }
        }
        this.f13137d = m25190j(iterable);
        m25193g(arrayList);
    }
}

package io.intercom.com.bumptech.glide.load.engine.p396y;

import android.util.Log;
import io.intercom.com.bumptech.glide.p416r.C10892h;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
/* compiled from: LruArrayPool.java */
/* renamed from: io.intercom.com.bumptech.glide.load.engine.y.j */
/* loaded from: classes3.dex */
public final class C10587j implements InterfaceC10576b {

    /* renamed from: a */
    private final C10584h<C10588a, Object> f24355a = new C10584h<>();

    /* renamed from: b */
    private final C10589b f24356b = new C10589b();

    /* renamed from: c */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f24357c = new HashMap();

    /* renamed from: d */
    private final Map<Class<?>, InterfaceC10575a<?>> f24358d = new HashMap();

    /* renamed from: e */
    private final int f24359e;

    /* renamed from: f */
    private int f24360f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LruArrayPool.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.y.j$a */
    /* loaded from: classes3.dex */
    public static final class C10588a implements InterfaceC10594m {

        /* renamed from: a */
        private final C10589b f24361a;

        /* renamed from: b */
        int f24362b;

        /* renamed from: c */
        private Class<?> f24363c;

        C10588a(C10589b c10589b) {
            this.f24361a = c10589b;
        }

        @Override // io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10594m
        /* renamed from: a */
        public void mo12647a() {
            this.f24361a.m12707c(this);
        }

        /* renamed from: b */
        void m12674b(int i, Class<?> cls) {
            this.f24362b = i;
            this.f24363c = cls;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C10588a) {
                C10588a c10588a = (C10588a) obj;
                return this.f24362b == c10588a.f24362b && this.f24363c == c10588a.f24363c;
            }
            return false;
        }

        public int hashCode() {
            int i = this.f24362b * 31;
            Class<?> cls = this.f24363c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f24362b + "array=" + this.f24363c + '}';
        }
    }

    /* compiled from: LruArrayPool.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.y.j$b */
    /* loaded from: classes3.dex */
    private static final class C10589b extends AbstractC10580d<C10588a> {
        C10589b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.intercom.com.bumptech.glide.load.engine.p396y.AbstractC10580d
        /* renamed from: d */
        public C10588a mo12645a() {
            return new C10588a(this);
        }

        /* renamed from: e */
        C10588a m12672e(int i, Class<?> cls) {
            C10588a m12708b = m12708b();
            m12708b.m12674b(i, cls);
            return m12708b;
        }
    }

    public C10587j(int i) {
        this.f24359e = i;
    }

    /* renamed from: f */
    private void m12685f(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> m12678m = m12678m(cls);
        Integer num = (Integer) m12678m.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                m12678m.remove(Integer.valueOf(i));
                return;
            } else {
                m12678m.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    /* renamed from: g */
    private void m12684g() {
        m12683h(this.f24359e);
    }

    /* renamed from: h */
    private void m12683h(int i) {
        while (this.f24360f > i) {
            Object m12699f = this.f24355a.m12699f();
            C10892h.m12014d(m12699f);
            InterfaceC10575a m12682i = m12682i(m12699f);
            this.f24360f -= m12682i.mo12693b(m12699f) * m12682i.mo12694a();
            m12685f(m12682i.mo12693b(m12699f), m12699f.getClass());
            if (Log.isLoggable(m12682i.getTag(), 2)) {
                Log.v(m12682i.getTag(), "evicted: " + m12682i.mo12693b(m12699f));
            }
        }
    }

    /* renamed from: i */
    private <T> InterfaceC10575a<T> m12682i(T t) {
        return m12681j(t.getClass());
    }

    /* renamed from: j */
    private <T> InterfaceC10575a<T> m12681j(Class<T> cls) {
        C10586i c10586i = (InterfaceC10575a<T>) this.f24358d.get(cls);
        if (c10586i == null) {
            if (cls.equals(int[].class)) {
                c10586i = new C10586i();
            } else if (cls.equals(byte[].class)) {
                c10586i = new C10583g();
            } else {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.f24358d.put(cls, c10586i);
        }
        return c10586i;
    }

    /* renamed from: k */
    private <T> T m12680k(C10588a c10588a) {
        return (T) this.f24355a.m12704a(c10588a);
    }

    /* renamed from: l */
    private <T> T m12679l(C10588a c10588a, Class<T> cls) {
        InterfaceC10575a<T> m12681j = m12681j(cls);
        T t = (T) m12680k(c10588a);
        if (t != null) {
            this.f24360f -= m12681j.mo12693b(t) * m12681j.mo12694a();
            m12685f(m12681j.mo12693b(t), cls);
        }
        if (t == null) {
            if (Log.isLoggable(m12681j.getTag(), 2)) {
                Log.v(m12681j.getTag(), "Allocated " + c10588a.f24362b + " bytes");
            }
            return m12681j.newArray(c10588a.f24362b);
        }
        return t;
    }

    /* renamed from: m */
    private NavigableMap<Integer, Integer> m12678m(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f24357c.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.f24357c.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    /* renamed from: n */
    private boolean m12677n() {
        int i = this.f24360f;
        return i == 0 || this.f24359e / i >= 2;
    }

    /* renamed from: o */
    private boolean m12676o(int i) {
        return i <= this.f24359e / 2;
    }

    /* renamed from: p */
    private boolean m12675p(int i, Integer num) {
        return num != null && (m12677n() || num.intValue() <= i * 8);
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10576b
    /* renamed from: a */
    public synchronized void mo12690a(int i) {
        try {
            if (i >= 40) {
                mo12689b();
            } else if (i >= 20) {
                m12683h(this.f24359e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10576b
    /* renamed from: b */
    public synchronized void mo12689b() {
        m12683h(0);
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10576b
    /* renamed from: c */
    public synchronized <T> T mo12688c(int i, Class<T> cls) {
        return (T) m12679l(this.f24356b.m12672e(i, cls), cls);
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10576b
    /* renamed from: d */
    public synchronized <T> void mo12687d(T t) {
        Class<?> cls = t.getClass();
        InterfaceC10575a<T> m12681j = m12681j(cls);
        int mo12693b = m12681j.mo12693b(t);
        int mo12694a = m12681j.mo12694a() * mo12693b;
        if (m12676o(mo12694a)) {
            C10588a m12672e = this.f24356b.m12672e(mo12693b, cls);
            this.f24355a.m12701d(m12672e, t);
            NavigableMap<Integer, Integer> m12678m = m12678m(cls);
            Integer num = (Integer) m12678m.get(Integer.valueOf(m12672e.f24362b));
            Integer valueOf = Integer.valueOf(m12672e.f24362b);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            m12678m.put(valueOf, Integer.valueOf(i));
            this.f24360f += mo12694a;
            m12684g();
        }
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10576b
    /* renamed from: e */
    public synchronized <T> T mo12686e(int i, Class<T> cls) {
        C10588a m12672e;
        Integer ceilingKey = m12678m(cls).ceilingKey(Integer.valueOf(i));
        if (m12675p(i, ceilingKey)) {
            m12672e = this.f24356b.m12672e(ceilingKey.intValue(), cls);
        } else {
            m12672e = this.f24356b.m12672e(i, cls);
        }
        return (T) m12679l(m12672e, cls);
    }
}

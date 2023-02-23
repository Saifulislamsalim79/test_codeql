package com.bumptech.glide.load.engine.p069z;

import android.util.Log;
import com.bumptech.glide.p086q.C2380j;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
/* compiled from: LruArrayPool.java */
/* renamed from: com.bumptech.glide.load.engine.z.j */
/* loaded from: classes2.dex */
public final class C2106j implements InterfaceC2095b {

    /* renamed from: a */
    private final C2103h<C2107a, Object> f6382a = new C2103h<>();

    /* renamed from: b */
    private final C2108b f6383b = new C2108b();

    /* renamed from: c */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f6384c = new HashMap();

    /* renamed from: d */
    private final Map<Class<?>, InterfaceC2094a<?>> f6385d = new HashMap();

    /* renamed from: e */
    private final int f6386e;

    /* renamed from: f */
    private int f6387f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LruArrayPool.java */
    /* renamed from: com.bumptech.glide.load.engine.z.j$a */
    /* loaded from: classes2.dex */
    public static final class C2107a implements InterfaceC2113m {

        /* renamed from: a */
        private final C2108b f6388a;

        /* renamed from: b */
        int f6389b;

        /* renamed from: c */
        private Class<?> f6390c;

        C2107a(C2108b c2108b) {
            this.f6388a = c2108b;
        }

        @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2113m
        /* renamed from: a */
        public void mo33673a() {
            this.f6388a.m33735c(this);
        }

        /* renamed from: b */
        void m33702b(int i, Class<?> cls) {
            this.f6389b = i;
            this.f6390c = cls;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C2107a) {
                C2107a c2107a = (C2107a) obj;
                return this.f6389b == c2107a.f6389b && this.f6390c == c2107a.f6390c;
            }
            return false;
        }

        public int hashCode() {
            int i = this.f6389b * 31;
            Class<?> cls = this.f6390c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f6389b + "array=" + this.f6390c + '}';
        }
    }

    /* compiled from: LruArrayPool.java */
    /* renamed from: com.bumptech.glide.load.engine.z.j$b */
    /* loaded from: classes2.dex */
    private static final class C2108b extends AbstractC2099d<C2107a> {
        C2108b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.load.engine.p069z.AbstractC2099d
        /* renamed from: d */
        public C2107a mo33671a() {
            return new C2107a(this);
        }

        /* renamed from: e */
        C2107a m33700e(int i, Class<?> cls) {
            C2107a m33736b = m33736b();
            m33736b.m33702b(i, cls);
            return m33736b;
        }
    }

    public C2106j(int i) {
        this.f6386e = i;
    }

    /* renamed from: f */
    private void m33713f(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> m33706m = m33706m(cls);
        Integer num = (Integer) m33706m.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                m33706m.remove(Integer.valueOf(i));
                return;
            } else {
                m33706m.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    /* renamed from: g */
    private void m33712g() {
        m33711h(this.f6386e);
    }

    /* renamed from: h */
    private void m33711h(int i) {
        while (this.f6387f > i) {
            Object m33727f = this.f6382a.m33727f();
            C2380j.m33129d(m33727f);
            InterfaceC2094a m33710i = m33710i(m33727f);
            this.f6387f -= m33710i.mo33721b(m33727f) * m33710i.mo33722a();
            m33713f(m33710i.mo33721b(m33727f), m33727f.getClass());
            if (Log.isLoggable(m33710i.getTag(), 2)) {
                Log.v(m33710i.getTag(), "evicted: " + m33710i.mo33721b(m33727f));
            }
        }
    }

    /* renamed from: i */
    private <T> InterfaceC2094a<T> m33710i(T t) {
        return m33709j(t.getClass());
    }

    /* renamed from: j */
    private <T> InterfaceC2094a<T> m33709j(Class<T> cls) {
        C2105i c2105i = (InterfaceC2094a<T>) this.f6385d.get(cls);
        if (c2105i == null) {
            if (cls.equals(int[].class)) {
                c2105i = new C2105i();
            } else if (cls.equals(byte[].class)) {
                c2105i = new C2102g();
            } else {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.f6385d.put(cls, c2105i);
        }
        return c2105i;
    }

    /* renamed from: k */
    private <T> T m33708k(C2107a c2107a) {
        return (T) this.f6382a.m33732a(c2107a);
    }

    /* renamed from: l */
    private <T> T m33707l(C2107a c2107a, Class<T> cls) {
        InterfaceC2094a<T> m33709j = m33709j(cls);
        T t = (T) m33708k(c2107a);
        if (t != null) {
            this.f6387f -= m33709j.mo33721b(t) * m33709j.mo33722a();
            m33713f(m33709j.mo33721b(t), cls);
        }
        if (t == null) {
            if (Log.isLoggable(m33709j.getTag(), 2)) {
                Log.v(m33709j.getTag(), "Allocated " + c2107a.f6389b + " bytes");
            }
            return m33709j.newArray(c2107a.f6389b);
        }
        return t;
    }

    /* renamed from: m */
    private NavigableMap<Integer, Integer> m33706m(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f6384c.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.f6384c.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    /* renamed from: n */
    private boolean m33705n() {
        int i = this.f6387f;
        return i == 0 || this.f6386e / i >= 2;
    }

    /* renamed from: o */
    private boolean m33704o(int i) {
        return i <= this.f6386e / 2;
    }

    /* renamed from: p */
    private boolean m33703p(int i, Integer num) {
        return num != null && (m33705n() || num.intValue() <= i * 8);
    }

    @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2095b
    /* renamed from: a */
    public synchronized void mo33718a(int i) {
        try {
            if (i >= 40) {
                mo33717b();
            } else if (i >= 20 || i == 15) {
                m33711h(this.f6386e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2095b
    /* renamed from: b */
    public synchronized void mo33717b() {
        m33711h(0);
    }

    @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2095b
    /* renamed from: c */
    public synchronized <T> T mo33716c(int i, Class<T> cls) {
        return (T) m33707l(this.f6383b.m33700e(i, cls), cls);
    }

    @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2095b
    /* renamed from: d */
    public synchronized <T> void mo33715d(T t) {
        Class<?> cls = t.getClass();
        InterfaceC2094a<T> m33709j = m33709j(cls);
        int mo33721b = m33709j.mo33721b(t);
        int mo33722a = m33709j.mo33722a() * mo33721b;
        if (m33704o(mo33722a)) {
            C2107a m33700e = this.f6383b.m33700e(mo33721b, cls);
            this.f6382a.m33729d(m33700e, t);
            NavigableMap<Integer, Integer> m33706m = m33706m(cls);
            Integer num = (Integer) m33706m.get(Integer.valueOf(m33700e.f6389b));
            Integer valueOf = Integer.valueOf(m33700e.f6389b);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            m33706m.put(valueOf, Integer.valueOf(i));
            this.f6387f += mo33722a;
            m33712g();
        }
    }

    @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2095b
    /* renamed from: e */
    public synchronized <T> T mo33714e(int i, Class<T> cls) {
        C2107a m33700e;
        Integer ceilingKey = m33706m(cls).ceilingKey(Integer.valueOf(i));
        if (m33703p(i, ceilingKey)) {
            m33700e = this.f6383b.m33700e(ceilingKey.intValue(), cls);
        } else {
            m33700e = this.f6383b.m33700e(i, cls);
        }
        return (T) m33707l(m33700e, cls);
    }
}

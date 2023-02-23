package com.bumptech.glide.load.engine.p069z;

import com.bumptech.glide.load.engine.p069z.InterfaceC2113m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: GroupedLinkedMap.java */
/* renamed from: com.bumptech.glide.load.engine.z.h */
/* loaded from: classes2.dex */
class C2103h<K extends InterfaceC2113m, V> {

    /* renamed from: a */
    private final C2104a<K, V> f6376a = new C2104a<>();

    /* renamed from: b */
    private final Map<K, C2104a<K, V>> f6377b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GroupedLinkedMap.java */
    /* renamed from: com.bumptech.glide.load.engine.z.h$a */
    /* loaded from: classes2.dex */
    public static class C2104a<K, V> {

        /* renamed from: a */
        final K f6378a;

        /* renamed from: b */
        private List<V> f6379b;

        /* renamed from: c */
        C2104a<K, V> f6380c;

        /* renamed from: d */
        C2104a<K, V> f6381d;

        C2104a() {
            this(null);
        }

        /* renamed from: a */
        public void m33725a(V v) {
            if (this.f6379b == null) {
                this.f6379b = new ArrayList();
            }
            this.f6379b.add(v);
        }

        /* renamed from: b */
        public V m33724b() {
            int m33723c = m33723c();
            if (m33723c > 0) {
                return this.f6379b.remove(m33723c - 1);
            }
            return null;
        }

        /* renamed from: c */
        public int m33723c() {
            List<V> list = this.f6379b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        C2104a(K k) {
            this.f6381d = this;
            this.f6380c = this;
            this.f6378a = k;
        }
    }

    /* renamed from: b */
    private void m33731b(C2104a<K, V> c2104a) {
        m33728e(c2104a);
        C2104a<K, V> c2104a2 = this.f6376a;
        c2104a.f6381d = c2104a2;
        c2104a.f6380c = c2104a2.f6380c;
        m33726g(c2104a);
    }

    /* renamed from: c */
    private void m33730c(C2104a<K, V> c2104a) {
        m33728e(c2104a);
        C2104a<K, V> c2104a2 = this.f6376a;
        c2104a.f6381d = c2104a2.f6381d;
        c2104a.f6380c = c2104a2;
        m33726g(c2104a);
    }

    /* renamed from: e */
    private static <K, V> void m33728e(C2104a<K, V> c2104a) {
        C2104a<K, V> c2104a2 = c2104a.f6381d;
        c2104a2.f6380c = c2104a.f6380c;
        c2104a.f6380c.f6381d = c2104a2;
    }

    /* renamed from: g */
    private static <K, V> void m33726g(C2104a<K, V> c2104a) {
        c2104a.f6380c.f6381d = c2104a;
        c2104a.f6381d.f6380c = c2104a;
    }

    /* renamed from: a */
    public V m33732a(K k) {
        C2104a<K, V> c2104a = this.f6377b.get(k);
        if (c2104a == null) {
            c2104a = new C2104a<>(k);
            this.f6377b.put(k, c2104a);
        } else {
            k.mo33673a();
        }
        m33731b(c2104a);
        return c2104a.m33724b();
    }

    /* renamed from: d */
    public void m33729d(K k, V v) {
        C2104a<K, V> c2104a = this.f6377b.get(k);
        if (c2104a == null) {
            c2104a = new C2104a<>(k);
            m33730c(c2104a);
            this.f6377b.put(k, c2104a);
        } else {
            k.mo33673a();
        }
        c2104a.m33725a(v);
    }

    /* renamed from: f */
    public V m33727f() {
        for (C2104a c2104a = this.f6376a.f6381d; !c2104a.equals(this.f6376a); c2104a = c2104a.f6381d) {
            V v = (V) c2104a.m33724b();
            if (v != null) {
                return v;
            }
            m33728e(c2104a);
            this.f6377b.remove(c2104a.f6378a);
            ((InterfaceC2113m) c2104a.f6378a).mo33673a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (C2104a c2104a = this.f6376a.f6380c; !c2104a.equals(this.f6376a); c2104a = c2104a.f6380c) {
            z = true;
            sb.append('{');
            sb.append(c2104a.f6378a);
            sb.append(':');
            sb.append(c2104a.m33723c());
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}

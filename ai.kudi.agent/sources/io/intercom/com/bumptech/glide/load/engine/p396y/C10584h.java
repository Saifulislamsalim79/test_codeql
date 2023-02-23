package io.intercom.com.bumptech.glide.load.engine.p396y;

import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10594m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: GroupedLinkedMap.java */
/* renamed from: io.intercom.com.bumptech.glide.load.engine.y.h */
/* loaded from: classes3.dex */
class C10584h<K extends InterfaceC10594m, V> {

    /* renamed from: a */
    private final C10585a<K, V> f24349a = new C10585a<>();

    /* renamed from: b */
    private final Map<K, C10585a<K, V>> f24350b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GroupedLinkedMap.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.y.h$a */
    /* loaded from: classes3.dex */
    public static class C10585a<K, V> {

        /* renamed from: a */
        final K f24351a;

        /* renamed from: b */
        private List<V> f24352b;

        /* renamed from: c */
        C10585a<K, V> f24353c;

        /* renamed from: d */
        C10585a<K, V> f24354d;

        C10585a() {
            this(null);
        }

        /* renamed from: a */
        public void m12697a(V v) {
            if (this.f24352b == null) {
                this.f24352b = new ArrayList();
            }
            this.f24352b.add(v);
        }

        /* renamed from: b */
        public V m12696b() {
            int m12695c = m12695c();
            if (m12695c > 0) {
                return this.f24352b.remove(m12695c - 1);
            }
            return null;
        }

        /* renamed from: c */
        public int m12695c() {
            List<V> list = this.f24352b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        C10585a(K k) {
            this.f24354d = this;
            this.f24353c = this;
            this.f24351a = k;
        }
    }

    /* renamed from: b */
    private void m12703b(C10585a<K, V> c10585a) {
        m12700e(c10585a);
        C10585a<K, V> c10585a2 = this.f24349a;
        c10585a.f24354d = c10585a2;
        c10585a.f24353c = c10585a2.f24353c;
        m12698g(c10585a);
    }

    /* renamed from: c */
    private void m12702c(C10585a<K, V> c10585a) {
        m12700e(c10585a);
        C10585a<K, V> c10585a2 = this.f24349a;
        c10585a.f24354d = c10585a2.f24354d;
        c10585a.f24353c = c10585a2;
        m12698g(c10585a);
    }

    /* renamed from: e */
    private static <K, V> void m12700e(C10585a<K, V> c10585a) {
        C10585a<K, V> c10585a2 = c10585a.f24354d;
        c10585a2.f24353c = c10585a.f24353c;
        c10585a.f24353c.f24354d = c10585a2;
    }

    /* renamed from: g */
    private static <K, V> void m12698g(C10585a<K, V> c10585a) {
        c10585a.f24353c.f24354d = c10585a;
        c10585a.f24354d.f24353c = c10585a;
    }

    /* renamed from: a */
    public V m12704a(K k) {
        C10585a<K, V> c10585a = this.f24350b.get(k);
        if (c10585a == null) {
            c10585a = new C10585a<>(k);
            this.f24350b.put(k, c10585a);
        } else {
            k.mo12647a();
        }
        m12703b(c10585a);
        return c10585a.m12696b();
    }

    /* renamed from: d */
    public void m12701d(K k, V v) {
        C10585a<K, V> c10585a = this.f24350b.get(k);
        if (c10585a == null) {
            c10585a = new C10585a<>(k);
            m12702c(c10585a);
            this.f24350b.put(k, c10585a);
        } else {
            k.mo12647a();
        }
        c10585a.m12697a(v);
    }

    /* renamed from: f */
    public V m12699f() {
        for (C10585a c10585a = this.f24349a.f24354d; !c10585a.equals(this.f24349a); c10585a = c10585a.f24354d) {
            V v = (V) c10585a.m12696b();
            if (v != null) {
                return v;
            }
            m12700e(c10585a);
            this.f24350b.remove(c10585a.f24351a);
            ((InterfaceC10594m) c10585a.f24351a).mo12647a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (C10585a c10585a = this.f24349a.f24353c; !c10585a.equals(this.f24349a); c10585a = c10585a.f24353c) {
            z = true;
            sb.append('{');
            sb.append(c10585a.f24351a);
            sb.append(':');
            sb.append(c10585a.m12695c());
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}

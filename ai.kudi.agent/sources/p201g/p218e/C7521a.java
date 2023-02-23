package p201g.p218e;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: ArrayMap.java */
/* renamed from: g.e.a */
/* loaded from: classes2.dex */
public class C7521a<K, V> extends C7534g<K, V> implements Map<K, V> {

    /* renamed from: z */
    AbstractC7528f<K, V> f17859z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArrayMap.java */
    /* renamed from: g.e.a$a */
    /* loaded from: classes2.dex */
    public class C7522a extends AbstractC7528f<K, V> {
        C7522a() {
        }

        @Override // p201g.p218e.AbstractC7528f
        /* renamed from: a */
        protected void mo18480a() {
            C7521a.this.clear();
        }

        @Override // p201g.p218e.AbstractC7528f
        /* renamed from: b */
        protected Object mo18479b(int i, int i2) {
            return C7521a.this.f17908d[(i << 1) + i2];
        }

        @Override // p201g.p218e.AbstractC7528f
        /* renamed from: c */
        protected Map<K, V> mo18478c() {
            return C7521a.this;
        }

        @Override // p201g.p218e.AbstractC7528f
        /* renamed from: d */
        protected int mo18477d() {
            return C7521a.this.f17909e;
        }

        @Override // p201g.p218e.AbstractC7528f
        /* renamed from: e */
        protected int mo18476e(Object obj) {
            return C7521a.this.m18455h(obj);
        }

        @Override // p201g.p218e.AbstractC7528f
        /* renamed from: f */
        protected int mo18475f(Object obj) {
            return C7521a.this.m18453j(obj);
        }

        @Override // p201g.p218e.AbstractC7528f
        /* renamed from: g */
        protected void mo18474g(K k, V v) {
            C7521a.this.put(k, v);
        }

        @Override // p201g.p218e.AbstractC7528f
        /* renamed from: h */
        protected void mo18473h(int i) {
            C7521a.this.mo18450m(i);
        }

        @Override // p201g.p218e.AbstractC7528f
        /* renamed from: i */
        protected V mo18472i(int i, V v) {
            return C7521a.this.mo18449n(i, v);
        }
    }

    public C7521a() {
    }

    /* renamed from: p */
    private AbstractC7528f<K, V> m18520p() {
        if (this.f17859z == null) {
            this.f17859z = new C7522a();
        }
        return this.f17859z;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return m18520p().m18469l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return m18520p().m18468m();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m18458c(this.f17909e + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: q */
    public boolean m18519q(Collection<?> collection) {
        return AbstractC7528f.m18465p(this, collection);
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return m18520p().m18467n();
    }

    public C7521a(int i) {
        super(i);
    }

    public C7521a(C7534g c7534g) {
        super(c7534g);
    }
}

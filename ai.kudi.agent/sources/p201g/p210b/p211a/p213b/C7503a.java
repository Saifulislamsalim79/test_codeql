package p201g.p210b.p211a.p213b;

import java.util.HashMap;
import java.util.Map;
import p201g.p210b.p211a.p213b.C7504b;
/* compiled from: FastSafeIterableMap.java */
/* renamed from: g.b.a.b.a */
/* loaded from: classes2.dex */
public class C7503a<K, V> extends C7504b<K, V> {

    /* renamed from: w */
    private HashMap<K, C7504b.C7507c<K, V>> f17838w = new HashMap<>();

    public boolean contains(K k) {
        return this.f17838w.containsKey(k);
    }

    @Override // p201g.p210b.p211a.p213b.C7504b
    /* renamed from: e */
    protected C7504b.C7507c<K, V> mo18539e(K k) {
        return this.f17838w.get(k);
    }

    @Override // p201g.p210b.p211a.p213b.C7504b
    /* renamed from: l */
    public V mo18535l(K k, V v) {
        C7504b.C7507c<K, V> mo18539e = mo18539e(k);
        if (mo18539e != null) {
            return mo18539e.f17844d;
        }
        this.f17838w.put(k, m18536k(k, v));
        return null;
    }

    @Override // p201g.p210b.p211a.p213b.C7504b
    /* renamed from: m */
    public V mo18534m(K k) {
        V v = (V) super.mo18534m(k);
        this.f17838w.remove(k);
        return v;
    }

    /* renamed from: s */
    public Map.Entry<K, V> m18541s(K k) {
        if (contains(k)) {
            return this.f17838w.get(k).f17846f;
        }
        return null;
    }
}

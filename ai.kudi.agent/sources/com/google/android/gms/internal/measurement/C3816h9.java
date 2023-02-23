package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.h9 */
/* loaded from: classes2.dex */
public final class C3816h9<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: d */
    private static final C3816h9 f9387d;

    /* renamed from: c */
    private boolean f9388c;

    static {
        C3816h9 c3816h9 = new C3816h9();
        f9387d = c3816h9;
        c3816h9.f9388c = false;
    }

    private C3816h9() {
        this.f9388c = true;
    }

    /* renamed from: a */
    public static <K, V> C3816h9<K, V> m29554a() {
        return f9387d;
    }

    /* renamed from: h */
    private static int m29549h(Object obj) {
        if (obj instanceof byte[]) {
            return C4004t8.m28908b((byte[]) obj);
        }
        return obj.hashCode();
    }

    /* renamed from: i */
    private final void m29548i() {
        if (!this.f9388c) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public final C3816h9<K, V> m29553b() {
        return isEmpty() ? new C3816h9<>() : new C3816h9<>(this);
    }

    /* renamed from: c */
    public final void m29552c() {
        this.f9388c = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m29548i();
        super.clear();
    }

    /* renamed from: e */
    public final void m29551e(C3816h9<K, V> c3816h9) {
        m29548i();
        if (c3816h9.isEmpty()) {
            return;
        }
        putAll(c3816h9);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this == map) {
                return true;
            }
            if (size() != map.size()) {
                return false;
            }
            for (Map.Entry<K, V> entry : entrySet()) {
                if (!map.containsKey(entry.getKey())) {
                    return false;
                }
                V value = entry.getValue();
                Object obj2 = map.get(entry.getKey());
                if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                    equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                    continue;
                } else {
                    equals = value.equals(obj2);
                    continue;
                }
                if (!equals) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean m29550g() {
        return this.f9388c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i += m29549h(entry.getValue()) ^ m29549h(entry.getKey());
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        m29548i();
        C4004t8.m28905e(k);
        C4004t8.m28905e(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        m29548i();
        for (K k : map.keySet()) {
            C4004t8.m28905e(k);
            C4004t8.m28905e(map.get(k));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        m29548i();
        return (V) super.remove(obj);
    }

    private C3816h9(Map<K, V> map) {
        super(map);
        this.f9388c = true;
    }
}

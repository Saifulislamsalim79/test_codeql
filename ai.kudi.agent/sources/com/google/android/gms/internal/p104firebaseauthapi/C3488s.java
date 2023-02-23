package com.google.android.gms.internal.p104firebaseauthapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.s */
/* loaded from: classes2.dex */
public final class C3488s<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: d */
    private static final C3488s f8927d;

    /* renamed from: c */
    private boolean f8928c;

    static {
        C3488s c3488s = new C3488s();
        f8927d = c3488s;
        c3488s.f8928c = false;
    }

    private C3488s() {
        this.f8928c = true;
    }

    /* renamed from: a */
    public static <K, V> C3488s<K, V> m30303a() {
        return f8927d;
    }

    /* renamed from: h */
    private static int m30298h(Object obj) {
        if (obj instanceof byte[]) {
            return C3117e.m31224b((byte[]) obj);
        }
        if (!(obj instanceof InterfaceC3305kp)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: i */
    private final void m30297i() {
        if (!this.f8928c) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public final C3488s<K, V> m30302b() {
        return isEmpty() ? new C3488s<>() : new C3488s<>(this);
    }

    /* renamed from: c */
    public final void m30301c() {
        this.f8928c = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m30297i();
        super.clear();
    }

    /* renamed from: e */
    public final void m30300e(C3488s<K, V> c3488s) {
        m30297i();
        if (c3488s.isEmpty()) {
            return;
        }
        putAll(c3488s);
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
    public final boolean m30299g() {
        return this.f8928c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i += m30298h(entry.getValue()) ^ m30298h(entry.getKey());
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        m30297i();
        C3117e.m31221e(k);
        C3117e.m31221e(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        m30297i();
        for (K k : map.keySet()) {
            C3117e.m31221e(k);
            C3117e.m31221e(map.get(k));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        m30297i();
        return (V) super.remove(obj);
    }

    private C3488s(Map<K, V> map) {
        super(map);
        this.f8928c = true;
    }
}

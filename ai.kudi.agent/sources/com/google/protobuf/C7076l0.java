package com.google.protobuf;

import com.google.protobuf.C6997a0;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: MapFieldLite.java */
/* renamed from: com.google.protobuf.l0 */
/* loaded from: classes2.dex */
public final class C7076l0<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: d */
    private static final C7076l0 f16898d;

    /* renamed from: c */
    private boolean f16899c;

    static {
        C7076l0 c7076l0 = new C7076l0();
        f16898d = c7076l0;
        c7076l0.m19826k();
    }

    private C7076l0() {
        this.f16899c = true;
    }

    /* renamed from: a */
    static <K, V> int m19834a(Map<K, V> map) {
        int i = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            i += m19833b(entry.getValue()) ^ m19833b(entry.getKey());
        }
        return i;
    }

    /* renamed from: b */
    private static int m19833b(Object obj) {
        if (obj instanceof byte[]) {
            return C6997a0.m20232d((byte[]) obj);
        }
        if (!(obj instanceof C6997a0.InterfaceC7000c)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    private static void m19832c(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            C6997a0.m20235a(obj);
            C6997a0.m20235a(map.get(obj));
        }
    }

    /* renamed from: e */
    public static <K, V> C7076l0<K, V> m19831e() {
        return f16898d;
    }

    /* renamed from: g */
    private void m19830g() {
        if (!m19827j()) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: h */
    private static boolean m19829h(Object obj, Object obj2) {
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        return obj.equals(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <K, V> boolean m19828i(java.util.Map<K, V> r4, java.util.Map<K, V> r5) {
        /*
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            int r1 = r4.size()
            int r2 = r5.size()
            r3 = 0
            if (r1 == r2) goto L10
            return r3
        L10:
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L18:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L42
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            boolean r2 = r5.containsKey(r2)
            if (r2 != 0) goto L2f
            return r3
        L2f:
            java.lang.Object r2 = r1.getValue()
            java.lang.Object r1 = r1.getKey()
            java.lang.Object r1 = r5.get(r1)
            boolean r1 = m19829h(r2, r1)
            if (r1 != 0) goto L18
            return r3
        L42:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7076l0.m19828i(java.util.Map, java.util.Map):boolean");
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        m19830g();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && m19828i(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return m19834a(this);
    }

    /* renamed from: j */
    public boolean m19827j() {
        return this.f16899c;
    }

    /* renamed from: k */
    public void m19826k() {
        this.f16899c = false;
    }

    /* renamed from: l */
    public void m19825l(C7076l0<K, V> c7076l0) {
        m19830g();
        if (c7076l0.isEmpty()) {
            return;
        }
        putAll(c7076l0);
    }

    /* renamed from: n */
    public C7076l0<K, V> m19824n() {
        return isEmpty() ? new C7076l0<>() : new C7076l0<>(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        m19830g();
        C6997a0.m20235a(k);
        C6997a0.m20235a(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m19830g();
        m19832c(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m19830g();
        return (V) super.remove(obj);
    }

    private C7076l0(Map<K, V> map) {
        super(map);
        this.f16899c = true;
    }
}

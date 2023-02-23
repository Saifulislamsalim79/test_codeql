package kotlin.p557z;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C13287o;
import kotlin.e0.d.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Maps.kt */
/* renamed from: kotlin.z.r0 */
/* loaded from: classes3.dex */
public class C13727r0 extends C13725q0 {
    /* renamed from: k */
    public static <K, V> Map<K, V> m3881k() {
        C13688c0 c13688c0 = C13688c0.f30148c;
        if (c13688c0 != null) {
            return c13688c0;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<K, V>");
    }

    /* renamed from: l */
    public static <K, V> V m3880l(Map<K, ? extends V> map, K k) {
        l.f(map, "$this$getValue");
        return (V) C13721o0.m3992a(map, k);
    }

    /* renamed from: m */
    public static <K, V> HashMap<K, V> m3879m(C13287o<? extends K, ? extends V>... c13287oArr) {
        int m3898f;
        l.f(c13287oArr, "pairs");
        m3898f = C13725q0.m3898f(c13287oArr.length);
        HashMap<K, V> hashMap = new HashMap<>(m3898f);
        m3873s(hashMap, c13287oArr);
        return hashMap;
    }

    /* renamed from: n */
    public static <K, V> Map<K, V> m3878n(C13287o<? extends K, ? extends V>... c13287oArr) {
        Map<K, V> m3881k;
        int m3898f;
        l.f(c13287oArr, "pairs");
        if (c13287oArr.length <= 0) {
            m3881k = m3881k();
            return m3881k;
        }
        m3898f = C13725q0.m3898f(c13287oArr.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m3898f);
        m3869w(c13287oArr, linkedHashMap);
        return linkedHashMap;
    }

    /* renamed from: o */
    public static <K, V> Map<K, V> m3877o(C13287o<? extends K, ? extends V>... c13287oArr) {
        int m3898f;
        l.f(c13287oArr, "pairs");
        m3898f = C13725q0.m3898f(c13287oArr.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m3898f);
        m3873s(linkedHashMap, c13287oArr);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public static final <K, V> Map<K, V> m3876p(Map<K, ? extends V> map) {
        Map<K, V> m3881k;
        l.f(map, "$this$optimizeReadOnlyMap");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? map : C13725q0.m3896h(map);
        }
        m3881k = m3881k();
        return m3881k;
    }

    /* renamed from: q */
    public static <K, V> Map<K, V> m3875q(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        l.f(map, "$this$plus");
        l.f(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* renamed from: r */
    public static final <K, V> void m3874r(Map<? super K, ? super V> map, Iterable<? extends C13287o<? extends K, ? extends V>> iterable) {
        l.f(map, "$this$putAll");
        l.f(iterable, "pairs");
        for (C13287o<? extends K, ? extends V> c13287o : iterable) {
            map.put((K) c13287o.m5366a(), (V) c13287o.m5365b());
        }
    }

    /* renamed from: s */
    public static final <K, V> void m3873s(Map<? super K, ? super V> map, C13287o<? extends K, ? extends V>[] c13287oArr) {
        l.f(map, "$this$putAll");
        l.f(c13287oArr, "pairs");
        for (C13287o<? extends K, ? extends V> c13287o : c13287oArr) {
            map.put((K) c13287o.m5366a(), (V) c13287o.m5365b());
        }
    }

    /* renamed from: t */
    public static <K, V> Map<K, V> m3872t(Iterable<? extends C13287o<? extends K, ? extends V>> iterable) {
        Map<K, V> m3881k;
        Map<K, V> m3897g;
        int m3898f;
        l.f(iterable, "$this$toMap");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                m3881k = m3881k();
                return m3881k;
            } else if (size != 1) {
                m3898f = C13725q0.m3898f(collection.size());
                LinkedHashMap linkedHashMap = new LinkedHashMap(m3898f);
                m3871u(iterable, linkedHashMap);
                return linkedHashMap;
            } else {
                m3897g = C13725q0.m3897g(iterable instanceof List ? (C13287o<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
                return m3897g;
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        m3871u(iterable, linkedHashMap2);
        return m3876p(linkedHashMap2);
    }

    /* renamed from: u */
    public static final <K, V, M extends Map<? super K, ? super V>> M m3871u(Iterable<? extends C13287o<? extends K, ? extends V>> iterable, M m) {
        l.f(iterable, "$this$toMap");
        l.f(m, "destination");
        m3874r(m, iterable);
        return m;
    }

    /* renamed from: v */
    public static <K, V> Map<K, V> m3870v(Map<? extends K, ? extends V> map) {
        Map<K, V> m3881k;
        Map<K, V> m3868x;
        l.f(map, "$this$toMap");
        int size = map.size();
        if (size == 0) {
            m3881k = m3881k();
            return m3881k;
        } else if (size != 1) {
            m3868x = m3868x(map);
            return m3868x;
        } else {
            return C13725q0.m3896h(map);
        }
    }

    /* renamed from: w */
    public static final <K, V, M extends Map<? super K, ? super V>> M m3869w(C13287o<? extends K, ? extends V>[] c13287oArr, M m) {
        l.f(c13287oArr, "$this$toMap");
        l.f(m, "destination");
        m3873s(m, c13287oArr);
        return m;
    }

    /* renamed from: x */
    public static <K, V> Map<K, V> m3868x(Map<? extends K, ? extends V> map) {
        l.f(map, "$this$toMutableMap");
        return new LinkedHashMap(map);
    }
}

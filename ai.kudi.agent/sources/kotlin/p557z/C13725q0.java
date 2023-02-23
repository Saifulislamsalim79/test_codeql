package kotlin.p557z;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.C13287o;
import kotlin.e0.d.l;
import kotlin.p557z.p558b1.C13677c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MapsJVM.kt */
/* renamed from: kotlin.z.q0 */
/* loaded from: classes3.dex */
public class C13725q0 extends C13723p0 {
    /* renamed from: d */
    public static <K, V> Map<K, V> m3900d(Map<K, V> map) {
        l.f(map, "builder");
        C13677c c13677c = (C13677c) map;
        c13677c.m4190k();
        return c13677c;
    }

    /* renamed from: e */
    public static <K, V> Map<K, V> m3899e() {
        return new C13677c();
    }

    /* renamed from: f */
    public static int m3898f(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: g */
    public static <K, V> Map<K, V> m3897g(C13287o<? extends K, ? extends V> c13287o) {
        l.f(c13287o, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(c13287o.m5364c(), c13287o.m5363d());
        l.e(singletonMap, "java.util.Collections.si…(pair.first, pair.second)");
        return singletonMap;
    }

    /* renamed from: h */
    public static final <K, V> Map<K, V> m3896h(Map<? extends K, ? extends V> map) {
        l.f(map, "$this$toSingletonMap");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        l.e(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    /* renamed from: i */
    public static <K extends Comparable<? super K>, V> SortedMap<K, V> m3895i(Map<? extends K, ? extends V> map) {
        l.f(map, "$this$toSortedMap");
        return new TreeMap(map);
    }

    /* renamed from: j */
    public static <K, V> SortedMap<K, V> m3894j(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        l.f(map, "$this$toSortedMap");
        l.f(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}

package kotlin.reflect.jvm.internal.impl.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.e0.d.l;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13724q;
import kotlin.p557z.C13726r;
/* compiled from: collections.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.utils.a */
/* loaded from: classes3.dex */
public final class C13634a {
    /* renamed from: a */
    public static final <T> void m4287a(Collection<T> collection, T t) {
        l.f(collection, "<this>");
        if (t != null) {
            collection.add(t);
        }
    }

    /* renamed from: b */
    private static final int m4286b(int i) {
        if (i < 3) {
            return 3;
        }
        return i + (i / 3) + 1;
    }

    /* renamed from: c */
    public static final <T> List<T> m4285c(ArrayList<T> arrayList) {
        List<T> m3891e;
        List<T> m3901b;
        l.f(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            m3891e = C13726r.m3891e();
            return m3891e;
        } else if (size != 1) {
            arrayList.trimToSize();
            return arrayList;
        } else {
            m3901b = C13724q.m3901b(C13722p.m3954R(arrayList));
            return m3901b;
        }
    }

    /* renamed from: d */
    public static final <K> Map<K, Integer> m4284d(Iterable<? extends K> iterable) {
        l.f(iterable, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (K k : iterable) {
            linkedHashMap.put(k, Integer.valueOf(i));
            i++;
        }
        return linkedHashMap;
    }

    /* renamed from: e */
    public static final <K, V> HashMap<K, V> m4283e(int i) {
        return new HashMap<>(m4286b(i));
    }

    /* renamed from: f */
    public static final <E> HashSet<E> m4282f(int i) {
        return new HashSet<>(m4286b(i));
    }

    /* renamed from: g */
    public static final <E> LinkedHashSet<E> m4281g(int i) {
        return new LinkedHashSet<>(m4286b(i));
    }
}

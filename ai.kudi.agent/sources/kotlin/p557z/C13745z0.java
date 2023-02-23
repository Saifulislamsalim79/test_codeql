package kotlin.p557z;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.e0.d.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Sets.kt */
/* renamed from: kotlin.z.z0 */
/* loaded from: classes3.dex */
public class C13745z0 extends C13741y0 {
    /* renamed from: g */
    public static <T> Set<T> m3770g(Set<? extends T> set, Iterable<? extends T> iterable) {
        l.f(set, "$this$minus");
        l.f(iterable, "elements");
        Collection<?> m3865q = C13728s.m3865q(iterable, set);
        if (m3865q.isEmpty()) {
            return C13722p.m3968F0(set);
        }
        if (m3865q instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (T t : set) {
                if (!m3865q.contains(t)) {
                    linkedHashSet.add(t);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(m3865q);
        return linkedHashSet2;
    }

    /* renamed from: h */
    public static <T> Set<T> m3769h(Set<? extends T> set, Iterable<? extends T> iterable) {
        int size;
        l.f(set, "$this$plus");
        l.f(iterable, "elements");
        Integer m3866p = C13728s.m3866p(iterable);
        if (m3866p != null) {
            size = set.size() + m3866p.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C13721o0.m3987f(size));
        linkedHashSet.addAll(set);
        C13722p.m3910v(linkedHashSet, iterable);
        return linkedHashSet;
    }

    /* renamed from: i */
    public static <T> Set<T> m3768i(Set<? extends T> set, T t) {
        l.f(set, "$this$plus");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C13721o0.m3987f(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t);
        return linkedHashSet;
    }
}

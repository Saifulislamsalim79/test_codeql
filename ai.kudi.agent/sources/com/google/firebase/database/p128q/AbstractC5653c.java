package com.google.firebase.database.p128q;

import com.google.firebase.database.p128q.InterfaceC5661h;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ImmutableSortedMap.java */
/* renamed from: com.google.firebase.database.q.c */
/* loaded from: classes2.dex */
public abstract class AbstractC5653c<K, V> implements Iterable<Map.Entry<K, V>> {

    /* compiled from: ImmutableSortedMap.java */
    /* renamed from: com.google.firebase.database.q.c$a */
    /* loaded from: classes2.dex */
    public static class C5654a {

        /* renamed from: a */
        private static final InterfaceC5655a f13901a = C5650a.f13893a;

        /* compiled from: ImmutableSortedMap.java */
        /* renamed from: com.google.firebase.database.q.c$a$a */
        /* loaded from: classes2.dex */
        public interface InterfaceC5655a<C, D> {
            /* renamed from: a */
            D mo24242a(C c);
        }

        /* renamed from: a */
        public static <A, B, C> AbstractC5653c<A, C> m24247a(List<A> list, Map<B, C> map, InterfaceC5655a<A, B> interfaceC5655a, Comparator<A> comparator) {
            if (list.size() < 25) {
                return C5651b.m24255J(list, map, interfaceC5655a, comparator);
            }
            return C5666k.m24212E(list, map, interfaceC5655a, comparator);
        }

        /* renamed from: b */
        public static <K, V> AbstractC5653c<K, V> m24246b(Comparator<K> comparator) {
            return new C5651b(comparator);
        }

        /* renamed from: c */
        public static <A, B> AbstractC5653c<A, B> m24245c(Map<A, B> map, Comparator<A> comparator) {
            if (map.size() < 25) {
                return C5651b.m24252V(map, comparator);
            }
            return C5666k.m24211F(map, comparator);
        }

        /* renamed from: d */
        public static <A> InterfaceC5655a<A, A> m24244d() {
            return f13901a;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e */
        public static /* synthetic */ Object m24243e(Object obj) {
            return obj;
        }
    }

    /* renamed from: a0 */
    public abstract Iterator<Map.Entry<K, V>> mo24209a0();

    /* renamed from: d */
    public abstract boolean mo24208d(K k);

    /* renamed from: e */
    public abstract V mo24207e(K k);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC5653c) {
            AbstractC5653c abstractC5653c = (AbstractC5653c) obj;
            if (mo24206f().equals(abstractC5653c.mo24206f()) && size() == abstractC5653c.size()) {
                Iterator<Map.Entry<K, V>> it = iterator();
                Iterator<Map.Entry<K, V>> it2 = abstractC5653c.iterator();
                while (it.hasNext()) {
                    if (!it.next().equals(it2.next())) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public abstract Comparator<K> mo24206f();

    /* renamed from: h */
    public abstract K mo24205h();

    public int hashCode() {
        int hashCode = mo24206f().hashCode();
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            hashCode = (hashCode * 31) + it.next().hashCode();
        }
        return hashCode;
    }

    public abstract boolean isEmpty();

    @Override // java.lang.Iterable
    public abstract Iterator<Map.Entry<K, V>> iterator();

    /* renamed from: k */
    public abstract K mo24204k();

    /* renamed from: l */
    public abstract K mo24203l(K k);

    /* renamed from: m */
    public abstract void mo24202m(InterfaceC5661h.AbstractC5663b<K, V> abstractC5663b);

    /* renamed from: s */
    public abstract AbstractC5653c<K, V> mo24201s(K k, V v);

    public abstract int size();

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        Iterator<Map.Entry<K, V>> it = iterator();
        boolean z = true;
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append("(");
            sb.append(next.getKey());
            sb.append("=>");
            sb.append(next.getValue());
            sb.append(")");
        }
        sb.append("};");
        return sb.toString();
    }

    /* renamed from: u */
    public abstract AbstractC5653c<K, V> mo24200u(K k);
}

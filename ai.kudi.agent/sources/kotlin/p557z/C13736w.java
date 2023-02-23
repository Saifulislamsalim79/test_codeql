package kotlin.p557z;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.C11782b0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MutableCollections.kt */
/* renamed from: kotlin.z.w */
/* loaded from: classes3.dex */
public class C13736w extends C13734v {
    /* renamed from: A */
    public static final <T> boolean m3851A(Collection<? super T> collection, Iterable<? extends T> iterable) {
        l.f(collection, "$this$retainAll");
        l.f(iterable, "elements");
        return C11782b0.m10350a(collection).retainAll(C13728s.m3865q(iterable, collection));
    }

    /* renamed from: v */
    public static <T> boolean m3850v(Collection<? super T> collection, Iterable<? extends T> iterable) {
        l.f(collection, "$this$addAll");
        l.f(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (collection.add((T) it.next())) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: w */
    public static <T> boolean m3849w(Collection<? super T> collection, T[] tArr) {
        List m4067d;
        l.f(collection, "$this$addAll");
        l.f(tArr, "elements");
        m4067d = C13712m.m4067d(tArr);
        return collection.addAll(m4067d);
    }

    /* renamed from: x */
    private static final <T> boolean m3848x(Iterable<? extends T> iterable, InterfaceC11767l<? super T, Boolean> interfaceC11767l, boolean z) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (interfaceC11767l.invoke((T) it.next()).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    /* renamed from: y */
    private static final <T> boolean m3847y(List<T> list, InterfaceC11767l<? super T, Boolean> interfaceC11767l, boolean z) {
        int m3889g;
        int i;
        int m3889g2;
        if (!(list instanceof RandomAccess)) {
            if (list != null) {
                return m3848x(C11782b0.m10349b(list), interfaceC11767l, z);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableIterable<T>");
        }
        m3889g = C13726r.m3889g(list);
        if (m3889g >= 0) {
            int i2 = 0;
            i = 0;
            while (true) {
                T t = list.get(i2);
                if (interfaceC11767l.invoke(t).booleanValue() != z) {
                    if (i != i2) {
                        list.set(i, t);
                    }
                    i++;
                }
                if (i2 == m3889g) {
                    break;
                }
                i2++;
            }
        } else {
            i = 0;
        }
        if (i >= list.size()) {
            return false;
        }
        m3889g2 = C13726r.m3889g(list);
        if (m3889g2 < i) {
            return true;
        }
        while (true) {
            list.remove(m3889g2);
            if (m3889g2 == i) {
                return true;
            }
            m3889g2--;
        }
    }

    /* renamed from: z */
    public static <T> boolean m3846z(List<T> list, InterfaceC11767l<? super T, Boolean> interfaceC11767l) {
        l.f(list, "$this$removeAll");
        l.f(interfaceC11767l, "predicate");
        return m3847y(list, interfaceC11767l, true);
    }
}

package kotlin.p557z;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p491i0.C11841h;
import kotlin.p548k0.InterfaceC13230h;
import kotlin.p549l0.C13266k;
/* compiled from: _Collections.kt */
/* renamed from: kotlin.z.z */
/* loaded from: classes3.dex */
public class C13742z extends C13740y {

    /* compiled from: Sequences.kt */
    /* renamed from: kotlin.z.z$a */
    /* loaded from: classes3.dex */
    public static final class C13743a implements InterfaceC13230h<T> {

        /* renamed from: a */
        final /* synthetic */ Iterable f30178a;

        public C13743a(Iterable iterable) {
            this.f30178a = iterable;
        }

        @Override // kotlin.p548k0.InterfaceC13230h
        public Iterator<T> iterator() {
            return this.f30178a.iterator();
        }
    }

    /* compiled from: _Collections.kt */
    /* renamed from: kotlin.z.z$b */
    /* loaded from: classes3.dex */
    public static final class C13744b extends AbstractC11802m implements InterfaceC11756a<Iterator<? extends T>> {

        /* renamed from: c */
        final /* synthetic */ Iterable f30179c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13744b(Iterable iterable) {
            super(0);
            this.f30179c = iterable;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final Iterator<T> invoke() {
            return this.f30179c.iterator();
        }
    }

    /* renamed from: A0 */
    public static int[] m3826A0(Collection<Integer> collection) {
        l.f(collection, "$this$toIntArray");
        int[] iArr = new int[collection.size()];
        int i = 0;
        for (Integer num : collection) {
            iArr[i] = num.intValue();
            i++;
        }
        return iArr;
    }

    /* renamed from: B0 */
    public static <T> List<T> m3825B0(Iterable<? extends T> iterable) {
        List<T> m3884l;
        List<T> m3891e;
        List<T> m3901b;
        List<T> m3823D0;
        l.f(iterable, "$this$toList");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                m3891e = C13726r.m3891e();
                return m3891e;
            } else if (size != 1) {
                m3823D0 = m3823D0(collection);
                return m3823D0;
            } else {
                m3901b = C13724q.m3901b(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
                return m3901b;
            }
        }
        m3884l = C13726r.m3884l(m3824C0(iterable));
        return m3884l;
    }

    /* renamed from: C0 */
    public static final <T> List<T> m3824C0(Iterable<? extends T> iterable) {
        List<T> m3823D0;
        l.f(iterable, "$this$toMutableList");
        if (iterable instanceof Collection) {
            m3823D0 = m3823D0((Collection) iterable);
            return m3823D0;
        }
        ArrayList arrayList = new ArrayList();
        m3773y0(iterable, arrayList);
        return arrayList;
    }

    /* renamed from: D0 */
    public static <T> List<T> m3823D0(Collection<? extends T> collection) {
        l.f(collection, "$this$toMutableList");
        return new ArrayList(collection);
    }

    /* renamed from: E0 */
    public static <T> Set<T> m3822E0(Iterable<? extends T> iterable) {
        l.f(iterable, "$this$toMutableSet");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m3773y0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: F0 */
    public static <T> Set<T> m3821F0(Iterable<? extends T> iterable) {
        Set<T> m3831b;
        Set<T> m3832a;
        int m3898f;
        l.f(iterable, "$this$toSet");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                m3831b = C13741y0.m3831b();
                return m3831b;
            } else if (size != 1) {
                m3898f = C13725q0.m3898f(collection.size());
                LinkedHashSet linkedHashSet = new LinkedHashSet(m3898f);
                m3773y0(iterable, linkedHashSet);
                return linkedHashSet;
            } else {
                m3832a = C13739x0.m3832a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
                return m3832a;
            }
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        m3773y0(iterable, linkedHashSet2);
        return C13741y0.m3828e(linkedHashSet2);
    }

    /* renamed from: G */
    public static <T> boolean m3820G(Iterable<? extends T> iterable, InterfaceC11767l<? super T, Boolean> interfaceC11767l) {
        l.f(iterable, "$this$all");
        l.f(interfaceC11767l, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (!interfaceC11767l.invoke((T) it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: G0 */
    public static <T> Set<T> m3819G0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        Set<T> m3822E0;
        l.f(iterable, "$this$union");
        l.f(iterable2, "other");
        m3822E0 = m3822E0(iterable);
        C13736w.m3850v(m3822E0, iterable2);
        return m3822E0;
    }

    /* renamed from: H */
    public static <T> InterfaceC13230h<T> m3818H(Iterable<? extends T> iterable) {
        l.f(iterable, "$this$asSequence");
        return new C13743a(iterable);
    }

    /* renamed from: H0 */
    public static <T> Iterable<C13705i0<T>> m3817H0(Iterable<? extends T> iterable) {
        l.f(iterable, "$this$withIndex");
        return new C13707j0(new C13744b(iterable));
    }

    /* renamed from: I */
    public static double m3816I(Iterable<Long> iterable) {
        l.f(iterable, "$this$average");
        double d = 0.0d;
        int i = 0;
        for (Long l : iterable) {
            double longValue = l.longValue();
            Double.isNaN(longValue);
            d += longValue;
            i++;
            if (i < 0) {
                C13722p.m3925m();
                throw null;
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        double d2 = i;
        Double.isNaN(d2);
        return d / d2;
    }

    /* renamed from: I0 */
    public static <T, R> List<C13287o<T, R>> m3815I0(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        int m3867o;
        int m3867o2;
        l.f(iterable, "$this$zip");
        l.f(iterable2, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        m3867o = C13728s.m3867o(iterable, 10);
        m3867o2 = C13728s.m3867o(iterable2, 10);
        ArrayList arrayList = new ArrayList(Math.min(m3867o, m3867o2));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(C13664u.m4227a(it.next(), it2.next()));
        }
        return arrayList;
    }

    /* renamed from: J */
    public static <T> boolean m3814J(Iterable<? extends T> iterable, T t) {
        l.f(iterable, "$this$contains");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t);
        }
        return m3802V(iterable, t) >= 0;
    }

    /* renamed from: K */
    public static <T> List<T> m3813K(Iterable<? extends T> iterable) {
        Set m3822E0;
        List<T> m3825B0;
        l.f(iterable, "$this$distinct");
        m3822E0 = m3822E0(iterable);
        m3825B0 = m3825B0(m3822E0);
        return m3825B0;
    }

    /* renamed from: L */
    public static <T> List<T> m3812L(Iterable<? extends T> iterable, int i) {
        ArrayList arrayList;
        List<T> m3884l;
        List<T> m3901b;
        List<T> m3891e;
        List<T> m3825B0;
        l.f(iterable, "$this$drop");
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            m3825B0 = m3825B0(iterable);
            return m3825B0;
        } else {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i;
                if (size <= 0) {
                    m3891e = C13726r.m3891e();
                    return m3891e;
                } else if (size == 1) {
                    m3901b = C13724q.m3901b(C13722p.m3945b0(iterable));
                    return m3901b;
                } else {
                    arrayList = new ArrayList(size);
                    if (iterable instanceof List) {
                        if (iterable instanceof RandomAccess) {
                            int size2 = collection.size();
                            while (i < size2) {
                                arrayList.add(((List) iterable).get(i));
                                i++;
                            }
                        } else {
                            ListIterator listIterator = ((List) iterable).listIterator(i);
                            while (listIterator.hasNext()) {
                                arrayList.add(listIterator.next());
                            }
                        }
                        return arrayList;
                    }
                }
            } else {
                arrayList = new ArrayList();
            }
            for (T t : iterable) {
                if (i2 >= i) {
                    arrayList.add(t);
                } else {
                    i2++;
                }
            }
            m3884l = C13726r.m3884l(arrayList);
            return m3884l;
        }
    }

    /* renamed from: M */
    public static <T> List<T> m3811M(List<? extends T> list, int i) {
        int m10271a;
        l.f(list, "$this$dropLast");
        if (i >= 0) {
            m10271a = C11841h.m10271a(list.size() - i, 0);
            return m3776v0(list, m10271a);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    /* renamed from: N */
    public static <T> List<T> m3810N(Iterable<? extends T> iterable, InterfaceC11767l<? super T, Boolean> interfaceC11767l) {
        l.f(iterable, "$this$filter");
        l.f(interfaceC11767l, "predicate");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (interfaceC11767l.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: O */
    public static <T> List<T> m3809O(Iterable<? extends T> iterable) {
        l.f(iterable, "$this$filterNotNull");
        ArrayList arrayList = new ArrayList();
        m3808P(iterable, arrayList);
        return arrayList;
    }

    /* renamed from: P */
    public static final <C extends Collection<? super T>, T> C m3808P(Iterable<? extends T> iterable, C c) {
        l.f(iterable, "$this$filterNotNullTo");
        l.f(c, "destination");
        for (T t : iterable) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    /* renamed from: Q */
    public static <T> T m3807Q(Iterable<? extends T> iterable) {
        l.f(iterable, "$this$first");
        if (iterable instanceof List) {
            return (T) C13722p.m3954R((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: R */
    public static <T> T m3806R(List<? extends T> list) {
        l.f(list, "$this$first");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: S */
    public static <T> T m3805S(Iterable<? extends T> iterable) {
        l.f(iterable, "$this$firstOrNull");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* renamed from: T */
    public static <T> T m3804T(List<? extends T> list) {
        l.f(list, "$this$firstOrNull");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: U */
    public static <T> T m3803U(List<? extends T> list, int i) {
        int m3889g;
        l.f(list, "$this$getOrNull");
        if (i >= 0) {
            m3889g = C13726r.m3889g(list);
            if (i <= m3889g) {
                return list.get(i);
            }
        }
        return null;
    }

    /* renamed from: V */
    public static final <T> int m3802V(Iterable<? extends T> iterable, T t) {
        l.f(iterable, "$this$indexOf");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i = 0;
        for (T t2 : iterable) {
            if (i >= 0) {
                if (l.b(t, t2)) {
                    return i;
                }
                i++;
            } else {
                C13722p.m3923n();
                throw null;
            }
        }
        return -1;
    }

    /* renamed from: W */
    public static <T> Set<T> m3801W(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        Set<T> m3822E0;
        l.f(iterable, "$this$intersect");
        l.f(iterable2, "other");
        m3822E0 = m3822E0(iterable);
        C13736w.m3851A(m3822E0, iterable2);
        return m3822E0;
    }

    /* renamed from: X */
    public static final <T, A extends Appendable> A m3800X(Iterable<? extends T> iterable, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC11767l<? super T, ? extends CharSequence> interfaceC11767l) {
        l.f(iterable, "$this$joinTo");
        l.f(a, "buffer");
        l.f(charSequence, "separator");
        l.f(charSequence2, "prefix");
        l.f(charSequence3, "postfix");
        l.f(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (T t : iterable) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C13266k.m5465a(a, t, interfaceC11767l);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: Y */
    public static /* synthetic */ Appendable m3799Y(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC11767l interfaceC11767l, int i2, Object obj) {
        m3800X(iterable, appendable, (i2 & 2) != 0 ? ", " : charSequence, (i2 & 4) != 0 ? "" : charSequence2, (i2 & 8) == 0 ? charSequence3 : "", (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? "..." : charSequence4, (i2 & 64) != 0 ? null : interfaceC11767l);
        return appendable;
    }

    /* renamed from: Z */
    public static <T> String m3798Z(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC11767l<? super T, ? extends CharSequence> interfaceC11767l) {
        l.f(iterable, "$this$joinToString");
        l.f(charSequence, "separator");
        l.f(charSequence2, "prefix");
        l.f(charSequence3, "postfix");
        l.f(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        m3800X(iterable, sb, charSequence, charSequence2, charSequence3, i, charSequence4, interfaceC11767l);
        String sb2 = sb.toString();
        l.e(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: a0 */
    public static /* synthetic */ String m3797a0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC11767l interfaceC11767l, int i2, Object obj) {
        String m3798Z;
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i2 & 2) != 0 ? "" : charSequence2;
        String str2 = (i2 & 4) == 0 ? charSequence3 : "";
        int i3 = (i2 & 8) != 0 ? -1 : i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i2 & 32) != 0) {
            interfaceC11767l = null;
        }
        m3798Z = m3798Z(iterable, charSequence, str, str2, i3, charSequence5, interfaceC11767l);
        return m3798Z;
    }

    /* renamed from: b0 */
    public static <T> T m3796b0(Iterable<? extends T> iterable) {
        l.f(iterable, "$this$last");
        if (iterable instanceof List) {
            return (T) C13722p.m3943c0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: c0 */
    public static <T> T m3795c0(List<? extends T> list) {
        int m3889g;
        l.f(list, "$this$last");
        if (!list.isEmpty()) {
            m3889g = C13726r.m3889g(list);
            return list.get(m3889g);
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: d0 */
    public static <T> T m3794d0(Iterable<? extends T> iterable) {
        l.f(iterable, "$this$lastOrNull");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(list.size() - 1);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        return null;
    }

    /* renamed from: e0 */
    public static <T> T m3793e0(List<? extends T> list) {
        l.f(list, "$this$lastOrNull");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* renamed from: f0 */
    public static <T, R> List<R> m3792f0(Iterable<? extends T> iterable, InterfaceC11767l<? super T, ? extends R> interfaceC11767l) {
        int m3867o;
        l.f(iterable, "$this$map");
        l.f(interfaceC11767l, "transform");
        m3867o = C13728s.m3867o(iterable, 10);
        ArrayList arrayList = new ArrayList(m3867o);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(interfaceC11767l.invoke((T) it.next()));
        }
        return arrayList;
    }

    /* renamed from: g0 */
    public static <T extends Comparable<? super T>> T m3791g0(Iterable<? extends T> iterable) {
        l.f(iterable, "$this$max");
        return (T) C13722p.m3934h0(iterable);
    }

    /* renamed from: h0 */
    public static <T extends Comparable<? super T>> T m3790h0(Iterable<? extends T> iterable) {
        l.f(iterable, "$this$maxOrNull");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) < 0) {
                    next = next2;
                }
            }
            return next;
        }
        return null;
    }

    /* renamed from: i0 */
    public static <T extends Comparable<? super T>> T m3789i0(Iterable<? extends T> iterable) {
        l.f(iterable, "$this$min");
        return (T) C13722p.m3930j0(iterable);
    }

    /* renamed from: j0 */
    public static <T extends Comparable<? super T>> T m3788j0(Iterable<? extends T> iterable) {
        l.f(iterable, "$this$minOrNull");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) > 0) {
                    next = next2;
                }
            }
            return next;
        }
        return null;
    }

    /* renamed from: k0 */
    public static <T> List<T> m3787k0(Iterable<? extends T> iterable, T t) {
        int m3867o;
        l.f(iterable, "$this$minus");
        m3867o = C13728s.m3867o(iterable, 10);
        ArrayList arrayList = new ArrayList(m3867o);
        boolean z = false;
        for (T t2 : iterable) {
            boolean z2 = true;
            if (!z && l.b(t2, t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(t2);
            }
        }
        return arrayList;
    }

    /* renamed from: l0 */
    public static <T> List<T> m3786l0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        List<T> m3784n0;
        l.f(iterable, "$this$plus");
        l.f(iterable2, "elements");
        if (iterable instanceof Collection) {
            m3784n0 = m3784n0((Collection) iterable, iterable2);
            return m3784n0;
        }
        ArrayList arrayList = new ArrayList();
        C13736w.m3850v(arrayList, iterable);
        C13736w.m3850v(arrayList, iterable2);
        return arrayList;
    }

    /* renamed from: m0 */
    public static <T> List<T> m3785m0(Iterable<? extends T> iterable, T t) {
        List<T> m3783o0;
        l.f(iterable, "$this$plus");
        if (iterable instanceof Collection) {
            m3783o0 = m3783o0((Collection) iterable, t);
            return m3783o0;
        }
        ArrayList arrayList = new ArrayList();
        C13736w.m3850v(arrayList, iterable);
        arrayList.add(t);
        return arrayList;
    }

    /* renamed from: n0 */
    public static <T> List<T> m3784n0(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        l.f(collection, "$this$plus");
        l.f(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        C13736w.m3850v(arrayList2, iterable);
        return arrayList2;
    }

    /* renamed from: o0 */
    public static <T> List<T> m3783o0(Collection<? extends T> collection, T t) {
        l.f(collection, "$this$plus");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    /* renamed from: p0 */
    public static <T> T m3782p0(Iterable<? extends T> iterable) {
        l.f(iterable, "$this$single");
        if (iterable instanceof List) {
            return (T) C13722p.m3918q0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (it.hasNext()) {
                throw new IllegalArgumentException("Collection has more than one element.");
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: q0 */
    public static <T> T m3781q0(List<? extends T> list) {
        l.f(list, "$this$single");
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return list.get(0);
            }
            throw new IllegalArgumentException("List has more than one element.");
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: r0 */
    public static <T> T m3780r0(Iterable<? extends T> iterable) {
        l.f(iterable, "$this$singleOrNull");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return (T) list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (it.hasNext()) {
                return null;
            }
            return next;
        }
        return null;
    }

    /* renamed from: s0 */
    public static <T> T m3779s0(List<? extends T> list) {
        l.f(list, "$this$singleOrNull");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    /* renamed from: t0 */
    public static <T extends Comparable<? super T>> List<T> m3778t0(Iterable<? extends T> iterable) {
        List<T> m4067d;
        List<T> m3825B0;
        l.f(iterable, "$this$sorted");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                m3825B0 = m3825B0(iterable);
                return m3825B0;
            }
            Object[] array = collection.toArray(new Comparable[0]);
            if (array != null) {
                if (array != null) {
                    Comparable[] comparableArr = (Comparable[]) array;
                    if (comparableArr != null) {
                        C13712m.m4057n(comparableArr);
                        m4067d = C13712m.m4067d(comparableArr);
                        return m4067d;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        List<T> m3824C0 = m3824C0(iterable);
        C13734v.m3855t(m3824C0);
        return m3824C0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u0 */
    public static <T> List<T> m3777u0(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        List<T> m4067d;
        List<T> m3825B0;
        l.f(iterable, "$this$sortedWith");
        l.f(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                m3825B0 = m3825B0(iterable);
                return m3825B0;
            }
            Object[] array = collection.toArray(new Object[0]);
            if (array != null) {
                if (array != null) {
                    C13712m.m4056o(array, comparator);
                    m4067d = C13712m.m4067d(array);
                    return m4067d;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        List<T> m3824C0 = m3824C0(iterable);
        C13734v.m3854u(m3824C0, comparator);
        return m3824C0;
    }

    /* renamed from: v0 */
    public static final <T> List<T> m3776v0(Iterable<? extends T> iterable, int i) {
        List<T> m3884l;
        List<T> m3901b;
        List<T> m3825B0;
        List<T> m3891e;
        l.f(iterable, "$this$take");
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            m3891e = C13726r.m3891e();
            return m3891e;
        } else {
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    m3825B0 = m3825B0(iterable);
                    return m3825B0;
                } else if (i == 1) {
                    m3901b = C13724q.m3901b(C13722p.m3955Q(iterable));
                    return m3901b;
                }
            }
            ArrayList arrayList = new ArrayList(i);
            for (T t : iterable) {
                arrayList.add(t);
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            m3884l = C13726r.m3884l(arrayList);
            return m3884l;
        }
    }

    /* renamed from: w0 */
    public static <T> List<T> m3775w0(List<? extends T> list, int i) {
        List<T> m3901b;
        List<T> m3825B0;
        List<T> m3891e;
        l.f(list, "$this$takeLast");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            m3891e = C13726r.m3891e();
            return m3891e;
        } else {
            int size = list.size();
            if (i >= size) {
                m3825B0 = m3825B0(list);
                return m3825B0;
            } else if (i == 1) {
                m3901b = C13724q.m3901b(C13722p.m3943c0(list));
                return m3901b;
            } else {
                ArrayList arrayList = new ArrayList(i);
                if (list instanceof RandomAccess) {
                    for (int i2 = size - i; i2 < size; i2++) {
                        arrayList.add(list.get(i2));
                    }
                } else {
                    ListIterator<? extends T> listIterator = list.listIterator(size - i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        }
    }

    /* renamed from: x0 */
    public static boolean[] m3774x0(Collection<Boolean> collection) {
        l.f(collection, "$this$toBooleanArray");
        boolean[] zArr = new boolean[collection.size()];
        int i = 0;
        for (Boolean bool : collection) {
            zArr[i] = bool.booleanValue();
            i++;
        }
        return zArr;
    }

    /* renamed from: y0 */
    public static final <T, C extends Collection<? super T>> C m3773y0(Iterable<? extends T> iterable, C c) {
        l.f(iterable, "$this$toCollection");
        l.f(c, "destination");
        for (T t : iterable) {
            c.add(t);
        }
        return c;
    }

    /* renamed from: z0 */
    public static final <T> HashSet<T> m3772z0(Iterable<? extends T> iterable) {
        int m3867o;
        int m3898f;
        l.f(iterable, "$this$toHashSet");
        m3867o = C13728s.m3867o(iterable, 12);
        m3898f = C13725q0.m3898f(m3867o);
        HashSet<T> hashSet = new HashSet<>(m3898f);
        m3773y0(iterable, hashSet);
        return hashSet;
    }
}

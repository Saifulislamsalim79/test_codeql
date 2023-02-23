package kotlin.p557z;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11781b;
import kotlin.p483e0.p485d.p486e0.InterfaceC11791a;
import kotlin.p548k0.C13234l;
import kotlin.p548k0.InterfaceC13230h;
import kotlin.p549l0.C13266k;
/* compiled from: _Arrays.kt */
/* renamed from: kotlin.z.n */
/* loaded from: classes3.dex */
public class C13715n extends C13712m {

    /* compiled from: Iterables.kt */
    /* renamed from: kotlin.z.n$a */
    /* loaded from: classes3.dex */
    public static final class C13716a implements Iterable<T>, InterfaceC11791a {

        /* renamed from: c */
        final /* synthetic */ Object[] f30170c;

        public C13716a(Object[] objArr) {
            this.f30170c = objArr;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return C11781b.m10351a(this.f30170c);
        }
    }

    /* compiled from: Sequences.kt */
    /* renamed from: kotlin.z.n$b */
    /* loaded from: classes3.dex */
    public static final class C13717b implements InterfaceC13230h<T> {

        /* renamed from: a */
        final /* synthetic */ Object[] f30171a;

        public C13717b(Object[] objArr) {
            this.f30171a = objArr;
        }

        @Override // kotlin.p548k0.InterfaceC13230h
        public Iterator<T> iterator() {
            return C11781b.m10351a(this.f30171a);
        }
    }

    /* compiled from: _Arrays.kt */
    /* renamed from: kotlin.z.n$c */
    /* loaded from: classes3.dex */
    public static final class C13718c extends AbstractC11802m implements InterfaceC11756a<Iterator<? extends T>> {

        /* renamed from: c */
        final /* synthetic */ Object[] f30172c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13718c(Object[] objArr) {
            super(0);
            this.f30172c = objArr;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final Iterator<T> invoke() {
            return C11781b.m10351a(this.f30172c);
        }
    }

    /* renamed from: A */
    public static Integer m4050A(int[] iArr, int i) {
        l.f(iArr, "$this$getOrNull");
        if (i < 0 || i > m4000y(iArr)) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    /* renamed from: B */
    public static <T> T m4049B(T[] tArr, int i) {
        int m3999z;
        l.f(tArr, "$this$getOrNull");
        if (i >= 0) {
            m3999z = m3999z(tArr);
            if (i <= m3999z) {
                return tArr[i];
            }
        }
        return null;
    }

    /* renamed from: C */
    public static final int m4048C(int[] iArr, int i) {
        l.f(iArr, "$this$indexOf");
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: D */
    public static <T> int m4047D(T[] tArr, T t) {
        l.f(tArr, "$this$indexOf");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (l.b(t, tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: E */
    public static final <T, A extends Appendable> A m4046E(T[] tArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC11767l<? super T, ? extends CharSequence> interfaceC11767l) {
        l.f(tArr, "$this$joinTo");
        l.f(a, "buffer");
        l.f(charSequence, "separator");
        l.f(charSequence2, "prefix");
        l.f(charSequence3, "postfix");
        l.f(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (T t : tArr) {
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

    /* renamed from: F */
    public static final <T> String m4045F(T[] tArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC11767l<? super T, ? extends CharSequence> interfaceC11767l) {
        l.f(tArr, "$this$joinToString");
        l.f(charSequence, "separator");
        l.f(charSequence2, "prefix");
        l.f(charSequence3, "postfix");
        l.f(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        m4046E(tArr, sb, charSequence, charSequence2, charSequence3, i, charSequence4, interfaceC11767l);
        String sb2 = sb.toString();
        l.e(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: G */
    public static /* synthetic */ String m4044G(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC11767l interfaceC11767l, int i2, Object obj) {
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
        return m4045F(objArr, charSequence, str, str2, i3, charSequence5, interfaceC11767l);
    }

    /* renamed from: H */
    public static <T> T m4043H(T[] tArr) {
        int m3999z;
        l.f(tArr, "$this$last");
        if (!(tArr.length == 0)) {
            m3999z = m3999z(tArr);
            return tArr[m3999z];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: I */
    public static final int m4042I(int[] iArr, int i) {
        l.f(iArr, "$this$lastIndexOf");
        for (int length = iArr.length - 1; length >= 0; length--) {
            if (i == iArr[length]) {
                return length;
            }
        }
        return -1;
    }

    /* renamed from: J */
    public static <T, R> List<R> m4041J(T[] tArr, InterfaceC11767l<? super T, ? extends R> interfaceC11767l) {
        l.f(tArr, "$this$map");
        l.f(interfaceC11767l, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t : tArr) {
            arrayList.add(interfaceC11767l.invoke(t));
        }
        return arrayList;
    }

    /* renamed from: K */
    public static Integer m4040K(int[] iArr) {
        l.f(iArr, "$this$maxOrNull");
        int i = 1;
        if (iArr.length == 0) {
            return null;
        }
        int i2 = iArr[0];
        int m4000y = m4000y(iArr);
        if (1 <= m4000y) {
            while (true) {
                int i3 = iArr[i];
                if (i2 < i3) {
                    i2 = i3;
                }
                if (i == m4000y) {
                    break;
                }
                i++;
            }
        }
        return Integer.valueOf(i2);
    }

    /* renamed from: L */
    public static Integer m4039L(int[] iArr) {
        l.f(iArr, "$this$minOrNull");
        int i = 1;
        if (iArr.length == 0) {
            return null;
        }
        int i2 = iArr[0];
        int m4000y = m4000y(iArr);
        if (1 <= m4000y) {
            while (true) {
                int i3 = iArr[i];
                if (i2 > i3) {
                    i2 = i3;
                }
                if (i == m4000y) {
                    break;
                }
                i++;
            }
        }
        return Integer.valueOf(i2);
    }

    /* renamed from: M */
    public static char m4038M(char[] cArr) {
        l.f(cArr, "$this$single");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: N */
    public static <T> T m4037N(T[] tArr) {
        l.f(tArr, "$this$single");
        int length = tArr.length;
        if (length != 0) {
            if (length == 1) {
                return tArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: O */
    public static <T> T m4036O(T[] tArr) {
        l.f(tArr, "$this$singleOrNull");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: P */
    public static final <T> T[] m4035P(T[] tArr, Comparator<? super T> comparator) {
        l.f(tArr, "$this$sortedArrayWith");
        l.f(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        l.e(tArr2, "java.util.Arrays.copyOf(this, size)");
        C13712m.m4056o(tArr2, comparator);
        return tArr2;
    }

    /* renamed from: Q */
    public static <T> List<T> m4034Q(T[] tArr, Comparator<? super T> comparator) {
        List<T> m4067d;
        l.f(tArr, "$this$sortedWith");
        l.f(comparator, "comparator");
        m4067d = C13712m.m4067d(m4035P(tArr, comparator));
        return m4067d;
    }

    /* renamed from: R */
    public static final <C extends Collection<? super Integer>> C m4033R(int[] iArr, C c) {
        l.f(iArr, "$this$toCollection");
        l.f(c, "destination");
        for (int i : iArr) {
            c.add(Integer.valueOf(i));
        }
        return c;
    }

    /* renamed from: S */
    public static final <T, C extends Collection<? super T>> C m4032S(T[] tArr, C c) {
        l.f(tArr, "$this$toCollection");
        l.f(c, "destination");
        for (T t : tArr) {
            c.add(t);
        }
        return c;
    }

    /* renamed from: T */
    public static List<Byte> m4031T(byte[] bArr) {
        List<Byte> m3891e;
        List<Byte> m3901b;
        l.f(bArr, "$this$toList");
        int length = bArr.length;
        if (length == 0) {
            m3891e = C13726r.m3891e();
            return m3891e;
        } else if (length != 1) {
            return m4022c0(bArr);
        } else {
            m3901b = C13724q.m3901b(Byte.valueOf(bArr[0]));
            return m3901b;
        }
    }

    /* renamed from: U */
    public static List<Character> m4030U(char[] cArr) {
        List<Character> m3891e;
        List<Character> m3901b;
        l.f(cArr, "$this$toList");
        int length = cArr.length;
        if (length == 0) {
            m3891e = C13726r.m3891e();
            return m3891e;
        } else if (length != 1) {
            return m4021d0(cArr);
        } else {
            m3901b = C13724q.m3901b(Character.valueOf(cArr[0]));
            return m3901b;
        }
    }

    /* renamed from: V */
    public static List<Double> m4029V(double[] dArr) {
        List<Double> m3891e;
        List<Double> m3901b;
        l.f(dArr, "$this$toList");
        int length = dArr.length;
        if (length == 0) {
            m3891e = C13726r.m3891e();
            return m3891e;
        } else if (length != 1) {
            return m4020e0(dArr);
        } else {
            m3901b = C13724q.m3901b(Double.valueOf(dArr[0]));
            return m3901b;
        }
    }

    /* renamed from: W */
    public static List<Float> m4028W(float[] fArr) {
        List<Float> m3891e;
        List<Float> m3901b;
        l.f(fArr, "$this$toList");
        int length = fArr.length;
        if (length == 0) {
            m3891e = C13726r.m3891e();
            return m3891e;
        } else if (length != 1) {
            return m4019f0(fArr);
        } else {
            m3901b = C13724q.m3901b(Float.valueOf(fArr[0]));
            return m3901b;
        }
    }

    /* renamed from: X */
    public static List<Integer> m4027X(int[] iArr) {
        List<Integer> m3891e;
        List<Integer> m3901b;
        l.f(iArr, "$this$toList");
        int length = iArr.length;
        if (length == 0) {
            m3891e = C13726r.m3891e();
            return m3891e;
        } else if (length != 1) {
            return m4018g0(iArr);
        } else {
            m3901b = C13724q.m3901b(Integer.valueOf(iArr[0]));
            return m3901b;
        }
    }

    /* renamed from: Y */
    public static List<Long> m4026Y(long[] jArr) {
        List<Long> m3891e;
        List<Long> m3901b;
        l.f(jArr, "$this$toList");
        int length = jArr.length;
        if (length == 0) {
            m3891e = C13726r.m3891e();
            return m3891e;
        } else if (length != 1) {
            return m4017h0(jArr);
        } else {
            m3901b = C13724q.m3901b(Long.valueOf(jArr[0]));
            return m3901b;
        }
    }

    /* renamed from: Z */
    public static <T> List<T> m4025Z(T[] tArr) {
        List<T> m3891e;
        List<T> m3901b;
        l.f(tArr, "$this$toList");
        int length = tArr.length;
        if (length == 0) {
            m3891e = C13726r.m3891e();
            return m3891e;
        } else if (length != 1) {
            return m4016i0(tArr);
        } else {
            m3901b = C13724q.m3901b(tArr[0]);
            return m3901b;
        }
    }

    /* renamed from: a0 */
    public static List<Short> m4024a0(short[] sArr) {
        List<Short> m3891e;
        List<Short> m3901b;
        l.f(sArr, "$this$toList");
        int length = sArr.length;
        if (length == 0) {
            m3891e = C13726r.m3891e();
            return m3891e;
        } else if (length != 1) {
            return m4015j0(sArr);
        } else {
            m3901b = C13724q.m3901b(Short.valueOf(sArr[0]));
            return m3901b;
        }
    }

    /* renamed from: b0 */
    public static List<Boolean> m4023b0(boolean[] zArr) {
        List<Boolean> m3891e;
        List<Boolean> m3901b;
        l.f(zArr, "$this$toList");
        int length = zArr.length;
        if (length == 0) {
            m3891e = C13726r.m3891e();
            return m3891e;
        } else if (length != 1) {
            return m4014k0(zArr);
        } else {
            m3901b = C13724q.m3901b(Boolean.valueOf(zArr[0]));
            return m3901b;
        }
    }

    /* renamed from: c0 */
    public static final List<Byte> m4022c0(byte[] bArr) {
        l.f(bArr, "$this$toMutableList");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(Byte.valueOf(b));
        }
        return arrayList;
    }

    /* renamed from: d0 */
    public static final List<Character> m4021d0(char[] cArr) {
        l.f(cArr, "$this$toMutableList");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c : cArr) {
            arrayList.add(Character.valueOf(c));
        }
        return arrayList;
    }

    /* renamed from: e0 */
    public static final List<Double> m4020e0(double[] dArr) {
        l.f(dArr, "$this$toMutableList");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(Double.valueOf(d));
        }
        return arrayList;
    }

    /* renamed from: f0 */
    public static final List<Float> m4019f0(float[] fArr) {
        l.f(fArr, "$this$toMutableList");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    /* renamed from: g0 */
    public static final List<Integer> m4018g0(int[] iArr) {
        l.f(iArr, "$this$toMutableList");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    /* renamed from: h0 */
    public static final List<Long> m4017h0(long[] jArr) {
        l.f(jArr, "$this$toMutableList");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* renamed from: i0 */
    public static final <T> List<T> m4016i0(T[] tArr) {
        l.f(tArr, "$this$toMutableList");
        return new ArrayList(C13726r.m3892d(tArr));
    }

    /* renamed from: j0 */
    public static final List<Short> m4015j0(short[] sArr) {
        l.f(sArr, "$this$toMutableList");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s : sArr) {
            arrayList.add(Short.valueOf(s));
        }
        return arrayList;
    }

    /* renamed from: k0 */
    public static final List<Boolean> m4014k0(boolean[] zArr) {
        l.f(zArr, "$this$toMutableList");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z : zArr) {
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    /* renamed from: l0 */
    public static final Set<Integer> m4013l0(int[] iArr) {
        int m3898f;
        l.f(iArr, "$this$toMutableSet");
        m3898f = C13725q0.m3898f(iArr.length);
        LinkedHashSet linkedHashSet = new LinkedHashSet(m3898f);
        m4033R(iArr, linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: m0 */
    public static <T> Set<T> m4012m0(T[] tArr) {
        Set<T> m3831b;
        Set<T> m3832a;
        int m3898f;
        l.f(tArr, "$this$toSet");
        int length = tArr.length;
        if (length == 0) {
            m3831b = C13741y0.m3831b();
            return m3831b;
        } else if (length != 1) {
            m3898f = C13725q0.m3898f(tArr.length);
            LinkedHashSet linkedHashSet = new LinkedHashSet(m3898f);
            m4032S(tArr, linkedHashSet);
            return linkedHashSet;
        } else {
            m3832a = C13739x0.m3832a(tArr[0]);
            return m3832a;
        }
    }

    /* renamed from: n0 */
    public static <T> Iterable<C13705i0<T>> m4011n0(T[] tArr) {
        l.f(tArr, "$this$withIndex");
        return new C13707j0(new C13718c(tArr));
    }

    /* renamed from: o0 */
    public static <T, R> List<C13287o<T, R>> m4010o0(T[] tArr, R[] rArr) {
        l.f(tArr, "$this$zip");
        l.f(rArr, "other");
        int min = Math.min(tArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(C13664u.m4227a(tArr[i], rArr[i]));
        }
        return arrayList;
    }

    /* renamed from: p */
    public static <T> Iterable<T> m4009p(T[] tArr) {
        List m3891e;
        l.f(tArr, "$this$asIterable");
        if (tArr.length == 0) {
            m3891e = C13726r.m3891e();
            return m3891e;
        }
        return new C13716a(tArr);
    }

    /* renamed from: q */
    public static <T> InterfaceC13230h<T> m4008q(T[] tArr) {
        InterfaceC13230h<T> m5586c;
        l.f(tArr, "$this$asSequence");
        if (tArr.length == 0) {
            m5586c = C13234l.m5586c();
            return m5586c;
        }
        return new C13717b(tArr);
    }

    /* renamed from: r */
    public static final boolean m4007r(int[] iArr, int i) {
        l.f(iArr, "$this$contains");
        return m4048C(iArr, i) >= 0;
    }

    /* renamed from: s */
    public static <T> boolean m4006s(T[] tArr, T t) {
        int m4047D;
        l.f(tArr, "$this$contains");
        m4047D = m4047D(tArr, t);
        return m4047D >= 0;
    }

    /* renamed from: t */
    public static List<Integer> m4005t(int[] iArr) {
        List<Integer> m3825B0;
        l.f(iArr, "$this$distinct");
        m3825B0 = C13742z.m3825B0(m4013l0(iArr));
        return m3825B0;
    }

    /* renamed from: u */
    public static <T> List<T> m4004u(T[] tArr) {
        l.f(tArr, "$this$filterNotNull");
        ArrayList arrayList = new ArrayList();
        m4003v(tArr, arrayList);
        return arrayList;
    }

    /* renamed from: v */
    public static final <C extends Collection<? super T>, T> C m4003v(T[] tArr, C c) {
        l.f(tArr, "$this$filterNotNullTo");
        l.f(c, "destination");
        for (T t : tArr) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    /* renamed from: w */
    public static <T> T m4002w(T[] tArr) {
        l.f(tArr, "$this$first");
        if (!(tArr.length == 0)) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: x */
    public static <T> T m4001x(T[] tArr) {
        l.f(tArr, "$this$firstOrNull");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    /* renamed from: y */
    public static final int m4000y(int[] iArr) {
        l.f(iArr, "$this$lastIndex");
        return iArr.length - 1;
    }

    /* renamed from: z */
    public static <T> int m3999z(T[] tArr) {
        l.f(tArr, "$this$lastIndex");
        return tArr.length - 1;
    }
}

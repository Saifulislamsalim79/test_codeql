package kotlin.p557z;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.e0.d.l;
/* compiled from: _ArraysJvm.kt */
/* renamed from: kotlin.z.m */
/* loaded from: classes3.dex */
public class C13712m extends C13710l {

    /* compiled from: _ArraysJvm.kt */
    /* renamed from: kotlin.z.m$a */
    /* loaded from: classes3.dex */
    public static final class C13713a extends AbstractC13689d<Integer> implements RandomAccess {

        /* renamed from: d */
        final /* synthetic */ int[] f30169d;

        C13713a(int[] iArr) {
            this.f30169d = iArr;
        }

        @Override // kotlin.p557z.AbstractC13669a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Integer) {
                return m4054h(((Number) obj).intValue());
            }
            return false;
        }

        @Override // kotlin.p557z.AbstractC13669a
        /* renamed from: e */
        public int mo4055e() {
            return this.f30169d.length;
        }

        /* renamed from: h */
        public boolean m4054h(int i) {
            return C13715n.m4007r(this.f30169d, i);
        }

        @Override // kotlin.p557z.AbstractC13689d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return m4052l(((Number) obj).intValue());
            }
            return -1;
        }

        @Override // kotlin.p557z.AbstractC13669a, java.util.Collection
        public boolean isEmpty() {
            return this.f30169d.length == 0;
        }

        @Override // kotlin.p557z.AbstractC13689d, java.util.List
        /* renamed from: k */
        public Integer get(int i) {
            return Integer.valueOf(this.f30169d[i]);
        }

        /* renamed from: l */
        public int m4052l(int i) {
            return C13715n.m4048C(this.f30169d, i);
        }

        @Override // kotlin.p557z.AbstractC13689d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return m4051m(((Number) obj).intValue());
            }
            return -1;
        }

        /* renamed from: m */
        public int m4051m(int i) {
            return C13715n.m4042I(this.f30169d, i);
        }
    }

    /* renamed from: c */
    public static List<Integer> m4068c(int[] iArr) {
        l.f(iArr, "$this$asList");
        return new C13713a(iArr);
    }

    /* renamed from: d */
    public static <T> List<T> m4067d(T[] tArr) {
        l.f(tArr, "$this$asList");
        List<T> m3993a = C13720o.m3993a(tArr);
        l.e(m3993a, "ArraysUtilJVM.asList(this)");
        return m3993a;
    }

    /* renamed from: e */
    public static byte[] m4066e(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        l.f(bArr, "$this$copyInto");
        l.f(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    /* renamed from: f */
    public static final <T> T[] m4065f(T[] tArr, T[] tArr2, int i, int i2, int i3) {
        l.f(tArr, "$this$copyInto");
        l.f(tArr2, "destination");
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    /* renamed from: g */
    public static /* synthetic */ Object[] m4064g(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        m4065f(objArr, objArr2, i, i2, i3);
        return objArr2;
    }

    /* renamed from: h */
    public static <T> T[] m4063h(T[] tArr, int i, int i2) {
        l.f(tArr, "$this$copyOfRangeImpl");
        C13708k.m4072b(i2, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i, i2);
        l.e(tArr2, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
        return tArr2;
    }

    /* renamed from: i */
    public static void m4062i(int[] iArr, int i, int i2, int i3) {
        l.f(iArr, "$this$fill");
        Arrays.fill(iArr, i2, i3, i);
    }

    /* renamed from: j */
    public static <T> void m4061j(T[] tArr, T t, int i, int i2) {
        l.f(tArr, "$this$fill");
        Arrays.fill(tArr, i, i2, t);
    }

    /* renamed from: k */
    public static /* synthetic */ void m4060k(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        m4061j(objArr, obj, i, i2);
    }

    /* renamed from: l */
    public static int[] m4059l(int[] iArr, int[] iArr2) {
        l.f(iArr, "$this$plus");
        l.f(iArr2, "elements");
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] copyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, copyOf, length, length2);
        l.e(copyOf, "result");
        return copyOf;
    }

    /* renamed from: m */
    public static <T> T[] m4058m(T[] tArr, T t) {
        l.f(tArr, "$this$plus");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + 1);
        tArr2[length] = t;
        l.e(tArr2, "result");
        return tArr2;
    }

    /* renamed from: n */
    public static final <T> void m4057n(T[] tArr) {
        l.f(tArr, "$this$sort");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    /* renamed from: o */
    public static final <T> void m4056o(T[] tArr, Comparator<? super T> comparator) {
        l.f(tArr, "$this$sortWith");
        l.f(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}

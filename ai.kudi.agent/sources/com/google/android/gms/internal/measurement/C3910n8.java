package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.n8 */
/* loaded from: classes2.dex */
final class C3910n8 extends AbstractC3721b7<Integer> implements RandomAccess, InterfaceC3956q8, InterfaceC4037v9 {

    /* renamed from: f */
    private static final C3910n8 f9577f;

    /* renamed from: d */
    private int[] f9578d;

    /* renamed from: e */
    private int f9579e;

    static {
        C3910n8 c3910n8 = new C3910n8(new int[0], 0);
        f9577f = c3910n8;
        c3910n8.zzb();
    }

    C3910n8() {
        this(new int[10], 0);
    }

    /* renamed from: f */
    public static C3910n8 m29332f() {
        return f9577f;
    }

    /* renamed from: k */
    private final String m29330k(int i) {
        int i2 = this.f9579e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: l */
    private final void m29329l(int i) {
        if (i < 0 || i >= this.f9579e) {
            throw new IndexOutOfBoundsException(m29330k(i));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3988s8
    /* renamed from: S */
    public final InterfaceC3956q8 mo28653i(int i) {
        if (i >= this.f9579e) {
            return new C3910n8(Arrays.copyOf(this.f9578d, i), this.f9579e);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        m29798d();
        if (i >= 0 && i <= (i2 = this.f9579e)) {
            int[] iArr = this.f9578d;
            if (i2 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
            } else {
                int[] iArr2 = new int[((i2 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.f9578d, i, iArr2, i + 1, this.f9579e - i);
                this.f9578d = iArr2;
            }
            this.f9578d[i] = intValue;
            this.f9579e++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m29330k(i));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3721b7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        m29798d();
        C4004t8.m28905e(collection);
        if (!(collection instanceof C3910n8)) {
            return super.addAll(collection);
        }
        C3910n8 c3910n8 = (C3910n8) collection;
        int i = c3910n8.f9579e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9579e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f9578d;
            if (i3 > iArr.length) {
                this.f9578d = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(c3910n8.f9578d, 0, this.f9578d, this.f9579e, c3910n8.f9579e);
            this.f9579e = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final int m29333e(int i) {
        m29329l(i);
        return this.f9578d[i];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3721b7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3910n8)) {
            return super.equals(obj);
        }
        C3910n8 c3910n8 = (C3910n8) obj;
        if (this.f9579e != c3910n8.f9579e) {
            return false;
        }
        int[] iArr = c3910n8.f9578d;
        for (int i = 0; i < this.f9579e; i++) {
            if (this.f9578d[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m29329l(i);
        return Integer.valueOf(this.f9578d[i]);
    }

    /* renamed from: h */
    public final void m29331h(int i) {
        m29798d();
        int i2 = this.f9579e;
        int[] iArr = this.f9578d;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f9578d = iArr2;
        }
        int[] iArr3 = this.f9578d;
        int i3 = this.f9579e;
        this.f9579e = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3721b7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f9579e; i2++) {
            i = (i * 31) + this.f9578d[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i = this.f9579e;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f9578d[i2] == intValue) {
                    return i2;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3721b7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m29798d();
        m29329l(i);
        int[] iArr = this.f9578d;
        int i3 = iArr[i];
        if (i < this.f9579e - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.f9579e--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        m29798d();
        if (i2 >= i) {
            int[] iArr = this.f9578d;
            System.arraycopy(iArr, i2, iArr, i, this.f9579e - i2);
            this.f9579e -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        m29798d();
        m29329l(i);
        int[] iArr = this.f9578d;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9579e;
    }

    private C3910n8(int[] iArr, int i) {
        this.f9578d = iArr;
        this.f9579e = i;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3721b7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m29331h(((Integer) obj).intValue());
        return true;
    }
}

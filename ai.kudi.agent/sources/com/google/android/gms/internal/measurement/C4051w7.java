package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.w7 */
/* loaded from: classes2.dex */
final class C4051w7 extends AbstractC3721b7<Double> implements RandomAccess, InterfaceC3988s8, InterfaceC4037v9 {

    /* renamed from: f */
    private static final C4051w7 f9818f;

    /* renamed from: d */
    private double[] f9819d;

    /* renamed from: e */
    private int f9820e;

    static {
        C4051w7 c4051w7 = new C4051w7(new double[0], 0);
        f9818f = c4051w7;
        c4051w7.zzb();
    }

    C4051w7() {
        this(new double[10], 0);
    }

    /* renamed from: f */
    private final String m28695f(int i) {
        int i2 = this.f9820e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: h */
    private final void m28694h(int i) {
        if (i < 0 || i >= this.f9820e) {
            throw new IndexOutOfBoundsException(m28695f(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        m29798d();
        if (i >= 0 && i <= (i2 = this.f9820e)) {
            double[] dArr = this.f9819d;
            if (i2 < dArr.length) {
                System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
            } else {
                double[] dArr2 = new double[((i2 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i);
                System.arraycopy(this.f9819d, i, dArr2, i + 1, this.f9820e - i);
                this.f9819d = dArr2;
            }
            this.f9819d[i] = doubleValue;
            this.f9820e++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m28695f(i));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3721b7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        m29798d();
        C4004t8.m28905e(collection);
        if (!(collection instanceof C4051w7)) {
            return super.addAll(collection);
        }
        C4051w7 c4051w7 = (C4051w7) collection;
        int i = c4051w7.f9820e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9820e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f9819d;
            if (i3 > dArr.length) {
                this.f9819d = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(c4051w7.f9819d, 0, this.f9819d, this.f9820e, c4051w7.f9820e);
            this.f9820e = i3;
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
    public final void m28696e(double d) {
        m29798d();
        int i = this.f9820e;
        double[] dArr = this.f9819d;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f9819d = dArr2;
        }
        double[] dArr3 = this.f9819d;
        int i2 = this.f9820e;
        this.f9820e = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3721b7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4051w7)) {
            return super.equals(obj);
        }
        C4051w7 c4051w7 = (C4051w7) obj;
        if (this.f9820e != c4051w7.f9820e) {
            return false;
        }
        double[] dArr = c4051w7.f9819d;
        for (int i = 0; i < this.f9820e; i++) {
            if (Double.doubleToLongBits(this.f9819d[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m28694h(i);
        return Double.valueOf(this.f9819d[i]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3721b7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f9820e; i2++) {
            i = (i * 31) + C4004t8.m28907c(Double.doubleToLongBits(this.f9819d[i2]));
        }
        return i;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3988s8
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ InterfaceC3988s8 mo28653i(int i) {
        if (i >= this.f9820e) {
            return new C4051w7(Arrays.copyOf(this.f9819d, i), this.f9820e);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            int i = this.f9820e;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f9819d[i2] == doubleValue) {
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
        m28694h(i);
        double[] dArr = this.f9819d;
        double d = dArr[i];
        if (i < this.f9820e - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f9820e--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        m29798d();
        if (i2 >= i) {
            double[] dArr = this.f9819d;
            System.arraycopy(dArr, i2, dArr, i, this.f9820e - i2);
            this.f9820e -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        m29798d();
        m28694h(i);
        double[] dArr = this.f9819d;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9820e;
    }

    private C4051w7(double[] dArr, int i) {
        this.f9819d = dArr;
        this.f9820e = i;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3721b7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m28696e(((Double) obj).doubleValue());
        return true;
    }
}

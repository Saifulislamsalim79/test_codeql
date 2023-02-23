package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.c9 */
/* loaded from: classes2.dex */
final class C3739c9 extends AbstractC3721b7<Long> implements RandomAccess, InterfaceC3972r8, InterfaceC4037v9 {

    /* renamed from: f */
    private static final C3739c9 f9225f;

    /* renamed from: d */
    private long[] f9226d;

    /* renamed from: e */
    private int f9227e;

    static {
        C3739c9 c3739c9 = new C3739c9(new long[0], 0);
        f9225f = c3739c9;
        c3739c9.zzb();
    }

    C3739c9() {
        this(new long[10], 0);
    }

    /* renamed from: e */
    public static C3739c9 m29712e() {
        return f9225f;
    }

    /* renamed from: h */
    private final String m29710h(int i) {
        int i2 = this.f9227e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: k */
    private final void m29709k(int i) {
        if (i < 0 || i >= this.f9227e) {
            throw new IndexOutOfBoundsException(m29710h(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        m29798d();
        if (i >= 0 && i <= (i2 = this.f9227e)) {
            long[] jArr = this.f9226d;
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
            } else {
                long[] jArr2 = new long[((i2 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.f9226d, i, jArr2, i + 1, this.f9227e - i);
                this.f9226d = jArr2;
            }
            this.f9226d[i] = longValue;
            this.f9227e++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m29710h(i));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3721b7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        m29798d();
        C4004t8.m28905e(collection);
        if (!(collection instanceof C3739c9)) {
            return super.addAll(collection);
        }
        C3739c9 c3739c9 = (C3739c9) collection;
        int i = c3739c9.f9227e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9227e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f9226d;
            if (i3 > jArr.length) {
                this.f9226d = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(c3739c9.f9226d, 0, this.f9226d, this.f9227e, c3739c9.f9227e);
            this.f9227e = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3721b7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3739c9)) {
            return super.equals(obj);
        }
        C3739c9 c3739c9 = (C3739c9) obj;
        if (this.f9227e != c3739c9.f9227e) {
            return false;
        }
        long[] jArr = c3739c9.f9226d;
        for (int i = 0; i < this.f9227e; i++) {
            if (this.f9226d[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m29711f(long j) {
        m29798d();
        int i = this.f9227e;
        long[] jArr = this.f9226d;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f9226d = jArr2;
        }
        long[] jArr3 = this.f9226d;
        int i2 = this.f9227e;
        this.f9227e = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3972r8
    /* renamed from: g */
    public final long mo29028g(int i) {
        m29709k(i);
        return this.f9226d[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m29709k(i);
        return Long.valueOf(this.f9226d[i]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3721b7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f9227e; i2++) {
            i = (i * 31) + C4004t8.m28907c(this.f9226d[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int i = this.f9227e;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f9226d[i2] == longValue) {
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
        m29709k(i);
        long[] jArr = this.f9226d;
        long j = jArr[i];
        if (i < this.f9227e - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f9227e--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        m29798d();
        if (i2 >= i) {
            long[] jArr = this.f9226d;
            System.arraycopy(jArr, i2, jArr, i, this.f9227e - i2);
            this.f9227e -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        m29798d();
        m29709k(i);
        long[] jArr = this.f9226d;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9227e;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3988s8
    /* renamed from: z */
    public final InterfaceC3972r8 mo28653i(int i) {
        if (i >= this.f9227e) {
            return new C3739c9(Arrays.copyOf(this.f9226d, i), this.f9227e);
        }
        throw new IllegalArgumentException();
    }

    private C3739c9(long[] jArr, int i) {
        this.f9226d = jArr;
        this.f9227e = i;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3721b7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m29711f(((Long) obj).longValue());
        return true;
    }
}

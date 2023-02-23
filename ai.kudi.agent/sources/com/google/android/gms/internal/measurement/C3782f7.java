package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.f7 */
/* loaded from: classes2.dex */
final class C3782f7 extends AbstractC3721b7<Boolean> implements RandomAccess, InterfaceC3988s8, InterfaceC4037v9 {

    /* renamed from: f */
    private static final C3782f7 f9296f;

    /* renamed from: d */
    private boolean[] f9297d;

    /* renamed from: e */
    private int f9298e;

    static {
        C3782f7 c3782f7 = new C3782f7(new boolean[0], 0);
        f9296f = c3782f7;
        c3782f7.zzb();
    }

    C3782f7() {
        this(new boolean[10], 0);
    }

    /* renamed from: f */
    private final String m29611f(int i) {
        int i2 = this.f9298e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: h */
    private final void m29610h(int i) {
        if (i < 0 || i >= this.f9298e) {
            throw new IndexOutOfBoundsException(m29611f(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m29798d();
        if (i >= 0 && i <= (i2 = this.f9298e)) {
            boolean[] zArr = this.f9297d;
            if (i2 < zArr.length) {
                System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
            } else {
                boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i);
                System.arraycopy(this.f9297d, i, zArr2, i + 1, this.f9298e - i);
                this.f9297d = zArr2;
            }
            this.f9297d[i] = booleanValue;
            this.f9298e++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m29611f(i));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3721b7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        m29798d();
        C4004t8.m28905e(collection);
        if (!(collection instanceof C3782f7)) {
            return super.addAll(collection);
        }
        C3782f7 c3782f7 = (C3782f7) collection;
        int i = c3782f7.f9298e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9298e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f9297d;
            if (i3 > zArr.length) {
                this.f9297d = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(c3782f7.f9297d, 0, this.f9297d, this.f9298e, c3782f7.f9298e);
            this.f9298e = i3;
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
    public final void m29612e(boolean z) {
        m29798d();
        int i = this.f9298e;
        boolean[] zArr = this.f9297d;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f9297d = zArr2;
        }
        boolean[] zArr3 = this.f9297d;
        int i2 = this.f9298e;
        this.f9298e = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3721b7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3782f7)) {
            return super.equals(obj);
        }
        C3782f7 c3782f7 = (C3782f7) obj;
        if (this.f9298e != c3782f7.f9298e) {
            return false;
        }
        boolean[] zArr = c3782f7.f9297d;
        for (int i = 0; i < this.f9298e; i++) {
            if (this.f9297d[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m29610h(i);
        return Boolean.valueOf(this.f9297d[i]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3721b7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f9298e; i2++) {
            i = (i * 31) + C4004t8.m28909a(this.f9297d[i2]);
        }
        return i;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3988s8
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ InterfaceC3988s8 mo28653i(int i) {
        if (i >= this.f9298e) {
            return new C3782f7(Arrays.copyOf(this.f9297d, i), this.f9298e);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int i = this.f9298e;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f9297d[i2] == booleanValue) {
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
        m29610h(i);
        boolean[] zArr = this.f9297d;
        boolean z = zArr[i];
        if (i < this.f9298e - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f9298e--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        m29798d();
        if (i2 >= i) {
            boolean[] zArr = this.f9297d;
            System.arraycopy(zArr, i2, zArr, i, this.f9298e - i2);
            this.f9298e -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m29798d();
        m29610h(i);
        boolean[] zArr = this.f9297d;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9298e;
    }

    private C3782f7(boolean[] zArr, int i) {
        this.f9297d = zArr;
        this.f9298e = i;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3721b7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m29612e(((Boolean) obj).booleanValue());
        return true;
    }
}

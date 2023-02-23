package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.g8 */
/* loaded from: classes2.dex */
final class C3799g8 extends AbstractC3721b7<Float> implements RandomAccess, InterfaceC3988s8, InterfaceC4037v9 {

    /* renamed from: f */
    private static final C3799g8 f9369f;

    /* renamed from: d */
    private float[] f9370d;

    /* renamed from: e */
    private int f9371e;

    static {
        C3799g8 c3799g8 = new C3799g8(new float[0], 0);
        f9369f = c3799g8;
        c3799g8.zzb();
    }

    C3799g8() {
        this(new float[10], 0);
    }

    /* renamed from: f */
    private final String m29585f(int i) {
        int i2 = this.f9371e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: h */
    private final void m29584h(int i) {
        if (i < 0 || i >= this.f9371e) {
            throw new IndexOutOfBoundsException(m29585f(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        m29798d();
        if (i >= 0 && i <= (i2 = this.f9371e)) {
            float[] fArr = this.f9370d;
            if (i2 < fArr.length) {
                System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
            } else {
                float[] fArr2 = new float[((i2 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i);
                System.arraycopy(this.f9370d, i, fArr2, i + 1, this.f9371e - i);
                this.f9370d = fArr2;
            }
            this.f9370d[i] = floatValue;
            this.f9371e++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m29585f(i));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3721b7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        m29798d();
        C4004t8.m28905e(collection);
        if (!(collection instanceof C3799g8)) {
            return super.addAll(collection);
        }
        C3799g8 c3799g8 = (C3799g8) collection;
        int i = c3799g8.f9371e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9371e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f9370d;
            if (i3 > fArr.length) {
                this.f9370d = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(c3799g8.f9370d, 0, this.f9370d, this.f9371e, c3799g8.f9371e);
            this.f9371e = i3;
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
    public final void m29586e(float f) {
        m29798d();
        int i = this.f9371e;
        float[] fArr = this.f9370d;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f9370d = fArr2;
        }
        float[] fArr3 = this.f9370d;
        int i2 = this.f9371e;
        this.f9371e = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3721b7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3799g8)) {
            return super.equals(obj);
        }
        C3799g8 c3799g8 = (C3799g8) obj;
        if (this.f9371e != c3799g8.f9371e) {
            return false;
        }
        float[] fArr = c3799g8.f9370d;
        for (int i = 0; i < this.f9371e; i++) {
            if (Float.floatToIntBits(this.f9370d[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m29584h(i);
        return Float.valueOf(this.f9370d[i]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3721b7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f9371e; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f9370d[i2]);
        }
        return i;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3988s8
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ InterfaceC3988s8 mo28653i(int i) {
        if (i >= this.f9371e) {
            return new C3799g8(Arrays.copyOf(this.f9370d, i), this.f9371e);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            int i = this.f9371e;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f9370d[i2] == floatValue) {
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
        m29584h(i);
        float[] fArr = this.f9370d;
        float f = fArr[i];
        if (i < this.f9371e - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f9371e--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        m29798d();
        if (i2 >= i) {
            float[] fArr = this.f9370d;
            System.arraycopy(fArr, i2, fArr, i, this.f9371e - i2);
            this.f9371e -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        m29798d();
        m29584h(i);
        float[] fArr = this.f9370d;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9371e;
    }

    private C3799g8(float[] fArr, int i) {
        this.f9370d = fArr;
        this.f9371e = i;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3721b7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m29586e(((Float) obj).floatValue());
        return true;
    }
}

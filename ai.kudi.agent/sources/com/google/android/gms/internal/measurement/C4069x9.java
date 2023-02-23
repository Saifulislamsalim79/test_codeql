package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.x9 */
/* loaded from: classes2.dex */
final class C4069x9<E> extends AbstractC3721b7<E> implements RandomAccess {

    /* renamed from: f */
    private static final C4069x9<Object> f9838f;

    /* renamed from: d */
    private E[] f9839d;

    /* renamed from: e */
    private int f9840e;

    static {
        C4069x9<Object> c4069x9 = new C4069x9<>(new Object[0], 0);
        f9838f = c4069x9;
        c4069x9.zzb();
    }

    private C4069x9(E[] eArr, int i) {
        this.f9839d = eArr;
        this.f9840e = i;
    }

    /* renamed from: e */
    public static <E> C4069x9<E> m28656e() {
        return (C4069x9<E>) f9838f;
    }

    /* renamed from: f */
    private final String m28655f(int i) {
        int i2 = this.f9840e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: h */
    private final void m28654h(int i) {
        if (i < 0 || i >= this.f9840e) {
            throw new IndexOutOfBoundsException(m28655f(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        m29798d();
        if (i >= 0 && i <= (i2 = this.f9840e)) {
            E[] eArr = this.f9839d;
            if (i2 < eArr.length) {
                System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
            } else {
                E[] eArr2 = (E[]) new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(eArr, 0, eArr2, 0, i);
                System.arraycopy(this.f9839d, i, eArr2, i + 1, this.f9840e - i);
                this.f9839d = eArr2;
            }
            this.f9839d[i] = e;
            this.f9840e++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m28655f(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        m28654h(i);
        return this.f9839d[i];
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3988s8
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ InterfaceC3988s8 mo28653i(int i) {
        if (i >= this.f9840e) {
            return new C4069x9(Arrays.copyOf(this.f9839d, i), this.f9840e);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3721b7, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        int i2;
        m29798d();
        m28654h(i);
        E[] eArr = this.f9839d;
        E e = eArr[i];
        if (i < this.f9840e - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f9840e--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        m29798d();
        m28654h(i);
        E[] eArr = this.f9839d;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9840e;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3721b7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        m29798d();
        int i = this.f9840e;
        E[] eArr = this.f9839d;
        if (i == eArr.length) {
            this.f9839d = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f9839d;
        int i2 = this.f9840e;
        this.f9840e = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }
}

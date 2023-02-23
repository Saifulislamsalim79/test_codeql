package com.google.android.gms.internal.p104firebaseauthapi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.jp */
/* loaded from: classes2.dex */
final class C3278jp extends AbstractC3590vn<Integer> implements RandomAccess, InterfaceC3090d, InterfaceC3172g0 {

    /* renamed from: f */
    private static final C3278jp f8659f;

    /* renamed from: d */
    private int[] f8660d;

    /* renamed from: e */
    private int f8661e;

    static {
        C3278jp c3278jp = new C3278jp(new int[0], 0);
        f8659f = c3278jp;
        c3278jp.zzb();
    }

    C3278jp() {
        this(new int[10], 0);
    }

    /* renamed from: h */
    private final String m30882h(int i) {
        int i2 = this.f8661e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: k */
    private final void m30881k(int i) {
        if (i < 0 || i >= this.f8661e) {
            throw new IndexOutOfBoundsException(m30882h(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        m30106d();
        if (i >= 0 && i <= (i2 = this.f8661e)) {
            int[] iArr = this.f8660d;
            if (i2 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
            } else {
                int[] iArr2 = new int[((i2 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.f8660d, i, iArr2, i + 1, this.f8661e - i);
                this.f8660d = iArr2;
            }
            this.f8660d[i] = intValue;
            this.f8661e++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m30882h(i));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3590vn, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        m30106d();
        C3117e.m31221e(collection);
        if (!(collection instanceof C3278jp)) {
            return super.addAll(collection);
        }
        C3278jp c3278jp = (C3278jp) collection;
        int i = c3278jp.f8661e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f8661e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f8660d;
            if (i3 > iArr.length) {
                this.f8660d = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(c3278jp.f8660d, 0, this.f8660d, this.f8661e, c3278jp.f8661e);
            this.f8661e = i3;
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
    public final int m30884e(int i) {
        m30881k(i);
        return this.f8660d[i];
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3590vn, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3278jp)) {
            return super.equals(obj);
        }
        C3278jp c3278jp = (C3278jp) obj;
        if (this.f8661e != c3278jp.f8661e) {
            return false;
        }
        int[] iArr = c3278jp.f8660d;
        for (int i = 0; i < this.f8661e; i++) {
            if (this.f8660d[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m30883f(int i) {
        m30106d();
        int i2 = this.f8661e;
        int[] iArr = this.f8660d;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f8660d = iArr2;
        }
        int[] iArr3 = this.f8660d;
        int i3 = this.f8661e;
        this.f8661e = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        m30881k(i);
        return Integer.valueOf(this.f8660d[i]);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3590vn, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f8661e; i2++) {
            i = (i * 31) + this.f8660d[i2];
        }
        return i;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3090d
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ InterfaceC3090d mo29876i(int i) {
        if (i >= this.f8661e) {
            return new C3278jp(Arrays.copyOf(this.f8660d, i), this.f8661e);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i = this.f8661e;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f8660d[i2] == intValue) {
                    return i2;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3590vn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m30106d();
        m30881k(i);
        int[] iArr = this.f8660d;
        int i3 = iArr[i];
        if (i < this.f8661e - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.f8661e--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        m30106d();
        if (i2 >= i) {
            int[] iArr = this.f8660d;
            System.arraycopy(iArr, i2, iArr, i, this.f8661e - i2);
            this.f8661e -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        m30106d();
        m30881k(i);
        int[] iArr = this.f8660d;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8661e;
    }

    private C3278jp(int[] iArr, int i) {
        this.f8660d = iArr;
        this.f8661e = i;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3590vn, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m30883f(((Integer) obj).intValue());
        return true;
    }
}

package com.google.android.gms.internal.p104firebaseauthapi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.to */
/* loaded from: classes2.dex */
final class C3539to extends AbstractC3590vn<Double> implements RandomAccess, InterfaceC3090d, InterfaceC3172g0 {

    /* renamed from: f */
    private static final C3539to f8988f;

    /* renamed from: d */
    private double[] f8989d;

    /* renamed from: e */
    private int f8990e;

    static {
        C3539to c3539to = new C3539to(new double[0], 0);
        f8988f = c3539to;
        c3539to.zzb();
    }

    C3539to() {
        this(new double[10], 0);
    }

    /* renamed from: f */
    private final String m30209f(int i) {
        int i2 = this.f8990e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: h */
    private final void m30208h(int i) {
        if (i < 0 || i >= this.f8990e) {
            throw new IndexOutOfBoundsException(m30209f(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        m30106d();
        if (i >= 0 && i <= (i2 = this.f8990e)) {
            double[] dArr = this.f8989d;
            if (i2 < dArr.length) {
                System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
            } else {
                double[] dArr2 = new double[((i2 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i);
                System.arraycopy(this.f8989d, i, dArr2, i + 1, this.f8990e - i);
                this.f8989d = dArr2;
            }
            this.f8989d[i] = doubleValue;
            this.f8990e++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m30209f(i));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3590vn, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        m30106d();
        C3117e.m31221e(collection);
        if (!(collection instanceof C3539to)) {
            return super.addAll(collection);
        }
        C3539to c3539to = (C3539to) collection;
        int i = c3539to.f8990e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f8990e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f8989d;
            if (i3 > dArr.length) {
                this.f8989d = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(c3539to.f8989d, 0, this.f8989d, this.f8990e, c3539to.f8990e);
            this.f8990e = i3;
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
    public final void m30210e(double d) {
        m30106d();
        int i = this.f8990e;
        double[] dArr = this.f8989d;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f8989d = dArr2;
        }
        double[] dArr3 = this.f8989d;
        int i2 = this.f8990e;
        this.f8990e = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3590vn, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3539to)) {
            return super.equals(obj);
        }
        C3539to c3539to = (C3539to) obj;
        if (this.f8990e != c3539to.f8990e) {
            return false;
        }
        double[] dArr = c3539to.f8989d;
        for (int i = 0; i < this.f8990e; i++) {
            if (Double.doubleToLongBits(this.f8989d[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        m30208h(i);
        return Double.valueOf(this.f8989d[i]);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3590vn, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f8990e; i2++) {
            i = (i * 31) + C3117e.m31223c(Double.doubleToLongBits(this.f8989d[i2]));
        }
        return i;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3090d
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ InterfaceC3090d mo29876i(int i) {
        if (i >= this.f8990e) {
            return new C3539to(Arrays.copyOf(this.f8989d, i), this.f8990e);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            int i = this.f8990e;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f8989d[i2] == doubleValue) {
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
        m30208h(i);
        double[] dArr = this.f8989d;
        double d = dArr[i];
        if (i < this.f8990e - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f8990e--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        m30106d();
        if (i2 >= i) {
            double[] dArr = this.f8989d;
            System.arraycopy(dArr, i2, dArr, i, this.f8990e - i2);
            this.f8990e -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        m30106d();
        m30208h(i);
        double[] dArr = this.f8989d;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8990e;
    }

    private C3539to(double[] dArr, int i) {
        this.f8989d = dArr;
        this.f8990e = i;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3590vn, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m30210e(((Double) obj).doubleValue());
        return true;
    }
}

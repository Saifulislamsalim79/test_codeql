package com.google.protobuf;

import com.google.protobuf.C6997a0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DoubleArrayList.java */
/* renamed from: com.google.protobuf.m */
/* loaded from: classes2.dex */
public final class C7078m extends AbstractC7011c<Double> implements C6997a0.InterfaceC6999b, RandomAccess, InterfaceC7010b1 {

    /* renamed from: f */
    private static final C7078m f16905f;

    /* renamed from: d */
    private double[] f16906d;

    /* renamed from: e */
    private int f16907e;

    static {
        C7078m c7078m = new C7078m(new double[0], 0);
        f16905f = c7078m;
        c7078m.mo20220y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7078m() {
        this(new double[10], 0);
    }

    /* renamed from: k */
    private void m19814k(int i, double d) {
        int i2;
        m20221d();
        if (i >= 0 && i <= (i2 = this.f16907e)) {
            double[] dArr = this.f16906d;
            if (i2 < dArr.length) {
                System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
            } else {
                double[] dArr2 = new double[((i2 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i);
                System.arraycopy(this.f16906d, i, dArr2, i + 1, this.f16907e - i);
                this.f16906d = dArr2;
            }
            this.f16906d[i] = d;
            this.f16907e++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m19810u(i));
    }

    /* renamed from: l */
    private void m19813l(int i) {
        if (i < 0 || i >= this.f16907e) {
            throw new IndexOutOfBoundsException(m19810u(i));
        }
    }

    /* renamed from: u */
    private String m19810u(int i) {
        return "Index:" + i + ", Size:" + this.f16907e;
    }

    @Override // com.google.protobuf.C6997a0.InterfaceC7006i
    /* renamed from: E */
    public C6997a0.InterfaceC6999b mo19330j(int i) {
        if (i >= this.f16907e) {
            return new C7078m(Arrays.copyOf(this.f16906d, i), this.f16907e);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC7011c, java.util.AbstractList, java.util.List
    /* renamed from: F */
    public Double remove(int i) {
        int i2;
        m20221d();
        m19813l(i);
        double[] dArr = this.f16906d;
        double d = dArr[i];
        if (i < this.f16907e - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f16907e--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: I */
    public Double set(int i, Double d) {
        return Double.valueOf(m19818J(i, d.doubleValue()));
    }

    /* renamed from: J */
    public double m19818J(int i, double d) {
        m20221d();
        m19813l(i);
        double[] dArr = this.f16906d;
        double d2 = dArr[i];
        dArr[i] = d;
        return d2;
    }

    @Override // com.google.protobuf.AbstractC7011c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        m20221d();
        C6997a0.m20235a(collection);
        if (!(collection instanceof C7078m)) {
            return super.addAll(collection);
        }
        C7078m c7078m = (C7078m) collection;
        int i = c7078m.f16907e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f16907e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f16906d;
            if (i3 > dArr.length) {
                this.f16906d = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(c7078m.f16906d, 0, this.f16906d, this.f16907e, c7078m.f16907e);
            this.f16907e = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e */
    public void add(int i, Double d) {
        m19814k(i, d.doubleValue());
    }

    @Override // com.google.protobuf.AbstractC7011c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7078m)) {
            return super.equals(obj);
        }
        C7078m c7078m = (C7078m) obj;
        if (this.f16907e != c7078m.f16907e) {
            return false;
        }
        double[] dArr = c7078m.f16906d;
        for (int i = 0; i < this.f16907e; i++) {
            if (Double.doubleToLongBits(this.f16906d[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractC7011c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f */
    public boolean add(Double d) {
        m19815h(d.doubleValue());
        return true;
    }

    /* renamed from: h */
    public void m19815h(double d) {
        m20221d();
        int i = this.f16907e;
        double[] dArr = this.f16906d;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f16906d = dArr2;
        }
        double[] dArr3 = this.f16906d;
        int i2 = this.f16907e;
        this.f16907e = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // com.google.protobuf.AbstractC7011c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f16907e; i2++) {
            i = (i * 31) + C6997a0.m20230f(Double.doubleToLongBits(this.f16906d[i2]));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            int size = size();
            for (int i = 0; i < size; i++) {
                if (this.f16906d[i] == doubleValue) {
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m */
    public Double get(int i) {
        return Double.valueOf(m19811s(i));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i, int i2) {
        m20221d();
        if (i2 >= i) {
            double[] dArr = this.f16906d;
            System.arraycopy(dArr, i2, dArr, i, this.f16907e - i2);
            this.f16907e -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public double m19811s(int i) {
        m19813l(i);
        return this.f16906d[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f16907e;
    }

    private C7078m(double[] dArr, int i) {
        this.f16906d = dArr;
        this.f16907e = i;
    }
}

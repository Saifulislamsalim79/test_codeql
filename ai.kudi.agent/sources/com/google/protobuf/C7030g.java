package com.google.protobuf;

import com.google.protobuf.C6997a0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BooleanArrayList.java */
/* renamed from: com.google.protobuf.g */
/* loaded from: classes2.dex */
public final class C7030g extends AbstractC7011c<Boolean> implements C6997a0.InterfaceC6998a, RandomAccess, InterfaceC7010b1 {

    /* renamed from: f */
    private static final C7030g f16809f;

    /* renamed from: d */
    private boolean[] f16810d;

    /* renamed from: e */
    private int f16811e;

    static {
        C7030g c7030g = new C7030g(new boolean[0], 0);
        f16809f = c7030g;
        c7030g.mo20220y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7030g() {
        this(new boolean[10], 0);
    }

    /* renamed from: h */
    private void m20119h(int i, boolean z) {
        int i2;
        m20221d();
        if (i >= 0 && i <= (i2 = this.f16811e)) {
            boolean[] zArr = this.f16810d;
            if (i2 < zArr.length) {
                System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
            } else {
                boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i);
                System.arraycopy(this.f16810d, i, zArr2, i + 1, this.f16811e - i);
                this.f16810d = zArr2;
            }
            this.f16810d[i] = z;
            this.f16811e++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m20114u(i));
    }

    /* renamed from: l */
    private void m20117l(int i) {
        if (i < 0 || i >= this.f16811e) {
            throw new IndexOutOfBoundsException(m20114u(i));
        }
    }

    /* renamed from: u */
    private String m20114u(int i) {
        return "Index:" + i + ", Size:" + this.f16811e;
    }

    @Override // com.google.protobuf.C6997a0.InterfaceC7006i
    /* renamed from: E */
    public C6997a0.InterfaceC6998a mo19330j(int i) {
        if (i >= this.f16811e) {
            return new C7030g(Arrays.copyOf(this.f16810d, i), this.f16811e);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC7011c, java.util.AbstractList, java.util.List
    /* renamed from: F */
    public Boolean remove(int i) {
        int i2;
        m20221d();
        m20117l(i);
        boolean[] zArr = this.f16810d;
        boolean z = zArr[i];
        if (i < this.f16811e - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f16811e--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: I */
    public Boolean set(int i, Boolean bool) {
        return Boolean.valueOf(m20122J(i, bool.booleanValue()));
    }

    /* renamed from: J */
    public boolean m20122J(int i, boolean z) {
        m20221d();
        m20117l(i);
        boolean[] zArr = this.f16810d;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    @Override // com.google.protobuf.AbstractC7011c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        m20221d();
        C6997a0.m20235a(collection);
        if (!(collection instanceof C7030g)) {
            return super.addAll(collection);
        }
        C7030g c7030g = (C7030g) collection;
        int i = c7030g.f16811e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f16811e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f16810d;
            if (i3 > zArr.length) {
                this.f16810d = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(c7030g.f16810d, 0, this.f16810d, this.f16811e, c7030g.f16811e);
            this.f16811e = i3;
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
    public void add(int i, Boolean bool) {
        m20119h(i, bool.booleanValue());
    }

    @Override // com.google.protobuf.AbstractC7011c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7030g)) {
            return super.equals(obj);
        }
        C7030g c7030g = (C7030g) obj;
        if (this.f16811e != c7030g.f16811e) {
            return false;
        }
        boolean[] zArr = c7030g.f16810d;
        for (int i = 0; i < this.f16811e; i++) {
            if (this.f16810d[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractC7011c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f */
    public boolean add(Boolean bool) {
        m20118k(bool.booleanValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC7011c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f16811e; i2++) {
            i = (i * 31) + C6997a0.m20233c(this.f16810d[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int size = size();
            for (int i = 0; i < size; i++) {
                if (this.f16810d[i] == booleanValue) {
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }

    /* renamed from: k */
    public void m20118k(boolean z) {
        m20221d();
        int i = this.f16811e;
        boolean[] zArr = this.f16810d;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f16810d = zArr2;
        }
        boolean[] zArr3 = this.f16810d;
        int i2 = this.f16811e;
        this.f16811e = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m */
    public Boolean get(int i) {
        return Boolean.valueOf(m20115s(i));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i, int i2) {
        m20221d();
        if (i2 >= i) {
            boolean[] zArr = this.f16810d;
            System.arraycopy(zArr, i2, zArr, i, this.f16811e - i2);
            this.f16811e -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public boolean m20115s(int i) {
        m20117l(i);
        return this.f16810d[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f16811e;
    }

    private C7030g(boolean[] zArr, int i) {
        this.f16810d = zArr;
        this.f16811e = i;
    }
}

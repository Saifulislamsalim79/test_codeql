package com.google.protobuf;

import com.google.protobuf.C6997a0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IntArrayList.java */
/* renamed from: com.google.protobuf.z */
/* loaded from: classes2.dex */
public final class C7149z extends AbstractC7011c<Integer> implements C6997a0.InterfaceC7004g, RandomAccess, InterfaceC7010b1 {

    /* renamed from: f */
    private static final C7149z f17102f;

    /* renamed from: d */
    private int[] f17103d;

    /* renamed from: e */
    private int f17104e;

    static {
        C7149z c7149z = new C7149z(new int[0], 0);
        f17102f = c7149z;
        c7149z.mo20220y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7149z() {
        this(new int[10], 0);
    }

    /* renamed from: h */
    private void m19331h(int i, int i2) {
        int i3;
        m20221d();
        if (i >= 0 && i <= (i3 = this.f17104e)) {
            int[] iArr = this.f17103d;
            if (i3 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
            } else {
                int[] iArr2 = new int[((i3 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.f17103d, i, iArr2, i + 1, this.f17104e - i);
                this.f17103d = iArr2;
            }
            this.f17103d[i] = i2;
            this.f17104e++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m19326s(i));
    }

    /* renamed from: k */
    public static C7149z m19329k() {
        return f17102f;
    }

    /* renamed from: l */
    private void m19328l(int i) {
        if (i < 0 || i >= this.f17104e) {
            throw new IndexOutOfBoundsException(m19326s(i));
        }
    }

    /* renamed from: s */
    private String m19326s(int i) {
        return "Index:" + i + ", Size:" + this.f17104e;
    }

    @Override // com.google.protobuf.C6997a0.InterfaceC7004g
    /* renamed from: C */
    public void mo19336C(int i) {
        m20221d();
        int i2 = this.f17104e;
        int[] iArr = this.f17103d;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f17103d = iArr2;
        }
        int[] iArr3 = this.f17103d;
        int i3 = this.f17104e;
        this.f17104e = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: E */
    public Integer set(int i, Integer num) {
        return Integer.valueOf(m19334F(i, num.intValue()));
    }

    /* renamed from: F */
    public int m19334F(int i, int i2) {
        m20221d();
        m19328l(i);
        int[] iArr = this.f17103d;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    @Override // com.google.protobuf.AbstractC7011c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        m20221d();
        C6997a0.m20235a(collection);
        if (!(collection instanceof C7149z)) {
            return super.addAll(collection);
        }
        C7149z c7149z = (C7149z) collection;
        int i = c7149z.f17104e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f17104e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f17103d;
            if (i3 > iArr.length) {
                this.f17103d = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(c7149z.f17103d, 0, this.f17103d, this.f17104e, c7149z.f17104e);
            this.f17104e = i3;
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
    public void add(int i, Integer num) {
        m19331h(i, num.intValue());
    }

    @Override // com.google.protobuf.AbstractC7011c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7149z)) {
            return super.equals(obj);
        }
        C7149z c7149z = (C7149z) obj;
        if (this.f17104e != c7149z.f17104e) {
            return false;
        }
        int[] iArr = c7149z.f17103d;
        for (int i = 0; i < this.f17104e; i++) {
            if (this.f17103d[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractC7011c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f */
    public boolean add(Integer num) {
        mo19336C(num.intValue());
        return true;
    }

    @Override // com.google.protobuf.C6997a0.InterfaceC7004g
    public int getInt(int i) {
        m19328l(i);
        return this.f17103d[i];
    }

    @Override // com.google.protobuf.AbstractC7011c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f17104e; i2++) {
            i = (i * 31) + this.f17103d[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int size = size();
            for (int i = 0; i < size; i++) {
                if (this.f17103d[i] == intValue) {
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m */
    public Integer get(int i) {
        return Integer.valueOf(getInt(i));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i, int i2) {
        m20221d();
        if (i2 >= i) {
            int[] iArr = this.f17103d;
            System.arraycopy(iArr, i2, iArr, i, this.f17104e - i2);
            this.f17104e -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f17104e;
    }

    @Override // com.google.protobuf.AbstractC7011c, java.util.AbstractList, java.util.List
    /* renamed from: u */
    public Integer remove(int i) {
        int i2;
        m20221d();
        m19328l(i);
        int[] iArr = this.f17103d;
        int i3 = iArr[i];
        if (i < this.f17104e - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.f17104e--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    private C7149z(int[] iArr, int i) {
        this.f17103d = iArr;
        this.f17104e = i;
    }

    @Override // com.google.protobuf.C6997a0.InterfaceC7006i
    /* renamed from: j */
    public C6997a0.InterfaceC7006i<Integer> mo19330j(int i) {
        if (i >= this.f17104e) {
            return new C7149z(Arrays.copyOf(this.f17103d, i), this.f17104e);
        }
        throw new IllegalArgumentException();
    }
}

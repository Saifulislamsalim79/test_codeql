package com.google.protobuf;

import com.google.protobuf.C6997a0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LongArrayList.java */
/* renamed from: com.google.protobuf.i0 */
/* loaded from: classes2.dex */
public final class C7050i0 extends AbstractC7011c<Long> implements C6997a0.InterfaceC7005h, RandomAccess, InterfaceC7010b1 {

    /* renamed from: f */
    private static final C7050i0 f16826f;

    /* renamed from: d */
    private long[] f16827d;

    /* renamed from: e */
    private int f16828e;

    static {
        C7050i0 c7050i0 = new C7050i0(new long[0], 0);
        f16826f = c7050i0;
        c7050i0.mo20220y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7050i0() {
        this(new long[10], 0);
    }

    /* renamed from: h */
    private void m20076h(int i, long j) {
        int i2;
        m20221d();
        if (i >= 0 && i <= (i2 = this.f16828e)) {
            long[] jArr = this.f16827d;
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
            } else {
                long[] jArr2 = new long[((i2 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.f16827d, i, jArr2, i + 1, this.f16828e - i);
                this.f16827d = jArr2;
            }
            this.f16827d[i] = j;
            this.f16828e++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m20071u(i));
    }

    /* renamed from: l */
    private void m20074l(int i) {
        if (i < 0 || i >= this.f16828e) {
            throw new IndexOutOfBoundsException(m20071u(i));
        }
    }

    /* renamed from: u */
    private String m20071u(int i) {
        return "Index:" + i + ", Size:" + this.f16828e;
    }

    @Override // com.google.protobuf.C6997a0.InterfaceC7006i
    /* renamed from: E */
    public C6997a0.InterfaceC7005h mo19330j(int i) {
        if (i >= this.f16828e) {
            return new C7050i0(Arrays.copyOf(this.f16827d, i), this.f16828e);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC7011c, java.util.AbstractList, java.util.List
    /* renamed from: F */
    public Long remove(int i) {
        int i2;
        m20221d();
        m20074l(i);
        long[] jArr = this.f16827d;
        long j = jArr[i];
        if (i < this.f16828e - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f16828e--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: I */
    public Long set(int i, Long l) {
        return Long.valueOf(m20079J(i, l.longValue()));
    }

    /* renamed from: J */
    public long m20079J(int i, long j) {
        m20221d();
        m20074l(i);
        long[] jArr = this.f16827d;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    @Override // com.google.protobuf.AbstractC7011c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        m20221d();
        C6997a0.m20235a(collection);
        if (!(collection instanceof C7050i0)) {
            return super.addAll(collection);
        }
        C7050i0 c7050i0 = (C7050i0) collection;
        int i = c7050i0.f16828e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f16828e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f16827d;
            if (i3 > jArr.length) {
                this.f16827d = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(c7050i0.f16827d, 0, this.f16827d, this.f16828e, c7050i0.f16828e);
            this.f16828e = i3;
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
    public void add(int i, Long l) {
        m20076h(i, l.longValue());
    }

    @Override // com.google.protobuf.AbstractC7011c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7050i0)) {
            return super.equals(obj);
        }
        C7050i0 c7050i0 = (C7050i0) obj;
        if (this.f16828e != c7050i0.f16828e) {
            return false;
        }
        long[] jArr = c7050i0.f16827d;
        for (int i = 0; i < this.f16828e; i++) {
            if (this.f16827d[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractC7011c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f */
    public boolean add(Long l) {
        m20075k(l.longValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC7011c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f16828e; i2++) {
            i = (i * 31) + C6997a0.m20230f(this.f16827d[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int size = size();
            for (int i = 0; i < size; i++) {
                if (this.f16827d[i] == longValue) {
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }

    /* renamed from: k */
    public void m20075k(long j) {
        m20221d();
        int i = this.f16828e;
        long[] jArr = this.f16827d;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f16827d = jArr2;
        }
        long[] jArr3 = this.f16827d;
        int i2 = this.f16828e;
        this.f16828e = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m */
    public Long get(int i) {
        return Long.valueOf(m20072s(i));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i, int i2) {
        m20221d();
        if (i2 >= i) {
            long[] jArr = this.f16827d;
            System.arraycopy(jArr, i2, jArr, i, this.f16828e - i2);
            this.f16828e -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public long m20072s(int i) {
        m20074l(i);
        return this.f16827d[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f16828e;
    }

    private C7050i0(long[] jArr, int i) {
        this.f16827d = jArr;
        this.f16828e = i;
    }
}

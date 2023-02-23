package com.google.android.gms.internal.p104firebaseauthapi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.n */
/* loaded from: classes2.dex */
final class C3358n extends AbstractC3590vn<Long> implements RandomAccess, InterfaceC3090d, InterfaceC3172g0 {

    /* renamed from: f */
    private static final C3358n f8741f;

    /* renamed from: d */
    private long[] f8742d;

    /* renamed from: e */
    private int f8743e;

    static {
        C3358n c3358n = new C3358n(new long[0], 0);
        f8741f = c3358n;
        c3358n.zzb();
    }

    C3358n() {
        this(new long[10], 0);
    }

    /* renamed from: h */
    private final String m30646h(int i) {
        int i2 = this.f8743e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: k */
    private final void m30645k(int i) {
        if (i < 0 || i >= this.f8743e) {
            throw new IndexOutOfBoundsException(m30646h(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        m30106d();
        if (i >= 0 && i <= (i2 = this.f8743e)) {
            long[] jArr = this.f8742d;
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
            } else {
                long[] jArr2 = new long[((i2 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.f8742d, i, jArr2, i + 1, this.f8743e - i);
                this.f8742d = jArr2;
            }
            this.f8742d[i] = longValue;
            this.f8743e++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m30646h(i));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3590vn, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        m30106d();
        C3117e.m31221e(collection);
        if (!(collection instanceof C3358n)) {
            return super.addAll(collection);
        }
        C3358n c3358n = (C3358n) collection;
        int i = c3358n.f8743e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f8743e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f8742d;
            if (i3 > jArr.length) {
                this.f8742d = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(c3358n.f8742d, 0, this.f8742d, this.f8743e, c3358n.f8743e);
            this.f8743e = i3;
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
    public final long m30648e(int i) {
        m30645k(i);
        return this.f8742d[i];
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3590vn, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3358n)) {
            return super.equals(obj);
        }
        C3358n c3358n = (C3358n) obj;
        if (this.f8743e != c3358n.f8743e) {
            return false;
        }
        long[] jArr = c3358n.f8742d;
        for (int i = 0; i < this.f8743e; i++) {
            if (this.f8742d[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m30647f(long j) {
        m30106d();
        int i = this.f8743e;
        long[] jArr = this.f8742d;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f8742d = jArr2;
        }
        long[] jArr3 = this.f8742d;
        int i2 = this.f8743e;
        this.f8743e = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        m30645k(i);
        return Long.valueOf(this.f8742d[i]);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3590vn, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f8743e; i2++) {
            i = (i * 31) + C3117e.m31223c(this.f8742d[i2]);
        }
        return i;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3090d
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ InterfaceC3090d mo29876i(int i) {
        if (i >= this.f8743e) {
            return new C3358n(Arrays.copyOf(this.f8742d, i), this.f8743e);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int i = this.f8743e;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f8742d[i2] == longValue) {
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
        m30645k(i);
        long[] jArr = this.f8742d;
        long j = jArr[i];
        if (i < this.f8743e - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f8743e--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        m30106d();
        if (i2 >= i) {
            long[] jArr = this.f8742d;
            System.arraycopy(jArr, i2, jArr, i, this.f8743e - i2);
            this.f8743e -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        m30106d();
        m30645k(i);
        long[] jArr = this.f8742d;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8743e;
    }

    private C3358n(long[] jArr, int i) {
        this.f8742d = jArr;
        this.f8743e = i;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3590vn, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m30647f(((Long) obj).longValue());
        return true;
    }
}

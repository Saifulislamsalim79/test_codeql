package com.google.android.gms.internal.p104firebaseauthapi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zn */
/* loaded from: classes2.dex */
final class C3694zn extends AbstractC3590vn<Boolean> implements RandomAccess, InterfaceC3090d, InterfaceC3172g0 {

    /* renamed from: f */
    private static final C3694zn f9166f;

    /* renamed from: d */
    private boolean[] f9167d;

    /* renamed from: e */
    private int f9168e;

    static {
        C3694zn c3694zn = new C3694zn(new boolean[0], 0);
        f9166f = c3694zn;
        c3694zn.zzb();
    }

    C3694zn() {
        this(new boolean[10], 0);
    }

    /* renamed from: f */
    private final String m29878f(int i) {
        int i2 = this.f9168e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: h */
    private final void m29877h(int i) {
        if (i < 0 || i >= this.f9168e) {
            throw new IndexOutOfBoundsException(m29878f(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m30106d();
        if (i >= 0 && i <= (i2 = this.f9168e)) {
            boolean[] zArr = this.f9167d;
            if (i2 < zArr.length) {
                System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
            } else {
                boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i);
                System.arraycopy(this.f9167d, i, zArr2, i + 1, this.f9168e - i);
                this.f9167d = zArr2;
            }
            this.f9167d[i] = booleanValue;
            this.f9168e++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m29878f(i));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3590vn, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        m30106d();
        C3117e.m31221e(collection);
        if (!(collection instanceof C3694zn)) {
            return super.addAll(collection);
        }
        C3694zn c3694zn = (C3694zn) collection;
        int i = c3694zn.f9168e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9168e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f9167d;
            if (i3 > zArr.length) {
                this.f9167d = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(c3694zn.f9167d, 0, this.f9167d, this.f9168e, c3694zn.f9168e);
            this.f9168e = i3;
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
    public final void m29879e(boolean z) {
        m30106d();
        int i = this.f9168e;
        boolean[] zArr = this.f9167d;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f9167d = zArr2;
        }
        boolean[] zArr3 = this.f9167d;
        int i2 = this.f9168e;
        this.f9168e = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3590vn, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3694zn)) {
            return super.equals(obj);
        }
        C3694zn c3694zn = (C3694zn) obj;
        if (this.f9168e != c3694zn.f9168e) {
            return false;
        }
        boolean[] zArr = c3694zn.f9167d;
        for (int i = 0; i < this.f9168e; i++) {
            if (this.f9167d[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        m29877h(i);
        return Boolean.valueOf(this.f9167d[i]);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3590vn, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f9168e; i2++) {
            i = (i * 31) + C3117e.m31225a(this.f9167d[i2]);
        }
        return i;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3090d
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ InterfaceC3090d mo29876i(int i) {
        if (i >= this.f9168e) {
            return new C3694zn(Arrays.copyOf(this.f9167d, i), this.f9168e);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int i = this.f9168e;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f9167d[i2] == booleanValue) {
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
        m29877h(i);
        boolean[] zArr = this.f9167d;
        boolean z = zArr[i];
        if (i < this.f9168e - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f9168e--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        m30106d();
        if (i2 >= i) {
            boolean[] zArr = this.f9167d;
            System.arraycopy(zArr, i2, zArr, i, this.f9168e - i2);
            this.f9168e -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m30106d();
        m29877h(i);
        boolean[] zArr = this.f9167d;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9168e;
    }

    private C3694zn(boolean[] zArr, int i) {
        this.f9167d = zArr;
        this.f9168e = i;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3590vn, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m29879e(((Boolean) obj).booleanValue());
        return true;
    }
}

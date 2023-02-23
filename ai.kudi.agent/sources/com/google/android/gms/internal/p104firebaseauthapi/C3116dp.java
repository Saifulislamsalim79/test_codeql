package com.google.android.gms.internal.p104firebaseauthapi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.dp */
/* loaded from: classes2.dex */
final class C3116dp extends AbstractC3590vn<Float> implements RandomAccess, InterfaceC3090d, InterfaceC3172g0 {

    /* renamed from: f */
    private static final C3116dp f8409f;

    /* renamed from: d */
    private float[] f8410d;

    /* renamed from: e */
    private int f8411e;

    static {
        C3116dp c3116dp = new C3116dp(new float[0], 0);
        f8409f = c3116dp;
        c3116dp.zzb();
    }

    C3116dp() {
        this(new float[10], 0);
    }

    /* renamed from: f */
    private final String m31227f(int i) {
        int i2 = this.f8411e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: h */
    private final void m31226h(int i) {
        if (i < 0 || i >= this.f8411e) {
            throw new IndexOutOfBoundsException(m31227f(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        m30106d();
        if (i >= 0 && i <= (i2 = this.f8411e)) {
            float[] fArr = this.f8410d;
            if (i2 < fArr.length) {
                System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
            } else {
                float[] fArr2 = new float[((i2 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i);
                System.arraycopy(this.f8410d, i, fArr2, i + 1, this.f8411e - i);
                this.f8410d = fArr2;
            }
            this.f8410d[i] = floatValue;
            this.f8411e++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m31227f(i));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3590vn, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        m30106d();
        C3117e.m31221e(collection);
        if (!(collection instanceof C3116dp)) {
            return super.addAll(collection);
        }
        C3116dp c3116dp = (C3116dp) collection;
        int i = c3116dp.f8411e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f8411e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f8410d;
            if (i3 > fArr.length) {
                this.f8410d = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(c3116dp.f8410d, 0, this.f8410d, this.f8411e, c3116dp.f8411e);
            this.f8411e = i3;
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
    public final void m31228e(float f) {
        m30106d();
        int i = this.f8411e;
        float[] fArr = this.f8410d;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f8410d = fArr2;
        }
        float[] fArr3 = this.f8410d;
        int i2 = this.f8411e;
        this.f8411e = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3590vn, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3116dp)) {
            return super.equals(obj);
        }
        C3116dp c3116dp = (C3116dp) obj;
        if (this.f8411e != c3116dp.f8411e) {
            return false;
        }
        float[] fArr = c3116dp.f8410d;
        for (int i = 0; i < this.f8411e; i++) {
            if (Float.floatToIntBits(this.f8410d[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        m31226h(i);
        return Float.valueOf(this.f8410d[i]);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3590vn, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f8411e; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f8410d[i2]);
        }
        return i;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3090d
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ InterfaceC3090d mo29876i(int i) {
        if (i >= this.f8411e) {
            return new C3116dp(Arrays.copyOf(this.f8410d, i), this.f8411e);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            int i = this.f8411e;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f8410d[i2] == floatValue) {
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
        m31226h(i);
        float[] fArr = this.f8410d;
        float f = fArr[i];
        if (i < this.f8411e - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f8411e--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        m30106d();
        if (i2 >= i) {
            float[] fArr = this.f8410d;
            System.arraycopy(fArr, i2, fArr, i, this.f8411e - i2);
            this.f8411e -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        m30106d();
        m31226h(i);
        float[] fArr = this.f8410d;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8411e;
    }

    private C3116dp(float[] fArr, int i) {
        this.f8410d = fArr;
        this.f8411e = i;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3590vn, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m31228e(((Float) obj).floatValue());
        return true;
    }
}

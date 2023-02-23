package com.google.android.gms.internal.p104firebaseauthapi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.i0 */
/* loaded from: classes2.dex */
final class C3226i0<E> extends AbstractC3590vn<E> implements RandomAccess {

    /* renamed from: f */
    private static final C3226i0<Object> f8573f;

    /* renamed from: d */
    private E[] f8574d;

    /* renamed from: e */
    private int f8575e;

    static {
        C3226i0<Object> c3226i0 = new C3226i0<>(new Object[0], 0);
        f8573f = c3226i0;
        c3226i0.zzb();
    }

    private C3226i0(E[] eArr, int i) {
        this.f8574d = eArr;
        this.f8575e = i;
    }

    /* renamed from: e */
    public static <E> C3226i0<E> m31003e() {
        return (C3226i0<E>) f8573f;
    }

    /* renamed from: f */
    private final String m31002f(int i) {
        int i2 = this.f8575e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: h */
    private final void m31001h(int i) {
        if (i < 0 || i >= this.f8575e) {
            throw new IndexOutOfBoundsException(m31002f(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        m30106d();
        if (i >= 0 && i <= (i2 = this.f8575e)) {
            E[] eArr = this.f8574d;
            if (i2 < eArr.length) {
                System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
            } else {
                E[] eArr2 = (E[]) new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(eArr, 0, eArr2, 0, i);
                System.arraycopy(this.f8574d, i, eArr2, i + 1, this.f8575e - i);
                this.f8574d = eArr2;
            }
            this.f8574d[i] = e;
            this.f8575e++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m31002f(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        m31001h(i);
        return this.f8574d[i];
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3090d
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ InterfaceC3090d mo29876i(int i) {
        if (i >= this.f8575e) {
            return new C3226i0(Arrays.copyOf(this.f8574d, i), this.f8575e);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3590vn, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        int i2;
        m30106d();
        m31001h(i);
        E[] eArr = this.f8574d;
        E e = eArr[i];
        if (i < this.f8575e - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f8575e--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        m30106d();
        m31001h(i);
        E[] eArr = this.f8574d;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8575e;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3590vn, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        m30106d();
        int i = this.f8575e;
        E[] eArr = this.f8574d;
        if (i == eArr.length) {
            this.f8574d = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f8574d;
        int i2 = this.f8575e;
        this.f8575e = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }
}

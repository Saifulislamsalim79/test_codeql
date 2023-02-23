package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProtobufArrayList.java */
/* renamed from: com.google.protobuf.e1 */
/* loaded from: classes2.dex */
public final class C7024e1<E> extends AbstractC7011c<E> implements RandomAccess {

    /* renamed from: f */
    private static final C7024e1<Object> f16793f;

    /* renamed from: d */
    private E[] f16794d;

    /* renamed from: e */
    private int f16795e;

    static {
        C7024e1<Object> c7024e1 = new C7024e1<>(new Object[0], 0);
        f16793f = c7024e1;
        c7024e1.mo20220y();
    }

    private C7024e1(E[] eArr, int i) {
        this.f16794d = eArr;
        this.f16795e = i;
    }

    /* renamed from: e */
    private static <E> E[] m20162e(int i) {
        return (E[]) new Object[i];
    }

    /* renamed from: f */
    public static <E> C7024e1<E> m20161f() {
        return (C7024e1<E>) f16793f;
    }

    /* renamed from: h */
    private void m20160h(int i) {
        if (i < 0 || i >= this.f16795e) {
            throw new IndexOutOfBoundsException(m20159k(i));
        }
    }

    /* renamed from: k */
    private String m20159k(int i) {
        return "Index:" + i + ", Size:" + this.f16795e;
    }

    @Override // com.google.protobuf.AbstractC7011c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        m20221d();
        int i = this.f16795e;
        E[] eArr = this.f16794d;
        if (i == eArr.length) {
            this.f16794d = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f16794d;
        int i2 = this.f16795e;
        this.f16795e = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        m20160h(i);
        return this.f16794d[i];
    }

    @Override // com.google.protobuf.C6997a0.InterfaceC7006i
    /* renamed from: l */
    public C7024e1<E> mo19330j(int i) {
        if (i >= this.f16795e) {
            return new C7024e1<>(Arrays.copyOf(this.f16794d, i), this.f16795e);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC7011c, java.util.AbstractList, java.util.List
    public E remove(int i) {
        int i2;
        m20221d();
        m20160h(i);
        E[] eArr = this.f16794d;
        E e = eArr[i];
        if (i < this.f16795e - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f16795e--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        m20221d();
        m20160h(i);
        E[] eArr = this.f16794d;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f16795e;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        int i2;
        m20221d();
        if (i >= 0 && i <= (i2 = this.f16795e)) {
            E[] eArr = this.f16794d;
            if (i2 < eArr.length) {
                System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
            } else {
                E[] eArr2 = (E[]) m20162e(((i2 * 3) / 2) + 1);
                System.arraycopy(this.f16794d, 0, eArr2, 0, i);
                System.arraycopy(this.f16794d, i, eArr2, i + 1, this.f16795e - i);
                this.f16794d = eArr2;
            }
            this.f16794d[i] = e;
            this.f16795e++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m20159k(i));
    }
}

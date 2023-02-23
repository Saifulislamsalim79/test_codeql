package com.google.protobuf;

import com.google.protobuf.C6997a0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FloatArrayList.java */
/* renamed from: com.google.protobuf.w */
/* loaded from: classes2.dex */
public final class C7137w extends AbstractC7011c<Float> implements C6997a0.InterfaceC7003f, RandomAccess, InterfaceC7010b1 {

    /* renamed from: f */
    private static final C7137w f17077f;

    /* renamed from: d */
    private float[] f17078d;

    /* renamed from: e */
    private int f17079e;

    static {
        C7137w c7137w = new C7137w(new float[0], 0);
        f17077f = c7137w;
        c7137w.mo20220y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7137w() {
        this(new float[10], 0);
    }

    /* renamed from: k */
    private void m19403k(int i, float f) {
        int i2;
        m20221d();
        if (i >= 0 && i <= (i2 = this.f17079e)) {
            float[] fArr = this.f17078d;
            if (i2 < fArr.length) {
                System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
            } else {
                float[] fArr2 = new float[((i2 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i);
                System.arraycopy(this.f17078d, i, fArr2, i + 1, this.f17079e - i);
                this.f17078d = fArr2;
            }
            this.f17078d[i] = f;
            this.f17079e++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m19399u(i));
    }

    /* renamed from: l */
    private void m19402l(int i) {
        if (i < 0 || i >= this.f17079e) {
            throw new IndexOutOfBoundsException(m19399u(i));
        }
    }

    /* renamed from: u */
    private String m19399u(int i) {
        return "Index:" + i + ", Size:" + this.f17079e;
    }

    @Override // com.google.protobuf.C6997a0.InterfaceC7006i
    /* renamed from: E */
    public C6997a0.InterfaceC7003f mo19330j(int i) {
        if (i >= this.f17079e) {
            return new C7137w(Arrays.copyOf(this.f17078d, i), this.f17079e);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC7011c, java.util.AbstractList, java.util.List
    /* renamed from: F */
    public Float remove(int i) {
        int i2;
        m20221d();
        m19402l(i);
        float[] fArr = this.f17078d;
        float f = fArr[i];
        if (i < this.f17079e - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f17079e--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: I */
    public Float set(int i, Float f) {
        return Float.valueOf(m19407J(i, f.floatValue()));
    }

    /* renamed from: J */
    public float m19407J(int i, float f) {
        m20221d();
        m19402l(i);
        float[] fArr = this.f17078d;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    @Override // com.google.protobuf.AbstractC7011c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        m20221d();
        C6997a0.m20235a(collection);
        if (!(collection instanceof C7137w)) {
            return super.addAll(collection);
        }
        C7137w c7137w = (C7137w) collection;
        int i = c7137w.f17079e;
        if (i == 0) {
            return false;
        }
        int i2 = this.f17079e;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f17078d;
            if (i3 > fArr.length) {
                this.f17078d = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(c7137w.f17078d, 0, this.f17078d, this.f17079e, c7137w.f17079e);
            this.f17079e = i3;
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
    public void add(int i, Float f) {
        m19403k(i, f.floatValue());
    }

    @Override // com.google.protobuf.AbstractC7011c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7137w)) {
            return super.equals(obj);
        }
        C7137w c7137w = (C7137w) obj;
        if (this.f17079e != c7137w.f17079e) {
            return false;
        }
        float[] fArr = c7137w.f17078d;
        for (int i = 0; i < this.f17079e; i++) {
            if (Float.floatToIntBits(this.f17078d[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractC7011c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f */
    public boolean add(Float f) {
        m19404h(f.floatValue());
        return true;
    }

    /* renamed from: h */
    public void m19404h(float f) {
        m20221d();
        int i = this.f17079e;
        float[] fArr = this.f17078d;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f17078d = fArr2;
        }
        float[] fArr3 = this.f17078d;
        int i2 = this.f17079e;
        this.f17079e = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // com.google.protobuf.AbstractC7011c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f17079e; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f17078d[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            int size = size();
            for (int i = 0; i < size; i++) {
                if (this.f17078d[i] == floatValue) {
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m */
    public Float get(int i) {
        return Float.valueOf(m19400s(i));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i, int i2) {
        m20221d();
        if (i2 >= i) {
            float[] fArr = this.f17078d;
            System.arraycopy(fArr, i2, fArr, i, this.f17079e - i2);
            this.f17079e -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public float m19400s(int i) {
        m19402l(i);
        return this.f17078d[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f17079e;
    }

    private C7137w(float[] fArr, int i) {
        this.f17078d = fArr;
        this.f17079e = i;
    }
}

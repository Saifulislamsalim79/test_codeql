package com.google.common.collect;

import com.google.common.base.C5051n;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
/* compiled from: ImmutableCollection.java */
/* renamed from: com.google.common.collect.h */
/* loaded from: classes2.dex */
public abstract class AbstractC5072h<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: c */
    private static final Object[] f12713c = new Object[0];

    /* compiled from: ImmutableCollection.java */
    /* renamed from: com.google.common.collect.h$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC5073a<E> {
        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public static int m25740a(int i, int i2) {
            if (i2 >= 0) {
                int i3 = i + (i >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                if (i3 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i3;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object obj);

    /* renamed from: d */
    int mo25555d(Object[] objArr, int i) {
        AbstractC5064a0<E> mo25553l = mo25553l();
        while (mo25553l.hasNext()) {
            objArr[i] = mo25553l.next();
            i++;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Object[] mo25562e() {
        return null;
    }

    /* renamed from: f */
    int mo25561f() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo25560h() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract boolean mo25554k();

    /* renamed from: l */
    public abstract AbstractC5064a0<E> mo25553l();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f12713c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        C5051n.m25780n(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] mo25562e = mo25562e();
            if (mo25562e != null) {
                return (T[]) C5126t.m25577a(mo25562e, mo25560h(), mo25561f(), tArr);
            }
            tArr = (T[]) C5124r.m25580d(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo25555d(tArr, 0);
        return tArr;
    }
}

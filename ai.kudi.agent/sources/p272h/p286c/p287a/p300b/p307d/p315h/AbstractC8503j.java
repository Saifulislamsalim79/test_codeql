package p272h.p286c.p287a.p300b.p307d.p315h;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: com.google.mlkit:common@@18.0.0 */
/* renamed from: h.c.a.b.d.h.j */
/* loaded from: classes2.dex */
public abstract class AbstractC8503j extends AbstractC8497g implements List, RandomAccess {

    /* renamed from: d */
    private static final AbstractC8529w f20211d = new C8499h(C8513o.f20219w, 0);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static AbstractC8503j m16024l(Object[] objArr) {
        return m16023m(objArr, objArr.length);
    }

    /* renamed from: m */
    static AbstractC8503j m16023m(Object[] objArr, int i) {
        if (i == 0) {
            return C8513o.f20219w;
        }
        return new C8513o(objArr, i);
    }

    /* renamed from: s */
    public static AbstractC8503j m16022s(Object obj) {
        Object[] objArr = {obj};
        C8511n.m16016a(objArr, 1);
        return m16023m(objArr, 1);
    }

    /* renamed from: u */
    public static AbstractC8503j m16021u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9};
        C8511n.m16016a(objArr, 9);
        return m16023m(objArr, 9);
    }

    @Override // java.util.List
    /* renamed from: E */
    public final AbstractC8529w listIterator(int i) {
        C8487b.m16038b(i, size(), "index");
        return isEmpty() ? f20211d : new C8499h(this, i);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p315h.AbstractC8497g, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p272h.p286c.p287a.p300b.p307d.p315h.AbstractC8497g
    /* renamed from: d */
    public int mo16005d(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (C8528v0.m15997a(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!C8528v0.m15997a(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: k */
    public AbstractC8503j subList(int i, int i2) {
        C8487b.m16037c(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return C8513o.f20219w;
        }
        return new C8501i(this, i, i3);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }
}

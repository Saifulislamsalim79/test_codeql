package com.google.common.collect;

import com.google.common.base.C5051n;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
/* compiled from: ImmutableSet.java */
/* renamed from: com.google.common.collect.k */
/* loaded from: classes2.dex */
public abstract class AbstractC5079k<E> extends AbstractC5072h<E> implements Set<E> {

    /* renamed from: d */
    private transient AbstractC5074i<E> f12726d;

    /* renamed from: E */
    public static <E> AbstractC5079k<E> m25716E(Collection<? extends E> collection) {
        if ((collection instanceof AbstractC5079k) && !(collection instanceof SortedSet)) {
            AbstractC5079k<E> abstractC5079k = (AbstractC5079k) collection;
            if (!abstractC5079k.mo25554k()) {
                return abstractC5079k;
            }
        }
        Object[] array = collection.toArray();
        return m25710u(array.length, array);
    }

    /* renamed from: J */
    public static <E> AbstractC5079k<E> m25715J() {
        return C5133w.f12807z;
    }

    /* renamed from: O */
    public static <E> AbstractC5079k<E> m25714O(E e) {
        return new C5135y(e);
    }

    /* renamed from: P */
    public static <E> AbstractC5079k<E> m25713P(E e, E e2, E e3) {
        return m25710u(3, e, e2, e3);
    }

    /* renamed from: V */
    private static boolean m25712V(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static int m25711s(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (true) {
                double d = highestOneBit;
                Double.isNaN(d);
                if (d * 0.7d >= max) {
                    return highestOneBit;
                }
                highestOneBit <<= 1;
            }
        } else {
            C5051n.m25789e(max < 1073741824, "collection too large");
            return 1073741824;
        }
    }

    /* renamed from: u */
    private static <E> AbstractC5079k<E> m25710u(int i, Object... objArr) {
        if (i != 0) {
            if (i != 1) {
                int m25711s = m25711s(i);
                Object[] objArr2 = new Object[m25711s];
                int i2 = m25711s - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object obj = objArr[i5];
                    C5124r.m25583a(obj, i5);
                    int hashCode = obj.hashCode();
                    int m25742a = C5071g.m25742a(hashCode);
                    while (true) {
                        int i6 = m25742a & i2;
                        Object obj2 = objArr2[i6];
                        if (obj2 == null) {
                            objArr[i4] = obj;
                            objArr2[i6] = obj;
                            i3 += hashCode;
                            i4++;
                            break;
                        } else if (obj2.equals(obj)) {
                            break;
                        } else {
                            m25742a++;
                        }
                    }
                }
                Arrays.fill(objArr, i4, i, (Object) null);
                if (i4 == 1) {
                    return new C5135y(objArr[0], i3);
                }
                if (m25711s(i4) < m25711s / 2) {
                    return m25710u(i4, objArr);
                }
                if (m25712V(i4, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new C5133w(objArr, i3, objArr2, i2, i4);
            }
            return m25714O(objArr[0]);
        }
        return m25715J();
    }

    /* renamed from: F */
    AbstractC5074i<E> mo25557F() {
        return AbstractC5074i.m25734m(toArray());
    }

    /* renamed from: I */
    boolean mo25556I() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC5079k) && mo25556I() && ((AbstractC5079k) obj).mo25556I() && hashCode() != obj.hashCode()) {
            return false;
        }
        return C5134x.m25559a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return C5134x.m25558b(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return mo25553l();
    }

    /* renamed from: m */
    public AbstractC5074i<E> mo25563m() {
        AbstractC5074i<E> abstractC5074i = this.f12726d;
        if (abstractC5074i == null) {
            AbstractC5074i<E> mo25557F = mo25557F();
            this.f12726d = mo25557F;
            return mo25557F;
        }
        return abstractC5074i;
    }
}

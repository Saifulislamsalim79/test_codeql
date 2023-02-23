package com.google.common.collect;

import com.google.common.base.C5051n;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: ImmutableList.java */
/* renamed from: com.google.common.collect.i */
/* loaded from: classes2.dex */
public abstract class AbstractC5074i<E> extends AbstractC5072h<E> implements List<E>, RandomAccess {

    /* renamed from: d */
    private static final AbstractC5066b0<Object> f12714d = new C5075a(C5127u.f12790w, 0);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImmutableList.java */
    /* renamed from: com.google.common.collect.i$a */
    /* loaded from: classes2.dex */
    public static class C5075a<E> extends AbstractC5063a<E> {

        /* renamed from: e */
        private final AbstractC5074i<E> f12715e;

        C5075a(AbstractC5074i<E> abstractC5074i, int i) {
            super(abstractC5074i.size(), i);
            this.f12715e = abstractC5074i;
        }

        @Override // com.google.common.collect.AbstractC5063a
        /* renamed from: a */
        protected E mo25731a(int i) {
            return this.f12715e.get(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImmutableList.java */
    /* renamed from: com.google.common.collect.i$b */
    /* loaded from: classes2.dex */
    public class C5076b extends AbstractC5074i<E> {

        /* renamed from: e */
        final transient int f12716e;

        /* renamed from: f */
        final transient int f12717f;

        C5076b(int i, int i2) {
            this.f12716e = i;
            this.f12717f = i2;
        }

        @Override // com.google.common.collect.AbstractC5074i, java.util.List
        /* renamed from: O */
        public AbstractC5074i<E> subList(int i, int i2) {
            C5051n.m25775s(i, i2, this.f12717f);
            AbstractC5074i abstractC5074i = AbstractC5074i.this;
            int i3 = this.f12716e;
            return abstractC5074i.subList(i + i3, i2 + i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractC5072h
        /* renamed from: e */
        public Object[] mo25562e() {
            return AbstractC5074i.this.mo25562e();
        }

        @Override // com.google.common.collect.AbstractC5072h
        /* renamed from: f */
        int mo25561f() {
            return AbstractC5074i.this.mo25560h() + this.f12716e + this.f12717f;
        }

        @Override // java.util.List
        public E get(int i) {
            C5051n.m25782l(i, this.f12717f);
            return AbstractC5074i.this.get(i + this.f12716e);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractC5072h
        /* renamed from: h */
        public int mo25560h() {
            return AbstractC5074i.this.mo25560h() + this.f12716e;
        }

        @Override // com.google.common.collect.AbstractC5074i, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractC5072h
        /* renamed from: k */
        public boolean mo25554k() {
            return true;
        }

        @Override // com.google.common.collect.AbstractC5074i, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f12717f;
        }

        @Override // com.google.common.collect.AbstractC5074i, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }
    }

    /* renamed from: I */
    public static <E> AbstractC5074i<E> m25737I() {
        return (AbstractC5074i<E>) C5127u.f12790w;
    }

    /* renamed from: J */
    public static <E> AbstractC5074i<E> m25736J(E e) {
        return m25732u(e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static <E> AbstractC5074i<E> m25734m(Object[] objArr) {
        return m25733s(objArr, objArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static <E> AbstractC5074i<E> m25733s(Object[] objArr, int i) {
        if (i == 0) {
            return m25737I();
        }
        return new C5127u(objArr, i);
    }

    /* renamed from: u */
    private static <E> AbstractC5074i<E> m25732u(Object... objArr) {
        C5124r.m25582b(objArr);
        return m25734m(objArr);
    }

    @Override // java.util.List
    /* renamed from: E */
    public AbstractC5066b0<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: F */
    public AbstractC5066b0<E> listIterator(int i) {
        C5051n.m25777q(i, size());
        if (isEmpty()) {
            return (AbstractC5066b0<E>) f12714d;
        }
        return new C5075a(this, i);
    }

    @Override // java.util.List
    /* renamed from: O */
    public AbstractC5074i<E> subList(int i, int i2) {
        C5051n.m25775s(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return m25737I();
        }
        return m25735P(i, i2);
    }

    /* renamed from: P */
    AbstractC5074i<E> m25735P(int i, int i2) {
        return new C5076b(i, i2 - i);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC5072h, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC5072h
    /* renamed from: d */
    public int mo25555d(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return C5082m.m25706a(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (((i * 31) + get(i2).hashCode()) ^ (-1)) ^ (-1);
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return C5082m.m25705b(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* renamed from: l */
    public AbstractC5064a0<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return C5082m.m25703d(this, obj);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }
}

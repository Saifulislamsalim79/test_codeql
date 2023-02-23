package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: UnmodifiableLazyStringList.java */
/* renamed from: com.google.protobuf.q1 */
/* loaded from: classes2.dex */
public class C7095q1 extends AbstractList<String> implements InterfaceC7031g0, RandomAccess {

    /* renamed from: c */
    private final InterfaceC7031g0 f16924c;

    /* compiled from: UnmodifiableLazyStringList.java */
    /* renamed from: com.google.protobuf.q1$a */
    /* loaded from: classes2.dex */
    class C7096a implements ListIterator<String> {

        /* renamed from: c */
        ListIterator<String> f16925c;

        /* renamed from: d */
        final /* synthetic */ int f16926d;

        C7096a(int i) {
            this.f16926d = i;
            this.f16925c = C7095q1.this.f16924c.listIterator(this.f16926d);
        }

        /* renamed from: a */
        public void m19725a(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(String str) {
            m19725a(str);
            throw null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: b */
        public String next() {
            return this.f16925c.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: c */
        public String previous() {
            return this.f16925c.previous();
        }

        /* renamed from: d */
        public void m19722d(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f16925c.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f16925c.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f16925c.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f16925c.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(String str) {
            m19722d(str);
            throw null;
        }
    }

    /* compiled from: UnmodifiableLazyStringList.java */
    /* renamed from: com.google.protobuf.q1$b */
    /* loaded from: classes2.dex */
    class C7097b implements Iterator<String> {

        /* renamed from: c */
        Iterator<String> f16928c;

        C7097b() {
            this.f16928c = C7095q1.this.f16924c.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public String next() {
            return this.f16928c.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f16928c.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C7095q1(InterfaceC7031g0 interfaceC7031g0) {
        this.f16924c = interfaceC7031g0;
    }

    @Override // com.google.protobuf.InterfaceC7031g0
    /* renamed from: A */
    public void mo19731A(AbstractC7039i abstractC7039i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.InterfaceC7031g0
    /* renamed from: U */
    public Object mo19730U(int i) {
        return this.f16924c.mo19730U(i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e */
    public String get(int i) {
        return (String) this.f16924c.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new C7097b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i) {
        return new C7096a(i);
    }

    @Override // com.google.protobuf.InterfaceC7031g0
    /* renamed from: p */
    public List<?> mo19727p() {
        return this.f16924c.mo19727p();
    }

    @Override // com.google.protobuf.InterfaceC7031g0
    /* renamed from: q */
    public InterfaceC7031g0 mo19726q() {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f16924c.size();
    }
}

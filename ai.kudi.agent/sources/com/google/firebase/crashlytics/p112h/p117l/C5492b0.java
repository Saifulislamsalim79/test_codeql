package com.google.firebase.crashlytics.p112h.p117l;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: ImmutableList.java */
/* renamed from: com.google.firebase.crashlytics.h.l.b0 */
/* loaded from: classes2.dex */
public final class C5492b0<E> implements List<E>, RandomAccess {

    /* renamed from: c */
    private final List<E> f13533c;

    private C5492b0(List<E> list) {
        this.f13533c = Collections.unmodifiableList(list);
    }

    /* renamed from: d */
    public static <E> C5492b0<E> m24714d(List<E> list) {
        return new C5492b0<>(list);
    }

    /* renamed from: e */
    public static <E> C5492b0<E> m24713e(E... eArr) {
        return new C5492b0<>(Arrays.asList(eArr));
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E e) {
        return this.f13533c.add(e);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return this.f13533c.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f13533c.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f13533c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f13533c.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return this.f13533c.equals(obj);
    }

    @Override // java.util.List
    public E get(int i) {
        return this.f13533c.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f13533c.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f13533c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f13533c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.f13533c.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f13533c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return this.f13533c.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.f13533c.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.f13533c.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.f13533c.retainAll(collection);
    }

    @Override // java.util.List
    public E set(int i, E e) {
        return this.f13533c.set(i, e);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.f13533c.size();
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
        return this.f13533c.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f13533c.toArray();
    }

    @Override // java.util.List
    public void add(int i, E e) {
        this.f13533c.add(i, e);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        return this.f13533c.addAll(i, collection);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return this.f13533c.listIterator(i);
    }

    @Override // java.util.List
    public E remove(int i) {
        return this.f13533c.remove(i);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.f13533c.toArray(tArr);
    }
}

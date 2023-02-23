package kotlin.p557z.p558b1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.e0.d.l;
import kotlin.p483e0.p485d.p486e0.InterfaceC11796e;
import kotlin.p557z.AbstractC13699g;
/* compiled from: MapBuilder.kt */
/* renamed from: kotlin.z.b1.e */
/* loaded from: classes3.dex */
public final class C13685e<E> extends AbstractC13699g<E> implements Set<E>, InterfaceC11796e {

    /* renamed from: c */
    private final C13677c<E, ?> f30144c;

    public C13685e(C13677c<E, ?> c13677c) {
        l.f(c13677c, "backing");
        this.f30144c = c13677c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        l.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f30144c.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f30144c.containsKey(obj);
    }

    @Override // kotlin.p557z.AbstractC13699g
    /* renamed from: e */
    public int mo4136e() {
        return this.f30144c.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f30144c.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return this.f30144c.m4209D();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f30144c.m4202K(obj) >= 0;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> collection) {
        l.f(collection, "elements");
        this.f30144c.m4189l();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> collection) {
        l.f(collection, "elements");
        this.f30144c.m4189l();
        return super.retainAll(collection);
    }
}

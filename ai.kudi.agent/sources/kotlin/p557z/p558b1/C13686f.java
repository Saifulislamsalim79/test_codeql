package kotlin.p557z.p558b1;

import java.util.Collection;
import java.util.Iterator;
import kotlin.e0.d.l;
import kotlin.p483e0.p485d.p486e0.InterfaceC11792b;
import kotlin.p557z.AbstractC13695e;
/* compiled from: MapBuilder.kt */
/* renamed from: kotlin.z.b1.f */
/* loaded from: classes3.dex */
public final class C13686f<V> extends AbstractC13695e<V> implements Collection<V>, InterfaceC11792b {

    /* renamed from: c */
    private final C13677c<?, V> f30145c;

    public C13686f(C13677c<?, V> c13677c) {
        l.f(c13677c, "backing");
        this.f30145c = c13677c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection<? extends V> collection) {
        l.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f30145c.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f30145c.containsValue(obj);
    }

    @Override // kotlin.p557z.AbstractC13695e
    /* renamed from: e */
    public int mo4140e() {
        return this.f30145c.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f30145c.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return this.f30145c.m4199N();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f30145c.m4200M(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        l.f(collection, "elements");
        this.f30145c.m4189l();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        l.f(collection, "elements");
        this.f30145c.m4189l();
        return super.retainAll(collection);
    }
}

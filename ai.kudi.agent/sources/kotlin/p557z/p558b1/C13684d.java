package kotlin.p557z.p558b1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.e0.d.l;
/* compiled from: MapBuilder.kt */
/* renamed from: kotlin.z.b1.d */
/* loaded from: classes3.dex */
public final class C13684d<K, V> extends AbstractC13675a<Map.Entry<K, V>, K, V> {

    /* renamed from: c */
    private final C13677c<K, V> f30143c;

    public C13684d(C13677c<K, V> c13677c) {
        l.f(c13677c, "backing");
        this.f30143c = c13677c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        m4160m((Map.Entry) obj);
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        l.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f30143c.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<? extends Object> collection) {
        l.f(collection, "elements");
        return this.f30143c.m4187n(collection);
    }

    @Override // kotlin.p557z.AbstractC13699g
    /* renamed from: e */
    public int mo4136e() {
        return this.f30143c.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f30143c.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.f30143c.m4182t();
    }

    @Override // kotlin.p557z.p558b1.AbstractC13675a
    /* renamed from: k */
    public boolean mo4162k(Map.Entry<? extends K, ? extends V> entry) {
        l.f(entry, "element");
        return this.f30143c.m4186o(entry);
    }

    @Override // kotlin.p557z.p558b1.AbstractC13675a
    /* renamed from: l */
    public boolean mo4161l(Map.Entry entry) {
        l.f(entry, "element");
        return this.f30143c.m4204I(entry);
    }

    /* renamed from: m */
    public boolean m4160m(Map.Entry<K, V> entry) {
        l.f(entry, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> collection) {
        l.f(collection, "elements");
        this.f30143c.m4189l();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> collection) {
        l.f(collection, "elements");
        this.f30143c.m4189l();
        return super.retainAll(collection);
    }
}

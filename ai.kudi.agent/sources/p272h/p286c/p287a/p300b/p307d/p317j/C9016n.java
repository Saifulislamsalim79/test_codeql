package p272h.p286c.p287a.p300b.p307d.p317j;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.n */
/* loaded from: classes2.dex */
public class C9016n extends AbstractCollection {

    /* renamed from: c */
    final Object f21310c;

    /* renamed from: d */
    Collection f21311d;

    /* renamed from: e */
    final C9016n f21312e;

    /* renamed from: f */
    final Collection f21313f;

    /* renamed from: w */
    final /* synthetic */ AbstractC9061q f21314w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9016n(AbstractC9061q abstractC9061q, Object obj, Collection collection, C9016n c9016n) {
        this.f21314w = abstractC9061q;
        this.f21310c = obj;
        this.f21311d = collection;
        this.f21312e = c9016n;
        this.f21313f = c9016n == null ? null : c9016n.f21311d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzb();
        boolean isEmpty = this.f21311d.isEmpty();
        boolean add = this.f21311d.add(obj);
        if (add) {
            AbstractC9061q.m15573i(this.f21314w);
            if (isEmpty) {
                m15623d();
                return true;
            }
            return add;
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f21311d.addAll(collection);
        if (addAll) {
            AbstractC9061q.m15571k(this.f21314w, this.f21311d.size() - size);
            if (size == 0) {
                m15623d();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f21311d.clear();
        AbstractC9061q.m15570l(this.f21314w, size);
        m15622e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.f21311d.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f21311d.containsAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m15623d() {
        Map map;
        C9016n c9016n = this.f21312e;
        if (c9016n != null) {
            c9016n.m15623d();
            return;
        }
        map = this.f21314w.f21441e;
        map.put(this.f21310c, this.f21311d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m15622e() {
        Map map;
        C9016n c9016n = this.f21312e;
        if (c9016n != null) {
            c9016n.m15622e();
        } else if (this.f21311d.isEmpty()) {
            map = this.f21314w.f21441e;
            map.remove(this.f21310c);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f21311d.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.f21311d.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new C9001m(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        zzb();
        boolean remove = this.f21311d.remove(obj);
        if (remove) {
            AbstractC9061q.m15572j(this.f21314w);
            m15622e();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f21311d.removeAll(collection);
        if (removeAll) {
            AbstractC9061q.m15571k(this.f21314w, this.f21311d.size() - size);
            m15622e();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        if (collection != null) {
            int size = size();
            boolean retainAll = this.f21311d.retainAll(collection);
            if (retainAll) {
                AbstractC9061q.m15571k(this.f21314w, this.f21311d.size() - size);
                m15622e();
            }
            return retainAll;
        }
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.f21311d.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f21311d.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb() {
        Map map;
        C9016n c9016n = this.f21312e;
        if (c9016n != null) {
            c9016n.zzb();
            if (this.f21312e.f21311d != this.f21313f) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f21311d.isEmpty()) {
            map = this.f21314w.f21441e;
            Collection collection = (Collection) map.get(this.f21310c);
            if (collection != null) {
                this.f21311d = collection;
            }
        }
    }
}

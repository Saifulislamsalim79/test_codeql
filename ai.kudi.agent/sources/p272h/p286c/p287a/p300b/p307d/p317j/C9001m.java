package p272h.p286c.p287a.p300b.p307d.p317j;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.m */
/* loaded from: classes2.dex */
class C9001m implements Iterator {

    /* renamed from: c */
    final Iterator f21277c;

    /* renamed from: d */
    final Collection f21278d;

    /* renamed from: e */
    final /* synthetic */ C9016n f21279e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9001m(C9016n c9016n) {
        Iterator it;
        this.f21279e = c9016n;
        this.f21278d = this.f21279e.f21311d;
        Collection collection = c9016n.f21311d;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f21277c = it;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9001m(C9016n c9016n, Iterator it) {
        this.f21279e = c9016n;
        this.f21278d = this.f21279e.f21311d;
        this.f21277c = it;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m15656a() {
        this.f21279e.zzb();
        if (this.f21279e.f21311d != this.f21278d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        m15656a();
        return this.f21277c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        m15656a();
        return this.f21277c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f21277c.remove();
        AbstractC9061q.m15572j(this.f21279e.f21314w);
        this.f21279e.m15622e();
    }
}

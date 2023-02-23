package p272h.p286c.p287a.p300b.p307d.p317j;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.j */
/* loaded from: classes2.dex */
final class C8956j implements Iterator {

    /* renamed from: c */
    Map.Entry f21010c;

    /* renamed from: d */
    final /* synthetic */ Iterator f21011d;

    /* renamed from: e */
    final /* synthetic */ C8971k f21012e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8956j(C8971k c8971k, Iterator it) {
        this.f21012e = c8971k;
        this.f21011d = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21011d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f21011d.next();
        this.f21010c = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        C8851c.m15803d(this.f21010c != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f21010c.getValue();
        this.f21011d.remove();
        AbstractC9061q.m15570l(this.f21012e.f21020d, collection.size());
        collection.clear();
        this.f21010c = null;
    }
}

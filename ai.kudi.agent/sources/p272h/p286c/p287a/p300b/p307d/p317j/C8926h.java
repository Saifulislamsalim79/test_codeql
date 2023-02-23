package p272h.p286c.p287a.p300b.p307d.p317j;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.h */
/* loaded from: classes2.dex */
final class C8926h implements Iterator {

    /* renamed from: c */
    final Iterator f20971c;

    /* renamed from: d */
    Collection f20972d;

    /* renamed from: e */
    final /* synthetic */ C8941i f20973e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8926h(C8941i c8941i) {
        this.f20973e = c8941i;
        this.f20971c = this.f20973e.f20991e.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20971c.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f20971c.next();
        this.f20972d = (Collection) entry.getValue();
        C8941i c8941i = this.f20973e;
        Object key = entry.getKey();
        return new C8987l0(key, c8941i.f20992f.mo15574h(key, (Collection) entry.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        C8851c.m15803d(this.f20972d != null, "no calls to next() since the last call to remove()");
        this.f20971c.remove();
        AbstractC9061q.m15570l(this.f20973e.f20992f, this.f20972d.size());
        this.f20972d.clear();
        this.f20972d = null;
    }
}

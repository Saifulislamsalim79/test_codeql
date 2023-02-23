package p272h.p286c.p287a.p300b.p307d.p317j;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.i */
/* loaded from: classes2.dex */
final class C8941i extends AbstractC9191z0 {

    /* renamed from: e */
    final transient Map f20991e;

    /* renamed from: f */
    final /* synthetic */ AbstractC9061q f20992f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8941i(AbstractC9061q abstractC9061q, Map map) {
        this.f20992f = abstractC9061q;
        this.f20991e = map;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p317j.AbstractC9191z0
    /* renamed from: a */
    protected final Set mo15476a() {
        return new C8911g(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map;
        Map map2 = this.f20991e;
        AbstractC9061q abstractC9061q = this.f20992f;
        map = abstractC9061q.f21441e;
        if (map2 == map) {
            abstractC9061q.m15565q();
        } else {
            C9106t0.m15544a(new C8926h(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return C8823a1.m15834b(this.f20991e, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f20991e.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) C8823a1.m15835a(this.f20991e, obj);
        if (collection == null) {
            return null;
        }
        return this.f20992f.mo15574h(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f20991e.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.f20992f.mo15552e();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f20991e.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection mo15546f = this.f20992f.mo15546f();
        mo15546f.addAll(collection);
        AbstractC9061q.m15570l(this.f20992f, collection.size());
        collection.clear();
        return mo15546f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f20991e.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f20991e.toString();
    }
}

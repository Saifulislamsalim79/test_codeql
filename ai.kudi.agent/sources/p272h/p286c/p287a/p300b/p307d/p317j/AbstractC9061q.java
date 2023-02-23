package p272h.p286c.p287a.p300b.p307d.p317j;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.q */
/* loaded from: classes2.dex */
abstract class AbstractC9061q extends AbstractC9090s implements Serializable {

    /* renamed from: e */
    private transient Map f21441e;

    /* renamed from: f */
    private transient int f21442f;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC9061q(Map map) {
        if (map.isEmpty()) {
            this.f21441e = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static /* synthetic */ int m15573i(AbstractC9061q abstractC9061q) {
        int i = abstractC9061q.f21442f;
        abstractC9061q.f21442f = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static /* synthetic */ int m15572j(AbstractC9061q abstractC9061q) {
        int i = abstractC9061q.f21442f;
        abstractC9061q.f21442f = i - 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static /* synthetic */ int m15571k(AbstractC9061q abstractC9061q, int i) {
        int i2 = abstractC9061q.f21442f + i;
        abstractC9061q.f21442f = i2;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static /* synthetic */ int m15570l(AbstractC9061q abstractC9061q, int i) {
        int i2 = abstractC9061q.f21442f - i;
        abstractC9061q.f21442f = i2;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static /* synthetic */ void m15566p(AbstractC9061q abstractC9061q, Object obj) {
        Map map = abstractC9061q.f21441e;
        Object obj2 = null;
        if (map != null) {
            try {
                obj2 = map.remove(obj);
            } catch (ClassCastException | NullPointerException unused) {
            }
            Collection collection = (Collection) obj2;
            if (collection != null) {
                int size = collection.size();
                collection.clear();
                abstractC9061q.f21442f -= size;
                return;
            }
            return;
        }
        throw null;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p317j.InterfaceC8853c1
    /* renamed from: b */
    public final boolean mo15575b(Object obj, Object obj2) {
        Collection collection = (Collection) this.f21441e.get(obj);
        if (collection == null) {
            Collection mo15546f = mo15546f();
            if (mo15546f.add(obj2)) {
                this.f21442f++;
                this.f21441e.put(obj, mo15546f);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (collection.add(obj2)) {
            this.f21442f++;
            return true;
        } else {
            return false;
        }
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p317j.AbstractC9090s
    /* renamed from: c */
    final Map mo15554c() {
        return new C8941i(this, this.f21441e);
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p317j.AbstractC9090s
    /* renamed from: d */
    final Set mo15553d() {
        return new C8971k(this, this.f21441e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract Collection mo15546f();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract Collection mo15574h(Object obj, Collection collection);

    /* renamed from: m */
    public final Collection m15569m(Object obj) {
        Collection collection = (Collection) this.f21441e.get(obj);
        if (collection == null) {
            collection = mo15546f();
        }
        return mo15574h(obj, collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public final List m15568n(Object obj, List list, C9016n c9016n) {
        if (list instanceof RandomAccess) {
            return new C8986l(this, obj, list, c9016n);
        }
        return new C9046p(this, obj, list, c9016n);
    }

    /* renamed from: q */
    public final void m15565q() {
        for (Collection collection : this.f21441e.values()) {
            collection.clear();
        }
        this.f21441e.clear();
        this.f21442f = 0;
    }
}

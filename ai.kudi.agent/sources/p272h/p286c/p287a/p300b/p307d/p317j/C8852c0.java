package p272h.p286c.p287a.p300b.p307d.p317j;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.c0 */
/* loaded from: classes2.dex */
final class C8852c0 extends AbstractSet {

    /* renamed from: c */
    final /* synthetic */ C8897f0 f20826c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8852c0(C8897f0 c8897f0) {
        this.f20826c = c8897f0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f20826c.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f20826c.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C8897f0 c8897f0 = this.f20826c;
        Map m15723p = c8897f0.m15723p();
        if (m15723p != null) {
            return m15723p.keySet().iterator();
        }
        return new C9149w(c8897f0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object m15739B;
        Object obj2;
        Map m15723p = this.f20826c.m15723p();
        if (m15723p == null) {
            m15739B = this.f20826c.m15739B(obj);
            obj2 = C8897f0.f20937B;
            return m15739B != obj2;
        }
        return m15723p.keySet().remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f20826c.size();
    }
}

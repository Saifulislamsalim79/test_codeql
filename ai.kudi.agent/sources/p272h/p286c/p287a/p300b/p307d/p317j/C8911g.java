package p272h.p286c.p287a.p300b.p307d.p317j;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.g */
/* loaded from: classes2.dex */
final class C8911g extends AbstractC9150w0 {

    /* renamed from: c */
    final /* synthetic */ C8941i f20956c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8911g(C8941i c8941i) {
        this.f20956c = c8941i;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p317j.AbstractC9150w0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set entrySet = this.f20956c.f20991e.entrySet();
        if (entrySet != null) {
            try {
                return entrySet.contains(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
        throw null;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p317j.AbstractC9150w0
    /* renamed from: d */
    final Map mo15517d() {
        return this.f20956c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C8926h(this.f20956c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (contains(obj)) {
            Map.Entry entry = (Map.Entry) obj;
            entry.getClass();
            AbstractC9061q.m15566p(this.f20956c.f20992f, entry.getKey());
            return true;
        }
        return false;
    }
}

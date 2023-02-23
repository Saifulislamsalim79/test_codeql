package p272h.p286c.p287a.p300b.p307d.p317j;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.x0 */
/* loaded from: classes2.dex */
class C9163x0 extends AbstractC8973k1 {

    /* renamed from: c */
    final Map f21533c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9163x0(Map map) {
        if (map == null) {
            throw null;
        }
        this.f21533c = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f21533c.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f21533c.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f21533c.size();
    }
}

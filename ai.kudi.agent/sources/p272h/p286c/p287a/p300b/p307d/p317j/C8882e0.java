package p272h.p286c.p287a.p300b.p307d.p317j;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.e0 */
/* loaded from: classes2.dex */
final class C8882e0 extends AbstractCollection {

    /* renamed from: c */
    final /* synthetic */ C8897f0 f20870c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8882e0(C8897f0 c8897f0) {
        this.f20870c = c8897f0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f20870c.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C8897f0 c8897f0 = this.f20870c;
        Map m15723p = c8897f0.m15723p();
        if (m15723p != null) {
            return m15723p.values().iterator();
        }
        return new C9176y(c8897f0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f20870c.size();
    }
}

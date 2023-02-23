package p272h.p286c.p287a.p300b.p307d.p317j;

import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.h1 */
/* loaded from: classes2.dex */
final class C8928h1 extends AbstractC9091s0 {

    /* renamed from: e */
    private final transient AbstractC9077r0 f20974e;

    /* renamed from: f */
    private final transient AbstractC9047p0 f20975f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8928h1(AbstractC9077r0 abstractC9077r0, AbstractC9047p0 abstractC9047p0) {
        this.f20974e = abstractC9077r0;
        this.f20975f = abstractC9047p0;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p317j.AbstractC8972k0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f20974e.get(obj) != null;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p317j.AbstractC8972k0
    /* renamed from: d */
    final int mo15582d(Object[] objArr, int i) {
        return this.f20975f.mo15582d(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f20975f.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f20974e.size();
    }
}

package p272h.p286c.p287a.p300b.p307d.p315h;

import java.util.Iterator;
/* compiled from: com.google.mlkit:common@@18.0.0 */
/* renamed from: h.c.a.b.d.h.r */
/* loaded from: classes2.dex */
final class C8519r extends AbstractC8509m {

    /* renamed from: e */
    private final transient AbstractC8507l f20227e;

    /* renamed from: f */
    private final transient AbstractC8503j f20228f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8519r(AbstractC8507l abstractC8507l, AbstractC8503j abstractC8503j) {
        this.f20227e = abstractC8507l;
        this.f20228f = abstractC8503j;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p315h.AbstractC8497g, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f20227e.get(obj) != null;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p315h.AbstractC8497g
    /* renamed from: d */
    final int mo16005d(Object[] objArr, int i) {
        return this.f20228f.mo16005d(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f20228f.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f20227e.size();
    }
}

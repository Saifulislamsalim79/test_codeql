package p272h.p286c.p287a.p300b.p307d.p316i;

import java.util.Iterator;
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: h.c.a.b.d.i.ba */
/* loaded from: classes2.dex */
final class C8556ba extends AbstractC8798x9 {

    /* renamed from: e */
    private final transient AbstractC8787w9 f20265e;

    /* renamed from: f */
    private final transient AbstractC8765u9 f20266f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8556ba(AbstractC8787w9 abstractC8787w9, AbstractC8765u9 abstractC8765u9) {
        this.f20265e = abstractC8787w9;
        this.f20266f = abstractC8765u9;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p316i.AbstractC8721q9, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f20265e.get(obj) != null;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p316i.AbstractC8721q9
    /* renamed from: d */
    final int mo15850d(Object[] objArr, int i) {
        return this.f20266f.mo15850d(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f20266f.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f20265e.size();
    }
}

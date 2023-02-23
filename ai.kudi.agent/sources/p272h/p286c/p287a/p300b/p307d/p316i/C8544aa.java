package p272h.p286c.p287a.p300b.p307d.p316i;

import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: h.c.a.b.d.i.aa */
/* loaded from: classes2.dex */
final class C8544aa extends AbstractC8798x9 {

    /* renamed from: e */
    private final transient AbstractC8787w9 f20246e;

    /* renamed from: f */
    private final transient Object[] f20247f;

    /* renamed from: w */
    private final transient int f20248w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8544aa(AbstractC8787w9 abstractC8787w9, Object[] objArr, int i, int i2) {
        this.f20246e = abstractC8787w9;
        this.f20247f = objArr;
        this.f20248w = i2;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p316i.AbstractC8721q9, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f20246e.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p316i.AbstractC8721q9
    /* renamed from: d */
    final int mo15850d(Object[] objArr, int i) {
        return m15852k().mo15850d(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return m15852k().listIterator(0);
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p316i.AbstractC8798x9
    /* renamed from: l */
    final AbstractC8765u9 mo15851l() {
        return new C8820z9(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f20248w;
    }
}

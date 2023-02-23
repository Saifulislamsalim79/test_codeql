package p272h.p286c.p287a.p300b.p307d.p317j;

import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.g1 */
/* loaded from: classes2.dex */
final class C8913g1 extends AbstractC9091s0 {

    /* renamed from: e */
    private final transient AbstractC9077r0 f20957e;

    /* renamed from: f */
    private final transient Object[] f20958f;

    /* renamed from: w */
    private final transient int f20959w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8913g1(AbstractC9077r0 abstractC9077r0, Object[] objArr, int i, int i2) {
        this.f20957e = abstractC9077r0;
        this.f20958f = objArr;
        this.f20959w = i2;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p317j.AbstractC8972k0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f20957e.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p317j.AbstractC8972k0
    /* renamed from: d */
    final int mo15582d(Object[] objArr, int i) {
        return m15550k().mo15582d(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return m15550k().listIterator(0);
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p317j.AbstractC9091s0
    /* renamed from: l */
    final AbstractC9047p0 mo15549l() {
        return new C8898f1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f20959w;
    }
}

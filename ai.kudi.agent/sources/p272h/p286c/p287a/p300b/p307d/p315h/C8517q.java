package p272h.p286c.p287a.p300b.p307d.p315h;

import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.mlkit:common@@18.0.0 */
/* renamed from: h.c.a.b.d.h.q */
/* loaded from: classes2.dex */
final class C8517q extends AbstractC8509m {

    /* renamed from: e */
    private final transient AbstractC8507l f20224e;

    /* renamed from: f */
    private final transient Object[] f20225f;

    /* renamed from: w */
    private final transient int f20226w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8517q(AbstractC8507l abstractC8507l, Object[] objArr, int i, int i2) {
        this.f20224e = abstractC8507l;
        this.f20225f = objArr;
        this.f20226w = i2;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p315h.AbstractC8497g, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f20224e.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p315h.AbstractC8497g
    /* renamed from: d */
    final int mo16005d(Object[] objArr, int i) {
        return m16017k().mo16005d(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return m16017k().listIterator(0);
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p315h.AbstractC8509m
    /* renamed from: l */
    final AbstractC8503j mo16008l() {
        return new C8515p(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f20226w;
    }
}

package p272h.p286c.p287a.p300b.p307d.p315h;

import java.util.AbstractMap;
/* compiled from: com.google.mlkit:common@@18.0.0 */
/* renamed from: h.c.a.b.d.h.p */
/* loaded from: classes2.dex */
final class C8515p extends AbstractC8503j {

    /* renamed from: e */
    final /* synthetic */ C8517q f20223e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8515p(C8517q c8517q) {
        this.f20223e = c8517q;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.f20223e.f20226w;
        C8487b.m16039a(i, i2, "index");
        C8517q c8517q = this.f20223e;
        int i3 = i + i;
        objArr = c8517q.f20225f;
        Object obj = objArr[i3];
        obj.getClass();
        objArr2 = c8517q.f20225f;
        Object obj2 = objArr2[i3 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.f20223e.f20226w;
        return i;
    }
}

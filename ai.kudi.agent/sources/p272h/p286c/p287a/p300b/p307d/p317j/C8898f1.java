package p272h.p286c.p287a.p300b.p307d.p317j;

import java.util.AbstractMap;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.f1 */
/* loaded from: classes2.dex */
final class C8898f1 extends AbstractC9047p0 {

    /* renamed from: e */
    final /* synthetic */ C8913g1 f20947e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8898f1(C8913g1 c8913g1) {
        this.f20947e = c8913g1;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.f20947e.f20959w;
        C8851c.m15806a(i, i2, "index");
        C8913g1 c8913g1 = this.f20947e;
        int i3 = i + i;
        objArr = c8913g1.f20958f;
        Object obj = objArr[i3];
        obj.getClass();
        objArr2 = c8913g1.f20958f;
        Object obj2 = objArr2[i3 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.f20947e.f20959w;
        return i;
    }
}

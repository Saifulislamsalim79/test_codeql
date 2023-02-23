package p272h.p286c.p287a.p300b.p307d.p316i;

import java.util.AbstractMap;
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: h.c.a.b.d.i.z9 */
/* loaded from: classes2.dex */
final class C8820z9 extends AbstractC8765u9 {

    /* renamed from: e */
    final /* synthetic */ C8544aa f20774e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8820z9(C8544aa c8544aa) {
        this.f20774e = c8544aa;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.f20774e.f20248w;
        C8573d4.m15981a(i, i2, "index");
        C8544aa c8544aa = this.f20774e;
        int i3 = i + i;
        objArr = c8544aa.f20247f;
        Object obj = objArr[i3];
        obj.getClass();
        objArr2 = c8544aa.f20247f;
        Object obj2 = objArr2[i3 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.f20774e.f20248w;
        return i;
    }
}

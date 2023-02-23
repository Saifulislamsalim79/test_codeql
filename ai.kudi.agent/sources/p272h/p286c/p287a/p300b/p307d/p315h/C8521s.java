package p272h.p286c.p287a.p300b.p307d.p315h;
/* compiled from: com.google.mlkit:common@@18.0.0 */
/* renamed from: h.c.a.b.d.h.s */
/* loaded from: classes2.dex */
final class C8521s extends AbstractC8503j {

    /* renamed from: e */
    private final transient Object[] f20229e;

    /* renamed from: f */
    private final transient int f20230f;

    /* renamed from: w */
    private final transient int f20231w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8521s(Object[] objArr, int i, int i2) {
        this.f20229e = objArr;
        this.f20230f = i;
        this.f20231w = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C8487b.m16039a(i, this.f20231w, "index");
        Object obj = this.f20229e[i + i + this.f20230f];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20231w;
    }
}

package p272h.p286c.p287a.p300b.p307d.p317j;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.i1 */
/* loaded from: classes2.dex */
final class C8943i1 extends AbstractC9047p0 {

    /* renamed from: e */
    private final transient Object[] f20996e;

    /* renamed from: f */
    private final transient int f20997f;

    /* renamed from: w */
    private final transient int f20998w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8943i1(Object[] objArr, int i, int i2) {
        this.f20996e = objArr;
        this.f20997f = i;
        this.f20998w = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C8851c.m15806a(i, this.f20998w, "index");
        Object obj = this.f20996e[i + i + this.f20997f];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20998w;
    }
}

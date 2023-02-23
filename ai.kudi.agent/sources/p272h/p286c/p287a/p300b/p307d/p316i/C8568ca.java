package p272h.p286c.p287a.p300b.p307d.p316i;
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: h.c.a.b.d.i.ca */
/* loaded from: classes2.dex */
final class C8568ca extends AbstractC8765u9 {

    /* renamed from: e */
    private final transient Object[] f20272e;

    /* renamed from: f */
    private final transient int f20273f;

    /* renamed from: w */
    private final transient int f20274w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8568ca(Object[] objArr, int i, int i2) {
        this.f20272e = objArr;
        this.f20273f = i;
        this.f20274w = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C8573d4.m15981a(i, this.f20274w, "index");
        Object obj = this.f20272e[i + i + this.f20273f];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20274w;
    }
}

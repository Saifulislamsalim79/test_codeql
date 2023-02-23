package p272h.p286c.p287a.p300b.p307d.p316i;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: h.c.a.b.d.i.y9 */
/* loaded from: classes2.dex */
public final class C8809y9 extends AbstractC8765u9 {

    /* renamed from: w */
    static final AbstractC8765u9 f20759w = new C8809y9(new Object[0], 0);

    /* renamed from: e */
    final transient Object[] f20760e;

    /* renamed from: f */
    private final transient int f20761f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8809y9(Object[] objArr, int i) {
        this.f20760e = objArr;
        this.f20761f = i;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p316i.AbstractC8765u9, p272h.p286c.p287a.p300b.p307d.p316i.AbstractC8721q9
    /* renamed from: d */
    final int mo15850d(Object[] objArr, int i) {
        System.arraycopy(this.f20760e, 0, objArr, 0, this.f20761f);
        return this.f20761f;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p316i.AbstractC8721q9
    /* renamed from: e */
    final int mo15849e() {
        return this.f20761f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p272h.p286c.p287a.p300b.p307d.p316i.AbstractC8721q9
    /* renamed from: f */
    public final int mo15848f() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C8573d4.m15981a(i, this.f20761f, "index");
        Object obj = this.f20760e[i];
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p272h.p286c.p287a.p300b.p307d.p316i.AbstractC8721q9
    /* renamed from: h */
    public final Object[] mo15847h() {
        return this.f20760e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20761f;
    }
}

package p272h.p286c.p287a.p300b.p307d.p317j;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.e1 */
/* loaded from: classes2.dex */
final class C8883e1 extends AbstractC9047p0 {

    /* renamed from: w */
    static final AbstractC9047p0 f20871w = new C8883e1(new Object[0], 0);

    /* renamed from: e */
    final transient Object[] f20872e;

    /* renamed from: f */
    private final transient int f20873f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8883e1(Object[] objArr, int i) {
        this.f20872e = objArr;
        this.f20873f = i;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p317j.AbstractC9047p0, p272h.p286c.p287a.p300b.p307d.p317j.AbstractC8972k0
    /* renamed from: d */
    final int mo15582d(Object[] objArr, int i) {
        System.arraycopy(this.f20872e, 0, objArr, 0, this.f20873f);
        return this.f20873f;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p317j.AbstractC8972k0
    /* renamed from: e */
    final int mo15616e() {
        return this.f20873f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p272h.p286c.p287a.p300b.p307d.p317j.AbstractC8972k0
    /* renamed from: f */
    public final int mo15615f() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C8851c.m15806a(i, this.f20873f, "index");
        Object obj = this.f20872e[i];
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p272h.p286c.p287a.p300b.p307d.p317j.AbstractC8972k0
    /* renamed from: h */
    public final Object[] mo15614h() {
        return this.f20872e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20873f;
    }
}

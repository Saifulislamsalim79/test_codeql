package p272h.p286c.p287a.p300b.p307d.p315h;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.mlkit:common@@18.0.0 */
/* renamed from: h.c.a.b.d.h.o */
/* loaded from: classes2.dex */
public final class C8513o extends AbstractC8503j {

    /* renamed from: w */
    static final AbstractC8503j f20219w = new C8513o(new Object[0], 0);

    /* renamed from: e */
    final transient Object[] f20220e;

    /* renamed from: f */
    private final transient int f20221f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8513o(Object[] objArr, int i) {
        this.f20220e = objArr;
        this.f20221f = i;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p315h.AbstractC8503j, p272h.p286c.p287a.p300b.p307d.p315h.AbstractC8497g
    /* renamed from: d */
    final int mo16005d(Object[] objArr, int i) {
        System.arraycopy(this.f20220e, 0, objArr, 0, this.f20221f);
        return this.f20221f;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p315h.AbstractC8497g
    /* renamed from: e */
    final int mo16013e() {
        return this.f20221f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p272h.p286c.p287a.p300b.p307d.p315h.AbstractC8497g
    /* renamed from: f */
    public final int mo16012f() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C8487b.m16039a(i, this.f20221f, "index");
        Object obj = this.f20220e[i];
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p272h.p286c.p287a.p300b.p307d.p315h.AbstractC8497g
    /* renamed from: h */
    public final Object[] mo16011h() {
        return this.f20220e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20221f;
    }
}

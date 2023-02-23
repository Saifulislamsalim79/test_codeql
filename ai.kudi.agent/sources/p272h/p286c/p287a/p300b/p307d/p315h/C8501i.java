package p272h.p286c.p287a.p300b.p307d.p315h;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.mlkit:common@@18.0.0 */
/* renamed from: h.c.a.b.d.h.i */
/* loaded from: classes2.dex */
public final class C8501i extends AbstractC8503j {

    /* renamed from: e */
    final transient int f20208e;

    /* renamed from: f */
    final transient int f20209f;

    /* renamed from: w */
    final /* synthetic */ AbstractC8503j f20210w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8501i(AbstractC8503j abstractC8503j, int i, int i2) {
        this.f20210w = abstractC8503j;
        this.f20208e = i;
        this.f20209f = i2;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p315h.AbstractC8497g
    /* renamed from: e */
    final int mo16013e() {
        return this.f20210w.mo16012f() + this.f20208e + this.f20209f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p272h.p286c.p287a.p300b.p307d.p315h.AbstractC8497g
    /* renamed from: f */
    public final int mo16012f() {
        return this.f20210w.mo16012f() + this.f20208e;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C8487b.m16039a(i, this.f20209f, "index");
        return this.f20210w.get(i + this.f20208e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p272h.p286c.p287a.p300b.p307d.p315h.AbstractC8497g
    /* renamed from: h */
    public final Object[] mo16011h() {
        return this.f20210w.mo16011h();
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p315h.AbstractC8503j, java.util.List
    /* renamed from: k */
    public final AbstractC8503j subList(int i, int i2) {
        C8487b.m16037c(i, i2, this.f20209f);
        AbstractC8503j abstractC8503j = this.f20210w;
        int i3 = this.f20208e;
        return abstractC8503j.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20209f;
    }
}

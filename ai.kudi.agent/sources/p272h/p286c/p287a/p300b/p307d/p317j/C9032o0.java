package p272h.p286c.p287a.p300b.p307d.p317j;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.o0 */
/* loaded from: classes2.dex */
public final class C9032o0 extends AbstractC9047p0 {

    /* renamed from: e */
    final transient int f21335e;

    /* renamed from: f */
    final transient int f21336f;

    /* renamed from: w */
    final /* synthetic */ AbstractC9047p0 f21337w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9032o0(AbstractC9047p0 abstractC9047p0, int i, int i2) {
        this.f21337w = abstractC9047p0;
        this.f21335e = i;
        this.f21336f = i2;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p317j.AbstractC8972k0
    /* renamed from: e */
    final int mo15616e() {
        return this.f21337w.mo15615f() + this.f21335e + this.f21336f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p272h.p286c.p287a.p300b.p307d.p317j.AbstractC8972k0
    /* renamed from: f */
    public final int mo15615f() {
        return this.f21337w.mo15615f() + this.f21335e;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C8851c.m15806a(i, this.f21336f, "index");
        return this.f21337w.get(i + this.f21335e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p272h.p286c.p287a.p300b.p307d.p317j.AbstractC8972k0
    /* renamed from: h */
    public final Object[] mo15614h() {
        return this.f21337w.mo15614h();
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p317j.AbstractC9047p0, java.util.List
    /* renamed from: k */
    public final AbstractC9047p0 subList(int i, int i2) {
        C8851c.m15804c(i, i2, this.f21336f);
        AbstractC9047p0 abstractC9047p0 = this.f21337w;
        int i3 = this.f21335e;
        return abstractC9047p0.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21336f;
    }
}

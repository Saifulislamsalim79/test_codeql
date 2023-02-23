package p272h.p286c.p287a.p300b.p307d.p316i;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: h.c.a.b.d.i.t9 */
/* loaded from: classes2.dex */
public final class C8754t9 extends AbstractC8765u9 {

    /* renamed from: e */
    final transient int f20699e;

    /* renamed from: f */
    final transient int f20700f;

    /* renamed from: w */
    final /* synthetic */ AbstractC8765u9 f20701w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8754t9(AbstractC8765u9 abstractC8765u9, int i, int i2) {
        this.f20701w = abstractC8765u9;
        this.f20699e = i;
        this.f20700f = i2;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p316i.AbstractC8721q9
    /* renamed from: e */
    final int mo15849e() {
        return this.f20701w.mo15848f() + this.f20699e + this.f20700f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p272h.p286c.p287a.p300b.p307d.p316i.AbstractC8721q9
    /* renamed from: f */
    public final int mo15848f() {
        return this.f20701w.mo15848f() + this.f20699e;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C8573d4.m15981a(i, this.f20700f, "index");
        return this.f20701w.get(i + this.f20699e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p272h.p286c.p287a.p300b.p307d.p316i.AbstractC8721q9
    /* renamed from: h */
    public final Object[] mo15847h() {
        return this.f20701w.mo15847h();
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p316i.AbstractC8765u9, java.util.List
    /* renamed from: k */
    public final AbstractC8765u9 subList(int i, int i2) {
        C8573d4.m15979c(i, i2, this.f20700f);
        AbstractC8765u9 abstractC8765u9 = this.f20701w;
        int i3 = this.f20699e;
        return abstractC8765u9.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20700f;
    }
}

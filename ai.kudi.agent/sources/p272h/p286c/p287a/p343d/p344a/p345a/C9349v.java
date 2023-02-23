package p272h.p286c.p287a.p343d.p344a.p345a;

import p272h.p286c.p287a.p343d.p344a.p345a.AbstractC9330d;
/* renamed from: h.c.a.d.a.a.v */
/* loaded from: classes2.dex */
final class C9349v extends AbstractC9330d.AbstractC9331a {

    /* renamed from: a */
    private Integer f21969a;

    /* renamed from: b */
    private Boolean f21970b;

    @Override // p272h.p286c.p287a.p343d.p344a.p345a.AbstractC9330d.AbstractC9331a
    /* renamed from: a */
    public final AbstractC9330d mo14985a() {
        String concat = this.f21969a == null ? "".concat(" appUpdateType") : "";
        if (this.f21970b == null) {
            concat = String.valueOf(concat).concat(" allowAssetPackDeletion");
        }
        if (concat.isEmpty()) {
            return new C9350w(this.f21969a.intValue(), this.f21970b.booleanValue());
        }
        String valueOf = String.valueOf(concat);
        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
    }

    /* renamed from: b */
    public final AbstractC9330d.AbstractC9331a m14984b(boolean z) {
        this.f21970b = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: c */
    public final AbstractC9330d.AbstractC9331a m14983c(int i) {
        this.f21969a = Integer.valueOf(i);
        return this;
    }
}

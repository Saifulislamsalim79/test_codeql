package p272h.p286c.p287a.p343d.p344a.p345a;
/* renamed from: h.c.a.d.a.a.w */
/* loaded from: classes2.dex */
final class C9350w extends AbstractC9330d {

    /* renamed from: a */
    private final int f21971a;

    /* renamed from: b */
    private final boolean f21972b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C9350w(int i, boolean z) {
        this.f21971a = i;
        this.f21972b = z;
    }

    @Override // p272h.p286c.p287a.p343d.p344a.p345a.AbstractC9330d
    /* renamed from: a */
    public final boolean mo14982a() {
        return this.f21972b;
    }

    @Override // p272h.p286c.p287a.p343d.p344a.p345a.AbstractC9330d
    /* renamed from: b */
    public final int mo14981b() {
        return this.f21971a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC9330d) {
            AbstractC9330d abstractC9330d = (AbstractC9330d) obj;
            if (this.f21971a == abstractC9330d.mo14981b() && this.f21972b == abstractC9330d.mo14982a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f21971a ^ 1000003) * 1000003) ^ (true != this.f21972b ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.f21971a;
        boolean z = this.f21972b;
        StringBuilder sb = new StringBuilder(73);
        sb.append("AppUpdateOptions{appUpdateType=");
        sb.append(i);
        sb.append(", allowAssetPackDeletion=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}

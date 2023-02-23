package p272h.p286c.p287a.p300b.p307d.p317j;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.ac */
/* loaded from: classes2.dex */
final class C8834ac extends AbstractC8864cc {

    /* renamed from: a */
    private final String f20806a;

    /* renamed from: b */
    private final boolean f20807b;

    /* renamed from: c */
    private final int f20808c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C8834ac(String str, boolean z, int i, C9202zb c9202zb) {
        this.f20806a = str;
        this.f20807b = z;
        this.f20808c = i;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p317j.AbstractC8864cc
    /* renamed from: a */
    public final int mo15773a() {
        return this.f20808c;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p317j.AbstractC8864cc
    /* renamed from: b */
    public final String mo15772b() {
        return this.f20806a;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p317j.AbstractC8864cc
    /* renamed from: c */
    public final boolean mo15771c() {
        return this.f20807b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8864cc) {
            AbstractC8864cc abstractC8864cc = (AbstractC8864cc) obj;
            if (this.f20806a.equals(abstractC8864cc.mo15772b()) && this.f20807b == abstractC8864cc.mo15771c() && this.f20808c == abstractC8864cc.mo15773a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f20806a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f20807b ? 1237 : 1231)) * 1000003) ^ this.f20808c;
    }

    public final String toString() {
        String str = this.f20806a;
        boolean z = this.f20807b;
        int i = this.f20808c;
        StringBuilder sb = new StringBuilder(str.length() + 84);
        sb.append("MLKitLoggingOptions{libraryName=");
        sb.append(str);
        sb.append(", enableFirelog=");
        sb.append(z);
        sb.append(", firelogEventType=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}

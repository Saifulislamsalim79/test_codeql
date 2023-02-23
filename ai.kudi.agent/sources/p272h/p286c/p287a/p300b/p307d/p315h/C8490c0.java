package p272h.p286c.p287a.p300b.p307d.p315h;
/* compiled from: com.google.mlkit:common@@18.0.0 */
/* renamed from: h.c.a.b.d.h.c0 */
/* loaded from: classes2.dex */
final class C8490c0 extends AbstractC8494e0 {

    /* renamed from: a */
    private final String f20198a;

    /* renamed from: b */
    private final boolean f20199b;

    /* renamed from: c */
    private final int f20200c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C8490c0(String str, boolean z, int i, C8488b0 c8488b0) {
        this.f20198a = str;
        this.f20199b = z;
        this.f20200c = i;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p315h.AbstractC8494e0
    /* renamed from: a */
    public final int mo16032a() {
        return this.f20200c;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p315h.AbstractC8494e0
    /* renamed from: b */
    public final String mo16031b() {
        return this.f20198a;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p315h.AbstractC8494e0
    /* renamed from: c */
    public final boolean mo16030c() {
        return this.f20199b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8494e0) {
            AbstractC8494e0 abstractC8494e0 = (AbstractC8494e0) obj;
            if (this.f20198a.equals(abstractC8494e0.mo16031b()) && this.f20199b == abstractC8494e0.mo16030c() && this.f20200c == abstractC8494e0.mo16032a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f20198a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f20199b ? 1237 : 1231)) * 1000003) ^ this.f20200c;
    }

    public final String toString() {
        String str = this.f20198a;
        boolean z = this.f20199b;
        int i = this.f20200c;
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

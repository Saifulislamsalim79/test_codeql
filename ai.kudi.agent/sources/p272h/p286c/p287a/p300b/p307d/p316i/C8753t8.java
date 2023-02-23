package p272h.p286c.p287a.p300b.p307d.p316i;
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: h.c.a.b.d.i.t8 */
/* loaded from: classes2.dex */
final class C8753t8 extends AbstractC8775v8 {

    /* renamed from: a */
    private final String f20696a;

    /* renamed from: b */
    private final boolean f20697b;

    /* renamed from: c */
    private final int f20698c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C8753t8(String str, boolean z, int i, C8742s8 c8742s8) {
        this.f20696a = str;
        this.f20697b = z;
        this.f20698c = i;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p316i.AbstractC8775v8
    /* renamed from: a */
    public final int mo15878a() {
        return this.f20698c;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p316i.AbstractC8775v8
    /* renamed from: b */
    public final String mo15877b() {
        return this.f20696a;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p316i.AbstractC8775v8
    /* renamed from: c */
    public final boolean mo15876c() {
        return this.f20697b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8775v8) {
            AbstractC8775v8 abstractC8775v8 = (AbstractC8775v8) obj;
            if (this.f20696a.equals(abstractC8775v8.mo15877b()) && this.f20697b == abstractC8775v8.mo15876c() && this.f20698c == abstractC8775v8.mo15878a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f20696a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f20697b ? 1237 : 1231)) * 1000003) ^ this.f20698c;
    }

    public final String toString() {
        String str = this.f20696a;
        boolean z = this.f20697b;
        int i = this.f20698c;
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

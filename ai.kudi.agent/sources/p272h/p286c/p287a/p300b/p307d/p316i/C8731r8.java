package p272h.p286c.p287a.p300b.p307d.p316i;
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: h.c.a.b.d.i.r8 */
/* loaded from: classes2.dex */
final class C8731r8 extends AbstractC8764u8 {

    /* renamed from: a */
    private String f20593a;

    /* renamed from: b */
    private boolean f20594b;

    /* renamed from: c */
    private int f20595c;

    /* renamed from: d */
    private byte f20596d;

    @Override // p272h.p286c.p287a.p300b.p307d.p316i.AbstractC8764u8
    /* renamed from: a */
    public final AbstractC8775v8 mo15884a() {
        String str;
        if (this.f20596d == 3 && (str = this.f20593a) != null) {
            return new C8753t8(str, this.f20594b, this.f20595c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f20593a == null) {
            sb.append(" libraryName");
        }
        if ((this.f20596d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f20596d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final AbstractC8764u8 m15924b(boolean z) {
        this.f20594b = true;
        this.f20596d = (byte) (1 | this.f20596d);
        return this;
    }

    /* renamed from: c */
    public final AbstractC8764u8 m15923c(int i) {
        this.f20595c = 1;
        this.f20596d = (byte) (this.f20596d | 2);
        return this;
    }

    /* renamed from: d */
    public final AbstractC8764u8 m15922d(String str) {
        this.f20593a = "vision-common";
        return this;
    }
}

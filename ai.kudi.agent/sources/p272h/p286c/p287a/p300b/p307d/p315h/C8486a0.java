package p272h.p286c.p287a.p300b.p307d.p315h;
/* compiled from: com.google.mlkit:common@@18.0.0 */
/* renamed from: h.c.a.b.d.h.a0 */
/* loaded from: classes2.dex */
final class C8486a0 extends AbstractC8492d0 {

    /* renamed from: a */
    private String f20194a;

    /* renamed from: b */
    private boolean f20195b;

    /* renamed from: c */
    private int f20196c;

    /* renamed from: d */
    private byte f20197d;

    @Override // p272h.p286c.p287a.p300b.p307d.p315h.AbstractC8492d0
    /* renamed from: a */
    public final AbstractC8494e0 mo16034a() {
        String str;
        if (this.f20197d == 3 && (str = this.f20194a) != null) {
            return new C8490c0(str, this.f20195b, this.f20196c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f20194a == null) {
            sb.append(" libraryName");
        }
        if ((this.f20197d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f20197d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final AbstractC8492d0 m16042b(boolean z) {
        this.f20195b = true;
        this.f20197d = (byte) (1 | this.f20197d);
        return this;
    }

    /* renamed from: c */
    public final AbstractC8492d0 m16041c(int i) {
        this.f20196c = 1;
        this.f20197d = (byte) (this.f20197d | 2);
        return this;
    }

    /* renamed from: d */
    public final AbstractC8492d0 m16040d(String str) {
        this.f20194a = "common";
        return this;
    }
}

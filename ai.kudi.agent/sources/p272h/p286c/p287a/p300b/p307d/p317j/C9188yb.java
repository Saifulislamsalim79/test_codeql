package p272h.p286c.p287a.p300b.p307d.p317j;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.yb */
/* loaded from: classes2.dex */
final class C9188yb extends AbstractC8849bc {

    /* renamed from: a */
    private String f21564a;

    /* renamed from: b */
    private boolean f21565b;

    /* renamed from: c */
    private int f21566c;

    /* renamed from: d */
    private byte f21567d;

    @Override // p272h.p286c.p287a.p300b.p307d.p317j.AbstractC8849bc
    /* renamed from: a */
    public final AbstractC8864cc mo15480a() {
        String str;
        if (this.f21567d == 3 && (str = this.f21564a) != null) {
            return new C8834ac(str, this.f21565b, this.f21566c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f21564a == null) {
            sb.append(" libraryName");
        }
        if ((this.f21567d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f21567d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final AbstractC8849bc m15479b(boolean z) {
        this.f21565b = true;
        this.f21567d = (byte) (1 | this.f21567d);
        return this;
    }

    /* renamed from: c */
    public final AbstractC8849bc m15478c(int i) {
        this.f21566c = 1;
        this.f21567d = (byte) (this.f21567d | 2);
        return this;
    }

    /* renamed from: d */
    public final AbstractC8849bc m15477d(String str) {
        this.f21564a = str;
        return this;
    }
}

package p272h.p286c.p287a.p300b.p307d.p317j;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.wc */
/* loaded from: classes2.dex */
public final class C9161wc {

    /* renamed from: a */
    private static C9147vc f21531a;

    /* renamed from: a */
    public static synchronized C8984kc m15516a(AbstractC8864cc abstractC8864cc) {
        C8984kc c8984kc;
        synchronized (C9161wc.class) {
            if (f21531a == null) {
                f21531a = new C9147vc(null);
            }
            c8984kc = (C8984kc) f21531a.m20454b(abstractC8864cc);
        }
        return c8984kc;
    }

    /* renamed from: b */
    public static synchronized C8984kc m15515b(String str) {
        C8984kc m15516a;
        synchronized (C9161wc.class) {
            m15516a = m15516a(AbstractC8864cc.m15770d(str).mo15480a());
        }
        return m15516a;
    }
}

package p272h.p286c.p287a.p300b.p307d.p316i;
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: h.c.a.b.d.i.l9 */
/* loaded from: classes2.dex */
public final class C8666l9 {

    /* renamed from: a */
    private static C8655k9 f20525a;

    /* renamed from: a */
    public static synchronized C8555b9 m15941a(AbstractC8775v8 abstractC8775v8) {
        C8555b9 c8555b9;
        synchronized (C8666l9.class) {
            if (f20525a == null) {
                f20525a = new C8655k9(null);
            }
            c8555b9 = (C8555b9) f20525a.m20454b(abstractC8775v8);
        }
        return c8555b9;
    }

    /* renamed from: b */
    public static synchronized C8555b9 m15940b(String str) {
        C8555b9 m15941a;
        synchronized (C8666l9.class) {
            m15941a = m15941a(AbstractC8775v8.m15875d("vision-common").mo15884a());
        }
        return m15941a;
    }
}

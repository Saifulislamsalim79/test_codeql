package p425j.p429b.p433b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SegmentPool.java */
/* renamed from: j.b.b.p */
/* loaded from: classes3.dex */
public final class C11167p {

    /* renamed from: a */
    static C11166o f25251a;

    /* renamed from: b */
    static long f25252b;

    private C11167p() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m11474a(C11166o c11166o) {
        if (c11166o.f25249f == null && c11166o.f25250g == null) {
            if (c11166o.f25247d) {
                return;
            }
            synchronized (C11167p.class) {
                if (f25252b + 8192 > 65536) {
                    return;
                }
                f25252b += 8192;
                c11166o.f25249f = f25251a;
                c11166o.f25246c = 0;
                c11166o.f25245b = 0;
                f25251a = c11166o;
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C11166o m11473b() {
        synchronized (C11167p.class) {
            if (f25251a != null) {
                C11166o c11166o = f25251a;
                f25251a = c11166o.f25249f;
                c11166o.f25249f = null;
                f25252b -= 8192;
                return c11166o;
            }
            return new C11166o();
        }
    }
}

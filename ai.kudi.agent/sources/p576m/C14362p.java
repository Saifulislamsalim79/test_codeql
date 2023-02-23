package p576m;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SegmentPool.java */
/* renamed from: m.p */
/* loaded from: classes3.dex */
public final class C14362p {

    /* renamed from: a */
    static C14361o f31659a;

    /* renamed from: b */
    static long f31660b;

    private C14362p() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m1971a(C14361o c14361o) {
        if (c14361o.f31657f == null && c14361o.f31658g == null) {
            if (c14361o.f31655d) {
                return;
            }
            synchronized (C14362p.class) {
                if (f31660b + 8192 > 65536) {
                    return;
                }
                f31660b += 8192;
                c14361o.f31657f = f31659a;
                c14361o.f31654c = 0;
                c14361o.f31653b = 0;
                f31659a = c14361o;
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C14361o m1970b() {
        synchronized (C14362p.class) {
            if (f31659a != null) {
                C14361o c14361o = f31659a;
                f31659a = c14361o.f31657f;
                c14361o.f31657f = null;
                f31660b -= 8192;
                return c14361o;
            }
            return new C14361o();
        }
    }
}

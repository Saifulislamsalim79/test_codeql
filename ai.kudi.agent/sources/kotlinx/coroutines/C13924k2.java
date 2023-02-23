package kotlinx.coroutines;
/* compiled from: EventLoop.common.kt */
/* renamed from: kotlinx.coroutines.k2 */
/* loaded from: classes3.dex */
public final class C13924k2 {

    /* renamed from: a */
    public static final C13924k2 f30408a = new C13924k2();

    /* renamed from: b */
    private static final ThreadLocal<AbstractC13756b1> f30409b = new ThreadLocal<>();

    private C13924k2() {
    }

    /* renamed from: a */
    public final AbstractC13756b1 m3403a() {
        AbstractC13756b1 abstractC13756b1 = f30409b.get();
        if (abstractC13756b1 == null) {
            AbstractC13756b1 m3617a = C13811e1.m3617a();
            f30409b.set(m3617a);
            return m3617a;
        }
        return abstractC13756b1;
    }

    /* renamed from: b */
    public final void m3402b() {
        f30409b.set(null);
    }

    /* renamed from: c */
    public final void m3401c(AbstractC13756b1 abstractC13756b1) {
        f30409b.set(abstractC13756b1);
    }
}

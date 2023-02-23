package kotlinx.coroutines;
/* compiled from: JobSupport.kt */
/* renamed from: kotlinx.coroutines.r1 */
/* loaded from: classes3.dex */
public class C14035r1 extends C14088v1 implements InterfaceC14112z {

    /* renamed from: d */
    private final boolean f30617d;

    public C14035r1(InterfaceC13947p1 interfaceC13947p1) {
        super(true);
        m3023a0(interfaceC13947p1);
        this.f30617d = m3201S0();
    }

    /* renamed from: S0 */
    private final boolean m3201S0() {
        InterfaceC14038s m3029T = m3029T();
        C14055t c14055t = m3029T instanceof C14055t ? (C14055t) m3029T : null;
        if (c14055t == null) {
            return false;
        }
        C14088v1 m3138C = c14055t.m3138C();
        while (!m3138C.mo3033Q()) {
            InterfaceC14038s m3029T2 = m3138C.m3029T();
            C14055t c14055t2 = m3029T2 instanceof C14055t ? (C14055t) m3029T2 : null;
            if (c14055t2 == null) {
                return false;
            }
            m3138C = c14055t2.m3138C();
        }
        return true;
    }

    @Override // kotlinx.coroutines.C14088v1
    /* renamed from: Q */
    public boolean mo3033Q() {
        return this.f30617d;
    }

    @Override // kotlinx.coroutines.C14088v1
    /* renamed from: R */
    public boolean mo2949R() {
        return true;
    }
}

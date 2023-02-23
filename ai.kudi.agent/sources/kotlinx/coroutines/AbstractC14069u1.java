package kotlinx.coroutines;
/* compiled from: JobSupport.kt */
/* renamed from: kotlinx.coroutines.u1 */
/* loaded from: classes3.dex */
public abstract class AbstractC14069u1 extends AbstractC13806d0 implements InterfaceC14110y0, InterfaceC13923k1 {

    /* renamed from: f */
    public C14088v1 f30669f;

    /* renamed from: C */
    public final C14088v1 m3138C() {
        C14088v1 c14088v1 = this.f30669f;
        if (c14088v1 != null) {
            return c14088v1;
        }
        kotlin.e0.d.l.u("job");
        throw null;
    }

    /* renamed from: D */
    public final void m3137D(C14088v1 c14088v1) {
        this.f30669f = c14088v1;
    }

    @Override // kotlinx.coroutines.InterfaceC13923k1
    /* renamed from: c */
    public C14114z1 mo2934c() {
        return null;
    }

    @Override // kotlinx.coroutines.InterfaceC14110y0
    /* renamed from: i */
    public void mo2939i() {
        m3138C().m3049G0(this);
    }

    @Override // kotlinx.coroutines.InterfaceC13923k1
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.internal.C13897n
    public String toString() {
        return C14034r0.m3204a(this) + '@' + C14034r0.m3203b(this) + "[job@" + C14034r0.m3203b(m3138C()) + ']';
    }
}

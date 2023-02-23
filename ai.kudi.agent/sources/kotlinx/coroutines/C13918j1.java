package kotlinx.coroutines;
/* compiled from: JobSupport.kt */
/* renamed from: kotlinx.coroutines.j1 */
/* loaded from: classes3.dex */
public final class C13918j1 implements InterfaceC13923k1 {

    /* renamed from: c */
    private final C14114z1 f30405c;

    public C13918j1(C14114z1 c14114z1) {
        this.f30405c = c14114z1;
    }

    @Override // kotlinx.coroutines.InterfaceC13923k1
    /* renamed from: c */
    public C14114z1 mo2934c() {
        return this.f30405c;
    }

    @Override // kotlinx.coroutines.InterfaceC13923k1
    public boolean isActive() {
        return false;
    }

    public String toString() {
        return C13952q0.m3343c() ? mo2934c().m2935C("New") : super.toString();
    }
}

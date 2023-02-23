package kotlinx.coroutines;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JobSupport.kt */
/* renamed from: kotlinx.coroutines.a1 */
/* loaded from: classes3.dex */
public final class C13749a1 implements InterfaceC13923k1 {

    /* renamed from: c */
    private final boolean f30190c;

    public C13749a1(boolean z) {
        this.f30190c = z;
    }

    @Override // kotlinx.coroutines.InterfaceC13923k1
    /* renamed from: c */
    public C14114z1 mo2934c() {
        return null;
    }

    @Override // kotlinx.coroutines.InterfaceC13923k1
    public boolean isActive() {
        return this.f30190c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(isActive() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}

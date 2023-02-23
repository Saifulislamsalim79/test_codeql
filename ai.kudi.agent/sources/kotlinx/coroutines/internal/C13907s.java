package kotlinx.coroutines.internal;

import kotlin.p476c0.InterfaceC11719g;
import kotlinx.coroutines.AbstractC14111y1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainDispatchers.kt */
/* renamed from: kotlinx.coroutines.internal.s */
/* loaded from: classes3.dex */
public final class C13907s extends AbstractC14111y1 {

    /* renamed from: d */
    private final Throwable f30395d;

    /* renamed from: e */
    private final String f30396e;

    public C13907s(Throwable th, String str) {
        this.f30395d = th;
        this.f30396e = str;
    }

    /* renamed from: P0 */
    private final Void m3443P0() {
        String m;
        if (this.f30395d != null) {
            String str = this.f30396e;
            String str2 = "";
            if (str != null && (m = kotlin.e0.d.l.m(". ", str)) != null) {
                str2 = m;
            }
            throw new IllegalStateException(kotlin.e0.d.l.m("Module with the Main dispatcher had failed to initialize", str2), this.f30395d);
        }
        C13906r.m3446c();
        throw null;
    }

    @Override // kotlinx.coroutines.AbstractC13857h0
    /* renamed from: H0 */
    public boolean mo3399H0(InterfaceC11719g interfaceC11719g) {
        m3443P0();
        throw null;
    }

    @Override // kotlinx.coroutines.AbstractC14111y1
    /* renamed from: J0 */
    public AbstractC14111y1 mo2938J0() {
        return this;
    }

    /* renamed from: L0 */
    public Void m3444L0(InterfaceC11719g interfaceC11719g, Runnable runnable) {
        m3443P0();
        throw null;
    }

    @Override // kotlinx.coroutines.AbstractC13857h0
    /* renamed from: o0 */
    public /* bridge */ /* synthetic */ void mo3067o0(InterfaceC11719g interfaceC11719g, Runnable runnable) {
        m3444L0(interfaceC11719g, runnable);
        throw null;
    }

    @Override // kotlinx.coroutines.AbstractC14111y1, kotlinx.coroutines.AbstractC13857h0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        Throwable th = this.f30395d;
        sb.append(th != null ? kotlin.e0.d.l.m(", cause=", th) : "");
        sb.append(']');
        return sb.toString();
    }
}

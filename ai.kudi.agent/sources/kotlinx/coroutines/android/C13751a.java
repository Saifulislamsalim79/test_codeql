package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.C13666w;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11719g;
import kotlinx.coroutines.C14040s1;
import kotlinx.coroutines.C14107x0;
/* compiled from: HandlerDispatcher.kt */
/* renamed from: kotlinx.coroutines.android.a */
/* loaded from: classes3.dex */
public final class C13751a extends AbstractC13752b {
    private volatile C13751a _immediate;

    /* renamed from: d */
    private final Handler f30192d;

    /* renamed from: e */
    private final String f30193e;

    /* renamed from: f */
    private final boolean f30194f;

    /* renamed from: w */
    private final C13751a f30195w;

    private C13751a(Handler handler, String str, boolean z) {
        super(null);
        this.f30192d = handler;
        this.f30193e = str;
        this.f30194f = z;
        this._immediate = z ? this : null;
        C13751a c13751a = this._immediate;
        if (c13751a == null) {
            c13751a = new C13751a(this.f30192d, this.f30193e, true);
            this._immediate = c13751a;
            C13666w c13666w = C13666w.f30112a;
        }
        this.f30195w = c13751a;
    }

    /* renamed from: L0 */
    private final void m3761L0(InterfaceC11719g interfaceC11719g, Runnable runnable) {
        C14040s1.m3185c(interfaceC11719g, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C14107x0.m2945b().mo3067o0(interfaceC11719g, runnable);
    }

    @Override // kotlinx.coroutines.AbstractC13857h0
    /* renamed from: H0 */
    public boolean mo3399H0(InterfaceC11719g interfaceC11719g) {
        return (this.f30194f && l.b(Looper.myLooper(), this.f30192d.getLooper())) ? false : true;
    }

    @Override // kotlinx.coroutines.AbstractC14111y1
    /* renamed from: P0 */
    public C13751a mo2938J0() {
        return this.f30195w;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C13751a) && ((C13751a) obj).f30192d == this.f30192d;
    }

    public int hashCode() {
        return System.identityHashCode(this.f30192d);
    }

    @Override // kotlinx.coroutines.AbstractC13857h0
    /* renamed from: o0 */
    public void mo3067o0(InterfaceC11719g interfaceC11719g, Runnable runnable) {
        if (this.f30192d.post(runnable)) {
            return;
        }
        m3761L0(interfaceC11719g, runnable);
    }

    @Override // kotlinx.coroutines.AbstractC14111y1, kotlinx.coroutines.AbstractC13857h0
    public String toString() {
        String m2937K0 = m2937K0();
        if (m2937K0 == null) {
            String str = this.f30193e;
            if (str == null) {
                str = this.f30192d.toString();
            }
            return this.f30194f ? l.m(str, ".immediate") : str;
        }
        return m2937K0;
    }

    public /* synthetic */ C13751a(Handler handler, String str, int i, g gVar) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    public C13751a(Handler handler, String str) {
        this(handler, str, false);
    }
}

package kotlinx.coroutines.p563u2;

import java.util.concurrent.RejectedExecutionException;
import kotlin.e0.d.g;
import kotlin.p476c0.InterfaceC11719g;
import kotlinx.coroutines.AbstractC13860h1;
import kotlinx.coroutines.RunnableC14039s0;
/* compiled from: Dispatcher.kt */
/* renamed from: kotlinx.coroutines.u2.c */
/* loaded from: classes3.dex */
public class C14075c extends AbstractC13860h1 {

    /* renamed from: d */
    private final int f30698d;

    /* renamed from: e */
    private final int f30699e;

    /* renamed from: f */
    private final long f30700f;

    /* renamed from: w */
    private final String f30701w;

    /* renamed from: x */
    private ExecutorC14070a f30702x;

    public C14075c(int i, int i2, long j, String str) {
        this.f30698d = i;
        this.f30699e = i2;
        this.f30700f = j;
        this.f30701w = str;
        this.f30702x = m3096J0();
    }

    /* renamed from: J0 */
    private final ExecutorC14070a m3096J0() {
        return new ExecutorC14070a(this.f30698d, this.f30699e, this.f30700f, this.f30701w);
    }

    @Override // kotlinx.coroutines.AbstractC13857h0
    /* renamed from: F0 */
    public void mo3094F0(InterfaceC11719g interfaceC11719g, Runnable runnable) {
        try {
            ExecutorC14070a.m3134J(this.f30702x, runnable, null, true, 2, null);
        } catch (RejectedExecutionException unused) {
            RunnableC14039s0.f30618y.mo3094F0(interfaceC11719g, runnable);
        }
    }

    /* renamed from: K0 */
    public final void m3095K0(Runnable runnable, InterfaceC14082j interfaceC14082j, boolean z) {
        try {
            this.f30702x.m3135I(runnable, interfaceC14082j, z);
        } catch (RejectedExecutionException unused) {
            RunnableC14039s0.f30618y.m3742i1(this.f30702x.m3121m(runnable, interfaceC14082j));
        }
    }

    @Override // kotlinx.coroutines.AbstractC13857h0
    /* renamed from: o0 */
    public void mo3067o0(InterfaceC11719g interfaceC11719g, Runnable runnable) {
        try {
            ExecutorC14070a.m3134J(this.f30702x, runnable, null, false, 6, null);
        } catch (RejectedExecutionException unused) {
            RunnableC14039s0.f30618y.mo3067o0(interfaceC11719g, runnable);
        }
    }

    public /* synthetic */ C14075c(int i, int i2, String str, int i3, g gVar) {
        this((i3 & 1) != 0 ? C14084l.f30716b : i, (i3 & 2) != 0 ? C14084l.f30717c : i2, (i3 & 4) != 0 ? "DefaultDispatcher" : str);
    }

    public C14075c(int i, int i2, String str) {
        this(i, i2, C14084l.f30718d, str);
    }
}

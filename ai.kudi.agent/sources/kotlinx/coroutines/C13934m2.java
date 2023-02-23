package kotlinx.coroutines;

import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlinx.coroutines.internal.C13873c0;
import kotlinx.coroutines.internal.C13912w;
/* compiled from: CoroutineContext.kt */
/* renamed from: kotlinx.coroutines.m2 */
/* loaded from: classes3.dex */
public final class C13934m2<T> extends C13912w<T> {

    /* renamed from: f */
    private InterfaceC11719g f30415f;

    /* renamed from: w */
    private Object f30416w;

    public C13934m2(InterfaceC11719g interfaceC11719g, InterfaceC11714d<? super T> interfaceC11714d) {
        super(interfaceC11719g.get(C13938n2.f30424c) == null ? interfaceC11719g.plus(C13938n2.f30424c) : interfaceC11719g, interfaceC11714d);
    }

    @Override // kotlinx.coroutines.internal.C13912w, kotlinx.coroutines.AbstractC13758c
    /* renamed from: S0 */
    protected void mo3142S0(Object obj) {
        InterfaceC11719g interfaceC11719g = this.f30415f;
        if (interfaceC11719g != null) {
            C13873c0.m3551a(interfaceC11719g, this.f30416w);
            this.f30415f = null;
            this.f30416w = null;
        }
        Object m3621a = C13810e0.m3621a(obj, this.f30401e);
        InterfaceC11714d<T> interfaceC11714d = this.f30401e;
        InterfaceC11719g context = interfaceC11714d.getContext();
        Object m3549c = C13873c0.m3549c(context, null);
        C13934m2<?> m3574e = m3549c != C13873c0.f30342a ? C13853g0.m3574e(interfaceC11714d, context, m3549c) : null;
        try {
            this.f30401e.resumeWith(m3621a);
            C13666w c13666w = C13666w.f30112a;
        } finally {
            if (m3574e == null || m3574e.m3396X0()) {
                C13873c0.m3551a(context, m3549c);
            }
        }
    }

    /* renamed from: X0 */
    public final boolean m3396X0() {
        if (this.f30415f == null) {
            return false;
        }
        this.f30415f = null;
        this.f30416w = null;
        return true;
    }

    /* renamed from: Y0 */
    public final void m3395Y0(InterfaceC11719g interfaceC11719g, Object obj) {
        this.f30415f = interfaceC11719g;
        this.f30416w = obj;
    }
}

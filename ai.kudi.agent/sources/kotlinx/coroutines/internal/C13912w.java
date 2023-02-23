package kotlinx.coroutines.internal;

import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p476c0.p477j.C11729c;
import kotlin.p476c0.p478k.p479a.InterfaceC11739e;
import kotlinx.coroutines.AbstractC13758c;
import kotlinx.coroutines.C13810e0;
import kotlinx.coroutines.InterfaceC13947p1;
import kotlinx.coroutines.InterfaceC14038s;
/* compiled from: Scopes.kt */
/* renamed from: kotlinx.coroutines.internal.w */
/* loaded from: classes3.dex */
public class C13912w<T> extends AbstractC13758c<T> implements InterfaceC11739e {

    /* renamed from: e */
    public final InterfaceC11714d<T> f30401e;

    /* JADX WARN: Multi-variable type inference failed */
    public C13912w(InterfaceC11719g interfaceC11719g, InterfaceC11714d<? super T> interfaceC11714d) {
        super(interfaceC11719g, true, true);
        this.f30401e = interfaceC11714d;
    }

    @Override // kotlinx.coroutines.AbstractC13758c
    /* renamed from: S0 */
    protected void mo3142S0(Object obj) {
        InterfaceC11714d<T> interfaceC11714d = this.f30401e;
        interfaceC11714d.resumeWith(C13810e0.m3621a(obj, interfaceC11714d));
    }

    /* renamed from: W0 */
    public final InterfaceC13947p1 m3435W0() {
        InterfaceC14038s m3029T = m3029T();
        if (m3029T == null) {
            return null;
        }
        return m3029T.getParent();
    }

    @Override // kotlinx.coroutines.C14088v1
    /* renamed from: d0 */
    protected final boolean mo3020d0() {
        return true;
    }

    @Override // kotlin.p476c0.p478k.p479a.InterfaceC11739e
    public final InterfaceC11739e getCallerFrame() {
        InterfaceC11714d<T> interfaceC11714d = this.f30401e;
        if (interfaceC11714d instanceof InterfaceC11739e) {
            return (InterfaceC11739e) interfaceC11714d;
        }
        return null;
    }

    @Override // kotlin.p476c0.p478k.p479a.InterfaceC11739e
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.C14088v1
    /* renamed from: u */
    public void mo3003u(Object obj) {
        InterfaceC11714d m10388c;
        m10388c = C11729c.m10388c(this.f30401e);
        C13883g.m3514c(m10388c, C13810e0.m3621a(obj, this.f30401e), null, 2, null);
    }
}

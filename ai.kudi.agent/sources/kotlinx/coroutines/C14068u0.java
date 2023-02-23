package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p476c0.p477j.C11729c;
import kotlin.p476c0.p477j.C11734d;
import kotlinx.coroutines.internal.C13883g;
import kotlinx.coroutines.internal.C13912w;
/* compiled from: Builders.common.kt */
/* renamed from: kotlinx.coroutines.u0 */
/* loaded from: classes3.dex */
public final class C14068u0<T> extends C13912w<T> {

    /* renamed from: f */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f30668f = AtomicIntegerFieldUpdater.newUpdater(C14068u0.class, "_decision");
    private volatile /* synthetic */ int _decision;

    public C14068u0(InterfaceC11719g interfaceC11719g, InterfaceC11714d<? super T> interfaceC11714d) {
        super(interfaceC11719g, interfaceC11714d);
        this._decision = 0;
    }

    /* renamed from: Y0 */
    private final boolean m3140Y0() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f30668f.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: Z0 */
    private final boolean m3139Z0() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f30668f.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // kotlinx.coroutines.internal.C13912w, kotlinx.coroutines.AbstractC13758c
    /* renamed from: S0 */
    protected void mo3142S0(Object obj) {
        InterfaceC11714d m10388c;
        if (m3140Y0()) {
            return;
        }
        m10388c = C11729c.m10388c(this.f30401e);
        C13883g.m3514c(m10388c, C13810e0.m3621a(obj, this.f30401e), null, 2, null);
    }

    /* renamed from: X0 */
    public final Object m3141X0() {
        Object m10387d;
        if (m3139Z0()) {
            m10387d = C11734d.m10387d();
            return m10387d;
        }
        Object m2950h = C14105w1.m2950h(m3028U());
        if (m2950h instanceof C13755b0) {
            throw ((C13755b0) m2950h).f30198a;
        }
        return m2950h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.internal.C13912w, kotlinx.coroutines.C14088v1
    /* renamed from: u */
    public void mo3003u(Object obj) {
        mo3142S0(obj);
    }
}

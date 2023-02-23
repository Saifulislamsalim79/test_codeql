package kotlinx.coroutines;

import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p483e0.p484c.InterfaceC11771p;
/* compiled from: AbstractCoroutine.kt */
/* renamed from: kotlinx.coroutines.c */
/* loaded from: classes3.dex */
public abstract class AbstractC13758c<T> extends C14088v1 implements InterfaceC13947p1, InterfaceC11714d<T>, InterfaceC13932m0 {

    /* renamed from: d */
    private final InterfaceC11719g f30202d;

    public AbstractC13758c(InterfaceC11719g interfaceC11719g, boolean z, boolean z2) {
        super(z2);
        if (z) {
            m3023a0((InterfaceC13947p1) interfaceC11719g.get(InterfaceC13947p1.f30435u));
        }
        this.f30202d = interfaceC11719g.plus(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.C14088v1
    /* renamed from: C */
    public String mo3056C() {
        return kotlin.e0.d.l.m(C14034r0.m3204a(this), " was cancelled");
    }

    /* renamed from: S0 */
    protected void mo3142S0(Object obj) {
        mo3003u(obj);
    }

    /* renamed from: T0 */
    protected void mo3656T0(Throwable th, boolean z) {
    }

    /* renamed from: U0 */
    protected void mo3655U0(T t) {
    }

    /* renamed from: V0 */
    public final <R> void m3748V0(EnumC13940o0 enumC13940o0, R r, InterfaceC11771p<? super R, ? super InterfaceC11714d<? super T>, ? extends Object> interfaceC11771p) {
        enumC13940o0.m3358b(interfaceC11771p, r, this);
    }

    @Override // kotlinx.coroutines.C14088v1
    /* renamed from: Y */
    public final void mo3024Y(Throwable th) {
        C13917j0.m3410a(this.f30202d, th);
    }

    @Override // kotlin.p476c0.InterfaceC11714d
    public final InterfaceC11719g getContext() {
        return this.f30202d;
    }

    @Override // kotlinx.coroutines.C14088v1, kotlinx.coroutines.InterfaceC13947p1
    public boolean isActive() {
        return super.isActive();
    }

    @Override // kotlinx.coroutines.InterfaceC13932m0
    /* renamed from: o0 */
    public InterfaceC11719g mo3397o0() {
        return this.f30202d;
    }

    @Override // kotlinx.coroutines.C14088v1
    /* renamed from: p0 */
    public String mo3012p0() {
        String m3577b = C13853g0.m3577b(this.f30202d);
        if (m3577b == null) {
            return super.mo3012p0();
        }
        return '\"' + m3577b + "\":" + super.mo3012p0();
    }

    @Override // kotlin.p476c0.InterfaceC11714d
    public final void resumeWith(Object obj) {
        Object m3014m0 = m3014m0(C13810e0.m3618d(obj, null, 1, null));
        if (m3014m0 == C14105w1.f30756b) {
            return;
        }
        mo3142S0(m3014m0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.C14088v1
    /* renamed from: v0 */
    protected final void mo3000v0(Object obj) {
        if (obj instanceof C13755b0) {
            C13755b0 c13755b0 = (C13755b0) obj;
            mo3656T0(c13755b0.f30198a, c13755b0.m3758a());
            return;
        }
        mo3655U0(obj);
    }
}

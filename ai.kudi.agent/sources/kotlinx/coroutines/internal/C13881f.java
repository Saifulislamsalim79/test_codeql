package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p476c0.p478k.p479a.InterfaceC11739e;
import kotlinx.coroutines.AbstractC13756b1;
import kotlinx.coroutines.AbstractC13857h0;
import kotlinx.coroutines.AbstractC14087v0;
import kotlinx.coroutines.C13759c0;
import kotlinx.coroutines.C13810e0;
import kotlinx.coroutines.C13924k2;
import kotlinx.coroutines.C13935n;
import kotlinx.coroutines.C13952q0;
import kotlinx.coroutines.C14034r0;
import kotlinx.coroutines.InterfaceC13930m;
/* compiled from: DispatchedContinuation.kt */
/* renamed from: kotlinx.coroutines.internal.f */
/* loaded from: classes3.dex */
public final class C13881f<T> extends AbstractC14087v0<T> implements InterfaceC11739e, InterfaceC11714d<T> {

    /* renamed from: z */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f30352z = AtomicReferenceFieldUpdater.newUpdater(C13881f.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* renamed from: f */
    public final AbstractC13857h0 f30353f;

    /* renamed from: w */
    public final InterfaceC11714d<T> f30354w;

    /* renamed from: x */
    public Object f30355x;

    /* renamed from: y */
    public final Object f30356y;

    /* JADX WARN: Multi-variable type inference failed */
    public C13881f(AbstractC13857h0 abstractC13857h0, InterfaceC11714d<? super T> interfaceC11714d) {
        super(-1);
        this.f30353f = abstractC13857h0;
        this.f30354w = interfaceC11714d;
        this.f30355x = C13883g.m3516a();
        this.f30356y = C13873c0.m3550b(getContext());
        this._reusableCancellableContinuation = null;
    }

    /* renamed from: r */
    private final C13935n<?> m3523r() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof C13935n) {
            return (C13935n) obj;
        }
        return null;
    }

    @Override // kotlinx.coroutines.AbstractC14087v0
    /* renamed from: c */
    public void mo3066c(Object obj, Throwable th) {
        if (obj instanceof C13759c0) {
            ((C13759c0) obj).f30204b.invoke(th);
        }
    }

    @Override // kotlinx.coroutines.AbstractC14087v0
    /* renamed from: d */
    public InterfaceC11714d<T> mo3065d() {
        return this;
    }

    @Override // kotlin.p476c0.p478k.p479a.InterfaceC11739e
    public InterfaceC11739e getCallerFrame() {
        InterfaceC11714d<T> interfaceC11714d = this.f30354w;
        if (interfaceC11714d instanceof InterfaceC11739e) {
            return (InterfaceC11739e) interfaceC11714d;
        }
        return null;
    }

    @Override // kotlin.p476c0.InterfaceC11714d
    public InterfaceC11719g getContext() {
        return this.f30354w.getContext();
    }

    @Override // kotlin.p476c0.p478k.p479a.InterfaceC11739e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.AbstractC14087v0
    /* renamed from: k */
    public Object mo3061k() {
        Object obj = this.f30355x;
        if (C13952q0.m3345a()) {
            if (!(obj != C13883g.m3516a())) {
                throw new AssertionError();
            }
        }
        this.f30355x = C13883g.m3516a();
        return obj;
    }

    /* renamed from: m */
    public final void m3526m() {
        do {
        } while (this._reusableCancellableContinuation == C13883g.f30362b);
    }

    /* renamed from: o */
    public final C13935n<T> m3525o() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = C13883g.f30362b;
                return null;
            } else if (obj instanceof C13935n) {
                if (f30352z.compareAndSet(this, obj, C13883g.f30362b)) {
                    return (C13935n) obj;
                }
            } else if (obj != C13883g.f30362b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(kotlin.e0.d.l.m("Inconsistent state ", obj).toString());
            }
        }
    }

    /* renamed from: q */
    public final void m3524q(InterfaceC11719g interfaceC11719g, T t) {
        this.f30355x = t;
        this.f30728e = 1;
        this.f30353f.mo3094F0(interfaceC11719g, this);
    }

    @Override // kotlin.p476c0.InterfaceC11714d
    public void resumeWith(Object obj) {
        InterfaceC11719g context = this.f30354w.getContext();
        Object m3618d = C13810e0.m3618d(obj, null, 1, null);
        if (this.f30353f.mo3399H0(context)) {
            this.f30355x = m3618d;
            this.f30728e = 0;
            this.f30353f.mo3067o0(context, this);
            return;
        }
        C13952q0.m3345a();
        AbstractC13756b1 m3403a = C13924k2.f30408a.m3403a();
        if (m3403a.m3751X0()) {
            this.f30355x = m3618d;
            this.f30728e = 0;
            m3403a.m3754L0(this);
            return;
        }
        m3403a.m3753Q0(true);
        try {
            InterfaceC11719g context2 = getContext();
            Object m3549c = C13873c0.m3549c(context2, this.f30356y);
            this.f30354w.resumeWith(obj);
            C13666w c13666w = C13666w.f30112a;
            C13873c0.m3551a(context2, m3549c);
            do {
            } while (m3403a.m3749b1());
        } finally {
            try {
            } finally {
            }
        }
    }

    /* renamed from: s */
    public final boolean m3522s() {
        return this._reusableCancellableContinuation != null;
    }

    /* renamed from: t */
    public final boolean m3521t(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (kotlin.e0.d.l.b(obj, C13883g.f30362b)) {
                if (f30352z.compareAndSet(this, C13883g.f30362b, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (f30352z.compareAndSet(this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f30353f + ", " + C14034r0.m3202c(this.f30354w) + ']';
    }

    /* renamed from: u */
    public final void m3520u() {
        m3526m();
        C13935n<?> m3523r = m3523r();
        if (m3523r == null) {
            return;
        }
        m3523r.m3366u();
    }

    /* renamed from: v */
    public final Throwable m3519v(InterfaceC13930m<?> interfaceC13930m) {
        C13914y c13914y;
        do {
            Object obj = this._reusableCancellableContinuation;
            c13914y = C13883g.f30362b;
            if (obj != c13914y) {
                if (obj instanceof Throwable) {
                    if (f30352z.compareAndSet(this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(kotlin.e0.d.l.m("Inconsistent state ", obj).toString());
            }
        } while (!f30352z.compareAndSet(this, c13914y, interfaceC13930m));
        return null;
    }
}

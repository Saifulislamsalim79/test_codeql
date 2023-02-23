package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.InterfaceC11739e;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlinx.coroutines.InterfaceC13947p1;
import kotlinx.coroutines.internal.C13881f;
import kotlinx.coroutines.internal.C13913x;
import kotlinx.coroutines.internal.C13914y;
/* compiled from: CancellableContinuationImpl.kt */
/* renamed from: kotlinx.coroutines.n */
/* loaded from: classes3.dex */
public class C13935n<T> extends AbstractC14087v0<T> implements InterfaceC13930m<T>, InterfaceC11739e {

    /* renamed from: y */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f30417y = AtomicIntegerFieldUpdater.newUpdater(C13935n.class, "_decision");

    /* renamed from: z */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f30418z = AtomicReferenceFieldUpdater.newUpdater(C13935n.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;

    /* renamed from: f */
    private final InterfaceC11714d<T> f30419f;

    /* renamed from: w */
    private final InterfaceC11719g f30420w;

    /* renamed from: x */
    private InterfaceC14110y0 f30421x;

    /* JADX WARN: Multi-variable type inference failed */
    public C13935n(InterfaceC11714d<? super T> interfaceC11714d, int i) {
        super(i);
        this.f30419f = interfaceC11714d;
        if (C13952q0.m3345a()) {
            if (!(i != -1)) {
                throw new AssertionError();
            }
        }
        this.f30420w = this.f30419f.getContext();
        this._decision = 0;
        this._state = C13813f.f30262c;
    }

    /* renamed from: A */
    private final String m3394A() {
        Object m3362z = m3362z();
        return m3362z instanceof InterfaceC13757b2 ? "Active" : m3362z instanceof C13951q ? "Cancelled" : "Completed";
    }

    /* renamed from: C */
    private final InterfaceC14110y0 m3392C() {
        InterfaceC13947p1 interfaceC13947p1 = (InterfaceC13947p1) getContext().get(InterfaceC13947p1.f30435u);
        if (interfaceC13947p1 == null) {
            return null;
        }
        InterfaceC14110y0 m3350d = InterfaceC13947p1.C13948a.m3350d(interfaceC13947p1, true, false, new C14033r(this), 2, null);
        this.f30421x = m3350d;
        return m3350d;
    }

    /* renamed from: E */
    private final boolean m3390E() {
        return C14104w0.m2960c(this.f30728e) && ((C13881f) this.f30419f).m3522s();
    }

    /* renamed from: F */
    private final AbstractC13920k m3389F(InterfaceC11767l<? super Throwable, C13666w> interfaceC11767l) {
        return interfaceC11767l instanceof AbstractC13920k ? (AbstractC13920k) interfaceC11767l : new C13933m1(interfaceC11767l);
    }

    /* renamed from: G */
    private final void m3388G(InterfaceC11767l<? super Throwable, C13666w> interfaceC11767l, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + interfaceC11767l + ", already has " + obj).toString());
    }

    /* renamed from: J */
    private final void m3386J() {
        InterfaceC11714d<T> interfaceC11714d = this.f30419f;
        C13881f c13881f = interfaceC11714d instanceof C13881f ? (C13881f) interfaceC11714d : null;
        Throwable m3519v = c13881f != null ? c13881f.m3519v(this) : null;
        if (m3519v == null) {
            return;
        }
        m3366u();
        m3368s(m3519v);
    }

    /* renamed from: L */
    private final void m3384L(Object obj, int i, InterfaceC11767l<? super Throwable, C13666w> interfaceC11767l) {
        Object obj2;
        do {
            obj2 = this._state;
            if (obj2 instanceof InterfaceC13757b2) {
            } else {
                if (obj2 instanceof C13951q) {
                    C13951q c13951q = (C13951q) obj2;
                    if (c13951q.m3346c()) {
                        if (interfaceC11767l == null) {
                            return;
                        }
                        m3369r(interfaceC11767l, c13951q.f30198a);
                        return;
                    }
                }
                m3374m(obj);
                throw null;
            }
        } while (!f30418z.compareAndSet(this, obj2, m3382N((InterfaceC13757b2) obj2, obj, i, interfaceC11767l, null)));
        m3365v();
        m3364w(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: M */
    static /* synthetic */ void m3383M(C13935n c13935n, Object obj, int i, InterfaceC11767l interfaceC11767l, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i2 & 4) != 0) {
            interfaceC11767l = null;
        }
        c13935n.m3384L(obj, i, interfaceC11767l);
    }

    /* renamed from: N */
    private final Object m3382N(InterfaceC13757b2 interfaceC13757b2, Object obj, int i, InterfaceC11767l<? super Throwable, C13666w> interfaceC11767l, Object obj2) {
        if (obj instanceof C13755b0) {
            if (C13952q0.m3345a()) {
                if (!(obj2 == null)) {
                    throw new AssertionError();
                }
            }
            if (C13952q0.m3345a()) {
                if (interfaceC11767l == null) {
                    return obj;
                }
                throw new AssertionError();
            }
            return obj;
        } else if (C14104w0.m2961b(i) || obj2 != null) {
            if (interfaceC11767l != null || (((interfaceC13757b2 instanceof AbstractC13920k) && !(interfaceC13757b2 instanceof AbstractC13852g)) || obj2 != null)) {
                return new C13748a0(obj, interfaceC13757b2 instanceof AbstractC13920k ? (AbstractC13920k) interfaceC13757b2 : null, interfaceC11767l, obj2, null, 16, null);
            }
            return obj;
        } else {
            return obj;
        }
    }

    /* renamed from: O */
    private final boolean m3381O() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f30417y.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: P */
    private final C13914y m3380P(Object obj, Object obj2, InterfaceC11767l<? super Throwable, C13666w> interfaceC11767l) {
        Object obj3;
        do {
            obj3 = this._state;
            if (obj3 instanceof InterfaceC13757b2) {
            } else if (!(obj3 instanceof C13748a0) || obj2 == null) {
                return null;
            } else {
                C13748a0 c13748a0 = (C13748a0) obj3;
                if (c13748a0.f30188d == obj2) {
                    if (!C13952q0.m3345a() || kotlin.e0.d.l.b(c13748a0.f30185a, obj)) {
                        return C13939o.f30425a;
                    }
                    throw new AssertionError();
                }
                return null;
            }
        } while (!f30418z.compareAndSet(this, obj3, m3382N((InterfaceC13757b2) obj3, obj, this.f30728e, interfaceC11767l, obj2)));
        m3365v();
        return C13939o.f30425a;
    }

    /* renamed from: Q */
    private final boolean m3379Q() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f30417y.compareAndSet(this, 0, 1));
        return true;
    }

    /* renamed from: m */
    private final Void m3374m(Object obj) {
        throw new IllegalStateException(kotlin.e0.d.l.m("Already resumed, but proposed with update ", obj).toString());
    }

    /* renamed from: o */
    private final void m3372o(InterfaceC11767l<? super Throwable, C13666w> interfaceC11767l, Throwable th) {
        try {
            interfaceC11767l.invoke(th);
        } catch (Throwable th2) {
            C13917j0.m3410a(getContext(), new CompletionHandlerException(kotlin.e0.d.l.m("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    /* renamed from: t */
    private final boolean m3367t(Throwable th) {
        if (m3390E()) {
            return ((C13881f) this.f30419f).m3521t(th);
        }
        return false;
    }

    /* renamed from: v */
    private final void m3365v() {
        if (m3390E()) {
            return;
        }
        m3366u();
    }

    /* renamed from: w */
    private final void m3364w(int i) {
        if (m3381O()) {
            return;
        }
        C14104w0.m2962a(this, i);
    }

    /* renamed from: B */
    public void m3393B() {
        InterfaceC14110y0 m3392C = m3392C();
        if (m3392C != null && m3391D()) {
            m3392C.mo2939i();
            this.f30421x = C13750a2.f30191c;
        }
    }

    /* renamed from: D */
    public boolean m3391D() {
        return !(m3362z() instanceof InterfaceC13757b2);
    }

    /* renamed from: H */
    protected String mo2995H() {
        return "CancellableContinuation";
    }

    /* renamed from: I */
    public final void m3387I(Throwable th) {
        if (m3367t(th)) {
            return;
        }
        m3368s(th);
        m3365v();
    }

    /* renamed from: K */
    public final boolean m3385K() {
        if (C13952q0.m3345a()) {
            if (!(this.f30728e == 2)) {
                throw new AssertionError();
            }
        }
        if (C13952q0.m3345a()) {
            if (!(this.f30421x != C13750a2.f30191c)) {
                throw new AssertionError();
            }
        }
        Object obj = this._state;
        if (!C13952q0.m3345a() || (!(obj instanceof InterfaceC13757b2))) {
            if ((obj instanceof C13748a0) && ((C13748a0) obj).f30188d != null) {
                m3366u();
                return false;
            }
            this._decision = 0;
            this._state = C13813f.f30262c;
            return true;
        }
        throw new AssertionError();
    }

    @Override // kotlinx.coroutines.InterfaceC13930m
    /* renamed from: b */
    public Object mo3378b(T t, Object obj) {
        return m3380P(t, obj, null);
    }

    @Override // kotlinx.coroutines.AbstractC14087v0
    /* renamed from: c */
    public void mo3066c(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof InterfaceC13757b2)) {
                if (obj2 instanceof C13755b0) {
                    return;
                }
                if (obj2 instanceof C13748a0) {
                    C13748a0 c13748a0 = (C13748a0) obj2;
                    if (!c13748a0.m3763c()) {
                        if (f30418z.compareAndSet(this, obj2, C13748a0.m3764b(c13748a0, null, null, null, null, th, 15, null))) {
                            c13748a0.m3762d(this, th);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (f30418z.compareAndSet(this, obj2, new C13748a0(obj2, null, null, null, th, 14, null))) {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed".toString());
            }
        }
    }

    @Override // kotlinx.coroutines.AbstractC14087v0
    /* renamed from: d */
    public final InterfaceC11714d<T> mo3065d() {
        return this.f30419f;
    }

    @Override // kotlinx.coroutines.AbstractC14087v0
    /* renamed from: e */
    public Throwable mo3064e(Object obj) {
        Throwable m3425j;
        Throwable mo3064e = super.mo3064e(obj);
        if (mo3064e == null) {
            return null;
        }
        InterfaceC11714d<T> mo3065d = mo3065d();
        if (C13952q0.m3342d() && (mo3065d instanceof InterfaceC11739e)) {
            m3425j = C13913x.m3425j(mo3064e, (InterfaceC11739e) mo3065d);
            return m3425j;
        }
        return mo3064e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.AbstractC14087v0
    /* renamed from: f */
    public <T> T mo3063f(Object obj) {
        return obj instanceof C13748a0 ? (T) ((C13748a0) obj).f30185a : obj;
    }

    @Override // kotlin.p476c0.p478k.p479a.InterfaceC11739e
    public InterfaceC11739e getCallerFrame() {
        InterfaceC11714d<T> interfaceC11714d = this.f30419f;
        if (interfaceC11714d instanceof InterfaceC11739e) {
            return (InterfaceC11739e) interfaceC11714d;
        }
        return null;
    }

    @Override // kotlin.p476c0.InterfaceC11714d
    public InterfaceC11719g getContext() {
        return this.f30420w;
    }

    @Override // kotlin.p476c0.p478k.p479a.InterfaceC11739e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.InterfaceC13930m
    /* renamed from: i */
    public void mo3377i(InterfaceC11767l<? super Throwable, C13666w> interfaceC11767l) {
        AbstractC13920k m3389F = m3389F(interfaceC11767l);
        while (true) {
            Object obj = this._state;
            if (obj instanceof C13813f) {
                if (f30418z.compareAndSet(this, obj, m3389F)) {
                    return;
                }
            } else {
                if (!(obj instanceof AbstractC13920k)) {
                    boolean z = obj instanceof C13755b0;
                    if (z) {
                        C13755b0 c13755b0 = (C13755b0) obj;
                        if (c13755b0.m3757b()) {
                            if (obj instanceof C13951q) {
                                if (!z) {
                                    c13755b0 = null;
                                }
                                m3372o(interfaceC11767l, c13755b0 != null ? c13755b0.f30198a : null);
                                return;
                            }
                            return;
                        }
                        m3388G(interfaceC11767l, obj);
                        throw null;
                    } else if (obj instanceof C13748a0) {
                        C13748a0 c13748a0 = (C13748a0) obj;
                        if (c13748a0.f30186b == null) {
                            if (m3389F instanceof AbstractC13852g) {
                                return;
                            }
                            if (c13748a0.m3763c()) {
                                m3372o(interfaceC11767l, c13748a0.f30189e);
                                return;
                            } else {
                                if (f30418z.compareAndSet(this, obj, C13748a0.m3764b(c13748a0, null, m3389F, null, null, null, 29, null))) {
                                    return;
                                }
                            }
                        } else {
                            m3388G(interfaceC11767l, obj);
                            throw null;
                        }
                    } else if (m3389F instanceof AbstractC13852g) {
                        return;
                    } else {
                        if (f30418z.compareAndSet(this, obj, new C13748a0(obj, m3389F, null, null, null, 28, null))) {
                            return;
                        }
                    }
                } else {
                    m3388G(interfaceC11767l, obj);
                    throw null;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.InterfaceC13930m
    /* renamed from: j */
    public Object mo3376j(Throwable th) {
        return m3380P(new C13755b0(th, false, 2, null), null, null);
    }

    @Override // kotlinx.coroutines.AbstractC14087v0
    /* renamed from: k */
    public Object mo3061k() {
        return m3362z();
    }

    @Override // kotlinx.coroutines.InterfaceC13930m
    /* renamed from: l */
    public Object mo3375l(T t, Object obj, InterfaceC11767l<? super Throwable, C13666w> interfaceC11767l) {
        return m3380P(t, obj, interfaceC11767l);
    }

    @Override // kotlinx.coroutines.InterfaceC13930m
    /* renamed from: n */
    public void mo3373n(T t, InterfaceC11767l<? super Throwable, C13666w> interfaceC11767l) {
        m3384L(t, this.f30728e, interfaceC11767l);
    }

    @Override // kotlinx.coroutines.InterfaceC13930m
    /* renamed from: p */
    public void mo3371p(Object obj) {
        if (C13952q0.m3345a()) {
            if (!(obj == C13939o.f30425a)) {
                throw new AssertionError();
            }
        }
        m3364w(this.f30728e);
    }

    /* renamed from: q */
    public final void m3370q(AbstractC13920k abstractC13920k, Throwable th) {
        try {
            abstractC13920k.mo2936a(th);
        } catch (Throwable th2) {
            C13917j0.m3410a(getContext(), new CompletionHandlerException(kotlin.e0.d.l.m("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    /* renamed from: r */
    public final void m3369r(InterfaceC11767l<? super Throwable, C13666w> interfaceC11767l, Throwable th) {
        try {
            interfaceC11767l.invoke(th);
        } catch (Throwable th2) {
            C13917j0.m3410a(getContext(), new CompletionHandlerException(kotlin.e0.d.l.m("Exception in resume onCancellation handler for ", this), th2));
        }
    }

    @Override // kotlin.p476c0.InterfaceC11714d
    public void resumeWith(Object obj) {
        m3383M(this, C13810e0.m3619c(obj, this), this.f30728e, null, 4, null);
    }

    /* renamed from: s */
    public boolean m3368s(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof InterfaceC13757b2)) {
                return false;
            }
            z = obj instanceof AbstractC13920k;
        } while (!f30418z.compareAndSet(this, obj, new C13951q(this, th, z)));
        AbstractC13920k abstractC13920k = z ? (AbstractC13920k) obj : null;
        if (abstractC13920k != null) {
            m3370q(abstractC13920k, th);
        }
        m3365v();
        m3364w(this.f30728e);
        return true;
    }

    public String toString() {
        return mo2995H() + '(' + C14034r0.m3202c(this.f30419f) + "){" + m3394A() + "}@" + C14034r0.m3203b(this);
    }

    /* renamed from: u */
    public final void m3366u() {
        InterfaceC14110y0 interfaceC14110y0 = this.f30421x;
        if (interfaceC14110y0 == null) {
            return;
        }
        interfaceC14110y0.mo2939i();
        this.f30421x = C13750a2.f30191c;
    }

    /* renamed from: x */
    public Throwable mo2994x(InterfaceC13947p1 interfaceC13947p1) {
        return interfaceC13947p1.mo3025X();
    }

    /* renamed from: y */
    public final Object m3363y() {
        InterfaceC13947p1 interfaceC13947p1;
        Throwable m3425j;
        Throwable m3425j2;
        Object m10387d;
        boolean m3390E = m3390E();
        if (m3379Q()) {
            if (this.f30421x == null) {
                m3392C();
            }
            if (m3390E) {
                m3386J();
            }
            m10387d = C11734d.m10387d();
            return m10387d;
        }
        if (m3390E) {
            m3386J();
        }
        Object m3362z = m3362z();
        if (m3362z instanceof C13755b0) {
            Throwable th = ((C13755b0) m3362z).f30198a;
            if (C13952q0.m3342d()) {
                m3425j2 = C13913x.m3425j(th, this);
                throw m3425j2;
            }
            throw th;
        } else if (C14104w0.m2961b(this.f30728e) && (interfaceC13947p1 = (InterfaceC13947p1) getContext().get(InterfaceC13947p1.f30435u)) != null && !interfaceC13947p1.isActive()) {
            CancellationException mo3025X = interfaceC13947p1.mo3025X();
            mo3066c(m3362z, mo3025X);
            if (C13952q0.m3342d()) {
                m3425j = C13913x.m3425j(mo3025X, this);
                throw m3425j;
            }
            throw mo3025X;
        } else {
            return mo3063f(m3362z);
        }
    }

    /* renamed from: z */
    public final Object m3362z() {
        return this._state;
    }
}

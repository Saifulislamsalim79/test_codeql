package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C11709c;
import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p476c0.p477j.C11729c;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.C11741h;
import kotlin.p476c0.p478k.p479a.InterfaceC11739e;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlinx.coroutines.InterfaceC13947p1;
import kotlinx.coroutines.internal.AbstractC13910u;
import kotlinx.coroutines.internal.C13896m;
import kotlinx.coroutines.internal.C13897n;
import kotlinx.coroutines.internal.C13913x;
import kotlinx.coroutines.internal.C13914y;
/* compiled from: JobSupport.kt */
/* renamed from: kotlinx.coroutines.v1 */
/* loaded from: classes3.dex */
public class C14088v1 implements InterfaceC13947p1, InterfaceC14067u, InterfaceC13763c2 {

    /* renamed from: c */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f30729c = AtomicReferenceFieldUpdater.newUpdater(C14088v1.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JobSupport.kt */
    /* renamed from: kotlinx.coroutines.v1$a */
    /* loaded from: classes3.dex */
    public static final class C14089a<T> extends C13935n<T> {

        /* renamed from: A */
        private final C14088v1 f30730A;

        public C14089a(InterfaceC11714d<? super T> interfaceC11714d, C14088v1 c14088v1) {
            super(interfaceC11714d, 1);
            this.f30730A = c14088v1;
        }

        @Override // kotlinx.coroutines.C13935n
        /* renamed from: H */
        protected String mo2995H() {
            return "AwaitContinuation";
        }

        @Override // kotlinx.coroutines.C13935n
        /* renamed from: x */
        public Throwable mo2994x(InterfaceC13947p1 interfaceC13947p1) {
            Throwable m2989e;
            Object m3028U = this.f30730A.m3028U();
            return (!(m3028U instanceof C14091c) || (m2989e = ((C14091c) m3028U).m2989e()) == null) ? m3028U instanceof C13755b0 ? ((C13755b0) m3028U).f30198a : interfaceC13947p1.mo3025X() : m2989e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JobSupport.kt */
    /* renamed from: kotlinx.coroutines.v1$b */
    /* loaded from: classes3.dex */
    public static final class C14090b extends AbstractC14069u1 {

        /* renamed from: w */
        private final C14088v1 f30731w;

        /* renamed from: x */
        private final C14091c f30732x;

        /* renamed from: y */
        private final C14055t f30733y;

        /* renamed from: z */
        private final Object f30734z;

        public C14090b(C14088v1 c14088v1, C14091c c14091c, C14055t c14055t, Object obj) {
            this.f30731w = c14088v1;
            this.f30732x = c14091c;
            this.f30733y = c14055t;
            this.f30734z = obj;
        }

        @Override // kotlinx.coroutines.AbstractC13806d0
        /* renamed from: B */
        public void mo2993B(Throwable th) {
            this.f30731w.m3050G(this.f30732x, this.f30733y, this.f30734z);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ C13666w invoke(Throwable th) {
            mo2993B(th);
            return C13666w.f30112a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JobSupport.kt */
    /* renamed from: kotlinx.coroutines.v1$c */
    /* loaded from: classes3.dex */
    public static final class C14091c implements InterfaceC13923k1 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: c */
        private final C14114z1 f30735c;

        public C14091c(C14114z1 c14114z1, boolean z, Throwable th) {
            this.f30735c = c14114z1;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        /* renamed from: b */
        private final ArrayList<Throwable> m2991b() {
            return new ArrayList<>(4);
        }

        /* renamed from: d */
        private final Object m2990d() {
            return this._exceptionsHolder;
        }

        /* renamed from: k */
        private final void m2983k(Object obj) {
            this._exceptionsHolder = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final void m2992a(Throwable th) {
            Throwable m2989e = m2989e();
            if (m2989e == null) {
                m2982l(th);
            } else if (th == m2989e) {
            } else {
                Object m2990d = m2990d();
                if (m2990d == null) {
                    m2983k(th);
                } else if (!(m2990d instanceof Throwable)) {
                    if (!(m2990d instanceof ArrayList)) {
                        throw new IllegalStateException(kotlin.e0.d.l.m("State is ", m2990d).toString());
                    }
                    ((ArrayList) m2990d).add(th);
                } else if (th == m2990d) {
                } else {
                    ArrayList<Throwable> m2991b = m2991b();
                    m2991b.add(m2990d);
                    m2991b.add(th);
                    C13666w c13666w = C13666w.f30112a;
                    m2983k(m2991b);
                }
            }
        }

        @Override // kotlinx.coroutines.InterfaceC13923k1
        /* renamed from: c */
        public C14114z1 mo2934c() {
            return this.f30735c;
        }

        /* renamed from: e */
        public final Throwable m2989e() {
            return (Throwable) this._rootCause;
        }

        /* renamed from: f */
        public final boolean m2988f() {
            return m2989e() != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
        /* renamed from: g */
        public final boolean m2987g() {
            return this._isCompleting;
        }

        /* renamed from: h */
        public final boolean m2986h() {
            C13914y c13914y;
            Object m2990d = m2990d();
            c13914y = C14105w1.f30759e;
            return m2990d == c13914y;
        }

        /* renamed from: i */
        public final List<Throwable> m2985i(Throwable th) {
            ArrayList<Throwable> arrayList;
            C13914y c13914y;
            Object m2990d = m2990d();
            if (m2990d == null) {
                arrayList = m2991b();
            } else if (m2990d instanceof Throwable) {
                ArrayList<Throwable> m2991b = m2991b();
                m2991b.add(m2990d);
                arrayList = m2991b;
            } else if (!(m2990d instanceof ArrayList)) {
                throw new IllegalStateException(kotlin.e0.d.l.m("State is ", m2990d).toString());
            } else {
                arrayList = (ArrayList) m2990d;
            }
            Throwable m2989e = m2989e();
            if (m2989e != null) {
                arrayList.add(0, m2989e);
            }
            if (th != null && !kotlin.e0.d.l.b(th, m2989e)) {
                arrayList.add(th);
            }
            c13914y = C14105w1.f30759e;
            m2983k(c13914y);
            return arrayList;
        }

        @Override // kotlinx.coroutines.InterfaceC13923k1
        public boolean isActive() {
            return m2989e() == null;
        }

        /* renamed from: j */
        public final void m2984j(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        /* renamed from: l */
        public final void m2982l(Throwable th) {
            this._rootCause = th;
        }

        public String toString() {
            return "Finishing[cancelling=" + m2988f() + ", completing=" + m2987g() + ", rootCause=" + m2989e() + ", exceptions=" + m2990d() + ", list=" + mo2934c() + ']';
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    /* renamed from: kotlinx.coroutines.v1$d */
    /* loaded from: classes3.dex */
    public static final class C14092d extends C13897n.AbstractC13899b {

        /* renamed from: d */
        final /* synthetic */ C14088v1 f30736d;

        /* renamed from: e */
        final /* synthetic */ Object f30737e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14092d(C13897n c13897n, C14088v1 c14088v1, Object obj) {
            super(c13897n);
            this.f30736d = c14088v1;
            this.f30737e = obj;
        }

        @Override // kotlinx.coroutines.internal.AbstractC13877d
        /* renamed from: i */
        public Object mo2972g(C13897n c13897n) {
            if (this.f30736d.m3028U() == this.f30737e) {
                return null;
            }
            return C13896m.m3490a();
        }
    }

    public C14088v1(boolean z) {
        this._state = z ? C14105w1.f30761g : C14105w1.f30760f;
        this._parentHandle = null;
    }

    /* renamed from: A */
    private final Object m3060A(Object obj) {
        C13914y c13914y;
        Object m3034P0;
        C13914y c13914y2;
        do {
            Object m3028U = m3028U();
            if (!(m3028U instanceof InterfaceC13923k1) || ((m3028U instanceof C14091c) && ((C14091c) m3028U).m2987g())) {
                c13914y = C14105w1.f30755a;
                return c13914y;
            }
            m3034P0 = m3034P0(m3028U, new C13755b0(m3048H(obj), false, 2, null));
            c13914y2 = C14105w1.f30757c;
        } while (m3034P0 == c13914y2);
        return m3034P0;
    }

    /* renamed from: B */
    private final boolean m3058B(Throwable th) {
        if (mo3020d0()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        InterfaceC14038s m3029T = m3029T();
        return (m3029T == null || m3029T == C13750a2.f30191c) ? z : m3029T.mo3162b(th) || z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.j1] */
    /* renamed from: B0 */
    private final void m3057B0(C13749a1 c13749a1) {
        C14114z1 c14114z1 = new C14114z1();
        if (!c13749a1.isActive()) {
            c14114z1 = new C13918j1(c14114z1);
        }
        f30729c.compareAndSet(this, c13749a1, c14114z1);
    }

    /* renamed from: E */
    private final void m3053E(InterfaceC13923k1 interfaceC13923k1, Object obj) {
        InterfaceC14038s m3029T = m3029T();
        if (m3029T != null) {
            m3029T.mo2939i();
            m3047H0(C13750a2.f30191c);
        }
        C13755b0 c13755b0 = obj instanceof C13755b0 ? (C13755b0) obj : null;
        Throwable th = c13755b0 != null ? c13755b0.f30198a : null;
        if (interfaceC13923k1 instanceof AbstractC14069u1) {
            try {
                ((AbstractC14069u1) interfaceC13923k1).mo2993B(th);
                return;
            } catch (Throwable th2) {
                mo3024Y(new CompletionHandlerException("Exception in completion handler " + interfaceC13923k1 + " for " + this, th2));
                return;
            }
        }
        C14114z1 mo2934c = interfaceC13923k1.mo2934c();
        if (mo2934c == null) {
            return;
        }
        m3006s0(mo2934c, th);
    }

    /* renamed from: F0 */
    private final void m3051F0(AbstractC14069u1 abstractC14069u1) {
        abstractC14069u1.m3484l(new C14114z1());
        f30729c.compareAndSet(this, abstractC14069u1, abstractC14069u1.m3479r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public final void m3050G(C14091c c14091c, C14055t c14055t, Object obj) {
        if (C13952q0.m3345a()) {
            if (!(m3028U() == c14091c)) {
                throw new AssertionError();
            }
        }
        C14055t m3010q0 = m3010q0(c14055t);
        if (m3010q0 == null || !m3031R0(c14091c, m3010q0, obj)) {
            mo3003u(m3044K(c14091c, obj));
        }
    }

    /* renamed from: H */
    private final Throwable m3048H(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new JobCancellationException(mo3056C(), null, this) : th;
        } else if (obj != null) {
            return ((InterfaceC13763c2) obj).mo3059A0();
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    /* renamed from: I0 */
    private final int m3046I0(Object obj) {
        C13749a1 c13749a1;
        if (obj instanceof C13749a1) {
            if (((C13749a1) obj).isActive()) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30729c;
            c13749a1 = C14105w1.f30761g;
            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c13749a1)) {
                mo2942y0();
                return 1;
            }
            return -1;
        } else if (obj instanceof C13918j1) {
            if (f30729c.compareAndSet(this, obj, ((C13918j1) obj).mo2934c())) {
                mo2942y0();
                return 1;
            }
            return -1;
        } else {
            return 0;
        }
    }

    /* renamed from: J0 */
    private final String m3045J0(Object obj) {
        if (!(obj instanceof C14091c)) {
            return obj instanceof InterfaceC13923k1 ? ((InterfaceC13923k1) obj).isActive() ? "Active" : "New" : obj instanceof C13755b0 ? "Cancelled" : "Completed";
        }
        C14091c c14091c = (C14091c) obj;
        return c14091c.m2988f() ? "Cancelling" : c14091c.m2987g() ? "Completing" : "Active";
    }

    /* renamed from: K */
    private final Object m3044K(C14091c c14091c, Object obj) {
        boolean m2988f;
        Throwable m3038N;
        boolean z = true;
        if (C13952q0.m3345a()) {
            if (!(m3028U() == c14091c)) {
                throw new AssertionError();
            }
        }
        if (!C13952q0.m3345a() || (!c14091c.m2986h())) {
            if (!C13952q0.m3345a() || c14091c.m2987g()) {
                C13755b0 c13755b0 = obj instanceof C13755b0 ? (C13755b0) obj : null;
                Throwable th = c13755b0 == null ? null : c13755b0.f30198a;
                synchronized (c14091c) {
                    m2988f = c14091c.m2988f();
                    List<Throwable> m2985i = c14091c.m2985i(th);
                    m3038N = m3038N(c14091c, m2985i);
                    if (m3038N != null) {
                        m3005t(m3038N, m2985i);
                    }
                }
                if (m3038N != null && m3038N != th) {
                    obj = new C13755b0(m3038N, false, 2, null);
                }
                if (m3038N != null) {
                    if (!m3058B(m3038N) && !mo3026W(m3038N)) {
                        z = false;
                    }
                    if (z) {
                        if (obj == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                        }
                        ((C13755b0) obj).m3757b();
                    }
                }
                if (!m2988f) {
                    m3004t0(m3038N);
                }
                mo3000v0(obj);
                boolean compareAndSet = f30729c.compareAndSet(this, c14091c, C14105w1.m2951g(obj));
                if (!C13952q0.m3345a() || compareAndSet) {
                    m3053E(c14091c, obj);
                    return obj;
                }
                throw new AssertionError();
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    /* renamed from: L */
    private final C14055t m3042L(InterfaceC13923k1 interfaceC13923k1) {
        C14055t c14055t = interfaceC13923k1 instanceof C14055t ? (C14055t) interfaceC13923k1 : null;
        if (c14055t == null) {
            C14114z1 mo2934c = interfaceC13923k1.mo2934c();
            if (mo2934c == null) {
                return null;
            }
            return m3010q0(mo2934c);
        }
        return c14055t;
    }

    /* renamed from: L0 */
    public static /* synthetic */ CancellationException m3041L0(C14088v1 c14088v1, Throwable th, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return c14088v1.m3043K0(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    /* renamed from: M */
    private final Throwable m3040M(Object obj) {
        C13755b0 c13755b0 = obj instanceof C13755b0 ? (C13755b0) obj : null;
        if (c13755b0 == null) {
            return null;
        }
        return c13755b0.f30198a;
    }

    /* renamed from: N */
    private final Throwable m3038N(C14091c c14091c, List<? extends Throwable> list) {
        Object obj;
        boolean z;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (c14091c.m2988f()) {
                return new JobCancellationException(mo3056C(), null, this);
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 == th2 || !(th3 instanceof TimeoutCancellationException)) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    /* renamed from: N0 */
    private final boolean m3037N0(InterfaceC13923k1 interfaceC13923k1, Object obj) {
        if (C13952q0.m3345a()) {
            if (!((interfaceC13923k1 instanceof C13749a1) || (interfaceC13923k1 instanceof AbstractC14069u1))) {
                throw new AssertionError();
            }
        }
        if (!C13952q0.m3345a() || (!(obj instanceof C13755b0))) {
            if (f30729c.compareAndSet(this, interfaceC13923k1, C14105w1.m2951g(obj))) {
                m3004t0(null);
                mo3000v0(obj);
                m3053E(interfaceC13923k1, obj);
                return true;
            }
            return false;
        }
        throw new AssertionError();
    }

    /* renamed from: O0 */
    private final boolean m3036O0(InterfaceC13923k1 interfaceC13923k1, Throwable th) {
        if (!C13952q0.m3345a() || (!(interfaceC13923k1 instanceof C14091c))) {
            if (!C13952q0.m3345a() || interfaceC13923k1.isActive()) {
                C14114z1 m3030S = m3030S(interfaceC13923k1);
                if (m3030S == null) {
                    return false;
                }
                if (f30729c.compareAndSet(this, interfaceC13923k1, new C14091c(m3030S, false, th))) {
                    m3008r0(m3030S, th);
                    return true;
                }
                return false;
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    /* renamed from: P0 */
    private final Object m3034P0(Object obj, Object obj2) {
        C13914y c13914y;
        C13914y c13914y2;
        if (!(obj instanceof InterfaceC13923k1)) {
            c13914y2 = C14105w1.f30755a;
            return c13914y2;
        } else if (((obj instanceof C13749a1) || (obj instanceof AbstractC14069u1)) && !(obj instanceof C14055t) && !(obj2 instanceof C13755b0)) {
            if (m3037N0((InterfaceC13923k1) obj, obj2)) {
                return obj2;
            }
            c13914y = C14105w1.f30757c;
            return c13914y;
        } else {
            return m3032Q0((InterfaceC13923k1) obj, obj2);
        }
    }

    /* renamed from: Q0 */
    private final Object m3032Q0(InterfaceC13923k1 interfaceC13923k1, Object obj) {
        C13914y c13914y;
        C13914y c13914y2;
        C13914y c13914y3;
        C14114z1 m3030S = m3030S(interfaceC13923k1);
        if (m3030S == null) {
            c13914y3 = C14105w1.f30757c;
            return c13914y3;
        }
        C14091c c14091c = interfaceC13923k1 instanceof C14091c ? (C14091c) interfaceC13923k1 : null;
        if (c14091c == null) {
            c14091c = new C14091c(m3030S, false, null);
        }
        synchronized (c14091c) {
            if (c14091c.m2987g()) {
                c13914y2 = C14105w1.f30755a;
                return c13914y2;
            }
            c14091c.m2984j(true);
            if (c14091c != interfaceC13923k1 && !f30729c.compareAndSet(this, interfaceC13923k1, c14091c)) {
                c13914y = C14105w1.f30757c;
                return c13914y;
            }
            if (C13952q0.m3345a() && !(!c14091c.m2986h())) {
                throw new AssertionError();
            }
            boolean m2988f = c14091c.m2988f();
            C13755b0 c13755b0 = obj instanceof C13755b0 ? (C13755b0) obj : null;
            if (c13755b0 != null) {
                c14091c.m2992a(c13755b0.f30198a);
            }
            Throwable m2989e = true ^ m2988f ? c14091c.m2989e() : null;
            C13666w c13666w = C13666w.f30112a;
            if (m2989e != null) {
                m3008r0(m3030S, m2989e);
            }
            C14055t m3042L = m3042L(interfaceC13923k1);
            if (m3042L != null && m3031R0(c14091c, m3042L, obj)) {
                return C14105w1.f30756b;
            }
            return m3044K(c14091c, obj);
        }
    }

    /* renamed from: R0 */
    private final boolean m3031R0(C14091c c14091c, C14055t c14055t, Object obj) {
        while (InterfaceC13947p1.C13948a.m3350d(c14055t.f30657w, false, false, new C14090b(this, c14091c, c14055t, obj), 1, null) == C13750a2.f30191c) {
            c14055t = m3010q0(c14055t);
            if (c14055t == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: S */
    private final C14114z1 m3030S(InterfaceC13923k1 interfaceC13923k1) {
        C14114z1 mo2934c = interfaceC13923k1.mo2934c();
        if (mo2934c == null) {
            if (interfaceC13923k1 instanceof C13749a1) {
                return new C14114z1();
            }
            if (interfaceC13923k1 instanceof AbstractC14069u1) {
                m3051F0((AbstractC14069u1) interfaceC13923k1);
                return null;
            }
            throw new IllegalStateException(kotlin.e0.d.l.m("State should have list: ", interfaceC13923k1).toString());
        }
        return mo2934c;
    }

    /* renamed from: e0 */
    private final boolean m3019e0() {
        Object m3028U;
        do {
            m3028U = m3028U();
            if (!(m3028U instanceof InterfaceC13923k1)) {
                return false;
            }
        } while (m3046I0(m3028U) < 0);
        return true;
    }

    /* renamed from: h0 */
    private final Object m3018h0(InterfaceC11714d<? super C13666w> interfaceC11714d) {
        InterfaceC11714d m10388c;
        Object m10387d;
        Object m10387d2;
        m10388c = C11729c.m10388c(interfaceC11714d);
        C13935n c13935n = new C13935n(m10388c, 1);
        c13935n.m3393B();
        C13945p.m3356a(c13935n, mo3002u0(new C13816f2(c13935n)));
        Object m3363y = c13935n.m3363y();
        m10387d = C11734d.m10387d();
        if (m3363y == m10387d) {
            C11741h.m10374c(interfaceC11714d);
        }
        m10387d2 = C11734d.m10387d();
        return m3363y == m10387d2 ? m3363y : C13666w.f30112a;
    }

    /* renamed from: j0 */
    private final Object m3017j0(Object obj) {
        C13914y c13914y;
        C13914y c13914y2;
        C13914y c13914y3;
        C13914y c13914y4;
        C13914y c13914y5;
        C13914y c13914y6;
        Throwable th = null;
        while (true) {
            Object m3028U = m3028U();
            if (m3028U instanceof C14091c) {
                synchronized (m3028U) {
                    if (((C14091c) m3028U).m2986h()) {
                        c13914y2 = C14105w1.f30758d;
                        return c13914y2;
                    }
                    boolean m2988f = ((C14091c) m3028U).m2988f();
                    if (obj != null || !m2988f) {
                        if (th == null) {
                            th = m3048H(obj);
                        }
                        ((C14091c) m3028U).m2992a(th);
                    }
                    Throwable m2989e = m2988f ^ true ? ((C14091c) m3028U).m2989e() : null;
                    if (m2989e != null) {
                        m3008r0(((C14091c) m3028U).mo2934c(), m2989e);
                    }
                    c13914y = C14105w1.f30755a;
                    return c13914y;
                }
            } else if (!(m3028U instanceof InterfaceC13923k1)) {
                c13914y3 = C14105w1.f30758d;
                return c13914y3;
            } else {
                if (th == null) {
                    th = m3048H(obj);
                }
                InterfaceC13923k1 interfaceC13923k1 = (InterfaceC13923k1) m3028U;
                if (interfaceC13923k1.isActive()) {
                    if (m3036O0(interfaceC13923k1, th)) {
                        c13914y4 = C14105w1.f30755a;
                        return c13914y4;
                    }
                } else {
                    Object m3034P0 = m3034P0(m3028U, new C13755b0(th, false, 2, null));
                    c13914y5 = C14105w1.f30755a;
                    if (m3034P0 != c13914y5) {
                        c13914y6 = C14105w1.f30757c;
                        if (m3034P0 != c13914y6) {
                            return m3034P0;
                        }
                    } else {
                        throw new IllegalStateException(kotlin.e0.d.l.m("Cannot happen in ", m3028U).toString());
                    }
                }
            }
        }
    }

    /* renamed from: n0 */
    private final AbstractC14069u1 m3013n0(InterfaceC11767l<? super Throwable, C13666w> interfaceC11767l, boolean z) {
        if (z) {
            r0 = interfaceC11767l instanceof AbstractC13953q1 ? (AbstractC13953q1) interfaceC11767l : null;
            if (r0 == null) {
                r0 = new C13937n1(interfaceC11767l);
            }
        } else {
            AbstractC14069u1 abstractC14069u1 = interfaceC11767l instanceof AbstractC14069u1 ? (AbstractC14069u1) interfaceC11767l : null;
            if (abstractC14069u1 != null) {
                if (C13952q0.m3345a() && !(!(abstractC14069u1 instanceof AbstractC13953q1))) {
                    throw new AssertionError();
                }
                r0 = abstractC14069u1;
            }
            if (r0 == null) {
                r0 = new C13942o1(interfaceC11767l);
            }
        }
        r0.m3137D(this);
        return r0;
    }

    /* renamed from: q0 */
    private final C14055t m3010q0(C13897n c13897n) {
        while (c13897n.mo3475v()) {
            c13897n = c13897n.m3478s();
        }
        while (true) {
            c13897n = c13897n.m3479r();
            if (!c13897n.mo3475v()) {
                if (c13897n instanceof C14055t) {
                    return (C14055t) c13897n;
                }
                if (c13897n instanceof C14114z1) {
                    return null;
                }
            }
        }
    }

    /* renamed from: r0 */
    private final void m3008r0(C14114z1 c14114z1, Throwable th) {
        CompletionHandlerException completionHandlerException;
        m3004t0(th);
        CompletionHandlerException completionHandlerException2 = null;
        for (C13897n c13897n = (C13897n) c14114z1.m3480p(); !kotlin.e0.d.l.b(c13897n, c14114z1); c13897n = c13897n.m3479r()) {
            if (c13897n instanceof AbstractC13953q1) {
                AbstractC14069u1 abstractC14069u1 = (AbstractC14069u1) c13897n;
                try {
                    abstractC14069u1.mo2993B(th);
                } catch (Throwable th2) {
                    if (completionHandlerException2 == null) {
                        completionHandlerException = null;
                    } else {
                        C11709c.m10411a(completionHandlerException2, th2);
                        completionHandlerException = completionHandlerException2;
                    }
                    if (completionHandlerException == null) {
                        completionHandlerException2 = new CompletionHandlerException("Exception in completion handler " + abstractC14069u1 + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException2 != null) {
            mo3024Y(completionHandlerException2);
        }
        m3058B(th);
    }

    /* renamed from: s */
    private final boolean m3007s(Object obj, C14114z1 c14114z1, AbstractC14069u1 abstractC14069u1) {
        int m3488A;
        C14092d c14092d = new C14092d(abstractC14069u1, this, obj);
        do {
            m3488A = c14114z1.m3478s().m3488A(abstractC14069u1, c14114z1, c14092d);
            if (m3488A == 1) {
                return true;
            }
        } while (m3488A != 2);
        return false;
    }

    /* renamed from: s0 */
    private final void m3006s0(C14114z1 c14114z1, Throwable th) {
        CompletionHandlerException completionHandlerException;
        CompletionHandlerException completionHandlerException2 = null;
        for (C13897n c13897n = (C13897n) c14114z1.m3480p(); !kotlin.e0.d.l.b(c13897n, c14114z1); c13897n = c13897n.m3479r()) {
            if (c13897n instanceof AbstractC14069u1) {
                AbstractC14069u1 abstractC14069u1 = (AbstractC14069u1) c13897n;
                try {
                    abstractC14069u1.mo2993B(th);
                } catch (Throwable th2) {
                    if (completionHandlerException2 == null) {
                        completionHandlerException = null;
                    } else {
                        C11709c.m10411a(completionHandlerException2, th2);
                        completionHandlerException = completionHandlerException2;
                    }
                    if (completionHandlerException == null) {
                        completionHandlerException2 = new CompletionHandlerException("Exception in completion handler " + abstractC14069u1 + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException2 == null) {
            return;
        }
        mo3024Y(completionHandlerException2);
    }

    /* renamed from: t */
    private final void m3005t(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Throwable m3421n = !C13952q0.m3342d() ? th : C13913x.m3421n(th);
        for (Throwable th2 : list) {
            if (C13952q0.m3342d()) {
                th2 = C13913x.m3421n(th2);
            }
            if (th2 != th && th2 != m3421n && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                C11709c.m10411a(th, th2);
            }
        }
    }

    /* renamed from: w */
    private final Object m2999w(InterfaceC11714d<Object> interfaceC11714d) {
        InterfaceC11714d m10388c;
        Object m10387d;
        m10388c = C11729c.m10388c(interfaceC11714d);
        C14089a c14089a = new C14089a(m10388c, this);
        c14089a.m3393B();
        C13945p.m3356a(c14089a, mo3002u0(new C13812e2(c14089a)));
        Object m3363y = c14089a.m3363y();
        m10387d = C11734d.m10387d();
        if (m3363y == m10387d) {
            C11741h.m10374c(interfaceC11714d);
        }
        return m3363y;
    }

    @Override // kotlinx.coroutines.InterfaceC13763c2
    /* renamed from: A0 */
    public CancellationException mo3059A0() {
        Throwable th;
        Object m3028U = m3028U();
        if (m3028U instanceof C14091c) {
            th = ((C14091c) m3028U).m2989e();
        } else if (m3028U instanceof C13755b0) {
            th = ((C13755b0) m3028U).f30198a;
        } else if (m3028U instanceof InterfaceC13923k1) {
            throw new IllegalStateException(kotlin.e0.d.l.m("Cannot be cancelling child in this state: ", m3028U).toString());
        } else {
            th = null;
        }
        CancellationException cancellationException = th instanceof CancellationException ? th : null;
        return cancellationException == null ? new JobCancellationException(kotlin.e0.d.l.m("Parent job is ", m3045J0(m3028U)), th, this) : cancellationException;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C */
    public String mo3056C() {
        return "Job was cancelled";
    }

    @Override // kotlinx.coroutines.InterfaceC13947p1
    /* renamed from: C0 */
    public final boolean mo3055C0() {
        return !(m3028U() instanceof InterfaceC13923k1);
    }

    /* renamed from: D */
    public boolean mo3054D(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m2997y(th) && mo3033Q();
    }

    @Override // kotlinx.coroutines.InterfaceC13947p1
    /* renamed from: E0 */
    public final InterfaceC14038s mo3052E0(InterfaceC14067u interfaceC14067u) {
        return (InterfaceC14038s) InterfaceC13947p1.C13948a.m3350d(this, true, false, new C14055t(interfaceC14067u), 2, null);
    }

    /* renamed from: G0 */
    public final void m3049G0(AbstractC14069u1 abstractC14069u1) {
        Object m3028U;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C13749a1 c13749a1;
        do {
            m3028U = m3028U();
            if (!(m3028U instanceof AbstractC14069u1)) {
                if (!(m3028U instanceof InterfaceC13923k1) || ((InterfaceC13923k1) m3028U).mo2934c() == null) {
                    return;
                }
                abstractC14069u1.mo3474w();
                return;
            } else if (m3028U != abstractC14069u1) {
                return;
            } else {
                atomicReferenceFieldUpdater = f30729c;
                c13749a1 = C14105w1.f30761g;
            }
        } while (!atomicReferenceFieldUpdater.compareAndSet(this, m3028U, c13749a1));
    }

    /* renamed from: H0 */
    public final void m3047H0(InterfaceC14038s interfaceC14038s) {
        this._parentHandle = interfaceC14038s;
    }

    /* renamed from: K0 */
    protected final CancellationException m3043K0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = mo3056C();
            }
            cancellationException = new JobCancellationException(str, th, this);
        }
        return cancellationException;
    }

    /* renamed from: M0 */
    public final String m3039M0() {
        return mo3012p0() + '{' + m3045J0(m3028U()) + '}';
    }

    @Override // kotlinx.coroutines.InterfaceC13947p1
    /* renamed from: P */
    public final Object mo3035P(InterfaceC11714d<? super C13666w> interfaceC11714d) {
        Object m10387d;
        if (!m3019e0()) {
            C14040s1.m3183e(interfaceC11714d.getContext());
            return C13666w.f30112a;
        }
        Object m3018h0 = m3018h0(interfaceC11714d);
        m10387d = C11734d.m10387d();
        return m3018h0 == m10387d ? m3018h0 : C13666w.f30112a;
    }

    /* renamed from: Q */
    public boolean mo3033Q() {
        return true;
    }

    /* renamed from: R */
    public boolean mo2949R() {
        return false;
    }

    /* renamed from: T */
    public final InterfaceC14038s m3029T() {
        return (InterfaceC14038s) this._parentHandle;
    }

    /* renamed from: U */
    public final Object m3028U() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof AbstractC13910u)) {
                return obj;
            }
            ((AbstractC13910u) obj).mo3436c(this);
        }
    }

    @Override // kotlinx.coroutines.InterfaceC13947p1
    /* renamed from: V */
    public final InterfaceC14110y0 mo3027V(boolean z, boolean z2, InterfaceC11767l<? super Throwable, C13666w> interfaceC11767l) {
        AbstractC14069u1 m3013n0 = m3013n0(interfaceC11767l, z);
        while (true) {
            Object m3028U = m3028U();
            if (m3028U instanceof C13749a1) {
                C13749a1 c13749a1 = (C13749a1) m3028U;
                if (c13749a1.isActive()) {
                    if (f30729c.compareAndSet(this, m3028U, m3013n0)) {
                        return m3013n0;
                    }
                } else {
                    m3057B0(c13749a1);
                }
            } else {
                if (m3028U instanceof InterfaceC13923k1) {
                    C14114z1 mo2934c = ((InterfaceC13923k1) m3028U).mo2934c();
                    if (mo2934c != null) {
                        InterfaceC14110y0 interfaceC14110y0 = C13750a2.f30191c;
                        if (z && (m3028U instanceof C14091c)) {
                            synchronized (m3028U) {
                                r3 = ((C14091c) m3028U).m2989e();
                                if (r3 == null || ((interfaceC11767l instanceof C14055t) && !((C14091c) m3028U).m2987g())) {
                                    if (m3007s(m3028U, mo2934c, m3013n0)) {
                                        if (r3 == null) {
                                            return m3013n0;
                                        }
                                        interfaceC14110y0 = m3013n0;
                                    }
                                }
                                C13666w c13666w = C13666w.f30112a;
                            }
                        }
                        if (r3 != null) {
                            if (z2) {
                                interfaceC11767l.invoke(r3);
                            }
                            return interfaceC14110y0;
                        } else if (m3007s(m3028U, mo2934c, m3013n0)) {
                            return m3013n0;
                        }
                    } else if (m3028U == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    } else {
                        m3051F0((AbstractC14069u1) m3028U);
                    }
                } else {
                    if (z2) {
                        C13755b0 c13755b0 = m3028U instanceof C13755b0 ? (C13755b0) m3028U : null;
                        interfaceC11767l.invoke(c13755b0 != null ? c13755b0.f30198a : null);
                    }
                    return C13750a2.f30191c;
                }
            }
        }
    }

    /* renamed from: W */
    protected boolean mo3026W(Throwable th) {
        return false;
    }

    @Override // kotlinx.coroutines.InterfaceC13947p1
    /* renamed from: X */
    public final CancellationException mo3025X() {
        Object m3028U = m3028U();
        if (!(m3028U instanceof C14091c)) {
            if (m3028U instanceof InterfaceC13923k1) {
                throw new IllegalStateException(kotlin.e0.d.l.m("Job is still new or active: ", this).toString());
            }
            return m3028U instanceof C13755b0 ? m3041L0(this, ((C13755b0) m3028U).f30198a, null, 1, null) : new JobCancellationException(kotlin.e0.d.l.m(C14034r0.m3204a(this), " has completed normally"), null, this);
        }
        Throwable m2989e = ((C14091c) m3028U).m2989e();
        if (m2989e != null) {
            return m3043K0(m2989e, kotlin.e0.d.l.m(C14034r0.m3204a(this), " is cancelling"));
        }
        throw new IllegalStateException(kotlin.e0.d.l.m("Job is still new or active: ", this).toString());
    }

    /* renamed from: Y */
    public void mo3024Y(Throwable th) {
        throw th;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a0 */
    public final void m3023a0(InterfaceC13947p1 interfaceC13947p1) {
        if (C13952q0.m3345a()) {
            if (!(m3029T() == null)) {
                throw new AssertionError();
            }
        }
        if (interfaceC13947p1 == null) {
            m3047H0(C13750a2.f30191c);
            return;
        }
        interfaceC13947p1.start();
        InterfaceC14038s mo3052E0 = interfaceC13947p1.mo3052E0(this);
        m3047H0(mo3052E0);
        if (mo3055C0()) {
            mo3052E0.mo2939i();
            m3047H0(C13750a2.f30191c);
        }
    }

    @Override // kotlinx.coroutines.InterfaceC14067u
    /* renamed from: b0 */
    public final void mo3022b0(InterfaceC13763c2 interfaceC13763c2) {
        m2997y(interfaceC13763c2);
    }

    /* renamed from: c0 */
    public final boolean m3021c0() {
        Object m3028U = m3028U();
        return (m3028U instanceof C13755b0) || ((m3028U instanceof C14091c) && ((C14091c) m3028U).m2988f());
    }

    /* renamed from: d0 */
    protected boolean mo3020d0() {
        return false;
    }

    @Override // kotlin.p476c0.InterfaceC11719g
    public <R> R fold(R r, InterfaceC11771p<? super R, ? super InterfaceC11719g.InterfaceC11722b, ? extends R> interfaceC11771p) {
        return (R) InterfaceC13947p1.C13948a.m3352b(this, r, interfaceC11771p);
    }

    @Override // kotlin.p476c0.InterfaceC11719g.InterfaceC11722b, kotlin.p476c0.InterfaceC11719g
    public <E extends InterfaceC11719g.InterfaceC11722b> E get(InterfaceC11719g.InterfaceC11724c<E> interfaceC11724c) {
        return (E) InterfaceC13947p1.C13948a.m3351c(this, interfaceC11724c);
    }

    @Override // kotlin.p476c0.InterfaceC11719g.InterfaceC11722b
    public final InterfaceC11719g.InterfaceC11724c<?> getKey() {
        return InterfaceC13947p1.f30435u;
    }

    @Override // kotlinx.coroutines.InterfaceC13947p1
    public boolean isActive() {
        Object m3028U = m3028U();
        return (m3028U instanceof InterfaceC13923k1) && ((InterfaceC13923k1) m3028U).isActive();
    }

    /* renamed from: l0 */
    public final boolean m3016l0(Object obj) {
        Object m3034P0;
        C13914y c13914y;
        C13914y c13914y2;
        do {
            m3034P0 = m3034P0(m3028U(), obj);
            c13914y = C14105w1.f30755a;
            if (m3034P0 == c13914y) {
                return false;
            }
            if (m3034P0 == C14105w1.f30756b) {
                return true;
            }
            c13914y2 = C14105w1.f30757c;
        } while (m3034P0 == c13914y2);
        mo3003u(m3034P0);
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC13947p1, kotlinx.coroutines.channels.InterfaceC13797t
    /* renamed from: m */
    public void mo3015m(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo3056C(), null, this);
        }
        mo2996z(cancellationException);
    }

    /* renamed from: m0 */
    public final Object m3014m0(Object obj) {
        Object m3034P0;
        C13914y c13914y;
        C13914y c13914y2;
        do {
            m3034P0 = m3034P0(m3028U(), obj);
            c13914y = C14105w1.f30755a;
            if (m3034P0 != c13914y) {
                c13914y2 = C14105w1.f30757c;
            } else {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, m3040M(obj));
            }
        } while (m3034P0 == c13914y2);
        return m3034P0;
    }

    @Override // kotlin.p476c0.InterfaceC11719g
    public InterfaceC11719g minusKey(InterfaceC11719g.InterfaceC11724c<?> interfaceC11724c) {
        return InterfaceC13947p1.C13948a.m3349e(this, interfaceC11724c);
    }

    /* renamed from: p0 */
    public String mo3012p0() {
        return C14034r0.m3204a(this);
    }

    @Override // kotlin.p476c0.InterfaceC11719g
    public InterfaceC11719g plus(InterfaceC11719g interfaceC11719g) {
        return InterfaceC13947p1.C13948a.m3348f(this, interfaceC11719g);
    }

    @Override // kotlinx.coroutines.InterfaceC13947p1
    public final boolean start() {
        int m3046I0;
        do {
            m3046I0 = m3046I0(m3028U());
            if (m3046I0 == 0) {
                return false;
            }
        } while (m3046I0 != 1);
        return true;
    }

    /* renamed from: t0 */
    protected void m3004t0(Throwable th) {
    }

    public String toString() {
        return m3039M0() + '@' + C14034r0.m3203b(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public void mo3003u(Object obj) {
    }

    @Override // kotlinx.coroutines.InterfaceC13947p1
    /* renamed from: u0 */
    public final InterfaceC14110y0 mo3002u0(InterfaceC11767l<? super Throwable, C13666w> interfaceC11767l) {
        return mo3027V(false, true, interfaceC11767l);
    }

    /* renamed from: v */
    public final Object m3001v(InterfaceC11714d<Object> interfaceC11714d) {
        Object m3028U;
        do {
            m3028U = m3028U();
            if (!(m3028U instanceof InterfaceC13923k1)) {
                if (m3028U instanceof C13755b0) {
                    Throwable th = ((C13755b0) m3028U).f30198a;
                    if (C13952q0.m3342d()) {
                        if (interfaceC11714d instanceof InterfaceC11739e) {
                            throw C13913x.m3434a(th, (InterfaceC11739e) interfaceC11714d);
                        }
                        throw th;
                    }
                    throw th;
                }
                return C14105w1.m2950h(m3028U);
            }
        } while (m3046I0(m3028U) < 0);
        return m2999w(interfaceC11714d);
    }

    /* renamed from: v0 */
    protected void mo3000v0(Object obj) {
    }

    /* renamed from: x */
    public final boolean m2998x(Throwable th) {
        return m2997y(th);
    }

    /* renamed from: y */
    public final boolean m2997y(Object obj) {
        Object obj2;
        C13914y c13914y;
        C13914y c13914y2;
        C13914y c13914y3;
        obj2 = C14105w1.f30755a;
        if (mo2949R() && (obj2 = m3060A(obj)) == C14105w1.f30756b) {
            return true;
        }
        c13914y = C14105w1.f30755a;
        if (obj2 == c13914y) {
            obj2 = m3017j0(obj);
        }
        c13914y2 = C14105w1.f30755a;
        if (obj2 == c13914y2 || obj2 == C14105w1.f30756b) {
            return true;
        }
        c13914y3 = C14105w1.f30758d;
        if (obj2 == c13914y3) {
            return false;
        }
        mo3003u(obj2);
        return true;
    }

    /* renamed from: y0 */
    protected void mo2942y0() {
    }

    /* renamed from: z */
    public void mo2996z(Throwable th) {
        m2997y(th);
    }
}

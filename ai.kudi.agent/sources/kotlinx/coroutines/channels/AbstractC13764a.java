package kotlinx.coroutines.channels;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.C13288p;
import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11729c;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11738d;
import kotlin.p476c0.p478k.p479a.C11736b;
import kotlin.p476c0.p478k.p479a.C11741h;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlinx.coroutines.AbstractC13852g;
import kotlinx.coroutines.C13935n;
import kotlinx.coroutines.C13939o;
import kotlinx.coroutines.C13945p;
import kotlinx.coroutines.C13952q0;
import kotlinx.coroutines.C14034r0;
import kotlinx.coroutines.InterfaceC13930m;
import kotlinx.coroutines.internal.C13894k;
import kotlinx.coroutines.internal.C13895l;
import kotlinx.coroutines.internal.C13896m;
import kotlinx.coroutines.internal.C13897n;
import kotlinx.coroutines.internal.C13908t;
import kotlinx.coroutines.internal.C13913x;
import kotlinx.coroutines.internal.C13914y;
/* compiled from: AbstractChannel.kt */
/* renamed from: kotlinx.coroutines.channels.a */
/* loaded from: classes3.dex */
public abstract class AbstractC13764a<E> extends AbstractC13773c<E> implements InterfaceC13779f<E> {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractChannel.kt */
    /* renamed from: kotlinx.coroutines.channels.a$a */
    /* loaded from: classes3.dex */
    public static final class C13765a<E> implements InterfaceC13782h<E> {

        /* renamed from: a */
        public final AbstractC13764a<E> f30211a;

        /* renamed from: b */
        private Object f30212b = C13772b.f30227d;

        public C13765a(AbstractC13764a<E> abstractC13764a) {
            this.f30211a = abstractC13764a;
        }

        /* renamed from: c */
        private final boolean m3720c(Object obj) {
            if (obj instanceof C13790m) {
                C13790m c13790m = (C13790m) obj;
                if (c13790m.f30253f == null) {
                    return false;
                }
                throw C13913x.m3424k(c13790m.m3667I());
            }
            return true;
        }

        /* renamed from: d */
        private final Object m3719d(InterfaceC11714d<? super Boolean> interfaceC11714d) {
            InterfaceC11714d m10388c;
            Object m10387d;
            m10388c = C11729c.m10388c(interfaceC11714d);
            C13935n m3355b = C13945p.m3355b(m10388c);
            C13768d c13768d = new C13768d(this, m3355b);
            while (true) {
                if (this.f30211a.m3726E(c13768d)) {
                    this.f30211a.m3722Q(m3355b, c13768d);
                    break;
                }
                Object mo3663O = this.f30211a.mo3663O();
                m3718e(mo3663O);
                if (mo3663O instanceof C13790m) {
                    C13790m c13790m = (C13790m) mo3663O;
                    if (c13790m.f30253f == null) {
                        Boolean m10382a = C11736b.m10382a(false);
                        C13288p.C13289a c13289a = C13288p.f29444c;
                        C13288p.m5362a(m10382a);
                        m3355b.resumeWith(m10382a);
                    } else {
                        Throwable m3667I = c13790m.m3667I();
                        C13288p.C13289a c13289a2 = C13288p.f29444c;
                        Object m5358a = C13291q.m5358a(m3667I);
                        C13288p.m5362a(m5358a);
                        m3355b.resumeWith(m5358a);
                    }
                } else if (mo3663O != C13772b.f30227d) {
                    Boolean m10382a2 = C11736b.m10382a(true);
                    InterfaceC11767l<E, C13666w> interfaceC11767l = this.f30211a.f30231c;
                    m3355b.mo3373n(m10382a2, interfaceC11767l == null ? null : C13908t.m3442a(interfaceC11767l, mo3663O, m3355b.getContext()));
                }
            }
            Object m3363y = m3355b.m3363y();
            m10387d = C11734d.m10387d();
            if (m3363y == m10387d) {
                C11741h.m10374c(interfaceC11714d);
            }
            return m3363y;
        }

        @Override // kotlinx.coroutines.channels.InterfaceC13782h
        /* renamed from: a */
        public Object mo3688a(InterfaceC11714d<? super Boolean> interfaceC11714d) {
            if (m3721b() != C13772b.f30227d) {
                return C11736b.m10382a(m3720c(m3721b()));
            }
            m3718e(this.f30211a.mo3663O());
            return m3721b() != C13772b.f30227d ? C11736b.m10382a(m3720c(m3721b())) : m3719d(interfaceC11714d);
        }

        /* renamed from: b */
        public final Object m3721b() {
            return this.f30212b;
        }

        /* renamed from: e */
        public final void m3718e(Object obj) {
            this.f30212b = obj;
        }

        @Override // kotlinx.coroutines.channels.InterfaceC13782h
        public E next() {
            E e = (E) this.f30212b;
            if (!(e instanceof C13790m)) {
                C13914y c13914y = C13772b.f30227d;
                if (e != c13914y) {
                    this.f30212b = c13914y;
                    return e;
                }
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            throw C13913x.m3424k(((C13790m) e).m3667I());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractChannel.kt */
    /* renamed from: kotlinx.coroutines.channels.a$b */
    /* loaded from: classes3.dex */
    public static class C13766b<E> extends AbstractC13796s<E> {

        /* renamed from: f */
        public final InterfaceC13930m<Object> f30213f;

        /* renamed from: w */
        public final int f30214w;

        public C13766b(InterfaceC13930m<Object> interfaceC13930m, int i) {
            this.f30213f = interfaceC13930m;
            this.f30214w = i;
        }

        @Override // kotlinx.coroutines.channels.AbstractC13796s
        /* renamed from: D */
        public void mo3650D(C13790m<?> c13790m) {
            if (this.f30214w == 1) {
                InterfaceC13930m<Object> interfaceC13930m = this.f30213f;
                C13784j m3684b = C13784j.m3684b(C13784j.f30249b.m3674a(c13790m.f30253f));
                C13288p.C13289a c13289a = C13288p.f29444c;
                C13288p.m5362a(m3684b);
                interfaceC13930m.resumeWith(m3684b);
                return;
            }
            InterfaceC13930m<Object> interfaceC13930m2 = this.f30213f;
            Throwable m3667I = c13790m.m3667I();
            C13288p.C13289a c13289a2 = C13288p.f29444c;
            Object m5358a = C13291q.m5358a(m3667I);
            C13288p.m5362a(m5358a);
            interfaceC13930m2.resumeWith(m5358a);
        }

        /* renamed from: E */
        public final Object m3717E(E e) {
            if (this.f30214w == 1) {
                C13784j.f30249b.m3672c(e);
                return C13784j.m3684b(e);
            }
            return e;
        }

        @Override // kotlinx.coroutines.channels.InterfaceC13798u
        /* renamed from: e */
        public void mo3647e(E e) {
            this.f30213f.mo3371p(C13939o.f30425a);
        }

        @Override // kotlinx.coroutines.channels.InterfaceC13798u
        /* renamed from: f */
        public C13914y mo3646f(E e, C13897n.C13900c c13900c) {
            Object mo3375l = this.f30213f.mo3375l(m3717E(e), c13900c == null ? null : c13900c.f30380a, mo3651C(e));
            if (mo3375l == null) {
                return null;
            }
            if (C13952q0.m3345a()) {
                if (!(mo3375l == C13939o.f30425a)) {
                    throw new AssertionError();
                }
            }
            if (c13900c == null) {
                return C13939o.f30425a;
            }
            c13900c.m3469d();
            throw null;
        }

        @Override // kotlinx.coroutines.internal.C13897n
        public String toString() {
            return "ReceiveElement@" + C14034r0.m3203b(this) + "[receiveMode=" + this.f30214w + ']';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractChannel.kt */
    /* renamed from: kotlinx.coroutines.channels.a$c */
    /* loaded from: classes3.dex */
    public static final class C13767c<E> extends C13766b<E> {

        /* renamed from: x */
        public final InterfaceC11767l<E, C13666w> f30215x;

        /* JADX WARN: Multi-variable type inference failed */
        public C13767c(InterfaceC13930m<Object> interfaceC13930m, int i, InterfaceC11767l<? super E, C13666w> interfaceC11767l) {
            super(interfaceC13930m, i);
            this.f30215x = interfaceC11767l;
        }

        @Override // kotlinx.coroutines.channels.AbstractC13796s
        /* renamed from: C */
        public InterfaceC11767l<Throwable, C13666w> mo3651C(E e) {
            return C13908t.m3442a(this.f30215x, e, this.f30213f.getContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractChannel.kt */
    /* renamed from: kotlinx.coroutines.channels.a$d */
    /* loaded from: classes3.dex */
    public static class C13768d<E> extends AbstractC13796s<E> {

        /* renamed from: f */
        public final C13765a<E> f30216f;

        /* renamed from: w */
        public final InterfaceC13930m<Boolean> f30217w;

        /* JADX WARN: Multi-variable type inference failed */
        public C13768d(C13765a<E> c13765a, InterfaceC13930m<? super Boolean> interfaceC13930m) {
            this.f30216f = c13765a;
            this.f30217w = interfaceC13930m;
        }

        @Override // kotlinx.coroutines.channels.AbstractC13796s
        /* renamed from: C */
        public InterfaceC11767l<Throwable, C13666w> mo3651C(E e) {
            InterfaceC11767l<E, C13666w> interfaceC11767l = this.f30216f.f30211a.f30231c;
            if (interfaceC11767l == null) {
                return null;
            }
            return C13908t.m3442a(interfaceC11767l, e, this.f30217w.getContext());
        }

        @Override // kotlinx.coroutines.channels.AbstractC13796s
        /* renamed from: D */
        public void mo3650D(C13790m<?> c13790m) {
            Object mo3376j;
            if (c13790m.f30253f == null) {
                mo3376j = InterfaceC13930m.C13931a.m3398a(this.f30217w, Boolean.FALSE, null, 2, null);
            } else {
                mo3376j = this.f30217w.mo3376j(c13790m.m3667I());
            }
            if (mo3376j != null) {
                this.f30216f.m3718e(c13790m);
                this.f30217w.mo3371p(mo3376j);
            }
        }

        @Override // kotlinx.coroutines.channels.InterfaceC13798u
        /* renamed from: e */
        public void mo3647e(E e) {
            this.f30216f.m3718e(e);
            this.f30217w.mo3371p(C13939o.f30425a);
        }

        @Override // kotlinx.coroutines.channels.InterfaceC13798u
        /* renamed from: f */
        public C13914y mo3646f(E e, C13897n.C13900c c13900c) {
            Object mo3375l = this.f30217w.mo3375l(Boolean.TRUE, c13900c == null ? null : c13900c.f30380a, mo3651C(e));
            if (mo3375l == null) {
                return null;
            }
            if (C13952q0.m3345a()) {
                if (!(mo3375l == C13939o.f30425a)) {
                    throw new AssertionError();
                }
            }
            if (c13900c == null) {
                return C13939o.f30425a;
            }
            c13900c.m3469d();
            throw null;
        }

        @Override // kotlinx.coroutines.internal.C13897n
        public String toString() {
            return kotlin.e0.d.l.m("ReceiveHasNext@", C14034r0.m3203b(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractChannel.kt */
    /* renamed from: kotlinx.coroutines.channels.a$e */
    /* loaded from: classes3.dex */
    public final class C13769e extends AbstractC13852g {

        /* renamed from: c */
        private final AbstractC13796s<?> f30218c;

        public C13769e(AbstractC13796s<?> abstractC13796s) {
            this.f30218c = abstractC13796s;
        }

        @Override // kotlinx.coroutines.AbstractC13925l
        /* renamed from: a */
        public void mo2936a(Throwable th) {
            if (this.f30218c.mo3474w()) {
                AbstractC13764a.this.m3725M();
            }
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ C13666w invoke(Throwable th) {
            mo2936a(th);
            return C13666w.f30112a;
        }

        public String toString() {
            return "RemoveReceiveOnCancel[" + this.f30218c + ']';
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    /* renamed from: kotlinx.coroutines.channels.a$f */
    /* loaded from: classes3.dex */
    public static final class C13770f extends C13897n.AbstractC13899b {

        /* renamed from: d */
        final /* synthetic */ AbstractC13764a f30220d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13770f(C13897n c13897n, AbstractC13764a abstractC13764a) {
            super(c13897n);
            this.f30220d = abstractC13764a;
        }

        @Override // kotlinx.coroutines.internal.AbstractC13877d
        /* renamed from: i */
        public Object mo2972g(C13897n c13897n) {
            if (this.f30220d.mo3644H()) {
                return null;
            }
            return C13896m.m3490a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AbstractChannel.kt */
    @kotlin.c0.k.a.f(c = "kotlinx.coroutines.channels.AbstractChannel", f = "AbstractChannel.kt", l = {633}, m = "receiveCatching-JP2dKIU")
    /* renamed from: kotlinx.coroutines.channels.a$g */
    /* loaded from: classes3.dex */
    public static final class C13771g extends AbstractC11738d {

        /* renamed from: c */
        /* synthetic */ Object f30221c;

        /* renamed from: d */
        final /* synthetic */ AbstractC13764a<E> f30222d;

        /* renamed from: e */
        int f30223e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13771g(AbstractC13764a<E> abstractC13764a, InterfaceC11714d<? super C13771g> interfaceC11714d) {
            super(interfaceC11714d);
            this.f30222d = abstractC13764a;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            this.f30221c = obj;
            this.f30223e |= Integer.MIN_VALUE;
            Object mo3649d = this.f30222d.mo3649d(this);
            m10387d = C11734d.m10387d();
            return mo3649d == m10387d ? mo3649d : C13784j.m3684b(mo3649d);
        }
    }

    public AbstractC13764a(InterfaceC11767l<? super E, C13666w> interfaceC11767l) {
        super(interfaceC11767l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public final boolean m3726E(AbstractC13796s<? super E> abstractC13796s) {
        boolean mo3665F = mo3665F(abstractC13796s);
        if (mo3665F) {
            m3724N();
        }
        return mo3665F;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlinx.coroutines.channels.a$b] */
    /* renamed from: P */
    private final <R> Object m3723P(int i, InterfaceC11714d<? super R> interfaceC11714d) {
        InterfaceC11714d m10388c;
        C13767c c13767c;
        Object m10387d;
        m10388c = C11729c.m10388c(interfaceC11714d);
        C13935n m3355b = C13945p.m3355b(m10388c);
        if (this.f30231c == null) {
            c13767c = new C13766b(m3355b, i);
        } else {
            c13767c = new C13767c(m3355b, i, this.f30231c);
        }
        while (true) {
            if (m3726E(c13767c)) {
                m3722Q(m3355b, c13767c);
                break;
            }
            Object mo3663O = mo3663O();
            if (mo3663O instanceof C13790m) {
                c13767c.mo3650D((C13790m) mo3663O);
                break;
            } else if (mo3663O != C13772b.f30227d) {
                m3355b.mo3373n(c13767c.m3717E(mo3663O), c13767c.mo3651C(mo3663O));
                break;
            }
        }
        Object m3363y = m3355b.m3363y();
        m10387d = C11734d.m10387d();
        if (m3363y == m10387d) {
            C11741h.m10374c(interfaceC11714d);
        }
        return m3363y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public final void m3722Q(InterfaceC13930m<?> interfaceC13930m, AbstractC13796s<?> abstractC13796s) {
        interfaceC13930m.mo3377i(new C13769e(abstractC13796s));
    }

    /* renamed from: D */
    public final boolean m3727D(Throwable th) {
        boolean mo3641f = mo3641f(th);
        mo3664K(mo3641f);
        return mo3641f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: F */
    public boolean mo3665F(AbstractC13796s<? super E> abstractC13796s) {
        int m3488A;
        C13897n m3478s;
        if (mo3645G()) {
            C13897n m3709j = m3709j();
            do {
                m3478s = m3709j.m3478s();
                if (!(!(m3478s instanceof AbstractC13800w))) {
                    return false;
                }
            } while (!m3478s.m3485j(abstractC13796s, m3709j));
        } else {
            C13897n m3709j2 = m3709j();
            C13770f c13770f = new C13770f(abstractC13796s, this);
            do {
                C13897n m3478s2 = m3709j2.m3478s();
                if (!(!(m3478s2 instanceof AbstractC13800w))) {
                    return false;
                }
                m3488A = m3478s2.m3488A(abstractC13796s, m3709j2, c13770f);
                if (m3488A != 1) {
                }
            } while (m3488A != 2);
            return false;
        }
        return true;
    }

    /* renamed from: G */
    protected abstract boolean mo3645G();

    /* renamed from: H */
    protected abstract boolean mo3644H();

    /* renamed from: J */
    public boolean mo3697J() {
        return m3711h() != null && mo3644H();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K */
    public void mo3664K(boolean z) {
        C13790m<?> m3710i = m3710i();
        if (m3710i != null) {
            Object m3493b = C13894k.m3493b(null, 1, null);
            while (true) {
                C13897n m3478s = m3710i.m3478s();
                if (m3478s instanceof C13895l) {
                    mo3660L(m3493b, m3710i);
                    return;
                } else if (C13952q0.m3345a() && !(m3478s instanceof AbstractC13800w)) {
                    throw new AssertionError();
                } else {
                    if (!m3478s.mo3474w()) {
                        m3478s.m3477t();
                    } else {
                        m3493b = C13894k.m3492c(m3493b, (AbstractC13800w) m3478s);
                    }
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen".toString());
        }
    }

    /* renamed from: L */
    protected void mo3660L(Object obj, C13790m<?> c13790m) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            ((AbstractC13800w) obj).mo3635D(c13790m);
        } else if (obj != null) {
            ArrayList arrayList = (ArrayList) obj;
            int size = arrayList.size() - 1;
            if (size < 0) {
                return;
            }
            while (true) {
                int i = size - 1;
                ((AbstractC13800w) arrayList.get(size)).mo3635D(c13790m);
                if (i < 0) {
                    return;
                }
                size = i;
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
        }
    }

    /* renamed from: M */
    protected void m3725M() {
    }

    /* renamed from: N */
    protected void m3724N() {
    }

    /* renamed from: O */
    protected Object mo3663O() {
        while (true) {
            AbstractC13800w m3715A = m3715A();
            if (m3715A == null) {
                return C13772b.f30227d;
            }
            C13914y mo3634E = m3715A.mo3634E(null);
            if (mo3634E != null) {
                if (C13952q0.m3345a()) {
                    if (!(mo3634E == C13939o.f30425a)) {
                        throw new AssertionError();
                    }
                }
                m3715A.mo3637B();
                return m3715A.mo3636C();
            }
            m3715A.mo3633F();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // kotlinx.coroutines.channels.InterfaceC13797t
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo3649d(kotlin.p476c0.InterfaceC11714d<? super kotlinx.coroutines.channels.C13784j<? extends E>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.AbstractC13764a.C13771g
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.channels.a$g r0 = (kotlinx.coroutines.channels.AbstractC13764a.C13771g) r0
            int r1 = r0.f30223e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30223e = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.a$g r0 = new kotlinx.coroutines.channels.a$g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f30221c
            java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
            int r2 = r0.f30223e
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C13291q.m5357b(r5)
            goto L5a
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.C13291q.m5357b(r5)
            java.lang.Object r5 = r4.mo3663O()
            kotlinx.coroutines.internal.y r2 = kotlinx.coroutines.channels.C13772b.f30227d
            if (r5 == r2) goto L51
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.C13790m
            if (r0 == 0) goto L4b
            kotlinx.coroutines.channels.j$b r0 = kotlinx.coroutines.channels.C13784j.f30249b
            kotlinx.coroutines.channels.m r5 = (kotlinx.coroutines.channels.C13790m) r5
            java.lang.Throwable r5 = r5.f30253f
            java.lang.Object r5 = r0.m3674a(r5)
            goto L50
        L4b:
            kotlinx.coroutines.channels.j$b r0 = kotlinx.coroutines.channels.C13784j.f30249b
            r0.m3672c(r5)
        L50:
            return r5
        L51:
            r0.f30223e = r3
            java.lang.Object r5 = r4.m3723P(r3, r0)
            if (r5 != r1) goto L5a
            return r1
        L5a:
            kotlinx.coroutines.channels.j r5 = (kotlinx.coroutines.channels.C13784j) r5
            java.lang.Object r5 = r5.m3675k()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.AbstractC13764a.mo3649d(kotlin.c0.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.InterfaceC13797t
    public final InterfaceC13782h<E> iterator() {
        return new C13765a(this);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC13797t
    /* renamed from: m */
    public final void mo3015m(CancellationException cancellationException) {
        if (mo3697J()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new CancellationException(kotlin.e0.d.l.m(C14034r0.m3204a(this), " was cancelled"));
        }
        m3727D(cancellationException);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractC13773c
    /* renamed from: z */
    public InterfaceC13798u<E> mo3699z() {
        InterfaceC13798u<E> mo3699z = super.mo3699z();
        if (mo3699z != null && !(mo3699z instanceof C13790m)) {
            m3725M();
        }
        return mo3699z;
    }
}

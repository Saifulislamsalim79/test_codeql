package kotlinx.coroutines.channels;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C11709c;
import kotlin.C13288p;
import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.C11782b0;
import kotlinx.coroutines.C13939o;
import kotlinx.coroutines.C13952q0;
import kotlinx.coroutines.C14034r0;
import kotlinx.coroutines.channels.C13784j;
import kotlinx.coroutines.internal.C13894k;
import kotlinx.coroutines.internal.C13895l;
import kotlinx.coroutines.internal.C13896m;
import kotlinx.coroutines.internal.C13897n;
import kotlinx.coroutines.internal.C13908t;
import kotlinx.coroutines.internal.C13914y;
import kotlinx.coroutines.internal.UndeliveredElementException;
/* compiled from: AbstractChannel.kt */
/* renamed from: kotlinx.coroutines.channels.c */
/* loaded from: classes3.dex */
public abstract class AbstractC13773c<E> implements InterfaceC13801x<E> {

    /* renamed from: e */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f30230e = AtomicReferenceFieldUpdater.newUpdater(AbstractC13773c.class, Object.class, "onCloseHandler");

    /* renamed from: c */
    protected final InterfaceC11767l<E, C13666w> f30231c;

    /* renamed from: d */
    private final C13895l f30232d = new C13895l();
    private volatile /* synthetic */ Object onCloseHandler = null;

    /* compiled from: AbstractChannel.kt */
    /* renamed from: kotlinx.coroutines.channels.c$a */
    /* loaded from: classes3.dex */
    public static final class C13774a<E> extends AbstractC13800w {

        /* renamed from: f */
        public final E f30233f;

        public C13774a(E e) {
            this.f30233f = e;
        }

        @Override // kotlinx.coroutines.channels.AbstractC13800w
        /* renamed from: B */
        public void mo3637B() {
        }

        @Override // kotlinx.coroutines.channels.AbstractC13800w
        /* renamed from: C */
        public Object mo3636C() {
            return this.f30233f;
        }

        @Override // kotlinx.coroutines.channels.AbstractC13800w
        /* renamed from: D */
        public void mo3635D(C13790m<?> c13790m) {
            if (C13952q0.m3345a()) {
                throw new AssertionError();
            }
        }

        @Override // kotlinx.coroutines.channels.AbstractC13800w
        /* renamed from: E */
        public C13914y mo3634E(C13897n.C13900c c13900c) {
            C13914y c13914y = C13939o.f30425a;
            if (c13900c == null) {
                return c13914y;
            }
            c13900c.m3469d();
            throw null;
        }

        @Override // kotlinx.coroutines.internal.C13897n
        public String toString() {
            return "SendBuffered@" + C14034r0.m3203b(this) + '(' + this.f30233f + ')';
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    /* renamed from: kotlinx.coroutines.channels.c$b */
    /* loaded from: classes3.dex */
    public static final class C13775b extends C13897n.AbstractC13899b {

        /* renamed from: d */
        final /* synthetic */ AbstractC13773c f30234d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13775b(C13897n c13897n, AbstractC13773c abstractC13773c) {
            super(c13897n);
            this.f30234d = abstractC13773c;
        }

        @Override // kotlinx.coroutines.internal.AbstractC13877d
        /* renamed from: i */
        public Object mo2972g(C13897n c13897n) {
            if (this.f30234d.mo3642t()) {
                return null;
            }
            return C13896m.m3490a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC13773c(InterfaceC11767l<? super E, C13666w> interfaceC11767l) {
        this.f30231c = interfaceC11767l;
    }

    /* renamed from: c */
    private final int m3712c() {
        C13895l c13895l = this.f30232d;
        int i = 0;
        for (C13897n c13897n = (C13897n) c13895l.m3480p(); !kotlin.e0.d.l.b(c13897n, c13895l); c13897n = c13897n.m3479r()) {
            if (c13897n instanceof C13897n) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: l */
    private final String m3708l() {
        String m;
        C13897n m3479r = this.f30232d.m3479r();
        if (m3479r == this.f30232d) {
            return "EmptyQueue";
        }
        if (m3479r instanceof C13790m) {
            m = m3479r.toString();
        } else if (m3479r instanceof AbstractC13796s) {
            m = "ReceiveQueued";
        } else {
            m = m3479r instanceof AbstractC13800w ? "SendQueued" : kotlin.e0.d.l.m("UNEXPECTED:", m3479r);
        }
        C13897n m3478s = this.f30232d.m3478s();
        if (m3478s != m3479r) {
            String str = m + ",queueSize=" + m3712c();
            if (m3478s instanceof C13790m) {
                return str + ",closedForSend=" + m3478s;
            }
            return str;
        }
        return m;
    }

    /* renamed from: n */
    private final void m3707n(C13790m<?> c13790m) {
        Object m3493b = C13894k.m3493b(null, 1, null);
        while (true) {
            C13897n m3478s = c13790m.m3478s();
            AbstractC13796s abstractC13796s = m3478s instanceof AbstractC13796s ? (AbstractC13796s) m3478s : null;
            if (abstractC13796s == null) {
                break;
            } else if (!abstractC13796s.mo3474w()) {
                abstractC13796s.m3477t();
            } else {
                m3493b = C13894k.m3492c(m3493b, abstractC13796s);
            }
        }
        if (m3493b != null) {
            if (!(m3493b instanceof ArrayList)) {
                ((AbstractC13796s) m3493b).mo3650D(c13790m);
            } else if (m3493b != null) {
                ArrayList arrayList = (ArrayList) m3493b;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i = size - 1;
                        ((AbstractC13796s) arrayList.get(size)).mo3650D(c13790m);
                        if (i < 0) {
                            break;
                        }
                        size = i;
                    }
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            }
        }
        m3702w(c13790m);
    }

    /* renamed from: p */
    private final Throwable m3706p(C13790m<?> c13790m) {
        m3707n(c13790m);
        return c13790m.m3666J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public final void m3705q(InterfaceC11714d<?> interfaceC11714d, E e, C13790m<?> c13790m) {
        UndeliveredElementException m3439d;
        m3707n(c13790m);
        Throwable m3666J = c13790m.m3666J();
        InterfaceC11767l<E, C13666w> interfaceC11767l = this.f30231c;
        if (interfaceC11767l == null || (m3439d = C13908t.m3439d(interfaceC11767l, e, null, 2, null)) == null) {
            C13288p.C13289a c13289a = C13288p.f29444c;
            Object m5358a = C13291q.m5358a(m3666J);
            C13288p.m5362a(m5358a);
            interfaceC11714d.resumeWith(m5358a);
            return;
        }
        C11709c.m10411a(m3439d, m3666J);
        C13288p.C13289a c13289a2 = C13288p.f29444c;
        Object m5358a2 = C13291q.m5358a(m3439d);
        C13288p.m5362a(m5358a2);
        interfaceC11714d.resumeWith(m5358a2);
    }

    /* renamed from: r */
    private final void m3704r(Throwable th) {
        C13914y c13914y;
        Object obj = this.onCloseHandler;
        if (obj == null || obj == (c13914y = C13772b.f30229f) || !f30230e.compareAndSet(this, obj, c13914y)) {
            return;
        }
        C11782b0.m10345f(obj, 1);
        ((InterfaceC11767l) obj).invoke(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public final boolean m3703u() {
        return !(this.f30232d.m3479r() instanceof InterfaceC13798u) && mo3642t();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
        r4 = r0.m3363y();
        r0 = kotlin.p476c0.p477j.C11734d.m10387d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
        if (r4 != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
        kotlin.p476c0.p478k.p479a.C11741h.m10374c(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
        r5 = kotlin.p476c0.p477j.C11734d.m10387d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
        if (r4 != r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0084, code lost:
        return kotlin.C13666w.f30112a;
     */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m3700y(E r4, kotlin.p476c0.InterfaceC11714d<? super kotlin.C13666w> r5) {
        /*
            r3 = this;
            kotlin.c0.d r0 = kotlin.p476c0.p477j.C11728b.m10392c(r5)
            kotlinx.coroutines.n r0 = kotlinx.coroutines.C13945p.m3355b(r0)
        L8:
            boolean r1 = m3713b(r3)
            if (r1 == 0) goto L4d
            kotlin.e0.c.l<E, kotlin.w> r1 = r3.f30231c
            if (r1 != 0) goto L18
            kotlinx.coroutines.channels.y r1 = new kotlinx.coroutines.channels.y
            r1.<init>(r4, r0)
            goto L1f
        L18:
            kotlinx.coroutines.channels.z r1 = new kotlinx.coroutines.channels.z
            kotlin.e0.c.l<E, kotlin.w> r2 = r3.f30231c
            r1.<init>(r4, r0, r2)
        L1f:
            java.lang.Object r2 = r3.mo3693e(r1)
            if (r2 != 0) goto L29
            kotlinx.coroutines.C13945p.m3354c(r0, r1)
            goto L6e
        L29:
            boolean r1 = r2 instanceof kotlinx.coroutines.channels.C13790m
            if (r1 == 0) goto L33
            kotlinx.coroutines.channels.m r2 = (kotlinx.coroutines.channels.C13790m) r2
            m3714a(r3, r0, r4, r2)
            goto L6e
        L33:
            kotlinx.coroutines.internal.y r1 = kotlinx.coroutines.channels.C13772b.f30228e
            if (r2 != r1) goto L38
            goto L4d
        L38:
            boolean r1 = r2 instanceof kotlinx.coroutines.channels.AbstractC13796s
            if (r1 == 0) goto L3d
            goto L4d
        L3d:
            java.lang.String r4 = "enqueueSend returned "
            java.lang.String r4 = kotlin.e0.d.l.m(r4, r2)
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L4d:
            java.lang.Object r1 = r3.mo3659v(r4)
            kotlinx.coroutines.internal.y r2 = kotlinx.coroutines.channels.C13772b.f30225b
            if (r1 != r2) goto L60
            kotlin.w r4 = kotlin.C13666w.f30112a
            kotlin.p$a r1 = kotlin.C13288p.f29444c
            kotlin.C13288p.m5362a(r4)
            r0.resumeWith(r4)
            goto L6e
        L60:
            kotlinx.coroutines.internal.y r2 = kotlinx.coroutines.channels.C13772b.f30226c
            if (r1 != r2) goto L65
            goto L8
        L65:
            boolean r2 = r1 instanceof kotlinx.coroutines.channels.C13790m
            if (r2 == 0) goto L85
            kotlinx.coroutines.channels.m r1 = (kotlinx.coroutines.channels.C13790m) r1
            m3714a(r3, r0, r4, r1)
        L6e:
            java.lang.Object r4 = r0.m3363y()
            java.lang.Object r0 = kotlin.p476c0.p477j.C11728b.m10391d()
            if (r4 != r0) goto L7b
            kotlin.p476c0.p478k.p479a.C11741h.m10374c(r5)
        L7b:
            java.lang.Object r5 = kotlin.p476c0.p477j.C11728b.m10391d()
            if (r4 != r5) goto L82
            return r4
        L82:
            kotlin.w r4 = kotlin.C13666w.f30112a
            return r4
        L85:
            java.lang.String r4 = "offerInternal returned "
            java.lang.String r4 = kotlin.e0.d.l.m(r4, r1)
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            goto L96
        L95:
            throw r5
        L96:
            goto L95
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.AbstractC13773c.m3700y(java.lang.Object, kotlin.c0.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public final AbstractC13800w m3715A() {
        C13897n c13897n;
        C13897n m3472y;
        C13895l c13895l = this.f30232d;
        while (true) {
            c13897n = (C13897n) c13895l.m3480p();
            if (c13897n != c13895l && (c13897n instanceof AbstractC13800w)) {
                if (((((AbstractC13800w) c13897n) instanceof C13790m) && !c13897n.mo3475v()) || (m3472y = c13897n.m3472y()) == null) {
                    break;
                }
                m3472y.m3476u();
            }
        }
        c13897n = null;
        return (AbstractC13800w) c13897n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public Object mo3693e(AbstractC13800w abstractC13800w) {
        boolean z;
        C13897n m3478s;
        if (mo3643s()) {
            C13897n c13897n = this.f30232d;
            do {
                m3478s = c13897n.m3478s();
                if (m3478s instanceof InterfaceC13798u) {
                    return m3478s;
                }
            } while (!m3478s.m3485j(abstractC13800w, c13897n));
            return null;
        }
        C13897n c13897n2 = this.f30232d;
        C13775b c13775b = new C13775b(abstractC13800w, this);
        while (true) {
            C13897n m3478s2 = c13897n2.m3478s();
            if (!(m3478s2 instanceof InterfaceC13798u)) {
                int m3488A = m3478s2.m3488A(abstractC13800w, c13897n2, c13775b);
                z = true;
                if (m3488A != 1) {
                    if (m3488A == 2) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return m3478s2;
            }
        }
        if (z) {
            return null;
        }
        return C13772b.f30228e;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC13801x
    /* renamed from: f */
    public boolean mo3641f(Throwable th) {
        boolean z;
        C13790m<?> c13790m = new C13790m<>(th);
        C13897n c13897n = this.f30232d;
        while (true) {
            C13897n m3478s = c13897n.m3478s();
            z = true;
            if (!(!(m3478s instanceof C13790m))) {
                z = false;
                break;
            } else if (m3478s.m3485j(c13790m, c13897n)) {
                break;
            }
        }
        if (!z) {
            c13790m = (C13790m) this.f30232d.m3478s();
        }
        m3707n(c13790m);
        if (z) {
            m3704r(th);
        }
        return z;
    }

    /* renamed from: g */
    protected String mo3661g() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final C13790m<?> m3711h() {
        C13897n m3479r = this.f30232d.m3479r();
        C13790m<?> c13790m = m3479r instanceof C13790m ? (C13790m) m3479r : null;
        if (c13790m == null) {
            return null;
        }
        m3707n(c13790m);
        return c13790m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final C13790m<?> m3710i() {
        C13897n m3478s = this.f30232d.m3478s();
        C13790m<?> c13790m = m3478s instanceof C13790m ? (C13790m) m3478s : null;
        if (c13790m == null) {
            return null;
        }
        m3707n(c13790m);
        return c13790m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public final C13895l m3709j() {
        return this.f30232d;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC13801x
    /* renamed from: k */
    public final Object mo3640k(E e) {
        Object mo3659v = mo3659v(e);
        if (mo3659v == C13772b.f30225b) {
            C13784j.C13786b c13786b = C13784j.f30249b;
            C13666w c13666w = C13666w.f30112a;
            c13786b.m3672c(c13666w);
            return c13666w;
        } else if (mo3659v == C13772b.f30226c) {
            C13790m<?> m3710i = m3710i();
            return m3710i == null ? C13784j.f30249b.m3673b() : C13784j.f30249b.m3674a(m3706p(m3710i));
        } else if (mo3659v instanceof C13790m) {
            return C13784j.f30249b.m3674a(m3706p((C13790m) mo3659v));
        } else {
            throw new IllegalStateException(kotlin.e0.d.l.m("trySend returned ", mo3659v).toString());
        }
    }

    @Override // kotlinx.coroutines.channels.InterfaceC13801x
    /* renamed from: o */
    public final Object mo3639o(E e, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        Object m10387d;
        if (mo3659v(e) == C13772b.f30225b) {
            return C13666w.f30112a;
        }
        Object m3700y = m3700y(e, interfaceC11714d);
        m10387d = C11734d.m10387d();
        return m3700y == m10387d ? m3700y : C13666w.f30112a;
    }

    /* renamed from: s */
    protected abstract boolean mo3643s();

    /* renamed from: t */
    protected abstract boolean mo3642t();

    public String toString() {
        return C14034r0.m3204a(this) + '@' + C14034r0.m3203b(this) + '{' + m3708l() + '}' + mo3661g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public Object mo3659v(E e) {
        InterfaceC13798u<E> mo3699z;
        C13914y mo3646f;
        do {
            mo3699z = mo3699z();
            if (mo3699z == null) {
                return C13772b.f30226c;
            }
            mo3646f = mo3699z.mo3646f(e, null);
        } while (mo3646f == null);
        if (C13952q0.m3345a()) {
            if (!(mo3646f == C13939o.f30425a)) {
                throw new AssertionError();
            }
        }
        mo3699z.mo3647e(e);
        return mo3699z.mo3648a();
    }

    /* renamed from: w */
    protected void m3702w(C13897n c13897n) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public final InterfaceC13798u<?> m3701x(E e) {
        C13897n m3478s;
        C13897n c13897n = this.f30232d;
        C13774a c13774a = new C13774a(e);
        do {
            m3478s = c13897n.m3478s();
            if (m3478s instanceof InterfaceC13798u) {
                return (InterfaceC13798u) m3478s;
            }
        } while (!m3478s.m3485j(c13774a, c13897n));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public InterfaceC13798u<E> mo3699z() {
        C13897n c13897n;
        C13897n m3472y;
        C13895l c13895l = this.f30232d;
        while (true) {
            c13897n = (C13897n) c13895l.m3480p();
            if (c13897n != c13895l && (c13897n instanceof InterfaceC13798u)) {
                if (((((InterfaceC13798u) c13897n) instanceof C13790m) && !c13897n.mo3475v()) || (m3472y = c13897n.m3472y()) == null) {
                    break;
                }
                m3472y.m3476u();
            }
        }
        c13897n = null;
        return (InterfaceC13798u) c13897n;
    }
}

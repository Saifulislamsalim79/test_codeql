package kotlinx.coroutines.flow.internal;

import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11715e;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlinx.coroutines.channels.EnumC13778e;
import kotlinx.coroutines.channels.InterfaceC13795r;
import kotlinx.coroutines.p559q2.InterfaceC13964d;
import kotlinx.coroutines.p559q2.InterfaceC13969e;
/* compiled from: ChannelFlow.kt */
/* renamed from: kotlinx.coroutines.flow.internal.f */
/* loaded from: classes3.dex */
public abstract class AbstractC13824f<S, T> extends AbstractC13820d<T> {

    /* renamed from: f */
    protected final InterfaceC13964d<S> f30282f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChannelFlow.kt */
    @kotlin.c0.k.a.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {152}, m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.internal.f$a */
    /* loaded from: classes3.dex */
    public static final class C13825a extends AbstractC11745k implements InterfaceC11771p<InterfaceC13969e<? super T>, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        int f30283c;

        /* renamed from: d */
        /* synthetic */ Object f30284d;

        /* renamed from: e */
        final /* synthetic */ AbstractC13824f<S, T> f30285e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13825a(AbstractC13824f<S, T> abstractC13824f, InterfaceC11714d<? super C13825a> interfaceC11714d) {
            super(2, interfaceC11714d);
            this.f30285e = abstractC13824f;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            C13825a c13825a = new C13825a(this.f30285e, interfaceC11714d);
            c13825a.f30284d = obj;
            return c13825a;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            m10387d = C11734d.m10387d();
            int i = this.f30283c;
            if (i == 0) {
                C13291q.m5357b(obj);
                AbstractC13824f<S, T> abstractC13824f = this.f30285e;
                this.f30283c = 1;
                if (abstractC13824f.mo3593r((InterfaceC13969e) this.f30284d, this) == m10387d) {
                    return m10387d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13291q.m5357b(obj);
            }
            return C13666w.f30112a;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        /* renamed from: m */
        public final Object invoke(InterfaceC13969e<? super T> interfaceC13969e, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return ((C13825a) create(interfaceC13969e, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC13824f(InterfaceC13964d<? extends S> interfaceC13964d, InterfaceC11719g interfaceC11719g, int i, EnumC13778e enumC13778e) {
        super(interfaceC11719g, i, enumC13778e);
        this.f30282f = interfaceC13964d;
    }

    /* renamed from: o */
    static /* synthetic */ Object m3597o(AbstractC13824f abstractC13824f, InterfaceC13969e interfaceC13969e, InterfaceC11714d interfaceC11714d) {
        Object m10387d;
        Object m10387d2;
        Object m10387d3;
        if (abstractC13824f.f30273d == -3) {
            InterfaceC11719g context = interfaceC11714d.getContext();
            InterfaceC11719g plus = context.plus(abstractC13824f.f30272c);
            if (kotlin.e0.d.l.b(plus, context)) {
                Object mo3593r = abstractC13824f.mo3593r(interfaceC13969e, interfaceC11714d);
                m10387d3 = C11734d.m10387d();
                return mo3593r == m10387d3 ? mo3593r : C13666w.f30112a;
            } else if (kotlin.e0.d.l.b(plus.get(InterfaceC11715e.f26443r), context.get(InterfaceC11715e.f26443r))) {
                Object m3595q = abstractC13824f.m3595q(interfaceC13969e, plus, interfaceC11714d);
                m10387d2 = C11734d.m10387d();
                return m3595q == m10387d2 ? m3595q : C13666w.f30112a;
            }
        }
        Object mo3175a = super.mo3175a(interfaceC13969e, interfaceC11714d);
        m10387d = C11734d.m10387d();
        return mo3175a == m10387d ? mo3175a : C13666w.f30112a;
    }

    /* renamed from: p */
    static /* synthetic */ Object m3596p(AbstractC13824f abstractC13824f, InterfaceC13795r interfaceC13795r, InterfaceC11714d interfaceC11714d) {
        Object m10387d;
        Object mo3593r = abstractC13824f.mo3593r(new C13848t(interfaceC13795r), interfaceC11714d);
        m10387d = C11734d.m10387d();
        return mo3593r == m10387d ? mo3593r : C13666w.f30112a;
    }

    /* renamed from: q */
    private final Object m3595q(InterfaceC13969e<? super T> interfaceC13969e, InterfaceC11719g interfaceC11719g, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        Object m10387d;
        Object m3599c = C13823e.m3599c(interfaceC11719g, C13823e.m3601a(interfaceC13969e, interfaceC11714d.getContext()), null, new C13825a(this, null), interfaceC11714d, 4, null);
        m10387d = C11734d.m10387d();
        return m3599c == m10387d ? m3599c : C13666w.f30112a;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC13820d, kotlinx.coroutines.p559q2.InterfaceC13964d
    /* renamed from: a */
    public Object mo3175a(InterfaceC13969e<? super T> interfaceC13969e, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        return m3597o(this, interfaceC13969e, interfaceC11714d);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC13820d
    /* renamed from: i */
    protected Object mo3174i(InterfaceC13795r<? super T> interfaceC13795r, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        return m3596p(this, interfaceC13795r, interfaceC11714d);
    }

    /* renamed from: r */
    protected abstract Object mo3593r(InterfaceC13969e<? super T> interfaceC13969e, InterfaceC11714d<? super C13666w> interfaceC11714d);

    @Override // kotlinx.coroutines.flow.internal.AbstractC13820d
    public String toString() {
        return this.f30282f + " -> " + super.toString();
    }
}

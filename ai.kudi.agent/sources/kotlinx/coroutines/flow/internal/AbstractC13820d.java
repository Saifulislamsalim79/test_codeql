package kotlinx.coroutines.flow.internal;

import java.util.ArrayList;
import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.p476c0.C11725h;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p557z.C13742z;
import kotlinx.coroutines.C13936n0;
import kotlinx.coroutines.C13952q0;
import kotlinx.coroutines.C14034r0;
import kotlinx.coroutines.EnumC13940o0;
import kotlinx.coroutines.InterfaceC13932m0;
import kotlinx.coroutines.channels.C13793p;
import kotlinx.coroutines.channels.EnumC13778e;
import kotlinx.coroutines.channels.InterfaceC13795r;
import kotlinx.coroutines.channels.InterfaceC13797t;
import kotlinx.coroutines.p559q2.C13971f;
import kotlinx.coroutines.p559q2.InterfaceC13964d;
import kotlinx.coroutines.p559q2.InterfaceC13969e;
/* compiled from: ChannelFlow.kt */
/* renamed from: kotlinx.coroutines.flow.internal.d */
/* loaded from: classes3.dex */
public abstract class AbstractC13820d<T> implements InterfaceC13837m<T> {

    /* renamed from: c */
    public final InterfaceC11719g f30272c;

    /* renamed from: d */
    public final int f30273d;

    /* renamed from: e */
    public final EnumC13778e f30274e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChannelFlow.kt */
    @kotlin.c0.k.a.f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {123}, m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.internal.d$a */
    /* loaded from: classes3.dex */
    public static final class C13821a extends AbstractC11745k implements InterfaceC11771p<InterfaceC13932m0, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        int f30275c;

        /* renamed from: d */
        private /* synthetic */ Object f30276d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC13969e<T> f30277e;

        /* renamed from: f */
        final /* synthetic */ AbstractC13820d<T> f30278f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C13821a(InterfaceC13969e<? super T> interfaceC13969e, AbstractC13820d<T> abstractC13820d, InterfaceC11714d<? super C13821a> interfaceC11714d) {
            super(2, interfaceC11714d);
            this.f30277e = interfaceC13969e;
            this.f30278f = abstractC13820d;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            C13821a c13821a = new C13821a(this.f30277e, this.f30278f, interfaceC11714d);
            c13821a.f30276d = obj;
            return c13821a;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public final Object invoke(InterfaceC13932m0 interfaceC13932m0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return ((C13821a) create(interfaceC13932m0, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            m10387d = C11734d.m10387d();
            int i = this.f30275c;
            if (i == 0) {
                C13291q.m5357b(obj);
                InterfaceC13969e<T> interfaceC13969e = this.f30277e;
                InterfaceC13797t<T> mo3339n = this.f30278f.mo3339n((InterfaceC13932m0) this.f30276d);
                this.f30275c = 1;
                if (C13971f.m3324j(interfaceC13969e, mo3339n, this) == m10387d) {
                    return m10387d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13291q.m5357b(obj);
            }
            return C13666w.f30112a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChannelFlow.kt */
    @kotlin.c0.k.a.f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {60}, m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.internal.d$b */
    /* loaded from: classes3.dex */
    public static final class C13822b extends AbstractC11745k implements InterfaceC11771p<InterfaceC13795r<? super T>, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        int f30279c;

        /* renamed from: d */
        /* synthetic */ Object f30280d;

        /* renamed from: e */
        final /* synthetic */ AbstractC13820d<T> f30281e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13822b(AbstractC13820d<T> abstractC13820d, InterfaceC11714d<? super C13822b> interfaceC11714d) {
            super(2, interfaceC11714d);
            this.f30281e = abstractC13820d;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            C13822b c13822b = new C13822b(this.f30281e, interfaceC11714d);
            c13822b.f30280d = obj;
            return c13822b;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            m10387d = C11734d.m10387d();
            int i = this.f30279c;
            if (i == 0) {
                C13291q.m5357b(obj);
                AbstractC13820d<T> abstractC13820d = this.f30281e;
                this.f30279c = 1;
                if (abstractC13820d.mo3174i((InterfaceC13795r) this.f30280d, this) == m10387d) {
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
        public final Object invoke(InterfaceC13795r<? super T> interfaceC13795r, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return ((C13822b) create(interfaceC13795r, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }
    }

    public AbstractC13820d(InterfaceC11719g interfaceC11719g, int i, EnumC13778e enumC13778e) {
        this.f30272c = interfaceC11719g;
        this.f30273d = i;
        this.f30274e = enumC13778e;
        if (C13952q0.m3345a()) {
            if (!(this.f30273d != -1)) {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: h */
    static /* synthetic */ Object m3605h(AbstractC13820d abstractC13820d, InterfaceC13969e interfaceC13969e, InterfaceC11714d interfaceC11714d) {
        Object m10387d;
        Object m3361a = C13936n0.m3361a(new C13821a(interfaceC13969e, abstractC13820d, null), interfaceC11714d);
        m10387d = C11734d.m10387d();
        return m3361a == m10387d ? m3361a : C13666w.f30112a;
    }

    @Override // kotlinx.coroutines.p559q2.InterfaceC13964d
    /* renamed from: a */
    public Object mo3175a(InterfaceC13969e<? super T> interfaceC13969e, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        return m3605h(this, interfaceC13969e, interfaceC11714d);
    }

    @Override // kotlinx.coroutines.flow.internal.InterfaceC13837m
    /* renamed from: b */
    public InterfaceC13964d<T> mo3233b(InterfaceC11719g interfaceC11719g, int i, EnumC13778e enumC13778e) {
        if (C13952q0.m3345a()) {
            if (!(i != -1)) {
                throw new AssertionError();
            }
        }
        InterfaceC11719g plus = interfaceC11719g.plus(this.f30272c);
        if (enumC13778e == EnumC13778e.SUSPEND) {
            int i2 = this.f30273d;
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2) {
                            if (C13952q0.m3345a()) {
                                if (!(this.f30273d >= 0)) {
                                    throw new AssertionError();
                                }
                            }
                            if (C13952q0.m3345a()) {
                                if (!(i >= 0)) {
                                    throw new AssertionError();
                                }
                            }
                            i2 = this.f30273d + i;
                            if (i2 < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i2;
            }
            enumC13778e = this.f30274e;
        }
        return (kotlin.e0.d.l.b(plus, this.f30272c) && i == this.f30273d && enumC13778e == this.f30274e) ? this : mo3173j(plus, i, enumC13778e);
    }

    /* renamed from: d */
    protected String mo3341d() {
        return null;
    }

    /* renamed from: i */
    protected abstract Object mo3174i(InterfaceC13795r<? super T> interfaceC13795r, InterfaceC11714d<? super C13666w> interfaceC11714d);

    /* renamed from: j */
    protected abstract AbstractC13820d<T> mo3173j(InterfaceC11719g interfaceC11719g, int i, EnumC13778e enumC13778e);

    /* renamed from: k */
    public InterfaceC13964d<T> mo3340k() {
        return null;
    }

    /* renamed from: l */
    public final InterfaceC11771p<InterfaceC13795r<? super T>, InterfaceC11714d<? super C13666w>, Object> m3604l() {
        return new C13822b(this, null);
    }

    /* renamed from: m */
    public final int m3603m() {
        int i = this.f30273d;
        if (i == -3) {
            return -2;
        }
        return i;
    }

    /* renamed from: n */
    public InterfaceC13797t<T> mo3339n(InterfaceC13932m0 interfaceC13932m0) {
        return C13793p.m3657b(interfaceC13932m0, this.f30272c, m3603m(), this.f30274e, EnumC13940o0.ATOMIC, null, m3604l(), 16, null);
    }

    public String toString() {
        String m3797a0;
        ArrayList arrayList = new ArrayList(4);
        String mo3341d = mo3341d();
        if (mo3341d != null) {
            arrayList.add(mo3341d);
        }
        InterfaceC11719g interfaceC11719g = this.f30272c;
        if (interfaceC11719g != C11725h.f26446c) {
            arrayList.add(kotlin.e0.d.l.m("context=", interfaceC11719g));
        }
        int i = this.f30273d;
        if (i != -3) {
            arrayList.add(kotlin.e0.d.l.m("capacity=", Integer.valueOf(i)));
        }
        EnumC13778e enumC13778e = this.f30274e;
        if (enumC13778e != EnumC13778e.SUSPEND) {
            arrayList.add(kotlin.e0.d.l.m("onBufferOverflow=", enumC13778e));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C14034r0.m3204a(this));
        sb.append('[');
        m3797a0 = C13742z.m3797a0(arrayList, ", ", null, null, 0, null, null, 62, null);
        sb.append(m3797a0);
        sb.append(']');
        return sb.toString();
    }
}

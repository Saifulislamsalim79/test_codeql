package kotlin.p476c0.p477j;

import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.e0.d.l;
import kotlin.p476c0.C11725h;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p476c0.p478k.p479a.AbstractC11735a;
import kotlin.p476c0.p478k.p479a.AbstractC11738d;
import kotlin.p476c0.p478k.p479a.AbstractC11744j;
import kotlin.p476c0.p478k.p479a.C11741h;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.C11782b0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IntrinsicsJvm.kt */
/* renamed from: kotlin.c0.j.c */
/* loaded from: classes3.dex */
public class C11729c {

    /* compiled from: IntrinsicsJvm.kt */
    /* renamed from: kotlin.c0.j.c$a */
    /* loaded from: classes3.dex */
    public static final class C11730a extends AbstractC11744j {

        /* renamed from: c */
        private int f26453c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC11767l f26454d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11730a(InterfaceC11714d interfaceC11714d, InterfaceC11714d interfaceC11714d2, InterfaceC11767l interfaceC11767l) {
            super(interfaceC11714d2);
            this.f26454d = interfaceC11767l;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        protected Object invokeSuspend(Object obj) {
            int i = this.f26453c;
            if (i != 0) {
                if (i == 1) {
                    this.f26453c = 2;
                    C13291q.m5357b(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f26453c = 1;
            C13291q.m5357b(obj);
            InterfaceC11767l interfaceC11767l = this.f26454d;
            if (interfaceC11767l != null) {
                C11782b0.m10345f(interfaceC11767l, 1);
                return interfaceC11767l.invoke(this);
            }
            throw new NullPointerException("null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    /* renamed from: kotlin.c0.j.c$b */
    /* loaded from: classes3.dex */
    public static final class C11731b extends AbstractC11738d {

        /* renamed from: c */
        private int f26455c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC11767l f26456d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11731b(InterfaceC11714d interfaceC11714d, InterfaceC11719g interfaceC11719g, InterfaceC11714d interfaceC11714d2, InterfaceC11719g interfaceC11719g2, InterfaceC11767l interfaceC11767l) {
            super(interfaceC11714d2, interfaceC11719g2);
            this.f26456d = interfaceC11767l;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        protected Object invokeSuspend(Object obj) {
            int i = this.f26455c;
            if (i != 0) {
                if (i == 1) {
                    this.f26455c = 2;
                    C13291q.m5357b(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f26455c = 1;
            C13291q.m5357b(obj);
            InterfaceC11767l interfaceC11767l = this.f26456d;
            if (interfaceC11767l != null) {
                C11782b0.m10345f(interfaceC11767l, 1);
                return interfaceC11767l.invoke(this);
            }
            throw new NullPointerException("null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    /* renamed from: kotlin.c0.j.c$c */
    /* loaded from: classes3.dex */
    public static final class C11732c extends AbstractC11744j {

        /* renamed from: c */
        private int f26457c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC11771p f26458d;

        /* renamed from: e */
        final /* synthetic */ Object f26459e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11732c(InterfaceC11714d interfaceC11714d, InterfaceC11714d interfaceC11714d2, InterfaceC11771p interfaceC11771p, Object obj) {
            super(interfaceC11714d2);
            this.f26458d = interfaceC11771p;
            this.f26459e = obj;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        protected Object invokeSuspend(Object obj) {
            int i = this.f26457c;
            if (i != 0) {
                if (i == 1) {
                    this.f26457c = 2;
                    C13291q.m5357b(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f26457c = 1;
            C13291q.m5357b(obj);
            InterfaceC11771p interfaceC11771p = this.f26458d;
            if (interfaceC11771p != null) {
                C11782b0.m10345f(interfaceC11771p, 2);
                return interfaceC11771p.invoke(this.f26459e, this);
            }
            throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    /* renamed from: kotlin.c0.j.c$d */
    /* loaded from: classes3.dex */
    public static final class C11733d extends AbstractC11738d {

        /* renamed from: c */
        private int f26460c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC11771p f26461d;

        /* renamed from: e */
        final /* synthetic */ Object f26462e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11733d(InterfaceC11714d interfaceC11714d, InterfaceC11719g interfaceC11719g, InterfaceC11714d interfaceC11714d2, InterfaceC11719g interfaceC11719g2, InterfaceC11771p interfaceC11771p, Object obj) {
            super(interfaceC11714d2, interfaceC11719g2);
            this.f26461d = interfaceC11771p;
            this.f26462e = obj;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        protected Object invokeSuspend(Object obj) {
            int i = this.f26460c;
            if (i != 0) {
                if (i == 1) {
                    this.f26460c = 2;
                    C13291q.m5357b(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f26460c = 1;
            C13291q.m5357b(obj);
            InterfaceC11771p interfaceC11771p = this.f26461d;
            if (interfaceC11771p != null) {
                C11782b0.m10345f(interfaceC11771p, 2);
                return interfaceC11771p.invoke(this.f26462e, this);
            }
            throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        }
    }

    /* renamed from: a */
    public static <T> InterfaceC11714d<C13666w> m10390a(InterfaceC11767l<? super InterfaceC11714d<? super T>, ? extends Object> interfaceC11767l, InterfaceC11714d<? super T> interfaceC11714d) {
        l.f(interfaceC11767l, "$this$createCoroutineUnintercepted");
        l.f(interfaceC11714d, "completion");
        C11741h.m10376a(interfaceC11714d);
        if (interfaceC11767l instanceof AbstractC11735a) {
            return ((AbstractC11735a) interfaceC11767l).create(interfaceC11714d);
        }
        InterfaceC11719g context = interfaceC11714d.getContext();
        if (context == C11725h.f26446c) {
            if (interfaceC11714d != null) {
                return new C11730a(interfaceC11714d, interfaceC11714d, interfaceC11767l);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        } else if (interfaceC11714d != null) {
            return new C11731b(interfaceC11714d, context, interfaceC11714d, context, interfaceC11767l);
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }
    }

    /* renamed from: b */
    public static <R, T> InterfaceC11714d<C13666w> m10389b(InterfaceC11771p<? super R, ? super InterfaceC11714d<? super T>, ? extends Object> interfaceC11771p, R r, InterfaceC11714d<? super T> interfaceC11714d) {
        l.f(interfaceC11771p, "$this$createCoroutineUnintercepted");
        l.f(interfaceC11714d, "completion");
        C11741h.m10376a(interfaceC11714d);
        if (interfaceC11771p instanceof AbstractC11735a) {
            return ((AbstractC11735a) interfaceC11771p).create(r, interfaceC11714d);
        }
        InterfaceC11719g context = interfaceC11714d.getContext();
        if (context == C11725h.f26446c) {
            if (interfaceC11714d != null) {
                return new C11732c(interfaceC11714d, interfaceC11714d, interfaceC11771p, r);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        } else if (interfaceC11714d != null) {
            return new C11733d(interfaceC11714d, context, interfaceC11714d, context, interfaceC11771p, r);
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static <T> InterfaceC11714d<T> m10388c(InterfaceC11714d<? super T> interfaceC11714d) {
        InterfaceC11714d<T> interfaceC11714d2;
        l.f(interfaceC11714d, "$this$intercepted");
        AbstractC11738d abstractC11738d = !(interfaceC11714d instanceof AbstractC11738d) ? null : interfaceC11714d;
        return (abstractC11738d == null || (interfaceC11714d2 = (InterfaceC11714d<T>) abstractC11738d.intercepted()) == null) ? interfaceC11714d : interfaceC11714d2;
    }
}

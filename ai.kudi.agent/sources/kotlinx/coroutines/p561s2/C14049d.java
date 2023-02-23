package kotlinx.coroutines.p561s2;

import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.c0.k.a.f;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p476c0.C11725h;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11715e;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11738d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlinx.coroutines.C13936n0;
import kotlinx.coroutines.InterfaceC13932m0;
import kotlinx.coroutines.channels.EnumC13778e;
import kotlinx.coroutines.channels.InterfaceC13779f;
import kotlinx.coroutines.channels.InterfaceC13795r;
import kotlinx.coroutines.channels.InterfaceC13797t;
import kotlinx.coroutines.flow.internal.AbstractC13820d;
import kotlinx.coroutines.flow.internal.C13848t;
import kotlinx.coroutines.p559q2.C13971f;
import kotlinx.coroutines.p559q2.InterfaceC13969e;
import p577n.p586b.InterfaceC14455a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReactiveFlow.kt */
/* renamed from: kotlinx.coroutines.s2.d */
/* loaded from: classes3.dex */
public final class C14049d<T> extends AbstractC13820d<T> {

    /* renamed from: f */
    private final InterfaceC14455a<T> f30638f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactiveFlow.kt */
    @f(c = "kotlinx.coroutines.reactive.PublisherAsFlow", f = "ReactiveFlow.kt", l = {98, 100}, m = "collectImpl")
    /* renamed from: kotlinx.coroutines.s2.d$a */
    /* loaded from: classes3.dex */
    public static final class C14050a extends AbstractC11738d {

        /* renamed from: c */
        Object f30639c;

        /* renamed from: d */
        Object f30640d;

        /* renamed from: e */
        Object f30641e;

        /* renamed from: f */
        long f30642f;

        /* renamed from: w */
        /* synthetic */ Object f30643w;

        /* renamed from: x */
        final /* synthetic */ C14049d<T> f30644x;

        /* renamed from: y */
        int f30645y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14050a(C14049d<T> c14049d, InterfaceC11714d<? super C14050a> interfaceC11714d) {
            super(interfaceC11714d);
            this.f30644x = c14049d;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            this.f30643w = obj;
            this.f30645y |= Integer.MIN_VALUE;
            return this.f30644x.m3171p(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactiveFlow.kt */
    @f(c = "kotlinx.coroutines.reactive.PublisherAsFlow$collectSlowPath$2", f = "ReactiveFlow.kt", l = {87}, m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.s2.d$b */
    /* loaded from: classes3.dex */
    public static final class C14051b extends AbstractC11745k implements InterfaceC11771p<InterfaceC13932m0, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        int f30646c;

        /* renamed from: d */
        private /* synthetic */ Object f30647d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC13969e<T> f30648e;

        /* renamed from: f */
        final /* synthetic */ C14049d<T> f30649f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C14051b(InterfaceC13969e<? super T> interfaceC13969e, C14049d<T> c14049d, InterfaceC11714d<? super C14051b> interfaceC11714d) {
            super(2, interfaceC11714d);
            this.f30648e = interfaceC13969e;
            this.f30649f = c14049d;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            C14051b c14051b = new C14051b(this.f30648e, this.f30649f, interfaceC11714d);
            c14051b.f30647d = obj;
            return c14051b;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public final Object invoke(InterfaceC13932m0 interfaceC13932m0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return ((C14051b) create(interfaceC13932m0, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            m10387d = C11734d.m10387d();
            int i = this.f30646c;
            if (i == 0) {
                C13291q.m5357b(obj);
                InterfaceC13969e<T> interfaceC13969e = this.f30648e;
                C14049d<T> c14049d = this.f30649f;
                InterfaceC13797t<T> mo3339n = c14049d.mo3339n(C13936n0.m3360b((InterfaceC13932m0) this.f30647d, c14049d.f30272c));
                this.f30646c = 1;
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

    public /* synthetic */ C14049d(InterfaceC14455a interfaceC14455a, InterfaceC11719g interfaceC11719g, int i, EnumC13778e enumC13778e, int i2, g gVar) {
        this(interfaceC14455a, (i2 & 2) != 0 ? C11725h.f26446c : interfaceC11719g, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? EnumC13778e.SUSPEND : enumC13778e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d A[Catch: all -> 0x005c, TRY_ENTER, TryCatch #0 {all -> 0x005c, blocks: (B:13:0x003c, B:33:0x00b5, B:35:0x00c0, B:23:0x007f, B:30:0x009d, B:18:0x0058), top: B:42:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #0 {all -> 0x005c, blocks: (B:13:0x003c, B:33:0x00b5, B:35:0x00c0, B:23:0x007f, B:30:0x009d, B:18:0x0058), top: B:42:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v8, types: [kotlinx.coroutines.s2.f] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b2 -> B:14:0x003f). Please submit an issue!!! */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m3171p(kotlin.p476c0.InterfaceC11719g r18, kotlinx.coroutines.p559q2.InterfaceC13969e<? super T> r19, kotlin.p476c0.InterfaceC11714d<? super kotlin.C13666w> r20) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p561s2.C14049d.m3171p(kotlin.c0.g, kotlinx.coroutines.q2.e, kotlin.c0.d):java.lang.Object");
    }

    /* renamed from: q */
    private final Object m3170q(InterfaceC13969e<? super T> interfaceC13969e, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        Object m10387d;
        Object m3361a = C13936n0.m3361a(new C14051b(interfaceC13969e, this, null), interfaceC11714d);
        m10387d = C11734d.m10387d();
        return m3361a == m10387d ? m3361a : C13666w.f30112a;
    }

    /* renamed from: r */
    private final long m3169r() {
        if (this.f30274e == EnumC13778e.SUSPEND) {
            int i = this.f30273d;
            if (i == -2) {
                return InterfaceC13779f.f30245v.m3691a();
            }
            if (i == 0) {
                return 1L;
            }
            if (i != Integer.MAX_VALUE) {
                long j = i;
                if (j >= 1) {
                    return j;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC13820d, kotlinx.coroutines.p559q2.InterfaceC13964d
    /* renamed from: a */
    public Object mo3175a(InterfaceC13969e<? super T> interfaceC13969e, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        Object m10387d;
        Object m10387d2;
        InterfaceC11719g context = interfaceC11714d.getContext();
        InterfaceC11715e interfaceC11715e = (InterfaceC11715e) this.f30272c.get(InterfaceC11715e.f26443r);
        if (interfaceC11715e != null && !l.b(interfaceC11715e, context.get(InterfaceC11715e.f26443r))) {
            Object m3170q = m3170q(interfaceC13969e, interfaceC11714d);
            m10387d2 = C11734d.m10387d();
            return m3170q == m10387d2 ? m3170q : C13666w.f30112a;
        }
        Object m3171p = m3171p(context.plus(this.f30272c), interfaceC13969e, interfaceC11714d);
        m10387d = C11734d.m10387d();
        return m3171p == m10387d ? m3171p : C13666w.f30112a;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC13820d
    /* renamed from: i */
    protected Object mo3174i(InterfaceC13795r<? super T> interfaceC13795r, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        Object m10387d;
        Object m3171p = m3171p(interfaceC13795r.mo3397o0(), new C13848t(interfaceC13795r.mo3653f0()), interfaceC11714d);
        m10387d = C11734d.m10387d();
        return m3171p == m10387d ? m3171p : C13666w.f30112a;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC13820d
    /* renamed from: j */
    protected AbstractC13820d<T> mo3173j(InterfaceC11719g interfaceC11719g, int i, EnumC13778e enumC13778e) {
        return new C14049d(this.f30638f, interfaceC11719g, i, enumC13778e);
    }

    public C14049d(InterfaceC14455a<T> interfaceC14455a, InterfaceC11719g interfaceC11719g, int i, EnumC13778e enumC13778e) {
        super(interfaceC11719g, i, enumC13778e);
        this.f30638f = interfaceC14455a;
    }
}

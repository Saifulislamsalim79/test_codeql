package p201g.p259r;

import java.util.ArrayList;
import java.util.List;
import kotlin.C13287o;
import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.c0.k.a.f;
import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11738d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11810u;
import kotlinx.coroutines.C13916j;
import kotlinx.coroutines.InterfaceC13932m0;
import kotlinx.coroutines.p559q2.InterfaceC13970e0;
import p201g.p259r.AbstractC8056x0;
import p201g.p259r.AbstractC8061y;
import p201g.p259r.C7820a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RemoteMediatorAccessor.kt */
/* renamed from: g.r.y0 */
/* loaded from: classes2.dex */
public final class C8066y0<Key, Value> implements InterfaceC8083z0<Key, Value> {

    /* renamed from: a */
    private final InterfaceC13932m0 f19414a;

    /* renamed from: b */
    private final AbstractC8056x0<Key, Value> f19415b;

    /* renamed from: c */
    private final C7829b<Key, Value> f19416c;

    /* renamed from: d */
    private final C7892h1 f19417d;

    /* compiled from: RemoteMediatorAccessor.kt */
    /* renamed from: g.r.y0$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C8067a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19418a;

        static {
            int[] iArr = new int[EnumC7830b0.values().length];
            iArr[EnumC7830b0.REFRESH.ordinal()] = 1;
            f19418a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RemoteMediatorAccessor.kt */
    @f(c = "androidx.paging.RemoteMediatorAccessImpl", f = "RemoteMediatorAccessor.kt", l = {397}, m = "initialize")
    /* renamed from: g.r.y0$b */
    /* loaded from: classes2.dex */
    public static final class C8068b extends AbstractC11738d {

        /* renamed from: c */
        Object f19419c;

        /* renamed from: d */
        /* synthetic */ Object f19420d;

        /* renamed from: e */
        final /* synthetic */ C8066y0<Key, Value> f19421e;

        /* renamed from: f */
        int f19422f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8068b(C8066y0<Key, Value> c8066y0, InterfaceC11714d<? super C8068b> interfaceC11714d) {
            super(interfaceC11714d);
            this.f19421e = c8066y0;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            this.f19420d = obj;
            this.f19422f |= Integer.MIN_VALUE;
            return this.f19421e.mo16780b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RemoteMediatorAccessor.kt */
    /* renamed from: g.r.y0$c */
    /* loaded from: classes2.dex */
    public static final class C8069c extends AbstractC11802m implements InterfaceC11767l<C7820a<Key, Value>, C13666w> {

        /* renamed from: c */
        public static final C8069c f19423c = new C8069c();

        C8069c() {
            super(1);
        }

        /* renamed from: a */
        public final void m16791a(C7820a<Key, Value> c7820a) {
            l.f(c7820a, "it");
            c7820a.m17229i(EnumC7830b0.APPEND, C7820a.EnumC7821a.REQUIRES_REFRESH);
            c7820a.m17229i(EnumC7830b0.PREPEND, C7820a.EnumC7821a.REQUIRES_REFRESH);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ C13666w invoke(Object obj) {
            m16791a((C7820a) obj);
            return C13666w.f30112a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RemoteMediatorAccessor.kt */
    @f(c = "androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1", f = "RemoteMediatorAccessor.kt", l = {338}, m = "invokeSuspend")
    /* renamed from: g.r.y0$d */
    /* loaded from: classes2.dex */
    public static final class C8070d extends AbstractC11745k implements InterfaceC11771p<InterfaceC13932m0, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        int f19424c;

        /* renamed from: d */
        final /* synthetic */ C8066y0<Key, Value> f19425d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RemoteMediatorAccessor.kt */
        @f(c = "androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1", f = "RemoteMediatorAccessor.kt", l = {345}, m = "invokeSuspend")
        /* renamed from: g.r.y0$d$a */
        /* loaded from: classes2.dex */
        public static final class C8071a extends AbstractC11745k implements InterfaceC11767l<InterfaceC11714d<? super C13666w>, Object> {

            /* renamed from: c */
            Object f19426c;

            /* renamed from: d */
            int f19427d;

            /* renamed from: e */
            final /* synthetic */ C8066y0<Key, Value> f19428e;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: RemoteMediatorAccessor.kt */
            /* renamed from: g.r.y0$d$a$a */
            /* loaded from: classes2.dex */
            public static final class C8072a extends AbstractC11802m implements InterfaceC11767l<C7820a<Key, Value>, C13287o<? extends EnumC7830b0, ? extends C8053w0<Key, Value>>> {

                /* renamed from: c */
                public static final C8072a f19429c = new C8072a();

                C8072a() {
                    super(1);
                }

                @Override // kotlin.p483e0.p484c.InterfaceC11767l
                /* renamed from: a */
                public final C13287o<EnumC7830b0, C8053w0<Key, Value>> invoke(C7820a<Key, Value> c7820a) {
                    l.f(c7820a, "it");
                    return c7820a.m17231g();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: RemoteMediatorAccessor.kt */
            /* renamed from: g.r.y0$d$a$b */
            /* loaded from: classes2.dex */
            public static final class C8073b extends AbstractC11802m implements InterfaceC11767l<C7820a<Key, Value>, C13666w> {

                /* renamed from: c */
                final /* synthetic */ EnumC7830b0 f19430c;

                /* renamed from: d */
                final /* synthetic */ AbstractC8056x0.AbstractC8058b f19431d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C8073b(EnumC7830b0 enumC7830b0, AbstractC8056x0.AbstractC8058b abstractC8058b) {
                    super(1);
                    this.f19430c = enumC7830b0;
                    this.f19431d = abstractC8058b;
                }

                /* renamed from: a */
                public final void m16788a(C7820a<Key, Value> c7820a) {
                    l.f(c7820a, "it");
                    c7820a.m17235c(this.f19430c);
                    if (((AbstractC8056x0.AbstractC8058b.C8060b) this.f19431d).m16806a()) {
                        c7820a.m17229i(this.f19430c, C7820a.EnumC7821a.COMPLETED);
                    }
                }

                @Override // kotlin.p483e0.p484c.InterfaceC11767l
                public /* bridge */ /* synthetic */ C13666w invoke(Object obj) {
                    m16788a((C7820a) obj);
                    return C13666w.f30112a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: RemoteMediatorAccessor.kt */
            /* renamed from: g.r.y0$d$a$c */
            /* loaded from: classes2.dex */
            public static final class C8074c extends AbstractC11802m implements InterfaceC11767l<C7820a<Key, Value>, C13666w> {

                /* renamed from: c */
                final /* synthetic */ EnumC7830b0 f19432c;

                /* renamed from: d */
                final /* synthetic */ AbstractC8056x0.AbstractC8058b f19433d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C8074c(EnumC7830b0 enumC7830b0, AbstractC8056x0.AbstractC8058b abstractC8058b) {
                    super(1);
                    this.f19432c = enumC7830b0;
                    this.f19433d = abstractC8058b;
                }

                /* renamed from: a */
                public final void m16787a(C7820a<Key, Value> c7820a) {
                    l.f(c7820a, "it");
                    c7820a.m17235c(this.f19432c);
                    c7820a.m17228j(this.f19432c, new AbstractC8061y.C8062a(((AbstractC8056x0.AbstractC8058b.C8059a) this.f19433d).m16807a()));
                }

                @Override // kotlin.p483e0.p484c.InterfaceC11767l
                public /* bridge */ /* synthetic */ C13666w invoke(Object obj) {
                    m16787a((C7820a) obj);
                    return C13666w.f30112a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8071a(C8066y0<Key, Value> c8066y0, InterfaceC11714d<? super C8071a> interfaceC11714d) {
                super(1, interfaceC11714d);
                this.f19428e = c8066y0;
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final InterfaceC11714d<C13666w> create(InterfaceC11714d<?> interfaceC11714d) {
                return new C8071a(this.f19428e, interfaceC11714d);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
            /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0052 -> B:17:0x0056). Please submit an issue!!! */
            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = kotlin.p476c0.p477j.C11728b.m10391d()
                    int r1 = r7.f19427d
                    r2 = 1
                    if (r1 == 0) goto L1e
                    if (r1 != r2) goto L16
                    java.lang.Object r1 = r7.f19426c
                    g.r.b0 r1 = (p201g.p259r.EnumC7830b0) r1
                    kotlin.C13291q.m5357b(r8)
                    r3 = r1
                    r1 = r0
                    r0 = r7
                    goto L56
                L16:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1e:
                    kotlin.C13291q.m5357b(r8)
                    r8 = r7
                L22:
                    g.r.y0<Key, Value> r1 = r8.f19428e
                    g.r.b r1 = p201g.p259r.C8066y0.m16797d(r1)
                    g.r.y0$d$a$a r3 = p201g.p259r.C8066y0.C8070d.C8071a.C8072a.f19429c
                    java.lang.Object r1 = r1.m17211b(r3)
                    kotlin.o r1 = (kotlin.C13287o) r1
                    if (r1 != 0) goto L35
                    kotlin.w r8 = kotlin.C13666w.f30112a
                    return r8
                L35:
                    java.lang.Object r3 = r1.m5366a()
                    g.r.b0 r3 = (p201g.p259r.EnumC7830b0) r3
                    java.lang.Object r1 = r1.m5365b()
                    g.r.w0 r1 = (p201g.p259r.C8053w0) r1
                    g.r.y0<Key, Value> r4 = r8.f19428e
                    g.r.x0 r4 = p201g.p259r.C8066y0.m16795f(r4)
                    r8.f19426c = r3
                    r8.f19427d = r2
                    java.lang.Object r1 = r4.m16809b(r3, r1, r8)
                    if (r1 != r0) goto L52
                    return r0
                L52:
                    r6 = r0
                    r0 = r8
                    r8 = r1
                    r1 = r6
                L56:
                    g.r.x0$b r8 = (p201g.p259r.AbstractC8056x0.AbstractC8058b) r8
                    boolean r4 = r8 instanceof p201g.p259r.AbstractC8056x0.AbstractC8058b.C8060b
                    if (r4 == 0) goto L6b
                    g.r.y0<Key, Value> r4 = r0.f19428e
                    g.r.b r4 = p201g.p259r.C8066y0.m16797d(r4)
                    g.r.y0$d$a$b r5 = new g.r.y0$d$a$b
                    r5.<init>(r3, r8)
                    r4.m17211b(r5)
                    goto L7d
                L6b:
                    boolean r4 = r8 instanceof p201g.p259r.AbstractC8056x0.AbstractC8058b.C8059a
                    if (r4 == 0) goto L7d
                    g.r.y0<Key, Value> r4 = r0.f19428e
                    g.r.b r4 = p201g.p259r.C8066y0.m16797d(r4)
                    g.r.y0$d$a$c r5 = new g.r.y0$d$a$c
                    r5.<init>(r3, r8)
                    r4.m17211b(r5)
                L7d:
                    r8 = r0
                    r0 = r1
                    goto L22
                */
                throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C8066y0.C8070d.C8071a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11767l
            /* renamed from: m */
            public final Object invoke(InterfaceC11714d<? super C13666w> interfaceC11714d) {
                return ((C8071a) create(interfaceC11714d)).invokeSuspend(C13666w.f30112a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8070d(C8066y0<Key, Value> c8066y0, InterfaceC11714d<? super C8070d> interfaceC11714d) {
            super(2, interfaceC11714d);
            this.f19425d = c8066y0;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            return new C8070d(this.f19425d, interfaceC11714d);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public final Object invoke(InterfaceC13932m0 interfaceC13932m0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return ((C8070d) create(interfaceC13932m0, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            m10387d = C11734d.m10387d();
            int i = this.f19424c;
            if (i == 0) {
                C13291q.m5357b(obj);
                C7892h1 c7892h1 = ((C8066y0) this.f19425d).f19417d;
                C8071a c8071a = new C8071a(this.f19425d, null);
                this.f19424c = 1;
                if (c7892h1.m17105b(1, c8071a, this) == m10387d) {
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
    /* compiled from: RemoteMediatorAccessor.kt */
    @f(c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1", f = "RemoteMediatorAccessor.kt", l = {266}, m = "invokeSuspend")
    /* renamed from: g.r.y0$e */
    /* loaded from: classes2.dex */
    public static final class C8075e extends AbstractC11745k implements InterfaceC11771p<InterfaceC13932m0, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        Object f19434c;

        /* renamed from: d */
        int f19435d;

        /* renamed from: e */
        final /* synthetic */ C8066y0<Key, Value> f19436e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RemoteMediatorAccessor.kt */
        @f(c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1", f = "RemoteMediatorAccessor.kt", l = {273}, m = "invokeSuspend")
        /* renamed from: g.r.y0$e$a */
        /* loaded from: classes2.dex */
        public static final class C8076a extends AbstractC11745k implements InterfaceC11767l<InterfaceC11714d<? super C13666w>, Object> {

            /* renamed from: c */
            Object f19437c;

            /* renamed from: d */
            Object f19438d;

            /* renamed from: e */
            int f19439e;

            /* renamed from: f */
            final /* synthetic */ C8066y0<Key, Value> f19440f;

            /* renamed from: w */
            final /* synthetic */ C11810u f19441w;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: RemoteMediatorAccessor.kt */
            /* renamed from: g.r.y0$e$a$a */
            /* loaded from: classes2.dex */
            public static final class C8077a extends AbstractC11802m implements InterfaceC11767l<C7820a<Key, Value>, Boolean> {

                /* renamed from: c */
                final /* synthetic */ AbstractC8056x0.AbstractC8058b f19442c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C8077a(AbstractC8056x0.AbstractC8058b abstractC8058b) {
                    super(1);
                    this.f19442c = abstractC8058b;
                }

                @Override // kotlin.p483e0.p484c.InterfaceC11767l
                /* renamed from: a */
                public final Boolean invoke(C7820a<Key, Value> c7820a) {
                    l.f(c7820a, "it");
                    c7820a.m17235c(EnumC7830b0.REFRESH);
                    if (((AbstractC8056x0.AbstractC8058b.C8060b) this.f19442c).m16806a()) {
                        c7820a.m17229i(EnumC7830b0.REFRESH, C7820a.EnumC7821a.COMPLETED);
                        c7820a.m17229i(EnumC7830b0.PREPEND, C7820a.EnumC7821a.COMPLETED);
                        c7820a.m17229i(EnumC7830b0.APPEND, C7820a.EnumC7821a.COMPLETED);
                        c7820a.m17234d();
                    } else {
                        c7820a.m17229i(EnumC7830b0.PREPEND, C7820a.EnumC7821a.UNBLOCKED);
                        c7820a.m17229i(EnumC7830b0.APPEND, C7820a.EnumC7821a.UNBLOCKED);
                    }
                    c7820a.m17228j(EnumC7830b0.PREPEND, null);
                    c7820a.m17228j(EnumC7830b0.APPEND, null);
                    return Boolean.valueOf(c7820a.m17231g() != null);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: RemoteMediatorAccessor.kt */
            /* renamed from: g.r.y0$e$a$b */
            /* loaded from: classes2.dex */
            public static final class C8078b extends AbstractC11802m implements InterfaceC11767l<C7820a<Key, Value>, Boolean> {

                /* renamed from: c */
                final /* synthetic */ AbstractC8056x0.AbstractC8058b f19443c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C8078b(AbstractC8056x0.AbstractC8058b abstractC8058b) {
                    super(1);
                    this.f19443c = abstractC8058b;
                }

                @Override // kotlin.p483e0.p484c.InterfaceC11767l
                /* renamed from: a */
                public final Boolean invoke(C7820a<Key, Value> c7820a) {
                    l.f(c7820a, "it");
                    c7820a.m17235c(EnumC7830b0.REFRESH);
                    c7820a.m17228j(EnumC7830b0.REFRESH, new AbstractC8061y.C8062a(((AbstractC8056x0.AbstractC8058b.C8059a) this.f19443c).m16807a()));
                    return Boolean.valueOf(c7820a.m17231g() != null);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: RemoteMediatorAccessor.kt */
            /* renamed from: g.r.y0$e$a$c */
            /* loaded from: classes2.dex */
            public static final class C8079c extends AbstractC11802m implements InterfaceC11767l<C7820a<Key, Value>, C8053w0<Key, Value>> {

                /* renamed from: c */
                public static final C8079c f19444c = new C8079c();

                C8079c() {
                    super(1);
                }

                @Override // kotlin.p483e0.p484c.InterfaceC11767l
                /* renamed from: a */
                public final C8053w0<Key, Value> invoke(C7820a<Key, Value> c7820a) {
                    l.f(c7820a, "it");
                    return c7820a.m17230h();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8076a(C8066y0<Key, Value> c8066y0, C11810u c11810u, InterfaceC11714d<? super C8076a> interfaceC11714d) {
                super(1, interfaceC11714d);
                this.f19440f = c8066y0;
                this.f19441w = c11810u;
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final InterfaceC11714d<C13666w> create(InterfaceC11714d<?> interfaceC11714d) {
                return new C8076a(this.f19440f, this.f19441w, interfaceC11714d);
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final Object invokeSuspend(Object obj) {
                Object m10387d;
                C8066y0<Key, Value> c8066y0;
                C11810u c11810u;
                boolean booleanValue;
                m10387d = C11734d.m10387d();
                int i = this.f19439e;
                if (i == 0) {
                    C13291q.m5357b(obj);
                    C8053w0<Key, Value> c8053w0 = (C8053w0) ((C8066y0) this.f19440f).f19416c.m17211b(C8079c.f19444c);
                    if (c8053w0 != null) {
                        c8066y0 = this.f19440f;
                        C11810u c11810u2 = this.f19441w;
                        AbstractC8056x0 abstractC8056x0 = ((C8066y0) c8066y0).f19415b;
                        EnumC7830b0 enumC7830b0 = EnumC7830b0.REFRESH;
                        this.f19437c = c8066y0;
                        this.f19438d = c11810u2;
                        this.f19439e = 1;
                        obj = abstractC8056x0.m16809b(enumC7830b0, c8053w0, this);
                        if (obj == m10387d) {
                            return m10387d;
                        }
                        c11810u = c11810u2;
                    }
                    return C13666w.f30112a;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    c11810u = (C11810u) this.f19438d;
                    c8066y0 = (C8066y0) this.f19437c;
                    C13291q.m5357b(obj);
                }
                AbstractC8056x0.AbstractC8058b abstractC8058b = (AbstractC8056x0.AbstractC8058b) obj;
                if (abstractC8058b instanceof AbstractC8056x0.AbstractC8058b.C8060b) {
                    booleanValue = ((Boolean) ((C8066y0) c8066y0).f19416c.m17211b(new C8077a(abstractC8058b))).booleanValue();
                } else if (abstractC8058b instanceof AbstractC8056x0.AbstractC8058b.C8059a) {
                    booleanValue = ((Boolean) ((C8066y0) c8066y0).f19416c.m17211b(new C8078b(abstractC8058b))).booleanValue();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                c11810u.f26497c = booleanValue;
                return C13666w.f30112a;
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11767l
            /* renamed from: m */
            public final Object invoke(InterfaceC11714d<? super C13666w> interfaceC11714d) {
                return ((C8076a) create(interfaceC11714d)).invokeSuspend(C13666w.f30112a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8075e(C8066y0<Key, Value> c8066y0, InterfaceC11714d<? super C8075e> interfaceC11714d) {
            super(2, interfaceC11714d);
            this.f19436e = c8066y0;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            return new C8075e(this.f19436e, interfaceC11714d);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public final Object invoke(InterfaceC13932m0 interfaceC13932m0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return ((C8075e) create(interfaceC13932m0, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            C11810u c11810u;
            m10387d = C11734d.m10387d();
            int i = this.f19435d;
            if (i == 0) {
                C13291q.m5357b(obj);
                C11810u c11810u2 = new C11810u();
                C7892h1 c7892h1 = ((C8066y0) this.f19436e).f19417d;
                C8076a c8076a = new C8076a(this.f19436e, c11810u2, null);
                this.f19434c = c11810u2;
                this.f19435d = 1;
                if (c7892h1.m17105b(2, c8076a, this) == m10387d) {
                    return m10387d;
                }
                c11810u = c11810u2;
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                c11810u = (C11810u) this.f19434c;
                C13291q.m5357b(obj);
            }
            if (c11810u.f26497c) {
                this.f19436e.m16793h();
            }
            return C13666w.f30112a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RemoteMediatorAccessor.kt */
    /* renamed from: g.r.y0$f */
    /* loaded from: classes2.dex */
    public static final class C8080f extends AbstractC11802m implements InterfaceC11767l<C7820a<Key, Value>, Boolean> {

        /* renamed from: c */
        final /* synthetic */ EnumC7830b0 f19445c;

        /* renamed from: d */
        final /* synthetic */ C8053w0<Key, Value> f19446d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8080f(EnumC7830b0 enumC7830b0, C8053w0<Key, Value> c8053w0) {
            super(1);
            this.f19445c = enumC7830b0;
            this.f19446d = c8053w0;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final Boolean invoke(C7820a<Key, Value> c7820a) {
            l.f(c7820a, "it");
            return Boolean.valueOf(c7820a.m17237a(this.f19445c, this.f19446d));
        }
    }

    /* compiled from: RemoteMediatorAccessor.kt */
    /* renamed from: g.r.y0$g */
    /* loaded from: classes2.dex */
    static final class C8081g extends AbstractC11802m implements InterfaceC11767l<C7820a<Key, Value>, C13666w> {

        /* renamed from: c */
        final /* synthetic */ List<EnumC7830b0> f19447c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8081g(List<EnumC7830b0> list) {
            super(1);
            this.f19447c = list;
        }

        /* renamed from: a */
        public final void m16781a(C7820a<Key, Value> c7820a) {
            l.f(c7820a, "accessorState");
            C7825a0 m17233e = c7820a.m17233e();
            boolean z = m17233e.m17216g() instanceof AbstractC8061y.C8062a;
            c7820a.m17236b();
            if (z) {
                this.f19447c.add(EnumC7830b0.REFRESH);
                c7820a.m17229i(EnumC7830b0.REFRESH, C7820a.EnumC7821a.UNBLOCKED);
            }
            if (m17233e.m17218e() instanceof AbstractC8061y.C8062a) {
                if (!z) {
                    this.f19447c.add(EnumC7830b0.APPEND);
                }
                c7820a.m17235c(EnumC7830b0.APPEND);
            }
            if (m17233e.m17217f() instanceof AbstractC8061y.C8062a) {
                if (!z) {
                    this.f19447c.add(EnumC7830b0.PREPEND);
                }
                c7820a.m17235c(EnumC7830b0.PREPEND);
            }
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ C13666w invoke(Object obj) {
            m16781a((C7820a) obj);
            return C13666w.f30112a;
        }
    }

    public C8066y0(InterfaceC13932m0 interfaceC13932m0, AbstractC8056x0<Key, Value> abstractC8056x0) {
        l.f(interfaceC13932m0, "scope");
        l.f(abstractC8056x0, "remoteMediator");
        this.f19414a = interfaceC13932m0;
        this.f19415b = abstractC8056x0;
        this.f19416c = new C7829b<>();
        this.f19417d = new C7892h1(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final void m16793h() {
        C13916j.m3412b(this.f19414a, null, null, new C8070d(this, null), 3, null);
    }

    /* renamed from: i */
    private final void m16792i() {
        C13916j.m3412b(this.f19414a, null, null, new C8075e(this, null), 3, null);
    }

    @Override // p201g.p259r.InterfaceC7831b1
    /* renamed from: a */
    public void mo16799a(EnumC7830b0 enumC7830b0, C8053w0<Key, Value> c8053w0) {
        l.f(enumC7830b0, "loadType");
        l.f(c8053w0, "pagingState");
        if (((Boolean) this.f19416c.m17211b(new C8080f(enumC7830b0, c8053w0))).booleanValue()) {
            if (C8067a.f19418a[enumC7830b0.ordinal()] == 1) {
                m16792i();
            } else {
                m16793h();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    @Override // p201g.p259r.InterfaceC8083z0
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo16780b(kotlin.p476c0.InterfaceC11714d<? super p201g.p259r.AbstractC8056x0.EnumC8057a> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p201g.p259r.C8066y0.C8068b
            if (r0 == 0) goto L13
            r0 = r5
            g.r.y0$b r0 = (p201g.p259r.C8066y0.C8068b) r0
            int r1 = r0.f19422f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19422f = r1
            goto L18
        L13:
            g.r.y0$b r0 = new g.r.y0$b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f19420d
            java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
            int r2 = r0.f19422f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f19419c
            g.r.y0 r0 = (p201g.p259r.C8066y0) r0
            kotlin.C13291q.m5357b(r5)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.C13291q.m5357b(r5)
            g.r.x0<Key, Value> r5 = r4.f19415b
            r0.f19419c = r4
            r0.f19422f = r3
            java.lang.Object r5 = r5.m16810a(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            r1 = r5
            g.r.x0$a r1 = (p201g.p259r.AbstractC8056x0.EnumC8057a) r1
            g.r.x0$a r2 = p201g.p259r.AbstractC8056x0.EnumC8057a.LAUNCH_INITIAL_REFRESH
            if (r1 != r2) goto L54
            g.r.b<Key, Value> r0 = r0.f19416c
            g.r.y0$c r1 = p201g.p259r.C8066y0.C8069c.f19423c
            r0.m17211b(r1)
        L54:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C8066y0.mo16780b(kotlin.c0.d):java.lang.Object");
    }

    @Override // p201g.p259r.InterfaceC7831b1
    /* renamed from: c */
    public void mo16798c(C8053w0<Key, Value> c8053w0) {
        l.f(c8053w0, "pagingState");
        ArrayList<EnumC7830b0> arrayList = new ArrayList();
        this.f19416c.m17211b(new C8081g(arrayList));
        for (EnumC7830b0 enumC7830b0 : arrayList) {
            mo16799a(enumC7830b0, c8053w0);
        }
    }

    @Override // p201g.p259r.InterfaceC8083z0
    public InterfaceC13970e0<C7825a0> getState() {
        return this.f19416c.m17212a();
    }
}

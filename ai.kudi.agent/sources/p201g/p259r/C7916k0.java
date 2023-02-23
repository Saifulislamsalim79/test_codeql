package p201g.p259r;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.c0.k.a.f;
import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11738d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p484c.InterfaceC11773r;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11800j;
import kotlinx.coroutines.C13916j;
import kotlinx.coroutines.C14057t1;
import kotlinx.coroutines.InterfaceC13932m0;
import kotlinx.coroutines.InterfaceC13947p1;
import kotlinx.coroutines.InterfaceC14112z;
import kotlinx.coroutines.channels.InterfaceC13801x;
import kotlinx.coroutines.p559q2.C13971f;
import kotlinx.coroutines.p559q2.InterfaceC13964d;
import kotlinx.coroutines.p559q2.InterfaceC13969e;
import p201g.p259r.AbstractC7905j0;
import p201g.p259r.AbstractC8061y;
/* compiled from: PageFetcher.kt */
/* renamed from: g.r.k0 */
/* loaded from: classes2.dex */
public final class C7916k0<Key, Value> {

    /* renamed from: a */
    private final InterfaceC11767l<InterfaceC11714d<? super AbstractC8041v0<Key, Value>>, Object> f18987a;

    /* renamed from: b */
    private final Key f18988b;

    /* renamed from: c */
    private final C8003q0 f18989c;

    /* renamed from: d */
    private final C7912k<Boolean> f18990d;

    /* renamed from: e */
    private final C7912k<C13666w> f18991e;

    /* renamed from: f */
    private final InterfaceC13964d<C8013r0<Value>> f18992f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PageFetcher.kt */
    /* renamed from: g.r.k0$a */
    /* loaded from: classes2.dex */
    public static final class C7917a<Key, Value> {

        /* renamed from: a */
        private final C7942l0<Key, Value> f18993a;

        /* renamed from: b */
        private final C8053w0<Key, Value> f18994b;

        /* renamed from: c */
        private final InterfaceC13947p1 f18995c;

        public C7917a(C7942l0<Key, Value> c7942l0, C8053w0<Key, Value> c8053w0, InterfaceC13947p1 interfaceC13947p1) {
            l.f(c7942l0, "snapshot");
            l.f(interfaceC13947p1, "job");
            this.f18993a = c7942l0;
            this.f18994b = c8053w0;
            this.f18995c = interfaceC13947p1;
        }

        /* renamed from: a */
        public final InterfaceC13947p1 m17042a() {
            return this.f18995c;
        }

        /* renamed from: b */
        public final C7942l0<Key, Value> m17041b() {
            return this.f18993a;
        }

        /* renamed from: c */
        public final C8053w0<Key, Value> m17040c() {
            return this.f18994b;
        }
    }

    /* compiled from: PageFetcher.kt */
    /* renamed from: g.r.k0$b */
    /* loaded from: classes2.dex */
    public final class C7918b<Key, Value> implements InterfaceC7971l1 {

        /* renamed from: a */
        private final C7942l0<Key, Value> f18996a;

        /* renamed from: b */
        private final C7912k<C13666w> f18997b;

        /* renamed from: c */
        final /* synthetic */ C7916k0<Key, Value> f18998c;

        public C7918b(C7916k0 c7916k0, C7942l0<Key, Value> c7942l0, C7912k<C13666w> c7912k) {
            l.f(c7916k0, "this$0");
            l.f(c7942l0, "pageFetcherSnapshot");
            l.f(c7912k, "retryEventBus");
            this.f18998c = c7916k0;
            this.f18996a = c7942l0;
            this.f18997b = c7912k;
        }

        @Override // p201g.p259r.InterfaceC7971l1
        /* renamed from: a */
        public void mo16895a() {
            this.f18997b.m17055b(C13666w.f30112a);
        }

        @Override // p201g.p259r.InterfaceC7971l1
        /* renamed from: b */
        public void mo16894b() {
            this.f18998c.m17043l();
        }

        @Override // p201g.p259r.InterfaceC7971l1
        /* renamed from: c */
        public void mo16893c(AbstractC7982n1 abstractC7982n1) {
            l.f(abstractC7982n1, "viewportHint");
            this.f18996a.m16995p(abstractC7982n1);
        }
    }

    /* compiled from: PageFetcher.kt */
    @f(c = "androidx.paging.PageFetcher$flow$1", f = "PageFetcher.kt", l = {233}, m = "invokeSuspend")
    /* renamed from: g.r.k0$c */
    /* loaded from: classes2.dex */
    static final class C7919c extends AbstractC11745k implements InterfaceC11771p<InterfaceC7881f1<C8013r0<Value>>, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        int f18999c;

        /* renamed from: d */
        private /* synthetic */ Object f19000d;

        /* renamed from: e */
        final /* synthetic */ AbstractC8056x0<Key, Value> f19001e;

        /* renamed from: f */
        final /* synthetic */ C7916k0<Key, Value> f19002f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PageFetcher.kt */
        @f(c = "androidx.paging.PageFetcher$flow$1$1", f = "PageFetcher.kt", l = {62, 62}, m = "invokeSuspend")
        /* renamed from: g.r.k0$c$a */
        /* loaded from: classes2.dex */
        public static final class C7920a extends AbstractC11745k implements InterfaceC11771p<InterfaceC13969e<? super Boolean>, InterfaceC11714d<? super C13666w>, Object> {

            /* renamed from: c */
            int f19003c;

            /* renamed from: d */
            private /* synthetic */ Object f19004d;

            /* renamed from: e */
            final /* synthetic */ InterfaceC8083z0<Key, Value> f19005e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7920a(InterfaceC8083z0<Key, Value> interfaceC8083z0, InterfaceC11714d<? super C7920a> interfaceC11714d) {
                super(2, interfaceC11714d);
                this.f19005e = interfaceC8083z0;
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
                C7920a c7920a = new C7920a(this.f19005e, interfaceC11714d);
                c7920a.f19004d = obj;
                return c7920a;
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0052 A[RETURN] */
            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = kotlin.p476c0.p477j.C11728b.m10391d()
                    int r1 = r6.f19003c
                    r2 = 0
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L23
                    if (r1 == r4) goto L1b
                    if (r1 != r3) goto L13
                    kotlin.C13291q.m5357b(r7)
                    goto L53
                L13:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1b:
                    java.lang.Object r1 = r6.f19004d
                    kotlinx.coroutines.q2.e r1 = (kotlinx.coroutines.p559q2.InterfaceC13969e) r1
                    kotlin.C13291q.m5357b(r7)
                    goto L3c
                L23:
                    kotlin.C13291q.m5357b(r7)
                    java.lang.Object r7 = r6.f19004d
                    r1 = r7
                    kotlinx.coroutines.q2.e r1 = (kotlinx.coroutines.p559q2.InterfaceC13969e) r1
                    g.r.z0<Key, Value> r7 = r6.f19005e
                    if (r7 != 0) goto L31
                    r7 = r2
                    goto L3e
                L31:
                    r6.f19004d = r1
                    r6.f19003c = r4
                    java.lang.Object r7 = r7.mo16780b(r6)
                    if (r7 != r0) goto L3c
                    return r0
                L3c:
                    g.r.x0$a r7 = (p201g.p259r.AbstractC8056x0.EnumC8057a) r7
                L3e:
                    g.r.x0$a r5 = p201g.p259r.AbstractC8056x0.EnumC8057a.LAUNCH_INITIAL_REFRESH
                    if (r7 != r5) goto L43
                    goto L44
                L43:
                    r4 = 0
                L44:
                    java.lang.Boolean r7 = kotlin.p476c0.p478k.p479a.C11736b.m10382a(r4)
                    r6.f19004d = r2
                    r6.f19003c = r3
                    java.lang.Object r7 = r1.emit(r7, r6)
                    if (r7 != r0) goto L53
                    return r0
                L53:
                    kotlin.w r7 = kotlin.C13666w.f30112a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C7916k0.C7919c.C7920a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11771p
            /* renamed from: m */
            public final Object invoke(InterfaceC13969e<? super Boolean> interfaceC13969e, InterfaceC11714d<? super C13666w> interfaceC11714d) {
                return ((C7920a) create(interfaceC13969e, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PageFetcher.kt */
        @f(c = "androidx.paging.PageFetcher$flow$1$2", f = "PageFetcher.kt", l = {66, 70}, m = "invokeSuspend")
        /* renamed from: g.r.k0$c$b */
        /* loaded from: classes2.dex */
        public static final class C7921b extends AbstractC11745k implements InterfaceC11772q<C7917a<Key, Value>, Boolean, InterfaceC11714d<? super C7917a<Key, Value>>, Object> {

            /* renamed from: c */
            Object f19006c;

            /* renamed from: d */
            int f19007d;

            /* renamed from: e */
            /* synthetic */ Object f19008e;

            /* renamed from: f */
            /* synthetic */ boolean f19009f;

            /* renamed from: w */
            final /* synthetic */ C7916k0<Key, Value> f19010w;

            /* renamed from: x */
            final /* synthetic */ InterfaceC8083z0<Key, Value> f19011x;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PageFetcher.kt */
            /* renamed from: g.r.k0$c$b$a */
            /* loaded from: classes2.dex */
            public /* synthetic */ class C7922a extends C11800j implements InterfaceC11756a<C13666w> {
                C7922a(Object obj) {
                    super(0, obj, C7916k0.class, "refresh", "refresh()V", 0);
                }

                @Override // kotlin.p483e0.p484c.InterfaceC11756a
                public /* bridge */ /* synthetic */ C13666w invoke() {
                    m17036l();
                    return C13666w.f30112a;
                }

                /* renamed from: l */
                public final void m17036l() {
                    ((C7916k0) this.f26478d).m17043l();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7921b(C7916k0<Key, Value> c7916k0, InterfaceC8083z0<Key, Value> interfaceC8083z0, InterfaceC11714d<? super C7921b> interfaceC11714d) {
                super(3, interfaceC11714d);
                this.f19010w = c7916k0;
                this.f19011x = interfaceC8083z0;
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11772q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Boolean bool, Object obj2) {
                return m17037m((C7917a) obj, bool.booleanValue(), (InterfaceC11714d) obj2);
            }

            /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x00b8  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x00ba  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x00c0  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x00d7  */
            /* JADX WARN: Removed duplicated region for block: B:64:0x00d9  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x00df  */
            /* JADX WARN: Removed duplicated region for block: B:70:0x00e9  */
            /* JADX WARN: Removed duplicated region for block: B:73:0x00f3  */
            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                /*
                    Method dump skipped, instructions count: 292
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C7916k0.C7919c.C7921b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* renamed from: m */
            public final Object m17037m(C7917a<Key, Value> c7917a, boolean z, InterfaceC11714d<? super C7917a<Key, Value>> interfaceC11714d) {
                C7921b c7921b = new C7921b(this.f19010w, this.f19011x, interfaceC11714d);
                c7921b.f19008e = c7917a;
                c7921b.f19009f = z;
                return c7921b.invokeSuspend(C13666w.f30112a);
            }
        }

        /* compiled from: Collect.kt */
        /* renamed from: g.r.k0$c$c */
        /* loaded from: classes2.dex */
        public static final class C7923c implements InterfaceC13969e<C8013r0<Value>> {

            /* renamed from: c */
            final /* synthetic */ InterfaceC7881f1 f19012c;

            public C7923c(InterfaceC7881f1 interfaceC7881f1) {
                this.f19012c = interfaceC7881f1;
            }

            @Override // kotlinx.coroutines.p559q2.InterfaceC13969e
            public Object emit(C8013r0<Value> c8013r0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
                Object m10387d;
                Object mo3639o = this.f19012c.mo3639o(c8013r0, interfaceC11714d);
                m10387d = C11734d.m10387d();
                return mo3639o == m10387d ? mo3639o : C13666w.f30112a;
            }
        }

        /* compiled from: FlowExt.kt */
        @f(c = "androidx.paging.PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1", f = "PageFetcher.kt", l = {226}, m = "invokeSuspend")
        /* renamed from: g.r.k0$c$d */
        /* loaded from: classes2.dex */
        public static final class C7924d extends AbstractC11745k implements InterfaceC11772q<InterfaceC13969e<? super C8013r0<Value>>, C7917a<Key, Value>, InterfaceC11714d<? super C13666w>, Object> {

            /* renamed from: c */
            int f19013c;

            /* renamed from: d */
            private /* synthetic */ Object f19014d;

            /* renamed from: e */
            /* synthetic */ Object f19015e;

            /* renamed from: f */
            final /* synthetic */ C7916k0 f19016f;

            /* renamed from: w */
            final /* synthetic */ InterfaceC8083z0 f19017w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7924d(InterfaceC11714d interfaceC11714d, C7916k0 c7916k0, InterfaceC8083z0 interfaceC8083z0) {
                super(3, interfaceC11714d);
                this.f19016f = c7916k0;
                this.f19017w = interfaceC8083z0;
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final Object invokeSuspend(Object obj) {
                Object m10387d;
                m10387d = C11734d.m10387d();
                int i = this.f19013c;
                if (i == 0) {
                    C13291q.m5357b(obj);
                    C7917a c7917a = (C7917a) this.f19015e;
                    C8013r0 c8013r0 = new C8013r0(this.f19016f.m17045j(c7917a.m17041b(), c7917a.m17042a(), this.f19017w), new C7918b(this.f19016f, c7917a.m17041b(), this.f19016f.f18991e));
                    this.f19013c = 1;
                    if (((InterfaceC13969e) this.f19014d).emit(c8013r0, this) == m10387d) {
                        return m10387d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13291q.m5357b(obj);
                }
                return C13666w.f30112a;
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11772q
            /* renamed from: m */
            public final Object invoke(InterfaceC13969e<? super C8013r0<Value>> interfaceC13969e, C7917a<Key, Value> c7917a, InterfaceC11714d<? super C13666w> interfaceC11714d) {
                C7924d c7924d = new C7924d(interfaceC11714d, this.f19016f, this.f19017w);
                c7924d.f19014d = interfaceC13969e;
                c7924d.f19015e = c7917a;
                return c7924d.invokeSuspend(C13666w.f30112a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7919c(AbstractC8056x0<Key, Value> abstractC8056x0, C7916k0<Key, Value> c7916k0, InterfaceC11714d<? super C7919c> interfaceC11714d) {
            super(2, interfaceC11714d);
            this.f19001e = abstractC8056x0;
            this.f19002f = c7916k0;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            C7919c c7919c = new C7919c(this.f19001e, this.f19002f, interfaceC11714d);
            c7919c.f19000d = obj;
            return c7919c;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            m10387d = C11734d.m10387d();
            int i = this.f18999c;
            if (i == 0) {
                C13291q.m5357b(obj);
                InterfaceC7881f1 interfaceC7881f1 = (InterfaceC7881f1) this.f19000d;
                AbstractC8056x0<Key, Value> abstractC8056x0 = this.f19001e;
                InterfaceC8083z0 m17213a = abstractC8056x0 == null ? null : C7828a1.m17213a(interfaceC7881f1, abstractC8056x0);
                InterfaceC13964d m16902d = C8004r.m16902d(C13971f.m3321m(C8004r.m16903c(C13971f.m3314t(((C7916k0) this.f19002f).f18990d.m17056a(), new C7920a(m17213a, null)), null, new C7921b(this.f19002f, m17213a, null))), new C7924d(null, this.f19002f, m17213a));
                C7923c c7923c = new C7923c(interfaceC7881f1);
                this.f18999c = 1;
                if (m16902d.mo3175a(c7923c, this) == m10387d) {
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
        public final Object invoke(InterfaceC7881f1<C8013r0<Value>> interfaceC7881f1, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return ((C7919c) create(interfaceC7881f1, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PageFetcher.kt */
    @f(c = "androidx.paging.PageFetcher", f = "PageFetcher.kt", l = {188}, m = "generateNewPagingSource")
    /* renamed from: g.r.k0$d */
    /* loaded from: classes2.dex */
    public static final class C7925d extends AbstractC11738d {

        /* renamed from: c */
        Object f19018c;

        /* renamed from: d */
        Object f19019d;

        /* renamed from: e */
        /* synthetic */ Object f19020e;

        /* renamed from: f */
        final /* synthetic */ C7916k0<Key, Value> f19021f;

        /* renamed from: w */
        int f19022w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7925d(C7916k0<Key, Value> c7916k0, InterfaceC11714d<? super C7925d> interfaceC11714d) {
            super(interfaceC11714d);
            this.f19021f = c7916k0;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            this.f19020e = obj;
            this.f19022w |= Integer.MIN_VALUE;
            return this.f19021f.m17047h(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PageFetcher.kt */
    /* renamed from: g.r.k0$e */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C7926e extends C11800j implements InterfaceC11756a<C13666w> {
        C7926e(Object obj) {
            super(0, obj, C7916k0.class, "invalidate", "invalidate()V", 0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        public /* bridge */ /* synthetic */ C13666w invoke() {
            m17034l();
            return C13666w.f30112a;
        }

        /* renamed from: l */
        public final void m17034l() {
            ((C7916k0) this.f26478d).m17044k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PageFetcher.kt */
    /* renamed from: g.r.k0$f */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C7927f extends C11800j implements InterfaceC11756a<C13666w> {
        C7927f(Object obj) {
            super(0, obj, C7916k0.class, "invalidate", "invalidate()V", 0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        public /* bridge */ /* synthetic */ C13666w invoke() {
            m17033l();
            return C13666w.f30112a;
        }

        /* renamed from: l */
        public final void m17033l() {
            ((C7916k0) this.f26478d).m17044k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PageFetcher.kt */
    @f(c = "androidx.paging.PageFetcher$injectRemoteEvents$1", f = "PageFetcher.kt", l = {233}, m = "invokeSuspend")
    /* renamed from: g.r.k0$g */
    /* loaded from: classes2.dex */
    public static final class C7928g extends AbstractC11745k implements InterfaceC11771p<InterfaceC7881f1<AbstractC7905j0<Value>>, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        int f19023c;

        /* renamed from: d */
        private /* synthetic */ Object f19024d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC8083z0<Key, Value> f19025e;

        /* renamed from: f */
        final /* synthetic */ C7942l0<Key, Value> f19026f;

        /* renamed from: w */
        final /* synthetic */ C7865e0 f19027w;

        /* compiled from: Collect.kt */
        /* renamed from: g.r.k0$g$a */
        /* loaded from: classes2.dex */
        public static final class C7929a implements InterfaceC13969e<AbstractC7905j0<Value>> {

            /* renamed from: c */
            final /* synthetic */ InterfaceC7881f1 f19028c;

            public C7929a(InterfaceC7881f1 interfaceC7881f1) {
                this.f19028c = interfaceC7881f1;
            }

            @Override // kotlinx.coroutines.p559q2.InterfaceC13969e
            public Object emit(AbstractC7905j0<Value> abstractC7905j0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
                Object m10387d;
                Object mo3639o = this.f19028c.mo3639o(abstractC7905j0, interfaceC11714d);
                m10387d = C11734d.m10387d();
                return mo3639o == m10387d ? mo3639o : C13666w.f30112a;
            }
        }

        /* compiled from: FlowExt.kt */
        @f(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1", f = "PageFetcher.kt", l = {159}, m = "invokeSuspend")
        /* renamed from: g.r.k0$g$b */
        /* loaded from: classes2.dex */
        public static final class C7930b extends AbstractC11745k implements InterfaceC11771p<InterfaceC7881f1<AbstractC7905j0<Value>>, InterfaceC11714d<? super C13666w>, Object> {

            /* renamed from: c */
            int f19029c;

            /* renamed from: d */
            private /* synthetic */ Object f19030d;

            /* renamed from: e */
            final /* synthetic */ InterfaceC13964d f19031e;

            /* renamed from: f */
            final /* synthetic */ InterfaceC13964d f19032f;

            /* renamed from: w */
            final /* synthetic */ C7865e0 f19033w;

            /* compiled from: FlowExt.kt */
            @f(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$1", f = "PageFetcher.kt", l = {222}, m = "invokeSuspend")
            /* renamed from: g.r.k0$g$b$a */
            /* loaded from: classes2.dex */
            public static final class C7931a extends AbstractC11745k implements InterfaceC11773r<C7825a0, AbstractC7905j0<Value>, EnumC7899i, InterfaceC11714d<? super C13666w>, Object> {

                /* renamed from: c */
                int f19034c;

                /* renamed from: d */
                /* synthetic */ Object f19035d;

                /* renamed from: e */
                /* synthetic */ Object f19036e;

                /* renamed from: f */
                /* synthetic */ Object f19037f;

                /* renamed from: w */
                final /* synthetic */ InterfaceC7881f1<AbstractC7905j0<Value>> f19038w;

                /* renamed from: x */
                final /* synthetic */ C7865e0 f19039x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C7931a(InterfaceC7881f1 interfaceC7881f1, InterfaceC11714d interfaceC11714d, C7865e0 c7865e0) {
                    super(4, interfaceC11714d);
                    this.f19039x = c7865e0;
                    this.f19038w = interfaceC7881f1;
                }

                @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
                public final Object invokeSuspend(Object obj) {
                    Object m10387d;
                    m10387d = C11734d.m10387d();
                    int i = this.f19034c;
                    if (i == 0) {
                        C13291q.m5357b(obj);
                        Object obj2 = this.f19035d;
                        Object obj3 = this.f19036e;
                        EnumC7899i enumC7899i = (EnumC7899i) this.f19037f;
                        InterfaceC7881f1<AbstractC7905j0<Value>> interfaceC7881f1 = this.f19038w;
                        Object obj4 = (AbstractC7905j0) obj3;
                        C7825a0 c7825a0 = (C7825a0) obj2;
                        if (enumC7899i != EnumC7899i.RECEIVER) {
                            if (obj4 instanceof AbstractC7905j0.C7907b) {
                                AbstractC7905j0.C7907b c7907b = (AbstractC7905j0.C7907b) obj4;
                                this.f19039x.m17126b(c7907b.m17065k());
                                obj4 = AbstractC7905j0.C7907b.m17071e(c7907b, null, null, 0, 0, c7907b.m17065k(), c7825a0, 15, null);
                            } else if (obj4 instanceof AbstractC7905j0.C7906a) {
                                this.f19039x.m17125c(((AbstractC7905j0.C7906a) obj4).m17079c(), AbstractC8061y.C8064c.f19411b.m16800b());
                            } else if (!(obj4 instanceof AbstractC7905j0.C7910c)) {
                                throw new NoWhenBranchMatchedException();
                            } else {
                                AbstractC7905j0.C7910c c7910c = (AbstractC7905j0.C7910c) obj4;
                                this.f19039x.m17126b(c7910c.m17058d());
                                obj4 = new AbstractC7905j0.C7910c(c7910c.m17058d(), c7825a0);
                            }
                        } else {
                            obj4 = new AbstractC7905j0.C7910c(this.f19039x.m17124d(), c7825a0);
                        }
                        this.f19034c = 1;
                        if (interfaceC7881f1.mo3639o(obj4, this) == m10387d) {
                            return m10387d;
                        }
                    } else if (i == 1) {
                        C13291q.m5357b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return C13666w.f30112a;
                }

                @Override // kotlin.p483e0.p484c.InterfaceC11773r
                /* renamed from: m */
                public final Object invoke(C7825a0 c7825a0, AbstractC7905j0<Value> abstractC7905j0, EnumC7899i enumC7899i, InterfaceC11714d<? super C13666w> interfaceC11714d) {
                    C7931a c7931a = new C7931a(this.f19038w, interfaceC11714d, this.f19039x);
                    c7931a.f19035d = c7825a0;
                    c7931a.f19036e = abstractC7905j0;
                    c7931a.f19037f = enumC7899i;
                    return c7931a.invokeSuspend(C13666w.f30112a);
                }
            }

            /* compiled from: FlowExt.kt */
            @f(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1", f = "FlowExt.kt", l = {222}, m = "invokeSuspend")
            /* renamed from: g.r.k0$g$b$b */
            /* loaded from: classes2.dex */
            public static final class C7932b extends AbstractC11745k implements InterfaceC11771p<InterfaceC13932m0, InterfaceC11714d<? super C13666w>, Object> {

                /* renamed from: c */
                int f19040c;

                /* renamed from: d */
                final /* synthetic */ InterfaceC7881f1<AbstractC7905j0<Value>> f19041d;

                /* renamed from: e */
                final /* synthetic */ InterfaceC13964d f19042e;

                /* renamed from: f */
                final /* synthetic */ AtomicInteger f19043f;

                /* renamed from: w */
                final /* synthetic */ C7974m1 f19044w;

                /* renamed from: x */
                final /* synthetic */ int f19045x;

                /* compiled from: Collect.kt */
                /* renamed from: g.r.k0$g$b$b$a */
                /* loaded from: classes2.dex */
                public static final class C7933a implements InterfaceC13969e<Object> {

                    /* renamed from: c */
                    final /* synthetic */ C7974m1 f19046c;

                    /* renamed from: d */
                    final /* synthetic */ int f19047d;

                    @f(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$1", f = "PageFetcher.kt", l = {135, 138}, m = "emit")
                    /* renamed from: g.r.k0$g$b$b$a$a */
                    /* loaded from: classes2.dex */
                    public static final class C7934a extends AbstractC11738d {

                        /* renamed from: c */
                        /* synthetic */ Object f19048c;

                        /* renamed from: d */
                        int f19049d;

                        public C7934a(InterfaceC11714d interfaceC11714d) {
                            super(interfaceC11714d);
                        }

                        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
                        public final Object invokeSuspend(Object obj) {
                            this.f19048c = obj;
                            this.f19049d |= Integer.MIN_VALUE;
                            return C7933a.this.emit(null, this);
                        }
                    }

                    public C7933a(C7974m1 c7974m1, int i) {
                        this.f19046c = c7974m1;
                        this.f19047d = i;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
                    /* JADX WARN: Removed duplicated region for block: B:21:0x0050 A[RETURN] */
                    @Override // kotlinx.coroutines.p559q2.InterfaceC13969e
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public java.lang.Object emit(java.lang.Object r6, kotlin.p476c0.InterfaceC11714d r7) {
                        /*
                            r5 = this;
                            boolean r0 = r7 instanceof p201g.p259r.C7916k0.C7928g.C7930b.C7932b.C7933a.C7934a
                            if (r0 == 0) goto L13
                            r0 = r7
                            g.r.k0$g$b$b$a$a r0 = (p201g.p259r.C7916k0.C7928g.C7930b.C7932b.C7933a.C7934a) r0
                            int r1 = r0.f19049d
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.f19049d = r1
                            goto L18
                        L13:
                            g.r.k0$g$b$b$a$a r0 = new g.r.k0$g$b$b$a$a
                            r0.<init>(r7)
                        L18:
                            java.lang.Object r7 = r0.f19048c
                            java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
                            int r2 = r0.f19049d
                            r3 = 2
                            r4 = 1
                            if (r2 == 0) goto L38
                            if (r2 == r4) goto L34
                            if (r2 != r3) goto L2c
                            kotlin.C13291q.m5357b(r7)
                            goto L51
                        L2c:
                            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                            r6.<init>(r7)
                            throw r6
                        L34:
                            kotlin.C13291q.m5357b(r7)
                            goto L48
                        L38:
                            kotlin.C13291q.m5357b(r7)
                            g.r.m1 r7 = r5.f19046c
                            int r2 = r5.f19047d
                            r0.f19049d = r4
                            java.lang.Object r6 = r7.m16975a(r2, r6, r0)
                            if (r6 != r1) goto L48
                            return r1
                        L48:
                            r0.f19049d = r3
                            java.lang.Object r6 = kotlinx.coroutines.C13950p2.m3347a(r0)
                            if (r6 != r1) goto L51
                            return r1
                        L51:
                            kotlin.w r6 = kotlin.C13666w.f30112a
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C7916k0.C7928g.C7930b.C7932b.C7933a.emit(java.lang.Object, kotlin.c0.d):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C7932b(InterfaceC13964d interfaceC13964d, AtomicInteger atomicInteger, InterfaceC7881f1 interfaceC7881f1, C7974m1 c7974m1, int i, InterfaceC11714d interfaceC11714d) {
                    super(2, interfaceC11714d);
                    this.f19042e = interfaceC13964d;
                    this.f19043f = atomicInteger;
                    this.f19044w = c7974m1;
                    this.f19045x = i;
                    this.f19041d = interfaceC7881f1;
                }

                @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
                public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
                    return new C7932b(this.f19042e, this.f19043f, this.f19041d, this.f19044w, this.f19045x, interfaceC11714d);
                }

                @Override // kotlin.p483e0.p484c.InterfaceC11771p
                public final Object invoke(InterfaceC13932m0 interfaceC13932m0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
                    return ((C7932b) create(interfaceC13932m0, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
                }

                @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
                public final Object invokeSuspend(Object obj) {
                    Object m10387d;
                    AtomicInteger atomicInteger;
                    m10387d = C11734d.m10387d();
                    int i = this.f19040c;
                    try {
                        if (i == 0) {
                            C13291q.m5357b(obj);
                            InterfaceC13964d interfaceC13964d = this.f19042e;
                            C7933a c7933a = new C7933a(this.f19044w, this.f19045x);
                            this.f19040c = 1;
                            if (interfaceC13964d.mo3175a(c7933a, this) == m10387d) {
                                return m10387d;
                            }
                        } else if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            C13291q.m5357b(obj);
                        }
                        if (atomicInteger.decrementAndGet() == 0) {
                            InterfaceC13801x.C13802a.m3638a(this.f19041d, null, 1, null);
                        }
                        return C13666w.f30112a;
                    } finally {
                        if (this.f19043f.decrementAndGet() == 0) {
                            InterfaceC13801x.C13802a.m3638a(this.f19041d, null, 1, null);
                        }
                    }
                }
            }

            /* compiled from: FlowExt.kt */
            /* renamed from: g.r.k0$g$b$c */
            /* loaded from: classes2.dex */
            public static final class C7935c extends AbstractC11802m implements InterfaceC11756a<C13666w> {

                /* renamed from: c */
                final /* synthetic */ InterfaceC14112z f19051c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C7935c(InterfaceC14112z interfaceC14112z) {
                    super(0);
                    this.f19051c = interfaceC14112z;
                }

                @Override // kotlin.p483e0.p484c.InterfaceC11756a
                public /* bridge */ /* synthetic */ C13666w invoke() {
                    invoke2();
                    return C13666w.f30112a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    InterfaceC13947p1.C13948a.m3353a(this.f19051c, null, 1, null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7930b(InterfaceC13964d interfaceC13964d, InterfaceC13964d interfaceC13964d2, InterfaceC11714d interfaceC11714d, C7865e0 c7865e0) {
                super(2, interfaceC11714d);
                this.f19031e = interfaceC13964d;
                this.f19032f = interfaceC13964d2;
                this.f19033w = c7865e0;
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
                C7930b c7930b = new C7930b(this.f19031e, this.f19032f, interfaceC11714d, this.f19033w);
                c7930b.f19030d = obj;
                return c7930b;
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final Object invokeSuspend(Object obj) {
                Object m10387d;
                InterfaceC14112z m3160b;
                m10387d = C11734d.m10387d();
                int i = this.f19029c;
                if (i == 0) {
                    C13291q.m5357b(obj);
                    InterfaceC7881f1 interfaceC7881f1 = (InterfaceC7881f1) this.f19030d;
                    AtomicInteger atomicInteger = new AtomicInteger(2);
                    C7974m1 c7974m1 = new C7974m1(new C7931a(interfaceC7881f1, null, this.f19033w));
                    m3160b = C14057t1.m3160b(null, 1, null);
                    InterfaceC13964d[] interfaceC13964dArr = {this.f19031e, this.f19032f};
                    int i2 = 0;
                    int i3 = 0;
                    while (i3 < 2) {
                        C13916j.m3412b(interfaceC7881f1, m3160b, null, new C7932b(interfaceC13964dArr[i3], atomicInteger, interfaceC7881f1, c7974m1, i2, null), 2, null);
                        i3++;
                        i2++;
                    }
                    C7935c c7935c = new C7935c(m3160b);
                    this.f19029c = 1;
                    if (interfaceC7881f1.mo17111I(c7935c, this) == m10387d) {
                        return m10387d;
                    }
                } else if (i == 1) {
                    C13291q.m5357b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C13666w.f30112a;
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11771p
            /* renamed from: m */
            public final Object invoke(InterfaceC7881f1<AbstractC7905j0<Value>> interfaceC7881f1, InterfaceC11714d<? super C13666w> interfaceC11714d) {
                return ((C7930b) create(interfaceC7881f1, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7928g(InterfaceC8083z0<Key, Value> interfaceC8083z0, C7942l0<Key, Value> c7942l0, C7865e0 c7865e0, InterfaceC11714d<? super C7928g> interfaceC11714d) {
            super(2, interfaceC11714d);
            this.f19025e = interfaceC8083z0;
            this.f19026f = c7942l0;
            this.f19027w = c7865e0;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            C7928g c7928g = new C7928g(this.f19025e, this.f19026f, this.f19027w, interfaceC11714d);
            c7928g.f19024d = obj;
            return c7928g;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            m10387d = C11734d.m10387d();
            int i = this.f19023c;
            if (i == 0) {
                C13291q.m5357b(obj);
                InterfaceC13964d m17123a = C7867e1.m17123a(new C7930b(this.f19025e.getState(), this.f19026f.m16988w(), null, this.f19027w));
                C7929a c7929a = new C7929a((InterfaceC7881f1) this.f19024d);
                this.f19023c = 1;
                if (m17123a.mo3175a(c7929a, this) == m10387d) {
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
        public final Object invoke(InterfaceC7881f1<AbstractC7905j0<Value>> interfaceC7881f1, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return ((C7928g) create(interfaceC7881f1, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7916k0(InterfaceC11767l<? super InterfaceC11714d<? super AbstractC8041v0<Key, Value>>, ? extends Object> interfaceC11767l, Key key, C8003q0 c8003q0, AbstractC8056x0<Key, Value> abstractC8056x0) {
        l.f(interfaceC11767l, "pagingSourceFactory");
        l.f(c8003q0, "config");
        this.f18987a = interfaceC11767l;
        this.f18988b = key;
        this.f18989c = c8003q0;
        this.f18990d = new C7912k<>(null, 1, null);
        this.f18991e = new C7912k<>(null, 1, null);
        this.f18992f = C7867e1.m17123a(new C7919c(abstractC8056x0, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m17047h(p201g.p259r.AbstractC8041v0<Key, Value> r5, kotlin.p476c0.InterfaceC11714d<? super p201g.p259r.AbstractC8041v0<Key, Value>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p201g.p259r.C7916k0.C7925d
            if (r0 == 0) goto L13
            r0 = r6
            g.r.k0$d r0 = (p201g.p259r.C7916k0.C7925d) r0
            int r1 = r0.f19022w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19022w = r1
            goto L18
        L13:
            g.r.k0$d r0 = new g.r.k0$d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f19020e
            java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
            int r2 = r0.f19022w
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f19019d
            g.r.v0 r5 = (p201g.p259r.AbstractC8041v0) r5
            java.lang.Object r0 = r0.f19018c
            g.r.k0 r0 = (p201g.p259r.C7916k0) r0
            kotlin.C13291q.m5357b(r6)
            goto L4c
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.C13291q.m5357b(r6)
            kotlin.e0.c.l<kotlin.c0.d<? super g.r.v0<Key, Value>>, java.lang.Object> r6 = r4.f18987a
            r0.f19018c = r4
            r0.f19019d = r5
            r0.f19022w = r3
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r0 = r4
        L4c:
            g.r.v0 r6 = (p201g.p259r.AbstractC8041v0) r6
            boolean r1 = r6 instanceof p201g.p259r.C8054x
            if (r1 == 0) goto L5c
            r1 = r6
            g.r.x r1 = (p201g.p259r.C8054x) r1
            g.r.q0 r2 = r0.f18989c
            int r2 = r2.f19271a
            r1.m16811c(r2)
        L5c:
            if (r6 == r5) goto L5f
            goto L60
        L5f:
            r3 = 0
        L60:
            if (r3 == 0) goto L7c
            g.r.k0$e r1 = new g.r.k0$e
            r1.<init>(r0)
            r6.registerInvalidatedCallback(r1)
            if (r5 != 0) goto L6d
            goto L75
        L6d:
            g.r.k0$f r1 = new g.r.k0$f
            r1.<init>(r0)
            r5.unregisterInvalidatedCallback(r1)
        L75:
            if (r5 != 0) goto L78
            goto L7b
        L78:
            r5.invalidate()
        L7b:
            return r6
        L7c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource."
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C7916k0.m17047h(g.r.v0, kotlin.c0.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final InterfaceC13964d<AbstractC7905j0<Value>> m17045j(C7942l0<Key, Value> c7942l0, InterfaceC13947p1 interfaceC13947p1, InterfaceC8083z0<Key, Value> interfaceC8083z0) {
        if (interfaceC8083z0 == null) {
            return c7942l0.m16988w();
        }
        return C7882g.m17113a(interfaceC13947p1, new C7928g(interfaceC8083z0, c7942l0, new C7865e0(), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public final void m17044k() {
        this.f18990d.m17055b(Boolean.FALSE);
    }

    /* renamed from: i */
    public final InterfaceC13964d<C8013r0<Value>> m17046i() {
        return this.f18992f;
    }

    /* renamed from: l */
    public final void m17043l() {
        this.f18990d.m17055b(Boolean.TRUE);
    }
}

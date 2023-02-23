package kotlinx.coroutines.p562t2;

import kotlin.C13666w;
import kotlin.c0.k.a.f;
import kotlin.p476c0.C11725h;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlinx.coroutines.C13864i;
import kotlinx.coroutines.C13866i1;
import kotlinx.coroutines.C14107x0;
import kotlinx.coroutines.EnumC13940o0;
import kotlinx.coroutines.InterfaceC13932m0;
import kotlinx.coroutines.p559q2.InterfaceC13964d;
import kotlinx.coroutines.p559q2.InterfaceC13969e;
import kotlinx.coroutines.p561s2.C14052e;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11690q;
import p425j.p444e.InterfaceC11691r;
/* compiled from: RxConvert.kt */
/* renamed from: kotlinx.coroutines.t2.e */
/* loaded from: classes3.dex */
public final class C14064e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RxConvert.kt */
    @f(c = "kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1", f = "RxConvert.kt", l = {167}, m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.t2.e$a */
    /* loaded from: classes3.dex */
    public static final class C14065a extends AbstractC11745k implements InterfaceC11771p<InterfaceC13932m0, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        int f30663c;

        /* renamed from: d */
        private /* synthetic */ Object f30664d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC13964d<T> f30665e;

        /* renamed from: f */
        final /* synthetic */ InterfaceC11690q<T> f30666f;

        /* compiled from: Collect.kt */
        /* renamed from: kotlinx.coroutines.t2.e$a$a */
        /* loaded from: classes3.dex */
        public static final class C14066a implements InterfaceC13969e<T> {

            /* renamed from: c */
            final /* synthetic */ InterfaceC11690q f30667c;

            public C14066a(InterfaceC11690q interfaceC11690q) {
                this.f30667c = interfaceC11690q;
            }

            @Override // kotlinx.coroutines.p559q2.InterfaceC13969e
            public Object emit(T t, InterfaceC11714d<? super C13666w> interfaceC11714d) {
                this.f30667c.mo10903f(t);
                return C13666w.f30112a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C14065a(InterfaceC13964d<? extends T> interfaceC13964d, InterfaceC11690q<T> interfaceC11690q, InterfaceC11714d<? super C14065a> interfaceC11714d) {
            super(2, interfaceC11714d);
            this.f30665e = interfaceC13964d;
            this.f30666f = interfaceC11690q;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            C14065a c14065a = new C14065a(this.f30665e, this.f30666f, interfaceC11714d);
            c14065a.f30664d = obj;
            return c14065a;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public final Object invoke(InterfaceC13932m0 interfaceC13932m0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return ((C14065a) create(interfaceC13932m0, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.p476c0.p477j.C11728b.m10391d()
                int r1 = r6.f30663c
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r6.f30664d
                kotlinx.coroutines.m0 r0 = (kotlinx.coroutines.InterfaceC13932m0) r0
                kotlin.C13291q.m5357b(r7)     // Catch: java.lang.Throwable -> L13
                goto L39
            L13:
                r7 = move-exception
                goto L43
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                kotlin.C13291q.m5357b(r7)
                java.lang.Object r7 = r6.f30664d
                kotlinx.coroutines.m0 r7 = (kotlinx.coroutines.InterfaceC13932m0) r7
                kotlinx.coroutines.q2.d<T> r1 = r6.f30665e     // Catch: java.lang.Throwable -> L3f
                j.e.q<T> r3 = r6.f30666f     // Catch: java.lang.Throwable -> L3f
                kotlinx.coroutines.t2.e$a$a r4 = new kotlinx.coroutines.t2.e$a$a     // Catch: java.lang.Throwable -> L3f
                r4.<init>(r3)     // Catch: java.lang.Throwable -> L3f
                r6.f30664d = r7     // Catch: java.lang.Throwable -> L3f
                r6.f30663c = r2     // Catch: java.lang.Throwable -> L3f
                java.lang.Object r1 = r1.mo3175a(r4, r6)     // Catch: java.lang.Throwable -> L3f
                if (r1 != r0) goto L38
                return r0
            L38:
                r0 = r7
            L39:
                j.e.q<T> r7 = r6.f30666f     // Catch: java.lang.Throwable -> L13
                r7.mo10905a()     // Catch: java.lang.Throwable -> L13
                goto L5c
            L3f:
                r0 = move-exception
                r5 = r0
                r0 = r7
                r7 = r5
            L43:
                boolean r1 = r7 instanceof java.util.concurrent.CancellationException
                if (r1 != 0) goto L57
                j.e.q<T> r1 = r6.f30666f
                boolean r1 = r1.mo10481b(r7)
                if (r1 != 0) goto L5c
                kotlin.c0.g r0 = r0.mo3397o0()
                kotlinx.coroutines.p562t2.C14063d.m3149a(r7, r0)
                goto L5c
            L57:
                j.e.q<T> r7 = r6.f30666f
                r7.mo10905a()
            L5c:
                kotlin.w r7 = kotlin.C13666w.f30112a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p562t2.C14064e.C14065a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final <T> AbstractC11293f<T> m3148a(InterfaceC13964d<? extends T> interfaceC13964d, InterfaceC11719g interfaceC11719g) {
        return AbstractC11293f.m11164u(C14052e.m3167b(interfaceC13964d, interfaceC11719g));
    }

    /* renamed from: b */
    public static /* synthetic */ AbstractC11293f m3147b(InterfaceC13964d interfaceC13964d, InterfaceC11719g interfaceC11719g, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC11719g = C11725h.f26446c;
        }
        return m3148a(interfaceC13964d, interfaceC11719g);
    }

    /* renamed from: c */
    public static final <T> AbstractC11688p<T> m3146c(final InterfaceC13964d<? extends T> interfaceC13964d, final InterfaceC11719g interfaceC11719g) {
        return AbstractC11688p.m10494q(new InterfaceC11691r() { // from class: kotlinx.coroutines.t2.a
            @Override // p425j.p444e.InterfaceC11691r
            /* renamed from: a */
            public final void mo3155a(InterfaceC11690q interfaceC11690q) {
                C14064e.m3144e(InterfaceC11719g.this, interfaceC13964d, interfaceC11690q);
            }
        });
    }

    /* renamed from: d */
    public static /* synthetic */ AbstractC11688p m3145d(InterfaceC13964d interfaceC13964d, InterfaceC11719g interfaceC11719g, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC11719g = C11725h.f26446c;
        }
        return m3146c(interfaceC13964d, interfaceC11719g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m3144e(InterfaceC11719g interfaceC11719g, InterfaceC13964d interfaceC13964d, InterfaceC11690q interfaceC11690q) {
        interfaceC11690q.mo10479d(new C14062c(C13864i.m3568a(C13866i1.f30336c, C14107x0.m2943d().plus(interfaceC11719g), EnumC13940o0.ATOMIC, new C14065a(interfaceC13964d, interfaceC11690q, null))));
    }
}

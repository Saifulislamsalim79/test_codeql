package kotlinx.coroutines.p559q2;

import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.c0.k.a.f;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11738d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.C11810u;
/* compiled from: SharingStarted.kt */
/* renamed from: kotlinx.coroutines.q2.d0 */
/* loaded from: classes3.dex */
final class C13965d0 implements InterfaceC13958b0 {

    /* compiled from: SharingStarted.kt */
    @f(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {210}, m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.q2.d0$a */
    /* loaded from: classes3.dex */
    static final class C13966a extends AbstractC11745k implements InterfaceC11771p<InterfaceC13969e<? super EnumC14032z>, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        int f30466c;

        /* renamed from: d */
        private /* synthetic */ Object f30467d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC13970e0<Integer> f30468e;

        /* compiled from: Collect.kt */
        /* renamed from: kotlinx.coroutines.q2.d0$a$a */
        /* loaded from: classes3.dex */
        public static final class C13967a implements InterfaceC13969e<Integer> {

            /* renamed from: c */
            final /* synthetic */ C11810u f30469c;

            /* renamed from: d */
            final /* synthetic */ InterfaceC13969e f30470d;

            @f(c = "kotlinx.coroutines.flow.StartedLazily$command$1$invokeSuspend$$inlined$collect$1", f = "SharingStarted.kt", l = {137}, m = "emit")
            /* renamed from: kotlinx.coroutines.q2.d0$a$a$a */
            /* loaded from: classes3.dex */
            public static final class C13968a extends AbstractC11738d {

                /* renamed from: c */
                /* synthetic */ Object f30471c;

                /* renamed from: d */
                int f30472d;

                public C13968a(InterfaceC11714d interfaceC11714d) {
                    super(interfaceC11714d);
                }

                @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
                public final Object invokeSuspend(Object obj) {
                    this.f30471c = obj;
                    this.f30472d |= Integer.MIN_VALUE;
                    return C13967a.this.emit(null, this);
                }
            }

            public C13967a(C11810u c11810u, InterfaceC13969e interfaceC13969e) {
                this.f30469c = c11810u;
                this.f30470d = interfaceC13969e;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // kotlinx.coroutines.p559q2.InterfaceC13969e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object emit(java.lang.Integer r5, kotlin.p476c0.InterfaceC11714d<? super kotlin.C13666w> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof kotlinx.coroutines.p559q2.C13965d0.C13966a.C13967a.C13968a
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.q2.d0$a$a$a r0 = (kotlinx.coroutines.p559q2.C13965d0.C13966a.C13967a.C13968a) r0
                    int r1 = r0.f30472d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f30472d = r1
                    goto L18
                L13:
                    kotlinx.coroutines.q2.d0$a$a$a r0 = new kotlinx.coroutines.q2.d0$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f30471c
                    java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
                    int r2 = r0.f30472d
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C13291q.m5357b(r6)
                    goto L51
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C13291q.m5357b(r6)
                    java.lang.Number r5 = (java.lang.Number) r5
                    int r5 = r5.intValue()
                    if (r5 <= 0) goto L51
                    kotlin.e0.d.u r5 = r4.f30469c
                    boolean r6 = r5.f26497c
                    if (r6 != 0) goto L51
                    r5.f26497c = r3
                    kotlinx.coroutines.q2.e r5 = r4.f30470d
                    kotlinx.coroutines.q2.z r6 = kotlinx.coroutines.p559q2.EnumC14032z.START
                    r0.f30472d = r3
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L51
                    return r1
                L51:
                    kotlin.w r5 = kotlin.C13666w.f30112a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p559q2.C13965d0.C13966a.C13967a.emit(java.lang.Object, kotlin.c0.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13966a(InterfaceC13970e0<Integer> interfaceC13970e0, InterfaceC11714d<? super C13966a> interfaceC11714d) {
            super(2, interfaceC11714d);
            this.f30468e = interfaceC13970e0;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            C13966a c13966a = new C13966a(this.f30468e, interfaceC11714d);
            c13966a.f30467d = obj;
            return c13966a;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            m10387d = C11734d.m10387d();
            int i = this.f30466c;
            if (i == 0) {
                C13291q.m5357b(obj);
                C11810u c11810u = new C11810u();
                InterfaceC13970e0<Integer> interfaceC13970e0 = this.f30468e;
                C13967a c13967a = new C13967a(c11810u, (InterfaceC13969e) this.f30467d);
                this.f30466c = 1;
                if (interfaceC13970e0.mo3175a(c13967a, this) == m10387d) {
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
        public final Object invoke(InterfaceC13969e<? super EnumC14032z> interfaceC13969e, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return ((C13966a) create(interfaceC13969e, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }
    }

    @Override // kotlinx.coroutines.p559q2.InterfaceC13958b0
    /* renamed from: a */
    public InterfaceC13964d<EnumC14032z> mo3335a(InterfaceC13970e0<Integer> interfaceC13970e0) {
        return C13971f.m3319o(new C13966a(interfaceC13970e0, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}

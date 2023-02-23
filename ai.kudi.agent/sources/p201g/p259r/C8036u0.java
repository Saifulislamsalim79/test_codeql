package p201g.p259r;

import kotlin.C13666w;
import kotlin.c0.k.a.f;
import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11738d;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlinx.coroutines.p559q2.InterfaceC13964d;
import kotlinx.coroutines.p559q2.InterfaceC13969e;
/* compiled from: PagingDataTransforms.kt */
/* renamed from: g.r.u0 */
/* loaded from: classes2.dex */
public final class C8036u0 {

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: g.r.u0$a */
    /* loaded from: classes2.dex */
    public static final class C8037a implements InterfaceC13964d<AbstractC7905j0<R>> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC13964d f19362c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC11771p f19363d;

        /* compiled from: Collect.kt */
        /* renamed from: g.r.u0$a$a */
        /* loaded from: classes2.dex */
        public static final class C8038a implements InterfaceC13969e<AbstractC7905j0<T>> {

            /* renamed from: c */
            final /* synthetic */ InterfaceC13969e f19364c;

            /* renamed from: d */
            final /* synthetic */ InterfaceC11771p f19365d;

            @f(c = "androidx.paging.PagingDataTransforms$map$$inlined$transform$1$2", f = "PagingDataTransforms.kt", l = {138, 138}, m = "emit")
            /* renamed from: g.r.u0$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C8039a extends AbstractC11738d {

                /* renamed from: c */
                /* synthetic */ Object f19366c;

                /* renamed from: d */
                int f19367d;

                /* renamed from: e */
                Object f19368e;

                public C8039a(InterfaceC11714d interfaceC11714d) {
                    super(interfaceC11714d);
                }

                @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
                public final Object invokeSuspend(Object obj) {
                    this.f19366c = obj;
                    this.f19367d |= Integer.MIN_VALUE;
                    return C8038a.this.emit(null, this);
                }
            }

            public C8038a(InterfaceC13969e interfaceC13969e, InterfaceC11771p interfaceC11771p) {
                this.f19364c = interfaceC13969e;
                this.f19365d = interfaceC11771p;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[RETURN] */
            @Override // kotlinx.coroutines.p559q2.InterfaceC13969e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object emit(java.lang.Object r7, kotlin.p476c0.InterfaceC11714d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof p201g.p259r.C8036u0.C8037a.C8038a.C8039a
                    if (r0 == 0) goto L13
                    r0 = r8
                    g.r.u0$a$a$a r0 = (p201g.p259r.C8036u0.C8037a.C8038a.C8039a) r0
                    int r1 = r0.f19367d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f19367d = r1
                    goto L18
                L13:
                    g.r.u0$a$a$a r0 = new g.r.u0$a$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f19366c
                    java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
                    int r2 = r0.f19367d
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.C13291q.m5357b(r8)
                    goto L5f
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.f19368e
                    kotlinx.coroutines.q2.e r7 = (kotlinx.coroutines.p559q2.InterfaceC13969e) r7
                    kotlin.C13291q.m5357b(r8)
                    goto L53
                L3c:
                    kotlin.C13291q.m5357b(r8)
                    kotlinx.coroutines.q2.e r8 = r6.f19364c
                    g.r.j0 r7 = (p201g.p259r.AbstractC7905j0) r7
                    kotlin.e0.c.p r2 = r6.f19365d
                    r0.f19368e = r8
                    r0.f19367d = r4
                    java.lang.Object r7 = r7.mo17074a(r2, r0)
                    if (r7 != r1) goto L50
                    return r1
                L50:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L53:
                    r2 = 0
                    r0.f19368e = r2
                    r0.f19367d = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L5f
                    return r1
                L5f:
                    kotlin.w r7 = kotlin.C13666w.f30112a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C8036u0.C8037a.C8038a.emit(java.lang.Object, kotlin.c0.d):java.lang.Object");
            }
        }

        public C8037a(InterfaceC13964d interfaceC13964d, InterfaceC11771p interfaceC11771p) {
            this.f19362c = interfaceC13964d;
            this.f19363d = interfaceC11771p;
        }

        @Override // kotlinx.coroutines.p559q2.InterfaceC13964d
        /* renamed from: a */
        public Object mo3175a(InterfaceC13969e interfaceC13969e, InterfaceC11714d interfaceC11714d) {
            Object m10387d;
            Object mo3175a = this.f19362c.mo3175a(new C8038a(interfaceC13969e, this.f19363d), interfaceC11714d);
            m10387d = C11734d.m10387d();
            return mo3175a == m10387d ? mo3175a : C13666w.f30112a;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C8013r0 m16838a(C8013r0 c8013r0, EnumC7911j1 enumC7911j1, InterfaceC11772q interfaceC11772q) {
        l.f(c8013r0, "<this>");
        l.f(enumC7911j1, "terminalSeparatorType");
        l.f(interfaceC11772q, "generator");
        return new C8013r0(C7849d1.m17140c(c8013r0.m16897a(), enumC7911j1, interfaceC11772q), c8013r0.m16896b());
    }

    /* renamed from: b */
    public static /* synthetic */ C8013r0 m16837b(C8013r0 c8013r0, EnumC7911j1 enumC7911j1, InterfaceC11772q interfaceC11772q, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC7911j1 = EnumC7911j1.FULLY_COMPLETE;
        }
        return m16838a(c8013r0, enumC7911j1, interfaceC11772q);
    }

    /* renamed from: c */
    public static final /* synthetic */ C8013r0 m16836c(C8013r0 c8013r0, InterfaceC11771p interfaceC11771p) {
        l.f(c8013r0, "<this>");
        l.f(interfaceC11771p, "transform");
        return new C8013r0(new C8037a(c8013r0.m16897a(), interfaceC11771p), c8013r0.m16896b());
    }
}

package p201g.p259r;

import java.util.List;
import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.c0.k.a.f;
import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11738d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p557z.C13712m;
import kotlin.p557z.C13715n;
import kotlin.p557z.C13724q;
import kotlin.p557z.C13742z;
import kotlinx.coroutines.p559q2.InterfaceC13964d;
import kotlinx.coroutines.p559q2.InterfaceC13969e;
/* compiled from: Separators.kt */
/* renamed from: g.r.d1 */
/* loaded from: classes2.dex */
public final class C7849d1 {

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: g.r.d1$a */
    /* loaded from: classes2.dex */
    public static final class C7850a implements InterfaceC13964d<AbstractC7905j0<R>> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC13964d f18789c;

        /* renamed from: d */
        final /* synthetic */ C7837c1 f18790d;

        /* compiled from: Collect.kt */
        /* renamed from: g.r.d1$a$a */
        /* loaded from: classes2.dex */
        public static final class C7851a implements InterfaceC13969e<AbstractC7905j0<T>> {

            /* renamed from: c */
            final /* synthetic */ InterfaceC13969e f18791c;

            /* renamed from: d */
            final /* synthetic */ C7837c1 f18792d;

            @f(c = "androidx.paging.SeparatorsKt$insertEventSeparators$$inlined$map$1$2", f = "Separators.kt", l = {137, 137}, m = "emit")
            /* renamed from: g.r.d1$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C7852a extends AbstractC11738d {

                /* renamed from: c */
                /* synthetic */ Object f18793c;

                /* renamed from: d */
                int f18794d;

                /* renamed from: e */
                Object f18795e;

                public C7852a(InterfaceC11714d interfaceC11714d) {
                    super(interfaceC11714d);
                }

                @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
                public final Object invokeSuspend(Object obj) {
                    this.f18793c = obj;
                    this.f18794d |= Integer.MIN_VALUE;
                    return C7851a.this.emit(null, this);
                }
            }

            public C7851a(InterfaceC13969e interfaceC13969e, C7837c1 c7837c1) {
                this.f18791c = interfaceC13969e;
                this.f18792d = c7837c1;
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
                    boolean r0 = r8 instanceof p201g.p259r.C7849d1.C7850a.C7851a.C7852a
                    if (r0 == 0) goto L13
                    r0 = r8
                    g.r.d1$a$a$a r0 = (p201g.p259r.C7849d1.C7850a.C7851a.C7852a) r0
                    int r1 = r0.f18794d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f18794d = r1
                    goto L18
                L13:
                    g.r.d1$a$a$a r0 = new g.r.d1$a$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f18793c
                    java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
                    int r2 = r0.f18794d
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
                    java.lang.Object r7 = r0.f18795e
                    kotlinx.coroutines.q2.e r7 = (kotlinx.coroutines.p559q2.InterfaceC13969e) r7
                    kotlin.C13291q.m5357b(r8)
                    goto L53
                L3c:
                    kotlin.C13291q.m5357b(r8)
                    kotlinx.coroutines.q2.e r8 = r6.f18791c
                    g.r.j0 r7 = (p201g.p259r.AbstractC7905j0) r7
                    g.r.c1 r2 = r6.f18792d
                    r0.f18795e = r8
                    r0.f18794d = r4
                    java.lang.Object r7 = r2.m17188n(r7, r0)
                    if (r7 != r1) goto L50
                    return r1
                L50:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L53:
                    r2 = 0
                    r0.f18795e = r2
                    r0.f18794d = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L5f
                    return r1
                L5f:
                    kotlin.w r7 = kotlin.C13666w.f30112a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C7849d1.C7850a.C7851a.emit(java.lang.Object, kotlin.c0.d):java.lang.Object");
            }
        }

        public C7850a(InterfaceC13964d interfaceC13964d, C7837c1 c7837c1) {
            this.f18789c = interfaceC13964d;
            this.f18790d = c7837c1;
        }

        @Override // kotlinx.coroutines.p559q2.InterfaceC13964d
        /* renamed from: a */
        public Object mo3175a(InterfaceC13969e interfaceC13969e, InterfaceC11714d interfaceC11714d) {
            Object m10387d;
            Object mo3175a = this.f18789c.mo3175a(new C7851a(interfaceC13969e, this.f18790d), interfaceC11714d);
            m10387d = C11734d.m10387d();
            return mo3175a == m10387d ? mo3175a : C13666w.f30112a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Separators.kt */
    @f(c = "androidx.paging.SeparatorsKt$insertEventSeparators$separatorState$1", f = "Separators.kt", l = {580}, m = "invokeSuspend")
    /* renamed from: g.r.d1$b */
    /* loaded from: classes2.dex */
    public static final class C7853b extends AbstractC11745k implements InterfaceC11772q<T, T, InterfaceC11714d<? super R>, Object> {

        /* renamed from: c */
        int f18797c;

        /* renamed from: d */
        /* synthetic */ Object f18798d;

        /* renamed from: e */
        /* synthetic */ Object f18799e;

        /* renamed from: f */
        final /* synthetic */ InterfaceC11772q<T, T, InterfaceC11714d<? super R>, Object> f18800f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C7853b(InterfaceC11772q<? super T, ? super T, ? super InterfaceC11714d<? super R>, ? extends Object> interfaceC11772q, InterfaceC11714d<? super C7853b> interfaceC11714d) {
            super(3, interfaceC11714d);
            this.f18800f = interfaceC11772q;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            m10387d = C11734d.m10387d();
            int i = this.f18797c;
            if (i == 0) {
                C13291q.m5357b(obj);
                Object obj2 = this.f18798d;
                Object obj3 = this.f18799e;
                InterfaceC11772q<T, T, InterfaceC11714d<? super R>, Object> interfaceC11772q = this.f18800f;
                this.f18798d = null;
                this.f18797c = 1;
                obj = interfaceC11772q.invoke(obj2, obj3, this);
                if (obj == m10387d) {
                    return m10387d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13291q.m5357b(obj);
            }
            return obj;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11772q
        /* renamed from: m */
        public final Object invoke(T t, T t2, InterfaceC11714d<? super R> interfaceC11714d) {
            C7853b c7853b = new C7853b(this.f18800f, interfaceC11714d);
            c7853b.f18798d = t;
            c7853b.f18799e = t2;
            return c7853b.invokeSuspend(C13666w.f30112a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Separators.kt */
    @f(c = "androidx.paging.SeparatorsKt", f = "Separators.kt", l = {81}, m = "insertInternalSeparators")
    /* renamed from: g.r.d1$c */
    /* loaded from: classes2.dex */
    public static final class C7854c<R, T extends R> extends AbstractC11738d {

        /* renamed from: A */
        /* synthetic */ Object f18801A;

        /* renamed from: B */
        int f18802B;

        /* renamed from: c */
        Object f18803c;

        /* renamed from: d */
        Object f18804d;

        /* renamed from: e */
        Object f18805e;

        /* renamed from: f */
        Object f18806f;

        /* renamed from: w */
        Object f18807w;

        /* renamed from: x */
        int f18808x;

        /* renamed from: y */
        int f18809y;

        /* renamed from: z */
        int f18810z;

        C7854c(InterfaceC11714d<? super C7854c> interfaceC11714d) {
            super(interfaceC11714d);
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            this.f18801A = obj;
            this.f18802B |= Integer.MIN_VALUE;
            return C7849d1.m17139d(null, null, this);
        }
    }

    /* renamed from: a */
    public static final <R, T extends R> void m17142a(List<C7936k1<R>> list, R r, C7936k1<T> c7936k1, C7936k1<T> c7936k12, int i, int i2) {
        int[] m4059l;
        List<Integer> m4005t;
        List m3778t0;
        l.f(list, "<this>");
        int[] m17025e = c7936k1 == null ? null : c7936k1.m17025e();
        int[] m17025e2 = c7936k12 != null ? c7936k12.m17025e() : null;
        if (m17025e != null && m17025e2 != null) {
            m4059l = C13712m.m4059l(m17025e, m17025e2);
            m4005t = C13715n.m4005t(m4059l);
            m3778t0 = C13742z.m3778t0(m4005t);
            m17025e = C13742z.m3826A0(m3778t0);
        } else if (m17025e == null && m17025e2 != null) {
            m17025e = m17025e2;
        } else if (m17025e == null || m17025e2 != null) {
            throw new IllegalArgumentException("Separator page expected adjacentPageBefore or adjacentPageAfter, but both were null.");
        }
        m17141b(list, r, m17025e, i, i2);
    }

    /* renamed from: b */
    public static final <T> void m17141b(List<C7936k1<T>> list, T t, int[] iArr, int i, int i2) {
        l.f(list, "<this>");
        l.f(iArr, "originalPageOffsets");
        if (t == null) {
            return;
        }
        list.add(m17138e(t, iArr, i, i2));
    }

    /* renamed from: c */
    public static final <T extends R, R> InterfaceC13964d<AbstractC7905j0<R>> m17140c(InterfaceC13964d<? extends AbstractC7905j0<T>> interfaceC13964d, EnumC7911j1 enumC7911j1, InterfaceC11772q<? super T, ? super T, ? super InterfaceC11714d<? super R>, ? extends Object> interfaceC11772q) {
        l.f(interfaceC13964d, "<this>");
        l.f(enumC7911j1, "terminalSeparatorType");
        l.f(interfaceC11772q, "generator");
        return new C7850a(interfaceC13964d, new C7837c1(enumC7911j1, new C7853b(interfaceC11772q, null)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00da -> B:31:0x00e3). Please submit an issue!!! */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <R, T extends R> java.lang.Object m17139d(p201g.p259r.C7936k1<T> r12, kotlin.p483e0.p484c.InterfaceC11772q<? super T, ? super T, ? super kotlin.p476c0.InterfaceC11714d<? super R>, ? extends java.lang.Object> r13, kotlin.p476c0.InterfaceC11714d<? super p201g.p259r.C7936k1<R>> r14) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C7849d1.m17139d(g.r.k1, kotlin.e0.c.q, kotlin.c0.d):java.lang.Object");
    }

    /* renamed from: e */
    public static final <T> C7936k1<T> m17138e(T t, int[] iArr, int i, int i2) {
        List m3901b;
        List m3901b2;
        l.f(t, "separator");
        l.f(iArr, "originalPageOffsets");
        m3901b = C13724q.m3901b(t);
        m3901b2 = C13724q.m3901b(Integer.valueOf(i2));
        return new C7936k1<>(iArr, m3901b, i, m3901b2);
    }
}

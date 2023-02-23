package kotlinx.coroutines.p559q2;

import kotlin.C13666w;
import kotlin.c0.k.a.f;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11738d;
import kotlin.p483e0.p484c.InterfaceC11771p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.kt */
/* renamed from: kotlinx.coroutines.q2.g */
/* loaded from: classes3.dex */
public final /* synthetic */ class C13974g {

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: kotlinx.coroutines.q2.g$a */
    /* loaded from: classes3.dex */
    public static final class C13975a implements InterfaceC13964d<T> {

        /* renamed from: c */
        final /* synthetic */ Object[] f30483c;

        @f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1", f = "Builders.kt", l = {114}, m = "collect")
        /* renamed from: kotlinx.coroutines.q2.g$a$a */
        /* loaded from: classes3.dex */
        public static final class C13976a extends AbstractC11738d {

            /* renamed from: c */
            /* synthetic */ Object f30484c;

            /* renamed from: d */
            int f30485d;

            /* renamed from: f */
            Object f30487f;

            /* renamed from: w */
            Object f30488w;

            /* renamed from: x */
            int f30489x;

            /* renamed from: y */
            int f30490y;

            public C13976a(InterfaceC11714d interfaceC11714d) {
                super(interfaceC11714d);
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final Object invokeSuspend(Object obj) {
                this.f30484c = obj;
                this.f30485d |= Integer.MIN_VALUE;
                return C13975a.this.mo3175a(null, this);
            }
        }

        public C13975a(Object[] objArr) {
            this.f30483c = objArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
        @Override // kotlinx.coroutines.p559q2.InterfaceC13964d
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo3175a(kotlinx.coroutines.p559q2.InterfaceC13969e<? super T> r8, kotlin.p476c0.InterfaceC11714d<? super kotlin.C13666w> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.p559q2.C13974g.C13975a.C13976a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.q2.g$a$a r0 = (kotlinx.coroutines.p559q2.C13974g.C13975a.C13976a) r0
                int r1 = r0.f30485d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f30485d = r1
                goto L18
            L13:
                kotlinx.coroutines.q2.g$a$a r0 = new kotlinx.coroutines.q2.g$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f30484c
                java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
                int r2 = r0.f30485d
                r3 = 1
                if (r2 == 0) goto L3e
                if (r2 != r3) goto L36
                int r8 = r0.f30490y
                int r2 = r0.f30489x
                java.lang.Object r4 = r0.f30488w
                java.lang.Object[] r4 = (java.lang.Object[]) r4
                java.lang.Object r5 = r0.f30487f
                kotlinx.coroutines.q2.e r5 = (kotlinx.coroutines.p559q2.InterfaceC13969e) r5
                kotlin.C13291q.m5357b(r9)
                r9 = r5
                goto L49
            L36:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3e:
                kotlin.C13291q.m5357b(r9)
                java.lang.Object[] r9 = r7.f30483c
                r2 = 0
                int r4 = r9.length
                r6 = r9
                r9 = r8
                r8 = r4
                r4 = r6
            L49:
                if (r2 >= r8) goto L60
                r5 = r4[r2]
                int r2 = r2 + 1
                r0.f30487f = r9
                r0.f30488w = r4
                r0.f30489x = r2
                r0.f30490y = r8
                r0.f30485d = r3
                java.lang.Object r5 = r9.emit(r5, r0)
                if (r5 != r1) goto L49
                return r1
            L60:
                kotlin.w r8 = kotlin.C13666w.f30112a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p559q2.C13974g.C13975a.mo3175a(kotlinx.coroutines.q2.e, kotlin.c0.d):java.lang.Object");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: kotlinx.coroutines.q2.g$b */
    /* loaded from: classes3.dex */
    public static final class C13977b implements InterfaceC13964d<T> {

        /* renamed from: c */
        final /* synthetic */ Object f30491c;

        public C13977b(Object obj) {
            this.f30491c = obj;
        }

        @Override // kotlinx.coroutines.p559q2.InterfaceC13964d
        /* renamed from: a */
        public Object mo3175a(InterfaceC13969e<? super T> interfaceC13969e, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            Object m10387d;
            Object emit = interfaceC13969e.emit(this.f30491c, interfaceC11714d);
            m10387d = C11734d.m10387d();
            return emit == m10387d ? emit : C13666w.f30112a;
        }
    }

    /* renamed from: a */
    public static final <T> InterfaceC13964d<T> m3305a(InterfaceC11771p<? super InterfaceC13969e<? super T>, ? super InterfaceC11714d<? super C13666w>, ? extends Object> interfaceC11771p) {
        return new C14024u(interfaceC11771p);
    }

    /* renamed from: b */
    public static final <T> InterfaceC13964d<T> m3304b(T t) {
        return new C13977b(t);
    }

    /* renamed from: c */
    public static final <T> InterfaceC13964d<T> m3303c(T... tArr) {
        return new C13975a(tArr);
    }
}

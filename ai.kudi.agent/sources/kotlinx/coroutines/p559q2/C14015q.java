package kotlinx.coroutines.p559q2;

import kotlin.C13666w;
import kotlin.c0.k.a.f;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11738d;
import kotlin.p483e0.p485d.C11811v;
import kotlin.p557z.C13705i0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Transform.kt */
/* renamed from: kotlinx.coroutines.q2.q */
/* loaded from: classes3.dex */
public final /* synthetic */ class C14015q {

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: kotlinx.coroutines.q2.q$a */
    /* loaded from: classes3.dex */
    public static final class C14016a implements InterfaceC13964d<T> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC13964d f30579c;

        /* compiled from: Collect.kt */
        /* renamed from: kotlinx.coroutines.q2.q$a$a */
        /* loaded from: classes3.dex */
        public static final class C14017a implements InterfaceC13969e<T> {

            /* renamed from: c */
            final /* synthetic */ InterfaceC13969e f30580c;

            @f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {136}, m = "emit")
            /* renamed from: kotlinx.coroutines.q2.q$a$a$a */
            /* loaded from: classes3.dex */
            public static final class C14018a extends AbstractC11738d {

                /* renamed from: c */
                /* synthetic */ Object f30581c;

                /* renamed from: d */
                int f30582d;

                public C14018a(InterfaceC11714d interfaceC11714d) {
                    super(interfaceC11714d);
                }

                @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
                public final Object invokeSuspend(Object obj) {
                    this.f30581c = obj;
                    this.f30582d |= Integer.MIN_VALUE;
                    return C14017a.this.emit(null, this);
                }
            }

            public C14017a(InterfaceC13969e interfaceC13969e) {
                this.f30580c = interfaceC13969e;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // kotlinx.coroutines.p559q2.InterfaceC13969e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object emit(java.lang.Object r5, kotlin.p476c0.InterfaceC11714d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof kotlinx.coroutines.p559q2.C14015q.C14016a.C14017a.C14018a
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.q2.q$a$a$a r0 = (kotlinx.coroutines.p559q2.C14015q.C14016a.C14017a.C14018a) r0
                    int r1 = r0.f30582d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f30582d = r1
                    goto L18
                L13:
                    kotlinx.coroutines.q2.q$a$a$a r0 = new kotlinx.coroutines.q2.q$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f30581c
                    java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
                    int r2 = r0.f30582d
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C13291q.m5357b(r6)
                    goto L41
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C13291q.m5357b(r6)
                    kotlinx.coroutines.q2.e r6 = r4.f30580c
                    if (r5 == 0) goto L41
                    r0.f30582d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L41
                    return r1
                L41:
                    kotlin.w r5 = kotlin.C13666w.f30112a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p559q2.C14015q.C14016a.C14017a.emit(java.lang.Object, kotlin.c0.d):java.lang.Object");
            }
        }

        public C14016a(InterfaceC13964d interfaceC13964d) {
            this.f30579c = interfaceC13964d;
        }

        @Override // kotlinx.coroutines.p559q2.InterfaceC13964d
        /* renamed from: a */
        public Object mo3175a(InterfaceC13969e interfaceC13969e, InterfaceC11714d interfaceC11714d) {
            Object m10387d;
            Object mo3175a = this.f30579c.mo3175a(new C14017a(interfaceC13969e), interfaceC11714d);
            m10387d = C11734d.m10387d();
            return mo3175a == m10387d ? mo3175a : C13666w.f30112a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: kotlinx.coroutines.q2.q$b */
    /* loaded from: classes3.dex */
    public static final class C14019b implements InterfaceC13964d<C13705i0<? extends T>> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC13964d f30584c;

        public C14019b(InterfaceC13964d interfaceC13964d) {
            this.f30584c = interfaceC13964d;
        }

        @Override // kotlinx.coroutines.p559q2.InterfaceC13964d
        /* renamed from: a */
        public Object mo3175a(InterfaceC13969e<? super C13705i0<? extends T>> interfaceC13969e, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            Object m10387d;
            Object mo3175a = this.f30584c.mo3175a(new C14020c(interfaceC13969e, new C11811v()), interfaceC11714d);
            m10387d = C11734d.m10387d();
            return mo3175a == m10387d ? mo3175a : C13666w.f30112a;
        }
    }

    /* compiled from: Collect.kt */
    /* renamed from: kotlinx.coroutines.q2.q$c */
    /* loaded from: classes3.dex */
    public static final class C14020c implements InterfaceC13969e<T> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC13969e f30585c;

        /* renamed from: d */
        final /* synthetic */ C11811v f30586d;

        public C14020c(InterfaceC13969e interfaceC13969e, C11811v c11811v) {
            this.f30585c = interfaceC13969e;
            this.f30586d = c11811v;
        }

        @Override // kotlinx.coroutines.p559q2.InterfaceC13969e
        public Object emit(T t, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            Object m10387d;
            InterfaceC13969e interfaceC13969e = this.f30585c;
            C11811v c11811v = this.f30586d;
            int i = c11811v.f26498c;
            c11811v.f26498c = i + 1;
            if (i >= 0) {
                Object emit = interfaceC13969e.emit(new C13705i0(i, t), interfaceC11714d);
                m10387d = C11734d.m10387d();
                return emit == m10387d ? emit : C13666w.f30112a;
            }
            throw new ArithmeticException("Index overflow has happened");
        }
    }

    /* renamed from: a */
    public static final <T> InterfaceC13964d<T> m3260a(InterfaceC13964d<? extends T> interfaceC13964d) {
        return new C14016a(interfaceC13964d);
    }

    /* renamed from: b */
    public static final <T> InterfaceC13964d<C13705i0<T>> m3259b(InterfaceC13964d<? extends T> interfaceC13964d) {
        return new C14019b(interfaceC13964d);
    }
}

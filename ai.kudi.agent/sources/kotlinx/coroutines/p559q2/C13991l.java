package kotlinx.coroutines.p559q2;

import kotlin.C13666w;
import kotlin.c0.k.a.f;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p478k.p479a.AbstractC11738d;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p484c.InterfaceC11772q;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Emitters.kt */
/* renamed from: kotlinx.coroutines.q2.l */
/* loaded from: classes3.dex */
public final /* synthetic */ class C13991l {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Emitters.kt */
    @f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", l = {216}, m = "invokeSafely$FlowKt__EmittersKt")
    /* renamed from: kotlinx.coroutines.q2.l$a */
    /* loaded from: classes3.dex */
    public static final class C13992a<T> extends AbstractC11738d {

        /* renamed from: c */
        Object f30514c;

        /* renamed from: d */
        /* synthetic */ Object f30515d;

        /* renamed from: e */
        int f30516e;

        C13992a(InterfaceC11714d<? super C13992a> interfaceC11714d) {
            super(interfaceC11714d);
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            this.f30515d = obj;
            this.f30516e |= Integer.MIN_VALUE;
            return C13991l.m3276c(null, null, null, this);
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: kotlinx.coroutines.q2.l$b */
    /* loaded from: classes3.dex */
    public static final class C13993b implements InterfaceC13964d<T> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC13964d f30517c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC11772q f30518d;

        @f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {114, 121, 128}, m = "collect")
        /* renamed from: kotlinx.coroutines.q2.l$b$a */
        /* loaded from: classes3.dex */
        public static final class C13994a extends AbstractC11738d {

            /* renamed from: c */
            /* synthetic */ Object f30519c;

            /* renamed from: d */
            int f30520d;

            /* renamed from: f */
            Object f30522f;

            /* renamed from: w */
            Object f30523w;

            public C13994a(InterfaceC11714d interfaceC11714d) {
                super(interfaceC11714d);
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final Object invokeSuspend(Object obj) {
                this.f30519c = obj;
                this.f30520d |= Integer.MIN_VALUE;
                return C13993b.this.mo3175a(null, this);
            }
        }

        public C13993b(InterfaceC13964d interfaceC13964d, InterfaceC11772q interfaceC11772q) {
            this.f30517c = interfaceC13964d;
            this.f30518d = interfaceC11772q;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0086 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00ab A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
        @Override // kotlinx.coroutines.p559q2.InterfaceC13964d
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo3175a(kotlinx.coroutines.p559q2.InterfaceC13969e<? super T> r9, kotlin.p476c0.InterfaceC11714d<? super kotlin.C13666w> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof kotlinx.coroutines.p559q2.C13991l.C13993b.C13994a
                if (r0 == 0) goto L13
                r0 = r10
                kotlinx.coroutines.q2.l$b$a r0 = (kotlinx.coroutines.p559q2.C13991l.C13993b.C13994a) r0
                int r1 = r0.f30520d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f30520d = r1
                goto L18
            L13:
                kotlinx.coroutines.q2.l$b$a r0 = new kotlinx.coroutines.q2.l$b$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f30519c
                java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
                int r2 = r0.f30520d
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L54
                if (r2 == r5) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r9 = r0.f30522f
                kotlinx.coroutines.flow.internal.q r9 = (kotlinx.coroutines.flow.internal.C13842q) r9
                kotlin.C13291q.m5357b(r10)     // Catch: java.lang.Throwable -> L34
                goto L88
            L34:
                r10 = move-exception
                goto L92
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                java.lang.Object r9 = r0.f30522f
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                kotlin.C13291q.m5357b(r10)
                goto Lac
            L46:
                java.lang.Object r9 = r0.f30523w
                kotlinx.coroutines.q2.e r9 = (kotlinx.coroutines.p559q2.InterfaceC13969e) r9
                java.lang.Object r2 = r0.f30522f
                kotlinx.coroutines.q2.l$b r2 = (kotlinx.coroutines.p559q2.C13991l.C13993b) r2
                kotlin.C13291q.m5357b(r10)     // Catch: java.lang.Throwable -> L52
                goto L67
            L52:
                r9 = move-exception
                goto L98
            L54:
                kotlin.C13291q.m5357b(r10)
                kotlinx.coroutines.q2.d r10 = r8.f30517c     // Catch: java.lang.Throwable -> L96
                r0.f30522f = r8     // Catch: java.lang.Throwable -> L96
                r0.f30523w = r9     // Catch: java.lang.Throwable -> L96
                r0.f30520d = r5     // Catch: java.lang.Throwable -> L96
                java.lang.Object r10 = r10.mo3175a(r9, r0)     // Catch: java.lang.Throwable -> L96
                if (r10 != r1) goto L66
                return r1
            L66:
                r2 = r8
            L67:
                kotlinx.coroutines.flow.internal.q r10 = new kotlinx.coroutines.flow.internal.q
                kotlin.c0.g r4 = r0.getContext()
                r10.<init>(r9, r4)
                kotlin.e0.c.q r9 = r2.f30518d     // Catch: java.lang.Throwable -> L8e
                r0.f30522f = r10     // Catch: java.lang.Throwable -> L8e
                r0.f30523w = r6     // Catch: java.lang.Throwable -> L8e
                r0.f30520d = r3     // Catch: java.lang.Throwable -> L8e
                r2 = 6
                kotlin.p483e0.p485d.C11801k.m10321a(r2)     // Catch: java.lang.Throwable -> L8e
                java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L8e
                r0 = 7
                kotlin.p483e0.p485d.C11801k.m10321a(r0)     // Catch: java.lang.Throwable -> L8e
                if (r9 != r1) goto L87
                return r1
            L87:
                r9 = r10
            L88:
                r9.releaseIntercepted()
                kotlin.w r9 = kotlin.C13666w.f30112a
                return r9
            L8e:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L92:
                r9.releaseIntercepted()
                throw r10
            L96:
                r9 = move-exception
                r2 = r8
            L98:
                kotlinx.coroutines.q2.k0 r10 = new kotlinx.coroutines.q2.k0
                r10.<init>(r9)
                kotlin.e0.c.q r2 = r2.f30518d
                r0.f30522f = r9
                r0.f30523w = r6
                r0.f30520d = r4
                java.lang.Object r10 = kotlinx.coroutines.p559q2.C13991l.m3278a(r10, r2, r9, r0)
                if (r10 != r1) goto Lac
                return r1
            Lac:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p559q2.C13991l.C13993b.mo3175a(kotlinx.coroutines.q2.e, kotlin.c0.d):java.lang.Object");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: kotlinx.coroutines.q2.l$c */
    /* loaded from: classes3.dex */
    public static final class C13995c implements InterfaceC13964d<T> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC11771p f30524c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC13964d f30525d;

        @f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {116, 120}, m = "collect")
        /* renamed from: kotlinx.coroutines.q2.l$c$a */
        /* loaded from: classes3.dex */
        public static final class C13996a extends AbstractC11738d {

            /* renamed from: c */
            /* synthetic */ Object f30526c;

            /* renamed from: d */
            int f30527d;

            /* renamed from: f */
            Object f30529f;

            /* renamed from: w */
            Object f30530w;

            /* renamed from: x */
            Object f30531x;

            public C13996a(InterfaceC11714d interfaceC11714d) {
                super(interfaceC11714d);
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final Object invokeSuspend(Object obj) {
                this.f30526c = obj;
                this.f30527d |= Integer.MIN_VALUE;
                return C13995c.this.mo3175a(null, this);
            }
        }

        public C13995c(InterfaceC11771p interfaceC11771p, InterfaceC13964d interfaceC13964d) {
            this.f30524c = interfaceC11771p;
            this.f30525d = interfaceC13964d;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[RETURN] */
        @Override // kotlinx.coroutines.p559q2.InterfaceC13964d
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo3175a(kotlinx.coroutines.p559q2.InterfaceC13969e<? super T> r7, kotlin.p476c0.InterfaceC11714d<? super kotlin.C13666w> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.p559q2.C13991l.C13995c.C13996a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.q2.l$c$a r0 = (kotlinx.coroutines.p559q2.C13991l.C13995c.C13996a) r0
                int r1 = r0.f30527d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f30527d = r1
                goto L18
            L13:
                kotlinx.coroutines.q2.l$c$a r0 = new kotlinx.coroutines.q2.l$c$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f30526c
                java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
                int r2 = r0.f30527d
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.C13291q.m5357b(r8)
                goto L83
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.f30531x
                kotlinx.coroutines.flow.internal.q r7 = (kotlinx.coroutines.flow.internal.C13842q) r7
                java.lang.Object r2 = r0.f30530w
                kotlinx.coroutines.q2.e r2 = (kotlinx.coroutines.p559q2.InterfaceC13969e) r2
                java.lang.Object r4 = r0.f30529f
                kotlinx.coroutines.q2.l$c r4 = (kotlinx.coroutines.p559q2.C13991l.C13995c) r4
                kotlin.C13291q.m5357b(r8)     // Catch: java.lang.Throwable -> L44
                goto L6e
            L44:
                r8 = move-exception
                goto L8a
            L46:
                kotlin.C13291q.m5357b(r8)
                kotlinx.coroutines.flow.internal.q r8 = new kotlinx.coroutines.flow.internal.q
                kotlin.c0.g r2 = r0.getContext()
                r8.<init>(r7, r2)
                kotlin.e0.c.p r2 = r6.f30524c     // Catch: java.lang.Throwable -> L86
                r0.f30529f = r6     // Catch: java.lang.Throwable -> L86
                r0.f30530w = r7     // Catch: java.lang.Throwable -> L86
                r0.f30531x = r8     // Catch: java.lang.Throwable -> L86
                r0.f30527d = r4     // Catch: java.lang.Throwable -> L86
                r4 = 6
                kotlin.p483e0.p485d.C11801k.m10321a(r4)     // Catch: java.lang.Throwable -> L86
                java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L86
                r4 = 7
                kotlin.p483e0.p485d.C11801k.m10321a(r4)     // Catch: java.lang.Throwable -> L86
                if (r2 != r1) goto L6b
                return r1
            L6b:
                r4 = r6
                r2 = r7
                r7 = r8
            L6e:
                r7.releaseIntercepted()
                kotlinx.coroutines.q2.d r7 = r4.f30525d
                r8 = 0
                r0.f30529f = r8
                r0.f30530w = r8
                r0.f30531x = r8
                r0.f30527d = r3
                java.lang.Object r7 = r7.mo3175a(r2, r0)
                if (r7 != r1) goto L83
                return r1
            L83:
                kotlin.w r7 = kotlin.C13666w.f30112a
                return r7
            L86:
                r7 = move-exception
                r5 = r8
                r8 = r7
                r7 = r5
            L8a:
                r7.releaseIntercepted()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p559q2.C13991l.C13995c.mo3175a(kotlinx.coroutines.q2.e, kotlin.c0.d):java.lang.Object");
        }
    }

    /* renamed from: b */
    public static final void m3277b(InterfaceC13969e<?> interfaceC13969e) {
        if (interfaceC13969e instanceof C13990k0) {
            throw ((C13990k0) interfaceC13969e).f30513c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object m3276c(kotlinx.coroutines.p559q2.InterfaceC13969e<? super T> r4, kotlin.p483e0.p484c.InterfaceC11772q<? super kotlinx.coroutines.p559q2.InterfaceC13969e<? super T>, ? super java.lang.Throwable, ? super kotlin.p476c0.InterfaceC11714d<? super kotlin.C13666w>, ? extends java.lang.Object> r5, java.lang.Throwable r6, kotlin.p476c0.InterfaceC11714d<? super kotlin.C13666w> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.p559q2.C13991l.C13992a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.q2.l$a r0 = (kotlinx.coroutines.p559q2.C13991l.C13992a) r0
            int r1 = r0.f30516e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30516e = r1
            goto L18
        L13:
            kotlinx.coroutines.q2.l$a r0 = new kotlinx.coroutines.q2.l$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f30515d
            java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
            int r2 = r0.f30516e
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.f30514c
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            kotlin.C13291q.m5357b(r7)     // Catch: java.lang.Throwable -> L47
            goto L44
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.C13291q.m5357b(r7)
            r0.f30514c = r6     // Catch: java.lang.Throwable -> L47
            r0.f30516e = r3     // Catch: java.lang.Throwable -> L47
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L47
            if (r4 != r1) goto L44
            return r1
        L44:
            kotlin.w r4 = kotlin.C13666w.f30112a
            return r4
        L47:
            r4 = move-exception
            if (r6 == 0) goto L4f
            if (r6 == r4) goto L4f
            kotlin.C11706b.m10414a(r4, r6)
        L4f:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p559q2.C13991l.m3276c(kotlinx.coroutines.q2.e, kotlin.e0.c.q, java.lang.Throwable, kotlin.c0.d):java.lang.Object");
    }

    /* renamed from: d */
    public static final <T> InterfaceC13964d<T> m3275d(InterfaceC13964d<? extends T> interfaceC13964d, InterfaceC11772q<? super InterfaceC13969e<? super T>, ? super Throwable, ? super InterfaceC11714d<? super C13666w>, ? extends Object> interfaceC11772q) {
        return new C13993b(interfaceC13964d, interfaceC11772q);
    }

    /* renamed from: e */
    public static final <T> InterfaceC13964d<T> m3274e(InterfaceC13964d<? extends T> interfaceC13964d, InterfaceC11771p<? super InterfaceC13969e<? super T>, ? super InterfaceC11714d<? super C13666w>, ? extends Object> interfaceC11771p) {
        return new C13995c(interfaceC11771p, interfaceC13964d);
    }
}

package kotlinx.coroutines.p559q2;

import kotlin.c0.k.a.f;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p478k.p479a.AbstractC11738d;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.C11812w;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Reduce.kt */
/* renamed from: kotlinx.coroutines.q2.o */
/* loaded from: classes3.dex */
public final /* synthetic */ class C14006o {

    /* compiled from: Limit.kt */
    /* renamed from: kotlinx.coroutines.q2.o$a */
    /* loaded from: classes3.dex */
    public static final class C14007a implements InterfaceC13969e<T> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC11771p f30554c;

        /* renamed from: d */
        final /* synthetic */ C11812w f30555d;

        @f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", l = {IjkMediaMeta.FF_PROFILE_H264_HIGH_444}, m = "emit")
        /* renamed from: kotlinx.coroutines.q2.o$a$a */
        /* loaded from: classes3.dex */
        public static final class C14008a extends AbstractC11738d {

            /* renamed from: c */
            Object f30556c;

            /* renamed from: d */
            /* synthetic */ Object f30557d;

            /* renamed from: e */
            int f30558e;

            /* renamed from: w */
            Object f30560w;

            public C14008a(InterfaceC11714d interfaceC11714d) {
                super(interfaceC11714d);
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final Object invokeSuspend(Object obj) {
                this.f30557d = obj;
                this.f30558e |= Integer.MIN_VALUE;
                return C14007a.this.emit(null, this);
            }
        }

        public C14007a(InterfaceC11771p interfaceC11771p, C11812w c11812w) {
            this.f30554c = interfaceC11771p;
            this.f30555d = c11812w;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
        @Override // kotlinx.coroutines.p559q2.InterfaceC13969e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(T r5, kotlin.p476c0.InterfaceC11714d<? super kotlin.C13666w> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.p559q2.C14006o.C14007a.C14008a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.q2.o$a$a r0 = (kotlinx.coroutines.p559q2.C14006o.C14007a.C14008a) r0
                int r1 = r0.f30558e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f30558e = r1
                goto L18
            L13:
                kotlinx.coroutines.q2.o$a$a r0 = new kotlinx.coroutines.q2.o$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f30557d
                java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
                int r2 = r0.f30558e
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f30560w
                java.lang.Object r0 = r0.f30556c
                kotlinx.coroutines.q2.o$a r0 = (kotlinx.coroutines.p559q2.C14006o.C14007a) r0
                kotlin.C13291q.m5357b(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                kotlin.C13291q.m5357b(r6)
                kotlin.e0.c.p r6 = r4.f30554c
                r0.f30556c = r4
                r0.f30560w = r5
                r0.f30558e = r3
                r2 = 6
                kotlin.p483e0.p485d.C11801k.m10321a(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                kotlin.p483e0.p485d.C11801k.m10321a(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L5f
                kotlin.e0.d.w r6 = r0.f30555d
                r6.f26499c = r5
                r3 = 0
            L5f:
                if (r3 == 0) goto L64
                kotlin.w r5 = kotlin.C13666w.f30112a
                return r5
            L64:
                kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p559q2.C14006o.C14007a.emit(java.lang.Object, kotlin.c0.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Reduce.kt */
    @f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {183}, m = "first")
    /* renamed from: kotlinx.coroutines.q2.o$b */
    /* loaded from: classes3.dex */
    public static final class C14009b<T> extends AbstractC11738d {

        /* renamed from: c */
        Object f30561c;

        /* renamed from: d */
        Object f30562d;

        /* renamed from: e */
        Object f30563e;

        /* renamed from: f */
        /* synthetic */ Object f30564f;

        /* renamed from: w */
        int f30565w;

        C14009b(InterfaceC11714d<? super C14009b> interfaceC11714d) {
            super(interfaceC11714d);
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            this.f30564f = obj;
            this.f30565w |= Integer.MIN_VALUE;
            return C13971f.m3320n(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object m3268a(kotlinx.coroutines.p559q2.InterfaceC13964d<? extends T> r4, kotlin.p483e0.p484c.InterfaceC11771p<? super T, ? super kotlin.p476c0.InterfaceC11714d<? super java.lang.Boolean>, ? extends java.lang.Object> r5, kotlin.p476c0.InterfaceC11714d<? super T> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.p559q2.C14006o.C14009b
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.q2.o$b r0 = (kotlinx.coroutines.p559q2.C14006o.C14009b) r0
            int r1 = r0.f30565w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30565w = r1
            goto L18
        L13:
            kotlinx.coroutines.q2.o$b r0 = new kotlinx.coroutines.q2.o$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f30564f
            java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
            int r2 = r0.f30565w
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r4 = r0.f30563e
            kotlinx.coroutines.q2.o$a r4 = (kotlinx.coroutines.p559q2.C14006o.C14007a) r4
            java.lang.Object r5 = r0.f30562d
            kotlin.e0.d.w r5 = (kotlin.p483e0.p485d.C11812w) r5
            java.lang.Object r0 = r0.f30561c
            kotlin.e0.c.p r0 = (kotlin.p483e0.p484c.InterfaceC11771p) r0
            kotlin.C13291q.m5357b(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L35
            goto L6a
        L35:
            r6 = move-exception
            goto L67
        L37:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3f:
            kotlin.C13291q.m5357b(r6)
            kotlin.e0.d.w r6 = new kotlin.e0.d.w
            r6.<init>()
            kotlinx.coroutines.internal.y r2 = kotlinx.coroutines.flow.internal.C13841p.f30311a
            r6.f26499c = r2
            kotlinx.coroutines.q2.o$a r2 = new kotlinx.coroutines.q2.o$a
            r2.<init>(r5, r6)
            r0.f30561c = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            r0.f30562d = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            r0.f30563e = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            r0.f30565w = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            java.lang.Object r4 = r4.mo3175a(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            if (r4 != r1) goto L5f
            return r1
        L5f:
            r0 = r5
            r5 = r6
            goto L6a
        L62:
            r4 = move-exception
            r0 = r5
            r5 = r6
            r6 = r4
            r4 = r2
        L67:
            kotlinx.coroutines.flow.internal.C13836l.m3590a(r6, r4)
        L6a:
            T r4 = r5.f26499c
            kotlinx.coroutines.internal.y r5 = kotlinx.coroutines.flow.internal.C13841p.f30311a
            if (r4 == r5) goto L71
            return r4
        L71:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element matching the predicate "
            java.lang.String r5 = kotlin.e0.d.l.m(r5, r0)
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p559q2.C14006o.m3268a(kotlinx.coroutines.q2.d, kotlin.e0.c.p, kotlin.c0.d):java.lang.Object");
    }
}

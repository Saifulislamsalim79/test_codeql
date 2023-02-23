package p201g.p259r;

import java.util.concurrent.CancellationException;
import kotlin.C13666w;
import kotlin.c0.k.a.f;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p478k.p479a.AbstractC11738d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlinx.coroutines.InterfaceC13932m0;
import kotlinx.coroutines.InterfaceC13947p1;
import kotlinx.coroutines.p564v2.C14102d;
import kotlinx.coroutines.p564v2.InterfaceC14094b;
/* compiled from: SingleRunner.kt */
/* renamed from: g.r.h1 */
/* loaded from: classes2.dex */
public final class C7892h1 {

    /* renamed from: a */
    private final C7894b f18898a;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SingleRunner.kt */
    /* renamed from: g.r.h1$a */
    /* loaded from: classes2.dex */
    public static final class C7893a extends CancellationException {

        /* renamed from: c */
        private final C7892h1 f18899c;

        public C7893a(C7892h1 c7892h1) {
            l.f(c7892h1, "runner");
            this.f18899c = c7892h1;
        }

        /* renamed from: a */
        public final C7892h1 m17103a() {
            return this.f18899c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SingleRunner.kt */
    /* renamed from: g.r.h1$b */
    /* loaded from: classes2.dex */
    public static final class C7894b {

        /* renamed from: a */
        private final C7892h1 f18900a;

        /* renamed from: b */
        private final boolean f18901b;

        /* renamed from: c */
        private final InterfaceC14094b f18902c;

        /* renamed from: d */
        private InterfaceC13947p1 f18903d;

        /* renamed from: e */
        private int f18904e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SingleRunner.kt */
        @f(c = "androidx.paging.SingleRunner$Holder", f = "SingleRunner.kt", l = {129}, m = "onFinish")
        /* renamed from: g.r.h1$b$a */
        /* loaded from: classes2.dex */
        public static final class C7895a extends AbstractC11738d {

            /* renamed from: c */
            Object f18905c;

            /* renamed from: d */
            Object f18906d;

            /* renamed from: e */
            Object f18907e;

            /* renamed from: f */
            /* synthetic */ Object f18908f;

            /* renamed from: x */
            int f18910x;

            C7895a(InterfaceC11714d<? super C7895a> interfaceC11714d) {
                super(interfaceC11714d);
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final Object invokeSuspend(Object obj) {
                this.f18908f = obj;
                this.f18910x |= Integer.MIN_VALUE;
                return C7894b.this.m17102a(null, this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SingleRunner.kt */
        @f(c = "androidx.paging.SingleRunner$Holder", f = "SingleRunner.kt", l = {129, 100}, m = "tryEnqueue")
        /* renamed from: g.r.h1$b$b */
        /* loaded from: classes2.dex */
        public static final class C7896b extends AbstractC11738d {

            /* renamed from: c */
            Object f18911c;

            /* renamed from: d */
            Object f18912d;

            /* renamed from: e */
            Object f18913e;

            /* renamed from: f */
            int f18914f;

            /* renamed from: w */
            /* synthetic */ Object f18915w;

            /* renamed from: y */
            int f18917y;

            C7896b(InterfaceC11714d<? super C7896b> interfaceC11714d) {
                super(interfaceC11714d);
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final Object invokeSuspend(Object obj) {
                this.f18915w = obj;
                this.f18917y |= Integer.MIN_VALUE;
                return C7894b.this.m17101b(0, null, this);
            }
        }

        public C7894b(C7892h1 c7892h1, boolean z) {
            l.f(c7892h1, "singleRunner");
            this.f18900a = c7892h1;
            this.f18901b = z;
            this.f18902c = C14102d.m2968b(false, 1, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0059 A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:18:0x0055, B:20:0x0059, B:21:0x005b), top: B:27:0x0055 }] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object m17102a(kotlinx.coroutines.InterfaceC13947p1 r6, kotlin.p476c0.InterfaceC11714d<? super kotlin.C13666w> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof p201g.p259r.C7892h1.C7894b.C7895a
                if (r0 == 0) goto L13
                r0 = r7
                g.r.h1$b$a r0 = (p201g.p259r.C7892h1.C7894b.C7895a) r0
                int r1 = r0.f18910x
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f18910x = r1
                goto L18
            L13:
                g.r.h1$b$a r0 = new g.r.h1$b$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f18908f
                java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
                int r2 = r0.f18910x
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L40
                if (r2 != r3) goto L38
                java.lang.Object r6 = r0.f18907e
                kotlinx.coroutines.v2.b r6 = (kotlinx.coroutines.p564v2.InterfaceC14094b) r6
                java.lang.Object r1 = r0.f18906d
                kotlinx.coroutines.p1 r1 = (kotlinx.coroutines.InterfaceC13947p1) r1
                java.lang.Object r0 = r0.f18905c
                g.r.h1$b r0 = (p201g.p259r.C7892h1.C7894b) r0
                kotlin.C13291q.m5357b(r7)
                r7 = r6
                r6 = r1
                goto L55
            L38:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L40:
                kotlin.C13291q.m5357b(r7)
                kotlinx.coroutines.v2.b r7 = r5.f18902c
                r0.f18905c = r5
                r0.f18906d = r6
                r0.f18907e = r7
                r0.f18910x = r3
                java.lang.Object r0 = r7.mo2980a(r4, r0)
                if (r0 != r1) goto L54
                return r1
            L54:
                r0 = r5
            L55:
                kotlinx.coroutines.p1 r1 = r0.f18903d     // Catch: java.lang.Throwable -> L63
                if (r6 != r1) goto L5b
                r0.f18903d = r4     // Catch: java.lang.Throwable -> L63
            L5b:
                kotlin.w r6 = kotlin.C13666w.f30112a     // Catch: java.lang.Throwable -> L63
                r7.mo2979b(r4)
                kotlin.w r6 = kotlin.C13666w.f30112a
                return r6
            L63:
                r6 = move-exception
                r7.mo2979b(r4)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C7892h1.C7894b.m17102a(kotlinx.coroutines.p1, kotlin.c0.d):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x009b A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0037, B:46:0x00b0, B:47:0x00b4, B:24:0x0072, B:26:0x0076, B:28:0x007c, B:30:0x0080, B:32:0x0084, B:41:0x009b, B:38:0x008e), top: B:52:0x0023 }] */
        /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlinx.coroutines.p1] */
        /* JADX WARN: Type inference failed for: r11v1, types: [kotlinx.coroutines.v2.b] */
        /* JADX WARN: Type inference failed for: r11v16 */
        /* JADX WARN: Type inference failed for: r11v17 */
        /* JADX WARN: Type inference failed for: r11v4, types: [kotlinx.coroutines.v2.b] */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object m17101b(int r10, kotlinx.coroutines.InterfaceC13947p1 r11, kotlin.p476c0.InterfaceC11714d<? super java.lang.Boolean> r12) {
            /*
                r9 = this;
                boolean r0 = r12 instanceof p201g.p259r.C7892h1.C7894b.C7896b
                if (r0 == 0) goto L13
                r0 = r12
                g.r.h1$b$b r0 = (p201g.p259r.C7892h1.C7894b.C7896b) r0
                int r1 = r0.f18917y
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f18917y = r1
                goto L18
            L13:
                g.r.h1$b$b r0 = new g.r.h1$b$b
                r0.<init>(r12)
            L18:
                java.lang.Object r12 = r0.f18915w
                java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
                int r2 = r0.f18917y
                r3 = 2
                r4 = 0
                r5 = 1
                if (r2 == 0) goto L59
                if (r2 == r5) goto L47
                if (r2 != r3) goto L3f
                int r10 = r0.f18914f
                java.lang.Object r11 = r0.f18913e
                kotlinx.coroutines.v2.b r11 = (kotlinx.coroutines.p564v2.InterfaceC14094b) r11
                java.lang.Object r1 = r0.f18912d
                kotlinx.coroutines.p1 r1 = (kotlinx.coroutines.InterfaceC13947p1) r1
                java.lang.Object r0 = r0.f18911c
                g.r.h1$b r0 = (p201g.p259r.C7892h1.C7894b) r0
                kotlin.C13291q.m5357b(r12)     // Catch: java.lang.Throwable -> L3c
                goto Lae
            L3c:
                r10 = move-exception
                goto Lbc
            L3f:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L47:
                int r10 = r0.f18914f
                java.lang.Object r11 = r0.f18913e
                kotlinx.coroutines.v2.b r11 = (kotlinx.coroutines.p564v2.InterfaceC14094b) r11
                java.lang.Object r2 = r0.f18912d
                kotlinx.coroutines.p1 r2 = (kotlinx.coroutines.InterfaceC13947p1) r2
                java.lang.Object r6 = r0.f18911c
                g.r.h1$b r6 = (p201g.p259r.C7892h1.C7894b) r6
                kotlin.C13291q.m5357b(r12)
                goto L72
            L59:
                kotlin.C13291q.m5357b(r12)
                kotlinx.coroutines.v2.b r12 = r9.f18902c
                r0.f18911c = r9
                r0.f18912d = r11
                r0.f18913e = r12
                r0.f18914f = r10
                r0.f18917y = r5
                java.lang.Object r2 = r12.mo2980a(r4, r0)
                if (r2 != r1) goto L6f
                return r1
            L6f:
                r6 = r9
                r2 = r11
                r11 = r12
            L72:
                kotlinx.coroutines.p1 r12 = r6.f18903d     // Catch: java.lang.Throwable -> L3c
                if (r12 == 0) goto L8b
                boolean r7 = r12.isActive()     // Catch: java.lang.Throwable -> L3c
                if (r7 == 0) goto L8b
                int r7 = r6.f18904e     // Catch: java.lang.Throwable -> L3c
                if (r7 < r10) goto L8b
                int r7 = r6.f18904e     // Catch: java.lang.Throwable -> L3c
                if (r7 != r10) goto L89
                boolean r7 = r6.f18901b     // Catch: java.lang.Throwable -> L3c
                if (r7 == 0) goto L89
                goto L8b
            L89:
                r5 = 0
                goto Lb4
            L8b:
                if (r12 != 0) goto L8e
                goto L98
            L8e:
                g.r.h1$a r7 = new g.r.h1$a     // Catch: java.lang.Throwable -> L3c
                g.r.h1 r8 = r6.f18900a     // Catch: java.lang.Throwable -> L3c
                r7.<init>(r8)     // Catch: java.lang.Throwable -> L3c
                r12.mo3015m(r7)     // Catch: java.lang.Throwable -> L3c
            L98:
                if (r12 != 0) goto L9b
                goto Lb0
            L9b:
                r0.f18911c = r6     // Catch: java.lang.Throwable -> L3c
                r0.f18912d = r2     // Catch: java.lang.Throwable -> L3c
                r0.f18913e = r11     // Catch: java.lang.Throwable -> L3c
                r0.f18914f = r10     // Catch: java.lang.Throwable -> L3c
                r0.f18917y = r3     // Catch: java.lang.Throwable -> L3c
                java.lang.Object r12 = r12.mo3035P(r0)     // Catch: java.lang.Throwable -> L3c
                if (r12 != r1) goto Lac
                return r1
            Lac:
                r1 = r2
                r0 = r6
            Lae:
                r6 = r0
                r2 = r1
            Lb0:
                r6.f18903d = r2     // Catch: java.lang.Throwable -> L3c
                r6.f18904e = r10     // Catch: java.lang.Throwable -> L3c
            Lb4:
                java.lang.Boolean r10 = kotlin.p476c0.p478k.p479a.C11736b.m10382a(r5)     // Catch: java.lang.Throwable -> L3c
                r11.mo2979b(r4)
                return r10
            Lbc:
                r11.mo2979b(r4)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C7892h1.C7894b.m17101b(int, kotlinx.coroutines.p1, kotlin.c0.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SingleRunner.kt */
    @f(c = "androidx.paging.SingleRunner", f = "SingleRunner.kt", l = {49}, m = "runInIsolation")
    /* renamed from: g.r.h1$c */
    /* loaded from: classes2.dex */
    public static final class C7897c extends AbstractC11738d {

        /* renamed from: c */
        Object f18918c;

        /* renamed from: d */
        /* synthetic */ Object f18919d;

        /* renamed from: f */
        int f18921f;

        C7897c(InterfaceC11714d<? super C7897c> interfaceC11714d) {
            super(interfaceC11714d);
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            this.f18919d = obj;
            this.f18921f |= Integer.MIN_VALUE;
            return C7892h1.this.m17105b(0, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SingleRunner.kt */
    @f(c = "androidx.paging.SingleRunner$runInIsolation$2", f = "SingleRunner.kt", l = {53, 59, 61, 61}, m = "invokeSuspend")
    /* renamed from: g.r.h1$d */
    /* loaded from: classes2.dex */
    public static final class C7898d extends AbstractC11745k implements InterfaceC11771p<InterfaceC13932m0, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        int f18922c;

        /* renamed from: d */
        private /* synthetic */ Object f18923d;

        /* renamed from: f */
        final /* synthetic */ int f18925f;

        /* renamed from: w */
        final /* synthetic */ InterfaceC11767l<InterfaceC11714d<? super C13666w>, Object> f18926w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C7898d(int i, InterfaceC11767l<? super InterfaceC11714d<? super C13666w>, ? extends Object> interfaceC11767l, InterfaceC11714d<? super C7898d> interfaceC11714d) {
            super(2, interfaceC11714d);
            this.f18925f = i;
            this.f18926w = interfaceC11767l;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            C7898d c7898d = new C7898d(this.f18925f, this.f18926w, interfaceC11714d);
            c7898d.f18923d = obj;
            return c7898d;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public final Object invoke(InterfaceC13932m0 interfaceC13932m0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return ((C7898d) create(interfaceC13932m0, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008d A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.p1] */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v9, types: [kotlinx.coroutines.p1] */
        /* JADX WARN: Type inference failed for: r3v2, types: [g.r.h1$b] */
        /* JADX WARN: Type inference failed for: r9v15, types: [g.r.h1$b] */
        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.p476c0.p477j.C11728b.m10391d()
                int r1 = r8.f18922c
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L3c
                if (r1 == r5) goto L34
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L25
                if (r1 == r2) goto L1c
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1c:
                java.lang.Object r0 = r8.f18923d
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                kotlin.C13291q.m5357b(r9)
                goto La0
            L25:
                kotlin.C13291q.m5357b(r9)
                goto La1
            L2a:
                java.lang.Object r1 = r8.f18923d
                kotlinx.coroutines.p1 r1 = (kotlinx.coroutines.InterfaceC13947p1) r1
                kotlin.C13291q.m5357b(r9)     // Catch: java.lang.Throwable -> L32
                goto L7c
            L32:
                r9 = move-exception
                goto L8e
            L34:
                java.lang.Object r1 = r8.f18923d
                kotlinx.coroutines.p1 r1 = (kotlinx.coroutines.InterfaceC13947p1) r1
                kotlin.C13291q.m5357b(r9)
                goto L67
            L3c:
                kotlin.C13291q.m5357b(r9)
                java.lang.Object r9 = r8.f18923d
                kotlinx.coroutines.m0 r9 = (kotlinx.coroutines.InterfaceC13932m0) r9
                kotlin.c0.g r9 = r9.mo3397o0()
                kotlinx.coroutines.p1$b r1 = kotlinx.coroutines.InterfaceC13947p1.f30435u
                kotlin.c0.g$b r9 = r9.get(r1)
                if (r9 == 0) goto La4
                kotlinx.coroutines.p1 r9 = (kotlinx.coroutines.InterfaceC13947p1) r9
                g.r.h1 r1 = p201g.p259r.C7892h1.this
                g.r.h1$b r1 = p201g.p259r.C7892h1.m17106a(r1)
                int r6 = r8.f18925f
                r8.f18923d = r9
                r8.f18922c = r5
                java.lang.Object r1 = r1.m17101b(r6, r9, r8)
                if (r1 != r0) goto L64
                return r0
            L64:
                r7 = r1
                r1 = r9
                r9 = r7
            L67:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto La1
                kotlin.e0.c.l<kotlin.c0.d<? super kotlin.w>, java.lang.Object> r9 = r8.f18926w     // Catch: java.lang.Throwable -> L32
                r8.f18923d = r1     // Catch: java.lang.Throwable -> L32
                r8.f18922c = r4     // Catch: java.lang.Throwable -> L32
                java.lang.Object r9 = r9.invoke(r8)     // Catch: java.lang.Throwable -> L32
                if (r9 != r0) goto L7c
                return r0
            L7c:
                g.r.h1 r9 = p201g.p259r.C7892h1.this
                g.r.h1$b r9 = p201g.p259r.C7892h1.m17106a(r9)
                r2 = 0
                r8.f18923d = r2
                r8.f18922c = r3
                java.lang.Object r9 = r9.m17102a(r1, r8)
                if (r9 != r0) goto La1
                return r0
            L8e:
                g.r.h1 r3 = p201g.p259r.C7892h1.this
                g.r.h1$b r3 = p201g.p259r.C7892h1.m17106a(r3)
                r8.f18923d = r9
                r8.f18922c = r2
                java.lang.Object r1 = r3.m17102a(r1, r8)
                if (r1 != r0) goto L9f
                return r0
            L9f:
                r0 = r9
            La0:
                throw r0
            La1:
                kotlin.w r9 = kotlin.C13666w.f30112a
                return r9
            La4:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "Internal error. coroutineScope should've created a job."
                java.lang.String r0 = r0.toString()
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C7892h1.C7898d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C7892h1() {
        this(false, 1, null);
    }

    public C7892h1(boolean z) {
        this.f18898a = new C7894b(this, z);
    }

    /* renamed from: c */
    public static /* synthetic */ Object m17104c(C7892h1 c7892h1, int i, InterfaceC11767l interfaceC11767l, InterfaceC11714d interfaceC11714d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return c7892h1.m17105b(i, interfaceC11767l, interfaceC11714d);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m17105b(int r5, kotlin.p483e0.p484c.InterfaceC11767l<? super kotlin.p476c0.InterfaceC11714d<? super kotlin.C13666w>, ? extends java.lang.Object> r6, kotlin.p476c0.InterfaceC11714d<? super kotlin.C13666w> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof p201g.p259r.C7892h1.C7897c
            if (r0 == 0) goto L13
            r0 = r7
            g.r.h1$c r0 = (p201g.p259r.C7892h1.C7897c) r0
            int r1 = r0.f18921f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18921f = r1
            goto L18
        L13:
            g.r.h1$c r0 = new g.r.h1$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f18919d
            java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
            int r2 = r0.f18921f
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f18918c
            g.r.h1 r5 = (p201g.p259r.C7892h1) r5
            kotlin.C13291q.m5357b(r7)     // Catch: p201g.p259r.C7892h1.C7893a -> L2d
            goto L53
        L2d:
            r6 = move-exception
            goto L4d
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.C13291q.m5357b(r7)
            g.r.h1$d r7 = new g.r.h1$d     // Catch: p201g.p259r.C7892h1.C7893a -> L4b
            r2 = 0
            r7.<init>(r5, r6, r2)     // Catch: p201g.p259r.C7892h1.C7893a -> L4b
            r0.f18918c = r4     // Catch: p201g.p259r.C7892h1.C7893a -> L4b
            r0.f18921f = r3     // Catch: p201g.p259r.C7892h1.C7893a -> L4b
            java.lang.Object r5 = kotlinx.coroutines.C13936n0.m3361a(r7, r0)     // Catch: p201g.p259r.C7892h1.C7893a -> L4b
            if (r5 != r1) goto L53
            return r1
        L4b:
            r6 = move-exception
            r5 = r4
        L4d:
            g.r.h1 r7 = r6.m17103a()
            if (r7 != r5) goto L56
        L53:
            kotlin.w r5 = kotlin.C13666w.f30112a
            return r5
        L56:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C7892h1.m17105b(int, kotlin.e0.c.l, kotlin.c0.d):java.lang.Object");
    }

    public /* synthetic */ C7892h1(boolean z, int i, g gVar) {
        this((i & 1) != 0 ? true : z);
    }
}

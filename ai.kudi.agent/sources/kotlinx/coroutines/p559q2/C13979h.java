package kotlinx.coroutines.p559q2;

import kotlin.C13666w;
import kotlin.c0.k.a.f;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11738d;
import kotlinx.coroutines.channels.InterfaceC13797t;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Channels.kt */
/* renamed from: kotlinx.coroutines.q2.h */
/* loaded from: classes3.dex */
public final /* synthetic */ class C13979h {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Channels.kt */
    @f(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {51, 62}, m = "emitAllImpl$FlowKt__ChannelsKt")
    /* renamed from: kotlinx.coroutines.q2.h$a */
    /* loaded from: classes3.dex */
    public static final class C13980a<T> extends AbstractC11738d {

        /* renamed from: c */
        Object f30494c;

        /* renamed from: d */
        Object f30495d;

        /* renamed from: e */
        boolean f30496e;

        /* renamed from: f */
        /* synthetic */ Object f30497f;

        /* renamed from: w */
        int f30498w;

        C13980a(InterfaceC11714d<? super C13980a> interfaceC11714d) {
            super(interfaceC11714d);
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            this.f30497f = obj;
            this.f30498w |= Integer.MIN_VALUE;
            return C13979h.m3294d(null, null, false, this);
        }
    }

    /* renamed from: b */
    public static final <T> InterfaceC13964d<T> m3296b(InterfaceC13797t<? extends T> interfaceC13797t) {
        return new C13957b(interfaceC13797t, true, null, 0, null, 28, null);
    }

    /* renamed from: c */
    public static final <T> Object m3295c(InterfaceC13969e<? super T> interfaceC13969e, InterfaceC13797t<? extends T> interfaceC13797t, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        Object m10387d;
        Object m3294d = m3294d(interfaceC13969e, interfaceC13797t, true, interfaceC11714d);
        m10387d = C11734d.m10387d();
        return m3294d == m10387d ? m3294d : C13666w.f30112a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:13:0x0032, B:28:0x0070, B:30:0x0076, B:36:0x0084, B:37:0x0085, B:18:0x004b), top: B:49:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:13:0x0032, B:28:0x0070, B:30:0x0076, B:36:0x0084, B:37:0x0085, B:18:0x004b), top: B:49:0x0022 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0094 -> B:14:0x0035). Please submit an issue!!! */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object m3294d(kotlinx.coroutines.p559q2.InterfaceC13969e<? super T> r7, kotlinx.coroutines.channels.InterfaceC13797t<? extends T> r8, boolean r9, kotlin.p476c0.InterfaceC11714d<? super kotlin.C13666w> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.p559q2.C13979h.C13980a
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.q2.h$a r0 = (kotlinx.coroutines.p559q2.C13979h.C13980a) r0
            int r1 = r0.f30498w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30498w = r1
            goto L18
        L13:
            kotlinx.coroutines.q2.h$a r0 = new kotlinx.coroutines.q2.h$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f30497f
            java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
            int r2 = r0.f30498w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L57
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            boolean r7 = r0.f30496e
            java.lang.Object r8 = r0.f30495d
            kotlinx.coroutines.channels.t r8 = (kotlinx.coroutines.channels.InterfaceC13797t) r8
            java.lang.Object r9 = r0.f30494c
            kotlinx.coroutines.q2.e r9 = (kotlinx.coroutines.p559q2.InterfaceC13969e) r9
            kotlin.C13291q.m5357b(r10)     // Catch: java.lang.Throwable -> L55
        L35:
            r6 = r9
            r9 = r7
            r7 = r6
            goto L5d
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L41:
            boolean r7 = r0.f30496e
            java.lang.Object r8 = r0.f30495d
            kotlinx.coroutines.channels.t r8 = (kotlinx.coroutines.channels.InterfaceC13797t) r8
            java.lang.Object r9 = r0.f30494c
            kotlinx.coroutines.q2.e r9 = (kotlinx.coroutines.p559q2.InterfaceC13969e) r9
            kotlin.C13291q.m5357b(r10)     // Catch: java.lang.Throwable -> L55
            kotlinx.coroutines.channels.j r10 = (kotlinx.coroutines.channels.C13784j) r10     // Catch: java.lang.Throwable -> L55
            java.lang.Object r10 = r10.m3675k()     // Catch: java.lang.Throwable -> L55
            goto L6f
        L55:
            r9 = move-exception
            goto L9b
        L57:
            kotlin.C13291q.m5357b(r10)
            kotlinx.coroutines.p559q2.C13971f.m3322l(r7)
        L5d:
            r0.f30494c = r7     // Catch: java.lang.Throwable -> L97
            r0.f30495d = r8     // Catch: java.lang.Throwable -> L97
            r0.f30496e = r9     // Catch: java.lang.Throwable -> L97
            r0.f30498w = r4     // Catch: java.lang.Throwable -> L97
            java.lang.Object r10 = r8.mo3649d(r0)     // Catch: java.lang.Throwable -> L97
            if (r10 != r1) goto L6c
            return r1
        L6c:
            r6 = r9
            r9 = r7
            r7 = r6
        L6f:
            r2 = 0
            boolean r5 = kotlinx.coroutines.channels.C13784j.m3678h(r10)     // Catch: java.lang.Throwable -> L55
            if (r5 == 0) goto L85
            java.lang.Throwable r9 = kotlinx.coroutines.channels.C13784j.m3681e(r10)     // Catch: java.lang.Throwable -> L55
            if (r9 != 0) goto L84
            if (r7 == 0) goto L81
            kotlinx.coroutines.channels.C13788k.m3671a(r8, r2)
        L81:
            kotlin.w r7 = kotlin.C13666w.f30112a
            return r7
        L84:
            throw r9     // Catch: java.lang.Throwable -> L55
        L85:
            kotlinx.coroutines.channels.C13784j.m3680f(r10)     // Catch: java.lang.Throwable -> L55
            r0.f30494c = r9     // Catch: java.lang.Throwable -> L55
            r0.f30495d = r8     // Catch: java.lang.Throwable -> L55
            r0.f30496e = r7     // Catch: java.lang.Throwable -> L55
            r0.f30498w = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r10 = r9.emit(r10, r0)     // Catch: java.lang.Throwable -> L55
            if (r10 != r1) goto L35
            return r1
        L97:
            r7 = move-exception
            r6 = r9
            r9 = r7
            r7 = r6
        L9b:
            throw r9     // Catch: java.lang.Throwable -> L9c
        L9c:
            r10 = move-exception
            if (r7 == 0) goto La2
            kotlinx.coroutines.channels.C13788k.m3671a(r8, r9)
        La2:
            goto La4
        La3:
            throw r10
        La4:
            goto La3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p559q2.C13979h.m3294d(kotlinx.coroutines.q2.e, kotlinx.coroutines.channels.t, boolean, kotlin.c0.d):java.lang.Object");
    }
}

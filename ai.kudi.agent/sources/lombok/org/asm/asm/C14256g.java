package lombok.org.asm.asm;

import kotlin.p476c0.InterfaceC11714d;
import kotlin.p483e0.p484c.InterfaceC11767l;
/* renamed from: lombok.org.asm.asm.g */
/* loaded from: classes.dex */
public final class C14256g {

    /* renamed from: c */
    public static final Paint f31353c;

    /* renamed from: f */
    public static final Paint f31354f;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Paint $r0 = new Paint("UNDEFINED");
        f31354f = $r0;
        Paint $r02 = new Paint("REUSABLE_CLAIMED");
        f31353c = $r02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0091 A[Catch: Throwable -> 0x00bc, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Throwable -> 0x00bc, blocks: (B:63:0x0051, B:65:0x0065, B:67:0x006b, B:69:0x0073, B:70:0x0082, B:74:0x0091, B:76:0x00a8, B:81:0x00b1, B:75:0x009f), top: B:96:0x0051 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2322a(kotlin.p476c0.InterfaceC11714d r22, java.lang.Object r23, kotlin.p483e0.p484c.InterfaceC11767l r24) {
        /*
            r0 = r22
            boolean r2 = r0 instanceof lombok.org.asm.asm.C14255f
            if (r2 == 0) goto Ld1
            r4 = r22
            lombok.org.asm.asm.f r4 = (lombok.org.asm.asm.C14255f) r4
            r3 = r4
            r0 = r23
            r1 = r24
            java.lang.Object r5 = lombok.org.asm.AnnotationVisitor.m2405a(r0, r1)
            lombok.org.asm.i r6 = r3.f31349d
            kotlin.c0.d<T> r0 = r3.f31347a
            r22 = r0
            kotlin.c0.g r7 = r0.getContext()
            boolean r2 = r6.mo2264a(r7)
            if (r2 == 0) goto L36
            r3.f31351f = r5
            r8 = 1
            r3.f31384c = r8
            lombok.org.asm.i r6 = r3.f31349d
            kotlin.c0.d<T> r0 = r3.f31347a
            r22 = r0
            kotlin.c0.g r7 = r0.getContext()
            r6.mo2139a(r7, r3)
            return
        L36:
            boolean r2 = lombok.org.asm.Item.f31289c
            lombok.org.asm.w r9 = lombok.org.asm.C14312w.f31491a
            lombok.org.asm.h r10 = r9.m2168a()
            boolean r2 = r10.m2273l()
            if (r2 == 0) goto L4d
            r3.f31351f = r5
            r8 = 1
            r3.f31384c = r8
            r10.m2278b(r3)
            return
        L4d:
            r8 = 1
            r10.m2275c(r8)
            kotlin.c0.d<T> r0 = r3.f31347a     // Catch: java.lang.Throwable -> Lbc
            r22 = r0
            kotlin.c0.g r7 = r0.getContext()     // Catch: java.lang.Throwable -> Lbc
            lombok.org.asm.Token r11 = lombok.org.asm.Label.f31291c     // Catch: java.lang.Throwable -> Lbc
            kotlin.c0.g$b r12 = r7.get(r11)     // Catch: java.lang.Throwable -> Lbc
            r14 = r12
            lombok.org.asm.Label r14 = (lombok.org.asm.Label) r14     // Catch: java.lang.Throwable -> Lbc
            r13 = r14
            if (r13 == 0) goto L8e
            boolean r2 = r13.put()     // Catch: java.lang.Throwable -> Lbc
            if (r2 != 0) goto L8e
            java.util.concurrent.CancellationException r15 = r13.getValue()     // Catch: java.lang.Throwable -> Lbc
            boolean r2 = r5 instanceof lombok.org.asm.Edit     // Catch: java.lang.Throwable -> Lbc
            if (r2 == 0) goto L82
            r17 = r5
            lombok.org.asm.Edit r17 = (lombok.org.asm.Edit) r17     // Catch: java.lang.Throwable -> Lbc
            r16 = r17
            r0 = r16
            kotlin.e0.c.l<java.lang.Throwable, kotlin.w> r0 = r0.f31277b     // Catch: java.lang.Throwable -> Lbc
            r24 = r0
            r0.invoke(r15)     // Catch: java.lang.Throwable -> Lbc
        L82:
            java.lang.Object r5 = kotlin.C13291q.m5358a(r15)     // Catch: java.lang.Throwable -> Lbc
            kotlin.C13288p.m5362a(r5)     // Catch: java.lang.Throwable -> Lbc
            r3.resumeWith(r5)     // Catch: java.lang.Throwable -> Lbc
            r2 = 1
            goto L8f
        L8e:
            r2 = 0
        L8f:
            if (r2 != 0) goto Lb1
            kotlin.c0.d<T> r0 = r3.f31347a     // Catch: java.lang.Throwable -> Lbc
            r22 = r0
            kotlin.c0.g r7 = r0.getContext()     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r5 = r3.f31350e     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r5 = lombok.org.asm.asm.C14258i.m2317b(r7, r5)     // Catch: java.lang.Throwable -> Lbc
            kotlin.c0.d<T> r0 = r3.f31347a     // Catch: java.lang.Throwable -> Lac
            r22 = r0
            r1 = r23
            r0.resumeWith(r1)     // Catch: java.lang.Throwable -> Lac
            lombok.org.asm.asm.C14258i.m2318a(r7, r5)     // Catch: java.lang.Throwable -> Lbc
            goto Lb1
        Lac:
            r18 = move-exception
            lombok.org.asm.asm.C14258i.m2318a(r7, r5)     // Catch: java.lang.Throwable -> Lbc
            throw r18     // Catch: java.lang.Throwable -> Lbc
        Lb1:
            boolean r2 = r10.m2276c()     // Catch: java.lang.Throwable -> Lbc
            if (r2 != 0) goto Lb1
            r8 = 1
            r10.m2279a(r8)
            return
        Lbc:
            r19 = move-exception
            r20 = 0
            r0 = r19
            r1 = r20
            r3.m2308a(r0, r1)     // Catch: java.lang.Throwable -> Lcb
            r8 = 1
            r10.m2279a(r8)
            return
        Lcb:
            r21 = move-exception
            r8 = 1
            r10.m2279a(r8)
            throw r21
        Ld1:
            r0 = r22
            r1 = r23
            r0.resumeWith(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.asm.C14256g.m2322a(kotlin.c0.d, java.lang.Object, kotlin.e0.c.l):void");
    }

    /* renamed from: a */
    public static /* synthetic */ void m2321a(InterfaceC11714d interfaceC11714d, Object obj, InterfaceC11767l interfaceC11767l, int i, Object obj2) {
        m2322a(interfaceC11714d, obj, null);
    }
}

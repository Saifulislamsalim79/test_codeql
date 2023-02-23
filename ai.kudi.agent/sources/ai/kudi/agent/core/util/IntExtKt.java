package ai.kudi.agent.core.util;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p491i0.C11837e;
/* compiled from: IntExt.kt */
@Metadata(m10422d1 = {"\u0000@\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a2\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006\u001aU\u0010\n\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0007\u001a\u00020\r2\b\b\u0002\u0010\b\u001a\u00020\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u000b0\u0011¢\u0006\u0002\u0010\u0012\u001a\u0012\u0010\u0013\u001a\u00020\u0006*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0015\u001a\n\u0010\u0016\u001a\u00020\u0001*\u00020\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m10421d2 = {"Days", "", "range", "", "", MetricTracker.Object.INPUT, "", "low", "high", "length", "transferAmountValidation", "", "walletBalance", "", "ignoreWalletBalance", "", "callback", "Lkotlin/Function1;", "(Ljava/lang/String;Ljava/lang/Double;ZDDLkotlin/jvm/functions/Function1;)V", "nextInt", "Ljava/util/Random;", "Lkotlin/ranges/IntRange;", "toDays", "core_release"}, k = 2, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class IntExtKt {
    public static final String Days = " days";

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final int nextInt(Random random, C11837e c11837e) {
        Log_OC.getArray(random, "<this>");
        Log_OC.getArray(c11837e, "range");
        Integer $r2 = c11837e.mo10283h();
        int $i0 = $r2.intValue();
        int $i1 = c11837e.m10291m();
        Integer $r22 = c11837e.mo10283h();
        int $i2 = $r22.intValue();
        return $i0 + random.nextInt($i1 - $i2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:42:0x004d */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0047 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List range(int r22, int r23, int r24, int r25) {
        /*
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = r2
            r2.<init>()
            r0 = r22
            long r4 = (long) r0
            r22 = 0
        Lb:
            r0 = r22
            r1 = r25
            if (r0 > r1) goto L34
            java.lang.String r6 = java.lang.String.valueOf(r4)
            int r7 = r6.length()
            r8 = 2
            if (r7 < r8) goto L1f
            r9 = 10
            goto L21
        L1f:
            r9 = 100
        L21:
            long r10 = (long) r9
            long r4 = r4 * r10
            java.lang.Long r12 = java.lang.Long.valueOf(r4)
            r14 = r3
            java.util.Collection r14 = (java.util.Collection) r14
            r13 = r14
            java.util.List r3 = kotlin.p557z.C13722p.m3920o0(r13, r12)
            int r22 = r22 + 1
            goto Lb
        L34:
            java.util.ArrayList r15 = new java.util.ArrayList
            r2 = r15
            r15.<init>()
            r17 = r3
            java.lang.Iterable r17 = (java.lang.Iterable) r17
            r16 = r17
            r0 = r16
            java.util.Iterator r18 = r0.iterator()
        L47:
            r0 = r18
            boolean r19 = r0.hasNext()
            if (r19 == 0) goto L7a
            r0 = r18
            java.lang.Object r3 = r0.next()
            r21 = r3
            java.lang.Number r21 = (java.lang.Number) r21
            r20 = r21
            r0 = r20
            long r4 = r0.longValue()
            r0 = r23
            long r10 = (long) r0
            int r9 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r9 > 0) goto L72
            r0 = r24
            long r10 = (long) r0
            int r9 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r9 > 0) goto L72
            r19 = 1
            goto L74
        L72:
            r19 = 0
        L74:
            if (r19 == 0) goto L47
            r2.add(r3)
            goto L47
        L7a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.util.IntExtKt.range(int, int, int, int):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ List range$default(int i, int $i1, int $i2, int $i3, int i2, Object obj) {
        int $i5 = i2 & 2;
        if ($i5 != 0) {
            $i1 = Integer.MIN_VALUE;
        }
        int $i52 = i2 & 4;
        if ($i52 != 0) {
            $i2 = Integer.MAX_VALUE;
        }
        int $i4 = i2 & 8;
        if ($i4 != 0) {
            $i3 = 4;
        }
        List $r0 = range(i, $i1, $i2, $i3);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final String toDays(int i) {
        String $r1 = i + Days;
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void transferAmountValidation(java.lang.String r17, java.lang.Double r18, boolean r19, double r20, double r22, kotlin.p483e0.p484c.InterfaceC11767l r24) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.util.IntExtKt.transferAmountValidation(java.lang.String, java.lang.Double, boolean, double, double, kotlin.e0.c.l):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void transferAmountValidation$default(String str, Double $r1, boolean $z0, double $d0, double $d1, InterfaceC11767l interfaceC11767l, int i, Object obj) {
        int $i1 = i & 2;
        if ($i1 != 0) {
            $r1 = Double.valueOf(0.0d);
        }
        int $i12 = i & 4;
        if ($i12 != 0) {
            $z0 = true;
        }
        int $i13 = i & 8;
        if ($i13 != 0) {
            $d0 = 500.0d;
        }
        int $i0 = i & 16;
        if ($i0 != 0) {
            $d1 = 200000.0d;
        }
        transferAmountValidation(str, $r1, $z0, $d0, $d1, interfaceC11767l);
    }
}

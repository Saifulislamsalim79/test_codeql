package ai.kudi.agent.core.util;

import android.os.CountDownTimer;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: Counter.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m10421d2 = {"Lai/kudi/agent/core/util/Counter;", "", "()V", "Companion", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class Counter {
    public static final Companion Companion;

    /* compiled from: Counter.kt */
    @Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/core/util/Counter$Companion;", "", "()V", "padDigits", "", "digit", "", "padDigits$core_release", "timer", "Landroid/os/CountDownTimer;", "timeInSeconds", "textView", "Landroid/widget/TextView;", "extraMsg", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static /* synthetic */ CountDownTimer timer$default(Companion companion, long j, TextView textView, String $r4, int i, Object obj) {
            int $i1 = i & 4;
            if ($i1 != 0) {
                $r4 = null;
            }
            CountDownTimer $r2 = companion.timer(j, textView, $r4);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public final String padDigits$core_release(long j) {
            if (j >= 10) {
                String $r2 = String.valueOf(j);
                return $r2;
            }
            Long $r1 = Long.valueOf(j);
            String $r22 = Log_OC.m10359a("0", $r1);
            return $r22;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public final CountDownTimer timer(long j, final TextView textView, final String str) {
            Log_OC.getArray(textView, "textView");
            long $l1 = 1000;
            final long $l0 = j * $l1;
            return new CountDownTimer($l0) { // from class: ai.kudi.agent.core.util.Counter$Companion$timer$1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
                	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
                	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
                	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
                	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
                	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
                 */
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
                	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
                	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
                	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
                	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
                 */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0010  */
                /* JADX WARN: Removed duplicated region for block: B:12:0x0018  */
                @Override // android.os.CountDownTimer
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void onFinish() {
                    /*
                        r8 = this;
                        java.lang.String r0 = r3
                        if (r0 == 0) goto Ld
                        int r1 = r0.length()
                        if (r1 != 0) goto Lb
                        goto Ld
                    Lb:
                        r2 = 0
                        goto Le
                    Ld:
                        r2 = 1
                    Le:
                        if (r2 == 0) goto L18
                        android.widget.TextView r3 = r4
                        java.lang.String r4 = "0:0"
                        r3.setText(r4)
                        return
                    L18:
                        android.widget.TextView r3 = r4
                        kotlin.e0.d.a0 r5 = kotlin.p483e0.p485d.C11780a0.f26475a
                        java.lang.String r0 = r3
                        kotlin.p483e0.p485d.Log_OC.append(r0)
                        r7 = 1
                        java.lang.Object[] r6 = new java.lang.Object[r7]
                        r7 = 0
                        java.lang.String r4 = "0:0"
                        r6[r7] = r4
                        r7 = 1
                        java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)
                        java.lang.String r0 = java.lang.String.format(r0, r6)
                        java.lang.String r4 = "java.lang.String.format(format, *args)"
                        kotlin.p483e0.p485d.Log_OC.loadImage(r0, r4)
                        r3.setText(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.util.Counter$Companion$timer$1.onFinish():void");
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
                	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
                	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
                	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
                	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
                 */
                /* JADX WARN: Removed duplicated region for block: B:10:0x006a  */
                /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
                @Override // android.os.CountDownTimer
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void onTick(long r20) {
                    /*
                        r19 = this;
                        kotlin.e0.d.a0 r3 = kotlin.p483e0.p485d.C11780a0.f26475a
                        r5 = 2
                        java.lang.Object[] r4 = new java.lang.Object[r5]
                        java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
                        r0 = r20
                        long r7 = r6.toMinutes(r0)
                        java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.HOURS
                        java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
                        r0 = r20
                        long r10 = r9.toHours(r0)
                        long r10 = r6.toMinutes(r10)
                        long r7 = r7 - r10
                        java.lang.Long r12 = java.lang.Long.valueOf(r7)
                        r5 = 0
                        r4[r5] = r12
                        java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
                        r0 = r20
                        long r7 = r6.toSeconds(r0)
                        java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MINUTES
                        java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
                        r0 = r20
                        long r20 = r6.toMinutes(r0)
                        r0 = r20
                        long r20 = r9.toSeconds(r0)
                        long r20 = r7 - r20
                        r0 = r20
                        java.lang.Long r12 = java.lang.Long.valueOf(r0)
                        r5 = 1
                        r4[r5] = r12
                        r5 = 2
                        java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r5)
                        java.lang.String r14 = "%02d:%02d"
                        java.lang.String r13 = java.lang.String.format(r14, r4)
                        java.lang.String r14 = "java.lang.String.format(format, *args)"
                        kotlin.p483e0.p485d.Log_OC.loadImage(r13, r14)
                        r0 = r19
                        java.lang.String r15 = r3
                        if (r15 == 0) goto L66
                        int r16 = r15.length()
                        if (r16 != 0) goto L63
                        goto L66
                    L63:
                        r17 = 0
                        goto L68
                    L66:
                        r17 = 1
                    L68:
                        if (r17 == 0) goto L74
                        r0 = r19
                        android.widget.TextView r0 = r4
                        r18 = r0
                        r0.setText(r13)
                        return
                    L74:
                        r0 = r19
                        android.widget.TextView r0 = r4
                        r18 = r0
                        kotlin.e0.d.a0 r3 = kotlin.p483e0.p485d.C11780a0.f26475a
                        r0 = r19
                        java.lang.String r15 = r3
                        kotlin.p483e0.p485d.Log_OC.append(r15)
                        r5 = 1
                        java.lang.Object[] r4 = new java.lang.Object[r5]
                        r5 = 0
                        r4[r5] = r13
                        r5 = 1
                        java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r5)
                        java.lang.String r13 = java.lang.String.format(r15, r4)
                        java.lang.String r14 = "java.lang.String.format(format, *args)"
                        kotlin.p483e0.p485d.Log_OC.loadImage(r13, r14)
                        r0 = r18
                        r0.setText(r13)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.util.Counter$Companion$timer$1.onTick(long):void");
                }
            };
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }
}

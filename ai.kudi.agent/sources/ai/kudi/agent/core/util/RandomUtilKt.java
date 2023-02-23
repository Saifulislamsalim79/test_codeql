package ai.kudi.agent.core.util;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.CountDownTimer;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.C11780a0;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p492io.C11843b;
import kotlin.p492io.C11860m;
import kotlin.p549l0.C13254d;
/* compiled from: RandomUtil.kt */
@Metadata(m10422d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u001aG\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013\u001a\u000e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000b\u001a\u0012\u0010\u0016\u001a\u00020\u0005*\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0005¨\u0006\u0018"}, m10421d2 = {"copyToClipboard", "", "context", "Landroid/content/Context;", "content", "", "label", "successMsg", "initCountDownTimer", "Landroid/os/CountDownTimer;", "millisInFuture", "", "countInterval", "onTick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "millisUntilFinished", "onFinish", "Lkotlin/Function0;", "toMinute_Second", TransactionField.TIME, "readTextFromAsset", "fileName", "core_release"}, k = 2, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class RandomUtilKt {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final void copyToClipboard(Context context, String str, String str2, String str3) {
        Log_OC.getArray(context, "context");
        Log_OC.getArray(str, "content");
        Log_OC.getArray(str2, "label");
        Log_OC.getArray(str3, "successMsg");
        Object $r4 = context.getSystemService("clipboard");
        if ($r4 == null) {
            NullPointerException $r7 = new NullPointerException("null cannot be cast to non-null type android.content.ClipboardManager");
            throw $r7;
        }
        ClipboardManager $r5 = (ClipboardManager) $r4;
        ClipData $r6 = ClipData.newPlainText(str2, str);
        $r5.setPrimaryClip($r6);
        ContextExtKt.toast(context, str3, 0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static /* synthetic */ void copyToClipboard$default(Context context, String str, String $r2, String $r3, int i, Object obj) {
        int $i1 = i & 4;
        if ($i1 != 0) {
            $r2 = "Clipboard Label";
        }
        int $i0 = i & 8;
        if ($i0 != 0) {
            $r3 = "Content copied";
        }
        copyToClipboard(context, str, $r2, $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final CountDownTimer initCountDownTimer(final long j, final long j2, final InterfaceC11767l interfaceC11767l, final InterfaceC11756a interfaceC11756a) {
        Log_OC.getArray(interfaceC11767l, "onTick");
        Log_OC.getArray(interfaceC11756a, "onFinish");
        return new CountDownTimer(interfaceC11767l, j, j2) { // from class: ai.kudi.agent.core.util.RandomUtilKt$initCountDownTimer$1
            final /* synthetic */ long $countInterval;
            final /* synthetic */ long $millisInFuture;
            final /* synthetic */ InterfaceC11767l<Long, C13666w> $onTick;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(j, j2);
                this.$millisInFuture = j;
                this.$countInterval = j2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.os.CountDownTimer
            public void onFinish() {
                InterfaceC11756a $r1 = InterfaceC11756a.this;
                $r1.invoke();
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.os.CountDownTimer
            public void onTick(long j3) {
                InterfaceC11767l $r1 = this.$onTick;
                Long $r2 = Long.valueOf(j3);
                $r1.invoke($r2);
            }
        };
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final String readTextFromAsset(Context context, String str) {
        Log_OC.getArray(context, "<this>");
        Log_OC.getArray(str, "fileName");
        AssetManager $r2 = context.getAssets();
        InputStream $r3 = $r2.open(str);
        Log_OC.loadImage($r3, "assets.open(fileName)");
        Charset $r4 = C13254d.f29413a;
        InputStreamReader $r5 = new InputStreamReader($r3, $r4);
        boolean $z0 = $r5 instanceof BufferedReader;
        BufferedReader $r6 = $z0 ? (BufferedReader) $r5 : new BufferedReader($r5, 8192);
        try {
            String $r1 = C11860m.m10228c($r6);
            C11843b.m10259a($r6, null);
            return $r1.toString();
        } finally {
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
    public static final String toMinute_Second(long j) {
        C11780a0 c11780a0 = C11780a0.f26475a;
        TimeUnit $r1 = TimeUnit.MILLISECONDS;
        long $l1 = $r1.toMinutes(j);
        Long $r4 = Long.valueOf($l1);
        TimeUnit $r12 = TimeUnit.MILLISECONDS;
        long $l12 = $r12.toSeconds(j);
        TimeUnit $r13 = TimeUnit.MINUTES;
        TimeUnit $r2 = TimeUnit.MILLISECONDS;
        long $l0 = $r2.toMinutes(j);
        Long $r42 = Long.valueOf($l12 - $r13.toSeconds($l0));
        Object[] $r0 = {$r4, $r42};
        String $r5 = String.format("%02d : %02d", Arrays.copyOf($r0, 2));
        Log_OC.loadImage($r5, "java.lang.String.format(format, *args)");
        return $r5;
    }
}

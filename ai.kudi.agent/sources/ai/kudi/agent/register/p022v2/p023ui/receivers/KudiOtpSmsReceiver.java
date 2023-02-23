package ai.kudi.agent.register.p022v2.p023ui.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: KudiOtpSmsReceiver.kt */
@Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0002\t\nB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/register/v2/ui/receivers/KudiOtpSmsReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "OtpListener", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.v2.ui.receivers.KudiOtpSmsReceiver */
/* loaded from: classes.dex */
public final class KudiOtpSmsReceiver extends BroadcastReceiver {
    public static final Companion Companion;
    private static OtpListener mListener;

    /* compiled from: KudiOtpSmsReceiver.kt */
    @Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\b\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/register/v2/ui/receivers/KudiOtpSmsReceiver$Companion;", "", "()V", "mListener", "Lai/kudi/agent/register/v2/ui/receivers/KudiOtpSmsReceiver$OtpListener;", "bindListener", "", "listener", "unbindListener", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.register.v2.ui.receivers.KudiOtpSmsReceiver$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        public final void bindListener(OtpListener otpListener) {
            KudiOtpSmsReceiver.mListener = otpListener;
        }

        public final void unbindListener() {
            KudiOtpSmsReceiver.mListener = null;
        }
    }

    /* compiled from: KudiOtpSmsReceiver.kt */
    @Metadata(m10422d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/register/v2/ui/receivers/KudiOtpSmsReceiver$OtpListener;", "", "onOtpReceived", "", "otp", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.register.v2.ui.receivers.KudiOtpSmsReceiver$OtpListener */
    /* loaded from: classes.dex */
    public interface OtpListener {
        void onOtpReceived(String str);
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
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Log_OC.getArray(context, "context");
        Log_OC.getArray(intent, "intent");
        Bundle $r3 = intent.getExtras();
        int $i0 = 0;
        Object[] $r4 = new Object[0];
        if ($r3 != null) {
            Object $r5 = $r3.get("pdus");
            if ($r5 == null) {
                NullPointerException $r6 = new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                throw $r6;
            }
            $r4 = (Object[]) $r5;
        }
        int $i1 = $r4.length;
        while ($i0 < $i1) {
            Object $r52 = $r4[$i0];
            $i0++;
            byte[] $r7 = (byte[]) $r52;
            SmsMessage $r8 = SmsMessage.createFromPdu($r7);
            String $r9 = $r8.getMessageBody();
            $r8.getOriginatingAddress();
            Pattern $r10 = Pattern.compile(".+([\\d]{4}).*");
            Matcher $r11 = $r10.matcher($r9);
            boolean $z0 = $r11.find();
            if ($z0) {
                OtpListener $r12 = mListener;
                if ($r12 != null) {
                    Log_OC.append($r12);
                    String $r92 = $r11.group(1);
                    $r12.onOtpReceived($r92);
                    return;
                }
                return;
            }
        }
    }
}

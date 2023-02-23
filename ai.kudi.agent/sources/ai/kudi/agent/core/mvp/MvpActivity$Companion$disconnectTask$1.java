package ai.kudi.agent.core.mvp;

import ai.kudi.agent.core.mvp.MvpActivity;
import android.app.Activity;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: MvpActivity.kt */
@Metadata(m10422d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m10421d2 = {"ai/kudi/agent/core/mvp/MvpActivity$Companion$disconnectTask$1", "Ljava/util/TimerTask;", "run", "", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class MvpActivity$Companion$disconnectTask$1 extends TimerTask {
    final /* synthetic */ Activity $context;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MvpActivity$Companion$disconnectTask$1(Activity activity) {
        this.$context = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: run$lambda-0  reason: not valid java name */
    public static final void m39155run$lambda0(Activity activity) {
        Log_OC.getArray(activity, "$context");
        MvpActivity.Companion $r1 = MvpActivity.Companion;
        $r1.logout(activity);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        final Activity $r1 = this.$context;
        $r1.runOnUiThread(new Runnable() { // from class: ai.kudi.agent.core.mvp.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public final void run() {
                Activity $r12 = $r1;
                MvpActivity$Companion$disconnectTask$1.m39155run$lambda0($r12);
            }
        });
    }
}

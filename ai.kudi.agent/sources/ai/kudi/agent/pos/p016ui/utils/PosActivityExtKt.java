package ai.kudi.agent.pos.p016ui.utils;

import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.pos.p016ui.PosActivity;
import android.app.Activity;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: PosActivityExt.kt */
@Metadata(m10422d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m10421d2 = {"setPosActivityTitle", "", "Landroid/app/Activity;", KudiPin.KUDI_PIN_TITLE, "", "app_release"}, k = 2, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.pos.ui.utils.PosActivityExtKt */
/* loaded from: classes.dex */
public final class PosActivityExtKt {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void setPosActivityTitle(Activity activity, String str) {
        Log_OC.getArray(activity, "<this>");
        Log_OC.getArray(str, KudiPin.KUDI_PIN_TITLE);
        boolean $z0 = activity instanceof PosActivity;
        if ($z0) {
            PosActivity $r2 = (PosActivity) activity;
            $r2.setTitle(str);
        }
    }
}

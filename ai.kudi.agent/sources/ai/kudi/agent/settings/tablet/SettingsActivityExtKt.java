package ai.kudi.agent.settings.tablet;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.settings.p029ui.SettingsActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: SettingsActivityExt.kt */
@Metadata(m10422d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001e\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u0007¨\u0006\t"}, m10421d2 = {"setSettingsTitle", "", "Landroidx/fragment/app/Fragment;", KudiPin.KUDI_PIN_TITLE, "", "setSettingsTitleBarColor", "color", "", "textColor", "app_release"}, k = 2, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SettingsActivityExtKt {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void setSettingsTitle(Fragment fragment, String str) {
        Log_OC.getArray(fragment, "<this>");
        Log_OC.getArray(str, KudiPin.KUDI_PIN_TITLE);
        boolean $z0 = fragment.getActivity() instanceof SettingsActivity;
        if ($z0) {
            FragmentActivity $r2 = fragment.getActivity();
            if ($r2 == null) {
                NullPointerException $r4 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.settings.ui.SettingsActivity");
                throw $r4;
            }
            SettingsActivity $r3 = (SettingsActivity) $r2;
            $r3.setTitle(str);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void setSettingsTitleBarColor(Fragment fragment, int i, int i2) {
        Log_OC.getArray(fragment, "<this>");
        boolean $z0 = fragment.getActivity() instanceof SettingsActivity;
        if ($z0) {
            FragmentActivity $r1 = fragment.getActivity();
            if ($r1 == null) {
                NullPointerException $r3 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.settings.ui.SettingsActivity");
                throw $r3;
            }
            SettingsActivity $r2 = (SettingsActivity) $r1;
            $r2.setToolBarColor(i, i2);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void setSettingsTitleBarColor$default(Fragment fragment, int i, int $i1, int i2, Object obj) {
        int $i2 = i2 & 2;
        if ($i2 != 0) {
            $i1 = C0001R.color.white;
        }
        setSettingsTitleBarColor(fragment, i, $i1);
    }
}

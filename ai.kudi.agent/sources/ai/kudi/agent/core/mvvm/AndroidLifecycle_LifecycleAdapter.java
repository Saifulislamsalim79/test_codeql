package ai.kudi.agent.core.mvvm;

import androidx.lifecycle.C1582t;
import androidx.lifecycle.InterfaceC1555g;
import androidx.lifecycle.PreferenceActivity;
import androidx.lifecycle.Scope;
/* loaded from: classes.dex */
public class AndroidLifecycle_LifecycleAdapter implements InterfaceC1555g {
    final AndroidLifecycle mReceiver;

    AndroidLifecycle_LifecycleAdapter(AndroidLifecycle androidLifecycle) {
        this.mReceiver = androidLifecycle;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void callMethods(PreferenceActivity preferenceActivity, Scope scope, boolean z, C1582t c1582t) {
        boolean $z1 = c1582t != null;
        if (z) {
            if ($z1) {
                boolean $z0 = c1582t.m35482a("onEvent$core_release", 4);
                if (!$z0) {
                    return;
                }
            }
            AndroidLifecycle $r4 = this.mReceiver;
            $r4.onEvent$core_release(preferenceActivity, scope);
        }
    }
}

package androidx.biometric;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.biometric.BiometricPrompt;
/* loaded from: classes2.dex */
public class DeviceCredentialHandlerActivity extends androidx.appcompat.app.e {

    /* renamed from: c */
    private boolean f3598c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public void m36825h(int i) {
        C1193c m36801f = C1193c.m36801f();
        if (m36801f == null) {
            Log.e("DeviceCredentialHandler", "onActivityResult: Bridge or callback was null!");
        } else if (i == -1) {
            m36801f.m36793n(1);
            m36801f.m36794m(false);
            m36801f.m36791p();
        } else {
            m36801f.m36793n(2);
            m36801f.m36794m(false);
            m36801f.m36791p();
        }
        finish();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super/*androidx.fragment.app.i*/.onActivityResult(i, i2, intent);
        m36825h(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onCreate(Bundle bundle) {
        C1193c m36802e = C1193c.m36802e();
        boolean z = true;
        if (m36802e.m36805b() != 0) {
            setTheme(m36802e.m36805b());
            getTheme().applyStyle(C1213l.TransparentStyle, true);
        }
        super/*androidx.fragment.app.i*/.onCreate(bundle);
        z = (bundle == null || !bundle.getBoolean("did_change_configuration", false)) ? false : false;
        this.f3598c = z;
        if (!z) {
            m36802e.m36790q();
        } else {
            this.f3598c = false;
        }
        setTitle(null);
        setContentView(C1211j.device_credential_handler_activity);
        if (m36802e.m36803d() != null && m36802e.m36806a() != null) {
            new BiometricPrompt(this, m36802e.m36803d(), m36802e.m36806a()).m36843s(new BiometricPrompt.C1180e(getIntent().getBundleExtra("prompt_info_bundle")));
            return;
        }
        Log.e("DeviceCredentialHandler", "onCreate: Executor and/or callback was null!");
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onPause() {
        super/*androidx.fragment.app.i*/.onPause();
        C1193c m36801f = C1193c.m36801f();
        if (!isChangingConfigurations() || m36801f == null) {
            return;
        }
        m36801f.m36800g();
        this.f3598c = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onSaveInstanceState(Bundle bundle) {
        super/*androidx.activity.ComponentActivity*/.onSaveInstanceState(bundle);
        bundle.putBoolean("did_change_configuration", this.f3598c);
    }
}

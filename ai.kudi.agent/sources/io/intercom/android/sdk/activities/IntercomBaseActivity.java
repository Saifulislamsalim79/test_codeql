package io.intercom.android.sdk.activities;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import androidx.appcompat.app.AppCompatActivity;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.ContextLocaliser;
import java.util.Locale;
/* loaded from: classes.dex */
public abstract class IntercomBaseActivity extends AppCompatActivity {
    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context $r1) {
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 >= 17) {
            Injector $r2 = Injector.get();
            Provider $r3 = $r2.getAppConfigProvider();
            Object $r4 = $r3.get();
            AppConfig $r5 = (AppConfig) $r4;
            Resources $r7 = $r1.getResources();
            Configuration $r8 = $r7.getConfiguration();
            Configuration $r6 = new Configuration($r8);
            String $r9 = $r5.getLocale();
            Locale $r10 = ContextLocaliser.convertToLocale($r9);
            $r6.setLocale($r10);
            $r1 = $r1.createConfigurationContext($r6);
        }
        super.attachBaseContext($r1);
    }
}

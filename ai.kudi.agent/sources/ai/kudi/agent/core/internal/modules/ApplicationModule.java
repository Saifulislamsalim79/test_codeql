package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.biometric.security.IPFSecurityUtils;
import ai.kudi.agent.biometric.security.PFSecurityUtils;
import ai.kudi.agent.biometric.security.PFSecurityUtilsOld;
import ai.kudi.agent.core.data.DeviceInformation;
import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import ai.kudi.agent.core.navigation.GlobalAppNavigator;
import ai.kudi.agent.core.navigation.GlobalNavigator;
import ai.kudi.agent.core.util.ManageDevice;
import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.p036v2.common.domain.network.client.MarketPlaceApi;
import ai.kudi.agent.register.PinRepositoryImpl;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.crashlytics.C5325g;
import com.google.firebase.database.C5615f;
import com.google.firebase.remoteconfig.Frame;
import com.google.firebase.remoteconfig.Item;
import com.google.firebase.remoteconfig.Label;
import com.paypad.impl.Paypad;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import retrofit2.C14841m;
/* compiled from: ApplicationModule.kt */
@Metadata(m10422d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0004H\u0007J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0004H\u0007J\u0012\u0010\u0019\u001a\u00020\u001a2\b\b\u0001\u0010\u001b\u001a\u00020\u001cH\u0007J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u0004H\u0007J\b\u0010\u001e\u001a\u00020\u001fH\u0007J\b\u0010 \u001a\u00020!H\u0007J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u0004H\u0007J\u0010\u0010#\u001a\u00020$2\u0006\u0010\u0014\u001a\u00020\u0004H\u0007J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0018H\u0007J\u001a\u0010(\u001a\u00020\u001c2\b\b\u0001\u0010)\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0004H\u0007¨\u0006*"}, m10421d2 = {"Lai/kudi/agent/core/di/modules/ApplicationModule;", "", "()V", "provideAppContext", "Landroid/content/Context;", "application", "Landroid/app/Application;", "provideFirebaseConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "provideFirebaseCrashlytics", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "provideMarketPlaceApi", "Lai/kudi/agent/v2/common/domain/network/client/MarketPlaceApi;", "retrofit", "Lretrofit2/Retrofit;", "providePFSecurityUtilsFactory", "Lai/kudi/agent/biometric/security/IPFSecurityUtils;", "firebaseCrashlytics", "providePayPad", "Lcom/paypad/impl/Paypad;", "context", "provideSharedPrefsName", "", "providesCoreAppDatabase", "Lai/kudi/agent/core/domain/db/CoreAppDatabase;", "providesDeviceInfo", "Lai/kudi/agent/core/data/DeviceInformation;", "sharedPreferences", "Landroid/content/SharedPreferences;", "providesDeviceSecuritySharedPrefs", "providesFirebaseAuthentication", "Lcom/google/firebase/auth/FirebaseAuth;", "providesFirebaseDb", "Lcom/google/firebase/database/FirebaseDatabase;", "providesFrequentlyUsedSharedPrefs", "providesGlobalNavigator", "Lai/kudi/agent/core/navigation/GlobalNavigator;", "providesPinRepo", "Lai/kudi/agent/register/PinRepositoryImpl;", "roomDatabase", "providesSharedPrefs", "prefsName", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ApplicationModule {
    public final Context provideAppContext(Application application) {
        Log_OC.getArray(application, "application");
        return application;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Frame provideFirebaseConfig() {
        Frame $r1 = Frame.onCreateViewHolder();
        Log_OC.loadImage($r1, "getInstance()");
        Label $r2 = new Label();
        $r2.m20911a(3600L);
        Item $r3 = $r2.m20910b();
        Log_OC.loadImage($r3, "Builder()\n            .setMinimumFetchIntervalInSeconds(cacheExpiration).build()");
        $r1.m20915b($r3);
        $r1.m20928a(C0001R.C0006xml.remote_config_defaults);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C5325g provideFirebaseCrashlytics() {
        C5325g $r1 = C5325g.m25123a();
        Log_OC.loadImage($r1, "getInstance()");
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final MarketPlaceApi provideMarketPlaceApi(C14841m c14841m) {
        Log_OC.getArray(c14841m, "retrofit");
        Object $r1 = c14841m.m274d(MarketPlaceApi.class);
        Log_OC.loadImage($r1, "retrofit.create(MarketPlaceApi::class.java)");
        MarketPlaceApi $r3 = (MarketPlaceApi) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final IPFSecurityUtils providePFSecurityUtilsFactory(C5325g c5325g) {
        Log_OC.getArray(c5325g, "firebaseCrashlytics");
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 >= 23) {
            PFSecurityUtils.Companion $r2 = PFSecurityUtils.Companion;
            PFSecurityUtils $r3 = $r2.getInstance(c5325g);
            return $r3;
        }
        PFSecurityUtilsOld.Companion $r4 = PFSecurityUtilsOld.Companion;
        PFSecurityUtilsOld $r5 = $r4.getInstance();
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Paypad providePayPad(Context context) {
        Log_OC.getArray(context, "context");
        Paypad $r2 = new Paypad(context);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String provideSharedPrefsName(Context context) {
        Log_OC.getArray(context, "context");
        String $r2 = context.getPackageName();
        return Log_OC.m10359a($r2, (Object) "_shared_prefs");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final CoreAppDatabase providesCoreAppDatabase(Context context) {
        Log_OC.getArray(context, "context");
        CoreAppDatabase.Companion $r3 = CoreAppDatabase.Companion;
        CoreAppDatabase $r1 = $r3.getInstance(context);
        Log_OC.append($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final DeviceInformation providesDeviceInfo(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "sharedPreferences");
        String $r3 = sharedPreferences.getString(ManageDevice.GENERATED_ID, "");
        String $r4 = $r3;
        if ($r3 == null) {
            $r4 = "";
        }
        String $r5 = sharedPreferences.getString(ManageDevice.GENERATED_NAME, "");
        String $r32 = $r5;
        if ($r5 == null) {
            $r32 = "";
        }
        String $r52 = sharedPreferences.getString(ManageDevice.IMEID_PARAM, "");
        String $r2 = $r52 != null ? $r52 : "";
        DeviceInformation $r6 = new DeviceInformation($r32, $r4, $r2);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SharedPreferences providesDeviceSecuritySharedPrefs(Context context) {
        Log_OC.getArray(context, "context");
        SharedPreferences $r1 = context.getSharedPreferences(ManageDevice.SECURE_DEVICE_PREFERENCE, 0);
        Log_OC.loadImage($r1, "context.getSharedPreferences(\n            ManageDevice.SECURE_DEVICE_PREFERENCE,\n            Context.MODE_PRIVATE\n        )");
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FirebaseAuth providesFirebaseAuthentication() {
        FirebaseAuth $r1 = FirebaseAuth.getInstance();
        Log_OC.loadImage($r1, "getInstance()");
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C5615f providesFirebaseDb() {
        C5615f $r1 = C5615f.m24320b();
        Log_OC.loadImage($r1, "getInstance()");
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SharedPreferences providesFrequentlyUsedSharedPrefs(Context context) {
        Log_OC.getArray(context, "context");
        SharedPreferences $r1 = context.getSharedPreferences(LoginParams.PREF_FREQUENTLY_USED, 0);
        Log_OC.loadImage($r1, "context.getSharedPreferences(LoginParams.PREF_FREQUENTLY_USED, Context.MODE_PRIVATE)");
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final GlobalNavigator providesGlobalNavigator(Context context) {
        Log_OC.getArray(context, "context");
        GlobalAppNavigator $r2 = new GlobalAppNavigator();
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PinRepositoryImpl providesPinRepo(CoreAppDatabase coreAppDatabase) {
        Log_OC.getArray(coreAppDatabase, "roomDatabase");
        PinRepositoryImpl $r2 = new PinRepositoryImpl(coreAppDatabase);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SharedPreferences providesSharedPrefs(String str, Context context) {
        Log_OC.getArray(str, "prefsName");
        Log_OC.getArray(context, "context");
        SharedPreferences $r1 = context.getSharedPreferences(str, 0);
        Log_OC.loadImage($r1, "context.getSharedPreferences(prefsName, Context.MODE_PRIVATE)");
        return $r1;
    }
}

package ai.kudi.agent;

import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.internal.components.DaggerApplicationComponent;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import androidx.appcompat.app.AppCompatDelegate;
import com.google.firebase.remoteconfig.Frame;
import com.google.firebase.remoteconfig.Item;
import com.google.firebase.remoteconfig.Label;
import com.hwangjr.rxbus.Bus;
import com.hwangjr.rxbus.RxBus;
import dagger.android.ActivityInterface;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.Registry;
import io.intercom.android.sdk.Intercom;
import io.reactivex.exceptions.UndeliverableException;
import java.io.File;
import java.lang.Thread;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.expandableListView.MultiDex;
import p425j.p444e.p450e0.Object;
import p425j.p444e.showcaseview.C11693h;
import p590o.p591a.Timber;
/* compiled from: BaseApplication.kt */
@Metadata(m10422d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u001aH\u0002J\b\u0010\u001e\u001a\u00020\u0005H\u0016J\b\u0010\u001f\u001a\u00020\u001aH\u0016J\b\u0010 \u001a\u00020\u001aH\u0002J\b\u0010!\u001a\u00020\u001aH\u0002J\b\u0010\"\u001a\u00020\u001aH\u0002J\b\u0010#\u001a\u00020\u001aH\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006%"}, m10421d2 = {"Lai/kudi/agent/BaseApplication;", "Landroid/app/Application;", "Ldagger/android/HasAndroidInjector;", "()V", "applicationComponent", "Lai/kudi/agent/core/di/components/ApplicationComponent;", "getApplicationComponent", "()Lai/kudi/agent/core/di/components/ApplicationComponent;", "setApplicationComponent", "(Lai/kudi/agent/core/di/components/ApplicationComponent;)V", "dispatchingAndroidInjector", "Ldagger/android/DispatchingAndroidInjector;", "", "getDispatchingAndroidInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setDispatchingAndroidInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "smartLookAnalytics", "Lai/kudi/agent/analytics/SmartLookAnalytics;", "getSmartLookAnalytics", "()Lai/kudi/agent/analytics/SmartLookAnalytics;", "setSmartLookAnalytics", "(Lai/kudi/agent/analytics/SmartLookAnalytics;)V", "androidInjector", "Ldagger/android/AndroidInjector;", "attachBaseContext", "", "base", "Landroid/content/Context;", "deletePrevious", "initializeComponent", "onCreate", "setUpTimber", "setupFirebaseFeatures", "setupFirebaseRemoteConfig", "setupSmartlook", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public class BaseApplication extends Application implements ActivityInterface {
    public static final Companion Companion;
    public static BaseApplication application;
    public ApplicationComponent applicationComponent;
    public DispatchingAndroidInjector<Object> dispatchingAndroidInjector;
    public SmartLookAnalytics smartLookAnalytics;

    /* compiled from: BaseApplication.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/BaseApplication$Companion;", "", "()V", "application", "Lai/kudi/agent/BaseApplication;", "getApplication", "()Lai/kudi/agent/BaseApplication;", "setApplication", "(Lai/kudi/agent/BaseApplication;)V", "getBaseApplication", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final BaseApplication getApplication() {
            BaseApplication $r1 = BaseApplication.application;
            if ($r1 != null) {
                return $r1;
            }
            Log_OC.LogError("application");
            NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
            throw r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final BaseApplication getBaseApplication() {
            BaseApplication $r1 = getApplication();
            return $r1;
        }

        public final void setApplication(BaseApplication baseApplication) {
            Log_OC.getArray(baseApplication, "<set-?>");
            BaseApplication.application = baseApplication;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void deletePrevious() {
        File $r1 = getDatabasePath("KudiAgentDatabase.db");
        Log_OC.loadImage($r1, "this.getDatabasePath(dbName)");
        boolean $z0 = $r1.exists();
        if ($z0) {
            deleteDatabase("KudiAgentDatabase.db");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onCreate$lambda-1  reason: not valid java name */
    public static final void m38996onCreate$lambda1(BaseApplication baseApplication, Throwable th) {
        Log_OC.getArray(baseApplication, "this$0");
        boolean $z0 = th instanceof UndeliverableException;
        if (!$z0) {
            Thread $r6 = Thread.currentThread();
            Thread.UncaughtExceptionHandler $r7 = $r6.getUncaughtExceptionHandler();
            $r7.uncaughtException($r6, th);
            return;
        }
        Class $r2 = baseApplication.getClass();
        String $r3 = $r2.getName();
        String $r4 = th.getMessage();
        String $r5 = $r4;
        if ($r4 == null) {
            $r5 = "Unknown error caused by UndeliverableException";
        }
        Log.e($r3, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setUpTimber() {
        Timber.DebugTree $r1 = new Timber.DebugTree();
        Timber.plant($r1);
    }

    private final void setupFirebaseFeatures() {
        setupFirebaseRemoteConfig();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setupFirebaseRemoteConfig() {
        Frame $r1 = Frame.onCreateViewHolder();
        Log_OC.loadImage($r1, "getInstance()");
        Label $r2 = new Label();
        Item $r3 = $r2.m20910b();
        $r1.m20915b($r3);
        $r1.m20928a(C0001R.C0006xml.remote_config_defaults);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setupSmartlook() {
        SmartLookAnalytics $r1 = getSmartLookAnalytics();
        $r1.setup();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // dagger.android.ActivityInterface
    public Registry androidInjector() {
        DispatchingAndroidInjector $r1 = getDispatchingAndroidInjector();
        return $r1;
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        Log_OC.getArray(context, "base");
        super.attachBaseContext(context);
        MultiDex.install(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ApplicationComponent getApplicationComponent() {
        ApplicationComponent $r1 = this.applicationComponent;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("applicationComponent");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final DispatchingAndroidInjector getDispatchingAndroidInjector() {
        DispatchingAndroidInjector $r1 = this.dispatchingAndroidInjector;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("dispatchingAndroidInjector");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SmartLookAnalytics getSmartLookAnalytics() {
        SmartLookAnalytics $r1 = this.smartLookAnalytics;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("smartLookAnalytics");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ApplicationComponent initializeComponent() {
        ApplicationComponent.Builder $r1 = DaggerApplicationComponent.builder();
        ApplicationComponent $r2 = $r1.application(this).build();
        $r2.inject(this);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        ApplicationComponent $r1 = initializeComponent();
        setApplicationComponent($r1);
        AppCompatDelegate.m37802f(true);
        Companion $r2 = Companion;
        $r2.setApplication(this);
        setupFirebaseFeatures();
        deletePrevious();
        Bus $r3 = RxBus.getBus();
        $r3.register(this);
        Intercom.initialize(this, "android_sdk-6af3b1967fd64e9632e7f142e40e6ae0ef14ebf3", "pcy9xcoc");
        setUpTimber();
        setupSmartlook();
        C11693h.m10473a(new Object() { // from class: ai.kudi.agent.FlingerListView$ItemFlingerResponder
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                BaseApplication $r12 = BaseApplication.this;
                Throwable $r32 = (Throwable) obj;
                BaseApplication.m38996onCreate$lambda1($r12, $r32);
            }
        });
    }

    public final void setApplicationComponent(ApplicationComponent applicationComponent) {
        Log_OC.getArray(applicationComponent, "<set-?>");
        this.applicationComponent = applicationComponent;
    }

    public final void setDispatchingAndroidInjector(DispatchingAndroidInjector dispatchingAndroidInjector) {
        Log_OC.getArray(dispatchingAndroidInjector, "<set-?>");
        this.dispatchingAndroidInjector = dispatchingAndroidInjector;
    }

    public final void setSmartLookAnalytics(SmartLookAnalytics smartLookAnalytics) {
        Log_OC.getArray(smartLookAnalytics, "<set-?>");
        this.smartLookAnalytics = smartLookAnalytics;
    }
}

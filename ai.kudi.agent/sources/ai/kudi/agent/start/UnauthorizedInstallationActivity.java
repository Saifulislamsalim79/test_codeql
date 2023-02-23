package ai.kudi.agent.start;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.databinding.ActivityUnauthorizedInstallationBinding;
import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: UnauthorizedInstallationActivity.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/start/UnauthorizedInstallationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "analyticsImpl", "Lai/kudi/agent/core/analytics/Analytics;", "getAnalyticsImpl", "()Lai/kudi/agent/core/analytics/Analytics;", "setAnalyticsImpl", "(Lai/kudi/agent/core/analytics/Analytics;)V", "binding", "Lai/kudi/agent/databinding/ActivityUnauthorizedInstallationBinding;", "getBinding", "()Lai/kudi/agent/databinding/ActivityUnauthorizedInstallationBinding;", "setBinding", "(Lai/kudi/agent/databinding/ActivityUnauthorizedInstallationBinding;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class UnauthorizedInstallationActivity extends AppCompatActivity {
    public Analytics analyticsImpl;
    public ActivityUnauthorizedInstallationBinding binding;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onCreate$lambda-0  reason: not valid java name */
    public static final void m40942onCreate$lambda0(UnauthorizedInstallationActivity unauthorizedInstallationActivity, View view) {
        Log_OC.getArray(unauthorizedInstallationActivity, "this$0");
        Analytics $r2 = unauthorizedInstallationActivity.getAnalyticsImpl();
        $r2.onClickGoToPlaystore();
        ApplicationInfo $r3 = unauthorizedInstallationActivity.getApplicationInfo();
        String $r4 = ((PackageItemInfo) $r3).packageName;
        Log_OC.loadImage($r4, "applicationInfo.packageName");
        AppCompatActivityExtKt.openAppStore(unauthorizedInstallationActivity, $r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onCreate$lambda-1  reason: not valid java name */
    public static final void m40943onCreate$lambda1(UnauthorizedInstallationActivity unauthorizedInstallationActivity, View view) {
        Log_OC.getArray(unauthorizedInstallationActivity, "this$0");
        Analytics $r1 = unauthorizedInstallationActivity.getAnalyticsImpl();
        $r1.onClickGoToPlaystore();
        unauthorizedInstallationActivity.finish();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Analytics getAnalyticsImpl() {
        Analytics $r1 = this.analyticsImpl;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("analyticsImpl");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ActivityUnauthorizedInstallationBinding getBinding() {
        ActivityUnauthorizedInstallationBinding $r1 = this.binding;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("binding");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.BaseListFragment, android.app.Activity
    public void onCreate(Bundle bundle) {
        Application $r2 = getApplication();
        if ($r2 == null) {
            NullPointerException r16 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw r16;
        }
        BaseApplication $r3 = (BaseApplication) $r2;
        ApplicationComponent $r4 = $r3.initializeComponent();
        $r4.inject(this);
        super.onCreate(bundle);
        LayoutInflater $r5 = getLayoutInflater();
        ActivityUnauthorizedInstallationBinding $r6 = ActivityUnauthorizedInstallationBinding.inflate($r5);
        Log_OC.loadImage($r6, "inflate(layoutInflater)");
        setBinding($r6);
        View $r7 = getBinding().getRoot();
        View r17 = $r7;
        setContentView(r17);
        Analytics $r8 = getAnalyticsImpl();
        $r8.onShowUnAuthorizedInstalledScreen();
        Button $r9 = getBinding().updateButton;
        $r9.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.start.EditActivity$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UnauthorizedInstallationActivity $r22 = UnauthorizedInstallationActivity.this;
                UnauthorizedInstallationActivity.m40942onCreate$lambda0($r22, view);
            }
        });
        TextView $r11 = getBinding().exitAppTextView;
        $r11.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.start.TestActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UnauthorizedInstallationActivity $r22 = UnauthorizedInstallationActivity.this;
                UnauthorizedInstallationActivity.m40943onCreate$lambda1($r22, view);
            }
        });
    }

    public final void setAnalyticsImpl(Analytics analytics) {
        Log_OC.getArray(analytics, "<set-?>");
        this.analyticsImpl = analytics;
    }

    public final void setBinding(ActivityUnauthorizedInstallationBinding activityUnauthorizedInstallationBinding) {
        Log_OC.getArray(activityUnauthorizedInstallationBinding, "<set-?>");
        this.binding = activityUnauthorizedInstallationBinding;
    }
}

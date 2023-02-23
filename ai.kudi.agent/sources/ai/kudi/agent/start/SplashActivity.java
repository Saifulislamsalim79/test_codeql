package ai.kudi.agent.start;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.mvp.MvpActivity;
import ai.kudi.agent.core.util.ManageDevice;
import ai.kudi.agent.databinding.SplashActivityV2Binding;
import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.login.p011ui.LoginActivity;
import ai.kudi.agent.start.intro.OnBoardingActivity;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p198f.p199a.objectweb.asm.AnnotationVisitor;
import p198f.p199a.objectweb.asm.signature.C7448c;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
/* compiled from: SplashActivity.kt */
@Metadata(m10422d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u001b\u001a\u00020\u0003H\u0016J\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010\u001f\u001a\u00020\u001dH\u0016J\b\u0010 \u001a\u00020\u001dH\u0016J\u0012\u0010!\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\b\u0010$\u001a\u00020\u001dH\u0016J\b\u0010%\u001a\u00020\u001dH\u0002R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006&"}, m10421d2 = {"Lai/kudi/agent/start/SplashActivity;", "Lai/kudi/agent/core/mvp/MvpActivity;", "Lai/kudi/agent/start/StartView;", "Lai/kudi/agent/start/StartPresenter;", "Lai/kudi/agent/databinding/SplashActivityV2Binding;", "()V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/databinding/SplashActivityV2Binding;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "getAnalytics", "()Lai/kudi/agent/core/analytics/Analytics;", "setAnalytics", "(Lai/kudi/agent/core/analytics/Analytics;)V", "repeatCount", "", "getRepeatCount", "()I", "setRepeatCount", "(I)V", "sharedPrefs", "Landroid/content/SharedPreferences;", "getSharedPrefs", "()Landroid/content/SharedPreferences;", "setSharedPrefs", "(Landroid/content/SharedPreferences;)V", "createPresenter", "getDeviceProperties", "", "hideCheckingUpdate", "navigateToIntro", "navigateToLogin", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showCheckingUpdate", "startAnimationAndPresenter", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SplashActivity extends MvpActivity<StartView, StartPresenter, SplashActivityV2Binding> implements StartView {
    public Analytics analytics;
    private int repeatCount;
    public SharedPreferences sharedPrefs;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void startAnimationAndPresenter() {
        Handler $r1 = new Handler();
        $r1.postDelayed(new Runnable() { // from class: ai.kudi.agent.start.InitiationListener$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public final void run() {
                SplashActivity $r12 = SplashActivity.this;
                SplashActivity.m40936startAnimationAndPresenter$lambda0($r12);
            }
        }, 3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: startAnimationAndPresenter$lambda-0  reason: not valid java name */
    public static final void m40936startAnimationAndPresenter$lambda0(SplashActivity splashActivity) {
        Log_OC.getArray(splashActivity, "this$0");
        SharedPreferences $r1 = splashActivity.getSharedPrefs();
        boolean $z0 = $r1.getBoolean(LoginParams.HAS_SEEN_INTRO, false);
        StartPresenter $r3 = (StartPresenter) splashActivity.getPresenter();
        $r3.start($z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public StartPresenter createPresenter() {
        Activity r8 = (Activity) this;
        Application $r3 = r8.getApplication();
        Log_OC.loadImage($r3, "application");
        C7448c r5 = new C7448c("https://app-service.kudi.ai/v1/recommendUpdates/agents", null, 2, null);
        AnnotationVisitor r6 = new AnnotationVisitor($r3, r5);
        StartPresenter r7 = new StartPresenter(r6);
        return r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public /* bridge */ /* synthetic */ InterfaceC9413d createPresenter() {
        InterfaceC9413d $r1 = createPresenter();
        InterfaceC9413d r2 = $r1;
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public SplashActivityV2Binding getActivityBinding() {
        Activity r3 = (Activity) this;
        LayoutInflater $r1 = r3.getLayoutInflater();
        SplashActivityV2Binding $r2 = SplashActivityV2Binding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        SplashActivityV2Binding $r1 = getActivityBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Analytics getAnalytics() {
        Analytics $r1 = this.analytics;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("analytics");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void getDeviceProperties() {
        boolean $z0;
        boolean $z02;
        Activity r8 = (Activity) this;
        SharedPreferences $r1 = r8.getSharedPreferences(ManageDevice.SECURE_DEVICE_PREFERENCE, 0);
        SharedPreferences.Editor $r2 = $r1.edit();
        String $r4 = $r1.getString(ManageDevice.GENERATED_NAME, "");
        String $r5 = $r4;
        if ($r4 == null) {
            $r5 = "";
        }
        String $r42 = $r1.getString(ManageDevice.GENERATED_ID, "");
        String $r3 = $r42 != null ? $r42 : "";
        $z0 = C13276s.m5440u($r5);
        if ($z0) {
            ManageDevice r7 = new ManageDevice();
            String $r52 = r7.getDeviceName();
            $r2.putString(ManageDevice.GENERATED_NAME, $r52);
        }
        $z02 = C13276s.m5440u($r3);
        if ($z02) {
            ManageDevice r72 = new ManageDevice();
            String $r32 = r72.getDeviceId();
            $r2.putString(ManageDevice.GENERATED_ID, $r32);
        }
        $r2.apply();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getRepeatCount() {
        int i0 = this.repeatCount;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SharedPreferences getSharedPrefs() {
        SharedPreferences $r1 = this.sharedPrefs;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("sharedPrefs");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.start.StartView
    public void hideCheckingUpdate() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.start.StartView
    public void navigateToIntro() {
        Context r3 = (Context) this;
        Intent r2 = new Intent(r3, OnBoardingActivity.class);
        Activity r4 = (Activity) this;
        r4.startActivity(r2);
        Activity r42 = (Activity) this;
        r42.finish();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.start.StartView
    public void navigateToLogin() {
        Context r3 = (Context) this;
        Intent r2 = new Intent(r3, LoginActivity.class);
        Activity r4 = (Activity) this;
        r4.startActivity(r2);
        Activity r42 = (Activity) this;
        r42.finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity, p272h.p364d.p365a.p366c.AbstractC9409a
    public void onCreate(Bundle bundle) {
        Activity r8 = (Activity) this;
        Application $r2 = r8.getApplication();
        if ($r2 == null) {
            NullPointerException r7 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw r7;
        }
        BaseApplication $r3 = (BaseApplication) $r2;
        ApplicationComponent $r4 = $r3.initializeComponent();
        $r4.inject(this);
        super.onCreate(bundle);
        getDeviceProperties();
        disableLogoutTimer();
        Analytics $r5 = getAnalytics();
        $r5.onSplashScreenReached();
        startAnimationAndPresenter();
    }

    public final void setAnalytics(Analytics analytics) {
        Log_OC.getArray(analytics, "<set-?>");
        this.analytics = analytics;
    }

    public final void setRepeatCount(int i) {
        this.repeatCount = i;
    }

    public final void setSharedPrefs(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "<set-?>");
        this.sharedPrefs = sharedPreferences;
    }

    @Override // ai.kudi.agent.start.StartView
    public void showCheckingUpdate() {
    }
}

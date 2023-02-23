package ai.kudi.agent.login.setup.p010ui;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.mvp.MvpActivity;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ManageDevice;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.ActivitySetupAgentAccountBinding;
import ai.kudi.agent.home.HomeActivity;
import ai.kudi.agent.login.setup.presenters.SecureAccountPresenter;
import ai.kudi.agent.login.setup.views.SecureAccountView;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
/* compiled from: SetupAgentAccountActivity.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0006\u0010\u0016\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\b\u0010\u0018\u001a\u00020\u0010H\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001a"}, m10421d2 = {"Lai/kudi/agent/login/setup/ui/SetupAgentAccountActivity;", "Lai/kudi/agent/core/mvp/MvpActivity;", "Lai/kudi/agent/login/setup/views/SecureAccountView;", "Lai/kudi/agent/login/setup/presenters/SecureAccountPresenter;", "Lai/kudi/agent/databinding/ActivitySetupAgentAccountBinding;", "()V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/databinding/ActivitySetupAgentAccountBinding;", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/login/setup/presenters/SecureAccountPresenter;", "setThisPresenter", "(Lai/kudi/agent/login/setup/presenters/SecureAccountPresenter;)V", "createPresenter", "hideError", "", "hideProgress", "navigateToDashBoard", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRetryClick", "setUpAgentAccount", "showError", "showProgress", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.login.setup.ui.SetupAgentAccountActivity */
/* loaded from: classes.dex */
public final class SetupAgentAccountActivity extends MvpActivity<SecureAccountView, SecureAccountPresenter, ActivitySetupAgentAccountBinding> implements SecureAccountView {
    public SecureAccountPresenter thisPresenter;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-0  reason: not valid java name */
    public static final void m39776onCreate$lambda0(SetupAgentAccountActivity setupAgentAccountActivity, View view) {
        Log_OC.getArray(setupAgentAccountActivity, "this$0");
        setupAgentAccountActivity.onRetryClick();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public SecureAccountPresenter createPresenter() {
        SecureAccountPresenter $r1 = getThisPresenter();
        return $r1;
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
    public ActivitySetupAgentAccountBinding getActivityBinding() {
        Activity r3 = (Activity) this;
        LayoutInflater $r1 = r3.getLayoutInflater();
        ActivitySetupAgentAccountBinding $r2 = ActivitySetupAgentAccountBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ActivitySetupAgentAccountBinding $r1 = getActivityBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SecureAccountPresenter getThisPresenter() {
        SecureAccountPresenter $r1 = this.thisPresenter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("thisPresenter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.login.setup.views.SecureAccountView
    public void hideError() {
        InterfaceC8209a $r1 = getBinding();
        ActivitySetupAgentAccountBinding $r2 = (ActivitySetupAgentAccountBinding) $r1;
        View $r3 = $r2.retryButton;
        Log_OC.loadImage($r3, "binding.retryButton");
        View r5 = $r3;
        ViewExtKt.hide$default(r5, false, 1, null);
        InterfaceC8209a $r12 = getBinding();
        ActivitySetupAgentAccountBinding $r22 = (ActivitySetupAgentAccountBinding) $r12;
        TextView $r4 = $r22.errorTextView;
        Log_OC.loadImage($r4, "binding.errorTextView");
        ViewExtKt.hide$default($r4, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.login.setup.views.SecureAccountView
    public void hideProgress() {
        InterfaceC8209a $r1 = getBinding();
        ActivitySetupAgentAccountBinding $r2 = (ActivitySetupAgentAccountBinding) $r1;
        ProgressBar $r3 = $r2.progressBar;
        Log_OC.loadImage($r3, "binding.progressBar");
        ViewExtKt.hide$default($r3, false, 1, null);
        InterfaceC8209a $r12 = getBinding();
        ActivitySetupAgentAccountBinding $r22 = (ActivitySetupAgentAccountBinding) $r12;
        TextView $r4 = $r22.statusTextView;
        Log_OC.loadImage($r4, "binding.statusTextView");
        ViewExtKt.hide$default($r4, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.login.setup.views.SecureAccountView
    public void navigateToDashBoard() {
        Context r1 = (Context) this;
        ContextExtKt.launchActivity$default(r1, true, HomeActivity.class, (InterfaceC11767l) null, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity, p272h.p364d.p365a.p366c.AbstractC9409a
    public void onCreate(Bundle bundle) {
        Activity r12 = (Activity) this;
        Application $r2 = r12.getApplication();
        if ($r2 == null) {
            NullPointerException r11 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw r11;
        }
        BaseApplication $r3 = (BaseApplication) $r2;
        ApplicationComponent $r4 = $r3.initializeComponent();
        $r4.inject(this);
        super.onCreate(bundle);
        disableLogoutTimer();
        setUpAgentAccount();
        InterfaceC8209a $r5 = getBinding();
        ActivitySetupAgentAccountBinding $r6 = (ActivitySetupAgentAccountBinding) $r5;
        ViewGroup $r7 = $r6.retryButton;
        ViewGroup r13 = $r7;
        r13.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.login.setup.ui.j
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SetupAgentAccountActivity $r22 = SetupAgentAccountActivity.this;
                SetupAgentAccountActivity.m39776onCreate$lambda0($r22, view);
            }
        });
    }

    public final void onRetryClick() {
        setUpAgentAccount();
    }

    public final void setThisPresenter(SecureAccountPresenter secureAccountPresenter) {
        Log_OC.getArray(secureAccountPresenter, "<set-?>");
        this.thisPresenter = secureAccountPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setUpAgentAccount() {
        Activity r6 = (Activity) this;
        SharedPreferences $r1 = r6.getSharedPreferences(ManageDevice.SECURE_DEVICE_PREFERENCE, 0);
        String $r3 = $r1.getString(ManageDevice.GENERATED_ID, "");
        String $r4 = $r3;
        if ($r3 == null) {
            $r4 = "";
        }
        String $r32 = $r1.getString(ManageDevice.GENERATED_NAME, "");
        String $r2 = $r32 != null ? $r32 : "";
        SecureAccountPresenter $r5 = createPresenter();
        $r5.secureAccount($r2, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.login.setup.views.SecureAccountView
    public void showError() {
        InterfaceC8209a $r1 = getBinding();
        ActivitySetupAgentAccountBinding $r2 = (ActivitySetupAgentAccountBinding) $r1;
        View $r3 = $r2.retryButton;
        Log_OC.loadImage($r3, "binding.retryButton");
        View r5 = $r3;
        ViewExtKt.show(r5);
        InterfaceC8209a $r12 = getBinding();
        ActivitySetupAgentAccountBinding $r22 = (ActivitySetupAgentAccountBinding) $r12;
        TextView $r4 = $r22.errorTextView;
        Log_OC.loadImage($r4, "binding.errorTextView");
        ViewExtKt.show($r4);
        hideProgress();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.login.setup.views.SecureAccountView
    public void showProgress() {
        InterfaceC8209a $r1 = getBinding();
        ActivitySetupAgentAccountBinding $r2 = (ActivitySetupAgentAccountBinding) $r1;
        ProgressBar $r3 = $r2.progressBar;
        Log_OC.loadImage($r3, "binding.progressBar");
        ViewExtKt.show($r3);
        InterfaceC8209a $r12 = getBinding();
        ActivitySetupAgentAccountBinding $r22 = (ActivitySetupAgentAccountBinding) $r12;
        TextView $r4 = $r22.statusTextView;
        Log_OC.loadImage($r4, "binding.statusTextView");
        ViewExtKt.show($r4);
        hideError();
    }
}

package ai.kudi.agent.withdrawal.p041ui;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.mvp.MvpActivity;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.CustomDialog;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.ViewBillsWithdrawBinding;
import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.transactionstatus.summary.p033ui.WithdrawalSummaryFragment;
import ai.kudi.agent.voucher.cashout.domain.model.VoucherResponse;
import ai.kudi.agent.voucher.cashout.p039ui.VoucherCodeInputFragment;
import ai.kudi.agent.withdrawal.p041ui.OthersWithdrawalFragment;
import ai.kudi.agent.withdrawal.presenter.MainWithdrawalPresenter;
import ai.kudi.agent.withdrawal.view.MainWithdrawalView;
import ai.kudi.agent.withdrawal.xmpp.components.WithdrawalSubComponent;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.android.material.tabs.TabLayout;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
/* compiled from: WithdrawActivity.kt */
@Metadata(m10422d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 42\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0002:\u00014B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010 \u001a\u00020\u0003H\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\u0012\u0010%\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010'H\u0014J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J8\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020)2\u0006\u00101\u001a\u00020)2\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u000103H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u00065"}, m10421d2 = {"Lai/kudi/agent/withdrawal/ui/WithdrawActivity;", "Lai/kudi/agent/core/mvp/MvpActivity;", "Lai/kudi/agent/withdrawal/view/MainWithdrawalView;", "Lai/kudi/agent/withdrawal/presenter/MainWithdrawalPresenter;", "Lai/kudi/agent/databinding/ViewBillsWithdrawBinding;", "()V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/databinding/ViewBillsWithdrawBinding;", "smartLookAnalytics", "Lai/kudi/agent/analytics/SmartLookAnalytics;", "getSmartLookAnalytics", "()Lai/kudi/agent/analytics/SmartLookAnalytics;", "setSmartLookAnalytics", "(Lai/kudi/agent/analytics/SmartLookAnalytics;)V", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "getTabLayout", "()Lcom/google/android/material/tabs/TabLayout;", "setTabLayout", "(Lcom/google/android/material/tabs/TabLayout;)V", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/withdrawal/presenter/MainWithdrawalPresenter;", "setThisPresenter", "(Lai/kudi/agent/withdrawal/presenter/MainWithdrawalPresenter;)V", "withdrawalSubComponent", "Lai/kudi/agent/withdrawal/di/components/WithdrawalSubComponent;", "getWithdrawalSubComponent", "()Lai/kudi/agent/withdrawal/di/components/WithdrawalSubComponent;", "setWithdrawalSubComponent", "(Lai/kudi/agent/withdrawal/di/components/WithdrawalSubComponent;)V", "createPresenter", "navigateToVoucherSummaryFragment", "", "voucherResponse", "Lai/kudi/agent/voucher/cashout/domain/model/VoucherResponse;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "showAlertDialog", MetricTracker.Object.MESSAGE, "", "buttonText", "upperCaseText", "cancelable", "buttonAction", "Lkotlin/Function0;", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.withdrawal.ui.WithdrawActivity */
/* loaded from: classes.dex */
public final class WithdrawActivity extends MvpActivity<MainWithdrawalView, MainWithdrawalPresenter, ViewBillsWithdrawBinding> implements MainWithdrawalView {
    public static final Companion Companion;
    public static final String VOUCHER_SUCCESSFUL_VERIFICATION = "VOUCHER_SUCCESSFUL_VERIFICATION";
    public SmartLookAnalytics smartLookAnalytics;
    public TabLayout tabLayout;
    public MainWithdrawalPresenter thisPresenter;
    public WithdrawalSubComponent withdrawalSubComponent;

    /* compiled from: WithdrawActivity.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/withdrawal/ui/WithdrawActivity$Companion;", "", "()V", WithdrawActivity.VOUCHER_SUCCESSFUL_VERIFICATION, "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.withdrawal.ui.WithdrawActivity$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
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
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public MainWithdrawalPresenter createPresenter() {
        MainWithdrawalPresenter $r1 = getThisPresenter();
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
    public ViewBillsWithdrawBinding getActivityBinding() {
        Activity r3 = (Activity) this;
        LayoutInflater $r1 = r3.getLayoutInflater();
        ViewBillsWithdrawBinding $r2 = ViewBillsWithdrawBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ViewBillsWithdrawBinding $r1 = getActivityBinding();
        return $r1;
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
    public final TabLayout getTabLayout() {
        TabLayout $r1 = this.tabLayout;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("tabLayout");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final MainWithdrawalPresenter getThisPresenter() {
        MainWithdrawalPresenter $r1 = this.thisPresenter;
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
    public final WithdrawalSubComponent getWithdrawalSubComponent() {
        WithdrawalSubComponent $r1 = this.withdrawalSubComponent;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("withdrawalSubComponent");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.withdrawal.view.MainWithdrawalView
    public void navigateToVoucherSummaryFragment(VoucherResponse voucherResponse) {
        Log_OC.getArray(voucherResponse, "voucherResponse");
        WithdrawalSummaryFragment.Companion $r3 = WithdrawalSummaryFragment.Companion;
        Fragment $r2 = $r3.newInstance(voucherResponse);
        AppCompatActivity r4 = (AppCompatActivity) this;
        Fragment r5 = $r2;
        AppCompatActivityExtKt.startFragment$default(r4, r5, C0001R.C0003id.withdrawalContainerLayout, false, false, false, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity, p272h.p364d.p365a.p366c.AbstractC9409a
    public void onCreate(Bundle bundle) {
        Activity r26 = (Activity) this;
        Application $r2 = r26.getApplication();
        if ($r2 == null) {
            NullPointerException r25 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw r25;
        }
        BaseApplication $r3 = (BaseApplication) $r2;
        ApplicationComponent $r4 = $r3.getApplicationComponent();
        WithdrawalSubComponent.Factory $r5 = $r4.withdrawalSubComponent();
        WithdrawalSubComponent $r6 = $r5.create(this);
        setWithdrawalSubComponent($r6);
        WithdrawalSubComponent $r62 = getWithdrawalSubComponent();
        $r62.inject(this);
        super.onCreate(bundle);
        AbstractC0925a $r7 = ((AppCompatActivity) this).getSupportActionBar();
        if ($r7 != null) {
            $r7.mo37602u(true);
        }
        AbstractC0925a $r72 = ((AppCompatActivity) this).getSupportActionBar();
        if ($r72 != null) {
            $r72.mo37597z(C0001R.C0002drawable.ic_close);
        }
        Activity r262 = (Activity) this;
        SharedPreferences $r8 = r262.getSharedPreferences(LoginParams.PREF_FREQUENTLY_USED, 0);
        boolean $z0 = $r8.getBoolean(LoginParams.EXTRA_IS_C2C_ENABLED, false);
        AppCompatActivity r27 = (AppCompatActivity) this;
        View $r9 = r27.findViewById(C0001R.C0003id.tabLayout);
        Log_OC.loadImage($r9, "findViewById(R.id.tabLayout)");
        TabLayout $r10 = (TabLayout) $r9;
        setTabLayout($r10);
        TabLayout $r102 = getTabLayout();
        TabLayout $r11 = getTabLayout();
        TabLayout.C4745g $r12 = $r11.m26536z();
        $r12.m26505u("Kudi Voucher");
        $r102.m26557e($r12);
        TabLayout $r103 = getTabLayout();
        TabLayout $r112 = getTabLayout();
        TabLayout.C4745g $r122 = $r112.m26536z();
        $r122.m26505u("Others");
        $r103.m26557e($r122);
        if ($z0) {
            View $r104 = getTabLayout();
            ViewExtKt.show($r104);
        } else {
            View $r105 = getTabLayout();
            ViewExtKt.hide$default($r105, false, 1, null);
        }
        Activity r263 = (Activity) this;
        Intent $r13 = r263.getIntent();
        Parcelable $r14 = $r13.getParcelableExtra(VOUCHER_SUCCESSFUL_VERIFICATION);
        VoucherResponse $r15 = (VoucherResponse) $r14;
        if ($r15 != null) {
            MainWithdrawalPresenter $r16 = getThisPresenter();
            $r16.navigateToVoucherSummary($r15);
        } else if ($z0) {
            VoucherCodeInputFragment.Companion $r17 = VoucherCodeInputFragment.Companion;
            Fragment $r18 = $r17.newInstance();
            AppCompatActivity r272 = (AppCompatActivity) this;
            Fragment r28 = $r18;
            AppCompatActivityExtKt.startFragment$default(r272, r28, C0001R.C0003id.withdrawalContainerLayout, false, false, false, 12, null);
        } else {
            OthersWithdrawalFragment.Companion $r19 = OthersWithdrawalFragment.Companion;
            Fragment $r20 = $r19.newInstance();
            AppCompatActivity r273 = (AppCompatActivity) this;
            Fragment r282 = $r20;
            AppCompatActivityExtKt.startFragment$default(r273, r282, C0001R.C0003id.withdrawalContainerLayout, false, false, false, 12, null);
        }
        SmartLookAnalytics $r21 = getSmartLookAnalytics();
        $r21.logWithdrawal();
        TabLayout $r106 = getTabLayout();
        $r106.m26558d(new TabLayout.InterfaceC4740d() { // from class: ai.kudi.agent.withdrawal.ui.WithdrawActivity$onCreate$1
            @Override // com.google.android.material.tabs.TabLayout.InterfaceC4739c
            public void onTabReselected(TabLayout.C4745g c4745g) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // com.google.android.material.tabs.TabLayout.InterfaceC4739c
            public void onTabSelected(TabLayout.C4745g c4745g) {
                Integer $r22;
                if (c4745g == null) {
                    $r22 = null;
                } else {
                    int $i0 = c4745g.m26518h();
                    $r22 = Integer.valueOf($i0);
                }
                if ($r22 != null) {
                    int $i02 = $r22.intValue();
                    if ($i02 == 0) {
                        WithdrawActivity $r32 = WithdrawActivity.this;
                        AppCompatActivity r8 = (AppCompatActivity) $r32;
                        AppCompatActivityExtKt.popAllFragmentsInActivity$default(r8, null, 1, null);
                        WithdrawActivity $r33 = WithdrawActivity.this;
                        VoucherCodeInputFragment.Companion $r42 = VoucherCodeInputFragment.Companion;
                        VoucherCodeInputFragment $r52 = $r42.newInstance();
                        AppCompatActivity r82 = (AppCompatActivity) $r33;
                        AppCompatActivityExtKt.startFragment$default(r82, $r52, C0001R.C0003id.withdrawalContainerLayout, false, false, false, 12, null);
                        return;
                    }
                }
                if ($r22 == null) {
                    return;
                }
                int $i03 = $r22.intValue();
                if ($i03 == 1) {
                    WithdrawActivity $r34 = WithdrawActivity.this;
                    AppCompatActivity r83 = (AppCompatActivity) $r34;
                    AppCompatActivityExtKt.popAllFragmentsInActivity$default(r83, null, 1, null);
                    WithdrawActivity $r35 = WithdrawActivity.this;
                    OthersWithdrawalFragment.Companion $r63 = OthersWithdrawalFragment.Companion;
                    Fragment $r73 = $r63.newInstance();
                    AppCompatActivity r84 = (AppCompatActivity) $r35;
                    Fragment r9 = $r73;
                    AppCompatActivityExtKt.startFragment$default(r84, r9, C0001R.C0003id.withdrawalContainerLayout, false, false, false, 12, null);
                }
            }

            @Override // com.google.android.material.tabs.TabLayout.InterfaceC4739c
            public void onTabUnselected(TabLayout.C4745g c4745g) {
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Log_OC.getArray(menuItem, "item");
        int $i0 = menuItem.getItemId();
        if ($i0 != 16908332) {
            boolean $z0 = super.onOptionsItemSelected(menuItem);
            return $z0;
        }
        MainWithdrawalPresenter $r3 = getThisPresenter();
        Activity r6 = (Activity) this;
        String $r4 = r6.getString(C0001R.string.transaction_dialog_msg);
        Log_OC.loadImage($r4, "getString(R.string.transaction_dialog_msg)");
        WithdrawActivity$onOptionsItemSelected$1 r5 = new WithdrawActivity$onOptionsItemSelected$1(this);
        $r3.showDialog($r4, "Close", false, true, r5);
        return true;
    }

    public final void setSmartLookAnalytics(SmartLookAnalytics smartLookAnalytics) {
        Log_OC.getArray(smartLookAnalytics, "<set-?>");
        this.smartLookAnalytics = smartLookAnalytics;
    }

    public final void setTabLayout(TabLayout tabLayout) {
        Log_OC.getArray(tabLayout, "<set-?>");
        this.tabLayout = tabLayout;
    }

    public final void setThisPresenter(MainWithdrawalPresenter mainWithdrawalPresenter) {
        Log_OC.getArray(mainWithdrawalPresenter, "<set-?>");
        this.thisPresenter = mainWithdrawalPresenter;
    }

    public final void setWithdrawalSubComponent(WithdrawalSubComponent withdrawalSubComponent) {
        Log_OC.getArray(withdrawalSubComponent, "<set-?>");
        this.withdrawalSubComponent = withdrawalSubComponent;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.withdrawal.view.MainWithdrawalView
    public void showAlertDialog(String str, String str2, boolean z, boolean z2, InterfaceC11756a interfaceC11756a) {
        Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
        Log_OC.getArray(str2, "buttonText");
        CustomDialog.Companion $r4 = CustomDialog.Companion;
        Context r5 = (Context) this;
        $r4.show(r5, str, str2, z, z2, false, interfaceC11756a);
    }
}

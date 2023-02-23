package ai.kudi.agent.settings.account.p025ui.activity;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.mvvm.BaseMVVMActivity;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.databinding.ActivityBankAccountBinding;
import ai.kudi.agent.settings.account.ConstantsKt;
import ai.kudi.agent.settings.account.p025ui.data.BankAccountViewData;
import ai.kudi.agent.settings.account.p025ui.fragment.AddBankAccountFragment;
import ai.kudi.agent.settings.account.p025ui.fragment.BankAccountFragment;
import ai.kudi.agent.settings.account.p025ui.fragment.BankAccountFragmentKt;
import ai.kudi.agent.settings.account.p025ui.viewModel.BankAccountViewModel;
import ai.kudi.agent.settings.account.xpp3.BankAccountSubcomponent;
import android.app.Application;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: BankAccountActivity.kt */
@Metadata(m10422d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003H\u0014J\b\u0010\u0017\u001a\u00020\u0002H\u0014J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0015H\u0016J\u0012\u0010\u001b\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u0010\u0010\u001e\u001a\u00020\u00152\b\b\u0002\u0010\u001f\u001a\u00020 J\u0010\u0010!\u001a\u00020\u00152\b\b\u0002\u0010\u001f\u001a\u00020 J\u000e\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020 R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006$"}, m10421d2 = {"Lai/kudi/agent/settings/account/ui/activity/BankAccountActivity;", "Lai/kudi/agent/core/mvvm/BaseMVVMActivity;", "Lai/kudi/agent/settings/account/ui/viewModel/BankAccountViewModel;", "Lai/kudi/agent/settings/account/ui/data/BankAccountViewData;", "Lai/kudi/agent/databinding/ActivityBankAccountBinding;", "()V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/databinding/ActivityBankAccountBinding;", "bankAccountSubcomponent", "Lai/kudi/agent/settings/account/di/BankAccountSubcomponent;", "getBankAccountSubcomponent", "()Lai/kudi/agent/settings/account/di/BankAccountSubcomponent;", "setBankAccountSubcomponent", "(Lai/kudi/agent/settings/account/di/BankAccountSubcomponent;)V", "screenViewModel", "getScreenViewModel", "()Lai/kudi/agent/settings/account/ui/viewModel/BankAccountViewModel;", "setScreenViewModel", "(Lai/kudi/agent/settings/account/ui/viewModel/BankAccountViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setToolbarColor", "color", "", "setToolbarTextColor", "setToolbarTitle", "titleText", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.account.ui.activity.BankAccountActivity */
/* loaded from: classes.dex */
public final class BankAccountActivity extends BaseMVVMActivity<BankAccountViewModel, BankAccountViewData, ActivityBankAccountBinding> {
    public BankAccountSubcomponent bankAccountSubcomponent;
    public BankAccountViewModel screenViewModel;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-0  reason: not valid java name */
    public static final void m40672onCreate$lambda0(BankAccountActivity bankAccountActivity, View view) {
        Log_OC.getArray(bankAccountActivity, "this$0");
        bankAccountActivity.onBackPressed();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void setToolbarColor$default(BankAccountActivity bankAccountActivity, String $r2, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $r2 = "#ffffff";
        }
        bankAccountActivity.setToolbarColor($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void setToolbarTextColor$default(BankAccountActivity bankAccountActivity, String $r2, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $r2 = "#223856";
        }
        bankAccountActivity.setToolbarTextColor($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        BankAccountViewData $r2 = (BankAccountViewData) viewData;
        applyViewData($r2);
    }

    protected void applyViewData(BankAccountViewData bankAccountViewData) {
        Log_OC.getArray(bankAccountViewData, "viewData");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        BankAccountViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public BankAccountViewModel createViewModel() {
        BankAccountViewModel $r1 = getScreenViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public ActivityBankAccountBinding getActivityBinding() {
        LayoutInflater $r1 = getLayoutInflater();
        ActivityBankAccountBinding $r2 = ActivityBankAccountBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ActivityBankAccountBinding $r1 = getActivityBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final BankAccountSubcomponent getBankAccountSubcomponent() {
        BankAccountSubcomponent $r1 = this.bankAccountSubcomponent;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("bankAccountSubcomponent");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final BankAccountViewModel getScreenViewModel() {
        BankAccountViewModel $r1 = this.screenViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("screenViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    protected Class getVMType() {
        return BankAccountViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onBackPressed() {
        FragmentManager $r1 = getSupportFragmentManager();
        int $i0 = $r1.m35920m0();
        if ($i0 <= 1) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public void onCreate(Bundle bundle) {
        Application $r2 = getApplication();
        if ($r2 == null) {
            NullPointerException $r16 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw $r16;
        }
        BaseApplication $r3 = (BaseApplication) $r2;
        ApplicationComponent $r4 = $r3.getApplicationComponent();
        BankAccountSubcomponent.Factory $r5 = $r4.bankAccountSubcomponent();
        BankAccountSubcomponent $r6 = $r5.create();
        setBankAccountSubcomponent($r6);
        BankAccountSubcomponent $r62 = getBankAccountSubcomponent();
        $r62.inject(this);
        super.onCreate(bundle);
        InterfaceC8209a $r7 = getBinding();
        Toolbar $r9 = ((ActivityBankAccountBinding) $r7).toolbar;
        setSupportActionBar($r9);
        InterfaceC8209a $r72 = getBinding();
        Toolbar $r92 = ((ActivityBankAccountBinding) $r72).toolbar;
        $r92.setNavigationOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.account.ui.activity.TestActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BankAccountActivity $r22 = BankAccountActivity.this;
                BankAccountActivity.m40672onCreate$lambda0($r22, view);
            }
        });
        if (bundle == null) {
            Intent $r11 = getIntent();
            boolean $z0 = $r11.hasExtra(BankAccountFragmentKt.ACCT_TYPE);
            if (!$z0) {
                BankAccountFragment $r15 = new BankAccountFragment();
                AppCompatActivityExtKt.startFragment$default(this, $r15, C0001R.C0003id.contentFrameLayout, false, false, false, 28, null);
                return;
            }
            Intent $r112 = getIntent();
            String $r12 = $r112.getStringExtra(BankAccountFragmentKt.ACCT_TYPE);
            boolean $z02 = Log_OC.append($r12, ConstantsKt.ACCOUNT_TYPE_WALLET_FUNDING);
            if ($z02) {
                AddBankAccountFragment.Companion $r13 = AddBankAccountFragment.Companion;
                AddBankAccountFragment $r14 = $r13.newInstance(ConstantsKt.ACCOUNT_TYPE_WALLET_FUNDING);
                AppCompatActivityExtKt.startFragment$default(this, $r14, C0001R.C0003id.contentFrameLayout, false, false, false, 28, null);
                return;
            }
            Intent $r113 = getIntent();
            String $r122 = $r113.getStringExtra(BankAccountFragmentKt.ACCT_TYPE);
            boolean $z03 = Log_OC.append($r122, ConstantsKt.ACCOUNT_TYPE_CASHOUT);
            if ($z03) {
                AddBankAccountFragment.Companion $r132 = AddBankAccountFragment.Companion;
                AddBankAccountFragment $r142 = $r132.newInstance(ConstantsKt.ACCOUNT_TYPE_CASHOUT);
                AppCompatActivityExtKt.startFragment$default(this, $r142, C0001R.C0003id.contentFrameLayout, false, false, false, 28, null);
            }
        }
    }

    public final void setBankAccountSubcomponent(BankAccountSubcomponent bankAccountSubcomponent) {
        Log_OC.getArray(bankAccountSubcomponent, "<set-?>");
        this.bankAccountSubcomponent = bankAccountSubcomponent;
    }

    public final void setScreenViewModel(BankAccountViewModel bankAccountViewModel) {
        Log_OC.getArray(bankAccountViewModel, "<set-?>");
        this.screenViewModel = bankAccountViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setToolbarColor(String str) {
        Log_OC.getArray(str, "color");
        InterfaceC8209a $r2 = getBinding();
        ActivityBankAccountBinding $r3 = (ActivityBankAccountBinding) $r2;
        ViewGroup $r4 = $r3.toolbar;
        if ($r4 == null) {
            return;
        }
        int $i0 = Color.parseColor(str);
        ViewGroup r5 = $r4;
        r5.setBackgroundColor($i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setToolbarTextColor(String str) {
        Log_OC.getArray(str, "color");
        InterfaceC8209a $r2 = getBinding();
        ActivityBankAccountBinding $r3 = (ActivityBankAccountBinding) $r2;
        Toolbar $r4 = $r3.toolbar;
        if ($r4 == null) {
            return;
        }
        int $i0 = Color.parseColor(str);
        $r4.setTitleTextColor($i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setToolbarTitle(String str) {
        Log_OC.getArray(str, "titleText");
        AbstractC0925a $r2 = getSupportActionBar();
        if ($r2 == null) {
            return;
        }
        $r2.mo37631C(str);
    }
}

package ai.kudi.agent.postRegistrationSetUp.fragments;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.domain.room_entities.KycLevelsModel;
import ai.kudi.agent.core.domain.room_entities.UserProfile;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.databinding.FragmentUpgradeAccountSetUpBinding;
import ai.kudi.agent.databinding.KycViewBinding;
import ai.kudi.agent.postRegistrationSetUp.PostRegistrationActivity;
import ai.kudi.agent.postRegistrationSetUp.labs.PostRegSetUpSubComponent;
import ai.kudi.agent.settings.data.Constants;
import ai.kudi.agent.settings.p029ui.SettingsActivity;
import ai.kudi.agent.settings.personal.p027ui.viewModels.PersonalViewModel;
import ai.kudi.agent.settings.personal.p027ui.viewModels.data.PersonalViewData;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import java.math.BigDecimal;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p201g.p270x.InterfaceC8209a;
/* compiled from: UpgradeAccountFragmentSetUp.kt */
@Metadata(m10422d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 (2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001(B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0014J\b\u0010\u0012\u001a\u00020\u0002H\u0014J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0014J\"\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J&\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, m10421d2 = {"Lai/kudi/agent/postRegistrationSetUp/fragments/UpgradeAccountFragmentSetUp;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/settings/personal/ui/viewModels/PersonalViewModel;", "Lai/kudi/agent/settings/personal/ui/viewModels/data/PersonalViewData;", "Lai/kudi/agent/databinding/FragmentUpgradeAccountSetUpBinding;", "()V", "currentKycLevel", "", "personalViewModel", "getPersonalViewModel", "()Lai/kudi/agent/settings/personal/ui/viewModels/PersonalViewModel;", "setPersonalViewModel", "(Lai/kudi/agent/settings/personal/ui/viewModels/PersonalViewModel;)V", "postRegistrationActivity", "Lai/kudi/agent/postRegistrationSetUp/PostRegistrationActivity;", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onActivityResult", "requestCode", "", "resultCode", TransactionBreakDownItemType.DATA, "Landroid/content/Intent;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class UpgradeAccountFragmentSetUp extends BaseMVVMViewBindingFragment<PersonalViewModel, PersonalViewData, FragmentUpgradeAccountSetUpBinding> {
    public static final Companion Companion;
    private String currentKycLevel = "NO_KYC_LEVEL";
    public PersonalViewModel personalViewModel;
    private PostRegistrationActivity postRegistrationActivity;

    /* compiled from: UpgradeAccountFragmentSetUp.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/postRegistrationSetUp/fragments/UpgradeAccountFragmentSetUp$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/postRegistrationSetUp/fragments/UpgradeAccountFragmentSetUp;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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
        public final UpgradeAccountFragmentSetUp newInstance() {
            UpgradeAccountFragmentSetUp $r1 = new UpgradeAccountFragmentSetUp();
            Bundle $r2 = new Bundle();
            C13666w c13666w = C13666w.f30112a;
            $r1.setArguments($r2);
            return $r1;
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
    public static final UpgradeAccountFragmentSetUp newInstance() {
        Companion $r1 = Companion;
        UpgradeAccountFragmentSetUp $r0 = $r1.newInstance();
        return $r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-1$lambda-0  reason: not valid java name */
    public static final void m40140onViewCreated$lambda1$lambda0(UpgradeAccountFragmentSetUp upgradeAccountFragmentSetUp, View view) {
        Log_OC.getArray(upgradeAccountFragmentSetUp, "this$0");
        UpgradeAccountFragmentSetUp$onViewCreated$1$1$1 $r1 = UpgradeAccountFragmentSetUp$onViewCreated$1$1$1.INSTANCE;
        ContextExtKt.launchActivity$default((Fragment) upgradeAccountFragmentSetUp, false, SettingsActivity.class, (InterfaceC11767l) $r1, 1, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        PersonalViewData $r2 = (PersonalViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(PersonalViewData personalViewData) {
        String $r6;
        PostRegistrationActivity $r8;
        Log_OC.getArray(personalViewData, "viewData");
        InterfaceC8209a $r2 = requireBinding();
        FragmentUpgradeAccountSetUpBinding $r3 = (FragmentUpgradeAccountSetUpBinding) $r2;
        KycViewBinding $r4 = $r3.setUpKycView;
        UserProfile $r5 = personalViewData.getUserProfile();
        if ($r5 == null) {
            return;
        }
        String $r62 = $r5.getKycLevel();
        if ($r62 == null) {
            TextView $r7 = $r4.kycLevelTextView;
            Log_OC.loadImage($r7, "kycLevelTextView");
            ViewExtKt.hide($r7, true);
            TextView $r72 = $r4.otpHeaderText;
            String $r63 = getString(C0001R.string.you_are_not_on_any_kyc_level);
            $r72.setText($r63);
        }
        boolean $z0 = $r5.getBvnIsVerified();
        if ($z0) {
            PostRegistrationActivity $r82 = this.postRegistrationActivity;
            if ($r82 != null) {
                $r82.toggleActionButton(true);
            }
            String $r64 = $r5.getKycLevel();
            Constants $r9 = Constants.INSTANCE;
            List $r10 = $r9.getKYC_LEVELS();
            Object $r11 = $r10.get(2);
            boolean $z02 = Log_OC.append($r64, $r11);
            if ($z02 && ($r8 = this.postRegistrationActivity) != null) {
                $r8.toggleActionButton(false);
            }
        } else {
            PostRegistrationActivity $r83 = this.postRegistrationActivity;
            if ($r83 != null) {
                $r83.toggleActionButton(false);
            }
            TextView $r73 = $r4.kycLevelTextView;
            Log_OC.loadImage($r73, "kycLevelTextView");
            ViewExtKt.hide($r73, true);
            $r4.otpHeaderText.setText("You are not yet on a KYC Level, please upgrade");
        }
        KycLevelsModel $r12 = personalViewData.getKycLevel();
        if ($r12 == null) {
            return;
        }
        PostRegistrationActivity $r84 = this.postRegistrationActivity;
        if ($r84 != null) {
            String $r65 = $r12.getKycLevel();
            Constants $r92 = Constants.INSTANCE;
            List $r102 = $r92.getKYC_LEVELS();
            Object $r112 = $r102.get(0);
            boolean $z03 = Log_OC.append($r65, $r112);
            $r84.toggleButtonVisibility($z03);
        }
        String $r66 = $r12.getKycLevel();
        this.currentKycLevel = $r66;
        TextView $r74 = $r4.kycLevelTextView;
        String $r67 = $r12.getKycLevel();
        $r6 = C13276s.m5451A($r67, "_", " ", false, 4, null);
        $r74.setText($r6);
        TextView $r75 = $r4.transferWidthrawalLimit;
        BigDecimal $r14 = $r12.getMonthlyWithdrawalLimit();
        Object[] $r13 = {$r14};
        String $r68 = getString(C0001R.string.kyc_monthly_withdrawal_limit, $r13);
        $r75.setText($r68);
        TextView $r76 = $r4.transferLimitView;
        BigDecimal $r142 = $r12.getMonthlyTransferLimit();
        Object[] $r132 = {$r142};
        String $r69 = getString(C0001R.string.kyc_monthly_transfer_limit, $r132);
        $r76.setText($r69);
        TextView $r77 = $r4.walletTopUpLimitView;
        String $r610 = $r12.getMonthlyWalletTopUpLimit();
        Object[] $r133 = {$r610};
        String $r611 = getString(C0001R.string.kyc_wallet_top_up_limit, $r133);
        $r77.setText($r611);
        TextView $r78 = $r4.cashoutView;
        String $r612 = getString(C0001R.string.kyc_cashout_text);
        $r78.setText($r612);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        PersonalViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public PersonalViewModel createViewModel() {
        PersonalViewModel $r1 = getPersonalViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PersonalViewModel getPersonalViewModel() {
        PersonalViewModel $r1 = this.personalViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("personalViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return PersonalViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        PostRegistrationActivity $r2;
        super.onActivityResult(i, i2, intent);
        if (i == 2 && i2 == -1 && ($r2 = this.postRegistrationActivity) != null) {
            $r2.finish();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        PostRegSetUpSubComponent $r1;
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        boolean $z0 = context instanceof PostRegistrationActivity;
        if ($z0) {
            PostRegistrationActivity $r3 = (PostRegistrationActivity) context;
            this.postRegistrationActivity = $r3;
            if ($r3 == null || ($r1 = $r3.getPostRegSetUpSubComponent()) == null) {
                return;
            }
            $r1.inject(this);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentUpgradeAccountSetUpBinding $r4 = FragmentUpgradeAccountSetUpBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        PostRegistrationActivity $r3 = this.postRegistrationActivity;
        if ($r3 != null) {
            String $r4 = getString(C0001R.string.upgrade_your_acct);
            Log_OC.loadImage($r4, "getString(R.string.upgrade_your_acct)");
            $r3.setTitle($r4);
        }
        PostRegistrationActivity $r32 = this.postRegistrationActivity;
        if ($r32 != null) {
            String $r42 = getString(C0001R.string.upgrade_your_acct_subtitle);
            Log_OC.loadImage($r42, "getString(R.string.upgrade_your_acct_subtitle)");
            $r32.setSubtitle($r42);
        }
        PostRegistrationActivity $r33 = this.postRegistrationActivity;
        if ($r33 != null) {
            String $r43 = getString(C0001R.string.upgrade_account);
            Log_OC.loadImage($r43, "getString(R.string.upgrade_account)");
            $r33.setButtonText($r43);
        }
        InterfaceC8209a $r5 = requireBinding();
        FragmentUpgradeAccountSetUpBinding $r6 = (FragmentUpgradeAccountSetUpBinding) $r5;
        KycViewBinding $r7 = $r6.setUpKycView;
        TextView $r8 = $r7.whatDoesThis;
        Log_OC.loadImage($r8, "");
        ViewExtKt.show($r8);
        $r8.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.postRegistrationSetUp.fragments.BrowseFragment$3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UpgradeAccountFragmentSetUp $r2 = UpgradeAccountFragmentSetUp.this;
                UpgradeAccountFragmentSetUp.m40140onViewCreated$lambda1$lambda0($r2, view2);
            }
        });
        PersonalViewModel $r10 = getPersonalViewModel();
        $r10.getProfile();
        PostRegistrationActivity $r34 = this.postRegistrationActivity;
        if ($r34 == null) {
            return;
        }
        UpgradeAccountFragmentSetUp$onViewCreated$2 $r11 = new UpgradeAccountFragmentSetUp$onViewCreated$2(this);
        $r34.setActionButtonClickListener($r11);
    }

    public final void setPersonalViewModel(PersonalViewModel personalViewModel) {
        Log_OC.getArray(personalViewModel, "<set-?>");
        this.personalViewModel = personalViewModel;
    }
}

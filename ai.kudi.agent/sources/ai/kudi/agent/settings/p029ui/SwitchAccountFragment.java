package ai.kudi.agent.settings.p029ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.acceptterms.AcceptTermsActivity;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.databinding.FragmentSwitchAccountBinding;
import ai.kudi.agent.register.domain.wiki.AccountType;
import ai.kudi.agent.settings.mcc.components.SettingsSubComponent;
import ai.kudi.agent.settings.p029ui.viewModels.SwitchAccountViewModel;
import ai.kudi.agent.settings.p029ui.viewModels.data.SwitchAccountViewData;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import ai.kudi.dip.library.p043h.DialogC0809i;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p201g.p270x.InterfaceC8209a;
/* compiled from: SwitchAccountFragment.kt */
@Metadata(m10422d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014J\b\u0010\u000e\u001a\u00020\u0002H\u0014J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0014J\"\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010$\u001a\u00020\fH\u0002J\u0016\u0010%\u001a\u00020\f2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'H\u0002J\b\u0010)\u001a\u00020\fH\u0002R\u001e\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006*"}, m10421d2 = {"Lai/kudi/agent/settings/ui/SwitchAccountFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/settings/ui/viewModels/SwitchAccountViewModel;", "Lai/kudi/agent/settings/ui/viewModels/data/SwitchAccountViewData;", "Lai/kudi/agent/databinding/FragmentSwitchAccountBinding;", "()V", "switchAccountViewModel", "getSwitchAccountViewModel", "()Lai/kudi/agent/settings/ui/viewModels/SwitchAccountViewModel;", "setSwitchAccountViewModel", "(Lai/kudi/agent/settings/ui/viewModels/SwitchAccountViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onActivityResult", "requestCode", "", "resultCode", TransactionBreakDownItemType.DATA, "Landroid/content/Intent;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "performSwitch", "showBottomSheet", "businessCategoryData", "", "Lai/kudi/agent/register/domain/dto/BusinessCategoryData;", "startMerchantTAndC", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.ui.SwitchAccountFragment */
/* loaded from: classes.dex */
public final class SwitchAccountFragment extends BaseMVVMViewBindingFragment<SwitchAccountViewModel, SwitchAccountViewData, FragmentSwitchAccountBinding> {
    public SwitchAccountViewModel switchAccountViewModel;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-5$lambda-0  reason: not valid java name */
    public static final void m40903onViewCreated$lambda5$lambda0(SwitchAccountFragment switchAccountFragment, FragmentSwitchAccountBinding fragmentSwitchAccountBinding, View view) {
        Log_OC.getArray(switchAccountFragment, "this$0");
        Log_OC.getArray(fragmentSwitchAccountBinding, "$this_apply");
        SwitchAccountViewModel $r4 = switchAccountFragment.getSwitchAccountViewModel();
        AccountType $r0 = AccountType.AGENT;
        $r4.setSelectedTarget($r0);
        KudiInputField $r5 = fragmentSwitchAccountBinding.specifyPrimaryBusiness;
        String $r6 = switchAccountFragment.getString(C0001R.string.agency_banking);
        $r5.setText($r6);
        SwitchAccountViewModel $r42 = switchAccountFragment.getSwitchAccountViewModel();
        $r42.checkSelectedTarget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-5$lambda-1  reason: not valid java name */
    public static final void m40904onViewCreated$lambda5$lambda1(SwitchAccountFragment switchAccountFragment, FragmentSwitchAccountBinding fragmentSwitchAccountBinding, View view) {
        Log_OC.getArray(switchAccountFragment, "this$0");
        Log_OC.getArray(fragmentSwitchAccountBinding, "$this_apply");
        SwitchAccountViewModel $r4 = switchAccountFragment.getSwitchAccountViewModel();
        AccountType $r0 = AccountType.MERCHANT_AGENT;
        $r4.setSelectedTarget($r0);
        KudiInputField $r5 = fragmentSwitchAccountBinding.specifyPrimaryBusiness;
        $r5.setText("");
        SwitchAccountViewModel $r42 = switchAccountFragment.getSwitchAccountViewModel();
        $r42.checkSelectedTarget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-5$lambda-2  reason: not valid java name */
    public static final void m40905onViewCreated$lambda5$lambda2(FragmentSwitchAccountBinding fragmentSwitchAccountBinding, SwitchAccountFragment switchAccountFragment, View view) {
        Log_OC.getArray(fragmentSwitchAccountBinding, "$this_apply");
        Log_OC.getArray(switchAccountFragment, "this$0");
        KudiInputField $r3 = fragmentSwitchAccountBinding.specifyPrimaryBusiness;
        $r3.setText("");
        SwitchAccountViewModel $r4 = switchAccountFragment.getSwitchAccountViewModel();
        AccountType $r5 = AccountType.MERCHANT;
        $r4.setSelectedTarget($r5);
        SwitchAccountViewModel $r42 = switchAccountFragment.getSwitchAccountViewModel();
        $r42.checkSelectedTarget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-5$lambda-3  reason: not valid java name */
    public static final void m40906onViewCreated$lambda5$lambda3(SwitchAccountFragment switchAccountFragment, View view) {
        Log_OC.getArray(switchAccountFragment, "this$0");
        SwitchAccountViewModel $r3 = switchAccountFragment.getSwitchAccountViewModel();
        AccountType $r4 = $r3.getSelectedTarget();
        AccountType $r1 = AccountType.MERCHANT;
        if ($r4 == $r1) {
            switchAccountFragment.startMerchantTAndC();
        } else {
            switchAccountFragment.performSwitch();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void performSwitch() {
        boolean $z0;
        InterfaceC8209a $r1 = requireBinding();
        FragmentSwitchAccountBinding $r2 = (FragmentSwitchAccountBinding) $r1;
        KudiInputField $r3 = $r2.specifyPrimaryBusiness;
        String $r4 = $r3.getText();
        $z0 = C13276s.m5440u($r4);
        if ($z0) {
            KudiInputField $r32 = $r2.specifyPrimaryBusiness;
            String $r42 = getString(C0001R.string.select_primary_business);
            $r32.setError($r42);
            return;
        }
        SwitchAccountViewModel $r5 = getSwitchAccountViewModel();
        boolean $z02 = $r5.isSwitchSuccessful();
        if ($z02) {
            SwitchAccountViewModel $r52 = getSwitchAccountViewModel();
            KudiInputField $r33 = $r2.specifyPrimaryBusiness;
            String $r43 = $r33.getText();
            $r52.updateUser($r43);
            return;
        }
        SwitchAccountViewModel $r53 = getSwitchAccountViewModel();
        KudiInputField $r34 = $r2.specifyPrimaryBusiness;
        String $r44 = $r34.getText();
        $r53.switchAccount($r44);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showBottomSheet(List list) {
        FragmentActivity $r3 = requireActivity();
        Log_OC.loadImage($r3, "requireActivity()");
        SwitchAccountFragment$showBottomSheet$1 r5 = new SwitchAccountFragment$showBottomSheet$1(list, this);
        Dialog r6 = new DialogC0809i($r3, r5);
        Dialog r7 = r6;
        r7.show();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void startMerchantTAndC() {
        AcceptTermsActivity.Companion $r1 = AcceptTermsActivity.Companion;
        Context $r2 = getContext();
        Intent $r3 = $r1.getIntent($r2, "file:///android_asset/html/merchant_terms.html");
        startActivityForResult($r3, 200);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        SwitchAccountViewData $r2 = (SwitchAccountViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(SwitchAccountViewData switchAccountViewData) {
        boolean $z1;
        Log_OC.getArray(switchAccountViewData, "viewData");
        InterfaceC8209a $r2 = requireBinding();
        FragmentSwitchAccountBinding $r3 = (FragmentSwitchAccountBinding) $r2;
        String $r4 = switchAccountViewData.getCurrentCustomerType();
        boolean $z0 = true;
        if ($r4 != null) {
            AccountType $r5 = AccountType.AGENT;
            String $r6 = $r5.name();
            boolean $z12 = Log_OC.append($r4, $r6);
            if ($z12) {
                View $r7 = $r3.agentRadioButton;
                Log_OC.loadImage($r7, "agentRadioButton");
                View r14 = $r7;
                ViewExtKt.hide$default(r14, false, 1, null);
                View $r8 = $r3.specifyPrimaryBusiness;
                Log_OC.loadImage($r8, "specifyPrimaryBusiness");
                View r142 = $r8;
                ViewExtKt.hide$default(r142, false, 1, null);
            } else {
                AccountType $r52 = AccountType.MERCHANT;
                String $r62 = $r52.name();
                boolean $z13 = Log_OC.append($r4, $r62);
                if ($z13) {
                    View $r72 = $r3.merchantRadioButton;
                    Log_OC.loadImage($r72, "merchantRadioButton");
                    View r143 = $r72;
                    ViewExtKt.hide$default(r143, false, 1, null);
                } else {
                    AccountType $r53 = AccountType.MERCHANT_AGENT;
                    String $r63 = $r53.name();
                    boolean $z14 = Log_OC.append($r4, $r63);
                    if ($z14) {
                        View $r73 = $r3.merchantAgentRadioButton;
                        Log_OC.loadImage($r73, "merchantAgentRadioButton");
                        View r144 = $r73;
                        ViewExtKt.hide$default(r144, false, 1, null);
                    }
                }
            }
        }
        boolean $z15 = switchAccountViewData.isLoading();
        if ($z15) {
            $r3.saveButton.m38032f();
        } else {
            $r3.saveButton.m38033e();
        }
        List $r10 = switchAccountViewData.getBusinessCategories();
        if ($r10 != null) {
            ProgressBar $r11 = $r3.progressBar5;
            Log_OC.loadImage($r11, "progressBar5");
            ViewExtKt.hide$default($r11, false, 1, null);
            LinearLayout $r12 = $r3.layout;
            Log_OC.loadImage($r12, "layout");
            ViewExtKt.show($r12);
        }
        String $r42 = switchAccountViewData.getSelectedTarget();
        AccountType $r54 = AccountType.AGENT;
        String $r64 = $r54.name();
        boolean $z16 = Log_OC.append($r42, $r64);
        if ($z16) {
            View $r82 = $r3.specifyPrimaryBusiness;
            Log_OC.loadImage($r82, "specifyPrimaryBusiness");
            View r145 = $r82;
            ViewExtKt.hide$default(r145, false, 1, null);
        } else {
            View $r83 = $r3.specifyPrimaryBusiness;
            Log_OC.loadImage($r83, "specifyPrimaryBusiness");
            View r146 = $r83;
            ViewExtKt.show(r146);
        }
        String $r43 = switchAccountViewData.getSelectedTarget();
        if ($r43 != null) {
            $z1 = C13276s.m5440u($r43);
            if (!$z1) {
                $z0 = false;
            }
        }
        KudiButton $r9 = $r3.saveButton;
        if ($z0) {
            $r9.m38035c();
        } else {
            $r9.m38034d();
        }
        String $r44 = switchAccountViewData.getMessage();
        if ($r44 == null) {
            return;
        }
        FragmentActivity $r13 = requireActivity();
        Log_OC.loadImage($r13, "requireActivity()");
        ContextExtKt.toast$default($r13, $r44, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        SwitchAccountViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public SwitchAccountViewModel createViewModel() {
        SwitchAccountViewModel $r1 = getSwitchAccountViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SwitchAccountViewModel getSwitchAccountViewModel() {
        SwitchAccountViewModel $r1 = this.switchAccountViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("switchAccountViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return SwitchAccountViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Boolean $r2;
        super.onActivityResult(i, i2, intent);
        if (i == 200) {
            if (intent == null) {
                $r2 = null;
            } else {
                boolean $z0 = intent.getBooleanExtra(AcceptTermsActivity.BUNDLE_KEY_ACCEPTED, false);
                $r2 = Boolean.valueOf($z0);
            }
            if (i2 == -1) {
                Boolean $r3 = Boolean.TRUE;
                boolean $z02 = Log_OC.append($r2, $r3);
                if ($z02) {
                    performSwitch();
                }
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        FragmentActivity $r2 = getActivity();
        if ($r2 == null) {
            NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.settings.ui.SettingsActivity");
            throw $r5;
        }
        SettingsActivity $r3 = (SettingsActivity) $r2;
        SettingsSubComponent $r4 = $r3.getSettingsSubComponent();
        $r4.inject(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentSwitchAccountBinding $r4 = FragmentSwitchAccountBinding.inflate(layoutInflater, viewGroup, false);
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
        SwitchAccountViewModel $r3 = getSwitchAccountViewModel();
        $r3.fetchPrimaryBusinessCategories();
        SwitchAccountViewModel $r32 = getSwitchAccountViewModel();
        $r32.fetchCurrentUserAccountType();
        InterfaceC8209a $r4 = requireBinding();
        final FragmentSwitchAccountBinding $r5 = (FragmentSwitchAccountBinding) $r4;
        RadioButton $r6 = $r5.agentRadioButton;
        RadioButton r19 = $r6;
        r19.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.ui.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SwitchAccountFragment $r2 = SwitchAccountFragment.this;
                FragmentSwitchAccountBinding $r33 = $r5;
                SwitchAccountFragment.m40903onViewCreated$lambda5$lambda0($r2, $r33, view2);
            }
        });
        RadioButton $r62 = $r5.merchantAgentRadioButton;
        RadioButton r192 = $r62;
        r192.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.ui.AboutFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SwitchAccountFragment $r2 = SwitchAccountFragment.this;
                FragmentSwitchAccountBinding $r33 = $r5;
                SwitchAccountFragment.m40904onViewCreated$lambda5$lambda1($r2, $r33, view2);
            }
        });
        RadioButton $r63 = $r5.merchantRadioButton;
        RadioButton r193 = $r63;
        r193.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.ui.e
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FragmentSwitchAccountBinding $r2 = FragmentSwitchAccountBinding.this;
                SwitchAccountFragment $r33 = this;
                SwitchAccountFragment.m40905onViewCreated$lambda5$lambda2($r2, $r33, view2);
            }
        });
        ViewGroup $r10 = $r5.saveButton;
        ViewGroup r20 = $r10;
        r20.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.ui.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SwitchAccountFragment $r2 = SwitchAccountFragment.this;
                SwitchAccountFragment.m40906onViewCreated$lambda5$lambda3($r2, view2);
            }
        });
        KudiInputField $r12 = $r5.specifyPrimaryBusiness;
        $r12.disableEditablity();
        SwitchAccountFragment$onViewCreated$1$5$1 r18 = new SwitchAccountFragment$onViewCreated$1$5$1(this);
        $r12.setClickedListener(r18);
    }

    public final void setSwitchAccountViewModel(SwitchAccountViewModel switchAccountViewModel) {
        Log_OC.getArray(switchAccountViewModel, "<set-?>");
        this.switchAccountViewModel = switchAccountViewModel;
    }
}

package ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.mpos;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.databinding.FragmentMposActivationBinding;
import ai.kudi.agent.withdraw_cash.game.components.CashWithdrawalOptionComponent;
import ai.kudi.agent.withdraw_cash.p040ui.activities.CashWithdrawalOptionActivity;
import ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.mpos.MPosActivationViewData;
import ai.kudi.agent.withdraw_cash.p040ui.viewmodels.withdrawal_option.mpos.MPosActivationViewModel;
import ai.kudi.dip.library.bottomSheets.models.C0760b;
import ai.kudi.dip.library.p043h.DialogC0811j;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.paypad.impl.Paypad;
import io.intercom.android.sdk.views.holder.AttributeType;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.Metadata;
import kotlin.p475b0.C11707a;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: MPosActivationFragment.kt */
@Metadata(m10422d1 = {"\u0000q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0011\u0018\u0000 82\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00018B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0003H\u0014J\b\u0010\u001e\u001a\u00020\u0002H\u0014J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020 H\u0014J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020#H\u0016J&\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020\u0019H\u0016J\b\u0010-\u001a\u00020\u0019H\u0016J\u001a\u0010.\u001a\u00020\u00192\u0006\u0010/\u001a\u00020%2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u00100\u001a\u00020\u0019H\u0002J\u0010\u00101\u001a\u00020\u00192\u0006\u00102\u001a\u00020\u001bH\u0002J\u0012\u00103\u001a\u00020\u00192\b\b\u0002\u00104\u001a\u000205H\u0002J\u0012\u00106\u001a\u00020\u00192\b\b\u0002\u00107\u001a\u000205H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u00069"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/ui/fragments/withdrawal_option/mpos/MPosActivationFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/withdraw_cash/ui/viewmodels/withdrawal_option/mpos/MPosActivationViewModel;", "Lai/kudi/agent/withdraw_cash/ui/viewdata/withdrawal_option/mpos/MPosActivationViewData;", "Lai/kudi/agent/databinding/FragmentMposActivationBinding;", "()V", "cashWithdrawalActivity", "Lai/kudi/agent/withdraw_cash/ui/activities/CashWithdrawalOptionActivity;", "dialog", "Lai/kudi/dip/library/bottomSheets/KudiOneInputDialog;", "payPad", "Lcom/paypad/impl/Paypad;", "getPayPad", "()Lcom/paypad/impl/Paypad;", "payPad$delegate", "Lkotlin/Lazy;", "responseReceiver", "ai/kudi/agent/withdraw_cash/ui/fragments/withdrawal_option/mpos/MPosActivationFragment$responseReceiver$1", "Lai/kudi/agent/withdraw_cash/ui/fragments/withdrawal_option/mpos/MPosActivationFragment$responseReceiver$1;", "screenViewModel", "getScreenViewModel", "()Lai/kudi/agent/withdraw_cash/ui/viewmodels/withdrawal_option/mpos/MPosActivationViewModel;", "setScreenViewModel", "(Lai/kudi/agent/withdraw_cash/ui/viewmodels/withdrawal_option/mpos/MPosActivationViewModel;)V", "activateMPosWith", "", "code", "", "applyViewData", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "onViewCreated", "view", "openMPosAmountInputScreen", "toast", AttributeType.TEXT, "toggleInputBtnLoader", "showLoader", "", "toggleInputDialog", "open", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.withdraw_cash.ui.fragments.withdrawal_option.mpos.MPosActivationFragment */
/* loaded from: classes.dex */
public final class MPosActivationFragment extends BaseMVVMViewBindingFragment<MPosActivationViewModel, MPosActivationViewData, FragmentMposActivationBinding> {
    public static final Companion Companion;
    public static final String PAYPAD_RESPONSE_ACTIVATION_FAILED = "failedactivation";
    public static final String PAYPAD_RESPONSE_ACTIVATION_SUCCESS = "activatecomplete";
    private CashWithdrawalOptionActivity cashWithdrawalActivity;
    private DialogC0811j dialog;
    private final InterfaceC11824h payPad$delegate;
    private MPosActivationFragment$responseReceiver$1 responseReceiver;
    public MPosActivationViewModel screenViewModel;

    /* compiled from: MPosActivationFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/ui/fragments/withdrawal_option/mpos/MPosActivationFragment$Companion;", "", "()V", "PAYPAD_RESPONSE_ACTIVATION_FAILED", "", "PAYPAD_RESPONSE_ACTIVATION_SUCCESS", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.withdraw_cash.ui.fragments.withdrawal_option.mpos.MPosActivationFragment$Companion */
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
    /* JADX WARN: Type inference failed for: r2v0, types: [ai.kudi.agent.withdraw_cash.ui.fragments.withdrawal_option.mpos.MPosActivationFragment$responseReceiver$1] */
    public MPosActivationFragment() {
        InterfaceC11824h $r1;
        MPosActivationFragment$payPad$2 $r2 = new MPosActivationFragment$payPad$2(this);
        $r1 = C13218k.m5625b($r2);
        this.payPad$delegate = $r1;
        this.responseReceiver = new BroadcastReceiver() { // from class: ai.kudi.agent.withdraw_cash.ui.fragments.withdrawal_option.mpos.MPosActivationFragment$responseReceiver$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Log_OC.getArray(intent, "intent");
                MPosActivationFragment $r3 = MPosActivationFragment.this;
                String $r4 = intent.getStringExtra("response");
                boolean $z0 = Log_OC.append($r4, "activatecomplete");
                if (!$z0) {
                    boolean $z02 = Log_OC.append($r4, "failedactivation");
                    if ($z02) {
                        $r3.toast("Device activation failed, please try again");
                        $r3.toggleInputBtnLoader(false);
                        return;
                    }
                    return;
                }
                $r3.toast("Device activated successfully");
                MPosActivationViewModel $r5 = $r3.getScreenViewModel();
                $r5.onMPosDeviceActivated();
                $r3.toggleInputBtnLoader(false);
                MPosActivationFragment.toggleInputDialog$default($r3, false, 1, null);
                CashWithdrawalOptionActivity $r6 = $r3.cashWithdrawalActivity;
                if ($r6 != null) {
                    AppCompatActivity r8 = (AppCompatActivity) $r6;
                    AppCompatActivityExtKt.closeFragment(r8);
                    return;
                }
                Log_OC.LogError("cashWithdrawalActivity");
                NullPointerException r7 = new NullPointerException("Null throw statement replaced by Soot");
                throw r7;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void activateMPosWith(String str) {
        int $i0 = str.length();
        boolean $z0 = $i0 == 0;
        if ($z0) {
            toast("Enter an Activation Code");
            return;
        }
        toggleInputBtnLoader(true);
        MPosActivationFragment$activateMPosWith$1 $r1 = new MPosActivationFragment$activateMPosWith$1(this, str);
        C11707a.m10413a((r12 & 1) != 0, (r12 & 2) != 0 ? false : false, (r12 & 4) != 0 ? null : null, (r12 & 8) != 0 ? null : null, (r12 & 16) != 0 ? -1 : 0, $r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Paypad getPayPad() {
        InterfaceC11824h $r2 = this.payPad$delegate;
        Object $r1 = $r2.getValue();
        Paypad $r3 = (Paypad) $r1;
        return $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m41810onViewCreated$lambda0(MPosActivationFragment mPosActivationFragment, View view) {
        Log_OC.getArray(mPosActivationFragment, "this$0");
        mPosActivationFragment.toggleInputDialog(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m41811onViewCreated$lambda1(MPosActivationFragment mPosActivationFragment) {
        Log_OC.getArray(mPosActivationFragment, "this$0");
        mPosActivationFragment.toggleInputDialog(true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void openMPosAmountInputScreen() {
        CashWithdrawalOptionActivity $r1 = this.cashWithdrawalActivity;
        if ($r1 == null) {
            Log_OC.LogError("cashWithdrawalActivity");
            NullPointerException r4 = new NullPointerException("Null throw statement replaced by Soot");
            throw r4;
        }
        FragmentActivity r6 = (FragmentActivity) $r1;
        FragmentManager $r3 = r6.getSupportFragmentManager();
        $r3.m35960Y0();
        CashWithdrawalOptionActivity $r12 = this.cashWithdrawalActivity;
        if ($r12 == null) {
            Log_OC.LogError("cashWithdrawalActivity");
            NullPointerException r42 = new NullPointerException("Null throw statement replaced by Soot");
            throw r42;
        }
        MPosAmountInputFragment r5 = new MPosAmountInputFragment();
        AppCompatActivity r7 = (AppCompatActivity) $r12;
        AppCompatActivityExtKt.startFragment$default(r7, r5, C0001R.C0003id.contentFrameLayout, false, false, false, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void toast(String str) {
        Context $r2 = getContext();
        if ($r2 == null) {
            return;
        }
        ContextExtKt.toast($r2, str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void toggleInputBtnLoader(boolean z) {
        DialogC0811j $r1 = this.dialog;
        if ($r1 != null) {
            boolean $z0 = !z;
            $r1.m37958h($z0);
            return;
        }
        Log_OC.LogError("dialog");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ void toggleInputBtnLoader$default(MPosActivationFragment mPosActivationFragment, boolean $z0, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $z0 = false;
        }
        mPosActivationFragment.toggleInputBtnLoader($z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void toggleInputDialog(boolean z) {
        if (!z) {
            DialogC0811j $r1 = this.dialog;
            if ($r1 != null) {
                $r1.m37965a();
                return;
            }
            Log_OC.LogError("dialog");
            NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
            throw r2;
        }
        Dialog $r12 = this.dialog;
        if ($r12 != null) {
            if ($r12 == null) {
                Log_OC.LogError("dialog");
                NullPointerException r22 = new NullPointerException("Null throw statement replaced by Soot");
                throw r22;
            }
            Dialog r3 = $r12;
            boolean $z0 = r3.isShowing();
            if ($z0) {
                return;
            }
            DialogC0811j $r13 = this.dialog;
            if ($r13 != null) {
                $r13.m37961e();
                return;
            }
            Log_OC.LogError("dialog");
            NullPointerException r23 = new NullPointerException("Null throw statement replaced by Soot");
            throw r23;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void toggleInputDialog$default(MPosActivationFragment mPosActivationFragment, boolean $z0, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $z0 = false;
        }
        mPosActivationFragment.toggleInputDialog($z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        MPosActivationViewData $r2 = (MPosActivationViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(MPosActivationViewData mPosActivationViewData) {
        Log_OC.getArray(mPosActivationViewData, "viewData");
        boolean $z0 = mPosActivationViewData.getToggleActionBtn();
        toggleInputBtnLoader($z0);
        boolean $z02 = mPosActivationViewData.getHasActivated();
        if ($z02) {
            openMPosAmountInputScreen();
        }
        String $r2 = mPosActivationViewData.getToastMsg();
        int $i0 = $r2.length();
        boolean $z03 = $i0 > 0;
        if ($z03) {
            String $r22 = mPosActivationViewData.getToastMsg();
            toast($r22);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        MPosActivationViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public MPosActivationViewModel createViewModel() {
        MPosActivationViewModel $r1 = getScreenViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final MPosActivationViewModel getScreenViewModel() {
        MPosActivationViewModel $r1 = this.screenViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("screenViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return MPosActivationViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        boolean $z0 = context instanceof CashWithdrawalOptionActivity;
        if ($z0) {
            this.cashWithdrawalActivity = (CashWithdrawalOptionActivity) context;
        }
        CashWithdrawalOptionActivity $r3 = this.cashWithdrawalActivity;
        if ($r3 != null) {
            CashWithdrawalOptionComponent $r1 = $r3.getCashWithdrawalOptionComponent();
            $r1.inject(this);
            return;
        }
        Log_OC.LogError("cashWithdrawalActivity");
        NullPointerException r4 = new NullPointerException("Null throw statement replaced by Soot");
        throw r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentMposActivationBinding $r4 = FragmentMposActivationBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        Context $r2 = getContext();
        if ($r2 != null) {
            MPosActivationFragment$responseReceiver$1 $r1 = this.responseReceiver;
            $r2.unregisterReceiver($r1);
        }
        super.onPause();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Context $r3 = getContext();
        if ($r3 == null) {
            return;
        }
        MPosActivationFragment$responseReceiver$1 $r1 = this.responseReceiver;
        IntentFilter $r2 = new IntentFilter("com.esl.paypadlib");
        $r3.registerReceiver($r1, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        InterfaceC8209a $r3 = requireBinding();
        FragmentMposActivationBinding $r4 = (FragmentMposActivationBinding) $r3;
        ConstraintLayout $r5 = $r4.btnActivate;
        $r5.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.withdraw_cash.ui.fragments.withdrawal_option.mpos.AboutFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MPosActivationFragment $r2 = MPosActivationFragment.this;
                MPosActivationFragment.m41810onViewCreated$lambda0($r2, view2);
            }
        });
        DialogC0811j.C0812a $r7 = DialogC0811j.f2281f;
        Context $r8 = requireContext();
        Log_OC.loadImage($r8, "requireContext()");
        C0760b r15 = new C0760b("Enter Activation Code", "This is your first time using the mPOS device for payment on Kudi. If you don’t have an activation code, send an email to support@nomba.com.", "Activation Code", "Continue", 0, 0, 48, (DBUtils$1) null);
        DialogC0811j $r10 = $r7.m37957a($r8, r15);
        MPosActivationFragment$onViewCreated$2 r16 = new MPosActivationFragment$onViewCreated$2(this);
        $r10.m37962d(r16);
        this.dialog = $r10;
        Handler r17 = new Handler();
        r17.postDelayed(new Runnable() { // from class: ai.kudi.agent.withdraw_cash.ui.fragments.withdrawal_option.mpos.TestActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public final void run() {
                MPosActivationFragment $r1 = MPosActivationFragment.this;
                MPosActivationFragment.m41811onViewCreated$lambda1($r1);
            }
        }, 1000L);
    }

    public final void setScreenViewModel(MPosActivationViewModel mPosActivationViewModel) {
        Log_OC.getArray(mPosActivationViewModel, "<set-?>");
        this.screenViewModel = mPosActivationViewModel;
    }
}

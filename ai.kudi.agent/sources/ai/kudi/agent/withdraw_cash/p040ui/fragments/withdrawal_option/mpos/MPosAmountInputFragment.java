package ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.mpos;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.common_screens.amount_input.p003ui.fragments.BaseAmountInputFragment;
import ai.kudi.agent.common_screens.amount_input.p003ui.viewmodels.BaseAmountInputViewModel;
import ai.kudi.agent.common_screens.status_loader.KudiStatusLoaderDialogFragment;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.Pref;
import ai.kudi.agent.mpos.DeviceConnectionActivity;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.withdraw_cash.game.components.CashWithdrawalOptionComponent;
import ai.kudi.agent.withdraw_cash.p040ui.activities.CashWithdrawalOptionActivity;
import ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.mpos.MPosAmountInputViewData;
import ai.kudi.agent.withdraw_cash.p040ui.viewmodels.withdrawal_option.mpos.MPosAmountInputViewModel;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.DialogInterfaceC0936d;
import androidx.fragment.app.FragmentManager;
import com.paypad.impl.Paypad;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: MPosAmountInputFragment.kt */
@Metadata(m10422d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0015\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u00012B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003H\u0014J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020 H\u0014J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\"H\u0002J\u0010\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\u001aH\u0016J\u0010\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u001dH\u0016J\b\u0010*\u001a\u00020\u001aH\u0016J\b\u0010+\u001a\u00020\u001aH\u0016J\b\u0010,\u001a\u00020\u001aH\u0002J\b\u0010-\u001a\u00020\u001aH\u0002J\u0010\u0010.\u001a\u00020\u001a2\u0006\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u00020\u001aH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.¢\u0006\u0002\n\u0000¨\u00063"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/ui/fragments/withdrawal_option/mpos/MPosAmountInputFragment;", "Lai/kudi/agent/common_screens/amount_input/ui/fragments/BaseAmountInputFragment;", "Lai/kudi/agent/withdraw_cash/ui/viewmodels/withdrawal_option/mpos/MPosAmountInputViewModel;", "Lai/kudi/agent/withdraw_cash/ui/viewdata/withdrawal_option/mpos/MPosAmountInputViewData;", "Lai/kudi/agent/common_screens/status_loader/KudiStatusLoaderDialogFragment$ActionListener;", "()V", "cashWithdrawalActivity", "Lai/kudi/agent/withdraw_cash/ui/activities/CashWithdrawalOptionActivity;", "payPad", "Lcom/paypad/impl/Paypad;", "getPayPad", "()Lcom/paypad/impl/Paypad;", "payPad$delegate", "Lkotlin/Lazy;", "pref", "Lai/kudi/agent/core/util/Pref;", "getPref", "()Lai/kudi/agent/core/util/Pref;", "setPref", "(Lai/kudi/agent/core/util/Pref;)V", "responseReceiver", "ai/kudi/agent/withdraw_cash/ui/fragments/withdrawal_option/mpos/MPosAmountInputFragment$responseReceiver$1", "Lai/kudi/agent/withdraw_cash/ui/fragments/withdrawal_option/mpos/MPosAmountInputFragment$responseReceiver$1;", "statusLoader", "Lai/kudi/agent/common_screens/status_loader/KudiStatusLoaderDialogFragment;", "applyViewData", "", "viewData", "getMaximumAmount", "", "getMinimumAmount", "getVMType", "Ljava/lang/Class;", "isPayPadActivated", "", "isPayPadInitialized", "onAttach", "context", "Landroid/content/Context;", "onDismissDialog", "onNextBtnClick", TransactionField.AMOUNT, "onPause", "onResume", "openMPosActivationScreen", "showInitializationNotCompleted", "showStatusLoader", "msg", "", "startDevice", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.withdraw_cash.ui.fragments.withdrawal_option.mpos.MPosAmountInputFragment */
/* loaded from: classes.dex */
public final class MPosAmountInputFragment extends BaseAmountInputFragment<MPosAmountInputViewModel, MPosAmountInputViewData> implements KudiStatusLoaderDialogFragment.ActionListener {
    public static final Companion Companion;
    public static final String PAYPAD_RESPONSE_ENTER_PIN = "enterPIN";
    public static final String PAYPAD_RESPONSE_INITIALIZE_COMPLETE = "Initializecomplete";
    public static final String PAYPAD_RESPONSE_INITIALIZE_NOT_COMPLETE = "initializenotcomplete";
    public static final String PAYPAD_RESPONSE_INSERT_CARD = "stopInsertStartBusy";
    public static final String PAYPAD_RESPONSE_START_INITIALIZATION = "startInitializeprogress";
    public static final String PAYPAD_RESPONSE_STOP = "stop";
    public static final String PAYPAD_RESPONSE_TRANSACTION_RESPONSE = "transactionresponse";
    private CashWithdrawalOptionActivity cashWithdrawalActivity;
    private final InterfaceC11824h payPad$delegate;
    public Pref pref;
    private MPosAmountInputFragment$responseReceiver$1 responseReceiver;
    private KudiStatusLoaderDialogFragment statusLoader;

    /* compiled from: MPosAmountInputFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/ui/fragments/withdrawal_option/mpos/MPosAmountInputFragment$Companion;", "", "()V", "PAYPAD_RESPONSE_ENTER_PIN", "", "PAYPAD_RESPONSE_INITIALIZE_COMPLETE", "PAYPAD_RESPONSE_INITIALIZE_NOT_COMPLETE", "PAYPAD_RESPONSE_INSERT_CARD", "PAYPAD_RESPONSE_START_INITIALIZATION", "PAYPAD_RESPONSE_STOP", "PAYPAD_RESPONSE_TRANSACTION_RESPONSE", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.withdraw_cash.ui.fragments.withdrawal_option.mpos.MPosAmountInputFragment$Companion */
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
    /* JADX WARN: Type inference failed for: r2v0, types: [ai.kudi.agent.withdraw_cash.ui.fragments.withdrawal_option.mpos.MPosAmountInputFragment$responseReceiver$1] */
    public MPosAmountInputFragment() {
        InterfaceC11824h $r1;
        MPosAmountInputFragment$payPad$2 $r2 = new MPosAmountInputFragment$payPad$2(this);
        $r1 = C13218k.m5625b($r2);
        this.payPad$delegate = $r1;
        this.responseReceiver = new BroadcastReceiver() { // from class: ai.kudi.agent.withdraw_cash.ui.fragments.withdrawal_option.mpos.MPosAmountInputFragment$responseReceiver$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Log_OC.getArray(intent, "intent");
                MPosAmountInputFragment $r3 = MPosAmountInputFragment.this;
                String $r4 = intent.getStringExtra("response");
                if ($r4 != null) {
                    int $i0 = $r4.hashCode();
                    switch ($i0) {
                        case -2118244065:
                            boolean $z0 = $r4.equals("transactionresponse");
                            if ($z0) {
                                String[] $r8 = intent.getStringArrayExtra("responsearray");
                                if ($r8 != null) {
                                    String $r42 = $r8[0];
                                }
                                if ($r8 != null) {
                                    String $r43 = $r8[1];
                                }
                                if ($r8 != null) {
                                    String $r44 = $r8[2];
                                }
                                if ($r8 != null) {
                                    String $r45 = $r8[3];
                                }
                                if ($r8 != null) {
                                    String $r46 = $r8[4];
                                }
                                if ($r8 != null) {
                                    String $r47 = $r8[5];
                                }
                                if ($r8 != null) {
                                    String $r48 = $r8[6];
                                }
                                if ($r8 != null) {
                                    String $r49 = $r8[7];
                                }
                                if ($r8 == null) {
                                    return;
                                }
                                String $r410 = $r8[8];
                                return;
                            }
                            return;
                        case -2105892963:
                            boolean $z02 = $r4.equals("enterPIN");
                            if ($z02) {
                                $r3.showStatusLoader("Enter your Card pin on the MPOS");
                                return;
                            }
                            return;
                        case -559369348:
                            boolean $z03 = $r4.equals("initializenotcomplete");
                            if ($z03) {
                                KudiStatusLoaderDialogFragment $r7 = $r3.statusLoader;
                                if ($r7 != null) {
                                    $r7.close();
                                    $r3.showInitializationNotCompleted();
                                    return;
                                }
                                Log_OC.LogError("statusLoader");
                                NullPointerException r9 = new NullPointerException("Null throw statement replaced by Soot");
                                throw r9;
                            }
                            return;
                        case 3540994:
                            $r4.equals("stop");
                            return;
                        case 225978601:
                            boolean $z04 = $r4.equals("Initializecomplete");
                            if ($z04) {
                                BaseAmountInputViewModel $r5 = $r3.getScreenViewModel();
                                MPosAmountInputViewModel $r6 = (MPosAmountInputViewModel) $r5;
                                $r6.onMPosDeviceInitialized();
                                $r3.startDevice();
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
            }
        };
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Paypad getPayPad() {
        InterfaceC11824h $r2 = this.payPad$delegate;
        Object $r1 = $r2.getValue();
        Paypad $r3 = (Paypad) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isPayPadActivated() {
        Pref $r1 = getPref();
        boolean $z0 = $r1.isMPosDeviceActivated();
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isPayPadInitialized() {
        Pref $r1 = getPref();
        boolean $z0 = $r1.isMPosDeviceInitialized();
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void openMPosActivationScreen() {
        CashWithdrawalOptionActivity $r2 = this.cashWithdrawalActivity;
        if ($r2 == null) {
            Log_OC.LogError("cashWithdrawalActivity");
            NullPointerException r3 = new NullPointerException("Null throw statement replaced by Soot");
            throw r3;
        }
        MPosActivationFragment r4 = new MPosActivationFragment();
        AppCompatActivity r5 = (AppCompatActivity) $r2;
        AppCompatActivityExtKt.startFragment$default(r5, r4, C0001R.C0003id.contentFrameLayout, false, false, false, 28, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showInitializationNotCompleted() {
        Context $r2 = getContext();
        Log_OC.append($r2);
        DialogInterfaceC0936d.C0937a $r1 = new DialogInterfaceC0936d.C0937a($r2);
        $r1.setTitle("Initialization failed").setMessage("Please close this dialog and try the transaction again.").setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ai.kudi.agent.withdraw_cash.ui.fragments.withdrawal_option.mpos.SearchActivity$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                MPosAmountInputFragment $r22 = MPosAmountInputFragment.this;
                MPosAmountInputFragment.m41812showInitializationNotCompleted$lambda0($r22, dialogInterface);
            }
        }).setNeutralButton("Close", new DialogInterface.OnClickListener() { // from class: ai.kudi.agent.withdraw_cash.ui.fragments.withdrawal_option.mpos.NoteEditor$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                MPosAmountInputFragment $r22 = MPosAmountInputFragment.this;
                MPosAmountInputFragment.m41813showInitializationNotCompleted$lambda1($r22, dialogInterface, i);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: showInitializationNotCompleted$lambda-0  reason: not valid java name */
    public static final void m41812showInitializationNotCompleted$lambda0(MPosAmountInputFragment mPosAmountInputFragment, DialogInterface dialogInterface) {
        Log_OC.getArray(mPosAmountInputFragment, "this$0");
        CashWithdrawalOptionActivity $r2 = mPosAmountInputFragment.cashWithdrawalActivity;
        if ($r2 != null) {
            AppCompatActivity r4 = (AppCompatActivity) $r2;
            AppCompatActivityExtKt.closeFragment(r4);
            return;
        }
        Log_OC.LogError("cashWithdrawalActivity");
        NullPointerException r3 = new NullPointerException("Null throw statement replaced by Soot");
        throw r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: showInitializationNotCompleted$lambda-1  reason: not valid java name */
    public static final void m41813showInitializationNotCompleted$lambda1(MPosAmountInputFragment mPosAmountInputFragment, DialogInterface dialogInterface, int i) {
        Log_OC.getArray(mPosAmountInputFragment, "this$0");
        CashWithdrawalOptionActivity $r2 = mPosAmountInputFragment.cashWithdrawalActivity;
        if ($r2 != null) {
            AppCompatActivity r4 = (AppCompatActivity) $r2;
            AppCompatActivityExtKt.closeFragment(r4);
            return;
        }
        Log_OC.LogError("cashWithdrawalActivity");
        NullPointerException r3 = new NullPointerException("Null throw statement replaced by Soot");
        throw r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showStatusLoader(String str) {
        KudiStatusLoaderDialogFragment.Companion $r3 = KudiStatusLoaderDialogFragment.Companion;
        KudiStatusLoaderDialogFragment.Option $r1 = new KudiStatusLoaderDialogFragment.Option(null, str, 0, 0, 13, null);
        KudiStatusLoaderDialogFragment $r4 = $r3.create($r1, this);
        this.statusLoader = $r4;
        if ($r4 == null) {
            Log_OC.LogError("statusLoader");
            NullPointerException r6 = new NullPointerException("Null throw statement replaced by Soot");
            throw r6;
        }
        FragmentManager $r5 = getChildFragmentManager();
        Log_OC.loadImage($r5, "childFragmentManager");
        $r4.open($r5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void startDevice() {
        boolean $z0 = isPayPadActivated();
        if (!$z0) {
            openMPosActivationScreen();
            return;
        }
        boolean $z02 = isPayPadInitialized();
        if ($z02) {
            Paypad $r1 = getPayPad();
            $r1.connect(DeviceConnectionActivity.class);
            return;
        }
        showStatusLoader("MPOS is being initialized for this account...");
        Paypad $r12 = getPayPad();
        $r12.initialize(DeviceConnectionActivity.class);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        MPosAmountInputViewData $r2 = (MPosAmountInputViewData) viewData;
        applyViewData($r2);
    }

    protected void applyViewData(MPosAmountInputViewData mPosAmountInputViewData) {
        Log_OC.getArray(mPosAmountInputViewData, "viewData");
    }

    @Override // ai.kudi.agent.common_screens.amount_input.p003ui.fragments.BaseAmountInputFragment
    public int getMaximumAmount() {
        return 20000;
    }

    @Override // ai.kudi.agent.common_screens.amount_input.p003ui.fragments.BaseAmountInputFragment
    public int getMinimumAmount() {
        return 500;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Pref getPref() {
        Pref $r1 = this.pref;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("pref");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return MPosAmountInputViewModel.class;
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
    @Override // ai.kudi.agent.common_screens.status_loader.KudiStatusLoaderDialogFragment.ActionListener
    public void onDismissDialog() {
        CashWithdrawalOptionActivity $r1 = this.cashWithdrawalActivity;
        if ($r1 != null) {
            AppCompatActivity r3 = (AppCompatActivity) $r1;
            AppCompatActivityExtKt.closeFragment(r3);
            return;
        }
        Log_OC.LogError("cashWithdrawalActivity");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.common_screens.amount_input.p003ui.fragments.BaseAmountInputFragment
    public void onNextBtnClick(int i) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        CashWithdrawalOptionActivity $r2 = this.cashWithdrawalActivity;
        if ($r2 == null) {
            Log_OC.LogError("cashWithdrawalActivity");
            NullPointerException r3 = new NullPointerException("Null throw statement replaced by Soot");
            throw r3;
        }
        MPosAmountInputFragment$responseReceiver$1 $r1 = this.responseReceiver;
        Activity r4 = (Activity) $r2;
        r4.unregisterReceiver($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        startDevice();
        CashWithdrawalOptionActivity $r3 = this.cashWithdrawalActivity;
        if ($r3 == null) {
            Log_OC.LogError("cashWithdrawalActivity");
            NullPointerException r4 = new NullPointerException("Null throw statement replaced by Soot");
            throw r4;
        }
        MPosAmountInputFragment$responseReceiver$1 $r1 = this.responseReceiver;
        IntentFilter r5 = new IntentFilter("com.esl.paypadlib");
        Activity r6 = (Activity) $r3;
        r6.registerReceiver($r1, r5);
    }

    public final void setPref(Pref pref) {
        Log_OC.getArray(pref, "<set-?>");
        this.pref = pref;
    }
}

package ai.kudi.agent.outlet_mgt.fragments;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.common_screens.amount_input.p003ui.fragments.BaseAmountInputFragment;
import ai.kudi.agent.common_screens.success_screen.fragment.SuccessScreenDialogFragment;
import ai.kudi.agent.common_screens.success_screen.labs.SuccessScreenCustomOption;
import ai.kudi.agent.constants.ConstantsKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.outlet_mgt.activities.OutletTopUpActivity;
import ai.kudi.agent.outlet_mgt.data.ConstKt;
import ai.kudi.agent.outlet_mgt.data.Outlet;
import ai.kudi.agent.outlet_mgt.game.components.OutletMgtFeaturesSubcomponents;
import ai.kudi.agent.outlet_mgt.viewmodels.OutletTopUpAmtViewData;
import ai.kudi.agent.outlet_mgt.viewmodels.OutletTopUpAmtViewModel;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import androidx.lifecycle.PreferenceActivity;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: OutletTopUpAmountFragment.kt */
@Metadata(m10422d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001(B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003H\u0014J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0014J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0019H\u0002J\u0010\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u0019H\u0016J\b\u0010'\u001a\u00020\u0016H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R$\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006)"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/fragments/OutletTopUpAmountFragment;", "Lai/kudi/agent/common_screens/amount_input/ui/fragments/BaseAmountInputFragment;", "Lai/kudi/agent/outlet_mgt/viewmodels/OutletTopUpAmtViewModel;", "Lai/kudi/agent/outlet_mgt/viewmodels/OutletTopUpAmtViewData;", "()V", "outlet", "Lai/kudi/agent/outlet_mgt/data/Outlet;", "outletTopUpAmtViewModel", "getOutletTopUpAmtViewModel", "()Lai/kudi/agent/outlet_mgt/viewmodels/OutletTopUpAmtViewModel;", "setOutletTopUpAmtViewModel", "(Lai/kudi/agent/outlet_mgt/viewmodels/OutletTopUpAmtViewModel;)V", "outletTopupActivity", "Lai/kudi/agent/outlet_mgt/activities/OutletTopUpActivity;", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences$annotations", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "applyViewData", "", "viewData", "getMaximumAmount", "", "getMinimumAmount", "getVMType", "Ljava/lang/Class;", "handleWalletFundingFailure", "it", "", "isAmountValid", "", TransactionField.AMOUNT, "onAttach", "context", "Landroid/content/Context;", "onNextBtnClick", "showSuccessScreen", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OutletTopUpAmountFragment extends BaseAmountInputFragment<OutletTopUpAmtViewModel, OutletTopUpAmtViewData> {
    public static final Companion Companion;
    private Outlet outlet;
    public OutletTopUpAmtViewModel outletTopUpAmtViewModel;
    private OutletTopUpActivity outletTopupActivity;
    public SharedPreferences sharedPreferences;

    /* compiled from: OutletTopUpAmountFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/fragments/OutletTopUpAmountFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/outlet_mgt/fragments/OutletTopUpAmountFragment;", "outlet", "Lai/kudi/agent/outlet_mgt/data/Outlet;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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
        public final OutletTopUpAmountFragment newInstance(Outlet outlet) {
            Log_OC.getArray(outlet, "outlet");
            OutletTopUpAmountFragment $r3 = new OutletTopUpAmountFragment();
            Bundle $r1 = new Bundle();
            $r1.putParcelable(ConstKt.OUTLET_DATA, outlet);
            C13666w c13666w = C13666w.f30112a;
            $r3.setArguments($r1);
            return $r3;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    public static /* synthetic */ void getSharedPreferences$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void handleWalletFundingFailure(String str) {
        toggleLoader(false);
        FragmentActivity $r2 = requireActivity();
        Log_OC.loadImage($r2, "requireActivity()");
        ContextExtKt.toast$default($r2, str, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isAmountValid(int i) {
        SharedPreferences $r1 = getSharedPreferences();
        String $r2 = $r1.getString(ConstantsKt.EXTRA_WALLET_BALANCE, null);
        double $d0 = $r2 == null ? 0.0d : Double.parseDouble($r2);
        double $d1 = i;
        return $d0 >= $d1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onNextBtnClick$lambda-0  reason: not valid java name */
    public static final void m39886onNextBtnClick$lambda0(OutletTopUpAmountFragment outletTopUpAmountFragment, int i, String str, Bundle bundle) {
        Log_OC.getArray(outletTopUpAmountFragment, "this$0");
        Log_OC.getArray(str, "$noName_0");
        Log_OC.getArray(bundle, "$noName_1");
        outletTopUpAmountFragment.toggleLoader(true);
        OutletTopUpAmtViewModel $r4 = outletTopUpAmountFragment.getOutletTopUpAmtViewModel();
        Outlet $r5 = outletTopUpAmountFragment.outlet;
        String $r2 = $r5 == null ? null : $r5.getOutletId();
        if ($r2 == null) {
            $r2 = "";
        }
        OutletTopUpAmountFragment$onNextBtnClick$1$1 $r6 = new OutletTopUpAmountFragment$onNextBtnClick$1$1(outletTopUpAmountFragment);
        OutletTopUpAmountFragment$onNextBtnClick$1$2 $r1 = new OutletTopUpAmountFragment$onNextBtnClick$1$2(outletTopUpAmountFragment);
        $r4.performTopUp(i, $r2, $r6, $r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showSuccessScreen() {
        toggleLoader(false);
        SuccessScreenDialogFragment.Companion $r1 = SuccessScreenDialogFragment.Companion;
        SuccessScreenCustomOption r7 = new SuccessScreenCustomOption("Outlet Wallet funded successfully", "", "Go Back", true, false, false, 0, 0, 0, 0, C0001R.C0002drawable.ic_successful_transaction_status, 0, false, 7152, null);
        SuccessScreenDialogFragment $r3 = $r1.newInstance(r7);
        OutletTopUpActivity $r4 = this.outletTopupActivity;
        if ($r4 == null) {
            Log_OC.LogError("outletTopupActivity");
            NullPointerException r6 = new NullPointerException("Null throw statement replaced by Soot");
            throw r6;
        }
        FragmentActivity r8 = (FragmentActivity) $r4;
        FragmentManager $r5 = r8.getSupportFragmentManager();
        $r3.show($r5, "Success Fragmnent");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        OutletTopUpAmtViewData $r2 = (OutletTopUpAmtViewData) viewData;
        applyViewData($r2);
    }

    protected void applyViewData(OutletTopUpAmtViewData outletTopUpAmtViewData) {
        Log_OC.getArray(outletTopUpAmtViewData, "viewData");
    }

    @Override // ai.kudi.agent.common_screens.amount_input.p003ui.fragments.BaseAmountInputFragment
    public int getMaximumAmount() {
        return 5000000;
    }

    @Override // ai.kudi.agent.common_screens.amount_input.p003ui.fragments.BaseAmountInputFragment
    public int getMinimumAmount() {
        return 500;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OutletTopUpAmtViewModel getOutletTopUpAmtViewModel() {
        OutletTopUpAmtViewModel $r1 = this.outletTopUpAmtViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("outletTopUpAmtViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SharedPreferences getSharedPreferences() {
        SharedPreferences $r1 = this.sharedPreferences;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("sharedPreferences");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return OutletTopUpAmtViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        OutletTopUpActivity $r3 = (OutletTopUpActivity) context;
        this.outletTopupActivity = $r3;
        if ($r3 != null) {
            OutletMgtFeaturesSubcomponents $r1 = $r3.getOutletMgtFeaturesSubcomponent();
            $r1.inject(this);
            return;
        }
        Log_OC.LogError("outletTopupActivity");
        NullPointerException r4 = new NullPointerException("Null throw statement replaced by Soot");
        throw r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.common_screens.amount_input.p003ui.fragments.BaseAmountInputFragment
    public void onNextBtnClick(final int i) {
        Outlet outlet;
        Bundle $r1 = getArguments();
        if ($r1 == null) {
            outlet = null;
        } else {
            Parcelable $r3 = $r1.getParcelable(ConstKt.OUTLET_DATA);
            outlet = (Outlet) $r3;
        }
        this.outlet = outlet;
        boolean $z0 = isAmountValid(i);
        if (!$z0) {
            SuccessScreenDialogFragment.Companion $r9 = SuccessScreenDialogFragment.Companion;
            SuccessScreenCustomOption r13 = new SuccessScreenCustomOption("Insufficient Funds", "", "Go back", true, false, false, 0, 0, 0, 0, C0001R.C0002drawable.ic_failed_transaction_status, 0, false, 7152, null);
            SuccessScreenDialogFragment $r11 = $r9.newInstance(r13);
            FragmentManager $r4 = getChildFragmentManager();
            $r11.show($r4, "Success Fragmnent");
            return;
        }
        FragmentManager $r42 = getChildFragmentManager();
        PreferenceActivity $r5 = getViewLifecycleOwner();
        $r42.p1(KudiPin.KUDI_PIN_AUTH_SUCCESS_KEY, $r5, new InterfaceC1523w() { // from class: ai.kudi.agent.outlet_mgt.fragments.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: c */
            public final void m38715c(String str, Bundle bundle) {
                OutletTopUpAmountFragment $r32 = OutletTopUpAmountFragment.this;
                int $i0 = i;
                OutletTopUpAmountFragment.m39886onNextBtnClick$lambda0($r32, $i0, str, bundle);
            }
        });
        KudiPin.Companion $r7 = KudiPin.Companion;
        KudiPin $r8 = KudiPin.Companion.newInstance$default($r7, null, null, false, 7, null);
        FragmentManager $r43 = getChildFragmentManager();
        Chapter r14 = (Chapter) $r8;
        r14.show($r43, ".AuthDialog.Dialog");
    }

    public final void setOutletTopUpAmtViewModel(OutletTopUpAmtViewModel outletTopUpAmtViewModel) {
        Log_OC.getArray(outletTopUpAmtViewModel, "<set-?>");
        this.outletTopUpAmtViewModel = outletTopUpAmtViewModel;
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }
}

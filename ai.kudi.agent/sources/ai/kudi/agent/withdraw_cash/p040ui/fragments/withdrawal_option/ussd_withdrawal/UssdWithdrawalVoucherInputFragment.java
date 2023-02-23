package ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.ussd_withdrawal;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.FragmentUssdWithdrawalVoucherInputBinding;
import ai.kudi.agent.statesandlgapicker.dialogs.StateFragment;
import ai.kudi.agent.wallettopup.data.BanksWithMethods;
import ai.kudi.agent.withdraw_cash.game.components.CashWithdrawalOptionComponent;
import ai.kudi.agent.withdraw_cash.p040ui.activities.CashWithdrawalOptionActivity;
import ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.ussd_withdrawal.UssdWithdrawalAmountInputFragment;
import ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.ussd_withdrawal.UssdWithdrawalVoucherSummaryFragment;
import ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.ussd_withdrawal.NoVoucherWithdrawalPayload;
import ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.ussd_withdrawal.UssdWithdrawalVoucherInputViewData;
import ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.ussd_withdrawal.VoucherData;
import ai.kudi.agent.withdraw_cash.p040ui.viewmodels.withdrawal_option.ussd_withdrawal.UssdWithdrawalVoucherInputViewModel;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13277t;
import p201g.p270x.InterfaceC8209a;
/* compiled from: UssdWithdrawalVoucherInputFragment.kt */
@Metadata(m10422d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003H\u0014J\b\u0010\u0010\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0014J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0014J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020\u000eH\u0016J\u001a\u0010)\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010+\u001a\u00020\u000eH\u0002J\u0018\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020'H\u0002J\u0010\u00100\u001a\u00020\u000e2\u0006\u00101\u001a\u00020'H\u0002J\"\u00102\u001a\u00020\u000e2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002042\b\u00106\u001a\u0004\u0018\u00010'H\u0002J\u001a\u00107\u001a\u00020\u000e2\b\b\u0002\u00108\u001a\u0002042\u0006\u00109\u001a\u000204H\u0002J\u0010\u0010:\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020.H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006<"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/ui/fragments/withdrawal_option/ussd_withdrawal/UssdWithdrawalVoucherInputFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/withdraw_cash/ui/viewmodels/withdrawal_option/ussd_withdrawal/UssdWithdrawalVoucherInputViewModel;", "Lai/kudi/agent/withdraw_cash/ui/viewdata/withdrawal_option/ussd_withdrawal/UssdWithdrawalVoucherInputViewData;", "Lai/kudi/agent/databinding/FragmentUssdWithdrawalVoucherInputBinding;", "()V", "cashWithdrawalActivity", "Lai/kudi/agent/withdraw_cash/ui/activities/CashWithdrawalOptionActivity;", "screenViewModel", "getScreenViewModel", "()Lai/kudi/agent/withdraw_cash/ui/viewmodels/withdrawal_option/ussd_withdrawal/UssdWithdrawalVoucherInputViewModel;", "setScreenViewModel", "(Lai/kudi/agent/withdraw_cash/ui/viewmodels/withdrawal_option/ussd_withdrawal/UssdWithdrawalVoucherInputViewModel;)V", "applyViewData", "", "viewData", "attemptOpeningVoucherScreen", "createViewModel", "getVMType", "Ljava/lang/Class;", "gotoAmountInputScreen", "payload", "Lai/kudi/agent/withdraw_cash/ui/viewdata/withdrawal_option/ussd_withdrawal/NoVoucherWithdrawalPayload;", "gotoWithdrawalVoucherScreen", "voucherData", "Lai/kudi/agent/withdraw_cash/ui/viewdata/withdrawal_option/ussd_withdrawal/VoucherData;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onProviderSelected", BanksWithMethods.BANK_NAME, "", "onStop", "onViewCreated", "view", "openBankSelector", "showViewError", "errorViewId", "", "errorMsg", "toast", "msg", "toggleFormState", "showPrompt", "", "showVoucherInput", "promptText", "toggleOtherViews", "show", "showWarning", "toggleViewState", "screenStateId", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.withdraw_cash.ui.fragments.withdrawal_option.ussd_withdrawal.UssdWithdrawalVoucherInputFragment */
/* loaded from: classes.dex */
public final class UssdWithdrawalVoucherInputFragment extends BaseMVVMViewBindingFragment<UssdWithdrawalVoucherInputViewModel, UssdWithdrawalVoucherInputViewData, FragmentUssdWithdrawalVoucherInputBinding> {
    private CashWithdrawalOptionActivity cashWithdrawalActivity;
    public UssdWithdrawalVoucherInputViewModel screenViewModel;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void attemptOpeningVoucherScreen() {
        CharSequence $r6;
        CharSequence $r62;
        InterfaceC8209a $r1 = requireBinding();
        FragmentUssdWithdrawalVoucherInputBinding $r2 = (FragmentUssdWithdrawalVoucherInputBinding) $r1;
        UssdWithdrawalVoucherInputViewModel $r3 = getScreenViewModel();
        KudiInputField $r4 = $r2.etVoucher;
        String $r5 = $r4.getText();
        if ($r5 == null) {
            NullPointerException $r8 = new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            throw $r8;
        }
        $r6 = C13277t.m5414M0($r5);
        String $r52 = $r6.toString();
        KudiInputField $r42 = $r2.etPhoneNum;
        String $r7 = $r42.getText();
        if ($r7 == null) {
            NullPointerException $r82 = new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            throw $r82;
        }
        $r62 = C13277t.m5414M0($r7);
        $r3.validateInput($r52, $r62.toString());
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void gotoAmountInputScreen(NoVoucherWithdrawalPayload noVoucherWithdrawalPayload) {
        UssdWithdrawalAmountInputFragment.Companion $r1 = UssdWithdrawalAmountInputFragment.Companion;
        UssdWithdrawalAmountInputFragment $r3 = $r1.newInstance(noVoucherWithdrawalPayload);
        CashWithdrawalOptionActivity $r2 = this.cashWithdrawalActivity;
        if ($r2 != null) {
            AppCompatActivity r6 = (AppCompatActivity) $r2;
            AppCompatActivityExtKt.startFragment$default(r6, $r3, C0001R.C0003id.contentFrameLayout, true, false, false, 24, null);
            return;
        }
        Log_OC.LogError("cashWithdrawalActivity");
        NullPointerException r5 = new NullPointerException("Null throw statement replaced by Soot");
        throw r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void gotoWithdrawalVoucherScreen(VoucherData voucherData) {
        UssdWithdrawalVoucherSummaryFragment.Companion $r1 = UssdWithdrawalVoucherSummaryFragment.Companion;
        UssdWithdrawalVoucherSummaryFragment $r3 = $r1.newInstance(voucherData);
        CashWithdrawalOptionActivity $r2 = this.cashWithdrawalActivity;
        if ($r2 != null) {
            AppCompatActivity r6 = (AppCompatActivity) $r2;
            AppCompatActivityExtKt.startFragment$default(r6, $r3, C0001R.C0003id.contentFrameLayout, true, false, false, 24, null);
            return;
        }
        Log_OC.LogError("cashWithdrawalActivity");
        NullPointerException r5 = new NullPointerException("Null throw statement replaced by Soot");
        throw r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onProviderSelected(String str) {
        UssdWithdrawalVoucherInputViewModel $r2 = getScreenViewModel();
        $r2.onProviderSelected(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-5$lambda-0  reason: not valid java name */
    public static final void m41816onViewCreated$lambda5$lambda0(UssdWithdrawalVoucherInputFragment ussdWithdrawalVoucherInputFragment, View view) {
        Log_OC.getArray(ussdWithdrawalVoucherInputFragment, "this$0");
        ussdWithdrawalVoucherInputFragment.openBankSelector();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-5$lambda-1  reason: not valid java name */
    public static final void m41817onViewCreated$lambda5$lambda1(UssdWithdrawalVoucherInputFragment ussdWithdrawalVoucherInputFragment, View view) {
        Log_OC.getArray(ussdWithdrawalVoucherInputFragment, "this$0");
        ussdWithdrawalVoucherInputFragment.openBankSelector();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-5$lambda-2  reason: not valid java name */
    public static final boolean m41818onViewCreated$lambda5$lambda2(UssdWithdrawalVoucherInputFragment ussdWithdrawalVoucherInputFragment, TextView textView, int i, KeyEvent keyEvent) {
        Log_OC.getArray(ussdWithdrawalVoucherInputFragment, "this$0");
        if (i == 6) {
            ContextExtKt.hideKeyboard(ussdWithdrawalVoucherInputFragment);
            ussdWithdrawalVoucherInputFragment.attemptOpeningVoucherScreen();
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-5$lambda-3  reason: not valid java name */
    public static final void m41819onViewCreated$lambda5$lambda3(UssdWithdrawalVoucherInputFragment ussdWithdrawalVoucherInputFragment, View view) {
        Log_OC.getArray(ussdWithdrawalVoucherInputFragment, "this$0");
        ussdWithdrawalVoucherInputFragment.attemptOpeningVoucherScreen();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-5$lambda-4  reason: not valid java name */
    public static final void m41820onViewCreated$lambda5$lambda4(UssdWithdrawalVoucherInputFragment ussdWithdrawalVoucherInputFragment, View view) {
        Log_OC.getArray(ussdWithdrawalVoucherInputFragment, "this$0");
        UssdWithdrawalVoucherInputViewModel $r0 = ussdWithdrawalVoucherInputFragment.getScreenViewModel();
        $r0.onRetryButtonClicked();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void openBankSelector() {
        StateFragment.Companion $r1 = StateFragment.Companion;
        UssdWithdrawalVoucherInputViewModel $r2 = getScreenViewModel();
        List $r3 = $r2.getAvailableProviders();
        StateFragment $r4 = $r1.newInstance($r3, "Select provider");
        UssdWithdrawalVoucherInputFragment$openBankSelector$1$1 $r5 = new UssdWithdrawalVoucherInputFragment$openBankSelector$1$1(this, $r4);
        $r4.setCallback($r5);
        FragmentManager $r6 = getChildFragmentManager();
        String $r8 = StateFragment.class.getSimpleName();
        $r4.show($r6, $r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showViewError(int i, String str) {
        KudiInputField $r2;
        if (i != -1) {
            int $i1 = str.length();
            boolean $z0 = $i1 == 0;
            if ($z0) {
                return;
            }
            if (i == C0001R.C0003id.et_phone_num) {
                InterfaceC8209a $r3 = requireBinding();
                FragmentUssdWithdrawalVoucherInputBinding $r4 = (FragmentUssdWithdrawalVoucherInputBinding) $r3;
                $r2 = $r4.etPhoneNum;
            } else if (i != C0001R.C0003id.et_voucher) {
                $r2 = null;
            } else {
                InterfaceC8209a $r32 = requireBinding();
                FragmentUssdWithdrawalVoucherInputBinding $r42 = (FragmentUssdWithdrawalVoucherInputBinding) $r32;
                $r2 = $r42.etVoucher;
            }
            if ($r2 == null) {
                return;
            }
            $r2.setError(str);
            EditText $r5 = $r2.getEditText();
            $r5.requestFocus();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void toast(String str) {
        FragmentActivity $r2 = requireActivity();
        Log_OC.loadImage($r2, "requireActivity()");
        ContextExtKt.toast($r2, str, 0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void toggleFormState(boolean z, boolean z2, String str) {
        InterfaceC8209a $r2 = requireBinding();
        FragmentUssdWithdrawalVoucherInputBinding $r3 = (FragmentUssdWithdrawalVoucherInputBinding) $r2;
        if (z) {
            TextView $r4 = $r3.tvDesc;
            Log_OC.loadImage($r4, "tvDesc");
            ViewExtKt.show($r4);
            $r3.tvDesc.setText(str);
        } else {
            TextView $r42 = $r3.tvDesc;
            Log_OC.loadImage($r42, "tvDesc");
            ViewExtKt.hide$default($r42, false, 1, null);
        }
        if (z2) {
            View $r5 = $r3.etVoucher;
            Log_OC.loadImage($r5, "etVoucher");
            View r6 = $r5;
            ViewExtKt.show(r6);
            return;
        }
        View $r52 = $r3.etVoucher;
        Log_OC.loadImage($r52, "etVoucher");
        View r62 = $r52;
        ViewExtKt.hide$default(r62, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void toggleOtherViews(boolean z, boolean z2) {
        InterfaceC8209a $r1 = requireBinding();
        FragmentUssdWithdrawalVoucherInputBinding $r2 = (FragmentUssdWithdrawalVoucherInputBinding) $r1;
        if (z) {
            View $r3 = $r2.etPhoneNum;
            Log_OC.loadImage($r3, "etPhoneNum");
            View r6 = $r3;
            ViewExtKt.show(r6);
            View $r32 = $r2.etVoucher;
            Log_OC.loadImage($r32, "etVoucher");
            View r62 = $r32;
            ViewExtKt.show(r62);
            TextView $r4 = $r2.tvDesc;
            Log_OC.loadImage($r4, "tvDesc");
            ViewExtKt.show($r4);
            View $r5 = $r2.btnContinue;
            Log_OC.loadImage($r5, "btnContinue");
            View r63 = $r5;
            ViewExtKt.show(r63);
        } else {
            View $r33 = $r2.etPhoneNum;
            Log_OC.loadImage($r33, "etPhoneNum");
            View r64 = $r33;
            ViewExtKt.hide$default(r64, false, 1, null);
            View $r34 = $r2.etVoucher;
            Log_OC.loadImage($r34, "etVoucher");
            View r65 = $r34;
            ViewExtKt.hide$default(r65, false, 1, null);
            TextView $r42 = $r2.tvDesc;
            Log_OC.loadImage($r42, "tvDesc");
            ViewExtKt.hide$default($r42, false, 1, null);
            View $r52 = $r2.btnContinue;
            Log_OC.loadImage($r52, "btnContinue");
            View r66 = $r52;
            ViewExtKt.hide$default(r66, false, 1, null);
        }
        if (z2) {
            TextView $r43 = $r2.tvPhoneNumNotif;
            Log_OC.loadImage($r43, "tvPhoneNumNotif");
            ViewExtKt.show($r43);
            return;
        }
        TextView $r44 = $r2.tvPhoneNumNotif;
        Log_OC.loadImage($r44, "tvPhoneNumNotif");
        ViewExtKt.hide$default($r44, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ void toggleOtherViews$default(UssdWithdrawalVoucherInputFragment ussdWithdrawalVoucherInputFragment, boolean $z1, boolean z, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $z1 = false;
        }
        ussdWithdrawalVoucherInputFragment.toggleOtherViews($z1, z);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void toggleViewState(int i) {
        InterfaceC8209a $r1 = requireBinding();
        FragmentUssdWithdrawalVoucherInputBinding $r2 = (FragmentUssdWithdrawalVoucherInputBinding) $r1;
        if (i == 1) {
            LinearLayout $r3 = $r2.retryState;
            Log_OC.loadImage($r3, "retryState");
            ViewExtKt.show($r3);
            LinearLayout $r32 = $r2.filledState;
            Log_OC.loadImage($r32, "filledState");
            ViewExtKt.hide$default($r32, false, 1, null);
        } else if (i != 2) {
        } else {
            LinearLayout $r33 = $r2.retryState;
            Log_OC.loadImage($r33, "retryState");
            ViewExtKt.hide$default($r33, false, 1, null);
            LinearLayout $r34 = $r2.filledState;
            Log_OC.loadImage($r34, "filledState");
            ViewExtKt.show($r34);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        UssdWithdrawalVoucherInputViewData $r2 = (UssdWithdrawalVoucherInputViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(UssdWithdrawalVoucherInputViewData ussdWithdrawalVoucherInputViewData) {
        Log_OC.getArray(ussdWithdrawalVoucherInputViewData, "viewData");
        String $r2 = ussdWithdrawalVoucherInputViewData.getToastMsg();
        int $i0 = $r2.length();
        boolean $z0 = $i0 > 0;
        if ($z0) {
            String $r22 = ussdWithdrawalVoucherInputViewData.getToastMsg();
            toast($r22);
        }
        boolean $z02 = ussdWithdrawalVoucherInputViewData.getOpenBankSelector();
        if ($z02) {
            openBankSelector();
        }
        boolean $z03 = ussdWithdrawalVoucherInputViewData.getOpenVoucherScreen();
        if ($z03) {
            VoucherData $r3 = ussdWithdrawalVoucherInputViewData.getVoucherData();
            Log_OC.append($r3);
            gotoWithdrawalVoucherScreen($r3);
        } else {
            boolean $z04 = ussdWithdrawalVoucherInputViewData.getOpenAmountInputScreen();
            if ($z04) {
                NoVoucherWithdrawalPayload $r4 = ussdWithdrawalVoucherInputViewData.getVoucherlessPayload();
                Log_OC.append($r4);
                gotoAmountInputScreen($r4);
            }
        }
        CashWithdrawalOptionActivity $r5 = this.cashWithdrawalActivity;
        if ($r5 == null) {
            Log_OC.LogError("cashWithdrawalActivity");
            NullPointerException r9 = new NullPointerException("Null throw statement replaced by Soot");
            throw r9;
        }
        boolean $z05 = ussdWithdrawalVoucherInputViewData.getShowScreenLoader();
        $r5.toggleLoader($z05);
        int $i02 = ussdWithdrawalVoucherInputViewData.getScreenStateId();
        toggleViewState($i02);
        int $i03 = ussdWithdrawalVoucherInputViewData.getErrorViewId();
        String $r23 = ussdWithdrawalVoucherInputViewData.getErrorMsg();
        showViewError($i03, $r23);
        InterfaceC8209a $r6 = requireBinding();
        FragmentUssdWithdrawalVoucherInputBinding $r7 = (FragmentUssdWithdrawalVoucherInputBinding) $r6;
        KudiInputField $r8 = $r7.etProvider;
        String $r24 = ussdWithdrawalVoucherInputViewData.getProviderName();
        $r8.setText($r24);
        boolean $z06 = ussdWithdrawalVoucherInputViewData.getShowOtherViews();
        boolean $z1 = ussdWithdrawalVoucherInputViewData.getShowWarning();
        toggleOtherViews($z06, $z1);
        boolean $z07 = ussdWithdrawalVoucherInputViewData.getShowPromptText();
        boolean $z12 = ussdWithdrawalVoucherInputViewData.getShowVoucherInput();
        String $r25 = ussdWithdrawalVoucherInputViewData.getPromptText();
        toggleFormState($z07, $z12, $r25);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        UssdWithdrawalVoucherInputViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public UssdWithdrawalVoucherInputViewModel createViewModel() {
        UssdWithdrawalVoucherInputViewModel $r1 = getScreenViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final UssdWithdrawalVoucherInputViewModel getScreenViewModel() {
        UssdWithdrawalVoucherInputViewModel $r1 = this.screenViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("screenViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return UssdWithdrawalVoucherInputViewModel.class;
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
        FragmentUssdWithdrawalVoucherInputBinding $r4 = FragmentUssdWithdrawalVoucherInputBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(\n                inflater,\n                container,\n                false\n            )");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        UssdWithdrawalVoucherInputViewModel $r1 = getScreenViewModel();
        $r1.stop();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        InterfaceC8209a $r3 = requireBinding();
        FragmentUssdWithdrawalVoucherInputBinding $r4 = (FragmentUssdWithdrawalVoucherInputBinding) $r3;
        KudiInputField $r5 = $r4.etProvider;
        EditText $r6 = $r5.getEditText();
        $r6.setClickable(true);
        KudiInputField $r52 = $r4.etProvider;
        EditText $r62 = $r52.getEditText();
        $r62.setFocusable(false);
        ViewGroup $r53 = $r4.etProvider;
        ViewGroup r19 = $r53;
        r19.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.withdraw_cash.ui.fragments.withdrawal_option.ussd_withdrawal.ActivityMain$18
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UssdWithdrawalVoucherInputFragment $r2 = UssdWithdrawalVoucherInputFragment.this;
                UssdWithdrawalVoucherInputFragment.m41816onViewCreated$lambda5$lambda0($r2, view2);
            }
        });
        KudiInputField $r54 = $r4.etProvider;
        EditText $r63 = $r54.getEditText();
        $r63.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.withdraw_cash.ui.fragments.withdrawal_option.ussd_withdrawal.l
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UssdWithdrawalVoucherInputFragment $r2 = UssdWithdrawalVoucherInputFragment.this;
                UssdWithdrawalVoucherInputFragment.m41817onViewCreated$lambda5$lambda1($r2, view2);
            }
        });
        KudiInputField $r55 = $r4.etPhoneNum;
        EditText $r64 = $r55.getEditText();
        $r64.setImeActionLabel("Continue", 6);
        KudiInputField $r56 = $r4.etPhoneNum;
        EditText $r65 = $r56.getEditText();
        $r65.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: ai.kudi.agent.withdraw_cash.ui.fragments.withdrawal_option.ussd_withdrawal.WebFragment$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                UssdWithdrawalVoucherInputFragment $r2 = UssdWithdrawalVoucherInputFragment.this;
                boolean $z0 = UssdWithdrawalVoucherInputFragment.m41818onViewCreated$lambda5$lambda2($r2, textView, i, keyEvent);
                return $z0;
            }
        });
        ViewGroup $r10 = $r4.btnContinue;
        ViewGroup r192 = $r10;
        r192.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.withdraw_cash.ui.fragments.withdrawal_option.ussd_withdrawal.SearchResultsFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UssdWithdrawalVoucherInputFragment $r2 = UssdWithdrawalVoucherInputFragment.this;
                UssdWithdrawalVoucherInputFragment.m41819onViewCreated$lambda5$lambda3($r2, view2);
            }
        });
        ViewGroup $r102 = $r4.btnRetry;
        ViewGroup r193 = $r102;
        r193.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.withdraw_cash.ui.fragments.withdrawal_option.ussd_withdrawal.AboutFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UssdWithdrawalVoucherInputFragment $r2 = UssdWithdrawalVoucherInputFragment.this;
                UssdWithdrawalVoucherInputFragment.m41820onViewCreated$lambda5$lambda4($r2, view2);
            }
        });
        UssdWithdrawalVoucherInputViewModel $r13 = getScreenViewModel();
        $r13.onViewCreated();
    }

    public final void setScreenViewModel(UssdWithdrawalVoucherInputViewModel ussdWithdrawalVoucherInputViewModel) {
        Log_OC.getArray(ussdWithdrawalVoucherInputViewModel, "<set-?>");
        this.screenViewModel = ussdWithdrawalVoucherInputViewModel;
    }
}

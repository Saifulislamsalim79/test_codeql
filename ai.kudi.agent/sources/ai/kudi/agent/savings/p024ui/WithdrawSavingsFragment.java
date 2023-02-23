package ai.kudi.agent.savings.p024ui;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.IntExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.payments.adapter.AmountSuggestionAdapter;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.savings.C0456R;
import ai.kudi.agent.savings.data.model.SavingResponse;
import ai.kudi.agent.savings.data.model.WithdrawRequest;
import ai.kudi.agent.savings.data.viewdata.WithdrawSavingsViewData;
import ai.kudi.agent.savings.databinding.FragmentWithdrawSavingsBinding;
import ai.kudi.agent.savings.p024ui.PerformActionBottomSheet;
import ai.kudi.agent.savings.viewmodel.WithdrawSavingsViewModel;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.button.KudiTextView;
import ai.kudi.dip.library.keypad.PinpadView;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.C1335a;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import androidx.lifecycle.PreferenceActivity;
import androidx.recyclerview.widget.RecyclerView;
import dagger.android.p197e.C7429a;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13277t;
import p201g.p270x.InterfaceC8209a;
/* compiled from: WithdrawSavingsFragment.kt */
@Metadata(m10422d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ?2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001?B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0003H\u0014J\b\u0010'\u001a\u00020\u0002H\u0014J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020)H\u0014J\u0010\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020$H\u0002J\b\u0010.\u001a\u00020$H\u0002J\u0010\u0010/\u001a\u00020$2\u0006\u00100\u001a\u000201H\u0016J\u0012\u00102\u001a\u00020$2\b\u00103\u001a\u0004\u0018\u000104H\u0016J$\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u001a\u0010;\u001a\u00020$2\u0006\u0010<\u001a\u0002062\b\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u0010\n\u001a\u00020$H\u0002J\b\u0010=\u001a\u00020$H\u0002J\b\u0010>\u001a\u00020$H\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006@"}, m10421d2 = {"Lai/kudi/agent/savings/ui/WithdrawSavingsFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/savings/viewmodel/WithdrawSavingsViewModel;", "Lai/kudi/agent/savings/data/viewdata/WithdrawSavingsViewData;", "Lai/kudi/agent/savings/databinding/FragmentWithdrawSavingsBinding;", "()V", "amountSuggestionAdapter", "Lai/kudi/agent/payments/adapter/AmountSuggestionAdapter;", "getAmountSuggestionAdapter", "()Lai/kudi/agent/payments/adapter/AmountSuggestionAdapter;", "setAmountSuggestionAdapter", "(Lai/kudi/agent/payments/adapter/AmountSuggestionAdapter;)V", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "getAnalytics", "()Lai/kudi/agent/core/analytics/Analytics;", "setAnalytics", "(Lai/kudi/agent/core/analytics/Analytics;)V", "currentWalletBalance", "", "savingsDetail", "Lai/kudi/agent/savings/data/model/SavingResponse;", "savingsPlanId", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "viewModel", "getViewModel", "()Lai/kudi/agent/savings/viewmodel/WithdrawSavingsViewModel;", "setViewModel", "(Lai/kudi/agent/savings/viewmodel/WithdrawSavingsViewModel;)V", "amountWatcher", "", "applyViewData", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "hideOrDisplayLoader", "visibility", "", "launchBottomSheet", "launchPinDialog", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setKeypadCallback", "setUpView", "Companion", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.savings.ui.WithdrawSavingsFragment */
/* loaded from: classes.dex */
public final class WithdrawSavingsFragment extends BaseMVVMViewBindingFragment<WithdrawSavingsViewModel, WithdrawSavingsViewData, FragmentWithdrawSavingsBinding> {
    private static final String BALANCE = "savings_balance";
    public static final Companion Companion;
    private static final String DETAIL_KEY = "savings_detail";
    public static final String PERFORM_ACTION_TAG = "Withdraw Action";
    private static final String PLAN_ID = "savings_plan_id";
    public static final String WITHDRAW_AUTHORIZATION = "WITHDRAW_AUTHORIZATION_KEY";
    public static final String WITHDRAW_RESULT_KEY = "AUTHORIZED";
    public AmountSuggestionAdapter amountSuggestionAdapter;
    public Analytics analytics;
    private double currentWalletBalance;
    private SavingResponse savingsDetail;
    private String savingsPlanId = "";
    public SharedPreferences sharedPreferences;
    public WithdrawSavingsViewModel viewModel;

    /* compiled from: WithdrawSavingsFragment.kt */
    @Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/savings/ui/WithdrawSavingsFragment$Companion;", "", "()V", "BALANCE", "", "DETAIL_KEY", "PERFORM_ACTION_TAG", "PLAN_ID", "WITHDRAW_AUTHORIZATION", "WITHDRAW_RESULT_KEY", "newInstance", "Lai/kudi/agent/savings/ui/WithdrawSavingsFragment;", "balance", "", "planId", "savingResponse", "Lai/kudi/agent/savings/data/model/SavingResponse;", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.savings.ui.WithdrawSavingsFragment$Companion */
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
        public final WithdrawSavingsFragment newInstance(int i, String str, SavingResponse savingResponse) {
            Log_OC.getArray(str, "planId");
            Log_OC.getArray(savingResponse, "savingResponse");
            WithdrawSavingsFragment $r4 = new WithdrawSavingsFragment();
            Bundle $r3 = new Bundle();
            $r3.putInt(WithdrawSavingsFragment.BALANCE, i);
            $r3.putString(WithdrawSavingsFragment.PLAN_ID, str);
            $r3.putParcelable("savings_detail", savingResponse);
            C13666w c13666w = C13666w.f30112a;
            $r4.setArguments($r3);
            return $r4;
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
    private final void amountWatcher() {
        InterfaceC8209a $r3 = requireBinding();
        final FragmentWithdrawSavingsBinding $r4 = (FragmentWithdrawSavingsBinding) $r3;
        final KudiTextView $r1 = $r4.amountEditText;
        KudiTextView r6 = $r1;
        r6.addTextChangedListener(new TextWatcher() { // from class: ai.kudi.agent.savings.ui.WithdrawSavingsFragment$amountWatcher$1$1$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                Integer $r2;
                if (editable == null) {
                    $r2 = null;
                } else {
                    int $i0 = editable.length();
                    $r2 = Integer.valueOf($i0);
                }
                Log_OC.append($r2);
                int $i02 = $r2.intValue();
                if ($i02 <= 0) {
                    FragmentWithdrawSavingsBinding $r5 = $r4;
                    View $r10 = $r5.nextButton;
                    Log_OC.loadImage($r10, "nextButton");
                    View r14 = $r10;
                    ViewExtKt.hide$default(r14, false, 1, null);
                    FragmentWithdrawSavingsBinding $r52 = $r4;
                    TextView $r32 = $r52.currency;
                    TextView $r11 = KudiTextView.this;
                    TextView r13 = $r11;
                    Context $r12 = r13.getContext();
                    int $i03 = C0456R.color.light_text_color;
                    TextView r132 = $r32;
                    r132.setTextColor(C1335a.m36324d($r12, $i03));
                    return;
                }
                TextView $r33 = KudiTextView.this;
                TextView r133 = $r33;
                r133.removeTextChangedListener(this);
                String $r42 = StringExtKt.getFormatToCurrency(StringExtKt.getRemoveAllLetters(editable.toString()));
                TextView $r34 = KudiTextView.this;
                TextView r134 = $r34;
                r134.setText($r42);
                TextView $r35 = KudiTextView.this;
                TextView r135 = $r35;
                r135.addTextChangedListener(this);
                FragmentWithdrawSavingsBinding $r53 = $r4;
                PinpadView $r6 = $r53.keyboard;
                $r6.setPasscode($r42);
                WithdrawSavingsFragment $r7 = this;
                AmountSuggestionAdapter $r8 = $r7.getAmountSuggestionAdapter();
                double $d0 = Double.parseDouble(StringExtKt.getRemoveAllLetters($r42));
                int $i04 = (int) $d0;
                List $r9 = IntExtKt.range$default($i04, 0, 5000, 0, 10, null);
                $r8.setAmount($r9);
                FragmentWithdrawSavingsBinding $r54 = $r4;
                View $r102 = $r54.nextButton;
                Log_OC.loadImage($r102, "nextButton");
                View r142 = $r102;
                ViewExtKt.show(r142);
                FragmentWithdrawSavingsBinding $r55 = $r4;
                TextView $r36 = $r55.currency;
                TextView $r112 = KudiTextView.this;
                TextView r136 = $r112;
                Context $r122 = r136.getContext();
                int $i05 = C0456R.color.blackDatePickerTextColor;
                TextView r137 = $r36;
                r137.setTextColor(C1335a.m36324d($r122, $i05));
                FragmentWithdrawSavingsBinding $r56 = $r4;
                View $r37 = $r56.errorMessage;
                Log_OC.loadImage($r37, "errorMessage");
                View r143 = $r37;
                ViewExtKt.hide$default(r143, false, 1, null);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final FragmentWithdrawSavingsBinding hideOrDisplayLoader(boolean z) {
        InterfaceC8209a $r1 = requireBinding();
        FragmentWithdrawSavingsBinding $r2 = (FragmentWithdrawSavingsBinding) $r1;
        if (z) {
            KudiButton $r3 = $r2.nextButton;
            $r3.m38032f();
            return $r2;
        }
        KudiButton $r32 = $r2.nextButton;
        $r32.m38033e();
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void launchBottomSheet() {
        FragmentManager $r2 = getChildFragmentManager();
        PreferenceActivity $r3 = getViewLifecycleOwner();
        $r2.p1(WITHDRAW_AUTHORIZATION, $r3, new InterfaceC1523w() { // from class: ai.kudi.agent.savings.ui.NumberPicker.TwoDigitFormatter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void init(String str, Bundle bundle) {
                WithdrawSavingsFragment $r32 = WithdrawSavingsFragment.this;
                WithdrawSavingsFragment.m40558launchBottomSheet$lambda5($r32, str, bundle);
            }
        });
        PerformActionBottomSheet.Companion $r1 = PerformActionBottomSheet.Companion;
        int $i0 = C0456R.string.withdraw_dialog_title;
        int $i1 = C0456R.string.withdraw_dialog_body;
        InterfaceC8209a $r6 = requireBinding();
        KudiTextView $r8 = ((FragmentWithdrawSavingsBinding) $r6).amountEditText;
        CharSequence $r9 = $r8.getText();
        Log_OC.loadImage($r9, "requireBinding().amountEditText.text");
        String $r10 = StringExtKt.formatAmount($r9);
        Object[] $r5 = {$r10};
        String $r102 = getString($i1, $r5);
        PerformActionBottomSheet $r11 = $r1.newInstance($i0, $r102, WITHDRAW_AUTHORIZATION, "AUTHORIZED", true);
        FragmentManager $r22 = getChildFragmentManager();
        Chapter r13 = (Chapter) $r11;
        r13.show($r22, PERFORM_ACTION_TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: launchBottomSheet$lambda-5  reason: not valid java name */
    public static final void m40558launchBottomSheet$lambda5(WithdrawSavingsFragment withdrawSavingsFragment, String str, Bundle bundle) {
        Log_OC.getArray(withdrawSavingsFragment, "this$0");
        Log_OC.getArray(str, "requestKey");
        Log_OC.getArray(bundle, "result");
        boolean $z0 = Log_OC.append(str, WITHDRAW_AUTHORIZATION);
        if ($z0) {
            String $r2 = bundle.getString("AUTHORIZED");
            if ($r2 == null) {
                return;
            }
            WithdrawSavingsViewModel $r3 = withdrawSavingsFragment.getViewModel();
            $r3.getUserCategory();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void launchPinDialog() {
        FragmentManager $r1 = getChildFragmentManager();
        PreferenceActivity $r2 = getViewLifecycleOwner();
        $r1.p1(KudiPin.KUDI_PIN_AUTH_SUCCESS_KEY, $r2, new InterfaceC1523w() { // from class: ai.kudi.agent.savings.ui.a
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: b */
            public final void m38480b(String str, Bundle bundle) {
                WithdrawSavingsFragment $r3 = WithdrawSavingsFragment.this;
                WithdrawSavingsFragment.m40559launchPinDialog$lambda3($r3, str, bundle);
            }
        });
        KudiPin.Companion $r4 = KudiPin.Companion;
        int $i0 = C0456R.string.confirm_saving_pin_title;
        String $r5 = getString($i0);
        int $i02 = C0456R.string.enter_pin_to_complete_saving_transaction;
        String $r6 = getString($i02);
        KudiPin $r7 = $r4.newInstance($r5, $r6, true);
        FragmentManager $r12 = getChildFragmentManager();
        Chapter r9 = (Chapter) $r7;
        r9.show($r12, ".AuthDialog.Dialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: launchPinDialog$lambda-3  reason: not valid java name */
    public static final void m40559launchPinDialog$lambda3(WithdrawSavingsFragment withdrawSavingsFragment, String str, Bundle bundle) {
        Log_OC.getArray(withdrawSavingsFragment, "this$0");
        Log_OC.getArray(str, "requestKey");
        Log_OC.getArray(bundle, "result");
        boolean $z0 = Log_OC.append(str, KudiPin.KUDI_PIN_AUTH_SUCCESS_KEY);
        if ($z0) {
            String $r0 = bundle.getString(KudiPin.PASSWORD_KEY);
            String $r2 = $r0;
            InterfaceC8209a $r4 = withdrawSavingsFragment.requireBinding();
            FragmentWithdrawSavingsBinding $r5 = (FragmentWithdrawSavingsBinding) $r4;
            KudiTextView $r6 = $r5.amountEditText;
            CharSequence $r7 = $r6.getText();
            String $r9 = $r7.toString();
            int $i0 = Integer.parseInt(StringExtKt.getRemoveAllLetters($r9));
            if ($r0 == null) {
                $r2 = "";
            }
            WithdrawRequest $r8 = new WithdrawRequest($i0, $r2, withdrawSavingsFragment.savingsPlanId);
            WithdrawSavingsViewModel $r10 = withdrawSavingsFragment.getViewModel();
            $r10.withdrawSavings($r8);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final WithdrawSavingsFragment newInstance(int i, String str, SavingResponse savingResponse) {
        Companion $r2 = Companion;
        WithdrawSavingsFragment $r3 = $r2.newInstance(i, str, savingResponse);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setAmountSuggestionAdapter() {
        InterfaceC8209a $r1 = requireBinding();
        FragmentWithdrawSavingsBinding $r2 = (FragmentWithdrawSavingsBinding) $r1;
        AmountSuggestionAdapter $r3 = new AmountSuggestionAdapter();
        setAmountSuggestionAdapter($r3);
        RecyclerView $r4 = $r2.amountSuggestionRecyclerView;
        AmountSuggestionAdapter $r32 = getAmountSuggestionAdapter();
        $r4.setAdapter($r32);
        AmountSuggestionAdapter $r33 = getAmountSuggestionAdapter();
        WithdrawSavingsFragment$setAmountSuggestionAdapter$1$1 $r5 = new WithdrawSavingsFragment$setAmountSuggestionAdapter$1$1($r2, this);
        $r33.setOnClickListener($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setKeypadCallback() {
        InterfaceC8209a $r3 = requireBinding();
        final FragmentWithdrawSavingsBinding $r4 = (FragmentWithdrawSavingsBinding) $r3;
        PinpadView $r1 = $r4.keyboard;
        $r1.setViewProvider(new PinpadView.InterfaceC0836d() { // from class: ai.kudi.agent.savings.ui.WithdrawSavingsFragment$setKeypadCallback$1$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.dip.library.keypad.PinpadView.InterfaceC0836d
            public void onAppendChar(String $r12) {
                Log_OC.getArray($r12, "char");
                StringBuilder r12 = new StringBuilder();
                FragmentWithdrawSavingsBinding $r32 = FragmentWithdrawSavingsBinding.this;
                KudiTextView $r42 = $r32.amountEditText;
                CharSequence $r5 = $r42.getText();
                r12.append((Object) $r5);
                r12.append($r12);
                String $r6 = r12.toString();
                WithdrawSavingsFragment $r7 = this;
                double $d0 = $r7.currentWalletBalance;
                double $d02 = Math.min($d0, 5.0E7d);
                int $i0 = $r6.length();
                if ($i0 > 0) {
                    String $r8 = StringExtKt.getRemoveAllLetters($r6);
                    double $d1 = Double.parseDouble($r8);
                    if ($d1 > $d02) {
                        WithdrawSavingsFragment $r72 = this;
                        WithdrawSavingsViewModel $r9 = $r72.getViewModel();
                        WithdrawSavingsFragment $r73 = this;
                        int $i02 = C0456R.string.max_withdraw_error;
                        Object[] $r10 = {StringExtKt.getFormatAmount(StringExtKt.getRemoveAllLetters($r6))};
                        String $r13 = $r73.getString($i02, $r10);
                        Log_OC.loadImage($r13, "getString(\n                                R.string.max_withdraw_error,\n                                text.removeAllLetters.formatAmount\n                            )");
                        $r9.showAmountError($r13);
                        FragmentWithdrawSavingsBinding $r33 = FragmentWithdrawSavingsBinding.this;
                        TextView $r43 = $r33.currency;
                        WithdrawSavingsFragment $r74 = this;
                        Context $r11 = $r74.getContext();
                        Log_OC.append($r11);
                        int $i03 = C0456R.color.blackDatePickerTextColor;
                        TextView r13 = $r43;
                        r13.setTextColor(C1335a.m36324d($r11, $i03));
                    }
                }
                FragmentWithdrawSavingsBinding $r34 = FragmentWithdrawSavingsBinding.this;
                TextView $r44 = $r34.amountEditText;
                TextView r132 = $r44;
                r132.append($r12);
                FragmentWithdrawSavingsBinding $r35 = FragmentWithdrawSavingsBinding.this;
                View $r45 = $r35.errorMessage;
                Log_OC.loadImage($r45, "errorMessage");
                View r14 = $r45;
                ViewExtKt.hide$default(r14, false, 1, null);
                FragmentWithdrawSavingsBinding $r332 = FragmentWithdrawSavingsBinding.this;
                TextView $r432 = $r332.currency;
                WithdrawSavingsFragment $r742 = this;
                Context $r112 = $r742.getContext();
                Log_OC.append($r112);
                int $i032 = C0456R.color.blackDatePickerTextColor;
                TextView r133 = $r432;
                r133.setTextColor(C1335a.m36324d($r112, $i032));
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.dip.library.keypad.PinpadView.InterfaceC0836d
            public void onDeleteChar() {
                int $i0;
                FragmentWithdrawSavingsBinding $r12 = FragmentWithdrawSavingsBinding.this;
                TextView $r2 = $r12.amountEditText;
                CharSequence $r32 = $r2.getText();
                Log_OC.loadImage($r32, AttributeType.TEXT);
                int $i02 = $r32.length();
                boolean $z0 = $i02 > 0;
                if ($z0) {
                    CharSequence $r33 = $r2.getText();
                    Log_OC.loadImage($r33, AttributeType.TEXT);
                    CharSequence $r42 = $r2.getText();
                    Log_OC.loadImage($r42, AttributeType.TEXT);
                    $i0 = C13277t.m5410Q($r42);
                    CharSequence $r5 = $r33.subSequence(0, $i0).toString();
                    TextView r6 = $r2;
                    r6.setText($r5);
                }
            }

            public void onReset() {
            }

            public void setNumDigits(int i) {
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setUpView() {
        FragmentActivity $r1 = getActivity();
        if ($r1 == null) {
            NullPointerException r14 = new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            throw r14;
        }
        AppCompatActivity $r2 = (AppCompatActivity) $r1;
        AbstractC0925a $r3 = $r2.getSupportActionBar();
        if ($r3 != null) {
            int $i0 = C0456R.string.withdraw;
            String $r4 = getString($i0);
            $r3.mo37631C($r4);
        }
        InterfaceC8209a $r5 = requireBinding();
        final FragmentWithdrawSavingsBinding $r6 = (FragmentWithdrawSavingsBinding) $r5;
        TextView $r7 = $r6.textWalletBalance;
        int $i02 = C0456R.string.saving_wallet_balance;
        double $d0 = this.currentWalletBalance;
        Double $r9 = Double.valueOf($d0);
        String $r42 = StringExtKt.formatAmount($r9);
        Object[] $r8 = {$r42};
        CharSequence $r43 = getString($i02, $r8);
        TextView r15 = $r7;
        r15.setText($r43);
        ViewGroup $r10 = $r6.nextButton;
        ViewGroup r16 = $r10;
        r16.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.savings.ui.Switch
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FragmentWithdrawSavingsBinding $r22 = FragmentWithdrawSavingsBinding.this;
                WithdrawSavingsFragment $r32 = this;
                WithdrawSavingsFragment.m40560setUpView$lambda2$lambda1($r22, $r32, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpView$lambda-2$lambda-1  reason: not valid java name */
    public static final void m40560setUpView$lambda2$lambda1(FragmentWithdrawSavingsBinding fragmentWithdrawSavingsBinding, WithdrawSavingsFragment withdrawSavingsFragment, View view) {
        Log_OC.getArray(fragmentWithdrawSavingsBinding, "$this_apply");
        Log_OC.getArray(withdrawSavingsFragment, "this$0");
        KudiTextView $r3 = fragmentWithdrawSavingsBinding.amountEditText;
        CharSequence $r4 = $r3.getText();
        String $r5 = StringExtKt.getRemoveAllLetters($r4.toString());
        int $i0 = $r5.length();
        boolean $z0 = $i0 > 0;
        if (!$z0) {
            WithdrawSavingsViewModel $r7 = withdrawSavingsFragment.getViewModel();
            $r7.showAmountError("You have to fill in an amount");
            return;
        }
        Analytics $r6 = withdrawSavingsFragment.getAnalytics();
        $r6.onWithdrawAmountEntered($r5);
        withdrawSavingsFragment.launchBottomSheet();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        WithdrawSavingsViewData $r2 = (WithdrawSavingsViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(WithdrawSavingsViewData withdrawSavingsViewData) {
        Log_OC.getArray(withdrawSavingsViewData, "viewData");
        boolean $z0 = withdrawSavingsViewData instanceof WithdrawSavingsViewData.AmountError;
        if ($z0) {
            InterfaceC8209a $r2 = requireBinding();
            FragmentWithdrawSavingsBinding $r3 = (FragmentWithdrawSavingsBinding) $r2;
            TextView $r4 = $r3.errorMessage;
            WithdrawSavingsViewData.AmountError $r5 = (WithdrawSavingsViewData.AmountError) withdrawSavingsViewData;
            CharSequence $r6 = $r5.getMsg();
            TextView r15 = $r4;
            r15.setText($r6);
            KudiTextView $r42 = $r3.errorMessage;
            Log_OC.loadImage($r42, "errorMessage");
            ViewExtKt.show($r42);
            return;
        }
        boolean $z02 = withdrawSavingsViewData instanceof WithdrawSavingsViewData.Error;
        if ($z02) {
            FragmentActivity $r7 = requireActivity();
            Log_OC.loadImage($r7, "requireActivity()");
            int $i0 = C0456R.string.saving_error;
            ContextExtKt.toast$default($r7, $i0, 0, 2, (Object) null);
            InterfaceC8209a $r22 = requireBinding();
            FragmentWithdrawSavingsBinding $r32 = (FragmentWithdrawSavingsBinding) $r22;
            TextView $r43 = $r32.errorMessage;
            WithdrawSavingsViewData.Error $r8 = (WithdrawSavingsViewData.Error) withdrawSavingsViewData;
            CharSequence $r62 = $r8.getError();
            TextView r152 = $r43;
            r152.setText($r62);
            View $r44 = $r32.errorMessage;
            Log_OC.loadImage($r44, "errorMessage");
            View r16 = $r44;
            ViewExtKt.show(r16);
            return;
        }
        boolean $z03 = withdrawSavingsViewData instanceof WithdrawSavingsViewData.ShowProgress;
        if ($z03) {
            WithdrawSavingsViewData.ShowProgress $r9 = (WithdrawSavingsViewData.ShowProgress) withdrawSavingsViewData;
            boolean $z04 = $r9.getVisibility();
            hideOrDisplayLoader($z04);
            return;
        }
        boolean $z05 = withdrawSavingsViewData instanceof WithdrawSavingsViewData.Initial;
        if ($z05) {
            return;
        }
        boolean $z06 = withdrawSavingsViewData instanceof WithdrawSavingsViewData.Success;
        if ($z06) {
            WithdrawSavingsViewModel $r10 = getViewModel();
            $r10.showWithdrawSuccessDialog();
            return;
        }
        boolean $z07 = withdrawSavingsViewData instanceof WithdrawSavingsViewData.User;
        if ($z07) {
            WithdrawSavingsViewData.User $r11 = (WithdrawSavingsViewData.User) withdrawSavingsViewData;
            boolean $z08 = $r11.isExistingUser();
            if ($z08) {
                launchPinDialog();
                return;
            }
            WithdrawSavingsViewModel $r102 = getViewModel();
            InterfaceC8209a $r23 = requireBinding();
            KudiTextView $r45 = ((FragmentWithdrawSavingsBinding) $r23).amountEditText;
            CharSequence $r13 = $r45.getText();
            String $r63 = $r13.toString();
            int $i02 = Integer.parseInt(StringExtKt.getRemoveAllLetters($r63));
            String $r64 = this.savingsPlanId;
            WithdrawRequest r14 = new WithdrawRequest($i02, "", $r64);
            $r102.navigateToCreateSavingsPinFragment(r14);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        WithdrawSavingsViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public WithdrawSavingsViewModel createViewModel() {
        WithdrawSavingsViewModel $r1 = getViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AmountSuggestionAdapter getAmountSuggestionAdapter() {
        AmountSuggestionAdapter $r1 = this.amountSuggestionAdapter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("amountSuggestionAdapter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
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
        return WithdrawSavingsViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public final WithdrawSavingsViewModel getViewModel() {
        WithdrawSavingsViewModel $r1 = this.viewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("viewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        C7429a.m18752b(this);
        super.onAttach(context);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle $r1 = getArguments();
        if ($r1 == null) {
            return;
        }
        boolean $z0 = $r1.containsKey(BALANCE);
        if ($z0) {
            boolean $z02 = $r1.containsKey(PLAN_ID);
            if ($z02) {
                int $i0 = $r1.getInt(BALANCE);
                double $d0 = $i0;
                this.currentWalletBalance = $d0;
                String $r2 = $r1.getString(PLAN_ID);
                this.savingsPlanId = String.valueOf($r2);
                Parcelable $r3 = $r1.getParcelable("savings_detail");
                SavingResponse $r4 = (SavingResponse) $r3;
                this.savingsDetail = $r4;
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentWithdrawSavingsBinding $r4 = FragmentWithdrawSavingsBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        setUpView();
        amountWatcher();
        setKeypadCallback();
        setAmountSuggestionAdapter();
    }

    public final void setAmountSuggestionAdapter(AmountSuggestionAdapter amountSuggestionAdapter) {
        Log_OC.getArray(amountSuggestionAdapter, "<set-?>");
        this.amountSuggestionAdapter = amountSuggestionAdapter;
    }

    public final void setAnalytics(Analytics analytics) {
        Log_OC.getArray(analytics, "<set-?>");
        this.analytics = analytics;
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }

    public final void setViewModel(WithdrawSavingsViewModel withdrawSavingsViewModel) {
        Log_OC.getArray(withdrawSavingsViewModel, "<set-?>");
        this.viewModel = withdrawSavingsViewModel;
    }
}

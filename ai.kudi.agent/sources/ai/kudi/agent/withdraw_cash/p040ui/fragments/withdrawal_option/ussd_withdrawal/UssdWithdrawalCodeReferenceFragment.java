package ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.ussd_withdrawal;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.domain.room_entities.UssdWithdrawalProvider;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.RandomUtilKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.FragmentUssdWithdrawalCodeReferenceBinding;
import ai.kudi.agent.transactions.p032ui.TransactionDetailsActivity;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.withdraw_cash.domain.wiki.UssdWithdrawalWithdrawalCodeGenerationApiCommData;
import ai.kudi.agent.withdraw_cash.game.components.CashWithdrawalOptionComponent;
import ai.kudi.agent.withdraw_cash.p040ui.activities.CashWithdrawalOptionActivity;
import ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.ussd_withdrawal.NoVoucherWithdrawalPayload;
import ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.ussd_withdrawal.UssdWithdrawalCodeReferenceViewData;
import ai.kudi.agent.withdraw_cash.p040ui.viewmodels.withdrawal_option.ussd_withdrawal.UssdWithdrawalCodeReferenceViewModel;
import ai.kudi.dip.library.button.KudiButton;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.C11812w;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import kotlin.p549l0.C13277t;
import p201g.p270x.InterfaceC8209a;
/* compiled from: UssdWithdrawalCodeReferenceFragment.kt */
@Metadata(m10422d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 '2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001'B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003H\u0014J\b\u0010\u0010\u001a\u00020\u0002H\u0014J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u000eH\u0002J\u001a\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020&H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006("}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/ui/fragments/withdrawal_option/ussd_withdrawal/UssdWithdrawalCodeReferenceFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/withdraw_cash/ui/viewmodels/withdrawal_option/ussd_withdrawal/UssdWithdrawalCodeReferenceViewModel;", "Lai/kudi/agent/withdraw_cash/ui/viewdata/withdrawal_option/ussd_withdrawal/UssdWithdrawalCodeReferenceViewData;", "Lai/kudi/agent/databinding/FragmentUssdWithdrawalCodeReferenceBinding;", "()V", "cashWithdrawalActivity", "Lai/kudi/agent/withdraw_cash/ui/activities/CashWithdrawalOptionActivity;", "screenViewModel", "getScreenViewModel", "()Lai/kudi/agent/withdraw_cash/ui/viewmodels/withdrawal_option/ussd_withdrawal/UssdWithdrawalCodeReferenceViewModel;", "setScreenViewModel", "(Lai/kudi/agent/withdraw_cash/ui/viewmodels/withdrawal_option/ussd_withdrawal/UssdWithdrawalCodeReferenceViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onNavigationAction", "onViewCreated", "view", "openTransactionDetailScreenFor", "transactionReference", "", "toggleLoader", "showLoader", "", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.withdraw_cash.ui.fragments.withdrawal_option.ussd_withdrawal.UssdWithdrawalCodeReferenceFragment */
/* loaded from: classes.dex */
public final class UssdWithdrawalCodeReferenceFragment extends BaseMVVMViewBindingFragment<UssdWithdrawalCodeReferenceViewModel, UssdWithdrawalCodeReferenceViewData, FragmentUssdWithdrawalCodeReferenceBinding> {
    public static final Companion Companion;
    private static final String KEY_PAYLOAD = "key_payload";
    private CashWithdrawalOptionActivity cashWithdrawalActivity;
    public UssdWithdrawalCodeReferenceViewModel screenViewModel;

    /* compiled from: UssdWithdrawalCodeReferenceFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/ui/fragments/withdrawal_option/ussd_withdrawal/UssdWithdrawalCodeReferenceFragment$Companion;", "", "()V", "KEY_PAYLOAD", "", "newInstance", "Lai/kudi/agent/withdraw_cash/ui/fragments/withdrawal_option/ussd_withdrawal/UssdWithdrawalCodeReferenceFragment;", "payload", "Lai/kudi/agent/withdraw_cash/ui/viewdata/withdrawal_option/ussd_withdrawal/NoVoucherWithdrawalPayload;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.withdraw_cash.ui.fragments.withdrawal_option.ussd_withdrawal.UssdWithdrawalCodeReferenceFragment$Companion */
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
        public final UssdWithdrawalCodeReferenceFragment newInstance(NoVoucherWithdrawalPayload noVoucherWithdrawalPayload) {
            Log_OC.getArray(noVoucherWithdrawalPayload, "payload");
            UssdWithdrawalCodeReferenceFragment $r3 = new UssdWithdrawalCodeReferenceFragment();
            Bundle $r1 = new Bundle();
            $r1.putParcelable(UssdWithdrawalCodeReferenceFragment.KEY_PAYLOAD, noVoucherWithdrawalPayload);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onNavigationAction() {
        CashWithdrawalOptionActivity $r1 = this.cashWithdrawalActivity;
        if ($r1 != null) {
            Activity r3 = (Activity) $r1;
            r3.finish();
            return;
        }
        Log_OC.LogError("cashWithdrawalActivity");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-3$lambda-2$lambda-0  reason: not valid java name */
    public static final void m41814onViewCreated$lambda3$lambda2$lambda0(UssdWithdrawalCodeReferenceFragment ussdWithdrawalCodeReferenceFragment, C11812w c11812w, View view) {
        Log_OC.getArray(ussdWithdrawalCodeReferenceFragment, "this$0");
        Log_OC.getArray(c11812w, "$ussdCode");
        Context $r3 = ussdWithdrawalCodeReferenceFragment.requireContext();
        Log_OC.loadImage($r3, "requireContext()");
        Object $r4 = c11812w.f26499c;
        String $r5 = (String) $r4;
        RandomUtilKt.copyToClipboard($r3, $r5, "WITHDRAWAL_USSD_CODE", "USSD code copied");
        UssdWithdrawalCodeReferenceViewModel $r6 = ussdWithdrawalCodeReferenceFragment.getScreenViewModel();
        $r6.onUssdInfoCopied();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-3$lambda-2$lambda-1  reason: not valid java name */
    public static final void m41815onViewCreated$lambda3$lambda2$lambda1(UssdWithdrawalCodeReferenceFragment ussdWithdrawalCodeReferenceFragment, NoVoucherWithdrawalPayload noVoucherWithdrawalPayload, View view) {
        Log_OC.getArray(ussdWithdrawalCodeReferenceFragment, "this$0");
        Log_OC.getArray(noVoucherWithdrawalPayload, "$this_with");
        UssdWithdrawalWithdrawalCodeGenerationApiCommData.Response $r3 = noVoucherWithdrawalPayload.getResponse();
        Log_OC.append($r3);
        String $r4 = $r3.getTransactionReference();
        ussdWithdrawalCodeReferenceFragment.openTransactionDetailScreenFor($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void openTransactionDetailScreenFor(String str) {
        onNavigationAction();
        Context $r3 = getContext();
        Intent $r2 = new Intent($r3, TransactionDetailsActivity.class);
        $r2.putExtra("transaction_details_extra_reference", str);
        startActivity($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void toggleLoader(boolean z) {
        InterfaceC8209a $r1 = requireBinding();
        FragmentUssdWithdrawalCodeReferenceBinding $r2 = (FragmentUssdWithdrawalCodeReferenceBinding) $r1;
        if (z) {
            KudiButton $r3 = $r2.btnCheckStatus;
            $r3.m38032f();
            return;
        }
        KudiButton $r32 = $r2.btnCheckStatus;
        $r32.m38033e();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        UssdWithdrawalCodeReferenceViewData $r2 = (UssdWithdrawalCodeReferenceViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(UssdWithdrawalCodeReferenceViewData ussdWithdrawalCodeReferenceViewData) {
        Log_OC.getArray(ussdWithdrawalCodeReferenceViewData, "viewData");
        boolean $z0 = ussdWithdrawalCodeReferenceViewData.getShowLoader();
        toggleLoader($z0);
        String $r2 = ussdWithdrawalCodeReferenceViewData.getErrorMsg();
        if ($r2 != null) {
            FragmentActivity $r3 = requireActivity();
            Log_OC.loadImage($r3, "requireActivity()");
            ContextExtKt.toast($r3, $r2, 0);
        }
        String $r22 = ussdWithdrawalCodeReferenceViewData.getReference();
        if ($r22 == null) {
            return;
        }
        openTransactionDetailScreenFor($r22);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        UssdWithdrawalCodeReferenceViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public UssdWithdrawalCodeReferenceViewModel createViewModel() {
        UssdWithdrawalCodeReferenceViewModel $r1 = getScreenViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final UssdWithdrawalCodeReferenceViewModel getScreenViewModel() {
        UssdWithdrawalCodeReferenceViewModel $r1 = this.screenViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("screenViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return UssdWithdrawalCodeReferenceViewModel.class;
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
        FragmentUssdWithdrawalCodeReferenceBinding $r4 = FragmentUssdWithdrawalCodeReferenceBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(\n                inflater,\n                container,\n                false\n            )");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v11, types: [T, java.lang.String] */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        boolean $z0;
        boolean $z02;
        CharSequence $r12;
        ?? m5451A;
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        CashWithdrawalOptionActivity $r3 = this.cashWithdrawalActivity;
        if ($r3 == null) {
            Log_OC.LogError("cashWithdrawalActivity");
            NullPointerException r23 = new NullPointerException("Null throw statement replaced by Soot");
            throw r23;
        }
        UssdWithdrawalCodeReferenceFragment$onViewCreated$1 r24 = new UssdWithdrawalCodeReferenceFragment$onViewCreated$1(this);
        $r3.setNavigationIcon(C0001R.C0002drawable.ic_close_black, r24);
        CashWithdrawalOptionActivity $r32 = this.cashWithdrawalActivity;
        if ($r32 == null) {
            Log_OC.LogError("cashWithdrawalActivity");
            NullPointerException r232 = new NullPointerException("Null throw statement replaced by Soot");
            throw r232;
        }
        UssdWithdrawalCodeReferenceFragment$onViewCreated$2 r25 = new UssdWithdrawalCodeReferenceFragment$onViewCreated$2(this);
        $r32.setNavigationAction(r25);
        Bundle $r2 = requireArguments();
        Parcelable $r6 = $r2.getParcelable(KEY_PAYLOAD);
        Log_OC.append($r6);
        final NoVoucherWithdrawalPayload $r7 = (NoVoucherWithdrawalPayload) $r6;
        InterfaceC8209a $r8 = requireBinding();
        FragmentUssdWithdrawalCodeReferenceBinding fragmentUssdWithdrawalCodeReferenceBinding = (FragmentUssdWithdrawalCodeReferenceBinding) $r8;
        TextView $r10 = fragmentUssdWithdrawalCodeReferenceBinding.tvPrompt;
        UssdWithdrawalProvider $r11 = $r7.getProvider();
        String $r122 = $r11.getPrompt();
        $r10.setText($r122);
        TextView $r102 = fragmentUssdWithdrawalCodeReferenceBinding.tvServiceCharge;
        Context $r13 = requireContext();
        String $r123 = $r7.getServiceFee();
        Object[] $r14 = {StringExtKt.getFormatAmount($r123)};
        String $r124 = $r13.getString(C0001R.string.text_kudi_fee_x, $r14);
        $r102.setText($r124);
        final C11812w r26 = new C11812w();
        UssdWithdrawalProvider $r112 = $r7.getProvider();
        String $r125 = $r112.getUssdCode();
        $z0 = C13277t.m5421J($r125, "refcode", false, 2, null);
        if ($z0) {
            UssdWithdrawalProvider $r113 = $r7.getProvider();
            String $r126 = $r113.getUssdCode();
            UssdWithdrawalWithdrawalCodeGenerationApiCommData.Response $r16 = $r7.getResponse();
            Log_OC.append($r16);
            $r12 = C13276s.m5451A($r126, "refcode", $r16.getReference(), false, 4, null);
        } else {
            UssdWithdrawalProvider $r114 = $r7.getProvider();
            String $r127 = $r114.getUssdCode();
            $z02 = C13277t.m5421J($r127, TransactionField.AMOUNT, false, 2, null);
            if ($z02) {
                UssdWithdrawalProvider $r115 = $r7.getProvider();
                String $r128 = $r115.getUssdCode();
                UssdWithdrawalWithdrawalCodeGenerationApiCommData.Response $r162 = $r7.getResponse();
                Log_OC.append($r162);
                int $i0 = $r162.getAmount();
                $r12 = C13276s.m5451A($r128, TransactionField.AMOUNT, String.valueOf($i0), false, 4, null);
            } else {
                $r12 = "";
            }
        }
        r26.f26499c = $r12;
        TextView $r103 = fragmentUssdWithdrawalCodeReferenceBinding.tvUssdCode;
        CharSequence $r18 = $r12;
        $r103.setText($r18);
        Object $r19 = r26.f26499c;
        String $r129 = (String) $r19;
        String $r17 = Uri.encode("*");
        Log_OC.loadImage($r17, "encode(\"*\")");
        m5451A = C13276s.m5451A($r129, "*", $r17, false, 4, null);
        r26.f26499c = m5451A;
        TextView $r104 = fragmentUssdWithdrawalCodeReferenceBinding.btnCopyUssdCode;
        Log_OC.loadImage($r104, "btnCopyUssdCode");
        ViewExtKt.addClickEffect$default($r104, 0, 0, 3, null);
        TextView $r105 = fragmentUssdWithdrawalCodeReferenceBinding.btnCopyUssdCode;
        $r105.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.withdraw_cash.ui.fragments.withdrawal_option.ussd_withdrawal.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UssdWithdrawalCodeReferenceFragment $r22 = UssdWithdrawalCodeReferenceFragment.this;
                C11812w $r33 = r26;
                UssdWithdrawalCodeReferenceFragment.m41814onViewCreated$lambda3$lambda2$lambda0($r22, $r33, view2);
            }
        });
        ViewGroup $r21 = fragmentUssdWithdrawalCodeReferenceBinding.btnCheckStatus;
        ViewGroup r29 = $r21;
        r29.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.withdraw_cash.ui.fragments.withdrawal_option.ussd_withdrawal.Main
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UssdWithdrawalCodeReferenceFragment $r22 = UssdWithdrawalCodeReferenceFragment.this;
                NoVoucherWithdrawalPayload $r33 = $r7;
                UssdWithdrawalCodeReferenceFragment.m41815onViewCreated$lambda3$lambda2$lambda1($r22, $r33, view2);
            }
        });
    }

    public final void setScreenViewModel(UssdWithdrawalCodeReferenceViewModel ussdWithdrawalCodeReferenceViewModel) {
        Log_OC.getArray(ussdWithdrawalCodeReferenceViewModel, "<set-?>");
        this.screenViewModel = ussdWithdrawalCodeReferenceViewModel;
    }
}

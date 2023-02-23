package ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.ussd_withdrawal;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.common_screens.success_screen.fragment.SuccessScreenDialogFragment;
import ai.kudi.agent.common_screens.success_screen.labs.SuccessScreenCustomOption;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.databinding.FragmentUssdWithdrawalVoucherSummaryBinding;
import ai.kudi.agent.withdraw_cash.domain.model.UssdWithdrawalVoucherModel;
import ai.kudi.agent.withdraw_cash.domain.wiki.CardlessWithdrawalApiCommData;
import ai.kudi.agent.withdraw_cash.game.components.CashWithdrawalOptionComponent;
import ai.kudi.agent.withdraw_cash.p040ui.activities.CashWithdrawalOptionActivity;
import ai.kudi.agent.withdraw_cash.p040ui.adapters.OnVoucherSummaryItemClick;
import ai.kudi.agent.withdraw_cash.p040ui.adapters.VoucherSummaryAdapter;
import ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.ussd_withdrawal.UssdWithdrawalVoucherSummaryViewData;
import ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.ussd_withdrawal.VoucherData;
import ai.kudi.agent.withdraw_cash.p040ui.viewmodels.withdrawal_option.ussd_withdrawal.UssdWithdrawalVoucherSummaryViewModel;
import ai.kudi.dip.library.button.KudiButton;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p201g.p270x.InterfaceC8209a;
/* compiled from: UssdWithdrawalVoucherSummaryFragment.kt */
@Metadata(m10422d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 *2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001*B\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0014J\b\u0010\u0013\u001a\u00020\u0002H\u0014J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010&\u001a\u00020\u0011H\u0002J\u0010\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020)H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/ui/fragments/withdrawal_option/ussd_withdrawal/UssdWithdrawalVoucherSummaryFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/withdraw_cash/ui/viewmodels/withdrawal_option/ussd_withdrawal/UssdWithdrawalVoucherSummaryViewModel;", "Lai/kudi/agent/withdraw_cash/ui/viewdata/withdrawal_option/ussd_withdrawal/UssdWithdrawalVoucherSummaryViewData;", "Lai/kudi/agent/databinding/FragmentUssdWithdrawalVoucherSummaryBinding;", "Lai/kudi/agent/withdraw_cash/ui/adapters/OnVoucherSummaryItemClick;", "()V", "cashWithdrawalActivity", "Lai/kudi/agent/withdraw_cash/ui/activities/CashWithdrawalOptionActivity;", "screenViewModel", "getScreenViewModel", "()Lai/kudi/agent/withdraw_cash/ui/viewmodels/withdrawal_option/ussd_withdrawal/UssdWithdrawalVoucherSummaryViewModel;", "setScreenViewModel", "(Lai/kudi/agent/withdraw_cash/ui/viewmodels/withdrawal_option/ussd_withdrawal/UssdWithdrawalVoucherSummaryViewModel;)V", "voucherData", "Lai/kudi/agent/withdraw_cash/ui/viewdata/withdrawal_option/ussd_withdrawal/VoucherData;", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onClick", "item", "Lai/kudi/agent/withdraw_cash/domain/model/UssdWithdrawalVoucherModel;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "openSuccessDialog", "toggleBtn", "showLoader", "", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.withdraw_cash.ui.fragments.withdrawal_option.ussd_withdrawal.UssdWithdrawalVoucherSummaryFragment */
/* loaded from: classes.dex */
public final class UssdWithdrawalVoucherSummaryFragment extends BaseMVVMViewBindingFragment<UssdWithdrawalVoucherSummaryViewModel, UssdWithdrawalVoucherSummaryViewData, FragmentUssdWithdrawalVoucherSummaryBinding> implements OnVoucherSummaryItemClick {
    public static final Companion Companion;
    public static final String KEY_WITHDRAWAL_VOUCHER_DATA = "key_withdrawal_voucher_data";
    private CashWithdrawalOptionActivity cashWithdrawalActivity;
    public UssdWithdrawalVoucherSummaryViewModel screenViewModel;
    private VoucherData voucherData;

    /* compiled from: UssdWithdrawalVoucherSummaryFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/ui/fragments/withdrawal_option/ussd_withdrawal/UssdWithdrawalVoucherSummaryFragment$Companion;", "", "()V", "KEY_WITHDRAWAL_VOUCHER_DATA", "", "newInstance", "Lai/kudi/agent/withdraw_cash/ui/fragments/withdrawal_option/ussd_withdrawal/UssdWithdrawalVoucherSummaryFragment;", "voucherData", "Lai/kudi/agent/withdraw_cash/ui/viewdata/withdrawal_option/ussd_withdrawal/VoucherData;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.withdraw_cash.ui.fragments.withdrawal_option.ussd_withdrawal.UssdWithdrawalVoucherSummaryFragment$Companion */
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
        public final UssdWithdrawalVoucherSummaryFragment newInstance(VoucherData voucherData) {
            Log_OC.getArray(voucherData, "voucherData");
            UssdWithdrawalVoucherSummaryFragment $r3 = new UssdWithdrawalVoucherSummaryFragment();
            Bundle $r1 = new Bundle();
            $r1.putParcelable(UssdWithdrawalVoucherSummaryFragment.KEY_WITHDRAWAL_VOUCHER_DATA, voucherData);
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
    /* renamed from: onViewCreated$lambda-2$lambda-1  reason: not valid java name */
    public static final void m41821onViewCreated$lambda2$lambda1(UssdWithdrawalVoucherSummaryFragment ussdWithdrawalVoucherSummaryFragment, View view) {
        CardlessWithdrawalApiCommData.Request $r3;
        Log_OC.getArray(ussdWithdrawalVoucherSummaryFragment, "this$0");
        VoucherData $r2 = ussdWithdrawalVoucherSummaryFragment.voucherData;
        if ($r2 == null || ($r3 = $r2.getRequest()) == null) {
            return;
        }
        UssdWithdrawalVoucherSummaryViewModel $r4 = ussdWithdrawalVoucherSummaryFragment.getScreenViewModel();
        $r4.doWithdrawal($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void openSuccessDialog() {
        CashWithdrawalOptionActivity $r1 = this.cashWithdrawalActivity;
        if ($r1 == null) {
            Log_OC.LogError("cashWithdrawalActivity");
            NullPointerException r9 = new NullPointerException("Null throw statement replaced by Soot");
            throw r9;
        }
        $r1.toggleToolbarVisibility(false);
        CashWithdrawalOptionActivity $r12 = this.cashWithdrawalActivity;
        if ($r12 == null) {
            Log_OC.LogError("cashWithdrawalActivity");
            NullPointerException r92 = new NullPointerException("Null throw statement replaced by Soot");
            throw r92;
        }
        SuccessScreenDialogFragment.Companion $r2 = SuccessScreenDialogFragment.Companion;
        Context $r3 = requireContext();
        String $r4 = $r3.getString(C0001R.string.text_transaction_successful);
        Context $r32 = requireContext();
        String $r5 = $r32.getString(C0001R.string.text_close);
        Log_OC.loadImage($r4, "getString(R.string.text_transaction_successful)");
        Log_OC.loadImage($r5, "getString(R.string.text_close)");
        SuccessScreenCustomOption r10 = new SuccessScreenCustomOption($r4, "", $r5, false, false, false, 0, 0, C0001R.color.kudiButtonDrawableColor, 0, C0001R.C0002drawable.ic_wallet_decor, 0, false, 6904, null);
        UssdWithdrawalVoucherSummaryFragment$openSuccessDialog$1 r11 = new UssdWithdrawalVoucherSummaryFragment$openSuccessDialog$1(this);
        SuccessScreenDialogFragment $r8 = $r2.newInstance(r10, r11);
        AppCompatActivity r12 = (AppCompatActivity) $r12;
        AppCompatActivityExtKt.startFragment$default(r12, $r8, C0001R.C0003id.contentFrameLayout, false, false, false, 12, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void toggleBtn(boolean z) {
        InterfaceC8209a $r1 = requireBinding();
        FragmentUssdWithdrawalVoucherSummaryBinding $r2 = (FragmentUssdWithdrawalVoucherSummaryBinding) $r1;
        if (z) {
            KudiButton $r3 = $r2.btnWithdrawal;
            $r3.m38032f();
        } else {
            KudiButton $r32 = $r2.btnWithdrawal;
            $r32.m38033e();
        }
        ViewGroup $r33 = $r2.btnWithdrawal;
        boolean $z0 = !z;
        ViewGroup r4 = $r33;
        r4.setEnabled($z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        UssdWithdrawalVoucherSummaryViewData $r2 = (UssdWithdrawalVoucherSummaryViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void applyViewData(ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.ussd_withdrawal.UssdWithdrawalVoucherSummaryViewData r6) {
        /*
            r5 = this;
            java.lang.String r0 = "viewData"
            kotlin.p483e0.p485d.Log_OC.getArray(r6, r0)
            boolean r1 = r6.getShowLoader()
            r5.toggleBtn(r1)
            boolean r1 = r6.isTxnDone()
            if (r1 == 0) goto L15
            r5.openSuccessDialog()
        L15:
            java.lang.String r2 = r6.getToastMsg()
            if (r2 == 0) goto L24
            boolean r1 = kotlin.p549l0.C13265j.m5470u(r2)
            if (r1 == 0) goto L22
            goto L24
        L22:
            r1 = 0
            goto L25
        L24:
            r1 = 1
        L25:
            if (r1 != 0) goto L38
            androidx.fragment.app.FragmentActivity r3 = r5.requireActivity()
            java.lang.String r0 = "requireActivity()"
            kotlin.p483e0.p485d.Log_OC.loadImage(r3, r0)
            java.lang.String r2 = r6.getToastMsg()
            r4 = 0
            ai.kudi.agent.core.util.ContextExtKt.toast(r3, r2, r4)
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.ussd_withdrawal.UssdWithdrawalVoucherSummaryFragment.applyViewData(ai.kudi.agent.withdraw_cash.ui.viewdata.withdrawal_option.ussd_withdrawal.UssdWithdrawalVoucherSummaryViewData):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        UssdWithdrawalVoucherSummaryViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public UssdWithdrawalVoucherSummaryViewModel createViewModel() {
        UssdWithdrawalVoucherSummaryViewModel $r1 = getScreenViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final UssdWithdrawalVoucherSummaryViewModel getScreenViewModel() {
        UssdWithdrawalVoucherSummaryViewModel $r1 = this.screenViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("screenViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return UssdWithdrawalVoucherSummaryViewModel.class;
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

    @Override // ai.kudi.agent.withdraw_cash.p040ui.adapters.OnVoucherSummaryItemClick
    public void onClick(UssdWithdrawalVoucherModel ussdWithdrawalVoucherModel) {
        Log_OC.getArray(ussdWithdrawalVoucherModel, "item");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentUssdWithdrawalVoucherSummaryBinding $r4 = FragmentUssdWithdrawalVoucherSummaryBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(\n                inflater,\n                container,\n                false\n            )");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String $r16;
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        Bundle $r2 = requireArguments();
        Parcelable $r3 = $r2.getParcelable(KEY_WITHDRAWAL_VOUCHER_DATA);
        this.voucherData = (VoucherData) $r3;
        InterfaceC8209a $r5 = requireBinding();
        FragmentUssdWithdrawalVoucherSummaryBinding $r6 = (FragmentUssdWithdrawalVoucherSummaryBinding) $r5;
        RecyclerView $r7 = $r6.rvVoucher;
        $r7.setHasFixedSize(true);
        VoucherSummaryAdapter r18 = new VoucherSummaryAdapter(this);
        RecyclerView $r72 = $r6.rvVoucher;
        $r72.setAdapter(r18);
        VoucherData $r4 = this.voucherData;
        String $r9 = null;
        Object $r10 = $r4 == null ? null : $r4.getVoucherItem();
        if ($r10 == null) {
            $r10 = C13726r.m3891e();
        }
        List $r12 = (List) $r10;
        r18.swapVoucherItem($r12);
        KudiButton $r13 = $r6.btnWithdrawal;
        Context $r14 = requireContext();
        Object[] $r15 = new Object[1];
        VoucherData $r42 = this.voucherData;
        if ($r42 != null && ($r16 = $r42.getAmount()) != null) {
            $r9 = StringExtKt.getFormatAmount($r16);
        }
        $r15[0] = $r9;
        String $r92 = $r14.getString(C0001R.string.text_withdraw_x, $r15);
        Log_OC.loadImage($r92, "requireContext().getString(\n                    R.string.text_withdraw_x,\n                    voucherData?.amount?.formatAmount\n                )");
        $r13.setText($r92);
        ViewGroup $r132 = $r6.btnWithdrawal;
        ViewGroup r20 = $r132;
        r20.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.withdraw_cash.ui.fragments.withdrawal_option.ussd_withdrawal.FileSelectionFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UssdWithdrawalVoucherSummaryFragment $r22 = UssdWithdrawalVoucherSummaryFragment.this;
                UssdWithdrawalVoucherSummaryFragment.m41821onViewCreated$lambda2$lambda1($r22, view2);
            }
        });
    }

    public final void setScreenViewModel(UssdWithdrawalVoucherSummaryViewModel ussdWithdrawalVoucherSummaryViewModel) {
        Log_OC.getArray(ussdWithdrawalVoucherSummaryViewModel, "<set-?>");
        this.screenViewModel = ussdWithdrawalVoucherSummaryViewModel;
    }
}

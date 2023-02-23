package ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.ussd_withdrawal;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.common_screens.amount_input.p003ui.fragments.BaseAmountInputFragment;
import ai.kudi.agent.common_screens.amount_input.p003ui.viewmodels.BaseAmountInputViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.withdraw_cash.game.components.CashWithdrawalOptionComponent;
import ai.kudi.agent.withdraw_cash.p040ui.activities.CashWithdrawalOptionActivity;
import ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.ussd_withdrawal.UssdWithdrawalCodeReferenceFragment;
import ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.ussd_withdrawal.NoVoucherWithdrawalPayload;
import ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.ussd_withdrawal.UssdWithdrawalAmountInputViewData;
import ai.kudi.agent.withdraw_cash.p040ui.viewmodels.withdrawal_option.ussd_withdrawal.UssdWithdrawalAmountInputViewModel;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: UssdWithdrawalAmountInputFragment.kt */
@Metadata(m10422d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0014J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u001a\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/ui/fragments/withdrawal_option/ussd_withdrawal/UssdWithdrawalAmountInputFragment;", "Lai/kudi/agent/common_screens/amount_input/ui/fragments/BaseAmountInputFragment;", "Lai/kudi/agent/withdraw_cash/ui/viewmodels/withdrawal_option/ussd_withdrawal/UssdWithdrawalAmountInputViewModel;", "Lai/kudi/agent/withdraw_cash/ui/viewdata/withdrawal_option/ussd_withdrawal/UssdWithdrawalAmountInputViewData;", "()V", "cashWithdrawalActivity", "Lai/kudi/agent/withdraw_cash/ui/activities/CashWithdrawalOptionActivity;", "applyViewData", "", "viewData", "getMaximumAmount", "", "getMinimumAmount", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onNextBtnClick", TransactionField.AMOUNT, "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "openCardWithdrawalScreen", "payload", "Lai/kudi/agent/withdraw_cash/ui/viewdata/withdrawal_option/ussd_withdrawal/NoVoucherWithdrawalPayload;", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.withdraw_cash.ui.fragments.withdrawal_option.ussd_withdrawal.UssdWithdrawalAmountInputFragment */
/* loaded from: classes.dex */
public final class UssdWithdrawalAmountInputFragment extends BaseAmountInputFragment<UssdWithdrawalAmountInputViewModel, UssdWithdrawalAmountInputViewData> {
    public static final Companion Companion;
    private static final String KEY_WITHDRAWAL_PAYLOAD = "key_withdrawal_payload";
    private CashWithdrawalOptionActivity cashWithdrawalActivity;

    /* compiled from: UssdWithdrawalAmountInputFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/ui/fragments/withdrawal_option/ussd_withdrawal/UssdWithdrawalAmountInputFragment$Companion;", "", "()V", "KEY_WITHDRAWAL_PAYLOAD", "", "newInstance", "Lai/kudi/agent/withdraw_cash/ui/fragments/withdrawal_option/ussd_withdrawal/UssdWithdrawalAmountInputFragment;", "payload", "Lai/kudi/agent/withdraw_cash/ui/viewdata/withdrawal_option/ussd_withdrawal/NoVoucherWithdrawalPayload;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.withdraw_cash.ui.fragments.withdrawal_option.ussd_withdrawal.UssdWithdrawalAmountInputFragment$Companion */
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
        public final UssdWithdrawalAmountInputFragment newInstance(NoVoucherWithdrawalPayload noVoucherWithdrawalPayload) {
            Log_OC.getArray(noVoucherWithdrawalPayload, "payload");
            UssdWithdrawalAmountInputFragment $r3 = new UssdWithdrawalAmountInputFragment();
            Bundle $r1 = new Bundle();
            $r1.putParcelable(UssdWithdrawalAmountInputFragment.KEY_WITHDRAWAL_PAYLOAD, noVoucherWithdrawalPayload);
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

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void openCardWithdrawalScreen(NoVoucherWithdrawalPayload noVoucherWithdrawalPayload) {
        UssdWithdrawalCodeReferenceFragment.Companion $r1 = UssdWithdrawalCodeReferenceFragment.Companion;
        UssdWithdrawalCodeReferenceFragment $r3 = $r1.newInstance(noVoucherWithdrawalPayload);
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
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        UssdWithdrawalAmountInputViewData $r2 = (UssdWithdrawalAmountInputViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void applyViewData(ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.ussd_withdrawal.UssdWithdrawalAmountInputViewData r6) {
        /*
            r5 = this;
            java.lang.String r0 = "viewData"
            kotlin.p483e0.p485d.Log_OC.getArray(r6, r0)
            java.lang.String r1 = r6.getToastMsg()
            if (r1 == 0) goto L14
            int r2 = r1.length()
            if (r2 != 0) goto L12
            goto L14
        L12:
            r3 = 0
            goto L15
        L14:
            r3 = 1
        L15:
            if (r3 != 0) goto L1e
            java.lang.String r1 = r6.getToastMsg()
            r5.toast(r1)
        L1e:
            ai.kudi.agent.withdraw_cash.ui.viewdata.withdrawal_option.ussd_withdrawal.NoVoucherWithdrawalPayload r4 = r6.getPayload()
            if (r4 == 0) goto L2b
            ai.kudi.agent.withdraw_cash.ui.viewdata.withdrawal_option.ussd_withdrawal.NoVoucherWithdrawalPayload r4 = r6.getPayload()
            r5.openCardWithdrawalScreen(r4)
        L2b:
            boolean r3 = r6.getShowLoader()
            r5.toggleLoader(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.ussd_withdrawal.UssdWithdrawalAmountInputFragment.applyViewData(ai.kudi.agent.withdraw_cash.ui.viewdata.withdrawal_option.ussd_withdrawal.UssdWithdrawalAmountInputViewData):void");
    }

    @Override // ai.kudi.agent.common_screens.amount_input.p003ui.fragments.BaseAmountInputFragment
    public int getMaximumAmount() {
        return 50000;
    }

    @Override // ai.kudi.agent.common_screens.amount_input.p003ui.fragments.BaseAmountInputFragment
    public int getMinimumAmount() {
        return 500;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return UssdWithdrawalAmountInputViewModel.class;
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
    @Override // ai.kudi.agent.common_screens.amount_input.p003ui.fragments.BaseAmountInputFragment
    public void onNextBtnClick(int i) {
        BaseAmountInputViewModel $r1 = getScreenViewModel();
        UssdWithdrawalAmountInputViewModel $r2 = (UssdWithdrawalAmountInputViewModel) $r1;
        $r2.onNextButtonClicked(i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.common_screens.amount_input.p003ui.fragments.BaseAmountInputFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        NoVoucherWithdrawalPayload $r3;
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        Bundle $r2 = getArguments();
        if ($r2 == null) {
            $r3 = null;
        } else {
            Parcelable $r4 = $r2.getParcelable(KEY_WITHDRAWAL_PAYLOAD);
            $r3 = (NoVoucherWithdrawalPayload) $r4;
        }
        if ($r3 != null) {
            BaseAmountInputViewModel $r6 = getScreenViewModel();
            UssdWithdrawalAmountInputViewModel $r7 = (UssdWithdrawalAmountInputViewModel) $r6;
            $r7.setPayload($r3);
            return;
        }
        CashWithdrawalOptionActivity $r5 = this.cashWithdrawalActivity;
        if ($r5 != null) {
            AppCompatActivity r9 = (AppCompatActivity) $r5;
            AppCompatActivityExtKt.closeFragment(r9);
            return;
        }
        Log_OC.LogError("cashWithdrawalActivity");
        NullPointerException r8 = new NullPointerException("Null throw statement replaced by Soot");
        throw r8;
    }
}

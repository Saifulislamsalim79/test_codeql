package ai.kudi.agent.withdrawal.p041ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.bills.adapters.PaymentVendorAdapter;
import ai.kudi.agent.bills.p002ui.PerformPaymentActivity;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.custom.views.SelectView;
import ai.kudi.agent.databinding.FragmentOthersWithdrawalBinding;
import ai.kudi.agent.databinding.IncludeAddServiceFeeCheckBinding;
import ai.kudi.agent.databinding.IncludeCardMethodsBinding;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.withdraw_cash.game.components.CashWithdrawalOptionComponent;
import ai.kudi.agent.withdraw_cash.p040ui.activities.CashWithdrawalOptionActivity;
import ai.kudi.agent.withdrawal.domain.wiki.WithdrawalRequest;
import ai.kudi.agent.withdrawal.presenter.OthersWithdrawalPresenter;
import ai.kudi.agent.withdrawal.view.OthersWithdrawView;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.C13218k;
import kotlin.C13287o;
import kotlin.InterfaceC11824h;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.AbstractC9412c;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
/* compiled from: OthersWithdrawalFragment.kt */
@Metadata(m10422d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 72\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004:\u00017B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001bH\u0096\u0001J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0012\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#H\u0016J$\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010)\u001a\u00020\u001dH\u0002J\u0010\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020,H\u0016J\t\u0010-\u001a\u00020\u0005H\u0096\u0001J\u0010\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\u0017H\u0016J\u0010\u00100\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\u0017H\u0016J\u0010\u00101\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\u0017H\u0016J\u0010\u00102\u001a\u00020\u001d2\u0006\u00103\u001a\u00020\u0017H\u0016J\u0010\u00104\u001a\u00020\u001d2\u0006\u00105\u001a\u000206H\u0016R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u00068"}, m10421d2 = {"Lai/kudi/agent/withdrawal/ui/OthersWithdrawalFragment;", "Lcom/hannesdorfmann/mosby3/mvp/MvpFragment;", "Lai/kudi/agent/withdrawal/view/OthersWithdrawView;", "Lai/kudi/agent/withdrawal/presenter/OthersWithdrawalPresenter;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/FragmentOthersWithdrawalBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/databinding/FragmentOthersWithdrawalBinding;", "paymentVendorAdapter", "Lai/kudi/agent/bills/adapters/PaymentVendorAdapter;", "getPaymentVendorAdapter", "()Lai/kudi/agent/bills/adapters/PaymentVendorAdapter;", "paymentVendorAdapter$delegate", "Lkotlin/Lazy;", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/withdrawal/presenter/OthersWithdrawalPresenter;", "setThisPresenter", "(Lai/kudi/agent/withdrawal/presenter/OthersWithdrawalPresenter;)V", "createPresenter", "getPaymentVendor", "", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "loadPaymentVendors", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onPerformWithdrawalClicked", "openPerformWithdrawal", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/withdrawal/domain/dto/WithdrawalRequest;", "requireBinding", "showFeeLoadingFailed", MetricTracker.Object.MESSAGE, "showInvalidAmount", "showInvalidPhoneNumber", "showServiceFee", "fee", "toggleServiceFeeLoading", "visible", "", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.withdrawal.ui.OthersWithdrawalFragment */
/* loaded from: classes.dex */
public final class OthersWithdrawalFragment extends AbstractC9412c<OthersWithdrawView, OthersWithdrawalPresenter> implements OthersWithdrawView, BaseViewBinder<FragmentOthersWithdrawalBinding> {
    public static final Companion Companion;
    private final /* synthetic */ BaseViewBinderImpl<FragmentOthersWithdrawalBinding> $$delegate_0;
    private final InterfaceC11824h paymentVendorAdapter$delegate;
    public OthersWithdrawalPresenter thisPresenter;

    /* compiled from: OthersWithdrawalFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/withdrawal/ui/OthersWithdrawalFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/withdrawal/ui/OthersWithdrawalFragment;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.withdrawal.ui.OthersWithdrawalFragment$Companion */
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
        public final OthersWithdrawalFragment newInstance() {
            OthersWithdrawalFragment $r1 = new OthersWithdrawalFragment();
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
    public OthersWithdrawalFragment() {
        InterfaceC11824h $r1;
        BaseViewBinderImpl $r2 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r2;
        OthersWithdrawalFragment$paymentVendorAdapter$2 $r3 = new OthersWithdrawalFragment$paymentVendorAdapter$2(this);
        $r1 = C13218k.m5625b($r3);
        this.paymentVendorAdapter$delegate = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final String getPaymentVendor() {
        FragmentOthersWithdrawalBinding $r1 = requireBinding();
        IncludeCardMethodsBinding $r2 = $r1.includeCardMethods;
        SelectView $r3 = $r2.paymentMethodSelectView;
        Object $r4 = $r3.getSelectedItem();
        C13287o $r5 = (C13287o) $r4;
        Object $r42 = $r5.m5364c();
        String $r6 = (String) $r42;
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final PaymentVendorAdapter getPaymentVendorAdapter() {
        InterfaceC11824h $r2 = this.paymentVendorAdapter$delegate;
        Object $r1 = $r2.getValue();
        PaymentVendorAdapter $r3 = (PaymentVendorAdapter) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void loadPaymentVendors() {
        FragmentOthersWithdrawalBinding $r1 = requireBinding();
        IncludeCardMethodsBinding $r2 = $r1.includeCardMethods;
        SelectView $r3 = $r2.paymentMethodSelectView;
        PaymentVendorAdapter $r4 = getPaymentVendorAdapter();
        $r3.setAdapter($r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onActivityCreated$lambda-0  reason: not valid java name */
    public static final void m41875onActivityCreated$lambda0(OthersWithdrawalFragment othersWithdrawalFragment, View view) {
        Log_OC.getArray(othersWithdrawalFragment, "this$0");
        othersWithdrawalFragment.onPerformWithdrawalClicked();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onPerformWithdrawalClicked() {
        FragmentOthersWithdrawalBinding $r1 = requireBinding();
        EditText $r2 = $r1.phoneNumberEditText;
        $r2.setError(null);
        EditText $r22 = $r1.amountEditText;
        $r22.setError(null);
        EditText $r23 = $r1.phoneNumberEditText;
        Editable $r3 = $r23.getText();
        String $r4 = $r3.toString();
        EditText $r24 = $r1.amountEditText;
        Editable $r32 = $r24.getText();
        String $r5 = $r32.toString();
        IncludeAddServiceFeeCheckBinding $r6 = $r1.includeAddServiceFeeCheck;
        CheckBox $r7 = $r6.serviceFeeCheckBox;
        boolean $z0 = $r7.isChecked();
        String $r8 = getPaymentVendor();
        InterfaceC9413d $r9 = getPresenter();
        OthersWithdrawalPresenter $r10 = (OthersWithdrawalPresenter) $r9;
        $r10.performWithdrawal($r4, $r5, $r8, $z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public OthersWithdrawalPresenter createPresenter() {
        OthersWithdrawalPresenter $r1 = getThisPresenter();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public /* bridge */ /* synthetic */ InterfaceC9413d createPresenter() {
        InterfaceC9413d $r1 = createPresenter();
        InterfaceC9413d r2 = $r1;
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentOthersWithdrawalBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentOthersWithdrawalBinding $r3 = (FragmentOthersWithdrawalBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentOthersWithdrawalBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OthersWithdrawalPresenter getThisPresenter() {
        OthersWithdrawalPresenter $r1 = this.thisPresenter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("thisPresenter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentOthersWithdrawalBinding fragmentOthersWithdrawalBinding, Fragment fragment) {
        Log_OC.getArray(fragmentOthersWithdrawalBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentOthersWithdrawalBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentOthersWithdrawalBinding $r4 = (FragmentOthersWithdrawalBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        loadPaymentVendors();
        FragmentOthersWithdrawalBinding $r2 = requireBinding();
        Button $r4 = $r2.performWithdrawalButton;
        $r4.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.withdrawal.ui.CountdownFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OthersWithdrawalFragment $r22 = OthersWithdrawalFragment.this;
                OthersWithdrawalFragment.m41875onActivityCreated$lambda0($r22, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        OthersWithdrawalFragment r7 = this;
        super.onAttach(context);
        OthersWithdrawalFragment r72 = this;
        FragmentActivity $r2 = r72.getActivity();
        if ($r2 == null) {
            NullPointerException r6 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.withdraw_cash.ui.activities.CashWithdrawalOptionActivity");
            throw r6;
        }
        CashWithdrawalOptionActivity $r3 = (CashWithdrawalOptionActivity) $r2;
        CashWithdrawalOptionComponent $r4 = $r3.getCashWithdrawalOptionComponent();
        $r4.inject(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentOthersWithdrawalBinding $r4 = FragmentOthersWithdrawalBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        OthersWithdrawalFragment r6 = this;
        View $r5 = initBinding($r4, (Fragment) r6);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.withdrawal.view.OthersWithdrawView
    public void openPerformWithdrawal(WithdrawalRequest withdrawalRequest) {
        Log_OC.getArray(withdrawalRequest, TransactionRequest.TYPE_REQUEST);
        OthersWithdrawalFragment r5 = this;
        FragmentActivity $r2 = r5.requireActivity();
        Intent r4 = new Intent($r2, PerformPaymentActivity.class);
        r4.putExtra(WithdrawalRequest.PARCEL_NAME, withdrawalRequest);
        OthersWithdrawalFragment r52 = this;
        r52.startActivity(r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentOthersWithdrawalBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentOthersWithdrawalBinding $r3 = (FragmentOthersWithdrawalBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentOthersWithdrawalBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setThisPresenter(OthersWithdrawalPresenter othersWithdrawalPresenter) {
        Log_OC.getArray(othersWithdrawalPresenter, "<set-?>");
        this.thisPresenter = othersWithdrawalPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.withdrawal.view.OthersWithdrawView
    public void showFeeLoadingFailed(String str) {
        Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
        OthersWithdrawalFragment r3 = this;
        FragmentActivity $r2 = r3.getActivity();
        if ($r2 == null) {
            return;
        }
        ContextExtKt.toast$default($r2, str, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.withdrawal.view.OthersWithdrawView
    public void showInvalidAmount(String str) {
        Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
        FragmentOthersWithdrawalBinding $r2 = requireBinding();
        EditText $r3 = $r2.amountEditText;
        $r3.setError(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.withdrawal.view.OthersWithdrawView
    public void showInvalidPhoneNumber(String str) {
        Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
        FragmentOthersWithdrawalBinding $r2 = requireBinding();
        EditText $r3 = $r2.phoneNumberEditText;
        $r3.setError(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.withdrawal.view.OthersWithdrawView
    public void showServiceFee(String str) {
        Log_OC.getArray(str, "fee");
        FragmentOthersWithdrawalBinding $r2 = requireBinding();
        LinearLayout $r3 = $r2.serviceFeeLayout;
        $r3.setVisibility(0);
        TextView $r4 = $r2.serviceFeeTextView;
        OthersWithdrawalFragment r6 = this;
        String $r5 = r6.getString(C0001R.string.naira_symbol);
        String $r1 = Log_OC.m10359a($r5, (Object) str);
        $r4.setText($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.withdrawal.view.OthersWithdrawView
    public void toggleServiceFeeLoading(boolean z) {
        FragmentOthersWithdrawalBinding $r1 = requireBinding();
        if (z) {
            ProgressBar $r2 = $r1.serviceFeeProgressBar;
            $r2.setVisibility(0);
            Button $r3 = $r1.performWithdrawalButton;
            $r3.setVisibility(8);
            return;
        }
        ProgressBar $r22 = $r1.serviceFeeProgressBar;
        $r22.setVisibility(8);
        Button $r32 = $r1.performWithdrawalButton;
        $r32.setVisibility(0);
    }
}

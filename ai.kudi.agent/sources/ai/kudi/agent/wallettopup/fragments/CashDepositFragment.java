package ai.kudi.agent.wallettopup.fragments;

import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.databinding.FragmentCashDepositBinding;
import ai.kudi.agent.wallettopup.WalletTopUpActivity;
import ai.kudi.agent.wallettopup.adapters.CashDepositAdapter;
import ai.kudi.agent.wallettopup.data.PaymentMethodsViewData;
import ai.kudi.agent.wallettopup.labs.WalletTopupSubcomponent;
import ai.kudi.agent.wallettopup.viewmodels.PaymentMethodViewModel;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: CashDepositFragment.kt */
@Metadata(m10422d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 $2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0014J\b\u0010\u0014\u001a\u00020\u0002H\u0014J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0014J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006%"}, m10421d2 = {"Lai/kudi/agent/wallettopup/fragments/CashDepositFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/wallettopup/viewmodels/PaymentMethodViewModel;", "Lai/kudi/agent/wallettopup/data/PaymentMethodsViewData;", "Lai/kudi/agent/databinding/FragmentCashDepositBinding;", "()V", "cashDepositAdapter", "Lai/kudi/agent/wallettopup/adapters/CashDepositAdapter;", "getCashDepositAdapter", "()Lai/kudi/agent/wallettopup/adapters/CashDepositAdapter;", "setCashDepositAdapter", "(Lai/kudi/agent/wallettopup/adapters/CashDepositAdapter;)V", "viewModel", "getViewModel", "()Lai/kudi/agent/wallettopup/viewmodels/PaymentMethodViewModel;", "setViewModel", "(Lai/kudi/agent/wallettopup/viewmodels/PaymentMethodViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CashDepositFragment extends BaseMVVMViewBindingFragment<PaymentMethodViewModel, PaymentMethodsViewData, FragmentCashDepositBinding> {
    public static final Companion Companion;
    private CashDepositAdapter cashDepositAdapter;
    public PaymentMethodViewModel viewModel;

    /* compiled from: CashDepositFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/wallettopup/fragments/CashDepositFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/wallettopup/fragments/CashDepositFragment;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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
        public final CashDepositFragment newInstance() {
            CashDepositFragment $r1 = new CashDepositFragment();
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
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        PaymentMethodsViewData $r2 = (PaymentMethodsViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(PaymentMethodsViewData paymentMethodsViewData) {
        Log_OC.getArray(paymentMethodsViewData, "viewData");
        CashDepositAdapter $r2 = this.cashDepositAdapter;
        if ($r2 != null) {
            List $r3 = paymentMethodsViewData.getCashDepositSteps();
            $r2.submitList($r3);
        }
        InterfaceC8209a $r4 = requireBinding();
        FragmentCashDepositBinding $r5 = (FragmentCashDepositBinding) $r4;
        RecyclerView $r6 = $r5.cashDepositRecyclerView;
        $r6.setAdapter(this.cashDepositAdapter);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        PaymentMethodViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public PaymentMethodViewModel createViewModel() {
        PaymentMethodViewModel $r1 = getViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final CashDepositAdapter getCashDepositAdapter() {
        CashDepositAdapter r1 = this.cashDepositAdapter;
        return r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return PaymentMethodViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public final PaymentMethodViewModel getViewModel() {
        PaymentMethodViewModel $r1 = this.viewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("viewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
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
            NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.wallettopup.WalletTopUpActivity");
            throw $r5;
        }
        WalletTopUpActivity $r3 = (WalletTopUpActivity) $r2;
        WalletTopupSubcomponent $r4 = $r3.getWalletTopupSubcomponent();
        $r4.inject(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentCashDepositBinding $r4 = FragmentCashDepositBinding.inflate(layoutInflater, viewGroup, false);
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
        CashDepositAdapter $r4 = new CashDepositAdapter();
        this.cashDepositAdapter = $r4;
        PaymentMethodViewModel $r1 = getViewModel();
        $r1.getCashDepositSteps();
    }

    public final void setCashDepositAdapter(CashDepositAdapter cashDepositAdapter) {
        this.cashDepositAdapter = cashDepositAdapter;
    }

    public final void setViewModel(PaymentMethodViewModel paymentMethodViewModel) {
        Log_OC.getArray(paymentMethodViewModel, "<set-?>");
        this.viewModel = paymentMethodViewModel;
    }
}

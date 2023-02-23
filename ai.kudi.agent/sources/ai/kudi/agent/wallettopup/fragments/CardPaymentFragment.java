package ai.kudi.agent.wallettopup.fragments;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.custom.views.SelectView;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.databinding.TopupCardListContainerBinding;
import ai.kudi.agent.payments.domain.wiki.PaymentMethod;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.adapter.PaymentMethodAdapter;
import ai.kudi.agent.wallettopup.WalletTopUpActivity;
import ai.kudi.agent.wallettopup.data.PaymentMethodsViewData;
import ai.kudi.agent.wallettopup.labs.WalletTopupSubcomponent;
import ai.kudi.agent.wallettopup.viewmodels.CardPaymentViewModel;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p201g.p270x.InterfaceC8209a;
/* compiled from: CardPaymentFragment.kt */
@Metadata(m10422d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 02\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00010B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003H\u0014J\b\u0010\u001a\u001a\u00020\u0002H\u0014J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u0018H\u0002J\u0016\u0010\u001e\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002J\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$H\u0016J&\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u001a\u0010-\u001a\u00020\u00182\u0006\u0010.\u001a\u00020&2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010/\u001a\u00020\u0018H\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u00061"}, m10421d2 = {"Lai/kudi/agent/wallettopup/fragments/CardPaymentFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/wallettopup/viewmodels/CardPaymentViewModel;", "Lai/kudi/agent/wallettopup/data/PaymentMethodsViewData;", "Lai/kudi/agent/databinding/TopupCardListContainerBinding;", "()V", "cardsAdapter", "Lai/kudi/agent/users/adapter/PaymentMethodAdapter;", "getCardsAdapter", "()Lai/kudi/agent/users/adapter/PaymentMethodAdapter;", "setCardsAdapter", "(Lai/kudi/agent/users/adapter/PaymentMethodAdapter;)V", "onCardSelectedListener", "Landroid/widget/AdapterView$OnItemSelectedListener;", "getOnCardSelectedListener", "()Landroid/widget/AdapterView$OnItemSelectedListener;", "setOnCardSelectedListener", "(Landroid/widget/AdapterView$OnItemSelectedListener;)V", "viewModel", "getViewModel", "()Lai/kudi/agent/wallettopup/viewmodels/CardPaymentViewModel;", "setViewModel", "(Lai/kudi/agent/wallettopup/viewmodels/CardPaymentViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "hideLoader", "listCards", TransactionBreakDownItemType.DATA, "", "Lai/kudi/agent/payments/domain/dto/PaymentMethod;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showLoader", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CardPaymentFragment extends BaseMVVMViewBindingFragment<CardPaymentViewModel, PaymentMethodsViewData, TopupCardListContainerBinding> {
    private static final String ARGS_AMOUNT = "args_amount";
    public static final Companion Companion;
    public PaymentMethodAdapter cardsAdapter;
    public AdapterView.OnItemSelectedListener onCardSelectedListener;
    public CardPaymentViewModel viewModel;

    /* compiled from: CardPaymentFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/wallettopup/fragments/CardPaymentFragment$Companion;", "", "()V", "ARGS_AMOUNT", "", "newInstance", "Lai/kudi/agent/wallettopup/fragments/CardPaymentFragment;", TransactionField.AMOUNT, "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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
        public final CardPaymentFragment newInstance(double d) {
            CardPaymentFragment $r1 = new CardPaymentFragment();
            Bundle $r2 = new Bundle();
            $r2.putDouble(CardPaymentFragment.ARGS_AMOUNT, d);
            C13666w c13666w = C13666w.f30112a;
            $r1.setArguments($r2);
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
    private final void hideLoader() {
        FragmentActivity $r1 = getActivity();
        if ($r1 == null) {
            NullPointerException $r3 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.wallettopup.WalletTopUpActivity");
            throw $r3;
        }
        WalletTopUpActivity $r2 = (WalletTopUpActivity) $r1;
        $r2.hideLoading();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void listCards(List list) {
        InterfaceC8209a $r2 = requireBinding();
        TopupCardListContainerBinding $r3 = (TopupCardListContainerBinding) $r2;
        boolean $z0 = list.isEmpty();
        if ($z0) {
            TextView $r4 = $r3.cardLabel;
            String $r5 = getString(C0001R.string.no_wallet_card_error_message);
            $r4.setText($r5);
            View $r6 = $r3.paymentOptionSelectView;
            Log_OC.loadImage($r6, "paymentOptionSelectView");
            View r8 = $r6;
            ViewExtKt.hide$default(r8, false, 1, null);
            return;
        }
        TextView $r42 = $r3.cardLabel;
        String $r52 = getString(C0001R.string.select_card);
        $r42.setText($r52);
        View $r62 = $r3.paymentOptionSelectView;
        Log_OC.loadImage($r62, "paymentOptionSelectView");
        View r82 = $r62;
        ViewExtKt.show(r82);
        PaymentMethodAdapter $r7 = getCardsAdapter();
        $r7.setPaymentMethods(list);
        PaymentMethodAdapter $r72 = getCardsAdapter();
        $r72.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-1$lambda-0  reason: not valid java name */
    public static final void m41754onViewCreated$lambda1$lambda0(CardPaymentFragment cardPaymentFragment, double d, View view) {
        Log_OC.getArray(cardPaymentFragment, "this$0");
        boolean $z0 = cardPaymentFragment.getActivity() instanceof WalletTopUpActivity;
        if ($z0) {
            FragmentActivity $r2 = cardPaymentFragment.getActivity();
            if ($r2 == null) {
                NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.wallettopup.WalletTopUpActivity");
                throw $r5;
            }
            WalletTopUpActivity $r3 = (WalletTopUpActivity) $r2;
            String $r4 = String.valueOf(d);
            $r3.addNewCard($r4);
        }
        CardPaymentViewModel $r6 = cardPaymentFragment.getViewModel();
        $r6.logOnCardAdded();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showLoader() {
        FragmentActivity $r1 = getActivity();
        if ($r1 == null) {
            NullPointerException $r3 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.wallettopup.WalletTopUpActivity");
            throw $r3;
        }
        WalletTopUpActivity $r2 = (WalletTopUpActivity) $r1;
        $r2.showLoading();
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
        List $r2;
        Log_OC.getArray(paymentMethodsViewData, "viewData");
        List $r22 = paymentMethodsViewData.getCards();
        if ($r22 != null) {
            listCards($r22);
        }
        PaymentMethodsViewData.Error $r3 = paymentMethodsViewData.getError();
        if ($r3 != null) {
            $r2 = C13726r.m3891e();
            listCards($r2);
            FragmentActivity $r4 = requireActivity();
            Log_OC.loadImage($r4, "requireActivity()");
            String $r5 = $r3.getGeneralError();
            ContextExtKt.toast$default($r4, $r5, 0, 2, (Object) null);
        }
        boolean $z0 = paymentMethodsViewData.getLoading();
        if ($z0) {
            showLoader();
        } else {
            hideLoader();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        CardPaymentViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public CardPaymentViewModel createViewModel() {
        CardPaymentViewModel $r1 = getViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PaymentMethodAdapter getCardsAdapter() {
        PaymentMethodAdapter $r1 = this.cardsAdapter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("cardsAdapter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AdapterView.OnItemSelectedListener getOnCardSelectedListener() {
        AdapterView.OnItemSelectedListener $r1 = this.onCardSelectedListener;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("onCardSelectedListener");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return CardPaymentViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public final CardPaymentViewModel getViewModel() {
        CardPaymentViewModel $r1 = this.viewModel;
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
        TopupCardListContainerBinding $r4 = TopupCardListContainerBinding.inflate(layoutInflater, viewGroup, false);
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
        super.onViewCreated(view, bundle);
        FragmentActivity $r4 = requireActivity();
        Log_OC.loadImage($r4, "requireActivity()");
        PaymentMethodAdapter $r3 = new PaymentMethodAdapter($r4);
        setCardsAdapter($r3);
        setOnCardSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: ai.kudi.agent.wallettopup.fragments.CardPaymentFragment$onViewCreated$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView adapterView, View view2, int i, long j) {
                CardPaymentFragment $r32 = CardPaymentFragment.this;
                FragmentActivity $r42 = $r32.getActivity();
                if ($r42 == null) {
                    NullPointerException $r8 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.wallettopup.WalletTopUpActivity");
                    throw $r8;
                }
                WalletTopUpActivity $r5 = (WalletTopUpActivity) $r42;
                CardPaymentFragment $r33 = CardPaymentFragment.this;
                PaymentMethodAdapter $r6 = $r33.getCardsAdapter();
                PaymentMethod $r7 = $r6.getItem(i);
                $r5.setSelectedCard($r7);
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView adapterView) {
            }
        });
        InterfaceC8209a $r6 = requireBinding();
        TopupCardListContainerBinding $r7 = (TopupCardListContainerBinding) $r6;
        SelectView $r8 = $r7.paymentOptionSelectView;
        PaymentMethodAdapter $r32 = getCardsAdapter();
        $r8.setAdapter($r32);
        SelectView $r82 = $r7.paymentOptionSelectView;
        AdapterView.OnItemSelectedListener $r9 = getOnCardSelectedListener();
        $r82.setOnItemClickListener($r9);
        Bundle $r2 = requireArguments();
        final double $d0 = $r2.getDouble(ARGS_AMOUNT);
        TextView $r10 = $r7.addNewCardLabel;
        $r10.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.wallettopup.fragments.FileSelectionFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CardPaymentFragment $r22 = CardPaymentFragment.this;
                double $d02 = $d0;
                CardPaymentFragment.m41754onViewCreated$lambda1$lambda0($r22, $d02, view2);
            }
        });
        CardPaymentViewModel $r12 = getViewModel();
        $r12.loadCards();
        CardPaymentViewModel $r122 = getViewModel();
        $r122.logOnCardPaymentVisited();
    }

    public final void setCardsAdapter(PaymentMethodAdapter paymentMethodAdapter) {
        Log_OC.getArray(paymentMethodAdapter, "<set-?>");
        this.cardsAdapter = paymentMethodAdapter;
    }

    public final void setOnCardSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        Log_OC.getArray(onItemSelectedListener, "<set-?>");
        this.onCardSelectedListener = onItemSelectedListener;
    }

    public final void setViewModel(CardPaymentViewModel cardPaymentViewModel) {
        Log_OC.getArray(cardPaymentViewModel, "<set-?>");
        this.viewModel = cardPaymentViewModel;
    }
}

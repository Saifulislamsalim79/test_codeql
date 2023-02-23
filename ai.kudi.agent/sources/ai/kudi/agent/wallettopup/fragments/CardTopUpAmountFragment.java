package ai.kudi.agent.wallettopup.fragments;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.common_screens.amount_input.p003ui.fragments.BaseAmountInputFragment;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.wallettopup.WalletTopUpActivity;
import ai.kudi.agent.wallettopup.fragments.CardPaymentFragment;
import ai.kudi.agent.wallettopup.labs.WalletTopupSubcomponent;
import ai.kudi.agent.wallettopup.viewmodels.CardTopUpAmtViewData;
import ai.kudi.agent.wallettopup.viewmodels.CardTopUpAmtViewModel;
import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: CardTopUpAmountFragment.kt */
@Metadata(m10422d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0014H\u0016R\u001e\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, m10421d2 = {"Lai/kudi/agent/wallettopup/fragments/CardTopUpAmountFragment;", "Lai/kudi/agent/common_screens/amount_input/ui/fragments/BaseAmountInputFragment;", "Lai/kudi/agent/wallettopup/viewmodels/CardTopUpAmtViewModel;", "Lai/kudi/agent/wallettopup/viewmodels/CardTopUpAmtViewData;", "()V", "cardTopUpAmtViewModel", "getCardTopUpAmtViewModel", "()Lai/kudi/agent/wallettopup/viewmodels/CardTopUpAmtViewModel;", "setCardTopUpAmtViewModel", "(Lai/kudi/agent/wallettopup/viewmodels/CardTopUpAmtViewModel;)V", "walletTopUpActivity", "Lai/kudi/agent/wallettopup/WalletTopUpActivity;", "getWalletTopUpActivity", "()Lai/kudi/agent/wallettopup/WalletTopUpActivity;", "setWalletTopUpActivity", "(Lai/kudi/agent/wallettopup/WalletTopUpActivity;)V", "applyViewData", "", "viewData", "getMaximumAmount", "", "getMinimumAmount", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onNextBtnClick", TransactionField.AMOUNT, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CardTopUpAmountFragment extends BaseAmountInputFragment<CardTopUpAmtViewModel, CardTopUpAmtViewData> {
    public CardTopUpAmtViewModel cardTopUpAmtViewModel;
    public WalletTopUpActivity walletTopUpActivity;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        CardTopUpAmtViewData $r2 = (CardTopUpAmtViewData) viewData;
        applyViewData($r2);
    }

    protected void applyViewData(CardTopUpAmtViewData cardTopUpAmtViewData) {
        Log_OC.getArray(cardTopUpAmtViewData, "viewData");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final CardTopUpAmtViewModel getCardTopUpAmtViewModel() {
        CardTopUpAmtViewModel $r1 = this.cardTopUpAmtViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("cardTopUpAmtViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.common_screens.amount_input.p003ui.fragments.BaseAmountInputFragment
    public int getMaximumAmount() {
        return 500000;
    }

    @Override // ai.kudi.agent.common_screens.amount_input.p003ui.fragments.BaseAmountInputFragment
    public int getMinimumAmount() {
        return 500;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return CardTopUpAmtViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final WalletTopUpActivity getWalletTopUpActivity() {
        WalletTopUpActivity $r1 = this.walletTopUpActivity;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("walletTopUpActivity");
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
        setWalletTopUpActivity($r3);
        WalletTopUpActivity $r32 = getWalletTopUpActivity();
        WalletTopupSubcomponent $r4 = $r32.getWalletTopupSubcomponent();
        $r4.inject(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.common_screens.amount_input.p003ui.fragments.BaseAmountInputFragment
    public void onNextBtnClick(int i) {
        WalletTopUpActivity $r1 = getWalletTopUpActivity();
        CardPaymentFragment.Companion $r2 = CardPaymentFragment.Companion;
        double $d0 = i;
        CardPaymentFragment $r3 = $r2.newInstance($d0);
        AppCompatActivity r4 = (AppCompatActivity) $r1;
        AppCompatActivityExtKt.startFragment$default(r4, $r3, C0001R.C0003id.container, false, false, false, 28, null);
    }

    public final void setCardTopUpAmtViewModel(CardTopUpAmtViewModel cardTopUpAmtViewModel) {
        Log_OC.getArray(cardTopUpAmtViewModel, "<set-?>");
        this.cardTopUpAmtViewModel = cardTopUpAmtViewModel;
    }

    public final void setWalletTopUpActivity(WalletTopUpActivity walletTopUpActivity) {
        Log_OC.getArray(walletTopUpActivity, "<set-?>");
        this.walletTopUpActivity = walletTopUpActivity;
    }
}

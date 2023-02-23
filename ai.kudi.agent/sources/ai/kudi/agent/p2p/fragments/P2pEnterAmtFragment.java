package ai.kudi.agent.p2p.fragments;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.common_screens.amount_input.p003ui.fragments.BaseAmountInputFragment;
import ai.kudi.agent.common_screens.success_screen.fragment.SuccessScreenDialogFragment;
import ai.kudi.agent.common_screens.success_screen.labs.SuccessScreenCustomOption;
import ai.kudi.agent.constants.ConstantsKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.FragmentAmountInputBinding;
import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.p2p.data.P2pData;
import ai.kudi.agent.p2p.fragments.P2pSummaryFragment;
import ai.kudi.agent.p2p.viewmodels.P2pAmtInputViewData;
import ai.kudi.agent.p2p.viewmodels.P2pEnterAmtViewModel;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.transfer.generation.components.MainTransferSubComponent;
import ai.kudi.agent.transfer.p034ui.TransferActivity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: P2pEnterAmtFragment.kt */
@Metadata(m10422d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0014J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0014H\u0002J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0014H\u0016J\u001a\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0017R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, m10421d2 = {"Lai/kudi/agent/p2p/fragments/P2pEnterAmtFragment;", "Lai/kudi/agent/common_screens/amount_input/ui/fragments/BaseAmountInputFragment;", "Lai/kudi/agent/p2p/viewmodels/P2pEnterAmtViewModel;", "Lai/kudi/agent/p2p/viewmodels/P2pAmtInputViewData;", "()V", "p2pData", "Lai/kudi/agent/p2p/data/P2pData;", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences$annotations", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "transferActivity", "Lai/kudi/agent/transfer/ui/TransferActivity;", "applyViewData", "", "viewData", "getMinimumAmount", "", "getVMType", "Ljava/lang/Class;", "isAmountValid", "", TransactionField.AMOUNT, "onAttach", "context", "Landroid/content/Context;", "onNextBtnClick", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class P2pEnterAmtFragment extends BaseAmountInputFragment<P2pEnterAmtViewModel, P2pAmtInputViewData> {
    public static final Companion Companion;
    private P2pData p2pData;
    public SharedPreferences sharedPreferences;
    private TransferActivity transferActivity;

    /* compiled from: P2pEnterAmtFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/p2p/fragments/P2pEnterAmtFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/p2p/fragments/P2pEnterAmtFragment;", "p2pData", "Lai/kudi/agent/p2p/data/P2pData;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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
        public final P2pEnterAmtFragment newInstance(P2pData p2pData) {
            Log_OC.getArray(p2pData, "p2pData");
            P2pEnterAmtFragment $r3 = new P2pEnterAmtFragment();
            Bundle $r1 = new Bundle();
            $r1.putParcelable("P2P_DATA", p2pData);
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

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final P2pEnterAmtFragment newInstance(P2pData p2pData) {
        Companion $r0 = Companion;
        P2pEnterAmtFragment $r1 = $r0.newInstance(p2pData);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-1$lambda-0  reason: not valid java name */
    public static final void m39988onViewCreated$lambda1$lambda0(P2pEnterAmtFragment p2pEnterAmtFragment, View view) {
        Log_OC.getArray(p2pEnterAmtFragment, "this$0");
        TransferActivity $r2 = p2pEnterAmtFragment.transferActivity;
        if ($r2 == null) {
            return;
        }
        $r2.onBackPressed();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        P2pAmtInputViewData $r2 = (P2pAmtInputViewData) viewData;
        applyViewData($r2);
    }

    protected void applyViewData(P2pAmtInputViewData p2pAmtInputViewData) {
        Log_OC.getArray(p2pAmtInputViewData, "viewData");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.common_screens.amount_input.p003ui.fragments.BaseAmountInputFragment
    public int getMinimumAmount() {
        SharedPreferences $r1 = getSharedPreferences();
        String $r2 = $r1.getString(LoginParams.EXTRA_CUSTOMER_TYPE, "AGENT");
        String $r3 = $r2;
        if ($r2 == null) {
            $r3 = "AGENT";
        }
        boolean $z0 = Log_OC.append($r3, "AGENT");
        return $z0 ? 500 : 100;
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
        return P2pEnterAmtViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        MainTransferSubComponent $r1;
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        boolean $z0 = context instanceof TransferActivity;
        if ($z0) {
            TransferActivity $r3 = (TransferActivity) context;
            this.transferActivity = $r3;
            if ($r3 == null || ($r1 = $r3.getTransferSubComponent()) == null) {
                return;
            }
            $r1.inject(this);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.common_screens.amount_input.p003ui.fragments.BaseAmountInputFragment
    public void onNextBtnClick(int i) {
        FragmentManager $r10;
        boolean $z0 = isAmountValid(i);
        if (!$z0) {
            SuccessScreenDialogFragment.Companion $r6 = SuccessScreenDialogFragment.Companion;
            SuccessScreenCustomOption r11 = new SuccessScreenCustomOption("Insufficient Funds", "", "Fund Wallet", true, false, false, 0, 0, 0, 0, C0001R.C0002drawable.ic_failed_transaction_status, 0, false, 7152, null);
            P2pEnterAmtFragment$onNextBtnClick$1 r12 = new P2pEnterAmtFragment$onNextBtnClick$1(this);
            SuccessScreenDialogFragment $r9 = $r6.newInstance(r11, r12);
            TransferActivity $r3 = this.transferActivity;
            if ($r3 == null) {
                $r10 = null;
            } else {
                FragmentActivity r14 = (FragmentActivity) $r3;
                $r10 = r14.getSupportFragmentManager();
            }
            Log_OC.append($r10);
            $r9.show($r10, "Success Fragment");
            return;
        }
        P2pData $r1 = this.p2pData;
        if ($r1 != null) {
            Integer $r2 = Integer.valueOf(i);
            $r1.setAmount($r2);
        }
        TransferActivity $r32 = this.transferActivity;
        if ($r32 == null) {
            return;
        }
        P2pSummaryFragment.Companion $r4 = P2pSummaryFragment.Companion;
        P2pData $r12 = this.p2pData;
        Log_OC.append($r12);
        P2pSummaryFragment $r5 = $r4.newInstance($r12);
        AppCompatActivityExtKt.startFragment$default((AppCompatActivity) $r32, $r5, C0001R.C0003id.transferContainerLayout, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.common_screens.amount_input.p003ui.fragments.BaseAmountInputFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        P2pData $r4;
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        Bundle $r2 = getArguments();
        if ($r2 == null) {
            $r4 = null;
        } else {
            Parcelable $r5 = $r2.getParcelable("P2P_DATA");
            $r4 = (P2pData) $r5;
        }
        this.p2pData = $r4;
        toggleAccountDetailHeader(true);
        InterfaceC8209a $r6 = requireBinding();
        FragmentAmountInputBinding $r7 = (FragmentAmountInputBinding) $r6;
        TextView $r8 = $r7.tvAccountName;
        Log_OC.loadImage($r8, "tvAccountName");
        ViewExtKt.hide$default($r8, false, 1, null);
        TextView $r82 = $r7.tvAcctDetail;
        StringBuilder $r9 = new StringBuilder();
        P2pData $r42 = this.p2pData;
        String $r10 = $r42 == null ? null : $r42.getAccountName();
        $r9.append((Object) $r10);
        $r9.append(" | ");
        P2pData $r43 = this.p2pData;
        String $r3 = $r43 != null ? $r43.getPhoneNumber() : null;
        $r9.append((Object) $r3);
        String $r32 = $r9.toString();
        $r82.setText($r32);
        $r7.tvEdit.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.p2p.fragments.AboutFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                P2pEnterAmtFragment $r22 = P2pEnterAmtFragment.this;
                P2pEnterAmtFragment.m39988onViewCreated$lambda1$lambda0($r22, view2);
            }
        });
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }
}

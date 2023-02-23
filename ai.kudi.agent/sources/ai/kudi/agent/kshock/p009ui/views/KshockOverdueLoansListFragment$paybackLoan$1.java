package ai.kudi.agent.kshock.p009ui.views;

import ai.kudi.agent.kshock.data.model.Loan;
import ai.kudi.agent.kshock.p009ui.views.PaybackLoanConfirmationDialog;
import ai.kudi.agent.kshock.presentation.KshockPendingLoansListViewModel;
import ai.kudi.agent.pin.KudiPin;
import android.os.Bundle;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import androidx.lifecycle.PreferenceActivity;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: KshockOverdueLoansListFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m10421d2 = {"ai/kudi/agent/kshock/ui/views/KshockOverdueLoansListFragment$paybackLoan$1", "Lai/kudi/agent/kshock/ui/views/PaybackLoanConfirmationDialog$PaybackLoanConfirmationDialogListener;", "onCancelClicked", "", "dialogFragment", "Lai/kudi/agent/kshock/ui/views/PaybackLoanConfirmationDialog;", "onProceedClicked", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.kshock.ui.views.KshockOverdueLoansListFragment$paybackLoan$1 */
/* loaded from: classes.dex */
public final class KshockOverdueLoansListFragment$paybackLoan$1 implements PaybackLoanConfirmationDialog.PaybackLoanConfirmationDialogListener {
    final /* synthetic */ Loan $loan;
    final /* synthetic */ KshockOverdueLoansListFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public KshockOverdueLoansListFragment$paybackLoan$1(KshockOverdueLoansListFragment kshockOverdueLoansListFragment, Loan loan) {
        this.this$0 = kshockOverdueLoansListFragment;
        this.$loan = loan;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onProceedClicked$lambda-0  reason: not valid java name */
    public static final void m39650onProceedClicked$lambda0(KshockOverdueLoansListFragment kshockOverdueLoansListFragment, Loan loan, String str, Bundle bundle) {
        Log_OC.getArray(kshockOverdueLoansListFragment, "this$0");
        Log_OC.getArray(loan, "$loan");
        Log_OC.getArray(str, "$noName_0");
        Log_OC.getArray(bundle, "$noName_1");
        KshockPendingLoansListViewModel $r4 = kshockOverdueLoansListFragment.getKshockPendingLoansListViewModel();
        String $r3 = loan.getId();
        String $r5 = $r3;
        if ($r3 == null) {
            $r5 = "";
        }
        $r4.payBackManually($r5);
    }

    @Override // ai.kudi.agent.kshock.p009ui.views.PaybackLoanConfirmationDialog.PaybackLoanConfirmationDialogListener
    public void onCancelClicked(PaybackLoanConfirmationDialog paybackLoanConfirmationDialog) {
        Log_OC.getArray(paybackLoanConfirmationDialog, "dialogFragment");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.kshock.p009ui.views.PaybackLoanConfirmationDialog.PaybackLoanConfirmationDialogListener
    public void onProceedClicked(PaybackLoanConfirmationDialog paybackLoanConfirmationDialog) {
        Log_OC.getArray(paybackLoanConfirmationDialog, "dialogFragment");
        KshockOverdueLoansListFragment $r5 = this.this$0;
        FragmentManager $r6 = $r5.getChildFragmentManager();
        KshockOverdueLoansListFragment $r52 = this.this$0;
        PreferenceActivity $r7 = $r52.getViewLifecycleOwner();
        final KshockOverdueLoansListFragment $r53 = this.this$0;
        final Loan $r1 = this.$loan;
        $r6.p1(KudiPin.KUDI_PIN_AUTH_SUCCESS_KEY, $r7, new InterfaceC1523w() { // from class: ai.kudi.agent.kshock.ui.views.h
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: c */
            public final void m38767c(String str, Bundle bundle) {
                KshockOverdueLoansListFragment $r3 = KshockOverdueLoansListFragment.this;
                Loan $r4 = $r1;
                KshockOverdueLoansListFragment$paybackLoan$1.m39650onProceedClicked$lambda0($r3, $r4, str, bundle);
            }
        });
        KudiPin.Companion $r3 = KudiPin.Companion;
        KudiPin $r8 = KudiPin.Companion.newInstance$default($r3, null, null, false, 7, null);
        KshockOverdueLoansListFragment $r54 = this.this$0;
        FragmentManager $r62 = $r54.getChildFragmentManager();
        Chapter r10 = (Chapter) $r8;
        r10.show($r62, ".AuthDialog.Dialog");
    }
}

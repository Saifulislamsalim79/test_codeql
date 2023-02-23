package ai.kudi.agent.kshock.p009ui.views;

import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.feature_kshock.C0220R;
import ai.kudi.agent.feature_kshock.databinding.FragmentOverdueLoansDetailsBinding;
import ai.kudi.agent.kshock.data.model.Loan;
import ai.kudi.agent.kshock.data.model.P2pData;
import ai.kudi.agent.kshock.p009ui.KShockActivity;
import ai.kudi.agent.kshock.presentation.KshockPendingLoansListViewModel;
import ai.kudi.agent.kshock.presentation.viewdata.KshockPendingLoansListViewData;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.settings.p029ui.adapters.TwoColumnTableAdapter;
import ai.kudi.dip.library.button.KudiButton;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.p058os.C1372b;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import androidx.lifecycle.PreferenceActivity;
import androidx.recyclerview.widget.RecyclerView;
import dagger.android.p197e.C7429a;
import java.util.List;
import kotlin.C13218k;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.InterfaceC11824h;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: KshockOverdueLoansDetailFragment.kt */
@Metadata(m10422d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 +2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001+B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0003H\u0014J\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010\u0019\u001a\u00020\u0002H\u0014J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020\u00142\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J$\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020#2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010*\u001a\u00020\u0014H\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001e\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/views/KshockOverdueLoansDetailFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/kshock/presentation/KshockPendingLoansListViewModel;", "Lai/kudi/agent/kshock/presentation/viewdata/KshockPendingLoansListViewData;", "Lai/kudi/agent/feature_kshock/databinding/FragmentOverdueLoansDetailsBinding;", "()V", "adapter", "Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter;", "getAdapter", "()Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "kshockPendingLoansListViewModel", "getKshockPendingLoansListViewModel", "()Lai/kudi/agent/kshock/presentation/KshockPendingLoansListViewModel;", "setKshockPendingLoansListViewModel", "(Lai/kudi/agent/kshock/presentation/KshockPendingLoansListViewModel;)V", KshockOverdueLoansDetailFragment.KEY_LOAN, "Lai/kudi/agent/kshock/data/model/Loan;", "applyViewData", "", "viewData", "createData", "", "Lai/kudi/agent/settings/data/models/TwoColumnItem;", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "updateView", "Companion", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.kshock.ui.views.KshockOverdueLoansDetailFragment */
/* loaded from: classes.dex */
public final class KshockOverdueLoansDetailFragment extends BaseMVVMViewBindingFragment<KshockPendingLoansListViewModel, KshockPendingLoansListViewData, FragmentOverdueLoansDetailsBinding> {
    public static final Companion Companion;
    public static final String KEY_LOAN = "loan";
    private final InterfaceC11824h adapter$delegate;
    public KshockPendingLoansListViewModel kshockPendingLoansListViewModel;
    private Loan loan;

    /* compiled from: KshockOverdueLoansDetailFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/views/KshockOverdueLoansDetailFragment$Companion;", "", "()V", "KEY_LOAN", "", "newInstance", "Lai/kudi/agent/kshock/ui/views/KshockOverdueLoansDetailFragment;", KshockOverdueLoansDetailFragment.KEY_LOAN, "Lai/kudi/agent/kshock/data/model/Loan;", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.kshock.ui.views.KshockOverdueLoansDetailFragment$Companion */
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
        public final KshockOverdueLoansDetailFragment newInstance(Loan loan) {
            Log_OC.getArray(loan, KshockOverdueLoansDetailFragment.KEY_LOAN);
            KshockOverdueLoansDetailFragment $r1 = new KshockOverdueLoansDetailFragment();
            C13287o $r4 = C13664u.m4227a(KshockOverdueLoansDetailFragment.KEY_LOAN, loan);
            C13287o[] $r3 = {$r4};
            Bundle $r5 = C1372b.m36174a($r3);
            $r1.setArguments($r5);
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
    public KshockOverdueLoansDetailFragment() {
        InterfaceC11824h $r1;
        KshockOverdueLoansDetailFragment$adapter$2 $r2 = KshockOverdueLoansDetailFragment$adapter$2.INSTANCE;
        $r1 = C13218k.m5625b($r2);
        this.adapter$delegate = $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: applyViewData$lambda-5$lambda-2  reason: not valid java name */
    public static final void m39646applyViewData$lambda5$lambda2(KshockOverdueLoansDetailFragment kshockOverdueLoansDetailFragment, View view) {
        Log_OC.getArray(kshockOverdueLoansDetailFragment, "this$0");
        KshockPendingLoansListViewModel $r0 = kshockOverdueLoansDetailFragment.getKshockPendingLoansListViewModel();
        Loan $r3 = kshockOverdueLoansDetailFragment.loan;
        $r0.paybackOverdue($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: applyViewData$lambda-5$lambda-4  reason: not valid java name */
    public static final void m39647applyViewData$lambda5$lambda4(final KshockOverdueLoansDetailFragment kshockOverdueLoansDetailFragment, View view) {
        Log_OC.getArray(kshockOverdueLoansDetailFragment, "this$0");
        FragmentManager $r4 = kshockOverdueLoansDetailFragment.getChildFragmentManager();
        PreferenceActivity $r5 = kshockOverdueLoansDetailFragment.getViewLifecycleOwner();
        $r4.p1(KudiPin.KUDI_PIN_AUTH_SUCCESS_KEY, $r5, new InterfaceC1523w() { // from class: ai.kudi.agent.kshock.ui.views.ByteVector
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.fragment.app.InterfaceC1523w
            /* renamed from: a */
            public final void mo35611a(String str, Bundle bundle) {
                KshockOverdueLoansDetailFragment $r3 = KshockOverdueLoansDetailFragment.this;
                KshockOverdueLoansDetailFragment.m39648applyViewData$lambda5$lambda4$lambda3($r3, str, bundle);
            }
        });
        KudiPin.Companion $r1 = KudiPin.Companion;
        KudiPin $r6 = KudiPin.Companion.newInstance$default($r1, null, null, false, 7, null);
        FragmentManager $r42 = kshockOverdueLoansDetailFragment.getChildFragmentManager();
        ((Chapter) $r6).show($r42, ".AuthDialog.Dialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: applyViewData$lambda-5$lambda-4$lambda-3  reason: not valid java name */
    public static final void m39648applyViewData$lambda5$lambda4$lambda3(KshockOverdueLoansDetailFragment kshockOverdueLoansDetailFragment, String str, Bundle bundle) {
        Double $r7;
        Integer $r6;
        Log_OC.getArray(kshockOverdueLoansDetailFragment, "this$0");
        Log_OC.getArray(str, "requestKey");
        Log_OC.getArray(bundle, "result");
        boolean $z0 = Log_OC.append(str, KudiPin.KUDI_PIN_AUTH_SUCCESS_KEY);
        if ($z0) {
            KshockPendingLoansListViewModel $r4 = kshockOverdueLoansDetailFragment.getKshockPendingLoansListViewModel();
            Loan $r5 = kshockOverdueLoansDetailFragment.loan;
            String $r3 = $r5 == null ? null : $r5.getPhoneNumber();
            Loan $r52 = kshockOverdueLoansDetailFragment.loan;
            if ($r52 == null || ($r7 = $r52.getAmountOwed()) == null) {
                $r6 = null;
            } else {
                double $d0 = $r7.doubleValue();
                int $i0 = (int) $d0;
                $r6 = Integer.valueOf($i0);
            }
            String $r8 = bundle.getString(KudiPin.PASSWORD_KEY);
            P2pData $r1 = new P2pData($r3, "Loan payback transfer", null, $r6, null, $r8, 20, null);
            $r4.fireP2pTransaction($r1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: applyViewData$lambda-7$lambda-6  reason: not valid java name */
    public static final void m39649applyViewData$lambda7$lambda6(KshockOverdueLoansDetailFragment kshockOverdueLoansDetailFragment, View view) {
        Log_OC.getArray(kshockOverdueLoansDetailFragment, "this$0");
        KshockPendingLoansListViewModel $r0 = kshockOverdueLoansDetailFragment.getKshockPendingLoansListViewModel();
        Loan $r3 = kshockOverdueLoansDetailFragment.loan;
        $r0.paybackOverdue($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
        r12 = kotlin.p549l0.C13276s.m5451A(r12, "_", " ", false, 4, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List createData(ai.kudi.agent.kshock.data.model.Loan r25) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.kshock.p009ui.views.KshockOverdueLoansDetailFragment.createData(ai.kudi.agent.kshock.data.model.Loan):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final TwoColumnTableAdapter getAdapter() {
        InterfaceC11824h $r2 = this.adapter$delegate;
        Object $r1 = $r2.getValue();
        TwoColumnTableAdapter $r3 = (TwoColumnTableAdapter) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void updateView() {
        Loan $r1;
        InterfaceC8209a $r2 = requireBinding();
        RecyclerView $r4 = ((FragmentOverdueLoansDetailsBinding) $r2).overdueLoanDetailsRv;
        TwoColumnTableAdapter $r5 = getAdapter();
        $r4.setAdapter($r5);
        Loan $r12 = this.loan;
        if ($r12 == null) {
            $r1 = null;
        } else {
            KshockPendingLoansListViewModel $r6 = getKshockPendingLoansListViewModel();
            Loan $r7 = this.loan;
            Double $r8 = $r6.calculateTotalLoanDue($r7);
            $r1 = Loan.copy$default($r12, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, $r8, null, null, null, null, null, null, null, null, null, 67043327, null);
        }
        this.loan = $r1;
        TwoColumnTableAdapter $r52 = getAdapter();
        List $r9 = createData(this.loan);
        $r52.setData($r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        KshockPendingLoansListViewData $r2 = (KshockPendingLoansListViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(KshockPendingLoansListViewData kshockPendingLoansListViewData) {
        Log_OC.getArray(kshockPendingLoansListViewData, "viewData");
        boolean $z0 = kshockPendingLoansListViewData instanceof KshockPendingLoansListViewData.HideOverduePaybackLoading;
        if ($z0) {
            InterfaceC8209a $r2 = requireBinding();
            FragmentOverdueLoansDetailsBinding $r3 = (FragmentOverdueLoansDetailsBinding) $r2;
            $r3.paybackLoanButton.m38033e();
            return;
        }
        boolean $z02 = kshockPendingLoansListViewData instanceof KshockPendingLoansListViewData.OverduePaybackLoading;
        if ($z02) {
            InterfaceC8209a $r22 = requireBinding();
            FragmentOverdueLoansDetailsBinding $r32 = (FragmentOverdueLoansDetailsBinding) $r22;
            $r32.paybackLoanButton.m38032f();
            return;
        }
        boolean $z03 = kshockPendingLoansListViewData instanceof KshockPendingLoansListViewData.OverduePayback;
        if ($z03) {
            KshockPendingLoansListViewModel $r5 = getKshockPendingLoansListViewModel();
            KshockPendingLoansListViewData.OverduePayback $r6 = (KshockPendingLoansListViewData.OverduePayback) kshockPendingLoansListViewData;
            $r5.navigateToOverduePaymentResult(KShockActivity.PAYBACK_PENDING, $r6.getMessage());
            return;
        }
        boolean $z04 = kshockPendingLoansListViewData instanceof KshockPendingLoansListViewData.OverdueError;
        if ($z04) {
            KshockPendingLoansListViewModel $r52 = getKshockPendingLoansListViewModel();
            $r52.navigateToOverduePaymentResult("ERROR", ((KshockPendingLoansListViewData.OverdueError) kshockPendingLoansListViewData).getError());
            return;
        }
        boolean $z05 = kshockPendingLoansListViewData instanceof KshockPendingLoansListViewData.WalletBalanceError;
        if ($z05) {
            InterfaceC8209a $r23 = requireBinding();
            FragmentOverdueLoansDetailsBinding $r33 = (FragmentOverdueLoansDetailsBinding) $r23;
            View $r4 = $r33.paybackLoanButton;
            Log_OC.loadImage($r4, "requireBinding().paybackLoanButton");
            View r20 = $r4;
            ViewExtKt.hide$default(r20, false, 1, null);
            FragmentActivity $r9 = requireActivity();
            Log_OC.loadImage($r9, "requireActivity()");
            int $i0 = C0220R.string.fetch_wallet_balance_error_message;
            ContextExtKt.toast$default($r9, getString($i0), 0, 2, (Object) null);
            return;
        }
        boolean $z06 = kshockPendingLoansListViewData instanceof KshockPendingLoansListViewData.WalletBalance;
        if ($z06) {
            InterfaceC8209a $r24 = requireBinding();
            FragmentOverdueLoansDetailsBinding $r34 = (FragmentOverdueLoansDetailsBinding) $r24;
            KudiButton $r42 = $r34.paybackLoanButton;
            KshockPendingLoansListViewData.WalletBalance $r10 = (KshockPendingLoansListViewData.WalletBalance) kshockPendingLoansListViewData;
            boolean $z07 = $r10.isEnoughBalance();
            if ($z07) {
                KudiButton r21 = $r42;
                r21.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.kshock.ui.views.c
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        KshockOverdueLoansDetailFragment $r25 = KshockOverdueLoansDetailFragment.this;
                        KshockOverdueLoansDetailFragment.m39646applyViewData$lambda5$lambda2($r25, view);
                    }
                });
                return;
            }
            InterfaceC8209a $r25 = requireBinding();
            FragmentOverdueLoansDetailsBinding $r35 = (FragmentOverdueLoansDetailsBinding) $r25;
            TextView $r12 = $r35.insufficientTextView;
            Log_OC.loadImage($r12, "requireBinding().insufficientTextView");
            ViewExtKt.show($r12);
            int $i02 = C0220R.string.fund_wallet;
            String $r7 = getString($i02);
            Log_OC.loadImage($r7, "getString(R.string.fund_wallet)");
            $r42.setText($r7);
            KudiButton r212 = $r42;
            r212.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.kshock.ui.views.k
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    KshockOverdueLoansDetailFragment $r26 = KshockOverdueLoansDetailFragment.this;
                    KshockOverdueLoansDetailFragment.m39647applyViewData$lambda5$lambda4($r26, view);
                }
            });
            return;
        }
        boolean $z08 = kshockPendingLoansListViewData instanceof KshockPendingLoansListViewData.WalletBalanceHideLoading;
        if ($z08) {
            InterfaceC8209a $r26 = requireBinding();
            FragmentOverdueLoansDetailsBinding $r36 = (FragmentOverdueLoansDetailsBinding) $r26;
            $r36.paybackLoanButton.m38033e();
            return;
        }
        boolean $z09 = kshockPendingLoansListViewData instanceof KshockPendingLoansListViewData.WalletBalanceLoading;
        if ($z09) {
            InterfaceC8209a $r27 = requireBinding();
            FragmentOverdueLoansDetailsBinding $r37 = (FragmentOverdueLoansDetailsBinding) $r27;
            $r37.paybackLoanButton.m38032f();
            return;
        }
        boolean $z010 = kshockPendingLoansListViewData instanceof KshockPendingLoansListViewData.P2PHideLoading;
        if ($z010) {
            InterfaceC8209a $r28 = requireBinding();
            FragmentOverdueLoansDetailsBinding $r38 = (FragmentOverdueLoansDetailsBinding) $r28;
            $r38.paybackLoanButton.m38033e();
            return;
        }
        boolean $z011 = kshockPendingLoansListViewData instanceof KshockPendingLoansListViewData.P2PLoading;
        if ($z011) {
            InterfaceC8209a $r29 = requireBinding();
            FragmentOverdueLoansDetailsBinding $r39 = (FragmentOverdueLoansDetailsBinding) $r29;
            $r39.paybackLoanButton.m38032f();
            return;
        }
        boolean $z012 = kshockPendingLoansListViewData instanceof KshockPendingLoansListViewData.P2PSuccess;
        if (!$z012) {
            boolean $z013 = kshockPendingLoansListViewData instanceof KshockPendingLoansListViewData.P2PError;
            if ($z013) {
                FragmentActivity $r92 = requireActivity();
                Log_OC.loadImage($r92, "requireActivity()");
                KshockPendingLoansListViewData.P2PError $r16 = (KshockPendingLoansListViewData.P2PError) kshockPendingLoansListViewData;
                ContextExtKt.toast$default($r92, $r16.getError(), 0, 2, (Object) null);
                InterfaceC8209a $r210 = requireBinding();
                FragmentOverdueLoansDetailsBinding $r310 = (FragmentOverdueLoansDetailsBinding) $r210;
                View $r43 = $r310.paybackLoanButton;
                Log_OC.loadImage($r43, "requireBinding().paybackLoanButton");
                View r202 = $r43;
                ViewExtKt.hide$default(r202, false, 1, null);
                return;
            }
            return;
        }
        InterfaceC8209a $r211 = requireBinding();
        FragmentOverdueLoansDetailsBinding $r311 = (FragmentOverdueLoansDetailsBinding) $r211;
        KudiButton $r44 = $r311.paybackLoanButton;
        InterfaceC8209a $r212 = requireBinding();
        FragmentOverdueLoansDetailsBinding $r312 = (FragmentOverdueLoansDetailsBinding) $r212;
        TextView $r122 = $r312.insufficientTextView;
        Log_OC.loadImage($r122, "requireBinding().insufficientTextView");
        ViewExtKt.hide$default($r122, false, 1, null);
        int $i03 = C0220R.string.payback;
        String $r72 = getString($i03);
        Log_OC.loadImage($r72, "getString(R.string.payback)");
        $r44.setText($r72);
        KudiButton r213 = $r44;
        r213.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.kshock.ui.views.SearchResultsActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KshockOverdueLoansDetailFragment $r213 = KshockOverdueLoansDetailFragment.this;
                KshockOverdueLoansDetailFragment.m39649applyViewData$lambda7$lambda6($r213, view);
            }
        });
        FragmentActivity $r93 = requireActivity();
        Log_OC.loadImage($r93, "requireActivity()");
        KshockPendingLoansListViewData.P2PSuccess $r15 = (KshockPendingLoansListViewData.P2PSuccess) kshockPendingLoansListViewData;
        ContextExtKt.toast$default($r93, $r15.getMessage(), 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        KshockPendingLoansListViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public KshockPendingLoansListViewModel createViewModel() {
        KshockPendingLoansListViewModel $r1 = getKshockPendingLoansListViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final KshockPendingLoansListViewModel getKshockPendingLoansListViewModel() {
        KshockPendingLoansListViewModel $r1 = this.kshockPendingLoansListViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("kshockPendingLoansListViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return KshockPendingLoansListViewModel.class;
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
        Parcelable $r2 = $r1.getParcelable(KEY_LOAN);
        Loan $r3 = (Loan) $r2;
        this.loan = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentOverdueLoansDetailsBinding $r4 = FragmentOverdueLoansDetailsBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(\n                inflater,\n                container,\n                false\n            )");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        FragmentActivity $r3 = getActivity();
        boolean $z0 = $r3 instanceof KShockActivity;
        KShockActivity $r4 = $z0 ? (KShockActivity) $r3 : null;
        if ($r4 != null) {
            $r4.showSupportActionBar();
        }
        updateView();
        KshockPendingLoansListViewModel $r5 = getKshockPendingLoansListViewModel();
        Loan $r6 = this.loan;
        $r5.checkWalletBalance($r6);
    }

    public final void setKshockPendingLoansListViewModel(KshockPendingLoansListViewModel kshockPendingLoansListViewModel) {
        Log_OC.getArray(kshockPendingLoansListViewModel, "<set-?>");
        this.kshockPendingLoansListViewModel = kshockPendingLoansListViewModel;
    }
}

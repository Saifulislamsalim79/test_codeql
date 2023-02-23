package ai.kudi.agent.transactioncommissions.p030ui;

import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.FragmentTransactionCommissionsBinding;
import ai.kudi.agent.filter.domain.FilteredDate;
import ai.kudi.agent.transactioncommissions.labs.TransactionCommissionsSubComponent;
import ai.kudi.agent.transactioncommissions.presentation.TransactionCommissionsViewModel;
import ai.kudi.agent.transactionhistory.p031ui.widget.TransactionsView;
import ai.kudi.agent.transactionhistory.presentation.viewstate.TransactionsViewState;
import ai.kudi.agent.transactions.domain.dto.CommissionWallet;
import ai.kudi.agent.transactions.domain.dto.Method;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.PreferenceActivity;
import com.trello.rxlifecycle2.p190e.p191a.p192a.C7390a;
import java.util.Date;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11680b;
/* compiled from: TransactionCommissionsFragment.kt */
@Metadata(m10422d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 )2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001)B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003H\u0014J\b\u0010\u0018\u001a\u00020\u0002H\u0014J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J$\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0017J\b\u0010(\u001a\u00020\u0016H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006*"}, m10421d2 = {"Lai/kudi/agent/transactioncommissions/ui/TransactionCommissionsFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/transactioncommissions/presentation/TransactionCommissionsViewModel;", "Lai/kudi/agent/transactionhistory/presentation/viewstate/TransactionsViewState;", "Lai/kudi/agent/databinding/FragmentTransactionCommissionsBinding;", "()V", "appVersionCode", "", "filteredDate", "Lai/kudi/agent/filter/domain/FilteredDate;", "viewModel", "getViewModel", "()Lai/kudi/agent/transactioncommissions/presentation/TransactionCommissionsViewModel;", "setViewModel", "(Lai/kudi/agent/transactioncommissions/presentation/TransactionCommissionsViewModel;)V", Method.WALLET, "Lai/kudi/agent/transactions/domain/dto/CommissionWallet;", "getWallet", "()Lai/kudi/agent/transactions/domain/dto/CommissionWallet;", "wallet$delegate", "Lkotlin/Lazy;", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setUpTransactionsView", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactioncommissions.ui.TransactionCommissionsFragment */
/* loaded from: classes.dex */
public final class TransactionCommissionsFragment extends BaseMVVMViewBindingFragment<TransactionCommissionsViewModel, TransactionsViewState, FragmentTransactionCommissionsBinding> {
    public static final String BUNDLE_KEY_WALLET_ID = "BUNDLE_KEY_WALLET";
    public static final Companion Companion;
    private final String appVersionCode;
    private FilteredDate filteredDate;
    public TransactionCommissionsViewModel viewModel;
    private final InterfaceC11824h wallet$delegate;

    /* compiled from: TransactionCommissionsFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/transactioncommissions/ui/TransactionCommissionsFragment$Companion;", "", "()V", "BUNDLE_KEY_WALLET_ID", "", "newInstance", "Lai/kudi/agent/transactioncommissions/ui/TransactionCommissionsFragment;", Method.WALLET, "Lai/kudi/agent/transactions/domain/dto/CommissionWallet;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transactioncommissions.ui.TransactionCommissionsFragment$Companion */
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
        public final TransactionCommissionsFragment newInstance(CommissionWallet commissionWallet) {
            Log_OC.getArray(commissionWallet, Method.WALLET);
            Bundle $r2 = new Bundle();
            $r2.putParcelable(TransactionCommissionsFragment.BUNDLE_KEY_WALLET_ID, commissionWallet);
            TransactionCommissionsFragment $r3 = new TransactionCommissionsFragment();
            $r3.setArguments($r2);
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
    public TransactionCommissionsFragment() {
        InterfaceC11824h $r5;
        Date $r2 = new Date();
        Date $r22 = DateExtKt.addDaysToDate($r2, -30);
        Date $r3 = new Date();
        FilteredDate $r1 = new FilteredDate($r22, $r3);
        this.filteredDate = $r1;
        this.appVersionCode = "6733";
        TransactionCommissionsFragment$wallet$2 $r4 = new TransactionCommissionsFragment$wallet$2(this);
        $r5 = C13218k.m5625b($r4);
        this.wallet$delegate = $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final CommissionWallet getWallet() {
        InterfaceC11824h $r2 = this.wallet$delegate;
        Object $r1 = $r2.getValue();
        CommissionWallet $r3 = (CommissionWallet) $r1;
        return $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m40991onViewCreated$lambda0(TransactionCommissionsFragment transactionCommissionsFragment, String str) {
        Log_OC.getArray(transactionCommissionsFragment, "this$0");
        FragmentActivity $r1 = transactionCommissionsFragment.requireActivity();
        Log_OC.loadImage($r1, "requireActivity()");
        ContextExtKt.toast$default($r1, str, 0, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m40992onViewCreated$lambda1(Throwable th) {
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setUpTransactionsView() {
        InterfaceC8209a $r1 = requireBinding();
        FragmentTransactionCommissionsBinding $r2 = (FragmentTransactionCommissionsBinding) $r1;
        TransactionsView $r3 = $r2.commissionsTransactionView;
        TransactionCommissionsFragment$setUpTransactionsView$1$1 $r4 = new TransactionCommissionsFragment$setUpTransactionsView$1$1(this);
        $r3.setOnTransactionItemClicked($r4);
        TransactionsView $r32 = $r2.commissionsTransactionView;
        EditText $r5 = $r32.getSearchField();
        ViewExtKt.hide$default($r5, false, 1, null);
        TransactionsView $r33 = $r2.commissionsTransactionView;
        TransactionCommissionsFragment$setUpTransactionsView$1$2 $r6 = new TransactionCommissionsFragment$setUpTransactionsView$1$2(this);
        $r33.setOnLoadMore($r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        TransactionsViewState $r2 = (TransactionsViewState) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(TransactionsViewState transactionsViewState) {
        Log_OC.getArray(transactionsViewState, "viewData");
        InterfaceC8209a $r2 = requireBinding();
        FragmentTransactionCommissionsBinding $r3 = (FragmentTransactionCommissionsBinding) $r2;
        TransactionsView $r4 = $r3.commissionsTransactionView;
        Log_OC.loadImage($r4, "requireBinding().commissionsTransactionView");
        TransactionsView.bindData$default($r4, transactionsViewState, false, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        TransactionCommissionsViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public TransactionCommissionsViewModel createViewModel() {
        TransactionCommissionsViewModel $r1 = getViewModel();
        return $r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return TransactionCommissionsViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public final TransactionCommissionsViewModel getViewModel() {
        TransactionCommissionsViewModel $r1 = this.viewModel;
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
            NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.transactioncommissions.ui.TransactionCommissionsActivity");
            throw $r5;
        }
        TransactionCommissionsActivity $r3 = (TransactionCommissionsActivity) $r2;
        TransactionCommissionsSubComponent $r4 = $r3.getActivitySubComponent();
        $r4.inject(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentTransactionCommissionsBinding $r4 = FragmentTransactionCommissionsBinding.inflate(layoutInflater, viewGroup, false);
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
        super.onViewCreated(view, bundle);
        setUpTransactionsView();
        if (getWallet() != null) {
            TransactionCommissionsViewModel $r5 = getViewModel();
            CommissionWallet $r4 = getWallet();
            Log_OC.append($r4);
            String $r6 = $r4.getId();
            FilteredDate $r7 = this.filteredDate;
            String $r1 = this.appVersionCode;
            $r5.onLoadData($r6, $r7, $r1);
        }
        TransactionCommissionsViewModel $r52 = getViewModel();
        C11680b $r8 = $r52.getToastMessage();
        PreferenceActivity $r9 = getViewLifecycleOwner();
        Log_OC.loadImage($r9, "viewLifecycleOwner");
        AbstractC11688p $r10 = C7390a.a($r8, $r9);
        Object object = new Object() { // from class: ai.kudi.agent.transactioncommissions.ui.Socks5BytestreamRequest
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransactionCommissionsFragment $r12 = TransactionCommissionsFragment.this;
                String $r3 = (String) obj;
                TransactionCommissionsFragment.m40991onViewCreated$lambda0($r12, $r3);
            }
        };
        Configuration $r12 = Configuration.LOG_TAG;
        $r10.e0(object, $r12);
    }

    public final void setViewModel(TransactionCommissionsViewModel transactionCommissionsViewModel) {
        Log_OC.getArray(transactionCommissionsViewModel, "<set-?>");
        this.viewModel = transactionCommissionsViewModel;
    }
}

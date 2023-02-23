package ai.kudi.agent.transactionhistory.p031ui.view;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.FragmentTransactionsBinding;
import ai.kudi.agent.filter.domain.FilteredDate;
import ai.kudi.agent.home.HomeActivity;
import ai.kudi.agent.outlet_mgt.activities.OutletMgtActivity;
import ai.kudi.agent.outlet_mgt.game.components.OutletMgtSubComponent;
import ai.kudi.agent.transactionhistory.data.model.TransactionHistoryScope;
import ai.kudi.agent.transactionhistory.p031ui.bottomsheet.TransactionsOptionMenuBottomSheet;
import ai.kudi.agent.transactionhistory.p031ui.view.FilterTransactionsFragment;
import ai.kudi.agent.transactionhistory.p031ui.widget.TransactionsView;
import ai.kudi.agent.transactionhistory.presentation.TransactionsViewModel;
import ai.kudi.agent.transactionhistory.presentation.viewstate.TransactionsViewState;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.DialogC0964i;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.PreferenceActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.trello.rxlifecycle2.p190e.p191a.p192a.C7390a;
import dagger.android.p197e.C7429a;
import java.util.Date;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11680b;
/* compiled from: TransactionsFragment.kt */
@Metadata(m10422d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 (2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001(B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0014J\b\u0010\u0014\u001a\u00020\u0002H\u0014J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0014J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010#\u001a\u00020\u0012H\u0016J\u001a\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0017J\b\u0010&\u001a\u00020\u0012H\u0002J\b\u0010'\u001a\u00020\u0012H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006)"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/ui/view/TransactionsFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/transactionhistory/presentation/TransactionsViewModel;", "Lai/kudi/agent/transactionhistory/presentation/viewstate/TransactionsViewState;", "Lai/kudi/agent/databinding/FragmentTransactionsBinding;", "()V", "bottomSheet", "Lai/kudi/agent/transactionhistory/ui/bottomsheet/TransactionsOptionMenuBottomSheet;", "filteredDate", "Lai/kudi/agent/filter/domain/FilteredDate;", "transactionHistoryScope", "Lai/kudi/agent/transactionhistory/data/model/TransactionHistoryScope;", "viewModel", "getViewModel", "()Lai/kudi/agent/transactionhistory/presentation/TransactionsViewModel;", "setViewModel", "(Lai/kudi/agent/transactionhistory/presentation/TransactionsViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onViewCreated", "view", "setUpTransactionsView", "setupFilter", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactionhistory.ui.view.TransactionsFragment */
/* loaded from: classes.dex */
public final class TransactionsFragment extends BaseMVVMViewBindingFragment<TransactionsViewModel, TransactionsViewState, FragmentTransactionsBinding> {
    public static final Companion Companion;
    private TransactionsOptionMenuBottomSheet bottomSheet;
    private FilteredDate filteredDate;
    private TransactionHistoryScope transactionHistoryScope;
    public TransactionsViewModel viewModel;

    /* compiled from: TransactionsFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/ui/view/TransactionsFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/transactionhistory/ui/view/TransactionsFragment;", "transactionHistoryScope", "Lai/kudi/agent/transactionhistory/data/model/TransactionHistoryScope;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transactionhistory.ui.view.TransactionsFragment$Companion */
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
        public static /* synthetic */ TransactionsFragment newInstance$default(Companion companion, TransactionHistoryScope $r3, int i, Object obj) {
            int $i0 = i & 1;
            if ($i0 != 0) {
                $r3 = TransactionHistoryScope.AllTransactions.INSTANCE;
            }
            TransactionsFragment $r1 = companion.newInstance($r3);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TransactionsFragment newInstance(TransactionHistoryScope transactionHistoryScope) {
            Log_OC.getArray(transactionHistoryScope, "transactionHistoryScope");
            Bundle $r2 = new Bundle();
            $r2.putParcelable(TransactionsContainerFragment.BUNDLE_KEY_HISTORY_SCOPE, transactionHistoryScope);
            TransactionsFragment $r3 = new TransactionsFragment();
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
    public TransactionsFragment() {
        Date $r1 = new Date();
        Date $r12 = DateExtKt.addDaysToDate($r1, -30);
        Date $r3 = new Date();
        FilteredDate $r2 = new FilteredDate($r12, $r3);
        this.filteredDate = $r2;
        TransactionHistoryScope.AllTransactions $r4 = TransactionHistoryScope.AllTransactions.INSTANCE;
        this.transactionHistoryScope = $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m41082onViewCreated$lambda1(TransactionsFragment transactionsFragment, String str) {
        Log_OC.getArray(transactionsFragment, "this$0");
        FragmentActivity $r1 = transactionsFragment.requireActivity();
        Log_OC.loadImage($r1, "requireActivity()");
        ContextExtKt.toast$default($r1, str, 0, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-2  reason: not valid java name */
    public static final void m41083onViewCreated$lambda2(Throwable th) {
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-4$lambda-3  reason: not valid java name */
    public static final void m41084onViewCreated$lambda4$lambda3(TransactionsFragment transactionsFragment, SwipeRefreshLayout swipeRefreshLayout) {
        Log_OC.getArray(transactionsFragment, "this$0");
        Log_OC.getArray(swipeRefreshLayout, "$this_apply");
        TransactionsViewModel $r2 = transactionsFragment.getViewModel();
        FilteredDate $r1 = transactionsFragment.filteredDate;
        TransactionHistoryScope $r4 = transactionsFragment.transactionHistoryScope;
        $r2.onLoadData($r1, $r4, true);
        swipeRefreshLayout.setRefreshing(false);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setUpTransactionsView() {
        InterfaceC8209a $r1 = requireBinding();
        FragmentTransactionsBinding $r2 = (FragmentTransactionsBinding) $r1;
        TransactionsView $r3 = $r2.transactionsView;
        TransactionsFragment$setUpTransactionsView$1$1 $r4 = new TransactionsFragment$setUpTransactionsView$1$1(this);
        $r3.setOnSummaryItemClicked($r4);
        TransactionsFragment$setUpTransactionsView$1$2 $r5 = new TransactionsFragment$setUpTransactionsView$1$2($r3, this);
        $r3.setOnTransactionItemClicked($r5);
        EditText $r6 = $r3.getSearchField();
        ViewExtKt.hide$default($r6, false, 1, null);
        TransactionsFragment$setUpTransactionsView$1$3 $r7 = new TransactionsFragment$setUpTransactionsView$1$3(this);
        $r3.setOnLoadMore($r7);
        Button $r8 = $r3.getIncompleteTransactionsButton();
        $r8.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactionhistory.ui.view.s
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransactionsFragment $r22 = TransactionsFragment.this;
                TransactionsFragment.m41085setUpTransactionsView$lambda6$lambda5($r22, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpTransactionsView$lambda-6$lambda-5  reason: not valid java name */
    public static final void m41085setUpTransactionsView$lambda6$lambda5(TransactionsFragment transactionsFragment, View view) {
        Log_OC.getArray(transactionsFragment, "this$0");
        TransactionsViewModel $r0 = transactionsFragment.getViewModel();
        TransactionHistoryScope $r3 = transactionsFragment.transactionHistoryScope;
        $r0.onOpenIncompleteTransactions($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setupFilter() {
        InterfaceC8209a $r2 = requireBinding();
        FragmentTransactionsBinding $r3 = (FragmentTransactionsBinding) $r2;
        TextView $r4 = $r3.filterView;
        TextView r6 = $r4;
        r6.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactionhistory.ui.view.SettingsActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransactionsFragment $r22 = TransactionsFragment.this;
                TransactionsFragment.m41086setupFilter$lambda7($r22, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupFilter$lambda-7  reason: not valid java name */
    public static final void m41086setupFilter$lambda7(TransactionsFragment transactionsFragment, View view) {
        Log_OC.getArray(transactionsFragment, "this$0");
        FilterTransactionsFragment.Companion $r2 = FilterTransactionsFragment.Companion;
        TransactionHistoryScope $r3 = transactionsFragment.transactionHistoryScope;
        String $r4 = transactionsFragment.getString(C0001R.string.successful_transactions);
        Log_OC.loadImage($r4, "getString(R.string.successful_transactions)");
        FilterTransactionsFragment $r5 = $r2.newInstance($r3, $r4);
        FragmentManager $r6 = transactionsFragment.getChildFragmentManager();
        $r5.show($r6, FilterTransactionsFragment.PAGE_KEY);
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
        FragmentTransactionsBinding $r3 = (FragmentTransactionsBinding) $r2;
        TransactionsView $r4 = $r3.transactionsView;
        Log_OC.loadImage($r4, "requireBinding().transactionsView");
        TransactionsView.bindData$default($r4, transactionsViewState, false, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        TransactionsViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public TransactionsViewModel createViewModel() {
        TransactionsViewModel $r1 = getViewModel();
        return $r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return TransactionsViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public final TransactionsViewModel getViewModel() {
        TransactionsViewModel $r1 = this.viewModel;
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
        FragmentActivity $r2 = getActivity();
        boolean $z0 = $r2 instanceof HomeActivity;
        if ($z0) {
            C7429a.m18752b(this);
        }
        super.onAttach(context);
        FragmentActivity $r22 = getActivity();
        boolean $z02 = $r22 instanceof OutletMgtActivity;
        if ($z02) {
            FragmentActivity $r23 = getActivity();
            if ($r23 == null) {
                NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.outlet_mgt.activities.OutletMgtActivity");
                throw $r5;
            }
            OutletMgtActivity $r3 = (OutletMgtActivity) $r23;
            OutletMgtSubComponent $r4 = $r3.getOutletMgtSubComponent();
            $r4.inject(this);
        }
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
        Parcelable $r2 = $r1.getParcelable(TransactionsContainerFragment.BUNDLE_KEY_HISTORY_SCOPE);
        TransactionHistoryScope $r3 = (TransactionHistoryScope) $r2;
        if ($r3 == null) {
            $r3 = TransactionHistoryScope.AllTransactions.INSTANCE;
        }
        Log_OC.loadImage($r3, "it.getParcelable<TransactionHistoryScope>(TransactionsContainerFragment.BUNDLE_KEY_HISTORY_SCOPE)\n                    ?: TransactionHistoryScope.AllTransactions");
        this.transactionHistoryScope = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentTransactionsBinding $r4 = FragmentTransactionsBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        DialogC0964i $r1 = this.bottomSheet;
        if ($r1 != null) {
            DialogC0964i r2 = $r1;
            r2.dismiss();
        }
        super.onDestroy();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        TransactionsViewModel $r5 = getViewModel();
        FilteredDate $r1 = this.filteredDate;
        TransactionHistoryScope $r2 = this.transactionHistoryScope;
        TransactionsViewModel.onLoadData$default($r5, $r1, $r2, false, 4, null);
        setupFilter();
        setUpTransactionsView();
        TransactionsViewModel $r52 = getViewModel();
        C11680b $r6 = $r52.getToastMessage();
        PreferenceActivity $r7 = getViewLifecycleOwner();
        Log_OC.loadImage($r7, "viewLifecycleOwner");
        AbstractC11688p $r8 = C7390a.a($r6, $r7);
        Object object = new Object() { // from class: ai.kudi.agent.transactionhistory.ui.view.FlingerListView$ItemFlingerResponder
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransactionsFragment $r12 = TransactionsFragment.this;
                String $r3 = (String) obj;
                TransactionsFragment.m41082onViewCreated$lambda1($r12, $r3);
            }
        };
        Logger $r10 = Logger.log;
        $r8.e0(object, $r10);
        InterfaceC8209a $r11 = requireBinding();
        FragmentTransactionsBinding $r12 = (FragmentTransactionsBinding) $r11;
        final SwipeRefreshLayout $r13 = $r12.transactionsSwipeRefreshView;
        $r13.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC1879j() { // from class: ai.kudi.agent.transactionhistory.ui.view.Main$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC1879j
            public final void onRefresh() {
                TransactionsFragment $r14 = TransactionsFragment.this;
                SwipeRefreshLayout $r22 = $r13;
                TransactionsFragment.m41084onViewCreated$lambda4$lambda3($r14, $r22);
            }
        });
    }

    public final void setViewModel(TransactionsViewModel transactionsViewModel) {
        Log_OC.getArray(transactionsViewModel, "<set-?>");
        this.viewModel = transactionsViewModel;
    }
}

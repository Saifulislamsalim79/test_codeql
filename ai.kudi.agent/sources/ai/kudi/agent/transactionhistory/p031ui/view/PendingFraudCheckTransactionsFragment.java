package ai.kudi.agent.transactionhistory.p031ui.view;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.databinding.EmptyHistoryBinding;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.FragmentPendingFraudCheckTransactionsBinding;
import ai.kudi.agent.filter.domain.FilteredDate;
import ai.kudi.agent.filter.p005ui.DateFilterFragment;
import ai.kudi.agent.transactionhistory.data.model.TransactionHistoryScope;
import ai.kudi.agent.transactionhistory.labs.IncompleteTransactionsSubComponent;
import ai.kudi.agent.transactionhistory.p031ui.adapter.TransactionsAdapter;
import ai.kudi.agent.transactionhistory.presentation.PendingFraudCheckTransactionsViewModel;
import ai.kudi.agent.transactionhistory.presentation.viewstate.PendingFraudCheckTransactionsViewState;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import androidx.lifecycle.PreferenceActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: PendingFraudCheckTransactionsFragment.kt */
@Metadata(m10422d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 12\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00011B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003H\u0014J\b\u0010\u001d\u001a\u00020\u0002H\u0014J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0014J\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"H\u0016J\u0012\u0010#\u001a\u00020\u001b2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J$\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020'2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010.\u001a\u00020\u001bH\u0002J\b\u0010/\u001a\u00020\u001bH\u0002J\b\u00100\u001a\u00020\u001bH\u0002R\u001c\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\n \b*\u0004\u0018\u00010\u000e0\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u00062"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/ui/view/PendingFraudCheckTransactionsFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/transactionhistory/presentation/PendingFraudCheckTransactionsViewModel;", "Lai/kudi/agent/transactionhistory/presentation/viewstate/PendingFraudCheckTransactionsViewState;", "Lai/kudi/agent/databinding/FragmentPendingFraudCheckTransactionsBinding;", "()V", "emptyHistoryTextView", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getEmptyHistoryTextView", "()Landroid/widget/TextView;", "filteredDate", "Lai/kudi/agent/filter/domain/FilteredDate;", "shimmerLoaderList", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "getShimmerLoaderList", "()Lcom/facebook/shimmer/ShimmerFrameLayout;", "transactionHistoryScope", "Lai/kudi/agent/transactionhistory/data/model/TransactionHistoryScope;", "transactionsAdapter", "Lai/kudi/agent/transactionhistory/ui/adapter/TransactionsAdapter;", "viewModel", "getViewModel", "()Lai/kudi/agent/transactionhistory/presentation/PendingFraudCheckTransactionsViewModel;", "setViewModel", "(Lai/kudi/agent/transactionhistory/presentation/PendingFraudCheckTransactionsViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setUpAdapter", "setupFilter", "updateDateIntervalText", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactionhistory.ui.view.PendingFraudCheckTransactionsFragment */
/* loaded from: classes.dex */
public final class PendingFraudCheckTransactionsFragment extends BaseMVVMViewBindingFragment<PendingFraudCheckTransactionsViewModel, PendingFraudCheckTransactionsViewState, FragmentPendingFraudCheckTransactionsBinding> {
    public static final Companion Companion;
    private FilteredDate filteredDate;
    private TransactionHistoryScope transactionHistoryScope;
    private TransactionsAdapter transactionsAdapter;
    public PendingFraudCheckTransactionsViewModel viewModel;

    /* compiled from: PendingFraudCheckTransactionsFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/ui/view/PendingFraudCheckTransactionsFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/transactionhistory/ui/view/PendingFraudCheckTransactionsFragment;", "transactionHistoryScope", "Lai/kudi/agent/transactionhistory/data/model/TransactionHistoryScope;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transactionhistory.ui.view.PendingFraudCheckTransactionsFragment$Companion */
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
        public final PendingFraudCheckTransactionsFragment newInstance(TransactionHistoryScope transactionHistoryScope) {
            Bundle $r1 = new Bundle();
            $r1.putParcelable(TransactionsContainerFragment.BUNDLE_KEY_HISTORY_SCOPE, transactionHistoryScope);
            PendingFraudCheckTransactionsFragment $r3 = new PendingFraudCheckTransactionsFragment();
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
    public PendingFraudCheckTransactionsFragment() {
        Date $r1 = new Date();
        Date $r12 = DateExtKt.addDaysToDate($r1, -30);
        Date $r3 = new Date();
        FilteredDate $r2 = new FilteredDate($r12, $r3);
        this.filteredDate = $r2;
        TransactionHistoryScope.AllTransactions $r4 = TransactionHistoryScope.AllTransactions.INSTANCE;
        this.transactionHistoryScope = $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final TextView getEmptyHistoryTextView() {
        View $r1 = requireView();
        TextView $r2 = (TextView) $r1.findViewById(C0001R.C0003id.emptyHistoryTextView);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final ShimmerFrameLayout getShimmerLoaderList() {
        View $r1 = requireView();
        ShimmerFrameLayout $r2 = (ShimmerFrameLayout) $r1.findViewById(C0001R.C0003id.shimmerLoaderList);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setUpAdapter() {
        PendingFraudCheckTransactionsFragment$setUpAdapter$1 r10 = new PendingFraudCheckTransactionsFragment$setUpAdapter$1(this);
        TransactionsAdapter r11 = new TransactionsAdapter(r10);
        this.transactionsAdapter = r11;
        InterfaceC8209a $r3 = requireBinding();
        FragmentPendingFraudCheckTransactionsBinding $r4 = (FragmentPendingFraudCheckTransactionsBinding) $r3;
        RecyclerView $r5 = $r4.transactionList;
        RecyclerView r14 = $r5;
        Context $r7 = r14.getContext();
        LinearLayoutManager r12 = new LinearLayoutManager($r7);
        $r5.setLayoutManager(r12);
        TransactionsAdapter $r1 = this.transactionsAdapter;
        if ($r1 != null) {
            $r5.setAdapter($r1);
            $r5.m35282l(new RecyclerView.AbstractC1644u() { // from class: ai.kudi.agent.transactionhistory.ui.view.PendingFraudCheckTransactionsFragment$setUpAdapter$2$1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1644u
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    Log_OC.getArray(recyclerView, "recyclerView");
                    super.onScrollStateChanged(recyclerView, i);
                    RecyclerView r5 = recyclerView;
                    boolean $z0 = r5.canScrollVertically(1);
                    if ($z0) {
                        return;
                    }
                    PendingFraudCheckTransactionsFragment $r2 = PendingFraudCheckTransactionsFragment.this;
                    PendingFraudCheckTransactionsViewModel $r32 = $r2.getViewModel();
                    PendingFraudCheckTransactionsFragment $r22 = PendingFraudCheckTransactionsFragment.this;
                    TransactionHistoryScope $r42 = $r22.transactionHistoryScope;
                    $r32.onLoadMore($r42);
                }
            });
            return;
        }
        Log_OC.LogError("transactionsAdapter");
        NullPointerException r9 = new NullPointerException("Null throw statement replaced by Soot");
        throw r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setupFilter() {
        updateDateIntervalText();
        InterfaceC1523w interfaceC1523w = new InterfaceC1523w() { // from class: ai.kudi.agent.transactionhistory.ui.view.ByteVector
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.fragment.app.InterfaceC1523w
            /* renamed from: a */
            public final void mo35611a(String str, Bundle bundle) {
                PendingFraudCheckTransactionsFragment $r3 = PendingFraudCheckTransactionsFragment.this;
                PendingFraudCheckTransactionsFragment.m41078setupFilter$lambda3($r3, str, bundle);
            }
        };
        FragmentManager $r2 = getChildFragmentManager();
        PreferenceActivity $r3 = getViewLifecycleOwner();
        $r2.p1(DateFilterFragment.RESULT_KEY_FILTERED_DATE, $r3, interfaceC1523w);
        InterfaceC8209a $r4 = requireBinding();
        FragmentPendingFraudCheckTransactionsBinding $r5 = (FragmentPendingFraudCheckTransactionsBinding) $r4;
        TextView $r6 = $r5.filterView;
        TextView r10 = $r6;
        r10.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactionhistory.ui.view.l
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PendingFraudCheckTransactionsFragment $r22 = PendingFraudCheckTransactionsFragment.this;
                PendingFraudCheckTransactionsFragment.m41079setupFilter$lambda4($r22, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupFilter$lambda-3  reason: not valid java name */
    public static final void m41078setupFilter$lambda3(PendingFraudCheckTransactionsFragment pendingFraudCheckTransactionsFragment, String str, Bundle bundle) {
        Log_OC.getArray(pendingFraudCheckTransactionsFragment, "this$0");
        Log_OC.getArray(str, "requestKey");
        Log_OC.getArray(bundle, "result");
        boolean $z0 = Log_OC.append(str, DateFilterFragment.RESULT_KEY_FILTERED_DATE);
        if ($z0) {
            Serializable $r3 = bundle.getSerializable(DateFilterFragment.RESULT_KEY_FILTERED_DATE);
            boolean $z02 = $r3 instanceof FilteredDate;
            FilteredDate $r4 = $z02 ? (FilteredDate) $r3 : null;
            if ($r4 == null) {
                return;
            }
            pendingFraudCheckTransactionsFragment.filteredDate = $r4;
            pendingFraudCheckTransactionsFragment.updateDateIntervalText();
            PendingFraudCheckTransactionsViewModel $r5 = pendingFraudCheckTransactionsFragment.getViewModel();
            FilteredDate $r42 = pendingFraudCheckTransactionsFragment.filteredDate;
            TransactionHistoryScope $r6 = pendingFraudCheckTransactionsFragment.transactionHistoryScope;
            $r5.onLoadData($r42, $r6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupFilter$lambda-4  reason: not valid java name */
    public static final void m41079setupFilter$lambda4(PendingFraudCheckTransactionsFragment pendingFraudCheckTransactionsFragment, View view) {
        Log_OC.getArray(pendingFraudCheckTransactionsFragment, "this$0");
        DateFilterFragment.Companion $r2 = DateFilterFragment.Companion;
        DateFilterFragment $r3 = $r2.newInstance();
        FragmentManager $r4 = pendingFraudCheckTransactionsFragment.getChildFragmentManager();
        Chapter r5 = (Chapter) $r3;
        r5.show($r4, DateFilterFragment.PAGE_KEY);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void updateDateIntervalText() {
        FilteredDate $r1 = this.filteredDate;
        Date $r2 = $r1.getFrom();
        FilteredDate $r12 = this.filteredDate;
        Date $r3 = $r12.getTo();
        String $r4 = DateExtKt.getDateDiff$default($r2, $r3, 0, null, 8, null);
        InterfaceC8209a $r5 = requireBinding();
        AppCompatTextView $r7 = ((FragmentPendingFraudCheckTransactionsBinding) $r5).filterView;
        $r7.setText($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        PendingFraudCheckTransactionsViewState $r2 = (PendingFraudCheckTransactionsViewState) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(PendingFraudCheckTransactionsViewState pendingFraudCheckTransactionsViewState) {
        Log_OC.getArray(pendingFraudCheckTransactionsViewState, "viewData");
        InterfaceC8209a $r2 = requireBinding();
        FragmentPendingFraudCheckTransactionsBinding $r3 = (FragmentPendingFraudCheckTransactionsBinding) $r2;
        boolean $z0 = pendingFraudCheckTransactionsViewState.getShowEmptyListView();
        if ($z0) {
            EmptyHistoryBinding $r4 = $r3.emptyHistoryView;
            View $r5 = $r4.getRoot();
            Log_OC.loadImage($r5, "emptyHistoryView.root");
            View r12 = $r5;
            ViewExtKt.show(r12);
        } else {
            EmptyHistoryBinding $r42 = $r3.emptyHistoryView;
            View $r52 = $r42.getRoot();
            Log_OC.loadImage($r52, "emptyHistoryView.root");
            View r122 = $r52;
            ViewExtKt.hide$default(r122, false, 1, null);
        }
        boolean $z02 = pendingFraudCheckTransactionsViewState.isLoadingTransactions();
        if ($z02) {
            View $r6 = getShimmerLoaderList();
            Log_OC.loadImage($r6, "shimmerLoaderList");
            View r123 = $r6;
            ViewExtKt.show(r123);
            View $r7 = $r3.transactionList;
            Log_OC.loadImage($r7, "transactionList");
            View r124 = $r7;
            ViewExtKt.hide$default(r124, false, 1, null);
        } else {
            View $r62 = getShimmerLoaderList();
            Log_OC.loadImage($r62, "shimmerLoaderList");
            View r125 = $r62;
            ViewExtKt.hide$default(r125, false, 1, null);
            View $r72 = $r3.transactionList;
            Log_OC.loadImage($r72, "transactionList");
            View r126 = $r72;
            ViewExtKt.show(r126);
        }
        boolean $z03 = pendingFraudCheckTransactionsViewState.isLoadingMore();
        if ($z03) {
            FrameLayout $r8 = $r3.nextProgressBar;
            Log_OC.loadImage($r8, "nextProgressBar");
            ViewExtKt.show($r8);
        } else {
            FrameLayout $r82 = $r3.nextProgressBar;
            Log_OC.loadImage($r82, "nextProgressBar");
            ViewExtKt.hide$default($r82, false, 1, null);
        }
        TransactionsAdapter $r9 = this.transactionsAdapter;
        if ($r9 != null) {
            List $r10 = pendingFraudCheckTransactionsViewState.getTransactions();
            $r9.setItems($r10);
            return;
        }
        Log_OC.LogError("transactionsAdapter");
        NullPointerException r11 = new NullPointerException("Null throw statement replaced by Soot");
        throw r11;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        PendingFraudCheckTransactionsViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public PendingFraudCheckTransactionsViewModel createViewModel() {
        PendingFraudCheckTransactionsViewModel $r1 = getViewModel();
        return $r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return PendingFraudCheckTransactionsViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public final PendingFraudCheckTransactionsViewModel getViewModel() {
        PendingFraudCheckTransactionsViewModel $r1 = this.viewModel;
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
            NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.transactionhistory.ui.view.IncompleteTransactionsActivity");
            throw $r5;
        }
        IncompleteTransactionsActivity $r3 = (IncompleteTransactionsActivity) $r2;
        IncompleteTransactionsSubComponent $r4 = $r3.getSubComponent();
        $r4.inject(this);
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
        this.transactionHistoryScope = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentPendingFraudCheckTransactionsBinding $r4 = FragmentPendingFraudCheckTransactionsBinding.inflate(layoutInflater, viewGroup, false);
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
        TextView $r3 = getEmptyHistoryTextView();
        String $r4 = getString(C0001R.string.pending_verifcation_empty_history_message);
        $r3.setText($r4);
        PendingFraudCheckTransactionsViewModel $r5 = getViewModel();
        FilteredDate $r6 = this.filteredDate;
        TransactionHistoryScope $r7 = this.transactionHistoryScope;
        $r5.onLoadData($r6, $r7);
        setupFilter();
        setUpAdapter();
    }

    public final void setViewModel(PendingFraudCheckTransactionsViewModel pendingFraudCheckTransactionsViewModel) {
        Log_OC.getArray(pendingFraudCheckTransactionsViewModel, "<set-?>");
        this.viewModel = pendingFraudCheckTransactionsViewModel;
    }
}

package ai.kudi.agent.transactioncommissions.p030ui;

import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.FragmentFilterCommissionsBinding;
import ai.kudi.agent.filter.domain.FilteredDate;
import ai.kudi.agent.filter.p005ui.DateFilterFragment;
import ai.kudi.agent.transactioncommissions.labs.TransactionCommissionsSubComponent;
import ai.kudi.agent.transactioncommissions.presentation.FilterCommissionsViewModel;
import ai.kudi.agent.transactionhistory.p031ui.widget.TransactionsView;
import ai.kudi.agent.transactionhistory.presentation.viewstate.TransactionsViewState;
import ai.kudi.dip.library.p043h.DialogC0809i;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import androidx.lifecycle.PreferenceActivity;
import com.trello.rxlifecycle2.p190e.p191a.p192a.C7390a;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13722p;
import p201g.p270x.InterfaceC8209a;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11680b;
/* compiled from: FilterCommissionsFragment.kt */
@Metadata(m10422d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 02\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00010B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003H\u0014J\b\u0010\u001c\u001a\u00020\u0002H\u0014J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001eH\u0014J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!H\u0016J&\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\u001aH\u0002J\u001a\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020#2\b\u0010(\u001a\u0004\u0018\u00010)H\u0017J\b\u0010-\u001a\u00020\u001aH\u0002J\b\u0010.\u001a\u00020\u001aH\u0002J\b\u0010/\u001a\u00020\u001aH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R'\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0016\u0010\u0017¨\u00061"}, m10421d2 = {"Lai/kudi/agent/transactioncommissions/ui/FilterCommissionsFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/transactioncommissions/presentation/FilterCommissionsViewModel;", "Lai/kudi/agent/transactionhistory/presentation/viewstate/TransactionsViewState;", "Lai/kudi/agent/databinding/FragmentFilterCommissionsBinding;", "()V", "appVersionCode", "", "commissionTypes", "", "getCommissionTypes", "()Ljava/util/Map;", "commissionTypes$delegate", "Lkotlin/Lazy;", "filteredDate", "Lai/kudi/agent/filter/domain/FilteredDate;", "viewModel", "getViewModel", "()Lai/kudi/agent/transactioncommissions/presentation/FilterCommissionsViewModel;", "setViewModel", "(Lai/kudi/agent/transactioncommissions/presentation/FilterCommissionsViewModel;)V", "walletId", "getWalletId", "()Ljava/lang/String;", "walletId$delegate", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onFilter", "onViewCreated", "view", "setUpTransactionsView", "setupFilter", "updateDateIntervalText", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactioncommissions.ui.FilterCommissionsFragment */
/* loaded from: classes.dex */
public final class FilterCommissionsFragment extends BaseMVVMViewBindingFragment<FilterCommissionsViewModel, TransactionsViewState, FragmentFilterCommissionsBinding> {
    public static final Companion Companion;
    private final String appVersionCode;
    private final InterfaceC11824h commissionTypes$delegate;
    private FilteredDate filteredDate;
    public FilterCommissionsViewModel viewModel;
    private final InterfaceC11824h walletId$delegate;

    /* compiled from: FilterCommissionsFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/transactioncommissions/ui/FilterCommissionsFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/transactioncommissions/ui/FilterCommissionsFragment;", "walletId", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transactioncommissions.ui.FilterCommissionsFragment$Companion */
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
        public final FilterCommissionsFragment newInstance(String str) {
            Log_OC.getArray(str, "walletId");
            Bundle $r2 = new Bundle();
            $r2.putString(TransactionCommissionsFragment.BUNDLE_KEY_WALLET_ID, str);
            FilterCommissionsFragment $r3 = new FilterCommissionsFragment();
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
    public FilterCommissionsFragment() {
        InterfaceC11824h $r5;
        InterfaceC11824h $r52;
        Date $r2 = new Date();
        Date $r22 = DateExtKt.addDaysToDate($r2, -30);
        Date $r3 = new Date();
        FilteredDate $r1 = new FilteredDate($r22, $r3);
        this.filteredDate = $r1;
        this.appVersionCode = "6733";
        FilterCommissionsFragment$walletId$2 $r4 = new FilterCommissionsFragment$walletId$2(this);
        $r5 = C13218k.m5625b($r4);
        this.walletId$delegate = $r5;
        FilterCommissionsFragment$commissionTypes$2 $r6 = new FilterCommissionsFragment$commissionTypes$2(this);
        $r52 = C13218k.m5625b($r6);
        this.commissionTypes$delegate = $r52;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Map getCommissionTypes() {
        InterfaceC11824h $r2 = this.commissionTypes$delegate;
        Object $r1 = $r2.getValue();
        Map $r3 = (Map) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final String getWalletId() {
        InterfaceC11824h $r2 = this.walletId$delegate;
        Object $r1 = $r2.getValue();
        String $r3 = (String) $r1;
        return $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onFilter() {
        FilterCommissionsViewModel $r2 = getViewModel();
        FilteredDate $r1 = this.filteredDate;
        Map $r3 = getCommissionTypes();
        InterfaceC8209a $r4 = requireBinding();
        FragmentFilterCommissionsBinding $r5 = (FragmentFilterCommissionsBinding) $r4;
        AppCompatTextView $r6 = $r5.typeFilterView;
        CharSequence $r7 = $r6.getText();
        Object $r8 = $r3.get($r7);
        String $r9 = (String) $r8;
        if ($r9 == null) {
            $r9 = "";
        }
        String $r11 = getWalletId();
        String $r10 = $r11 != null ? $r11 : "";
        $r2.onLoadData($r1, $r9, $r10, this.appVersionCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m40980onViewCreated$lambda0(FilterCommissionsFragment filterCommissionsFragment, String str) {
        Log_OC.getArray(filterCommissionsFragment, "this$0");
        Context $r1 = filterCommissionsFragment.requireContext();
        Log_OC.loadImage($r1, "requireContext()");
        ContextExtKt.toast($r1, str, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m40981onViewCreated$lambda1(Throwable th) {
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setUpTransactionsView() {
        InterfaceC8209a $r1 = requireBinding();
        FragmentFilterCommissionsBinding $r2 = (FragmentFilterCommissionsBinding) $r1;
        TransactionsView $r3 = $r2.commissionsTransactionView;
        FilterCommissionsFragment$setUpTransactionsView$1$1 $r4 = new FilterCommissionsFragment$setUpTransactionsView$1$1(this);
        $r3.setOnTransactionItemClicked($r4);
        TransactionsView $r32 = $r2.commissionsTransactionView;
        EditText $r5 = $r32.getSearchField();
        ViewExtKt.hide$default($r5, false, 1, null);
        TransactionsView $r33 = $r2.commissionsTransactionView;
        FilterCommissionsFragment$setUpTransactionsView$1$2 $r6 = new FilterCommissionsFragment$setUpTransactionsView$1$2(this);
        $r33.setOnLoadMore($r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setupFilter() {
        updateDateIntervalText();
        InterfaceC1523w interfaceC1523w = new InterfaceC1523w() { // from class: ai.kudi.agent.transactioncommissions.ui.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: c */
            public final void m38322c(String str, Bundle bundle) {
                FilterCommissionsFragment $r3 = FilterCommissionsFragment.this;
                FilterCommissionsFragment.m40982setupFilter$lambda4($r3, str, bundle);
            }
        };
        FragmentManager $r2 = getChildFragmentManager();
        PreferenceActivity $r3 = getViewLifecycleOwner();
        $r2.p1(DateFilterFragment.RESULT_KEY_FILTERED_DATE, $r3, interfaceC1523w);
        InterfaceC8209a $r4 = requireBinding();
        FragmentFilterCommissionsBinding $r5 = (FragmentFilterCommissionsBinding) $r4;
        TextView $r6 = $r5.dateFilterView;
        TextView r12 = $r6;
        r12.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactioncommissions.ui.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterCommissionsFragment $r22 = FilterCommissionsFragment.this;
                FilterCommissionsFragment.m40983setupFilter$lambda5($r22, view);
            }
        });
        InterfaceC8209a $r42 = requireBinding();
        FragmentFilterCommissionsBinding $r52 = (FragmentFilterCommissionsBinding) $r42;
        TextView $r62 = $r52.typeFilterView;
        TextView r122 = $r62;
        r122.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactioncommissions.ui.e
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterCommissionsFragment $r22 = FilterCommissionsFragment.this;
                FilterCommissionsFragment.m40984setupFilter$lambda6($r22, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupFilter$lambda-4  reason: not valid java name */
    public static final void m40982setupFilter$lambda4(FilterCommissionsFragment filterCommissionsFragment, String str, Bundle bundle) {
        Log_OC.getArray(filterCommissionsFragment, "this$0");
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
            filterCommissionsFragment.filteredDate = $r4;
            filterCommissionsFragment.updateDateIntervalText();
            filterCommissionsFragment.onFilter();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupFilter$lambda-5  reason: not valid java name */
    public static final void m40983setupFilter$lambda5(FilterCommissionsFragment filterCommissionsFragment, View view) {
        Log_OC.getArray(filterCommissionsFragment, "this$0");
        DateFilterFragment.Companion $r2 = DateFilterFragment.Companion;
        DateFilterFragment $r3 = $r2.newInstance();
        FragmentManager $r4 = filterCommissionsFragment.getChildFragmentManager();
        Chapter r5 = (Chapter) $r3;
        r5.show($r4, DateFilterFragment.PAGE_KEY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupFilter$lambda-6  reason: not valid java name */
    public static final void m40984setupFilter$lambda6(FilterCommissionsFragment filterCommissionsFragment, View view) {
        Log_OC.getArray(filterCommissionsFragment, "this$0");
        Context $r1 = filterCommissionsFragment.requireContext();
        Log_OC.loadImage($r1, "requireContext()");
        FilterCommissionsFragment$setupFilter$2$1 r5 = new FilterCommissionsFragment$setupFilter$2$1(filterCommissionsFragment);
        Dialog r6 = new DialogC0809i($r1, r5);
        Dialog r7 = r6;
        r7.show();
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
        AppCompatTextView $r7 = ((FragmentFilterCommissionsBinding) $r5).dateFilterView;
        $r7.setText($r4);
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
        FragmentFilterCommissionsBinding $r3 = (FragmentFilterCommissionsBinding) $r2;
        TransactionsView $r4 = $r3.commissionsTransactionView;
        Log_OC.loadImage($r4, "requireBinding().commissionsTransactionView");
        TransactionsView.bindData$default($r4, transactionsViewState, false, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        FilterCommissionsViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public FilterCommissionsViewModel createViewModel() {
        FilterCommissionsViewModel $r1 = getViewModel();
        return $r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return FilterCommissionsViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public final FilterCommissionsViewModel getViewModel() {
        FilterCommissionsViewModel $r1 = this.viewModel;
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
        FragmentFilterCommissionsBinding $r4 = FragmentFilterCommissionsBinding.inflate(layoutInflater, viewGroup, false);
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
        setUpTransactionsView();
        Map $r3 = getCommissionTypes();
        Set $r4 = $r3.keySet();
        Object $r5 = C13722p.m3955Q($r4);
        Log_OC.loadImage($r5, "commissionTypes.keys.first()");
        CharSequence $r6 = (String) $r5;
        InterfaceC8209a $r7 = requireBinding();
        FragmentFilterCommissionsBinding $r8 = (FragmentFilterCommissionsBinding) $r7;
        TextView $r9 = $r8.typeFilterView;
        TextView r20 = $r9;
        r20.setText($r6);
        FilterCommissionsViewModel $r10 = getViewModel();
        FilteredDate $r11 = this.filteredDate;
        Map $r32 = getCommissionTypes();
        String $r62 = (String) $r32.get($r6);
        if ($r62 == null) {
            $r62 = "";
        }
        String $r13 = getWalletId();
        String $r12 = $r13 != null ? $r13 : "";
        $r10.onLoadData($r11, $r62, $r12, this.appVersionCode);
        setupFilter();
        updateDateIntervalText();
        FilterCommissionsViewModel $r102 = getViewModel();
        C11680b $r14 = $r102.getToastMessage();
        PreferenceActivity $r15 = getViewLifecycleOwner();
        Log_OC.loadImage($r15, "viewLifecycleOwner");
        AbstractC11688p $r16 = C7390a.a($r14, $r15);
        Object object = new Object() { // from class: ai.kudi.agent.transactioncommissions.ui.FlingerListView$ItemFlingerResponder
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                FilterCommissionsFragment $r1 = FilterCommissionsFragment.this;
                String $r33 = (String) obj;
                FilterCommissionsFragment.m40980onViewCreated$lambda0($r1, $r33);
            }
        };
        Logger $r18 = Logger.log;
        $r16.e0(object, $r18);
    }

    public final void setViewModel(FilterCommissionsViewModel filterCommissionsViewModel) {
        Log_OC.getArray(filterCommissionsViewModel, "<set-?>");
        this.viewModel = filterCommissionsViewModel;
    }
}

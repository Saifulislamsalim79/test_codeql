package ai.kudi.agent.transactionhistory.p031ui.view;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.mvvm.BaseMvvmDialogFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.FragmentFilterTransactionsBinding;
import ai.kudi.agent.filter.domain.FilteredDate;
import ai.kudi.agent.filter.p005ui.DateFilterFragment;
import ai.kudi.agent.home.HomeActivity;
import ai.kudi.agent.outlet_mgt.activities.OutletMgtActivity;
import ai.kudi.agent.outlet_mgt.game.components.OutletMgtSubComponent;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.transactionhistory.data.model.TransactionHistoryScope;
import ai.kudi.agent.transactionhistory.p031ui.widget.TransactionsView;
import ai.kudi.agent.transactionhistory.presentation.FilterTransactionsViewModel;
import ai.kudi.agent.transactionhistory.presentation.viewstate.TransactionsViewState;
import ai.kudi.agent.transactions.utils.TransactionsUtilKt;
import ai.kudi.dip.library.p043h.DialogC0809i;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import androidx.lifecycle.PreferenceActivity;
import dagger.android.p197e.C7429a;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p368e.p369a.AbstractC9419a;
import p272h.p368e.p369a.p371c.C9421a;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p450e0.Object;
/* compiled from: FilterTransactionsFragment.kt */
@Metadata(m10422d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 :2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001:B\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0003H\u0014J\b\u0010!\u001a\u00020\u0002H\u0014J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020#H\u0014J\u0019\u0010$\u001a\u00020%2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010&\u001a\u00020'H\u0096\u0001J\u0010\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020*H\u0016J\u0012\u0010+\u001a\u00020\u001f2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J$\u0010.\u001a\u00020%2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u0001022\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u00103\u001a\u00020\u001fH\u0002J\u001a\u00104\u001a\u00020\u001f2\u0006\u00105\u001a\u00020%2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\t\u00106\u001a\u00020\u0005H\u0096\u0001J\b\u00107\u001a\u00020\u001fH\u0003J\b\u00108\u001a\u00020\u001fH\u0002J\b\u00109\u001a\u00020\u001fH\u0002R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006;"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/ui/view/FilterTransactionsFragment;", "Lai/kudi/agent/core/mvvm/BaseMvvmDialogFragment;", "Lai/kudi/agent/transactionhistory/presentation/FilterTransactionsViewModel;", "Lai/kudi/agent/transactionhistory/presentation/viewstate/TransactionsViewState;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/FragmentFilterTransactionsBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/databinding/FragmentFilterTransactionsBinding;", "filteredDate", "Lai/kudi/agent/filter/domain/FilteredDate;", "lastSelectedFilterStatus", "", "lastSelectedFilterType", KudiPin.KUDI_PIN_TITLE, "getTitle", "()Ljava/lang/String;", "title$delegate", "Lkotlin/Lazy;", "transactionHistoryScope", "Lai/kudi/agent/transactionhistory/data/model/TransactionHistoryScope;", "getTransactionHistoryScope", "()Lai/kudi/agent/transactionhistory/data/model/TransactionHistoryScope;", "transactionHistoryScope$delegate", "viewModel", "getViewModel", "()Lai/kudi/agent/transactionhistory/presentation/FilterTransactionsViewModel;", "setViewModel", "(Lai/kudi/agent/transactionhistory/presentation/FilterTransactionsViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onSearch", "onViewCreated", "view", "requireBinding", "setUpTransactionsView", "setupFilter", "updateDateIntervalText", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactionhistory.ui.view.FilterTransactionsFragment */
/* loaded from: classes.dex */
public final class FilterTransactionsFragment extends BaseMvvmDialogFragment<FilterTransactionsViewModel, TransactionsViewState> implements BaseViewBinder<FragmentFilterTransactionsBinding> {
    private static final String BUNDLE_KEY_TITLE = "BUNDLE_KEY_TITLE";
    private static final String BUNDLE_KEY_TRANSACTION_SCOPE = "BUNDLE_KEY_TRANSACTION_SCOPE";
    public static final Companion Companion;
    public static final String PAGE_KEY = "FilterTransactionsFragment";
    private final /* synthetic */ BaseViewBinderImpl<FragmentFilterTransactionsBinding> $$delegate_0;
    private FilteredDate filteredDate;
    private String lastSelectedFilterStatus;
    private String lastSelectedFilterType;
    private final InterfaceC11824h title$delegate;
    private final InterfaceC11824h transactionHistoryScope$delegate;
    public FilterTransactionsViewModel viewModel;

    /* compiled from: FilterTransactionsFragment.kt */
    @Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/ui/view/FilterTransactionsFragment$Companion;", "", "()V", FilterTransactionsFragment.BUNDLE_KEY_TITLE, "", FilterTransactionsFragment.BUNDLE_KEY_TRANSACTION_SCOPE, "TAG", "newInstance", "Lai/kudi/agent/transactionhistory/ui/view/FilterTransactionsFragment;", "transactionHistoryScope", "Lai/kudi/agent/transactionhistory/data/model/TransactionHistoryScope;", KudiPin.KUDI_PIN_TITLE, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transactionhistory.ui.view.FilterTransactionsFragment$Companion */
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
        public final FilterTransactionsFragment newInstance(TransactionHistoryScope transactionHistoryScope, String str) {
            Log_OC.getArray(transactionHistoryScope, "transactionHistoryScope");
            Log_OC.getArray(str, KudiPin.KUDI_PIN_TITLE);
            Bundle $r3 = new Bundle();
            $r3.putParcelable(FilterTransactionsFragment.BUNDLE_KEY_TRANSACTION_SCOPE, transactionHistoryScope);
            $r3.putString(FilterTransactionsFragment.BUNDLE_KEY_TITLE, str);
            FilterTransactionsFragment $r4 = new FilterTransactionsFragment();
            $r4.setArguments($r3);
            return $r4;
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
    public FilterTransactionsFragment() {
        InterfaceC11824h $r6;
        InterfaceC11824h $r62;
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
        Date $r3 = new Date();
        Date $r32 = DateExtKt.addDaysToDate($r3, -30);
        Date $r4 = new Date();
        FilteredDate $r2 = new FilteredDate($r32, $r4);
        this.filteredDate = $r2;
        this.lastSelectedFilterType = "";
        this.lastSelectedFilterStatus = "";
        FilterTransactionsFragment$transactionHistoryScope$2 $r5 = new FilterTransactionsFragment$transactionHistoryScope$2(this);
        $r6 = C13218k.m5625b($r5);
        this.transactionHistoryScope$delegate = $r6;
        FilterTransactionsFragment$title$2 $r7 = new FilterTransactionsFragment$title$2(this);
        $r62 = C13218k.m5625b($r7);
        this.title$delegate = $r62;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final String getTitle() {
        InterfaceC11824h $r2 = this.title$delegate;
        Object $r1 = $r2.getValue();
        Log_OC.loadImage($r1, "<get-title>(...)");
        String $r3 = (String) $r1;
        return $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TransactionHistoryScope getTransactionHistoryScope() {
        InterfaceC11824h $r2 = this.transactionHistoryScope$delegate;
        Object $r1 = $r2.getValue();
        TransactionHistoryScope $r3 = (TransactionHistoryScope) $r1;
        return $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onSearch() {
        FragmentFilterTransactionsBinding $r2 = requireBinding();
        FilterTransactionsViewModel $r3 = getViewModel();
        FilteredDate $r1 = this.filteredDate;
        Map $r4 = TransactionsUtilKt.getStatusMap();
        Object $r6 = $r4.get(this.lastSelectedFilterStatus);
        String $r5 = (String) $r6;
        if ($r5 == null) {
            $r5 = "";
        }
        Map $r42 = TransactionsUtilKt.getTransactionMap();
        Object $r62 = $r42.get(this.lastSelectedFilterType);
        String $r8 = (String) $r62;
        String $r7 = $r8 != null ? $r8 : "";
        TransactionsView $r9 = $r2.transactionsView;
        EditText $r10 = $r9.getSearchField();
        Editable $r11 = $r10.getText();
        String $r82 = $r11.toString();
        TransactionHistoryScope $r12 = getTransactionHistoryScope();
        $r3.onSearch($r1, $r5, $r7, $r82, $r12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m41068onViewCreated$lambda0(FilterTransactionsFragment filterTransactionsFragment, View view) {
        Log_OC.getArray(filterTransactionsFragment, "this$0");
        ContextExtKt.hideKeyboard(filterTransactionsFragment);
        filterTransactionsFragment.dismiss();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setUpTransactionsView() {
        FragmentFilterTransactionsBinding $r1 = requireBinding();
        TransactionsView $r2 = $r1.transactionsView;
        FilterTransactionsFragment$setUpTransactionsView$1$1 $r3 = new FilterTransactionsFragment$setUpTransactionsView$1$1(this);
        $r2.setOnTransactionItemClicked($r3);
        TransactionsView $r22 = $r1.transactionsView;
        FilterTransactionsFragment$setUpTransactionsView$1$2 $r4 = new FilterTransactionsFragment$setUpTransactionsView$1$2(this);
        $r22.setOnLoadMore($r4);
        TransactionsView $r23 = $r1.transactionsView;
        EditText $r5 = $r23.getSearchField();
        $r5.setImeOptions(3);
        TransactionsView $r24 = $r1.transactionsView;
        EditText $r52 = $r24.getSearchField();
        $r52.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: ai.kudi.agent.transactionhistory.ui.view.SearchFragment$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                FilterTransactionsFragment $r25 = FilterTransactionsFragment.this;
                boolean $z0 = FilterTransactionsFragment.m41069setUpTransactionsView$lambda4$lambda1($r25, textView, i, keyEvent);
                return $z0;
            }
        });
        TransactionsView $r25 = $r1.transactionsView;
        EditText $r53 = $r25.getSearchField();
        AbstractC9419a $r7 = C9421a.m14785a($r53);
        Log_OC.m10360a($r7, "RxTextView.textChanges(this)");
        TimeUnit $r8 = TimeUnit.MILLISECONDS;
        AbstractC11688p $r9 = $r7.m10492r(1500L, $r8);
        AbstractC11688p $r92 = $r9.m10523W();
        Item $r10 = ContextUtils.LogError();
        AbstractC11688p $r93 = $r92.R($r10);
        Object object = new Object() { // from class: ai.kudi.agent.transactionhistory.ui.view.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                FilterTransactionsFragment $r12 = FilterTransactionsFragment.this;
                CharSequence $r32 = (CharSequence) obj;
                FilterTransactionsFragment.m41070setUpTransactionsView$lambda4$lambda2($r12, $r32);
            }
        };
        Tables $r12 = Tables.USER;
        $r93.e0(object, $r12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setUpTransactionsView$lambda-4$lambda-1  reason: not valid java name */
    public static final boolean m41069setUpTransactionsView$lambda4$lambda1(FilterTransactionsFragment filterTransactionsFragment, TextView textView, int i, KeyEvent keyEvent) {
        Log_OC.getArray(filterTransactionsFragment, "this$0");
        ContextExtKt.hideKeyboard(filterTransactionsFragment);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpTransactionsView$lambda-4$lambda-2  reason: not valid java name */
    public static final void m41070setUpTransactionsView$lambda4$lambda2(FilterTransactionsFragment filterTransactionsFragment, CharSequence charSequence) {
        Log_OC.getArray(filterTransactionsFragment, "this$0");
        int $i0 = charSequence.length();
        if ($i0 < 3) {
            Log_OC.loadImage(charSequence, "it");
            int $i02 = charSequence.length();
            boolean $z0 = $i02 == 0;
            if (!$z0) {
                return;
            }
        }
        filterTransactionsFragment.onSearch();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setUpTransactionsView$lambda-4$lambda-3  reason: not valid java name */
    public static final void m41071setUpTransactionsView$lambda4$lambda3(Throwable th) {
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setupFilter() {
        String $r1 = getString(C0001R.string.all_transactions_key);
        Log_OC.loadImage($r1, "getString(R.string.all_transactions_key)");
        this.lastSelectedFilterType = $r1;
        updateDateIntervalText();
        InterfaceC1523w interfaceC1523w = new InterfaceC1523w() { // from class: ai.kudi.agent.transactionhistory.ui.view.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.fragment.app.InterfaceC1523w
            /* renamed from: a */
            public final void mo35611a(String str, Bundle bundle) {
                FilterTransactionsFragment $r3 = FilterTransactionsFragment.this;
                FilterTransactionsFragment.m41072setupFilter$lambda6($r3, str, bundle);
            }
        };
        FragmentManager $r3 = getChildFragmentManager();
        PreferenceActivity $r4 = getViewLifecycleOwner();
        $r3.p1(DateFilterFragment.RESULT_KEY_FILTERED_DATE, $r4, interfaceC1523w);
        final FragmentFilterTransactionsBinding $r5 = requireBinding();
        TextView $r6 = $r5.filterDate;
        TextView r12 = $r6;
        r12.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactionhistory.ui.view.c
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterTransactionsFragment $r2 = FilterTransactionsFragment.this;
                FilterTransactionsFragment.m41073setupFilter$lambda9$lambda7($r2, view);
            }
        });
        TextView $r62 = $r5.filterType;
        TextView r122 = $r62;
        r122.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactionhistory.ui.view.NoteEditor$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterTransactionsFragment $r2 = FilterTransactionsFragment.this;
                FragmentFilterTransactionsBinding $r32 = $r5;
                FilterTransactionsFragment.m41074setupFilter$lambda9$lambda8($r2, $r32, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupFilter$lambda-6  reason: not valid java name */
    public static final void m41072setupFilter$lambda6(FilterTransactionsFragment filterTransactionsFragment, String str, Bundle bundle) {
        Log_OC.getArray(filterTransactionsFragment, "this$0");
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
            filterTransactionsFragment.filteredDate = $r4;
            filterTransactionsFragment.updateDateIntervalText();
            filterTransactionsFragment.onSearch();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupFilter$lambda-9$lambda-7  reason: not valid java name */
    public static final void m41073setupFilter$lambda9$lambda7(FilterTransactionsFragment filterTransactionsFragment, View view) {
        Log_OC.getArray(filterTransactionsFragment, "this$0");
        DateFilterFragment.Companion $r2 = DateFilterFragment.Companion;
        DateFilterFragment $r3 = $r2.newInstance();
        FragmentManager $r4 = filterTransactionsFragment.getChildFragmentManager();
        Chapter r5 = (Chapter) $r3;
        r5.show($r4, DateFilterFragment.PAGE_KEY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupFilter$lambda-9$lambda-8  reason: not valid java name */
    public static final void m41074setupFilter$lambda9$lambda8(FilterTransactionsFragment filterTransactionsFragment, FragmentFilterTransactionsBinding fragmentFilterTransactionsBinding, View view) {
        Log_OC.getArray(filterTransactionsFragment, "this$0");
        Log_OC.getArray(fragmentFilterTransactionsBinding, "$this_apply");
        Context $r2 = filterTransactionsFragment.requireContext();
        Log_OC.loadImage($r2, "requireContext()");
        FilterTransactionsFragment$setupFilter$1$2$1 r6 = new FilterTransactionsFragment$setupFilter$1$2$1(filterTransactionsFragment, fragmentFilterTransactionsBinding);
        Dialog r7 = new DialogC0809i($r2, r6);
        Dialog r8 = r7;
        r8.show();
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
        FragmentFilterTransactionsBinding $r5 = requireBinding();
        AppCompatTextView $r6 = $r5.filterDate;
        $r6.setText($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMvvmDialogFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        TransactionsViewState $r2 = (TransactionsViewState) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(TransactionsViewState transactionsViewState) {
        Log_OC.getArray(transactionsViewState, "viewData");
        ContextExtKt.hideKeyboard(this);
        FragmentFilterTransactionsBinding $r2 = requireBinding();
        TransactionsView $r3 = $r2.transactionsView;
        $r3.bindData(transactionsViewState, true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMvvmDialogFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        FilterTransactionsViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMvvmDialogFragment
    public FilterTransactionsViewModel createViewModel() {
        FilterTransactionsViewModel $r1 = getViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentFilterTransactionsBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentFilterTransactionsBinding $r3 = (FragmentFilterTransactionsBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentFilterTransactionsBinding $r1 = getBinding();
        return $r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMvvmDialogFragment
    protected Class getVMType() {
        return FilterTransactionsViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMvvmDialogFragment
    public final FilterTransactionsViewModel getViewModel() {
        FilterTransactionsViewModel $r1 = this.viewModel;
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
    public View initBinding(FragmentFilterTransactionsBinding fragmentFilterTransactionsBinding, Fragment fragment) {
        Log_OC.getArray(fragmentFilterTransactionsBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentFilterTransactionsBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentFilterTransactionsBinding $r4 = (FragmentFilterTransactionsBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
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

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, C0001R.style.AppTheme_FullScreenDialog);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentFilterTransactionsBinding $r4 = FragmentFilterTransactionsBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, (Fragment) this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        FragmentFilterTransactionsBinding $r3 = requireBinding();
        TextView $r4 = $r3.titleView;
        CharSequence $r5 = getTitle();
        TextView r12 = $r4;
        r12.setText($r5);
        FilterTransactionsViewModel $r6 = getViewModel();
        FilteredDate $r7 = this.filteredDate;
        TransactionHistoryScope $r8 = getTransactionHistoryScope();
        $r6.onLoadData($r7, $r8);
        FragmentFilterTransactionsBinding $r32 = requireBinding();
        ImageButton $r9 = $r32.closeButton;
        ImageButton r13 = $r9;
        r13.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactionhistory.ui.view.AboutFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FilterTransactionsFragment $r2 = FilterTransactionsFragment.this;
                FilterTransactionsFragment.m41068onViewCreated$lambda0($r2, view2);
            }
        });
        setupFilter();
        setUpTransactionsView();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentFilterTransactionsBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentFilterTransactionsBinding $r3 = (FragmentFilterTransactionsBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentFilterTransactionsBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setViewModel(FilterTransactionsViewModel filterTransactionsViewModel) {
        Log_OC.getArray(filterTransactionsViewModel, "<set-?>");
        this.viewModel = filterTransactionsViewModel;
    }
}

package ai.kudi.agent.pos.p016ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.databinding.EmptyHistoryBinding;
import ai.kudi.agent.core.databinding.ListLoaderViewBinding;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.core.util.EditTextExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.FragmentPosOrderHistoryBinding;
import ai.kudi.agent.filter.domain.FilteredDate;
import ai.kudi.agent.filter.p005ui.DateFilterFragment;
import ai.kudi.agent.pos.game.components.PosSubComponent;
import ai.kudi.agent.pos.p016ui.adapter.PosOrderHistoryAdapter;
import ai.kudi.agent.pos.p016ui.model.PosFilterType;
import ai.kudi.agent.pos.p016ui.utils.PosActivityExtKt;
import ai.kudi.agent.pos.presentation.PosOrderHistoryViewModel;
import ai.kudi.agent.pos.presentation.viewstate.PosOrderHistoryViewState;
import ai.kudi.dip.library.p043h.DialogC0809i;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import androidx.lifecycle.PreferenceActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.trello.rxlifecycle2.p190e.p191a.p192a.C7390a;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11680b;
/* compiled from: PosOrderHistoryFragment.kt */
@Metadata(m10422d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 *2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0014J\b\u0010\u0014\u001a\u00020\u0002H\u0014J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0012H\u0002J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J&\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u001f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010&\u001a\u00020\u0012H\u0002J\b\u0010'\u001a\u00020\u0012H\u0003J\b\u0010(\u001a\u00020\u0012H\u0002J\b\u0010)\u001a\u00020\u0012H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006+"}, m10421d2 = {"Lai/kudi/agent/pos/ui/PosOrderHistoryFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/pos/presentation/PosOrderHistoryViewModel;", "Lai/kudi/agent/pos/presentation/viewstate/PosOrderHistoryViewState;", "Lai/kudi/agent/databinding/FragmentPosOrderHistoryBinding;", "()V", "filterType", "Lai/kudi/agent/pos/ui/model/PosFilterType;", "filteredDate", "Lai/kudi/agent/filter/domain/FilteredDate;", "ordersAdapter", "Lai/kudi/agent/pos/ui/adapter/PosOrderHistoryAdapter;", "viewModel", "getViewModel", "()Lai/kudi/agent/pos/presentation/PosOrderHistoryViewModel;", "setViewModel", "(Lai/kudi/agent/pos/presentation/PosOrderHistoryViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "loadOrderHistory", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setUpAdapter", "setupFilter", "updateDateIntervalText", "updateStatusFilterText", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.pos.ui.PosOrderHistoryFragment */
/* loaded from: classes.dex */
public final class PosOrderHistoryFragment extends BaseMVVMViewBindingFragment<PosOrderHistoryViewModel, PosOrderHistoryViewState, FragmentPosOrderHistoryBinding> {
    private static final String BUNDLE_KEY_POS_FILTER_TYPE = "BUNDLE_KEY_POS_FILTER_TYPE";
    public static final Companion Companion;
    private PosFilterType filterType;
    private FilteredDate filteredDate;
    private PosOrderHistoryAdapter ordersAdapter;
    public PosOrderHistoryViewModel viewModel;

    /* compiled from: PosOrderHistoryFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/pos/ui/PosOrderHistoryFragment$Companion;", "", "()V", PosOrderHistoryFragment.BUNDLE_KEY_POS_FILTER_TYPE, "", "newInstance", "Lai/kudi/agent/pos/ui/PosOrderHistoryFragment;", "filterType", "Lai/kudi/agent/pos/ui/model/PosFilterType;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.pos.ui.PosOrderHistoryFragment$Companion */
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
        public final PosOrderHistoryFragment newInstance(PosFilterType posFilterType) {
            Log_OC.getArray(posFilterType, "filterType");
            Bundle $r2 = new Bundle();
            $r2.putParcelable(PosOrderHistoryFragment.BUNDLE_KEY_POS_FILTER_TYPE, posFilterType);
            PosOrderHistoryFragment $r3 = new PosOrderHistoryFragment();
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
    public PosOrderHistoryFragment() {
        Date $r2 = new Date();
        Date $r22 = DateExtKt.addDaysToDate($r2, -30);
        Date $r3 = new Date();
        FilteredDate $r1 = new FilteredDate($r22, $r3);
        this.filteredDate = $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void loadOrderHistory() {
        PosOrderHistoryViewModel $r3 = getViewModel();
        FilteredDate $r1 = this.filteredDate;
        PosFilterType $r2 = this.filterType;
        if ($r2 == null) {
            Log_OC.LogError("filterType");
            NullPointerException r9 = new NullPointerException("Null throw statement replaced by Soot");
            throw r9;
        }
        InterfaceC8209a $r4 = requireBinding();
        FragmentPosOrderHistoryBinding $r5 = (FragmentPosOrderHistoryBinding) $r4;
        AppCompatEditText $r6 = $r5.searchField;
        Editable $r7 = $r6.getText();
        String $r8 = String.valueOf($r7);
        $r3.onLoadData($r1, $r2, $r8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m40069onViewCreated$lambda0(PosOrderHistoryFragment posOrderHistoryFragment, String str) {
        Log_OC.getArray(posOrderHistoryFragment, "this$0");
        FragmentActivity $r1 = posOrderHistoryFragment.requireActivity();
        Log_OC.loadImage($r1, "requireActivity()");
        ContextExtKt.toast$default($r1, str, 0, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m40070onViewCreated$lambda1(Throwable th) {
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setUpAdapter() {
        PosOrderHistoryFragment$setUpAdapter$1 $r2 = new PosOrderHistoryFragment$setUpAdapter$1(this);
        this.ordersAdapter = new PosOrderHistoryAdapter($r2);
        InterfaceC8209a $r3 = requireBinding();
        FragmentPosOrderHistoryBinding $r4 = (FragmentPosOrderHistoryBinding) $r3;
        RecyclerView $r5 = $r4.orderList;
        Context $r7 = getContext();
        LinearLayoutManager $r6 = new LinearLayoutManager($r7);
        $r5.setLayoutManager($r6);
        InterfaceC8209a $r32 = requireBinding();
        FragmentPosOrderHistoryBinding $r42 = (FragmentPosOrderHistoryBinding) $r32;
        RecyclerView $r52 = $r42.orderList;
        PosOrderHistoryAdapter $r1 = this.ordersAdapter;
        if ($r1 == null) {
            Log_OC.LogError("ordersAdapter");
            NullPointerException r9 = new NullPointerException("Null throw statement replaced by Soot");
            throw r9;
        }
        $r52.setAdapter($r1);
        InterfaceC8209a $r33 = requireBinding();
        FragmentPosOrderHistoryBinding $r43 = (FragmentPosOrderHistoryBinding) $r33;
        RecyclerView $r53 = $r43.orderList;
        $r53.m35282l(new RecyclerView.AbstractC1644u() { // from class: ai.kudi.agent.pos.ui.PosOrderHistoryFragment$setUpAdapter$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1644u
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Log_OC.getArray(recyclerView, "recyclerView");
                super.onScrollStateChanged(recyclerView, i);
                RecyclerView r12 = recyclerView;
                boolean $z0 = r12.canScrollVertically(1);
                if ($z0) {
                    return;
                }
                PosOrderHistoryFragment $r22 = PosOrderHistoryFragment.this;
                PosOrderHistoryViewModel $r34 = $r22.getViewModel();
                PosOrderHistoryFragment $r23 = PosOrderHistoryFragment.this;
                FilteredDate $r44 = $r23.filteredDate;
                PosOrderHistoryFragment $r24 = PosOrderHistoryFragment.this;
                PosFilterType $r54 = $r24.filterType;
                if ($r54 == null) {
                    Log_OC.LogError("filterType");
                    NullPointerException r11 = new NullPointerException("Null throw statement replaced by Soot");
                    throw r11;
                }
                PosOrderHistoryFragment $r25 = PosOrderHistoryFragment.this;
                InterfaceC8209a $r62 = $r25.requireBinding();
                FragmentPosOrderHistoryBinding $r72 = (FragmentPosOrderHistoryBinding) $r62;
                AppCompatEditText $r8 = $r72.searchField;
                Editable $r9 = $r8.getText();
                String $r10 = String.valueOf($r9);
                $r34.onLoadNext($r44, $r54, $r10);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setupFilter() {
        updateDateIntervalText();
        updateStatusFilterText();
        InterfaceC1523w interfaceC1523w = new InterfaceC1523w() { // from class: ai.kudi.agent.pos.ui.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: b */
            public final void m38649b(String str, Bundle bundle) {
                PosOrderHistoryFragment $r3 = PosOrderHistoryFragment.this;
                PosOrderHistoryFragment.m40071setupFilter$lambda3($r3, str, bundle);
            }
        };
        FragmentManager $r2 = getChildFragmentManager();
        $r2.p1(DateFilterFragment.RESULT_KEY_FILTERED_DATE, getViewLifecycleOwner(), interfaceC1523w);
        InterfaceC8209a $r4 = requireBinding();
        FragmentPosOrderHistoryBinding $r5 = (FragmentPosOrderHistoryBinding) $r4;
        TextView $r6 = $r5.filterDate;
        TextView r17 = $r6;
        r17.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.pos.ui.SettingsActivity$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PosOrderHistoryFragment $r22 = PosOrderHistoryFragment.this;
                PosOrderHistoryFragment.m40072setupFilter$lambda4($r22, view);
            }
        });
        InterfaceC8209a $r42 = requireBinding();
        FragmentPosOrderHistoryBinding $r52 = (FragmentPosOrderHistoryBinding) $r42;
        TextView $r8 = $r52.searchField;
        Log_OC.loadImage($r8, "requireBinding().searchField");
        TextView r172 = $r8;
        AbstractC11688p $r9 = EditTextExtKt.getTextChanges(r172);
        PreferenceActivity $r3 = getViewLifecycleOwner();
        Log_OC.loadImage($r3, "viewLifecycleOwner");
        AbstractC11688p $r92 = C7390a.a($r9, $r3);
        Object object = new Object() { // from class: ai.kudi.agent.pos.ui.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PosOrderHistoryFragment $r1 = PosOrderHistoryFragment.this;
                CharSequence $r32 = (CharSequence) obj;
                PosOrderHistoryFragment.m40073setupFilter$lambda5($r1, $r32);
            }
        };
        Chunk $r11 = Chunk.NEWLINE;
        $r92.e0(object, $r11);
        InterfaceC8209a $r43 = requireBinding();
        FragmentPosOrderHistoryBinding $r53 = (FragmentPosOrderHistoryBinding) $r43;
        TextView $r62 = $r53.filterType;
        TextView r173 = $r62;
        r173.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.pos.ui.SearchResultsActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PosOrderHistoryFragment $r22 = PosOrderHistoryFragment.this;
                PosOrderHistoryFragment.m40075setupFilter$lambda7($r22, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupFilter$lambda-3  reason: not valid java name */
    public static final void m40071setupFilter$lambda3(PosOrderHistoryFragment posOrderHistoryFragment, String str, Bundle bundle) {
        Log_OC.getArray(posOrderHistoryFragment, "this$0");
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
            posOrderHistoryFragment.filteredDate = $r4;
            posOrderHistoryFragment.updateDateIntervalText();
            posOrderHistoryFragment.loadOrderHistory();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupFilter$lambda-4  reason: not valid java name */
    public static final void m40072setupFilter$lambda4(PosOrderHistoryFragment posOrderHistoryFragment, View view) {
        Log_OC.getArray(posOrderHistoryFragment, "this$0");
        DateFilterFragment.Companion $r2 = DateFilterFragment.Companion;
        DateFilterFragment $r3 = $r2.newInstance();
        FragmentManager $r4 = posOrderHistoryFragment.getChildFragmentManager();
        Chapter r5 = (Chapter) $r3;
        r5.show($r4, DateFilterFragment.PAGE_KEY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupFilter$lambda-5  reason: not valid java name */
    public static final void m40073setupFilter$lambda5(PosOrderHistoryFragment posOrderHistoryFragment, CharSequence charSequence) {
        Log_OC.getArray(posOrderHistoryFragment, "this$0");
        String $r2 = charSequence.toString();
        boolean $z0 = StringExtKt.isNigerianPhoneNumber($r2);
        if (!$z0) {
            String $r22 = charSequence.toString();
            boolean $z02 = StringExtKt.isNigerianPhoneNumberWithCountryCode($r22);
            if (!$z02) {
                return;
            }
        }
        posOrderHistoryFragment.loadOrderHistory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupFilter$lambda-6  reason: not valid java name */
    public static final void m40074setupFilter$lambda6(Throwable th) {
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupFilter$lambda-7  reason: not valid java name */
    public static final void m40075setupFilter$lambda7(PosOrderHistoryFragment posOrderHistoryFragment, View view) {
        Log_OC.getArray(posOrderHistoryFragment, "this$0");
        Context $r1 = posOrderHistoryFragment.requireContext();
        Log_OC.loadImage($r1, "requireContext()");
        PosOrderHistoryFragment$setupFilter$4$1 r5 = new PosOrderHistoryFragment$setupFilter$4$1(posOrderHistoryFragment);
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
        AppCompatTextView $r7 = ((FragmentPosOrderHistoryBinding) $r5).filterDate;
        $r7.setText($r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void updateStatusFilterText() {
        InterfaceC8209a $r1 = requireBinding();
        FragmentPosOrderHistoryBinding $r2 = (FragmentPosOrderHistoryBinding) $r1;
        TextView $r3 = $r2.filterType;
        PosFilterType $r4 = this.filterType;
        if ($r4 == null) {
            Log_OC.LogError("filterType");
            NullPointerException r6 = new NullPointerException("Null throw statement replaced by Soot");
            throw r6;
        }
        int $i0 = $r4.getTextRes();
        CharSequence $r5 = getString($i0);
        TextView r7 = $r3;
        r7.setText($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        PosOrderHistoryViewState $r2 = (PosOrderHistoryViewState) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(PosOrderHistoryViewState posOrderHistoryViewState) {
        Log_OC.getArray(posOrderHistoryViewState, "viewData");
        PosOrderHistoryAdapter $r2 = this.ordersAdapter;
        if ($r2 == null) {
            Log_OC.LogError("ordersAdapter");
            NullPointerException r13 = new NullPointerException("Null throw statement replaced by Soot");
            throw r13;
        }
        List $r3 = posOrderHistoryViewState.getOrders();
        $r2.setItems($r3);
        boolean $z0 = posOrderHistoryViewState.getShowEmptyListView();
        if ($z0) {
            InterfaceC8209a $r4 = requireBinding();
            FragmentPosOrderHistoryBinding $r5 = (FragmentPosOrderHistoryBinding) $r4;
            EmptyHistoryBinding $r6 = $r5.emptyHistoryView;
            View $r7 = $r6.getRoot();
            Log_OC.loadImage($r7, "requireBinding().emptyHistoryView.root");
            View r14 = $r7;
            ViewExtKt.show(r14);
        } else {
            InterfaceC8209a $r42 = requireBinding();
            FragmentPosOrderHistoryBinding $r52 = (FragmentPosOrderHistoryBinding) $r42;
            EmptyHistoryBinding $r62 = $r52.emptyHistoryView;
            View $r72 = $r62.getRoot();
            Log_OC.loadImage($r72, "requireBinding().emptyHistoryView.root");
            View r142 = $r72;
            ViewExtKt.hide$default(r142, false, 1, null);
        }
        boolean $z02 = posOrderHistoryViewState.isLoadingOrders();
        if ($z02) {
            InterfaceC8209a $r43 = requireBinding();
            FragmentPosOrderHistoryBinding $r53 = (FragmentPosOrderHistoryBinding) $r43;
            ListLoaderViewBinding $r8 = $r53.listLoaderView;
            FrameLayout $r9 = $r8.getRoot();
            Log_OC.loadImage($r9, "requireBinding().listLoaderView.root");
            ViewExtKt.show($r9);
            InterfaceC8209a $r44 = requireBinding();
            FragmentPosOrderHistoryBinding $r54 = (FragmentPosOrderHistoryBinding) $r44;
            View $r10 = $r54.searchField;
            Log_OC.loadImage($r10, "requireBinding().searchField");
            View r143 = $r10;
            ViewExtKt.hide$default(r143, false, 1, null);
            InterfaceC8209a $r45 = requireBinding();
            FragmentPosOrderHistoryBinding $r55 = (FragmentPosOrderHistoryBinding) $r45;
            View $r11 = $r55.orderList;
            Log_OC.loadImage($r11, "requireBinding().orderList");
            View r144 = $r11;
            ViewExtKt.hide$default(r144, false, 1, null);
            InterfaceC8209a $r46 = requireBinding();
            FragmentPosOrderHistoryBinding $r56 = (FragmentPosOrderHistoryBinding) $r46;
            LinearLayout $r12 = $r56.filterView;
            Log_OC.loadImage($r12, "requireBinding().filterView");
            ViewExtKt.hide$default($r12, false, 1, null);
        } else {
            InterfaceC8209a $r47 = requireBinding();
            FragmentPosOrderHistoryBinding $r57 = (FragmentPosOrderHistoryBinding) $r47;
            ListLoaderViewBinding $r82 = $r57.listLoaderView;
            FrameLayout $r92 = $r82.getRoot();
            Log_OC.loadImage($r92, "requireBinding().listLoaderView.root");
            ViewExtKt.hide$default($r92, false, 1, null);
            InterfaceC8209a $r48 = requireBinding();
            FragmentPosOrderHistoryBinding $r58 = (FragmentPosOrderHistoryBinding) $r48;
            View $r102 = $r58.searchField;
            Log_OC.loadImage($r102, "requireBinding().searchField");
            View r145 = $r102;
            ViewExtKt.show(r145);
            InterfaceC8209a $r49 = requireBinding();
            FragmentPosOrderHistoryBinding $r59 = (FragmentPosOrderHistoryBinding) $r49;
            View $r112 = $r59.orderList;
            Log_OC.loadImage($r112, "requireBinding().orderList");
            View r146 = $r112;
            ViewExtKt.show(r146);
            InterfaceC8209a $r410 = requireBinding();
            FragmentPosOrderHistoryBinding $r510 = (FragmentPosOrderHistoryBinding) $r410;
            LinearLayout $r122 = $r510.filterView;
            Log_OC.loadImage($r122, "requireBinding().filterView");
            ViewExtKt.show($r122);
        }
        boolean $z03 = posOrderHistoryViewState.isLoadingMore();
        if ($z03) {
            InterfaceC8209a $r411 = requireBinding();
            FragmentPosOrderHistoryBinding $r511 = (FragmentPosOrderHistoryBinding) $r411;
            FrameLayout $r93 = $r511.loadNextProgressBar;
            Log_OC.loadImage($r93, "requireBinding().loadNextProgressBar");
            ViewExtKt.show($r93);
            return;
        }
        InterfaceC8209a $r412 = requireBinding();
        FragmentPosOrderHistoryBinding $r512 = (FragmentPosOrderHistoryBinding) $r412;
        FrameLayout $r94 = $r512.loadNextProgressBar;
        Log_OC.loadImage($r94, "requireBinding().loadNextProgressBar");
        ViewExtKt.hide$default($r94, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        PosOrderHistoryViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public PosOrderHistoryViewModel createViewModel() {
        PosOrderHistoryViewModel $r1 = getViewModel();
        return $r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return PosOrderHistoryViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public final PosOrderHistoryViewModel getViewModel() {
        PosOrderHistoryViewModel $r1 = this.viewModel;
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
        PosSubComponent $r1;
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        boolean $z0 = context instanceof PosActivity;
        PosActivity $r3 = $z0 ? (PosActivity) context : null;
        if ($r3 == null || ($r1 = $r3.getPos2SubComponent()) == null) {
            return;
        }
        $r1.inject(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle $r1 = requireArguments();
        Parcelable $r2 = $r1.getParcelable(BUNDLE_KEY_POS_FILTER_TYPE);
        PosFilterType $r3 = (PosFilterType) $r2;
        if ($r3 == null) {
            $r3 = PosFilterType.type;
        }
        this.filterType = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentPosOrderHistoryBinding $r4 = FragmentPosOrderHistoryBinding.inflate(layoutInflater, viewGroup, false);
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
        FragmentActivity $r3 = requireActivity();
        Log_OC.loadImage($r3, "requireActivity()");
        String $r4 = getString(C0001R.string.order_history);
        Log_OC.loadImage($r4, "getString(R.string.order_history)");
        PosActivityExtKt.setPosActivityTitle($r3, $r4);
        setupFilter();
        setUpAdapter();
        loadOrderHistory();
        PosOrderHistoryViewModel $r5 = getViewModel();
        C11680b $r6 = $r5.getToastMessage();
        PreferenceActivity $r7 = getViewLifecycleOwner();
        Log_OC.loadImage($r7, "viewLifecycleOwner");
        AbstractC11688p $r8 = C7390a.a($r6, $r7);
        Object object = new Object() { // from class: ai.kudi.agent.pos.ui.FlingerListView$ItemFlingerResponder
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PosOrderHistoryFragment $r1 = PosOrderHistoryFragment.this;
                String $r32 = (String) obj;
                PosOrderHistoryFragment.m40069onViewCreated$lambda0($r1, $r32);
            }
        };
        Configuration $r10 = Configuration.log;
        $r8.e0(object, $r10);
    }

    public final void setViewModel(PosOrderHistoryViewModel posOrderHistoryViewModel) {
        Log_OC.getArray(posOrderHistoryViewModel, "<set-?>");
        this.viewModel = posOrderHistoryViewModel;
    }
}

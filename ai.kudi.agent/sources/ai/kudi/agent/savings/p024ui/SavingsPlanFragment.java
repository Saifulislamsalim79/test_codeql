package ai.kudi.agent.savings.p024ui;

import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.filter.domain.FilteredDate;
import ai.kudi.agent.filter.p005ui.DateFilterFragment;
import ai.kudi.agent.savings.C0456R;
import ai.kudi.agent.savings.adapter.SavingsPlanAdapter;
import ai.kudi.agent.savings.data.model.SavingResponse;
import ai.kudi.agent.savings.data.viewdata.SavingsPlanViewData;
import ai.kudi.agent.savings.databinding.FragmentSavingsPlanBinding;
import ai.kudi.agent.savings.viewmodel.SavingsPlanViewModel;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.p058os.C1372b;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import androidx.lifecycle.PreferenceActivity;
import dagger.android.p197e.C7429a;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p201g.p270x.InterfaceC8209a;
/* compiled from: SavingsPlanFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 72\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00017B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003H\u0014J\b\u0010\u0018\u001a\u00020\u0002H\u0014J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J$\u0010$\u001a\u00020%2\u0006\u0010\"\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0010\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020-H\u0016J\u001a\u0010.\u001a\u00020\u00162\u0006\u0010/\u001a\u00020%2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J'\u00100\u001a\u00020\u00162\f\u00101\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u00102\u001a\u0004\u0018\u000103H\u0002¢\u0006\u0002\u00104J\b\u00105\u001a\u00020\u0016H\u0002J\b\u00106\u001a\u00020\u0016H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u00068"}, m10421d2 = {"Lai/kudi/agent/savings/ui/SavingsPlanFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/savings/viewmodel/SavingsPlanViewModel;", "Lai/kudi/agent/savings/data/viewdata/SavingsPlanViewData;", "Lai/kudi/agent/savings/databinding/FragmentSavingsPlanBinding;", "()V", "allSavings", "", "Lai/kudi/agent/savings/data/model/SavingResponse;", "filteredDate", "Lai/kudi/agent/filter/domain/FilteredDate;", "shouldHideCreateSavingOption", "", "viewModel", "getViewModel", "()Lai/kudi/agent/savings/viewmodel/SavingsPlanViewModel;", "setViewModel", "(Lai/kudi/agent/savings/viewmodel/SavingsPlanViewModel;)V", "activeAndComplete", TransactionField.STATUS, "", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "launchOptionsBottomSheet", "onAttach", "context", "Landroid/content/Context;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onViewCreated", "view", "populateView", AttributeType.LIST, "balance", "", "(Ljava/util/List;Ljava/lang/Integer;)V", "setupFilter", "updateDateOnFilter", "Companion", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.savings.ui.SavingsPlanFragment */
/* loaded from: classes.dex */
public final class SavingsPlanFragment extends BaseMVVMViewBindingFragment<SavingsPlanViewModel, SavingsPlanViewData, FragmentSavingsPlanBinding> {
    public static final Companion Companion;
    private static final String SAVINGS_PLAN_KEY = "savings_plan";
    public static final int daysToAdd = -30;
    private List<SavingResponse> allSavings;
    private FilteredDate filteredDate;
    private boolean shouldHideCreateSavingOption;
    public SavingsPlanViewModel viewModel;

    /* compiled from: SavingsPlanFragment.kt */
    @Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0014\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/savings/ui/SavingsPlanFragment$Companion;", "", "()V", "SAVINGS_PLAN_KEY", "", "daysToAdd", "", "newInstance", "Lai/kudi/agent/savings/ui/SavingsPlanFragment;", "savingList", "", "Lai/kudi/agent/savings/data/model/SavingResponse;", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.savings.ui.SavingsPlanFragment$Companion */
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
        public final SavingsPlanFragment newInstance() {
            SavingsPlanFragment $r1 = new SavingsPlanFragment();
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final SavingsPlanFragment newInstance(List list) {
            Log_OC.getArray(list, "savingList");
            SavingsPlanFragment $r3 = new SavingsPlanFragment();
            $r3.getArguments();
            C13287o $r1 = C13664u.m4227a(SavingsPlanFragment.SAVINGS_PLAN_KEY, list);
            C13287o[] $r4 = {$r1};
            C1372b.m36174a($r4);
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
    public SavingsPlanFragment() {
        List $r4;
        Date $r2 = new Date();
        Date $r22 = DateExtKt.addDaysToDate($r2, -30);
        Date $r3 = new Date();
        FilteredDate $r1 = new FilteredDate($r22, $r3);
        this.filteredDate = $r1;
        $r4 = C13726r.m3891e();
        this.allSavings = $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean activeAndComplete(String str) {
        SavingsPlanAdapter.SavingStatus $r2 = SavingsPlanAdapter.SavingStatus.ACTIVE;
        String $r3 = $r2.name();
        boolean $z0 = Log_OC.append(str, $r3);
        if ($z0) {
            return true;
        }
        SavingsPlanAdapter.SavingStatus $r22 = SavingsPlanAdapter.SavingStatus.COMPLETED;
        String $r32 = $r22.name();
        boolean $z02 = Log_OC.append(str, $r32);
        return $z02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void launchOptionsBottomSheet(boolean z) {
        List $r6;
        MenuItemClicked menuItemClicked = new MenuItemClicked() { // from class: ai.kudi.agent.savings.ui.SavingsPlanFragment$launchOptionsBottomSheet$bottomSheetListener$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.savings.p024ui.MenuItemClicked
            public void actionOne() {
                SavingsPlanFragment $r2 = SavingsPlanFragment.this;
                SavingsPlanViewModel $r1 = $r2.getViewModel();
                $r1.navigateToCreateSavings();
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.savings.p024ui.MenuItemClicked
            public void actionThree() {
                SavingsPlanFragment $r1 = SavingsPlanFragment.this;
                SavingsPlanViewModel $r2 = $r1.getViewModel();
                SavingsPlanFragment $r12 = SavingsPlanFragment.this;
                List $r3 = $r12.allSavings;
                $r2.navigateToSavingHistory($r3);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.savings.p024ui.MenuItemClicked
            public void actionTwo() {
                SavingsPlanFragment $r2 = SavingsPlanFragment.this;
                SavingsPlanViewModel $r1 = $r2.getViewModel();
                $r1.navigateToSavingsTransactions();
            }
        };
        Context $r3 = requireContext();
        Log_OC.loadImage($r3, "requireContext()");
        int $i0 = C0456R.string.plan_menu_option_1;
        String $r5 = getString($i0);
        int $i02 = C0456R.string.plan_menu_option_2;
        String $r52 = getString($i02);
        String[] $r4 = {$r5, $r52};
        $r6 = C13726r.m3888h($r4);
        Dialog r8 = new SavingPlanMenuOption($r3, menuItemClicked, $r6);
        Dialog r9 = r8;
        r9.show();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final SavingsPlanFragment newInstance() {
        Companion $r1 = Companion;
        SavingsPlanFragment $r0 = $r1.newInstance();
        return $r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-2$lambda-0  reason: not valid java name */
    public static final void m40548onViewCreated$lambda2$lambda0(SavingsPlanFragment savingsPlanFragment, View view) {
        Log_OC.getArray(savingsPlanFragment, "this$0");
        SavingsPlanViewModel $r0 = savingsPlanFragment.getViewModel();
        $r0.navigateToCreateSavings();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-2$lambda-1  reason: not valid java name */
    public static final void m40549onViewCreated$lambda2$lambda1(SavingsPlanFragment savingsPlanFragment, View view) {
        Log_OC.getArray(savingsPlanFragment, "this$0");
        SavingsPlanViewModel $r0 = savingsPlanFragment.getViewModel();
        $r0.navigateToSavingsTransactions();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r2 != false) goto L5;
     */
    /* JADX WARN: Incorrect condition in loop: B:19:0x008c */
    /* JADX WARN: Incorrect condition in loop: B:9:0x001a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void populateView(java.util.List r26, java.lang.Integer r27) {
        /*
            r25 = this;
            r0 = r26
            boolean r2 = r0 instanceof java.util.Collection
            if (r2 == 0) goto L10
            r0 = r26
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L10
        Le:
            r2 = 1
            goto L4d
        L10:
            r0 = r26
            java.util.Iterator r3 = r0.iterator()
        L16:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto Le
            java.lang.Object r4 = r3.next()
            r6 = r4
            ai.kudi.agent.savings.data.model.SavingResponse r6 = (ai.kudi.agent.savings.data.model.SavingResponse) r6
            r5 = r6
            java.lang.String r7 = r5.getStatus()
            if (r7 == 0) goto L45
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toLowerCase(r8)
            java.lang.String r9 = "(this as java.lang.Strin….toLowerCase(Locale.ROOT)"
            kotlin.p483e0.p485d.Log_OC.loadImage(r7, r9)
            int r10 = ai.kudi.agent.savings.C0456R.string.status_active
            r0 = r25
            java.lang.String r11 = r0.getString(r10)
            boolean r2 = kotlin.p483e0.p485d.Log_OC.append(r7, r11)
            if (r2 == 0) goto L16
            r2 = 0
            goto L4d
        L45:
            java.lang.NullPointerException r12 = new java.lang.NullPointerException
            java.lang.String r9 = "null cannot be cast to non-null type java.lang.String"
            r12.<init>(r9)
            throw r12
        L4d:
            r13 = 1
            r2 = r2 ^ r13
            r0 = r25
            r0.shouldHideCreateSavingOption = r2
            r0 = r26
            r1 = r25
            r1.allSavings = r0
            r0 = r25
            g.x.a r14 = r0.requireBinding()
            r16 = r14
            ai.kudi.agent.savings.databinding.FragmentSavingsPlanBinding r16 = (ai.kudi.agent.savings.databinding.FragmentSavingsPlanBinding) r16
            r15 = r16
            androidx.recyclerview.widget.RecyclerView r0 = r15.rvSavingsPlan
            r17 = r0
            ai.kudi.agent.savings.adapter.SavingsPlanAdapter r18 = new ai.kudi.agent.savings.adapter.SavingsPlanAdapter
            ai.kudi.agent.savings.ui.SavingsPlanFragment$populateView$1$1 r19 = new ai.kudi.agent.savings.ui.SavingsPlanFragment$populateView$1$1
            r0 = r19
            r1 = r25
            r0.<init>(r1)
            r0 = r18
            r1 = r19
            r0.<init>(r1)
            java.util.ArrayList r20 = new java.util.ArrayList
            r0 = r20
            r0.<init>()
            r0 = r26
            java.util.Iterator r3 = r0.iterator()
        L88:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto Laa
            java.lang.Object r4 = r3.next()
            r21 = r4
            ai.kudi.agent.savings.data.model.SavingResponse r21 = (ai.kudi.agent.savings.data.model.SavingResponse) r21
            r5 = r21
            java.lang.String r7 = r5.getStatus()
            r0 = r25
            boolean r2 = r0.activeAndComplete(r7)
            if (r2 == 0) goto L88
            r0 = r20
            r0.add(r4)
            goto L88
        Laa:
            java.util.ArrayList r22 = new java.util.ArrayList
            r0 = r22
            r1 = r20
            r0.<init>(r1)
            r0 = r18
            r1 = r22
            r0.submitList(r1)
            kotlin.w r23 = kotlin.C13666w.f30112a
            r0 = r17
            r1 = r18
            r0.setAdapter(r1)
            if (r27 != 0) goto Lc6
            return
        Lc6:
            r0 = r27
            int r10 = r0.intValue()
            android.widget.TextView r0 = r15.tvTotalSavingBalance
            r24 = r0
            java.lang.String r7 = ai.kudi.agent.core.util.StringExtKt.getFormatAmount(r10)
            r0 = r24
            r0.setText(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.savings.p024ui.SavingsPlanFragment.populateView(java.util.List, java.lang.Integer):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ void populateView$default(SavingsPlanFragment savingsPlanFragment, List list, Integer $r3, int i, Object obj) {
        int $i0 = i & 2;
        if ($i0 != 0) {
            $r3 = null;
        }
        savingsPlanFragment.populateView(list, $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setupFilter() {
        updateDateOnFilter();
        InterfaceC1523w interfaceC1523w = new InterfaceC1523w() { // from class: ai.kudi.agent.savings.ui.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: b */
            public final void m38499b(String str, Bundle bundle) {
                SavingsPlanFragment $r3 = SavingsPlanFragment.this;
                SavingsPlanFragment.m40550setupFilter$lambda5($r3, str, bundle);
            }
        };
        FragmentManager $r2 = getChildFragmentManager();
        PreferenceActivity $r3 = getViewLifecycleOwner();
        $r2.p1(DateFilterFragment.RESULT_KEY_FILTERED_DATE, $r3, interfaceC1523w);
        InterfaceC8209a $r4 = requireBinding();
        FragmentSavingsPlanBinding $r5 = (FragmentSavingsPlanBinding) $r4;
        TextView $r6 = $r5.filterView;
        TextView r10 = $r6;
        r10.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.savings.ui.ShareActivity
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SavingsPlanFragment $r22 = SavingsPlanFragment.this;
                SavingsPlanFragment.m40551setupFilter$lambda6($r22, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupFilter$lambda-5  reason: not valid java name */
    public static final void m40550setupFilter$lambda5(SavingsPlanFragment savingsPlanFragment, String str, Bundle bundle) {
        Log_OC.getArray(savingsPlanFragment, "this$0");
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
            savingsPlanFragment.filteredDate = $r4;
            savingsPlanFragment.updateDateOnFilter();
            SavingsPlanViewModel $r5 = savingsPlanFragment.getViewModel();
            $r5.filterSavingsPlan(savingsPlanFragment.filteredDate);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupFilter$lambda-6  reason: not valid java name */
    public static final void m40551setupFilter$lambda6(SavingsPlanFragment savingsPlanFragment, View view) {
        Log_OC.getArray(savingsPlanFragment, "this$0");
        DateFilterFragment.Companion $r2 = DateFilterFragment.Companion;
        DateFilterFragment $r3 = $r2.newInstance();
        FragmentManager $r4 = savingsPlanFragment.getChildFragmentManager();
        Chapter r5 = (Chapter) $r3;
        r5.show($r4, DateFilterFragment.PAGE_KEY);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void updateDateOnFilter() {
        InterfaceC8209a $r1 = requireBinding();
        FragmentSavingsPlanBinding $r2 = (FragmentSavingsPlanBinding) $r1;
        AppCompatTextView $r3 = $r2.filterView;
        FilteredDate $r4 = this.filteredDate;
        Date $r5 = $r4.getFrom();
        FilteredDate $r42 = this.filteredDate;
        Date $r6 = $r42.getTo();
        String $r7 = DateExtKt.getDateDiff$default($r5, $r6, 0, null, 8, null);
        $r3.setText($r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        SavingsPlanViewData $r2 = (SavingsPlanViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(SavingsPlanViewData savingsPlanViewData) {
        Log_OC.getArray(savingsPlanViewData, "viewData");
        boolean $z0 = savingsPlanViewData instanceof SavingsPlanViewData.ShowProgress;
        if ($z0) {
            SavingsPlanViewModel $r2 = getViewModel();
            SavingsPlanViewData.ShowProgress $r3 = (SavingsPlanViewData.ShowProgress) savingsPlanViewData;
            boolean $z02 = $r3.getVisibility();
            $r2.showProgress($z02);
            return;
        }
        boolean $z03 = savingsPlanViewData instanceof SavingsPlanViewData.Error;
        if ($z03) {
            FragmentActivity $r4 = requireActivity();
            Log_OC.loadImage($r4, "requireActivity()");
            int $i0 = C0456R.string.error_message;
            String $r5 = getString($i0);
            ContextExtKt.toast$default($r4, $r5, 0, 2, (Object) null);
            return;
        }
        boolean $z04 = savingsPlanViewData instanceof SavingsPlanViewData.Plans;
        if (!$z04) {
            boolean $z05 = savingsPlanViewData instanceof SavingsPlanViewData.Success;
            if ($z05) {
                SavingsPlanViewData.Success $r10 = (SavingsPlanViewData.Success) savingsPlanViewData;
                List $r8 = $r10.getSavingsList();
                populateView$default(this, $r8, null, 2, null);
                return;
            }
            return;
        }
        SavingsPlanViewData.Plans $r6 = (SavingsPlanViewData.Plans) savingsPlanViewData;
        SavingsPlanViewModel.TransactionsAndBalance $r7 = $r6.getPlan();
        List $r82 = $r7.getTransactions();
        SavingsPlanViewModel.TransactionsAndBalance $r72 = $r6.getPlan();
        int $i02 = $r72.getBalance();
        Integer $r9 = Integer.valueOf($i02);
        populateView($r82, $r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        SavingsPlanViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public SavingsPlanViewModel createViewModel() {
        SavingsPlanViewModel $r1 = getViewModel();
        return $r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return SavingsPlanViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public final SavingsPlanViewModel getViewModel() {
        SavingsPlanViewModel $r1 = this.viewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("viewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
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
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        Log_OC.getArray(menu, "menu");
        Log_OC.getArray(menuInflater, "inflater");
        int $i0 = C0456R.C0460menu.menu_saving;
        menuInflater.inflate($i0, menu);
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentSavingsPlanBinding $r4 = FragmentSavingsPlanBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Log_OC.getArray(menuItem, "item");
        int $i1 = menuItem.getItemId();
        int $i0 = C0456R.C0458id.action_saving_options;
        if ($i1 != $i0) {
            boolean $z0 = super.onOptionsItemSelected(menuItem);
            return $z0;
        }
        boolean $z02 = this.shouldHideCreateSavingOption;
        launchOptionsBottomSheet($z02);
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        FragmentActivity $r4 = getActivity();
        if ($r4 == null) {
            NullPointerException r16 = new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            throw r16;
        }
        AppCompatActivity $r5 = (AppCompatActivity) $r4;
        AbstractC0925a $r6 = $r5.getSupportActionBar();
        if ($r6 != null) {
            int $i0 = C0456R.string.savings_plan_title;
            String $r7 = getString($i0);
            $r6.mo37631C($r7);
        }
        InterfaceC8209a $r8 = requireBinding();
        FragmentSavingsPlanBinding $r9 = (FragmentSavingsPlanBinding) $r8;
        ViewGroup $r10 = $r9.kbCreateSaving;
        ViewGroup r17 = $r10;
        r17.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.savings.ui.MainActivity$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SavingsPlanFragment $r2 = SavingsPlanFragment.this;
                SavingsPlanFragment.m40548onViewCreated$lambda2$lambda0($r2, view2);
            }
        });
        Button $r11 = $r9.btnViewSavingsTransaction;
        $r11.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.savings.ui.FilenameDialog$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SavingsPlanFragment $r2 = SavingsPlanFragment.this;
                SavingsPlanFragment.m40549onViewCreated$lambda2$lambda1($r2, view2);
            }
        });
        setHasOptionsMenu(true);
        setupFilter();
    }

    public final void setViewModel(SavingsPlanViewModel savingsPlanViewModel) {
        Log_OC.getArray(savingsPlanViewModel, "<set-?>");
        this.viewModel = savingsPlanViewModel;
    }
}

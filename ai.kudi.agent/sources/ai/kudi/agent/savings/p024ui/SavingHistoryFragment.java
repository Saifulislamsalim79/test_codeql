package ai.kudi.agent.savings.p024ui;

import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.savings.C0456R;
import ai.kudi.agent.savings.adapter.SavingsPlanAdapter;
import ai.kudi.agent.savings.data.model.SavingResponse;
import ai.kudi.agent.savings.data.viewdata.SavingHistoryViewData;
import ai.kudi.agent.savings.databinding.FragmentSavingHistoryBinding;
import ai.kudi.agent.savings.viewmodel.SavingHistoryViewModel;
import ai.kudi.dip.library.p043h.DialogC0809i;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.p058os.C1372b;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import dagger.android.p197e.C7429a;
import java.util.ArrayList;
import java.util.List;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: SavingHistoryFragment.kt */
@Metadata(m10422d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 )2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001)B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003H\u0014J\b\u0010\u0015\u001a\u00020\u0002H\u0014J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J$\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u001f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010&\u001a\u00020\u0013H\u0002J\u0010\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006*"}, m10421d2 = {"Lai/kudi/agent/savings/ui/SavingHistoryFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/savings/viewmodel/SavingHistoryViewModel;", "Lai/kudi/agent/savings/data/viewdata/SavingHistoryViewData;", "Lai/kudi/agent/savings/databinding/FragmentSavingHistoryBinding;", "()V", "adapter", "Lai/kudi/agent/savings/adapter/SavingsPlanAdapter;", "history", "", "Lai/kudi/agent/savings/data/model/SavingResponse;", "selectedDuration", "", "viewModel", "getViewModel", "()Lai/kudi/agent/savings/viewmodel/SavingHistoryViewModel;", "setViewModel", "(Lai/kudi/agent/savings/viewmodel/SavingHistoryViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "showSavingStatusBottomSheet", "statusMapper", "string", "Companion", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.savings.ui.SavingHistoryFragment */
/* loaded from: classes.dex */
public final class SavingHistoryFragment extends BaseMVVMViewBindingFragment<SavingHistoryViewModel, SavingHistoryViewData, FragmentSavingHistoryBinding> {
    public static final Companion Companion;
    private static final String historyKey = "savingHistory";
    private final SavingsPlanAdapter adapter;
    private List<SavingResponse> history;
    private String selectedDuration;
    public SavingHistoryViewModel viewModel;

    /* compiled from: SavingHistoryFragment.kt */
    @Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/savings/ui/SavingHistoryFragment$Companion;", "", "()V", "historyKey", "", "newInstance", "Lai/kudi/agent/savings/ui/SavingHistoryFragment;", "savingsHistory", "", "Lai/kudi/agent/savings/data/model/SavingResponse;", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.savings.ui.SavingHistoryFragment$Companion */
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
        public final SavingHistoryFragment newInstance(List list) {
            Log_OC.getArray(list, "savingsHistory");
            SavingHistoryFragment $r2 = new SavingHistoryFragment();
            C13287o $r4 = C13664u.m4227a(SavingHistoryFragment.historyKey, list);
            C13287o[] $r3 = {$r4};
            Bundle $r5 = C1372b.m36174a($r3);
            $r2.setArguments($r5);
            return $r2;
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
    public SavingHistoryFragment() {
        ArrayList $r2 = new ArrayList();
        this.history = $r2;
        SavingHistoryFragment$adapter$1 $r1 = new SavingHistoryFragment$adapter$1(this);
        SavingsPlanAdapter $r3 = new SavingsPlanAdapter($r1);
        this.adapter = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final SavingHistoryFragment newInstance(List list) {
        Companion $r0 = Companion;
        SavingHistoryFragment $r1 = $r0.newInstance(list);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m40532onViewCreated$lambda1(SavingHistoryFragment savingHistoryFragment, View view) {
        Log_OC.getArray(savingHistoryFragment, "this$0");
        savingHistoryFragment.showSavingStatusBottomSheet();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showSavingStatusBottomSheet() {
        FragmentActivity $r2 = requireActivity();
        Log_OC.loadImage($r2, "requireActivity()");
        SavingHistoryFragment$showSavingStatusBottomSheet$1 r4 = new SavingHistoryFragment$showSavingStatusBottomSheet$1(this);
        Dialog r5 = new DialogC0809i($r2, r4);
        Dialog r6 = r5;
        r6.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String statusMapper(String $r1) {
        int $i0 = $r1.hashCode();
        switch ($i0) {
            case -1373735292:
                boolean $z0 = $r1.equals("Withdrawn");
                if ($z0) {
                    SavingsPlanAdapter.SavingStatus $r2 = SavingsPlanAdapter.SavingStatus.WITHDRAWN;
                    return $r2.name();
                }
                return $r1;
            case 89309323:
                boolean $z02 = $r1.equals("Inactive");
                if ($z02) {
                    SavingsPlanAdapter.SavingStatus $r22 = SavingsPlanAdapter.SavingStatus.DEACTIVATED;
                    return $r22.name();
                }
                return $r1;
            case 601036331:
                boolean $z03 = $r1.equals("Completed");
                if ($z03) {
                    SavingsPlanAdapter.SavingStatus $r23 = SavingsPlanAdapter.SavingStatus.COMPLETED;
                    return $r23.name();
                }
                return $r1;
            case 1955883814:
                boolean $z04 = $r1.equals("Active");
                if ($z04) {
                    SavingsPlanAdapter.SavingStatus $r24 = SavingsPlanAdapter.SavingStatus.ACTIVE;
                    return $r24.name();
                }
                return $r1;
            default:
                return $r1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        SavingHistoryViewData $r2 = (SavingHistoryViewData) viewData;
        applyViewData($r2);
    }

    protected void applyViewData(SavingHistoryViewData savingHistoryViewData) {
        Log_OC.getArray(savingHistoryViewData, "viewData");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        SavingHistoryViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public SavingHistoryViewModel createViewModel() {
        SavingHistoryViewModel $r1 = getViewModel();
        return $r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return SavingHistoryViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public final SavingHistoryViewModel getViewModel() {
        SavingHistoryViewModel $r1 = this.viewModel;
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
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle $r2 = getArguments();
        if ($r2 == null) {
            return;
        }
        List $r1 = this.history;
        ArrayList $r3 = $r2.getParcelableArrayList(historyKey);
        if ($r3 == null) {
            return;
        }
        $r1.addAll($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentSavingHistoryBinding $r4 = FragmentSavingHistoryBinding.inflate(layoutInflater, viewGroup, false);
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
        FragmentActivity $r3 = getActivity();
        if ($r3 == null) {
            NullPointerException r17 = new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            throw r17;
        }
        AppCompatActivity $r4 = (AppCompatActivity) $r3;
        AbstractC0925a $r5 = $r4.getSupportActionBar();
        if ($r5 != null) {
            int $i0 = C0456R.string.savings_history_title;
            String $r6 = getString($i0);
            $r5.mo37631C($r6);
        }
        InterfaceC8209a $r7 = requireBinding();
        FragmentSavingHistoryBinding $r8 = (FragmentSavingHistoryBinding) $r7;
        TextView $r9 = $r8.filterView;
        TextView r18 = $r9;
        r18.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.savings.ui.EditEventView$6
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SavingHistoryFragment $r2 = SavingHistoryFragment.this;
                SavingHistoryFragment.m40532onViewCreated$lambda1($r2, view2);
            }
        });
        InterfaceC8209a $r72 = requireBinding();
        FragmentSavingHistoryBinding $r82 = (FragmentSavingHistoryBinding) $r72;
        RecyclerView $r11 = $r82.rvSavingsPlan;
        SavingsPlanAdapter $r12 = this.adapter;
        List $r13 = this.history;
        $r12.submitList($r13);
        C13666w c13666w = C13666w.f30112a;
        $r11.setAdapter($r12);
    }

    public final void setViewModel(SavingHistoryViewModel savingHistoryViewModel) {
        Log_OC.getArray(savingHistoryViewModel, "<set-?>");
        this.viewModel = savingHistoryViewModel;
    }
}

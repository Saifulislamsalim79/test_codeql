package ai.kudi.agent.savings.p024ui;

import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.savings.C0456R;
import ai.kudi.agent.savings.data.viewdata.SavingTermsAndConditionViewData;
import ai.kudi.agent.savings.databinding.FragmentSavingsTermsAndConditionBinding;
import ai.kudi.agent.savings.viewmodel.SavingsTermsAndConditionViewModel;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import dagger.android.p197e.C7429a;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: SavingsTermsAndConditionFragment.kt */
@Metadata(m10422d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014J\b\u0010\u000e\u001a\u00020\u0002H\u0014J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0014J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u001e\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u001f"}, m10421d2 = {"Lai/kudi/agent/savings/ui/SavingsTermsAndConditionFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/savings/viewmodel/SavingsTermsAndConditionViewModel;", "Lai/kudi/agent/savings/data/viewdata/SavingTermsAndConditionViewData;", "Lai/kudi/agent/savings/databinding/FragmentSavingsTermsAndConditionBinding;", "()V", "viewModel", "getViewModel", "()Lai/kudi/agent/savings/viewmodel/SavingsTermsAndConditionViewModel;", "setViewModel", "(Lai/kudi/agent/savings/viewmodel/SavingsTermsAndConditionViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Companion", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.savings.ui.SavingsTermsAndConditionFragment */
/* loaded from: classes.dex */
public final class SavingsTermsAndConditionFragment extends BaseMVVMViewBindingFragment<SavingsTermsAndConditionViewModel, SavingTermsAndConditionViewData, FragmentSavingsTermsAndConditionBinding> {
    public static final Companion Companion;
    private static final String SAVING_TERMS = "file:///android_asset/SavingsTermsAndConditions.html";
    public SavingsTermsAndConditionViewModel viewModel;

    /* compiled from: SavingsTermsAndConditionFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/savings/ui/SavingsTermsAndConditionFragment$Companion;", "", "()V", "SAVING_TERMS", "", "newInstance", "Lai/kudi/agent/savings/ui/SavingsTermsAndConditionFragment;", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.savings.ui.SavingsTermsAndConditionFragment$Companion */
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
        public final SavingsTermsAndConditionFragment newInstance() {
            SavingsTermsAndConditionFragment $r1 = new SavingsTermsAndConditionFragment();
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
    public static final SavingsTermsAndConditionFragment newInstance() {
        Companion $r1 = Companion;
        SavingsTermsAndConditionFragment $r0 = $r1.newInstance();
        return $r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m40555onViewCreated$lambda0(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-3$lambda-1  reason: not valid java name */
    public static final void m40556onViewCreated$lambda3$lambda1(SavingsTermsAndConditionFragment savingsTermsAndConditionFragment, View view) {
        Log_OC.getArray(savingsTermsAndConditionFragment, "this$0");
        SavingsTermsAndConditionViewModel $r0 = savingsTermsAndConditionFragment.getViewModel();
        $r0.launchCreateSavingsFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-3$lambda-2  reason: not valid java name */
    public static final void m40557onViewCreated$lambda3$lambda2(SavingsTermsAndConditionFragment savingsTermsAndConditionFragment, View view) {
        Log_OC.getArray(savingsTermsAndConditionFragment, "this$0");
        FragmentActivity $r0 = savingsTermsAndConditionFragment.getActivity();
        if ($r0 == null) {
            NullPointerException $r4 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.savings.ui.SavingsActivity");
            throw $r4;
        }
        SavingsActivity $r3 = (SavingsActivity) $r0;
        $r3.finish();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        SavingTermsAndConditionViewData $r2 = (SavingTermsAndConditionViewData) viewData;
        applyViewData($r2);
    }

    protected void applyViewData(SavingTermsAndConditionViewData savingTermsAndConditionViewData) {
        Log_OC.getArray(savingTermsAndConditionViewData, "viewData");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        SavingsTermsAndConditionViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public SavingsTermsAndConditionViewModel createViewModel() {
        SavingsTermsAndConditionViewModel $r1 = getViewModel();
        return $r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return SavingsTermsAndConditionViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public final SavingsTermsAndConditionViewModel getViewModel() {
        SavingsTermsAndConditionViewModel $r1 = this.viewModel;
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
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentSavingsTermsAndConditionBinding $r4 = FragmentSavingsTermsAndConditionBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(\n                inflater, container, false\n            )");
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
            NullPointerException r18 = new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            throw r18;
        }
        AppCompatActivity $r4 = (AppCompatActivity) $r3;
        AbstractC0925a $r5 = $r4.getSupportActionBar();
        if ($r5 != null) {
            int $i0 = C0456R.string.terms_and_conditions_title;
            String $r6 = getString($i0);
            $r5.mo37631C($r6);
        }
        InterfaceC8209a $r7 = requireBinding();
        ViewGroup $r9 = ((FragmentSavingsTermsAndConditionBinding) $r7).startButton;
        View.OnClickListener $r10 = Logger.log;
        ViewGroup r19 = $r9;
        r19.setOnClickListener($r10);
        InterfaceC8209a $r72 = requireBinding();
        FragmentSavingsTermsAndConditionBinding $r8 = (FragmentSavingsTermsAndConditionBinding) $r72;
        WebView $r11 = $r8.webView2;
        $r11.loadUrl("file:///android_asset/SavingsTermsAndConditions.html");
        ViewGroup $r92 = $r8.startButton;
        ViewGroup r192 = $r92;
        r192.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.savings.ui.k
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SavingsTermsAndConditionFragment $r2 = SavingsTermsAndConditionFragment.this;
                SavingsTermsAndConditionFragment.m40556onViewCreated$lambda3$lambda1($r2, view2);
            }
        });
        TextView $r13 = $r8.tvCancel;
        $r13.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.savings.ui.EulaActivity$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SavingsTermsAndConditionFragment $r2 = SavingsTermsAndConditionFragment.this;
                SavingsTermsAndConditionFragment.m40557onViewCreated$lambda3$lambda2($r2, view2);
            }
        });
    }

    public final void setViewModel(SavingsTermsAndConditionViewModel savingsTermsAndConditionViewModel) {
        Log_OC.getArray(savingsTermsAndConditionViewModel, "<set-?>");
        this.viewModel = savingsTermsAndConditionViewModel;
    }
}

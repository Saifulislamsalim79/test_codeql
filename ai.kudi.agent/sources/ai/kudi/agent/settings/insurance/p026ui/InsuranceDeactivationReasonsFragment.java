package ai.kudi.agent.settings.insurance.p026ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.FragmentExtensionKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.FragmentInsuranceDeactivationReasonsBinding;
import ai.kudi.agent.settings.insurance.p026ui.adapter.InsuranceDeactivationReasonsAdapter;
import ai.kudi.agent.settings.insurance.presentation.InsuranceDeactivationReasonViewModel;
import ai.kudi.agent.settings.insurance.presentation.InsuranceDeactivationReasonViewState;
import ai.kudi.agent.settings.insurance.xpp3.CashInsuranceActivitySubComponent;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.PreferenceActivity;
import androidx.recyclerview.widget.C1723k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.trello.rxlifecycle2.p190e.p191a.p192a.C7390a;
import java.util.List;
import kotlin.C13218k;
import kotlin.C13666w;
import kotlin.InterfaceC11824h;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11680b;
/* compiled from: InsuranceDeactivationReasonsFragment.kt */
@Metadata(m10422d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 -2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001-B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0014J\b\u0010\u0014\u001a\u00020\u0002H\u0014J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0014J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J$\u0010\"\u001a\u00020#2\u0006\u0010 \u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J\u001a\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020#2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0017R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001e\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006."}, m10421d2 = {"Lai/kudi/agent/settings/insurance/ui/InsuranceDeactivationReasonsFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/settings/insurance/presentation/InsuranceDeactivationReasonViewModel;", "Lai/kudi/agent/settings/insurance/presentation/InsuranceDeactivationReasonViewState;", "Lai/kudi/agent/databinding/FragmentInsuranceDeactivationReasonsBinding;", "()V", "reasonsAdapter", "Lai/kudi/agent/settings/insurance/ui/adapter/InsuranceDeactivationReasonsAdapter;", "getReasonsAdapter", "()Lai/kudi/agent/settings/insurance/ui/adapter/InsuranceDeactivationReasonsAdapter;", "reasonsAdapter$delegate", "Lkotlin/Lazy;", "viewModel", "getViewModel", "()Lai/kudi/agent/settings/insurance/presentation/InsuranceDeactivationReasonViewModel;", "setViewModel", "(Lai/kudi/agent/settings/insurance/presentation/InsuranceDeactivationReasonViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onViewCreated", "view", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.insurance.ui.InsuranceDeactivationReasonsFragment */
/* loaded from: classes.dex */
public final class InsuranceDeactivationReasonsFragment extends BaseMVVMViewBindingFragment<InsuranceDeactivationReasonViewModel, InsuranceDeactivationReasonViewState, FragmentInsuranceDeactivationReasonsBinding> {
    public static final Companion Companion;
    private final InterfaceC11824h reasonsAdapter$delegate;
    public InsuranceDeactivationReasonViewModel viewModel;

    /* compiled from: InsuranceDeactivationReasonsFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/settings/insurance/ui/InsuranceDeactivationReasonsFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/settings/insurance/ui/InsuranceDeactivationReasonsFragment;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.insurance.ui.InsuranceDeactivationReasonsFragment$Companion */
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
        public final InsuranceDeactivationReasonsFragment newInstance() {
            InsuranceDeactivationReasonsFragment $r1 = new InsuranceDeactivationReasonsFragment();
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
    public InsuranceDeactivationReasonsFragment() {
        InterfaceC11824h $r1;
        InsuranceDeactivationReasonsFragment$reasonsAdapter$2 $r2 = new InsuranceDeactivationReasonsFragment$reasonsAdapter$2(this);
        $r1 = C13218k.m5625b($r2);
        this.reasonsAdapter$delegate = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final InsuranceDeactivationReasonsAdapter getReasonsAdapter() {
        InterfaceC11824h $r2 = this.reasonsAdapter$delegate;
        Object $r1 = $r2.getValue();
        InsuranceDeactivationReasonsAdapter $r3 = (InsuranceDeactivationReasonsAdapter) $r1;
        return $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m40788onViewCreated$lambda0(InsuranceDeactivationReasonsFragment insuranceDeactivationReasonsFragment, String str) {
        Log_OC.getArray(insuranceDeactivationReasonsFragment, "this$0");
        Context $r1 = insuranceDeactivationReasonsFragment.requireContext();
        Log_OC.loadImage($r1, "requireContext()");
        ContextExtKt.toast($r1, str, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m40789onViewCreated$lambda1(Throwable th) {
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-3  reason: not valid java name */
    public static final void m40790onViewCreated$lambda3(InsuranceDeactivationReasonsFragment insuranceDeactivationReasonsFragment, String str) {
        Log_OC.getArray(insuranceDeactivationReasonsFragment, "this$0");
        FragmentManager $r3 = insuranceDeactivationReasonsFragment.getParentFragmentManager();
        Bundle $r0 = new Bundle();
        $r0.putString(CashInsuranceFragmentKt.RESULT_KEY_INSURANCE_REASON, str);
        C13666w c13666w = C13666w.f30112a;
        $r3.m35913o1(CashInsuranceFragmentKt.REQUEST_KEY_INSURANCE_REASON, $r0);
        AppCompatActivity $r5 = FragmentExtensionKt.requireAppCompatActivity(insuranceDeactivationReasonsFragment);
        $r5.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-4  reason: not valid java name */
    public static final void m40791onViewCreated$lambda4(Throwable th) {
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-6  reason: not valid java name */
    public static final void m40792onViewCreated$lambda6(InsuranceDeactivationReasonsFragment insuranceDeactivationReasonsFragment, View view) {
        Log_OC.getArray(insuranceDeactivationReasonsFragment, "this$0");
        InsuranceDeactivationReasonViewModel $r2 = insuranceDeactivationReasonsFragment.getViewModel();
        InterfaceC8209a $r3 = insuranceDeactivationReasonsFragment.requireBinding();
        FragmentInsuranceDeactivationReasonsBinding $r4 = (FragmentInsuranceDeactivationReasonsBinding) $r3;
        KudiInputField $r5 = $r4.insuranceReasonInputField;
        String $r6 = $r5.getText();
        $r2.onSubmitAction($r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        InsuranceDeactivationReasonViewState $r2 = (InsuranceDeactivationReasonViewState) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(InsuranceDeactivationReasonViewState insuranceDeactivationReasonViewState) {
        Log_OC.getArray(insuranceDeactivationReasonViewState, "viewData");
        InterfaceC8209a $r2 = requireBinding();
        FragmentInsuranceDeactivationReasonsBinding $r3 = (FragmentInsuranceDeactivationReasonsBinding) $r2;
        boolean $z0 = insuranceDeactivationReasonViewState.getShouldShowReasonTextField();
        if ($z0) {
            View $r4 = $r3.insuranceReasonInputField;
            Log_OC.loadImage($r4, "insuranceReasonInputField");
            View r7 = $r4;
            ViewExtKt.show(r7);
        } else {
            View $r42 = $r3.insuranceReasonInputField;
            Log_OC.loadImage($r42, "insuranceReasonInputField");
            View r72 = $r42;
            ViewExtKt.hide$default(r72, false, 1, null);
        }
        InsuranceDeactivationReasonsAdapter $r5 = getReasonsAdapter();
        List $r6 = insuranceDeactivationReasonViewState.getReasons();
        $r5.setItems($r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        InsuranceDeactivationReasonViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public InsuranceDeactivationReasonViewModel createViewModel() {
        InsuranceDeactivationReasonViewModel $r1 = getViewModel();
        return $r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return InsuranceDeactivationReasonViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public final InsuranceDeactivationReasonViewModel getViewModel() {
        InsuranceDeactivationReasonViewModel $r1 = this.viewModel;
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
        boolean $z0 = $r2 instanceof CashInsuranceActivity;
        if ($z0) {
            FragmentActivity $r22 = requireActivity();
            CashInsuranceActivity $r3 = (CashInsuranceActivity) $r22;
            CashInsuranceActivitySubComponent $r4 = $r3.getSubComponent();
            $r4.inject(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        Log_OC.getArray(menu, "menu");
        Log_OC.getArray(menuInflater, "inflater");
        menuInflater.inflate(C0001R.C0005menu.menu_more_options, menu);
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentInsuranceDeactivationReasonsBinding $r4 = FragmentInsuranceDeactivationReasonsBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(\n                inflater,\n                container,\n                false\n            )");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Log_OC.getArray(menuItem, "item");
        int $i0 = menuItem.getItemId();
        if ($i0 != 16908332) {
            boolean $z0 = super.onOptionsItemSelected(menuItem);
            return $z0;
        }
        FragmentActivity $r2 = requireActivity();
        $r2.onBackPressed();
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        InsuranceDeactivationReasonViewModel $r3 = getViewModel();
        $r3.onViewCreated();
        AppCompatActivity $r4 = FragmentExtensionKt.requireAppCompatActivity(this);
        InterfaceC8209a $r5 = requireBinding();
        FragmentInsuranceDeactivationReasonsBinding $r6 = (FragmentInsuranceDeactivationReasonsBinding) $r5;
        Toolbar $r7 = $r6.toolbar;
        $r4.setSupportActionBar($r7);
        InsuranceDeactivationReasonViewModel $r32 = getViewModel();
        C11680b $r8 = $r32.getToastMessage();
        PreferenceActivity $r9 = getViewLifecycleOwner();
        Log_OC.loadImage($r9, "viewLifecycleOwner");
        AbstractC11688p $r10 = C7390a.a($r8, $r9);
        Object object = new Object() { // from class: ai.kudi.agent.settings.insurance.ui.FlingerListView$ItemFlingerResponder
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InsuranceDeactivationReasonsFragment $r1 = InsuranceDeactivationReasonsFragment.this;
                String $r33 = (String) obj;
                InsuranceDeactivationReasonsFragment.m40788onViewCreated$lambda0($r1, $r33);
            }
        };
        Preferences $r12 = Preferences.USERNAME;
        $r10.e0(object, $r12);
        InsuranceDeactivationReasonViewModel $r33 = getViewModel();
        C11680b $r82 = $r33.getOnReasonSubmitted();
        PreferenceActivity $r92 = getViewLifecycleOwner();
        Log_OC.loadImage($r92, "viewLifecycleOwner");
        AbstractC11688p $r102 = C7390a.a($r82, $r92);
        Object object2 = new Object() { // from class: ai.kudi.agent.settings.insurance.ui.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InsuranceDeactivationReasonsFragment $r1 = InsuranceDeactivationReasonsFragment.this;
                String $r34 = (String) obj;
                InsuranceDeactivationReasonsFragment.m40790onViewCreated$lambda3($r1, $r34);
            }
        };
        Logger $r14 = Logger.log;
        $r102.e0(object2, $r14);
        InterfaceC8209a $r52 = requireBinding();
        FragmentInsuranceDeactivationReasonsBinding $r62 = (FragmentInsuranceDeactivationReasonsBinding) $r52;
        RecyclerView $r15 = $r62.insuranceReasonsList;
        InsuranceDeactivationReasonsAdapter $r16 = getReasonsAdapter();
        $r15.setAdapter($r16);
        Context $r18 = requireContext();
        LinearLayoutManager r25 = new LinearLayoutManager($r18);
        $r15.setLayoutManager(r25);
        $r15.setHasFixedSize(true);
        Context $r182 = requireContext();
        C1723k r26 = new C1723k($r182, 1);
        ColorDrawable r27 = new ColorDrawable(-1);
        r26.m34703f(r27);
        $r15.m35294h(r26);
        InterfaceC8209a $r53 = requireBinding();
        FragmentInsuranceDeactivationReasonsBinding $r63 = (FragmentInsuranceDeactivationReasonsBinding) $r53;
        ViewGroup $r21 = $r63.insuranceReasonContinueButton;
        ViewGroup r29 = $r21;
        r29.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.insurance.ui.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                InsuranceDeactivationReasonsFragment $r2 = InsuranceDeactivationReasonsFragment.this;
                InsuranceDeactivationReasonsFragment.m40792onViewCreated$lambda6($r2, view2);
            }
        });
    }

    public final void setViewModel(InsuranceDeactivationReasonViewModel insuranceDeactivationReasonViewModel) {
        Log_OC.getArray(insuranceDeactivationReasonViewModel, "<set-?>");
        this.viewModel = insuranceDeactivationReasonViewModel;
    }
}

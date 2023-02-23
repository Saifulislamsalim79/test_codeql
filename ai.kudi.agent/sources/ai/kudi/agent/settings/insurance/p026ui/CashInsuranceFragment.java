package ai.kudi.agent.settings.insurance.p026ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.CustomDialog;
import ai.kudi.agent.core.util.FragmentExtensionKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.FragmentCashInsuranceBinding;
import ai.kudi.agent.settings.insurance.data.InsuranceDetailModel;
import ai.kudi.agent.settings.insurance.data.InsuranceError;
import ai.kudi.agent.settings.insurance.p026ui.CashInsuranceOptionMenuBottomSheet;
import ai.kudi.agent.settings.insurance.presentation.CashInsuranceViewModel;
import ai.kudi.agent.settings.insurance.presentation.CashInsuranceViewState;
import ai.kudi.agent.settings.insurance.xpp3.CashInsuranceActivitySubComponent;
import ai.kudi.agent.transactionhistory.mapper.ServerTimeToTransactionDayMapper;
import android.app.Dialog;
import android.content.Context;
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
import androidx.fragment.app.InterfaceC1523w;
import androidx.lifecycle.PreferenceActivity;
import com.trello.rxlifecycle2.p190e.p191a.p192a.C7390a;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11680b;
/* compiled from: CashInsuranceFragment.kt */
@Metadata(m10422d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 52\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00015B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0014J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0002H\u0014J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0012H\u0002J\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0012\u0010\u001e\u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0018\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J&\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010$\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0016J\u001a\u0010/\u001a\u00020\u00122\u0006\u00100\u001a\u00020'2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0017J\u0012\u00101\u001a\u00020\u00122\b\u00102\u001a\u0004\u0018\u000103H\u0002J\b\u00104\u001a\u00020\u0012H\u0002R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u00066"}, m10421d2 = {"Lai/kudi/agent/settings/insurance/ui/CashInsuranceFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/settings/insurance/presentation/CashInsuranceViewModel;", "Lai/kudi/agent/settings/insurance/presentation/CashInsuranceViewState;", "Lai/kudi/agent/databinding/FragmentCashInsuranceBinding;", "()V", "serverTimeToTransactionDayMapper", "Lai/kudi/agent/transactionhistory/mapper/ServerTimeToTransactionDayMapper;", "getServerTimeToTransactionDayMapper", "()Lai/kudi/agent/transactionhistory/mapper/ServerTimeToTransactionDayMapper;", "setServerTimeToTransactionDayMapper", "(Lai/kudi/agent/transactionhistory/mapper/ServerTimeToTransactionDayMapper;)V", "viewModel", "getViewModel", "()Lai/kudi/agent/settings/insurance/presentation/CashInsuranceViewModel;", "setViewModel", "(Lai/kudi/agent/settings/insurance/presentation/CashInsuranceViewModel;)V", "applyViewData", "", "viewData", "bindDetailsData", "insuranceDetails", "Lai/kudi/agent/settings/insurance/data/InsuranceDetailModel;", "createViewModel", "getVMType", "Ljava/lang/Class;", "observeFragmentResults", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onViewCreated", "view", "renderConfirmDeactivateDialog", "reason", "", "renderOptionsBottomSheet", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.insurance.ui.CashInsuranceFragment */
/* loaded from: classes.dex */
public final class CashInsuranceFragment extends BaseMVVMViewBindingFragment<CashInsuranceViewModel, CashInsuranceViewState, FragmentCashInsuranceBinding> {
    public static final Companion Companion;
    public ServerTimeToTransactionDayMapper serverTimeToTransactionDayMapper;
    public CashInsuranceViewModel viewModel;

    /* compiled from: CashInsuranceFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/settings/insurance/ui/CashInsuranceFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/settings/insurance/ui/CashInsuranceFragment;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.insurance.ui.CashInsuranceFragment$Companion */
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
        public final CashInsuranceFragment newInstance() {
            CashInsuranceFragment $r1 = new CashInsuranceFragment();
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
    /* JADX WARN: Incorrect condition in loop: B:35:0x010d */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0100 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void bindDetailsData(ai.kudi.agent.settings.insurance.data.InsuranceDetailModel r44) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.insurance.p026ui.CashInsuranceFragment.bindDetailsData(ai.kudi.agent.settings.insurance.data.InsuranceDetailModel):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void observeFragmentResults() {
        FragmentManager $r2 = getParentFragmentManager();
        PreferenceActivity $r3 = getViewLifecycleOwner();
        $r2.p1(CashInsuranceFragmentKt.REQUEST_KEY_INSURANCE_REASON, $r3, new InterfaceC1523w() { // from class: ai.kudi.agent.settings.insurance.ui.c
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: b */
            public final void m38397b(String str, Bundle bundle) {
                CashInsuranceFragment $r32 = CashInsuranceFragment.this;
                CashInsuranceFragment.m40784observeFragmentResults$lambda2($r32, str, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: observeFragmentResults$lambda-2  reason: not valid java name */
    public static final void m40784observeFragmentResults$lambda2(CashInsuranceFragment cashInsuranceFragment, String str, Bundle bundle) {
        Log_OC.getArray(cashInsuranceFragment, "this$0");
        Log_OC.getArray(str, "requestKey");
        Log_OC.getArray(bundle, "result");
        boolean $z0 = Log_OC.append(str, CashInsuranceFragmentKt.REQUEST_KEY_INSURANCE_REASON);
        if ($z0) {
            String $r2 = bundle.getString(CashInsuranceFragmentKt.RESULT_KEY_INSURANCE_REASON);
            cashInsuranceFragment.renderConfirmDeactivateDialog($r2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m40785onViewCreated$lambda0(CashInsuranceFragment cashInsuranceFragment, String str) {
        Log_OC.getArray(cashInsuranceFragment, "this$0");
        Context $r1 = cashInsuranceFragment.requireContext();
        Log_OC.loadImage($r1, "requireContext()");
        ContextExtKt.toast($r1, str, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m40786onViewCreated$lambda1(Throwable th) {
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void renderConfirmDeactivateDialog(String str) {
        CustomDialog.Companion $r2 = CustomDialog.Companion;
        Context $r5 = requireContext();
        Log_OC.loadImage($r5, "requireContext()");
        String $r6 = getString(C0001R.string.confirm_deactivate_insurance_title);
        Log_OC.loadImage($r6, "getString(R.string.confirm_deactivate_insurance_title)");
        String $r7 = getString(C0001R.string.confirm_deactivate_insurance_description);
        Log_OC.loadImage($r7, "getString(R.string.confirm_deactivate_insurance_description)");
        String $r8 = getString(C0001R.string.deactivate);
        Log_OC.loadImage($r8, "getString(R.string.deactivate)");
        CashInsuranceFragment$renderConfirmDeactivateDialog$1 $r3 = new CashInsuranceFragment$renderConfirmDeactivateDialog$1(this, str);
        CashInsuranceFragment$renderConfirmDeactivateDialog$2 $r4 = CashInsuranceFragment$renderConfirmDeactivateDialog$2.INSTANCE;
        CustomDialog.Companion.showConfirmDialog$default($r2, $r5, $r6, $r7, $r8, false, $r3, $r4, 16, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void renderOptionsBottomSheet() {
        CashInsuranceOptionMenuBottomSheet.OnActionListener onActionListener = new CashInsuranceOptionMenuBottomSheet.OnActionListener() { // from class: ai.kudi.agent.settings.insurance.ui.CashInsuranceFragment$renderOptionsBottomSheet$bottomSheetListener$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.settings.insurance.p026ui.CashInsuranceOptionMenuBottomSheet.OnActionListener
            public void onDeactivateInsurance() {
                CashInsuranceFragment $r2 = CashInsuranceFragment.this;
                CashInsuranceViewModel $r1 = $r2.getViewModel();
                $r1.onDeactivateInsuranceAction();
            }
        };
        Context $r3 = requireContext();
        Log_OC.loadImage($r3, "requireContext()");
        Dialog r5 = new CashInsuranceOptionMenuBottomSheet($r3, onActionListener);
        Dialog r6 = r5;
        r6.show();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        CashInsuranceViewState $r2 = (CashInsuranceViewState) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(CashInsuranceViewState cashInsuranceViewState) {
        Log_OC.getArray(cashInsuranceViewState, "viewData");
        InterfaceC8209a $r2 = requireBinding();
        FragmentCashInsuranceBinding $r3 = (FragmentCashInsuranceBinding) $r2;
        View $r4 = $r3.fullScreenLoader;
        boolean $z0 = cashInsuranceViewState.isLoadingData();
        if ($z0) {
            Log_OC.loadImage($r4, "");
            View r8 = $r4;
            ViewExtKt.show(r8);
        } else {
            Log_OC.loadImage($r4, "");
            View r82 = $r4;
            ViewExtKt.hide$default(r82, false, 1, null);
        }
        InsuranceError $r5 = cashInsuranceViewState.getErrorDetails();
        if ($r5 != null) {
            FragmentActivity $r6 = requireActivity();
            $r6.finish();
            return;
        }
        InsuranceDetailModel $r7 = cashInsuranceViewState.getInsuranceDetails();
        if ($r7 != null) {
            InsuranceDetailModel $r72 = cashInsuranceViewState.getInsuranceDetails();
            bindDetailsData($r72);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        CashInsuranceViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public CashInsuranceViewModel createViewModel() {
        CashInsuranceViewModel $r1 = getViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ServerTimeToTransactionDayMapper getServerTimeToTransactionDayMapper() {
        ServerTimeToTransactionDayMapper $r1 = this.serverTimeToTransactionDayMapper;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("serverTimeToTransactionDayMapper");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return CashInsuranceViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public final CashInsuranceViewModel getViewModel() {
        CashInsuranceViewModel $r1 = this.viewModel;
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
        FragmentCashInsuranceBinding $r4 = FragmentCashInsuranceBinding.inflate(layoutInflater, viewGroup, false);
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
        int $i0 = menuItem.getItemId();
        if ($i0 == 16908332) {
            FragmentActivity $r2 = requireActivity();
            $r2.onBackPressed();
            return true;
        }
        int $i02 = menuItem.getItemId();
        if ($i02 == C0001R.C0003id.action_menu_options) {
            renderOptionsBottomSheet();
            return true;
        }
        boolean $z0 = super.onOptionsItemSelected(menuItem);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        CashInsuranceViewModel $r3 = getViewModel();
        $r3.onViewCreated();
        AppCompatActivity $r4 = FragmentExtensionKt.requireAppCompatActivity(this);
        InterfaceC8209a $r5 = requireBinding();
        FragmentCashInsuranceBinding $r6 = (FragmentCashInsuranceBinding) $r5;
        Toolbar $r7 = $r6.toolbar;
        $r4.setSupportActionBar($r7);
        CashInsuranceViewModel $r32 = getViewModel();
        C11680b $r8 = $r32.getToastMessage();
        PreferenceActivity $r9 = getViewLifecycleOwner();
        Log_OC.loadImage($r9, "viewLifecycleOwner");
        AbstractC11688p $r10 = C7390a.a($r8, $r9);
        Object object = new Object() { // from class: ai.kudi.agent.settings.insurance.ui.Socks5BytestreamRequest
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CashInsuranceFragment $r1 = CashInsuranceFragment.this;
                String $r33 = (String) obj;
                CashInsuranceFragment.m40785onViewCreated$lambda0($r1, $r33);
            }
        };
        WebViewFragment $r12 = WebViewFragment.webView;
        $r10.e0(object, $r12);
        observeFragmentResults();
    }

    public final void setServerTimeToTransactionDayMapper(ServerTimeToTransactionDayMapper serverTimeToTransactionDayMapper) {
        Log_OC.getArray(serverTimeToTransactionDayMapper, "<set-?>");
        this.serverTimeToTransactionDayMapper = serverTimeToTransactionDayMapper;
    }

    public final void setViewModel(CashInsuranceViewModel cashInsuranceViewModel) {
        Log_OC.getArray(cashInsuranceViewModel, "<set-?>");
        this.viewModel = cashInsuranceViewModel;
    }
}

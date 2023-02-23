package ai.kudi.agent.pos.p016ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.databinding.FragmentLeasePosTermsOfAgreementBinding;
import ai.kudi.agent.pos.data.PosTypeData;
import ai.kudi.agent.pos.game.components.PosSubComponent;
import ai.kudi.agent.pos.p016ui.viewModels.LeasePosAgreementViewData;
import ai.kudi.agent.pos.p016ui.viewModels.LeasePosAgreementVm;
import ai.kudi.dip.library.button.KudiButton;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.core.content.C1335a;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p201g.p270x.InterfaceC8209a;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11690q;
import p425j.p444e.InterfaceC11691r;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
/* compiled from: LeasePosTermsOfAgreementFragment.kt */
@Metadata(m10422d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 (2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001(B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003H\u0014J\b\u0010\u0015\u001a\u00020\u0002H\u0014J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0014J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010%\u001a\u00020\u0013H\u0016J\u001a\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020 2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0017R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, m10421d2 = {"Lai/kudi/agent/pos/ui/LeasePosTermsOfAgreementFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/pos/ui/viewModels/LeasePosAgreementVm;", "Lai/kudi/agent/pos/ui/viewModels/LeasePosAgreementViewData;", "Lai/kudi/agent/databinding/FragmentLeasePosTermsOfAgreementBinding;", "()V", "disposable", "Lio/reactivex/disposables/Disposable;", "leasePosAgreementVm", "getLeasePosAgreementVm", "()Lai/kudi/agent/pos/ui/viewModels/LeasePosAgreementVm;", "setLeasePosAgreementVm", "(Lai/kudi/agent/pos/ui/viewModels/LeasePosAgreementVm;)V", LeasePosTermsOfAgreementFragment.LEASING_DATA, "", "Lai/kudi/agent/pos/data/PosTypeData;", "posActivity", "Lai/kudi/agent/pos/ui/PosActivity;", "applyViewData", "", "viewData", "createViewModel", "enableAgreementAndDisagreementButtons", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onPause", "onViewCreated", "view", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.pos.ui.LeasePosTermsOfAgreementFragment */
/* loaded from: classes.dex */
public final class LeasePosTermsOfAgreementFragment extends BaseMVVMViewBindingFragment<LeasePosAgreementVm, LeasePosAgreementViewData, FragmentLeasePosTermsOfAgreementBinding> {
    public static final Companion Companion;
    public static final String LEASING_DATA = "leasingData";
    private FavoritesArrayAdapter disposable;
    public LeasePosAgreementVm leasePosAgreementVm;
    private List<PosTypeData> leasingData;
    private PosActivity posActivity;

    /* compiled from: LeasePosTermsOfAgreementFragment.kt */
    @Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/pos/ui/LeasePosTermsOfAgreementFragment$Companion;", "", "()V", "LEASING_DATA", "", "newInstance", "Lai/kudi/agent/pos/ui/LeasePosTermsOfAgreementFragment;", "leasePosData", "", "Lai/kudi/agent/pos/data/PosTypeData;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.pos.ui.LeasePosTermsOfAgreementFragment$Companion */
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
        public final LeasePosTermsOfAgreementFragment newInstance(List list) {
            Log_OC.getArray(list, "leasePosData");
            LeasePosTermsOfAgreementFragment $r4 = new LeasePosTermsOfAgreementFragment();
            Bundle $r1 = new Bundle();
            ArrayList $r2 = new ArrayList(list);
            $r1.putParcelableArrayList(LeasePosTermsOfAgreementFragment.LEASING_DATA, $r2);
            C13666w c13666w = C13666w.f30112a;
            $r4.setArguments($r1);
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
    public LeasePosTermsOfAgreementFragment() {
        List $r1;
        $r1 = C13726r.m3891e();
        this.leasingData = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void enableAgreementAndDisagreementButtons() {
        InterfaceC8209a $r1 = requireBinding();
        FragmentLeasePosTermsOfAgreementBinding $r2 = (FragmentLeasePosTermsOfAgreementBinding) $r1;
        KudiButton $r3 = $r2.termsOfLeaseAgreementButton;
        $r3.m38034d();
        ViewGroup $r32 = $r2.termsOfLeaseDisagreementButton;
        ViewGroup r6 = $r32;
        r6.setEnabled(true);
        KudiButton $r33 = $r2.termsOfLeaseAgreementButton;
        $r33.setButtonDrawableTint(C0001R.color.colorPrimary);
        KudiButton $r34 = $r2.termsOfLeaseDisagreementButton;
        $r34.setButtonDrawableTint(C0001R.color.KudiRed);
        KudiButton $r35 = $r2.termsOfLeaseDisagreementButton;
        $r35.setButtonTextColor(C0001R.color.KudiRed);
        ViewGroup $r36 = $r2.termsOfLeaseDisagreementButton;
        Context $r4 = requireContext();
        Drawable $r5 = C1335a.m36322f($r4, C0001R.C0002drawable.button_border_red);
        ViewGroup r62 = $r36;
        r62.setBackground($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final LeasePosTermsOfAgreementFragment newInstance(List list) {
        Companion $r0 = Companion;
        LeasePosTermsOfAgreementFragment $r1 = $r0.newInstance(list);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-6$lambda-1  reason: not valid java name */
    public static final void m40039onViewCreated$lambda6$lambda1(FragmentLeasePosTermsOfAgreementBinding fragmentLeasePosTermsOfAgreementBinding, InterfaceC11690q interfaceC11690q) {
        Log_OC.getArray(fragmentLeasePosTermsOfAgreementBinding, "$this_apply");
        Log_OC.getArray(interfaceC11690q, "it");
        WebView $r2 = fragmentLeasePosTermsOfAgreementBinding.termsOfLeaseWebView;
        $r2.loadUrl("file:///android_asset/html/terms.html");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-6$lambda-2  reason: not valid java name */
    public static final void m40040onViewCreated$lambda6$lambda2(C13666w c13666w) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-6$lambda-4  reason: not valid java name */
    public static final void m40042onViewCreated$lambda6$lambda4(LeasePosTermsOfAgreementFragment leasePosTermsOfAgreementFragment, View view) {
        Log_OC.getArray(leasePosTermsOfAgreementFragment, "this$0");
        PosActivity $r2 = leasePosTermsOfAgreementFragment.posActivity;
        if ($r2 == null) {
            return;
        }
        $r2.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-6$lambda-5  reason: not valid java name */
    public static final void m40043onViewCreated$lambda6$lambda5(LeasePosTermsOfAgreementFragment leasePosTermsOfAgreementFragment, View view) {
        Log_OC.getArray(leasePosTermsOfAgreementFragment, "this$0");
        LeasePosAgreementVm $r0 = leasePosTermsOfAgreementFragment.getLeasePosAgreementVm();
        List $r3 = leasePosTermsOfAgreementFragment.leasingData;
        $r0.navigateToPosSelectionFragment($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        LeasePosAgreementViewData $r2 = (LeasePosAgreementViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(LeasePosAgreementViewData leasePosAgreementViewData) {
        Log_OC.getArray(leasePosAgreementViewData, "viewData");
        String $r2 = leasePosAgreementViewData.getTime();
        if ($r2 != null) {
            InterfaceC8209a $r3 = requireBinding();
            FragmentLeasePosTermsOfAgreementBinding $r4 = (FragmentLeasePosTermsOfAgreementBinding) $r3;
            TextView $r5 = $r4.countDownTimerText;
            $r5.setText($r2);
        }
        boolean $z0 = leasePosAgreementViewData.isCountDownDone();
        if ($z0) {
            enableAgreementAndDisagreementButtons();
        }
        if (leasePosAgreementViewData.getCustomerError() == null) {
            return;
        }
        FragmentActivity $r6 = requireActivity();
        Log_OC.loadImage($r6, "requireActivity()");
        ContextExtKt.toast$default($r6, (int) C0001R.string.error_occurred, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        LeasePosAgreementVm $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public LeasePosAgreementVm createViewModel() {
        LeasePosAgreementVm $r1 = getLeasePosAgreementVm();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final LeasePosAgreementVm getLeasePosAgreementVm() {
        LeasePosAgreementVm $r1 = this.leasePosAgreementVm;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("leasePosAgreementVm");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return LeasePosAgreementVm.class;
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
        if ($z0) {
            PosActivity $r3 = (PosActivity) context;
            this.posActivity = $r3;
            if ($r3 == null || ($r1 = $r3.getPos2SubComponent()) == null) {
                return;
            }
            $r1.inject(this);
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
        ArrayList $r2 = $r1.getParcelableArrayList(LEASING_DATA);
        if ($r2 != null) {
            this.leasingData = $r2;
        } else {
            NullPointerException $r3 = new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<ai.kudi.agent.pos.data.PosTypeData>{ kotlin.collections.TypeAliasesKt.ArrayList<ai.kudi.agent.pos.data.PosTypeData> }");
            throw $r3;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentLeasePosTermsOfAgreementBinding $r4 = FragmentLeasePosTermsOfAgreementBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(\n                inflater,\n                container,\n                false\n            )");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        FavoritesArrayAdapter $r1 = this.disposable;
        if ($r1 == null) {
            return;
        }
        $r1.backup();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        InterfaceC8209a $r4 = requireBinding();
        final FragmentLeasePosTermsOfAgreementBinding $r5 = (FragmentLeasePosTermsOfAgreementBinding) $r4;
        KudiButton $r6 = $r5.termsOfLeaseAgreementButton;
        $r6.m38035c();
        ViewGroup $r62 = $r5.termsOfLeaseDisagreementButton;
        ViewGroup r18 = $r62;
        r18.setEnabled(false);
        WebView $r7 = $r5.termsOfLeaseWebView;
        WebSettings $r8 = $r7.getSettings();
        $r8.getJavaScriptEnabled();
        AbstractC11688p $r10 = AbstractC11688p.m10494q(new InterfaceC11691r() { // from class: ai.kudi.agent.pos.ui.a
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.InterfaceC11691r
            /* renamed from: a */
            public final void mo3155a(InterfaceC11690q interfaceC11690q) {
                FragmentLeasePosTermsOfAgreementBinding $r2 = FragmentLeasePosTermsOfAgreementBinding.this;
                LeasePosTermsOfAgreementFragment.m40039onViewCreated$lambda6$lambda1($r2, interfaceC11690q);
            }
        });
        Logger $r11 = Logger.log;
        Constants $r1 = Constants.INSTANCE;
        FavoritesArrayAdapter $r12 = $r10.e0($r11, $r1);
        this.disposable = $r12;
        ViewGroup $r63 = $r5.termsOfLeaseDisagreementButton;
        ViewGroup r182 = $r63;
        r182.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.pos.ui.EulaActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LeasePosTermsOfAgreementFragment $r2 = LeasePosTermsOfAgreementFragment.this;
                LeasePosTermsOfAgreementFragment.m40042onViewCreated$lambda6$lambda4($r2, view2);
            }
        });
        ViewGroup $r64 = $r5.termsOfLeaseAgreementButton;
        ViewGroup r183 = $r64;
        r183.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.pos.ui.Main
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LeasePosTermsOfAgreementFragment $r2 = LeasePosTermsOfAgreementFragment.this;
                LeasePosTermsOfAgreementFragment.m40043onViewCreated$lambda6$lambda5($r2, view2);
            }
        });
    }

    public final void setLeasePosAgreementVm(LeasePosAgreementVm leasePosAgreementVm) {
        Log_OC.getArray(leasePosAgreementVm, "<set-?>");
        this.leasePosAgreementVm = leasePosAgreementVm;
    }
}

package ai.kudi.agent.kshock.p009ui.views;

import ai.kudi.agent.core.domain.room_entities.MiniKshockDetails;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.feature_kshock.C0220R;
import ai.kudi.agent.feature_kshock.databinding.FragmentKshckExistingLoanerBinding;
import ai.kudi.agent.kshock.p009ui.KShockActivity;
import ai.kudi.agent.kshock.presentation.KshockExistingLoanerViewModel;
import ai.kudi.agent.kshock.presentation.viewdata.KshockExistingLoanerViewData;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.p058os.C1372b;
import androidx.fragment.app.FragmentActivity;
import dagger.android.p197e.C7429a;
import java.math.BigDecimal;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: KshockExistingLoanerFragment.kt */
@Metadata(m10422d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 !2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003H\u0014J\b\u0010\u0010\u001a\u00020\u0002H\u0014J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J$\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001a\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u001e\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, m10421d2 = {"Lai/kudi/agent/kshock/ui/views/KshockExistingLoanerFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/kshock/presentation/KshockExistingLoanerViewModel;", "Lai/kudi/agent/kshock/presentation/viewdata/KshockExistingLoanerViewData;", "Lai/kudi/agent/feature_kshock/databinding/FragmentKshckExistingLoanerBinding;", "()V", "kshockExistingLoanerViewModel", "getKshockExistingLoanerViewModel", "()Lai/kudi/agent/kshock/presentation/KshockExistingLoanerViewModel;", "setKshockExistingLoanerViewModel", "(Lai/kudi/agent/kshock/presentation/KshockExistingLoanerViewModel;)V", "maxLoanAmt", "", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "Companion", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.kshock.ui.views.KshockExistingLoanerFragment */
/* loaded from: classes.dex */
public final class KshockExistingLoanerFragment extends BaseMVVMViewBindingFragment<KshockExistingLoanerViewModel, KshockExistingLoanerViewData, FragmentKshckExistingLoanerBinding> {
    public static final Companion Companion;
    private static final String KEY_MAX_LOAN_AMT = "amt";
    public KshockExistingLoanerViewModel kshockExistingLoanerViewModel;
    private double maxLoanAmt;

    /* compiled from: KshockExistingLoanerFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/views/KshockExistingLoanerFragment$Companion;", "", "()V", "KEY_MAX_LOAN_AMT", "", "newInstance", "Lai/kudi/agent/kshock/ui/views/KshockExistingLoanerFragment;", "maxLoanAmt", "", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.kshock.ui.views.KshockExistingLoanerFragment$Companion */
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
        public final KshockExistingLoanerFragment newInstance(double d) {
            KshockExistingLoanerFragment $r1 = new KshockExistingLoanerFragment();
            Double $r3 = Double.valueOf(d);
            C13287o $r4 = C13664u.m4227a("amt", $r3);
            C13287o[] $r2 = {$r4};
            Bundle $r5 = C1372b.m36174a($r2);
            $r1.setArguments($r5);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: applyViewData$lambda-3$lambda-2$lambda-1  reason: not valid java name */
    public static final void m39645applyViewData$lambda3$lambda2$lambda1(KshockExistingLoanerFragment kshockExistingLoanerFragment, MiniKshockDetails miniKshockDetails, View view) {
        Log_OC.getArray(kshockExistingLoanerFragment, "this$0");
        Log_OC.getArray(miniKshockDetails, "$this_apply");
        KshockExistingLoanerViewModel $r3 = kshockExistingLoanerFragment.getKshockExistingLoanerViewModel();
        BigDecimal $r4 = miniKshockDetails.getAvailableLoanAmount();
        double $d0 = $r4 == null ? 0.0d : $r4.doubleValue();
        $r3.applyForLoan($d0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        KshockExistingLoanerViewData $r2 = (KshockExistingLoanerViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(KshockExistingLoanerViewData kshockExistingLoanerViewData) {
        Log_OC.getArray(kshockExistingLoanerViewData, "viewData");
        InterfaceC8209a $r2 = requireBinding();
        FragmentKshckExistingLoanerBinding $r3 = (FragmentKshckExistingLoanerBinding) $r2;
        boolean $z0 = kshockExistingLoanerViewData instanceof KshockExistingLoanerViewData.Loading;
        if ($z0) {
            ProgressBar $r5 = $r3.progressBar;
            Log_OC.loadImage($r5, "progressBar");
            ViewExtKt.show($r5);
            View $r6 = $r3.applyButton;
            Log_OC.loadImage($r6, "applyButton");
            View r23 = $r6;
            ViewExtKt.hide$default(r23, false, 1, null);
            View $r7 = $r3.summaryCard;
            Log_OC.loadImage($r7, "summaryCard");
            View r232 = $r7;
            ViewExtKt.hide$default(r232, false, 1, null);
            return;
        }
        boolean $z02 = kshockExistingLoanerViewData instanceof KshockExistingLoanerViewData.KshockExistingLoaner;
        if ($z02) {
            View $r72 = $r3.summaryCard;
            Log_OC.loadImage($r72, "summaryCard");
            View r233 = $r72;
            ViewExtKt.show(r233);
            View $r62 = $r3.applyButton;
            Log_OC.loadImage($r62, "applyButton");
            View r234 = $r62;
            ViewExtKt.show(r234);
            KshockExistingLoanerViewData.KshockExistingLoaner $r8 = (KshockExistingLoanerViewData.KshockExistingLoaner) kshockExistingLoanerViewData;
            final MiniKshockDetails $r9 = $r8.getExistingLoanerResponse();
            TextView $r10 = $r3.creditLimitText;
            BigDecimal $r11 = $r9.getMaxLoanAmount();
            String $r12 = $r11 == null ? null : StringExtKt.formatDecimalAmount($r11);
            if ($r12 == null) {
                $r12 = "";
            }
            $r10.setText($r12);
            TextView $r102 = $r3.tenureText;
            int $i0 = C0220R.string.tenure_template;
            Integer $r15 = $r9.getTenure();
            Object[] $r14 = {String.valueOf($r15)};
            $r102.setText(getString($i0, $r14));
            TextView $r103 = $r3.availableLoanText;
            BigDecimal $r112 = $r9.getAvailableLoanAmount();
            String $r4 = $r112 != null ? StringExtKt.formatDecimalAmount($r112) : null;
            String $r13 = $r4 != null ? $r4 : "";
            $r103.setText($r13);
            ViewGroup r24 = $r3.applyButton;
            r24.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.kshock.ui.views.Switch
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    KshockExistingLoanerFragment $r22 = KshockExistingLoanerFragment.this;
                    MiniKshockDetails $r32 = $r9;
                    KshockExistingLoanerFragment.m39645applyViewData$lambda3$lambda2$lambda1($r22, $r32, view);
                }
            });
            return;
        }
        boolean $z03 = kshockExistingLoanerViewData instanceof KshockExistingLoanerViewData.ShowAvailableLoan;
        if ($z03) {
            TextView $r104 = $r3.availableLoanText;
            Log_OC.loadImage($r104, "availableLoanText");
            ViewExtKt.show($r104);
            TextView $r105 = $r3.availableLoanLabel;
            Log_OC.loadImage($r105, "availableLoanLabel");
            ViewExtKt.show($r105);
            return;
        }
        KshockExistingLoanerViewData.HideAvailableLoan $r17 = KshockExistingLoanerViewData.HideAvailableLoan.INSTANCE;
        boolean $z04 = Log_OC.append(kshockExistingLoanerViewData, $r17);
        if ($z04) {
            TextView $r106 = $r3.availableLoanText;
            Log_OC.loadImage($r106, "availableLoanText");
            ViewExtKt.hide$default($r106, false, 1, null);
            TextView $r107 = $r3.availableLoanLabel;
            Log_OC.loadImage($r107, "availableLoanLabel");
            ViewExtKt.hide$default($r107, false, 1, null);
            return;
        }
        boolean $z05 = kshockExistingLoanerViewData instanceof KshockExistingLoanerViewData.Error;
        if ($z05) {
            Context $r18 = requireContext();
            Log_OC.loadImage($r18, "requireContext()");
            KshockExistingLoanerViewData.Error $r19 = (KshockExistingLoanerViewData.Error) kshockExistingLoanerViewData;
            ContextExtKt.toast$default($r18, $r19.getMessage(), 0, 2, (Object) null);
            return;
        }
        KshockExistingLoanerViewData.HideLoading $r20 = KshockExistingLoanerViewData.HideLoading.INSTANCE;
        boolean $z06 = Log_OC.append(kshockExistingLoanerViewData, $r20);
        if (!$z06) {
            KshockExistingLoanerViewData.Initial $r21 = KshockExistingLoanerViewData.Initial.INSTANCE;
            Log_OC.append(kshockExistingLoanerViewData, $r21);
            return;
        }
        ProgressBar $r52 = $r3.progressBar;
        Log_OC.loadImage($r52, "progressBar");
        ViewExtKt.hide$default($r52, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        KshockExistingLoanerViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public KshockExistingLoanerViewModel createViewModel() {
        KshockExistingLoanerViewModel $r1 = getKshockExistingLoanerViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final KshockExistingLoanerViewModel getKshockExistingLoanerViewModel() {
        KshockExistingLoanerViewModel $r1 = this.kshockExistingLoanerViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("kshockExistingLoanerViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return KshockExistingLoanerViewModel.class;
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
        setHasOptionsMenu(true);
        Bundle $r1 = getArguments();
        if ($r1 == null) {
            return;
        }
        double $d0 = $r1.getDouble("amt");
        this.maxLoanAmt = $d0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentKshckExistingLoanerBinding $r4 = FragmentKshckExistingLoanerBinding.inflate(layoutInflater, viewGroup, false);
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
        boolean $z0 = $r3 instanceof KShockActivity;
        KShockActivity $r4 = $z0 ? (KShockActivity) $r3 : null;
        if ($r4 != null) {
            $r4.showSupportActionBar();
        }
        KshockExistingLoanerViewModel $r5 = getKshockExistingLoanerViewModel();
        $r5.start();
    }

    public final void setKshockExistingLoanerViewModel(KshockExistingLoanerViewModel kshockExistingLoanerViewModel) {
        Log_OC.getArray(kshockExistingLoanerViewModel, "<set-?>");
        this.kshockExistingLoanerViewModel = kshockExistingLoanerViewModel;
    }
}

package ai.kudi.agent.kshock.p009ui.views;

import ai.kudi.agent.acceptterms.AcceptTermsActivity;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.feature_kshock.C0220R;
import ai.kudi.agent.feature_kshock.databinding.FragmentKShockAvailableBinding;
import ai.kudi.agent.kshock.p009ui.KShockActivity;
import ai.kudi.agent.kshock.presentation.KShockViewModel;
import ai.kudi.agent.kshock.presentation.viewdata.KShockViewData;
import ai.kudi.agent.settings.tandc.DisplayTermsAdapter;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import dagger.android.p197e.C7429a;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: KShockAvailableFragment.kt */
@Metadata(m10422d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 +2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001+B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0014J\b\u0010\u0012\u001a\u00020\u0002H\u0014J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0014J\"\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0012\u0010\u001e\u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J&\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020 H\u0016J\u001a\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\"2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006,"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/views/KShockAvailableFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/kshock/presentation/KShockViewModel;", "Lai/kudi/agent/kshock/presentation/viewdata/KShockViewData;", "Lai/kudi/agent/feature_kshock/databinding/FragmentKShockAvailableBinding;", "()V", "interestRate", "", "limitAmount", "", "viewModel", "getViewModel", "()Lai/kudi/agent/kshock/presentation/KShockViewModel;", "setViewModel", "(Lai/kudi/agent/kshock/presentation/KShockViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onActivityResult", "requestCode", "", "resultCode", TransactionBreakDownItemType.DATA, "Landroid/content/Intent;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onSaveInstanceState", "outState", "onViewCreated", "view", "Companion", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.kshock.ui.views.KShockAvailableFragment */
/* loaded from: classes.dex */
public final class KShockAvailableFragment extends BaseMVVMViewBindingFragment<KShockViewModel, KShockViewData, FragmentKShockAvailableBinding> {
    private static final String BUNDLE_KEY_AMOUNT = "BUNDLE_KEY_AMOUNT";
    private static final String BUNDLE_KEY_INTEREST_RATE = "BUNDLE_KEY_INTEREST_RATE";
    public static final Companion Companion;
    public static final String PAGE_KEY = "KShockAvailableFragment";
    public static final int TERMS_REQUEST_CODE = 24;
    private float interestRate;
    private double limitAmount;
    public KShockViewModel viewModel;

    /* compiled from: KShockAvailableFragment.kt */
    @Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/views/KShockAvailableFragment$Companion;", "", "()V", KShockAvailableFragment.BUNDLE_KEY_AMOUNT, "", KShockAvailableFragment.BUNDLE_KEY_INTEREST_RATE, "TAG", "TERMS_REQUEST_CODE", "", "newInstance", "Lai/kudi/agent/kshock/ui/views/KShockAvailableFragment;", TransactionField.AMOUNT, "", "interestRate", "", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.kshock.ui.views.KShockAvailableFragment$Companion */
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
        public final KShockAvailableFragment newInstance(double d, float f) {
            Bundle $r1 = new Bundle();
            $r1.putDouble(KShockAvailableFragment.BUNDLE_KEY_AMOUNT, d);
            $r1.putFloat(KShockAvailableFragment.BUNDLE_KEY_INTEREST_RATE, f);
            KShockAvailableFragment $r2 = new KShockAvailableFragment();
            $r2.setArguments($r1);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-2  reason: not valid java name */
    public static final void m39642onViewCreated$lambda2(KShockAvailableFragment kShockAvailableFragment, View view) {
        Log_OC.getArray(kShockAvailableFragment, "this$0");
        KShockViewModel $r2 = kShockAvailableFragment.getViewModel();
        $r2.cacheKShockOldUser();
        AcceptTermsActivity.Companion $r3 = AcceptTermsActivity.Companion;
        Context $r4 = kShockAvailableFragment.getContext();
        Intent $r5 = $r3.getIntent($r4, DisplayTermsAdapter.LOAN_TERM);
        kShockAvailableFragment.startActivityForResult($r5, 24);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        KShockViewData $r2 = (KShockViewData) viewData;
        applyViewData($r2);
    }

    protected void applyViewData(KShockViewData kShockViewData) {
        Log_OC.getArray(kShockViewData, "viewData");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        KShockViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public KShockViewModel createViewModel() {
        KShockViewModel $r1 = getViewModel();
        return $r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return KShockViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public final KShockViewModel getViewModel() {
        KShockViewModel $r1 = this.viewModel;
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
    public void onActivityResult(int i, int i2, Intent intent) {
        Boolean $r2;
        super.onActivityResult(i, i2, intent);
        if (i == 24) {
            if (intent == null) {
                $r2 = null;
            } else {
                boolean $z1 = intent.getBooleanExtra(AcceptTermsActivity.BUNDLE_KEY_ACCEPTED, false);
                $r2 = Boolean.valueOf($z1);
            }
            KShockViewModel $r3 = getViewModel();
            boolean $z0 = $r2 != null ? $r2.booleanValue() : false;
            $r3.termsAndConditionsAnalytics($z0);
            if (i2 == -1) {
                Boolean $r4 = Boolean.TRUE;
                boolean $z02 = Log_OC.append($r2, $r4);
                if ($z02) {
                    KShockViewModel $r32 = getViewModel();
                    double $d0 = this.limitAmount;
                    $r32.applyForLoan($d0);
                }
            }
        }
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
        if ($r2 != null) {
            double $d0 = $r2.getDouble(BUNDLE_KEY_AMOUNT);
            this.limitAmount = $d0;
            float $f0 = $r2.getFloat(BUNDLE_KEY_INTEREST_RATE);
            this.interestRate = $f0;
        }
        if (bundle == null) {
            return;
        }
        double $d02 = bundle.getDouble(BUNDLE_KEY_AMOUNT);
        this.limitAmount = $d02;
        float $f02 = bundle.getFloat(BUNDLE_KEY_INTEREST_RATE);
        this.interestRate = $f02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentKShockAvailableBinding $r4 = FragmentKShockAvailableBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        Log_OC.getArray(bundle, "outState");
        double $d0 = this.limitAmount;
        bundle.putDouble(BUNDLE_KEY_AMOUNT, $d0);
        float $f0 = this.interestRate;
        bundle.putFloat(BUNDLE_KEY_INTEREST_RATE, $f0);
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity $r3 = getActivity();
        boolean $z0 = $r3 instanceof KShockActivity;
        KShockActivity $r4 = $z0 ? (KShockActivity) $r3 : null;
        if ($r4 != null) {
            $r4.showSupportActionBar();
        }
        InterfaceC8209a $r5 = requireBinding();
        FragmentKShockAvailableBinding $r6 = (FragmentKShockAvailableBinding) $r5;
        ViewGroup $r7 = $r6.continueButton;
        ViewGroup r14 = $r7;
        r14.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.kshock.ui.views.EditEventView$5
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                KShockAvailableFragment $r2 = KShockAvailableFragment.this;
                KShockAvailableFragment.m39642onViewCreated$lambda2($r2, view2);
            }
        });
        InterfaceC8209a $r52 = requireBinding();
        FragmentKShockAvailableBinding $r62 = (FragmentKShockAvailableBinding) $r52;
        TextView $r9 = $r62.amountTextView;
        double $d0 = this.limitAmount;
        Double $r10 = Double.valueOf($d0);
        String $r11 = StringExtKt.formatAmount($r10);
        $r9.setText($r11);
        InterfaceC8209a $r53 = requireBinding();
        FragmentKShockAvailableBinding $r63 = (FragmentKShockAvailableBinding) $r53;
        TextView $r92 = $r63.loanLimitDescriptionText;
        int $i0 = C0220R.string.loan_limit_description_text;
        double $d02 = this.limitAmount;
        Double $r102 = Double.valueOf($d02);
        String $r112 = StringExtKt.formatAmount($r102);
        Object[] $r12 = {$r112};
        String $r113 = getString($i0, $r12);
        $r92.setText($r113);
    }

    public final void setViewModel(KShockViewModel kShockViewModel) {
        Log_OC.getArray(kShockViewModel, "<set-?>");
        this.viewModel = kShockViewModel;
    }
}

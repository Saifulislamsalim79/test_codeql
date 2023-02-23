package ai.kudi.agent.kshock.p009ui.views;

import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.feature_kshock.C0220R;
import ai.kudi.agent.feature_kshock.databinding.FragmentKShockNotAvailableBinding;
import ai.kudi.agent.kshock.navigator.KShockNavigator;
import ai.kudi.agent.kshock.p009ui.KShockActivity;
import ai.kudi.dip.library.button.KudiButton;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import dagger.android.p197e.C7429a;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: KShockNotAvailableFragment.kt */
@Metadata(m10422d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \"2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\"B\u0005¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0001H\u0096\u0001J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J$\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\t\u0010!\u001a\u00020\u0003H\u0096\u0001R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/views/KShockNotAvailableFragment;", "Landroidx/fragment/app/Fragment;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/feature_kshock/databinding/FragmentKShockNotAvailableBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/feature_kshock/databinding/FragmentKShockNotAvailableBinding;", "kshockReason", "", "loanProviderDisabled", "", "maxLoanAmt", "", "navigator", "Lai/kudi/agent/kshock/navigator/KShockNavigator;", "initBinding", "Landroid/view/View;", "fragment", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "requireBinding", "Companion", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.kshock.ui.views.KShockNotAvailableFragment */
/* loaded from: classes.dex */
public final class KShockNotAvailableFragment extends Fragment implements BaseViewBinder<FragmentKShockNotAvailableBinding> {
    private static final String CREDIT_SCORE_ZERO = "creditScoreZero";
    public static final Companion Companion;
    public static final String K_SHOCK_REASON = "K_SHOCK_REASON";
    public static final String MAX_LOAN_AMT = "MAX_LOAN_AMT";
    public static final String PAGE_KEY = "KShockNotAvailableFragment";
    private final /* synthetic */ BaseViewBinderImpl<FragmentKShockNotAvailableBinding> $$delegate_0;
    private String kshockReason;
    private boolean loanProviderDisabled;
    private double maxLoanAmt;
    private KShockNavigator navigator;

    /* compiled from: KShockNotAvailableFragment.kt */
    @Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/views/KShockNotAvailableFragment$Companion;", "", "()V", "CREDIT_SCORE_ZERO", "", KShockNotAvailableFragment.K_SHOCK_REASON, "MAX_LOAN_AMT", "TAG", "newInstance", "Lai/kudi/agent/kshock/ui/views/KShockNotAvailableFragment;", "isLoanProviderDisabled", "", "maxLoanAmount", "", "reason", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.kshock.ui.views.KShockNotAvailableFragment$Companion */
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
        public final KShockNotAvailableFragment newInstance(double d, String str) {
            KShockNotAvailableFragment $r2 = new KShockNotAvailableFragment();
            Bundle $r3 = new Bundle();
            $r3.putDouble("MAX_LOAN_AMT", d);
            $r3.putString(KShockNotAvailableFragment.K_SHOCK_REASON, str);
            C13666w c13666w = C13666w.f30112a;
            $r2.setArguments($r3);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final KShockNotAvailableFragment newInstance(boolean z) {
            KShockNotAvailableFragment $r1 = new KShockNotAvailableFragment();
            Bundle $r2 = new Bundle();
            $r2.putBoolean(KShockNotAvailableFragment.CREDIT_SCORE_ZERO, z);
            C13666w c13666w = C13666w.f30112a;
            $r1.setArguments($r2);
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
    public KShockNotAvailableFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
        this.kshockReason = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-2$lambda-1  reason: not valid java name */
    public static final void m39643onViewCreated$lambda2$lambda1(KShockNotAvailableFragment kShockNotAvailableFragment, View view) {
        Log_OC.getArray(kShockNotAvailableFragment, "this$0");
        KShockNavigator $r2 = kShockNotAvailableFragment.navigator;
        if ($r2 == null) {
            return;
        }
        $r2.toLoanEligibilityFragment();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentKShockNotAvailableBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentKShockNotAvailableBinding $r3 = (FragmentKShockNotAvailableBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentKShockNotAvailableBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentKShockNotAvailableBinding fragmentKShockNotAvailableBinding, Fragment fragment) {
        Log_OC.getArray(fragmentKShockNotAvailableBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentKShockNotAvailableBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentKShockNotAvailableBinding $r4 = (FragmentKShockNotAvailableBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        C7429a.m18752b(this);
        super.onAttach(context);
        boolean $z0 = context instanceof KShockNavigator;
        if ($z0) {
            KShockNavigator $r2 = (KShockNavigator) context;
            this.navigator = $r2;
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
        double $d0 = $r1.getDouble("MAX_LOAN_AMT");
        this.maxLoanAmt = $d0;
        String $r2 = $r1.getString(K_SHOCK_REASON);
        this.kshockReason = $r2;
        boolean $z0 = $r1.getBoolean(CREDIT_SCORE_ZERO);
        this.loanProviderDisabled = $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        LayoutInflater $r1 = getLayoutInflater();
        FragmentKShockNotAvailableBinding $r4 = FragmentKShockNotAvailableBinding.inflate($r1, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(\n                layoutInflater,\n                container,\n                false\n            )");
        View $r5 = initBinding($r4, (Fragment) this);
        return $r5;
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
        FragmentKShockNotAvailableBinding $r5 = requireBinding();
        boolean $z02 = this.loanProviderDisabled;
        if ($z02) {
            TextView $r6 = $r5.loanNotAvailableDescriptionText;
            int $i0 = C0220R.string.disabled_loan_provider_description_text;
            String $r7 = getString($i0);
            $r6.setText($r7);
            KudiButton $r8 = $r5.closeButton;
            Log_OC.loadImage($r8, "closeButton");
            ViewExtKt.hide$default($r8, false, 1, null);
        } else {
            TextView $r62 = $r5.loanNotAvailableDescriptionText;
            int $i02 = C0220R.string.loan_not_available_description_text;
            String $r72 = getString($i02);
            $r62.setText($r72);
        }
        ViewGroup r11 = $r5.closeButton;
        r11.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.kshock.ui.views.FileSelectionFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                KShockNotAvailableFragment $r2 = KShockNotAvailableFragment.this;
                KShockNotAvailableFragment.m39643onViewCreated$lambda2$lambda1($r2, view2);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentKShockNotAvailableBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentKShockNotAvailableBinding $r3 = (FragmentKShockNotAvailableBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentKShockNotAvailableBinding $r1 = requireBinding();
        return $r1;
    }
}

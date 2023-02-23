package ai.kudi.agent.register.p022v2.p023ui;

import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.databinding.FragmentWelcomeBinding;
import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.register.p022v2.p023ui.viewModels.WelcomeViewModel;
import ai.kudi.agent.register.p022v2.p023ui.viewModels.data.WelcomeViewData;
import ai.kudi.agent.register.xmpp.components.RegistrationSubComponent;
import ai.kudi.agent.settings.mcc.components.BvnVerificationSubcomponent;
import ai.kudi.agent.settings.p029ui.BvnExistingAgentActivity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: WelcomeFragment.kt */
@Metadata(m10422d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 $2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0014J\b\u0010\u0014\u001a\u00020\u0002H\u0014J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0014J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006%"}, m10421d2 = {"Lai/kudi/agent/register/v2/ui/WelcomeFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/register/v2/ui/viewModels/WelcomeViewModel;", "Lai/kudi/agent/register/v2/ui/viewModels/data/WelcomeViewData;", "Lai/kudi/agent/databinding/FragmentWelcomeBinding;", "()V", "sharedPrefs", "Landroid/content/SharedPreferences;", "getSharedPrefs", "()Landroid/content/SharedPreferences;", "setSharedPrefs", "(Landroid/content/SharedPreferences;)V", "vm", "getVm", "()Lai/kudi/agent/register/v2/ui/viewModels/WelcomeViewModel;", "setVm", "(Lai/kudi/agent/register/v2/ui/viewModels/WelcomeViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.v2.ui.WelcomeFragment */
/* loaded from: classes.dex */
public final class WelcomeFragment extends BaseMVVMViewBindingFragment<WelcomeViewModel, WelcomeViewData, FragmentWelcomeBinding> {
    private static final String ARGS_CUSTOMER_TYPE = "customer_type";
    private static final String ARGS_IS_C2C_ENABLED = "args_is_c2c_enabled";
    private static final String ARGS_IS_HQ = "is_hq";
    public static final String ARGS_IS_KCASH_ENABLED = "args_is_kcash_enabled";
    public static final String ARGS_IS_NEW_USER = "args_is_new_user";
    private static final String ARGS_IS_OUTLET = "is_outlet";
    private static final String ARGS_NAME = "args_first_name";
    public static final String ARGS_WALLET_BALANCE = "args_wallet_balance";
    public static final Companion Companion;
    public WelcomeViewModel mSlideshow;
    public SharedPreferences sharedPrefs;

    /* compiled from: WelcomeFragment.kt */
    @Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JF\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m10421d2 = {"Lai/kudi/agent/register/v2/ui/WelcomeFragment$Companion;", "", "()V", "ARGS_CUSTOMER_TYPE", "", "ARGS_IS_C2C_ENABLED", "ARGS_IS_HQ", "ARGS_IS_KCASH_ENABLED", "ARGS_IS_NEW_USER", "ARGS_IS_OUTLET", "ARGS_NAME", "ARGS_WALLET_BALANCE", "newInstance", "Lai/kudi/agent/register/v2/ui/WelcomeFragment;", "firstName", "walletBalance", "", "isNewUser", "", "isKCashEnabled", "isC2C", "isHq", "isOutlet", "customerType", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.register.v2.ui.WelcomeFragment$Companion */
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
        public final WelcomeFragment newInstance(String str, double d, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str2) {
            Log_OC.getArray(str, "firstName");
            Log_OC.getArray(str2, "customerType");
            WelcomeFragment $r4 = new WelcomeFragment();
            Bundle $r2 = new Bundle();
            $r2.putString(WelcomeFragment.ARGS_NAME, str);
            $r2.putBoolean(WelcomeFragment.ARGS_IS_NEW_USER, z);
            $r2.putBoolean(WelcomeFragment.ARGS_IS_KCASH_ENABLED, z2);
            $r2.putBoolean(WelcomeFragment.ARGS_IS_C2C_ENABLED, z3);
            $r2.putDouble(WelcomeFragment.ARGS_WALLET_BALANCE, d);
            $r2.putBoolean("is_hq", z4);
            $r2.putBoolean("is_outlet", z5);
            $r2.putString("customer_type", str2);
            $r4.setArguments($r2);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m40469onViewCreated$lambda0(String $r0, WelcomeFragment welcomeFragment, double d, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, View view) {
        Log_OC.getArray(welcomeFragment, "this$0");
        if ($r0 == null) {
            $r0 = "AGENT";
        }
        WelcomeViewModel $r3 = welcomeFragment.getVm();
        $r3.continueClicked(d, z, z2, z3, z4, z5, $r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m40470onViewCreated$lambda1(WelcomeFragment welcomeFragment, View view) {
        Log_OC.getArray(welcomeFragment, "this$0");
        WelcomeViewModel $r0 = welcomeFragment.getVm();
        $r0.fundWalletClicked();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        WelcomeViewData $r2 = (WelcomeViewData) viewData;
        applyViewData($r2);
    }

    protected void applyViewData(WelcomeViewData welcomeViewData) {
        Log_OC.getArray(welcomeViewData, "viewData");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        WelcomeViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public WelcomeViewModel createViewModel() {
        WelcomeViewModel $r1 = getVm();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SharedPreferences getSharedPrefs() {
        SharedPreferences $r1 = this.sharedPrefs;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("sharedPrefs");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return WelcomeViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final WelcomeViewModel getVm() {
        WelcomeViewModel $r1 = this.mSlideshow;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("vm");
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
        boolean $z0 = $r2 instanceof RegisterActivity;
        if ($z0) {
            FragmentActivity $r22 = getActivity();
            if ($r22 == null) {
                NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.register.v2.ui.RegisterActivity");
                throw $r5;
            }
            RegisterActivity $r3 = (RegisterActivity) $r22;
            RegistrationSubComponent $r4 = $r3.getRegistrationV2SubComponent();
            $r4.inject(this);
            return;
        }
        boolean $z02 = $r2 instanceof BvnExistingAgentActivity;
        if ($z02) {
            FragmentActivity $r23 = getActivity();
            if ($r23 == null) {
                NullPointerException $r52 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.settings.ui.BvnExistingAgentActivity");
                throw $r52;
            }
            BvnExistingAgentActivity $r6 = (BvnExistingAgentActivity) $r23;
            BvnVerificationSubcomponent $r7 = $r6.getBvnVerificationSubComponent();
            $r7.inject(this);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentWelcomeBinding $r4 = FragmentWelcomeBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        SharedPreferences $r6 = getSharedPrefs();
        SharedPreferences.Editor $r7 = $r6.edit();
        $r7.putBoolean(LoginParams.HAS_SEEN_INTRO, true).apply();
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        Bundle $r2 = requireArguments();
        Log_OC.loadImage($r2, "requireArguments()");
        final double $d0 = $r2.getDouble(ARGS_WALLET_BALANCE);
        final boolean $z0 = $r2.getBoolean(ARGS_IS_NEW_USER);
        final boolean $z1 = $r2.getBoolean(ARGS_IS_KCASH_ENABLED);
        final boolean $z2 = $r2.getBoolean(ARGS_IS_KCASH_ENABLED);
        final boolean $z3 = $r2.getBoolean("is_hq");
        final boolean $z4 = $r2.getBoolean("is_outlet");
        final String $r3 = $r2.getString("customer_type");
        InterfaceC8209a $r4 = requireBinding();
        TextView $r6 = ((FragmentWelcomeBinding) $r4).skipButton;
        $r6.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.v2.ui.h
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String $r22 = $r3;
                WelcomeFragment $r32 = this;
                double $d02 = $d0;
                boolean $z02 = $z0;
                boolean $z12 = $z1;
                boolean $z22 = $z2;
                boolean $z32 = $z4;
                boolean $z42 = $z3;
                WelcomeFragment.m40469onViewCreated$lambda0($r22, $r32, $d02, $z02, $z12, $z22, $z32, $z42, view2);
            }
        });
        InterfaceC8209a $r42 = requireBinding();
        FragmentWelcomeBinding $r5 = (FragmentWelcomeBinding) $r42;
        ViewGroup $r8 = $r5.fundWalletButton;
        ViewGroup r12 = $r8;
        r12.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.v2.ui.FileSelectionFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WelcomeFragment $r22 = WelcomeFragment.this;
                WelcomeFragment.m40470onViewCreated$lambda1($r22, view2);
            }
        });
    }

    public final void setSharedPrefs(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "<set-?>");
        this.sharedPrefs = sharedPreferences;
    }

    public final void setVm(WelcomeViewModel welcomeViewModel) {
        Log_OC.getArray(welcomeViewModel, "<set-?>");
        this.mSlideshow = welcomeViewModel;
    }
}

package ai.kudi.agent.register.p022v2.p023ui;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.databinding.FragmentEnableFingerprintBinding;
import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.login.game.components.EnableFingerPrintSubComponent;
import ai.kudi.agent.login.p011ui.EnableFingerPrintActivity;
import ai.kudi.agent.register.data.CompleteRegistrationData;
import ai.kudi.agent.register.domain.wiki.PersonalInfo;
import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import ai.kudi.agent.register.p022v2.p023ui.viewModels.EnableFingerPrintViewModel;
import ai.kudi.agent.register.p022v2.p023ui.viewModels.data.EnableFingerPrintViewData;
import ai.kudi.agent.register.util.USERTYPES;
import ai.kudi.agent.register.xmpp.components.RegistrationSubComponent;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: EnableFingerPrintFragment.kt */
@Metadata(m10422d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 /2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001/B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0003H\u0014J\b\u0010\u001e\u001a\u00020\u0002H\u0014J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020 H\u0014J\u0010\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020#H\u0016J\u0012\u0010$\u001a\u00020\u000f2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J&\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u001a\u0010-\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020(2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u00060"}, m10421d2 = {"Lai/kudi/agent/register/v2/ui/EnableFingerPrintFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/register/v2/ui/viewModels/EnableFingerPrintViewModel;", "Lai/kudi/agent/register/v2/ui/viewModels/data/EnableFingerPrintViewData;", "Lai/kudi/agent/databinding/FragmentEnableFingerprintBinding;", "()V", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "getAnalytics", "()Lai/kudi/agent/core/analytics/Analytics;", "setAnalytics", "(Lai/kudi/agent/core/analytics/Analytics;)V", "callback", "Lkotlin/Function1;", "Lai/kudi/agent/register/data/CompleteRegistrationData;", "", "completeRegistrationData", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "vm", "getVm", "()Lai/kudi/agent/register/v2/ui/viewModels/EnableFingerPrintViewModel;", "setVm", "(Lai/kudi/agent/register/v2/ui/viewModels/EnableFingerPrintViewModel;)V", "applyViewData", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.v2.ui.EnableFingerPrintFragment */
/* loaded from: classes.dex */
public final class EnableFingerPrintFragment extends BaseMVVMViewBindingFragment<EnableFingerPrintViewModel, EnableFingerPrintViewData, FragmentEnableFingerprintBinding> {
    private static final String ARGS_REG_INFO;
    public static final Companion Companion;
    public Analytics analytics;
    private InterfaceC11767l<? super CompleteRegistrationData, C13666w> callback;
    private CompleteRegistrationData completeRegistrationData;
    public SharedPreferences sharedPreferences;
    public EnableFingerPrintViewModel srv;

    /* compiled from: EnableFingerPrintFragment.kt */
    @Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\r0\fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/register/v2/ui/EnableFingerPrintFragment$Companion;", "", "()V", "ARGS_REG_INFO", "", "getARGS_REG_INFO", "()Ljava/lang/String;", "newInstance", "Lai/kudi/agent/register/v2/ui/EnableFingerPrintFragment;", "completeRegData", "Lai/kudi/agent/register/data/CompleteRegistrationData;", "callback", "Lkotlin/Function1;", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.register.v2.ui.EnableFingerPrintFragment$Companion */
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
        public static /* synthetic */ EnableFingerPrintFragment newInstance$default(Companion companion, CompleteRegistrationData $r4, InterfaceC11767l interfaceC11767l, int i, Object obj) {
            int $i0 = i & 1;
            if ($i0 != 0) {
                $r4 = null;
            }
            EnableFingerPrintFragment $r2 = companion.newInstance($r4, interfaceC11767l);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getARGS_REG_INFO() {
            String $r1 = EnableFingerPrintFragment.ARGS_REG_INFO;
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final EnableFingerPrintFragment newInstance(CompleteRegistrationData completeRegistrationData, InterfaceC11767l interfaceC11767l) {
            Log_OC.getArray(interfaceC11767l, "callback");
            EnableFingerPrintFragment $r4 = new EnableFingerPrintFragment();
            $r4.callback = interfaceC11767l;
            Bundle $r5 = new Bundle();
            Companion $r0 = EnableFingerPrintFragment.Companion;
            String $r2 = $r0.getARGS_REG_INFO();
            $r5.putParcelable($r2, completeRegistrationData);
            $r4.setArguments($r5);
            return $r4;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
        ARGS_REG_INFO = "ARGS_REG_INFO";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m40448onViewCreated$lambda1(EnableFingerPrintFragment enableFingerPrintFragment, String str, View view) {
        Log_OC.getArray(enableFingerPrintFragment, "this$0");
        Log_OC.getArray(str, "$userType");
        Analytics $r3 = enableFingerPrintFragment.getAnalytics();
        $r3.skipFingerPrintClicked(str);
        SharedPreferences $r4 = enableFingerPrintFragment.getSharedPreferences();
        SharedPreferences.Editor $r5 = $r4.edit();
        $r5.putBoolean(LoginParams.EXTRA_ENABLE_FINGERPRINT, false).apply();
        InterfaceC11767l $r6 = enableFingerPrintFragment.callback;
        if ($r6 == null) {
            return;
        }
        CompleteRegistrationData $r7 = enableFingerPrintFragment.completeRegistrationData;
        $r6.invoke($r7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-3  reason: not valid java name */
    public static final void m40449onViewCreated$lambda3(EnableFingerPrintFragment enableFingerPrintFragment, View view) {
        RegistrationInfo $r3;
        PersonalInfo $r4;
        String $r5;
        Log_OC.getArray(enableFingerPrintFragment, "this$0");
        CompleteRegistrationData $r2 = enableFingerPrintFragment.completeRegistrationData;
        if ($r2 != null && ($r3 = $r2.getRegistrationInfo()) != null && ($r4 = $r3.getPersonalInfo()) != null && ($r5 = $r4.getPhoneNumber()) != null) {
            Analytics $r6 = enableFingerPrintFragment.getAnalytics();
            $r6.enableFingerPrintClicked($r5);
        }
        SharedPreferences $r7 = enableFingerPrintFragment.getSharedPreferences();
        SharedPreferences.Editor $r8 = $r7.edit();
        $r8.putBoolean(LoginParams.EXTRA_ENABLE_FINGERPRINT, true).apply();
        InterfaceC11767l $r9 = enableFingerPrintFragment.callback;
        if ($r9 == null) {
            return;
        }
        $r9.invoke(enableFingerPrintFragment.completeRegistrationData);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        EnableFingerPrintViewData $r2 = (EnableFingerPrintViewData) viewData;
        applyViewData($r2);
    }

    protected void applyViewData(EnableFingerPrintViewData enableFingerPrintViewData) {
        Log_OC.getArray(enableFingerPrintViewData, "viewData");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        EnableFingerPrintViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public EnableFingerPrintViewModel createViewModel() {
        EnableFingerPrintViewModel $r1 = getVm();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Analytics getAnalytics() {
        Analytics $r1 = this.analytics;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("analytics");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SharedPreferences getSharedPreferences() {
        SharedPreferences $r1 = this.sharedPreferences;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("sharedPreferences");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return EnableFingerPrintViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final EnableFingerPrintViewModel getVm() {
        EnableFingerPrintViewModel $r1 = this.srv;
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
        boolean $z02 = $r2 instanceof EnableFingerPrintActivity;
        if ($z02) {
            FragmentActivity $r23 = getActivity();
            if ($r23 == null) {
                NullPointerException $r52 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.login.ui.EnableFingerPrintActivity");
                throw $r52;
            }
            EnableFingerPrintActivity $r6 = (EnableFingerPrintActivity) $r23;
            EnableFingerPrintSubComponent $r7 = $r6.getEnableFingerPrintSubComponent();
            $r7.inject(this);
        }
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
        String $r1 = ARGS_REG_INFO;
        Parcelable $r3 = $r2.getParcelable($r1);
        CompleteRegistrationData $r4 = (CompleteRegistrationData) $r3;
        this.completeRegistrationData = $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentEnableFingerprintBinding $r4 = FragmentEnableFingerprintBinding.inflate(layoutInflater, viewGroup, false);
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
        super.onViewCreated(view, bundle);
        FragmentActivity $r3 = getActivity();
        boolean $z0 = $r3 instanceof RegisterActivity;
        USERTYPES $r4 = $z0 ? USERTYPES.isMethod : USERTYPES.EXISTING;
        final String $r5 = $r4.name();
        InterfaceC8209a $r6 = requireBinding();
        FragmentEnableFingerprintBinding $r7 = (FragmentEnableFingerprintBinding) $r6;
        TextView $r8 = $r7.skipButton;
        TextView r14 = $r8;
        r14.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.v2.ui.MainActivity$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EnableFingerPrintFragment $r2 = EnableFingerPrintFragment.this;
                String $r32 = $r5;
                EnableFingerPrintFragment.m40448onViewCreated$lambda1($r2, $r32, view2);
            }
        });
        InterfaceC8209a $r62 = requireBinding();
        FragmentEnableFingerprintBinding $r72 = (FragmentEnableFingerprintBinding) $r62;
        ViewGroup $r10 = $r72.enableButton;
        ViewGroup r15 = $r10;
        r15.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.v2.ui.j
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EnableFingerPrintFragment $r2 = EnableFingerPrintFragment.this;
                EnableFingerPrintFragment.m40449onViewCreated$lambda3($r2, view2);
            }
        });
    }

    public final void setAnalytics(Analytics analytics) {
        Log_OC.getArray(analytics, "<set-?>");
        this.analytics = analytics;
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }

    public final void setVm(EnableFingerPrintViewModel enableFingerPrintViewModel) {
        Log_OC.getArray(enableFingerPrintViewModel, "<set-?>");
        this.srv = enableFingerPrintViewModel;
    }
}

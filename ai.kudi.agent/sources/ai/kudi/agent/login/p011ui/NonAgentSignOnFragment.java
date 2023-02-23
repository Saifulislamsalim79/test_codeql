package ai.kudi.agent.login.p011ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.databinding.FragmentNonAgentSignOnBinding;
import ai.kudi.agent.register.p022v2.p023ui.RegisterActivity;
import ai.kudi.agent.register.p022v2.p023ui.viewModels.PhoneAndBvnViewModel;
import ai.kudi.agent.register.p022v2.p023ui.viewModels.data.PhoneAndBvnViewData;
import ai.kudi.agent.register.xmpp.components.RegistrationSubComponent;
import ai.kudi.agent.settings.mcc.components.BvnVerificationSubcomponent;
import ai.kudi.agent.settings.p029ui.BvnExistingAgentActivity;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.dip.library.button.KudiButton;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.remoteconfig.Frame;
import java.io.Serializable;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: NonAgentSignOnFragment.kt */
@Metadata(m10422d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 *2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003H\u0014J\b\u0010\u001a\u001a\u00020\u0002H\u0014J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0014J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J$\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u001a\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016R\u001e\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006+"}, m10421d2 = {"Lai/kudi/agent/login/ui/NonAgentSignOnFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/register/v2/ui/viewModels/PhoneAndBvnViewModel;", "Lai/kudi/agent/register/v2/ui/viewModels/data/PhoneAndBvnViewData;", "Lai/kudi/agent/databinding/FragmentNonAgentSignOnBinding;", "()V", "phoneAndBvnViewModel", "getPhoneAndBvnViewModel", "()Lai/kudi/agent/register/v2/ui/viewModels/PhoneAndBvnViewModel;", "setPhoneAndBvnViewModel", "(Lai/kudi/agent/register/v2/ui/viewModels/PhoneAndBvnViewModel;)V", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "getRemoteConfig", "()Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "setRemoteConfig", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;)V", "user", "Lai/kudi/agent/users/domain/dto/User;", "getUser", "()Lai/kudi/agent/users/domain/dto/User;", "setUser", "(Lai/kudi/agent/users/domain/dto/User;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.login.ui.NonAgentSignOnFragment */
/* loaded from: classes.dex */
public final class NonAgentSignOnFragment extends BaseMVVMViewBindingFragment<PhoneAndBvnViewModel, PhoneAndBvnViewData, FragmentNonAgentSignOnBinding> {
    public static final Companion Companion;
    public PhoneAndBvnViewModel phoneAndBvnViewModel;
    public Frame remoteConfig;
    public User user;

    /* compiled from: NonAgentSignOnFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/login/ui/NonAgentSignOnFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/login/ui/NonAgentSignOnFragment;", "user", "Lai/kudi/agent/users/domain/dto/User;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.login.ui.NonAgentSignOnFragment$Companion */
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
        public final NonAgentSignOnFragment newInstance(User user) {
            Log_OC.getArray(user, "user");
            NonAgentSignOnFragment $r3 = new NonAgentSignOnFragment();
            Bundle $r1 = new Bundle();
            $r1.putSerializable("USER", user);
            C13666w c13666w = C13666w.f30112a;
            $r3.setArguments($r1);
            return $r3;
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
    /* renamed from: onViewCreated$lambda-1$lambda-0  reason: not valid java name */
    public static final void m39799onViewCreated$lambda1$lambda0(NonAgentSignOnFragment nonAgentSignOnFragment, View view) {
        Log_OC.getArray(nonAgentSignOnFragment, "this$0");
        PhoneAndBvnViewModel $r2 = nonAgentSignOnFragment.getPhoneAndBvnViewModel();
        User $r3 = nonAgentSignOnFragment.getUser();
        $r2.verifyPhoneNumber($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        PhoneAndBvnViewData $r2 = (PhoneAndBvnViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(PhoneAndBvnViewData phoneAndBvnViewData) {
        String $r6;
        Log_OC.getArray(phoneAndBvnViewData, "viewData");
        InterfaceC8209a $r2 = requireBinding();
        FragmentNonAgentSignOnBinding $r3 = (FragmentNonAgentSignOnBinding) $r2;
        boolean $z0 = phoneAndBvnViewData.isVerifyPhone();
        if ($z0) {
            KudiButton $r4 = $r3.continueButton;
            $r4.m38032f();
        } else {
            KudiButton $r42 = $r3.continueButton;
            $r42.m38033e();
        }
        PhoneAndBvnViewData.Error $r5 = phoneAndBvnViewData.getError();
        if ($r5 == null || ($r6 = $r5.getMessage()) == null) {
            return;
        }
        Context $r7 = requireContext();
        Log_OC.loadImage($r7, "requireContext()");
        ContextExtKt.toast$default($r7, $r6, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        PhoneAndBvnViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public PhoneAndBvnViewModel createViewModel() {
        PhoneAndBvnViewModel $r1 = getPhoneAndBvnViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PhoneAndBvnViewModel getPhoneAndBvnViewModel() {
        PhoneAndBvnViewModel $r1 = this.phoneAndBvnViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("phoneAndBvnViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Frame getRemoteConfig() {
        Frame $r1 = this.remoteConfig;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("remoteConfig");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final User getUser() {
        User $r1 = this.user;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("user");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return PhoneAndBvnViewModel.class;
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
        FragmentNonAgentSignOnBinding $r4 = FragmentNonAgentSignOnBinding.inflate(layoutInflater, viewGroup, false);
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
        Bundle $r2 = requireArguments();
        Serializable $r3 = $r2.getSerializable("USER");
        if ($r3 == null) {
            NullPointerException r14 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.users.domain.dto.User");
            throw r14;
        }
        User $r4 = (User) $r3;
        setUser($r4);
        InterfaceC8209a $r5 = requireBinding();
        FragmentNonAgentSignOnBinding $r6 = (FragmentNonAgentSignOnBinding) $r5;
        TextView $r7 = $r6.otpHeaderText;
        User $r42 = getUser();
        String $r9 = $r42.getFirstName();
        Object[] $r8 = {$r9};
        String $r92 = getString(C0001R.string.welcome_text, $r8);
        $r7.setText($r92);
        ViewGroup $r10 = $r6.continueButton;
        ViewGroup r15 = $r10;
        r15.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.login.ui.AboutFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                NonAgentSignOnFragment $r22 = NonAgentSignOnFragment.this;
                NonAgentSignOnFragment.m39799onViewCreated$lambda1$lambda0($r22, view2);
            }
        });
    }

    public final void setPhoneAndBvnViewModel(PhoneAndBvnViewModel phoneAndBvnViewModel) {
        Log_OC.getArray(phoneAndBvnViewModel, "<set-?>");
        this.phoneAndBvnViewModel = phoneAndBvnViewModel;
    }

    public final void setRemoteConfig(Frame frame) {
        Log_OC.getArray(frame, "<set-?>");
        this.remoteConfig = frame;
    }

    public final void setUser(User user) {
        Log_OC.getArray(user, "<set-?>");
        this.user = user;
    }
}

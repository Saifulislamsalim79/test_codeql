package ai.kudi.agent.settings.security.p028ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.biometric.BiometricUtils;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.FragmentSecurityBinding;
import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.settings.mcc.components.SettingsSubComponent;
import ai.kudi.agent.settings.navigators.SettingsNavigator;
import ai.kudi.agent.settings.p029ui.SettingsActivity;
import ai.kudi.agent.settings.p029ui.adapters.SecurityOptionsAdapter;
import ai.kudi.agent.settings.security.p028ui.viewModels.SecurityViewModel;
import ai.kudi.agent.settings.security.p028ui.viewModels.data.SecurityViewData;
import ai.kudi.agent.settings.tablet.SettingsActivityExtKt;
import ai.kudi.dip.library.button.KudiTextView;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: SecurityFragment.kt */
@Metadata(m10422d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003H\u0014J\b\u0010\u001a\u001a\u00020\u0002H\u0014J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0014J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u001a\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016R\u001e\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006*"}, m10421d2 = {"Lai/kudi/agent/settings/security/ui/SecurityFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/settings/security/ui/viewModels/SecurityViewModel;", "Lai/kudi/agent/settings/security/ui/viewModels/data/SecurityViewData;", "Lai/kudi/agent/databinding/FragmentSecurityBinding;", "()V", "securityViewModel", "getSecurityViewModel", "()Lai/kudi/agent/settings/security/ui/viewModels/SecurityViewModel;", "setSecurityViewModel", "(Lai/kudi/agent/settings/security/ui/viewModels/SecurityViewModel;)V", "settingsNavigator", "Lai/kudi/agent/settings/navigators/SettingsNavigator;", "getSettingsNavigator", "()Lai/kudi/agent/settings/navigators/SettingsNavigator;", "setSettingsNavigator", "(Lai/kudi/agent/settings/navigators/SettingsNavigator;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.security.ui.SecurityFragment */
/* loaded from: classes.dex */
public final class SecurityFragment extends BaseMVVMViewBindingFragment<SecurityViewModel, SecurityViewData, FragmentSecurityBinding> {
    public SecurityViewModel securityViewModel;
    public SettingsNavigator settingsNavigator;
    public SharedPreferences sharedPreferences;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m40874onViewCreated$lambda0(SecurityFragment securityFragment, View view) {
        Log_OC.getArray(securityFragment, "this$0");
        Context $r0 = securityFragment.requireContext();
        Log_OC.loadImage($r0, "requireContext()");
        Dialog r4 = new HowWeSecureAccountsBottomSheet($r0);
        Dialog r5 = r4;
        r5.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m40875onViewCreated$lambda1(SecurityFragment securityFragment, CompoundButton compoundButton, boolean z) {
        Log_OC.getArray(securityFragment, "this$0");
        if (z) {
            SharedPreferences $r2 = securityFragment.getSharedPreferences();
            SharedPreferences.Editor $r3 = $r2.edit();
            $r3.putBoolean(LoginParams.EXTRA_ENABLE_FINGERPRINT, true).apply();
            InterfaceC8209a $r4 = securityFragment.requireBinding();
            FragmentSecurityBinding $r5 = (FragmentSecurityBinding) $r4;
            TextView $r6 = $r5.turnOffBiometricsView;
            CharSequence $r7 = securityFragment.getString(C0001R.string.turn_off_biometrics);
            TextView r9 = $r6;
            r9.setText($r7);
        } else {
            SharedPreferences $r22 = securityFragment.getSharedPreferences();
            SharedPreferences.Editor $r32 = $r22.edit();
            $r32.putBoolean(LoginParams.EXTRA_ENABLE_FINGERPRINT, false).apply();
            InterfaceC8209a $r42 = securityFragment.requireBinding();
            FragmentSecurityBinding $r52 = (FragmentSecurityBinding) $r42;
            TextView $r62 = $r52.turnOffBiometricsView;
            CharSequence $r72 = securityFragment.getString(C0001R.string.turn_on_biometrics);
            TextView r92 = $r62;
            r92.setText($r72);
        }
        SecurityViewModel $r8 = securityFragment.getSecurityViewModel();
        $r8.logBiometrics(z);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        SecurityViewData $r2 = (SecurityViewData) viewData;
        applyViewData($r2);
    }

    protected void applyViewData(SecurityViewData securityViewData) {
        Log_OC.getArray(securityViewData, "viewData");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        SecurityViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public SecurityViewModel createViewModel() {
        SecurityViewModel $r1 = getSecurityViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SecurityViewModel getSecurityViewModel() {
        SecurityViewModel $r1 = this.securityViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("securityViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SettingsNavigator getSettingsNavigator() {
        SettingsNavigator $r1 = this.settingsNavigator;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("settingsNavigator");
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
        return SecurityViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        FragmentActivity $r2 = getActivity();
        if ($r2 == null) {
            NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.settings.ui.SettingsActivity");
            throw $r5;
        }
        SettingsActivity $r3 = (SettingsActivity) $r2;
        SettingsSubComponent $r4 = $r3.getSettingsSubComponent();
        $r4.inject(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        LayoutInflater $r1 = getLayoutInflater();
        FragmentSecurityBinding $r4 = FragmentSecurityBinding.inflate($r1, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(layoutInflater, container, false)");
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
        String $r3 = getString(C0001R.string.security);
        Log_OC.loadImage($r3, "getString(R.string.security)");
        SettingsActivityExtKt.setSettingsTitle(this, $r3);
        BiometricUtils $r4 = BiometricUtils.INSTANCE;
        Context $r5 = requireContext();
        Log_OC.loadImage($r5, "requireContext()");
        boolean $z0 = $r4.shouldShowEnableBiometric($r5);
        if ($z0) {
            InterfaceC8209a $r6 = requireBinding();
            FragmentSecurityBinding $r7 = (FragmentSecurityBinding) $r6;
            View $r8 = $r7.turnOffBiometricsView;
            Log_OC.loadImage($r8, "requireBinding().turnOffBiometricsView");
            View $r1 = $r8;
            ViewExtKt.show($r1);
            InterfaceC8209a $r62 = requireBinding();
            FragmentSecurityBinding $r72 = (FragmentSecurityBinding) $r62;
            View $r9 = $r72.bioMetricswitch;
            Log_OC.loadImage($r9, "requireBinding().bioMetricswitch");
            View $r12 = $r9;
            ViewExtKt.show($r12);
        } else {
            InterfaceC8209a $r63 = requireBinding();
            FragmentSecurityBinding $r73 = (FragmentSecurityBinding) $r63;
            KudiTextView $r82 = $r73.turnOffBiometricsView;
            Log_OC.loadImage($r82, "requireBinding().turnOffBiometricsView");
            ViewExtKt.hide($r82, true);
            InterfaceC8209a $r64 = requireBinding();
            FragmentSecurityBinding $r74 = (FragmentSecurityBinding) $r64;
            View $r92 = $r74.bioMetricswitch;
            Log_OC.loadImage($r92, "requireBinding().bioMetricswitch");
            View $r13 = $r92;
            ViewExtKt.hide($r13, true);
        }
        SharedPreferences $r10 = getSharedPreferences();
        boolean $z02 = $r10.getBoolean(LoginParams.EXTRA_ENABLE_FINGERPRINT, false);
        if ($z02) {
            InterfaceC8209a $r65 = requireBinding();
            FragmentSecurityBinding $r75 = (FragmentSecurityBinding) $r65;
            $r75.bioMetricswitch.setChecked(true);
            InterfaceC8209a $r66 = requireBinding();
            FragmentSecurityBinding $r76 = (FragmentSecurityBinding) $r66;
            TextView r20 = $r76.turnOffBiometricsView;
            r20.setText(getString(C0001R.string.turn_off_biometrics));
        } else {
            InterfaceC8209a $r67 = requireBinding();
            FragmentSecurityBinding $r77 = (FragmentSecurityBinding) $r67;
            $r77.bioMetricswitch.setChecked(false);
            InterfaceC8209a $r68 = requireBinding();
            FragmentSecurityBinding $r78 = (FragmentSecurityBinding) $r68;
            TextView r202 = $r78.turnOffBiometricsView;
            r202.setText(getString(C0001R.string.turn_on_biometrics));
        }
        Context $r52 = requireContext();
        Log_OC.loadImage($r52, "requireContext()");
        SecurityOptionsAdapter r16 = new SecurityOptionsAdapter($r52);
        InterfaceC8209a $r69 = requireBinding();
        FragmentSecurityBinding $r79 = (FragmentSecurityBinding) $r69;
        $r79.securityOptionsRecyclerView.setAdapter(r16);
        SecurityFragment$onViewCreated$1 r17 = new SecurityFragment$onViewCreated$1(this);
        r16.setOnClickListener(r17);
        InterfaceC8209a $r610 = requireBinding();
        FragmentSecurityBinding $r710 = (FragmentSecurityBinding) $r610;
        TextView r203 = $r710.learnMoreView;
        r203.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.security.ui.FileSelectionFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SecurityFragment $r2 = SecurityFragment.this;
                SecurityFragment.m40874onViewCreated$lambda0($r2, view2);
            }
        });
        InterfaceC8209a $r611 = requireBinding();
        FragmentSecurityBinding $r711 = (FragmentSecurityBinding) $r611;
        CompoundButton r21 = $r711.bioMetricswitch;
        r21.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ai.kudi.agent.settings.security.ui.SettingsFragment$9
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SecurityFragment $r2 = SecurityFragment.this;
                SecurityFragment.m40875onViewCreated$lambda1($r2, compoundButton, z);
            }
        });
    }

    public final void setSecurityViewModel(SecurityViewModel securityViewModel) {
        Log_OC.getArray(securityViewModel, "<set-?>");
        this.securityViewModel = securityViewModel;
    }

    public final void setSettingsNavigator(SettingsNavigator settingsNavigator) {
        Log_OC.getArray(settingsNavigator, "<set-?>");
        this.settingsNavigator = settingsNavigator;
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }
}

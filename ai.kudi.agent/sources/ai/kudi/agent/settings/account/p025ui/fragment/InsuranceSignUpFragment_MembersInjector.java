package ai.kudi.agent.settings.account.p025ui.fragment;

import ai.kudi.agent.settings.account.p025ui.viewModel.InsuranceSignupViewModel;
import com.google.firebase.remoteconfig.Frame;
import com.google.firebase.remoteconfig.k;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.account.ui.fragment.InsuranceSignUpFragment_MembersInjector */
/* loaded from: classes.dex */
public final class InsuranceSignUpFragment_MembersInjector implements InterfaceC9463a<InsuranceSignUpFragment> {
    private final InterfaceC11700a<InsuranceSignupViewModel> insuranceViewModelProvider;
    private final InterfaceC11700a<k> remoteConfigProvider;

    public InsuranceSignUpFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.insuranceViewModelProvider = interfaceC11700a;
        this.remoteConfigProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        InsuranceSignUpFragment_MembersInjector $r2 = new InsuranceSignUpFragment_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectInsuranceViewModel(InsuranceSignUpFragment insuranceSignUpFragment, InsuranceSignupViewModel insuranceSignupViewModel) {
        insuranceSignUpFragment.insuranceViewModel = insuranceSignupViewModel;
    }

    public static void injectRemoteConfig(InsuranceSignUpFragment insuranceSignUpFragment, Frame frame) {
        insuranceSignUpFragment.remoteConfig = frame;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(InsuranceSignUpFragment insuranceSignUpFragment) {
        InterfaceC11700a $r2 = this.insuranceViewModelProvider;
        Object $r3 = $r2.get();
        InsuranceSignupViewModel $r4 = (InsuranceSignupViewModel) $r3;
        injectInsuranceViewModel(insuranceSignUpFragment, $r4);
        InterfaceC11700a $r22 = this.remoteConfigProvider;
        Object $r32 = $r22.get();
        Frame $r5 = (Frame) $r32;
        injectRemoteConfig(insuranceSignUpFragment, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        InsuranceSignUpFragment $r2 = (InsuranceSignUpFragment) obj;
        injectMembers($r2);
    }
}

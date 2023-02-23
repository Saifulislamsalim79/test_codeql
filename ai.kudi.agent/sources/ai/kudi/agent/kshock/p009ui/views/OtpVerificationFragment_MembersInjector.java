package ai.kudi.agent.kshock.p009ui.views;

import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.kshock.ui.views.OtpVerificationFragment_MembersInjector */
/* loaded from: classes.dex */
public final class OtpVerificationFragment_MembersInjector implements InterfaceC9463a<OtpVerificationFragment> {
    private final InterfaceC11700a<OtpVerificationViewModel> viewModelProvider;

    public OtpVerificationFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.viewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        OtpVerificationFragment_MembersInjector $r1 = new OtpVerificationFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectViewModel(OtpVerificationFragment otpVerificationFragment, OtpVerificationViewModel otpVerificationViewModel) {
        otpVerificationFragment.viewModel = otpVerificationViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(OtpVerificationFragment otpVerificationFragment) {
        InterfaceC11700a $r3 = this.viewModelProvider;
        Object $r2 = $r3.get();
        OtpVerificationViewModel $r4 = (OtpVerificationViewModel) $r2;
        injectViewModel(otpVerificationFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        OtpVerificationFragment $r2 = (OtpVerificationFragment) obj;
        injectMembers($r2);
    }
}

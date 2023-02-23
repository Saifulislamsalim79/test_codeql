package ai.kudi.agent.register.p022v2.p023ui;

import ai.kudi.agent.register.p022v2.p023ui.viewModels.OtpViewModel;
import com.google.firebase.remoteconfig.Frame;
import com.google.firebase.remoteconfig.k;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.register.v2.ui.OtpFragment_MembersInjector */
/* loaded from: classes.dex */
public final class OtpFragment_MembersInjector implements InterfaceC9463a<OtpFragment> {
    private final InterfaceC11700a<OtpViewModel> otpViewModelProvider;
    private final InterfaceC11700a<k> remoteConfigProvider;

    public OtpFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.remoteConfigProvider = interfaceC11700a;
        this.otpViewModelProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        OtpFragment_MembersInjector $r2 = new OtpFragment_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectOtpViewModel(OtpFragment otpFragment, OtpViewModel otpViewModel) {
        otpFragment.otpViewModel = otpViewModel;
    }

    public static void injectRemoteConfig(OtpFragment otpFragment, Frame frame) {
        otpFragment.remoteConfig = frame;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(OtpFragment otpFragment) {
        InterfaceC11700a $r2 = this.remoteConfigProvider;
        Object $r3 = $r2.get();
        Frame $r4 = (Frame) $r3;
        injectRemoteConfig(otpFragment, $r4);
        InterfaceC11700a $r22 = this.otpViewModelProvider;
        Object $r32 = $r22.get();
        OtpViewModel $r5 = (OtpViewModel) $r32;
        injectOtpViewModel(otpFragment, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        OtpFragment $r2 = (OtpFragment) obj;
        injectMembers($r2);
    }
}

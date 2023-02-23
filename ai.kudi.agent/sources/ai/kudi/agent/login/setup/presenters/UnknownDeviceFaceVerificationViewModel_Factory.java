package ai.kudi.agent.login.setup.presenters;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.login.navigators.PhoneVerificationNavigator;
import ai.kudi.agent.login.setup.domain.VerifyFaceForLogin;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class UnknownDeviceFaceVerificationViewModel_Factory implements InterfaceC9468d<UnknownDeviceFaceVerificationViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<PhoneVerificationNavigator> phoneVerificationNavigatorProvider;
    private final InterfaceC11700a<VerifyFaceForLogin> verifyFaceForLoginProvider;

    public UnknownDeviceFaceVerificationViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.verifyFaceForLoginProvider = interfaceC11700a;
        this.phoneVerificationNavigatorProvider = interfaceC11700a2;
        this.analyticsProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UnknownDeviceFaceVerificationViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        UnknownDeviceFaceVerificationViewModel_Factory $r3 = new UnknownDeviceFaceVerificationViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UnknownDeviceFaceVerificationViewModel newInstance(VerifyFaceForLogin verifyFaceForLogin, PhoneVerificationNavigator phoneVerificationNavigator, Analytics analytics) {
        UnknownDeviceFaceVerificationViewModel $r3 = new UnknownDeviceFaceVerificationViewModel(verifyFaceForLogin, phoneVerificationNavigator, analytics);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public UnknownDeviceFaceVerificationViewModel multiply() {
        InterfaceC11700a $r1 = this.verifyFaceForLoginProvider;
        Object $r2 = $r1.get();
        VerifyFaceForLogin $r3 = (VerifyFaceForLogin) $r2;
        InterfaceC11700a $r12 = this.phoneVerificationNavigatorProvider;
        Object $r22 = $r12.get();
        PhoneVerificationNavigator $r4 = (PhoneVerificationNavigator) $r22;
        InterfaceC11700a $r13 = this.analyticsProvider;
        Object $r23 = $r13.get();
        Analytics $r5 = (Analytics) $r23;
        UnknownDeviceFaceVerificationViewModel $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39766multiply() {
        UnknownDeviceFaceVerificationViewModel $r1 = multiply();
        return $r1;
    }
}

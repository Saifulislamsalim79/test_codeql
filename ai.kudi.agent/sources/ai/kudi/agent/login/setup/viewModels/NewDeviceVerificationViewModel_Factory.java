package ai.kudi.agent.login.setup.viewModels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.login.navigators.PhoneVerificationNavigator;
import ai.kudi.agent.register.domain.usecases.BaseOtpUtil;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class NewDeviceVerificationViewModel_Factory implements InterfaceC9468d<NewDeviceVerificationViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<BaseOtpUtil> baseOtpUtilProvider;
    private final InterfaceC11700a<PhoneVerificationNavigator> phoneVerificationNavigatorProvider;

    public NewDeviceVerificationViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.baseOtpUtilProvider = interfaceC11700a;
        this.phoneVerificationNavigatorProvider = interfaceC11700a2;
        this.analyticsProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static NewDeviceVerificationViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        NewDeviceVerificationViewModel_Factory $r3 = new NewDeviceVerificationViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static NewDeviceVerificationViewModel newInstance(BaseOtpUtil baseOtpUtil, PhoneVerificationNavigator phoneVerificationNavigator, Analytics analytics) {
        NewDeviceVerificationViewModel $r3 = new NewDeviceVerificationViewModel(baseOtpUtil, phoneVerificationNavigator, analytics);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public NewDeviceVerificationViewModel multiply() {
        InterfaceC11700a $r1 = this.baseOtpUtilProvider;
        Object $r2 = $r1.get();
        BaseOtpUtil $r3 = (BaseOtpUtil) $r2;
        InterfaceC11700a $r12 = this.phoneVerificationNavigatorProvider;
        Object $r22 = $r12.get();
        PhoneVerificationNavigator $r4 = (PhoneVerificationNavigator) $r22;
        InterfaceC11700a $r13 = this.analyticsProvider;
        Object $r23 = $r13.get();
        Analytics $r5 = (Analytics) $r23;
        NewDeviceVerificationViewModel $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39781multiply() {
        NewDeviceVerificationViewModel $r1 = multiply();
        return $r1;
    }
}

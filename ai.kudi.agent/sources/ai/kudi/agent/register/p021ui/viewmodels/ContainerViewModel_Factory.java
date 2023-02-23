package ai.kudi.agent.register.p021ui.viewmodels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.register.domain.usecases.BaseOtpUtil;
import ai.kudi.agent.register.navigators.RegisterNavigator;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.register.ui.viewmodels.ContainerViewModel_Factory */
/* loaded from: classes.dex */
public final class ContainerViewModel_Factory implements InterfaceC9468d<ContainerViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<BaseOtpUtil> baseOtpUtilProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<RegisterNavigator> navigatorProvider;

    public ContainerViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        this.fetchCurrentUserProvider = interfaceC11700a;
        this.analyticsProvider = interfaceC11700a2;
        this.baseOtpUtilProvider = interfaceC11700a3;
        this.navigatorProvider = interfaceC11700a4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ContainerViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        ContainerViewModel_Factory $r4 = new ContainerViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ContainerViewModel newInstance(FetchCurrentUser fetchCurrentUser, Analytics analytics, BaseOtpUtil baseOtpUtil, RegisterNavigator registerNavigator) {
        ContainerViewModel $r4 = new ContainerViewModel(fetchCurrentUser, analytics, baseOtpUtil, registerNavigator);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ContainerViewModel multiply() {
        InterfaceC11700a $r1 = this.fetchCurrentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.analyticsProvider;
        Object $r22 = $r12.get();
        Analytics $r4 = (Analytics) $r22;
        InterfaceC11700a $r13 = this.baseOtpUtilProvider;
        Object $r23 = $r13.get();
        BaseOtpUtil $r5 = (BaseOtpUtil) $r23;
        InterfaceC11700a $r14 = this.navigatorProvider;
        Object $r24 = $r14.get();
        RegisterNavigator $r6 = (RegisterNavigator) $r24;
        ContainerViewModel $r7 = newInstance($r3, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40405multiply() {
        ContainerViewModel $r1 = multiply();
        return $r1;
    }
}

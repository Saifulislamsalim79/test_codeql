package ai.kudi.agent.pin.viewModel;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.data.DeviceInformation;
import ai.kudi.agent.users.domain.usecases.Authorize;
import ai.kudi.agent.users.domain.usecases.AuthorizeSavings;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class KudiPinViewModel_Factory implements InterfaceC9468d<KudiPinViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<Authorize> authorizeProvider;
    private final InterfaceC11700a<AuthorizeSavings> authorizeSavingsProvider;
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<DeviceInformation> deviceInformationProvider;

    public KudiPinViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        this.currentUserProvider = interfaceC11700a;
        this.authorizeProvider = interfaceC11700a2;
        this.deviceInformationProvider = interfaceC11700a3;
        this.analyticsProvider = interfaceC11700a4;
        this.authorizeSavingsProvider = interfaceC11700a5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static KudiPinViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        KudiPinViewModel_Factory $r5 = new KudiPinViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static KudiPinViewModel newInstance(FetchCurrentUser fetchCurrentUser, Authorize authorize, DeviceInformation deviceInformation, Analytics analytics, AuthorizeSavings authorizeSavings) {
        KudiPinViewModel $r5 = new KudiPinViewModel(fetchCurrentUser, authorize, deviceInformation, analytics, authorizeSavings);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public KudiPinViewModel multiply() {
        InterfaceC11700a $r1 = this.currentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.authorizeProvider;
        Object $r22 = $r12.get();
        Authorize $r4 = (Authorize) $r22;
        InterfaceC11700a $r13 = this.deviceInformationProvider;
        Object $r23 = $r13.get();
        DeviceInformation $r5 = (DeviceInformation) $r23;
        InterfaceC11700a $r14 = this.analyticsProvider;
        Object $r24 = $r14.get();
        Analytics $r6 = (Analytics) $r24;
        InterfaceC11700a $r15 = this.authorizeSavingsProvider;
        Object $r25 = $r15.get();
        AuthorizeSavings $r7 = (AuthorizeSavings) $r25;
        KudiPinViewModel $r8 = newInstance($r3, $r4, $r5, $r6, $r7);
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40029multiply() {
        KudiPinViewModel $r1 = multiply();
        return $r1;
    }
}

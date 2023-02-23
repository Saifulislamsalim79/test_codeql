package ai.kudi.agent.outlet_mgt.viewmodels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.outlet_mgt.domain.repositories.ChildOutletInformationRepository;
import ai.kudi.agent.outlet_mgt.navigator.OutletMgtNavigator;
import ai.kudi.agent.register.domain.usecases.ResendOtp;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class CreateOutletViewModel_Factory implements InterfaceC9468d<CreateOutletViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<OutletMgtNavigator> outletMgtNavigatorProvider;
    private final InterfaceC11700a<ChildOutletInformationRepository> repositoryProvider;
    private final InterfaceC11700a<ResendOtp> resendOtpProvider;

    public CreateOutletViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        this.repositoryProvider = interfaceC11700a;
        this.outletMgtNavigatorProvider = interfaceC11700a2;
        this.fetchCurrentUserProvider = interfaceC11700a3;
        this.resendOtpProvider = interfaceC11700a4;
        this.analyticsProvider = interfaceC11700a5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CreateOutletViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        CreateOutletViewModel_Factory $r5 = new CreateOutletViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CreateOutletViewModel newInstance(ChildOutletInformationRepository childOutletInformationRepository, OutletMgtNavigator outletMgtNavigator, FetchCurrentUser fetchCurrentUser, ResendOtp resendOtp, Analytics analytics) {
        CreateOutletViewModel $r5 = new CreateOutletViewModel(childOutletInformationRepository, outletMgtNavigator, fetchCurrentUser, resendOtp, analytics);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CreateOutletViewModel multiply() {
        InterfaceC11700a $r1 = this.repositoryProvider;
        Object $r2 = $r1.get();
        ChildOutletInformationRepository $r3 = (ChildOutletInformationRepository) $r2;
        InterfaceC11700a $r12 = this.outletMgtNavigatorProvider;
        Object $r22 = $r12.get();
        OutletMgtNavigator $r4 = (OutletMgtNavigator) $r22;
        InterfaceC11700a $r13 = this.fetchCurrentUserProvider;
        Object $r23 = $r13.get();
        FetchCurrentUser $r5 = (FetchCurrentUser) $r23;
        InterfaceC11700a $r14 = this.resendOtpProvider;
        Object $r24 = $r14.get();
        ResendOtp $r6 = (ResendOtp) $r24;
        InterfaceC11700a $r15 = this.analyticsProvider;
        Object $r25 = $r15.get();
        Analytics $r7 = (Analytics) $r25;
        CreateOutletViewModel $r8 = newInstance($r3, $r4, $r5, $r6, $r7);
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39926multiply() {
        CreateOutletViewModel $r1 = multiply();
        return $r1;
    }
}

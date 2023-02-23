package ai.kudi.agent.outlet_mgt.viewmodels.outlet_info;

import ai.kudi.agent.outlet_mgt.domain.repositories.ChildOutletInformationRepository;
import ai.kudi.agent.outlet_mgt.useCases.FetchOutletDetails;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class ChildOutletInformationViewModel_Factory implements InterfaceC9468d<ChildOutletInformationViewModel> {
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<FetchOutletDetails> fetchOutletDetailsProvider;
    private final InterfaceC11700a<ChildOutletInformationRepository> repositoryProvider;

    public ChildOutletInformationViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.repositoryProvider = interfaceC11700a;
        this.fetchOutletDetailsProvider = interfaceC11700a2;
        this.fetchCurrentUserProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ChildOutletInformationViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        ChildOutletInformationViewModel_Factory $r3 = new ChildOutletInformationViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ChildOutletInformationViewModel newInstance(ChildOutletInformationRepository childOutletInformationRepository, FetchOutletDetails fetchOutletDetails, FetchCurrentUser fetchCurrentUser) {
        ChildOutletInformationViewModel $r3 = new ChildOutletInformationViewModel(childOutletInformationRepository, fetchOutletDetails, fetchCurrentUser);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ChildOutletInformationViewModel multiply() {
        InterfaceC11700a $r1 = this.repositoryProvider;
        Object $r2 = $r1.get();
        ChildOutletInformationRepository $r3 = (ChildOutletInformationRepository) $r2;
        InterfaceC11700a $r12 = this.fetchOutletDetailsProvider;
        Object $r22 = $r12.get();
        FetchOutletDetails $r4 = (FetchOutletDetails) $r22;
        InterfaceC11700a $r13 = this.fetchCurrentUserProvider;
        Object $r23 = $r13.get();
        FetchCurrentUser $r5 = (FetchCurrentUser) $r23;
        ChildOutletInformationViewModel $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39987multiply() {
        ChildOutletInformationViewModel $r1 = multiply();
        return $r1;
    }
}

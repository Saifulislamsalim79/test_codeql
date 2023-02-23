package ai.kudi.agent.savings.viewmodel;

import ai.kudi.agent.core.util.ResourceDelegate;
import ai.kudi.agent.savings.data.repository.SavingsRepository;
import ai.kudi.agent.savings.navigator.SavingsNavigator;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class SavingsViewModel_Factory implements InterfaceC9468d<SavingsViewModel> {
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<SavingsNavigator> navigatorProvider;
    private final InterfaceC11700a<ResourceDelegate> resourceProvider;
    private final InterfaceC11700a<SavingsRepository> savingsRepositoryProvider;

    public SavingsViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        this.currentUserProvider = interfaceC11700a;
        this.savingsRepositoryProvider = interfaceC11700a2;
        this.resourceProvider = interfaceC11700a3;
        this.navigatorProvider = interfaceC11700a4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SavingsViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        SavingsViewModel_Factory $r4 = new SavingsViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SavingsViewModel newInstance(FetchCurrentUser fetchCurrentUser, SavingsRepository savingsRepository, ResourceDelegate resourceDelegate, SavingsNavigator savingsNavigator) {
        SavingsViewModel $r4 = new SavingsViewModel(fetchCurrentUser, savingsRepository, resourceDelegate, savingsNavigator);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SavingsViewModel multiply() {
        InterfaceC11700a $r1 = this.currentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.savingsRepositoryProvider;
        Object $r22 = $r12.get();
        SavingsRepository $r4 = (SavingsRepository) $r22;
        InterfaceC11700a $r13 = this.resourceProvider;
        Object $r23 = $r13.get();
        ResourceDelegate $r5 = (ResourceDelegate) $r23;
        InterfaceC11700a $r14 = this.navigatorProvider;
        Object $r24 = $r14.get();
        SavingsNavigator $r6 = (SavingsNavigator) $r24;
        SavingsViewModel $r7 = newInstance($r3, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40649multiply() {
        SavingsViewModel $r1 = multiply();
        return $r1;
    }
}

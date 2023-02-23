package ai.kudi.agent.kshock.presentation;

import ai.kudi.agent.kshock.navigator.KShockNavigator;
import ai.kudi.agent.kshock.usecases.FetchExistingLoaner;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class KshockExistingLoanerViewModel_Factory implements InterfaceC9468d<KshockExistingLoanerViewModel> {
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<FetchExistingLoaner> fetchExistingLoanerProvider;
    private final InterfaceC11700a<KShockNavigator> kShockNavigatorProvider;

    public KshockExistingLoanerViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.fetchExistingLoanerProvider = interfaceC11700a;
        this.kShockNavigatorProvider = interfaceC11700a2;
        this.fetchCurrentUserProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static KshockExistingLoanerViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        KshockExistingLoanerViewModel_Factory $r3 = new KshockExistingLoanerViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static KshockExistingLoanerViewModel newInstance(FetchExistingLoaner fetchExistingLoaner, KShockNavigator kShockNavigator, FetchCurrentUser fetchCurrentUser) {
        KshockExistingLoanerViewModel $r3 = new KshockExistingLoanerViewModel(fetchExistingLoaner, kShockNavigator, fetchCurrentUser);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public KshockExistingLoanerViewModel multiply() {
        InterfaceC11700a $r1 = this.fetchExistingLoanerProvider;
        Object $r2 = $r1.get();
        FetchExistingLoaner $r3 = (FetchExistingLoaner) $r2;
        InterfaceC11700a $r12 = this.kShockNavigatorProvider;
        Object $r22 = $r12.get();
        KShockNavigator $r4 = (KShockNavigator) $r22;
        InterfaceC11700a $r13 = this.fetchCurrentUserProvider;
        Object $r23 = $r13.get();
        FetchCurrentUser $r5 = (FetchCurrentUser) $r23;
        KshockExistingLoanerViewModel $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39594multiply() {
        KshockExistingLoanerViewModel $r1 = multiply();
        return $r1;
    }
}

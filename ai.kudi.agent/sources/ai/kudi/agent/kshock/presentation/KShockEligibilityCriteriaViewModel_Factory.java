package ai.kudi.agent.kshock.presentation;

import ai.kudi.agent.kshock.usecases.FetchNewKshockEligibility;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class KShockEligibilityCriteriaViewModel_Factory implements InterfaceC9468d<KShockEligibilityCriteriaViewModel> {
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<FetchNewKshockEligibility> fetchNewKshockEligibilityProvider;

    public KShockEligibilityCriteriaViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.currentUserProvider = interfaceC11700a;
        this.fetchNewKshockEligibilityProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static KShockEligibilityCriteriaViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        KShockEligibilityCriteriaViewModel_Factory $r2 = new KShockEligibilityCriteriaViewModel_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static KShockEligibilityCriteriaViewModel newInstance(FetchCurrentUser fetchCurrentUser, FetchNewKshockEligibility fetchNewKshockEligibility) {
        KShockEligibilityCriteriaViewModel $r2 = new KShockEligibilityCriteriaViewModel(fetchCurrentUser, fetchNewKshockEligibility);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public KShockEligibilityCriteriaViewModel multiply() {
        InterfaceC11700a $r1 = this.currentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.fetchNewKshockEligibilityProvider;
        Object $r22 = $r12.get();
        FetchNewKshockEligibility $r4 = (FetchNewKshockEligibility) $r22;
        KShockEligibilityCriteriaViewModel $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39581multiply() {
        KShockEligibilityCriteriaViewModel $r1 = multiply();
        return $r1;
    }
}

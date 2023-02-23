package ai.kudi.agent.savings.viewmodel;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.savings.navigator.SavingsNavigator;
import ai.kudi.agent.savings.usecase.DeactivateSaving;
import ai.kudi.agent.savings.usecase.RenewSaving;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class SavingDetailViewModel_Factory implements InterfaceC9468d<SavingDetailViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<DeactivateSaving> deactivateSavingProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<SavingsNavigator> navigatorProvider;
    private final InterfaceC11700a<RenewSaving> renewSavingProvider;

    public SavingDetailViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        this.deactivateSavingProvider = interfaceC11700a;
        this.navigatorProvider = interfaceC11700a2;
        this.fetchCurrentUserProvider = interfaceC11700a3;
        this.analyticsProvider = interfaceC11700a4;
        this.renewSavingProvider = interfaceC11700a5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SavingDetailViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        SavingDetailViewModel_Factory $r5 = new SavingDetailViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SavingDetailViewModel newInstance(DeactivateSaving deactivateSaving, SavingsNavigator savingsNavigator, FetchCurrentUser fetchCurrentUser, Analytics analytics, RenewSaving renewSaving) {
        SavingDetailViewModel $r5 = new SavingDetailViewModel(deactivateSaving, savingsNavigator, fetchCurrentUser, analytics, renewSaving);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SavingDetailViewModel multiply() {
        InterfaceC11700a $r1 = this.deactivateSavingProvider;
        Object $r2 = $r1.get();
        DeactivateSaving $r3 = (DeactivateSaving) $r2;
        InterfaceC11700a $r12 = this.navigatorProvider;
        Object $r22 = $r12.get();
        SavingsNavigator $r4 = (SavingsNavigator) $r22;
        InterfaceC11700a $r13 = this.fetchCurrentUserProvider;
        Object $r23 = $r13.get();
        FetchCurrentUser $r5 = (FetchCurrentUser) $r23;
        InterfaceC11700a $r14 = this.analyticsProvider;
        Object $r24 = $r14.get();
        Analytics $r6 = (Analytics) $r24;
        InterfaceC11700a $r15 = this.renewSavingProvider;
        Object $r25 = $r15.get();
        RenewSaving $r7 = (RenewSaving) $r25;
        SavingDetailViewModel $r8 = newInstance($r3, $r4, $r5, $r6, $r7);
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40626multiply() {
        SavingDetailViewModel $r1 = multiply();
        return $r1;
    }
}

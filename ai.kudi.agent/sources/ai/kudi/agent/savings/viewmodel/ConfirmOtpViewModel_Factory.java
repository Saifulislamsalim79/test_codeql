package ai.kudi.agent.savings.viewmodel;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.savings.data.repository.ConfirmOtpRepository;
import ai.kudi.agent.savings.navigator.SavingsNavigator;
import ai.kudi.agent.savings.usecase.CreateSavings;
import ai.kudi.agent.savings.usecase.DeactivateSaving;
import ai.kudi.agent.savings.usecase.Withdraw;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class ConfirmOtpViewModel_Factory implements InterfaceC9468d<ConfirmOtpViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<ConfirmOtpRepository> confirmOtpRepositoryProvider;
    private final InterfaceC11700a<CreateSavings> createSavingsProvider;
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<DeactivateSaving> deactivateSavingProvider;
    private final InterfaceC11700a<SavingsNavigator> savingsNavigatorProvider;
    private final InterfaceC11700a<Withdraw> withdrawProvider;

    public ConfirmOtpViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7) {
        this.savingsNavigatorProvider = interfaceC11700a;
        this.confirmOtpRepositoryProvider = interfaceC11700a2;
        this.createSavingsProvider = interfaceC11700a3;
        this.withdrawProvider = interfaceC11700a4;
        this.analyticsProvider = interfaceC11700a5;
        this.deactivateSavingProvider = interfaceC11700a6;
        this.currentUserProvider = interfaceC11700a7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ConfirmOtpViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7) {
        ConfirmOtpViewModel_Factory $r7 = new ConfirmOtpViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6, interfaceC11700a7);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ConfirmOtpViewModel newInstance(SavingsNavigator savingsNavigator, ConfirmOtpRepository confirmOtpRepository, CreateSavings createSavings, Withdraw withdraw, Analytics analytics, DeactivateSaving deactivateSaving, FetchCurrentUser fetchCurrentUser) {
        ConfirmOtpViewModel $r7 = new ConfirmOtpViewModel(savingsNavigator, confirmOtpRepository, createSavings, withdraw, analytics, deactivateSaving, fetchCurrentUser);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ConfirmOtpViewModel multiply() {
        InterfaceC11700a $r1 = this.savingsNavigatorProvider;
        Object $r2 = $r1.get();
        SavingsNavigator $r3 = (SavingsNavigator) $r2;
        InterfaceC11700a $r12 = this.confirmOtpRepositoryProvider;
        Object $r22 = $r12.get();
        ConfirmOtpRepository $r4 = (ConfirmOtpRepository) $r22;
        InterfaceC11700a $r13 = this.createSavingsProvider;
        Object $r23 = $r13.get();
        CreateSavings $r5 = (CreateSavings) $r23;
        InterfaceC11700a $r14 = this.withdrawProvider;
        Object $r24 = $r14.get();
        Withdraw withdraw = (Withdraw) $r24;
        InterfaceC11700a $r15 = this.analyticsProvider;
        Object $r25 = $r15.get();
        Analytics analytics = (Analytics) $r25;
        InterfaceC11700a $r16 = this.deactivateSavingProvider;
        Object $r26 = $r16.get();
        DeactivateSaving deactivateSaving = (DeactivateSaving) $r26;
        InterfaceC11700a $r17 = this.currentUserProvider;
        Object $r27 = $r17.get();
        FetchCurrentUser $r9 = (FetchCurrentUser) $r27;
        ConfirmOtpViewModel $r10 = newInstance($r3, $r4, $r5, withdraw, analytics, deactivateSaving, $r9);
        return $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40601multiply() {
        ConfirmOtpViewModel $r1 = multiply();
        return $r1;
    }
}

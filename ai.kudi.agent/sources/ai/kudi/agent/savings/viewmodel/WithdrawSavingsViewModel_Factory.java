package ai.kudi.agent.savings.viewmodel;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.savings.navigator.SavingsNavigator;
import ai.kudi.agent.savings.usecase.Withdraw;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class WithdrawSavingsViewModel_Factory implements InterfaceC9468d<WithdrawSavingsViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<SavingsNavigator> navigatorProvider;
    private final InterfaceC11700a<Withdraw> withdrawProvider;

    public WithdrawSavingsViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        this.withdrawProvider = interfaceC11700a;
        this.navigatorProvider = interfaceC11700a2;
        this.analyticsProvider = interfaceC11700a3;
        this.currentUserProvider = interfaceC11700a4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static WithdrawSavingsViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        WithdrawSavingsViewModel_Factory $r4 = new WithdrawSavingsViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static WithdrawSavingsViewModel newInstance(Withdraw withdraw, SavingsNavigator savingsNavigator, Analytics analytics, FetchCurrentUser fetchCurrentUser) {
        WithdrawSavingsViewModel $r4 = new WithdrawSavingsViewModel(withdraw, savingsNavigator, analytics, fetchCurrentUser);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public WithdrawSavingsViewModel multiply() {
        InterfaceC11700a $r1 = this.withdrawProvider;
        Object $r2 = $r1.get();
        Withdraw $r3 = (Withdraw) $r2;
        InterfaceC11700a $r12 = this.navigatorProvider;
        Object $r22 = $r12.get();
        SavingsNavigator $r4 = (SavingsNavigator) $r22;
        InterfaceC11700a $r13 = this.analyticsProvider;
        Object $r23 = $r13.get();
        Analytics $r5 = (Analytics) $r23;
        InterfaceC11700a $r14 = this.currentUserProvider;
        Object $r24 = $r14.get();
        FetchCurrentUser $r6 = (FetchCurrentUser) $r24;
        WithdrawSavingsViewModel $r7 = newInstance($r3, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40655multiply() {
        WithdrawSavingsViewModel $r1 = multiply();
        return $r1;
    }
}

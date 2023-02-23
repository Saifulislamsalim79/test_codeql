package ai.kudi.agent.savings.viewmodel;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.savings.navigator.SavingsNavigator;
import ai.kudi.agent.savings.usecase.SavingsPlan;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class SavingsPlanViewModel_Factory implements InterfaceC9468d<SavingsPlanViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<SavingsNavigator> navigatorProvider;
    private final InterfaceC11700a<SavingsPlan> savingsPlanProvider;

    public SavingsPlanViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.savingsPlanProvider = interfaceC11700a;
        this.navigatorProvider = interfaceC11700a2;
        this.analyticsProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SavingsPlanViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        SavingsPlanViewModel_Factory $r3 = new SavingsPlanViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SavingsPlanViewModel newInstance(SavingsPlan savingsPlan, SavingsNavigator savingsNavigator, Analytics analytics) {
        SavingsPlanViewModel $r3 = new SavingsPlanViewModel(savingsPlan, savingsNavigator, analytics);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SavingsPlanViewModel multiply() {
        InterfaceC11700a $r1 = this.savingsPlanProvider;
        Object $r2 = $r1.get();
        SavingsPlan $r3 = (SavingsPlan) $r2;
        InterfaceC11700a $r12 = this.navigatorProvider;
        Object $r22 = $r12.get();
        SavingsNavigator $r4 = (SavingsNavigator) $r22;
        InterfaceC11700a $r13 = this.analyticsProvider;
        Object $r23 = $r13.get();
        Analytics $r5 = (Analytics) $r23;
        SavingsPlanViewModel $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40633multiply() {
        SavingsPlanViewModel $r1 = multiply();
        return $r1;
    }
}

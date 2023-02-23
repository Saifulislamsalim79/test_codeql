package ai.kudi.agent.savings.viewmodel;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.util.ResourceDelegate;
import ai.kudi.agent.savings.navigator.SavingsNavigator;
import ai.kudi.agent.savings.usecase.PlanDuration;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class CreateSavingsViewModel_Factory implements InterfaceC9468d<CreateSavingsViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<PlanDuration> durationProvider;
    private final InterfaceC11700a<SavingsNavigator> navigatorProvider;
    private final InterfaceC11700a<ResourceDelegate> resourceProvider;

    public CreateSavingsViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        this.navigatorProvider = interfaceC11700a;
        this.analyticsProvider = interfaceC11700a2;
        this.durationProvider = interfaceC11700a3;
        this.resourceProvider = interfaceC11700a4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CreateSavingsViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        CreateSavingsViewModel_Factory $r4 = new CreateSavingsViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CreateSavingsViewModel newInstance(SavingsNavigator savingsNavigator, Analytics analytics, PlanDuration planDuration, ResourceDelegate resourceDelegate) {
        CreateSavingsViewModel $r4 = new CreateSavingsViewModel(savingsNavigator, analytics, planDuration, resourceDelegate);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CreateSavingsViewModel multiply() {
        InterfaceC11700a $r1 = this.navigatorProvider;
        Object $r2 = $r1.get();
        SavingsNavigator $r3 = (SavingsNavigator) $r2;
        InterfaceC11700a $r12 = this.analyticsProvider;
        Object $r22 = $r12.get();
        Analytics $r4 = (Analytics) $r22;
        InterfaceC11700a $r13 = this.durationProvider;
        Object $r23 = $r13.get();
        PlanDuration $r5 = (PlanDuration) $r23;
        InterfaceC11700a $r14 = this.resourceProvider;
        Object $r24 = $r14.get();
        ResourceDelegate $r6 = (ResourceDelegate) $r24;
        CreateSavingsViewModel $r7 = newInstance($r3, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40617multiply() {
        CreateSavingsViewModel $r1 = multiply();
        return $r1;
    }
}

package ai.kudi.agent.settings.insurance.presentation;

import ai.kudi.agent.core.util.ResourceDelegate;
import ai.kudi.agent.settings.insurance.domain.DeactivateInsuranceUseCase;
import ai.kudi.agent.settings.insurance.domain.GetInsuranceDetailsUseCase;
import ai.kudi.agent.settings.insurance.navigator.CashInsuranceFragmentNavigator;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class CashInsuranceViewModel_Factory implements InterfaceC9468d<CashInsuranceViewModel> {
    private final InterfaceC11700a<CashInsuranceFragmentNavigator> cashInsuranceFragmentNavigatorProvider;
    private final InterfaceC11700a<DeactivateInsuranceUseCase> deactivateInsuranceUseCaseProvider;
    private final InterfaceC11700a<GetInsuranceDetailsUseCase> getInsuranceUseCaseProvider;
    private final InterfaceC11700a<ResourceDelegate> resourceProvider;

    public CashInsuranceViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        this.deactivateInsuranceUseCaseProvider = interfaceC11700a;
        this.getInsuranceUseCaseProvider = interfaceC11700a2;
        this.resourceProvider = interfaceC11700a3;
        this.cashInsuranceFragmentNavigatorProvider = interfaceC11700a4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CashInsuranceViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        CashInsuranceViewModel_Factory $r4 = new CashInsuranceViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CashInsuranceViewModel newInstance(DeactivateInsuranceUseCase deactivateInsuranceUseCase, GetInsuranceDetailsUseCase getInsuranceDetailsUseCase, ResourceDelegate resourceDelegate, CashInsuranceFragmentNavigator cashInsuranceFragmentNavigator) {
        CashInsuranceViewModel $r4 = new CashInsuranceViewModel(deactivateInsuranceUseCase, getInsuranceDetailsUseCase, resourceDelegate, cashInsuranceFragmentNavigator);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CashInsuranceViewModel multiply() {
        InterfaceC11700a $r1 = this.deactivateInsuranceUseCaseProvider;
        Object $r2 = $r1.get();
        DeactivateInsuranceUseCase $r3 = (DeactivateInsuranceUseCase) $r2;
        InterfaceC11700a $r12 = this.getInsuranceUseCaseProvider;
        Object $r22 = $r12.get();
        GetInsuranceDetailsUseCase $r4 = (GetInsuranceDetailsUseCase) $r22;
        InterfaceC11700a $r13 = this.resourceProvider;
        Object $r23 = $r13.get();
        ResourceDelegate $r5 = (ResourceDelegate) $r23;
        InterfaceC11700a $r14 = this.cashInsuranceFragmentNavigatorProvider;
        Object $r24 = $r14.get();
        CashInsuranceFragmentNavigator $r6 = (CashInsuranceFragmentNavigator) $r24;
        CashInsuranceViewModel $r7 = newInstance($r3, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40782multiply() {
        CashInsuranceViewModel $r1 = multiply();
        return $r1;
    }
}

package ai.kudi.agent.pos.presentation;

import ai.kudi.agent.core.util.ResourceDelegate;
import ai.kudi.agent.pos.usecases.GetPosRequestsDetailUseCase;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class PosOrderDetailViewModel_Factory implements InterfaceC9468d<PosOrderDetailViewModel> {
    private final InterfaceC11700a<GetPosRequestsDetailUseCase> getPosRequestsDetailUseCaseProvider;
    private final InterfaceC11700a<ResourceDelegate> resourceProvider;

    public PosOrderDetailViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.getPosRequestsDetailUseCaseProvider = interfaceC11700a;
        this.resourceProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PosOrderDetailViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        PosOrderDetailViewModel_Factory $r2 = new PosOrderDetailViewModel_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PosOrderDetailViewModel newInstance(GetPosRequestsDetailUseCase getPosRequestsDetailUseCase, ResourceDelegate resourceDelegate) {
        PosOrderDetailViewModel $r2 = new PosOrderDetailViewModel(getPosRequestsDetailUseCase, resourceDelegate);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PosOrderDetailViewModel multiply() {
        InterfaceC11700a $r1 = this.getPosRequestsDetailUseCaseProvider;
        Object $r2 = $r1.get();
        GetPosRequestsDetailUseCase $r3 = (GetPosRequestsDetailUseCase) $r2;
        InterfaceC11700a $r12 = this.resourceProvider;
        Object $r22 = $r12.get();
        ResourceDelegate $r4 = (ResourceDelegate) $r22;
        PosOrderDetailViewModel $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40032multiply() {
        PosOrderDetailViewModel $r1 = multiply();
        return $r1;
    }
}

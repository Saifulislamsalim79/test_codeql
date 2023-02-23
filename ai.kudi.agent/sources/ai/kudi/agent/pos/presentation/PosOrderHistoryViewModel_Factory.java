package ai.kudi.agent.pos.presentation;

import ai.kudi.agent.core.util.ResourceDelegate;
import ai.kudi.agent.pos.navigators.TerminalRequestNavigator;
import ai.kudi.agent.pos.presentation.mapper.PosOrderDataToUiMapper;
import ai.kudi.agent.pos.usecases.GetPosRequestsHistoryUseCase;
import ai.kudi.agent.transactionhistory.mapper.ServerTimeToTransactionDayMapper;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class PosOrderHistoryViewModel_Factory implements InterfaceC9468d<PosOrderHistoryViewModel> {
    private final InterfaceC11700a<GetPosRequestsHistoryUseCase> getPosRequestsHistoryUseCaseProvider;
    private final InterfaceC11700a<PosOrderDataToUiMapper> posOrderDataToUiMapperProvider;
    private final InterfaceC11700a<ResourceDelegate> resourceProvider;
    private final InterfaceC11700a<ServerTimeToTransactionDayMapper> serverTimeToTransactionDayMapperProvider;
    private final InterfaceC11700a<TerminalRequestNavigator> terminalRequestNavigatorProvider;

    public PosOrderHistoryViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        this.getPosRequestsHistoryUseCaseProvider = interfaceC11700a;
        this.serverTimeToTransactionDayMapperProvider = interfaceC11700a2;
        this.posOrderDataToUiMapperProvider = interfaceC11700a3;
        this.terminalRequestNavigatorProvider = interfaceC11700a4;
        this.resourceProvider = interfaceC11700a5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PosOrderHistoryViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        PosOrderHistoryViewModel_Factory $r5 = new PosOrderHistoryViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PosOrderHistoryViewModel newInstance(GetPosRequestsHistoryUseCase getPosRequestsHistoryUseCase, ServerTimeToTransactionDayMapper serverTimeToTransactionDayMapper, PosOrderDataToUiMapper posOrderDataToUiMapper, TerminalRequestNavigator terminalRequestNavigator, ResourceDelegate resourceDelegate) {
        PosOrderHistoryViewModel $r5 = new PosOrderHistoryViewModel(getPosRequestsHistoryUseCase, serverTimeToTransactionDayMapper, posOrderDataToUiMapper, terminalRequestNavigator, resourceDelegate);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PosOrderHistoryViewModel multiply() {
        InterfaceC11700a $r1 = this.getPosRequestsHistoryUseCaseProvider;
        Object $r2 = $r1.get();
        GetPosRequestsHistoryUseCase $r3 = (GetPosRequestsHistoryUseCase) $r2;
        InterfaceC11700a $r12 = this.serverTimeToTransactionDayMapperProvider;
        Object $r22 = $r12.get();
        ServerTimeToTransactionDayMapper $r4 = (ServerTimeToTransactionDayMapper) $r22;
        InterfaceC11700a $r13 = this.posOrderDataToUiMapperProvider;
        Object $r23 = $r13.get();
        PosOrderDataToUiMapper $r5 = (PosOrderDataToUiMapper) $r23;
        InterfaceC11700a $r14 = this.terminalRequestNavigatorProvider;
        Object $r24 = $r14.get();
        TerminalRequestNavigator $r6 = (TerminalRequestNavigator) $r24;
        InterfaceC11700a $r15 = this.resourceProvider;
        Object $r25 = $r15.get();
        ResourceDelegate $r7 = (ResourceDelegate) $r25;
        PosOrderHistoryViewModel $r8 = newInstance($r3, $r4, $r5, $r6, $r7);
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40035multiply() {
        PosOrderHistoryViewModel $r1 = multiply();
        return $r1;
    }
}

package ai.kudi.agent.pos.p016ui.viewModels;

import ai.kudi.agent.core.util.ResourceDelegate;
import ai.kudi.agent.pos.navigators.TerminalRequestNavigator;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.pos.ui.viewModels.LeasePosAgreementVm_Factory */
/* loaded from: classes.dex */
public final class LeasePosAgreementVm_Factory implements InterfaceC9468d<LeasePosAgreementVm> {
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<ResourceDelegate> resourceProvider;
    private final InterfaceC11700a<TerminalRequestNavigator> terminalRequestNavigatorProvider;

    public LeasePosAgreementVm_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.fetchCurrentUserProvider = interfaceC11700a;
        this.terminalRequestNavigatorProvider = interfaceC11700a2;
        this.resourceProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LeasePosAgreementVm_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        LeasePosAgreementVm_Factory $r3 = new LeasePosAgreementVm_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LeasePosAgreementVm newInstance(FetchCurrentUser fetchCurrentUser, TerminalRequestNavigator terminalRequestNavigator, ResourceDelegate resourceDelegate) {
        LeasePosAgreementVm $r3 = new LeasePosAgreementVm(fetchCurrentUser, terminalRequestNavigator, resourceDelegate);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public LeasePosAgreementVm multiply() {
        InterfaceC11700a $r1 = this.fetchCurrentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.terminalRequestNavigatorProvider;
        Object $r22 = $r12.get();
        TerminalRequestNavigator $r4 = (TerminalRequestNavigator) $r22;
        InterfaceC11700a $r13 = this.resourceProvider;
        Object $r23 = $r13.get();
        ResourceDelegate $r5 = (ResourceDelegate) $r23;
        LeasePosAgreementVm $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40081multiply() {
        LeasePosAgreementVm $r1 = multiply();
        return $r1;
    }
}

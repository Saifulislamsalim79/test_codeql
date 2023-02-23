package ai.kudi.agent.pos.p016ui;

import ai.kudi.agent.pos.p016ui.viewModels.OrderDetailsViewModel;
import ai.kudi.agent.pos.usecases.GetIsSuperAgentOrAggregator;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.pos.ui.OrderDetailsFragment_MembersInjector */
/* loaded from: classes.dex */
public final class OrderDetailsFragment_MembersInjector implements InterfaceC9463a<OrderDetailsFragment> {
    private final InterfaceC11700a<GetIsSuperAgentOrAggregator> getIsSuperAgentOrAggregatorProvider;
    private final InterfaceC11700a<OrderDetailsViewModel> vmProvider;

    public OrderDetailsFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.vmProvider = interfaceC11700a;
        this.getIsSuperAgentOrAggregatorProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        OrderDetailsFragment_MembersInjector $r2 = new OrderDetailsFragment_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectGetIsSuperAgentOrAggregator(OrderDetailsFragment orderDetailsFragment, GetIsSuperAgentOrAggregator getIsSuperAgentOrAggregator) {
        orderDetailsFragment.getIsSuperAgentOrAggregator = getIsSuperAgentOrAggregator;
    }

    public static void injectVm(OrderDetailsFragment orderDetailsFragment, OrderDetailsViewModel orderDetailsViewModel) {
        orderDetailsFragment.srv = orderDetailsViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(OrderDetailsFragment orderDetailsFragment) {
        InterfaceC11700a $r2 = this.vmProvider;
        Object $r3 = $r2.get();
        OrderDetailsViewModel $r4 = (OrderDetailsViewModel) $r3;
        injectVm(orderDetailsFragment, $r4);
        InterfaceC11700a $r22 = this.getIsSuperAgentOrAggregatorProvider;
        Object $r32 = $r22.get();
        GetIsSuperAgentOrAggregator $r5 = (GetIsSuperAgentOrAggregator) $r32;
        injectGetIsSuperAgentOrAggregator(orderDetailsFragment, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        OrderDetailsFragment $r2 = (OrderDetailsFragment) obj;
        injectMembers($r2);
    }
}

package ai.kudi.agent.transfer.presenter;

import ai.kudi.agent.bills.domain.usecases.PerformServiceFeeLookup;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.voucher.cashin.view.MainTransferView;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class TransferToBankCustomerPresenter_Factory implements InterfaceC9468d<TransferToBankCustomerPresenter> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<PerformServiceFeeLookup> feeLookupProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<MainTransferView> mainTransferViewProvider;

    public TransferToBankCustomerPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        this.fetchCurrentUserProvider = interfaceC11700a;
        this.feeLookupProvider = interfaceC11700a2;
        this.analyticsProvider = interfaceC11700a3;
        this.mainTransferViewProvider = interfaceC11700a4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransferToBankCustomerPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        TransferToBankCustomerPresenter_Factory $r4 = new TransferToBankCustomerPresenter_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransferToBankCustomerPresenter newInstance(FetchCurrentUser fetchCurrentUser, PerformServiceFeeLookup performServiceFeeLookup, Analytics analytics, MainTransferView mainTransferView) {
        TransferToBankCustomerPresenter $r4 = new TransferToBankCustomerPresenter(fetchCurrentUser, performServiceFeeLookup, analytics, mainTransferView);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransferToBankCustomerPresenter multiply() {
        InterfaceC11700a $r1 = this.fetchCurrentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.feeLookupProvider;
        Object $r22 = $r12.get();
        PerformServiceFeeLookup $r4 = (PerformServiceFeeLookup) $r22;
        InterfaceC11700a $r13 = this.analyticsProvider;
        Object $r23 = $r13.get();
        Analytics $r5 = (Analytics) $r23;
        InterfaceC11700a $r14 = this.mainTransferViewProvider;
        Object $r24 = $r14.get();
        MainTransferView $r6 = (MainTransferView) $r24;
        TransferToBankCustomerPresenter $r7 = newInstance($r3, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41353multiply() {
        TransferToBankCustomerPresenter $r1 = multiply();
        return $r1;
    }
}

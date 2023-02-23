package ai.kudi.agent.voucher.cashin.presenter;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.voucher.cashin.view.MainTransferView;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class CreateVoucherSenderPresenter_Factory implements InterfaceC9468d<CreateVoucherSenderPresenter> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<MainTransferView> mainTransferViewProvider;

    public CreateVoucherSenderPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.mainTransferViewProvider = interfaceC11700a;
        this.analyticsProvider = interfaceC11700a2;
        this.fetchCurrentUserProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CreateVoucherSenderPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        CreateVoucherSenderPresenter_Factory $r3 = new CreateVoucherSenderPresenter_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CreateVoucherSenderPresenter newInstance(MainTransferView mainTransferView, Analytics analytics, FetchCurrentUser fetchCurrentUser) {
        CreateVoucherSenderPresenter $r3 = new CreateVoucherSenderPresenter(mainTransferView, analytics, fetchCurrentUser);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CreateVoucherSenderPresenter multiply() {
        InterfaceC11700a $r1 = this.mainTransferViewProvider;
        Object $r2 = $r1.get();
        MainTransferView $r3 = (MainTransferView) $r2;
        InterfaceC11700a $r12 = this.analyticsProvider;
        Object $r22 = $r12.get();
        Analytics $r4 = (Analytics) $r22;
        InterfaceC11700a $r13 = this.fetchCurrentUserProvider;
        Object $r23 = $r13.get();
        FetchCurrentUser $r5 = (FetchCurrentUser) $r23;
        CreateVoucherSenderPresenter $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41707multiply() {
        CreateVoucherSenderPresenter $r1 = multiply();
        return $r1;
    }
}

package ai.kudi.agent.voucher.cashin.presenter;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.voucher.cashin.view.MainTransferView;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class CreateVoucherRecipientPresenter_Factory implements InterfaceC9468d<CreateVoucherRecipientPresenter> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<MainTransferView> mainTransferViewProvider;

    public CreateVoucherRecipientPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.mainTransferViewProvider = interfaceC11700a;
        this.analyticsProvider = interfaceC11700a2;
        this.fetchCurrentUserProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CreateVoucherRecipientPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        CreateVoucherRecipientPresenter_Factory $r3 = new CreateVoucherRecipientPresenter_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CreateVoucherRecipientPresenter newInstance(MainTransferView mainTransferView, Analytics analytics, FetchCurrentUser fetchCurrentUser) {
        CreateVoucherRecipientPresenter $r3 = new CreateVoucherRecipientPresenter(mainTransferView, analytics, fetchCurrentUser);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CreateVoucherRecipientPresenter multiply() {
        InterfaceC11700a $r1 = this.mainTransferViewProvider;
        Object $r2 = $r1.get();
        MainTransferView $r3 = (MainTransferView) $r2;
        InterfaceC11700a $r12 = this.analyticsProvider;
        Object $r22 = $r12.get();
        Analytics $r4 = (Analytics) $r22;
        InterfaceC11700a $r13 = this.fetchCurrentUserProvider;
        Object $r23 = $r13.get();
        FetchCurrentUser $r5 = (FetchCurrentUser) $r23;
        CreateVoucherRecipientPresenter $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41701multiply() {
        CreateVoucherRecipientPresenter $r1 = multiply();
        return $r1;
    }
}

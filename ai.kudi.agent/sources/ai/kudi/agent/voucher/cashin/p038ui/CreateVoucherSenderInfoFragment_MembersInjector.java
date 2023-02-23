package ai.kudi.agent.voucher.cashin.p038ui;

import ai.kudi.agent.voucher.cashin.presenter.CreateVoucherSenderPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.voucher.cashin.ui.CreateVoucherSenderInfoFragment_MembersInjector */
/* loaded from: classes.dex */
public final class CreateVoucherSenderInfoFragment_MembersInjector implements InterfaceC9463a<CreateVoucherSenderInfoFragment> {
    private final InterfaceC11700a<CreateVoucherSenderPresenter> thisPresenterProvider;

    public CreateVoucherSenderInfoFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.thisPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        CreateVoucherSenderInfoFragment_MembersInjector $r1 = new CreateVoucherSenderInfoFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectThisPresenter(CreateVoucherSenderInfoFragment createVoucherSenderInfoFragment, CreateVoucherSenderPresenter createVoucherSenderPresenter) {
        createVoucherSenderInfoFragment.thisPresenter = createVoucherSenderPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(CreateVoucherSenderInfoFragment createVoucherSenderInfoFragment) {
        InterfaceC11700a $r3 = this.thisPresenterProvider;
        Object $r2 = $r3.get();
        CreateVoucherSenderPresenter $r4 = (CreateVoucherSenderPresenter) $r2;
        injectThisPresenter(createVoucherSenderInfoFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        CreateVoucherSenderInfoFragment $r2 = (CreateVoucherSenderInfoFragment) obj;
        injectMembers($r2);
    }
}

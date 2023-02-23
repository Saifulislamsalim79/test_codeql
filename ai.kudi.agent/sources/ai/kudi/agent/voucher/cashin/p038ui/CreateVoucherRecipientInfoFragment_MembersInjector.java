package ai.kudi.agent.voucher.cashin.p038ui;

import ai.kudi.agent.voucher.cashin.presenter.CreateVoucherRecipientPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.voucher.cashin.ui.CreateVoucherRecipientInfoFragment_MembersInjector */
/* loaded from: classes.dex */
public final class CreateVoucherRecipientInfoFragment_MembersInjector implements InterfaceC9463a<CreateVoucherRecipientInfoFragment> {
    private final InterfaceC11700a<CreateVoucherRecipientPresenter> thisPresenterProvider;

    public CreateVoucherRecipientInfoFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.thisPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        CreateVoucherRecipientInfoFragment_MembersInjector $r1 = new CreateVoucherRecipientInfoFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectThisPresenter(CreateVoucherRecipientInfoFragment createVoucherRecipientInfoFragment, CreateVoucherRecipientPresenter createVoucherRecipientPresenter) {
        createVoucherRecipientInfoFragment.thisPresenter = createVoucherRecipientPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(CreateVoucherRecipientInfoFragment createVoucherRecipientInfoFragment) {
        InterfaceC11700a $r3 = this.thisPresenterProvider;
        Object $r2 = $r3.get();
        CreateVoucherRecipientPresenter $r4 = (CreateVoucherRecipientPresenter) $r2;
        injectThisPresenter(createVoucherRecipientInfoFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        CreateVoucherRecipientInfoFragment $r2 = (CreateVoucherRecipientInfoFragment) obj;
        injectMembers($r2);
    }
}

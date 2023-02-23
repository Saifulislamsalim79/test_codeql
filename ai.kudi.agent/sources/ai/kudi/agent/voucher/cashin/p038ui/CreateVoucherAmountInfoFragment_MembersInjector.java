package ai.kudi.agent.voucher.cashin.p038ui;

import ai.kudi.agent.voucher.cashin.presenter.CreateVoucherAmountPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.voucher.cashin.ui.CreateVoucherAmountInfoFragment_MembersInjector */
/* loaded from: classes.dex */
public final class CreateVoucherAmountInfoFragment_MembersInjector implements InterfaceC9463a<CreateVoucherAmountInfoFragment> {
    private final InterfaceC11700a<CreateVoucherAmountPresenter> thisPresenterProvider;

    public CreateVoucherAmountInfoFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.thisPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        CreateVoucherAmountInfoFragment_MembersInjector $r1 = new CreateVoucherAmountInfoFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectThisPresenter(CreateVoucherAmountInfoFragment createVoucherAmountInfoFragment, CreateVoucherAmountPresenter createVoucherAmountPresenter) {
        createVoucherAmountInfoFragment.thisPresenter = createVoucherAmountPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(CreateVoucherAmountInfoFragment createVoucherAmountInfoFragment) {
        InterfaceC11700a $r3 = this.thisPresenterProvider;
        Object $r2 = $r3.get();
        CreateVoucherAmountPresenter $r4 = (CreateVoucherAmountPresenter) $r2;
        injectThisPresenter(createVoucherAmountInfoFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        CreateVoucherAmountInfoFragment $r2 = (CreateVoucherAmountInfoFragment) obj;
        injectMembers($r2);
    }
}

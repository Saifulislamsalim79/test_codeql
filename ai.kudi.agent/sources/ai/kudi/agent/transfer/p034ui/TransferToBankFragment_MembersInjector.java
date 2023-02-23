package ai.kudi.agent.transfer.p034ui;

import ai.kudi.agent.transfer.presenter.TransferToBankPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.transfer.ui.TransferToBankFragment_MembersInjector */
/* loaded from: classes.dex */
public final class TransferToBankFragment_MembersInjector implements InterfaceC9463a<TransferToBankFragment> {
    private final InterfaceC11700a<TransferToBankPresenter> thisPresenterProvider;

    public TransferToBankFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.thisPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        TransferToBankFragment_MembersInjector $r1 = new TransferToBankFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectThisPresenter(TransferToBankFragment transferToBankFragment, TransferToBankPresenter transferToBankPresenter) {
        transferToBankFragment.thisPresenter = transferToBankPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(TransferToBankFragment transferToBankFragment) {
        InterfaceC11700a $r3 = this.thisPresenterProvider;
        Object $r2 = $r3.get();
        TransferToBankPresenter $r4 = (TransferToBankPresenter) $r2;
        injectThisPresenter(transferToBankFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        TransferToBankFragment $r2 = (TransferToBankFragment) obj;
        injectMembers($r2);
    }
}

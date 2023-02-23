package ai.kudi.agent.withdrawal.p041ui;

import ai.kudi.agent.withdrawal.presenter.OthersWithdrawalPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.withdrawal.ui.OthersWithdrawalFragment_MembersInjector */
/* loaded from: classes.dex */
public final class OthersWithdrawalFragment_MembersInjector implements InterfaceC9463a<OthersWithdrawalFragment> {
    private final InterfaceC11700a<OthersWithdrawalPresenter> thisPresenterProvider;

    public OthersWithdrawalFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.thisPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        OthersWithdrawalFragment_MembersInjector $r1 = new OthersWithdrawalFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectThisPresenter(OthersWithdrawalFragment othersWithdrawalFragment, OthersWithdrawalPresenter othersWithdrawalPresenter) {
        othersWithdrawalFragment.thisPresenter = othersWithdrawalPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(OthersWithdrawalFragment othersWithdrawalFragment) {
        InterfaceC11700a $r3 = this.thisPresenterProvider;
        Object $r2 = $r3.get();
        OthersWithdrawalPresenter $r4 = (OthersWithdrawalPresenter) $r2;
        injectThisPresenter(othersWithdrawalFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        OthersWithdrawalFragment $r2 = (OthersWithdrawalFragment) obj;
        injectMembers($r2);
    }
}

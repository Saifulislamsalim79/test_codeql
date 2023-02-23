package ai.kudi.agent.kshock.p009ui.views;

import ai.kudi.agent.kshock.presentation.KshockPendingLoansListViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.kshock.ui.views.KshockLoansListFragment_MembersInjector */
/* loaded from: classes.dex */
public final class KshockLoansListFragment_MembersInjector implements InterfaceC9463a<KshockLoansListFragment> {
    private final InterfaceC11700a<KshockPendingLoansListViewModel> kshockPendingLoansListViewModelProvider;

    public KshockLoansListFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.kshockPendingLoansListViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        KshockLoansListFragment_MembersInjector $r1 = new KshockLoansListFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectKshockPendingLoansListViewModel(KshockLoansListFragment kshockLoansListFragment, KshockPendingLoansListViewModel kshockPendingLoansListViewModel) {
        kshockLoansListFragment.kshockPendingLoansListViewModel = kshockPendingLoansListViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(KshockLoansListFragment kshockLoansListFragment) {
        InterfaceC11700a $r3 = this.kshockPendingLoansListViewModelProvider;
        Object $r2 = $r3.get();
        KshockPendingLoansListViewModel $r4 = (KshockPendingLoansListViewModel) $r2;
        injectKshockPendingLoansListViewModel(kshockLoansListFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        KshockLoansListFragment $r2 = (KshockLoansListFragment) obj;
        injectMembers($r2);
    }
}

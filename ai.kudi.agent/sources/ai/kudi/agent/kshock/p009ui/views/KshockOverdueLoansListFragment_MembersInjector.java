package ai.kudi.agent.kshock.p009ui.views;

import ai.kudi.agent.kshock.presentation.KshockPendingLoansListViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.kshock.ui.views.KshockOverdueLoansListFragment_MembersInjector */
/* loaded from: classes.dex */
public final class KshockOverdueLoansListFragment_MembersInjector implements InterfaceC9463a<KshockOverdueLoansListFragment> {
    private final InterfaceC11700a<KshockPendingLoansListViewModel> kshockPendingLoansListViewModelProvider;

    public KshockOverdueLoansListFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.kshockPendingLoansListViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        KshockOverdueLoansListFragment_MembersInjector $r1 = new KshockOverdueLoansListFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectKshockPendingLoansListViewModel(KshockOverdueLoansListFragment kshockOverdueLoansListFragment, KshockPendingLoansListViewModel kshockPendingLoansListViewModel) {
        kshockOverdueLoansListFragment.kshockPendingLoansListViewModel = kshockPendingLoansListViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(KshockOverdueLoansListFragment kshockOverdueLoansListFragment) {
        InterfaceC11700a $r3 = this.kshockPendingLoansListViewModelProvider;
        Object $r2 = $r3.get();
        KshockPendingLoansListViewModel $r4 = (KshockPendingLoansListViewModel) $r2;
        injectKshockPendingLoansListViewModel(kshockOverdueLoansListFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        KshockOverdueLoansListFragment $r2 = (KshockOverdueLoansListFragment) obj;
        injectMembers($r2);
    }
}

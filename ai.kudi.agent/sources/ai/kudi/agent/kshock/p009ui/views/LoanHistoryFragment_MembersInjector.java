package ai.kudi.agent.kshock.p009ui.views;

import androidx.lifecycle.C1556g0;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.kshock.ui.views.LoanHistoryFragment_MembersInjector */
/* loaded from: classes.dex */
public final class LoanHistoryFragment_MembersInjector implements InterfaceC9463a<LoanHistoryFragment> {
    private final InterfaceC11700a<C1556g0.InterfaceC1559b> viewModelFactoryProvider;

    public LoanHistoryFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.viewModelFactoryProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        LoanHistoryFragment_MembersInjector $r1 = new LoanHistoryFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectViewModelFactory(LoanHistoryFragment loanHistoryFragment, C1556g0.InterfaceC1559b interfaceC1559b) {
        loanHistoryFragment.viewModelFactory = interfaceC1559b;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(LoanHistoryFragment loanHistoryFragment) {
        InterfaceC11700a $r3 = this.viewModelFactoryProvider;
        Object $r2 = $r3.get();
        C1556g0.InterfaceC1559b $r4 = (C1556g0.InterfaceC1559b) $r2;
        injectViewModelFactory(loanHistoryFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        LoanHistoryFragment $r2 = (LoanHistoryFragment) obj;
        injectMembers($r2);
    }
}

package ai.kudi.agent.savings.p024ui;

import ai.kudi.agent.savings.viewmodel.GetStartedViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.savings.ui.GetStartedFragment_MembersInjector */
/* loaded from: classes.dex */
public final class GetStartedFragment_MembersInjector implements InterfaceC9463a<GetStartedFragment> {
    private final InterfaceC11700a<GetStartedViewModel> viewModelProvider;

    public GetStartedFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.viewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        GetStartedFragment_MembersInjector $r1 = new GetStartedFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectViewModel(GetStartedFragment getStartedFragment, GetStartedViewModel getStartedViewModel) {
        getStartedFragment.viewModel = getStartedViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(GetStartedFragment getStartedFragment) {
        InterfaceC11700a $r3 = this.viewModelProvider;
        Object $r2 = $r3.get();
        GetStartedViewModel $r4 = (GetStartedViewModel) $r2;
        injectViewModel(getStartedFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        GetStartedFragment $r2 = (GetStartedFragment) obj;
        injectMembers($r2);
    }
}

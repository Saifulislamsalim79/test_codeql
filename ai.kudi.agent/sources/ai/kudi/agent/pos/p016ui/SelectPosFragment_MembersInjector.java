package ai.kudi.agent.pos.p016ui;

import ai.kudi.agent.pos.p016ui.viewModels.SelectPosViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.pos.ui.SelectPosFragment_MembersInjector */
/* loaded from: classes.dex */
public final class SelectPosFragment_MembersInjector implements InterfaceC9463a<SelectPosFragment> {
    private final InterfaceC11700a<SelectPosViewModel> viewModelProvider;

    public SelectPosFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.viewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        SelectPosFragment_MembersInjector $r1 = new SelectPosFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectViewModel(SelectPosFragment selectPosFragment, SelectPosViewModel selectPosViewModel) {
        selectPosFragment.viewModel = selectPosViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(SelectPosFragment selectPosFragment) {
        InterfaceC11700a $r3 = this.viewModelProvider;
        Object $r2 = $r3.get();
        SelectPosViewModel $r4 = (SelectPosViewModel) $r2;
        injectViewModel(selectPosFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        SelectPosFragment $r2 = (SelectPosFragment) obj;
        injectMembers($r2);
    }
}

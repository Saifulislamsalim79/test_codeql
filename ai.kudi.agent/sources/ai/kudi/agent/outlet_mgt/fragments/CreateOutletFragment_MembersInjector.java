package ai.kudi.agent.outlet_mgt.fragments;

import ai.kudi.agent.outlet_mgt.viewmodels.CreateOutletViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class CreateOutletFragment_MembersInjector implements InterfaceC9463a<CreateOutletFragment> {
    private final InterfaceC11700a<CreateOutletViewModel> createOutletViewModelProvider;

    public CreateOutletFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.createOutletViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        CreateOutletFragment_MembersInjector $r1 = new CreateOutletFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectCreateOutletViewModel(CreateOutletFragment createOutletFragment, CreateOutletViewModel createOutletViewModel) {
        createOutletFragment.createOutletViewModel = createOutletViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(CreateOutletFragment createOutletFragment) {
        InterfaceC11700a $r3 = this.createOutletViewModelProvider;
        Object $r2 = $r3.get();
        CreateOutletViewModel $r4 = (CreateOutletViewModel) $r2;
        injectCreateOutletViewModel(createOutletFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        CreateOutletFragment $r2 = (CreateOutletFragment) obj;
        injectMembers($r2);
    }
}

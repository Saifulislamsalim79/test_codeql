package ai.kudi.agent.settings.personal.p027ui;

import ai.kudi.agent.settings.personal.p027ui.viewModels.IdTypesViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.personal.ui.IdtypesFragment_MembersInjector */
/* loaded from: classes.dex */
public final class IdtypesFragment_MembersInjector implements InterfaceC9463a<IdtypesFragment> {
    private final InterfaceC11700a<IdTypesViewModel> idTypesViewModelProvider;

    public IdtypesFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.idTypesViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        IdtypesFragment_MembersInjector $r1 = new IdtypesFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectIdTypesViewModel(IdtypesFragment idtypesFragment, IdTypesViewModel idTypesViewModel) {
        idtypesFragment.idTypesViewModel = idTypesViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(IdtypesFragment idtypesFragment) {
        InterfaceC11700a $r3 = this.idTypesViewModelProvider;
        Object $r2 = $r3.get();
        IdTypesViewModel $r4 = (IdTypesViewModel) $r2;
        injectIdTypesViewModel(idtypesFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        IdtypesFragment $r2 = (IdtypesFragment) obj;
        injectMembers($r2);
    }
}

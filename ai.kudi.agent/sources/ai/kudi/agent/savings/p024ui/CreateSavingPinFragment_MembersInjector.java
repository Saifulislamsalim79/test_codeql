package ai.kudi.agent.savings.p024ui;

import ai.kudi.agent.savings.viewmodel.CreateSavingPinViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.savings.ui.CreateSavingPinFragment_MembersInjector */
/* loaded from: classes.dex */
public final class CreateSavingPinFragment_MembersInjector implements InterfaceC9463a<CreateSavingPinFragment> {
    private final InterfaceC11700a<CreateSavingPinViewModel> viewModelProvider;

    public CreateSavingPinFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.viewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        CreateSavingPinFragment_MembersInjector $r1 = new CreateSavingPinFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectViewModel(CreateSavingPinFragment createSavingPinFragment, CreateSavingPinViewModel createSavingPinViewModel) {
        createSavingPinFragment.viewModel = createSavingPinViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(CreateSavingPinFragment createSavingPinFragment) {
        InterfaceC11700a $r3 = this.viewModelProvider;
        Object $r2 = $r3.get();
        CreateSavingPinViewModel $r4 = (CreateSavingPinViewModel) $r2;
        injectViewModel(createSavingPinFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        CreateSavingPinFragment $r2 = (CreateSavingPinFragment) obj;
        injectMembers($r2);
    }
}

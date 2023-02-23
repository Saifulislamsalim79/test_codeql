package ai.kudi.agent.settings.account.p025ui.fragment;

import ai.kudi.agent.settings.account.p025ui.viewModel.AddBankAccountViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.account.ui.fragment.AddBankAccountFragment_MembersInjector */
/* loaded from: classes.dex */
public final class AddBankAccountFragment_MembersInjector implements InterfaceC9463a<AddBankAccountFragment> {
    private final InterfaceC11700a<AddBankAccountViewModel> addBankAcctViewModelProvider;

    public AddBankAccountFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.addBankAcctViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        AddBankAccountFragment_MembersInjector $r1 = new AddBankAccountFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectAddBankAcctViewModel(AddBankAccountFragment addBankAccountFragment, AddBankAccountViewModel addBankAccountViewModel) {
        addBankAccountFragment.addBankAcctViewModel = addBankAccountViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(AddBankAccountFragment addBankAccountFragment) {
        InterfaceC11700a $r3 = this.addBankAcctViewModelProvider;
        Object $r2 = $r3.get();
        AddBankAccountViewModel $r4 = (AddBankAccountViewModel) $r2;
        injectAddBankAcctViewModel(addBankAccountFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        AddBankAccountFragment $r2 = (AddBankAccountFragment) obj;
        injectMembers($r2);
    }
}

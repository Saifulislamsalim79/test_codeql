package ai.kudi.agent.settings.account.p025ui.fragment;

import ai.kudi.agent.settings.account.p025ui.viewModel.BankAccountViewModel;
import com.google.firebase.remoteconfig.Frame;
import com.google.firebase.remoteconfig.k;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.account.ui.fragment.BankAccountFragment_MembersInjector */
/* loaded from: classes.dex */
public final class BankAccountFragment_MembersInjector implements InterfaceC9463a<BankAccountFragment> {
    private final InterfaceC11700a<k> remoteConfigProvider;
    private final InterfaceC11700a<BankAccountViewModel> screenViewModelProvider;

    public BankAccountFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.screenViewModelProvider = interfaceC11700a;
        this.remoteConfigProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        BankAccountFragment_MembersInjector $r2 = new BankAccountFragment_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectRemoteConfig(BankAccountFragment bankAccountFragment, Frame frame) {
        bankAccountFragment.remoteConfig = frame;
    }

    public static void injectScreenViewModel(BankAccountFragment bankAccountFragment, BankAccountViewModel bankAccountViewModel) {
        bankAccountFragment.screenViewModel = bankAccountViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(BankAccountFragment bankAccountFragment) {
        InterfaceC11700a $r2 = this.screenViewModelProvider;
        Object $r3 = $r2.get();
        BankAccountViewModel $r4 = (BankAccountViewModel) $r3;
        injectScreenViewModel(bankAccountFragment, $r4);
        InterfaceC11700a $r22 = this.remoteConfigProvider;
        Object $r32 = $r22.get();
        Frame $r5 = (Frame) $r32;
        injectRemoteConfig(bankAccountFragment, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        BankAccountFragment $r2 = (BankAccountFragment) obj;
        injectMembers($r2);
    }
}

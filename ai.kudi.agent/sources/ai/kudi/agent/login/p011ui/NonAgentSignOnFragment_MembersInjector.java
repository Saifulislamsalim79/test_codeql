package ai.kudi.agent.login.p011ui;

import ai.kudi.agent.register.p022v2.p023ui.viewModels.PhoneAndBvnViewModel;
import com.google.firebase.remoteconfig.Frame;
import com.google.firebase.remoteconfig.k;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.login.ui.NonAgentSignOnFragment_MembersInjector */
/* loaded from: classes.dex */
public final class NonAgentSignOnFragment_MembersInjector implements InterfaceC9463a<NonAgentSignOnFragment> {
    private final InterfaceC11700a<PhoneAndBvnViewModel> phoneAndBvnViewModelProvider;
    private final InterfaceC11700a<k> remoteConfigProvider;

    public NonAgentSignOnFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.remoteConfigProvider = interfaceC11700a;
        this.phoneAndBvnViewModelProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        NonAgentSignOnFragment_MembersInjector $r2 = new NonAgentSignOnFragment_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectPhoneAndBvnViewModel(NonAgentSignOnFragment nonAgentSignOnFragment, PhoneAndBvnViewModel phoneAndBvnViewModel) {
        nonAgentSignOnFragment.phoneAndBvnViewModel = phoneAndBvnViewModel;
    }

    public static void injectRemoteConfig(NonAgentSignOnFragment nonAgentSignOnFragment, Frame frame) {
        nonAgentSignOnFragment.remoteConfig = frame;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(NonAgentSignOnFragment nonAgentSignOnFragment) {
        InterfaceC11700a $r2 = this.remoteConfigProvider;
        Object $r3 = $r2.get();
        Frame $r4 = (Frame) $r3;
        injectRemoteConfig(nonAgentSignOnFragment, $r4);
        InterfaceC11700a $r22 = this.phoneAndBvnViewModelProvider;
        Object $r32 = $r22.get();
        PhoneAndBvnViewModel $r5 = (PhoneAndBvnViewModel) $r32;
        injectPhoneAndBvnViewModel(nonAgentSignOnFragment, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        NonAgentSignOnFragment $r2 = (NonAgentSignOnFragment) obj;
        injectMembers($r2);
    }
}

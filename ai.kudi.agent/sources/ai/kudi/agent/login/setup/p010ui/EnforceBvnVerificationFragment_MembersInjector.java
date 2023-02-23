package ai.kudi.agent.login.setup.p010ui;

import ai.kudi.agent.login.setup.presenters.EnforceBvnVerificationViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.login.setup.ui.EnforceBvnVerificationFragment_MembersInjector */
/* loaded from: classes.dex */
public final class EnforceBvnVerificationFragment_MembersInjector implements InterfaceC9463a<EnforceBvnVerificationFragment> {
    private final InterfaceC11700a<EnforceBvnVerificationViewModel> viewModelProvider;

    public EnforceBvnVerificationFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.viewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        EnforceBvnVerificationFragment_MembersInjector $r1 = new EnforceBvnVerificationFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectViewModel(EnforceBvnVerificationFragment enforceBvnVerificationFragment, EnforceBvnVerificationViewModel enforceBvnVerificationViewModel) {
        enforceBvnVerificationFragment.viewModel = enforceBvnVerificationViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(EnforceBvnVerificationFragment enforceBvnVerificationFragment) {
        InterfaceC11700a $r3 = this.viewModelProvider;
        Object $r2 = $r3.get();
        EnforceBvnVerificationViewModel $r4 = (EnforceBvnVerificationViewModel) $r2;
        injectViewModel(enforceBvnVerificationFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        EnforceBvnVerificationFragment $r2 = (EnforceBvnVerificationFragment) obj;
        injectMembers($r2);
    }
}

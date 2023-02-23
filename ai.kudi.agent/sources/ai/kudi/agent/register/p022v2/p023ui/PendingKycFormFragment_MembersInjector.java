package ai.kudi.agent.register.p022v2.p023ui;

import ai.kudi.agent.register.p022v2.p023ui.viewModels.PendingKycViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.register.v2.ui.PendingKycFormFragment_MembersInjector */
/* loaded from: classes.dex */
public final class PendingKycFormFragment_MembersInjector implements InterfaceC9463a<PendingKycFormFragment> {
    private final InterfaceC11700a<PendingKycViewModel> pendingKycViewModelProvider;

    public PendingKycFormFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.pendingKycViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        PendingKycFormFragment_MembersInjector $r1 = new PendingKycFormFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectPendingKycViewModel(PendingKycFormFragment pendingKycFormFragment, PendingKycViewModel pendingKycViewModel) {
        pendingKycFormFragment.pendingKycViewModel = pendingKycViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(PendingKycFormFragment pendingKycFormFragment) {
        InterfaceC11700a $r3 = this.pendingKycViewModelProvider;
        Object $r2 = $r3.get();
        PendingKycViewModel $r4 = (PendingKycViewModel) $r2;
        injectPendingKycViewModel(pendingKycFormFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        PendingKycFormFragment $r2 = (PendingKycFormFragment) obj;
        injectMembers($r2);
    }
}

package ai.kudi.agent.p2p.fragments;

import ai.kudi.agent.p2p.viewmodels.P2pNameAndPhoneViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class P2pNameAndPhoneNoFragment_MembersInjector implements InterfaceC9463a<P2pNameAndPhoneNoFragment> {
    private final InterfaceC11700a<P2pNameAndPhoneViewModel> p2pNameAndPhoneViewModelProvider;

    public P2pNameAndPhoneNoFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.p2pNameAndPhoneViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        P2pNameAndPhoneNoFragment_MembersInjector $r1 = new P2pNameAndPhoneNoFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectP2pNameAndPhoneViewModel(P2pNameAndPhoneNoFragment p2pNameAndPhoneNoFragment, P2pNameAndPhoneViewModel p2pNameAndPhoneViewModel) {
        p2pNameAndPhoneNoFragment.p2pNameAndPhoneViewModel = p2pNameAndPhoneViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(P2pNameAndPhoneNoFragment p2pNameAndPhoneNoFragment) {
        InterfaceC11700a $r3 = this.p2pNameAndPhoneViewModelProvider;
        Object $r2 = $r3.get();
        P2pNameAndPhoneViewModel $r4 = (P2pNameAndPhoneViewModel) $r2;
        injectP2pNameAndPhoneViewModel(p2pNameAndPhoneNoFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        P2pNameAndPhoneNoFragment $r2 = (P2pNameAndPhoneNoFragment) obj;
        injectMembers($r2);
    }
}

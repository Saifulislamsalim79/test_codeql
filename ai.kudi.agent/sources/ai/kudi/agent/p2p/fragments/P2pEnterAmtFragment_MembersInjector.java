package ai.kudi.agent.p2p.fragments;

import ai.kudi.agent.common_screens.amount_input.p003ui.fragments.BaseAmountInputFragment_MembersInjector;
import ai.kudi.agent.p2p.viewmodels.P2pEnterAmtViewModel;
import android.content.SharedPreferences;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class P2pEnterAmtFragment_MembersInjector implements InterfaceC9463a<P2pEnterAmtFragment> {
    private final InterfaceC11700a<P2pEnterAmtViewModel> screenViewModelProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;

    public P2pEnterAmtFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.screenViewModelProvider = interfaceC11700a;
        this.sharedPreferencesProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        P2pEnterAmtFragment_MembersInjector $r2 = new P2pEnterAmtFragment_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectSharedPreferences(P2pEnterAmtFragment p2pEnterAmtFragment, SharedPreferences sharedPreferences) {
        p2pEnterAmtFragment.sharedPreferences = sharedPreferences;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(P2pEnterAmtFragment p2pEnterAmtFragment) {
        InterfaceC11700a $r2 = this.screenViewModelProvider;
        Object $r3 = $r2.get();
        P2pEnterAmtViewModel $r4 = (P2pEnterAmtViewModel) $r3;
        BaseAmountInputFragment_MembersInjector.injectScreenViewModel(p2pEnterAmtFragment, $r4);
        InterfaceC11700a $r22 = this.sharedPreferencesProvider;
        Object $r32 = $r22.get();
        SharedPreferences $r5 = (SharedPreferences) $r32;
        injectSharedPreferences(p2pEnterAmtFragment, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        P2pEnterAmtFragment $r2 = (P2pEnterAmtFragment) obj;
        injectMembers($r2);
    }
}

package ai.kudi.agent.kshock.p009ui.views;

import ai.kudi.agent.kshock.presentation.KShockViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.kshock.ui.views.KShockAvailableFragment_MembersInjector */
/* loaded from: classes.dex */
public final class KShockAvailableFragment_MembersInjector implements InterfaceC9463a<KShockAvailableFragment> {
    private final InterfaceC11700a<KShockViewModel> viewModelProvider;

    public KShockAvailableFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.viewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        KShockAvailableFragment_MembersInjector $r1 = new KShockAvailableFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectViewModel(KShockAvailableFragment kShockAvailableFragment, KShockViewModel kShockViewModel) {
        kShockAvailableFragment.viewModel = kShockViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(KShockAvailableFragment kShockAvailableFragment) {
        InterfaceC11700a $r3 = this.viewModelProvider;
        Object $r2 = $r3.get();
        KShockViewModel $r4 = (KShockViewModel) $r2;
        injectViewModel(kShockAvailableFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        KShockAvailableFragment $r2 = (KShockAvailableFragment) obj;
        injectMembers($r2);
    }
}

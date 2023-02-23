package ai.kudi.agent.users.p035ui;

import ai.kudi.agent.users.viewmodels.KCashTopupViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.users.ui.KCashTopupActivity_MembersInjector */
/* loaded from: classes.dex */
public final class KCashTopupActivity_MembersInjector implements InterfaceC9463a<KCashTopupActivity> {
    private final InterfaceC11700a<KCashTopupViewModel> viewModelProvider;

    public KCashTopupActivity_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.viewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        KCashTopupActivity_MembersInjector $r1 = new KCashTopupActivity_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectViewModel(KCashTopupActivity kCashTopupActivity, KCashTopupViewModel kCashTopupViewModel) {
        kCashTopupActivity.viewModel = kCashTopupViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(KCashTopupActivity kCashTopupActivity) {
        InterfaceC11700a $r3 = this.viewModelProvider;
        Object $r2 = $r3.get();
        KCashTopupViewModel $r4 = (KCashTopupViewModel) $r2;
        injectViewModel(kCashTopupActivity, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        KCashTopupActivity $r2 = (KCashTopupActivity) obj;
        injectMembers($r2);
    }
}

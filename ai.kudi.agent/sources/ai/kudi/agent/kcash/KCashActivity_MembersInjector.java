package ai.kudi.agent.kcash;

import ai.kudi.agent.kcash.viewmodels.KCashViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class KCashActivity_MembersInjector implements InterfaceC9463a<KCashActivity> {
    private final InterfaceC11700a<KCashViewModel> vmProvider;

    public KCashActivity_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.vmProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        KCashActivity_MembersInjector $r1 = new KCashActivity_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectVm(KCashActivity kCashActivity, KCashViewModel kCashViewModel) {
        kCashActivity.srv = kCashViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(KCashActivity kCashActivity) {
        InterfaceC11700a $r3 = this.vmProvider;
        Object $r2 = $r3.get();
        KCashViewModel $r4 = (KCashViewModel) $r2;
        injectVm(kCashActivity, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        KCashActivity $r2 = (KCashActivity) obj;
        injectMembers($r2);
    }
}

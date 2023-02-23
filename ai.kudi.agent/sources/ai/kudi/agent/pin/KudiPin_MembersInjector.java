package ai.kudi.agent.pin;

import ai.kudi.agent.pin.viewModel.KudiPinViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class KudiPin_MembersInjector implements InterfaceC9463a<KudiPin> {
    private final InterfaceC11700a<KudiPinViewModel> kudiPinViewModelProvider;

    public KudiPin_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.kudiPinViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        KudiPin_MembersInjector $r1 = new KudiPin_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectKudiPinViewModel(KudiPin kudiPin, KudiPinViewModel kudiPinViewModel) {
        kudiPin.kudiPinViewModel = kudiPinViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(KudiPin kudiPin) {
        InterfaceC11700a $r3 = this.kudiPinViewModelProvider;
        Object $r2 = $r3.get();
        KudiPinViewModel $r4 = (KudiPinViewModel) $r2;
        injectKudiPinViewModel(kudiPin, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        KudiPin $r2 = (KudiPin) obj;
        injectMembers($r2);
    }
}

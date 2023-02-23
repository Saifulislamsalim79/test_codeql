package ai.kudi.agent.withdraw_cash.p040ui.viewmodels.withdrawal_option.mpos;

import ai.kudi.agent.core.util.Pref;
import com.paypad.impl.Paypad;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.mpos.MPosActivationViewModel_Factory */
/* loaded from: classes.dex */
public final class MPosActivationViewModel_Factory implements InterfaceC9468d<MPosActivationViewModel> {
    private final InterfaceC11700a<Paypad> paypadProvider;
    private final InterfaceC11700a<Pref> prefProvider;

    public MPosActivationViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.paypadProvider = interfaceC11700a;
        this.prefProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MPosActivationViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        MPosActivationViewModel_Factory $r2 = new MPosActivationViewModel_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MPosActivationViewModel newInstance(Paypad paypad, Pref pref) {
        MPosActivationViewModel $r2 = new MPosActivationViewModel(paypad, pref);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public MPosActivationViewModel multiply() {
        InterfaceC11700a $r1 = this.paypadProvider;
        Object $r2 = $r1.get();
        Paypad $r3 = (Paypad) $r2;
        InterfaceC11700a $r12 = this.prefProvider;
        Object $r22 = $r12.get();
        Pref $r4 = (Pref) $r22;
        MPosActivationViewModel $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41825multiply() {
        MPosActivationViewModel $r1 = multiply();
        return $r1;
    }
}

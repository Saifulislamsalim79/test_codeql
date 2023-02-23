package ai.kudi.agent.withdraw_cash.p040ui.viewmodels.withdrawal_option.mpos;

import ai.kudi.agent.core.util.Pref;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.mpos.MPosAmountInputViewModel_Factory */
/* loaded from: classes.dex */
public final class MPosAmountInputViewModel_Factory implements InterfaceC9468d<MPosAmountInputViewModel> {
    private final InterfaceC11700a<Pref> prefProvider;

    public MPosAmountInputViewModel_Factory(InterfaceC11700a interfaceC11700a) {
        this.prefProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MPosAmountInputViewModel_Factory create(InterfaceC11700a interfaceC11700a) {
        MPosAmountInputViewModel_Factory $r1 = new MPosAmountInputViewModel_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MPosAmountInputViewModel newInstance(Pref pref) {
        MPosAmountInputViewModel $r1 = new MPosAmountInputViewModel(pref);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public MPosAmountInputViewModel multiply() {
        InterfaceC11700a $r1 = this.prefProvider;
        Object $r2 = $r1.get();
        Pref $r3 = (Pref) $r2;
        MPosAmountInputViewModel $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41826multiply() {
        MPosAmountInputViewModel $r1 = multiply();
        return $r1;
    }
}

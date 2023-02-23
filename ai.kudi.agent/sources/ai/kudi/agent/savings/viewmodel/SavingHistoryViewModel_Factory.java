package ai.kudi.agent.savings.viewmodel;

import ai.kudi.agent.savings.navigator.SavingsNavigator;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class SavingHistoryViewModel_Factory implements InterfaceC9468d<SavingHistoryViewModel> {
    private final InterfaceC11700a<SavingsNavigator> navigatorProvider;

    public SavingHistoryViewModel_Factory(InterfaceC11700a interfaceC11700a) {
        this.navigatorProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SavingHistoryViewModel_Factory create(InterfaceC11700a interfaceC11700a) {
        SavingHistoryViewModel_Factory $r1 = new SavingHistoryViewModel_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SavingHistoryViewModel newInstance(SavingsNavigator savingsNavigator) {
        SavingHistoryViewModel $r1 = new SavingHistoryViewModel(savingsNavigator);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SavingHistoryViewModel multiply() {
        InterfaceC11700a $r1 = this.navigatorProvider;
        Object $r2 = $r1.get();
        SavingsNavigator $r3 = (SavingsNavigator) $r2;
        SavingHistoryViewModel $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40627multiply() {
        SavingHistoryViewModel $r1 = multiply();
        return $r1;
    }
}

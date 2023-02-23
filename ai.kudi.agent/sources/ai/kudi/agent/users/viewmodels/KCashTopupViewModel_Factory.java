package ai.kudi.agent.users.viewmodels;

import ai.kudi.agent.users.domain.usecases.FetchKCash;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class KCashTopupViewModel_Factory implements InterfaceC9468d<KCashTopupViewModel> {
    private final InterfaceC11700a<FetchKCash> fetchKCashProvider;

    public KCashTopupViewModel_Factory(InterfaceC11700a interfaceC11700a) {
        this.fetchKCashProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static KCashTopupViewModel_Factory create(InterfaceC11700a interfaceC11700a) {
        KCashTopupViewModel_Factory $r1 = new KCashTopupViewModel_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static KCashTopupViewModel newInstance(FetchKCash fetchKCash) {
        KCashTopupViewModel $r1 = new KCashTopupViewModel(fetchKCash);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public KCashTopupViewModel multiply() {
        InterfaceC11700a $r1 = this.fetchKCashProvider;
        Object $r2 = $r1.get();
        FetchKCash $r3 = (FetchKCash) $r2;
        KCashTopupViewModel $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41482multiply() {
        KCashTopupViewModel $r1 = multiply();
        return $r1;
    }
}

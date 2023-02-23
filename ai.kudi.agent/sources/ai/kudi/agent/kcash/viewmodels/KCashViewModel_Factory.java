package ai.kudi.agent.kcash.viewmodels;

import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class KCashViewModel_Factory implements InterfaceC9468d<KCashViewModel> {
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;

    public KCashViewModel_Factory(InterfaceC11700a interfaceC11700a) {
        this.fetchCurrentUserProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static KCashViewModel_Factory create(InterfaceC11700a interfaceC11700a) {
        KCashViewModel_Factory $r1 = new KCashViewModel_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static KCashViewModel newInstance(FetchCurrentUser fetchCurrentUser) {
        KCashViewModel $r1 = new KCashViewModel(fetchCurrentUser);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public KCashViewModel multiply() {
        InterfaceC11700a $r1 = this.fetchCurrentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        KCashViewModel $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39562multiply() {
        KCashViewModel $r1 = multiply();
        return $r1;
    }
}

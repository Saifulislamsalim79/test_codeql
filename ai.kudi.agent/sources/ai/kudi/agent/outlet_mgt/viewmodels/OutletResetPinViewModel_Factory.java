package ai.kudi.agent.outlet_mgt.viewmodels;

import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class OutletResetPinViewModel_Factory implements InterfaceC9468d<OutletResetPinViewModel> {
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;

    public OutletResetPinViewModel_Factory(InterfaceC11700a interfaceC11700a) {
        this.fetchCurrentUserProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OutletResetPinViewModel_Factory create(InterfaceC11700a interfaceC11700a) {
        OutletResetPinViewModel_Factory $r1 = new OutletResetPinViewModel_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OutletResetPinViewModel newInstance(FetchCurrentUser fetchCurrentUser) {
        OutletResetPinViewModel $r1 = new OutletResetPinViewModel(fetchCurrentUser);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public OutletResetPinViewModel multiply() {
        InterfaceC11700a $r1 = this.fetchCurrentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        OutletResetPinViewModel $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39953multiply() {
        OutletResetPinViewModel $r1 = multiply();
        return $r1;
    }
}

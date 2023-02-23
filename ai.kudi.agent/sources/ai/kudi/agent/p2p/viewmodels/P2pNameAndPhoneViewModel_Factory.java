package ai.kudi.agent.p2p.viewmodels;

import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.users.domain.usecases.HandleOrPhoneLookUp;
import android.app.Application;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class P2pNameAndPhoneViewModel_Factory implements InterfaceC9468d<P2pNameAndPhoneViewModel> {
    private final InterfaceC11700a<Application> appProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<HandleOrPhoneLookUp> handleOrPhoneLookUpProvider;

    public P2pNameAndPhoneViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.appProvider = interfaceC11700a;
        this.handleOrPhoneLookUpProvider = interfaceC11700a2;
        this.fetchCurrentUserProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static P2pNameAndPhoneViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        P2pNameAndPhoneViewModel_Factory $r3 = new P2pNameAndPhoneViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static P2pNameAndPhoneViewModel newInstance(Application application, HandleOrPhoneLookUp handleOrPhoneLookUp, FetchCurrentUser fetchCurrentUser) {
        P2pNameAndPhoneViewModel $r3 = new P2pNameAndPhoneViewModel(application, handleOrPhoneLookUp, fetchCurrentUser);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public P2pNameAndPhoneViewModel multiply() {
        InterfaceC11700a $r1 = this.appProvider;
        Object $r2 = $r1.get();
        Application $r3 = (Application) $r2;
        InterfaceC11700a $r12 = this.handleOrPhoneLookUpProvider;
        Object $r22 = $r12.get();
        HandleOrPhoneLookUp $r4 = (HandleOrPhoneLookUp) $r22;
        InterfaceC11700a $r13 = this.fetchCurrentUserProvider;
        Object $r23 = $r13.get();
        FetchCurrentUser $r5 = (FetchCurrentUser) $r23;
        P2pNameAndPhoneViewModel $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39999multiply() {
        P2pNameAndPhoneViewModel $r1 = multiply();
        return $r1;
    }
}

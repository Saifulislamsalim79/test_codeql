package ai.kudi.agent.register.verifybvn;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.register.domain.usecases.VerifyBvn;
import ai.kudi.agent.register.navigators.RegisterNavigator;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class VerifyBvnPictureViewModel_Factory implements InterfaceC9468d<VerifyBvnPictureViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<RegisterNavigator> navigatorProvider;
    private final InterfaceC11700a<VerifyBvn> verifyBvnProvider;

    public VerifyBvnPictureViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        this.currentUserProvider = interfaceC11700a;
        this.verifyBvnProvider = interfaceC11700a2;
        this.analyticsProvider = interfaceC11700a3;
        this.navigatorProvider = interfaceC11700a4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static VerifyBvnPictureViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        VerifyBvnPictureViewModel_Factory $r4 = new VerifyBvnPictureViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static VerifyBvnPictureViewModel newInstance(FetchCurrentUser fetchCurrentUser, VerifyBvn verifyBvn, Analytics analytics, RegisterNavigator registerNavigator) {
        VerifyBvnPictureViewModel $r4 = new VerifyBvnPictureViewModel(fetchCurrentUser, verifyBvn, analytics, registerNavigator);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public VerifyBvnPictureViewModel multiply() {
        InterfaceC11700a $r1 = this.currentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.verifyBvnProvider;
        Object $r22 = $r12.get();
        VerifyBvn $r4 = (VerifyBvn) $r22;
        InterfaceC11700a $r13 = this.analyticsProvider;
        Object $r23 = $r13.get();
        Analytics $r5 = (Analytics) $r23;
        InterfaceC11700a $r14 = this.navigatorProvider;
        Object $r24 = $r14.get();
        RegisterNavigator $r6 = (RegisterNavigator) $r24;
        VerifyBvnPictureViewModel $r7 = newInstance($r3, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40503multiply() {
        VerifyBvnPictureViewModel $r1 = multiply();
        return $r1;
    }
}

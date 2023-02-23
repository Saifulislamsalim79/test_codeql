package ai.kudi.agent.register.p022v2.p023ui.viewModels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.register.domain.usecases.VerifyId;
import ai.kudi.agent.register.navigators.PendingKycNavigator;
import ai.kudi.agent.users.domain.usecases.LoginUser;
import android.content.SharedPreferences;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.register.v2.ui.viewModels.PendingKycViewModel_Factory */
/* loaded from: classes.dex */
public final class PendingKycViewModel_Factory implements InterfaceC9468d<PendingKycViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<LoginUser> loginUserProvider;
    private final InterfaceC11700a<PendingKycNavigator> pendingKycNavigatorProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPrefsProvider;
    private final InterfaceC11700a<VerifyId> verifyIdProvider;

    public PendingKycViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        this.verifyIdProvider = interfaceC11700a;
        this.loginUserProvider = interfaceC11700a2;
        this.sharedPrefsProvider = interfaceC11700a3;
        this.pendingKycNavigatorProvider = interfaceC11700a4;
        this.analyticsProvider = interfaceC11700a5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PendingKycViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        PendingKycViewModel_Factory $r5 = new PendingKycViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PendingKycViewModel newInstance(VerifyId verifyId, LoginUser loginUser, SharedPreferences sharedPreferences, PendingKycNavigator pendingKycNavigator, Analytics analytics) {
        PendingKycViewModel $r5 = new PendingKycViewModel(verifyId, loginUser, sharedPreferences, pendingKycNavigator, analytics);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PendingKycViewModel multiply() {
        InterfaceC11700a $r1 = this.verifyIdProvider;
        Object $r2 = $r1.get();
        VerifyId $r3 = (VerifyId) $r2;
        InterfaceC11700a $r12 = this.loginUserProvider;
        Object $r22 = $r12.get();
        LoginUser $r4 = (LoginUser) $r22;
        InterfaceC11700a $r13 = this.sharedPrefsProvider;
        Object $r23 = $r13.get();
        SharedPreferences $r5 = (SharedPreferences) $r23;
        InterfaceC11700a $r14 = this.pendingKycNavigatorProvider;
        Object $r24 = $r14.get();
        PendingKycNavigator $r6 = (PendingKycNavigator) $r24;
        InterfaceC11700a $r15 = this.analyticsProvider;
        Object $r25 = $r15.get();
        Analytics $r7 = (Analytics) $r25;
        PendingKycViewModel $r8 = newInstance($r3, $r4, $r5, $r6, $r7);
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40481multiply() {
        PendingKycViewModel $r1 = multiply();
        return $r1;
    }
}

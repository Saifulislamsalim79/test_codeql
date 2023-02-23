package ai.kudi.agent.kshock.presentation;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.kshock.navigator.KShockNavigator;
import ai.kudi.agent.kshock.usecases.FetchLoanInterest;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import android.app.Application;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class ApplyForLoanViewModel_Factory implements InterfaceC9468d<ApplyForLoanViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<Application> appProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<FetchLoanInterest> fetchLoanInterestProvider;
    private final InterfaceC11700a<KShockNavigator> kShockNavigatorProvider;

    public ApplyForLoanViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        this.kShockNavigatorProvider = interfaceC11700a;
        this.fetchLoanInterestProvider = interfaceC11700a2;
        this.fetchCurrentUserProvider = interfaceC11700a3;
        this.appProvider = interfaceC11700a4;
        this.analyticsProvider = interfaceC11700a5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ApplyForLoanViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        ApplyForLoanViewModel_Factory $r5 = new ApplyForLoanViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ApplyForLoanViewModel newInstance(KShockNavigator kShockNavigator, FetchLoanInterest fetchLoanInterest, FetchCurrentUser fetchCurrentUser, Application application, Analytics analytics) {
        ApplyForLoanViewModel $r5 = new ApplyForLoanViewModel(kShockNavigator, fetchLoanInterest, fetchCurrentUser, application, analytics);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ApplyForLoanViewModel multiply() {
        InterfaceC11700a $r1 = this.kShockNavigatorProvider;
        Object $r2 = $r1.get();
        KShockNavigator $r3 = (KShockNavigator) $r2;
        InterfaceC11700a $r12 = this.fetchLoanInterestProvider;
        Object $r22 = $r12.get();
        FetchLoanInterest $r4 = (FetchLoanInterest) $r22;
        InterfaceC11700a $r13 = this.fetchCurrentUserProvider;
        Object $r23 = $r13.get();
        FetchCurrentUser $r5 = (FetchCurrentUser) $r23;
        InterfaceC11700a $r14 = this.appProvider;
        Object $r24 = $r14.get();
        Application $r6 = (Application) $r24;
        InterfaceC11700a $r15 = this.analyticsProvider;
        Object $r25 = $r15.get();
        Analytics $r7 = (Analytics) $r25;
        ApplyForLoanViewModel $r8 = newInstance($r3, $r4, $r5, $r6, $r7);
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39577multiply() {
        ApplyForLoanViewModel $r1 = multiply();
        return $r1;
    }
}

package ai.kudi.agent.kshock.presentation;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.kshock.navigator.KShockNavigator;
import ai.kudi.agent.kshock.usecases.OtpStatusCheck;
import ai.kudi.agent.kshock.usecases.PerformLoanRequest;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import android.app.Application;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class ApplyForLoanReviewViewModel_Factory implements InterfaceC9468d<ApplyForLoanReviewViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<Application> appProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<KShockNavigator> kShockNavigatorProvider;
    private final InterfaceC11700a<OtpStatusCheck> otpStatusCheckProvider;
    private final InterfaceC11700a<PerformLoanRequest> performLoanRequestProvider;

    public ApplyForLoanReviewViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6) {
        this.kShockNavigatorProvider = interfaceC11700a;
        this.performLoanRequestProvider = interfaceC11700a2;
        this.fetchCurrentUserProvider = interfaceC11700a3;
        this.appProvider = interfaceC11700a4;
        this.analyticsProvider = interfaceC11700a5;
        this.otpStatusCheckProvider = interfaceC11700a6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ApplyForLoanReviewViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6) {
        ApplyForLoanReviewViewModel_Factory $r6 = new ApplyForLoanReviewViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ApplyForLoanReviewViewModel newInstance(KShockNavigator kShockNavigator, PerformLoanRequest performLoanRequest, FetchCurrentUser fetchCurrentUser, Application application, Analytics analytics, OtpStatusCheck otpStatusCheck) {
        ApplyForLoanReviewViewModel $r6 = new ApplyForLoanReviewViewModel(kShockNavigator, performLoanRequest, fetchCurrentUser, application, analytics, otpStatusCheck);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ApplyForLoanReviewViewModel multiply() {
        InterfaceC11700a $r1 = this.kShockNavigatorProvider;
        Object $r2 = $r1.get();
        KShockNavigator $r3 = (KShockNavigator) $r2;
        InterfaceC11700a $r12 = this.performLoanRequestProvider;
        Object $r22 = $r12.get();
        PerformLoanRequest $r4 = (PerformLoanRequest) $r22;
        InterfaceC11700a $r13 = this.fetchCurrentUserProvider;
        Object $r23 = $r13.get();
        FetchCurrentUser $r5 = (FetchCurrentUser) $r23;
        InterfaceC11700a $r14 = this.appProvider;
        Object $r24 = $r14.get();
        Application $r6 = (Application) $r24;
        InterfaceC11700a $r15 = this.analyticsProvider;
        Object $r25 = $r15.get();
        Analytics analytics = (Analytics) $r25;
        InterfaceC11700a $r16 = this.otpStatusCheckProvider;
        Object $r26 = $r16.get();
        ApplyForLoanReviewViewModel $r9 = newInstance($r3, $r4, $r5, $r6, analytics, (OtpStatusCheck) $r26);
        return $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39573multiply() {
        ApplyForLoanReviewViewModel $r1 = multiply();
        return $r1;
    }
}

package ai.kudi.agent.kshock.p009ui.views;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.util.ResourceDelegate;
import ai.kudi.agent.kshock.navigator.KShockNavigator;
import ai.kudi.agent.kshock.usecases.OtpStatusCheck;
import ai.kudi.agent.kshock.usecases.PerformLoanRequest;
import ai.kudi.agent.kshock.usecases.VerifyOtp;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.kshock.ui.views.OtpVerificationViewModel_Factory */
/* loaded from: classes.dex */
public final class OtpVerificationViewModel_Factory implements InterfaceC9468d<OtpVerificationViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<KShockNavigator> kShockNavigatorProvider;
    private final InterfaceC11700a<OtpStatusCheck> otpStatusCheckProvider;
    private final InterfaceC11700a<PerformLoanRequest> performLoanRequestProvider;
    private final InterfaceC11700a<ResourceDelegate> resProvider;
    private final InterfaceC11700a<VerifyOtp> verifyOtpProvider;

    public OtpVerificationViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7) {
        this.verifyOtpProvider = interfaceC11700a;
        this.otpStatusCheckProvider = interfaceC11700a2;
        this.kShockNavigatorProvider = interfaceC11700a3;
        this.performLoanRequestProvider = interfaceC11700a4;
        this.currentUserProvider = interfaceC11700a5;
        this.analyticsProvider = interfaceC11700a6;
        this.resProvider = interfaceC11700a7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OtpVerificationViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7) {
        OtpVerificationViewModel_Factory $r7 = new OtpVerificationViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6, interfaceC11700a7);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OtpVerificationViewModel newInstance(VerifyOtp verifyOtp, OtpStatusCheck otpStatusCheck, KShockNavigator kShockNavigator, PerformLoanRequest performLoanRequest, FetchCurrentUser fetchCurrentUser, Analytics analytics, ResourceDelegate resourceDelegate) {
        OtpVerificationViewModel $r7 = new OtpVerificationViewModel(verifyOtp, otpStatusCheck, kShockNavigator, performLoanRequest, fetchCurrentUser, analytics, resourceDelegate);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public OtpVerificationViewModel multiply() {
        InterfaceC11700a $r1 = this.verifyOtpProvider;
        Object $r2 = $r1.get();
        VerifyOtp $r3 = (VerifyOtp) $r2;
        InterfaceC11700a $r12 = this.otpStatusCheckProvider;
        Object $r22 = $r12.get();
        OtpStatusCheck $r4 = (OtpStatusCheck) $r22;
        InterfaceC11700a $r13 = this.kShockNavigatorProvider;
        Object $r23 = $r13.get();
        KShockNavigator $r5 = (KShockNavigator) $r23;
        InterfaceC11700a $r14 = this.performLoanRequestProvider;
        Object $r24 = $r14.get();
        PerformLoanRequest performLoanRequest = (PerformLoanRequest) $r24;
        InterfaceC11700a $r15 = this.currentUserProvider;
        Object $r25 = $r15.get();
        FetchCurrentUser fetchCurrentUser = (FetchCurrentUser) $r25;
        InterfaceC11700a $r16 = this.analyticsProvider;
        Object $r26 = $r16.get();
        Analytics analytics = (Analytics) $r26;
        InterfaceC11700a $r17 = this.resProvider;
        Object $r27 = $r17.get();
        ResourceDelegate $r9 = (ResourceDelegate) $r27;
        OtpVerificationViewModel $r10 = newInstance($r3, $r4, $r5, performLoanRequest, fetchCurrentUser, analytics, $r9);
        return $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39675multiply() {
        OtpVerificationViewModel $r1 = multiply();
        return $r1;
    }
}

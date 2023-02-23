package ai.kudi.agent.register.p022v2.p023ui.viewModels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.register.domain.usecases.ResendOtp;
import ai.kudi.agent.register.navigators.EmailVerificationNavigator;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.register.v2.ui.viewModels.EmailVerificationViewModel_Factory */
/* loaded from: classes.dex */
public final class EmailVerificationViewModel_Factory implements InterfaceC9468d<EmailVerificationViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<EmailVerificationNavigator> emailVerificationNavigatorProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<ResendOtp> resendOtpProvider;

    public EmailVerificationViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        this.resendOtpProvider = interfaceC11700a;
        this.fetchCurrentUserProvider = interfaceC11700a2;
        this.analyticsProvider = interfaceC11700a3;
        this.emailVerificationNavigatorProvider = interfaceC11700a4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static EmailVerificationViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        EmailVerificationViewModel_Factory $r4 = new EmailVerificationViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static EmailVerificationViewModel newInstance(ResendOtp resendOtp, FetchCurrentUser fetchCurrentUser, Analytics analytics, EmailVerificationNavigator emailVerificationNavigator) {
        EmailVerificationViewModel $r4 = new EmailVerificationViewModel(resendOtp, fetchCurrentUser, analytics, emailVerificationNavigator);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public EmailVerificationViewModel multiply() {
        InterfaceC11700a $r1 = this.resendOtpProvider;
        Object $r2 = $r1.get();
        ResendOtp $r3 = (ResendOtp) $r2;
        InterfaceC11700a $r12 = this.fetchCurrentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        InterfaceC11700a $r13 = this.analyticsProvider;
        Object $r23 = $r13.get();
        Analytics $r5 = (Analytics) $r23;
        InterfaceC11700a $r14 = this.emailVerificationNavigatorProvider;
        Object $r24 = $r14.get();
        EmailVerificationNavigator $r6 = (EmailVerificationNavigator) $r24;
        EmailVerificationViewModel $r7 = newInstance($r3, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40475multiply() {
        EmailVerificationViewModel $r1 = multiply();
        return $r1;
    }
}

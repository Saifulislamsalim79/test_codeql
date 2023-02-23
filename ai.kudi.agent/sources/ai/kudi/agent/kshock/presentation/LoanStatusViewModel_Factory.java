package ai.kudi.agent.kshock.presentation;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.kshock.usecases.CancelLoanRequest;
import ai.kudi.agent.kshock.usecases.PaybackLoan;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class LoanStatusViewModel_Factory implements InterfaceC9468d<LoanStatusViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<CancelLoanRequest> cancelLoanRequestProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<PaybackLoan> paybackLoanProvider;

    public LoanStatusViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        this.fetchCurrentUserProvider = interfaceC11700a;
        this.cancelLoanRequestProvider = interfaceC11700a2;
        this.paybackLoanProvider = interfaceC11700a3;
        this.analyticsProvider = interfaceC11700a4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LoanStatusViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        LoanStatusViewModel_Factory $r4 = new LoanStatusViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LoanStatusViewModel newInstance(FetchCurrentUser fetchCurrentUser, CancelLoanRequest cancelLoanRequest, PaybackLoan paybackLoan, Analytics analytics) {
        LoanStatusViewModel $r4 = new LoanStatusViewModel(fetchCurrentUser, cancelLoanRequest, paybackLoan, analytics);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public LoanStatusViewModel multiply() {
        InterfaceC11700a $r1 = this.fetchCurrentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.cancelLoanRequestProvider;
        Object $r22 = $r12.get();
        CancelLoanRequest $r4 = (CancelLoanRequest) $r22;
        InterfaceC11700a $r13 = this.paybackLoanProvider;
        Object $r23 = $r13.get();
        PaybackLoan $r5 = (PaybackLoan) $r23;
        InterfaceC11700a $r14 = this.analyticsProvider;
        Object $r24 = $r14.get();
        Analytics $r6 = (Analytics) $r24;
        LoanStatusViewModel $r7 = newInstance($r3, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39625multiply() {
        LoanStatusViewModel $r1 = multiply();
        return $r1;
    }
}

package ai.kudi.agent.kshock.presentation;

import ai.kudi.agent.kshock.navigator.KShockNavigator;
import ai.kudi.agent.kshock.usecases.FetchPaginatedLoanHistory;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import android.app.Application;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class LoanHistoryViewModel_Factory implements InterfaceC9468d<LoanHistoryViewModel> {
    private final InterfaceC11700a<Application> appProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<FetchPaginatedLoanHistory> fetchPaginatedLoanHistoryProvider;
    private final InterfaceC11700a<KShockNavigator> kShockNavigatorProvider;

    public LoanHistoryViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        this.appProvider = interfaceC11700a;
        this.fetchPaginatedLoanHistoryProvider = interfaceC11700a2;
        this.fetchCurrentUserProvider = interfaceC11700a3;
        this.kShockNavigatorProvider = interfaceC11700a4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LoanHistoryViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        LoanHistoryViewModel_Factory $r4 = new LoanHistoryViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LoanHistoryViewModel newInstance(Application application, FetchPaginatedLoanHistory fetchPaginatedLoanHistory, FetchCurrentUser fetchCurrentUser, KShockNavigator kShockNavigator) {
        LoanHistoryViewModel $r4 = new LoanHistoryViewModel(application, fetchPaginatedLoanHistory, fetchCurrentUser, kShockNavigator);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public LoanHistoryViewModel multiply() {
        InterfaceC11700a $r1 = this.appProvider;
        Object $r2 = $r1.get();
        Application $r3 = (Application) $r2;
        InterfaceC11700a $r12 = this.fetchPaginatedLoanHistoryProvider;
        Object $r22 = $r12.get();
        FetchPaginatedLoanHistory $r4 = (FetchPaginatedLoanHistory) $r22;
        InterfaceC11700a $r13 = this.fetchCurrentUserProvider;
        Object $r23 = $r13.get();
        FetchCurrentUser $r5 = (FetchCurrentUser) $r23;
        InterfaceC11700a $r14 = this.kShockNavigatorProvider;
        Object $r24 = $r14.get();
        KShockNavigator $r6 = (KShockNavigator) $r24;
        LoanHistoryViewModel $r7 = newInstance($r3, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39616multiply() {
        LoanHistoryViewModel $r1 = multiply();
        return $r1;
    }
}

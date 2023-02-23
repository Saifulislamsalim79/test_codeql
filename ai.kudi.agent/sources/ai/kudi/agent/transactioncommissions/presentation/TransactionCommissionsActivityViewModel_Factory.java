package ai.kudi.agent.transactioncommissions.presentation;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.util.ResourceDelegate;
import ai.kudi.agent.transactioncommissions.domain.LoanProviderUseCase;
import ai.kudi.agent.transactioncommissions.domain.RequestCommissionsCashoutUseCase;
import ai.kudi.agent.transactions.domain.usecases.GetAllWalletsUseCase;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class TransactionCommissionsActivityViewModel_Factory implements InterfaceC9468d<TransactionCommissionsActivityViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<GetAllWalletsUseCase> getAllWalletsUseCaseProvider;
    private final InterfaceC11700a<LoanProviderUseCase> loanProviderUseCaseProvider;
    private final InterfaceC11700a<RequestCommissionsCashoutUseCase> requestCommissionsCashoutUseCaseProvider;
    private final InterfaceC11700a<ResourceDelegate> resourceProvider;

    public TransactionCommissionsActivityViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6) {
        this.resourceProvider = interfaceC11700a;
        this.analyticsProvider = interfaceC11700a2;
        this.currentUserProvider = interfaceC11700a3;
        this.requestCommissionsCashoutUseCaseProvider = interfaceC11700a4;
        this.getAllWalletsUseCaseProvider = interfaceC11700a5;
        this.loanProviderUseCaseProvider = interfaceC11700a6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionCommissionsActivityViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6) {
        TransactionCommissionsActivityViewModel_Factory $r6 = new TransactionCommissionsActivityViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionCommissionsActivityViewModel newInstance(ResourceDelegate resourceDelegate, Analytics analytics, FetchCurrentUser fetchCurrentUser, RequestCommissionsCashoutUseCase requestCommissionsCashoutUseCase, GetAllWalletsUseCase getAllWalletsUseCase, LoanProviderUseCase loanProviderUseCase) {
        TransactionCommissionsActivityViewModel $r6 = new TransactionCommissionsActivityViewModel(resourceDelegate, analytics, fetchCurrentUser, requestCommissionsCashoutUseCase, getAllWalletsUseCase, loanProviderUseCase);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionCommissionsActivityViewModel multiply() {
        InterfaceC11700a $r1 = this.resourceProvider;
        Object $r2 = $r1.get();
        ResourceDelegate $r3 = (ResourceDelegate) $r2;
        InterfaceC11700a $r12 = this.analyticsProvider;
        Object $r22 = $r12.get();
        Analytics $r4 = (Analytics) $r22;
        InterfaceC11700a $r13 = this.currentUserProvider;
        Object $r23 = $r13.get();
        FetchCurrentUser $r5 = (FetchCurrentUser) $r23;
        InterfaceC11700a $r14 = this.requestCommissionsCashoutUseCaseProvider;
        Object $r24 = $r14.get();
        RequestCommissionsCashoutUseCase $r6 = (RequestCommissionsCashoutUseCase) $r24;
        InterfaceC11700a $r15 = this.getAllWalletsUseCaseProvider;
        Object $r25 = $r15.get();
        GetAllWalletsUseCase getAllWalletsUseCase = (GetAllWalletsUseCase) $r25;
        InterfaceC11700a $r16 = this.loanProviderUseCaseProvider;
        Object $r26 = $r16.get();
        TransactionCommissionsActivityViewModel $r9 = newInstance($r3, $r4, $r5, $r6, getAllWalletsUseCase, (LoanProviderUseCase) $r26);
        return $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40968multiply() {
        TransactionCommissionsActivityViewModel $r1 = multiply();
        return $r1;
    }
}

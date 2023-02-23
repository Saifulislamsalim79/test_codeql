package ai.kudi.agent.p036v2.productCollectionSummary.viewModel;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.p036v2.productCollectionSummary.useCases.CollectionTransactionUseCase;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.productCollectionSummary.viewModel.ProductCollectionSummaryViewModel_Factory */
/* loaded from: classes.dex */
public final class ProductCollectionSummaryViewModel_Factory implements InterfaceC9468d<ProductCollectionSummaryViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<CollectionTransactionUseCase> collectionTransactionUseCaseProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;

    public ProductCollectionSummaryViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.collectionTransactionUseCaseProvider = interfaceC11700a;
        this.fetchCurrentUserProvider = interfaceC11700a2;
        this.analyticsProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProductCollectionSummaryViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        ProductCollectionSummaryViewModel_Factory $r3 = new ProductCollectionSummaryViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProductCollectionSummaryViewModel newInstance(CollectionTransactionUseCase collectionTransactionUseCase, FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        ProductCollectionSummaryViewModel $r3 = new ProductCollectionSummaryViewModel(collectionTransactionUseCase, fetchCurrentUser, analytics);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ProductCollectionSummaryViewModel multiply() {
        InterfaceC11700a $r1 = this.collectionTransactionUseCaseProvider;
        Object $r2 = $r1.get();
        CollectionTransactionUseCase $r3 = (CollectionTransactionUseCase) $r2;
        InterfaceC11700a $r12 = this.fetchCurrentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        InterfaceC11700a $r13 = this.analyticsProvider;
        Object $r23 = $r13.get();
        Analytics $r5 = (Analytics) $r23;
        ProductCollectionSummaryViewModel $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41589multiply() {
        ProductCollectionSummaryViewModel $r1 = multiply();
        return $r1;
    }
}

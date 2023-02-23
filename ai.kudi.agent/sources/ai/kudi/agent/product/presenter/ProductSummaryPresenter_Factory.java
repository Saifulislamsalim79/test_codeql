package ai.kudi.agent.product.presenter;

import ai.kudi.agent.bills.domain.usecases.SubmitBillRequest;
import ai.kudi.agent.product.navigators.ProductNavigator;
import ai.kudi.agent.product.other_bills.navigators.BillPaymentNavigator;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class ProductSummaryPresenter_Factory implements InterfaceC9468d<ProductSummaryPresenter> {
    private final InterfaceC11700a<BillPaymentNavigator> billPaymentNavigatorProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<ProductNavigator> navigatorProvider;
    private final InterfaceC11700a<SubmitBillRequest> submitRequestProvider;

    public ProductSummaryPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        this.fetchCurrentUserProvider = interfaceC11700a;
        this.navigatorProvider = interfaceC11700a2;
        this.billPaymentNavigatorProvider = interfaceC11700a3;
        this.submitRequestProvider = interfaceC11700a4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProductSummaryPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        ProductSummaryPresenter_Factory $r4 = new ProductSummaryPresenter_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProductSummaryPresenter newInstance(FetchCurrentUser fetchCurrentUser, ProductNavigator productNavigator, BillPaymentNavigator billPaymentNavigator, SubmitBillRequest submitBillRequest) {
        ProductSummaryPresenter $r4 = new ProductSummaryPresenter(fetchCurrentUser, productNavigator, billPaymentNavigator, submitBillRequest);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ProductSummaryPresenter multiply() {
        InterfaceC11700a $r1 = this.fetchCurrentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.navigatorProvider;
        Object $r22 = $r12.get();
        ProductNavigator $r4 = (ProductNavigator) $r22;
        InterfaceC11700a $r13 = this.billPaymentNavigatorProvider;
        Object $r23 = $r13.get();
        BillPaymentNavigator $r5 = (BillPaymentNavigator) $r23;
        InterfaceC11700a $r14 = this.submitRequestProvider;
        Object $r24 = $r14.get();
        SubmitBillRequest $r6 = (SubmitBillRequest) $r24;
        ProductSummaryPresenter $r7 = newInstance($r3, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40223multiply() {
        ProductSummaryPresenter $r1 = multiply();
        return $r1;
    }
}

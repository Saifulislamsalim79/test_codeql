package ai.kudi.agent.product.other_bills.presenter;

import ai.kudi.agent.bills.data.BillsData;
import ai.kudi.agent.bills.domain.usecases.FeesLookupRequest;
import ai.kudi.agent.bills.domain.usecases.FeesLookupResponse;
import ai.kudi.agent.bills.domain.usecases.PerformServiceFeeLookup;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.product.other_bills.navigators.BillPaymentNavigator;
import ai.kudi.agent.product.other_bills.p018ui.BillPaymentCustomerDetailsFragment;
import ai.kudi.agent.product.other_bills.views.BillPaymentStepTwoView;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: BillPaymentStepTwoPresenter.kt */
@Metadata(m10422d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0012J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m10421d2 = {"Lai/kudi/agent/product/other_bills/presenter/BillPaymentStepTwoPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/product/other_bills/views/BillPaymentStepTwoView;", "feesLookup", "Lai/kudi/agent/bills/domain/usecases/PerformServiceFeeLookup;", "navigator", "Lai/kudi/agent/product/other_bills/navigators/BillPaymentNavigator;", "(Lai/kudi/agent/bills/domain/usecases/PerformServiceFeeLookup;Lai/kudi/agent/product/other_bills/navigators/BillPaymentNavigator;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getFeesLookup", "()Lai/kudi/agent/bills/domain/usecases/PerformServiceFeeLookup;", "getNavigator", "()Lai/kudi/agent/product/other_bills/navigators/BillPaymentNavigator;", "destroy", "", "navigateToSummaryPage", BillPaymentCustomerDetailsFragment.BILLER_PARAM, "Lai/kudi/agent/bills/data/BillsData;", "performFeesLookup", TransactionRequest.TYPE_REQUEST, "validateFields", "", "phoneNumber", "", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class BillPaymentStepTwoPresenter extends C9410b<BillPaymentStepTwoView> {
    private final C11280b compositeDisposable;
    private final PerformServiceFeeLookup feesLookup;
    private final BillPaymentNavigator navigator;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BillPaymentStepTwoPresenter(PerformServiceFeeLookup performServiceFeeLookup, BillPaymentNavigator billPaymentNavigator) {
        Log_OC.getArray(performServiceFeeLookup, "feesLookup");
        Log_OC.getArray(billPaymentNavigator, "navigator");
        this.feesLookup = performServiceFeeLookup;
        this.navigator = billPaymentNavigator;
        C11280b $r3 = new C11280b();
        this.compositeDisposable = $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performFeesLookup$lambda-0  reason: not valid java name */
    public static final void m40188performFeesLookup$lambda0(BillPaymentStepTwoView billPaymentStepTwoView) {
        Log_OC.getArray(billPaymentStepTwoView, "it");
        billPaymentStepTwoView.showLoader();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performFeesLookup$lambda-3  reason: not valid java name */
    public static final void m40189performFeesLookup$lambda3(final BillPaymentStepTwoPresenter billPaymentStepTwoPresenter, final BillsData billsData, final FeesLookupResponse feesLookupResponse) {
        Log_OC.getArray(billPaymentStepTwoPresenter, "this$0");
        Log_OC.getArray(billsData, "$request");
        billPaymentStepTwoPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.product.other_bills.presenter.Settings$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void run(Object obj) {
                BillsData $r1 = BillsData.this;
                BillPaymentStepTwoPresenter $r2 = billPaymentStepTwoPresenter;
                FeesLookupResponse $r3 = feesLookupResponse;
                BillPaymentStepTwoView $r5 = (BillPaymentStepTwoView) obj;
                BillPaymentStepTwoPresenter.m40190performFeesLookup$lambda3$lambda2($r1, $r2, $r3, $r5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performFeesLookup$lambda-3$lambda-2  reason: not valid java name */
    public static final void m40190performFeesLookup$lambda3$lambda2(BillsData billsData, BillPaymentStepTwoPresenter billPaymentStepTwoPresenter, FeesLookupResponse feesLookupResponse, BillPaymentStepTwoView billPaymentStepTwoView) {
        Log_OC.getArray(billsData, "$request");
        Log_OC.getArray(billPaymentStepTwoPresenter, "this$0");
        Log_OC.getArray(billPaymentStepTwoView, "view");
        billPaymentStepTwoView.hideLoader();
        String $r3 = feesLookupResponse.getServiceFee();
        billsData.setServiceFee($r3);
        billPaymentStepTwoPresenter.navigateToSummaryPage(billsData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performFeesLookup$lambda-5  reason: not valid java name */
    public static final void m40191performFeesLookup$lambda5(BillPaymentStepTwoPresenter billPaymentStepTwoPresenter, Throwable th) {
        Log_OC.getArray(billPaymentStepTwoPresenter, "this$0");
        th.printStackTrace();
        Format $r2 = Format.THREAD;
        billPaymentStepTwoPresenter.ifViewAttached($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performFeesLookup$lambda-5$lambda-4  reason: not valid java name */
    public static final void m40192performFeesLookup$lambda5$lambda4(BillPaymentStepTwoView billPaymentStepTwoView) {
        Log_OC.getArray(billPaymentStepTwoView, "view");
        billPaymentStepTwoView.hideLoader();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean validateFields(String str) {
        int $i0 = str.length();
        boolean $z0 = $i0 == 0;
        if ($z0) {
            RuleMemberValidator $r2 = RuleMemberValidator.RULE_VALIDATOR;
            ifViewAttached($r2);
            return false;
        }
        boolean $z02 = StringExtKt.isNigerianPhoneNumber(str);
        if ($z02) {
            return true;
        }
        Permission $r3 = Permission.NONE;
        ifViewAttached($r3);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: validateFields$lambda-6  reason: not valid java name */
    public static final void m40193validateFields$lambda6(BillPaymentStepTwoView billPaymentStepTwoView) {
        Log_OC.getArray(billPaymentStepTwoView, "it");
        billPaymentStepTwoView.showPhoneNumberError("Phone number cannot be blank");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: validateFields$lambda-7  reason: not valid java name */
    public static final void m40194validateFields$lambda7(BillPaymentStepTwoView billPaymentStepTwoView) {
        Log_OC.getArray(billPaymentStepTwoView, "it");
        billPaymentStepTwoView.showPhoneNumberError("Phone number is not valid");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.C9410b, p272h.p364d.p365a.p366c.InterfaceC9413d
    public void destroy() {
        super.destroy();
        C11280b $r1 = this.compositeDisposable;
        $r1.m11212i();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PerformServiceFeeLookup getFeesLookup() {
        PerformServiceFeeLookup r1 = this.feesLookup;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final BillPaymentNavigator getNavigator() {
        BillPaymentNavigator r1 = this.navigator;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToSummaryPage(BillsData billsData) {
        Log_OC.getArray(billsData, BillPaymentCustomerDetailsFragment.BILLER_PARAM);
        BillPaymentNavigator $r2 = this.navigator;
        $r2.toStepThreeView(billsData);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void performFeesLookup(final BillsData billsData) {
        Log_OC.getArray(billsData, TransactionRequest.TYPE_REQUEST);
        String $r3 = billsData.getCustomerPhoneNo();
        boolean $z0 = validateFields($r3);
        if ($z0) {
            Logger $r4 = Logger.logger;
            ifViewAttached($r4);
            PerformServiceFeeLookup $r5 = this.feesLookup;
            String $r32 = billsData.getType();
            String $r6 = billsData.getId();
            FeesLookupRequest $r1 = new FeesLookupRequest($r32, null, $r6, 2, null);
            AbstractC11688p $r7 = $r5.execute($r1);
            FavoritesArrayAdapter $r10 = $r7.e0(new Object() { // from class: ai.kudi.agent.product.other_bills.presenter.FromMatchesFilter
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    BillPaymentStepTwoPresenter $r12 = BillPaymentStepTwoPresenter.this;
                    BillsData $r2 = billsData;
                    FeesLookupResponse $r42 = (FeesLookupResponse) obj;
                    BillPaymentStepTwoPresenter.m40189performFeesLookup$lambda3($r12, $r2, $r42);
                }
            }, new Object() { // from class: ai.kudi.agent.product.other_bills.presenter.Tools$1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    BillPaymentStepTwoPresenter $r12 = BillPaymentStepTwoPresenter.this;
                    Throwable $r33 = (Throwable) obj;
                    BillPaymentStepTwoPresenter.m40191performFeesLookup$lambda5($r12, $r33);
                }
            });
            Log_OC.loadImage($r10, "feesLookup.execute(\n                FeesLookupRequest(\n                    product = request.type,\n                    productId = request.id\n                )\n            ).subscribe(\n                {\n                    ifViewAttached { view ->\n                        view.hideLoader()\n                        val updatedRequest = request.apply {\n                            serviceFee = it.serviceFee\n                        }\n                        navigateToSummaryPage(updatedRequest)\n                    }\n                },\n                {\n                    it.printStackTrace()\n                    ifViewAttached { view ->\n                        view.hideLoader()\n                    }\n                }\n            )");
            C11280b $r11 = this.compositeDisposable;
            RxExtKt.addTo($r10, $r11);
        }
    }
}

package ai.kudi.agent.bills.views;

import ai.kudi.agent.bills.data.Biller;
import ai.kudi.agent.bills.domain.wiki.BillRequest;
import ai.kudi.agent.product.other_bills.p018ui.BillPaymentStepOneFragment;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import p272h.p364d.p365a.p366c.LoginListener;
/* compiled from: ProductView.kt */
@Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0005H&J\b\u0010\u0011\u001a\u00020\u0003H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0005H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H&¨\u0006\u0017"}, m10421d2 = {"Lai/kudi/agent/bills/views/ProductView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "genericErrorMesage", "", MetricTracker.Object.MESSAGE, "", "hideProductsLoader", "openPerformPayment", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/bills/domain/dto/BillRequest;", "setBiller", BillPaymentStepOneFragment.BILLER_PARAM, "Lai/kudi/agent/bills/data/Biller;", "showAmountError", "showLookupFailed", "showLookupResult", "name", "showProductsLoader", "showServiceFee", "fee", "toggleServiceFeeLoading", "visible", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface ProductView extends LoginListener {
    void genericErrorMesage(String str);

    void hideProductsLoader();

    void openPerformPayment(BillRequest billRequest);

    void setBiller(Biller biller);

    void showAmountError(String str);

    void showLookupFailed(String str);

    void showLookupResult(String str);

    void showProductsLoader();

    void showServiceFee(String str);

    void toggleServiceFeeLoading(boolean z);
}

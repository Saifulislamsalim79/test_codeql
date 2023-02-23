package ai.kudi.agent.product.other_bills.views;

import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import p272h.p364d.p365a.p366c.LoginListener;
/* compiled from: BillPaymentStepTwoView.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/product/other_bills/views/BillPaymentStepTwoView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "hideLoader", "", "showLoader", "showPhoneNumberError", MetricTracker.Object.MESSAGE, "", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface BillPaymentStepTwoView extends LoginListener {
    void hideLoader();

    void showLoader();

    void showPhoneNumberError(String str);
}

package ai.kudi.agent.wallettopup.data;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import p272h.p364d.p365a.p366c.LoginListener;
/* compiled from: EnterAmountViewData.kt */
@Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0006H&¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/wallettopup/data/EnterAmountView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "hideLoading", "", "showError", MetricTracker.Object.MESSAGE, "", "showLoading", "useCodeData", TransactionField.AMOUNT, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface EnterAmountView extends LoginListener {
    void hideLoading();

    void showError(String str);

    void showLoading();

    void useCodeData(String str);
}

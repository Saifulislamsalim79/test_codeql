package ai.kudi.agent.mpos.presentation;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import kotlin.Metadata;
/* compiled from: Contract.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m10421d2 = {"Lai/kudi/agent/mpos/presentation/Contract;", "", "MPOSPresenter", "View", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface Contract {

    /* compiled from: Contract.kt */
    @Metadata(m10422d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m10421d2 = {"Lai/kudi/agent/mpos/presentation/Contract$MPOSPresenter;", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface MPOSPresenter {
    }

    /* compiled from: Contract.kt */
    @Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\bH&¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/mpos/presentation/Contract$View;", "", "hideLoading", "", "requestAccountType", "requestActivationCode", "showActivationError", "reason", "", "showInitializationNotCompleted", "showLoading", "updateStatusText", TransactionField.STATUS, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface View {
        void hideLoading();

        void requestAccountType();

        void requestActivationCode();

        void showActivationError(String str);

        void showInitializationNotCompleted();

        void showLoading();

        void updateStatusText(String str);
    }
}

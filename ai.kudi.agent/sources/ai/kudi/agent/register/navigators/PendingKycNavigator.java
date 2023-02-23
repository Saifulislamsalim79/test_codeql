package ai.kudi.agent.register.navigators;

import kotlin.Metadata;
/* compiled from: PendingKycNavigator.kt */
@Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J@\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u0003H&¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/register/navigators/PendingKycNavigator;", "", "navigateToDashboard", "", "walletBalance", "", "isNewUser", "", "isKCashEnabled", "isC2C", "isOutlet", "isHq", "customerType", "", "navigateToFeedBack", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface PendingKycNavigator {
    void navigateToDashboard(double d, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str);

    void navigateToFeedBack();
}

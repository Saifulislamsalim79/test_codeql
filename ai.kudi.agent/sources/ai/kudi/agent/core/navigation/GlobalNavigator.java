package ai.kudi.agent.core.navigation;

import ai.kudi.agent.filter.domain.FilteredDate;
import android.content.Context;
import kotlin.Metadata;
/* compiled from: GlobalNavigator.kt */
@Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0007H&¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/core/navigation/GlobalNavigator;", "", "navigateToInboxActivity", "", "context", "Landroid/content/Context;", "ticketId", "", "navigateToTransactionBreakDownPage", "filteredDate", "Lai/kudi/agent/filter/domain/FilteredDate;", "navigateToTransactionDetailsActivity", "transactionReference", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface GlobalNavigator {
    void navigateToInboxActivity(Context context, String str);

    void navigateToTransactionBreakDownPage(Context context, FilteredDate filteredDate);

    void navigateToTransactionDetailsActivity(Context context, String str);
}

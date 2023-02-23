package ai.kudi.agent.core.navigation;

import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.dashboard.ui.TransactionBreakDownActivity;
import ai.kudi.agent.filter.domain.FilteredDate;
import ai.kudi.agent.inbox.p007ui.InboxActivity;
import ai.kudi.agent.transactions.p032ui.TransactionDetailsActivity;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: GlobalAppNavigator.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/core/navigation/GlobalAppNavigator;", "Lai/kudi/agent/core/navigation/GlobalNavigator;", "()V", "navigateToInboxActivity", "", "context", "Landroid/content/Context;", "ticketId", "", "navigateToTransactionBreakDownPage", "filteredDate", "Lai/kudi/agent/filter/domain/FilteredDate;", "navigateToTransactionDetailsActivity", "transactionReference", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class GlobalAppNavigator implements GlobalNavigator {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.navigation.GlobalNavigator
    public void navigateToInboxActivity(Context context, String str) {
        Log_OC.getArray(context, "context");
        Log_OC.getArray(str, "ticketId");
        Intent $r3 = new Intent(context, InboxActivity.class);
        $r3.putExtra(InboxActivity.LOGGED_TICKET, str);
        context.startActivity($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.navigation.GlobalNavigator
    public void navigateToTransactionBreakDownPage(Context context, FilteredDate filteredDate) {
        Log_OC.getArray(context, "context");
        Log_OC.getArray(filteredDate, "filteredDate");
        Intent $r3 = new Intent(context, TransactionBreakDownActivity.class);
        $r3.putExtra(ai.kudi.agent.dashboard.mods.TransactionBreakDownActivity.FILTERED_DATE_INTENT, filteredDate);
        context.startActivity($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.navigation.GlobalNavigator
    public void navigateToTransactionDetailsActivity(Context context, String str) {
        Log_OC.getArray(context, "context");
        GlobalAppNavigator$navigateToTransactionDetailsActivity$1 $r3 = new GlobalAppNavigator$navigateToTransactionDetailsActivity$1(str);
        ContextExtKt.launchActivity$default(context, false, TransactionDetailsActivity.class, (InterfaceC11767l) $r3, 1, (Object) null);
    }
}

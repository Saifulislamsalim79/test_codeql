package ai.kudi.agent.transactionhistory.data.source;

import java.util.List;
import kotlin.Metadata;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
/* compiled from: TransactionsSummaryLocalSource.kt */
@Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\rH&¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/data/source/TransactionsSummaryLocalSource;", "", "clearOldUserData", "Lio/reactivex/Single;", "", "currentUserId", "", "saveAll", "userId", "transactions", "", "Lai/kudi/agent/transactionhistory/presentation/model/TransactionSummaryItem;", "transactionSummary", "Lio/reactivex/Observable;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface TransactionsSummaryLocalSource {
    AbstractC11696w clearOldUserData(String str);

    void saveAll(String str, List list);

    AbstractC11688p transactionSummary();
}

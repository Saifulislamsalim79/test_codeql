package ai.kudi.agent.transactionhistory.data.source;

import java.util.List;
import kotlin.Metadata;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
/* compiled from: TransactionsLocalSource.kt */
@Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\u0006H&J\u001e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/data/source/TransactionsLocalSource;", "", "clearOldUserData", "Lio/reactivex/Single;", "", "currentUserId", "", "observeTransactions", "Lio/reactivex/Observable;", "", "Lai/kudi/agent/transactionhistory/data/model/TransactionDataModel;", "userId", "saveAll", "transactions", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface TransactionsLocalSource {
    AbstractC11696w clearOldUserData(String str);

    AbstractC11688p observeTransactions(String str);

    void saveAll(String str, List list);
}

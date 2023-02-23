package ai.kudi.agent.core.data.remote;

import ai.kudi.agent.bills.domain.usecases.LookupRequest;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.users.domain.package_1.AccountLookupRequest;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import p425j.p444e.AbstractC11688p;
/* compiled from: CoreApiService.kt */
@Metadata(m10422d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH'J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\r\u001a\u00020\u000eH'J,\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u0012H'J:\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u00062\u0016\b\u0001\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0017H'J$\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00190\u00032\b\b\u0001\u0010\u001c\u001a\u00020\u0006H'¨\u0006\u001d"}, m10421d2 = {"Lai/kudi/agent/core/data/remote/CoreApiService;", "", "attachImage", "Lio/reactivex/Observable;", "Lai/kudi/agent/issues/data/model/Issue;", "sessionId", "", "ticketId", "files", "", "Lokhttp3/MultipartBody$Part;", "lookupAccount", "Lai/kudi/agent/users/domain/dto/AccountLookupResponse;", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/users/domain/dto/AccountLookupRequest;", "lookupBiller", "Lai/kudi/agent/bills/domain/usecases/LookupResponse;", "billerId", "Lai/kudi/agent/bills/domain/usecases/LookupRequest;", "lookupFees", "Lai/kudi/agent/bills/domain/usecases/FeesLookupResponse;", "product", "query", "", "updateReadNotification", "Lretrofit2/Response;", "Lai/kudi/agent/core/network/response/APIResponse;", "Lai/kudi/agent/notification/data/model/NotificationModel;", "notificationId", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface CoreApiService {
    AbstractC11688p attachImage(String str, String str2, List list);

    AbstractC11688p lookupAccount(AccountLookupRequest accountLookupRequest);

    AbstractC11688p lookupBiller(String str, String str2, LookupRequest lookupRequest);

    AbstractC11688p lookupFees(String str, String str2, Map map);

    AbstractC11688p updateReadNotification(String str);
}

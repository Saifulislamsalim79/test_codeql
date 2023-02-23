package ai.kudi.agent.core.network;

import ai.kudi.agent.outlet_mgt.data.CreateOutletRequest;
import ai.kudi.agent.outlet_mgt.data.OutletLinkingRequest;
import ai.kudi.agent.outlet_mgt.data.OutletMgtAcceptDelinerequest;
import ai.kudi.agent.outlet_mgt.data.OutletResetPinRequest;
import ai.kudi.agent.outlet_mgt.data.OutletTopUpRequest;
import ai.kudi.agent.outlet_mgt.data.outlet_info.UpdateOutletInfoRequest;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import java.util.Map;
import kotlin.Metadata;
import p425j.p444e.AbstractC11688p;
/* compiled from: OutletMgtApi.kt */
@Metadata(m10422d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\tH'J(\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\tH'J(\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H'J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\tH'J\u001e\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\tH'JV\u0010\u0016\u001a$\u0012 \u0012\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0018j\u0002`\u00190\u00170\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\t2\u0016\b\u0001\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001bH'J(\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\tH'JF\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00170\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\t2\u0016\b\u0001\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001bH'J(\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\tH'J(\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\tH'J<\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00170\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\u0016\b\u0001\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001bH'J,\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u00032\b\b\u0001\u0010(\u001a\u00020)2\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\tH'J(\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00040\u00032\b\b\u0001\u0010,\u001a\u00020-2\b\b\u0001\u0010\b\u001a\u00020\tH'J2\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00040\u00032\b\b\u0001\u0010\r\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010/\u001a\u000200H'J(\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\tH'J,\u00102\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u00103\u001a\u0002042\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\tH'J(\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\tH'¨\u00066"}, m10421d2 = {"Lai/kudi/agent/core/network/OutletMgtApi;", "", "acceptOrDeclineLinkingRequest", "Lio/reactivex/Observable;", "Lai/kudi/agent/core/network/response/APIResponse;", "Lai/kudi/agent/outlet_mgt/data/OutletMgtAcceptDeclineResponse;", "outletMgtAcceptDelinerequest", "Lai/kudi/agent/outlet_mgt/data/OutletMgtAcceptDelinerequest;", "sessionId", "", "id", "buzzPendingOutlet", "Lai/kudi/agent/outlet_mgt/data/Outlet;", "outletId", "createOutlet", "Lai/kudi/agent/settings/domain/dto/UserProfileResponse;", "createOutletRequest", "Lai/kudi/agent/outlet_mgt/data/CreateOutletRequest;", "fetchOutletDetails", "Lai/kudi/agent/outlet_mgt/data/OutletDetails;", "fetchOutletParent", "Lai/kudi/agent/outlet_mgt/data/OutletParent;", "fetchTransactionHistoryForOutlet", "", "Ljava/util/HashMap;", "Lai/kudi/agent/transactions/domain/dto/Transaction;", "query", "", "fetchTransactionSummaryForOutlet", "Lai/kudi/agent/outlet_mgt/data/OutletTransactionBreakdown;", "fetchWalletHistoryForOutlet", "Lai/kudi/agent/users/data/model/WalletActivityModel;", "getOutletWalletBalance", "Lai/kudi/agent/outlet_mgt/data/OutletWalletBalanceResponse;", "getOutletWallets", "Lai/kudi/agent/users/domain/dto/Wallet;", "getOutletsForHq", "map", "resetOutletPin", "Lai/kudi/agent/outlet_mgt/data/OutletResetPinResponse;", "outletResetPinRequest", "Lai/kudi/agent/outlet_mgt/data/OutletResetPinRequest;", "submitLinkingRequest", "Lai/kudi/agent/outlet_mgt/data/OutletLinkingResponse;", "outletLinkingRequest", "Lai/kudi/agent/outlet_mgt/data/OutletLinkingRequest;", "submitOutletInfo", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/outlet_mgt/data/outlet_info/UpdateOutletInfoRequest;", "suspendOutlet", "topUpOutletWallet", "outletTopUpRequest", "Lai/kudi/agent/outlet_mgt/data/OutletTopUpRequest;", "unsuspendOutlet", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface OutletMgtApi {
    AbstractC11688p acceptOrDeclineLinkingRequest(OutletMgtAcceptDelinerequest outletMgtAcceptDelinerequest, String str, String str2);

    AbstractC11688p buzzPendingOutlet(String str, String str2);

    AbstractC11688p createOutlet(String str, CreateOutletRequest createOutletRequest);

    AbstractC11688p fetchOutletDetails(String str, String str2);

    AbstractC11688p fetchOutletParent(String str);

    AbstractC11688p fetchTransactionHistoryForOutlet(String str, String str2, Map map);

    AbstractC11688p fetchTransactionSummaryForOutlet(String str, String str2);

    AbstractC11688p fetchWalletHistoryForOutlet(String str, String str2, Map map);

    AbstractC11688p getOutletWalletBalance(String str, String str2);

    AbstractC11688p getOutletWallets(String str, String str2);

    AbstractC11688p getOutletsForHq(String str, Map map);

    AbstractC11688p resetOutletPin(OutletResetPinRequest outletResetPinRequest, String str, String str2);

    AbstractC11688p submitLinkingRequest(OutletLinkingRequest outletLinkingRequest, String str);

    AbstractC11688p submitOutletInfo(String str, String str2, UpdateOutletInfoRequest updateOutletInfoRequest);

    AbstractC11688p suspendOutlet(String str, String str2);

    AbstractC11688p topUpOutletWallet(OutletTopUpRequest outletTopUpRequest, String str, String str2);

    AbstractC11688p unsuspendOutlet(String str, String str2);
}

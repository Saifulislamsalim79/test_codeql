package ai.kudi.agent.core.network;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.pos.data.PosRequest;
import ai.kudi.agent.pos.data.PosRequestV2;
import ai.kudi.agent.transactions.domain.dto.SendReceiptsToTerminalRequest;
import ai.kudi.agent.transactions.domain.dto.VerifyTerminalConnectionRequest;
import java.util.HashMap;
import kotlin.Metadata;
import p425j.p444e.AbstractC11688p;
/* compiled from: TerminalApi.kt */
@Metadata(m10422d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J$\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J(\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H'J(\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u0012\u001a\u00020\u0007H'JJ\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072$\b\u0001\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0015j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007`\u0016H'J\u001e\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J(\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u001c\u001a\u00020\u001dH'J(\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010 \u001a\u00020!H'J(\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00040\u00032\b\b\u0001\u0010$\u001a\u00020%2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u001e\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u001e\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J(\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010,\u001a\u00020-H'¨\u0006."}, m10421d2 = {"Lai/kudi/agent/core/network/TerminalApi;", "", "activatePos", "Lio/reactivex/Observable;", "Lai/kudi/agent/core/network/response/APIResponse;", "Lai/kudi/agent/settings/domain/dto/PosActivationData;", "sessionId", "", "terminalId", "checkEligibility", "Lai/kudi/agent/pos/data/LeasePosEligibilityResponse;", "getPosDiscount", "", "Lai/kudi/agent/pos/data/PosDiscount;", "initializeTerminalRequest", "Lai/kudi/agent/transactions/domain/dto/TerminalConnectionResponse;", "posOrderDetail", "Lai/kudi/agent/pos/data/PosOrder;", "orderId", "posRequestHistory", "params", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "posRequestOverview", "Lai/kudi/agent/pos/data/PosRequestsSummaryModel;", "priceLookup", "Lai/kudi/agent/pos/data/PosPriceLookupResponse;", "requestPOS", TransactionBreakDownItemType.DATA, "Lai/kudi/agent/pos/data/PosRequest;", "requestPosV2", "Lai/kudi/agent/pos/data/PosResponse;", "posRequestV2", "Lai/kudi/agent/pos/data/PosRequestV2;", "sendReceiptToTerminal", "Lai/kudi/agent/transactions/domain/dto/TerminalReceiptResponse;", "sendReceiptsToTerminalRequest", "Lai/kudi/agent/transactions/domain/dto/SendReceiptsToTerminalRequest;", "trackPos", "Lretrofit2/Response;", "Lai/kudi/agent/pos/data/TrackPosResponse;", "trackPosRequest", "verifyTerminalRequest", "Lai/kudi/agent/transactions/domain/dto/VerifyTerminalConnectionResponse;", "verifyTerminalConnectionRequest", "Lai/kudi/agent/transactions/domain/dto/VerifyTerminalConnectionRequest;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface TerminalApi {
    AbstractC11688p activatePos(String str, String str2);

    AbstractC11688p checkEligibility(String str);

    AbstractC11688p getPosDiscount(String str);

    AbstractC11688p initializeTerminalRequest(String str, String str2);

    AbstractC11688p posOrderDetail(String str, String str2);

    AbstractC11688p posRequestHistory(String str, HashMap hashMap);

    AbstractC11688p posRequestOverview(String str);

    AbstractC11688p priceLookup(String str);

    AbstractC11688p requestPOS(String str, PosRequest posRequest);

    AbstractC11688p requestPosV2(String str, PosRequestV2 posRequestV2);

    AbstractC11688p sendReceiptToTerminal(SendReceiptsToTerminalRequest sendReceiptsToTerminalRequest, String str);

    AbstractC11688p trackPos(String str);

    AbstractC11688p trackPosRequest(String str);

    AbstractC11688p verifyTerminalRequest(String str, VerifyTerminalConnectionRequest verifyTerminalConnectionRequest);
}

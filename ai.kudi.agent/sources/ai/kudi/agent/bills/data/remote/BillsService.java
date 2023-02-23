package ai.kudi.agent.bills.data.remote;

import ai.kudi.agent.bills.domain.wiki.BillRequest;
import kotlin.Metadata;
import p425j.p444e.AbstractC11688p;
/* compiled from: BillsService.kt */
@Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH'¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/bills/data/remote/BillsService;", "", "createBill", "Lio/reactivex/Observable;", "Lai/kudi/agent/bills/domain/usecases/BillResponse;", "sessionId", "", "billRequest", "Lai/kudi/agent/bills/domain/dto/BillRequest;", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface BillsService {
    AbstractC11688p createBill(String str, BillRequest billRequest);
}

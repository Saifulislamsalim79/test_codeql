package ai.kudi.agent.core.network;

import ai.kudi.agent.transactions.domain.usecases.AssignCustomerToTrxBody;
import ai.kudi.agent.transactions.domain.usecases.Customer;
import kotlin.Metadata;
import p425j.p444e.AbstractC11688p;
/* compiled from: CustomerApi.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\tH'J(\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\u000bH'J(\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0005H'¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/core/network/CustomerApi;", "", "assignCustomerToTransaction", "Lio/reactivex/Observable;", "Lai/kudi/agent/core/network/response/APIResponse;", "", "sessionId", "phoneNumber", "transactionRef", "Lai/kudi/agent/transactions/domain/usecases/AssignCustomerToTrxBody;", "createCustomer", "Lai/kudi/agent/transactions/domain/usecases/Customer;", "customer", "lookupCustomer", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface CustomerApi {
    AbstractC11688p assignCustomerToTransaction(String str, String str2, AssignCustomerToTrxBody assignCustomerToTrxBody);

    AbstractC11688p createCustomer(String str, Customer customer);

    AbstractC11688p lookupCustomer(String str, String str2);
}

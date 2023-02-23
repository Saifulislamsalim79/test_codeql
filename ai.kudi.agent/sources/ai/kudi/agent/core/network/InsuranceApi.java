package ai.kudi.agent.core.network;

import ai.kudi.agent.settings.domain.useCases.InsuranceSignUpRequest;
import ai.kudi.agent.settings.insurance.domain.DeactivateInsuranceRequest;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import kotlin.Metadata;
import p425j.p444e.AbstractC11688p;
/* compiled from: InsuranceApi.kt */
@Metadata(m10422d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J(\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\nH'J(\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\r\u001a\u00020\u000eH'¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/core/network/InsuranceApi;", "", "checkStatus", "Lio/reactivex/Observable;", "Lai/kudi/agent/core/network/response/APIResponse;", "Lai/kudi/agent/settings/insurance/data/InsuranceDetailModel;", "sessionId", "", "deactivateInsurance", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/settings/insurance/domain/DeactivateInsuranceRequest;", "signUpForInsurance", "Lai/kudi/agent/core/domain/room_entities/InsuranceStatusModel;", "body", "Lai/kudi/agent/settings/domain/useCases/InsuranceSignUpRequest;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface InsuranceApi {
    AbstractC11688p checkStatus(String str);

    AbstractC11688p deactivateInsurance(String str, DeactivateInsuranceRequest deactivateInsuranceRequest);

    AbstractC11688p signUpForInsurance(String str, InsuranceSignUpRequest insuranceSignUpRequest);
}

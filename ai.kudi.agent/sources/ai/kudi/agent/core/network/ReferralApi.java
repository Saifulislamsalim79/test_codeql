package ai.kudi.agent.core.network;

import ai.kudi.agent.referral.AgentReferralModel;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import kotlin.Metadata;
import p425j.p444e.AbstractC11688p;
/* compiled from: ReferralApi.kt */
@Metadata(m10422d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0005H'J(\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0005H'J8\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u0007H'J\u001e\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J(\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u0013\u001a\u00020\u0007H'J(\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u0016\u001a\u00020\u0017H'¨\u0006\u0018"}, m10421d2 = {"Lai/kudi/agent/core/network/ReferralApi;", "", "buzzReferredAgent", "Lio/reactivex/Observable;", "Lai/kudi/agent/core/network/response/APIResponse;", "Lai/kudi/agent/referral/AgentReferralModel;", "sessionId", "", "agentReferralModel", "createReferral", "getAllReferrals", "", "page", "", TransactionField.STATUS, "getEarningsSummary", "Lai/kudi/agent/referral/AgentReferralEarnings;", "getSummary", "Lai/kudi/agent/referral/AgentReferralSummary;", "referralId", "withdrawFundsToWallet", "Lai/kudi/agent/referral/AgentWithdrawalResponse;", TransactionField.AMOUNT, "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface ReferralApi {
    AbstractC11688p buzzReferredAgent(String str, AgentReferralModel agentReferralModel);

    AbstractC11688p createReferral(String str, AgentReferralModel agentReferralModel);

    AbstractC11688p getAllReferrals(String str, int i, String str2);

    AbstractC11688p getEarningsSummary(String str);

    AbstractC11688p getSummary(String str, String str2);

    AbstractC11688p withdrawFundsToWallet(String str, double d);
}

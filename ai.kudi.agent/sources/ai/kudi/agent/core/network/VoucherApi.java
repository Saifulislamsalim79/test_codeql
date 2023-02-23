package ai.kudi.agent.core.network;

import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.voucher.cashin.domain.model.VoucherCashInRequest;
import ai.kudi.agent.voucher.cashout.domain.model.VoucherRequest;
import kotlin.Metadata;
import p425j.p444e.AbstractC11688p;
/* compiled from: VoucherApi.kt */
@Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH'J(\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\fH'J(\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\fH'J2\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u0011\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\fH'J(\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\fH'¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/core/network/VoucherApi;", "", "createVoucher", "Lio/reactivex/Observable;", "Lai/kudi/agent/core/network/response/APIResponse;", "", "sessionId", "", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/voucher/cashin/domain/model/VoucherCashInRequest;", "redeemVoucher", "voucher", "Lai/kudi/agent/voucher/cashout/domain/model/VoucherRequest;", "resendOtp", "Lai/kudi/agent/voucher/cashout/domain/model/VoucherVerification;", "validateRecipientPhone", "Lai/kudi/agent/voucher/cashout/domain/model/VoucherResponse;", "otpCode", "verifyVoucher", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface VoucherApi {
    AbstractC11688p createVoucher(String str, VoucherCashInRequest voucherCashInRequest);

    AbstractC11688p redeemVoucher(String str, VoucherRequest voucherRequest);

    AbstractC11688p resendOtp(String str, VoucherRequest voucherRequest);

    AbstractC11688p validateRecipientPhone(String str, String str2, VoucherRequest voucherRequest);

    AbstractC11688p verifyVoucher(String str, VoucherRequest voucherRequest);
}

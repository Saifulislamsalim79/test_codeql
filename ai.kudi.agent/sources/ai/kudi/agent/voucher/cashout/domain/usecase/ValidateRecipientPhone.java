package ai.kudi.agent.voucher.cashout.domain.usecase;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.VoucherApi;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.voucher.cashout.domain.model.VoucherRequest;
import ai.kudi.agent.voucher.cashout.domain.model.VoucherResponse;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p470j0.ClassWriter;
/* compiled from: ValidateRecipientPhone.kt */
@Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/voucher/cashout/domain/usecase/ValidateRecipientPhone;", "", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "(Lai/kudi/agent/core/network/NetworkService;)V", "getNetworkService", "()Lai/kudi/agent/core/network/NetworkService;", "execute", "Lio/reactivex/Observable;", "Lai/kudi/agent/voucher/cashout/domain/model/VoucherResponse;", "sessionId", "", "otpcode", "voucher", "Lai/kudi/agent/voucher/cashout/domain/model/VoucherRequest;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ValidateRecipientPhone {
    private final NetworkService networkService;

    public ValidateRecipientPhone(NetworkService networkService) {
        Log_OC.getArray(networkService, "networkService");
        this.networkService = networkService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final VoucherResponse m41718execute$lambda0(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "it");
        Object $r1 = aPIResponse.data;
        VoucherResponse $r2 = (VoucherResponse) $r1;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(String str, String str2, VoucherRequest voucherRequest) {
        Log_OC.getArray(str, "sessionId");
        Log_OC.getArray(str2, "otpcode");
        Log_OC.getArray(voucherRequest, "voucher");
        NetworkService $r4 = this.networkService;
        VoucherApi $r5 = $r4.getVoucherApi();
        AbstractC11688p $r6 = $r5.validateRecipientPhone(str, str2, voucherRequest);
        Type $r7 = Type.GRIDSET;
        AbstractC11688p $r62 = $r6.m10531O($r7);
        p425j.p444e.Item $r8 = ClassWriter.LogError();
        AbstractC11688p $r63 = $r62.h0($r8);
        p425j.p444e.Item $r82 = ContextUtils.LogError();
        AbstractC11688p $r64 = $r63.R($r82);
        Log_OC.loadImage($r64, "networkService.voucherApi.validateRecipientPhone(sessionId, otpcode, voucher)\n                .map {\n                    it.data\n                }\n                .subscribeOn(Schedulers.io())\n                .observeOn(AndroidSchedulers.mainThread())");
        return $r64;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final NetworkService getNetworkService() {
        NetworkService r1 = this.networkService;
        return r1;
    }
}

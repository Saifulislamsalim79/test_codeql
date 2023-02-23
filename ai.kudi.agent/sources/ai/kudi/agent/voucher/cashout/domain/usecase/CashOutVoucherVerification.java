package ai.kudi.agent.voucher.cashout.domain.usecase;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.VoucherApi;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.voucher.cashout.domain.model.VoucherRequest;
import ai.kudi.agent.voucher.cashout.domain.model.VoucherVerification;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p470j0.ClassWriter;
/* compiled from: CashOutVoucherVerification.kt */
@Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/voucher/cashout/domain/usecase/CashOutVoucherVerification;", "", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "(Lai/kudi/agent/core/network/NetworkService;)V", "getNetworkService", "()Lai/kudi/agent/core/network/NetworkService;", "execute", "Lio/reactivex/Observable;", "Lai/kudi/agent/voucher/cashout/domain/model/VoucherVerification;", "sessionId", "", "voucher", "Lai/kudi/agent/voucher/cashout/domain/model/VoucherRequest;", "isResend", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CashOutVoucherVerification {
    private final NetworkService networkService;

    public CashOutVoucherVerification(NetworkService networkService) {
        Log_OC.getArray(networkService, "networkService");
        this.networkService = networkService;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ AbstractC11688p execute$default(CashOutVoucherVerification cashOutVoucherVerification, String str, VoucherRequest voucherRequest, boolean $z0, int i, Object obj) {
        int $i0 = i & 4;
        if ($i0 != 0) {
            $z0 = false;
        }
        AbstractC11688p $r3 = cashOutVoucherVerification.execute(str, voucherRequest, $z0);
        return $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final VoucherVerification m41713execute$lambda0(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "it");
        Object $r1 = aPIResponse.data;
        VoucherVerification $r2 = (VoucherVerification) $r1;
        return $r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-1  reason: not valid java name */
    public static final VoucherVerification m41714execute$lambda1(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "it");
        Object $r1 = aPIResponse.data;
        VoucherVerification $r2 = (VoucherVerification) $r1;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(String str, VoucherRequest voucherRequest) {
        Log_OC.getArray(str, "sessionId");
        Log_OC.getArray(voucherRequest, "voucher");
        NetworkService $r3 = this.networkService;
        VoucherApi $r4 = $r3.getVoucherApi();
        AbstractC11688p $r5 = $r4.verifyVoucher(str, voucherRequest);
        Item $r6 = Item.f2021k;
        AbstractC11688p $r52 = $r5.m10531O($r6);
        p425j.p444e.Item $r7 = ClassWriter.LogError();
        AbstractC11688p $r53 = $r52.h0($r7);
        p425j.p444e.Item $r72 = ContextUtils.LogError();
        AbstractC11688p $r54 = $r53.R($r72);
        Log_OC.loadImage($r54, "networkService.voucherApi.verifyVoucher(sessionId, voucher)\n                .map {\n                    it.data\n                }\n                .subscribeOn(Schedulers.io())\n                .observeOn(AndroidSchedulers.mainThread())");
        return $r54;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(String str, VoucherRequest voucherRequest, boolean z) {
        Log_OC.getArray(str, "sessionId");
        Log_OC.getArray(voucherRequest, "voucher");
        NetworkService $r3 = this.networkService;
        VoucherApi $r4 = $r3.getVoucherApi();
        AbstractC11688p $r5 = $r4.resendOtp(str, voucherRequest);
        C0737b $r6 = C0737b.f2022e;
        AbstractC11688p $r52 = $r5.m10531O($r6);
        p425j.p444e.Item $r7 = ClassWriter.LogError();
        AbstractC11688p $r53 = $r52.h0($r7);
        p425j.p444e.Item $r72 = ContextUtils.LogError();
        AbstractC11688p $r54 = $r53.R($r72);
        Log_OC.loadImage($r54, "networkService.voucherApi.resendOtp(sessionId, voucher)\n                .map {\n                    it.data\n                }\n                .subscribeOn(Schedulers.io())\n                .observeOn(AndroidSchedulers.mainThread())");
        return $r54;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final NetworkService getNetworkService() {
        NetworkService r1 = this.networkService;
        return r1;
    }
}

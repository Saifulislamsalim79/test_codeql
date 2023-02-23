package ai.kudi.agent.users.domain.usecases;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.OutletMgtApi;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.outlet_mgt.data.OutletWalletBalanceResponse;
import ai.kudi.agent.users.domain.dto.Wallet;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p445b0.p447c.ContextUtils;
/* compiled from: FetchWallet.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/users/domain/usecases/FetchOutletWallet;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "Lai/kudi/agent/users/domain/dto/Wallet;", "Lai/kudi/agent/users/domain/usecases/FetchOutletWalletRequest;", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "(Lai/kudi/agent/core/network/NetworkService;)V", "getNetworkService", "()Lai/kudi/agent/core/network/NetworkService;", "execute", "Lio/reactivex/Observable;", MetricTracker.Object.INPUT, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FetchOutletWallet implements OneInputUseCase<Wallet, FetchOutletWalletRequest> {
    private final NetworkService networkService;

    public FetchOutletWallet(NetworkService networkService) {
        Log_OC.getArray(networkService, "networkService");
        this.networkService = networkService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final ai.kudi.agent.users.domain.package_1.Wallet m41431execute$lambda0(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "it");
        Object $r2 = aPIResponse.data;
        OutletWalletBalanceResponse $r3 = (OutletWalletBalanceResponse) $r2;
        String $r4 = $r3.getId();
        Object $r22 = aPIResponse.data;
        OutletWalletBalanceResponse $r32 = (OutletWalletBalanceResponse) $r22;
        double $d0 = $r32.getAmount();
        Object $r23 = aPIResponse.data;
        OutletWalletBalanceResponse $r33 = (OutletWalletBalanceResponse) $r23;
        int $i0 = $r33.getCreditLimit();
        Object $r24 = aPIResponse.data;
        OutletWalletBalanceResponse $r34 = (OutletWalletBalanceResponse) $r24;
        String $r5 = $r34.getCurrency();
        ai.kudi.agent.users.domain.package_1.Wallet $r1 = new ai.kudi.agent.users.domain.package_1.Wallet($r4, $d0, $i0, $r5);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(FetchOutletWalletRequest fetchOutletWalletRequest) {
        Log_OC.getArray(fetchOutletWalletRequest, MetricTracker.Object.INPUT);
        NetworkService $r2 = this.networkService;
        OutletMgtApi $r3 = $r2.getOutletApi();
        String $r4 = fetchOutletWalletRequest.getSessionId();
        String $r5 = fetchOutletWalletRequest.getOutletId();
        AbstractC11688p $r6 = $r3.getOutletWalletBalance($r4, $r5);
        Item $r7 = Item.f1860k;
        AbstractC11688p $r62 = $r6.m10531O($r7);
        p425j.p444e.Item $r8 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r63 = $r62.h0($r8);
        p425j.p444e.Item $r82 = ContextUtils.LogError();
        AbstractC11688p $r64 = $r63.R($r82);
        Log_OC.loadImage($r64, "networkService.outletApi.getOutletWalletBalance(input.sessionId, input.outletId).map {\n            Wallet(\n                id = it.data.id,\n                amount = it.data.amount,\n                credit_limit = it.data.creditLimit,\n                currency = it.data.currency\n            )\n        }.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())");
        return $r64;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.OneInputUseCase
    public /* bridge */ /* synthetic */ AbstractC11688p execute(Object obj) {
        FetchOutletWalletRequest $r3 = (FetchOutletWalletRequest) obj;
        AbstractC11688p $r1 = execute($r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final NetworkService getNetworkService() {
        NetworkService r1 = this.networkService;
        return r1;
    }
}

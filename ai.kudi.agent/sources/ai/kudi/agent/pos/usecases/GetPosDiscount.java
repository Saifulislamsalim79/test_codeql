package ai.kudi.agent.pos.usecases;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.TerminalApi;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
/* compiled from: GetPosDiscount.kt */
@Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/pos/usecases/GetPosDiscount;", "", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "(Lai/kudi/agent/core/network/NetworkService;Lai/kudi/agent/core/schedulers/RxSchedulers;)V", "execute", "Lio/reactivex/Observable;", "", "Lai/kudi/agent/pos/data/PosDiscount;", "sessionId", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class GetPosDiscount {
    private final NetworkService networkService;
    private final RxSchedulers rxSchedulers;

    public GetPosDiscount(NetworkService networkService, RxSchedulers rxSchedulers) {
        Log_OC.getArray(networkService, "networkService");
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        this.networkService = networkService;
        this.rxSchedulers = rxSchedulers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final List m40117execute$lambda0(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "it");
        Object $r1 = aPIResponse.data;
        List $r2 = (List) $r1;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(String str) {
        Log_OC.getArray(str, "sessionId");
        NetworkService $r2 = this.networkService;
        TerminalApi $r3 = $r2.getTerminalApi();
        AbstractC11688p $r4 = $r3.getPosDiscount(str);
        C0384b $r5 = C0384b.f890e;
        AbstractC11688p $r42 = $r4.m10531O($r5);
        RxSchedulers $r6 = this.rxSchedulers;
        p425j.p444e.Item $r7 = $r6.setSettings();
        AbstractC11688p $r43 = $r42.h0($r7);
        RxSchedulers $r62 = this.rxSchedulers;
        p425j.p444e.Item $r72 = $r62.main();
        AbstractC11688p $r44 = $r43.R($r72);
        Log_OC.loadImage($r44, "networkService.terminalApi.getPosDiscount(sessionId).map {\n            it.data\n        }.subscribeOn(rxSchedulers.io()).observeOn(rxSchedulers.main())");
        return $r44;
    }
}

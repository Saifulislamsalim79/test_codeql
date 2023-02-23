package ai.kudi.agent.kshock.usecases;

import ai.kudi.agent.core.data.DeviceInformation;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.kshock.data.domain.attention.KshockApi;
import ai.kudi.agent.kshock.data.model.Loan;
import ai.kudi.agent.kshock.data.model.LoanRequest;
import ai.kudi.agent.kshock.data.model.LoanResponse;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
/* compiled from: PerformLoanRequest.kt */
@Metadata(m10422d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/kshock/usecases/PerformLoanRequest;", "", "kshockApi", "Lai/kudi/agent/kshock/data/domain/api/KshockApi;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "deviceInformation", "Lai/kudi/agent/core/data/DeviceInformation;", "(Lai/kudi/agent/kshock/data/domain/api/KshockApi;Lai/kudi/agent/core/schedulers/RxSchedulers;Lai/kudi/agent/core/data/DeviceInformation;)V", "execute", "Lio/reactivex/Observable;", "Lai/kudi/agent/kshock/data/model/Loan;", "sessionId", "", "loanRequest", "Lai/kudi/agent/kshock/data/model/LoanRequest;", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PerformLoanRequest {
    private final DeviceInformation deviceInformation;
    private final KshockApi kshockApi;
    private final RxSchedulers rxSchedulers;

    public PerformLoanRequest(KshockApi kshockApi, RxSchedulers rxSchedulers, DeviceInformation deviceInformation) {
        Log_OC.getArray(kshockApi, "kshockApi");
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        Log_OC.getArray(deviceInformation, "deviceInformation");
        this.kshockApi = kshockApi;
        this.rxSchedulers = rxSchedulers;
        this.deviceInformation = deviceInformation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final Loan m39701execute$lambda0(LoanResponse loanResponse) {
        Log_OC.getArray(loanResponse, "it");
        Loan $r0 = loanResponse.getData();
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(String str, LoanRequest loanRequest) {
        Log_OC.getArray(str, "sessionId");
        Log_OC.getArray(loanRequest, "loanRequest");
        KshockApi $r3 = this.kshockApi;
        DeviceInformation $r4 = this.deviceInformation;
        String $r5 = $r4.getDeviceId();
        AbstractC11688p $r6 = $r3.performLoanRequest(str, loanRequest, $r5);
        Type $r7 = Type.RSTRING;
        AbstractC11688p $r62 = $r6.m10531O($r7);
        RxSchedulers $r8 = this.rxSchedulers;
        p425j.p444e.Item $r9 = $r8.setSettings();
        AbstractC11688p $r63 = $r62.h0($r9);
        RxSchedulers $r82 = this.rxSchedulers;
        p425j.p444e.Item $r92 = $r82.main();
        AbstractC11688p $r64 = $r63.R($r92);
        Log_OC.loadImage($r64, "kshockApi.performLoanRequest(\n            sessionId,\n            loanRequest,\n            deviceId = deviceInformation.deviceId\n        ).map {\n            it.data\n        }.subscribeOn(rxSchedulers.io()).observeOn(rxSchedulers.main())");
        return $r64;
    }
}

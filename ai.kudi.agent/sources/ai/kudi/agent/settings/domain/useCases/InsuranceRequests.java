package ai.kudi.agent.settings.domain.useCases;

import ai.kudi.agent.core.domain.room_entities.InsuranceStatusModel;
import ai.kudi.agent.core.network.InsuranceApi;
import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.settings.insurance.data.InsuranceDetailModel;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
/* compiled from: InsuranceRequests.kt */
@Metadata(m10422d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bJ\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/settings/domain/useCases/InsuranceRequests;", "", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "(Lai/kudi/agent/core/network/NetworkService;Lai/kudi/agent/core/schedulers/RxSchedulers;)V", "checkStatus", "Lio/reactivex/Observable;", "Lai/kudi/agent/settings/insurance/data/InsuranceDetailModel;", "sessionId", "", "signUpForInsurance", "Lai/kudi/agent/core/domain/room_entities/InsuranceStatusModel;", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/settings/domain/useCases/InsuranceSignUpRequest;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class InsuranceRequests {
    private final NetworkService networkService;
    private final RxSchedulers rxSchedulers;

    public InsuranceRequests(NetworkService networkService, RxSchedulers rxSchedulers) {
        Log_OC.getArray(networkService, "networkService");
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        this.networkService = networkService;
        this.rxSchedulers = rxSchedulers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: checkStatus$lambda-0  reason: not valid java name */
    public static final InsuranceDetailModel m40755checkStatus$lambda0(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "it");
        Object $r1 = aPIResponse.data;
        InsuranceDetailModel $r2 = (InsuranceDetailModel) $r1;
        return $r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: signUpForInsurance$lambda-1  reason: not valid java name */
    public static final InsuranceStatusModel m40756signUpForInsurance$lambda1(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "it");
        Object $r1 = aPIResponse.data;
        InsuranceStatusModel $r2 = (InsuranceStatusModel) $r1;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p checkStatus(String str) {
        Log_OC.getArray(str, "sessionId");
        NetworkService $r2 = this.networkService;
        InsuranceApi $r3 = $r2.getInsuranceApi();
        AbstractC11688p $r4 = $r3.checkStatus(str);
        C0517c $r5 = C0517c.f1381d;
        AbstractC11688p $r42 = $r4.m10531O($r5);
        RxSchedulers $r6 = this.rxSchedulers;
        p425j.p444e.Item $r7 = $r6.setSettings();
        AbstractC11688p $r43 = $r42.h0($r7);
        RxSchedulers $r62 = this.rxSchedulers;
        p425j.p444e.Item $r72 = $r62.main();
        AbstractC11688p $r44 = $r43.R($r72);
        Log_OC.loadImage($r44, "networkService.insuranceApi.checkStatus(sessionId)\n            .map { it.data }\n            .subscribeOn(rxSchedulers.io())\n            .observeOn(rxSchedulers.main())");
        return $r44;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p signUpForInsurance(String str, InsuranceSignUpRequest insuranceSignUpRequest) {
        Log_OC.getArray(str, "sessionId");
        Log_OC.getArray(insuranceSignUpRequest, TransactionRequest.TYPE_REQUEST);
        NetworkService $r3 = this.networkService;
        InsuranceApi $r4 = $r3.getInsuranceApi();
        AbstractC11688p $r5 = $r4.signUpForInsurance(str, insuranceSignUpRequest);
        Language $r6 = Language.JAPANESE;
        AbstractC11688p $r52 = $r5.m10531O($r6);
        RxSchedulers $r7 = this.rxSchedulers;
        p425j.p444e.Item $r8 = $r7.setSettings();
        AbstractC11688p $r53 = $r52.h0($r8);
        RxSchedulers $r72 = this.rxSchedulers;
        p425j.p444e.Item $r82 = $r72.main();
        AbstractC11688p $r54 = $r53.R($r82);
        Log_OC.loadImage($r54, "networkService.insuranceApi\n            .signUpForInsurance(sessionId, request)\n            .map { it.data }\n            .subscribeOn(rxSchedulers.io())\n            .observeOn(rxSchedulers.main())");
        return $r54;
    }
}

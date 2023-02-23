package ai.kudi.agent.users.domain.usecases;

import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.network.AddNoteCommand;
import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.network.exceptions.MalformedParamException;
import ai.kudi.agent.users.data.model.LookUpUserRequest;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p450e0.Object;
import retrofit2.C14840l;
import retrofit2.HttpException;
/* compiled from: HandleOrPhoneLookUp.kt */
@Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/users/domain/usecases/HandleOrPhoneLookUp;", "", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "(Lai/kudi/agent/core/network/NetworkService;)V", "getNetworkService", "()Lai/kudi/agent/core/network/NetworkService;", "execute", "Lio/reactivex/Observable;", "Lai/kudi/agent/users/data/model/LookUpUserRequest;", "sessionId", "", "handleOrPhone", "throwAppropriateException", "Lio/reactivex/functions/Consumer;", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public class HandleOrPhoneLookUp {
    private final NetworkService networkService;

    public HandleOrPhoneLookUp(NetworkService networkService) {
        Log_OC.getArray(networkService, "networkService");
        this.networkService = networkService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final LookUpUserRequest m41443execute$lambda0(C14840l c14840l) {
        Log_OC.getArray(c14840l, "it");
        try {
            Object $r0 = c14840l.m284a();
            Log_OC.append($r0);
            APIResponse $r2 = (APIResponse) $r0;
            LookUpUserRequest $r3 = (LookUpUserRequest) $r2.data;
            return $r3;
        } catch (Exception $r4) {
            CrashlyticsReport.logException($r4);
            $r4.printStackTrace();
            LookUpUserRequest $r32 = new LookUpUserRequest("", "", "");
            return $r32;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Object throwAppropriateException() {
        Target r1 = Target.NONE;
        return r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: throwAppropriateException$lambda-1  reason: not valid java name */
    public static final void m41444throwAppropriateException$lambda1(Throwable th) {
        boolean $z0 = th instanceof HttpException;
        if ($z0) {
            HttpException $r1 = (HttpException) th;
            int $i0 = $r1.m352a();
            if ($i0 == 400) {
                MalformedParamException $r2 = new MalformedParamException("Something went wrong. Please try again.");
                throw $r2;
            } else if ($i0 != 404) {
            } else {
                MalformedParamException $r22 = new MalformedParamException("Account not found");
                throw $r22;
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(String str, String str2) {
        Log_OC.getArray(str, "sessionId");
        Log_OC.getArray(str2, "handleOrPhone");
        NetworkService $r3 = this.networkService;
        AddNoteCommand $r4 = $r3.getApi();
        AbstractC11688p $r5 = $r4.lookUpUser(str, str2);
        Frame $r6 = Frame.f1859h;
        AbstractC11688p $r52 = $r5.m10531O($r6);
        p425j.p444e.Item $r7 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r53 = $r52.h0($r7);
        Object $r8 = throwAppropriateException();
        AbstractC11688p $r54 = $r53.x($r8);
        p425j.p444e.Item $r72 = ContextUtils.LogError();
        AbstractC11688p $r55 = $r54.R($r72);
        Log_OC.loadImage($r55, "networkService.api.lookUpUser(sessionId, handleOrPhone)\n            .map {\n                try {\n                    it.body()!!.data\n                } catch (exception: Exception) {\n                    CrashlyticsReport.logException(exception)\n                    exception.printStackTrace()\n                    LookUpUserRequest(name = \"\", phone = \"\", username = \"\")\n                }\n            }\n            .subscribeOn(Schedulers.io())\n            .doOnError(throwAppropriateException())\n            .observeOn(AndroidSchedulers.mainThread())");
        return $r55;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final NetworkService getNetworkService() {
        NetworkService r1 = this.networkService;
        return r1;
    }
}

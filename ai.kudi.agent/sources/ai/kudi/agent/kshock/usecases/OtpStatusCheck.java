package ai.kudi.agent.kshock.usecases;

import ai.kudi.agent.core.data.DeviceInformation;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.kshock.data.domain.attention.KshockApi;
import ai.kudi.agent.kshock.data.model.OtpStatus;
import ai.kudi.agent.kshock.data.model.OtpStatusRequest;
import ai.kudi.agent.kshock.data.model.OtpStatusResponse;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: OtpStatusCheck.kt */
@Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/kshock/usecases/OtpStatusCheck;", "", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "deviceInformation", "Lai/kudi/agent/core/data/DeviceInformation;", "kShockApi", "Lai/kudi/agent/kshock/data/domain/api/KshockApi;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/data/DeviceInformation;Lai/kudi/agent/kshock/data/domain/api/KshockApi;Lai/kudi/agent/core/schedulers/RxSchedulers;)V", "isOtpRequired", "Lio/reactivex/Observable;", "", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OtpStatusCheck {
    private final DeviceInformation deviceInformation;
    private final FetchCurrentUser fetchCurrentUser;
    private final KshockApi kShockApi;
    private final RxSchedulers rxSchedulers;

    public OtpStatusCheck(FetchCurrentUser fetchCurrentUser, DeviceInformation deviceInformation, KshockApi kshockApi, RxSchedulers rxSchedulers) {
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(deviceInformation, "deviceInformation");
        Log_OC.getArray(kshockApi, "kShockApi");
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        this.fetchCurrentUser = fetchCurrentUser;
        this.deviceInformation = deviceInformation;
        this.kShockApi = kshockApi;
        this.rxSchedulers = rxSchedulers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: isOtpRequired$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m39694isOtpRequired$lambda0(OtpStatusCheck otpStatusCheck, User user) {
        Log_OC.getArray(otpStatusCheck, "this$0");
        Log_OC.getArray(user, "it");
        KshockApi $r2 = otpStatusCheck.kShockApi;
        String $r3 = user.getSessionId();
        Log_OC.loadImage($r3, "it.sessionId");
        String $r5 = user.getPhoneNumber();
        Log_OC.loadImage($r5, "it.phoneNumber");
        DeviceInformation $r6 = otpStatusCheck.deviceInformation;
        String $r7 = $r6.getDeviceId();
        OtpStatusRequest $r4 = new OtpStatusRequest($r5, $r7);
        AbstractC11688p $r8 = $r2.retrieveOtpStatus($r3, $r4);
        RxSchedulers $r9 = otpStatusCheck.rxSchedulers;
        p425j.p444e.Item $r10 = $r9.setSettings();
        return $r8.h0($r10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: isOtpRequired$lambda-1  reason: not valid java name */
    public static final String m39695isOtpRequired$lambda1(OtpStatusResponse otpStatusResponse) {
        Log_OC.getArray(otpStatusResponse, "it");
        OtpStatus $r1 = otpStatusResponse.getData();
        String $r2 = $r1.getOtpStatusCheckType();
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p isOtpRequired() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        AbstractC11688p $r4 = $r2.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.kshock.usecases.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                OtpStatusCheck $r12 = OtpStatusCheck.this;
                User $r42 = (User) obj;
                InterfaceC11692s $r22 = OtpStatusCheck.m39694isOtpRequired$lambda0($r12, $r42);
                return $r22;
            }
        });
        Quaternion $r5 = Quaternion.f603J;
        AbstractC11688p $r42 = $r4.m10531O($r5);
        RxSchedulers $r6 = this.rxSchedulers;
        p425j.p444e.Item $r7 = $r6.setSettings();
        AbstractC11688p $r43 = $r42.h0($r7);
        RxSchedulers $r62 = this.rxSchedulers;
        p425j.p444e.Item $r72 = $r62.main();
        AbstractC11688p $r44 = $r43.R($r72);
        Log_OC.loadImage($r44, "fetchCurrentUser.execute().flatMapObservable {\n            kShockApi.retrieveOtpStatus(\n                it.sessionId,\n                OtpStatusRequest(it.phoneNumber, deviceInformation.deviceId)\n            ).subscribeOn(rxSchedulers.io())\n        }.map {\n            it.data.otpStatusCheckType\n        }.subscribeOn(rxSchedulers.io()).observeOn(rxSchedulers.main())");
        return $r44;
    }
}

package ai.kudi.agent.settings.domain.useCases;

import ai.kudi.agent.core.network.AddNoteCommand;
import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: RequestPinResetOtp.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m10421d2 = {"Lai/kudi/agent/settings/domain/useCases/RequestPinResetOtp;", "", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/schedulers/RxSchedulers;Lai/kudi/agent/core/network/NetworkService;)V", "getFetchCurrentUser", "()Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "getNetworkService", "()Lai/kudi/agent/core/network/NetworkService;", "getRxSchedulers", "()Lai/kudi/agent/core/schedulers/RxSchedulers;", "requestOtp", "Lio/reactivex/Observable;", "Lai/kudi/agent/settings/domain/dto/RequestPinResetOtpResponse;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class RequestPinResetOtp {
    private final FetchCurrentUser fetchCurrentUser;
    private final NetworkService networkService;
    private final RxSchedulers rxSchedulers;

    public RequestPinResetOtp(FetchCurrentUser fetchCurrentUser, RxSchedulers rxSchedulers, NetworkService networkService) {
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        Log_OC.getArray(networkService, "networkService");
        this.fetchCurrentUser = fetchCurrentUser;
        this.rxSchedulers = rxSchedulers;
        this.networkService = networkService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: requestOtp$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m40759requestOtp$lambda0(RequestPinResetOtp requestPinResetOtp, User user) {
        Log_OC.getArray(requestPinResetOtp, "this$0");
        Log_OC.getArray(user, "it");
        NetworkService $r2 = requestPinResetOtp.getNetworkService();
        AddNoteCommand $r3 = $r2.getApi();
        String $r4 = user.getSessionId();
        Log_OC.loadImage($r4, "it.sessionId");
        AbstractC11688p $r5 = $r3.requestSavingPinOtp($r4);
        RxSchedulers $r6 = requestPinResetOtp.getRxSchedulers();
        p425j.p444e.Item $r7 = $r6.setSettings();
        return $r5.h0($r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FetchCurrentUser getFetchCurrentUser() {
        FetchCurrentUser r1 = this.fetchCurrentUser;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final NetworkService getNetworkService() {
        NetworkService r1 = this.networkService;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final RxSchedulers getRxSchedulers() {
        RxSchedulers r1 = this.rxSchedulers;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p requestOtp() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        AbstractC11688p $r4 = $r2.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.settings.domain.useCases.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                RequestPinResetOtp $r12 = RequestPinResetOtp.this;
                User $r42 = (User) obj;
                InterfaceC11692s $r22 = RequestPinResetOtp.m40759requestOtp$lambda0($r12, $r42);
                return $r22;
            }
        });
        Subscription $r5 = Subscription.subscribed;
        AbstractC11688p $r42 = $r4.m10531O($r5);
        RxSchedulers $r6 = this.rxSchedulers;
        p425j.p444e.Item $r7 = $r6.setSettings();
        AbstractC11688p $r43 = $r42.h0($r7);
        RxSchedulers $r62 = this.rxSchedulers;
        p425j.p444e.Item $r72 = $r62.main();
        AbstractC11688p $r44 = $r43.R($r72);
        Log_OC.loadImage($r44, "fetchCurrentUser.execute().flatMapObservable {\n            networkService.api.requestSavingPinOtp(it.sessionId).subscribeOn(rxSchedulers.io())\n        }.map {\n            it\n        }.subscribeOn(rxSchedulers.io()).observeOn(rxSchedulers.main())");
        return $r44;
    }
}

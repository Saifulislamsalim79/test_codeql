package ai.kudi.agent.settings.domain.useCases;

import ai.kudi.agent.core.network.AddNoteCommand;
import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.savings.data.model.ResendPinRequest;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: ResendOtp.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/settings/domain/useCases/ResendOtp;", "", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/schedulers/RxSchedulers;Lai/kudi/agent/core/network/NetworkService;)V", "resendPin", "Lio/reactivex/Observable;", "Lai/kudi/agent/savings/data/model/RequestPinResetOtpResponse;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ResendOtp {
    private final FetchCurrentUser fetchCurrentUser;
    private final NetworkService networkService;
    private final RxSchedulers rxSchedulers;

    public ResendOtp(FetchCurrentUser fetchCurrentUser, RxSchedulers rxSchedulers, NetworkService networkService) {
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
    /* renamed from: resendPin$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m40762resendPin$lambda0(ResendOtp resendOtp, User user) {
        Log_OC.getArray(resendOtp, "this$0");
        Log_OC.getArray(user, "it");
        NetworkService $r2 = resendOtp.networkService;
        AddNoteCommand $r3 = $r2.getApi();
        String $r4 = user.getSessionId();
        Log_OC.loadImage($r4, "it.sessionId");
        String $r6 = user.getPhoneNumber();
        Log_OC.loadImage($r6, "it.phoneNumber");
        ResendPinRequest $r5 = new ResendPinRequest($r6);
        AbstractC11688p $r7 = $r3.resendOtp($r4, $r5);
        RxSchedulers $r8 = resendOtp.rxSchedulers;
        p425j.p444e.Item $r9 = $r8.setSettings();
        return $r7.h0($r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p resendPin() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        AbstractC11688p $r4 = $r2.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.settings.domain.useCases.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                ResendOtp $r12 = ResendOtp.this;
                User $r42 = (User) obj;
                InterfaceC11692s $r22 = ResendOtp.m40762resendPin$lambda0($r12, $r42);
                return $r22;
            }
        });
        C0519k $r5 = C0519k.f1383a;
        AbstractC11688p $r42 = $r4.m10531O($r5);
        RxSchedulers $r6 = this.rxSchedulers;
        p425j.p444e.Item $r7 = $r6.setSettings();
        AbstractC11688p $r43 = $r42.h0($r7);
        RxSchedulers $r62 = this.rxSchedulers;
        p425j.p444e.Item $r72 = $r62.main();
        AbstractC11688p $r44 = $r43.R($r72);
        Log_OC.loadImage($r44, "fetchCurrentUser.execute().flatMapObservable {\n            networkService.api.resendOtp(it.sessionId, ResendPinRequest(it.phoneNumber))\n                .subscribeOn(rxSchedulers.io())\n        }.map {\n            it\n        }.subscribeOn(rxSchedulers.io()).observeOn(rxSchedulers.main())");
        return $r44;
    }
}

package ai.kudi.agent.kshock.usecases;

import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.kshock.data.domain.attention.KshockApi;
import ai.kudi.agent.kshock.data.model.VerifyOtpRequest;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: VerifyOtp.kt */
@Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/kshock/usecases/VerifyOtp;", "", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "kShockApi", "Lai/kudi/agent/kshock/data/domain/api/KshockApi;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/kshock/data/domain/api/KshockApi;Lai/kudi/agent/core/schedulers/RxSchedulers;)V", "confirmToken", "Lio/reactivex/Observable;", "Lai/kudi/agent/kshock/data/model/VerifyOtpResponse;", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/kshock/data/model/VerifyOtpRequest;", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class VerifyOtp {
    private final FetchCurrentUser fetchCurrentUser;
    private final KshockApi kShockApi;
    private final RxSchedulers rxSchedulers;

    public VerifyOtp(FetchCurrentUser fetchCurrentUser, KshockApi kshockApi, RxSchedulers rxSchedulers) {
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(kshockApi, "kShockApi");
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        this.fetchCurrentUser = fetchCurrentUser;
        this.kShockApi = kshockApi;
        this.rxSchedulers = rxSchedulers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: confirmToken$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m39705confirmToken$lambda0(VerifyOtp verifyOtp, VerifyOtpRequest verifyOtpRequest, User user) {
        Log_OC.getArray(verifyOtp, "this$0");
        Log_OC.getArray(verifyOtpRequest, "$request");
        Log_OC.getArray(user, "it");
        KshockApi $r3 = verifyOtp.kShockApi;
        String $r4 = user.getSessionId();
        Log_OC.loadImage($r4, "it.sessionId");
        AbstractC11688p $r5 = $r3.verifyOtp($r4, verifyOtpRequest);
        RxSchedulers $r6 = verifyOtp.rxSchedulers;
        p425j.p444e.Item $r7 = $r6.setSettings();
        return $r5.h0($r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p confirmToken(final VerifyOtpRequest verifyOtpRequest) {
        Log_OC.getArray(verifyOtpRequest, TransactionRequest.TYPE_REQUEST);
        FetchCurrentUser $r2 = this.fetchCurrentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        AbstractC11688p $r5 = $r3.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.kshock.usecases.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                VerifyOtp $r1 = VerifyOtp.this;
                VerifyOtpRequest $r22 = verifyOtpRequest;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = VerifyOtp.m39705confirmToken$lambda0($r1, $r22, $r52);
                return $r32;
            }
        });
        C0308k $r6 = C0308k.f608a;
        AbstractC11688p $r52 = $r5.m10531O($r6);
        RxSchedulers $r7 = this.rxSchedulers;
        p425j.p444e.Item $r8 = $r7.setSettings();
        AbstractC11688p $r53 = $r52.h0($r8);
        RxSchedulers $r72 = this.rxSchedulers;
        p425j.p444e.Item $r82 = $r72.main();
        AbstractC11688p $r54 = $r53.R($r82);
        Log_OC.loadImage($r54, "fetchCurrentUser.execute().flatMapObservable {\n            kShockApi.verifyOtp(it.sessionId, request)\n                .subscribeOn(rxSchedulers.io())\n        }.map {\n            it\n        }.subscribeOn(rxSchedulers.io()).observeOn(rxSchedulers.main())");
        return $r54;
    }
}

package ai.kudi.agent.savings.usecase;

import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.savings.data.worker.SavingsApi;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: ConfirmOtp.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m10421d2 = {"Lai/kudi/agent/savings/usecase/ConfirmOtp;", "", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "savingsApi", "Lai/kudi/agent/savings/data/api/SavingsApi;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/schedulers/RxSchedulers;Lai/kudi/agent/savings/data/api/SavingsApi;)V", "getFetchCurrentUser", "()Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "getRxSchedulers", "()Lai/kudi/agent/core/schedulers/RxSchedulers;", "getSavingsApi", "()Lai/kudi/agent/savings/data/api/SavingsApi;", "requestOtp", "Lio/reactivex/Observable;", "Lai/kudi/agent/savings/data/model/RequestPinResetOtpResponse;", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ConfirmOtp {
    private final FetchCurrentUser fetchCurrentUser;
    private final RxSchedulers rxSchedulers;
    private final SavingsApi savingsApi;

    public ConfirmOtp(FetchCurrentUser fetchCurrentUser, RxSchedulers rxSchedulers, SavingsApi savingsApi) {
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        Log_OC.getArray(savingsApi, "savingsApi");
        this.fetchCurrentUser = fetchCurrentUser;
        this.rxSchedulers = rxSchedulers;
        this.savingsApi = savingsApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: requestOtp$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m40561requestOtp$lambda0(ConfirmOtp confirmOtp, User user) {
        Log_OC.getArray(confirmOtp, "this$0");
        Log_OC.getArray(user, "it");
        SavingsApi $r2 = confirmOtp.getSavingsApi();
        String $r3 = user.getSessionId();
        Log_OC.loadImage($r3, "it.sessionId");
        AbstractC11688p $r4 = $r2.requestSavingPinOtp($r3);
        RxSchedulers $r5 = confirmOtp.getRxSchedulers();
        p425j.p444e.Item $r6 = $r5.setSettings();
        return $r4.h0($r6);
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
    public final RxSchedulers getRxSchedulers() {
        RxSchedulers r1 = this.rxSchedulers;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SavingsApi getSavingsApi() {
        SavingsApi r1 = this.savingsApi;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p requestOtp() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        AbstractC11688p $r4 = $r2.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.savings.usecase.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                ConfirmOtp $r12 = ConfirmOtp.this;
                User $r42 = (User) obj;
                InterfaceC11692s $r22 = ConfirmOtp.m40561requestOtp$lambda0($r12, $r42);
                return $r22;
            }
        });
        Quaternion $r5 = Quaternion.f1268J;
        AbstractC11688p $r42 = $r4.m10531O($r5);
        RxSchedulers $r6 = this.rxSchedulers;
        p425j.p444e.Item $r7 = $r6.setSettings();
        AbstractC11688p $r43 = $r42.h0($r7);
        RxSchedulers $r62 = this.rxSchedulers;
        p425j.p444e.Item $r72 = $r62.main();
        AbstractC11688p $r44 = $r43.R($r72);
        Log_OC.loadImage($r44, "fetchCurrentUser.execute().flatMapObservable {\n            savingsApi.requestSavingPinOtp(it.sessionId).subscribeOn(rxSchedulers.io())\n        }.map {\n            it\n        }.subscribeOn(rxSchedulers.io()).observeOn(rxSchedulers.main())");
        return $r44;
    }
}

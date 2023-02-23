package ai.kudi.agent.users.domain.usecases;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.users.data.network.UserService;
import ai.kudi.agent.users.domain.package_1.SavingPinValidationRequest;
import ai.kudi.agent.users.domain.package_1.SavingPinValidationResponse;
import ai.kudi.agent.users.domain.package_1.User;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: AuthorizeSavings.kt */
@Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/users/domain/usecases/AuthorizeSavings;", "", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "userService", "Lai/kudi/agent/users/data/network/UserService;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/schedulers/RxSchedulers;Lai/kudi/agent/users/data/network/UserService;)V", "authorizePin", "Lio/reactivex/Observable;", "Lai/kudi/agent/users/domain/dto/SavingPinValidationResponse;", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/users/domain/dto/SavingPinValidationRequest;", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AuthorizeSavings {
    private final FetchCurrentUser fetchCurrentUser;
    private final RxSchedulers rxSchedulers;
    private final UserService userService;

    public AuthorizeSavings(FetchCurrentUser fetchCurrentUser, RxSchedulers rxSchedulers, UserService userService) {
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        Log_OC.getArray(userService, "userService");
        this.fetchCurrentUser = fetchCurrentUser;
        this.rxSchedulers = rxSchedulers;
        this.userService = userService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: authorizePin$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m41425authorizePin$lambda0(AuthorizeSavings authorizeSavings, SavingPinValidationRequest savingPinValidationRequest, User user) {
        Log_OC.getArray(authorizeSavings, "this$0");
        Log_OC.getArray(savingPinValidationRequest, "$request");
        Log_OC.getArray(user, "it");
        UserService $r3 = authorizeSavings.userService;
        String $r4 = user.getSessionId();
        Log_OC.loadImage($r4, "it.sessionId");
        AbstractC11688p $r5 = $r3.validatePin($r4, savingPinValidationRequest);
        RxSchedulers $r6 = authorizeSavings.rxSchedulers;
        p425j.p444e.Item $r7 = $r6.setSettings();
        return $r5.h0($r7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: authorizePin$lambda-1  reason: not valid java name */
    public static final SavingPinValidationResponse m41426authorizePin$lambda1(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "it");
        Object $r1 = aPIResponse.data;
        SavingPinValidationResponse $r2 = (SavingPinValidationResponse) $r1;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p authorizePin(final SavingPinValidationRequest savingPinValidationRequest) {
        Log_OC.getArray(savingPinValidationRequest, TransactionRequest.TYPE_REQUEST);
        FetchCurrentUser $r2 = this.fetchCurrentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        AbstractC11688p $r5 = $r3.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.users.domain.usecases.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                AuthorizeSavings $r1 = AuthorizeSavings.this;
                SavingPinValidationRequest $r22 = savingPinValidationRequest;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = AuthorizeSavings.m41425authorizePin$lambda0($r1, $r22, $r52);
                return $r32;
            }
        });
        C0671c $r6 = C0671c.f1870d;
        AbstractC11688p $r52 = $r5.m10531O($r6);
        RxSchedulers $r7 = this.rxSchedulers;
        p425j.p444e.Item $r8 = $r7.setSettings();
        AbstractC11688p $r53 = $r52.h0($r8);
        RxSchedulers $r72 = this.rxSchedulers;
        p425j.p444e.Item $r82 = $r72.main();
        AbstractC11688p $r54 = $r53.R($r82);
        Log_OC.loadImage($r54, "fetchCurrentUser.execute().flatMapObservable {\n            userService.validatePin(it.sessionId, request).subscribeOn(rxSchedulers.io())\n        }.map {\n            it.data\n        }.subscribeOn(rxSchedulers.io()).observeOn(rxSchedulers.main())");
        return $r54;
    }
}

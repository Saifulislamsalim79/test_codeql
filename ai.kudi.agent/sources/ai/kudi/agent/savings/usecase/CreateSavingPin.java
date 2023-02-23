package ai.kudi.agent.savings.usecase;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.savings.data.model.CreateSavingsPinRequest;
import ai.kudi.agent.savings.data.model.CreateSavingsPinResponse;
import ai.kudi.agent.savings.data.worker.SavingsApi;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: CreateSavingPin.kt */
@Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m10421d2 = {"Lai/kudi/agent/savings/usecase/CreateSavingPin;", "", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "savingsApi", "Lai/kudi/agent/savings/data/api/SavingsApi;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/savings/data/api/SavingsApi;Lai/kudi/agent/core/schedulers/RxSchedulers;)V", "getFetchCurrentUser", "()Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "getRxSchedulers", "()Lai/kudi/agent/core/schedulers/RxSchedulers;", "getSavingsApi", "()Lai/kudi/agent/savings/data/api/SavingsApi;", "createPin", "Lio/reactivex/Observable;", "Lai/kudi/agent/savings/data/model/CreateSavingsPinResponse;", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/savings/data/model/CreateSavingsPinRequest;", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CreateSavingPin {
    private final FetchCurrentUser fetchCurrentUser;
    private final RxSchedulers rxSchedulers;
    private final SavingsApi savingsApi;

    public CreateSavingPin(FetchCurrentUser fetchCurrentUser, SavingsApi savingsApi, RxSchedulers rxSchedulers) {
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(savingsApi, "savingsApi");
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        this.fetchCurrentUser = fetchCurrentUser;
        this.savingsApi = savingsApi;
        this.rxSchedulers = rxSchedulers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: createPin$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m40564createPin$lambda0(CreateSavingPin createSavingPin, CreateSavingsPinRequest createSavingsPinRequest, User user) {
        Log_OC.getArray(createSavingPin, "this$0");
        Log_OC.getArray(createSavingsPinRequest, "$request");
        Log_OC.getArray(user, "it");
        SavingsApi $r3 = createSavingPin.getSavingsApi();
        String $r4 = user.getSessionId();
        Log_OC.loadImage($r4, "it.sessionId");
        AbstractC11688p $r5 = $r3.createSavingsPin($r4, createSavingsPinRequest);
        RxSchedulers $r6 = createSavingPin.getRxSchedulers();
        p425j.p444e.Item $r7 = $r6.setSettings();
        return $r5.h0($r7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: createPin$lambda-1  reason: not valid java name */
    public static final CreateSavingsPinResponse m40565createPin$lambda1(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "it");
        Object $r1 = aPIResponse.data;
        CreateSavingsPinResponse $r2 = (CreateSavingsPinResponse) $r1;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p createPin(final CreateSavingsPinRequest createSavingsPinRequest) {
        Log_OC.getArray(createSavingsPinRequest, TransactionRequest.TYPE_REQUEST);
        FetchCurrentUser $r2 = this.fetchCurrentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        AbstractC11688p $r5 = $r3.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.savings.usecase.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                CreateSavingPin $r1 = CreateSavingPin.this;
                CreateSavingsPinRequest $r22 = createSavingsPinRequest;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = CreateSavingPin.m40564createPin$lambda0($r1, $r22, $r52);
                return $r32;
            }
        });
        Type $r6 = Type.INTERFACEEND;
        AbstractC11688p $r52 = $r5.m10531O($r6);
        RxSchedulers $r7 = this.rxSchedulers;
        p425j.p444e.Item $r8 = $r7.setSettings();
        AbstractC11688p $r53 = $r52.h0($r8);
        RxSchedulers $r72 = this.rxSchedulers;
        p425j.p444e.Item $r82 = $r72.main();
        AbstractC11688p $r54 = $r53.R($r82);
        Log_OC.loadImage($r54, "fetchCurrentUser.execute().flatMapObservable {\n            savingsApi.createSavingsPin(it.sessionId, request).subscribeOn(rxSchedulers.io())\n        }.map {\n            it.data\n        }.subscribeOn(rxSchedulers.io()).observeOn(rxSchedulers.main())");
        return $r54;
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
}

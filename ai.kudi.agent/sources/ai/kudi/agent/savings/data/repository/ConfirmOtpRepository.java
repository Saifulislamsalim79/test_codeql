package ai.kudi.agent.savings.data.repository;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.savings.data.model.ResendPinRequest;
import ai.kudi.agent.savings.data.model.ResetSavingPinRequest;
import ai.kudi.agent.savings.data.model.ResetSavingPinResponse;
import ai.kudi.agent.savings.data.worker.SavingsApi;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.Item;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: ConfirmOtpRepository.kt */
@Metadata(m10422d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/savings/data/repository/ConfirmOtpRepository;", "", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "savingsService", "Lai/kudi/agent/savings/data/api/SavingsApi;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/savings/data/api/SavingsApi;Lai/kudi/agent/core/schedulers/RxSchedulers;)V", "resendPin", "Lio/reactivex/Observable;", "Lai/kudi/agent/savings/data/model/RequestPinResetOtpResponse;", "resetPin", "Lai/kudi/agent/savings/data/model/ResetSavingPinResponse;", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/savings/data/model/ResetSavingPinRequest;", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ConfirmOtpRepository {
    private final FetchCurrentUser fetchCurrentUser;
    private final RxSchedulers rxSchedulers;
    private final SavingsApi savingsService;

    public ConfirmOtpRepository(FetchCurrentUser fetchCurrentUser, SavingsApi savingsApi, RxSchedulers rxSchedulers) {
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(savingsApi, "savingsService");
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        this.fetchCurrentUser = fetchCurrentUser;
        this.savingsService = savingsApi;
        this.rxSchedulers = rxSchedulers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: resendPin$lambda-2  reason: not valid java name */
    public static final InterfaceC11692s m40509resendPin$lambda2(ConfirmOtpRepository confirmOtpRepository, User user) {
        Log_OC.getArray(confirmOtpRepository, "this$0");
        Log_OC.getArray(user, "it");
        SavingsApi $r2 = confirmOtpRepository.savingsService;
        String $r3 = user.getSessionId();
        Log_OC.loadImage($r3, "it.sessionId");
        String $r5 = user.getPhoneNumber();
        Log_OC.loadImage($r5, "it.phoneNumber");
        ResendPinRequest $r4 = new ResendPinRequest($r5);
        AbstractC11688p $r6 = $r2.resendOtp($r3, $r4);
        RxSchedulers $r7 = confirmOtpRepository.rxSchedulers;
        Item $r8 = $r7.setSettings();
        return $r6.h0($r8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: resetPin$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m40511resetPin$lambda0(ConfirmOtpRepository confirmOtpRepository, ResetSavingPinRequest resetSavingPinRequest, User user) {
        Log_OC.getArray(confirmOtpRepository, "this$0");
        Log_OC.getArray(resetSavingPinRequest, "$request");
        Log_OC.getArray(user, "it");
        SavingsApi $r3 = confirmOtpRepository.savingsService;
        String $r4 = user.getSessionId();
        Log_OC.loadImage($r4, "it.sessionId");
        AbstractC11688p $r5 = $r3.resetSavingsPin($r4, resetSavingPinRequest);
        RxSchedulers $r6 = confirmOtpRepository.rxSchedulers;
        Item $r7 = $r6.setSettings();
        return $r5.h0($r7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: resetPin$lambda-1  reason: not valid java name */
    public static final ResetSavingPinResponse m40512resetPin$lambda1(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "it");
        Object $r1 = aPIResponse.data;
        ResetSavingPinResponse $r2 = (ResetSavingPinResponse) $r1;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p resendPin() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        AbstractC11688p $r4 = $r2.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.savings.data.repository.c
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                ConfirmOtpRepository $r12 = ConfirmOtpRepository.this;
                User $r42 = (User) obj;
                InterfaceC11692s $r22 = ConfirmOtpRepository.m40509resendPin$lambda2($r12, $r42);
                return $r22;
            }
        });
        ClassWriter $r5 = ClassWriter.f1219J;
        AbstractC11688p $r42 = $r4.m10531O($r5);
        RxSchedulers $r6 = this.rxSchedulers;
        Item $r7 = $r6.setSettings();
        AbstractC11688p $r43 = $r42.h0($r7);
        RxSchedulers $r62 = this.rxSchedulers;
        Item $r72 = $r62.main();
        AbstractC11688p $r44 = $r43.R($r72);
        Log_OC.loadImage($r44, "fetchCurrentUser.execute().flatMapObservable {\n            savingsService.resendOtp(it.sessionId, ResendPinRequest(it.phoneNumber))\n                .subscribeOn(rxSchedulers.io())\n        }.map {\n            it\n        }.subscribeOn(rxSchedulers.io()).observeOn(rxSchedulers.main())");
        return $r44;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p resetPin(final ResetSavingPinRequest resetSavingPinRequest) {
        Log_OC.getArray(resetSavingPinRequest, TransactionRequest.TYPE_REQUEST);
        FetchCurrentUser $r2 = this.fetchCurrentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        AbstractC11688p $r5 = $r3.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.savings.data.repository.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                ConfirmOtpRepository $r1 = ConfirmOtpRepository.this;
                ResetSavingPinRequest $r22 = resetSavingPinRequest;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = ConfirmOtpRepository.m40511resetPin$lambda0($r1, $r22, $r52);
                return $r32;
            }
        });
        ComponentFactory $r6 = ComponentFactory.ROLE;
        AbstractC11688p $r52 = $r5.m10531O($r6);
        RxSchedulers $r7 = this.rxSchedulers;
        Item $r8 = $r7.setSettings();
        AbstractC11688p $r53 = $r52.h0($r8);
        RxSchedulers $r72 = this.rxSchedulers;
        Item $r82 = $r72.main();
        AbstractC11688p $r54 = $r53.R($r82);
        Log_OC.loadImage($r54, "fetchCurrentUser.execute().flatMapObservable {\n            savingsService.resetSavingsPin(it.sessionId, request)\n                .subscribeOn(rxSchedulers.io())\n        }.map {\n            it.data\n        }.subscribeOn(rxSchedulers.io()).observeOn(rxSchedulers.main())");
        return $r54;
    }
}

package ai.kudi.agent.kshock.usecases;

import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.kshock.data.domain.attention.KshockApi;
import ai.kudi.agent.kshock.data.domain.dto.TransactionResponse;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.users.data.repositories.UserRepository;
import ai.kudi.agent.users.domain.package_1.User;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: SubmitTransactionRequest.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/kshock/usecases/SubmitTransactionRequest;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "Lai/kudi/agent/kshock/data/domain/dto/TransactionResponse;", "Lai/kudi/agent/transactions/domain/dto/TransactionRequest;", "kshockApi", "Lai/kudi/agent/kshock/data/domain/api/KshockApi;", "userRepo", "Lai/kudi/agent/users/data/repositories/UserRepository;", "(Lai/kudi/agent/kshock/data/domain/api/KshockApi;Lai/kudi/agent/users/data/repositories/UserRepository;)V", "execute", "Lio/reactivex/Observable;", TransactionRequest.TYPE_REQUEST, "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SubmitTransactionRequest implements OneInputUseCase<TransactionResponse, TransactionRequest> {
    private final KshockApi kshockApi;
    private final UserRepository userRepo;

    public SubmitTransactionRequest(KshockApi kshockApi, UserRepository userRepository) {
        Log_OC.getArray(kshockApi, "kshockApi");
        Log_OC.getArray(userRepository, "userRepo");
        this.kshockApi = kshockApi;
        this.userRepo = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m39703execute$lambda0(SubmitTransactionRequest submitTransactionRequest, TransactionRequest transactionRequest, User user) {
        Log_OC.getArray(submitTransactionRequest, "this$0");
        Log_OC.getArray(transactionRequest, "$request");
        Log_OC.getArray(user, "it");
        KshockApi $r3 = submitTransactionRequest.kshockApi;
        String $r4 = user.getSessionId();
        Log_OC.loadImage($r4, "it.sessionId");
        AbstractC11688p $r5 = $r3.postTransaction($r4, transactionRequest);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(final TransactionRequest transactionRequest) {
        Log_OC.getArray(transactionRequest, TransactionRequest.TYPE_REQUEST);
        UserRepository $r3 = this.userRepo;
        AbstractC11696w $r4 = $r3.getCurrentUser();
        AbstractC11688p $r5 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.kshock.usecases.Frame
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                SubmitTransactionRequest $r1 = SubmitTransactionRequest.this;
                TransactionRequest $r2 = transactionRequest;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = SubmitTransactionRequest.m39703execute$lambda0($r1, $r2, $r52);
                return $r32;
            }
        });
        p425j.p444e.Item $r6 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r52 = $r5.h0($r6);
        p425j.p444e.Item $r62 = ContextUtils.LogError();
        AbstractC11688p $r53 = $r52.R($r62);
        Log_OC.loadImage($r53, "userRepo.currentUser\n                .flatMapObservable { kshockApi.postTransaction(it.sessionId, request) }\n                .subscribeOn(Schedulers.io())\n                .observeOn(AndroidSchedulers.mainThread())");
        return $r53;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.OneInputUseCase
    public /* bridge */ /* synthetic */ AbstractC11688p execute(Object obj) {
        TransactionRequest $r3 = (TransactionRequest) obj;
        AbstractC11688p $r1 = execute($r3);
        return $r1;
    }
}

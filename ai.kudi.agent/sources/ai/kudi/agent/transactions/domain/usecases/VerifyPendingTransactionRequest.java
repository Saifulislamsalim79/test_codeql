package ai.kudi.agent.transactions.domain.usecases;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.TransactionApi;
import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.users.data.repositories.UserRepository;
import ai.kudi.agent.users.domain.package_1.User;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: VerifyPendingTransaction.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/transactions/domain/usecases/VerifyPendingTransactionRequest;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "Lai/kudi/agent/transactions/domain/usecases/VerifyPendingResponse;", "Lai/kudi/agent/transactions/domain/usecases/VerifyPendingData;", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "userRepository", "Lai/kudi/agent/users/data/repositories/UserRepository;", "(Lai/kudi/agent/core/network/NetworkService;Lai/kudi/agent/users/data/repositories/UserRepository;)V", "getNetworkService", "()Lai/kudi/agent/core/network/NetworkService;", "getUserRepository", "()Lai/kudi/agent/users/data/repositories/UserRepository;", "execute", "Lio/reactivex/Observable;", MetricTracker.Object.INPUT, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class VerifyPendingTransactionRequest implements OneInputUseCase<VerifyPendingResponse, VerifyPendingData> {
    private final NetworkService networkService;
    private final UserRepository userRepository;

    public VerifyPendingTransactionRequest(NetworkService networkService, UserRepository userRepository) {
        Log_OC.getArray(networkService, "networkService");
        Log_OC.getArray(userRepository, "userRepository");
        this.networkService = networkService;
        this.userRepository = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-1  reason: not valid java name */
    public static final InterfaceC11692s m41121execute$lambda1(VerifyPendingTransactionRequest verifyPendingTransactionRequest, VerifyPendingData verifyPendingData, User user) {
        Log_OC.getArray(verifyPendingTransactionRequest, "this$0");
        Log_OC.getArray(verifyPendingData, "$input");
        Log_OC.getArray(user, "it");
        NetworkService $r3 = verifyPendingTransactionRequest.getNetworkService();
        TransactionApi $r4 = $r3.getTransactionApi();
        String $r5 = user.getSessionId();
        Log_OC.loadImage($r5, "it.sessionId");
        AbstractC11688p $r6 = $r4.verifyPendingTransaction($r5, verifyPendingData);
        ImageCache $r7 = ImageCache.inst;
        return $r6.m10531O($r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(final VerifyPendingData verifyPendingData) {
        Log_OC.getArray(verifyPendingData, MetricTracker.Object.INPUT);
        UserRepository $r3 = this.userRepository;
        AbstractC11696w $r4 = $r3.getCurrentUser();
        AbstractC11688p $r5 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.transactions.domain.usecases.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                VerifyPendingTransactionRequest $r1 = VerifyPendingTransactionRequest.this;
                VerifyPendingData $r2 = verifyPendingData;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = VerifyPendingTransactionRequest.m41121execute$lambda1($r1, $r2, $r52);
                return $r32;
            }
        });
        p425j.p444e.Item $r6 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r52 = $r5.h0($r6);
        p425j.p444e.Item $r62 = ContextUtils.LogError();
        AbstractC11688p $r53 = $r52.R($r62);
        Log_OC.loadImage($r53, "userRepository.currentUser.flatMapObservable {\n            networkService.transactionApi.verifyPendingTransaction(it.sessionId, input)\n                .map { it }\n        }.subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())");
        return $r53;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.OneInputUseCase
    public /* bridge */ /* synthetic */ AbstractC11688p execute(Object obj) {
        VerifyPendingData $r3 = (VerifyPendingData) obj;
        AbstractC11688p $r1 = execute($r3);
        return $r1;
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
    public final UserRepository getUserRepository() {
        UserRepository r1 = this.userRepository;
        return r1;
    }
}

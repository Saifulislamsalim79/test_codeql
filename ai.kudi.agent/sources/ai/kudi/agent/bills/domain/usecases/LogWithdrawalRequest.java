package ai.kudi.agent.bills.domain.usecases;

import ai.kudi.agent.core.network.AddNoteCommand;
import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.users.data.repositories.UserRepository;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.withdrawal.domain.dto.WithdrawalRequest;
import ai.kudi.agent.withdrawal.domain.dto.WithdrawalResponse;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: LogWithdrawalRequest.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/bills/domain/usecases/LogWithdrawalRequest;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "Lai/kudi/agent/withdrawal/domain/dto/WithdrawalResponse;", "Lai/kudi/agent/withdrawal/domain/dto/WithdrawalRequest;", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "userRepo", "Lai/kudi/agent/users/data/repositories/UserRepository;", "(Lai/kudi/agent/core/network/NetworkService;Lai/kudi/agent/users/data/repositories/UserRepository;)V", "execute", "Lio/reactivex/Observable;", TransactionRequest.TYPE_REQUEST, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class LogWithdrawalRequest implements OneInputUseCase<WithdrawalResponse, WithdrawalRequest> {
    private final NetworkService networkService;
    private final UserRepository userRepo;

    public LogWithdrawalRequest(NetworkService networkService, UserRepository userRepository) {
        Log_OC.getArray(networkService, "networkService");
        Log_OC.getArray(userRepository, "userRepo");
        this.networkService = networkService;
        this.userRepo = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m39028execute$lambda0(LogWithdrawalRequest logWithdrawalRequest, ai.kudi.agent.withdrawal.domain.wiki.WithdrawalRequest withdrawalRequest, User user) {
        Log_OC.getArray(logWithdrawalRequest, "this$0");
        Log_OC.getArray(withdrawalRequest, "$request");
        Log_OC.getArray(user, "it");
        NetworkService $r3 = logWithdrawalRequest.networkService;
        AddNoteCommand $r4 = $r3.getApi();
        String $r5 = user.getSessionId();
        Log_OC.loadImage($r5, "it.sessionId");
        AbstractC11688p $r6 = $r4.logWithdrawalRequest($r5, withdrawalRequest);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(final ai.kudi.agent.withdrawal.domain.wiki.WithdrawalRequest withdrawalRequest) {
        Log_OC.getArray(withdrawalRequest, TransactionRequest.TYPE_REQUEST);
        UserRepository $r3 = this.userRepo;
        AbstractC11696w $r4 = $r3.getCurrentUser();
        AbstractC11688p $r5 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.bills.domain.usecases.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                LogWithdrawalRequest $r1 = LogWithdrawalRequest.this;
                ai.kudi.agent.withdrawal.domain.wiki.WithdrawalRequest $r2 = withdrawalRequest;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = LogWithdrawalRequest.m39028execute$lambda0($r1, $r2, $r52);
                return $r32;
            }
        });
        p425j.p444e.Item $r6 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r52 = $r5.h0($r6);
        p425j.p444e.Item $r62 = ContextUtils.LogError();
        AbstractC11688p $r53 = $r52.R($r62);
        Log_OC.loadImage($r53, "userRepo.currentUser.flatMapObservable {\n            networkService.api.logWithdrawalRequest(it.sessionId, request)\n        }.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())");
        return $r53;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.OneInputUseCase
    public /* bridge */ /* synthetic */ AbstractC11688p execute(Object obj) {
        ai.kudi.agent.withdrawal.domain.wiki.WithdrawalRequest $r3 = (ai.kudi.agent.withdrawal.domain.wiki.WithdrawalRequest) obj;
        AbstractC11688p $r1 = execute($r3);
        return $r1;
    }
}

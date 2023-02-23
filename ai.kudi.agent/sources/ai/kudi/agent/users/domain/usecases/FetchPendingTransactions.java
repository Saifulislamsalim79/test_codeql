package ai.kudi.agent.users.domain.usecases;

import ai.kudi.agent.core.network.AddNoteCommand;
import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.transactions.data.repositories.dto.FetchRequest;
import ai.kudi.agent.transactions.data.repositories.dto.TransactionModel;
import ai.kudi.agent.users.data.repositories.UserRepository;
import ai.kudi.agent.users.domain.package_1.User;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: FetchPendingTransactions.kt */
@Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/users/domain/usecases/FetchPendingTransactions;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "", "Lai/kudi/agent/transactions/data/repositories/dto/TransactionModel;", "Lai/kudi/agent/transactions/data/repositories/dto/FetchRequest;", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "userRepository", "Lai/kudi/agent/users/data/repositories/UserRepository;", "(Lai/kudi/agent/core/network/NetworkService;Lai/kudi/agent/users/data/repositories/UserRepository;)V", "getNetworkService", "()Lai/kudi/agent/core/network/NetworkService;", "getUserRepository", "()Lai/kudi/agent/users/data/repositories/UserRepository;", "execute", "Lio/reactivex/Observable;", MetricTracker.Object.INPUT, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FetchPendingTransactions implements OneInputUseCase<List<? extends TransactionModel>, FetchRequest> {
    private final NetworkService networkService;
    private final UserRepository userRepository;

    public FetchPendingTransactions(NetworkService networkService, UserRepository userRepository) {
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
    public static final InterfaceC11692s m41433execute$lambda1(FetchPendingTransactions fetchPendingTransactions, FetchRequest fetchRequest, User user) {
        Log_OC.getArray(fetchPendingTransactions, "this$0");
        Log_OC.getArray(fetchRequest, "$input");
        Log_OC.getArray(user, "it");
        NetworkService $r3 = fetchPendingTransactions.getNetworkService();
        AddNoteCommand $r4 = $r3.getApi();
        String $r5 = user.getSessionId();
        Log_OC.loadImage($r5, "it.sessionId");
        Map $r6 = fetchRequest.getParams();
        AbstractC11688p $r7 = $r4.getUserTransactions($r5, $r6);
        C0673f $r8 = C0673f.f1874o;
        return $r7.m10531O($r8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0023 */
    /* renamed from: execute$lambda-1$lambda-0  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List m41434execute$lambda1$lambda0(ai.kudi.agent.core.network.response.APIResponse r12) {
        /*
            java.lang.String r0 = "hashMap"
            kotlin.p483e0.p485d.Log_OC.getArray(r12, r0)
            Data r1 = r12.data
            java.lang.String r0 = "hashMap.data"
            kotlin.p483e0.p485d.Log_OC.loadImage(r1, r0)
            r3 = r1
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r2 = r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r6 = 10
            int r5 = kotlin.p557z.C13722p.m3921o(r2, r6)
            r4.<init>(r5)
            java.util.Iterator r7 = r2.iterator()
        L1f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L35
            java.lang.Object r1 = r7.next()
            r10 = r1
            java.util.HashMap r10 = (java.util.HashMap) r10
            r9 = r10
            ai.kudi.agent.transactions.data.repositories.dto.TransactionModel r11 = ai.kudi.agent.transactions.data.repositories.dto.TransactionModelKt.toTransactionModel(r9)
            r4.add(r11)
            goto L1f
        L35:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.users.domain.usecases.FetchPendingTransactions.m41434execute$lambda1$lambda0(ai.kudi.agent.core.network.response.APIResponse):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(final FetchRequest fetchRequest) {
        Log_OC.getArray(fetchRequest, MetricTracker.Object.INPUT);
        UserRepository $r3 = this.userRepository;
        AbstractC11696w $r4 = $r3.getCurrentUser();
        AbstractC11688p $r5 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.users.domain.usecases.a
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                FetchPendingTransactions $r1 = FetchPendingTransactions.this;
                FetchRequest $r2 = fetchRequest;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = FetchPendingTransactions.m41433execute$lambda1($r1, $r2, $r52);
                return $r32;
            }
        });
        p425j.p444e.Item $r6 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r52 = $r5.h0($r6);
        p425j.p444e.Item $r62 = ContextUtils.LogError();
        AbstractC11688p $r53 = $r52.R($r62);
        Log_OC.loadImage($r53, "userRepository.currentUser.flatMapObservable {\n            networkService.api.getUserTransactions(it.sessionId, input.params)\n                .map { hashMap -> hashMap.data.map(::toTransactionModel) }\n        }.subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())");
        return $r53;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.OneInputUseCase
    public /* bridge */ /* synthetic */ AbstractC11688p execute(Object obj) {
        FetchRequest $r3 = (FetchRequest) obj;
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

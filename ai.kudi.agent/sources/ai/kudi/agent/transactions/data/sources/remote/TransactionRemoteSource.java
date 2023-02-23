package ai.kudi.agent.transactions.data.sources.remote;

import ai.kudi.agent.core.network.AddNoteCommand;
import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.transactions.data.repositories.TransactionRepository;
import ai.kudi.agent.transactions.data.repositories.dto.FetchRequest;
import ai.kudi.agent.users.data.repositories.UserRepository;
import ai.kudi.agent.users.domain.package_1.User;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: TransactionRemoteSource.kt */
@Metadata(m10422d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/transactions/data/sources/remote/TransactionRemoteSource;", "Lai/kudi/agent/transactions/data/repositories/TransactionRepository;", "userRepository", "Lai/kudi/agent/users/data/repositories/UserRepository;", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "(Lai/kudi/agent/users/data/repositories/UserRepository;Lai/kudi/agent/core/network/NetworkService;)V", "fetchTransaction", "Lio/reactivex/Observable;", "", "Lai/kudi/agent/transactions/data/repositories/dto/TransactionModel;", "fetchRequest", "Lai/kudi/agent/transactions/data/repositories/dto/FetchRequest;", "findBy", "ref", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionRemoteSource implements TransactionRepository {
    private final NetworkService networkService;
    private final UserRepository userRepository;

    public TransactionRemoteSource(UserRepository userRepository, NetworkService networkService) {
        Log_OC.getArray(userRepository, "userRepository");
        Log_OC.getArray(networkService, "networkService");
        this.userRepository = userRepository;
        this.networkService = networkService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchTransaction$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m41090fetchTransaction$lambda0(TransactionRemoteSource transactionRemoteSource, FetchRequest fetchRequest, User user) {
        Log_OC.getArray(transactionRemoteSource, "this$0");
        Log_OC.getArray(fetchRequest, "$fetchRequest");
        Log_OC.getArray(user, "it");
        NetworkService $r3 = transactionRemoteSource.networkService;
        AddNoteCommand $r4 = $r3.getApi();
        String $r5 = user.getSessionId();
        Log_OC.loadImage($r5, "it.sessionId");
        Map $r6 = fetchRequest.getParams();
        AbstractC11688p $r7 = $r4.getUserTransactions($r5, $r6);
        return $r7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0023 */
    /* renamed from: fetchTransaction$lambda-1  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List m41091fetchTransaction$lambda1(ai.kudi.agent.core.network.response.APIResponse r12) {
        /*
            java.lang.String r0 = "it"
            kotlin.p483e0.p485d.Log_OC.getArray(r12, r0)
            Data r1 = r12.data
            java.lang.String r0 = "it.data"
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
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactions.data.sources.remote.TransactionRemoteSource.m41091fetchTransaction$lambda1(ai.kudi.agent.core.network.response.APIResponse):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: findBy$lambda-2  reason: not valid java name */
    public static final InterfaceC11692s m41092findBy$lambda2(TransactionRemoteSource transactionRemoteSource, String str, User user) {
        Log_OC.getArray(transactionRemoteSource, "this$0");
        Log_OC.getArray(str, "$ref");
        Log_OC.getArray(user, "it");
        NetworkService $r3 = transactionRemoteSource.networkService;
        AddNoteCommand $r4 = $r3.getApi();
        String $r5 = user.getSessionId();
        Log_OC.loadImage($r5, "it.sessionId");
        AbstractC11688p $r6 = $r4.getTransaction($r5, str);
        return $r6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: findBy$lambda-3  reason: not valid java name */
    public static final HashMap m41093findBy$lambda3(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "it");
        Object $r1 = aPIResponse.data;
        HashMap $r2 = (HashMap) $r1;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.data.repositories.TransactionRepository
    public AbstractC11688p fetchTransaction(final FetchRequest fetchRequest) {
        Log_OC.getArray(fetchRequest, "fetchRequest");
        UserRepository $r3 = this.userRepository;
        AbstractC11696w $r4 = $r3.getCurrentUser();
        AbstractC11688p $r5 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.transactions.data.sources.remote.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                TransactionRemoteSource $r1 = TransactionRemoteSource.this;
                FetchRequest $r2 = fetchRequest;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = TransactionRemoteSource.m41090fetchTransaction$lambda0($r1, $r2, $r52);
                return $r32;
            }
        });
        Token $r6 = Token.FUNCTION;
        AbstractC11688p $r52 = $r5.m10531O($r6);
        Log_OC.loadImage($r52, "userRepository.currentUser.flatMapObservable {\n            networkService.api.getUserTransactions(it.sessionId, fetchRequest.params)\n        }.map { it.data.map(::toTransactionModel) }");
        return $r52;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.data.repositories.TransactionRepository
    public AbstractC11688p findBy(final String str) {
        Log_OC.getArray(str, "ref");
        UserRepository $r3 = this.userRepository;
        AbstractC11696w $r4 = $r3.getCurrentUser();
        AbstractC11688p $r5 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.transactions.data.sources.remote.x
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                TransactionRemoteSource $r1 = TransactionRemoteSource.this;
                String $r2 = str;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = TransactionRemoteSource.m41092findBy$lambda2($r1, $r2, $r52);
                return $r32;
            }
        });
        FlurryAdSize $r6 = FlurryAdSize.FULLSCREEN;
        AbstractC11688p $r52 = $r5.m10531O($r6);
        Label $r7 = Label.f1617i;
        AbstractC11688p $r53 = $r52.m10531O($r7);
        Log_OC.loadImage($r53, "userRepository.currentUser.flatMapObservable {\n            networkService.api.getTransaction(it.sessionId, ref)\n        }\n            .map { it.data }\n            .map(::toTransactionModel)");
        return $r53;
    }
}

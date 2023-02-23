package ai.kudi.agent.withdraw_cash.domain.repositories;

import ai.kudi.agent.core.network.AddNoteCommand;
import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.users.domain.dto.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.withdraw_cash.domain.wiki.CardlessWithdrawalApiCommData;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: CardlessWithdrawalRepository.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\t\u001a\u00020\nJ\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/domain/repositories/CardlessWithdrawalRepository;", "", "localSource", "Lai/kudi/agent/withdraw_cash/domain/repositories/CardlessWithdrawalRepository$LocalSource;", "remoteSource", "Lai/kudi/agent/withdraw_cash/domain/repositories/CardlessWithdrawalRepository$RemoteSource;", "(Lai/kudi/agent/withdraw_cash/domain/repositories/CardlessWithdrawalRepository$LocalSource;Lai/kudi/agent/withdraw_cash/domain/repositories/CardlessWithdrawalRepository$RemoteSource;)V", "doWithdrawal", "Lio/reactivex/Observable;", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/withdraw_cash/domain/dto/CardlessWithdrawalApiCommData$Request;", "validateVoucherCode", "Lai/kudi/agent/core/network/response/APIResponse;", "Lai/kudi/agent/withdraw_cash/domain/dto/CardlessWithdrawalApiCommData$Response;", "LocalSource", "RemoteSource", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CardlessWithdrawalRepository {
    private final LocalSource localSource;
    private final RemoteSource remoteSource;

    /* compiled from: CardlessWithdrawalRepository.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/domain/repositories/CardlessWithdrawalRepository$LocalSource;", "", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;)V", "user", "Lio/reactivex/Single;", "Lai/kudi/agent/users/domain/dto/User;", "getUser", "()Lio/reactivex/Single;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class LocalSource {
        private final FetchCurrentUser currentUser;
        private final AbstractC11696w<User> user;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public LocalSource(FetchCurrentUser fetchCurrentUser) {
            Log_OC.getArray(fetchCurrentUser, "currentUser");
            this.currentUser = fetchCurrentUser;
            AbstractC11696w $r1 = FetchCurrentUser.execute$default(fetchCurrentUser, null, null, 3, null);
            this.user = $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final AbstractC11696w getUser() {
            AbstractC11696w r1 = this.user;
            return r1;
        }
    }

    /* compiled from: CardlessWithdrawalRepository.kt */
    @Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\"\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/domain/repositories/CardlessWithdrawalRepository$RemoteSource;", "", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "(Lai/kudi/agent/core/network/NetworkService;)V", "doWithdrawal", "Lio/reactivex/Observable;", "sessionId", "", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/withdraw_cash/domain/dto/CardlessWithdrawalApiCommData$Request;", "validateVoucherCode", "Lai/kudi/agent/core/network/response/APIResponse;", "Lai/kudi/agent/withdraw_cash/domain/dto/CardlessWithdrawalApiCommData$Response;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class RemoteSource {
        private final NetworkService networkService;

        public RemoteSource(NetworkService networkService) {
            Log_OC.getArray(networkService, "networkService");
            this.networkService = networkService;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final AbstractC11688p doWithdrawal(String str, CardlessWithdrawalApiCommData.Request request) {
            Log_OC.getArray(str, "sessionId");
            Log_OC.getArray(request, TransactionRequest.TYPE_REQUEST);
            NetworkService $r3 = this.networkService;
            AddNoteCommand $r4 = $r3.getApi();
            AbstractC11688p $r5 = $r4.doWithdrawal(str, request);
            return $r5;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final AbstractC11688p validateVoucherCode(String str, CardlessWithdrawalApiCommData.Request request) {
            Log_OC.getArray(str, "sessionId");
            Log_OC.getArray(request, TransactionRequest.TYPE_REQUEST);
            NetworkService $r3 = this.networkService;
            AddNoteCommand $r4 = $r3.getApi();
            AbstractC11688p $r5 = $r4.validateVoucherCode(str, request);
            return $r5;
        }
    }

    public CardlessWithdrawalRepository(LocalSource localSource, RemoteSource remoteSource) {
        Log_OC.getArray(localSource, "localSource");
        Log_OC.getArray(remoteSource, "remoteSource");
        this.localSource = localSource;
        this.remoteSource = remoteSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: doWithdrawal$lambda-1  reason: not valid java name */
    public static final InterfaceC11692s m41786doWithdrawal$lambda1(CardlessWithdrawalRepository cardlessWithdrawalRepository, CardlessWithdrawalApiCommData.Request request, ai.kudi.agent.users.domain.package_1.User user) {
        Log_OC.getArray(cardlessWithdrawalRepository, "this$0");
        Log_OC.getArray(request, "$request");
        Log_OC.getArray(user, "it");
        RemoteSource $r3 = cardlessWithdrawalRepository.remoteSource;
        String $r4 = user.getSessionId();
        Log_OC.loadImage($r4, "it.sessionId");
        AbstractC11688p $r5 = $r3.doWithdrawal($r4, request);
        Item $r6 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r52 = $r5.h0($r6);
        Item $r62 = ContextUtils.LogError();
        return $r52.R($r62);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: validateVoucherCode$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m41787validateVoucherCode$lambda0(CardlessWithdrawalRepository cardlessWithdrawalRepository, CardlessWithdrawalApiCommData.Request request, ai.kudi.agent.users.domain.package_1.User user) {
        Log_OC.getArray(cardlessWithdrawalRepository, "this$0");
        Log_OC.getArray(request, "$request");
        Log_OC.getArray(user, "it");
        RemoteSource $r3 = cardlessWithdrawalRepository.remoteSource;
        String $r4 = user.getSessionId();
        Log_OC.loadImage($r4, "it.sessionId");
        AbstractC11688p $r5 = $r3.validateVoucherCode($r4, request);
        Item $r6 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r52 = $r5.h0($r6);
        Item $r62 = ContextUtils.LogError();
        return $r52.R($r62);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p doWithdrawal(final CardlessWithdrawalApiCommData.Request request) {
        Log_OC.getArray(request, TransactionRequest.TYPE_REQUEST);
        LocalSource $r3 = this.localSource;
        AbstractC11696w $r4 = $r3.getUser();
        AbstractC11688p $r5 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.withdraw_cash.domain.repositories.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                CardlessWithdrawalRepository $r1 = CardlessWithdrawalRepository.this;
                CardlessWithdrawalApiCommData.Request $r2 = request;
                ai.kudi.agent.users.domain.package_1.User $r52 = (ai.kudi.agent.users.domain.package_1.User) obj;
                InterfaceC11692s $r32 = CardlessWithdrawalRepository.m41786doWithdrawal$lambda1($r1, $r2, $r52);
                return $r32;
            }
        });
        Log_OC.loadImage($r5, "localSource.user.flatMapObservable {\n            remoteSource.doWithdrawal(it.sessionId, request)\n                    .subscribeOn(Schedulers.io())\n                    .observeOn(AndroidSchedulers.mainThread())\n        }");
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p validateVoucherCode(final CardlessWithdrawalApiCommData.Request request) {
        Log_OC.getArray(request, TransactionRequest.TYPE_REQUEST);
        LocalSource $r3 = this.localSource;
        AbstractC11696w $r4 = $r3.getUser();
        AbstractC11688p $r5 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.withdraw_cash.domain.repositories.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                CardlessWithdrawalRepository $r1 = CardlessWithdrawalRepository.this;
                CardlessWithdrawalApiCommData.Request $r2 = request;
                ai.kudi.agent.users.domain.package_1.User $r52 = (ai.kudi.agent.users.domain.package_1.User) obj;
                InterfaceC11692s $r32 = CardlessWithdrawalRepository.m41787validateVoucherCode$lambda0($r1, $r2, $r52);
                return $r32;
            }
        });
        Log_OC.loadImage($r5, "localSource.user.flatMapObservable {\n            remoteSource.validateVoucherCode(it.sessionId, request)\n                    .subscribeOn(Schedulers.io())\n                    .observeOn(AndroidSchedulers.mainThread())\n        }");
        return $r5;
    }
}

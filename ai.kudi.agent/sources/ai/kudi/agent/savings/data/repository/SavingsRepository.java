package ai.kudi.agent.savings.data.repository;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.savings.data.model.SavingsBalance;
import ai.kudi.agent.savings.data.worker.SavingsApi;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p259r.C7998p0;
import p201g.p259r.C8003q0;
import p201g.p259r.p260o1.C7991a;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.Item;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: SavingsRepository.kt */
@Metadata(m10422d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\nJ\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u0014J\"\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m10421d2 = {"Lai/kudi/agent/savings/data/repository/SavingsRepository;", "", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "savingsService", "Lai/kudi/agent/savings/data/api/SavingsApi;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/savings/data/api/SavingsApi;Lai/kudi/agent/core/schedulers/RxSchedulers;)V", "fetchAllSavings", "Lio/reactivex/Observable;", "", "Lai/kudi/agent/savings/data/model/SavingResponse;", "getBalance", "Lai/kudi/agent/savings/data/model/SavingsBalance;", "getSavingsTransaction", "Lio/reactivex/Flowable;", "Landroidx/paging/PagingData;", "Lai/kudi/agent/savings/data/model/SavingTransactionItem;", "sessionId", "", "getSavingsTransactionById", "planId", "Companion", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SavingsRepository {
    public static final Companion Companion;
    public static final int PAGE_SIZE = 10;
    private final FetchCurrentUser fetchCurrentUser;
    private final RxSchedulers rxSchedulers;
    private final SavingsApi savingsService;

    /* compiled from: SavingsRepository.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/savings/data/repository/SavingsRepository$Companion;", "", "()V", "PAGE_SIZE", "", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    public SavingsRepository(FetchCurrentUser fetchCurrentUser, SavingsApi savingsApi, RxSchedulers rxSchedulers) {
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
    /* renamed from: fetchAllSavings$lambda-2  reason: not valid java name */
    public static final InterfaceC11692s m40514fetchAllSavings$lambda2(SavingsRepository savingsRepository, User user) {
        Log_OC.getArray(savingsRepository, "this$0");
        Log_OC.getArray(user, "it");
        SavingsApi $r2 = savingsRepository.savingsService;
        String $r3 = user.getSessionId();
        Log_OC.loadImage($r3, "it.sessionId");
        AbstractC11688p $r4 = $r2.getSavingPlan($r3);
        RxSchedulers $r5 = savingsRepository.rxSchedulers;
        Item $r6 = $r5.setSettings();
        return $r4.h0($r6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchAllSavings$lambda-3  reason: not valid java name */
    public static final List m40515fetchAllSavings$lambda3(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "it");
        Object $r1 = aPIResponse.data;
        List $r2 = (List) $r1;
        return $r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getBalance$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m40516getBalance$lambda0(SavingsRepository savingsRepository, User user) {
        Log_OC.getArray(savingsRepository, "this$0");
        Log_OC.getArray(user, "it");
        SavingsApi $r2 = savingsRepository.savingsService;
        String $r3 = user.getSessionId();
        Log_OC.loadImage($r3, "it.sessionId");
        AbstractC11688p $r4 = $r2.getSavingsBalance($r3);
        RxSchedulers $r5 = savingsRepository.rxSchedulers;
        Item $r6 = $r5.setSettings();
        return $r4.h0($r6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getBalance$lambda-1  reason: not valid java name */
    public static final SavingsBalance m40517getBalance$lambda1(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "it");
        Object $r1 = aPIResponse.data;
        SavingsBalance $r2 = (SavingsBalance) $r1;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p fetchAllSavings() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        AbstractC11688p $r4 = $r2.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.savings.data.repository.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                SavingsRepository $r12 = SavingsRepository.this;
                User $r42 = (User) obj;
                InterfaceC11692s $r22 = SavingsRepository.m40514fetchAllSavings$lambda2($r12, $r42);
                return $r22;
            }
        });
        Quaternion $r5 = Quaternion.f1222J;
        AbstractC11688p $r42 = $r4.m10531O($r5);
        RxSchedulers $r6 = this.rxSchedulers;
        Item $r7 = $r6.setSettings();
        AbstractC11688p $r43 = $r42.h0($r7);
        RxSchedulers $r62 = this.rxSchedulers;
        Item $r72 = $r62.main();
        AbstractC11688p $r44 = $r43.R($r72);
        Log_OC.loadImage($r44, "fetchCurrentUser.execute().flatMapObservable {\n            savingsService.getSavingPlan(it.sessionId).subscribeOn(rxSchedulers.io())\n        }.map {\n            it.data\n        }.subscribeOn(rxSchedulers.io()).observeOn(rxSchedulers.main())");
        return $r44;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p getBalance() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        AbstractC11688p $r4 = $r2.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.savings.data.repository.x
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                SavingsRepository $r12 = SavingsRepository.this;
                User $r42 = (User) obj;
                InterfaceC11692s $r22 = SavingsRepository.m40516getBalance$lambda0($r12, $r42);
                return $r22;
            }
        });
        NetworkParameters $r5 = NetworkParameters.MAX_MONEY;
        AbstractC11688p $r42 = $r4.m10531O($r5);
        RxSchedulers $r6 = this.rxSchedulers;
        Item $r7 = $r6.setSettings();
        AbstractC11688p $r43 = $r42.h0($r7);
        RxSchedulers $r62 = this.rxSchedulers;
        Item $r72 = $r62.main();
        AbstractC11688p $r44 = $r43.R($r72);
        Log_OC.loadImage($r44, "fetchCurrentUser.execute().flatMapObservable {\n            savingsService.getSavingsBalance(it.sessionId).subscribeOn(rxSchedulers.io())\n        }.map {\n            it.data\n        }.subscribeOn(rxSchedulers.io()).observeOn(rxSchedulers.main())");
        return $r44;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11293f getSavingsTransaction(String str) {
        Log_OC.getArray(str, "sessionId");
        C8003q0 $r1 = new C8003q0(10, 0, false, 10, 0, 0, 50, (DBUtils$1) null);
        SavingsRepository$getSavingsTransaction$1 $r5 = new SavingsRepository$getSavingsTransaction$1(str, this);
        C7998p0 $r4 = new C7998p0($r1, (Object) null, $r5, 2, (DBUtils$1) null);
        AbstractC11293f $r2 = C7991a.m16920b($r4);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11293f getSavingsTransactionById(String str, String str2) {
        Log_OC.getArray(str, "sessionId");
        Log_OC.getArray(str2, "planId");
        C8003q0 $r2 = new C8003q0(10, 0, false, 10, 0, 0, 50, (DBUtils$1) null);
        SavingsRepository$getSavingsTransactionById$1 $r6 = new SavingsRepository$getSavingsTransactionById$1(str, this, str2);
        C7998p0 $r5 = new C7998p0($r2, (Object) null, $r6, 2, (DBUtils$1) null);
        AbstractC11293f $r3 = C7991a.m16920b($r5);
        return $r3;
    }
}

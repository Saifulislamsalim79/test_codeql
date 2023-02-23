package ai.kudi.agent.savings.usecase;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.savings.data.model.SavingsBalance;
import ai.kudi.agent.savings.data.worker.SavingsApi;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: SavingsPlan.kt */
@Metadata(m10422d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nJ\"\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/savings/usecase/SavingsPlan;", "", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "savingsService", "Lai/kudi/agent/savings/data/api/SavingsApi;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/savings/data/api/SavingsApi;Lai/kudi/agent/core/schedulers/RxSchedulers;)V", "fetchAllSavings", "Lio/reactivex/Observable;", "", "Lai/kudi/agent/savings/data/model/SavingResponse;", "fetchSavingByDate", "from", "", "to", "getBalance", "Lai/kudi/agent/savings/data/model/SavingsBalance;", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SavingsPlan {
    private final FetchCurrentUser fetchCurrentUser;
    private final RxSchedulers rxSchedulers;
    private final SavingsApi savingsService;

    public SavingsPlan(FetchCurrentUser fetchCurrentUser, SavingsApi savingsApi, RxSchedulers rxSchedulers) {
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
    /* renamed from: fetchAllSavings$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m40579fetchAllSavings$lambda0(SavingsPlan savingsPlan, User user) {
        Log_OC.getArray(savingsPlan, "this$0");
        Log_OC.getArray(user, "it");
        SavingsApi $r2 = savingsPlan.savingsService;
        String $r3 = user.getSessionId();
        Log_OC.loadImage($r3, "it.sessionId");
        AbstractC11688p $r4 = $r2.getSavingPlan($r3);
        RxSchedulers $r5 = savingsPlan.rxSchedulers;
        p425j.p444e.Item $r6 = $r5.setSettings();
        return $r4.h0($r6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchAllSavings$lambda-1  reason: not valid java name */
    public static final List m40580fetchAllSavings$lambda1(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "it");
        Object $r1 = aPIResponse.data;
        List $r2 = (List) $r1;
        return $r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchSavingByDate$lambda-2  reason: not valid java name */
    public static final InterfaceC11692s m40581fetchSavingByDate$lambda2(SavingsPlan savingsPlan, String str, String str2, User user) {
        Log_OC.getArray(savingsPlan, "this$0");
        Log_OC.getArray(str, "$from");
        Log_OC.getArray(str2, "$to");
        Log_OC.getArray(user, "it");
        SavingsApi $r4 = savingsPlan.savingsService;
        String $r5 = user.getSessionId();
        Log_OC.loadImage($r5, "it.sessionId");
        AbstractC11688p $r6 = $r4.getSavingPlanByDate($r5, str, str2);
        RxSchedulers $r7 = savingsPlan.rxSchedulers;
        p425j.p444e.Item $r8 = $r7.setSettings();
        return $r6.h0($r8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchSavingByDate$lambda-3  reason: not valid java name */
    public static final List m40582fetchSavingByDate$lambda3(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "it");
        Object $r1 = aPIResponse.data;
        List $r2 = (List) $r1;
        return $r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getBalance$lambda-4  reason: not valid java name */
    public static final InterfaceC11692s m40583getBalance$lambda4(SavingsPlan savingsPlan, User user) {
        Log_OC.getArray(savingsPlan, "this$0");
        Log_OC.getArray(user, "it");
        SavingsApi $r2 = savingsPlan.savingsService;
        String $r3 = user.getSessionId();
        Log_OC.loadImage($r3, "it.sessionId");
        AbstractC11688p $r4 = $r2.getSavingsBalance($r3);
        RxSchedulers $r5 = savingsPlan.rxSchedulers;
        p425j.p444e.Item $r6 = $r5.setSettings();
        return $r4.h0($r6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getBalance$lambda-5  reason: not valid java name */
    public static final SavingsBalance m40584getBalance$lambda5(APIResponse aPIResponse) {
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
        AbstractC11688p $r4 = $r2.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.savings.usecase.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                SavingsPlan $r12 = SavingsPlan.this;
                User $r42 = (User) obj;
                InterfaceC11692s $r22 = SavingsPlan.m40579fetchAllSavings$lambda0($r12, $r42);
                return $r22;
            }
        });
        C0488c $r5 = C0488c.f1272d;
        AbstractC11688p $r42 = $r4.m10531O($r5);
        RxSchedulers $r6 = this.rxSchedulers;
        p425j.p444e.Item $r7 = $r6.main();
        AbstractC11688p $r43 = $r42.R($r7);
        RxSchedulers $r62 = this.rxSchedulers;
        p425j.p444e.Item $r72 = $r62.setSettings();
        AbstractC11688p $r44 = $r43.h0($r72);
        Log_OC.loadImage($r44, "fetchCurrentUser.execute().flatMapObservable {\n            savingsService.getSavingPlan(it.sessionId)\n                .subscribeOn(rxSchedulers.io())\n        }.map {\n            it.data\n        }.observeOn(rxSchedulers.main()).subscribeOn(rxSchedulers.io())");
        return $r44;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p fetchSavingByDate(final String str, final String str2) {
        Log_OC.getArray(str, "from");
        Log_OC.getArray(str2, "to");
        FetchCurrentUser $r3 = this.fetchCurrentUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        AbstractC11688p $r6 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.savings.usecase.AnnotationWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                SavingsPlan $r1 = SavingsPlan.this;
                String $r2 = str;
                String $r32 = str2;
                User $r62 = (User) obj;
                InterfaceC11692s $r42 = SavingsPlan.m40581fetchSavingByDate$lambda2($r1, $r2, $r32, $r62);
                return $r42;
            }
        });
        C0487b $r7 = C0487b.f1271e;
        AbstractC11688p $r62 = $r6.m10531O($r7);
        RxSchedulers $r8 = this.rxSchedulers;
        p425j.p444e.Item $r9 = $r8.main();
        AbstractC11688p $r63 = $r62.R($r9);
        RxSchedulers $r82 = this.rxSchedulers;
        p425j.p444e.Item $r92 = $r82.setSettings();
        AbstractC11688p $r64 = $r63.h0($r92);
        Log_OC.loadImage($r64, "fetchCurrentUser.execute().flatMapObservable {\n            savingsService.getSavingPlanByDate(it.sessionId, from, to)\n                .subscribeOn(rxSchedulers.io())\n        }.map {\n            it.data\n        }.observeOn(rxSchedulers.main()).subscribeOn(rxSchedulers.io())");
        return $r64;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p getBalance() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        AbstractC11688p $r4 = $r2.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.savings.usecase.e
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                SavingsPlan $r12 = SavingsPlan.this;
                User $r42 = (User) obj;
                InterfaceC11692s $r22 = SavingsPlan.m40583getBalance$lambda4($r12, $r42);
                return $r22;
            }
        });
        Coin $r5 = Coin.ZERO;
        AbstractC11688p $r42 = $r4.m10531O($r5);
        RxSchedulers $r6 = this.rxSchedulers;
        p425j.p444e.Item $r7 = $r6.setSettings();
        AbstractC11688p $r43 = $r42.h0($r7);
        RxSchedulers $r62 = this.rxSchedulers;
        p425j.p444e.Item $r72 = $r62.main();
        AbstractC11688p $r44 = $r43.R($r72);
        Log_OC.loadImage($r44, "fetchCurrentUser.execute().flatMapObservable {\n            savingsService.getSavingsBalance(it.sessionId).subscribeOn(rxSchedulers.io())\n        }.map {\n            it.data\n        }.subscribeOn(rxSchedulers.io()).observeOn(rxSchedulers.main())");
        return $r44;
    }
}

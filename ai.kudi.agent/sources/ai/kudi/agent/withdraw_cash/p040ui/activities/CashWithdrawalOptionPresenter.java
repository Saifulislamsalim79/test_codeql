package ai.kudi.agent.withdraw_cash.p040ui.activities;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p470j0.ClassWriter;
/* compiled from: CashWithdrawalOptionPresenter.kt */
@Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0006\u0010\f\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/ui/activities/CashWithdrawalOptionPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/withdraw_cash/ui/activities/CashWithdrawalOptionView;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "fetchUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "(Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "destroy", "", "onUssdWithdrawalOptionClicked", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.withdraw_cash.ui.activities.CashWithdrawalOptionPresenter */
/* loaded from: classes.dex */
public final class CashWithdrawalOptionPresenter extends C9410b<CashWithdrawalOptionView> {
    private final Analytics analytics;
    private final C11280b compositeDisposable;
    private final FetchCurrentUser fetchUser;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CashWithdrawalOptionPresenter(Analytics analytics, FetchCurrentUser fetchCurrentUser) {
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(fetchCurrentUser, "fetchUser");
        this.analytics = analytics;
        this.fetchUser = fetchCurrentUser;
        C11280b $r3 = new C11280b();
        this.compositeDisposable = $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onUssdWithdrawalOptionClicked$lambda-0  reason: not valid java name */
    public static final void m41802onUssdWithdrawalOptionClicked$lambda0(CashWithdrawalOptionPresenter cashWithdrawalOptionPresenter, User user) {
        Log_OC.getArray(cashWithdrawalOptionPresenter, "this$0");
        Analytics $r3 = cashWithdrawalOptionPresenter.analytics;
        String $r0 = user.getPhoneNumber();
        Log_OC.loadImage($r0, "it.phoneNumber");
        $r3.onUssdWithdrawalOptionClicked($r0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.C9410b, p272h.p364d.p365a.p366c.InterfaceC9413d
    public void destroy() {
        super.destroy();
        C11280b $r1 = this.compositeDisposable;
        $r1.m11212i();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onUssdWithdrawalOptionClicked() {
        FetchCurrentUser $r1 = this.fetchUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Item $r3 = ClassWriter.LogError();
        AbstractC11696w $r22 = $r2.u($r3);
        Item $r32 = ContextUtils.LogError();
        AbstractC11696w $r23 = $r22.n($r32);
        Object object = new Object() { // from class: ai.kudi.agent.withdraw_cash.ui.activities.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CashWithdrawalOptionPresenter $r12 = CashWithdrawalOptionPresenter.this;
                User $r33 = (User) obj;
                CashWithdrawalOptionPresenter.m41802onUssdWithdrawalOptionClicked$lambda0($r12, $r33);
            }
        };
        Log $r5 = Log.LOG;
        FavoritesArrayAdapter $r6 = $r23.s(object, $r5);
        Log_OC.loadImage($r6, "fetchUser.execute().subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())\n            .subscribe(\n                {\n                    analytics.onUssdWithdrawalOptionClicked(it.phoneNumber)\n                },\n                {\n                    it.printStackTrace()\n                }\n            )");
        C11280b $r7 = this.compositeDisposable;
        RxExtKt.addTo($r6, $r7);
    }
}

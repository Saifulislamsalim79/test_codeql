package ai.kudi.agent.transactions.presenters;

import ai.kudi.agent.bills.data.Biller;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.product.other_bills.p018ui.BillPaymentStepOneFragment;
import ai.kudi.agent.transactions.views.PendingVerificationView;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import p272h.p364d.p365a.p366c.LoginListener;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p450e0.Object;
/* compiled from: PendingVerificationPresenter.kt */
@Metadata(m10422d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m10421d2 = {"Lai/kudi/agent/transactions/presenters/PendingVerificationPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpPresenter;", "Lai/kudi/agent/transactions/views/PendingVerificationView;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/analytics/Analytics;)V", "attachView", "", "view", "destroy", "detachView", "retainInstance", "", "onViewCreated", BillPaymentStepOneFragment.BILLER_PARAM, "Lai/kudi/agent/bills/data/Biller;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PendingVerificationPresenter implements InterfaceC9413d<PendingVerificationView> {
    private final Analytics analytics;
    private final FetchCurrentUser fetchCurrentUser;

    public PendingVerificationPresenter(FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(analytics, "analytics");
        this.fetchCurrentUser = fetchCurrentUser;
        this.analytics = analytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m41163onViewCreated$lambda0(PendingVerificationPresenter pendingVerificationPresenter, Biller biller, User user) {
        Log_OC.getArray(pendingVerificationPresenter, "this$0");
        Log_OC.getArray(biller, "$biller");
        Analytics $r3 = pendingVerificationPresenter.analytics;
        String $r4 = user.getPhoneNumber();
        Log_OC.loadImage($r4, "it.phoneNumber");
        String $r5 = biller.getName();
        String $r6 = biller.getLookupId();
        $r3.onBillerMenuClick($r4, $r5, $r6);
    }

    public void attachView(PendingVerificationView pendingVerificationView) {
        Log_OC.getArray(pendingVerificationView, "view");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void attachView(LoginListener loginListener) {
        PendingVerificationView $r2 = (PendingVerificationView) loginListener;
        attachView($r2);
    }

    @Override // p272h.p364d.p365a.p366c.InterfaceC9413d
    public void destroy() {
    }

    @Override // p272h.p364d.p365a.p366c.InterfaceC9413d
    public void detachView() {
    }

    public void detachView(boolean z) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onViewCreated(final Biller biller) {
        Log_OC.getArray(biller, BillPaymentStepOneFragment.BILLER_PARAM);
        FetchCurrentUser $r2 = this.fetchCurrentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        p425j.p444e.Item $r4 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11696w $r32 = $r3.u($r4);
        p425j.p444e.Item $r42 = ContextUtils.LogError();
        AbstractC11696w $r33 = $r32.n($r42);
        Object object = new Object() { // from class: ai.kudi.agent.transactions.presenters.Options
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PendingVerificationPresenter $r1 = PendingVerificationPresenter.this;
                Biller $r22 = biller;
                User $r43 = (User) obj;
                PendingVerificationPresenter.m41163onViewCreated$lambda0($r1, $r22, $r43);
            }
        };
        Constants $r6 = Constants.INSTANCE;
        $r33.s(object, $r6);
    }
}

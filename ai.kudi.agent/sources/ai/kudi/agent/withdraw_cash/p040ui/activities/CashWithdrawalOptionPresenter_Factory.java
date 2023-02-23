package ai.kudi.agent.withdraw_cash.p040ui.activities;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.withdraw_cash.ui.activities.CashWithdrawalOptionPresenter_Factory */
/* loaded from: classes.dex */
public final class CashWithdrawalOptionPresenter_Factory implements InterfaceC9468d<CashWithdrawalOptionPresenter> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchUserProvider;

    public CashWithdrawalOptionPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.analyticsProvider = interfaceC11700a;
        this.fetchUserProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CashWithdrawalOptionPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        CashWithdrawalOptionPresenter_Factory $r2 = new CashWithdrawalOptionPresenter_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CashWithdrawalOptionPresenter newInstance(Analytics analytics, FetchCurrentUser fetchCurrentUser) {
        CashWithdrawalOptionPresenter $r2 = new CashWithdrawalOptionPresenter(analytics, fetchCurrentUser);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CashWithdrawalOptionPresenter multiply() {
        InterfaceC11700a $r1 = this.analyticsProvider;
        Object $r2 = $r1.get();
        Analytics $r3 = (Analytics) $r2;
        InterfaceC11700a $r12 = this.fetchUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        CashWithdrawalOptionPresenter $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41804multiply() {
        CashWithdrawalOptionPresenter $r1 = multiply();
        return $r1;
    }
}

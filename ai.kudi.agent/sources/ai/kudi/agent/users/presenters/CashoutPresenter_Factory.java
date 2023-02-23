package ai.kudi.agent.users.presenters;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.users.domain.usecases.AccountLookup;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class CashoutPresenter_Factory implements InterfaceC9468d<CashoutPresenter> {
    private final InterfaceC11700a<AccountLookup> accountLookupProvider;
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchUserProvider;

    public CashoutPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.accountLookupProvider = interfaceC11700a;
        this.fetchUserProvider = interfaceC11700a2;
        this.analyticsProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CashoutPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        CashoutPresenter_Factory $r3 = new CashoutPresenter_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CashoutPresenter newInstance(AccountLookup accountLookup, FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        CashoutPresenter $r3 = new CashoutPresenter(accountLookup, fetchCurrentUser, analytics);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CashoutPresenter multiply() {
        InterfaceC11700a $r1 = this.accountLookupProvider;
        Object $r2 = $r1.get();
        AccountLookup $r3 = (AccountLookup) $r2;
        InterfaceC11700a $r12 = this.fetchUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        InterfaceC11700a $r13 = this.analyticsProvider;
        Object $r23 = $r13.get();
        Analytics $r5 = (Analytics) $r23;
        CashoutPresenter $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41466multiply() {
        CashoutPresenter $r1 = multiply();
        return $r1;
    }
}

package ai.kudi.agent.kshock.presentation;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.kshock.navigator.KShockNavigator;
import ai.kudi.agent.kshock.usecases.FetchKshockAvailabilty;
import ai.kudi.agent.kshock.usecases.FetchPendingLoan;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import android.content.SharedPreferences;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class KShockViewModel_Factory implements InterfaceC9468d<KShockViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<FetchKshockAvailabilty> fetchKshockAvailabiltyProvider;
    private final InterfaceC11700a<FetchPendingLoan> fetchPendingLoanProvider;
    private final InterfaceC11700a<KShockNavigator> kShockNavigatorProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;

    public KShockViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6) {
        this.currentUserProvider = interfaceC11700a;
        this.kShockNavigatorProvider = interfaceC11700a2;
        this.analyticsProvider = interfaceC11700a3;
        this.fetchPendingLoanProvider = interfaceC11700a4;
        this.fetchKshockAvailabiltyProvider = interfaceC11700a5;
        this.sharedPreferencesProvider = interfaceC11700a6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static KShockViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6) {
        KShockViewModel_Factory $r6 = new KShockViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static KShockViewModel newInstance(FetchCurrentUser fetchCurrentUser, KShockNavigator kShockNavigator, Analytics analytics, FetchPendingLoan fetchPendingLoan, FetchKshockAvailabilty fetchKshockAvailabilty, SharedPreferences sharedPreferences) {
        KShockViewModel $r6 = new KShockViewModel(fetchCurrentUser, kShockNavigator, analytics, fetchPendingLoan, fetchKshockAvailabilty, sharedPreferences);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public KShockViewModel multiply() {
        InterfaceC11700a $r1 = this.currentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.kShockNavigatorProvider;
        Object $r22 = $r12.get();
        KShockNavigator $r4 = (KShockNavigator) $r22;
        InterfaceC11700a $r13 = this.analyticsProvider;
        Object $r23 = $r13.get();
        Analytics $r5 = (Analytics) $r23;
        InterfaceC11700a $r14 = this.fetchPendingLoanProvider;
        Object $r24 = $r14.get();
        FetchPendingLoan $r6 = (FetchPendingLoan) $r24;
        InterfaceC11700a $r15 = this.fetchKshockAvailabiltyProvider;
        Object $r25 = $r15.get();
        FetchKshockAvailabilty fetchKshockAvailabilty = (FetchKshockAvailabilty) $r25;
        InterfaceC11700a $r16 = this.sharedPreferencesProvider;
        Object $r26 = $r16.get();
        KShockViewModel $r9 = newInstance($r3, $r4, $r5, $r6, fetchKshockAvailabilty, (SharedPreferences) $r26);
        return $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39590multiply() {
        KShockViewModel $r1 = multiply();
        return $r1;
    }
}

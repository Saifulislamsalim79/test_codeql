package ai.kudi.agent.product.airtime_data.presenter;

import ai.kudi.agent.bills.domain.usecases.PerformServiceFeeLookup;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.product.navigators.ProductNavigator;
import ai.kudi.agent.product.repository.BillerRepository;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import android.content.SharedPreferences;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class AirtimeAndDataPresenter_Factory implements InterfaceC9468d<AirtimeAndDataPresenter> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<BillerRepository> billerRepositoryProvider;
    private final InterfaceC11700a<PerformServiceFeeLookup> feesLookupProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchUserProvider;
    private final InterfaceC11700a<ProductNavigator> navigatorProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;

    public AirtimeAndDataPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6) {
        this.navigatorProvider = interfaceC11700a;
        this.fetchUserProvider = interfaceC11700a2;
        this.feesLookupProvider = interfaceC11700a3;
        this.analyticsProvider = interfaceC11700a4;
        this.sharedPreferencesProvider = interfaceC11700a5;
        this.billerRepositoryProvider = interfaceC11700a6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AirtimeAndDataPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6) {
        AirtimeAndDataPresenter_Factory $r6 = new AirtimeAndDataPresenter_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AirtimeAndDataPresenter newInstance(ProductNavigator productNavigator, FetchCurrentUser fetchCurrentUser, PerformServiceFeeLookup performServiceFeeLookup, Analytics analytics, SharedPreferences sharedPreferences, BillerRepository billerRepository) {
        AirtimeAndDataPresenter $r6 = new AirtimeAndDataPresenter(productNavigator, fetchCurrentUser, performServiceFeeLookup, analytics, sharedPreferences, billerRepository);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AirtimeAndDataPresenter multiply() {
        InterfaceC11700a $r1 = this.navigatorProvider;
        Object $r2 = $r1.get();
        ProductNavigator $r3 = (ProductNavigator) $r2;
        InterfaceC11700a $r12 = this.fetchUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        InterfaceC11700a $r13 = this.feesLookupProvider;
        Object $r23 = $r13.get();
        PerformServiceFeeLookup $r5 = (PerformServiceFeeLookup) $r23;
        InterfaceC11700a $r14 = this.analyticsProvider;
        Object $r24 = $r14.get();
        Analytics $r6 = (Analytics) $r24;
        InterfaceC11700a $r15 = this.sharedPreferencesProvider;
        Object $r25 = $r15.get();
        SharedPreferences sharedPreferences = (SharedPreferences) $r25;
        InterfaceC11700a $r16 = this.billerRepositoryProvider;
        Object $r26 = $r16.get();
        AirtimeAndDataPresenter $r9 = newInstance($r3, $r4, $r5, $r6, sharedPreferences, (BillerRepository) $r26);
        return $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40169multiply() {
        AirtimeAndDataPresenter $r1 = multiply();
        return $r1;
    }
}

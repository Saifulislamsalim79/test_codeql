package ai.kudi.agent.wallettopup.viewmodels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.wallettopup.data.FetchBanksWithMethods;
import android.app.Application;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class PaymentMethodViewModel_Factory implements InterfaceC9468d<PaymentMethodViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<Application> appProvider;
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<FetchBanksWithMethods> fetchBanksWithMethodsProvider;

    public PaymentMethodViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        this.currentUserProvider = interfaceC11700a;
        this.fetchBanksWithMethodsProvider = interfaceC11700a2;
        this.analyticsProvider = interfaceC11700a3;
        this.appProvider = interfaceC11700a4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PaymentMethodViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        PaymentMethodViewModel_Factory $r4 = new PaymentMethodViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PaymentMethodViewModel newInstance(FetchCurrentUser fetchCurrentUser, FetchBanksWithMethods fetchBanksWithMethods, Analytics analytics, Application application) {
        PaymentMethodViewModel $r4 = new PaymentMethodViewModel(fetchCurrentUser, fetchBanksWithMethods, analytics, application);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PaymentMethodViewModel multiply() {
        InterfaceC11700a $r1 = this.currentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.fetchBanksWithMethodsProvider;
        Object $r22 = $r12.get();
        FetchBanksWithMethods $r4 = (FetchBanksWithMethods) $r22;
        InterfaceC11700a $r13 = this.analyticsProvider;
        Object $r23 = $r13.get();
        Analytics $r5 = (Analytics) $r23;
        InterfaceC11700a $r14 = this.appProvider;
        Object $r24 = $r14.get();
        Application $r6 = (Application) $r24;
        PaymentMethodViewModel $r7 = newInstance($r3, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41785multiply() {
        PaymentMethodViewModel $r1 = multiply();
        return $r1;
    }
}

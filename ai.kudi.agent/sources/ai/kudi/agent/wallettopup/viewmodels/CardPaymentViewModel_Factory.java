package ai.kudi.agent.wallettopup.viewmodels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.payments.domain.usecases.FetchPaymentMethods;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import android.app.Application;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class CardPaymentViewModel_Factory implements InterfaceC9468d<CardPaymentViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<Application> appProvider;
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<FetchPaymentMethods> fetchPaymentMethodsProvider;

    public CardPaymentViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        this.fetchPaymentMethodsProvider = interfaceC11700a;
        this.analyticsProvider = interfaceC11700a2;
        this.currentUserProvider = interfaceC11700a3;
        this.appProvider = interfaceC11700a4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CardPaymentViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        CardPaymentViewModel_Factory $r4 = new CardPaymentViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CardPaymentViewModel newInstance(FetchPaymentMethods fetchPaymentMethods, Analytics analytics, FetchCurrentUser fetchCurrentUser, Application application) {
        CardPaymentViewModel $r4 = new CardPaymentViewModel(fetchPaymentMethods, analytics, fetchCurrentUser, application);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CardPaymentViewModel multiply() {
        InterfaceC11700a $r1 = this.fetchPaymentMethodsProvider;
        Object $r2 = $r1.get();
        FetchPaymentMethods $r3 = (FetchPaymentMethods) $r2;
        InterfaceC11700a $r12 = this.analyticsProvider;
        Object $r22 = $r12.get();
        Analytics $r4 = (Analytics) $r22;
        InterfaceC11700a $r13 = this.currentUserProvider;
        Object $r23 = $r13.get();
        FetchCurrentUser $r5 = (FetchCurrentUser) $r23;
        InterfaceC11700a $r14 = this.appProvider;
        Object $r24 = $r14.get();
        Application $r6 = (Application) $r24;
        CardPaymentViewModel $r7 = newInstance($r3, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41776multiply() {
        CardPaymentViewModel $r1 = multiply();
        return $r1;
    }
}

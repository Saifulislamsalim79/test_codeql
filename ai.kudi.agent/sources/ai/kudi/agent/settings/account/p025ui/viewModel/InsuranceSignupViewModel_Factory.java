package ai.kudi.agent.settings.account.p025ui.viewModel;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.settings.domain.useCases.InsuranceRequests;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import android.app.Application;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.account.ui.viewModel.InsuranceSignupViewModel_Factory */
/* loaded from: classes.dex */
public final class InsuranceSignupViewModel_Factory implements InterfaceC9468d<InsuranceSignupViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<Application> applicationProvider;
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<InsuranceRequests> insuranceRequestsProvider;

    public InsuranceSignupViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        this.analyticsProvider = interfaceC11700a;
        this.currentUserProvider = interfaceC11700a2;
        this.insuranceRequestsProvider = interfaceC11700a3;
        this.applicationProvider = interfaceC11700a4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InsuranceSignupViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        InsuranceSignupViewModel_Factory $r4 = new InsuranceSignupViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InsuranceSignupViewModel newInstance(Analytics analytics, FetchCurrentUser fetchCurrentUser, InsuranceRequests insuranceRequests, Application application) {
        InsuranceSignupViewModel $r4 = new InsuranceSignupViewModel(analytics, fetchCurrentUser, insuranceRequests, application);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public InsuranceSignupViewModel multiply() {
        InterfaceC11700a $r1 = this.analyticsProvider;
        Object $r2 = $r1.get();
        Analytics $r3 = (Analytics) $r2;
        InterfaceC11700a $r12 = this.currentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        InterfaceC11700a $r13 = this.insuranceRequestsProvider;
        Object $r23 = $r13.get();
        InsuranceRequests $r5 = (InsuranceRequests) $r23;
        InterfaceC11700a $r14 = this.applicationProvider;
        Object $r24 = $r14.get();
        Application $r6 = (Application) $r24;
        InsuranceSignupViewModel $r7 = newInstance($r3, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40718multiply() {
        InsuranceSignupViewModel $r1 = multiply();
        return $r1;
    }
}

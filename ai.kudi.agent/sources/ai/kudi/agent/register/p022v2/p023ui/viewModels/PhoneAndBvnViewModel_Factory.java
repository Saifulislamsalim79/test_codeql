package ai.kudi.agent.register.p022v2.p023ui.viewModels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.login.domain.usecases.CreateTempAgent;
import ai.kudi.agent.register.domain.usecases.BaseOtpUtil;
import ai.kudi.agent.register.domain.usecases.BvnLookup;
import ai.kudi.agent.register.domain.usecases.CheckIfBvnExists;
import ai.kudi.agent.register.navigators.RegisterNavigator;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.register.v2.ui.viewModels.PhoneAndBvnViewModel_Factory */
/* loaded from: classes.dex */
public final class PhoneAndBvnViewModel_Factory implements InterfaceC9468d<PhoneAndBvnViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<BaseOtpUtil> baseOtpUtilProvider;
    private final InterfaceC11700a<BvnLookup> bvnLookupProvider;
    private final InterfaceC11700a<CheckIfBvnExists> checkIfBvnExistsProvider;
    private final InterfaceC11700a<CreateTempAgent> createTempAgentProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<RegisterNavigator> navigatorProvider;

    public PhoneAndBvnViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7) {
        this.createTempAgentProvider = interfaceC11700a;
        this.analyticsProvider = interfaceC11700a2;
        this.bvnLookupProvider = interfaceC11700a3;
        this.baseOtpUtilProvider = interfaceC11700a4;
        this.navigatorProvider = interfaceC11700a5;
        this.checkIfBvnExistsProvider = interfaceC11700a6;
        this.fetchCurrentUserProvider = interfaceC11700a7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PhoneAndBvnViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7) {
        PhoneAndBvnViewModel_Factory $r7 = new PhoneAndBvnViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6, interfaceC11700a7);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PhoneAndBvnViewModel newInstance(CreateTempAgent createTempAgent, Analytics analytics, BvnLookup bvnLookup, BaseOtpUtil baseOtpUtil, RegisterNavigator registerNavigator, CheckIfBvnExists checkIfBvnExists, FetchCurrentUser fetchCurrentUser) {
        PhoneAndBvnViewModel $r7 = new PhoneAndBvnViewModel(createTempAgent, analytics, bvnLookup, baseOtpUtil, registerNavigator, checkIfBvnExists, fetchCurrentUser);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PhoneAndBvnViewModel multiply() {
        InterfaceC11700a $r1 = this.createTempAgentProvider;
        Object $r2 = $r1.get();
        CreateTempAgent $r3 = (CreateTempAgent) $r2;
        InterfaceC11700a $r12 = this.analyticsProvider;
        Object $r22 = $r12.get();
        Analytics $r4 = (Analytics) $r22;
        InterfaceC11700a $r13 = this.bvnLookupProvider;
        Object $r23 = $r13.get();
        BvnLookup $r5 = (BvnLookup) $r23;
        InterfaceC11700a $r14 = this.baseOtpUtilProvider;
        Object $r24 = $r14.get();
        BaseOtpUtil baseOtpUtil = (BaseOtpUtil) $r24;
        InterfaceC11700a $r15 = this.navigatorProvider;
        Object $r25 = $r15.get();
        RegisterNavigator registerNavigator = (RegisterNavigator) $r25;
        InterfaceC11700a $r16 = this.checkIfBvnExistsProvider;
        Object $r26 = $r16.get();
        CheckIfBvnExists checkIfBvnExists = (CheckIfBvnExists) $r26;
        InterfaceC11700a $r17 = this.fetchCurrentUserProvider;
        Object $r27 = $r17.get();
        FetchCurrentUser $r9 = (FetchCurrentUser) $r27;
        PhoneAndBvnViewModel $r10 = newInstance($r3, $r4, $r5, baseOtpUtil, registerNavigator, checkIfBvnExists, $r9);
        return $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40494multiply() {
        PhoneAndBvnViewModel $r1 = multiply();
        return $r1;
    }
}

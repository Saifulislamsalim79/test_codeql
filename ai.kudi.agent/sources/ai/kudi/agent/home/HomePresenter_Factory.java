package ai.kudi.agent.home;

import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.notification.domain.FetchNotificationCount;
import ai.kudi.agent.postRegistrationSetUp.usecases.FetchTodo;
import ai.kudi.agent.register.domain.usecases.VerifyId;
import ai.kudi.agent.settings.domain.useCases.InsuranceRequests;
import ai.kudi.agent.users.data.repositories.UserRepository;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.users.domain.usecases.FetchWallet;
import ai.kudi.agent.users.domain.usecases.RegisterFcm;
import ai.kudi.agent.users.domain.usecases.UpdateUser;
import ai.kudi.agent.wallettopup.data.FetchMiniMonnifyDetails;
import android.content.SharedPreferences;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class HomePresenter_Factory implements InterfaceC9468d<HomePresenter> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<FetchMiniMonnifyDetails> fetchBankWithMethodsProvider;
    private final InterfaceC11700a<FetchNotificationCount> fetchNotificationCountProvider;
    private final InterfaceC11700a<FetchTodo> fetchTodoProvider;
    private final InterfaceC11700a<FetchWallet> fetchWalletProvider;
    private final InterfaceC11700a<InsuranceRequests> insuranceRequestsProvider;
    private final InterfaceC11700a<RegisterFcm> registerFcmProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;
    private final InterfaceC11700a<SmartLookAnalytics> smartLookAnalyticsProvider;
    private final InterfaceC11700a<UpdateUser> updateUserProvider;
    private final InterfaceC11700a<UserRepository> userRepoProvider;
    private final InterfaceC11700a<VerifyId> verifyIdProvider;

    public HomePresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7, InterfaceC11700a interfaceC11700a8, InterfaceC11700a interfaceC11700a9, InterfaceC11700a interfaceC11700a10, InterfaceC11700a interfaceC11700a11, InterfaceC11700a interfaceC11700a12, InterfaceC11700a interfaceC11700a13) {
        this.currentUserProvider = interfaceC11700a;
        this.fetchBankWithMethodsProvider = interfaceC11700a2;
        this.fetchNotificationCountProvider = interfaceC11700a3;
        this.fetchWalletProvider = interfaceC11700a4;
        this.analyticsProvider = interfaceC11700a5;
        this.fetchTodoProvider = interfaceC11700a6;
        this.registerFcmProvider = interfaceC11700a7;
        this.verifyIdProvider = interfaceC11700a8;
        this.smartLookAnalyticsProvider = interfaceC11700a9;
        this.insuranceRequestsProvider = interfaceC11700a10;
        this.userRepoProvider = interfaceC11700a11;
        this.updateUserProvider = interfaceC11700a12;
        this.sharedPreferencesProvider = interfaceC11700a13;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static HomePresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7, InterfaceC11700a interfaceC11700a8, InterfaceC11700a interfaceC11700a9, InterfaceC11700a interfaceC11700a10, InterfaceC11700a interfaceC11700a11, InterfaceC11700a interfaceC11700a12, InterfaceC11700a interfaceC11700a13) {
        HomePresenter_Factory $r13 = new HomePresenter_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6, interfaceC11700a7, interfaceC11700a8, interfaceC11700a9, interfaceC11700a10, interfaceC11700a11, interfaceC11700a12, interfaceC11700a13);
        return $r13;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static HomePresenter newInstance(FetchCurrentUser fetchCurrentUser, FetchMiniMonnifyDetails fetchMiniMonnifyDetails, FetchNotificationCount fetchNotificationCount, FetchWallet fetchWallet, Analytics analytics, FetchTodo fetchTodo, RegisterFcm registerFcm, VerifyId verifyId, SmartLookAnalytics smartLookAnalytics, InsuranceRequests insuranceRequests, UserRepository userRepository, UpdateUser updateUser, SharedPreferences sharedPreferences) {
        HomePresenter $r13 = new HomePresenter(fetchCurrentUser, fetchMiniMonnifyDetails, fetchNotificationCount, fetchWallet, analytics, fetchTodo, registerFcm, verifyId, smartLookAnalytics, insuranceRequests, userRepository, updateUser, sharedPreferences);
        return $r13;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public HomePresenter multiply() {
        InterfaceC11700a $r1 = this.currentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser fetchCurrentUser = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.fetchBankWithMethodsProvider;
        Object $r22 = $r12.get();
        FetchMiniMonnifyDetails fetchMiniMonnifyDetails = (FetchMiniMonnifyDetails) $r22;
        InterfaceC11700a $r13 = this.fetchNotificationCountProvider;
        Object $r23 = $r13.get();
        FetchNotificationCount fetchNotificationCount = (FetchNotificationCount) $r23;
        InterfaceC11700a $r14 = this.fetchWalletProvider;
        Object $r24 = $r14.get();
        FetchWallet fetchWallet = (FetchWallet) $r24;
        InterfaceC11700a $r15 = this.analyticsProvider;
        Object $r25 = $r15.get();
        Analytics analytics = (Analytics) $r25;
        InterfaceC11700a $r16 = this.fetchTodoProvider;
        Object $r26 = $r16.get();
        FetchTodo fetchTodo = (FetchTodo) $r26;
        InterfaceC11700a $r17 = this.registerFcmProvider;
        Object $r27 = $r17.get();
        RegisterFcm $r9 = (RegisterFcm) $r27;
        InterfaceC11700a $r18 = this.verifyIdProvider;
        Object $r28 = $r18.get();
        VerifyId $r10 = (VerifyId) $r28;
        InterfaceC11700a $r19 = this.smartLookAnalyticsProvider;
        Object $r29 = $r19.get();
        SmartLookAnalytics $r11 = (SmartLookAnalytics) $r29;
        InterfaceC11700a $r110 = this.insuranceRequestsProvider;
        Object $r210 = $r110.get();
        InsuranceRequests $r122 = (InsuranceRequests) $r210;
        InterfaceC11700a $r111 = this.userRepoProvider;
        Object $r211 = $r111.get();
        UserRepository $r132 = (UserRepository) $r211;
        InterfaceC11700a $r112 = this.updateUserProvider;
        Object $r212 = $r112.get();
        UpdateUser $r142 = (UpdateUser) $r212;
        InterfaceC11700a $r113 = this.sharedPreferencesProvider;
        Object $r213 = $r113.get();
        SharedPreferences $r152 = (SharedPreferences) $r213;
        HomePresenter $r162 = newInstance(fetchCurrentUser, fetchMiniMonnifyDetails, fetchNotificationCount, fetchWallet, analytics, fetchTodo, $r9, $r10, $r11, $r122, $r132, $r142, $r152);
        return $r162;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39326multiply() {
        HomePresenter $r1 = multiply();
        return $r1;
    }
}

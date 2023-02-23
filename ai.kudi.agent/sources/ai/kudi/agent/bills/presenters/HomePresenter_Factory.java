package ai.kudi.agent.bills.presenters;

import ai.kudi.agent.bills.data.AnnouncementRepository;
import ai.kudi.agent.bills.domain.usecases.FetchFrequentlyUsedBills;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.kshock.usecases.FetchKshockAvailabilty;
import ai.kudi.agent.postRegistrationSetUp.usecases.FetchTodo;
import ai.kudi.agent.product.repository.BillerRepository;
import ai.kudi.agent.savings.data.repository.SavingsRepository;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class HomePresenter_Factory implements InterfaceC9468d<HomePresenter> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<AnnouncementRepository> announcementRepositoryProvider;
    private final InterfaceC11700a<BillerRepository> billerRepositoryProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<FetchFrequentlyUsedBills> fetchFrequentlyUsedBillsProvider;
    private final InterfaceC11700a<FetchKshockAvailabilty> fetchKshockEligibilityProvider;
    private final InterfaceC11700a<FetchTodo> fetchTodoProvider;
    private final InterfaceC11700a<SavingsRepository> savingsServiceProvider;
    private final InterfaceC11700a<RxSchedulers> schedulersProvider;

    public HomePresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7, InterfaceC11700a interfaceC11700a8, InterfaceC11700a interfaceC11700a9) {
        this.fetchCurrentUserProvider = interfaceC11700a;
        this.billerRepositoryProvider = interfaceC11700a2;
        this.fetchFrequentlyUsedBillsProvider = interfaceC11700a3;
        this.announcementRepositoryProvider = interfaceC11700a4;
        this.analyticsProvider = interfaceC11700a5;
        this.fetchTodoProvider = interfaceC11700a6;
        this.fetchKshockEligibilityProvider = interfaceC11700a7;
        this.savingsServiceProvider = interfaceC11700a8;
        this.schedulersProvider = interfaceC11700a9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static HomePresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7, InterfaceC11700a interfaceC11700a8, InterfaceC11700a interfaceC11700a9) {
        HomePresenter_Factory $r9 = new HomePresenter_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6, interfaceC11700a7, interfaceC11700a8, interfaceC11700a9);
        return $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static HomePresenter newInstance(FetchCurrentUser fetchCurrentUser, BillerRepository billerRepository, FetchFrequentlyUsedBills fetchFrequentlyUsedBills, AnnouncementRepository announcementRepository, Analytics analytics, FetchTodo fetchTodo, FetchKshockAvailabilty fetchKshockAvailabilty, SavingsRepository savingsRepository, RxSchedulers rxSchedulers) {
        HomePresenter $r9 = new HomePresenter(fetchCurrentUser, billerRepository, fetchFrequentlyUsedBills, announcementRepository, analytics, fetchTodo, fetchKshockAvailabilty, savingsRepository, rxSchedulers);
        return $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public HomePresenter multiply() {
        InterfaceC11700a $r1 = this.fetchCurrentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.billerRepositoryProvider;
        Object $r22 = $r12.get();
        BillerRepository $r4 = (BillerRepository) $r22;
        InterfaceC11700a $r13 = this.fetchFrequentlyUsedBillsProvider;
        Object $r23 = $r13.get();
        FetchFrequentlyUsedBills fetchFrequentlyUsedBills = (FetchFrequentlyUsedBills) $r23;
        InterfaceC11700a $r14 = this.announcementRepositoryProvider;
        Object $r24 = $r14.get();
        AnnouncementRepository announcementRepository = (AnnouncementRepository) $r24;
        InterfaceC11700a $r15 = this.analyticsProvider;
        Object $r25 = $r15.get();
        Analytics analytics = (Analytics) $r25;
        InterfaceC11700a $r16 = this.fetchTodoProvider;
        Object $r26 = $r16.get();
        FetchTodo fetchTodo = (FetchTodo) $r26;
        InterfaceC11700a $r17 = this.fetchKshockEligibilityProvider;
        Object $r27 = $r17.get();
        FetchKshockAvailabilty $r9 = (FetchKshockAvailabilty) $r27;
        InterfaceC11700a $r18 = this.savingsServiceProvider;
        Object $r28 = $r18.get();
        SavingsRepository $r10 = (SavingsRepository) $r28;
        InterfaceC11700a $r19 = this.schedulersProvider;
        Object $r29 = $r19.get();
        RxSchedulers $r11 = (RxSchedulers) $r29;
        HomePresenter $r122 = newInstance($r3, $r4, fetchFrequentlyUsedBills, announcementRepository, analytics, fetchTodo, $r9, $r10, $r11);
        return $r122;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39072multiply() {
        HomePresenter $r1 = multiply();
        return $r1;
    }
}

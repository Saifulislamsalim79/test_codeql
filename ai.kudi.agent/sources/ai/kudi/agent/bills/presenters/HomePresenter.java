package ai.kudi.agent.bills.presenters;

import ai.kudi.agent.bills.data.AnnouncementRepository;
import ai.kudi.agent.bills.data.BillerFactory;
import ai.kudi.agent.bills.domain.usecases.FetchFrequentlyUsedBills;
import ai.kudi.agent.bills.views.HomeView;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.analytics.contracts.HomeAnalytics;
import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.domain.room_entities.Announcement;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.kshock.data.model.KshockEligibility;
import ai.kudi.agent.kshock.usecases.FetchKshockAvailabilty;
import ai.kudi.agent.postRegistrationSetUp.data.TodoResponse;
import ai.kudi.agent.postRegistrationSetUp.usecases.FetchTodo;
import ai.kudi.agent.product.repository.BillerRepository;
import ai.kudi.agent.savings.data.repository.SavingsRepository;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import io.intercom.android.sdk.models.Part;
import java.util.ArrayList;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
import p590o.p591a.Timber;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: HomePresenter.kt */
@Metadata(m10422d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BO\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0006\u0010\u001c\u001a\u00020\u001bJ\u0006\u0010\u001d\u001a\u00020\u001bJ\u000e\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020\u001bJ\u0006\u0010\"\u001a\u00020\u001bJ\u000e\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020(J\u000e\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020+J\b\u0010,\u001a\u00020\u001bH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, m10421d2 = {"Lai/kudi/agent/bills/presenters/HomePresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/bills/views/HomeView;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "billerRepository", "Lai/kudi/agent/product/repository/BillerRepository;", "fetchFrequentlyUsedBills", "Lai/kudi/agent/bills/domain/usecases/FetchFrequentlyUsedBills;", "announcementRepository", "Lai/kudi/agent/bills/data/AnnouncementRepository;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "fetchTodo", "Lai/kudi/agent/postRegistrationSetUp/usecases/FetchTodo;", "fetchKshockEligibility", "Lai/kudi/agent/kshock/usecases/FetchKshockAvailabilty;", "savingsService", "Lai/kudi/agent/savings/data/repository/SavingsRepository;", "schedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/product/repository/BillerRepository;Lai/kudi/agent/bills/domain/usecases/FetchFrequentlyUsedBills;Lai/kudi/agent/bills/data/AnnouncementRepository;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/postRegistrationSetUp/usecases/FetchTodo;Lai/kudi/agent/kshock/usecases/FetchKshockAvailabilty;Lai/kudi/agent/savings/data/repository/SavingsRepository;Lai/kudi/agent/core/schedulers/RxSchedulers;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposables", "()Lio/reactivex/disposables/CompositeDisposable;", "destroy", "", "fetchAnnouncements", "fetchFrequentlyUsedBillers", "fetchMiniKshockDetails", "customerType", "", "fetchTodos", "fetchUser", "logAnnouncementClicked", Part.LEGACY_ANNOUNCEMENT_STYLE, "Lai/kudi/agent/core/domain/room_entities/Announcement;", "logEvent", "event", "Lai/kudi/agent/core/analytics/contracts/HomeAnalytics$Events;", "retrieveSavings", "kshockDetails", "Lai/kudi/agent/kshock/data/model/KshockEligibility;", "updateUsedBillers", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class HomePresenter extends C9410b<HomeView> {
    private final Analytics analytics;
    private final AnnouncementRepository announcementRepository;
    private final BillerRepository billerRepository;
    private final C11280b disposables;
    private final FetchCurrentUser fetchCurrentUser;
    private final FetchFrequentlyUsedBills fetchFrequentlyUsedBills;
    private final FetchKshockAvailabilty fetchKshockEligibility;
    private final FetchTodo fetchTodo;
    private final SavingsRepository savingsService;
    private final RxSchedulers schedulers;

    /* compiled from: HomePresenter.kt */
    @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            HomeAnalytics.Events[] $r0 = HomeAnalytics.Events.values();
            int $i0 = $r0.length;
            int[] $r1 = new int[$i0];
            HomeAnalytics.Events $r2 = HomeAnalytics.Events.HOME_SCREEN_FUND_WALLET_CLICKED;
            int $i02 = $r2.ordinal();
            $r1[$i02] = 1;
            HomeAnalytics.Events $r22 = HomeAnalytics.Events.HOME_SCREEN_TRANSFER_CLICKED;
            int $i03 = $r22.ordinal();
            $r1[$i03] = 2;
            HomeAnalytics.Events $r23 = HomeAnalytics.Events.HOME_SCREEN_AIRTIME_DATA_CLICKED;
            int $i04 = $r23.ordinal();
            $r1[$i04] = 3;
            HomeAnalytics.Events $r24 = HomeAnalytics.Events.HOME_SCREEN_WITHDRAW_MONEY_CLICKED;
            int $i05 = $r24.ordinal();
            $r1[$i05] = 4;
            $EnumSwitchMapping$0 = $r1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public HomePresenter(FetchCurrentUser fetchCurrentUser, BillerRepository billerRepository, FetchFrequentlyUsedBills fetchFrequentlyUsedBills, AnnouncementRepository announcementRepository, Analytics analytics, FetchTodo fetchTodo, FetchKshockAvailabilty fetchKshockAvailabilty, SavingsRepository savingsRepository, RxSchedulers rxSchedulers) {
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(billerRepository, "billerRepository");
        Log_OC.getArray(fetchFrequentlyUsedBills, "fetchFrequentlyUsedBills");
        Log_OC.getArray(announcementRepository, "announcementRepository");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(fetchTodo, "fetchTodo");
        Log_OC.getArray(fetchKshockAvailabilty, "fetchKshockEligibility");
        Log_OC.getArray(savingsRepository, "savingsService");
        Log_OC.getArray(rxSchedulers, "schedulers");
        this.fetchCurrentUser = fetchCurrentUser;
        this.billerRepository = billerRepository;
        this.fetchFrequentlyUsedBills = fetchFrequentlyUsedBills;
        this.announcementRepository = announcementRepository;
        this.analytics = analytics;
        this.fetchTodo = fetchTodo;
        this.fetchKshockEligibility = fetchKshockAvailabilty;
        this.savingsService = savingsRepository;
        this.schedulers = rxSchedulers;
        C11280b $r10 = new C11280b();
        this.disposables = $r10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchAnnouncements$lambda-17  reason: not valid java name */
    public static final void m39044fetchAnnouncements$lambda17(HomePresenter homePresenter, final List list) {
        Log_OC.getArray(homePresenter, "this$0");
        homePresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.bills.presenters.l
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                List $r1 = list;
                HomeView $r3 = (HomeView) obj;
                HomePresenter.m39045fetchAnnouncements$lambda17$lambda16($r1, $r3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchAnnouncements$lambda-17$lambda-16  reason: not valid java name */
    public static final void m39045fetchAnnouncements$lambda17$lambda16(List list, HomeView homeView) {
        Log_OC.getArray(homeView, "view");
        Log_OC.loadImage(list, "it");
        homeView.showAnnouncements(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchFrequentlyUsedBillers$lambda-11  reason: not valid java name */
    public static final void m39047fetchFrequentlyUsedBillers$lambda11(HomePresenter homePresenter, final List list) {
        Log_OC.getArray(homePresenter, "this$0");
        Log_OC.loadImage(list, "billers");
        boolean $z0 = list.isEmpty();
        if (!$z0) {
            homePresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.bills.presenters.MethodWriter
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                /* renamed from: f */
                public final void m38973f(Object obj) {
                    List $r1 = list;
                    HomeView $r3 = (HomeView) obj;
                    HomePresenter.m39049fetchFrequentlyUsedBillers$lambda11$lambda9($r1, $r3);
                }
            });
            return;
        }
        State $r3 = State.completed;
        homePresenter.ifViewAttached($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchFrequentlyUsedBillers$lambda-11$lambda-10  reason: not valid java name */
    public static final void m39048fetchFrequentlyUsedBillers$lambda11$lambda10(HomeView homeView) {
        Log_OC.getArray(homeView, "it");
        BillerFactory $r1 = BillerFactory.INSTANCE;
        List $r2 = $r1.getBillers();
        homeView.showBillers($r2.subList(0, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchFrequentlyUsedBillers$lambda-11$lambda-9  reason: not valid java name */
    public static final void m39049fetchFrequentlyUsedBillers$lambda11$lambda9(List list, HomeView homeView) {
        Log_OC.getArray(homeView, "it");
        Log_OC.loadImage(list, "billers");
        homeView.showBillers(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchMiniKshockDetails$lambda-3  reason: not valid java name */
    public static final InterfaceC11692s m39051fetchMiniKshockDetails$lambda3(HomePresenter homePresenter, User user) {
        Log_OC.getArray(homePresenter, "this$0");
        Log_OC.getArray(user, "it");
        FetchKshockAvailabilty $r2 = homePresenter.fetchKshockEligibility;
        String $r3 = user.getSessionId();
        Log_OC.loadImage($r3, "it.sessionId");
        AbstractC11688p $r4 = $r2.execute($r3);
        return $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchMiniKshockDetails$lambda-4  reason: not valid java name */
    public static final void m39052fetchMiniKshockDetails$lambda4(HomePresenter homePresenter, KshockEligibility kshockEligibility) {
        Log_OC.getArray(homePresenter, "this$0");
        Log_OC.loadImage(kshockEligibility, "kshockDetails");
        homePresenter.retrieveSavings(kshockEligibility);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchMiniKshockDetails$lambda-5  reason: not valid java name */
    public static final void m39053fetchMiniKshockDetails$lambda5(Throwable th) {
        Log_OC.loadImage(th, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        CrashlyticsReport.logException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchTodos$lambda-21  reason: not valid java name */
    public static final InterfaceC11692s m39054fetchTodos$lambda21(HomePresenter homePresenter, User user) {
        Log_OC.getArray(homePresenter, "this$0");
        Log_OC.getArray(user, "it");
        FetchTodo $r2 = homePresenter.fetchTodo;
        String $r3 = user.getSessionId();
        Log_OC.loadImage($r3, "it.sessionId");
        AbstractC11688p $r4 = $r2.execute($r3);
        return $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0094, code lost:
        if (r14 == false) goto L20;
     */
    /* renamed from: fetchTodos$lambda-23  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m39055fetchTodos$lambda23(final java.util.List r22, ai.kudi.agent.bills.presenters.HomePresenter r23, ai.kudi.agent.postRegistrationSetUp.data.TodoResponse r24) {
        /*
            java.lang.String r2 = "$todos"
            r0 = r22
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r2)
            java.lang.String r2 = "this$0"
            r0 = r23
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r2)
            r0 = r24
            ai.kudi.agent.users.domain.package_1.Wallet r3 = r0.getWallet()
            double r4 = r3.getAmount()
            r7 = 0
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 > 0) goto L2d
            ai.kudi.agent.postRegistrationSetUp.adapter.TodoItem r9 = new ai.kudi.agent.postRegistrationSetUp.adapter.TodoItem
            java.lang.String r2 = "Fund your wallet to activate your account"
            r10 = 0
            r11 = 2
            r12 = 0
            r9.<init>(r2, r10, r11, r12)
            r0 = r22
            r0.add(r9)
        L2d:
            r0 = r24
            java.util.List r13 = r0.getCashoutAccounts()
            boolean r14 = r13.isEmpty()
            if (r14 == 0) goto L48
            ai.kudi.agent.postRegistrationSetUp.adapter.TodoItem r9 = new ai.kudi.agent.postRegistrationSetUp.adapter.TodoItem
            java.lang.String r2 = "Setup your bank accounts"
            r10 = 0
            r11 = 2
            r12 = 0
            r9.<init>(r2, r10, r11, r12)
            r0 = r22
            r0.add(r9)
        L48:
            r0 = r24
            java.lang.String r15 = r0.getKycLevel()
            ai.kudi.agent.settings.data.Constants r16 = ai.kudi.agent.settings.data.Constants.INSTANCE
            r0 = r16
            java.util.List r13 = r0.getKYC_LEVELS()
            r10 = 0
            java.lang.Object r17 = r13.get(r10)
            r0 = r17
            boolean r14 = kotlin.p483e0.p485d.Log_OC.append(r15, r0)
            if (r14 == 0) goto L72
            ai.kudi.agent.postRegistrationSetUp.adapter.TodoItem r9 = new ai.kudi.agent.postRegistrationSetUp.adapter.TodoItem
            java.lang.String r2 = "Upgrade your account to enjoy more"
            r10 = 0
            r11 = 2
            r12 = 0
            r9.<init>(r2, r10, r11, r12)
            r0 = r22
            r0.add(r9)
        L72:
            r0 = r24
            ai.kudi.agent.login.domain.wiki.InsuranceStatus r18 = r0.getInsuranceStatus()
            if (r18 == 0) goto L96
            r0 = r24
            ai.kudi.agent.login.domain.wiki.InsuranceStatus r18 = r0.getInsuranceStatus()
            r0 = r18
            java.lang.String r15 = r0.getStatus()
            ai.kudi.agent.settings.domain.useCases.InsuranceStatus r19 = ai.kudi.agent.settings.domain.useCases.InsuranceStatus.ACTIVE
            r0 = r19
            java.lang.String r20 = r0.name()
            r0 = r20
            boolean r14 = kotlin.p483e0.p485d.Log_OC.append(r15, r0)
            if (r14 != 0) goto La3
        L96:
            ai.kudi.agent.postRegistrationSetUp.adapter.TodoItem r9 = new ai.kudi.agent.postRegistrationSetUp.adapter.TodoItem
            java.lang.String r2 = "Insure your cash against theft, and loss Sign up for cash insurance"
            r10 = 1
            r9.<init>(r2, r10)
            r0 = r22
            r0.add(r9)
        La3:
            r0 = r24
            boolean r14 = r0.getShowPosPurchase()
            if (r14 == 0) goto Lb8
            ai.kudi.agent.postRegistrationSetUp.adapter.TodoItem r9 = new ai.kudi.agent.postRegistrationSetUp.adapter.TodoItem
            java.lang.String r2 = "Need a POS terminal? Get one here"
            r10 = 1
            r9.<init>(r2, r10)
            r0 = r22
            r0.add(r9)
        Lb8:
            ai.kudi.agent.bills.presenters.ViewTarget r21 = new ai.kudi.agent.bills.presenters.ViewTarget
            r0 = r21
            r1 = r22
            r0.<init>()
            r0 = r23
            r1 = r21
            r0.ifViewAttached(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.bills.presenters.HomePresenter.m39055fetchTodos$lambda23(java.util.List, ai.kudi.agent.bills.presenters.HomePresenter, ai.kudi.agent.postRegistrationSetUp.data.TodoResponse):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchTodos$lambda-23$lambda-22  reason: not valid java name */
    public static final void m39056fetchTodos$lambda23$lambda22(List list, HomeView homeView) {
        Log_OC.getArray(list, "$todos");
        Log_OC.getArray(homeView, "it");
        homeView.showTodoList(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchTodos$lambda-25  reason: not valid java name */
    public static final void m39057fetchTodos$lambda25(HomePresenter homePresenter, Throwable th) {
        Log_OC.getArray(homePresenter, "this$0");
        th.printStackTrace();
        Compression $r2 = Compression.METADATA;
        homePresenter.ifViewAttached($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchTodos$lambda-25$lambda-24  reason: not valid java name */
    public static final void m39058fetchTodos$lambda25$lambda24(HomeView homeView) {
        List $r1;
        Log_OC.getArray(homeView, "it");
        $r1 = C13726r.m3891e();
        homeView.showTodoList($r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchUser$lambda-1  reason: not valid java name */
    public static final void m39059fetchUser$lambda1(HomePresenter homePresenter, final User user) {
        Log_OC.getArray(homePresenter, "this$0");
        homePresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.bills.presenters.NavigationMenuPresenter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: e */
            public final void m38972e(Object obj) {
                User $r1 = User.this;
                HomeView $r3 = (HomeView) obj;
                HomePresenter.m39060fetchUser$lambda1$lambda0($r1, $r3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchUser$lambda-1$lambda-0  reason: not valid java name */
    public static final void m39060fetchUser$lambda1$lambda0(User user, HomeView homeView) {
        Log_OC.getArray(homeView, "view");
        Object[] $r2 = new Object[0];
        Timber.wtf("view called again", $r2);
        String $r3 = DateExtKt.greetingUsingHourOfDay();
        String $r4 = user.getFirstName();
        Log_OC.loadImage($r4, "it.firstName");
        homeView.greetUser($r3, $r4);
        Log_OC.loadImage(user, "it");
        homeView.showUserPicture(user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchUser$lambda-2  reason: not valid java name */
    public static final void m39061fetchUser$lambda2(Throwable th) {
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
        th.printStackTrace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: logEvent$lambda-19  reason: not valid java name */
    public static final void m39062logEvent$lambda19(HomeAnalytics.Events events, HomePresenter homePresenter, User user) {
        Log_OC.getArray(events, "$event");
        Log_OC.getArray(homePresenter, "this$0");
        int[] $r3 = WhenMappings.$EnumSwitchMapping$0;
        int $i0 = $r3[events.ordinal()];
        if ($i0 == 1) {
            Analytics $r4 = homePresenter.analytics;
            String $r5 = user.getPhoneNumber();
            Log_OC.loadImage($r5, "it.phoneNumber");
            $r4.onFundWalletClick($r5);
        } else if ($i0 == 2) {
            Analytics $r42 = homePresenter.analytics;
            String $r52 = user.getPhoneNumber();
            Log_OC.loadImage($r52, "it.phoneNumber");
            $r42.onTransferMenuClick($r52);
        } else if ($i0 == 3) {
            Analytics $r43 = homePresenter.analytics;
            String $r53 = user.getPhoneNumber();
            Log_OC.loadImage($r53, "it.phoneNumber");
            $r43.onAirtimeOrDataMenuClick($r53);
        } else if ($i0 != 4) {
        } else {
            Analytics $r44 = homePresenter.analytics;
            String $r54 = user.getPhoneNumber();
            Log_OC.loadImage($r54, "it.phoneNumber");
            $r44.onWithdrawMoneyMenuClick($r54);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: retrieveSavings$lambda-7  reason: not valid java name */
    public static final void m39064retrieveSavings$lambda7(HomePresenter homePresenter, final KshockEligibility kshockEligibility, final List list) {
        Log_OC.getArray(homePresenter, "this$0");
        Log_OC.getArray(kshockEligibility, "$kshockDetails");
        homePresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.bills.presenters.Progress
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void draw(Object obj) {
                KshockEligibility $r1 = KshockEligibility.this;
                List $r2 = list;
                HomeView $r4 = (HomeView) obj;
                HomePresenter.m39065retrieveSavings$lambda7$lambda6($r1, $r2, $r4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: retrieveSavings$lambda-7$lambda-6  reason: not valid java name */
    public static final void m39065retrieveSavings$lambda7$lambda6(KshockEligibility kshockEligibility, List list, HomeView homeView) {
        Log_OC.getArray(kshockEligibility, "$kshockDetails");
        Log_OC.getArray(homeView, "it");
        boolean $z0 = list.isEmpty();
        homeView.enableAdverts(kshockEligibility, $z0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: retrieveSavings$lambda-8  reason: not valid java name */
    public static final void m39066retrieveSavings$lambda8(Throwable th) {
        Log_OC.loadImage(th, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        CrashlyticsReport.logException(th);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void updateUsedBillers() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        AbstractC11688p $r4 = $r2.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.bills.presenters.a
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                HomePresenter $r12 = HomePresenter.this;
                User $r42 = (User) obj;
                InterfaceC11692s $r22 = HomePresenter.m39067updateUsedBillers$lambda13($r12, $r42);
                return $r22;
            }
        });
        Function $r5 = Function.MODE;
        C0019DD $r6 = C0019DD.ONE;
        $r4.e0($r5, $r6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: updateUsedBillers$lambda-13  reason: not valid java name */
    public static final InterfaceC11692s m39067updateUsedBillers$lambda13(HomePresenter homePresenter, User user) {
        Log_OC.getArray(homePresenter, "this$0");
        Log_OC.getArray(user, "it");
        FetchFrequentlyUsedBills $r2 = homePresenter.fetchFrequentlyUsedBills;
        String $r3 = user.getSessionId();
        Log_OC.loadImage($r3, "it.sessionId");
        AbstractC11688p $r4 = $r2.execute($r3);
        return $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateUsedBillers$lambda-14  reason: not valid java name */
    public static final void m39068updateUsedBillers$lambda14(C13666w c13666w) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.C9410b, p272h.p364d.p365a.p366c.InterfaceC9413d
    public void destroy() {
        super.destroy();
        C11280b $r1 = this.disposables;
        $r1.m11212i();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchAnnouncements() {
        AnnouncementRepository $r2 = this.announcementRepository;
        HomePresenter$fetchAnnouncements$1 $r3 = new HomePresenter$fetchAnnouncements$1(this);
        $r2.getAnnouncements($r3);
        AnnouncementRepository $r22 = this.announcementRepository;
        AbstractC11293f $r4 = $r22.observeAnnouncements();
        RxSchedulers $r5 = this.schedulers;
        p425j.p444e.Item $r6 = $r5.setSettings();
        AbstractC11293f $r42 = $r4.M($r6);
        RxSchedulers $r52 = this.schedulers;
        p425j.p444e.Item $r62 = $r52.main();
        AbstractC11293f $r43 = $r42.y($r62);
        Object object = new Object() { // from class: ai.kudi.agent.bills.presenters.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                HomePresenter $r1 = HomePresenter.this;
                List $r32 = (List) obj;
                HomePresenter.m39044fetchAnnouncements$lambda17($r1, $r32);
            }
        };
        Chunk $r1 = Chunk.NEWLINE;
        FavoritesArrayAdapter $r8 = $r43.I(object, $r1);
        C11280b $r9 = this.disposables;
        $r9.b($r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchFrequentlyUsedBillers() {
        updateUsedBillers();
        BillerRepository $r4 = this.billerRepository;
        AbstractC11696w $r3 = $r4.fetchFrequentlyUsedBillers();
        Object object = new Object() { // from class: ai.kudi.agent.bills.presenters.RxRingBuffer
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                HomePresenter $r1 = HomePresenter.this;
                List $r32 = (List) obj;
                HomePresenter.m39047fetchFrequentlyUsedBillers$lambda11($r1, $r32);
            }
        };
        C0022c $r2 = C0022c.f96d;
        $r3.s(object, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchMiniKshockDetails(String str) {
        Log_OC.getArray(str, "customerType");
        boolean $z0 = Log_OC.append(str, "USER");
        if ($z0) {
            return;
        }
        FetchCurrentUser $r2 = this.fetchCurrentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        AbstractC11688p $r5 = $r3.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.bills.presenters.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                HomePresenter $r1 = HomePresenter.this;
                User $r4 = (User) obj;
                InterfaceC11692s $r22 = HomePresenter.m39051fetchMiniKshockDetails$lambda3($r1, $r4);
                return $r22;
            }
        });
        Object object = new Object() { // from class: ai.kudi.agent.bills.presenters.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                HomePresenter $r1 = HomePresenter.this;
                KshockEligibility $r32 = (KshockEligibility) obj;
                HomePresenter.m39052fetchMiniKshockDetails$lambda4($r1, $r32);
            }
        };
        FormatedText $r7 = FormatedText.SINGLE_SPACE;
        FavoritesArrayAdapter $r8 = $r5.e0(object, $r7);
        C11280b $r9 = this.disposables;
        $r9.b($r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchTodos() {
        final ArrayList $r1 = new ArrayList();
        FetchCurrentUser $r2 = this.fetchCurrentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        AbstractC11688p $r5 = $r3.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.bills.presenters.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                HomePresenter $r12 = HomePresenter.this;
                User $r4 = (User) obj;
                InterfaceC11692s $r22 = HomePresenter.m39054fetchTodos$lambda21($r12, $r4);
                return $r22;
            }
        });
        $r5.e0(new Object() { // from class: ai.kudi.agent.bills.presenters.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                List $r12 = $r1;
                HomePresenter $r22 = this;
                TodoResponse $r4 = (TodoResponse) obj;
                HomePresenter.m39055fetchTodos$lambda23($r12, $r22, $r4);
            }
        }, new Object() { // from class: ai.kudi.agent.bills.presenters.ToContainsFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                HomePresenter $r12 = HomePresenter.this;
                Throwable $r32 = (Throwable) obj;
                HomePresenter.m39057fetchTodos$lambda25($r12, $r32);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchUser() {
        FetchCurrentUser $r2 = this.fetchCurrentUser;
        AbstractC11696w $r1 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.bills.presenters.SubjectSubscriptionManager$SubjectObserver
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                HomePresenter $r12 = HomePresenter.this;
                User $r3 = (User) obj;
                HomePresenter.m39059fetchUser$lambda1($r12, $r3);
            }
        };
        Token $r4 = Token.FUNCTION;
        $r1.s(object, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C11280b getDisposables() {
        C11280b r1 = this.disposables;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void logAnnouncementClicked(Announcement announcement) {
        Log_OC.getArray(announcement, Part.LEGACY_ANNOUNCEMENT_STYLE);
        Analytics $r2 = this.analytics;
        String $r3 = announcement.getTitle();
        int $i0 = announcement.getId();
        $r2.onAnnouncementClicked($r3, $i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void logEvent(final HomeAnalytics.Events events) {
        Log_OC.getArray(events, "event");
        FetchCurrentUser $r2 = this.fetchCurrentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        p425j.p444e.Item $r4 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11696w $r32 = $r3.u($r4);
        p425j.p444e.Item $r42 = ContextUtils.LogError();
        AbstractC11696w $r33 = $r32.n($r42);
        Object object = new Object() { // from class: ai.kudi.agent.bills.presenters.SimpleXYSeries
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                HomeAnalytics.Events $r1 = HomeAnalytics.Events.this;
                HomePresenter $r22 = this;
                User $r43 = (User) obj;
                HomePresenter.m39062logEvent$lambda19($r1, $r22, $r43);
            }
        };
        C0021b $r6 = C0021b.f95e;
        $r33.s(object, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void retrieveSavings(final KshockEligibility kshockEligibility) {
        Log_OC.getArray(kshockEligibility, "kshockDetails");
        SavingsRepository $r3 = this.savingsService;
        AbstractC11688p $r4 = $r3.fetchAllSavings();
        Object object = new Object() { // from class: ai.kudi.agent.bills.presenters.SocketConnector
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                HomePresenter $r1 = HomePresenter.this;
                KshockEligibility $r2 = kshockEligibility;
                List $r42 = (List) obj;
                HomePresenter.m39064retrieveSavings$lambda7($r1, $r2, $r42);
            }
        };
        Subscription $r5 = Subscription.subscribed;
        FavoritesArrayAdapter $r6 = $r4.e0(object, $r5);
        C11280b $r7 = this.disposables;
        $r7.b($r6);
    }
}

package ai.kudi.agent.home;

import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.home.HomeView;
import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.network.util.ConnectivityUtil;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.notification.domain.FetchNotificationCount;
import ai.kudi.agent.notification.viewmodels.NotificationCount;
import ai.kudi.agent.postRegistrationSetUp.adapter.TodoItem;
import ai.kudi.agent.postRegistrationSetUp.data.TodoResponse;
import ai.kudi.agent.postRegistrationSetUp.usecases.FetchTodo;
import ai.kudi.agent.register.domain.usecases.VerifyId;
import ai.kudi.agent.register.domain.wiki.Data;
import ai.kudi.agent.register.domain.wiki.IdVerificationRequest;
import ai.kudi.agent.settings.data.Constants;
import ai.kudi.agent.settings.domain.useCases.InsuranceRequests;
import ai.kudi.agent.settings.domain.useCases.InsuranceStatus;
import ai.kudi.agent.settings.insurance.data.InsuranceDetailModel;
import ai.kudi.agent.users.data.repositories.UserRepository;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.package_1.Wallet;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.users.domain.usecases.FetchWallet;
import ai.kudi.agent.users.domain.usecases.RegisterFcm;
import ai.kudi.agent.users.domain.usecases.UpdateUser;
import ai.kudi.agent.wallettopup.data.FetchMiniMonnifyDetails;
import android.content.SharedPreferences;
import androidx.room.EmptyResultSetException;
import com.google.android.gms.tasks.InterfaceC4454e;
import com.google.firebase.messaging.FirebaseMessaging;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.C11812w;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13277t;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
import retrofit2.HttpException;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: HomePresenter.kt */
@Metadata(m10422d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bq\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001c¢\u0006\u0002\u0010\u001dJ\u0006\u0010;\u001a\u00020<J\u0006\u0010=\u001a\u00020<J\b\u0010>\u001a\u00020<H\u0016J\b\u0010?\u001a\u00020<H\u0007J\u0006\u0010@\u001a\u00020<J\u0006\u0010A\u001a\u00020<J\u0006\u0010B\u001a\u00020<J\u0006\u0010C\u001a\u00020<J\u0006\u0010D\u001a\u00020<J\u0006\u0010E\u001a\u00020<J\u0010\u0010F\u001a\u00020<2\b\b\u0002\u0010G\u001a\u00020HJ\u0006\u0010I\u001a\u00020<J\u0006\u0010J\u001a\u000200J\u000e\u0010\u0011\u001a\u00020<2\u0006\u0010K\u001a\u000200R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010/\u001a\u000200X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u00105\u001a\u0004\u0018\u000106X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006L"}, m10421d2 = {"Lai/kudi/agent/home/HomePresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/home/HomeView;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "fetchBankWithMethods", "Lai/kudi/agent/wallettopup/data/FetchMiniMonnifyDetails;", "fetchNotificationCount", "Lai/kudi/agent/notification/domain/FetchNotificationCount;", "fetchWallet", "Lai/kudi/agent/users/domain/usecases/FetchWallet;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "fetchTodo", "Lai/kudi/agent/postRegistrationSetUp/usecases/FetchTodo;", "registerFcm", "Lai/kudi/agent/users/domain/usecases/RegisterFcm;", "verifyId", "Lai/kudi/agent/register/domain/usecases/VerifyId;", "smartLookAnalytics", "Lai/kudi/agent/analytics/SmartLookAnalytics;", "insuranceRequests", "Lai/kudi/agent/settings/domain/useCases/InsuranceRequests;", "userRepo", "Lai/kudi/agent/users/data/repositories/UserRepository;", "updateUser", "Lai/kudi/agent/users/domain/usecases/UpdateUser;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/wallettopup/data/FetchMiniMonnifyDetails;Lai/kudi/agent/notification/domain/FetchNotificationCount;Lai/kudi/agent/users/domain/usecases/FetchWallet;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/postRegistrationSetUp/usecases/FetchTodo;Lai/kudi/agent/users/domain/usecases/RegisterFcm;Lai/kudi/agent/register/domain/usecases/VerifyId;Lai/kudi/agent/analytics/SmartLookAnalytics;Lai/kudi/agent/settings/domain/useCases/InsuranceRequests;Lai/kudi/agent/users/data/repositories/UserRepository;Lai/kudi/agent/users/domain/usecases/UpdateUser;Landroid/content/SharedPreferences;)V", "getAnalytics", "()Lai/kudi/agent/core/analytics/Analytics;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "count", "", "getCount", "()I", "setCount", "(I)V", "getCurrentUser", "()Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "listOfTodos", "", "Lai/kudi/agent/postRegistrationSetUp/adapter/TodoItem;", "phoneNumber", "", "getPhoneNumber", "()Ljava/lang/String;", "setPhoneNumber", "(Ljava/lang/String;)V", "userObject", "Lai/kudi/agent/users/domain/dto/User;", "getUserObject", "()Lai/kudi/agent/users/domain/dto/User;", "setUserObject", "(Lai/kudi/agent/users/domain/dto/User;)V", "checkBvnIsVerified", "", "checkTerminalID", "destroy", "fetchInsuranceStatus", "fetchTodos", "getMonnifyDetails", "getNotificationCount", "getWalletBalance", "logOnOutletMgtClicked", "logSettingsMenuClickEvent", "logUnReadNotificationCountEvent", "isNotificationIconClicked", "", "marketplaceOptionClicked", "returnPhoneNumber", "idNumber", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class HomePresenter extends C9410b<HomeView> {
    private final Analytics analytics;
    private final C11280b compositeDisposable;
    private int count;
    private final FetchCurrentUser currentUser;
    private final FetchMiniMonnifyDetails fetchBankWithMethods;
    private final FetchNotificationCount fetchNotificationCount;
    private final FetchTodo fetchTodo;
    private final FetchWallet fetchWallet;
    private final InsuranceRequests insuranceRequests;
    private final List<TodoItem> listOfTodos;
    private String phoneNumber;
    private final RegisterFcm registerFcm;
    private final SharedPreferences sharedPreferences;
    private final SmartLookAnalytics smartLookAnalytics;
    private final UpdateUser updateUser;
    private User userObject;
    private final UserRepository userRepo;
    private final VerifyId verifyId;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public HomePresenter(FetchCurrentUser fetchCurrentUser, FetchMiniMonnifyDetails fetchMiniMonnifyDetails, FetchNotificationCount fetchNotificationCount, FetchWallet fetchWallet, Analytics analytics, FetchTodo fetchTodo, RegisterFcm registerFcm, VerifyId verifyId, SmartLookAnalytics smartLookAnalytics, InsuranceRequests insuranceRequests, UserRepository userRepository, UpdateUser updateUser, SharedPreferences sharedPreferences) {
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        Log_OC.getArray(fetchMiniMonnifyDetails, "fetchBankWithMethods");
        Log_OC.getArray(fetchNotificationCount, "fetchNotificationCount");
        Log_OC.getArray(fetchWallet, "fetchWallet");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(fetchTodo, "fetchTodo");
        Log_OC.getArray(registerFcm, "registerFcm");
        Log_OC.getArray(verifyId, "verifyId");
        Log_OC.getArray(smartLookAnalytics, "smartLookAnalytics");
        Log_OC.getArray(insuranceRequests, "insuranceRequests");
        Log_OC.getArray(userRepository, "userRepo");
        Log_OC.getArray(updateUser, "updateUser");
        Log_OC.getArray(sharedPreferences, "sharedPreferences");
        this.currentUser = fetchCurrentUser;
        this.fetchBankWithMethods = fetchMiniMonnifyDetails;
        this.fetchNotificationCount = fetchNotificationCount;
        this.fetchWallet = fetchWallet;
        this.analytics = analytics;
        this.fetchTodo = fetchTodo;
        this.registerFcm = registerFcm;
        this.verifyId = verifyId;
        this.smartLookAnalytics = smartLookAnalytics;
        this.insuranceRequests = insuranceRequests;
        this.userRepo = userRepository;
        this.updateUser = updateUser;
        this.sharedPreferences = sharedPreferences;
        C11280b $r14 = new C11280b();
        this.compositeDisposable = $r14;
        ArrayList $r15 = new ArrayList();
        this.listOfTodos = $r15;
        FirebaseMessaging $r16 = FirebaseMessaging.m21927f();
        $r16.m21924i().m27799a(new InterfaceC4454e() { // from class: ai.kudi.agent.home.e
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: b */
            public final void m38885b(com.google.android.gms.tasks.Item item) {
                HomePresenter $r2 = HomePresenter.this;
                HomePresenter.m39280_init_$lambda2($r2, item);
            }
        });
        this.phoneNumber = "";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: _init_$lambda-2 */
    public static final void m39280_init_$lambda2(HomePresenter homePresenter, com.google.android.gms.tasks.Item item) {
        Log_OC.getArray(homePresenter, "this$0");
        Log_OC.getArray(item, "task");
        boolean $z0 = item.m27801a();
        if ($z0) {
            C11280b $r2 = homePresenter.getCompositeDisposable();
            RegisterFcm $r3 = homePresenter.registerFcm;
            Object $r4 = item.get();
            Log_OC.loadImage($r4, "task.result");
            String $r5 = (String) $r4;
            AbstractC11688p $r6 = $r3.execute($r5);
            ContentType $r7 = ContentType.WILDCARD;
            Coin $r8 = Coin.COIN;
            FavoritesArrayAdapter $r9 = $r6.e0($r7, $r8);
            $r2.b($r9);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: checkBvnIsVerified$lambda-46 */
    public static final void m39281checkBvnIsVerified$lambda46(HomePresenter homePresenter, User user) {
        Log_OC.getArray(homePresenter, "this$0");
        Boolean $r2 = user.isBvnVerified;
        boolean $z0 = $r2.booleanValue();
        if ($z0) {
            return;
        }
        Permission $r3 = Permission.READ;
        homePresenter.ifViewAttached($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: checkBvnIsVerified$lambda-46$lambda-45 */
    public static final void m39282checkBvnIsVerified$lambda46$lambda45(HomeView homeView) {
        Log_OC.getArray(homeView, "it");
        VerifyStateResult $r2 = VerifyStateResult.UNVERIFIED;
        HomePresenter$checkBvnIsVerified$disposable$1$1$1 $r1 = new HomePresenter$checkBvnIsVerified$disposable$1$1$1(homeView);
        homeView.showVerifyPrompt($r2, $r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: checkTerminalID$lambda-21 */
    public static final void m39283checkTerminalID$lambda21(HomePresenter homePresenter, final User user) {
        Log_OC.getArray(homePresenter, "this$0");
        homePresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.home.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void setTitle(Object obj) {
                User $r1 = User.this;
                HomeView $r3 = (HomeView) obj;
                HomePresenter.m39284checkTerminalID$lambda21$lambda20($r1, $r3);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: checkTerminalID$lambda-21$lambda-20 */
    public static final void m39284checkTerminalID$lambda21$lambda20(User user, HomeView homeView) {
        Log_OC.getArray(homeView, "it");
        String $r1 = user.getTerminalId();
        homeView.checkTerminalID($r1);
    }

    /* renamed from: checkTerminalID$lambda-22 */
    public static final void m39285checkTerminalID$lambda22(Throwable th) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchInsuranceStatus$lambda-19 */
    public static final void m39286fetchInsuranceStatus$lambda19(HomePresenter homePresenter, final User user) {
        Log_OC.getArray(homePresenter, "this$0");
        homePresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.home.ByteVector
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                HomePresenter $r1 = HomePresenter.this;
                User $r2 = user;
                HomeView $r4 = (HomeView) obj;
                HomePresenter.m39287fetchInsuranceStatus$lambda19$lambda18($r1, $r2, $r4);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchInsuranceStatus$lambda-19$lambda-18 */
    public static final void m39287fetchInsuranceStatus$lambda19$lambda18(HomePresenter homePresenter, User user, HomeView homeView) {
        Log_OC.getArray(homePresenter, "this$0");
        Log_OC.getArray(homeView, "it");
        InsuranceRequests $r3 = homePresenter.insuranceRequests;
        String $r4 = user.getSessionId();
        Log_OC.loadImage($r4, "user.sessionId");
        AbstractC11688p $r5 = $r3.checkStatus($r4);
        $r5.e0(new Object() { // from class: ai.kudi.agent.home.InBandBytestreamSession$IBBDataPacketFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                HomePresenter $r1 = HomePresenter.this;
                InsuranceDetailModel $r32 = (InsuranceDetailModel) obj;
                HomePresenter.m39288fetchInsuranceStatus$lambda19$lambda18$lambda13($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.home.RxRingBuffer
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                HomePresenter $r1 = HomePresenter.this;
                Throwable $r32 = (Throwable) obj;
                HomePresenter.m39292fetchInsuranceStatus$lambda19$lambda18$lambda17($r1, $r32);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchInsuranceStatus$lambda-19$lambda-18$lambda-13 */
    public static final void m39288fetchInsuranceStatus$lambda19$lambda18$lambda13(HomePresenter homePresenter, InsuranceDetailModel insuranceDetailModel) {
        Log_OC.getArray(homePresenter, "this$0");
        String $r2 = insuranceDetailModel.getStatus();
        InsuranceStatus $r3 = InsuranceStatus.ACTIVE;
        String $r4 = $r3.name();
        boolean $z0 = Log_OC.append($r2, $r4);
        if ($z0) {
            Event $r5 = Event.STOPPED;
            homePresenter.ifViewAttached($r5);
            return;
        }
        InsuranceStatus $r32 = InsuranceStatus.SUSPENDED;
        String $r42 = $r32.name();
        boolean $z02 = Log_OC.append($r2, $r42);
        if ($z02) {
            ClassWriter $r6 = ClassWriter.f341b;
            homePresenter.ifViewAttached($r6);
            return;
        }
        MXParser $r7 = MXParser.f347Z;
        homePresenter.ifViewAttached($r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchInsuranceStatus$lambda-19$lambda-18$lambda-13$lambda-10 */
    public static final void m39289fetchInsuranceStatus$lambda19$lambda18$lambda13$lambda10(HomeView homeView) {
        Log_OC.getArray(homeView, "view");
        Active $r1 = Active.INSTANCE;
        homeView.setCashInsuranceState($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchInsuranceStatus$lambda-19$lambda-18$lambda-13$lambda-11 */
    public static final void m39290fetchInsuranceStatus$lambda19$lambda18$lambda13$lambda11(HomeView homeView) {
        Log_OC.getArray(homeView, "view");
        NotActive $r1 = NotActive.INSTANCE;
        homeView.setCashInsuranceState($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchInsuranceStatus$lambda-19$lambda-18$lambda-13$lambda-12 */
    public static final void m39291fetchInsuranceStatus$lambda19$lambda18$lambda13$lambda12(HomeView homeView) {
        Log_OC.getArray(homeView, "view");
        NotActive $r1 = NotActive.INSTANCE;
        homeView.setCashInsuranceState($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchInsuranceStatus$lambda-19$lambda-18$lambda-17 */
    public static final void m39292fetchInsuranceStatus$lambda19$lambda18$lambda17(HomePresenter homePresenter, Throwable th) {
        Log_OC.getArray(homePresenter, "this$0");
        th.printStackTrace();
        boolean $z0 = th instanceof EmptyResultSetException;
        if ($z0) {
            Macro $r2 = Macro.THUMBNAIL;
            homePresenter.ifViewAttached($r2);
            return;
        }
        boolean $z02 = th instanceof HttpException;
        if (!$z02) {
            C0243c $r5 = C0243c.f358d;
            homePresenter.ifViewAttached($r5);
            return;
        }
        HttpException $r3 = (HttpException) th;
        int $i0 = $r3.m352a();
        if ($i0 == 404) {
            Setting $r4 = Setting.VOLUME;
            homePresenter.ifViewAttached($r4);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchInsuranceStatus$lambda-19$lambda-18$lambda-17$lambda-14 */
    public static final void m39293fetchInsuranceStatus$lambda19$lambda18$lambda17$lambda14(HomeView homeView) {
        Log_OC.getArray(homeView, "view");
        Error $r1 = Error.INSTANCE;
        homeView.setCashInsuranceState($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchInsuranceStatus$lambda-19$lambda-18$lambda-17$lambda-15 */
    public static final void m39294fetchInsuranceStatus$lambda19$lambda18$lambda17$lambda15(HomeView homeView) {
        Log_OC.getArray(homeView, "view");
        NotActive $r1 = NotActive.INSTANCE;
        homeView.setCashInsuranceState($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchInsuranceStatus$lambda-19$lambda-18$lambda-17$lambda-16 */
    public static final void m39295fetchInsuranceStatus$lambda19$lambda18$lambda17$lambda16(HomeView homeView) {
        Log_OC.getArray(homeView, "view");
        Error $r1 = Error.INSTANCE;
        homeView.setCashInsuranceState($r1);
    }

    /* renamed from: fetchTodos$lambda-39 */
    public static final void m39296fetchTodos$lambda39(HomeView homeView) {
        Log_OC.getArray(homeView, "it");
        homeView.showTodoLoading(true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchTodos$lambda-40 */
    public static final InterfaceC11692s m39297fetchTodos$lambda40(HomePresenter homePresenter, User user) {
        Log_OC.getArray(homePresenter, "this$0");
        Log_OC.getArray(user, "it");
        FetchTodo $r2 = homePresenter.fetchTodo;
        String $r3 = user.getSessionId();
        Log_OC.loadImage($r3, "it.sessionId");
        AbstractC11688p $r4 = $r2.execute($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
        if (r14 == false) goto L20;
     */
    /* renamed from: fetchTodos$lambda-42 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m39298fetchTodos$lambda42(ai.kudi.agent.home.HomePresenter r22, ai.kudi.agent.postRegistrationSetUp.data.TodoResponse r23) {
        /*
            java.lang.String r2 = "this$0"
            r0 = r22
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r2)
            r0 = r23
            ai.kudi.agent.users.domain.package_1.Wallet r3 = r0.getWallet()
            double r4 = r3.getAmount()
            r7 = 0
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 > 0) goto L28
            r0 = r22
            java.util.List<ai.kudi.agent.postRegistrationSetUp.adapter.TodoItem> r9 = r0.listOfTodos
            ai.kudi.agent.postRegistrationSetUp.adapter.TodoItem r10 = new ai.kudi.agent.postRegistrationSetUp.adapter.TodoItem
            java.lang.String r2 = "Fund your wallet to activate your account"
            r11 = 0
            r12 = 2
            r13 = 0
            r10.<init>(r2, r11, r12, r13)
            r9.add(r10)
        L28:
            r0 = r23
            java.util.List r9 = r0.getCashoutAccounts()
            boolean r14 = r9.isEmpty()
            if (r14 == 0) goto L45
            r0 = r22
            java.util.List<ai.kudi.agent.postRegistrationSetUp.adapter.TodoItem> r9 = r0.listOfTodos
            ai.kudi.agent.postRegistrationSetUp.adapter.TodoItem r10 = new ai.kudi.agent.postRegistrationSetUp.adapter.TodoItem
            java.lang.String r2 = "Setup your bank accounts"
            r11 = 0
            r12 = 2
            r13 = 0
            r10.<init>(r2, r11, r12, r13)
            r9.add(r10)
        L45:
            r0 = r23
            java.lang.String r15 = r0.getKycLevel()
            ai.kudi.agent.settings.data.Constants r16 = ai.kudi.agent.settings.data.Constants.INSTANCE
            r0 = r16
            java.util.List r9 = r0.getKYC_LEVELS()
            r11 = 0
            java.lang.Object r17 = r9.get(r11)
            r0 = r17
            boolean r14 = kotlin.p483e0.p485d.Log_OC.append(r15, r0)
            if (r14 == 0) goto L71
            r0 = r22
            java.util.List<ai.kudi.agent.postRegistrationSetUp.adapter.TodoItem> r9 = r0.listOfTodos
            ai.kudi.agent.postRegistrationSetUp.adapter.TodoItem r10 = new ai.kudi.agent.postRegistrationSetUp.adapter.TodoItem
            java.lang.String r2 = "Upgrade your account to enjoy more"
            r11 = 0
            r12 = 2
            r13 = 0
            r10.<init>(r2, r11, r12, r13)
            r9.add(r10)
        L71:
            r0 = r23
            ai.kudi.agent.login.domain.wiki.InsuranceStatus r18 = r0.getInsuranceStatus()
            if (r18 == 0) goto L95
            r0 = r23
            ai.kudi.agent.login.domain.wiki.InsuranceStatus r18 = r0.getInsuranceStatus()
            r0 = r18
            java.lang.String r15 = r0.getStatus()
            ai.kudi.agent.settings.domain.useCases.InsuranceStatus r19 = ai.kudi.agent.settings.domain.useCases.InsuranceStatus.ACTIVE
            r0 = r19
            java.lang.String r20 = r0.name()
            r0 = r20
            boolean r14 = kotlin.p483e0.p485d.Log_OC.append(r15, r0)
            if (r14 != 0) goto La4
        L95:
            r0 = r22
            java.util.List<ai.kudi.agent.postRegistrationSetUp.adapter.TodoItem> r9 = r0.listOfTodos
            ai.kudi.agent.postRegistrationSetUp.adapter.TodoItem r10 = new ai.kudi.agent.postRegistrationSetUp.adapter.TodoItem
            java.lang.String r2 = "Insure your cash against theft, and loss Sign up for cash insurance"
            r11 = 1
            r10.<init>(r2, r11)
            r9.add(r10)
        La4:
            r0 = r23
            boolean r14 = r0.getShowPosPurchase()
            if (r14 == 0) goto Lbb
            r0 = r22
            java.util.List<ai.kudi.agent.postRegistrationSetUp.adapter.TodoItem> r9 = r0.listOfTodos
            ai.kudi.agent.postRegistrationSetUp.adapter.TodoItem r10 = new ai.kudi.agent.postRegistrationSetUp.adapter.TodoItem
            java.lang.String r2 = "Need a POS terminal? Get one here"
            r11 = 1
            r10.<init>(r2, r11)
            r9.add(r10)
        Lbb:
            ai.kudi.agent.home.ByteArrayReader r21 = new ai.kudi.agent.home.ByteArrayReader
            r0 = r21
            r1 = r22
            r0.<init>()
            r0 = r22
            r1 = r21
            r0.ifViewAttached(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.home.HomePresenter.m39298fetchTodos$lambda42(ai.kudi.agent.home.HomePresenter, ai.kudi.agent.postRegistrationSetUp.data.TodoResponse):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchTodos$lambda-42$lambda-41 */
    public static final void m39299fetchTodos$lambda42$lambda41(HomePresenter homePresenter, HomeView homeView) {
        Log_OC.getArray(homePresenter, "this$0");
        Log_OC.getArray(homeView, "it");
        homeView.showTodoLoading(false);
        List $r2 = homePresenter.listOfTodos;
        homeView.showTodoList($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchTodos$lambda-44 */
    public static final void m39300fetchTodos$lambda44(HomePresenter homePresenter, final Throwable th) {
        Log_OC.getArray(homePresenter, "this$0");
        homePresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.home.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                Throwable $r1 = th;
                HomeView $r3 = (HomeView) obj;
                HomePresenter.m39301fetchTodos$lambda44$lambda43($r1, $r3);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchTodos$lambda-44$lambda-43 */
    public static final void m39301fetchTodos$lambda44$lambda43(Throwable th, HomeView homeView) {
        Log_OC.getArray(homeView, "it");
        homeView.showTodoLoading(false);
        InterfaceC11767l $r2 = KudiErrorParserKt.parseHttpError2$default("Couldn't fetch todos", null, 2, null);
        Log_OC.loadImage(th, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        Object $r3 = $r2.invoke(th);
        String $r4 = (String) $r3;
        homeView.showError($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getMonnifyDetails$lambda-35 */
    public static final InterfaceC11692s m39302getMonnifyDetails$lambda35(HomePresenter homePresenter, User user) {
        Log_OC.getArray(homePresenter, "this$0");
        Log_OC.getArray(user, "it");
        String $r2 = user.getPhoneNumber();
        Log_OC.loadImage($r2, "it.phoneNumber");
        homePresenter.setPhoneNumber($r2);
        FetchMiniMonnifyDetails $r3 = homePresenter.fetchBankWithMethods;
        String $r22 = user.getSessionId();
        Log_OC.loadImage($r22, "it.sessionId");
        AbstractC11688p $r4 = $r3.execute($r22);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getMonnifyDetails$lambda-37 */
    public static final void m39303getMonnifyDetails$lambda37(HomePresenter homePresenter, final List list) {
        Log_OC.getArray(homePresenter, "this$0");
        homePresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.home.ViewTarget
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void getSize(Object obj) {
                List $r1 = list;
                HomeView $r3 = (HomeView) obj;
                HomePresenter.m39304getMonnifyDetails$lambda37$lambda36($r1, $r3);
            }
        });
    }

    /* renamed from: getMonnifyDetails$lambda-37$lambda-36 */
    public static final void m39304getMonnifyDetails$lambda37$lambda36(List list, HomeView homeView) {
        Log_OC.getArray(homeView, "it");
        Log_OC.loadImage(list, "miniMonnifyDetails");
        homeView.showMonnifyDetails(list);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getNotificationCount$lambda-23 */
    public static final InterfaceC11692s m39306getNotificationCount$lambda23(HomePresenter homePresenter, User user) {
        Log_OC.getArray(homePresenter, "this$0");
        Log_OC.getArray(user, "user");
        homePresenter.setUserObject(user);
        FetchNotificationCount $r2 = homePresenter.fetchNotificationCount;
        String $r3 = user.getSessionId();
        Log_OC.loadImage($r3, "user.sessionId");
        AbstractC11688p $r4 = $r2.execute($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getNotificationCount$lambda-25 */
    public static final void m39307getNotificationCount$lambda25(HomePresenter homePresenter, final NotificationCount notificationCount) {
        Log_OC.getArray(homePresenter, "this$0");
        int $i0 = notificationCount.getCount();
        homePresenter.setCount($i0);
        homePresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.home.Actor
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void setTarget(Object obj) {
                NotificationCount $r1 = NotificationCount.this;
                HomeView $r3 = (HomeView) obj;
                HomePresenter.m39308getNotificationCount$lambda25$lambda24($r1, $r3);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getNotificationCount$lambda-25$lambda-24 */
    public static final void m39308getNotificationCount$lambda25$lambda24(NotificationCount notificationCount, HomeView homeView) {
        Log_OC.getArray(homeView, "view");
        int $i0 = notificationCount.getCount();
        homeView.displayNotificationCount($i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getNotificationCount$lambda-27 */
    public static final void m39309getNotificationCount$lambda27(HomePresenter homePresenter, Throwable th) {
        Log_OC.getArray(homePresenter, "this$0");
        final C11812w $r2 = new C11812w();
        $r2.f26499c = "";
        boolean $z0 = ConnectivityUtil.isNoConnectivity(th);
        if ($z0) {
            $r2.f26499c = "Cannot connect to Kudi. Check connection";
        }
        homePresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.home.k
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void onItemClick(Object obj) {
                C11812w $r1 = C11812w.this;
                HomeView $r3 = (HomeView) obj;
                HomePresenter.m39310getNotificationCount$lambda27$lambda26($r1, $r3);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getNotificationCount$lambda-27$lambda-26 */
    public static final void m39310getNotificationCount$lambda27$lambda26(C11812w c11812w, HomeView homeView) {
        Log_OC.getArray(c11812w, "$error");
        Log_OC.getArray(homeView, "view");
        Object $r2 = c11812w.f26499c;
        String $r3 = (String) $r2;
        homeView.showError($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getWalletBalance$lambda-28 */
    public static final InterfaceC11692s m39311getWalletBalance$lambda28(HomePresenter homePresenter, User user) {
        Log_OC.getArray(homePresenter, "this$0");
        Log_OC.getArray(user, "it");
        String $r2 = user.getPhoneNumber();
        Log_OC.loadImage($r2, "it.phoneNumber");
        homePresenter.setPhoneNumber($r2);
        FetchWallet $r3 = homePresenter.fetchWallet;
        String $r22 = user.getSessionId();
        Log_OC.loadImage($r22, "it.sessionId");
        AbstractC11688p $r4 = $r3.execute($r22);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getWalletBalance$lambda-30 */
    public static final void m39312getWalletBalance$lambda30(HomePresenter homePresenter, final Wallet wallet) {
        Log_OC.getArray(homePresenter, "this$0");
        homePresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.home.MapController$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void onAnimationStart(Object obj) {
                Wallet $r1 = Wallet.this;
                HomeView $r3 = (HomeView) obj;
                HomePresenter.m39313getWalletBalance$lambda30$lambda29($r1, $r3);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getWalletBalance$lambda-30$lambda-29 */
    public static final void m39313getWalletBalance$lambda30$lambda29(Wallet wallet, HomeView homeView) {
        Log_OC.getArray(homeView, "view");
        double $d0 = wallet.getAmount();
        homeView.displayWalletBalance($d0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getWalletBalance$lambda-32 */
    public static final void m39314getWalletBalance$lambda32(HomePresenter homePresenter, Throwable th) {
        Log_OC.getArray(homePresenter, "this$0");
        final C11812w $r2 = new C11812w();
        $r2.f26499c = "";
        boolean $z0 = ConnectivityUtil.isNoConnectivity(th);
        if ($z0) {
            $r2.f26499c = "Cannot connect to Kudi. Check connection";
        }
        homePresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.home.NumberPicker$TwoDigitFormatter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void format(Object obj) {
                C11812w $r1 = C11812w.this;
                HomeView $r3 = (HomeView) obj;
                HomePresenter.m39315getWalletBalance$lambda32$lambda31($r1, $r3);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getWalletBalance$lambda-32$lambda-31 */
    public static final void m39315getWalletBalance$lambda32$lambda31(C11812w c11812w, HomeView homeView) {
        Log_OC.getArray(c11812w, "$error");
        Log_OC.getArray(homeView, "view");
        Object $r2 = c11812w.f26499c;
        String $r3 = (String) $r2;
        homeView.showError($r3);
    }

    /* renamed from: lambda-2$lambda-0 */
    public static final void m39316lambda2$lambda0(User user) {
    }

    /* renamed from: lambda-2$lambda-1 */
    public static final void m39317lambda2$lambda1(Throwable th) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void logUnReadNotificationCountEvent$default(HomePresenter homePresenter, boolean $z0, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $z0 = true;
        }
        homePresenter.logUnReadNotificationCountEvent($z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: marketplaceOptionClicked$lambda-33 */
    public static final void m39318marketplaceOptionClicked$lambda33(HomePresenter homePresenter, User user) {
        Log_OC.getArray(homePresenter, "this$0");
        Analytics $r2 = homePresenter.getAnalytics();
        String $r3 = user.getPhoneNumber();
        Log_OC.loadImage($r3, "it.phoneNumber");
        $r2.marketPlaceMenuNavClicked($r3, true);
    }

    /* renamed from: verifyId$lambda-3 */
    public static final void m39320verifyId$lambda3(HomeView homeView) {
        Log_OC.getArray(homeView, "view");
        homeView.showTodoLoading(true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: verifyId$lambda-4 */
    public static final InterfaceC11692s m39321verifyId$lambda4(C11812w c11812w, HomePresenter homePresenter, String str, User user) {
        CharSequence $r5;
        Log_OC.getArray(c11812w, "$user");
        Log_OC.getArray(homePresenter, "this$0");
        Log_OC.getArray(str, "$idNumber");
        Log_OC.getArray(user, "it");
        c11812w.f26499c = user;
        VerifyId $r4 = homePresenter.verifyId;
        $r5 = C13277t.m5414M0(str);
        String $r2 = $r5.toString();
        String $r6 = user.getPhoneNumber();
        Log_OC.loadImage($r6, "phoneNumber");
        IdVerificationRequest $r7 = new IdVerificationRequest(true, $r2, Constants.IS_BVN_VERIFIED, $r6);
        AbstractC11688p $r8 = $r4.execute($r7);
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: verifyId$lambda-7 */
    public static final void m39322verifyId$lambda7(final HomePresenter homePresenter, final C11812w c11812w, Data data) {
        Log_OC.getArray(homePresenter, "this$0");
        Log_OC.getArray(c11812w, "$user");
        homePresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.home.Attribute
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                C11812w $r1 = C11812w.this;
                HomePresenter $r2 = homePresenter;
                HomeView $r4 = (HomeView) obj;
                HomePresenter.m39323verifyId$lambda7$lambda6($r1, $r2, $r4);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: verifyId$lambda-7$lambda-6 */
    public static final void m39323verifyId$lambda7$lambda6(C11812w c11812w, HomePresenter homePresenter, HomeView homeView) {
        Log_OC.getArray(c11812w, "$user");
        Log_OC.getArray(homePresenter, "this$0");
        Log_OC.getArray(homeView, "view");
        homeView.showTodoLoading(false);
        Object $r3 = c11812w.f26499c;
        User $r4 = (User) $r3;
        if ($r4 != null) {
            User.Builder $r5 = $r4.toBuilder();
            Boolean $r6 = Boolean.TRUE;
            User $r42 = $r5.setIsBvnVerified($r6).build();
            UpdateUser $r7 = homePresenter.updateUser;
            Log_OC.loadImage($r42, MetricTracker.Object.INPUT);
            AbstractC11688p $r8 = $r7.execute($r42);
            $r8.m10517c0();
        }
        Object $r32 = c11812w.f26499c;
        VerifyStateResult $r9 = $r32 != null ? VerifyStateResult.SUCCESS : VerifyStateResult.FAILURE;
        HomeView.DefaultImpls.showVerifyPrompt$default(homeView, $r9, null, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: verifyId$lambda-9 */
    public static final void m39324verifyId$lambda9(HomePresenter homePresenter, Throwable th) {
        Log_OC.getArray(homePresenter, "this$0");
        DateFormat $r2 = DateFormat.SHORT;
        homePresenter.ifViewAttached($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: verifyId$lambda-9$lambda-8 */
    public static final void m39325verifyId$lambda9$lambda8(HomeView homeView) {
        Log_OC.getArray(homeView, "view");
        homeView.showTodoLoading(false);
        VerifyStateResult $r1 = VerifyStateResult.FAILURE;
        HomeView.DefaultImpls.showVerifyPrompt$default(homeView, $r1, null, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void checkBvnIsVerified() {
        FetchCurrentUser $r1 = this.currentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        FavoritesArrayAdapter $r4 = $r2.r(new Object() { // from class: ai.kudi.agent.home.NotFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                HomePresenter $r12 = HomePresenter.this;
                User $r3 = (User) obj;
                HomePresenter.m39281checkBvnIsVerified$lambda46($r12, $r3);
            }
        });
        C11280b $r5 = this.compositeDisposable;
        $r5.b($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void checkTerminalID() {
        FetchCurrentUser $r1 = this.currentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.home.FileFilterUtil$3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                HomePresenter $r12 = HomePresenter.this;
                User $r3 = (User) obj;
                HomePresenter.m39283checkTerminalID$lambda21($r12, $r3);
            }
        };
        Message$RecipientType $r4 = Message$RecipientType.f348TO;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        Log_OC.loadImage($r5, "currentUser.execute()\n            .subscribe(\n                { user ->\n                    ifViewAttached {\n                        it.checkTerminalID(user.terminalId)\n                    }\n                },\n                {\n                }\n            )");
        C11280b $r6 = this.compositeDisposable;
        $r6.b($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.C9410b, p272h.p364d.p365a.p366c.InterfaceC9413d
    public void destroy() {
        super.destroy();
        C11280b $r1 = this.compositeDisposable;
        $r1.m11212i();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchInsuranceStatus() {
        SharedPreferences $r1 = this.sharedPreferences;
        String $r2 = $r1.getString(LoginParams.EXTRA_CUSTOMER_TYPE, "AGENT");
        String $r3 = $r2;
        if ($r2 == null) {
            $r3 = "AGENT";
        }
        boolean $z0 = Log_OC.append($r3, "AGENT");
        if ($z0) {
            FetchCurrentUser $r4 = this.currentUser;
            AbstractC11696w $r5 = FetchCurrentUser.execute$default($r4, null, null, 3, null);
            FavoritesArrayAdapter $r7 = $r5.r(new Object() { // from class: ai.kudi.agent.home.IOUtils$2
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    HomePresenter $r12 = HomePresenter.this;
                    User $r32 = (User) obj;
                    HomePresenter.m39286fetchInsuranceStatus$lambda19($r12, $r32);
                }
            });
            C11280b $r8 = this.compositeDisposable;
            $r8.b($r7);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchTodos() {
        Affiliation $r1 = Affiliation.publisher;
        ifViewAttached($r1);
        List $r2 = this.listOfTodos;
        $r2.clear();
        FetchCurrentUser $r3 = this.currentUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        AbstractC11688p $r6 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.home.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                HomePresenter $r12 = HomePresenter.this;
                User $r42 = (User) obj;
                InterfaceC11692s $r22 = HomePresenter.m39297fetchTodos$lambda40($r12, $r42);
                return $r22;
            }
        });
        FavoritesArrayAdapter $r9 = $r6.e0(new Object() { // from class: ai.kudi.agent.home.ReplaySubject$UnboundedReplayState
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                HomePresenter $r12 = HomePresenter.this;
                TodoResponse $r32 = (TodoResponse) obj;
                HomePresenter.m39298fetchTodos$lambda42($r12, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.home.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                HomePresenter $r12 = HomePresenter.this;
                Throwable $r32 = (Throwable) obj;
                HomePresenter.m39300fetchTodos$lambda44($r12, $r32);
            }
        });
        C11280b $r10 = this.compositeDisposable;
        $r10.b($r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Analytics getAnalytics() {
        Analytics r1 = this.analytics;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C11280b getCompositeDisposable() {
        C11280b r1 = this.compositeDisposable;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getCount() {
        int i0 = this.count;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FetchCurrentUser getCurrentUser() {
        FetchCurrentUser r1 = this.currentUser;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void getMonnifyDetails() {
        FetchCurrentUser $r1 = this.currentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        AbstractC11688p $r4 = $r2.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.home.FieldWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                HomePresenter $r12 = HomePresenter.this;
                User $r42 = (User) obj;
                InterfaceC11692s $r22 = HomePresenter.m39302getMonnifyDetails$lambda35($r12, $r42);
                return $r22;
            }
        });
        Object object = new Object() { // from class: ai.kudi.agent.home.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                HomePresenter $r12 = HomePresenter.this;
                List $r3 = (List) obj;
                HomePresenter.m39303getMonnifyDetails$lambda37($r12, $r3);
            }
        };
        Chunk $r6 = Chunk.NEWLINE;
        FavoritesArrayAdapter $r7 = $r4.e0(object, $r6);
        C11280b $r8 = this.compositeDisposable;
        $r8.b($r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void getNotificationCount() {
        FetchCurrentUser $r1 = this.currentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        AbstractC11688p $r4 = $r2.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.home.x
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                HomePresenter $r12 = HomePresenter.this;
                User $r42 = (User) obj;
                InterfaceC11692s $r22 = HomePresenter.m39306getNotificationCount$lambda23($r12, $r42);
                return $r22;
            }
        });
        FavoritesArrayAdapter $r7 = $r4.e0(new Object() { // from class: ai.kudi.agent.home.ReplaySubject$BoundedState
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                HomePresenter $r12 = HomePresenter.this;
                NotificationCount $r3 = (NotificationCount) obj;
                HomePresenter.m39307getNotificationCount$lambda25($r12, $r3);
            }
        }, new Object() { // from class: ai.kudi.agent.home.Socks5BytestreamRequest
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                HomePresenter $r12 = HomePresenter.this;
                Throwable $r3 = (Throwable) obj;
                HomePresenter.m39309getNotificationCount$lambda27($r12, $r3);
            }
        });
        C11280b $r8 = this.compositeDisposable;
        $r8.b($r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getPhoneNumber() {
        String r1 = this.phoneNumber;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final User getUserObject() {
        User r1 = this.userObject;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void getWalletBalance() {
        FetchCurrentUser $r1 = this.currentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        AbstractC11688p $r4 = $r2.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.home.a
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                HomePresenter $r12 = HomePresenter.this;
                User $r42 = (User) obj;
                InterfaceC11692s $r22 = HomePresenter.m39311getWalletBalance$lambda28($r12, $r42);
                return $r22;
            }
        });
        FavoritesArrayAdapter $r7 = $r4.e0(new Object() { // from class: ai.kudi.agent.home.Call
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                HomePresenter $r12 = HomePresenter.this;
                Wallet $r3 = (Wallet) obj;
                HomePresenter.m39312getWalletBalance$lambda30($r12, $r3);
            }
        }, new Object() { // from class: ai.kudi.agent.home.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                HomePresenter $r12 = HomePresenter.this;
                Throwable $r3 = (Throwable) obj;
                HomePresenter.m39314getWalletBalance$lambda32($r12, $r3);
            }
        });
        C11280b $r8 = this.compositeDisposable;
        $r8.b($r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void logOnOutletMgtClicked() {
        Analytics $r1 = this.analytics;
        $r1.onOutletManagerButtonClicked();
        SmartLookAnalytics $r2 = this.smartLookAnalytics;
        $r2.logOutletManagement();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void logSettingsMenuClickEvent() {
        Analytics $r1 = this.analytics;
        String $r2 = this.phoneNumber;
        $r1.onSettingsMenuClick($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void logUnReadNotificationCountEvent(boolean z) {
        int $i0 = this.count;
        if ($i0 > 0) {
            if (z) {
                Analytics $r1 = this.analytics;
                User $r2 = this.userObject;
                $r1.onNotificationIconClickedEvent($i0, $r2);
                return;
            }
            Analytics $r12 = this.analytics;
            User $r22 = this.userObject;
            $r12.onNotificationMenuClickedEvent($i0, $r22);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void marketplaceOptionClicked() {
        FetchCurrentUser $r1 = this.currentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.home.PacketIDFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                HomePresenter $r12 = HomePresenter.this;
                User $r3 = (User) obj;
                HomePresenter.m39318marketplaceOptionClicked$lambda33($r12, $r3);
            }
        };
        Token $r4 = Token.BOOL;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        Log_OC.loadImage($r5, "currentUser.execute().subscribe({\n            analytics.marketPlaceMenuNavClicked(it.phoneNumber, true)\n        }, {\n            it.printStackTrace()\n        })");
        C11280b $r6 = this.compositeDisposable;
        $r6.b($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String returnPhoneNumber() {
        String r1 = this.phoneNumber;
        return r1;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void setPhoneNumber(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.phoneNumber = str;
    }

    public final void setUserObject(User user) {
        this.userObject = user;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void verifyId(final String str) {
        Log_OC.getArray(str, "idNumber");
        EventListener $r2 = EventListener.EQUAL;
        ifViewAttached($r2);
        final C11812w $r3 = new C11812w();
        FetchCurrentUser $r4 = this.currentUser;
        AbstractC11696w $r5 = FetchCurrentUser.execute$default($r4, null, null, 3, null);
        AbstractC11688p $r7 = $r5.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.home.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                C11812w $r1 = C11812w.this;
                HomePresenter $r22 = this;
                String $r32 = str;
                User $r6 = (User) obj;
                InterfaceC11692s $r42 = HomePresenter.m39321verifyId$lambda4($r1, $r22, $r32, $r6);
                return $r42;
            }
        });
        FavoritesArrayAdapter $r10 = $r7.e0(new Object() { // from class: ai.kudi.agent.home.StandardShowcaseDrawer
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                HomePresenter $r1 = HomePresenter.this;
                C11812w $r22 = $r3;
                Data $r42 = (Data) obj;
                HomePresenter.m39322verifyId$lambda7($r1, $r22, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.home.SubjectSubscriptionManager$SubjectObserver
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                HomePresenter $r1 = HomePresenter.this;
                Throwable $r32 = (Throwable) obj;
                HomePresenter.m39324verifyId$lambda9($r1, $r32);
            }
        });
        C11280b $r11 = this.compositeDisposable;
        $r11.b($r10);
    }
}

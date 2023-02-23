package ai.kudi.agent.transactions.presenters;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.domain.room_entities.CategoryData;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.issues.domain.FetchCategoryByLabel;
import ai.kudi.agent.network.exceptions.NotFoundException;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.notification.data.model.NotificationModel;
import ai.kudi.agent.notification.domain.UpdateNotificationReadStatus;
import ai.kudi.agent.transactions.domain.dto.TerminalConnectionResponse;
import ai.kudi.agent.transactions.domain.usecases.FetchTransaction;
import ai.kudi.agent.transactions.domain.usecases.InitializeTerminalRequest;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.transactions.views.TransactionDetailsView;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import com.google.firebase.database.C5612d;
import com.google.firebase.database.C5615f;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.C11810u;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
import p272h.p364d.p365a.p366c.LoginListener;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
import p590o.p591a.Timber;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: TransactionDetailsPresenter.kt */
@Metadata(m10422d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 ?2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001?B?\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\b\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0017H\u0016J\u000e\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020'J\u0006\u0010(\u001a\u00020\"J\u0012\u0010)\u001a\u00020\u00172\b\u0010*\u001a\u0004\u0018\u00010'H\u0002J \u0010+\u001a\u00020\"2\u0016\u0010,\u001a\u0012\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020'0-j\u0002`.H\u0002J\u0018\u0010/\u001a\u00020\"2\u0006\u00100\u001a\u00020'2\b\b\u0002\u00101\u001a\u00020\u0017J\u001e\u00102\u001a\u00020\"2\u0016\u0010,\u001a\u0012\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020'0-j\u0002`.J \u00103\u001a\u00020\"2\u0016\u0010,\u001a\u0012\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020'0-j\u0002`.H\u0002J\u001e\u00104\u001a\u00020\"2\u0016\u0010,\u001a\u0012\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020'0-j\u0002`.J\"\u00105\u001a\u00020\"2\u0006\u00100\u001a\u00020'2\b\b\u0002\u00101\u001a\u00020\u00172\u0006\u00106\u001a\u00020\u001cH\u0002J\u001e\u00107\u001a\u00020\"2\u0016\u0010,\u001a\u0012\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020'0-j\u0002`.J1\u00108\u001a\u00020\"2\u0006\u00109\u001a\u00020'2!\u0010:\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b<\u0012\b\b=\u0012\u0004\b\b(>\u0012\u0004\u0012\u00020\"0;R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006@"}, m10421d2 = {"Lai/kudi/agent/transactions/presenters/TransactionDetailsPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/transactions/views/TransactionDetailsView;", "fetchTransaction", "Lai/kudi/agent/transactions/domain/usecases/FetchTransaction;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "updateNotificationReadStatus", "Lai/kudi/agent/notification/domain/UpdateNotificationReadStatus;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "firebaseDatabase", "Lcom/google/firebase/database/FirebaseDatabase;", "fetchCategoryByLabel", "Lai/kudi/agent/issues/domain/FetchCategoryByLabel;", "initializeTerminalRequest", "Lai/kudi/agent/transactions/domain/usecases/InitializeTerminalRequest;", "(Lai/kudi/agent/transactions/domain/usecases/FetchTransaction;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/notification/domain/UpdateNotificationReadStatus;Lai/kudi/agent/core/analytics/Analytics;Lcom/google/firebase/database/FirebaseDatabase;Lai/kudi/agent/issues/domain/FetchCategoryByLabel;Lai/kudi/agent/transactions/domain/usecases/InitializeTerminalRequest;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "isLoading", "", "()Z", "setLoading", "(Z)V", "user", "Lai/kudi/agent/users/domain/dto/User;", "getUser", "()Lai/kudi/agent/users/domain/dto/User;", "setUser", "(Lai/kudi/agent/users/domain/dto/User;)V", "destroy", "", "detachView", "retainInstance", "fetchIssueCategoryByLabel", "label", "", "getCurrentUser", "isTypeAllowed", "type", "isUserAllowedToAccessFeature", "transaction", "Ljava/util/HashMap;", "Lai/kudi/agent/transactions/domain/dto/Transaction;", "loadTransaction", "reference", "isRefreshMenuClicked", "logEventOnClickedHelpTab", "logOnRefreshMenuIconClickedEvent", "logPrinterTransactionEvent", "onGetCurrentUserSuccess", "kudiUser", "sendReceiptToTerminal", "updateNotificationStatus", "notificationId", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "readStatus", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionDetailsPresenter extends C9410b<TransactionDetailsView> {
    public static final String CASH = "cash withdrawal";
    public static final Companion Companion;
    public static final String DSTV = "dstv subscription";
    public static final String GOTV = "gotv subscription";
    public static final String PHCN = "phcn bill payment";
    public static final String TRANSFER = "funds transfer";
    private final Analytics analytics;
    private final C11280b compositeDisposable;
    private final FetchCategoryByLabel fetchCategoryByLabel;
    private final FetchCurrentUser fetchCurrentUser;
    private final FetchTransaction fetchTransaction;
    private final C5615f firebaseDatabase;
    private final InitializeTerminalRequest initializeTerminalRequest;
    private boolean isLoading;
    private final UpdateNotificationReadStatus updateNotificationReadStatus;
    private User user;

    /* compiled from: TransactionDetailsPresenter.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/transactions/presenters/TransactionDetailsPresenter$Companion;", "", "()V", "CASH", "", "DSTV", "GOTV", "PHCN", "TRANSFER", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionDetailsPresenter(FetchTransaction fetchTransaction, FetchCurrentUser fetchCurrentUser, UpdateNotificationReadStatus updateNotificationReadStatus, Analytics analytics, C5615f c5615f, FetchCategoryByLabel fetchCategoryByLabel, InitializeTerminalRequest initializeTerminalRequest) {
        Log_OC.getArray(fetchTransaction, "fetchTransaction");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(updateNotificationReadStatus, "updateNotificationReadStatus");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(c5615f, "firebaseDatabase");
        Log_OC.getArray(fetchCategoryByLabel, "fetchCategoryByLabel");
        Log_OC.getArray(initializeTerminalRequest, "initializeTerminalRequest");
        this.fetchTransaction = fetchTransaction;
        this.fetchCurrentUser = fetchCurrentUser;
        this.updateNotificationReadStatus = updateNotificationReadStatus;
        this.analytics = analytics;
        this.firebaseDatabase = c5615f;
        this.fetchCategoryByLabel = fetchCategoryByLabel;
        this.initializeTerminalRequest = initializeTerminalRequest;
        C11280b $r8 = new C11280b();
        this.compositeDisposable = $r8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchIssueCategoryByLabel$lambda-11  reason: not valid java name */
    public static final void m41178fetchIssueCategoryByLabel$lambda11(TransactionDetailsPresenter transactionDetailsPresenter, final Throwable th) {
        Log_OC.getArray(transactionDetailsPresenter, "this$0");
        transactionDetailsPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.transactions.presenters.j
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                Throwable $r1 = th;
                TransactionDetailsView $r3 = (TransactionDetailsView) obj;
                TransactionDetailsPresenter.m41179fetchIssueCategoryByLabel$lambda11$lambda10($r1, $r3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchIssueCategoryByLabel$lambda-11$lambda-10  reason: not valid java name */
    public static final void m41179fetchIssueCategoryByLabel$lambda11$lambda10(Throwable th, TransactionDetailsView transactionDetailsView) {
        Log_OC.getArray(transactionDetailsView, "it");
        transactionDetailsView.toggleRaiseChargeBackLoading(false);
        InterfaceC11767l $r2 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        Object $r3 = $r2.invoke(th);
        String $r4 = (String) $r3;
        transactionDetailsView.showError($r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchIssueCategoryByLabel$lambda-6  reason: not valid java name */
    public static final void m41180fetchIssueCategoryByLabel$lambda6(TransactionDetailsView transactionDetailsView) {
        Log_OC.getArray(transactionDetailsView, "it");
        transactionDetailsView.toggleRaiseChargeBackLoading(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchIssueCategoryByLabel$lambda-9  reason: not valid java name */
    public static final void m41181fetchIssueCategoryByLabel$lambda9(TransactionDetailsPresenter transactionDetailsPresenter, final CategoryData categoryData) {
        Log_OC.getArray(transactionDetailsPresenter, "this$0");
        transactionDetailsPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.transactions.presenters.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                CategoryData $r1 = CategoryData.this;
                TransactionDetailsView $r3 = (TransactionDetailsView) obj;
                TransactionDetailsPresenter.m41182fetchIssueCategoryByLabel$lambda9$lambda8($r1, $r3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchIssueCategoryByLabel$lambda-9$lambda-8  reason: not valid java name */
    public static final void m41182fetchIssueCategoryByLabel$lambda9$lambda8(CategoryData categoryData, TransactionDetailsView transactionDetailsView) {
        Log_OC.getArray(transactionDetailsView, "view");
        transactionDetailsView.toggleRaiseChargeBackLoading(false);
        if (categoryData == null) {
            return;
        }
        transactionDetailsView.onChargeBackCategoryFetched(categoryData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getCurrentUser$lambda-19  reason: not valid java name */
    public static final void m41183getCurrentUser$lambda19(TransactionDetailsPresenter transactionDetailsPresenter, final User user) {
        Log_OC.getArray(transactionDetailsPresenter, "this$0");
        transactionDetailsPresenter.setUser(user);
        transactionDetailsPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.transactions.presenters.Server
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void filter(Object obj) {
                User $r1 = User.this;
                TransactionDetailsView $r3 = (TransactionDetailsView) obj;
                TransactionDetailsPresenter.m41184getCurrentUser$lambda19$lambda18($r1, $r3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCurrentUser$lambda-19$lambda-18  reason: not valid java name */
    public static final void m41184getCurrentUser$lambda19$lambda18(User user, TransactionDetailsView transactionDetailsView) {
        Log_OC.getArray(transactionDetailsView, "it");
        Log_OC.loadImage(user, "currentUser");
        transactionDetailsView.currentUserFetched(user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getCurrentUser$lambda-20  reason: not valid java name */
    public static final void m41185getCurrentUser$lambda20(TransactionDetailsPresenter transactionDetailsPresenter, Throwable th) {
        Log_OC.getArray(transactionDetailsPresenter, "this$0");
        boolean $z0 = th instanceof NotFoundException;
        if ($z0) {
            LoginListener $r0 = transactionDetailsPresenter.getView();
            TransactionDetailsView $r3 = (TransactionDetailsView) $r0;
            $r3.showLogin();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isTypeAllowed(String str) {
        boolean $z0 = Log_OC.append(str, PHCN);
        if ($z0) {
            return true;
        }
        boolean $z02 = Log_OC.append(str, DSTV);
        if ($z02) {
            return true;
        }
        boolean $z03 = Log_OC.append(str, GOTV);
        if ($z03) {
            return true;
        }
        boolean $z04 = Log_OC.append(str, CASH);
        if ($z04) {
            return true;
        }
        boolean $z05 = Log_OC.append(str, TRANSFER);
        return $z05;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void isUserAllowedToAccessFeature(HashMap hashMap) {
        String $r8;
        final C11810u $r2 = new C11810u();
        final C11810u $r1 = new C11810u();
        Object $r5 = hashMap.get(TransactionField.TIME);
        String $r6 = (String) $r5;
        final Date $r7 = StringExtKt.formatKudiDate($r6);
        Object $r52 = hashMap.get("type");
        final String $r62 = (String) $r52;
        Object $r53 = hashMap.get("Status");
        String str = (String) $r53;
        if (str == null) {
            $r8 = null;
        } else {
            Locale $r9 = Locale.getDefault();
            Log_OC.loadImage($r9, "getDefault()");
            $r8 = str.toLowerCase($r9);
            Log_OC.loadImage($r8, "(this as java.lang.String).toLowerCase(locale)");
        }
        Object $r54 = hashMap.get("customer");
        final String str2 = (String) $r54;
        FetchCurrentUser $r11 = this.fetchCurrentUser;
        AbstractC11696w $r12 = FetchCurrentUser.execute$default($r11, null, null, 3, null);
        final String str3 = $r8;
        Object object = new Object() { // from class: ai.kudi.agent.transactions.presenters.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransactionDetailsPresenter $r22 = TransactionDetailsPresenter.this;
                C11810u $r3 = $r1;
                Date $r4 = $r7;
                C11810u $r55 = $r2;
                String $r63 = r5;
                String $r72 = str2;
                String $r82 = str3;
                String $r92 = $r62;
                User $r10 = (User) obj;
                TransactionDetailsPresenter.m41186isUserAllowedToAccessFeature$lambda23($r22, $r3, $r4, $r55, $r63, $r72, $r82, $r92, $r10);
            }
        };
        FalseFileFilter $r13 = FalseFileFilter.IMAGE_GAP;
        FavoritesArrayAdapter $r14 = $r12.s(object, $r13);
        Log_OC.loadImage($r14, "fetchCurrentUser.execute().subscribe(\n            { user ->\n                val ref =\n                    firebaseDatabase.getReference(\"feature-management\").child(\"customerCreation\")\n                ref.addListenerForSingleValueEvent(object : ValueEventListener {\n                    override fun onCancelled(error: DatabaseError) {\n                        ifViewAttached { it.hideAddCustomerButton() }\n                    }\n\n                    @Suppress(\"UNCHECKED_CAST\")\n                    override fun onDataChange(dataSnapshot: DataSnapshot) {\n                        try {\n                            val map = dataSnapshot.value as FeatureManagement\n                            if (map.containsKey(\"enableDate\")) {\n                                // get only the first item because it will always contain one item anyway\n                                val date = map[\"enableDate\"]?.get(0)\n                                val allowedDate = formatKudiDateAlt3(date.orEmpty())\n                                isDateAllowed = allowedDate <= transactionTime\n                            }\n                            if (map.containsKey(\"states\")) {\n                                // allow if feature is available to all states or the agent's state\n                                allow =\n                                    (\n                                        map[\"states\"]?.contains(allowAll) == true || map[\"states\"]?.contains(\n                                            user.state.lowercase(Locale.getDefault())\n                                        ) == true\n                                        )\n                                // if state is already allowed, there is no need checking phonenumber access.\n                                if (!allow && map.containsKey(\"users\")) {\n                                    // allow if feature is available to all phone number or the agent's phonenumber\n                                    allow =\n                                        map[\"users\"]?.contains(allowAll) == true || map[\"users\"]?.contains(\n                                        user.phoneNumber\n                                    ) == true\n                                }\n                            }\n                            if (allow && isDateAllowed && customer.isNullOrEmpty() &&\n                                trxStatus == \"completed successfully\" &&\n                                isTypeAllowed(transactionType?.lowercase(Locale.getDefault()))\n                            ) {\n                                ifViewAttached { it.showAddCustomerButton() }\n                            } else {\n                                ifViewAttached { it.hideAddCustomerButton() }\n                            }\n                        } catch (exception: Exception) {\n                            CrashlyticsReport.logException(exception)\n                            // use fallBack here\n                            Timber.i(\"$exception\")\n                            ifViewAttached { it.hideAddCustomerButton() }\n                        }\n                    }\n                })\n            },\n            {\n                it.printStackTrace()\n                CrashlyticsReport.logException(it)\n            }\n        )");
        C11280b $r15 = this.compositeDisposable;
        $r15.b($r14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: isUserAllowedToAccessFeature$lambda-23  reason: not valid java name */
    public static final void m41186isUserAllowedToAccessFeature$lambda23(TransactionDetailsPresenter transactionDetailsPresenter, C11810u c11810u, Date date, C11810u c11810u2, String str, String str2, String str3, String str4, User user) {
        Log_OC.getArray(transactionDetailsPresenter, "this$0");
        Log_OC.getArray(c11810u, "$isDateAllowed");
        Log_OC.getArray(date, "$transactionTime");
        Log_OC.getArray(c11810u2, "$allow");
        Log_OC.getArray(str, "$allowAll");
        C5615f $r10 = transactionDetailsPresenter.firebaseDatabase;
        C5612d $r11 = $r10.m24316f("feature-management").m24327j("customerCreation");
        Log_OC.loadImage($r11, "firebaseDatabase.getReference(\"feature-management\").child(\"customerCreation\")");
        C0611xbfe79eba $r9 = new C0611xbfe79eba(transactionDetailsPresenter, c11810u, date, c11810u2, str, user, str2, str3, str4);
        $r11.m24307b($r9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isUserAllowedToAccessFeature$lambda-24  reason: not valid java name */
    public static final void m41187isUserAllowedToAccessFeature$lambda24(Throwable th) {
        th.printStackTrace();
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void loadTransaction$default(TransactionDetailsPresenter transactionDetailsPresenter, String str, boolean $z0, int i, Object obj) {
        int $i0 = i & 2;
        if ($i0 != 0) {
            $z0 = false;
        }
        transactionDetailsPresenter.loadTransaction(str, $z0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadTransaction$lambda-12  reason: not valid java name */
    public static final void m41188loadTransaction$lambda12(TransactionDetailsPresenter transactionDetailsPresenter, String str, boolean z, User user) {
        Log_OC.getArray(transactionDetailsPresenter, "this$0");
        Log_OC.getArray(str, "$reference");
        Log_OC.loadImage(user, "it");
        transactionDetailsPresenter.onGetCurrentUserSuccess(str, z, user);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void logOnRefreshMenuIconClickedEvent(HashMap hashMap) {
        Analytics $r1 = this.analytics;
        Object $r4 = hashMap.get("type");
        String $r5 = String.valueOf($r4);
        Object $r42 = hashMap.get(TransactionField.AMOUNT);
        String $r6 = String.valueOf($r42);
        Object $r43 = hashMap.get("reference");
        String $r7 = String.valueOf($r43);
        Object $r44 = hashMap.get("productId");
        String $r8 = String.valueOf($r44);
        Object $r45 = hashMap.get("fee");
        String $r9 = String.valueOf($r45);
        User $r2 = this.user;
        $r1.onTransactionRefreshedClickedEvent($r5, $r6, $r7, $r8, $r9, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r2 != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onGetCurrentUserSuccess(java.lang.String r16, final boolean r17, final ai.kudi.agent.users.domain.package_1.User r18) {
        /*
            r15 = this;
            r0 = r18
            r15.user = r0
            java.lang.String r3 = "RFD-"
            r4 = 0
            r5 = 2
            r6 = 0
            r0 = r16
            boolean r2 = kotlin.p549l0.C13265j.m5507E(r0, r3, r4, r5, r6)
            if (r2 != 0) goto L1e
            java.lang.String r3 = "REV-"
            r4 = 0
            r5 = 2
            r6 = 0
            r0 = r16
            boolean r2 = kotlin.p549l0.C13265j.m5507E(r0, r3, r4, r5, r6)
            if (r2 == 0) goto L2e
        L1e:
            if (r16 == 0) goto L4e
            r4 = 4
            r0 = r16
            java.lang.String r7 = r0.substring(r4)
            r16 = r7
            java.lang.String r3 = "(this as java.lang.String).substring(startIndex)"
            kotlin.p483e0.p485d.Log_OC.loadImage(r7, r3)
        L2e:
            ai.kudi.agent.transactions.domain.usecases.FetchTransaction r8 = r15.fetchTransaction
            r0 = r16
            j.e.p r9 = r8.execute(r0)
            ai.kudi.agent.transactions.presenters.Response r10 = new ai.kudi.agent.transactions.presenters.Response
            r0 = r17
            r1 = r18
            r10.<init>()
            ai.kudi.agent.transactions.presenters.ReplaySubject$UnboundedReplayState r11 = new ai.kudi.agent.transactions.presenters.ReplaySubject$UnboundedReplayState
            r11.<init>()
            j.e.c0.FavoritesArrayAdapter r12 = r9.e0(r10, r11)
            j.e.c0.b r13 = r15.compositeDisposable
            r13.b(r12)
            return
        L4e:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.String"
            r14.<init>(r3)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactions.presenters.TransactionDetailsPresenter.onGetCurrentUserSuccess(java.lang.String, boolean, ai.kudi.agent.users.domain.package_1.User):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ void onGetCurrentUserSuccess$default(TransactionDetailsPresenter transactionDetailsPresenter, String str, boolean $z0, User user, int i, Object obj) {
        int $i0 = i & 2;
        if ($i0 != 0) {
            $z0 = false;
        }
        transactionDetailsPresenter.onGetCurrentUserSuccess(str, $z0, user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onGetCurrentUserSuccess$lambda-15  reason: not valid java name */
    public static final void m41190onGetCurrentUserSuccess$lambda15(final TransactionDetailsPresenter transactionDetailsPresenter, boolean z, final User user, final HashMap hashMap) {
        Log_OC.getArray(transactionDetailsPresenter, "this$0");
        Log_OC.getArray(user, "$kudiUser");
        Log_OC.getArray(hashMap, "transaction");
        transactionDetailsPresenter.setLoading(false);
        if (z) {
            transactionDetailsPresenter.logOnRefreshMenuIconClickedEvent(hashMap);
        }
        transactionDetailsPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.transactions.presenters.ResizableDoubleArray
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void copy(Object obj) {
                HashMap $r1 = hashMap;
                User $r2 = user;
                TransactionDetailsPresenter $r3 = transactionDetailsPresenter;
                TransactionDetailsView $r5 = (TransactionDetailsView) obj;
                TransactionDetailsPresenter.m41191onGetCurrentUserSuccess$lambda15$lambda14($r1, $r2, $r3, $r5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onGetCurrentUserSuccess$lambda-15$lambda-14  reason: not valid java name */
    public static final void m41191onGetCurrentUserSuccess$lambda15$lambda14(HashMap hashMap, User user, TransactionDetailsPresenter transactionDetailsPresenter, TransactionDetailsView transactionDetailsView) {
        Log_OC.getArray(hashMap, "$transaction");
        Log_OC.getArray(user, "$kudiUser");
        Log_OC.getArray(transactionDetailsPresenter, "this$0");
        Log_OC.getArray(transactionDetailsView, "view");
        transactionDetailsView.hideLoading();
        transactionDetailsView.showTransaction(hashMap, user);
        transactionDetailsPresenter.isUserAllowedToAccessFeature(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onGetCurrentUserSuccess$lambda-17  reason: not valid java name */
    public static final void m41192onGetCurrentUserSuccess$lambda17(TransactionDetailsPresenter transactionDetailsPresenter, Throwable th) {
        Log_OC.getArray(transactionDetailsPresenter, "this$0");
        transactionDetailsPresenter.setLoading(false);
        th.printStackTrace();
        Operator $r2 = Operator.f1676or;
        transactionDetailsPresenter.ifViewAttached($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onGetCurrentUserSuccess$lambda-17$lambda-16  reason: not valid java name */
    public static final void m41193onGetCurrentUserSuccess$lambda17$lambda16(TransactionDetailsView transactionDetailsView) {
        Log_OC.getArray(transactionDetailsView, "view");
        transactionDetailsView.hideLoading();
        transactionDetailsView.showError("Error loading transaction. Try again");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendReceiptToTerminal$lambda-0  reason: not valid java name */
    public static final void m41194sendReceiptToTerminal$lambda0(TransactionDetailsView transactionDetailsView) {
        Log_OC.getArray(transactionDetailsView, "it");
        transactionDetailsView.showTerminalConnectionLoading(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: sendReceiptToTerminal$lambda-1  reason: not valid java name */
    public static final InterfaceC11692s m41195sendReceiptToTerminal$lambda1(TransactionDetailsPresenter transactionDetailsPresenter, User user) {
        Log_OC.getArray(transactionDetailsPresenter, "this$0");
        Log_OC.getArray(user, "user");
        Object[] $r3 = new Object[0];
        Timber.wtf(Log_OC.m10359a("serial number : ", (Object) user.getSerialNumber()), $r3);
        InitializeTerminalRequest $r4 = transactionDetailsPresenter.initializeTerminalRequest;
        String $r2 = user.getSessionId();
        Log_OC.loadImage($r2, "user.sessionId");
        String $r6 = user.getTerminalId();
        Log_OC.loadImage($r6, "user.terminalId");
        InitializeTerminalRequest.InitializeTerminalRequestInput $r5 = new InitializeTerminalRequest.InitializeTerminalRequestInput($r2, $r6);
        AbstractC11688p $r7 = $r4.execute($r5);
        return $r7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: sendReceiptToTerminal$lambda-3  reason: not valid java name */
    public static final void m41196sendReceiptToTerminal$lambda3(TransactionDetailsPresenter transactionDetailsPresenter, final HashMap hashMap, final TerminalConnectionResponse terminalConnectionResponse) {
        Log_OC.getArray(transactionDetailsPresenter, "this$0");
        Log_OC.getArray(hashMap, "$transaction");
        transactionDetailsPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.transactions.presenters.License
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void copy(Object obj) {
                TerminalConnectionResponse $r1 = TerminalConnectionResponse.this;
                HashMap $r2 = hashMap;
                TransactionDetailsView $r4 = (TransactionDetailsView) obj;
                TransactionDetailsPresenter.m41197sendReceiptToTerminal$lambda3$lambda2($r1, $r2, $r4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendReceiptToTerminal$lambda-3$lambda-2  reason: not valid java name */
    public static final void m41197sendReceiptToTerminal$lambda3$lambda2(TerminalConnectionResponse terminalConnectionResponse, HashMap hashMap, TransactionDetailsView transactionDetailsView) {
        Log_OC.getArray(hashMap, "$transaction");
        Log_OC.getArray(transactionDetailsView, "it");
        transactionDetailsView.showTerminalConnectionLoading(false);
        Log_OC.loadImage(terminalConnectionResponse, "response");
        transactionDetailsView.onTerminalConnectionComplete(terminalConnectionResponse, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: sendReceiptToTerminal$lambda-5  reason: not valid java name */
    public static final void m41198sendReceiptToTerminal$lambda5(TransactionDetailsPresenter transactionDetailsPresenter, final Throwable th) {
        Log_OC.getArray(transactionDetailsPresenter, "this$0");
        transactionDetailsPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.transactions.presenters.Switch
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                Throwable $r1 = th;
                TransactionDetailsView $r3 = (TransactionDetailsView) obj;
                TransactionDetailsPresenter.m41199sendReceiptToTerminal$lambda5$lambda4($r1, $r3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendReceiptToTerminal$lambda-5$lambda-4  reason: not valid java name */
    public static final void m41199sendReceiptToTerminal$lambda5$lambda4(Throwable th, TransactionDetailsView transactionDetailsView) {
        Log_OC.getArray(transactionDetailsView, "it");
        th.printStackTrace();
        transactionDetailsView.showTerminalConnectionLoading(false);
        transactionDetailsView.showTerminalConnectionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: updateNotificationStatus$lambda-21  reason: not valid java name */
    public static final void m41200updateNotificationStatus$lambda21(InterfaceC11767l interfaceC11767l, NotificationModel notificationModel) {
        Log_OC.getArray(interfaceC11767l, "$callback");
        boolean $z0 = notificationModel.getRead();
        if (!$z0) {
            Boolean $r2 = Boolean.FALSE;
            interfaceC11767l.invoke($r2);
            return;
        }
        boolean $z02 = notificationModel.getRead();
        Boolean $r22 = Boolean.valueOf($z02);
        interfaceC11767l.invoke($r22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateNotificationStatus$lambda-22  reason: not valid java name */
    public static final void m41201updateNotificationStatus$lambda22(Throwable th) {
        th.printStackTrace();
        Log_OC.loadImage(th, "err");
        CrashlyticsReport.logException(th);
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
    @Override // p272h.p364d.p365a.p366c.C9410b
    public void detachView(boolean z) {
        if (z) {
            return;
        }
        C11280b $r1 = this.compositeDisposable;
        $r1.m11212i();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchIssueCategoryByLabel(String str) {
        Log_OC.getArray(str, "label");
        ImageCache $r3 = ImageCache.mImageCache;
        ifViewAttached($r3);
        FetchCategoryByLabel $r4 = this.fetchCategoryByLabel;
        AbstractC11688p $r5 = $r4.execute(str);
        FavoritesArrayAdapter $r7 = $r5.e0(new Object() { // from class: ai.kudi.agent.transactions.presenters.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransactionDetailsPresenter $r1 = TransactionDetailsPresenter.this;
                CategoryData $r32 = (CategoryData) obj;
                TransactionDetailsPresenter.m41181fetchIssueCategoryByLabel$lambda9($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.transactions.presenters.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransactionDetailsPresenter $r1 = TransactionDetailsPresenter.this;
                Throwable $r32 = (Throwable) obj;
                TransactionDetailsPresenter.m41178fetchIssueCategoryByLabel$lambda11($r1, $r32);
            }
        });
        C11280b $r8 = this.compositeDisposable;
        $r8.b($r7);
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
    public final void getCurrentUser() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        FavoritesArrayAdapter $r5 = $r2.s(new Object() { // from class: ai.kudi.agent.transactions.presenters.IQTypeFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransactionDetailsPresenter $r12 = TransactionDetailsPresenter.this;
                User $r3 = (User) obj;
                TransactionDetailsPresenter.m41183getCurrentUser$lambda19($r12, $r3);
            }
        }, new Object() { // from class: ai.kudi.agent.transactions.presenters.MessageTypeFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransactionDetailsPresenter $r12 = TransactionDetailsPresenter.this;
                Throwable $r3 = (Throwable) obj;
                TransactionDetailsPresenter.m41185getCurrentUser$lambda20($r12, $r3);
            }
        });
        Log_OC.loadImage($r5, "fetchCurrentUser.execute().subscribe(\n            { currentUser ->\n                user = currentUser\n                ifViewAttached {\n                    it.currentUserFetched(currentUser)\n                }\n            },\n            {\n                if (it is ai.kudi.agent.network.exceptions.NotFoundException) {\n                    view.showLogin()\n                }\n            }\n        )");
        C11280b $r6 = this.compositeDisposable;
        $r6.b($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final User getUser() {
        User r1 = this.user;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isLoading() {
        boolean z0 = this.isLoading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void loadTransaction(final String str, final boolean z) {
        Log_OC.getArray(str, "reference");
        boolean $z1 = this.isLoading;
        if ($z1) {
            return;
        }
        this.isLoading = true;
        LoginListener $r2 = getView();
        TransactionDetailsView $r3 = (TransactionDetailsView) $r2;
        $r3.showLoading();
        FetchCurrentUser $r4 = this.fetchCurrentUser;
        AbstractC11696w $r5 = FetchCurrentUser.execute$default($r4, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.transactions.presenters.Cubic
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransactionDetailsPresenter $r1 = TransactionDetailsPresenter.this;
                String $r22 = str;
                boolean $z0 = z;
                User $r42 = (User) obj;
                TransactionDetailsPresenter.m41188loadTransaction$lambda12($r1, $r22, $z0, $r42);
            }
        };
        Comment $r7 = Comment.User;
        FavoritesArrayAdapter $r8 = $r5.s(object, $r7);
        Log_OC.loadImage($r8, "fetchCurrentUser.execute().subscribe(\n            {\n                onGetCurrentUserSuccess(reference, isRefreshMenuClicked, it)\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r9 = this.compositeDisposable;
        $r9.b($r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void logEventOnClickedHelpTab(HashMap hashMap) {
        String $r8;
        Log_OC.getArray(hashMap, "transaction");
        Analytics $r1 = this.analytics;
        Object $r4 = hashMap.get("type");
        String $r5 = String.valueOf($r4);
        Object $r42 = hashMap.get(TransactionField.AMOUNT);
        String $r6 = String.valueOf($r42);
        User $r2 = this.user;
        String $r7 = "";
        if ($r2 != null && ($r8 = $r2.agentKyc) != null) {
            $r7 = $r8;
        }
        Object $r43 = hashMap.get("reference");
        $r1.onNeedHelpedClickedEvent($r5, $r6, $r7, String.valueOf($r43), this.user);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void logPrinterTransactionEvent(HashMap hashMap) {
        Log_OC.getArray(hashMap, "transaction");
        Analytics $r2 = this.analytics;
        Object $r3 = hashMap.get("reference");
        String $r4 = String.valueOf($r3);
        Object $r32 = hashMap.get("type");
        String $r5 = String.valueOf($r32);
        Object $r33 = hashMap.get(TransactionField.AMOUNT);
        String $r6 = String.valueOf($r33);
        User $r7 = this.user;
        $r2.onPrinterButtonClickedEvent($r4, $r5, $r6, $r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void sendReceiptToTerminal(final HashMap hashMap) {
        Log_OC.getArray(hashMap, "transaction");
        C0614c $r2 = C0614c.f1692d;
        ifViewAttached($r2);
        FetchCurrentUser $r3 = this.fetchCurrentUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        AbstractC11688p $r6 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.transactions.presenters.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                TransactionDetailsPresenter $r1 = TransactionDetailsPresenter.this;
                User $r42 = (User) obj;
                InterfaceC11692s $r22 = TransactionDetailsPresenter.m41195sendReceiptToTerminal$lambda1($r1, $r42);
                return $r22;
            }
        });
        FavoritesArrayAdapter $r9 = $r6.e0(new Object() { // from class: ai.kudi.agent.transactions.presenters.Series
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransactionDetailsPresenter $r1 = TransactionDetailsPresenter.this;
                HashMap $r22 = hashMap;
                TerminalConnectionResponse $r42 = (TerminalConnectionResponse) obj;
                TransactionDetailsPresenter.m41196sendReceiptToTerminal$lambda3($r1, $r22, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.transactions.presenters.NotFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransactionDetailsPresenter $r1 = TransactionDetailsPresenter.this;
                Throwable $r32 = (Throwable) obj;
                TransactionDetailsPresenter.m41198sendReceiptToTerminal$lambda5($r1, $r32);
            }
        });
        C11280b $r10 = this.compositeDisposable;
        $r10.b($r9);
    }

    public final void setLoading(boolean z) {
        this.isLoading = z;
    }

    public final void setUser(User user) {
        this.user = user;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void updateNotificationStatus(String str, final InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(str, "notificationId");
        Log_OC.getArray(interfaceC11767l, "callback");
        UpdateNotificationReadStatus $r3 = this.updateNotificationReadStatus;
        AbstractC11688p $r4 = $r3.execute(str);
        Object object = new Object() { // from class: ai.kudi.agent.transactions.presenters.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InterfaceC11767l $r1 = InterfaceC11767l.this;
                NotificationModel $r32 = (NotificationModel) obj;
                TransactionDetailsPresenter.m41200updateNotificationStatus$lambda21($r1, $r32);
            }
        };
        Token $r6 = Token.BOOL;
        FavoritesArrayAdapter $r7 = $r4.e0(object, $r6);
        C11280b $r8 = this.compositeDisposable;
        $r8.b($r7);
    }
}

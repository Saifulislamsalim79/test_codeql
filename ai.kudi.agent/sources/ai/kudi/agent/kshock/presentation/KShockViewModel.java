package ai.kudi.agent.kshock.presentation;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.kshock.data.model.KShockAvailability;
import ai.kudi.agent.kshock.data.model.KshockEligibility;
import ai.kudi.agent.kshock.data.model.Loan;
import ai.kudi.agent.kshock.navigator.KShockNavigator;
import ai.kudi.agent.kshock.presentation.viewdata.KShockViewData;
import ai.kudi.agent.kshock.usecases.FetchKshockAvailabilty;
import ai.kudi.agent.kshock.usecases.FetchPendingLoan;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11680b;
/* compiled from: KShockViewModel.kt */
@Metadata(m10422d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u001dJ\b\u0010\t\u001a\u00020\u001dH\u0002J\u0010\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u0002H\u0016J\u0006\u0010%\u001a\u00020&J\u0006\u0010'\u001a\u00020\u001dJ\u000e\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020&R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u001a0\u001a0\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, m10421d2 = {"Lai/kudi/agent/kshock/presentation/KShockViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/kshock/presentation/viewdata/KShockViewData;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "kShockNavigator", "Lai/kudi/agent/kshock/navigator/KShockNavigator;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "fetchPendingLoan", "Lai/kudi/agent/kshock/usecases/FetchPendingLoan;", "fetchKshockAvailabilty", "Lai/kudi/agent/kshock/usecases/FetchKshockAvailabilty;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/kshock/navigator/KShockNavigator;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/kshock/usecases/FetchPendingLoan;Lai/kudi/agent/kshock/usecases/FetchKshockAvailabilty;Landroid/content/SharedPreferences;)V", TransactionBreakDownItemType.DATA, "getData", "()Lai/kudi/agent/kshock/presentation/viewdata/KShockViewData;", "onOpenAvailabilityScreen", "Lio/reactivex/subjects/PublishSubject;", "Lai/kudi/agent/kshock/data/model/KShockAvailability;", "kotlin.jvm.PlatformType", "getOnOpenAvailabilityScreen", "()Lio/reactivex/subjects/PublishSubject;", "openStatusScreen", "Lai/kudi/agent/kshock/data/model/Loan;", "getOpenStatusScreen", "applyForLoan", "", "maxLoanAmount", "", "cacheKShockOldUser", "handleIneligibility", "kshockAvailability", "Lai/kudi/agent/kshock/data/model/KshockEligibility;", "initialData", "isNewKshockUser", "", "loadKShockData", "termsAndConditionsAnalytics", TransactionField.STATUS, "Companion", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class KShockViewModel extends BaseViewModel<KShockViewData> {
    public static final Companion Companion;
    public static final String NEW_KSHOCK_USER = "new_kshock_user";
    private final Analytics analytics;
    private final FetchCurrentUser currentUser;
    private final KShockViewData data;
    private final FetchKshockAvailabilty fetchKshockAvailabilty;
    private final FetchPendingLoan fetchPendingLoan;
    private final KShockNavigator kShockNavigator;
    private final C11680b<KShockAvailability> onOpenAvailabilityScreen;
    private final C11680b<Loan> openStatusScreen;
    private final SharedPreferences sharedPreferences;

    /* compiled from: KShockViewModel.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/kshock/presentation/KShockViewModel$Companion;", "", "()V", "NEW_KSHOCK_USER", "", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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
    public KShockViewModel(FetchCurrentUser fetchCurrentUser, KShockNavigator kShockNavigator, Analytics analytics, FetchPendingLoan fetchPendingLoan, FetchKshockAvailabilty fetchKshockAvailabilty, SharedPreferences sharedPreferences) {
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        Log_OC.getArray(kShockNavigator, "kShockNavigator");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(fetchPendingLoan, "fetchPendingLoan");
        Log_OC.getArray(fetchKshockAvailabilty, "fetchKshockAvailabilty");
        Log_OC.getArray(sharedPreferences, "sharedPreferences");
        this.currentUser = fetchCurrentUser;
        this.kShockNavigator = kShockNavigator;
        this.analytics = analytics;
        this.fetchPendingLoan = fetchPendingLoan;
        this.fetchKshockAvailabilty = fetchKshockAvailabilty;
        this.sharedPreferences = sharedPreferences;
        KShockViewData $r7 = new KShockViewData(false, null, null, null, null, null, 63, null);
        this.data = $r7;
        C11680b $r8 = C11680b.m10564v0();
        Log_OC.loadImage($r8, "create<KShockAvailability>()");
        this.onOpenAvailabilityScreen = $r8;
        C11680b $r82 = C11680b.m10564v0();
        Log_OC.loadImage($r82, "create<Loan>()");
        this.openStatusScreen = $r82;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void fetchPendingLoan() {
        FetchCurrentUser $r1 = this.currentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        AbstractC11688p $r4 = $r2.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.kshock.presentation.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                KShockViewModel $r12 = KShockViewModel.this;
                User $r42 = (User) obj;
                InterfaceC11692s $r22 = KShockViewModel.m39582fetchPendingLoan$lambda12($r12, $r42);
                return $r22;
            }
        });
        FavoritesArrayAdapter $r7 = $r4.e0(new Object() { // from class: ai.kudi.agent.kshock.presentation.RxRingBuffer
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                KShockViewModel $r12 = KShockViewModel.this;
                Loan $r3 = (Loan) obj;
                KShockViewModel.m39583fetchPendingLoan$lambda13($r12, $r3);
            }
        }, new Object() { // from class: ai.kudi.agent.kshock.presentation.PacketIDFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                KShockViewModel $r12 = KShockViewModel.this;
                Throwable $r3 = (Throwable) obj;
                KShockViewModel.m39584fetchPendingLoan$lambda14($r12, $r3);
            }
        });
        C11280b $r8 = getCompositeDisposable();
        $r8.b($r7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchPendingLoan$lambda-12  reason: not valid java name */
    public static final InterfaceC11692s m39582fetchPendingLoan$lambda12(KShockViewModel kShockViewModel, User user) {
        Log_OC.getArray(kShockViewModel, "this$0");
        Log_OC.getArray(user, "it");
        FetchPendingLoan $r2 = kShockViewModel.fetchPendingLoan;
        String $r3 = user.getSessionId();
        Log_OC.loadImage($r3, "it.sessionId");
        AbstractC11688p $r4 = $r2.execute($r3);
        return $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchPendingLoan$lambda-13  reason: not valid java name */
    public static final void m39583fetchPendingLoan$lambda13(KShockViewModel kShockViewModel, Loan loan) {
        Log_OC.getArray(kShockViewModel, "this$0");
        C11680b $r1 = kShockViewModel.getOnOpenAvailabilityScreen();
        Log_OC.loadImage(loan, "it");
        KShockAvailability.NotAvailablePendingLoan $r3 = new KShockAvailability.NotAvailablePendingLoan(loan);
        $r1.mo331f($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchPendingLoan$lambda-14  reason: not valid java name */
    public static final void m39584fetchPendingLoan$lambda14(KShockViewModel kShockViewModel, Throwable th) {
        Log_OC.getArray(kShockViewModel, "this$0");
        C11680b $r2 = kShockViewModel.getOnOpenAvailabilityScreen();
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default("Couldn't fetch pending loan", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r5 = $r4.invoke(th);
        String $r6 = (String) $r5;
        KShockAvailability.Error $r3 = new KShockAvailability.Error($r6);
        $r2.mo331f($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0181 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void handleIneligibility(ai.kudi.agent.kshock.data.model.KshockEligibility r32) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.kshock.presentation.KShockViewModel.handleIneligibility(ai.kudi.agent.kshock.data.model.KshockEligibility):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadKShockData$lambda-2  reason: not valid java name */
    public static final InterfaceC11692s m39585loadKShockData$lambda2(KShockViewModel kShockViewModel, User user) {
        Log_OC.getArray(kShockViewModel, "this$0");
        Log_OC.getArray(user, "it");
        Analytics $r2 = kShockViewModel.analytics;
        String $r3 = user.getPhoneNumber();
        Log_OC.loadImage($r3, "it.phoneNumber");
        $r2.onKShockLanding($r3);
        KShockViewData $r4 = kShockViewModel.getData();
        kShockViewModel.publish(KShockViewData.copy$default($r4, false, null, user, null, null, null, 59, null));
        FetchKshockAvailabilty $r5 = kShockViewModel.fetchKshockAvailabilty;
        String $r32 = user.getSessionId();
        Log_OC.loadImage($r32, "it.sessionId");
        AbstractC11688p $r6 = $r5.execute($r32);
        return $r6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadKShockData$lambda-3  reason: not valid java name */
    public static final void m39586loadKShockData$lambda3(KShockViewModel kShockViewModel, KshockEligibility kshockEligibility) {
        Log_OC.getArray(kShockViewModel, "this$0");
        ViewData $r2 = kShockViewModel.getState();
        KShockViewData $r3 = (KShockViewData) $r2;
        kShockViewModel.publish(KShockViewData.copy$default($r3, false, null, null, null, null, null, 62, null));
        boolean $z0 = kshockEligibility.getEligible();
        if (!$z0) {
            Log_OC.loadImage(kshockEligibility, "kshockAvailability");
            kShockViewModel.handleIneligibility(kshockEligibility);
            return;
        }
        C11680b $r4 = kShockViewModel.getOnOpenAvailabilityScreen();
        Double $r6 = kshockEligibility.getMaxLoanAmount();
        double $d0 = $r6 == null ? 200000.0d : $r6.doubleValue();
        KShockAvailability.Available $r5 = new KShockAvailability.Available($d0, 0.0f, 2, null);
        $r4.mo331f($r5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadKShockData$lambda-4  reason: not valid java name */
    public static final void m39587loadKShockData$lambda4(KShockViewModel kShockViewModel, Throwable th) {
        Log_OC.getArray(kShockViewModel, "this$0");
        ViewData $r2 = kShockViewModel.getState();
        KShockViewData $r3 = (KShockViewData) $r2;
        kShockViewModel.publish(KShockViewData.copy$default($r3, false, null, null, null, null, null, 62, null));
        C11680b $r4 = kShockViewModel.getOnOpenAvailabilityScreen();
        InterfaceC11767l $r6 = KudiErrorParserKt.parseHttpError2$default("Couldn't load Eligibility", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r7 = $r6.invoke(th);
        String $r8 = (String) $r7;
        KShockAvailability.Error $r5 = new KShockAvailability.Error($r8);
        $r4.mo331f($r5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: termsAndConditionsAnalytics$lambda-0  reason: not valid java name */
    public static final void m39588termsAndConditionsAnalytics$lambda0(KShockViewModel kShockViewModel, boolean z, User user) {
        Log_OC.getArray(kShockViewModel, "this$0");
        Analytics $r3 = kShockViewModel.analytics;
        String $r0 = user.getPhoneNumber();
        Log_OC.loadImage($r0, "it.phoneNumber");
        $r3.onKShockTermsAndCondition($r0, z);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void applyForLoan(double d) {
        KShockNavigator $r1 = this.kShockNavigator;
        $r1.toPendingLoansListFragment(d);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void cacheKShockOldUser() {
        SharedPreferences $r1 = this.sharedPreferences;
        SharedPreferences.Editor $r2 = $r1.edit();
        $r2.putBoolean(NEW_KSHOCK_USER, false).apply();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final KShockViewData getData() {
        KShockViewData r1 = this.data;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C11680b getOnOpenAvailabilityScreen() {
        C11680b r1 = this.onOpenAvailabilityScreen;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C11680b getOpenStatusScreen() {
        C11680b r1 = this.openStatusScreen;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        KShockViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public KShockViewData initialData() {
        KShockViewData $r1 = new KShockViewData(false, null, null, null, null, null, 63, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isNewKshockUser() {
        SharedPreferences $r1 = this.sharedPreferences;
        boolean $z0 = $r1.getBoolean(NEW_KSHOCK_USER, true);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void loadKShockData() {
        ViewData $r1 = getState();
        KShockViewData $r2 = (KShockViewData) $r1;
        publish(KShockViewData.copy$default($r2, true, null, null, null, null, null, 62, null));
        FetchCurrentUser $r3 = this.currentUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        AbstractC11688p $r6 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.kshock.presentation.ByteVector
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                KShockViewModel $r12 = KShockViewModel.this;
                User $r42 = (User) obj;
                InterfaceC11692s $r22 = KShockViewModel.m39585loadKShockData$lambda2($r12, $r42);
                return $r22;
            }
        });
        FavoritesArrayAdapter $r9 = $r6.e0(new Object() { // from class: ai.kudi.agent.kshock.presentation.Property
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                KShockViewModel $r12 = KShockViewModel.this;
                KshockEligibility $r32 = (KshockEligibility) obj;
                KShockViewModel.m39586loadKShockData$lambda3($r12, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.kshock.presentation.FlingerListView$ItemFlingerResponder
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                KShockViewModel $r12 = KShockViewModel.this;
                Throwable $r32 = (Throwable) obj;
                KShockViewModel.m39587loadKShockData$lambda4($r12, $r32);
            }
        });
        C11280b $r10 = getCompositeDisposable();
        $r10.b($r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void termsAndConditionsAnalytics(final boolean z) {
        FetchCurrentUser $r1 = this.currentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.kshock.presentation.PlotStatistics
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                KShockViewModel $r12 = KShockViewModel.this;
                boolean $z0 = z;
                User $r3 = (User) obj;
                KShockViewModel.m39588termsAndConditionsAnalytics$lambda0($r12, $z0, $r3);
            }
        };
        Message$RecipientType $r4 = Message$RecipientType.f543TO;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        Log_OC.loadImage($r5, "currentUser.execute().subscribe(\n            {\n                analytics.onKShockTermsAndCondition(it.phoneNumber, status)\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r6 = getCompositeDisposable();
        $r6.b($r5);
    }
}

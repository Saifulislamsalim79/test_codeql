package ai.kudi.agent.settings.account.presenters;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.domain.room_entities.UserProfile;
import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.pos.usecases.GetIsSuperAgentOrAggregator;
import ai.kudi.agent.settings.domain.useCases.InsuranceRequests;
import ai.kudi.agent.settings.domain.useCases.InsuranceStatus;
import ai.kudi.agent.settings.domain.useCases.Profile;
import ai.kudi.agent.settings.insurance.data.InsuranceDetailModel;
import ai.kudi.agent.settings.navigators.SettingsNavigator;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import android.content.SharedPreferences;
import androidx.room.EmptyResultSetException;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: AccountPresenter.kt */
@Metadata(m10422d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0006\u0010\u001e\u001a\u00020\u001dJ\u0006\u0010\u001f\u001a\u00020\u001dJ\b\u0010 \u001a\u00020\u0017H\u0002J\u0006\u0010\r\u001a\u00020!J\u0006\u0010\"\u001a\u00020\u001dJ\u0006\u0010#\u001a\u00020\u001dJ\u0006\u0010$\u001a\u00020\u001dJ\u0006\u0010%\u001a\u00020\u001dR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m10421d2 = {"Lai/kudi/agent/settings/account/presenters/AccountPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/settings/account/presenters/AccountView;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "profile", "Lai/kudi/agent/settings/domain/useCases/Profile;", "insuranceRequests", "Lai/kudi/agent/settings/domain/useCases/InsuranceRequests;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "settingsNavigator", "Lai/kudi/agent/settings/navigators/SettingsNavigator;", "getIsSuperAgentOrAggregator", "Lai/kudi/agent/pos/usecases/GetIsSuperAgentOrAggregator;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/settings/domain/useCases/Profile;Lai/kudi/agent/settings/domain/useCases/InsuranceRequests;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/settings/navigators/SettingsNavigator;Lai/kudi/agent/pos/usecases/GetIsSuperAgentOrAggregator;Landroid/content/SharedPreferences;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "phoneNumber", "", "getPhoneNumber", "()Ljava/lang/String;", "setPhoneNumber", "(Ljava/lang/String;)V", "destroy", "", "fetchInsuranceStatus", "fetchKycLevel", "getAgentPhoneNumber", "", "logAccountPageOpenEvent", "logSignUpClicked", "navigateToCashInsurance", "toActivatePosTerminal", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AccountPresenter extends C9410b<AccountView> {
    public static final String AGENT = "AGENT";
    public static final Companion Companion;
    public static final String USER = "USER";
    private final Analytics analytics;
    private final C11280b compositeDisposable;
    private final FetchCurrentUser currentUser;
    private final GetIsSuperAgentOrAggregator getIsSuperAgentOrAggregator;
    private final InsuranceRequests insuranceRequests;
    private String phoneNumber;
    private final Profile profile;
    private final SettingsNavigator settingsNavigator;
    private final SharedPreferences sharedPreferences;

    /* compiled from: AccountPresenter.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/settings/account/presenters/AccountPresenter$Companion;", "", "()V", "AGENT", "", "USER", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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
    public AccountPresenter(FetchCurrentUser fetchCurrentUser, Profile profile, InsuranceRequests insuranceRequests, Analytics analytics, SettingsNavigator settingsNavigator, GetIsSuperAgentOrAggregator getIsSuperAgentOrAggregator, SharedPreferences sharedPreferences) {
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        Log_OC.getArray(profile, "profile");
        Log_OC.getArray(insuranceRequests, "insuranceRequests");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(settingsNavigator, "settingsNavigator");
        Log_OC.getArray(getIsSuperAgentOrAggregator, "getIsSuperAgentOrAggregator");
        Log_OC.getArray(sharedPreferences, "sharedPreferences");
        this.currentUser = fetchCurrentUser;
        this.profile = profile;
        this.insuranceRequests = insuranceRequests;
        this.analytics = analytics;
        this.settingsNavigator = settingsNavigator;
        this.getIsSuperAgentOrAggregator = getIsSuperAgentOrAggregator;
        this.sharedPreferences = sharedPreferences;
        this.phoneNumber = "";
        C11280b $r8 = new C11280b();
        this.compositeDisposable = $r8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchInsuranceStatus$lambda-2  reason: not valid java name */
    public static final InterfaceC11692s m40656fetchInsuranceStatus$lambda2(AccountPresenter accountPresenter, User user) {
        Log_OC.getArray(accountPresenter, "this$0");
        Log_OC.getArray(user, "it");
        InsuranceRequests $r2 = accountPresenter.insuranceRequests;
        String $r3 = user.getSessionId();
        Log_OC.loadImage($r3, "it.sessionId");
        AbstractC11688p $r4 = $r2.checkStatus($r3);
        return $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchInsuranceStatus$lambda-6  reason: not valid java name */
    public static final void m40657fetchInsuranceStatus$lambda6(AccountPresenter accountPresenter, InsuranceDetailModel insuranceDetailModel) {
        Log_OC.getArray(accountPresenter, "this$0");
        String $r2 = insuranceDetailModel.getStatus();
        InsuranceStatus $r3 = InsuranceStatus.ACTIVE;
        String $r4 = $r3.name();
        boolean $z0 = Log_OC.append($r2, $r4);
        if ($z0) {
            ClassWriter $r5 = ClassWriter.f1311b;
            accountPresenter.ifViewAttached($r5);
            return;
        }
        InsuranceStatus $r32 = InsuranceStatus.SUSPENDED;
        String $r42 = $r32.name();
        boolean $z02 = Log_OC.append($r2, $r42);
        if ($z02) {
            Compression $r6 = Compression.METADATA;
            accountPresenter.ifViewAttached($r6);
            return;
        }
        Type $r7 = Type.ROW;
        accountPresenter.ifViewAttached($r7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchInsuranceStatus$lambda-6$lambda-3  reason: not valid java name */
    public static final void m40658fetchInsuranceStatus$lambda6$lambda3(AccountView accountView) {
        Log_OC.getArray(accountView, "view");
        accountView.showActiveStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchInsuranceStatus$lambda-6$lambda-4  reason: not valid java name */
    public static final void m40659fetchInsuranceStatus$lambda6$lambda4(AccountView accountView) {
        Log_OC.getArray(accountView, "view");
        accountView.showSuspendedStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchInsuranceStatus$lambda-6$lambda-5  reason: not valid java name */
    public static final void m40660fetchInsuranceStatus$lambda6$lambda5(AccountView accountView) {
        Log_OC.getArray(accountView, "view");
        accountView.showNoInsurancePlan();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchInsuranceStatus$lambda-9  reason: not valid java name */
    public static final void m40661fetchInsuranceStatus$lambda9(AccountPresenter accountPresenter, final Throwable th) {
        Log_OC.getArray(accountPresenter, "this$0");
        th.printStackTrace();
        boolean $z0 = th instanceof EmptyResultSetException;
        if (!$z0) {
            accountPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.settings.account.presenters.MethodWriter
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
                /* renamed from: a */
                public final void mo14809a(Object obj) {
                    Throwable $r1 = th;
                    AccountView $r3 = (AccountView) obj;
                    AccountPresenter.m40663fetchInsuranceStatus$lambda9$lambda8($r1, $r3);
                }
            });
            return;
        }
        C0499b $r2 = C0499b.f1315e;
        accountPresenter.ifViewAttached($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchInsuranceStatus$lambda-9$lambda-7  reason: not valid java name */
    public static final void m40662fetchInsuranceStatus$lambda9$lambda7(AccountView accountView) {
        Log_OC.getArray(accountView, "view");
        accountView.showNoInsurancePlan();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchInsuranceStatus$lambda-9$lambda-8  reason: not valid java name */
    public static final void m40663fetchInsuranceStatus$lambda9$lambda8(Throwable th, AccountView accountView) {
        Log_OC.getArray(accountView, "view");
        InterfaceC11767l $r2 = KudiErrorParserKt.parseHttpError2$default("We couldn't fetch your insurance details. Try later.", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r3 = $r2.invoke(th);
        String $r4 = (String) $r3;
        accountView.showInsuranceFetchError($r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchKycLevel$lambda-10  reason: not valid java name */
    public static final InterfaceC11692s m40664fetchKycLevel$lambda10(AccountPresenter accountPresenter, User user) {
        Log_OC.getArray(accountPresenter, "this$0");
        Log_OC.getArray(user, "it");
        Profile $r3 = accountPresenter.profile;
        AbstractC11688p $r1 = $r3.execute(user);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchKycLevel$lambda-12  reason: not valid java name */
    public static final void m40665fetchKycLevel$lambda12(AccountPresenter accountPresenter, final UserProfile userProfile) {
        Log_OC.getArray(accountPresenter, "this$0");
        accountPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.settings.account.presenters.Utils$Logger
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: f */
            public final void m38440f(Object obj) {
                UserProfile $r1 = UserProfile.this;
                AccountView $r3 = (AccountView) obj;
                AccountPresenter.m40666fetchKycLevel$lambda12$lambda11($r1, $r3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchKycLevel$lambda-12$lambda-11  reason: not valid java name */
    public static final void m40666fetchKycLevel$lambda12$lambda11(UserProfile userProfile, AccountView accountView) {
        String $r2;
        Log_OC.getArray(accountView, "it");
        boolean $z0 = userProfile.getBvnIsVerified();
        if ($z0) {
            String $r3 = userProfile.getKycLevel();
            $r2 = $r3 != null ? $r3 : "";
            accountView.showKycLevel($r2);
            return;
        }
        String $r32 = userProfile.getPhoneNumber();
        $r2 = $r32 != null ? $r32 : "";
        accountView.showBvnUnVerified($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchKycLevel$lambda-14  reason: not valid java name */
    public static final void m40667fetchKycLevel$lambda14(AccountPresenter accountPresenter, final Throwable th) {
        Log_OC.getArray(accountPresenter, "this$0");
        accountPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.settings.account.presenters.a
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void close(Object obj) {
                Throwable $r1 = th;
                AccountView $r3 = (AccountView) obj;
                AccountPresenter.m40668fetchKycLevel$lambda14$lambda13($r1, $r3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchKycLevel$lambda-14$lambda-13  reason: not valid java name */
    public static final void m40668fetchKycLevel$lambda14$lambda13(Throwable th, AccountView accountView) {
        Log_OC.getArray(accountView, "it");
        InterfaceC11767l $r2 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        Object $r3 = $r2.invoke(th);
        String $r4 = (String) $r3;
        accountView.showKycLevelError($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final String getAgentPhoneNumber() {
        String r1 = this.phoneNumber;
        return r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: logAccountPageOpenEvent$lambda-0  reason: not valid java name */
    public static final void m40669logAccountPageOpenEvent$lambda0(AccountPresenter accountPresenter, User user) {
        Log_OC.getArray(accountPresenter, "this$0");
        Analytics $r3 = accountPresenter.analytics;
        String $r0 = user.getPhoneNumber();
        Log_OC.loadImage($r0, "user.phoneNumber");
        $r3.onAccountPageOpen($r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: logAccountPageOpenEvent$lambda-1  reason: not valid java name */
    public static final void m40670logAccountPageOpenEvent$lambda1(Throwable th) {
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
            AbstractC11688p $r7 = $r5.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.settings.account.presenters.d
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.InterfaceC11291f
                /* renamed from: a */
                public final Object mo10663a(Object obj) {
                    AccountPresenter $r12 = AccountPresenter.this;
                    User $r42 = (User) obj;
                    InterfaceC11692s $r22 = AccountPresenter.m40656fetchInsuranceStatus$lambda2($r12, $r42);
                    return $r22;
                }
            });
            FavoritesArrayAdapter $r10 = $r7.e0(new Object() { // from class: ai.kudi.agent.settings.account.presenters.Property
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    AccountPresenter $r12 = AccountPresenter.this;
                    InsuranceDetailModel $r32 = (InsuranceDetailModel) obj;
                    AccountPresenter.m40657fetchInsuranceStatus$lambda6($r12, $r32);
                }
            }, new Object() { // from class: ai.kudi.agent.settings.account.presenters.FileFilterUtil$3
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    AccountPresenter $r12 = AccountPresenter.this;
                    Throwable $r32 = (Throwable) obj;
                    AccountPresenter.m40661fetchInsuranceStatus$lambda9($r12, $r32);
                }
            });
            C11280b $r11 = this.compositeDisposable;
            $r11.b($r10);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchKycLevel() {
        FetchCurrentUser $r1 = this.currentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        AbstractC11688p $r4 = $r2.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.settings.account.presenters.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                AccountPresenter $r12 = AccountPresenter.this;
                User $r42 = (User) obj;
                InterfaceC11692s $r22 = AccountPresenter.m40664fetchKycLevel$lambda10($r12, $r42);
                return $r22;
            }
        });
        FavoritesArrayAdapter $r7 = $r4.e0(new Object() { // from class: ai.kudi.agent.settings.account.presenters.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                AccountPresenter $r12 = AccountPresenter.this;
                UserProfile $r3 = (UserProfile) obj;
                AccountPresenter.m40665fetchKycLevel$lambda12($r12, $r3);
            }
        }, new Object() { // from class: ai.kudi.agent.settings.account.presenters.Chunk
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                AccountPresenter $r12 = AccountPresenter.this;
                Throwable $r3 = (Throwable) obj;
                AccountPresenter.m40667fetchKycLevel$lambda14($r12, $r3);
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
    public final boolean getIsSuperAgentOrAggregator() {
        GetIsSuperAgentOrAggregator $r1 = this.getIsSuperAgentOrAggregator;
        boolean $z0 = $r1.execute();
        return $z0;
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
    public final void logAccountPageOpenEvent() {
        FetchCurrentUser $r1 = this.currentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.settings.account.presenters.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                AccountPresenter $r12 = AccountPresenter.this;
                User $r3 = (User) obj;
                AccountPresenter.m40669logAccountPageOpenEvent$lambda0($r12, $r3);
            }
        };
        C0500c $r4 = C0500c.f1316d;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        Log_OC.loadImage($r5, "currentUser.execute().subscribe(\n            { user ->\n                analytics.onAccountPageOpen(user.phoneNumber)\n            },\n            {\n            }\n        )");
        C11280b $r6 = this.compositeDisposable;
        $r6.b($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void logSignUpClicked() {
        Analytics $r1 = this.analytics;
        String $r2 = getAgentPhoneNumber();
        $r1.onSignUpButtonClicked($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToCashInsurance() {
        SettingsNavigator $r1 = this.settingsNavigator;
        $r1.toCashInsurance();
    }

    public final void setPhoneNumber(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.phoneNumber = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void toActivatePosTerminal() {
        SettingsNavigator $r1 = this.settingsNavigator;
        $r1.toActivatePos();
    }
}

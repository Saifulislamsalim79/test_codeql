package ai.kudi.agent.login.presenters;

import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.domain.room_entities.PinEntity;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.util.Pref;
import ai.kudi.agent.core.util.ResourceDelegate;
import ai.kudi.agent.login.views.LoginView;
import ai.kudi.agent.register.PinRepositoryImpl;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.users.domain.usecases.LoginInput;
import ai.kudi.agent.users.domain.usecases.LoginUser;
import com.google.firebase.database.C5612d;
import com.google.firebase.database.C5615f;
import kotlin.C13287o;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import retrofit2.HttpException;
/* compiled from: LoginPresenter.kt */
@Metadata(m10422d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001BBG\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\b\u0010\u001e\u001a\u00020\u001fH\u0016JL\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001f0!2\u0006\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020\u001fH\u0007J,\u0010,\u001a\u00020\u001f2\b\u0010-\u001a\u0004\u0018\u00010\u00192\u0006\u0010&\u001a\u00020\u00192\b\u0010.\u001a\u0004\u0018\u00010\u00192\u0006\u0010/\u001a\u00020\u0019H\u0002J<\u00100\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u00192\u0006\u00101\u001a\u00020*2\b\u00102\u001a\u0004\u0018\u00010\u00192\b\u00103\u001a\u0004\u0018\u000104H\u0002J\u000e\u00105\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u0019JJ\u00106\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u00192\u0006\u0010)\u001a\u00020*2\u0006\u0010(\u001a\u00020\u00192\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020:09J\u0016\u0010;\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u0019J\u0016\u0010<\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u00192\u0006\u0010=\u001a\u00020\u0019J\u000e\u0010>\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u0019J\u0018\u0010?\u001a\u00020\u001f2\u0006\u0010@\u001a\u00020\"2\u0006\u0010A\u001a\u00020\u0002H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, m10421d2 = {"Lai/kudi/agent/login/presenters/LoginPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/login/views/LoginView;", "loginUser", "Lai/kudi/agent/users/domain/usecases/LoginUser;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "firebaseDB", "Lcom/google/firebase/database/FirebaseDatabase;", "pinRepositoryImpl", "Lai/kudi/agent/register/PinRepositoryImpl;", "sharedPreferences", "Lai/kudi/agent/core/util/Pref;", "smartLookAnalytics", "Lai/kudi/agent/analytics/SmartLookAnalytics;", "resourceDelegate", "Lai/kudi/agent/core/util/ResourceDelegate;", "(Lai/kudi/agent/users/domain/usecases/LoginUser;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/analytics/Analytics;Lcom/google/firebase/database/FirebaseDatabase;Lai/kudi/agent/register/PinRepositoryImpl;Lai/kudi/agent/core/util/Pref;Lai/kudi/agent/analytics/SmartLookAnalytics;Lai/kudi/agent/core/util/ResourceDelegate;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "errorCount", "", "phoneNo", "", "getPhoneNo", "()Ljava/lang/String;", "setPhoneNo", "(Ljava/lang/String;)V", "destroy", "", "handleRequestError", "Lkotlin/Function1;", "", "genericResponse", "deviceName", "deviceId", "phoneNumber", "pin", "imeI", "playServicesAvailable", "", "loadUserData", "logIssuesToFirebase", "category", "issue", "handyStackTrace", "loginEvent", "isSuccessful", "errorMessage", "user", "Lai/kudi/agent/users/domain/dto/User;", "onCallSupportClicked", "performLogin", "kudiPin", "locationData", "Lkotlin/Pair;", "", "performValidationOfInputs", "savePin", "encodedPin", "shouldEnableFingerPint", "showContactSupportDialog", "it", "view", "LoginIssues", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class LoginPresenter extends C9410b<LoginView> {
    private final Analytics analytics;
    private final C11280b compositeDisposable;
    private final FetchCurrentUser currentUser;
    private int errorCount;
    private final C5615f firebaseDB;
    private final LoginUser loginUser;
    private String phoneNo;
    private final PinRepositoryImpl pinRepositoryImpl;
    private final ResourceDelegate resourceDelegate;
    private final Pref sharedPreferences;
    private final SmartLookAnalytics smartLookAnalytics;

    /* compiled from: LoginPresenter.kt */
    @Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J5\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m10421d2 = {"Lai/kudi/agent/login/presenters/LoginPresenter$LoginIssues;", "", "category", "", "phoneNumber", "issue", "handyStackTrace", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "getHandyStackTrace", "getIssue", "getPhoneNumber", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class LoginIssues {
        private final String category;
        private final String handyStackTrace;
        private final String issue;
        private final String phoneNumber;

        public LoginIssues(String str, String str2, String str3, String str4) {
            Log_OC.getArray(str2, "phoneNumber");
            Log_OC.getArray(str4, "handyStackTrace");
            this.category = str;
            this.phoneNumber = str2;
            this.issue = str3;
            this.handyStackTrace = str4;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ LoginIssues copy$default(LoginIssues loginIssues, String $r1, String $r2, String $r3, String $r4, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $r1 = loginIssues.category;
            }
            int $i12 = i & 2;
            if ($i12 != 0) {
                $r2 = loginIssues.phoneNumber;
            }
            int $i13 = i & 4;
            if ($i13 != 0) {
                $r3 = loginIssues.issue;
            }
            int $i0 = i & 8;
            if ($i0 != 0) {
                $r4 = loginIssues.handyStackTrace;
            }
            LoginIssues $r0 = loginIssues.copy($r1, $r2, $r3, $r4);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component1() {
            String r1 = this.category;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component2() {
            String r1 = this.phoneNumber;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component3() {
            String r1 = this.issue;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component4() {
            String r1 = this.handyStackTrace;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final LoginIssues copy(String str, String str2, String str3, String str4) {
            Log_OC.getArray(str2, "phoneNumber");
            Log_OC.getArray(str4, "handyStackTrace");
            LoginIssues $r0 = new LoginIssues(str, str2, str3, str4);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof LoginIssues;
            if ($z0) {
                LoginIssues $r2 = (LoginIssues) obj;
                String $r3 = this.category;
                String $r4 = $r2.category;
                boolean $z02 = Log_OC.append($r3, $r4);
                if ($z02) {
                    String $r32 = this.phoneNumber;
                    String $r42 = $r2.phoneNumber;
                    boolean $z03 = Log_OC.append($r32, $r42);
                    if ($z03) {
                        String $r33 = this.issue;
                        String $r43 = $r2.issue;
                        boolean $z04 = Log_OC.append($r33, $r43);
                        if ($z04) {
                            String $r34 = this.handyStackTrace;
                            String $r44 = $r2.handyStackTrace;
                            boolean $z05 = Log_OC.append($r34, $r44);
                            return $z05;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getCategory() {
            String r1 = this.category;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getHandyStackTrace() {
            String r1 = this.handyStackTrace;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getIssue() {
            String r1 = this.issue;
            return r1;
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
        public int hashCode() {
            String $r1 = this.category;
            int $i1 = $r1 == null ? 0 : $r1.hashCode();
            int $i2 = this.phoneNumber.hashCode();
            int $i12 = (($i1 * 31) + $i2) * 31;
            String $r12 = this.issue;
            int $i0 = $r12 != null ? $r12.hashCode() : 0;
            int $i13 = this.handyStackTrace.hashCode();
            return (($i12 + $i0) * 31) + $i13;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("LoginIssues(category=");
            String $r1 = this.category;
            $r2.append((Object) $r1);
            $r2.append(", phoneNumber=");
            String $r12 = this.phoneNumber;
            $r2.append($r12);
            $r2.append(", issue=");
            String $r13 = this.issue;
            $r2.append((Object) $r13);
            $r2.append(", handyStackTrace=");
            String $r14 = this.handyStackTrace;
            $r2.append($r14);
            $r2.append(')');
            String $r15 = $r2.toString();
            return $r15;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public LoginPresenter(LoginUser loginUser, FetchCurrentUser fetchCurrentUser, Analytics analytics, C5615f c5615f, PinRepositoryImpl pinRepositoryImpl, Pref pref, SmartLookAnalytics smartLookAnalytics, ResourceDelegate resourceDelegate) {
        Log_OC.getArray(loginUser, "loginUser");
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(c5615f, "firebaseDB");
        Log_OC.getArray(pinRepositoryImpl, "pinRepositoryImpl");
        Log_OC.getArray(pref, "sharedPreferences");
        Log_OC.getArray(smartLookAnalytics, "smartLookAnalytics");
        Log_OC.getArray(resourceDelegate, "resourceDelegate");
        this.loginUser = loginUser;
        this.currentUser = fetchCurrentUser;
        this.analytics = analytics;
        this.firebaseDB = c5615f;
        this.pinRepositoryImpl = pinRepositoryImpl;
        this.sharedPreferences = pref;
        this.smartLookAnalytics = smartLookAnalytics;
        this.resourceDelegate = resourceDelegate;
        C11280b $r9 = new C11280b();
        this.compositeDisposable = $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final InterfaceC11767l handleRequestError(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        LoginPresenter$handleRequestError$1 $r7 = new LoginPresenter$handleRequestError$1(this, z, str4, str5, str6, str2, str3, str);
        return $r7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadUserData$lambda-7  reason: not valid java name */
    public static final void m39717loadUserData$lambda7(LoginPresenter loginPresenter, final User user) {
        Log_OC.getArray(loginPresenter, "this$0");
        String $r2 = user.getPhoneNumber();
        loginPresenter.setPhoneNo($r2);
        loginPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.login.presenters.Attribute
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void setValue(Object obj) {
                User $r1 = User.this;
                LoginView $r3 = (LoginView) obj;
                LoginPresenter.m39718loadUserData$lambda7$lambda6($r1, $r3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadUserData$lambda-7$lambda-6  reason: not valid java name */
    public static final void m39718loadUserData$lambda7$lambda6(User user, LoginView loginView) {
        Log_OC.getArray(loginView, "view");
        String $r2 = user.getFirstName();
        Log_OC.loadImage($r2, "it.firstName");
        String $r3 = user.getLastName();
        Log_OC.loadImage($r3, "it.lastName");
        String $r4 = user.getPhoneNumber();
        Log_OC.loadImage($r4, "it.phoneNumber");
        String $r5 = user.profilePictureId;
        loginView.showUserProfile($r2, $r3, $r4, $r5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadUserData$lambda-9  reason: not valid java name */
    public static final void m39719loadUserData$lambda9(LoginPresenter loginPresenter, Throwable th) {
        Log_OC.getArray(loginPresenter, "this$0");
        th.printStackTrace();
        InputMethod $r2 = InputMethod.inputMethod;
        loginPresenter.ifViewAttached($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadUserData$lambda-9$lambda-8  reason: not valid java name */
    public static final void m39720loadUserData$lambda9$lambda8(LoginView loginView) {
        Log_OC.getArray(loginView, "view");
        loginView.navigateToLogin();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void logIssuesToFirebase(String str, String str2, String str3, String str4) {
        C5615f $r5 = this.firebaseDB;
        C5612d $r6 = $r5.m24317e().m24327j("login-issues");
        Log_OC.loadImage($r6, "firebaseDB.reference.child(\"login-issues\")");
        LoginIssues $r7 = new LoginIssues(str, str2, str3, str4);
        $r6.m24324m().m24323n((Object) $r7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void loginEvent(String str, String str2, String str3, boolean z, String str4, User user) {
        Analytics $r6 = this.analytics;
        $r6.loginEvent(z, str, str2, str3, str4, "3.2.163", user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performLogin$lambda-0  reason: not valid java name */
    public static final void m39721performLogin$lambda0(LoginView loginView) {
        Log_OC.getArray(loginView, "view");
        loginView.showProgress(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performLogin$lambda-3  reason: not valid java name */
    public static final void m39722performLogin$lambda3(final LoginPresenter loginPresenter, final String str, final String str2, final String str3, final User user) {
        Log_OC.getArray(loginPresenter, "this$0");
        Log_OC.getArray(str, "$deviceName");
        Log_OC.getArray(str2, "$deviceId");
        Log_OC.getArray(str3, "$phoneNumber");
        loginPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.login.presenters.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: e */
            public final void m38756e(Object obj) {
                User $r2 = User.this;
                LoginPresenter $r3 = loginPresenter;
                String $r4 = str;
                String $r5 = str2;
                String $r6 = str3;
                LoginView $r7 = (LoginView) obj;
                LoginPresenter.m39723performLogin$lambda3$lambda2($r2, $r3, $r4, $r5, $r6, $r7);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performLogin$lambda-3$lambda-2  reason: not valid java name */
    public static final void m39723performLogin$lambda3$lambda2(final User user, final LoginPresenter loginPresenter, String str, String str2, String str3, LoginView loginView) {
        Log_OC.getArray(loginPresenter, "this$0");
        Log_OC.getArray(str, "$deviceName");
        Log_OC.getArray(str2, "$deviceId");
        Log_OC.getArray(str3, "$phoneNumber");
        Log_OC.getArray(loginView, "view");
        loginView.showProgress(false);
        boolean $z0 = user.pinResetRequired;
        if ($z0) {
            Log_OC.loadImage(user, "it");
            loginView.navigateToPhoneAndPinFragment(user);
            UserObject $r6 = UserObject.INSTANCE;
            $r6.setUser(user);
            return;
        }
        loginPresenter.loginEvent(str, str2, str3, true, null, user);
        Pref $r7 = loginPresenter.sharedPreferences;
        Boolean $r8 = user.hasPendingKycUpgrade;
        Log_OC.loadImage($r8, "it.hasPendingKycUpgrade");
        boolean $z02 = $r8.booleanValue();
        $r7.setKycInReview($z02);
        loginPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.login.presenters.Logger
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void log(Object obj) {
                User $r1 = User.this;
                LoginPresenter $r2 = loginPresenter;
                LoginView $r4 = (LoginView) obj;
                LoginPresenter.m39724performLogin$lambda3$lambda2$lambda1($r1, $r2, $r4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performLogin$lambda-3$lambda-2$lambda-1  reason: not valid java name */
    public static final void m39724performLogin$lambda3$lambda2$lambda1(User user, LoginPresenter loginPresenter, LoginView loginView) {
        Log_OC.getArray(loginPresenter, "this$0");
        Log_OC.getArray(loginView, "view");
        double $d0 = user.walletBalance;
        boolean $z0 = user.isNewUser;
        boolean $z1 = user.isKCashEnabled;
        boolean $z2 = user.isC2C;
        boolean $z3 = user.isHq;
        boolean $z4 = user.isOutlet;
        String $r3 = user.customerType;
        if ($r3 == null) {
            $r3 = "AGENT";
        }
        loginView.navigateToDashboard($d0, $z0, $z1, $z2, $z3, $z4, $r3);
        StringBuilder $r4 = new StringBuilder();
        $r4.append((Object) user.getFirstName());
        $r4.append(' ');
        $r4.append((Object) user.getLastName());
        String $r32 = $r4.toString();
        SmartLookAnalytics $r5 = loginPresenter.smartLookAnalytics;
        $r5.setUserName($r32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performLogin$lambda-4  reason: not valid java name */
    public static final void m39725performLogin$lambda4(InterfaceC11767l interfaceC11767l, Throwable th) {
        Log_OC.getArray(interfaceC11767l, "$tmp0");
        interfaceC11767l.invoke(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r1 < 4) goto L17;
     */
    /* renamed from: performValidationOfInputs$lambda-16  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m39726performValidationOfInputs$lambda16(java.lang.String r4, java.lang.String r5, ai.kudi.agent.login.views.LoginView r6) {
        /*
            java.lang.String r0 = "$kudiPin"
            kotlin.p483e0.p485d.Log_OC.getArray(r4, r0)
            java.lang.String r0 = "$phoneNumber"
            kotlin.p483e0.p485d.Log_OC.getArray(r5, r0)
            java.lang.String r0 = "loginView"
            kotlin.p483e0.p485d.Log_OC.getArray(r6, r0)
            int r1 = r4.length()
            if (r1 != 0) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = 0
        L18:
            if (r2 != 0) goto L21
            int r1 = r4.length()
            r3 = 4
            if (r1 >= r3) goto L27
        L21:
            r3 = 2131886547(0x7f1201d3, float:1.9407676E38)
            r6.showPinError(r3)
        L27:
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 == 0) goto L34
            r3 = 2131886543(0x7f1201cf, float:1.9407668E38)
            r6.showPhoneNumberError(r3)
            return
        L34:
            boolean r2 = ai.kudi.agent.core.util.StringExtKt.isNigerianPhoneNumber(r5)
            if (r2 != 0) goto L40
            r3 = 2131886546(0x7f1201d2, float:1.9407674E38)
            r6.showPhoneNumberError(r3)
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.login.presenters.LoginPresenter.m39726performValidationOfInputs$lambda16(java.lang.String, java.lang.String, ai.kudi.agent.login.views.LoginView):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: savePin$lambda-10  reason: not valid java name */
    public static final void m39727savePin$lambda10(Long l) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: shouldEnableFingerPint$lambda-13  reason: not valid java name */
    public static final void m39729shouldEnableFingerPint$lambda13(LoginPresenter loginPresenter, final PinEntity pinEntity) {
        Log_OC.getArray(loginPresenter, "this$0");
        loginPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.login.presenters.ModulusCheckDigit
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void calculate(Object obj) {
                PinEntity $r1 = PinEntity.this;
                LoginView $r3 = (LoginView) obj;
                LoginPresenter.m39730shouldEnableFingerPint$lambda13$lambda12($r1, $r3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: shouldEnableFingerPint$lambda-13$lambda-12  reason: not valid java name */
    public static final void m39730shouldEnableFingerPint$lambda13$lambda12(PinEntity pinEntity, LoginView loginView) {
        Log_OC.getArray(loginView, "view");
        String $r1 = pinEntity.getEncodedPin();
        loginView.showFingerPrintIcon(true, $r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: shouldEnableFingerPint$lambda-15  reason: not valid java name */
    public static final void m39731shouldEnableFingerPint$lambda15(LoginPresenter loginPresenter, Throwable th) {
        Log_OC.getArray(loginPresenter, "this$0");
        th.printStackTrace();
        Function $r2 = Function.LEN;
        loginPresenter.ifViewAttached($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldEnableFingerPint$lambda-15$lambda-14  reason: not valid java name */
    public static final void m39732shouldEnableFingerPint$lambda15$lambda14(LoginView loginView) {
        Log_OC.getArray(loginView, "view");
        LoginView.DefaultImpls.showFingerPrintIcon$default(loginView, false, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showContactSupportDialog(Throwable th, final LoginView loginView) {
        boolean $z0 = th instanceof HttpException;
        if ($z0) {
            HttpException $r3 = (HttpException) th;
            int $i0 = $r3.m352a();
            if ($i0 == 401) {
                return;
            }
        }
        int $i02 = this.errorCount;
        if ($i02 >= 3) {
            ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.login.presenters.e
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                public final void onSaveInstanceState(Object obj) {
                    LoginView $r1 = LoginView.this;
                    LoginView $r32 = (LoginView) obj;
                    LoginPresenter.m39733showContactSupportDialog$lambda5($r1, $r32);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showContactSupportDialog$lambda-5  reason: not valid java name */
    public static final void m39733showContactSupportDialog$lambda5(LoginView loginView, LoginView loginView2) {
        Log_OC.getArray(loginView, "$view");
        Log_OC.getArray(loginView2, "it");
        loginView.showContactSupportDialog();
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
    public final String getPhoneNo() {
        String r1 = this.phoneNo;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void loadUserData() {
        FetchCurrentUser $r2 = this.currentUser;
        AbstractC11696w $r1 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        $r1.s(new Object() { // from class: ai.kudi.agent.login.presenters.RxRingBuffer
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                LoginPresenter $r12 = LoginPresenter.this;
                User $r3 = (User) obj;
                LoginPresenter.m39717loadUserData$lambda7($r12, $r3);
            }
        }, new Object() { // from class: ai.kudi.agent.login.presenters.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                LoginPresenter $r12 = LoginPresenter.this;
                Throwable $r3 = (Throwable) obj;
                LoginPresenter.m39719loadUserData$lambda9($r12, $r3);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onCallSupportClicked(String str) {
        Log_OC.getArray(str, "phoneNumber");
        Analytics $r2 = this.analytics;
        $r2.onCallSupportClicked("login", str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void performLogin(final String str, String str2, final String str3, final String str4, boolean z, String str5, C13287o c13287o) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(str2, "kudiPin");
        Log_OC.getArray(str3, "deviceName");
        Log_OC.getArray(str4, "deviceId");
        Log_OC.getArray(str5, "imeI");
        Log_OC.getArray(c13287o, "locationData");
        Compression $r7 = Compression.METADATA;
        ifViewAttached($r7);
        User.Builder $r8 = new User.Builder();
        User $r9 = $r8.setPhoneNumber(str).setPin(str2).setDeviceName(str3).setDeviceId(str4).setImei(str5).build();
        LoginUser $r10 = this.loginUser;
        Log_OC.loadImage($r9, "user");
        Object $r12 = c13287o.m5364c();
        Number $r13 = (Number) $r12;
        double $d0 = $r13.doubleValue();
        Object $r122 = c13287o.m5363d();
        Number $r132 = (Number) $r122;
        double $d1 = $r132.doubleValue();
        LoginInput $r11 = new LoginInput($r9, $d0, $d1);
        AbstractC11688p $r14 = $r10.execute($r11);
        Object object = new Object() { // from class: ai.kudi.agent.login.presenters.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                LoginPresenter $r1 = LoginPresenter.this;
                String $r2 = str3;
                String $r3 = str4;
                String $r4 = str;
                User $r6 = (User) obj;
                LoginPresenter.m39722performLogin$lambda3($r1, $r2, $r3, $r4, $r6);
            }
        };
        final InterfaceC11767l $r16 = handleRequestError("We can't log you in at the moment. Try again later", str3, str4, str, str2, str5, z);
        FavoritesArrayAdapter $r18 = $r14.e0(object, new Object() { // from class: ai.kudi.agent.login.presenters.InBandBytestreamSession$IBBDataPacketFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InterfaceC11767l $r1 = InterfaceC11767l.this;
                Throwable $r3 = (Throwable) obj;
                LoginPresenter.m39725performLogin$lambda4($r1, $r3);
            }
        });
        Log_OC.loadImage($r18, "loginUser.execute(LoginInput(user, lat = locationData.first, lon = locationData.second))\n            .subscribe(\n                {\n                    ifViewAttached { view ->\n                        view.showProgress(false)\n                        if (it.pinResetRequired) {\n                            view.navigateToPhoneAndPinFragment(it)\n                            UserObject.user = it\n                        } else {\n                            loginEvent(deviceName, deviceId, phoneNumber, true, null, it)\n                            sharedPreferences.setKycInReview(it.hasPendingKycUpgrade)\n                            ifViewAttached { view ->\n                                view.navigateToDashboard(\n                                    it.walletBalance,\n                                    it.isNewUser,\n                                    it.isKCashEnabled,\n                                    it.isC2C,\n                                    isHq = it.isHq,\n                                    isOutlet = it.isOutlet,\n                                    customerType = it.customerType ?: AGENT\n                                )\n                                val userName = \"${it.firstName} ${it.lastName}\"\n                                smartLookAnalytics.setUserName(userName)\n                            }\n                        }\n                    }\n                },\n                handleRequestError(\n                    \"We can't log you in at the moment. Try again later\",\n                    deviceName,\n                    deviceId,\n                    phoneNumber,\n                    kudiPin,\n                    imeI,\n                    playServicesAvailable\n                )\n            )");
        C11280b $r19 = this.compositeDisposable;
        RxExtKt.addTo($r18, $r19);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void performValidationOfInputs(final String str, final String str2) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(str2, "kudiPin");
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.login.presenters.ByteVector
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                String $r1 = str2;
                String $r2 = str;
                LoginView $r4 = (LoginView) obj;
                LoginPresenter.m39726performValidationOfInputs$lambda16($r1, $r2, $r4);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void savePin(String str, String str2) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(str2, "encodedPin");
        PinRepositoryImpl $r3 = this.pinRepositoryImpl;
        AbstractC11688p $r4 = $r3.savePin(str, str2);
        Chunk $r5 = Chunk.NEWLINE;
        Token $r6 = Token.BOOL;
        FavoritesArrayAdapter $r7 = $r4.e0($r5, $r6);
        Log_OC.loadImage($r7, "pinRepositoryImpl.savePin(phoneNumber, encodedPin).subscribe(\n            {\n            },\n            { it.printStackTrace() }\n        )");
        C11280b $r8 = this.compositeDisposable;
        RxExtKt.addTo($r7, $r8);
    }

    public final void setPhoneNo(String str) {
        this.phoneNo = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void shouldEnableFingerPint(String str) {
        Log_OC.getArray(str, "phoneNumber");
        PinRepositoryImpl $r3 = this.pinRepositoryImpl;
        AbstractC11696w $r4 = $r3.getPin(str);
        FavoritesArrayAdapter $r6 = $r4.s(new Object() { // from class: ai.kudi.agent.login.presenters.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                LoginPresenter $r1 = LoginPresenter.this;
                PinEntity $r32 = (PinEntity) obj;
                LoginPresenter.m39729shouldEnableFingerPint$lambda13($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.login.presenters.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                LoginPresenter $r1 = LoginPresenter.this;
                Throwable $r32 = (Throwable) obj;
                LoginPresenter.m39731shouldEnableFingerPint$lambda15($r1, $r32);
            }
        });
        Log_OC.loadImage($r6, "pinRepositoryImpl.getPin(phoneNumber).subscribe(\n            {\n                ifViewAttached { view ->\n                    view.showFingerPrintIcon(true, it.encodedPin)\n                }\n            },\n            {\n                it.printStackTrace()\n                ifViewAttached { view ->\n                    view.showFingerPrintIcon(false)\n                }\n            }\n        )");
        C11280b $r7 = this.compositeDisposable;
        RxExtKt.addTo($r6, $r7);
    }
}

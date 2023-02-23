package ai.kudi.agent.register.p021ui.viewmodels;

import ai.kudi.agent.biometric.security.IPFSecurityUtils;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.analytics.contracts.OnboardingAnalytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ManageDevice;
import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.login.domain.usecases.SetNewPin;
import ai.kudi.agent.login.domain.wiki.ResetPinRequest;
import ai.kudi.agent.login.domain.wiki.ResetPinResponse;
import ai.kudi.agent.login.presenters.UserObject;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.register.PinRepositoryImpl;
import ai.kudi.agent.register.data.CompleteRegistrationData;
import ai.kudi.agent.register.domain.usecases.OnboardMerchant;
import ai.kudi.agent.register.domain.usecases.RegisterNewAgent;
import ai.kudi.agent.register.domain.usecases.RegisterNewUser;
import ai.kudi.agent.register.domain.wiki.AccountType;
import ai.kudi.agent.register.domain.wiki.PersonalInfo;
import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import ai.kudi.agent.register.domain.wiki.RegistrationStatus;
import ai.kudi.agent.register.navigators.RegisterNavigator;
import ai.kudi.agent.register.p021ui.viewmodels.data.CreatePinViewData;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.LoginInput;
import ai.kudi.agent.users.domain.usecases.LoginUser;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: CreatePinViewModel.kt */
@Metadata(m10422d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001@Bi\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aJJ\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010 2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020(H\u0002J\n\u0010)\u001a\u0004\u0018\u00010 H\u0002J\b\u0010*\u001a\u00020\u0002H\u0016J \u0010+\u001a\u00020,2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010-\u001a\u00020 2\u0006\u0010.\u001a\u00020,H\u0002J\"\u0010/\u001a\u00020\u001c2\u0006\u00100\u001a\u00020 2\u0006\u00101\u001a\u00020 2\b\u00102\u001a\u0004\u0018\u000103H\u0002J8\u00104\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%H\u0002J\u0010\u00105\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020(H\u0002J8\u00106\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%H\u0002J8\u00107\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%H\u0002JF\u00108\u001a\b\u0012\u0004\u0012\u000203092\u0006\u00100\u001a\u00020 2\u0006\u0010:\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%H\u0002J\u001e\u0010;\u001a\u00020\u001c2\u0006\u00100\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010.\u001a\u00020,J\u0010\u0010<\u001a\u00020\u001c2\u0006\u00100\u001a\u00020 H\u0002J\u001e\u0010=\u001a\b\u0012\u0004\u0012\u00020>092\u0006\u00100\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020 H\u0002JF\u0010?\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010-\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010.\u001a\u00020,2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006A"}, m10421d2 = {"Lai/kudi/agent/register/ui/viewmodels/CreatePinViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/register/ui/viewmodels/data/CreatePinViewData;", "setNewPin", "Lai/kudi/agent/login/domain/usecases/SetNewPin;", "agentRegister", "Lai/kudi/agent/register/domain/usecases/RegisterNewAgent;", "userRegister", "Lai/kudi/agent/register/domain/usecases/RegisterNewUser;", "merchantRegister", "Lai/kudi/agent/register/domain/usecases/OnboardMerchant;", "loginUser", "Lai/kudi/agent/users/domain/usecases/LoginUser;", "registerNavigator", "Lai/kudi/agent/register/navigators/RegisterNavigator;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "sharedPrefs", "Landroid/content/SharedPreferences;", "devicePrefs", "pinRepositoryImpl", "Lai/kudi/agent/register/PinRepositoryImpl;", "context", "Landroid/app/Application;", "fac", "Lai/kudi/agent/biometric/security/IPFSecurityUtils;", "(Lai/kudi/agent/login/domain/usecases/SetNewPin;Lai/kudi/agent/register/domain/usecases/RegisterNewAgent;Lai/kudi/agent/register/domain/usecases/RegisterNewUser;Lai/kudi/agent/register/domain/usecases/OnboardMerchant;Lai/kudi/agent/users/domain/usecases/LoginUser;Lai/kudi/agent/register/navigators/RegisterNavigator;Lai/kudi/agent/core/analytics/Analytics;Landroid/content/SharedPreferences;Landroid/content/SharedPreferences;Lai/kudi/agent/register/PinRepositoryImpl;Landroid/app/Application;Lai/kudi/agent/biometric/security/IPFSecurityUtils;)V", "attemptLoginAfterOnboarding", "", "personalInfo", "Lai/kudi/agent/register/domain/dto/PersonalInfo;", "pin", "", "deviceName", "deviceId", "imeId", "latitude", "", "longitude", "registrationInfo", "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "getImeId", "initialData", "inputParamsValid", "", "confirmPin", "isTermChecked", "logEventOnAGentCreation", "phoneNumber", "name", "user", "Lai/kudi/agent/users/domain/dto/User;", "onboardAgent", "onboardMerchant", "onboardUser", "onboardUserOrAgent", "performLogin", "Lio/reactivex/Observable;", "kudiPin", "resetPin", "saveLastPhoneNumber", "savePin", "", "submitPin", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.ui.viewmodels.CreatePinViewModel */
/* loaded from: classes.dex */
public final class CreatePinViewModel extends BaseViewModel<CreatePinViewData> {
    public static final Companion Companion;
    public static final int PIN_LENGTH = 4;
    private final RegisterNewAgent agentRegister;
    private final Analytics analytics;
    private final Application context;
    private IPFSecurityUtils deviceId;
    private final SharedPreferences devicePrefs;
    private final LoginUser loginUser;
    private final OnboardMerchant merchantRegister;
    private final PinRepositoryImpl pinRepositoryImpl;
    private final RegisterNavigator registerNavigator;
    private final SetNewPin setNewPin;
    private final SharedPreferences sharedPrefs;
    private final RegisterNewUser userRegister;

    /* compiled from: CreatePinViewModel.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/register/ui/viewmodels/CreatePinViewModel$Companion;", "", "()V", "PIN_LENGTH", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.register.ui.viewmodels.CreatePinViewModel$Companion */
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

    public CreatePinViewModel(SetNewPin setNewPin, RegisterNewAgent registerNewAgent, RegisterNewUser registerNewUser, OnboardMerchant onboardMerchant, LoginUser loginUser, RegisterNavigator registerNavigator, Analytics analytics, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, PinRepositoryImpl pinRepositoryImpl, Application application, IPFSecurityUtils iPFSecurityUtils) {
        Log_OC.getArray(setNewPin, "setNewPin");
        Log_OC.getArray(registerNewAgent, "agentRegister");
        Log_OC.getArray(registerNewUser, "userRegister");
        Log_OC.getArray(onboardMerchant, "merchantRegister");
        Log_OC.getArray(loginUser, "loginUser");
        Log_OC.getArray(registerNavigator, "registerNavigator");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(sharedPreferences, "sharedPrefs");
        Log_OC.getArray(sharedPreferences2, "devicePrefs");
        Log_OC.getArray(pinRepositoryImpl, "pinRepositoryImpl");
        Log_OC.getArray(application, "context");
        Log_OC.getArray(iPFSecurityUtils, "fac");
        this.setNewPin = setNewPin;
        this.agentRegister = registerNewAgent;
        this.userRegister = registerNewUser;
        this.merchantRegister = onboardMerchant;
        this.loginUser = loginUser;
        this.registerNavigator = registerNavigator;
        this.analytics = analytics;
        this.sharedPrefs = sharedPreferences;
        this.devicePrefs = sharedPreferences2;
        this.pinRepositoryImpl = pinRepositoryImpl;
        this.context = application;
        this.deviceId = iPFSecurityUtils;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void attemptLoginAfterOnboarding(PersonalInfo personalInfo, String str, String str2, String str3, String str4, double d, double d2, final RegistrationInfo registrationInfo) {
        String $r7 = personalInfo.getPhoneNumber();
        Log_OC.append($r7);
        Log_OC.append(str4);
        AbstractC11688p $r8 = performLogin($r7, str, str2, str3, str4, d, d2);
        FavoritesArrayAdapter $r11 = $r8.e0(new Object() { // from class: ai.kudi.agent.register.ui.viewmodels.ExtensionData
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CreatePinViewModel $r1 = CreatePinViewModel.this;
                RegistrationInfo $r2 = registrationInfo;
                User $r4 = (User) obj;
                CreatePinViewModel.m40406attemptLoginAfterOnboarding$lambda6($r1, $r2, $r4);
            }
        }, new Object() { // from class: ai.kudi.agent.register.ui.viewmodels.PacketIDFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CreatePinViewModel $r1 = CreatePinViewModel.this;
                Throwable $r3 = (Throwable) obj;
                CreatePinViewModel.m40407attemptLoginAfterOnboarding$lambda7($r1, $r3);
            }
        });
        C11280b $r12 = getCompositeDisposable();
        $r12.b($r11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: attemptLoginAfterOnboarding$lambda-6  reason: not valid java name */
    public static final void m40406attemptLoginAfterOnboarding$lambda6(CreatePinViewModel createPinViewModel, RegistrationInfo registrationInfo, User user) {
        Log_OC.getArray(createPinViewModel, "this$0");
        Log_OC.getArray(registrationInfo, "$registrationInfo");
        String $r3 = user.getPhoneNumber();
        Log_OC.loadImage($r3, "it.phoneNumber");
        StringBuilder $r4 = new StringBuilder();
        String $r5 = user.getFirstName();
        $r4.append((Object) $r5);
        $r4.append(' ');
        String $r52 = user.getLastName();
        $r4.append((Object) $r52);
        String $r53 = $r4.toString();
        createPinViewModel.logEventOnAGentCreation($r3, $r53, user);
        String $r32 = user.getPhoneNumber();
        Log_OC.loadImage($r32, "it.phoneNumber");
        createPinViewModel.saveLastPhoneNumber($r32);
        RegisterNavigator $r6 = createPinViewModel.registerNavigator;
        String $r33 = user.getFirstName();
        double $d0 = user.walletBalance;
        boolean $z2 = user.isNewUser;
        boolean $z3 = user.isKCashEnabled;
        boolean $z4 = user.isC2C;
        boolean $z0 = user.isHq;
        boolean $z1 = user.isOutlet;
        AccountType $r7 = registrationInfo.getAccountType();
        String $r54 = $r7 == null ? null : $r7.name();
        if ($r54 == null) {
            $r54 = "";
        }
        Double $r9 = Double.valueOf($d0);
        Boolean $r10 = Boolean.valueOf($z2);
        Boolean $r11 = Boolean.valueOf($z3);
        Boolean $r12 = Boolean.valueOf($z4);
        CompleteRegistrationData $r8 = new CompleteRegistrationData($r33, $r9, $r10, $r11, $r12, $z0, $z1, registrationInfo, false, $r54, 256, null);
        $r6.navigateToEnableFingerPrint($r8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: attemptLoginAfterOnboarding$lambda-7  reason: not valid java name */
    public static final void m40407attemptLoginAfterOnboarding$lambda7(CreatePinViewModel createPinViewModel, Throwable th) {
        Log_OC.getArray(createPinViewModel, "this$0");
        th.printStackTrace();
        ViewData $r2 = createPinViewModel.getState();
        CreatePinViewData $r3 = (CreatePinViewData) $r2;
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default("Something went wrong. Please contact support or try again.", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        CreatePinViewData.Error $r4 = new CreatePinViewData.Error((String) $r6, null, null, 6, null);
        createPinViewModel.publish(CreatePinViewData.copy$default($r3, false, null, null, $r4, 6, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final String getImeId() {
        SharedPreferences $r2 = this.devicePrefs;
        String $r1 = $r2.getString(ManageDevice.IMEID_PARAM, "");
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean inputParamsValid(String str, String str2, boolean z) {
        boolean $z1;
        boolean $z12;
        $z1 = C13276s.m5440u(str);
        if ($z1) {
            ViewData $r3 = getState();
            CreatePinViewData $r4 = (CreatePinViewData) $r3;
            CreatePinViewData.Error $r5 = new CreatePinViewData.Error(null, "PIN is required", null, 5, null);
            publish(CreatePinViewData.copy$default($r4, false, null, null, $r5, 7, null));
            return false;
        }
        int $i0 = str.length();
        if ($i0 != 4) {
            ViewData $r32 = getState();
            CreatePinViewData $r42 = (CreatePinViewData) $r32;
            CreatePinViewData.Error $r52 = new CreatePinViewData.Error(null, "PIN must by 4", null, 5, null);
            publish(CreatePinViewData.copy$default($r42, false, null, null, $r52, 7, null));
            return false;
        }
        $z12 = C13276s.m5440u(str2);
        if ($z12) {
            ViewData $r33 = getState();
            CreatePinViewData $r43 = (CreatePinViewData) $r33;
            CreatePinViewData.Error $r53 = new CreatePinViewData.Error(null, null, "Required", 3, null);
            publish(CreatePinViewData.copy$default($r43, false, null, null, $r53, 7, null));
            return false;
        }
        boolean $z13 = Log_OC.append(str, str2);
        if (!$z13) {
            ViewData $r34 = getState();
            CreatePinViewData $r44 = (CreatePinViewData) $r34;
            CreatePinViewData.Error $r54 = new CreatePinViewData.Error(null, null, "Not equal to PIN", 3, null);
            publish(CreatePinViewData.copy$default($r44, false, null, null, $r54, 7, null));
            return false;
        } else if (z) {
            return true;
        } else {
            ViewData $r35 = getState();
            CreatePinViewData $r45 = (CreatePinViewData) $r35;
            CreatePinViewData.Error $r55 = new CreatePinViewData.Error("Please accept the Term's of Use / Private Policy ", null, null, 6, null);
            publish(CreatePinViewData.copy$default($r45, false, null, null, $r55, 7, null));
            return false;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void logEventOnAGentCreation(String str, String str2, User user) {
        Analytics $r4 = this.analytics;
        $r4.onAgentCreation(str, str2, user);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onboardAgent(final RegistrationInfo registrationInfo, final String str, final String str2, final String str3, final double d, final double d2) {
        RegisterNewAgent $r6 = this.agentRegister;
        AbstractC11688p $r7 = $r6.execute(registrationInfo);
        FavoritesArrayAdapter $r9 = $r7.e0(new Object() { // from class: ai.kudi.agent.register.ui.viewmodels.LayoutManager
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CreatePinViewModel $r2 = CreatePinViewModel.this;
                RegistrationInfo $r3 = registrationInfo;
                String $r4 = str;
                String $r5 = str2;
                String $r62 = str3;
                double $d0 = d;
                double $d1 = d2;
                PersonalInfo $r72 = (PersonalInfo) obj;
                CreatePinViewModel.m40408onboardAgent$lambda4($r2, $r3, $r4, $r5, $r62, $d0, $d1, $r72);
            }
        }, new Object() { // from class: ai.kudi.agent.register.ui.viewmodels.RxRingBuffer
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CreatePinViewModel $r1 = CreatePinViewModel.this;
                Throwable $r3 = (Throwable) obj;
                CreatePinViewModel.m40409onboardAgent$lambda5($r1, $r3);
            }
        });
        C11280b $r10 = getCompositeDisposable();
        $r10.b($r9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onboardAgent$lambda-4  reason: not valid java name */
    public static final void m40408onboardAgent$lambda4(CreatePinViewModel createPinViewModel, RegistrationInfo registrationInfo, String $r2, String str, String str2, double d, double d2, PersonalInfo personalInfo) {
        Log_OC.getArray(createPinViewModel, "this$0");
        Log_OC.getArray(registrationInfo, "$registrationInfo");
        Log_OC.getArray($r2, "$pin");
        Log_OC.getArray(str, "$deviceName");
        Log_OC.getArray(str2, "$deviceId");
        Analytics $r6 = createPinViewModel.analytics;
        String $r7 = personalInfo.getPhoneNumber();
        if ($r7 == null) {
            $r7 = "";
        }
        OnboardingAnalytics.DefaultImpls.pinSubmitted$default($r6, $r7, true, null, 4, null);
        String $r72 = personalInfo.getStatus();
        RegistrationStatus $r9 = RegistrationStatus.PENDING_KYC_VERIFICATION;
        String $r10 = $r9.name();
        boolean $z0 = Log_OC.append($r72, $r10);
        if (!$z0) {
            PersonalInfo $r5 = registrationInfo.getPersonalInfo();
            String $r8 = createPinViewModel.getImeId();
            createPinViewModel.attemptLoginAfterOnboarding($r5, $r2, str, str2, $r8, d, d2, registrationInfo);
            return;
        }
        RegisterNavigator $r11 = createPinViewModel.registerNavigator;
        $r11.navigateToPendingKycVerification(registrationInfo);
        Analytics $r62 = createPinViewModel.analytics;
        String $r22 = personalInfo.getPhoneNumber();
        String $r82 = $r22 != null ? $r22 : "";
        $r62.onAgentHavingPendingKyc($r82);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onboardAgent$lambda-5  reason: not valid java name */
    public static final void m40409onboardAgent$lambda5(CreatePinViewModel createPinViewModel, Throwable th) {
        Log_OC.getArray(createPinViewModel, "this$0");
        th.printStackTrace();
        ViewData $r2 = createPinViewModel.getState();
        CreatePinViewData $r3 = (CreatePinViewData) $r2;
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default("Something went wrong. Please contact support or try again.", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        CreatePinViewData.Error $r4 = new CreatePinViewData.Error((String) $r6, null, null, 6, null);
        createPinViewModel.publish(CreatePinViewData.copy$default($r3, false, null, null, $r4, 6, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onboardMerchant(final RegistrationInfo registrationInfo) {
        final PersonalInfo $r3 = registrationInfo.getPersonalInfo();
        OnboardMerchant $r4 = this.merchantRegister;
        AbstractC11688p $r5 = $r4.execute(registrationInfo);
        FavoritesArrayAdapter $r7 = $r5.e0(new Object() { // from class: ai.kudi.agent.register.ui.viewmodels.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CreatePinViewModel $r1 = CreatePinViewModel.this;
                PersonalInfo $r2 = $r3;
                RegistrationInfo $r32 = registrationInfo;
                PersonalInfo $r52 = (PersonalInfo) obj;
                CreatePinViewModel.m40410onboardMerchant$lambda0($r1, $r2, $r32, $r52);
            }
        }, new Object() { // from class: ai.kudi.agent.register.ui.viewmodels.Property
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CreatePinViewModel $r1 = CreatePinViewModel.this;
                Throwable $r32 = (Throwable) obj;
                CreatePinViewModel.m40411onboardMerchant$lambda1($r1, $r32);
            }
        });
        Log_OC.loadImage($r7, "merchantRegister.execute(registrationInfo).subscribe(\n            {\n                attemptLoginAfterOnboarding(\n                    personalInfo,\n                    personalInfo.pin.orEmpty(),\n                    personalInfo.deviceName.orEmpty(),\n                    personalInfo.deviceId.orEmpty(),\n                    getImeId(),\n                    personalInfo.latitude ?: 0.0,\n                    personalInfo.longitude ?: 0.0,\n                    registrationInfo\n                )\n            },\n            {\n                it.printStackTrace()\n                publish(\n                    state.copy(\n                        loading = false,\n                        error = Error(\n                            message = parseHttpError2(\"Something went wrong. Please contact support or try again.\")(\n                                it\n                            )\n                        )\n                    )\n                )\n\n            }\n        )");
        C11280b $r8 = getCompositeDisposable();
        RxExtKt.addTo($r7, $r8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onboardMerchant$lambda-0  reason: not valid java name */
    public static final void m40410onboardMerchant$lambda0(CreatePinViewModel createPinViewModel, PersonalInfo personalInfo, RegistrationInfo registrationInfo, PersonalInfo personalInfo2) {
        Log_OC.getArray(createPinViewModel, "this$0");
        Log_OC.getArray(personalInfo, "$personalInfo");
        Log_OC.getArray(registrationInfo, "$registrationInfo");
        String $r4 = personalInfo.getPin();
        if ($r4 == null) {
            $r4 = "";
        }
        String $r5 = personalInfo.getDeviceName();
        if ($r5 == null) {
            $r5 = "";
        }
        String $r6 = personalInfo.getDeviceId();
        if ($r6 == null) {
            $r6 = "";
        }
        String $r7 = createPinViewModel.getImeId();
        Double $r8 = personalInfo.getLatitude();
        double $d1 = $r8 == null ? 0.0d : $r8.doubleValue();
        Double $r82 = personalInfo.getLongitude();
        double $d0 = $r82 != null ? $r82.doubleValue() : 0.0d;
        createPinViewModel.attemptLoginAfterOnboarding(personalInfo, $r4, $r5, $r6, $r7, $d1, $d0, registrationInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onboardMerchant$lambda-1  reason: not valid java name */
    public static final void m40411onboardMerchant$lambda1(CreatePinViewModel createPinViewModel, Throwable th) {
        Log_OC.getArray(createPinViewModel, "this$0");
        th.printStackTrace();
        ViewData $r2 = createPinViewModel.getState();
        CreatePinViewData $r3 = (CreatePinViewData) $r2;
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default("Something went wrong. Please contact support or try again.", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        CreatePinViewData.Error $r4 = new CreatePinViewData.Error((String) $r6, null, null, 6, null);
        createPinViewModel.publish(CreatePinViewData.copy$default($r3, false, null, null, $r4, 6, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onboardUser(final RegistrationInfo registrationInfo, final String str, final String str2, final String str3, final double d, final double d2) {
        RegisterNewUser $r6 = this.userRegister;
        AbstractC11688p $r7 = $r6.execute(registrationInfo);
        FavoritesArrayAdapter $r9 = $r7.e0(new Object() { // from class: ai.kudi.agent.register.ui.viewmodels.Widget
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CreatePinViewModel $r2 = CreatePinViewModel.this;
                String $r3 = str;
                String $r4 = str2;
                String $r5 = str3;
                double $d0 = d;
                double $d1 = d2;
                RegistrationInfo $r62 = registrationInfo;
                PersonalInfo $r72 = (PersonalInfo) obj;
                CreatePinViewModel.m40412onboardUser$lambda2($r2, $r3, $r4, $r5, $d0, $d1, $r62, $r72);
            }
        }, new Object() { // from class: ai.kudi.agent.register.ui.viewmodels.NotFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CreatePinViewModel $r1 = CreatePinViewModel.this;
                Throwable $r3 = (Throwable) obj;
                CreatePinViewModel.m40413onboardUser$lambda3($r1, $r3);
            }
        });
        C11280b $r10 = getCompositeDisposable();
        $r10.b($r9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onboardUser$lambda-2  reason: not valid java name */
    public static final void m40412onboardUser$lambda2(CreatePinViewModel createPinViewModel, String str, String str2, String str3, double d, double d2, RegistrationInfo registrationInfo, PersonalInfo personalInfo) {
        Log_OC.getArray(createPinViewModel, "this$0");
        Log_OC.getArray(str, "$pin");
        Log_OC.getArray(str2, "$deviceName");
        Log_OC.getArray(str3, "$deviceId");
        Log_OC.getArray(registrationInfo, "$registrationInfo");
        Analytics $r6 = createPinViewModel.analytics;
        String $r7 = personalInfo.getPhoneNumber();
        Log_OC.append($r7);
        OnboardingAnalytics.DefaultImpls.pinSubmitted$default($r6, $r7, true, null, 4, null);
        Log_OC.loadImage(personalInfo, "personalInfo");
        createPinViewModel.attemptLoginAfterOnboarding(personalInfo, str, str2, str3, createPinViewModel.getImeId(), d, d2, registrationInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onboardUser$lambda-3  reason: not valid java name */
    public static final void m40413onboardUser$lambda3(CreatePinViewModel createPinViewModel, Throwable th) {
        Log_OC.getArray(createPinViewModel, "this$0");
        th.printStackTrace();
        ViewData $r2 = createPinViewModel.getState();
        CreatePinViewData $r3 = (CreatePinViewData) $r2;
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default("Something went wrong. Please contact support or try again.", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        CreatePinViewData.Error $r4 = new CreatePinViewData.Error((String) $r6, null, null, 6, null);
        createPinViewModel.publish(CreatePinViewData.copy$default($r3, false, null, null, $r4, 6, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onboardUserOrAgent(RegistrationInfo registrationInfo, String str, String str2, String str3, double d, double d2) {
        AccountType $r5 = registrationInfo.getAccountType();
        AccountType $r6 = AccountType.AGENT;
        if ($r5 != $r6) {
            AccountType $r52 = registrationInfo.getAccountType();
            AccountType $r62 = AccountType.MERCHANT_AGENT;
            if ($r52 != $r62) {
                AccountType $r53 = registrationInfo.getAccountType();
                AccountType $r63 = AccountType.PERSONAL;
                if ($r53 == $r63) {
                    onboardUser(registrationInfo, str, str2, str3, d, d2);
                    return;
                }
                return;
            }
        }
        onboardAgent(registrationInfo, str, str2, str3, d, d2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final AbstractC11688p performLogin(final String str, final String str2, final String str3, final String str4, final String str5, final double d, final double d2) {
        AbstractC11688p $r7 = savePin(str, str2).m10545A(new InterfaceC11291f() { // from class: ai.kudi.agent.register.ui.viewmodels.l
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                CreatePinViewModel $r1 = CreatePinViewModel.this;
                String $r2 = str;
                String $r3 = str2;
                String $r4 = str3;
                String $r5 = str4;
                String $r6 = str5;
                double $d0 = d;
                double $d1 = d2;
                Long $r9 = (Long) obj;
                InterfaceC11692s $r72 = CreatePinViewModel.m40414performLogin$lambda11($r1, $r2, $r3, $r4, $r5, $r6, $d0, $d1, $r9);
                return $r72;
            }
        });
        Log_OC.loadImage($r7, "savePin(phoneNumber, kudiPin).flatMap {\n            loginUser.execute(\n                LoginInput(\n                    User.Builder()\n                        .setPhoneNumber(phoneNumber)\n                        .setPin(kudiPin)\n                        .setDeviceName(deviceName)\n                        .setDeviceId(deviceId)\n                        .setImei(imeId)\n                        .build(),\n                    latitude,\n                    longitude\n                )\n            )\n        }");
        return $r7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performLogin$lambda-11  reason: not valid java name */
    public static final InterfaceC11692s m40414performLogin$lambda11(CreatePinViewModel createPinViewModel, String str, String str2, String str3, String str4, String str5, double d, double d2, Long l) {
        Log_OC.getArray(createPinViewModel, "this$0");
        Log_OC.getArray(str, "$phoneNumber");
        Log_OC.getArray(str2, "$kudiPin");
        Log_OC.getArray(str3, "$deviceName");
        Log_OC.getArray(str4, "$deviceId");
        Log_OC.getArray(str5, "$imeId");
        Log_OC.getArray(l, "it");
        LoginUser $r7 = createPinViewModel.loginUser;
        User.Builder $r9 = new User.Builder();
        User $r10 = $r9.setPhoneNumber(str).setPin(str2).setDeviceName(str3).setDeviceId(str4).setImei(str5).build();
        Log_OC.loadImage($r10, "Builder()\n                        .setPhoneNumber(phoneNumber)\n                        .setPin(kudiPin)\n                        .setDeviceName(deviceName)\n                        .setDeviceId(deviceId)\n                        .setImei(imeId)\n                        .build()");
        LoginInput $r8 = new LoginInput($r10, d, d2);
        AbstractC11688p $r11 = $r7.execute($r8);
        return $r11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: resetPin$lambda-10  reason: not valid java name */
    public static final void m40415resetPin$lambda10(CreatePinViewModel createPinViewModel, Throwable th) {
        Log_OC.getArray(createPinViewModel, "this$0");
        ViewData $r2 = createPinViewModel.getState();
        CreatePinViewData $r3 = (CreatePinViewData) $r2;
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default("Something went wrong. Please contact support or try again.", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        CreatePinViewData.Error $r4 = new CreatePinViewData.Error((String) $r6, null, null, 6, null);
        createPinViewModel.publish(CreatePinViewData.copy$default($r3, false, null, null, $r4, 6, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: resetPin$lambda-9  reason: not valid java name */
    public static final void m40416resetPin$lambda9(CreatePinViewModel createPinViewModel, ResetPinResponse resetPinResponse) {
        Log_OC.getArray(createPinViewModel, "this$0");
        UserObject $r4 = UserObject.INSTANCE;
        User $r5 = $r4.getUser();
        if ($r5 == null) {
            return;
        }
        RegisterNavigator $r0 = createPinViewModel.registerNavigator;
        String $r6 = $r5.getFirstName();
        Log_OC.loadImage($r6, "firstName");
        double $d0 = $r5.walletBalance;
        boolean $z0 = $r5.isNewUser;
        boolean $z1 = $r5.isKCashEnabled;
        boolean $z2 = $r5.isC2C;
        boolean $z3 = $r5.isHq;
        boolean $z4 = $r5.isOutlet;
        String $r1 = $r5.customerType;
        Log_OC.loadImage($r1, "customerType");
        $r0.navigateToWelcomePage($r6, $d0, $z0, $z1, $z2, $z3, $z4, $r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void saveLastPhoneNumber(String str) {
        SharedPreferences $r2 = this.sharedPrefs;
        SharedPreferences.Editor $r3 = $r2.edit();
        $r3.putString(LoginParams.PREF_LAST_PHONE_NUMBER, str).putBoolean(LoginParams.PREF_NEW_ONBOARDING_SUPPORT, true).apply();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final AbstractC11688p savePin(String str, String str2) {
        SharedPreferences $r3 = this.sharedPrefs;
        boolean $z0 = $r3.getBoolean(LoginParams.EXTRA_ENABLE_FINGERPRINT, false);
        if (!$z0) {
            AbstractC11688p $r7 = AbstractC11688p.m10532N(1L);
            Log_OC.loadImage($r7, "{\n            Observable.just(1) // just return a random value since the value is not used.\n        }");
            return $r7;
        }
        IPFSecurityUtils $r4 = this.deviceId;
        Application $r5 = this.context;
        String $r2 = $r4.encode($r5, "fp_pin_lock_screen_key_store", str2, false);
        PinRepositoryImpl $r6 = this.pinRepositoryImpl;
        return $r6.savePin(str, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        CreatePinViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public CreatePinViewData initialData() {
        Boolean $r1 = Boolean.FALSE;
        CreatePinViewData $r2 = new CreatePinViewData(false, $r1, null, null, 4, null);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void resetPin(String str, String str2, boolean z) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(str2, "pin");
        boolean $z0 = inputParamsValid(str2, str2, z);
        if ($z0) {
            ViewData $r4 = getState();
            CreatePinViewData $r5 = (CreatePinViewData) $r4;
            publish(CreatePinViewData.copy$default($r5, true, null, null, null, 6, null));
            SetNewPin $r6 = this.setNewPin;
            ResetPinRequest $r1 = new ResetPinRequest(null, null, null, str, str2, null, 39, null);
            AbstractC11688p $r7 = $r6.execute($r1);
            FavoritesArrayAdapter $r10 = $r7.e0(new Object() { // from class: ai.kudi.agent.register.ui.viewmodels.InBandBytestreamSession$IBBDataPacketFilter
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    CreatePinViewModel $r12 = CreatePinViewModel.this;
                    ResetPinResponse $r3 = (ResetPinResponse) obj;
                    CreatePinViewModel.m40416resetPin$lambda9($r12, $r3);
                }
            }, new Object() { // from class: ai.kudi.agent.register.ui.viewmodels.Comment
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    CreatePinViewModel $r12 = CreatePinViewModel.this;
                    Throwable $r3 = (Throwable) obj;
                    CreatePinViewModel.m40415resetPin$lambda10($r12, $r3);
                }
            });
            C11280b $r11 = getCompositeDisposable();
            $r11.b($r10);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void submitPin(RegistrationInfo registrationInfo, String str, String str2, String str3, String str4, boolean z, double d, double d2) {
        Log_OC.getArray(registrationInfo, "registrationInfo");
        Log_OC.getArray(str, "pin");
        Log_OC.getArray(str2, "confirmPin");
        Log_OC.getArray(str3, "deviceId");
        Log_OC.getArray(str4, "deviceName");
        boolean $z0 = inputParamsValid(str, str2, z);
        if ($z0) {
            ViewData $r6 = getState();
            CreatePinViewData $r7 = (CreatePinViewData) $r6;
            publish(CreatePinViewData.copy$default($r7, true, null, null, null, 6, null));
            PersonalInfo $r8 = registrationInfo.getPersonalInfo();
            $r8.setPin(str);
            $r8.setDeviceId(str3);
            $r8.setDeviceName(str4);
            String $r3 = Build.VERSION.RELEASE;
            $r8.setDeviceOsVersion($r3);
            $r8.setSecondaryDeviceId(str3);
            AccountType $r9 = registrationInfo.getAccountType();
            AccountType $r10 = AccountType.MERCHANT;
            if ($r9 == $r10) {
                onboardMerchant(registrationInfo);
            } else {
                onboardUserOrAgent(registrationInfo, str, str4, str3, d, d2);
            }
        }
    }
}

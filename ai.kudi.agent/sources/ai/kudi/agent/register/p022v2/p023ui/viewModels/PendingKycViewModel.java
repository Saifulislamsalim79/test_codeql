package ai.kudi.agent.register.p022v2.p023ui.viewModels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ManageDevice;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.register.domain.usecases.VerifyId;
import ai.kudi.agent.register.domain.wiki.Data;
import ai.kudi.agent.register.domain.wiki.IdVerificationRequest;
import ai.kudi.agent.register.domain.wiki.PersonalInfo;
import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import ai.kudi.agent.register.domain.wiki.RegistrationStatus;
import ai.kudi.agent.register.navigators.PendingKycNavigator;
import ai.kudi.agent.register.p022v2.p023ui.viewModels.data.PendingKycViewData;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.LoginInput;
import ai.kudi.agent.users.domain.usecases.LoginUser;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
import retrofit2.HttpException;
/* compiled from: PendingKycViewModel.kt */
@Metadata(m10422d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002JF\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J6\u0010\u0003\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m10421d2 = {"Lai/kudi/agent/register/v2/ui/viewModels/PendingKycViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/register/v2/ui/viewModels/data/PendingKycViewData;", "verifyId", "Lai/kudi/agent/register/domain/usecases/VerifyId;", "loginUser", "Lai/kudi/agent/users/domain/usecases/LoginUser;", "sharedPrefs", "Landroid/content/SharedPreferences;", "pendingKycNavigator", "Lai/kudi/agent/register/navigators/PendingKycNavigator;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/register/domain/usecases/VerifyId;Lai/kudi/agent/users/domain/usecases/LoginUser;Landroid/content/SharedPreferences;Lai/kudi/agent/register/navigators/PendingKycNavigator;Lai/kudi/agent/core/analytics/Analytics;)V", "initialData", "isInPutParamsValid", "", "idType", "", "idNumber", "emailAddress", "performLogin", "Lio/reactivex/Observable;", "Lai/kudi/agent/users/domain/dto/User;", "phoneNumber", "kudiPin", "deviceName", "deviceId", "imeId", "latitude", "", "longitude", "", "registrationInfo", "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.v2.ui.viewModels.PendingKycViewModel */
/* loaded from: classes.dex */
public final class PendingKycViewModel extends BaseViewModel<PendingKycViewData> {
    private final Analytics analytics;
    private final LoginUser loginUser;
    private final PendingKycNavigator pendingKycNavigator;
    private final SharedPreferences sharedPrefs;
    private final VerifyId verifyId;

    public PendingKycViewModel(VerifyId verifyId, LoginUser loginUser, SharedPreferences sharedPreferences, PendingKycNavigator pendingKycNavigator, Analytics analytics) {
        Log_OC.getArray(verifyId, "verifyId");
        Log_OC.getArray(loginUser, "loginUser");
        Log_OC.getArray(sharedPreferences, "sharedPrefs");
        Log_OC.getArray(pendingKycNavigator, "pendingKycNavigator");
        Log_OC.getArray(analytics, "analytics");
        this.verifyId = verifyId;
        this.loginUser = loginUser;
        this.sharedPrefs = sharedPreferences;
        this.pendingKycNavigator = pendingKycNavigator;
        this.analytics = analytics;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isInPutParamsValid(String str, String str2, String str3) {
        boolean $z0;
        boolean $z02;
        boolean $z03;
        $z0 = C13276s.m5440u(str);
        if ($z0) {
            ViewData $r4 = getState();
            PendingKycViewData $r5 = (PendingKycViewData) $r4;
            PendingKycViewData.Error $r6 = new PendingKycViewData.Error("Please select an ID Type", null, null, null, 14, null);
            publish(PendingKycViewData.copy$default($r5, false, null, $r6, 2, null));
            return false;
        }
        $z02 = C13276s.m5440u(str2);
        if ($z02) {
            ViewData $r42 = getState();
            PendingKycViewData $r52 = (PendingKycViewData) $r42;
            PendingKycViewData.Error $r62 = new PendingKycViewData.Error(null, "ID number cannot be empty", null, null, 13, null);
            publish(PendingKycViewData.copy$default($r52, false, null, $r62, 2, null));
            return false;
        }
        boolean $z04 = StringExtKt.isValidIdType(str2, str);
        if ($z04) {
            ViewData $r43 = getState();
            PendingKycViewData $r53 = (PendingKycViewData) $r43;
            String $r1 = "Please provide a valid " + str + " number";
            PendingKycViewData.Error $r63 = new PendingKycViewData.Error(null, $r1, null, null, 13, null);
            publish(PendingKycViewData.copy$default($r53, false, null, $r63, 2, null));
            return false;
        }
        $z03 = C13276s.m5440u(str3);
        if ($z03) {
            ViewData $r44 = getState();
            PendingKycViewData $r54 = (PendingKycViewData) $r44;
            PendingKycViewData.Error $r64 = new PendingKycViewData.Error(null, null, "Email Address cannot be empty", null, 11, null);
            publish(PendingKycViewData.copy$default($r54, false, null, $r64, 2, null));
            return false;
        }
        boolean $z05 = StringExtKt.isValidEmail(str3);
        if ($z05) {
            return true;
        }
        ViewData $r45 = getState();
        PendingKycViewData $r55 = (PendingKycViewData) $r45;
        PendingKycViewData.Error $r65 = new PendingKycViewData.Error(null, null, "Please enter a valid email", null, 11, null);
        publish(PendingKycViewData.copy$default($r55, false, null, $r65, 2, null));
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final AbstractC11688p performLogin(String str, String str2, String str3, String str4, String str5, double d, double d2) {
        LoginUser $r7 = this.loginUser;
        User.Builder $r8 = new User.Builder();
        User $r9 = $r8.setPhoneNumber(str).setPin(str2).setDeviceName(str3).setDeviceId(str4).setImei(str5).build();
        Log_OC.loadImage($r9, "Builder()\n                    .setPhoneNumber(phoneNumber)\n                    .setPin(kudiPin)\n                    .setDeviceName(deviceName)\n                    .setDeviceId(deviceId)\n                    .setImei(imeId)\n                    .build()");
        LoginInput $r6 = new LoginInput($r9, d, d2);
        AbstractC11688p $r10 = $r7.execute($r6);
        return $r10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: verifyId$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m40478verifyId$lambda0(PendingKycViewModel pendingKycViewModel, PersonalInfo personalInfo, String str, double d, double d2, Data data) {
        Log_OC.getArray(pendingKycViewModel, "this$0");
        Log_OC.getArray(personalInfo, "$personalInfo");
        Log_OC.getArray(data, "it");
        String $r4 = personalInfo.getPhoneNumber();
        String $r5 = personalInfo.getPin();
        Log_OC.append($r5);
        String $r6 = personalInfo.getDeviceName();
        Log_OC.append($r6);
        String $r7 = personalInfo.getDeviceId();
        Log_OC.append($r7);
        Log_OC.append(str);
        AbstractC11688p $r8 = pendingKycViewModel.performLogin($r4, $r5, $r6, $r7, str, d, d2);
        return $r8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: verifyId$lambda-1  reason: not valid java name */
    public static final void m40479verifyId$lambda1(PendingKycViewModel pendingKycViewModel, PersonalInfo personalInfo, User user) {
        Log_OC.getArray(pendingKycViewModel, "this$0");
        Log_OC.getArray(personalInfo, "$personalInfo");
        ViewData $r4 = pendingKycViewModel.getState();
        PendingKycViewData $r5 = (PendingKycViewData) $r4;
        pendingKycViewModel.publish(PendingKycViewData.copy$default($r5, false, null, null, 2, null));
        double $d0 = user.walletBalance;
        boolean $z2 = user.isNewUser;
        boolean $z3 = user.isKCashEnabled;
        boolean $z4 = user.isC2C;
        boolean $z1 = user.isHq;
        boolean $z0 = user.isOutlet;
        String $r0 = user.customerType;
        PendingKycNavigator $r6 = pendingKycViewModel.pendingKycNavigator;
        Log_OC.loadImage($r0, "customerType");
        $r6.navigateToDashboard($d0, $z2, $z3, $z4, $z0, $z1, $r0);
        Analytics $r7 = pendingKycViewModel.analytics;
        $r7.onAgentKycCompleted(personalInfo.getPhoneNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: verifyId$lambda-2  reason: not valid java name */
    public static final void m40480verifyId$lambda2(PendingKycViewModel pendingKycViewModel, Throwable th) {
        Log_OC.getArray(pendingKycViewModel, "this$0");
        InterfaceC11767l $r3 = KudiErrorParserKt.parseHttpError2$default("Something went wrong, please retry", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r4 = $r3.invoke(th);
        String $r5 = (String) $r4;
        boolean $z0 = th instanceof HttpException;
        if ($z0) {
            int $i0 = ((HttpException) th).m352a();
            if ($i0 == 401) {
                RegistrationStatus $r7 = RegistrationStatus.PENDING_KYC_VERIFICATION;
                String $r8 = $r7.name();
                boolean $z02 = Log_OC.append($r5, $r8);
                if ($z02) {
                    PendingKycNavigator $r9 = pendingKycViewModel.pendingKycNavigator;
                    $r9.navigateToFeedBack();
                    return;
                }
            }
        }
        ViewData $r10 = pendingKycViewModel.getState();
        PendingKycViewData $r11 = (PendingKycViewData) $r10;
        PendingKycViewData.Error $r0 = new PendingKycViewData.Error(null, null, null, $r5, 7, null);
        pendingKycViewModel.publish(PendingKycViewData.copy$default($r11, false, null, $r0, 2, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        PendingKycViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public PendingKycViewData initialData() {
        PendingKycViewData $r1 = new PendingKycViewData(false, null, null, 7, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void verifyId(String str, String str2, String str3, RegistrationInfo registrationInfo, final double d, final double d2) {
        Log_OC.getArray(str, "idType");
        Log_OC.getArray(str2, "idNumber");
        Log_OC.getArray(str3, "emailAddress");
        Log_OC.getArray(registrationInfo, "registrationInfo");
        ViewData $r5 = getState();
        PendingKycViewData $r6 = (PendingKycViewData) $r5;
        publish(PendingKycViewData.copy$default($r6, true, null, null, 2, null));
        boolean $z0 = isInPutParamsValid(str, str2, str3);
        if ($z0) {
            final PersonalInfo $r7 = registrationInfo.getPersonalInfo();
            SharedPreferences $r8 = this.sharedPrefs;
            final String $r3 = $r8.getString(ManageDevice.IMEID_PARAM, "");
            VerifyId $r9 = this.verifyId;
            String $r10 = $r7.getPhoneNumber();
            Log_OC.append($r10);
            IdVerificationRequest $r11 = new IdVerificationRequest(false, str2, str, $r10, 1, null);
            AbstractC11688p $r12 = $r9.execute($r11);
            FavoritesArrayAdapter $r16 = $r12.m10545A(new InterfaceC11291f() { // from class: ai.kudi.agent.register.v2.ui.viewModels.Item
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.InterfaceC11291f
                /* renamed from: a */
                public final Object mo10663a(Object obj) {
                    PendingKycViewModel $r1 = PendingKycViewModel.this;
                    PersonalInfo $r2 = $r7;
                    String $r32 = $r3;
                    double $d0 = d;
                    double $d1 = d2;
                    Data $r62 = (Data) obj;
                    InterfaceC11692s $r4 = PendingKycViewModel.m40478verifyId$lambda0($r1, $r2, $r32, $d0, $d1, $r62);
                    return $r4;
                }
            }).e0(new Object() { // from class: ai.kudi.agent.register.v2.ui.viewModels.Cubic
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    PendingKycViewModel $r1 = PendingKycViewModel.this;
                    PersonalInfo $r2 = $r7;
                    User $r4 = (User) obj;
                    PendingKycViewModel.m40479verifyId$lambda1($r1, $r2, $r4);
                }
            }, new Object() { // from class: ai.kudi.agent.register.v2.ui.viewModels.Tools$1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    PendingKycViewModel $r1 = PendingKycViewModel.this;
                    Throwable $r32 = (Throwable) obj;
                    PendingKycViewModel.m40480verifyId$lambda2($r1, $r32);
                }
            });
            C11280b $r17 = getCompositeDisposable();
            $r17.b($r16);
        }
    }
}

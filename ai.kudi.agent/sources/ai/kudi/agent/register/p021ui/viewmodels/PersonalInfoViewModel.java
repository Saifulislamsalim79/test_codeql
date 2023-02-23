package ai.kudi.agent.register.p021ui.viewmodels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.analytics.contracts.OnboardingAnalytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.login.setup.DashboardData;
import ai.kudi.agent.login.setup.p010ui.AccountVerificationHolderActivity;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.register.domain.usecases.FetchLocation;
import ai.kudi.agent.register.domain.wiki.PersonalInfo;
import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import ai.kudi.agent.register.navigators.RegisterNavigator;
import ai.kudi.agent.register.p021ui.viewmodels.data.PersonalInfoViewData;
import ai.kudi.agent.register.util.USERTYPES;
import ai.kudi.agent.settings.domain.package_4.EditProfileRequest;
import ai.kudi.agent.settings.domain.package_4.EditProfileResponse;
import ai.kudi.agent.settings.domain.useCases.EditProfile;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.users.domain.usecases.UpdateUser;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.C11812w;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: PersonalInfoViewModel.kt */
@Metadata(m10422d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJB\u0010\r\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00112\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u0006\u0010\u0005\u001a\u00020\u0016J\b\u0010 \u001a\u00020\u0002H\u0016J0\u0010!\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011H\u0002J\u0006\u0010$\u001a\u00020\u0016J\u000e\u0010%\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cJ,\u0010&\u001a\u00020\u00162\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010\u001d\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010)\u001a\u00020*H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, m10421d2 = {"Lai/kudi/agent/register/ui/viewmodels/PersonalInfoViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/register/ui/viewmodels/data/PersonalInfoViewData;", "navigator", "Lai/kudi/agent/register/navigators/RegisterNavigator;", "fetchLocation", "Lai/kudi/agent/register/domain/usecases/FetchLocation;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "updateUser", "Lai/kudi/agent/users/domain/usecases/UpdateUser;", "editProfile", "Lai/kudi/agent/settings/domain/useCases/EditProfile;", "(Lai/kudi/agent/register/navigators/RegisterNavigator;Lai/kudi/agent/register/domain/usecases/FetchLocation;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/users/domain/usecases/UpdateUser;Lai/kudi/agent/settings/domain/useCases/EditProfile;)V", "phoneNumber", "", "getPhoneNumber", "()Ljava/lang/String;", "setPhoneNumber", "(Ljava/lang/String;)V", "", "residentialAddress", "closestLandmark", "lga", "stateLocation", "regData", "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "isFrom", "dashboardData", "Lai/kudi/agent/login/setup/DashboardData;", "initialData", "inputParamsValid", "", "gender", OpsMetricTracker.START, "submitInfo", "updateUserCache", "user1", "Lai/kudi/agent/users/domain/dto/User;", "editProfileResponse", "Lai/kudi/agent/settings/domain/dto/EditProfileResponse;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.ui.viewmodels.PersonalInfoViewModel */
/* loaded from: classes.dex */
public final class PersonalInfoViewModel extends BaseViewModel<PersonalInfoViewData> {
    private final Analytics analytics;
    private final EditProfile editProfile;
    private final FetchCurrentUser fetchCurrentUser;
    private final FetchLocation fetchLocation;
    private final RegisterNavigator navigator;
    private String phoneNumber;
    private final UpdateUser updateUser;

    public PersonalInfoViewModel(RegisterNavigator registerNavigator, FetchLocation fetchLocation, Analytics analytics, FetchCurrentUser fetchCurrentUser, UpdateUser updateUser, EditProfile editProfile) {
        Log_OC.getArray(registerNavigator, "navigator");
        Log_OC.getArray(fetchLocation, "fetchLocation");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(updateUser, "updateUser");
        Log_OC.getArray(editProfile, "editProfile");
        this.navigator = registerNavigator;
        this.fetchLocation = fetchLocation;
        this.analytics = analytics;
        this.fetchCurrentUser = fetchCurrentUser;
        this.updateUser = updateUser;
        this.editProfile = editProfile;
        this.phoneNumber = "";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void editProfile$default(PersonalInfoViewModel personalInfoViewModel, String str, String str2, String str3, String str4, RegistrationInfo registrationInfo, String str5, DashboardData $r7, int i, Object obj) {
        int $i0 = i & 64;
        if ($i0 != 0) {
            $r7 = null;
        }
        personalInfoViewModel.editProfile(str, str2, str3, str4, registrationInfo, str5, $r7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: editProfile$lambda-2  reason: not valid java name */
    public static final InterfaceC11692s m40418editProfile$lambda2(C11812w c11812w, PersonalInfoViewModel personalInfoViewModel, RegistrationInfo registrationInfo, String str, String str2, String str3, String str4, User user) {
        Log_OC.getArray(c11812w, "$user1");
        Log_OC.getArray(personalInfoViewModel, "this$0");
        Log_OC.getArray(registrationInfo, "$regData");
        Log_OC.getArray(str, "$lga");
        Log_OC.getArray(str2, "$stateLocation");
        Log_OC.getArray(str3, "$residentialAddress");
        Log_OC.getArray(str4, "$closestLandmark");
        Log_OC.getArray(user, "user");
        c11812w.f26499c = user;
        EditProfile $r8 = personalInfoViewModel.editProfile;
        String $r9 = user.getSessionId();
        Log_OC.loadImage($r9, "user.sessionId");
        PersonalInfo $r10 = registrationInfo.getPersonalInfo();
        String $r11 = $r10.getDob();
        if ($r11 == null) {
            $r11 = "";
        }
        String $r12 = user.getEmail();
        if ($r12 == null) {
            $r12 = "";
        }
        EditProfileRequest $r13 = new EditProfileRequest(null, null, $r11, $r12, str, str2, null, null, str3, str4, null, false, 3267, null);
        AbstractC11688p $r14 = $r8.execute($r9, $r13);
        return $r14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: editProfile$lambda-3  reason: not valid java name */
    public static final void m40419editProfile$lambda3(PersonalInfoViewModel personalInfoViewModel, C11812w c11812w, String str, DashboardData dashboardData, EditProfileResponse editProfileResponse) {
        Log_OC.getArray(personalInfoViewModel, "this$0");
        Log_OC.getArray(c11812w, "$user1");
        Log_OC.getArray(str, "$isFrom");
        Object $r5 = c11812w.f26499c;
        User $r6 = (User) $r5;
        Log_OC.loadImage(editProfileResponse, "it");
        personalInfoViewModel.updateUserCache($r6, str, dashboardData, editProfileResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: editProfile$lambda-4  reason: not valid java name */
    public static final void m40420editProfile$lambda4(PersonalInfoViewModel personalInfoViewModel, Throwable th) {
        Log_OC.getArray(personalInfoViewModel, "this$0");
        Analytics $r2 = personalInfoViewModel.analytics;
        String $r3 = personalInfoViewModel.getPhoneNumber();
        USERTYPES $r4 = USERTYPES.EXISTING;
        String $r5 = $r4.name();
        String $r6 = th.getMessage();
        $r2.outletDetailsSubmitted($r3, true, $r5, $r6);
        ViewData $r7 = personalInfoViewModel.getState();
        InterfaceC11767l $r10 = KudiErrorParserKt.parseHttpError2$default("Something went wrong, please try again", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r11 = $r10.invoke(th);
        String $r32 = (String) $r11;
        PersonalInfoViewData.Error $r9 = new PersonalInfoViewData.Error(null, null, null, null, null, $r32, 31, null);
        PersonalInfoViewData $r8 = PersonalInfoViewData.copy$default((PersonalInfoViewData) $r7, null, false, false, null, null, false, $r9, 59, null);
        personalInfoViewModel.publish($r8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchLocation$lambda-8  reason: not valid java name */
    public static final void m40421fetchLocation$lambda8(PersonalInfoViewModel personalInfoViewModel, List list) {
        Log_OC.getArray(personalInfoViewModel, "this$0");
        ViewData $r2 = personalInfoViewModel.getState();
        PersonalInfoViewData $r3 = (PersonalInfoViewData) $r2;
        personalInfoViewModel.publish(PersonalInfoViewData.copy$default($r3, null, false, false, null, list, false, null, 79, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchLocation$lambda-9  reason: not valid java name */
    public static final void m40422fetchLocation$lambda9(PersonalInfoViewModel personalInfoViewModel, Throwable th) {
        Log_OC.getArray(personalInfoViewModel, "this$0");
        th.printStackTrace();
        ViewData $r2 = personalInfoViewModel.getState();
        PersonalInfoViewData $r3 = (PersonalInfoViewData) $r2;
        personalInfoViewModel.publish(PersonalInfoViewData.copy$default($r3, null, false, false, null, null, false, null, 95, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean inputParamsValid(String str, String str2, String str3, String str4, String str5) {
        boolean $z0;
        boolean $z02;
        boolean $z03;
        boolean $z04;
        boolean $z05;
        $z0 = C13276s.m5440u(str);
        if ($z0) {
            ViewData $r6 = getState();
            PersonalInfoViewData $r7 = (PersonalInfoViewData) $r6;
            PersonalInfoViewData.Error $r8 = new PersonalInfoViewData.Error("Residential address is required.", null, null, null, null, null, 62, null);
            publish(PersonalInfoViewData.copy$default($r7, null, false, false, null, null, false, $r8, 63, null));
            return false;
        }
        $z02 = C13276s.m5440u(str2);
        if ($z02) {
            ViewData $r62 = getState();
            PersonalInfoViewData $r72 = (PersonalInfoViewData) $r62;
            PersonalInfoViewData.Error $r82 = new PersonalInfoViewData.Error(null, "Closest landmark is required.", null, null, null, null, 61, null);
            publish(PersonalInfoViewData.copy$default($r72, null, false, false, null, null, false, $r82, 63, null));
            return false;
        }
        $z03 = C13276s.m5440u(str4);
        if ($z03) {
            ViewData $r63 = getState();
            PersonalInfoViewData $r73 = (PersonalInfoViewData) $r63;
            PersonalInfoViewData.Error $r83 = new PersonalInfoViewData.Error(null, null, null, "LGA is required.", null, null, 55, null);
            publish(PersonalInfoViewData.copy$default($r73, null, false, false, null, null, false, $r83, 63, null));
            return false;
        }
        $z04 = C13276s.m5440u(str3);
        if ($z04) {
            ViewData $r64 = getState();
            PersonalInfoViewData $r74 = (PersonalInfoViewData) $r64;
            PersonalInfoViewData.Error $r84 = new PersonalInfoViewData.Error(null, null, "State is required", null, null, null, 59, null);
            publish(PersonalInfoViewData.copy$default($r74, null, false, false, null, null, false, $r84, 63, null));
            return false;
        }
        $z05 = C13276s.m5440u(str5);
        if ($z05) {
            ViewData $r65 = getState();
            PersonalInfoViewData $r75 = (PersonalInfoViewData) $r65;
            PersonalInfoViewData.Error $r85 = new PersonalInfoViewData.Error(null, null, null, null, "Gender is required", null, 47, null);
            publish(PersonalInfoViewData.copy$default($r75, null, false, false, null, null, false, $r85, 63, null));
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: start$lambda-0  reason: not valid java name */
    public static final void m40423start$lambda0(PersonalInfoViewModel personalInfoViewModel, User user) {
        Log_OC.getArray(personalInfoViewModel, "this$0");
        String $r2 = user.getPhoneNumber();
        String $r3 = $r2;
        if ($r2 == null) {
            $r3 = "";
        }
        personalInfoViewModel.setPhoneNumber($r3);
        ViewData $r4 = personalInfoViewModel.getState();
        PersonalInfoViewData $r5 = (PersonalInfoViewData) $r4;
        personalInfoViewModel.publish(PersonalInfoViewData.copy$default($r5, null, false, false, user, null, false, null, 51, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void updateUserCache(User user, final String str, final DashboardData dashboardData, EditProfileResponse editProfileResponse) {
        Log_OC.append(user);
        User.Builder $r5 = user.toBuilder();
        String $r6 = editProfileResponse.getBusinessName();
        User.Builder $r52 = $r5.setBusinessName($r6);
        String $r62 = editProfileResponse.getBusinessAddress();
        User.Builder $r53 = $r52.setBusinessAddress($r62);
        String $r63 = editProfileResponse.getState();
        User.Builder $r54 = $r53.setState($r63);
        String $r64 = editProfileResponse.getLga();
        User $r2 = $r54.setLga($r64).build();
        UpdateUser $r7 = this.updateUser;
        Log_OC.loadImage($r2, MetricTracker.Object.INPUT);
        AbstractC11688p $r8 = $r7.execute($r2);
        Object object = new Object() { // from class: ai.kudi.agent.register.ui.viewmodels.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PersonalInfoViewModel $r1 = PersonalInfoViewModel.this;
                String $r22 = str;
                DashboardData $r3 = dashboardData;
                User $r55 = (User) obj;
                PersonalInfoViewModel.m40425updateUserCache$lambda6($r1, $r22, $r3, $r55);
            }
        };
        Subscription $r10 = Subscription.none;
        FavoritesArrayAdapter $r11 = $r8.e0(object, $r10);
        C11280b $r12 = getCompositeDisposable();
        $r12.b($r11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: updateUserCache$lambda-6  reason: not valid java name */
    public static final void m40425updateUserCache$lambda6(PersonalInfoViewModel personalInfoViewModel, String str, DashboardData dashboardData, User user) {
        Log_OC.getArray(personalInfoViewModel, "this$0");
        Log_OC.getArray(str, "$isFrom");
        ViewData $r4 = personalInfoViewModel.getState();
        PersonalInfoViewData $r5 = (PersonalInfoViewData) $r4;
        personalInfoViewModel.publish(PersonalInfoViewData.copy$default($r5, "Your details have been Updated!!", false, false, null, null, false, null, 58, null));
        Analytics $r6 = personalInfoViewModel.analytics;
        String $r7 = personalInfoViewModel.getPhoneNumber();
        USERTYPES $r8 = USERTYPES.EXISTING;
        String $r9 = $r8.name();
        OnboardingAnalytics.DefaultImpls.outletDetailsSubmitted$default($r6, $r7, true, $r9, null, 8, null);
        String $r72 = AccountVerificationHolderActivity.class.getCanonicalName();
        boolean $z0 = Log_OC.append(str, $r72);
        if (!$z0) {
            RegisterNavigator $r11 = personalInfoViewModel.navigator;
            $r11.finishFragmentBvn();
        } else if (dashboardData == null) {
        } else {
            String $r3 = user.customerType;
            double $d0 = dashboardData.getWalletBalance();
            boolean $z02 = dashboardData.isNewUser();
            boolean $z1 = dashboardData.isC2C();
            boolean $z2 = dashboardData.isOutlet();
            boolean $z3 = dashboardData.isHq();
            boolean $z4 = dashboardData.isKCashEnabled();
            RegisterNavigator $r112 = personalInfoViewModel.navigator;
            Log_OC.loadImage($r3, "customerType");
            $r112.navigateToDashboard($d0, $z02, $z4, $z1, $z2, $z3, $r3);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void editProfile(final String str, final String str2, final String str3, final String str4, final RegistrationInfo registrationInfo, final String str5, final DashboardData dashboardData) {
        Log_OC.getArray(str, "residentialAddress");
        Log_OC.getArray(str2, "closestLandmark");
        Log_OC.getArray(str3, "lga");
        Log_OC.getArray(str4, "stateLocation");
        Log_OC.getArray(registrationInfo, "regData");
        Log_OC.getArray(str5, "isFrom");
        ViewData $r8 = getState();
        PersonalInfoViewData $r9 = (PersonalInfoViewData) $r8;
        publish(PersonalInfoViewData.copy$default($r9, null, false, true, null, null, false, null, 59, null));
        final C11812w $r10 = new C11812w();
        FetchCurrentUser $r11 = this.fetchCurrentUser;
        AbstractC11696w $r12 = FetchCurrentUser.execute$default($r11, null, null, 3, null);
        AbstractC11688p $r14 = $r12.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.register.ui.viewmodels.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                C11812w $r1 = C11812w.this;
                PersonalInfoViewModel $r2 = this;
                RegistrationInfo $r3 = registrationInfo;
                String $r4 = str3;
                String $r5 = str4;
                String $r6 = str;
                String $r7 = str2;
                User $r102 = (User) obj;
                InterfaceC11692s $r82 = PersonalInfoViewModel.m40418editProfile$lambda2($r1, $r2, $r3, $r4, $r5, $r6, $r7, $r102);
                return $r82;
            }
        });
        FavoritesArrayAdapter $r17 = $r14.e0(new Object() { // from class: ai.kudi.agent.register.ui.viewmodels.e
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PersonalInfoViewModel $r1 = PersonalInfoViewModel.this;
                C11812w $r2 = $r10;
                String $r3 = str5;
                DashboardData $r4 = dashboardData;
                EditProfileResponse $r6 = (EditProfileResponse) obj;
                PersonalInfoViewModel.m40419editProfile$lambda3($r1, $r2, $r3, $r4, $r6);
            }
        }, new Object() { // from class: ai.kudi.agent.register.ui.viewmodels.SubjectSubscriptionManager$SubjectObserver
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PersonalInfoViewModel $r1 = PersonalInfoViewModel.this;
                Throwable $r3 = (Throwable) obj;
                PersonalInfoViewModel.m40420editProfile$lambda4($r1, $r3);
            }
        });
        C11280b $r18 = getCompositeDisposable();
        $r18.b($r17);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchLocation() {
        ViewData $r1 = getState();
        PersonalInfoViewData $r2 = (PersonalInfoViewData) $r1;
        publish(PersonalInfoViewData.copy$default($r2, null, false, false, null, null, true, null, 95, null));
        FetchLocation $r3 = this.fetchLocation;
        AbstractC11688p $r4 = $r3.execute();
        FavoritesArrayAdapter $r7 = $r4.e0(new Object() { // from class: ai.kudi.agent.register.ui.viewmodels.Call
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PersonalInfoViewModel $r12 = PersonalInfoViewModel.this;
                List $r32 = (List) obj;
                PersonalInfoViewModel.m40421fetchLocation$lambda8($r12, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.register.ui.viewmodels.SocketConnector
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PersonalInfoViewModel $r12 = PersonalInfoViewModel.this;
                Throwable $r32 = (Throwable) obj;
                PersonalInfoViewModel.m40422fetchLocation$lambda9($r12, $r32);
            }
        });
        Log_OC.loadImage($r7, "fetchLocation.execute().subscribe(\n            { publish(state.copy(isFetchingLocation = false, location = it)) },\n            {\n                it.printStackTrace()\n                publish(state.copy(isFetchingLocation = false))\n            }\n        )");
        C11280b $r8 = getCompositeDisposable();
        RxExtKt.addTo($r7, $r8);
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
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        PersonalInfoViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public PersonalInfoViewData initialData() {
        PersonalInfoViewData $r1 = new PersonalInfoViewData(null, false, false, null, null, false, null, 127, null);
        return $r1;
    }

    public final void setPhoneNumber(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.phoneNumber = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void start() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.register.ui.viewmodels.FlingerListView$ItemFlingerResponder
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PersonalInfoViewModel $r12 = PersonalInfoViewModel.this;
                User $r3 = (User) obj;
                PersonalInfoViewModel.m40423start$lambda0($r12, $r3);
            }
        };
        Timer $r4 = Timer.timer;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        Log_OC.loadImage($r5, "fetchCurrentUser.execute().subscribe(\n            {\n                // Init phoneNumber\n                phoneNumber = it.phoneNumber ?: \"\"\n                publish(state.copy(isLoading = false, error = null, userProfile = it))\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r6 = getCompositeDisposable();
        $r6.b($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void submitInfo(RegistrationInfo registrationInfo) {
        Log_OC.getArray(registrationInfo, "regData");
        PersonalInfo $r2 = registrationInfo.getPersonalInfo();
        String $r3 = $r2.getHomeAddress();
        if ($r3 == null) {
            $r3 = "";
        }
        String $r4 = $r2.getClosestLandmark();
        if ($r4 == null) {
            $r4 = "";
        }
        String $r5 = $r2.getState();
        if ($r5 == null) {
            $r5 = "";
        }
        String $r6 = $r2.getLocalGovernmentArea();
        if ($r6 == null) {
            $r6 = "";
        }
        String $r7 = $r2.getGender();
        if ($r7 == null) {
            $r7 = "";
        }
        boolean $z0 = inputParamsValid($r3, $r4, $r5, $r6, $r7);
        if ($z0) {
            Analytics $r8 = this.analytics;
            String $r32 = $r2.getPhoneNumber();
            Log_OC.append($r32);
            USERTYPES $r9 = USERTYPES.isMethod;
            OnboardingAnalytics.DefaultImpls.outletDetailsSubmitted$default($r8, $r32, true, $r9.name(), null, 8, null);
            RegisterNavigator $r10 = this.navigator;
            $r10.toCreatePinView(registrationInfo);
        }
    }
}

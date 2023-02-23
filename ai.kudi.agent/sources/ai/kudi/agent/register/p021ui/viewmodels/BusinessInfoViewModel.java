package ai.kudi.agent.register.p021ui.viewmodels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.analytics.contracts.OnboardingAnalytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.login.setup.DashboardData;
import ai.kudi.agent.login.setup.p010ui.AccountVerificationHolderActivity;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.register.domain.usecases.FetchBusinessCategories;
import ai.kudi.agent.register.domain.usecases.FetchLocation;
import ai.kudi.agent.register.domain.wiki.AccountType;
import ai.kudi.agent.register.domain.wiki.PersonalInfo;
import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import ai.kudi.agent.register.navigators.RegisterNavigator;
import ai.kudi.agent.register.p021ui.viewmodels.data.BusinessInfoViewData;
import ai.kudi.agent.register.util.USERTYPES;
import ai.kudi.agent.settings.domain.package_4.EditProfileRequest;
import ai.kudi.agent.settings.domain.package_4.EditProfileResponse;
import ai.kudi.agent.settings.domain.useCases.EditProfile;
import ai.kudi.agent.settings.p029ui.AccountAndSettingsOptionsFragment;
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
/* compiled from: BusinessInfoViewModel.kt */
@Metadata(m10422d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011JR\u0010\u000f\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00132\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#J\u0006\u0010$\u001a\u00020\u0018J\u0006\u0010\u0005\u001a\u00020\u0018J\b\u0010%\u001a\u00020\u0002H\u0016J@\u0010&\u001a\u00020'2\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u0013H\u0002J\u0006\u0010)\u001a\u00020\u0018J\u000e\u0010*\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 J,\u0010+\u001a\u00020\u00182\b\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010!\u001a\u00020\u00132\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010.\u001a\u00020/H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, m10421d2 = {"Lai/kudi/agent/register/ui/viewmodels/BusinessInfoViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/register/ui/viewmodels/data/BusinessInfoViewData;", "navigator", "Lai/kudi/agent/register/navigators/RegisterNavigator;", "fetchLocation", "Lai/kudi/agent/register/domain/usecases/FetchLocation;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "updateUser", "Lai/kudi/agent/users/domain/usecases/UpdateUser;", "fetchBusinessCategories", "Lai/kudi/agent/register/domain/usecases/FetchBusinessCategories;", "editProfile", "Lai/kudi/agent/settings/domain/useCases/EditProfile;", "(Lai/kudi/agent/register/navigators/RegisterNavigator;Lai/kudi/agent/register/domain/usecases/FetchLocation;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/users/domain/usecases/UpdateUser;Lai/kudi/agent/register/domain/usecases/FetchBusinessCategories;Lai/kudi/agent/settings/domain/useCases/EditProfile;)V", "phoneNumber", "", "getPhoneNumber", "()Ljava/lang/String;", "setPhoneNumber", "(Ljava/lang/String;)V", "", "businessAddress", "businessName", "lga", "stateLocation", "primaryBusiness", "area", "regData", "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "isFrom", "dashboardData", "Lai/kudi/agent/login/setup/DashboardData;", "fetchBusinessCategory", "initialData", "inputParamsValid", "", "businessEmailAddress", OpsMetricTracker.START, "submitInfo", "updateUserCache", "user1", "Lai/kudi/agent/users/domain/dto/User;", "editProfileResponse", "Lai/kudi/agent/settings/domain/dto/EditProfileResponse;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.ui.viewmodels.BusinessInfoViewModel */
/* loaded from: classes.dex */
public final class BusinessInfoViewModel extends BaseViewModel<BusinessInfoViewData> {
    private final Analytics analytics;
    private final EditProfile editProfile;
    private final FetchBusinessCategories fetchBusinessCategories;
    private final FetchCurrentUser fetchCurrentUser;
    private final FetchLocation fetchLocation;
    private final RegisterNavigator navigator;
    private String phoneNumber;
    private final UpdateUser updateUser;

    public BusinessInfoViewModel(RegisterNavigator registerNavigator, FetchLocation fetchLocation, Analytics analytics, FetchCurrentUser fetchCurrentUser, UpdateUser updateUser, FetchBusinessCategories fetchBusinessCategories, EditProfile editProfile) {
        Log_OC.getArray(registerNavigator, "navigator");
        Log_OC.getArray(fetchLocation, "fetchLocation");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(updateUser, "updateUser");
        Log_OC.getArray(fetchBusinessCategories, "fetchBusinessCategories");
        Log_OC.getArray(editProfile, "editProfile");
        this.navigator = registerNavigator;
        this.fetchLocation = fetchLocation;
        this.analytics = analytics;
        this.fetchCurrentUser = fetchCurrentUser;
        this.updateUser = updateUser;
        this.fetchBusinessCategories = fetchBusinessCategories;
        this.editProfile = editProfile;
        this.phoneNumber = "";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void editProfile$default(BusinessInfoViewModel businessInfoViewModel, String str, String str2, String str3, String str4, String str5, String str6, RegistrationInfo registrationInfo, String str7, DashboardData $r9, int i, Object obj) {
        int $i0 = i & 256;
        if ($i0 != 0) {
            $r9 = null;
        }
        businessInfoViewModel.editProfile(str, str2, str3, str4, str5, str6, registrationInfo, str7, $r9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: editProfile$lambda-5  reason: not valid java name */
    public static final InterfaceC11692s m40391editProfile$lambda5(C11812w c11812w, BusinessInfoViewModel businessInfoViewModel, String str, String str2, RegistrationInfo registrationInfo, String str3, String str4, String str5, String str6, User user) {
        Log_OC.getArray(c11812w, "$user1");
        Log_OC.getArray(businessInfoViewModel, "this$0");
        Log_OC.getArray(str, "$businessAddress");
        Log_OC.getArray(str2, "$businessName");
        Log_OC.getArray(registrationInfo, "$regData");
        Log_OC.getArray(str3, "$lga");
        Log_OC.getArray(str4, "$stateLocation");
        Log_OC.getArray(str5, "$primaryBusiness");
        Log_OC.getArray(str6, "$area");
        Log_OC.getArray(user, "user");
        c11812w.f26499c = user;
        EditProfile $r10 = businessInfoViewModel.editProfile;
        String $r11 = user.getSessionId();
        Log_OC.loadImage($r11, "user.sessionId");
        PersonalInfo $r13 = registrationInfo.getPersonalInfo();
        String $r14 = $r13.getDob();
        if ($r14 == null) {
            $r14 = "";
        }
        String $r15 = user.getEmail();
        String $r16 = $r15;
        if ($r15 == null) {
            $r16 = "";
        }
        EditProfileRequest $r12 = new EditProfileRequest(str, str2, $r14, $r16, str3, str4, str5, str6, null, null, null, false, 3840, null);
        AbstractC11688p $r17 = $r10.execute($r11, $r12);
        return $r17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: editProfile$lambda-6  reason: not valid java name */
    public static final void m40392editProfile$lambda6(BusinessInfoViewModel businessInfoViewModel, C11812w c11812w, String str, DashboardData dashboardData, EditProfileResponse editProfileResponse) {
        Log_OC.getArray(businessInfoViewModel, "this$0");
        Log_OC.getArray(c11812w, "$user1");
        Log_OC.getArray(str, "$isFrom");
        Object $r5 = c11812w.f26499c;
        User $r6 = (User) $r5;
        Log_OC.loadImage(editProfileResponse, "it");
        businessInfoViewModel.updateUserCache($r6, str, dashboardData, editProfileResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: editProfile$lambda-7  reason: not valid java name */
    public static final void m40393editProfile$lambda7(BusinessInfoViewModel businessInfoViewModel, Throwable th) {
        Log_OC.getArray(businessInfoViewModel, "this$0");
        Analytics $r2 = businessInfoViewModel.analytics;
        String $r3 = businessInfoViewModel.getPhoneNumber();
        USERTYPES $r4 = USERTYPES.EXISTING;
        String $r5 = $r4.name();
        String $r6 = th.getMessage();
        $r2.outletDetailsSubmitted($r3, true, $r5, $r6);
        ViewData $r7 = businessInfoViewModel.getState();
        InterfaceC11767l $r10 = KudiErrorParserKt.parseHttpError2$default("Something went wrong, please try again", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r11 = $r10.invoke(th);
        String $r32 = (String) $r11;
        BusinessInfoViewData.Error $r9 = new BusinessInfoViewData.Error(null, null, null, null, null, null, null, null, $r32, null, null, 1791, null);
        BusinessInfoViewData $r8 = BusinessInfoViewData.copy$default((BusinessInfoViewData) $r7, false, false, false, null, null, null, null, $r9, 126, null);
        businessInfoViewModel.publish($r8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0029 */
    /* renamed from: fetchBusinessCategory$lambda-3  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m40394fetchBusinessCategory$lambda3(ai.kudi.agent.register.p021ui.viewmodels.BusinessInfoViewModel r31, java.util.List r32) {
        /*
            java.lang.String r11 = "this$0"
            r0 = r31
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r11)
            r0 = r31
            ai.kudi.agent.core.mvvm.ViewData r12 = r0.getState()
            r14 = r12
            ai.kudi.agent.register.ui.viewmodels.data.BusinessInfoViewData r14 = (ai.kudi.agent.register.p021ui.viewmodels.data.BusinessInfoViewData) r14
            r13 = r14
            java.lang.String r11 = "it"
            r0 = r32
            kotlin.p483e0.p485d.Log_OC.loadImage(r0, r11)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r0 = r32
            java.util.Iterator r16 = r0.iterator()
        L23:
            r0 = r16
            boolean r17 = r0.hasNext()
            if (r17 == 0) goto L56
            r0 = r16
            java.lang.Object r18 = r0.next()
            r20 = r18
            ai.kudi.agent.register.domain.wiki.BusinessCategoryData r20 = (ai.kudi.agent.register.domain.wiki.BusinessCategoryData) r20
            r19 = r20
            r0 = r19
            java.lang.String r21 = r0.getName()
            java.lang.String r11 = "Agency Banking"
            r0 = r21
            boolean r17 = kotlin.p483e0.p485d.Log_OC.append(r0, r11)
            r22 = 1
            r0 = r17
            r1 = r22
            r0 = r0 ^ r1
            r17 = r0
            if (r17 == 0) goto L23
            r0 = r18
            r15.add(r0)
            goto L23
        L56:
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 189(0xbd, float:2.65E-43)
            r30 = 0
            r0 = r13
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r27
            r7 = r15
            r8 = r28
            r9 = r29
            r10 = r30
            ai.kudi.agent.register.ui.viewmodels.data.BusinessInfoViewData r13 = ai.kudi.agent.register.p021ui.viewmodels.data.BusinessInfoViewData.copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = r31
            r0.publish(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.register.p021ui.viewmodels.BusinessInfoViewModel.m40394fetchBusinessCategory$lambda3(ai.kudi.agent.register.ui.viewmodels.BusinessInfoViewModel, java.util.List):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchBusinessCategory$lambda-4  reason: not valid java name */
    public static final void m40395fetchBusinessCategory$lambda4(BusinessInfoViewModel businessInfoViewModel, Throwable th) {
        Log_OC.getArray(businessInfoViewModel, "this$0");
        ViewData $r2 = businessInfoViewModel.getState();
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default("Error loading business Categories", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        BusinessInfoViewData.Error $r4 = new BusinessInfoViewData.Error(null, null, null, null, null, null, null, null, (String) $r6, null, null, 1791, null);
        BusinessInfoViewData $r3 = BusinessInfoViewData.copy$default((BusinessInfoViewData) $r2, false, false, false, null, null, null, null, $r4, 125, null);
        businessInfoViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchLocation$lambda-11  reason: not valid java name */
    public static final void m40396fetchLocation$lambda11(BusinessInfoViewModel businessInfoViewModel, List list) {
        Log_OC.getArray(businessInfoViewModel, "this$0");
        ViewData $r2 = businessInfoViewModel.getState();
        BusinessInfoViewData $r3 = (BusinessInfoViewData) $r2;
        businessInfoViewModel.publish(BusinessInfoViewData.copy$default($r3, false, false, false, null, null, list, null, null, AccountAndSettingsOptionsFragment.UPDATE_APP_REQUEST_CODE, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchLocation$lambda-12  reason: not valid java name */
    public static final void m40397fetchLocation$lambda12(BusinessInfoViewModel businessInfoViewModel, Throwable th) {
        Log_OC.getArray(businessInfoViewModel, "this$0");
        th.printStackTrace();
        ViewData $r2 = businessInfoViewModel.getState();
        BusinessInfoViewData $r3 = (BusinessInfoViewData) $r2;
        businessInfoViewModel.publish(BusinessInfoViewData.copy$default($r3, false, false, false, null, null, null, null, null, 251, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean inputParamsValid(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean $z0;
        boolean $z02;
        boolean $z03;
        boolean $z04;
        boolean $z05;
        boolean $z06;
        boolean $z07;
        $z0 = C13276s.m5440u(str);
        if ($z0) {
            ViewData $r8 = getState();
            BusinessInfoViewData.Error $r10 = new BusinessInfoViewData.Error("Name is required.", null, null, null, null, null, null, null, null, null, null, 2046, null);
            BusinessInfoViewData $r9 = BusinessInfoViewData.copy$default((BusinessInfoViewData) $r8, false, false, false, null, null, null, null, $r10, 127, null);
            publish($r9);
            return false;
        }
        $z02 = C13276s.m5440u(str2);
        if ($z02) {
            ViewData $r82 = getState();
            BusinessInfoViewData $r92 = (BusinessInfoViewData) $r82;
            BusinessInfoViewData.Error $r102 = new BusinessInfoViewData.Error(null, "Address is required.", null, null, null, null, null, null, null, null, null, 2045, null);
            publish(BusinessInfoViewData.copy$default($r92, false, false, false, null, null, null, null, $r102, 127, null));
            return false;
        }
        $z03 = C13276s.m5440u(str4);
        if ($z03) {
            ViewData $r83 = getState();
            BusinessInfoViewData $r93 = (BusinessInfoViewData) $r83;
            BusinessInfoViewData.Error $r103 = new BusinessInfoViewData.Error(null, null, null, null, null, null, "LGA is required.", null, null, null, null, 1983, null);
            publish(BusinessInfoViewData.copy$default($r93, false, false, false, null, null, null, null, $r103, 127, null));
            return false;
        }
        $z04 = C13276s.m5440u(str3);
        if ($z04) {
            ViewData $r84 = getState();
            BusinessInfoViewData $r94 = (BusinessInfoViewData) $r84;
            BusinessInfoViewData.Error $r104 = new BusinessInfoViewData.Error(null, null, null, null, "State is required", null, null, null, null, null, null, 2031, null);
            publish(BusinessInfoViewData.copy$default($r94, false, false, false, null, null, null, null, $r104, 127, null));
            return false;
        }
        $z05 = C13276s.m5440u(str5);
        if ($z05) {
            ViewData $r85 = getState();
            BusinessInfoViewData $r95 = (BusinessInfoViewData) $r85;
            BusinessInfoViewData.Error $r105 = new BusinessInfoViewData.Error(null, null, null, null, null, null, null, null, null, "Primary business is required", null, 1535, null);
            publish(BusinessInfoViewData.copy$default($r95, false, false, false, null, null, null, null, $r105, 127, null));
            return false;
        }
        $z06 = C13276s.m5440u(str6);
        if ($z06) {
            ViewData $r86 = getState();
            BusinessInfoViewData $r96 = (BusinessInfoViewData) $r86;
            BusinessInfoViewData.Error $r106 = new BusinessInfoViewData.Error(null, null, null, null, null, null, null, null, null, null, "Area is required", 1023, null);
            publish(BusinessInfoViewData.copy$default($r96, false, false, false, null, null, null, null, $r106, 127, null));
            return false;
        }
        $z07 = C13276s.m5440u(str7);
        if ($z07) {
            ViewData $r87 = getState();
            BusinessInfoViewData $r97 = (BusinessInfoViewData) $r87;
            BusinessInfoViewData.Error $r107 = new BusinessInfoViewData.Error(null, null, null, null, null, null, null, null, null, null, "Email address is required", 1023, null);
            publish(BusinessInfoViewData.copy$default($r97, false, false, false, null, null, null, null, $r107, 127, null));
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: start$lambda-0  reason: not valid java name */
    public static final void m40398start$lambda0(BusinessInfoViewModel businessInfoViewModel, User user) {
        Log_OC.getArray(businessInfoViewModel, "this$0");
        String $r2 = user.getPhoneNumber();
        String $r3 = $r2;
        if ($r2 == null) {
            $r3 = "";
        }
        businessInfoViewModel.setPhoneNumber($r3);
        ViewData $r4 = businessInfoViewModel.getState();
        BusinessInfoViewData $r5 = BusinessInfoViewData.copy$default((BusinessInfoViewData) $r4, false, false, false, null, user, null, null, null, 110, null);
        businessInfoViewModel.publish($r5);
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
        Object object = new Object() { // from class: ai.kudi.agent.register.ui.viewmodels.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                BusinessInfoViewModel $r1 = BusinessInfoViewModel.this;
                String $r22 = str;
                DashboardData $r3 = dashboardData;
                User $r55 = (User) obj;
                BusinessInfoViewModel.m40401updateUserCache$lambda9($r1, $r22, $r3, $r55);
            }
        };
        Function $r10 = Function.LEN;
        FavoritesArrayAdapter $r11 = $r8.e0(object, $r10);
        C11280b $r12 = getCompositeDisposable();
        $r12.b($r11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: updateUserCache$lambda-9  reason: not valid java name */
    public static final void m40401updateUserCache$lambda9(BusinessInfoViewModel businessInfoViewModel, String str, DashboardData dashboardData, User user) {
        Log_OC.getArray(businessInfoViewModel, "this$0");
        Log_OC.getArray(str, "$isFrom");
        ViewData $r4 = businessInfoViewModel.getState();
        BusinessInfoViewData $r5 = (BusinessInfoViewData) $r4;
        businessInfoViewModel.publish(BusinessInfoViewData.copy$default($r5, false, false, false, "Your details have been Updated!!", null, null, null, null, 118, null));
        Analytics $r6 = businessInfoViewModel.analytics;
        String $r7 = businessInfoViewModel.getPhoneNumber();
        USERTYPES $r8 = USERTYPES.EXISTING;
        String $r9 = $r8.name();
        OnboardingAnalytics.DefaultImpls.outletDetailsSubmitted$default($r6, $r7, true, $r9, null, 8, null);
        String $r72 = AccountVerificationHolderActivity.class.getCanonicalName();
        boolean $z0 = Log_OC.append(str, $r72);
        if (!$z0) {
            RegisterNavigator $r11 = businessInfoViewModel.navigator;
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
            RegisterNavigator $r112 = businessInfoViewModel.navigator;
            Log_OC.loadImage($r3, "customerType");
            $r112.navigateToDashboard($d0, $z02, $z4, $z1, $z2, $z3, $r3);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void editProfile(final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final RegistrationInfo registrationInfo, final String str7, final DashboardData dashboardData) {
        Log_OC.getArray(str, "businessAddress");
        Log_OC.getArray(str2, "businessName");
        Log_OC.getArray(str3, "lga");
        Log_OC.getArray(str4, "stateLocation");
        Log_OC.getArray(str5, "primaryBusiness");
        Log_OC.getArray(str6, "area");
        Log_OC.getArray(registrationInfo, "regData");
        Log_OC.getArray(str7, "isFrom");
        ViewData $r10 = getState();
        BusinessInfoViewData $r11 = (BusinessInfoViewData) $r10;
        publish(BusinessInfoViewData.copy$default($r11, true, false, false, null, null, null, null, null, 126, null));
        final C11812w $r12 = new C11812w();
        FetchCurrentUser $r13 = this.fetchCurrentUser;
        AbstractC11696w $r14 = FetchCurrentUser.execute$default($r13, null, null, 3, null);
        AbstractC11688p $r16 = $r14.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.register.ui.viewmodels.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                C11812w $r1 = C11812w.this;
                BusinessInfoViewModel $r2 = this;
                String $r3 = str;
                String $r4 = str2;
                RegistrationInfo $r5 = registrationInfo;
                String $r6 = str3;
                String $r7 = str4;
                String $r8 = str5;
                String $r9 = str6;
                User $r122 = (User) obj;
                InterfaceC11692s $r102 = BusinessInfoViewModel.m40391editProfile$lambda5($r1, $r2, $r3, $r4, $r5, $r6, $r7, $r8, $r9, $r122);
                return $r102;
            }
        });
        FavoritesArrayAdapter $r19 = $r16.e0(new Object() { // from class: ai.kudi.agent.register.ui.viewmodels.DynamicTableModel$a
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                BusinessInfoViewModel $r1 = BusinessInfoViewModel.this;
                C11812w $r2 = $r12;
                String $r3 = str7;
                DashboardData $r4 = dashboardData;
                EditProfileResponse $r6 = (EditProfileResponse) obj;
                BusinessInfoViewModel.m40392editProfile$lambda6($r1, $r2, $r3, $r4, $r6);
            }
        }, new Object() { // from class: ai.kudi.agent.register.ui.viewmodels.MessageTypeFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                BusinessInfoViewModel $r1 = BusinessInfoViewModel.this;
                Throwable $r3 = (Throwable) obj;
                BusinessInfoViewModel.m40393editProfile$lambda7($r1, $r3);
            }
        });
        Log_OC.loadImage($r19, "fetchCurrentUser.execute().flatMapObservable { user ->\n            user1 = user\n            editProfile.execute(\n                user.sessionId,\n                editProfileRequest = EditProfileRequest(\n                    businessAddress = businessAddress,\n                    businessName = businessName,\n                    dob = regData.personalInfo.dob ?: \"\",\n                    email = user.email ?: \"\",\n                    lga = lga,\n                    state = stateLocation,\n                    primaryBusinessCategory = primaryBusiness,\n                    businessAddressArea = area\n                )\n            )\n        }.subscribe(\n            {\n                updateUserCache(user1, isFrom, dashboardData, it)\n            },\n            {\n                analytics.outletDetailsSubmitted(\n                    phoneNumber, true, USERTYPES.EXISTING.name,\n                    errorMessage = it.message\n                )\n                publish(\n                    state.copy(\n                        isLoading = false,\n                        error = Error(\n                            genericError = parseHttpError2(\"Something went wrong, please try again\")(\n                                it\n                            )\n                        )\n                    )\n                )\n            }\n        )");
        C11280b $r20 = getCompositeDisposable();
        RxExtKt.addTo($r19, $r20);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchBusinessCategory() {
        ViewData $r1 = getState();
        BusinessInfoViewData $r2 = (BusinessInfoViewData) $r1;
        publish(BusinessInfoViewData.copy$default($r2, false, true, false, null, null, null, null, null, 125, null));
        FetchBusinessCategories $r3 = this.fetchBusinessCategories;
        AbstractC11688p $r4 = $r3.execute();
        FavoritesArrayAdapter $r7 = $r4.e0(new Object() { // from class: ai.kudi.agent.register.ui.viewmodels.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                BusinessInfoViewModel $r12 = BusinessInfoViewModel.this;
                List $r32 = (List) obj;
                BusinessInfoViewModel.m40394fetchBusinessCategory$lambda3($r12, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.register.ui.viewmodels.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                BusinessInfoViewModel $r12 = BusinessInfoViewModel.this;
                Throwable $r32 = (Throwable) obj;
                BusinessInfoViewModel.m40395fetchBusinessCategory$lambda4($r12, $r32);
            }
        });
        C11280b $r8 = getCompositeDisposable();
        $r8.b($r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchLocation() {
        ViewData $r1 = getState();
        BusinessInfoViewData $r2 = (BusinessInfoViewData) $r1;
        publish(BusinessInfoViewData.copy$default($r2, false, false, true, null, null, null, null, null, 251, null));
        FetchLocation $r3 = this.fetchLocation;
        AbstractC11688p $r4 = $r3.execute();
        FavoritesArrayAdapter $r7 = $r4.e0(new Object() { // from class: ai.kudi.agent.register.ui.viewmodels.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                BusinessInfoViewModel $r12 = BusinessInfoViewModel.this;
                List $r32 = (List) obj;
                BusinessInfoViewModel.m40396fetchLocation$lambda11($r12, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.register.ui.viewmodels.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                BusinessInfoViewModel $r12 = BusinessInfoViewModel.this;
                Throwable $r32 = (Throwable) obj;
                BusinessInfoViewModel.m40397fetchLocation$lambda12($r12, $r32);
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
        BusinessInfoViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public BusinessInfoViewData initialData() {
        BusinessInfoViewData $r1 = new BusinessInfoViewData(false, false, false, null, null, null, null, null, 255, null);
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
        Object object = new Object() { // from class: ai.kudi.agent.register.ui.viewmodels.FileFilterUtil$3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                BusinessInfoViewModel $r12 = BusinessInfoViewModel.this;
                User $r3 = (User) obj;
                BusinessInfoViewModel.m40398start$lambda0($r12, $r3);
            }
        };
        Token $r4 = Token.EMPTY;
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
        String $r3 = $r2.getBusinessName();
        if ($r3 == null) {
            $r3 = "";
        }
        String $r4 = $r2.getBusinessAddress();
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
        String $r7 = $r2.getPrimaryBusinessCategory();
        if ($r7 == null) {
            $r7 = "";
        }
        String $r8 = $r2.getBusinessAddressArea();
        if ($r8 == null) {
            $r8 = "";
        }
        String $r9 = $r2.getEmail();
        if ($r9 == null) {
            $r9 = "";
        }
        boolean $z0 = inputParamsValid($r3, $r4, $r5, $r6, $r7, $r8, $r9);
        if ($z0) {
            Analytics $r10 = this.analytics;
            String $r32 = $r2.getPhoneNumber();
            Log_OC.append($r32);
            USERTYPES $r11 = USERTYPES.isMethod;
            OnboardingAnalytics.DefaultImpls.outletDetailsSubmitted$default($r10, $r32, true, $r11.name(), null, 8, null);
            AccountType $r12 = registrationInfo.getAccountType();
            AccountType $r13 = AccountType.MERCHANT;
            if ($r12 == $r13) {
                RegisterNavigator $r14 = this.navigator;
                $r14.toMerchantTandC(registrationInfo);
                return;
            }
            RegisterNavigator $r142 = this.navigator;
            $r142.toCreatePinView(registrationInfo);
        }
    }
}

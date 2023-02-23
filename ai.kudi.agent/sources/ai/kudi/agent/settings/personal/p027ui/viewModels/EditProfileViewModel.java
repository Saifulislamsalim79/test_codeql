package ai.kudi.agent.settings.personal.p027ui.viewModels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.domain.room_entities.UserProfile;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.register.domain.usecases.FetchLocation;
import ai.kudi.agent.register.domain.wiki.AccountType;
import ai.kudi.agent.settings.domain.package_4.EditProfileRequest;
import ai.kudi.agent.settings.domain.package_4.EditProfileResponse;
import ai.kudi.agent.settings.domain.useCases.EditProfile;
import ai.kudi.agent.settings.navigators.SettingsNavigator;
import ai.kudi.agent.settings.personal.p027ui.viewModels.data.EditProfileViewData;
import ai.kudi.agent.users.data.repositories.mapper.UserToUserModelMapper;
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
/* compiled from: EditProfileViewModel.kt */
@Metadata(m10422d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ.\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012J.\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012J\u0006\u0010\t\u001a\u00020\u0010J\b\u0010\u001a\u001a\u00020\u0002H\u0016J0\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002J0\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002J\u000e\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020\u0010J\u001a\u0010\"\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010 2\u0006\u0010$\u001a\u00020%H\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m10421d2 = {"Lai/kudi/agent/settings/personal/ui/viewModels/EditProfileViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/settings/personal/ui/viewModels/data/EditProfileViewData;", "editProfile", "Lai/kudi/agent/settings/domain/useCases/EditProfile;", "updateUser", "Lai/kudi/agent/users/domain/usecases/UpdateUser;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "fetchLocation", "Lai/kudi/agent/register/domain/usecases/FetchLocation;", "settingsNavigator", "Lai/kudi/agent/settings/navigators/SettingsNavigator;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/settings/domain/useCases/EditProfile;Lai/kudi/agent/users/domain/usecases/UpdateUser;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/register/domain/usecases/FetchLocation;Lai/kudi/agent/settings/navigators/SettingsNavigator;Lai/kudi/agent/core/analytics/Analytics;)V", "", "businessAddress", "", "businessName", "email", "lga", "stateLocation", "editUserProfile", "residentialAddress", "closestLandmark", "initialData", "isInputParamsValid", "", "isUserInputParamsValid", "navigateToVerifiedInfo", "user", "Lai/kudi/agent/users/domain/dto/User;", OpsMetricTracker.START, "updateProfileLocally", "user1", "editProfileRequest", "Lai/kudi/agent/settings/domain/dto/EditProfileRequest;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.personal.ui.viewModels.EditProfileViewModel */
/* loaded from: classes.dex */
public final class EditProfileViewModel extends BaseViewModel<EditProfileViewData> {
    private final Analytics analytics;
    private final EditProfile editProfile;
    private final FetchCurrentUser fetchCurrentUser;
    private final FetchLocation fetchLocation;
    private final SettingsNavigator settingsNavigator;
    private final UpdateUser updateUser;

    public EditProfileViewModel(EditProfile editProfile, UpdateUser updateUser, FetchCurrentUser fetchCurrentUser, FetchLocation fetchLocation, SettingsNavigator settingsNavigator, Analytics analytics) {
        Log_OC.getArray(editProfile, "editProfile");
        Log_OC.getArray(updateUser, "updateUser");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(fetchLocation, "fetchLocation");
        Log_OC.getArray(settingsNavigator, "settingsNavigator");
        Log_OC.getArray(analytics, "analytics");
        this.editProfile = editProfile;
        this.updateUser = updateUser;
        this.fetchCurrentUser = fetchCurrentUser;
        this.fetchLocation = fetchLocation;
        this.settingsNavigator = settingsNavigator;
        this.analytics = analytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: editProfile$lambda-2  reason: not valid java name */
    public static final InterfaceC11692s m40833editProfile$lambda2(C11812w c11812w, EditProfileRequest editProfileRequest, EditProfileViewModel editProfileViewModel, User user) {
        Log_OC.getArray(c11812w, "$user1");
        Log_OC.getArray(editProfileRequest, "$request");
        Log_OC.getArray(editProfileViewModel, "this$0");
        Log_OC.getArray(user, "user");
        c11812w.f26499c = user;
        String $r4 = user.secret;
        editProfileRequest.setDob($r4);
        String $r42 = user.keywords;
        editProfileRequest.setBvn($r42);
        String $r43 = user.customerType;
        AccountType $r5 = AccountType.MERCHANT_AGENT;
        String $r6 = $r5.name();
        boolean $z0 = Log_OC.append($r43, $r6);
        editProfileRequest.setAgentBankingSelected($z0);
        EditProfile $r7 = editProfileViewModel.editProfile;
        String $r44 = user.getSessionId();
        Log_OC.loadImage($r44, "user.sessionId");
        AbstractC11688p $r8 = $r7.execute($r44, editProfileRequest);
        return $r8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: editProfile$lambda-3  reason: not valid java name */
    public static final void m40834editProfile$lambda3(EditProfileViewModel editProfileViewModel, C11812w c11812w, EditProfileRequest editProfileRequest, EditProfileResponse editProfileResponse) {
        Log_OC.getArray(editProfileViewModel, "this$0");
        Log_OC.getArray(c11812w, "$user1");
        Log_OC.getArray(editProfileRequest, "$request");
        Object $r4 = c11812w.f26499c;
        User $r5 = (User) $r4;
        editProfileViewModel.updateProfileLocally($r5, editProfileRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: editProfile$lambda-4  reason: not valid java name */
    public static final void m40835editProfile$lambda4(EditProfileViewModel editProfileViewModel, Throwable th) {
        Log_OC.getArray(editProfileViewModel, "this$0");
        ViewData $r2 = editProfileViewModel.getState();
        EditProfileViewData $r3 = (EditProfileViewData) $r2;
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default("Something went wrong, please try again", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        EditProfileViewData.Error $r4 = new EditProfileViewData.Error((String) $r6, null, null, null, null, null, null, null, null, 510, null);
        editProfileViewModel.publish(EditProfileViewData.copy$default($r3, false, false, null, null, null, $r4, 30, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: editUserProfile$lambda-5  reason: not valid java name */
    public static final InterfaceC11692s m40836editUserProfile$lambda5(EditProfileRequest editProfileRequest, C11812w c11812w, EditProfileViewModel editProfileViewModel, User user) {
        Log_OC.getArray(editProfileRequest, "$request");
        Log_OC.getArray(c11812w, "$user1");
        Log_OC.getArray(editProfileViewModel, "this$0");
        Log_OC.getArray(user, "user");
        String $r4 = user.secret;
        editProfileRequest.setDob($r4);
        String $r42 = user.keywords;
        editProfileRequest.setBvn($r42);
        c11812w.f26499c = user;
        EditProfile $r5 = editProfileViewModel.editProfile;
        String $r43 = user.getSessionId();
        Log_OC.loadImage($r43, "user.sessionId");
        AbstractC11688p $r6 = $r5.execute($r43, editProfileRequest);
        return $r6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: editUserProfile$lambda-6  reason: not valid java name */
    public static final void m40837editUserProfile$lambda6(EditProfileViewModel editProfileViewModel, C11812w c11812w, EditProfileRequest editProfileRequest, EditProfileResponse editProfileResponse) {
        Log_OC.getArray(editProfileViewModel, "this$0");
        Log_OC.getArray(c11812w, "$user1");
        Log_OC.getArray(editProfileRequest, "$request");
        Object $r4 = c11812w.f26499c;
        User $r5 = (User) $r4;
        editProfileViewModel.updateProfileLocally($r5, editProfileRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: editUserProfile$lambda-7  reason: not valid java name */
    public static final void m40838editUserProfile$lambda7(EditProfileViewModel editProfileViewModel, Throwable th) {
        Log_OC.getArray(editProfileViewModel, "this$0");
        ViewData $r2 = editProfileViewModel.getState();
        EditProfileViewData $r3 = (EditProfileViewData) $r2;
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default("Something went wrong, please try again", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        EditProfileViewData.Error $r4 = new EditProfileViewData.Error((String) $r6, null, null, null, null, null, null, null, null, 510, null);
        editProfileViewModel.publish(EditProfileViewData.copy$default($r3, false, false, null, null, null, $r4, 30, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchLocation$lambda-10  reason: not valid java name */
    public static final void m40839fetchLocation$lambda10(EditProfileViewModel editProfileViewModel, List list) {
        Log_OC.getArray(editProfileViewModel, "this$0");
        ViewData $r2 = editProfileViewModel.getState();
        EditProfileViewData $r3 = (EditProfileViewData) $r2;
        editProfileViewModel.publish(EditProfileViewData.copy$default($r3, false, false, list, null, null, null, 57, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchLocation$lambda-11  reason: not valid java name */
    public static final void m40840fetchLocation$lambda11(EditProfileViewModel editProfileViewModel, Throwable th) {
        Log_OC.getArray(editProfileViewModel, "this$0");
        th.printStackTrace();
        ViewData $r2 = editProfileViewModel.getState();
        EditProfileViewData $r3 = (EditProfileViewData) $r2;
        editProfileViewModel.publish(EditProfileViewData.copy$default($r3, false, false, null, null, null, null, 61, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isInputParamsValid(String str, String str2, String str3, String str4, String str5) {
        boolean $z0;
        boolean $z02;
        boolean $z03;
        boolean $z04;
        boolean $z05;
        $z0 = C13276s.m5440u(str2);
        if ($z0) {
            ViewData $r6 = getState();
            EditProfileViewData $r7 = (EditProfileViewData) $r6;
            EditProfileViewData.Error $r8 = new EditProfileViewData.Error(null, null, "Business Address cannot be blank", null, null, null, null, null, null, 507, null);
            publish(EditProfileViewData.copy$default($r7, false, false, null, null, null, $r8, 31, null));
            return false;
        }
        $z02 = C13276s.m5440u(str);
        if ($z02) {
            ViewData $r62 = getState();
            EditProfileViewData $r72 = (EditProfileViewData) $r62;
            EditProfileViewData.Error $r82 = new EditProfileViewData.Error(null, null, null, "Business Name cannot be blank", null, null, null, null, null, 503, null);
            publish(EditProfileViewData.copy$default($r72, false, false, null, null, null, $r82, 31, null));
            return false;
        }
        $z03 = C13276s.m5440u(str3);
        if ($z03) {
            ViewData $r63 = getState();
            EditProfileViewData $r73 = (EditProfileViewData) $r63;
            EditProfileViewData.Error $r83 = new EditProfileViewData.Error(null, null, null, null, null, null, "State cannot be blank", null, null, 447, null);
            publish(EditProfileViewData.copy$default($r73, false, false, null, null, null, $r83, 31, null));
            return false;
        }
        $z04 = C13276s.m5440u(str4);
        if ($z04) {
            ViewData $r64 = getState();
            EditProfileViewData $r74 = (EditProfileViewData) $r64;
            EditProfileViewData.Error $r84 = new EditProfileViewData.Error(null, null, null, null, null, null, null, "LGA cannot be blank", null, 383, null);
            publish(EditProfileViewData.copy$default($r74, false, false, null, null, null, $r84, 31, null));
            return false;
        }
        $z05 = C13276s.m5440u(str5);
        if (!$z05) {
            boolean $z06 = StringExtKt.isValidEmail(str5);
            if ($z06) {
                return true;
            }
        }
        ViewData $r65 = getState();
        EditProfileViewData $r75 = (EditProfileViewData) $r65;
        EditProfileViewData.Error $r85 = new EditProfileViewData.Error(null, null, null, null, null, null, null, null, "Enter a valid email address", 255, null);
        publish(EditProfileViewData.copy$default($r75, false, false, null, null, null, $r85, 31, null));
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isUserInputParamsValid(String str, String str2, String str3, String str4, String str5) {
        boolean $z0;
        boolean $z02;
        boolean $z03;
        boolean $z04;
        boolean $z05;
        $z0 = C13276s.m5440u(str);
        if ($z0) {
            ViewData $r6 = getState();
            EditProfileViewData $r7 = (EditProfileViewData) $r6;
            EditProfileViewData.Error $r8 = new EditProfileViewData.Error(null, null, null, null, "Residential Address cannot be blank", null, null, null, null, 495, null);
            publish(EditProfileViewData.copy$default($r7, false, false, null, null, null, $r8, 31, null));
            return false;
        }
        $z02 = C13276s.m5440u(str2);
        if ($z02) {
            ViewData $r62 = getState();
            EditProfileViewData $r72 = (EditProfileViewData) $r62;
            EditProfileViewData.Error $r82 = new EditProfileViewData.Error(null, null, null, null, null, "Closest Landmark cannot be blank", null, null, null, 479, null);
            publish(EditProfileViewData.copy$default($r72, false, false, null, null, null, $r82, 31, null));
            return false;
        }
        $z03 = C13276s.m5440u(str3);
        if ($z03) {
            ViewData $r63 = getState();
            EditProfileViewData $r73 = (EditProfileViewData) $r63;
            EditProfileViewData.Error $r83 = new EditProfileViewData.Error(null, null, null, null, null, null, "State cannot be blank", null, null, 447, null);
            publish(EditProfileViewData.copy$default($r73, false, false, null, null, null, $r83, 31, null));
            return false;
        }
        $z04 = C13276s.m5440u(str4);
        if ($z04) {
            ViewData $r64 = getState();
            EditProfileViewData $r74 = (EditProfileViewData) $r64;
            EditProfileViewData.Error $r84 = new EditProfileViewData.Error(null, null, null, null, null, null, null, "LGA cannot be blank", null, 383, null);
            publish(EditProfileViewData.copy$default($r74, false, false, null, null, null, $r84, 31, null));
            return false;
        }
        $z05 = C13276s.m5440u(str5);
        if (!$z05) {
            boolean $z06 = StringExtKt.isValidEmail(str5);
            if ($z06) {
                return true;
            }
        }
        ViewData $r65 = getState();
        EditProfileViewData $r75 = (EditProfileViewData) $r65;
        EditProfileViewData.Error $r85 = new EditProfileViewData.Error(null, null, null, null, null, null, null, null, "Enter a valid email address", 255, null);
        publish(EditProfileViewData.copy$default($r75, false, false, null, null, null, $r85, 31, null));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: start$lambda-0  reason: not valid java name */
    public static final void m40841start$lambda0(EditProfileViewModel editProfileViewModel, User user) {
        Log_OC.getArray(editProfileViewModel, "this$0");
        ViewData $r2 = editProfileViewModel.getState();
        EditProfileViewData $r3 = (EditProfileViewData) $r2;
        editProfileViewModel.publish(EditProfileViewData.copy$default($r3, false, false, null, null, user, null, 47, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: start$lambda-1  reason: not valid java name */
    public static final void m40842start$lambda1(Throwable th) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void updateProfileLocally(User user, final EditProfileRequest editProfileRequest) {
        Log_OC.append(user);
        User.Builder $r3 = user.toBuilder();
        String $r4 = editProfileRequest.getBusinessName();
        User.Builder $r32 = $r3.setBusinessName($r4);
        String $r42 = editProfileRequest.getHomeAddress();
        User.Builder $r33 = $r32.setHomeAddress($r42);
        String $r43 = editProfileRequest.getClosestLandmark();
        User.Builder $r34 = $r33.setClosestLandmark($r43);
        String $r44 = editProfileRequest.getBusinessAddress();
        User.Builder $r35 = $r34.setBusinessAddress($r44);
        String $r45 = editProfileRequest.getState();
        User.Builder $r36 = $r35.setState($r45);
        String $r46 = editProfileRequest.getLga();
        User $r1 = $r36.setLga($r46).build();
        UpdateUser $r5 = this.updateUser;
        Log_OC.loadImage($r1, MetricTracker.Object.INPUT);
        AbstractC11688p $r6 = $r5.execute($r1);
        Object object = new Object() { // from class: ai.kudi.agent.settings.personal.ui.viewModels.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                EditProfileViewModel $r12 = EditProfileViewModel.this;
                EditProfileRequest $r2 = editProfileRequest;
                User $r47 = (User) obj;
                EditProfileViewModel.m40843updateProfileLocally$lambda8($r12, $r2, $r47);
            }
        };
        Subscription $r8 = Subscription.none;
        FavoritesArrayAdapter $r9 = $r6.e0(object, $r8);
        C11280b $r10 = getCompositeDisposable();
        $r10.b($r9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: updateProfileLocally$lambda-8  reason: not valid java name */
    public static final void m40843updateProfileLocally$lambda8(EditProfileViewModel editProfileViewModel, EditProfileRequest editProfileRequest, User user) {
        Log_OC.getArray(editProfileViewModel, "this$0");
        Log_OC.getArray(editProfileRequest, "$editProfileRequest");
        Analytics $r3 = editProfileViewModel.analytics;
        String $r4 = editProfileRequest.getBvn();
        String $r5 = $r4;
        if ($r4 == null) {
            $r5 = "";
        }
        String $r6 = editProfileRequest.getBusinessName();
        String $r42 = $r6;
        if ($r6 == null) {
            $r42 = "";
        }
        String $r7 = editProfileRequest.getBusinessAddress();
        String $r62 = $r7;
        if ($r7 == null) {
            $r62 = "";
        }
        String $r8 = editProfileRequest.getState();
        String $r72 = $r8;
        if ($r8 == null) {
            $r72 = "";
        }
        String $r9 = editProfileRequest.getLga();
        String $r82 = $r9;
        if ($r9 == null) {
            $r82 = "";
        }
        String $r10 = editProfileRequest.getEmail();
        String $r92 = $r10;
        if ($r10 == null) {
            $r92 = "";
        }
        String $r11 = editProfileRequest.getDob();
        String $r102 = $r11;
        if ($r11 == null) {
            $r102 = "";
        }
        String $r12 = editProfileRequest.getHomeAddress();
        String $r112 = $r12;
        if ($r12 == null) {
            $r112 = "";
        }
        String $r122 = editProfileRequest.getClosestLandmark();
        if ($r122 == null) {
            $r122 = "";
        }
        $r3.onEditButtonClick($r5, $r42, $r62, $r72, $r82, $r92, $r102, $r112, $r122);
        ViewData $r13 = editProfileViewModel.getState();
        EditProfileViewData $r14 = (EditProfileViewData) $r13;
        editProfileViewModel.publish(EditProfileViewData.copy$default($r14, false, false, null, "Your details have been Updated!!", null, null, 22, null));
        SettingsNavigator $r15 = editProfileViewModel.settingsNavigator;
        $r15.finishFragment();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void editProfile(String str, String str2, String str3, String str4, String str5) {
        Log_OC.getArray(str, "businessAddress");
        Log_OC.getArray(str2, "businessName");
        Log_OC.getArray(str3, "email");
        Log_OC.getArray(str4, "lga");
        Log_OC.getArray(str5, "stateLocation");
        boolean $z0 = isInputParamsValid(str2, str, str5, str4, str3);
        if ($z0) {
            ViewData $r6 = getState();
            EditProfileViewData $r7 = EditProfileViewData.copy$default((EditProfileViewData) $r6, true, false, null, null, null, null, 30, null);
            publish($r7);
            final EditProfileRequest $r8 = new EditProfileRequest(str, str2, null, str3, str4, str5, null, null, null, null, null, false, 4036, null);
            final C11812w $r9 = new C11812w();
            FetchCurrentUser $r10 = this.fetchCurrentUser;
            AbstractC11696w $r11 = FetchCurrentUser.execute$default($r10, null, null, 3, null);
            AbstractC11688p $r13 = $r11.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.settings.personal.ui.viewModels.d
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.InterfaceC11291f
                /* renamed from: a */
                public final Object mo10663a(Object obj) {
                    C11812w $r1 = C11812w.this;
                    EditProfileRequest $r2 = $r8;
                    EditProfileViewModel $r3 = this;
                    User $r62 = (User) obj;
                    InterfaceC11692s $r4 = EditProfileViewModel.m40833editProfile$lambda2($r1, $r2, $r3, $r62);
                    return $r4;
                }
            });
            FavoritesArrayAdapter $r16 = $r13.e0(new Object() { // from class: ai.kudi.agent.settings.personal.ui.viewModels.a
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    EditProfileViewModel $r1 = EditProfileViewModel.this;
                    C11812w $r2 = $r9;
                    EditProfileRequest $r3 = $r8;
                    EditProfileResponse $r5 = (EditProfileResponse) obj;
                    EditProfileViewModel.m40834editProfile$lambda3($r1, $r2, $r3, $r5);
                }
            }, new Object() { // from class: ai.kudi.agent.settings.personal.ui.viewModels.ReplaySubject$UnboundedReplayState
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    EditProfileViewModel $r1 = EditProfileViewModel.this;
                    Throwable $r3 = (Throwable) obj;
                    EditProfileViewModel.m40835editProfile$lambda4($r1, $r3);
                }
            });
            C11280b $r17 = getCompositeDisposable();
            $r17.b($r16);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void editUserProfile(String str, String str2, String str3, String str4, String str5) {
        Log_OC.getArray(str, "residentialAddress");
        Log_OC.getArray(str2, "closestLandmark");
        Log_OC.getArray(str3, "lga");
        Log_OC.getArray(str4, "email");
        Log_OC.getArray(str5, "stateLocation");
        boolean $z0 = isUserInputParamsValid(str, str2, str5, str3, str4);
        if ($z0) {
            ViewData $r6 = getState();
            EditProfileViewData $r7 = EditProfileViewData.copy$default((EditProfileViewData) $r6, true, false, null, null, null, null, 30, null);
            publish($r7);
            final C11812w $r8 = new C11812w();
            final EditProfileRequest $r9 = new EditProfileRequest(null, null, null, str4, str3, str5, null, null, str, str2, null, false, 3271, null);
            FetchCurrentUser $r10 = this.fetchCurrentUser;
            AbstractC11696w $r11 = FetchCurrentUser.execute$default($r10, null, null, 3, null);
            AbstractC11688p $r13 = $r11.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.settings.personal.ui.viewModels.Switch
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.InterfaceC11291f
                /* renamed from: a */
                public final Object mo10663a(Object obj) {
                    EditProfileRequest $r1 = EditProfileRequest.this;
                    C11812w $r2 = $r8;
                    EditProfileViewModel $r3 = this;
                    User $r62 = (User) obj;
                    InterfaceC11692s $r4 = EditProfileViewModel.m40836editUserProfile$lambda5($r1, $r2, $r3, $r62);
                    return $r4;
                }
            });
            FavoritesArrayAdapter $r16 = $r13.e0(new Object() { // from class: ai.kudi.agent.settings.personal.ui.viewModels.Widget
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    EditProfileViewModel $r1 = EditProfileViewModel.this;
                    C11812w $r2 = $r8;
                    EditProfileRequest $r3 = $r9;
                    EditProfileResponse $r5 = (EditProfileResponse) obj;
                    EditProfileViewModel.m40837editUserProfile$lambda6($r1, $r2, $r3, $r5);
                }
            }, new Object() { // from class: ai.kudi.agent.settings.personal.ui.viewModels.IOUtils$2
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    EditProfileViewModel $r1 = EditProfileViewModel.this;
                    Throwable $r3 = (Throwable) obj;
                    EditProfileViewModel.m40838editUserProfile$lambda7($r1, $r3);
                }
            });
            C11280b $r17 = getCompositeDisposable();
            $r17.b($r16);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchLocation() {
        FetchLocation $r2 = this.fetchLocation;
        AbstractC11688p $r3 = $r2.execute();
        FavoritesArrayAdapter $r5 = $r3.e0(new Object() { // from class: ai.kudi.agent.settings.personal.ui.viewModels.Property
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                EditProfileViewModel $r1 = EditProfileViewModel.this;
                List $r32 = (List) obj;
                EditProfileViewModel.m40839fetchLocation$lambda10($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.settings.personal.ui.viewModels.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                EditProfileViewModel $r1 = EditProfileViewModel.this;
                Throwable $r32 = (Throwable) obj;
                EditProfileViewModel.m40840fetchLocation$lambda11($r1, $r32);
            }
        });
        C11280b $r6 = getCompositeDisposable();
        $r6.b($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        EditProfileViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public EditProfileViewData initialData() {
        EditProfileViewData $r1 = new EditProfileViewData(false, false, null, null, null, null, 16, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToVerifiedInfo(User user) {
        Log_OC.getArray(user, "user");
        UserToUserModelMapper $r4 = new UserToUserModelMapper();
        SettingsNavigator $r1 = this.settingsNavigator;
        UserProfile $r2 = $r4.loadProfile(user);
        $r1.navigateToVerifiedInfoScreen($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void start() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.settings.personal.ui.viewModels.FlingerListView$ItemFlingerResponder
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                EditProfileViewModel $r12 = EditProfileViewModel.this;
                User $r3 = (User) obj;
                EditProfileViewModel.m40841start$lambda0($r12, $r3);
            }
        };
        Chunk $r4 = Chunk.NEWLINE;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        Log_OC.loadImage($r5, "fetchCurrentUser.execute().subscribe(\n            {\n                publish(state.copy(userProfile = it))\n            },\n            {\n            }\n        )");
        C11280b $r6 = getCompositeDisposable();
        $r6.b($r5);
    }
}

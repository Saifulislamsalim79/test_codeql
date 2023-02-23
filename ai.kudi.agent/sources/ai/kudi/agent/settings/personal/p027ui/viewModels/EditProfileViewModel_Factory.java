package ai.kudi.agent.settings.personal.p027ui.viewModels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.register.domain.usecases.FetchLocation;
import ai.kudi.agent.settings.domain.useCases.EditProfile;
import ai.kudi.agent.settings.navigators.SettingsNavigator;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.users.domain.usecases.UpdateUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.personal.ui.viewModels.EditProfileViewModel_Factory */
/* loaded from: classes.dex */
public final class EditProfileViewModel_Factory implements InterfaceC9468d<EditProfileViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<EditProfile> editProfileProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<FetchLocation> fetchLocationProvider;
    private final InterfaceC11700a<SettingsNavigator> settingsNavigatorProvider;
    private final InterfaceC11700a<UpdateUser> updateUserProvider;

    public EditProfileViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6) {
        this.editProfileProvider = interfaceC11700a;
        this.updateUserProvider = interfaceC11700a2;
        this.fetchCurrentUserProvider = interfaceC11700a3;
        this.fetchLocationProvider = interfaceC11700a4;
        this.settingsNavigatorProvider = interfaceC11700a5;
        this.analyticsProvider = interfaceC11700a6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static EditProfileViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6) {
        EditProfileViewModel_Factory $r6 = new EditProfileViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static EditProfileViewModel newInstance(EditProfile editProfile, UpdateUser updateUser, FetchCurrentUser fetchCurrentUser, FetchLocation fetchLocation, SettingsNavigator settingsNavigator, Analytics analytics) {
        EditProfileViewModel $r6 = new EditProfileViewModel(editProfile, updateUser, fetchCurrentUser, fetchLocation, settingsNavigator, analytics);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public EditProfileViewModel multiply() {
        InterfaceC11700a $r1 = this.editProfileProvider;
        Object $r2 = $r1.get();
        EditProfile $r3 = (EditProfile) $r2;
        InterfaceC11700a $r12 = this.updateUserProvider;
        Object $r22 = $r12.get();
        UpdateUser $r4 = (UpdateUser) $r22;
        InterfaceC11700a $r13 = this.fetchCurrentUserProvider;
        Object $r23 = $r13.get();
        FetchCurrentUser $r5 = (FetchCurrentUser) $r23;
        InterfaceC11700a $r14 = this.fetchLocationProvider;
        Object $r24 = $r14.get();
        FetchLocation $r6 = (FetchLocation) $r24;
        InterfaceC11700a $r15 = this.settingsNavigatorProvider;
        Object $r25 = $r15.get();
        SettingsNavigator settingsNavigator = (SettingsNavigator) $r25;
        InterfaceC11700a $r16 = this.analyticsProvider;
        Object $r26 = $r16.get();
        EditProfileViewModel $r9 = newInstance($r3, $r4, $r5, $r6, settingsNavigator, (Analytics) $r26);
        return $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40845multiply() {
        EditProfileViewModel $r1 = multiply();
        return $r1;
    }
}

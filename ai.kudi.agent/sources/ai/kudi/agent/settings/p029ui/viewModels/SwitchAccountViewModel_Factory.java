package ai.kudi.agent.settings.p029ui.viewModels;

import ai.kudi.agent.register.domain.usecases.FetchBusinessCategories;
import ai.kudi.agent.settings.domain.useCases.EditProfile;
import ai.kudi.agent.settings.insurance.domain.SwitchCustomerType;
import ai.kudi.agent.settings.navigators.SettingsNavigator;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.users.domain.usecases.UpdateUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.ui.viewModels.SwitchAccountViewModel_Factory */
/* loaded from: classes.dex */
public final class SwitchAccountViewModel_Factory implements InterfaceC9468d<SwitchAccountViewModel> {
    private final InterfaceC11700a<EditProfile> editProfileProvider;
    private final InterfaceC11700a<FetchBusinessCategories> fetchBusinessCategoriesProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<SettingsNavigator> settingsNavigatorProvider;
    private final InterfaceC11700a<SwitchCustomerType> switchCustomerTypeProvider;
    private final InterfaceC11700a<UpdateUser> updateUserProvider;

    public SwitchAccountViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6) {
        this.fetchCurrentUserProvider = interfaceC11700a;
        this.switchCustomerTypeProvider = interfaceC11700a2;
        this.updateUserProvider = interfaceC11700a3;
        this.editProfileProvider = interfaceC11700a4;
        this.settingsNavigatorProvider = interfaceC11700a5;
        this.fetchBusinessCategoriesProvider = interfaceC11700a6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SwitchAccountViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6) {
        SwitchAccountViewModel_Factory $r6 = new SwitchAccountViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SwitchAccountViewModel newInstance(FetchCurrentUser fetchCurrentUser, SwitchCustomerType switchCustomerType, UpdateUser updateUser, EditProfile editProfile, SettingsNavigator settingsNavigator, FetchBusinessCategories fetchBusinessCategories) {
        SwitchAccountViewModel $r6 = new SwitchAccountViewModel(fetchCurrentUser, switchCustomerType, updateUser, editProfile, settingsNavigator, fetchBusinessCategories);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SwitchAccountViewModel multiply() {
        InterfaceC11700a $r1 = this.fetchCurrentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.switchCustomerTypeProvider;
        Object $r22 = $r12.get();
        SwitchCustomerType $r4 = (SwitchCustomerType) $r22;
        InterfaceC11700a $r13 = this.updateUserProvider;
        Object $r23 = $r13.get();
        UpdateUser $r5 = (UpdateUser) $r23;
        InterfaceC11700a $r14 = this.editProfileProvider;
        Object $r24 = $r14.get();
        EditProfile $r6 = (EditProfile) $r24;
        InterfaceC11700a $r15 = this.settingsNavigatorProvider;
        Object $r25 = $r15.get();
        SettingsNavigator settingsNavigator = (SettingsNavigator) $r25;
        InterfaceC11700a $r16 = this.fetchBusinessCategoriesProvider;
        Object $r26 = $r16.get();
        SwitchAccountViewModel $r9 = newInstance($r3, $r4, $r5, $r6, settingsNavigator, (FetchBusinessCategories) $r26);
        return $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40935multiply() {
        SwitchAccountViewModel $r1 = multiply();
        return $r1;
    }
}

package ai.kudi.agent.register.p021ui.viewmodels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.register.domain.usecases.FetchBusinessCategories;
import ai.kudi.agent.register.domain.usecases.FetchLocation;
import ai.kudi.agent.register.navigators.RegisterNavigator;
import ai.kudi.agent.settings.domain.useCases.EditProfile;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.users.domain.usecases.UpdateUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.register.ui.viewmodels.BusinessInfoViewModel_Factory */
/* loaded from: classes.dex */
public final class BusinessInfoViewModel_Factory implements InterfaceC9468d<BusinessInfoViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<EditProfile> editProfileProvider;
    private final InterfaceC11700a<FetchBusinessCategories> fetchBusinessCategoriesProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<FetchLocation> fetchLocationProvider;
    private final InterfaceC11700a<RegisterNavigator> navigatorProvider;
    private final InterfaceC11700a<UpdateUser> updateUserProvider;

    public BusinessInfoViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7) {
        this.navigatorProvider = interfaceC11700a;
        this.fetchLocationProvider = interfaceC11700a2;
        this.analyticsProvider = interfaceC11700a3;
        this.fetchCurrentUserProvider = interfaceC11700a4;
        this.updateUserProvider = interfaceC11700a5;
        this.fetchBusinessCategoriesProvider = interfaceC11700a6;
        this.editProfileProvider = interfaceC11700a7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BusinessInfoViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7) {
        BusinessInfoViewModel_Factory $r7 = new BusinessInfoViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6, interfaceC11700a7);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BusinessInfoViewModel newInstance(RegisterNavigator registerNavigator, FetchLocation fetchLocation, Analytics analytics, FetchCurrentUser fetchCurrentUser, UpdateUser updateUser, FetchBusinessCategories fetchBusinessCategories, EditProfile editProfile) {
        BusinessInfoViewModel $r7 = new BusinessInfoViewModel(registerNavigator, fetchLocation, analytics, fetchCurrentUser, updateUser, fetchBusinessCategories, editProfile);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BusinessInfoViewModel multiply() {
        InterfaceC11700a $r1 = this.navigatorProvider;
        Object $r2 = $r1.get();
        RegisterNavigator $r3 = (RegisterNavigator) $r2;
        InterfaceC11700a $r12 = this.fetchLocationProvider;
        Object $r22 = $r12.get();
        FetchLocation $r4 = (FetchLocation) $r22;
        InterfaceC11700a $r13 = this.analyticsProvider;
        Object $r23 = $r13.get();
        Analytics $r5 = (Analytics) $r23;
        InterfaceC11700a $r14 = this.fetchCurrentUserProvider;
        Object $r24 = $r14.get();
        FetchCurrentUser fetchCurrentUser = (FetchCurrentUser) $r24;
        InterfaceC11700a $r15 = this.updateUserProvider;
        Object $r25 = $r15.get();
        UpdateUser updateUser = (UpdateUser) $r25;
        InterfaceC11700a $r16 = this.fetchBusinessCategoriesProvider;
        Object $r26 = $r16.get();
        FetchBusinessCategories fetchBusinessCategories = (FetchBusinessCategories) $r26;
        InterfaceC11700a $r17 = this.editProfileProvider;
        Object $r27 = $r17.get();
        EditProfile $r9 = (EditProfile) $r27;
        BusinessInfoViewModel $r10 = newInstance($r3, $r4, $r5, fetchCurrentUser, updateUser, fetchBusinessCategories, $r9);
        return $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40402multiply() {
        BusinessInfoViewModel $r1 = multiply();
        return $r1;
    }
}

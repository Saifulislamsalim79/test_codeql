package ai.kudi.agent.settings.personal.p027ui.viewModels;

import ai.kudi.agent.core.util.Pref;
import ai.kudi.agent.outlet_mgt.useCases.FetchOutletParent;
import ai.kudi.agent.settings.domain.useCases.GetMonthlyKycLevels;
import ai.kudi.agent.settings.domain.useCases.Profile;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.personal.ui.viewModels.PersonalViewModel_Factory */
/* loaded from: classes.dex */
public final class PersonalViewModel_Factory implements InterfaceC9468d<PersonalViewModel> {
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<FetchOutletParent> fetchParentDetailsProvider;
    private final InterfaceC11700a<GetMonthlyKycLevels> getKycLevelsProvider;
    private final InterfaceC11700a<Profile> profileProvider;
    private final InterfaceC11700a<Pref> sharedPreferencesProvider;

    public PersonalViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        this.profileProvider = interfaceC11700a;
        this.fetchCurrentUserProvider = interfaceC11700a2;
        this.fetchParentDetailsProvider = interfaceC11700a3;
        this.sharedPreferencesProvider = interfaceC11700a4;
        this.getKycLevelsProvider = interfaceC11700a5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PersonalViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        PersonalViewModel_Factory $r5 = new PersonalViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PersonalViewModel newInstance(Profile profile, FetchCurrentUser fetchCurrentUser, FetchOutletParent fetchOutletParent, Pref pref, GetMonthlyKycLevels getMonthlyKycLevels) {
        PersonalViewModel $r5 = new PersonalViewModel(profile, fetchCurrentUser, fetchOutletParent, pref, getMonthlyKycLevels);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PersonalViewModel multiply() {
        InterfaceC11700a $r1 = this.profileProvider;
        Object $r2 = $r1.get();
        Profile $r3 = (Profile) $r2;
        InterfaceC11700a $r12 = this.fetchCurrentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        InterfaceC11700a $r13 = this.fetchParentDetailsProvider;
        Object $r23 = $r13.get();
        FetchOutletParent $r5 = (FetchOutletParent) $r23;
        InterfaceC11700a $r14 = this.sharedPreferencesProvider;
        Object $r24 = $r14.get();
        Pref $r6 = (Pref) $r24;
        InterfaceC11700a $r15 = this.getKycLevelsProvider;
        Object $r25 = $r15.get();
        GetMonthlyKycLevels $r7 = (GetMonthlyKycLevels) $r25;
        PersonalViewModel $r8 = newInstance($r3, $r4, $r5, $r6, $r7);
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40858multiply() {
        PersonalViewModel $r1 = multiply();
        return $r1;
    }
}

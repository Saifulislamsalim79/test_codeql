package ai.kudi.agent.settings.personal.p027ui.viewModels;

import ai.kudi.agent.settings.domain.useCases.GetMonthlyKycLevels;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.personal.ui.viewModels.AboutKycViewModel_Factory */
/* loaded from: classes.dex */
public final class AboutKycViewModel_Factory implements InterfaceC9468d<AboutKycViewModel> {
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<GetMonthlyKycLevels> getMonthlyKycLevelsProvider;

    public AboutKycViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.getMonthlyKycLevelsProvider = interfaceC11700a;
        this.fetchCurrentUserProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AboutKycViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        AboutKycViewModel_Factory $r2 = new AboutKycViewModel_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AboutKycViewModel newInstance(GetMonthlyKycLevels getMonthlyKycLevels, FetchCurrentUser fetchCurrentUser) {
        AboutKycViewModel $r2 = new AboutKycViewModel(getMonthlyKycLevels, fetchCurrentUser);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AboutKycViewModel multiply() {
        InterfaceC11700a $r1 = this.getMonthlyKycLevelsProvider;
        Object $r2 = $r1.get();
        GetMonthlyKycLevels $r3 = (GetMonthlyKycLevels) $r2;
        InterfaceC11700a $r12 = this.fetchCurrentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        AboutKycViewModel $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40832multiply() {
        AboutKycViewModel $r1 = multiply();
        return $r1;
    }
}

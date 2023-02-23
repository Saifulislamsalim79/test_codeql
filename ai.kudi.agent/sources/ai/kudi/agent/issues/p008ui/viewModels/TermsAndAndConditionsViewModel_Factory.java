package ai.kudi.agent.issues.p008ui.viewModels;

import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.issues.ui.viewModels.TermsAndAndConditionsViewModel_Factory */
/* loaded from: classes.dex */
public final class TermsAndAndConditionsViewModel_Factory implements InterfaceC9468d<TermsAndAndConditionsViewModel> {
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;

    public TermsAndAndConditionsViewModel_Factory(InterfaceC11700a interfaceC11700a) {
        this.fetchCurrentUserProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TermsAndAndConditionsViewModel_Factory create(InterfaceC11700a interfaceC11700a) {
        TermsAndAndConditionsViewModel_Factory $r1 = new TermsAndAndConditionsViewModel_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TermsAndAndConditionsViewModel newInstance(FetchCurrentUser fetchCurrentUser) {
        TermsAndAndConditionsViewModel $r1 = new TermsAndAndConditionsViewModel(fetchCurrentUser);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TermsAndAndConditionsViewModel multiply() {
        InterfaceC11700a $r1 = this.fetchCurrentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        TermsAndAndConditionsViewModel $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39559multiply() {
        TermsAndAndConditionsViewModel $r1 = multiply();
        return $r1;
    }
}

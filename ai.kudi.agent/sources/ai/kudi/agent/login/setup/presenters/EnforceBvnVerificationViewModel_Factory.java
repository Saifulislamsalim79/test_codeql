package ai.kudi.agent.login.setup.presenters;

import ai.kudi.agent.login.setup.domain.UpdateBvnUseCase;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class EnforceBvnVerificationViewModel_Factory implements InterfaceC9468d<EnforceBvnVerificationViewModel> {
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<UpdateBvnUseCase> updateBvnUseCaseProvider;

    public EnforceBvnVerificationViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.updateBvnUseCaseProvider = interfaceC11700a;
        this.currentUserProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static EnforceBvnVerificationViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        EnforceBvnVerificationViewModel_Factory $r2 = new EnforceBvnVerificationViewModel_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static EnforceBvnVerificationViewModel newInstance(UpdateBvnUseCase updateBvnUseCase, FetchCurrentUser fetchCurrentUser) {
        EnforceBvnVerificationViewModel $r2 = new EnforceBvnVerificationViewModel(updateBvnUseCase, fetchCurrentUser);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public EnforceBvnVerificationViewModel multiply() {
        InterfaceC11700a $r1 = this.updateBvnUseCaseProvider;
        Object $r2 = $r1.get();
        UpdateBvnUseCase $r3 = (UpdateBvnUseCase) $r2;
        InterfaceC11700a $r12 = this.currentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        EnforceBvnVerificationViewModel $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39756multiply() {
        EnforceBvnVerificationViewModel $r1 = multiply();
        return $r1;
    }
}

package ai.kudi.agent.transactions.presenters;

import ai.kudi.agent.issues.domain.FetchIssueType;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class TransactionIssuePresenter_Factory implements InterfaceC9468d<TransactionIssuePresenter> {
    private final InterfaceC11700a<FetchCurrentUser> fetchUserProvider;
    private final InterfaceC11700a<FetchIssueType> issueTypeProvider;

    public TransactionIssuePresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.issueTypeProvider = interfaceC11700a;
        this.fetchUserProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionIssuePresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        TransactionIssuePresenter_Factory $r2 = new TransactionIssuePresenter_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionIssuePresenter newInstance(FetchIssueType fetchIssueType, FetchCurrentUser fetchCurrentUser) {
        TransactionIssuePresenter $r2 = new TransactionIssuePresenter(fetchIssueType, fetchCurrentUser);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionIssuePresenter multiply() {
        InterfaceC11700a $r1 = this.issueTypeProvider;
        Object $r2 = $r1.get();
        FetchIssueType $r3 = (FetchIssueType) $r2;
        InterfaceC11700a $r12 = this.fetchUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        TransactionIssuePresenter $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41213multiply() {
        TransactionIssuePresenter $r1 = multiply();
        return $r1;
    }
}

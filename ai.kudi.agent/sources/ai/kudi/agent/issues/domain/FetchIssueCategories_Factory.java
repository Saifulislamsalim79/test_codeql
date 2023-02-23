package ai.kudi.agent.issues.domain;

import ai.kudi.agent.issues.domain.repositories.IssueRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class FetchIssueCategories_Factory implements InterfaceC9468d<FetchIssueCategories> {
    private final InterfaceC11700a<IssueRepository> issueRepositoryProvider;

    public FetchIssueCategories_Factory(InterfaceC11700a interfaceC11700a) {
        this.issueRepositoryProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchIssueCategories_Factory create(InterfaceC11700a interfaceC11700a) {
        FetchIssueCategories_Factory $r1 = new FetchIssueCategories_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchIssueCategories newInstance(IssueRepository issueRepository) {
        FetchIssueCategories $r1 = new FetchIssueCategories(issueRepository);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FetchIssueCategories multiply() {
        InterfaceC11700a $r1 = this.issueRepositoryProvider;
        Object $r2 = $r1.get();
        IssueRepository $r3 = (IssueRepository) $r2;
        FetchIssueCategories $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39347multiply() {
        FetchIssueCategories $r1 = multiply();
        return $r1;
    }
}

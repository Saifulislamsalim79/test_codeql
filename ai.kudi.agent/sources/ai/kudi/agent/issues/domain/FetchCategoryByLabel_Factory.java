package ai.kudi.agent.issues.domain;

import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.issues.domain.repositories.IssueRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class FetchCategoryByLabel_Factory implements InterfaceC9468d<FetchCategoryByLabel> {
    private final InterfaceC11700a<IssueRepository> issueRepositoryProvider;
    private final InterfaceC11700a<RxSchedulers> rxSchedulersProvider;

    public FetchCategoryByLabel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.issueRepositoryProvider = interfaceC11700a;
        this.rxSchedulersProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchCategoryByLabel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        FetchCategoryByLabel_Factory $r2 = new FetchCategoryByLabel_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchCategoryByLabel newInstance(IssueRepository issueRepository, RxSchedulers rxSchedulers) {
        FetchCategoryByLabel $r2 = new FetchCategoryByLabel(issueRepository, rxSchedulers);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FetchCategoryByLabel multiply() {
        InterfaceC11700a $r1 = this.issueRepositoryProvider;
        Object $r2 = $r1.get();
        IssueRepository $r3 = (IssueRepository) $r2;
        InterfaceC11700a $r12 = this.rxSchedulersProvider;
        Object $r22 = $r12.get();
        RxSchedulers $r4 = (RxSchedulers) $r22;
        FetchCategoryByLabel $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39346multiply() {
        FetchCategoryByLabel $r1 = multiply();
        return $r1;
    }
}

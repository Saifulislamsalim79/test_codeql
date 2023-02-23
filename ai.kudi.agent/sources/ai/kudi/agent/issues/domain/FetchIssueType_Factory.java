package ai.kudi.agent.issues.domain;

import ai.kudi.agent.issues.data.remote.IssuesApiService;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class FetchIssueType_Factory implements InterfaceC9468d<FetchIssueType> {
    private final InterfaceC11700a<IssuesApiService> networkServiceProvider;

    public FetchIssueType_Factory(InterfaceC11700a interfaceC11700a) {
        this.networkServiceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchIssueType_Factory create(InterfaceC11700a interfaceC11700a) {
        FetchIssueType_Factory $r1 = new FetchIssueType_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchIssueType newInstance(IssuesApiService issuesApiService) {
        FetchIssueType $r1 = new FetchIssueType(issuesApiService);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FetchIssueType multiply() {
        InterfaceC11700a $r1 = this.networkServiceProvider;
        Object $r2 = $r1.get();
        IssuesApiService $r3 = (IssuesApiService) $r2;
        FetchIssueType $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39348multiply() {
        FetchIssueType $r1 = multiply();
        return $r1;
    }
}

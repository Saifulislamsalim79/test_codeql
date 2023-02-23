package ai.kudi.agent.issues.presenters;

import ai.kudi.agent.issues.domain.FetchIssueType;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class PosIssuePresenter_Factory implements InterfaceC9468d<PosIssuePresenter> {
    private final InterfaceC11700a<FetchIssueType> fetchIssueTypeProvider;

    public PosIssuePresenter_Factory(InterfaceC11700a interfaceC11700a) {
        this.fetchIssueTypeProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PosIssuePresenter_Factory create(InterfaceC11700a interfaceC11700a) {
        PosIssuePresenter_Factory $r1 = new PosIssuePresenter_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PosIssuePresenter newInstance(FetchIssueType fetchIssueType) {
        PosIssuePresenter $r1 = new PosIssuePresenter(fetchIssueType);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PosIssuePresenter multiply() {
        InterfaceC11700a $r1 = this.fetchIssueTypeProvider;
        Object $r2 = $r1.get();
        FetchIssueType $r3 = (FetchIssueType) $r2;
        PosIssuePresenter $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39413multiply() {
        PosIssuePresenter $r1 = multiply();
        return $r1;
    }
}

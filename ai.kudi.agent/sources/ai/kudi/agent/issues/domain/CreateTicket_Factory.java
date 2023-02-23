package ai.kudi.agent.issues.domain;

import ai.kudi.agent.issues.data.remote.IssuesApiService;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class CreateTicket_Factory implements InterfaceC9468d<CreateTicket> {
    private final InterfaceC11700a<IssuesApiService> networkServiceProvider;

    public CreateTicket_Factory(InterfaceC11700a interfaceC11700a) {
        this.networkServiceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CreateTicket_Factory create(InterfaceC11700a interfaceC11700a) {
        CreateTicket_Factory $r1 = new CreateTicket_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CreateTicket newInstance(IssuesApiService issuesApiService) {
        CreateTicket $r1 = new CreateTicket(issuesApiService);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CreateTicket multiply() {
        InterfaceC11700a $r1 = this.networkServiceProvider;
        Object $r2 = $r1.get();
        IssuesApiService $r3 = (IssuesApiService) $r2;
        CreateTicket $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39345multiply() {
        CreateTicket $r1 = multiply();
        return $r1;
    }
}

package ai.kudi.agent.transactions.presenters;

import ai.kudi.agent.transactions.domain.usecases.RequestStatement;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class RequestStatementPresenter_Factory implements InterfaceC9468d<RequestStatementPresenter> {
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<RequestStatement> requestStatementProvider;

    public RequestStatementPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.fetchCurrentUserProvider = interfaceC11700a;
        this.requestStatementProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RequestStatementPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        RequestStatementPresenter_Factory $r2 = new RequestStatementPresenter_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RequestStatementPresenter newInstance(FetchCurrentUser fetchCurrentUser, RequestStatement requestStatement) {
        RequestStatementPresenter $r2 = new RequestStatementPresenter(fetchCurrentUser, requestStatement);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public RequestStatementPresenter multiply() {
        InterfaceC11700a $r1 = this.fetchCurrentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.requestStatementProvider;
        Object $r22 = $r12.get();
        RequestStatement $r4 = (RequestStatement) $r22;
        RequestStatementPresenter $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41177multiply() {
        RequestStatementPresenter $r1 = multiply();
        return $r1;
    }
}

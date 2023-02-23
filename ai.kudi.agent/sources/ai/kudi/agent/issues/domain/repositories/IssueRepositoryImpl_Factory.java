package ai.kudi.agent.issues.domain.repositories;

import ai.kudi.agent.issues.domain.dataSource.ApiDataSource;
import ai.kudi.agent.issues.domain.dataSource.LocalDataSource;
import android.content.SharedPreferences;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class IssueRepositoryImpl_Factory implements InterfaceC9468d<IssueRepositoryImpl> {
    private final InterfaceC11700a<ApiDataSource> apiProvider;
    private final InterfaceC11700a<LocalDataSource> dbProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;

    public IssueRepositoryImpl_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.apiProvider = interfaceC11700a;
        this.dbProvider = interfaceC11700a2;
        this.sharedPreferencesProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static IssueRepositoryImpl_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        IssueRepositoryImpl_Factory $r3 = new IssueRepositoryImpl_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static IssueRepositoryImpl newInstance(ApiDataSource apiDataSource, LocalDataSource localDataSource, SharedPreferences sharedPreferences) {
        IssueRepositoryImpl $r3 = new IssueRepositoryImpl(apiDataSource, localDataSource, sharedPreferences);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public IssueRepositoryImpl multiply() {
        InterfaceC11700a $r1 = this.apiProvider;
        Object $r2 = $r1.get();
        ApiDataSource $r3 = (ApiDataSource) $r2;
        InterfaceC11700a $r12 = this.dbProvider;
        Object $r22 = $r12.get();
        LocalDataSource $r4 = (LocalDataSource) $r22;
        InterfaceC11700a $r13 = this.sharedPreferencesProvider;
        Object $r23 = $r13.get();
        SharedPreferences $r5 = (SharedPreferences) $r23;
        IssueRepositoryImpl $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39368multiply() {
        IssueRepositoryImpl $r1 = multiply();
        return $r1;
    }
}

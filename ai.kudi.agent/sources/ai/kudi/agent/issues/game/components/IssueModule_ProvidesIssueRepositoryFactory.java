package ai.kudi.agent.issues.game.components;

import ai.kudi.agent.issues.domain.dataSource.ApiDataSource;
import ai.kudi.agent.issues.domain.dataSource.LocalDataSource;
import ai.kudi.agent.issues.domain.repositories.IssueRepository;
import android.content.SharedPreferences;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class IssueModule_ProvidesIssueRepositoryFactory implements InterfaceC9468d<IssueRepository> {
    private final InterfaceC11700a<ApiDataSource> apiDataSourceProvider;
    private final InterfaceC11700a<LocalDataSource> localDataSourceProvider;
    private final IssueModule module;
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;

    public IssueModule_ProvidesIssueRepositoryFactory(IssueModule issueModule, InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.module = issueModule;
        this.localDataSourceProvider = interfaceC11700a;
        this.apiDataSourceProvider = interfaceC11700a2;
        this.sharedPreferencesProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static IssueModule_ProvidesIssueRepositoryFactory create(IssueModule issueModule, InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        IssueModule_ProvidesIssueRepositoryFactory $r4 = new IssueModule_ProvidesIssueRepositoryFactory(issueModule, interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static IssueRepository providesIssueRepository(IssueModule issueModule, LocalDataSource localDataSource, ApiDataSource apiDataSource, SharedPreferences sharedPreferences) {
        IssueRepository $r3 = issueModule.providesIssueRepository(localDataSource, apiDataSource, sharedPreferences);
        C9473g.m14647e($r3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public IssueRepository remainder() {
        IssueModule $r1 = this.module;
        InterfaceC11700a $r2 = this.localDataSourceProvider;
        Object $r3 = $r2.get();
        LocalDataSource $r4 = (LocalDataSource) $r3;
        InterfaceC11700a $r22 = this.apiDataSourceProvider;
        Object $r32 = $r22.get();
        ApiDataSource $r5 = (ApiDataSource) $r32;
        InterfaceC11700a $r23 = this.sharedPreferencesProvider;
        Object $r33 = $r23.get();
        SharedPreferences $r6 = (SharedPreferences) $r33;
        IssueRepository $r7 = providesIssueRepository($r1, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: remainder  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39369remainder() {
        IssueRepository $r1 = remainder();
        return $r1;
    }
}

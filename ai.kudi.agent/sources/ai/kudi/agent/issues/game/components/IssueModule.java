package ai.kudi.agent.issues.game.components;

import ai.kudi.agent.issues.domain.dataSource.ApiDataSource;
import ai.kudi.agent.issues.domain.dataSource.LocalDataSource;
import ai.kudi.agent.issues.domain.repositories.IssueRepository;
import ai.kudi.agent.issues.domain.repositories.IssueRepositoryImpl;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: IssueModule.kt */
@Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/issues/di/components/IssueModule;", "", "()V", "providesIssueRepository", "Lai/kudi/agent/issues/domain/repositories/IssueRepository;", "localDataSource", "Lai/kudi/agent/issues/domain/dataSource/LocalDataSource;", "apiDataSource", "Lai/kudi/agent/issues/domain/dataSource/ApiDataSource;", "sharedPreferences", "Landroid/content/SharedPreferences;", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class IssueModule {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final IssueRepository providesIssueRepository(LocalDataSource localDataSource, ApiDataSource apiDataSource, SharedPreferences sharedPreferences) {
        Log_OC.getArray(localDataSource, "localDataSource");
        Log_OC.getArray(apiDataSource, "apiDataSource");
        Log_OC.getArray(sharedPreferences, "sharedPreferences");
        IssueRepositoryImpl $r4 = new IssueRepositoryImpl(apiDataSource, localDataSource, sharedPreferences);
        return $r4;
    }
}

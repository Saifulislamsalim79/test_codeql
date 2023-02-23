package ai.kudi.agent.issues.domain.dataSource;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import ai.kudi.agent.core.domain.p004db.room_dao.IssueResolutionDao;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11271b;
import p425j.p444e.AbstractC11677k;
import p425j.p444e.AbstractC11688p;
import p590o.p591a.Timber;
/* compiled from: LocalDataSource.kt */
@Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rJ\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u00062\u0006\u0010\u000f\u001a\u00020\rJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\u0006\u0010\u000f\u001a\u00020\rJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006J \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007J\u0014\u0010\u0015\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007J \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m10421d2 = {"Lai/kudi/agent/issues/domain/dataSource/LocalDataSource;", "", "appRoomDatabase", "Lai/kudi/agent/core/domain/db/CoreAppDatabase;", "(Lai/kudi/agent/core/domain/db/CoreAppDatabase;)V", "fetchIssueTypes", "Lio/reactivex/Observable;", "", "Lai/kudi/agent/core/domain/room_entities/IssueCategory;", "getIssueCategoryByLabel", "Lio/reactivex/Maybe;", "Lai/kudi/agent/core/domain/room_entities/CategoryData;", "label", "", "getIssueDetails", "type", "nukeIssueDetails", "", "nukeIssueTypes", "saveIssueDetails", "issueDetails", "saveIssueDetailsWithoutCompletable", "saveIssueTypes", TransactionBreakDownItemType.DATA, "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class LocalDataSource {
    private final CoreAppDatabase appRoomDatabase;

    public LocalDataSource(CoreAppDatabase coreAppDatabase) {
        Log_OC.getArray(coreAppDatabase, "appRoomDatabase");
        this.appRoomDatabase = coreAppDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: nukeIssueDetails$lambda-3  reason: not valid java name */
    public static final C13666w m39357nukeIssueDetails$lambda3(LocalDataSource localDataSource, String str) {
        Log_OC.getArray(localDataSource, "this$0");
        Log_OC.getArray(str, "$type");
        CoreAppDatabase $r3 = localDataSource.appRoomDatabase;
        IssueResolutionDao $r1 = $r3.getIssueResolutionDao();
        $r1.nukeIssueDetailsForType(str);
        C13666w r4 = C13666w.f30112a;
        return r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: nukeIssueTypes$lambda-2  reason: not valid java name */
    public static final C13666w m39358nukeIssueTypes$lambda2(LocalDataSource localDataSource) {
        Log_OC.getArray(localDataSource, "this$0");
        Object[] $r2 = new Object[0];
        Timber.tag("nuke nuked", $r2);
        CoreAppDatabase $r3 = localDataSource.appRoomDatabase;
        IssueResolutionDao $r0 = $r3.getIssueResolutionDao();
        $r0.nukeIssueTable();
        C13666w r4 = C13666w.f30112a;
        return r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: saveIssueDetails$lambda-1  reason: not valid java name */
    public static final C13666w m39359saveIssueDetails$lambda1(LocalDataSource localDataSource, List list) {
        Log_OC.getArray(localDataSource, "this$0");
        Log_OC.getArray(list, "$issueDetails");
        CoreAppDatabase $r3 = localDataSource.appRoomDatabase;
        IssueResolutionDao $r1 = $r3.getIssueResolutionDao();
        $r1.addIssueDetails(list);
        C13666w r4 = C13666w.f30112a;
        return r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: saveIssueTypes$lambda-0  reason: not valid java name */
    public static final C13666w m39360saveIssueTypes$lambda0(LocalDataSource localDataSource, List list) {
        Log_OC.getArray(localDataSource, "this$0");
        Log_OC.getArray(list, "$data");
        CoreAppDatabase $r3 = localDataSource.appRoomDatabase;
        IssueResolutionDao $r1 = $r3.getIssueResolutionDao();
        $r1.addIssueTypes(list);
        C13666w r4 = C13666w.f30112a;
        return r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p fetchIssueTypes() {
        CoreAppDatabase $r1 = this.appRoomDatabase;
        IssueResolutionDao $r2 = $r1.getIssueResolutionDao();
        AbstractC11688p $r3 = $r2.getIssueTypes();
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11677k getIssueCategoryByLabel(String str) {
        Log_OC.getArray(str, "label");
        CoreAppDatabase $r2 = this.appRoomDatabase;
        IssueResolutionDao $r3 = $r2.getIssueResolutionDao();
        AbstractC11677k $r4 = $r3.getIssueCategoryByLabel(str);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p getIssueDetails(String str) {
        Log_OC.getArray(str, "type");
        CoreAppDatabase $r2 = this.appRoomDatabase;
        IssueResolutionDao $r3 = $r2.getIssueResolutionDao();
        AbstractC11688p $r4 = $r3.getIssueDetails(str);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p nukeIssueDetails(final String str) {
        Log_OC.getArray(str, "type");
        AbstractC11271b $r3 = AbstractC11271b.m11239l(new Callable() { // from class: ai.kudi.agent.issues.domain.dataSource.DatabaseHelper$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                LocalDataSource $r32 = LocalDataSource.this;
                String $r1 = str;
                C13666w $r2 = LocalDataSource.m39357nukeIssueDetails$lambda3($r32, $r1);
                return $r2;
            }
        });
        C13666w $r4 = C13666w.f30112a;
        AbstractC11688p $r5 = $r3.m11247d(AbstractC11688p.m10532N($r4));
        Log_OC.loadImage($r5, "fromCallable {\n            appRoomDatabase.issueResolutionDao.nukeIssueDetailsForType(\n                type\n            )\n        }\n            .andThen(Observable.just(Unit))");
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p nukeIssueTypes() {
        AbstractC11271b $r2 = AbstractC11271b.m11239l(new Callable() { // from class: ai.kudi.agent.issues.domain.dataSource.Preferences$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                LocalDataSource $r22 = LocalDataSource.this;
                C13666w $r1 = LocalDataSource.m39358nukeIssueTypes$lambda2($r22);
                return $r1;
            }
        });
        C13666w $r3 = C13666w.f30112a;
        AbstractC11688p $r4 = $r2.m11247d(AbstractC11688p.m10532N($r3));
        Log_OC.loadImage($r4, "fromCallable {\n            Timber.i(\"nuke nuked\")\n            appRoomDatabase.issueResolutionDao.nukeIssueTable()\n        }.andThen(Observable.just(Unit))");
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p saveIssueDetails(final List list) {
        Log_OC.getArray(list, "issueDetails");
        AbstractC11271b $r3 = AbstractC11271b.m11239l(new Callable() { // from class: ai.kudi.agent.issues.domain.dataSource.Futures$WrappedCombiner
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                LocalDataSource $r32 = LocalDataSource.this;
                List $r1 = list;
                C13666w $r2 = LocalDataSource.m39359saveIssueDetails$lambda1($r32, $r1);
                return $r2;
            }
        });
        AbstractC11688p $r4 = $r3.m11247d(AbstractC11688p.m10532N(list));
        Log_OC.loadImage($r4, "fromCallable {\n            appRoomDatabase.issueResolutionDao.addIssueDetails(\n                issueDetails\n            )\n        }\n            .andThen(Observable.just(issueDetails))");
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void saveIssueDetailsWithoutCompletable(List list) {
        Log_OC.getArray(list, "issueDetails");
        CoreAppDatabase $r3 = this.appRoomDatabase;
        IssueResolutionDao $r2 = $r3.getIssueResolutionDao();
        $r2.addIssueDetails(list);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p saveIssueTypes(final List list) {
        Log_OC.getArray(list, TransactionBreakDownItemType.DATA);
        AbstractC11271b $r3 = AbstractC11271b.m11239l(new Callable() { // from class: ai.kudi.agent.issues.domain.dataSource.Downloader
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                LocalDataSource $r32 = LocalDataSource.this;
                List $r1 = list;
                C13666w $r2 = LocalDataSource.m39360saveIssueTypes$lambda0($r32, $r1);
                return $r2;
            }
        });
        AbstractC11688p $r4 = $r3.m11247d(AbstractC11688p.m10532N(list));
        Log_OC.loadImage($r4, "fromCallable {\n            appRoomDatabase.issueResolutionDao.addIssueTypes(data)\n        }.andThen(Observable.just(data))");
        return $r4;
    }
}

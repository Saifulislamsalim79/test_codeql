package ai.kudi.agent.issues.domain.repositories;

import ai.kudi.agent.core.domain.room_entities.CategoryData;
import ai.kudi.agent.issues.domain.dataSource.ApiDataSource;
import ai.kudi.agent.issues.domain.dataSource.LocalDataSource;
import ai.kudi.agent.issues.viewmodels.model.WithdrawalTypes;
import android.content.SharedPreferences;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11677k;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.Item;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: IssueRepositoryImpl.kt */
@Metadata(m10422d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH\u0002J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00100\u000f2\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u0018\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000f2\u0006\u0010\u0019\u001a\u00020\u0014H\u0016J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00100\u000f2\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J\u001e\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0010\u0018\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J\u001c\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u001d\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m10421d2 = {"Lai/kudi/agent/issues/domain/repositories/IssueRepositoryImpl;", "Lai/kudi/agent/issues/domain/repositories/IssueRepository;", "api", "Lai/kudi/agent/issues/domain/dataSource/ApiDataSource;", "db", "Lai/kudi/agent/issues/domain/dataSource/LocalDataSource;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Lai/kudi/agent/issues/domain/dataSource/ApiDataSource;Lai/kudi/agent/issues/domain/dataSource/LocalDataSource;Landroid/content/SharedPreferences;)V", "isFromDb", "", "()Z", "setFromDb", "(Z)V", "fetchIssueTypesFromDb", "Lio/reactivex/Observable;", "", "Lai/kudi/agent/core/domain/room_entities/IssueCategory;", "fetchIssueTypesFromNetworkAndSave", "customerType", "", "getIssueDetails", "Lai/kudi/agent/core/domain/room_entities/CategoryData;", "type", "getIssueDetailsByLabel", "label", "getIssueDetailsFromDb", "getIssueDetailsFromNetworkAndSave", "getIssueTypes", "shouldLoadIssuetypesFromNetwork", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class IssueRepositoryImpl implements IssueRepository {
    private final LocalDataSource fileCache;
    private boolean isFromDb;
    private final ApiDataSource policy;
    private final SharedPreferences sharedPreferences;

    public IssueRepositoryImpl(ApiDataSource apiDataSource, LocalDataSource localDataSource, SharedPreferences sharedPreferences) {
        Log_OC.getArray(apiDataSource, "api");
        Log_OC.getArray(localDataSource, "db");
        Log_OC.getArray(sharedPreferences, "sharedPreferences");
        this.policy = apiDataSource;
        this.fileCache = localDataSource;
        this.sharedPreferences = sharedPreferences;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final AbstractC11688p fetchIssueTypesFromDb() {
        setFromDb(true);
        LocalDataSource $r1 = this.fileCache;
        AbstractC11688p $r2 = $r1.fetchIssueTypes();
        Item $r3 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r22 = $r2.h0($r3);
        Log_OC.loadImage($r22, "db.fetchIssueTypes().subscribeOn(Schedulers.io())");
        return $r22;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final AbstractC11688p fetchIssueTypesFromNetworkAndSave(final String str) {
        AbstractC11688p $r1 = AbstractC11688p.m10488t(new Callable() { // from class: ai.kudi.agent.issues.domain.repositories.DatabaseHelper$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                IssueRepositoryImpl $r3 = IssueRepositoryImpl.this;
                String $r12 = str;
                InterfaceC11692s $r2 = IssueRepositoryImpl.m39362fetchIssueTypesFromNetworkAndSave$lambda6($r3, $r12);
                return $r2;
            }
        });
        Log_OC.loadImage($r1, "defer {\n            if (shouldLoadIssuetypesFromNetwork()) {\n                api.fetchIssueTypes(customerType).flatMap { list ->\n                    sharedPreferences.edit().putLong(\n                        ISSUE_FETCH_TIME,\n                        System.currentTimeMillis().plus(TimeUnit.HOURS.toMillis(1))\n                    ).apply()\n                    db.nukeIssueTypes().flatMap {\n                        db.saveIssueTypes(list)\n                    }\n                }\n            } else Observable.empty()\n        }");
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchIssueTypesFromNetworkAndSave$lambda-6  reason: not valid java name */
    public static final InterfaceC11692s m39362fetchIssueTypesFromNetworkAndSave$lambda6(final IssueRepositoryImpl issueRepositoryImpl, String str) {
        Log_OC.getArray(issueRepositoryImpl, "this$0");
        Log_OC.getArray(str, "$customerType");
        boolean $z0 = issueRepositoryImpl.shouldLoadIssuetypesFromNetwork();
        if (!$z0) {
            AbstractC11688p $r3 = AbstractC11688p.m10483y();
            return $r3;
        }
        ApiDataSource $r2 = issueRepositoryImpl.policy;
        AbstractC11688p $r32 = $r2.fetchIssueTypes(str);
        return $r32.m10545A(new InterfaceC11291f() { // from class: ai.kudi.agent.issues.domain.repositories.ByteVector
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                IssueRepositoryImpl $r1 = IssueRepositoryImpl.this;
                List $r4 = (List) obj;
                InterfaceC11692s $r22 = IssueRepositoryImpl.m39363fetchIssueTypesFromNetworkAndSave$lambda6$lambda5($r1, $r4);
                return $r22;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchIssueTypesFromNetworkAndSave$lambda-6$lambda-5  reason: not valid java name */
    public static final InterfaceC11692s m39363fetchIssueTypesFromNetworkAndSave$lambda6$lambda5(final IssueRepositoryImpl issueRepositoryImpl, final List list) {
        Log_OC.getArray(issueRepositoryImpl, "this$0");
        Log_OC.getArray(list, AttributeType.LIST);
        SharedPreferences $r2 = issueRepositoryImpl.sharedPreferences;
        SharedPreferences.Editor $r3 = $r2.edit();
        long $l0 = System.currentTimeMillis();
        TimeUnit $r4 = TimeUnit.HOURS;
        long $l1 = $r4.toMillis(1L);
        $r3.putLong(IssueRepositoryImplKt.ISSUE_FETCH_TIME, $l0 + $l1).apply();
        LocalDataSource $r5 = issueRepositoryImpl.fileCache;
        AbstractC11688p $r6 = $r5.nukeIssueTypes();
        return $r6.m10545A(new InterfaceC11291f() { // from class: ai.kudi.agent.issues.domain.repositories.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                IssueRepositoryImpl $r1 = IssueRepositoryImpl.this;
                List $r22 = list;
                C13666w $r52 = (C13666w) obj;
                InterfaceC11692s $r32 = IssueRepositoryImpl.m39364fetchIssueTypesFromNetworkAndSave$lambda6$lambda5$lambda4($r1, $r22, $r52);
                return $r32;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchIssueTypesFromNetworkAndSave$lambda-6$lambda-5$lambda-4  reason: not valid java name */
    public static final InterfaceC11692s m39364fetchIssueTypesFromNetworkAndSave$lambda6$lambda5$lambda4(IssueRepositoryImpl issueRepositoryImpl, List list, C13666w c13666w) {
        Log_OC.getArray(issueRepositoryImpl, "this$0");
        Log_OC.getArray(list, "$list");
        Log_OC.getArray(c13666w, "it");
        LocalDataSource $r4 = issueRepositoryImpl.fileCache;
        AbstractC11688p $r2 = $r4.saveIssueTypes(list);
        return $r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getIssueDetailsByLabel$lambda-3  reason: not valid java name */
    public static final CategoryData m39365getIssueDetailsByLabel$lambda3(IssueRepositoryImpl issueRepositoryImpl, String str, List list) {
        CategoryData categoryData;
        Log_OC.getArray(issueRepositoryImpl, "this$0");
        Log_OC.getArray(str, "$label");
        Log_OC.getArray(list, "it");
        LocalDataSource $r3 = issueRepositoryImpl.fileCache;
        $r3.saveIssueDetailsWithoutCompletable(list);
        Iterator $r4 = list.iterator();
        while (true) {
            boolean $z0 = $r4.hasNext();
            if (!$z0) {
                categoryData = null;
                break;
            }
            Object $r5 = $r4.next();
            categoryData = $r5;
            CategoryData $r7 = (CategoryData) $r5;
            String $r8 = $r7.getLabel();
            boolean $z02 = Log_OC.append($r8, str);
            if ($z02) {
                break;
            }
        }
        CategoryData $r72 = categoryData;
        return $r72;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final AbstractC11688p getIssueDetailsFromDb(String str) {
        setFromDb(true);
        LocalDataSource $r2 = this.fileCache;
        AbstractC11688p $r3 = $r2.getIssueDetails(str);
        Item $r4 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r32 = $r3.h0($r4);
        Log_OC.loadImage($r32, "db.getIssueDetails(type).subscribeOn(Schedulers.io())");
        return $r32;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final AbstractC11688p getIssueDetailsFromNetworkAndSave(final String str) {
        AbstractC11688p $r3 = AbstractC11688p.m10488t(new Callable() { // from class: ai.kudi.agent.issues.domain.repositories.Preferences$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                IssueRepositoryImpl $r32 = IssueRepositoryImpl.this;
                String $r1 = str;
                InterfaceC11692s $r2 = IssueRepositoryImpl.m39366getIssueDetailsFromNetworkAndSave$lambda1($r32, $r1);
                return $r2;
            }
        });
        Item $r4 = p425j.p444e.p470j0.ClassWriter.LogError();
        return $r3.h0($r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getIssueDetailsFromNetworkAndSave$lambda-1  reason: not valid java name */
    public static final InterfaceC11692s m39366getIssueDetailsFromNetworkAndSave$lambda1(final IssueRepositoryImpl issueRepositoryImpl, final String str) {
        Log_OC.getArray(issueRepositoryImpl, "this$0");
        Log_OC.getArray(str, "$type");
        issueRepositoryImpl.setFromDb(false);
        ApiDataSource $r3 = issueRepositoryImpl.policy;
        AbstractC11677k $r4 = $r3.fetchIssueDetails(str);
        AbstractC11688p $r5 = $r4.m10577z();
        return $r5.m10545A(new InterfaceC11291f() { // from class: ai.kudi.agent.issues.domain.repositories.c
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                IssueRepositoryImpl $r1 = IssueRepositoryImpl.this;
                String $r2 = str;
                List $r52 = (List) obj;
                InterfaceC11692s $r32 = IssueRepositoryImpl.m39367getIssueDetailsFromNetworkAndSave$lambda1$lambda0($r1, $r2, $r52);
                return $r32;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getIssueDetailsFromNetworkAndSave$lambda-1$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m39367getIssueDetailsFromNetworkAndSave$lambda1$lambda0(IssueRepositoryImpl issueRepositoryImpl, String str, List list) {
        Log_OC.getArray(issueRepositoryImpl, "this$0");
        Log_OC.getArray(str, "$type");
        Log_OC.getArray(list, "it");
        LocalDataSource $r4 = issueRepositoryImpl.fileCache;
        $r4.nukeIssueDetails(str);
        LocalDataSource $r42 = issueRepositoryImpl.fileCache;
        AbstractC11688p $r2 = $r42.saveIssueDetails(list);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.domain.repositories.IssueRepository
    public AbstractC11688p getIssueDetails(String str) {
        Log_OC.getArray(str, "type");
        AbstractC11688p $r3 = getIssueDetailsFromDb(str);
        AbstractC11688p $r32 = getIssueDetailsFromNetworkAndSave(str);
        Object[] $r2 = {$r3, $r32};
        InterfaceC11692s[] r4 = (InterfaceC11692s[]) $r2;
        AbstractC11688p $r33 = AbstractC11688p.m10500n(r4);
        Log_OC.loadImage($r33, "concatArrayEager(\n            getIssueDetailsFromDb(type),\n            getIssueDetailsFromNetworkAndSave(type)\n        )");
        return $r33;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.domain.repositories.IssueRepository
    public AbstractC11688p getIssueDetailsByLabel(final String str) {
        Log_OC.getArray(str, "label");
        LocalDataSource $r2 = this.fileCache;
        AbstractC11677k $r3 = $r2.getIssueCategoryByLabel(str);
        ApiDataSource $r4 = this.policy;
        AbstractC11677k $r5 = $r4.fetchIssueDetails(WithdrawalTypes.CASH);
        AbstractC11688p $r7 = $r3.m10579x($r5.m10588o(new InterfaceC11291f() { // from class: ai.kudi.agent.issues.domain.repositories.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                IssueRepositoryImpl $r1 = IssueRepositoryImpl.this;
                String $r22 = str;
                List $r52 = (List) obj;
                CategoryData $r32 = IssueRepositoryImpl.m39365getIssueDetailsByLabel$lambda3($r1, $r22, $r52);
                return $r32;
            }
        })).m10577z();
        Log_OC.loadImage($r7, "db.getIssueCategoryByLabel(label).switchIfEmpty(\n            api.fetchIssueDetails(WithdrawalTypes.CASH).map {\n                db.saveIssueDetailsWithoutCompletable(it)\n                it.find { categoryData ->\n                    categoryData.label == label\n                }\n            }\n        ).toObservable()");
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.domain.repositories.IssueRepository
    public AbstractC11688p getIssueTypes(String str) {
        Log_OC.getArray(str, "customerType");
        AbstractC11688p $r2 = fetchIssueTypesFromNetworkAndSave(str);
        AbstractC11688p $r3 = fetchIssueTypesFromDb();
        Item $r4 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r22 = AbstractC11688p.m10530P($r2, $r3.h0($r4));
        Log_OC.loadImage($r22, "merge(\n            fetchIssueTypesFromNetworkAndSave(customerType),\n            fetchIssueTypesFromDb().subscribeOn(Schedulers.io())\n        )");
        return $r22;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.domain.repositories.IssueRepository
    public boolean isFromDb() {
        boolean z0 = this.isFromDb;
        return z0;
    }

    @Override // ai.kudi.agent.issues.domain.repositories.IssueRepository
    public void setFromDb(boolean z) {
        this.isFromDb = z;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.domain.repositories.IssueRepository
    public boolean shouldLoadIssuetypesFromNetwork() {
        long $l0 = System.currentTimeMillis();
        SharedPreferences $r1 = this.sharedPreferences;
        long $l1 = $r1.getLong(IssueRepositoryImplKt.ISSUE_FETCH_TIME, 0L);
        return $l0 > $l1;
    }
}

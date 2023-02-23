package ai.kudi.agent.transactions.presenters;

import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.issues.domain.FetchIssueType;
import ai.kudi.agent.issues.viewmodels.model.IssueTypeModelWithDuplicateChecker;
import ai.kudi.agent.transactions.views.TransactionIssueView;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: TransactionIssuePresenter.kt */
@Metadata(m10422d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001e\u0010\f\u001a\u00020\u000b2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000ej\u0002`\u0010R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/transactions/presenters/TransactionIssuePresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/transactions/views/TransactionIssueView;", "issueType", "Lai/kudi/agent/issues/domain/FetchIssueType;", "fetchUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "(Lai/kudi/agent/issues/domain/FetchIssueType;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "destroy", "", "fetchIssues", "transaction", "Ljava/util/HashMap;", "", "Lai/kudi/agent/transactions/domain/dto/Transaction;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionIssuePresenter extends C9410b<TransactionIssueView> {
    private final C11280b compositeDisposable;
    private final FetchCurrentUser fetchUser;
    private final FetchIssueType issueType;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionIssuePresenter(FetchIssueType fetchIssueType, FetchCurrentUser fetchCurrentUser) {
        Log_OC.getArray(fetchIssueType, "issueType");
        Log_OC.getArray(fetchCurrentUser, "fetchUser");
        this.issueType = fetchIssueType;
        this.fetchUser = fetchCurrentUser;
        C11280b $r3 = new C11280b();
        this.compositeDisposable = $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchIssues$lambda-0  reason: not valid java name */
    public static final void m41207fetchIssues$lambda0(TransactionIssueView transactionIssueView) {
        Log_OC.getArray(transactionIssueView, "it");
        transactionIssueView.showLoader();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchIssues$lambda-1  reason: not valid java name */
    public static final InterfaceC11692s m41208fetchIssues$lambda1(TransactionIssuePresenter transactionIssuePresenter, HashMap hashMap, User user) {
        Log_OC.getArray(transactionIssuePresenter, "this$0");
        Log_OC.getArray(hashMap, "$transaction");
        Log_OC.getArray(user, "user");
        FetchIssueType $r3 = transactionIssuePresenter.issueType;
        Object $r4 = hashMap.get("type");
        String $r5 = (String) $r4;
        if ($r5 == null) {
            $r5 = "";
        }
        Object $r42 = hashMap.get("reference");
        String $r7 = (String) $r42;
        if ($r7 == null) {
            $r7 = "";
        }
        String $r8 = user.getSessionId();
        String $r6 = $r8 != null ? $r8 : "";
        AbstractC11688p $r9 = $r3.execute($r5, $r7, $r6);
        return $r9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchIssues$lambda-3  reason: not valid java name */
    public static final void m41209fetchIssues$lambda3(TransactionIssuePresenter transactionIssuePresenter, final HashMap hashMap, final IssueTypeModelWithDuplicateChecker issueTypeModelWithDuplicateChecker) {
        Log_OC.getArray(transactionIssuePresenter, "this$0");
        Log_OC.getArray(hashMap, "$transaction");
        transactionIssuePresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.transactions.presenters.Candidate
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void copy(Object obj) {
                HashMap $r1 = hashMap;
                IssueTypeModelWithDuplicateChecker $r2 = issueTypeModelWithDuplicateChecker;
                TransactionIssueView $r4 = (TransactionIssueView) obj;
                TransactionIssuePresenter.m41210fetchIssues$lambda3$lambda2($r1, $r2, $r4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchIssues$lambda-3$lambda-2  reason: not valid java name */
    public static final void m41210fetchIssues$lambda3$lambda2(HashMap hashMap, IssueTypeModelWithDuplicateChecker issueTypeModelWithDuplicateChecker, TransactionIssueView transactionIssueView) {
        Log_OC.getArray(hashMap, "$transaction");
        Log_OC.getArray(transactionIssueView, "view");
        transactionIssueView.hideLoader();
        Log_OC.loadImage(issueTypeModelWithDuplicateChecker, "it");
        transactionIssueView.showIssues(hashMap, issueTypeModelWithDuplicateChecker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchIssues$lambda-5  reason: not valid java name */
    public static final void m41211fetchIssues$lambda5(TransactionIssuePresenter transactionIssuePresenter, Throwable th) {
        Log_OC.getArray(transactionIssuePresenter, "this$0");
        Chunk $r2 = Chunk.NEWLINE;
        transactionIssuePresenter.ifViewAttached($r2);
        th.printStackTrace();
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchIssues$lambda-5$lambda-4  reason: not valid java name */
    public static final void m41212fetchIssues$lambda5$lambda4(TransactionIssueView transactionIssueView) {
        Log_OC.getArray(transactionIssueView, "view");
        transactionIssueView.hideLoader();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.C9410b, p272h.p364d.p365a.p366c.InterfaceC9413d
    public void destroy() {
        super.destroy();
        C11280b $r1 = this.compositeDisposable;
        $r1.m11212i();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchIssues(final HashMap hashMap) {
        Log_OC.getArray(hashMap, "transaction");
        Interpreter $r2 = Interpreter.VERSION;
        ifViewAttached($r2);
        FetchCurrentUser $r3 = this.fetchUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        AbstractC11688p $r6 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.transactions.presenters.e
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                TransactionIssuePresenter $r1 = TransactionIssuePresenter.this;
                HashMap $r22 = hashMap;
                User $r5 = (User) obj;
                InterfaceC11692s $r32 = TransactionIssuePresenter.m41208fetchIssues$lambda1($r1, $r22, $r5);
                return $r32;
            }
        });
        FavoritesArrayAdapter $r9 = $r6.e0(new Object() { // from class: ai.kudi.agent.transactions.presenters.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransactionIssuePresenter $r1 = TransactionIssuePresenter.this;
                HashMap $r22 = hashMap;
                IssueTypeModelWithDuplicateChecker $r42 = (IssueTypeModelWithDuplicateChecker) obj;
                TransactionIssuePresenter.m41209fetchIssues$lambda3($r1, $r22, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.transactions.presenters.AndFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransactionIssuePresenter $r1 = TransactionIssuePresenter.this;
                Throwable $r32 = (Throwable) obj;
                TransactionIssuePresenter.m41211fetchIssues$lambda5($r1, $r32);
            }
        });
        Log_OC.loadImage($r9, "fetchUser.execute().flatMapObservable { user ->\n            issueType.execute(transaction[\"type\"] ?: \"\", transaction[\"reference\"] ?: \"\", user?.sessionId ?: \"\")\n        }.subscribe(\n            {\n                ifViewAttached { view ->\n                    view.hideLoader()\n                    view.showIssues(transaction, it)\n                }\n            },\n            {\n                ifViewAttached { view ->\n                    view.hideLoader()\n                }\n                it.printStackTrace()\n                CrashlyticsReport.logException(it)\n            }\n        )");
        C11280b $r10 = this.compositeDisposable;
        RxExtKt.addTo($r9, $r10);
    }
}

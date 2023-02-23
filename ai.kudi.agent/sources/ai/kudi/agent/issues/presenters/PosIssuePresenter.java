package ai.kudi.agent.issues.presenters;

import ai.kudi.agent.issues.domain.FetchIssueType;
import ai.kudi.agent.issues.viewmodels.model.IssueTypeModelWithDuplicateChecker;
import ai.kudi.agent.issues.views.PosIssueView;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: PosIssuePresenter.kt */
@Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0006\u0010\f\u001a\u00020\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/issues/presenters/PosIssuePresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/issues/views/PosIssueView;", "fetchIssueType", "Lai/kudi/agent/issues/domain/FetchIssueType;", "(Lai/kudi/agent/issues/domain/FetchIssueType;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "destroy", "", "getPosIssueInfo", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PosIssuePresenter extends C9410b<PosIssueView> {
    private final C11280b compositeDisposable;
    private final FetchIssueType fetchIssueType;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PosIssuePresenter(FetchIssueType fetchIssueType) {
        Log_OC.getArray(fetchIssueType, "fetchIssueType");
        this.fetchIssueType = fetchIssueType;
        C11280b $r2 = new C11280b();
        this.compositeDisposable = $r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getPosIssueInfo$lambda-0  reason: not valid java name */
    public static final void m39408getPosIssueInfo$lambda0(PosIssueView posIssueView) {
        Log_OC.getArray(posIssueView, "view");
        posIssueView.showLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getPosIssueInfo$lambda-2  reason: not valid java name */
    public static final void m39409getPosIssueInfo$lambda2(PosIssuePresenter posIssuePresenter, final IssueTypeModelWithDuplicateChecker issueTypeModelWithDuplicateChecker) {
        Log_OC.getArray(posIssuePresenter, "this$0");
        posIssuePresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.issues.presenters.Server
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void filter(Object obj) {
                IssueTypeModelWithDuplicateChecker $r1 = IssueTypeModelWithDuplicateChecker.this;
                PosIssueView $r3 = (PosIssueView) obj;
                PosIssuePresenter.m39410getPosIssueInfo$lambda2$lambda1($r1, $r3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getPosIssueInfo$lambda-2$lambda-1  reason: not valid java name */
    public static final void m39410getPosIssueInfo$lambda2$lambda1(IssueTypeModelWithDuplicateChecker issueTypeModelWithDuplicateChecker, PosIssueView posIssueView) {
        Log_OC.getArray(posIssueView, "view");
        posIssueView.hideLoading();
        List $r1 = issueTypeModelWithDuplicateChecker.getData();
        posIssueView.showIssueType($r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getPosIssueInfo$lambda-4  reason: not valid java name */
    public static final void m39411getPosIssueInfo$lambda4(PosIssuePresenter posIssuePresenter, Throwable th) {
        Log_OC.getArray(posIssuePresenter, "this$0");
        Chunk $r2 = Chunk.NEWLINE;
        posIssuePresenter.ifViewAttached($r2);
        th.printStackTrace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getPosIssueInfo$lambda-4$lambda-3  reason: not valid java name */
    public static final void m39412getPosIssueInfo$lambda4$lambda3(PosIssueView posIssueView) {
        Log_OC.getArray(posIssueView, "view");
        posIssueView.hideLoading();
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
    public final C11280b getCompositeDisposable() {
        C11280b r1 = this.compositeDisposable;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void getPosIssueInfo() {
        ImageCache $r2 = ImageCache.mImageCache;
        ifViewAttached($r2);
        FetchIssueType $r3 = this.fetchIssueType;
        AbstractC11688p $r1 = $r3.execute("pos", "", "");
        $r1.e0(new Object() { // from class: ai.kudi.agent.issues.presenters.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PosIssuePresenter $r12 = PosIssuePresenter.this;
                IssueTypeModelWithDuplicateChecker $r32 = (IssueTypeModelWithDuplicateChecker) obj;
                PosIssuePresenter.m39409getPosIssueInfo$lambda2($r12, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.issues.presenters.SocketConnector
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PosIssuePresenter $r12 = PosIssuePresenter.this;
                Throwable $r32 = (Throwable) obj;
                PosIssuePresenter.m39411getPosIssueInfo$lambda4($r12, $r32);
            }
        });
        C11280b $r6 = this.compositeDisposable;
        FavoritesArrayAdapter r9 = (FavoritesArrayAdapter) $r6;
        $r6.b(r9);
    }
}

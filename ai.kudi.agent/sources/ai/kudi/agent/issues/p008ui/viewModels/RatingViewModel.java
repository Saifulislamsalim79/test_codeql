package ai.kudi.agent.issues.p008ui.viewModels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.issues.data.IssueRatingRequest;
import ai.kudi.agent.issues.data.RatingResponse;
import ai.kudi.agent.issues.domain.RateIssue;
import ai.kudi.agent.issues.p008ui.viewModels.data.RatingViewData;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import androidx.lifecycle.Extension;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11680b;
/* compiled from: RatingViewModel.kt */
@Metadata(m10422d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0016\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m10421d2 = {"Lai/kudi/agent/issues/ui/viewModels/RatingViewModel;", "Landroidx/lifecycle/ViewModel;", "rateIssue", "Lai/kudi/agent/issues/domain/RateIssue;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/issues/domain/RateIssue;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/analytics/Analytics;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "issueRatingViewData", "Lio/reactivex/subjects/PublishSubject;", "Lai/kudi/agent/issues/ui/viewModels/data/RatingViewData;", "getIssueRatingViewData", "()Lio/reactivex/subjects/PublishSubject;", "logIssueRating", "", "rating", "", "ticketId", "", "point", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.viewModels.RatingViewModel */
/* loaded from: classes.dex */
public final class RatingViewModel extends Extension {
    private final Analytics analytics;
    private final C11280b compositeDisposable;
    private final FetchCurrentUser currentUser;
    private final C11680b<RatingViewData> issueRatingViewData;
    private final RateIssue rateIssue;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public RatingViewModel(RateIssue rateIssue, FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        Log_OC.getArray(rateIssue, "rateIssue");
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        Log_OC.getArray(analytics, "analytics");
        this.rateIssue = rateIssue;
        this.currentUser = fetchCurrentUser;
        this.analytics = analytics;
        C11680b $r2 = C11680b.m10564v0();
        Log_OC.loadImage($r2, "create()");
        this.issueRatingViewData = $r2;
        C11280b $r5 = new C11280b();
        this.compositeDisposable = $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void logIssueRating(final int i) {
        FetchCurrentUser $r1 = this.currentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.issues.ui.viewModels.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                RatingViewModel $r12 = RatingViewModel.this;
                int $i0 = i;
                User $r3 = (User) obj;
                RatingViewModel.m39548logIssueRating$lambda2($r12, $i0, $r3);
            }
        };
        ImageCache $r4 = ImageCache.mImageCache;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        Log_OC.loadImage($r5, "currentUser.execute().subscribe(\n            {\n                analytics.onIssueRated(it.phoneNumber, rating)\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r6 = this.compositeDisposable;
        RxExtKt.addTo($r5, $r6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: logIssueRating$lambda-2  reason: not valid java name */
    public static final void m39548logIssueRating$lambda2(RatingViewModel ratingViewModel, int i, User user) {
        Log_OC.getArray(ratingViewModel, "this$0");
        Analytics $r3 = ratingViewModel.analytics;
        String $r0 = user.getPhoneNumber();
        Log_OC.loadImage($r0, "it.phoneNumber");
        $r3.onIssueRated($r0, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: rateIssue$lambda-0  reason: not valid java name */
    public static final void m39550rateIssue$lambda0(RatingViewModel ratingViewModel, int i, RatingResponse ratingResponse) {
        Log_OC.getArray(ratingViewModel, "this$0");
        ratingViewModel.logIssueRating(i);
        C11680b $r0 = ratingViewModel.getIssueRatingViewData();
        RatingViewData.IssueRated $r3 = new RatingViewData.IssueRated(i);
        $r0.mo331f($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: rateIssue$lambda-1  reason: not valid java name */
    public static final void m39551rateIssue$lambda1(RatingViewModel ratingViewModel, Throwable th) {
        Log_OC.getArray(ratingViewModel, "this$0");
        C11680b $r2 = ratingViewModel.getIssueRatingViewData();
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "err");
        Object $r5 = $r4.invoke(th);
        String $r6 = (String) $r5;
        RatingViewData.Error $r3 = new RatingViewData.Error($r6);
        $r2.mo331f($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C11680b getIssueRatingViewData() {
        C11680b r1 = this.issueRatingViewData;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void rateIssue(String str, final int i) {
        Log_OC.getArray(str, "ticketId");
        C11680b $r2 = this.issueRatingViewData;
        RatingViewData.Loading $r3 = RatingViewData.Loading.INSTANCE;
        $r2.mo331f($r3);
        RateIssue $r4 = this.rateIssue;
        IssueRatingRequest $r5 = new IssueRatingRequest(null, i, 1, null);
        AbstractC11688p $r6 = $r4.execute(str, $r5);
        FavoritesArrayAdapter $r9 = $r6.e0(new Object() { // from class: ai.kudi.agent.issues.ui.viewModels.SocketConnector
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                RatingViewModel $r1 = RatingViewModel.this;
                int $i0 = i;
                RatingResponse $r32 = (RatingResponse) obj;
                RatingViewModel.m39550rateIssue$lambda0($r1, $i0, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.issues.ui.viewModels.Property
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                RatingViewModel $r1 = RatingViewModel.this;
                Throwable $r32 = (Throwable) obj;
                RatingViewModel.m39551rateIssue$lambda1($r1, $r32);
            }
        });
        Log_OC.loadImage($r9, "rateIssue.execute(\n            ticketId,\n            IssueRatingRequest(\n                point = point\n            )\n        ).subscribe(\n            {\n                logIssueRating(point)\n                issueRatingViewData.onNext(RatingViewData.IssueRated(point))\n            },\n            { err ->\n                issueRatingViewData.onNext(RatingViewData.Error(parseHttpError2()(err)))\n            }\n        )");
        C11280b $r10 = this.compositeDisposable;
        RxExtKt.addTo($r9, $r10);
    }
}

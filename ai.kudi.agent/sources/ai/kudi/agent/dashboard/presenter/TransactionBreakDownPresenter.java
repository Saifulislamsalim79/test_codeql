package ai.kudi.agent.dashboard.presenter;

import ai.kudi.agent.dashboard.domain.usecases.TransactionBreakDownSummary;
import ai.kudi.agent.dashboard.view.TransactionBreakdownView;
import ai.kudi.agent.filter.domain.FilteredDate;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13727r0;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: TransactionBreakDownPresenter.kt */
@Metadata(m10422d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\rH\u0002J\u0006\u0010\u0012\u001a\u00020\rJ\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m10421d2 = {"Lai/kudi/agent/dashboard/presenter/TransactionBreakDownPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/dashboard/view/TransactionBreakdownView;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "transactionBreakDownSummary", "Lai/kudi/agent/dashboard/domain/usecases/TransactionBreakDownSummary;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/dashboard/domain/usecases/TransactionBreakDownSummary;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "destroy", "", "displayBreakdowns", "filteredDate", "Lai/kudi/agent/filter/domain/FilteredDate;", "hideErrorLayout", "hideProgress", "processBreakDownList", "", "Lai/kudi/agent/dashboard/domain/model/TransactionBreakDownDomain;", AttributeType.LIST, "showError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "", "showProgress", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionBreakDownPresenter extends C9410b<TransactionBreakdownView> {
    private final C11280b compositeDisposable;
    private final FetchCurrentUser fetchCurrentUser;
    private final TransactionBreakDownSummary transactionBreakDownSummary;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionBreakDownPresenter(FetchCurrentUser fetchCurrentUser, TransactionBreakDownSummary transactionBreakDownSummary) {
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(transactionBreakDownSummary, "transactionBreakDownSummary");
        this.fetchCurrentUser = fetchCurrentUser;
        this.transactionBreakDownSummary = transactionBreakDownSummary;
        C11280b $r3 = new C11280b();
        this.compositeDisposable = $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: displayBreakdowns$lambda-4  reason: not valid java name */
    public static final InterfaceC11692s m39221displayBreakdowns$lambda4(TransactionBreakDownPresenter transactionBreakDownPresenter, Map map, User user) {
        Log_OC.getArray(transactionBreakDownPresenter, "this$0");
        Log_OC.getArray(map, "$query");
        Log_OC.getArray(user, "user");
        TransactionBreakDownSummary $r3 = transactionBreakDownPresenter.transactionBreakDownSummary;
        String $r4 = user.getSessionId();
        Log_OC.loadImage($r4, "user.sessionId");
        AbstractC11688p $r5 = $r3.execute($r4, map);
        return $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: displayBreakdowns$lambda-6  reason: not valid java name */
    public static final void m39222displayBreakdowns$lambda6(final TransactionBreakDownPresenter transactionBreakDownPresenter, final List list) {
        Log_OC.getArray(transactionBreakDownPresenter, "this$0");
        transactionBreakDownPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.dashboard.presenter.AnnotationWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void getSize(Object obj) {
                TransactionBreakDownPresenter $r1 = TransactionBreakDownPresenter.this;
                List $r2 = list;
                TransactionBreakdownView $r4 = (TransactionBreakdownView) obj;
                TransactionBreakDownPresenter.m39223displayBreakdowns$lambda6$lambda5($r1, $r2, $r4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: displayBreakdowns$lambda-6$lambda-5  reason: not valid java name */
    public static final void m39223displayBreakdowns$lambda6$lambda5(TransactionBreakDownPresenter transactionBreakDownPresenter, List list, TransactionBreakdownView transactionBreakdownView) {
        Log_OC.getArray(transactionBreakDownPresenter, "this$0");
        Log_OC.getArray(transactionBreakdownView, "view");
        transactionBreakdownView.hideProgress();
        Log_OC.loadImage(list, AttributeType.LIST);
        List $r0 = transactionBreakDownPresenter.processBreakDownList(list);
        transactionBreakdownView.displayBreakdown($r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: displayBreakdowns$lambda-8  reason: not valid java name */
    public static final void m39224displayBreakdowns$lambda8(TransactionBreakDownPresenter transactionBreakDownPresenter, final Throwable th) {
        Log_OC.getArray(transactionBreakDownPresenter, "this$0");
        th.printStackTrace();
        transactionBreakDownPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.dashboard.presenter.Attribute
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                Throwable $r1 = th;
                TransactionBreakdownView $r3 = (TransactionBreakdownView) obj;
                TransactionBreakDownPresenter.m39225displayBreakdowns$lambda8$lambda7($r1, $r3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: displayBreakdowns$lambda-8$lambda-7  reason: not valid java name */
    public static final void m39225displayBreakdowns$lambda8$lambda7(Throwable th, TransactionBreakdownView transactionBreakdownView) {
        Log_OC.getArray(transactionBreakdownView, "view");
        transactionBreakdownView.hideProgress();
        InterfaceC11767l $r2 = KudiErrorParserKt.parseHttpError2$default("Something went wrong. Please try again", null, 2, null);
        Log_OC.loadImage(th, "err");
        Object $r3 = $r2.invoke(th);
        String $r4 = (String) $r3;
        transactionBreakdownView.showErrorLayout($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void hideErrorLayout() {
        Format $r1 = Format.THREAD;
        ifViewAttached($r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hideErrorLayout$lambda-3  reason: not valid java name */
    public static final void m39226hideErrorLayout$lambda3(TransactionBreakdownView transactionBreakdownView) {
        Log_OC.getArray(transactionBreakdownView, "view");
        transactionBreakdownView.hideErrorLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hideProgress$lambda-0  reason: not valid java name */
    public static final void m39227hideProgress$lambda0(TransactionBreakdownView transactionBreakdownView) {
        Log_OC.getArray(transactionBreakdownView, "view");
        transactionBreakdownView.hideProgress();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List processBreakDownList(java.util.List r11) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.dashboard.presenter.TransactionBreakDownPresenter.processBreakDownList(java.util.List):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showError$lambda-1  reason: not valid java name */
    public static final void m39228showError$lambda1(String str, TransactionBreakdownView transactionBreakdownView) {
        Log_OC.getArray(str, "$error");
        Log_OC.getArray(transactionBreakdownView, "view");
        transactionBreakdownView.showErrorLayout(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showProgress$lambda-2  reason: not valid java name */
    public static final void m39229showProgress$lambda2(TransactionBreakdownView transactionBreakdownView) {
        Log_OC.getArray(transactionBreakdownView, "view");
        transactionBreakdownView.showProgress();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.C9410b, p272h.p364d.p365a.p366c.InterfaceC9413d
    public void destroy() {
        super.destroy();
        C11280b $r1 = this.compositeDisposable;
        $r1.m11214d();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void displayBreakdowns(FilteredDate filteredDate) {
        final Map $r6;
        Log_OC.getArray(filteredDate, "filteredDate");
        Date $r3 = filteredDate.getTo();
        String $r4 = $r3.toString();
        C13287o $r5 = C13664u.m4227a("to", $r4);
        Date $r32 = filteredDate.getFrom();
        String $r42 = $r32.toString();
        C13287o $r52 = C13664u.m4227a("from", $r42);
        C13287o[] $r2 = {$r5, $r52};
        $r6 = C13727r0.m3878n($r2);
        showProgress();
        hideErrorLayout();
        FetchCurrentUser $r7 = this.fetchCurrentUser;
        AbstractC11696w $r8 = FetchCurrentUser.execute$default($r7, null, null, 3, null);
        AbstractC11688p $r10 = $r8.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.dashboard.presenter.c
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                TransactionBreakDownPresenter $r1 = TransactionBreakDownPresenter.this;
                Map $r22 = $r6;
                User $r53 = (User) obj;
                InterfaceC11692s $r33 = TransactionBreakDownPresenter.m39221displayBreakdowns$lambda4($r1, $r22, $r53);
                return $r33;
            }
        });
        FavoritesArrayAdapter $r13 = $r10.e0(new Object() { // from class: ai.kudi.agent.dashboard.presenter.InBandBytestreamSession$IBBDataPacketFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransactionBreakDownPresenter $r1 = TransactionBreakDownPresenter.this;
                List $r33 = (List) obj;
                TransactionBreakDownPresenter.m39222displayBreakdowns$lambda6($r1, $r33);
            }
        }, new Object() { // from class: ai.kudi.agent.dashboard.presenter.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransactionBreakDownPresenter $r1 = TransactionBreakDownPresenter.this;
                Throwable $r33 = (Throwable) obj;
                TransactionBreakDownPresenter.m39224displayBreakdowns$lambda8($r1, $r33);
            }
        });
        C11280b $r14 = this.compositeDisposable;
        $r14.b($r13);
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
    public final void hideProgress() {
        Logger $r1 = Logger.log;
        ifViewAttached($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showError(final String str) {
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.dashboard.presenter.Parser
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void parse(Object obj) {
                String $r1 = str;
                TransactionBreakdownView $r3 = (TransactionBreakdownView) obj;
                TransactionBreakDownPresenter.m39228showError$lambda1($r1, $r3);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showProgress() {
        Version $r1 = Version.VERSION;
        ifViewAttached($r1);
    }
}

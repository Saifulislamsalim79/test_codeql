package ai.kudi.agent.dashboard.presenter;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.analytics.EventType;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.dashboard.domain.fht.DashboardSummaryDto;
import ai.kudi.agent.dashboard.domain.usecases.DashboardSummary;
import ai.kudi.agent.dashboard.view.DashboardView;
import ai.kudi.agent.filter.domain.FilteredDate;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import java.util.Date;
import java.util.Map;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.Metadata;
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
/* compiled from: DashboardPresenter.kt */
@Metadata(m10422d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u000e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#J\u0016\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0011J\u0006\u0010(\u001a\u00020\u001dJ\u0006\u0010)\u001a\u00020\u001dJ\u0006\u0010*\u001a\u00020\u001dJ\u0006\u0010+\u001a\u00020\u001dJ\u000e\u0010,\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&J\b\u0010-\u001a\u00020\u001dH\u0002J\b\u0010.\u001a\u00020\u001dH\u0002J\b\u0010/\u001a\u00020\u001dH\u0002J\u0006\u00100\u001a\u00020\u001dJ\b\u00101\u001a\u00020\u001dH\u0002R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u00062"}, m10421d2 = {"Lai/kudi/agent/dashboard/presenter/DashboardPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/dashboard/view/DashboardView;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "dashboardSummary", "Lai/kudi/agent/dashboard/domain/usecases/DashboardSummary;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/dashboard/domain/usecases/DashboardSummary;Lai/kudi/agent/core/analytics/Analytics;)V", "getAnalytics", "()Lai/kudi/agent/core/analytics/Analytics;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getFetchCurrentUser", "()Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "phoneNumber", "", "getPhoneNumber", "()Ljava/lang/String;", "setPhoneNumber", "(Ljava/lang/String;)V", "user", "Lai/kudi/agent/users/domain/dto/User;", "getUser", "()Lai/kudi/agent/users/domain/dto/User;", "setUser", "(Lai/kudi/agent/users/domain/dto/User;)V", "destroy", "", "displayTotalAmountProcessed", TransactionField.AMOUNT, "", "displayTotalCount", "count", "", "fetchDashboardSummary", "filteredDate", "Lai/kudi/agent/filter/domain/FilteredDate;", "appVersionCode", "hideProgressBar", "navigateToFundWallet", "navigateToHelpPage", "navigateToPlayStore", "navigateToTransactionBreakDownPage", "onApplyFilterClicked", "onDateFilterViewClicked", "onViewBreakDownClicked", "showDialog", "showProgressBar", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class DashboardPresenter extends C9410b<DashboardView> {
    private final Analytics analytics;
    private final C11280b compositeDisposable;
    private final DashboardSummary dashboardSummary;
    private final FetchCurrentUser fetchCurrentUser;
    private String phoneNumber;
    private User user;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public DashboardPresenter(FetchCurrentUser fetchCurrentUser, DashboardSummary dashboardSummary, Analytics analytics) {
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(dashboardSummary, "dashboardSummary");
        Log_OC.getArray(analytics, "analytics");
        this.fetchCurrentUser = fetchCurrentUser;
        this.dashboardSummary = dashboardSummary;
        this.analytics = analytics;
        C11280b $r4 = new C11280b();
        this.compositeDisposable = $r4;
        this.phoneNumber = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: displayTotalAmountProcessed$lambda-5  reason: not valid java name */
    public static final void m39206displayTotalAmountProcessed$lambda5(double d, DashboardView dashboardView) {
        Log_OC.getArray(dashboardView, "view");
        dashboardView.displayTotalAmountProcessed(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: displayTotalCount$lambda-4  reason: not valid java name */
    public static final void m39207displayTotalCount$lambda4(int i, DashboardView dashboardView) {
        Log_OC.getArray(dashboardView, "view");
        dashboardView.displayTotalCountProcessed(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchDashboardSummary$lambda-11  reason: not valid java name */
    public static final void m39208fetchDashboardSummary$lambda11(final DashboardPresenter dashboardPresenter, final DashboardSummaryDto dashboardSummaryDto) {
        Log_OC.getArray(dashboardPresenter, "this$0");
        dashboardPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.dashboard.presenter.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: d */
            public final void m38915d(Object obj) {
                DashboardPresenter $r1 = DashboardPresenter.this;
                DashboardSummaryDto $r2 = dashboardSummaryDto;
                DashboardView $r4 = (DashboardView) obj;
                DashboardPresenter.m39209fetchDashboardSummary$lambda11$lambda10($r1, $r2, $r4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchDashboardSummary$lambda-11$lambda-10  reason: not valid java name */
    public static final void m39209fetchDashboardSummary$lambda11$lambda10(DashboardPresenter dashboardPresenter, DashboardSummaryDto dashboardSummaryDto, DashboardView dashboardView) {
        Log_OC.getArray(dashboardPresenter, "this$0");
        Log_OC.getArray(dashboardView, "view");
        dashboardPresenter.onApplyFilterClicked();
        dashboardView.hideProgress();
        boolean $z0 = dashboardSummaryDto.isWalletBalanceLow();
        dashboardView.toggleFundWalletView($z0);
        User $r3 = dashboardPresenter.getUser();
        dashboardView.displayFundWalletInfo($r3);
        int $i0 = dashboardSummaryDto.getTotalTransactionCount();
        dashboardView.displayTotalCountProcessed($i0);
        double $d0 = dashboardSummaryDto.getTotalTransactionsValue();
        dashboardView.displayTotalAmountProcessed($d0);
        boolean $z02 = dashboardSummaryDto.isAppVersionUpToDate();
        dashboardView.toggleUpdateAppView(!$z02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchDashboardSummary$lambda-13  reason: not valid java name */
    public static final void m39210fetchDashboardSummary$lambda13(DashboardPresenter dashboardPresenter, Throwable th) {
        Log_OC.getArray(dashboardPresenter, "this$0");
        th.printStackTrace();
        C0211f $r2 = C0211f.f250o;
        dashboardPresenter.ifViewAttached($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchDashboardSummary$lambda-13$lambda-12  reason: not valid java name */
    public static final void m39211fetchDashboardSummary$lambda13$lambda12(DashboardView dashboardView) {
        Log_OC.getArray(dashboardView, "view");
        dashboardView.hideProgress();
        dashboardView.showError("Something went wrong. Please try again by refreshing");
        dashboardView.toggleFundWalletView(false);
        dashboardView.toggleUpdateAppView(false);
        dashboardView.displayTotalAmountProcessed(0.0d);
        dashboardView.displayTotalCountProcessed(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchDashboardSummary$lambda-9  reason: not valid java name */
    public static final InterfaceC11692s m39212fetchDashboardSummary$lambda9(DashboardPresenter dashboardPresenter, Map map, User user) {
        Log_OC.getArray(dashboardPresenter, "this$0");
        Log_OC.getArray(map, "$queryMap");
        Log_OC.getArray(user, "it");
        dashboardPresenter.setPhoneNumber(user.getPhoneNumber());
        dashboardPresenter.setUser(user);
        DashboardSummary $r4 = dashboardPresenter.dashboardSummary;
        String $r3 = user.getSessionId();
        Log_OC.loadImage($r3, "it.sessionId");
        AbstractC11688p $r5 = $r4.execute($r3, map);
        return $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hideProgressBar$lambda-7  reason: not valid java name */
    public static final void m39213hideProgressBar$lambda7(DashboardView dashboardView) {
        Log_OC.getArray(dashboardView, "view");
        dashboardView.hideProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: navigateToFundWallet$lambda-1  reason: not valid java name */
    public static final void m39214navigateToFundWallet$lambda1(DashboardView dashboardView) {
        Log_OC.getArray(dashboardView, "view");
        dashboardView.navigateToFundWalletPage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: navigateToHelpPage$lambda-3  reason: not valid java name */
    public static final void m39215navigateToHelpPage$lambda3(DashboardView dashboardView) {
        Log_OC.getArray(dashboardView, "view");
        dashboardView.navigateToHelpPage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: navigateToPlayStore$lambda-2  reason: not valid java name */
    public static final void m39216navigateToPlayStore$lambda2(DashboardView dashboardView) {
        Log_OC.getArray(dashboardView, "view");
        dashboardView.updateApp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: navigateToTransactionBreakDownPage$lambda-8  reason: not valid java name */
    public static final void m39217navigateToTransactionBreakDownPage$lambda8(FilteredDate filteredDate, DashboardView dashboardView) {
        Log_OC.getArray(filteredDate, "$filteredDate");
        Log_OC.getArray(dashboardView, "view");
        dashboardView.navigateToTransactionBreakDownPage(filteredDate);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onApplyFilterClicked() {
        Analytics $r1 = this.analytics;
        EventType.DashboardParameters $r4 = EventType.DashboardParameters.APPLY_FILTER_DATE_BUTTON_CLICKED;
        String $r3 = String.valueOf($r4);
        User $r2 = this.user;
        $r1.onDashboardEvent($r3, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onDateFilterViewClicked() {
        Analytics $r1 = this.analytics;
        EventType.DashboardParameters $r4 = EventType.DashboardParameters.DATE_TO_FILTER_CLICKED;
        String $r3 = String.valueOf($r4);
        User $r2 = this.user;
        $r1.onDashboardEvent($r3, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onViewBreakDownClicked() {
        Analytics $r1 = this.analytics;
        EventType.DashboardParameters $r4 = EventType.DashboardParameters.VIEW_BREAKDOWN_CLICKED;
        String $r3 = String.valueOf($r4);
        User $r2 = this.user;
        $r1.onDashboardEvent($r3, $r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showDialog$lambda-0  reason: not valid java name */
    public static final void m39218showDialog$lambda0(DashboardView dashboardView) {
        Log_OC.getArray(dashboardView, "view");
        dashboardView.showFilterDialog();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showProgressBar() {
        Cache $r1 = Cache.cache;
        ifViewAttached($r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showProgressBar$lambda-6  reason: not valid java name */
    public static final void m39219showProgressBar$lambda6(DashboardView dashboardView) {
        Log_OC.getArray(dashboardView, "view");
        dashboardView.showProgress();
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
    public final void displayTotalAmountProcessed(final double d) {
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.dashboard.presenter.MainActivity$13
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void onDismiss(Object obj) {
                double $d0 = d;
                DashboardView $r2 = (DashboardView) obj;
                DashboardPresenter.m39206displayTotalAmountProcessed$lambda5($d0, $r2);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void displayTotalCount(final int i) {
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.dashboard.presenter.FieldWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void getSize(Object obj) {
                int $i0 = i;
                DashboardView $r2 = (DashboardView) obj;
                DashboardPresenter.m39207displayTotalCount$lambda4($i0, $r2);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchDashboardSummary(FilteredDate filteredDate, String str) {
        final Map $r7;
        Log_OC.getArray(filteredDate, "filteredDate");
        Log_OC.getArray(str, "appVersionCode");
        showProgressBar();
        Date $r4 = filteredDate.getTo();
        String $r5 = DateExtKt.convertDateToGivenFormat($r4, "yyyy-MM-dd HH:mm:ss");
        C13287o $r6 = C13664u.m4227a("to", $r5);
        Date $r42 = filteredDate.getFrom();
        String $r52 = DateExtKt.convertDateToGivenFormat($r42, "yyyy-MM-dd HH:mm:ss");
        C13287o $r62 = C13664u.m4227a("from", $r52);
        C13287o $r63 = C13664u.m4227a("appVersionCode", str);
        C13287o[] $r1 = {$r6, $r62, $r63};
        $r7 = C13727r0.m3878n($r1);
        FetchCurrentUser $r8 = this.fetchCurrentUser;
        AbstractC11696w $r9 = FetchCurrentUser.execute$default($r8, null, null, 3, null);
        AbstractC11688p $r11 = $r9.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.dashboard.presenter.ByteVector
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                DashboardPresenter $r12 = DashboardPresenter.this;
                Map $r2 = $r7;
                User $r53 = (User) obj;
                InterfaceC11692s $r3 = DashboardPresenter.m39212fetchDashboardSummary$lambda9($r12, $r2, $r53);
                return $r3;
            }
        });
        FavoritesArrayAdapter $r14 = $r11.e0(new Object() { // from class: ai.kudi.agent.dashboard.presenter.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                DashboardPresenter $r12 = DashboardPresenter.this;
                DashboardSummaryDto $r3 = (DashboardSummaryDto) obj;
                DashboardPresenter.m39208fetchDashboardSummary$lambda11($r12, $r3);
            }
        }, new Object() { // from class: ai.kudi.agent.dashboard.presenter.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                DashboardPresenter $r12 = DashboardPresenter.this;
                Throwable $r3 = (Throwable) obj;
                DashboardPresenter.m39210fetchDashboardSummary$lambda13($r12, $r3);
            }
        });
        Log_OC.loadImage($r14, "fetchCurrentUser.execute()\n            .flatMapObservable {\n                phoneNumber = it.phoneNumber\n                user = it\n                dashboardSummary.execute(it.sessionId, queryMap)\n            }\n            .subscribe({ summary ->\n                ifViewAttached { view ->\n                    //                        log event\n                    onApplyFilterClicked()\n\n                    view.hideProgress()\n\n//                        wallet info\n                    view.toggleFundWalletView(summary.isWalletBalanceLow)\n                    view.displayFundWalletInfo(user)\n\n//                        transaction count\n                    view.displayTotalCountProcessed(summary.totalTransactionCount)\n\n//                        transaction processed\n                    view.displayTotalAmountProcessed(summary.totalTransactionsValue)\n\n//                        display update option when flag is false otherwise hide\n                    view.toggleUpdateAppView(!summary.isAppVersionUpToDate)\n                }\n            }, { err ->\n                err.printStackTrace()\n                ifViewAttached { view ->\n                    view.hideProgress()\n                    view.showError(\n                        \"Something went wrong. Please try again by refreshing\"\n                    )\n\n//                        display default values when there is interruption in connection\n                    view.toggleFundWalletView(false)\n                    view.toggleUpdateAppView(false)\n                    view.displayTotalAmountProcessed(0.0)\n                    view.displayTotalCountProcessed(0)\n                }\n            })");
        C11280b $r15 = this.compositeDisposable;
        RxExtKt.addTo($r14, $r15);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Analytics getAnalytics() {
        Analytics r1 = this.analytics;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FetchCurrentUser getFetchCurrentUser() {
        FetchCurrentUser r1 = this.fetchCurrentUser;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getPhoneNumber() {
        String r1 = this.phoneNumber;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final User getUser() {
        User r1 = this.user;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void hideProgressBar() {
        FlurryAdSize $r1 = FlurryAdSize.BANNER_TOP;
        ifViewAttached($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToFundWallet() {
        Log $r1 = Log.LOG;
        ifViewAttached($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToHelpPage() {
        Compression $r1 = Compression.METADATA;
        ifViewAttached($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToPlayStore() {
        ClassWriter $r1 = ClassWriter.f242b;
        ifViewAttached($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToTransactionBreakDownPage(final FilteredDate filteredDate) {
        Log_OC.getArray(filteredDate, "filteredDate");
        onViewBreakDownClicked();
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.dashboard.presenter.ModulusCheckDigit
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void calculate(Object obj) {
                FilteredDate $r1 = FilteredDate.this;
                DashboardView $r3 = (DashboardView) obj;
                DashboardPresenter.m39217navigateToTransactionBreakDownPage$lambda8($r1, $r3);
            }
        });
    }

    public final void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public final void setUser(User user) {
        this.user = user;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showDialog() {
        onDateFilterViewClicked();
        DavPropertyName $r1 = DavPropertyName.name;
        ifViewAttached($r1);
    }
}

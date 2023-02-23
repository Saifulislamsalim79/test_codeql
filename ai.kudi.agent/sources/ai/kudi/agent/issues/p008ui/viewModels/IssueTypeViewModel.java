package ai.kudi.agent.issues.p008ui.viewModels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.analytics.contracts.IssueResolutionAnalyticsKt;
import ai.kudi.agent.core.domain.room_entities.IssueCategory;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.issues.domain.FetchIssueCategories;
import ai.kudi.agent.issues.navigators.IssueTypeHomeNavigator;
import ai.kudi.agent.issues.p008ui.viewModels.data.IssueTypeViewData;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: IssueTypeViewModel.kt */
@Metadata(m10422d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0010J\u0016\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m10421d2 = {"Lai/kudi/agent/issues/ui/viewModels/IssueTypeViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/issues/ui/viewModels/data/IssueTypeViewData;", "issueTypeNavigator", "Lai/kudi/agent/issues/navigators/IssueTypeHomeNavigator;", "fetchIssueCategories", "Lai/kudi/agent/issues/domain/FetchIssueCategories;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/issues/navigators/IssueTypeHomeNavigator;Lai/kudi/agent/issues/domain/FetchIssueCategories;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/analytics/Analytics;)V", "initialData", "logOnSupportButtonClicked", "", TransactionField.STATUS, "", "navigateToNextFragment", TransactionBreakDownItemType.DATA, "Lai/kudi/agent/core/domain/room_entities/IssueCategory;", OpsMetricTracker.START, "customerType", "startWithData", "parentData", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.viewModels.IssueTypeViewModel */
/* loaded from: classes.dex */
public final class IssueTypeViewModel extends BaseViewModel<IssueTypeViewData> {
    private final Analytics analytics;
    private final FetchCurrentUser fetchCurrentUser;
    private final FetchIssueCategories fetchIssueCategories;
    private final IssueTypeHomeNavigator issueTypeNavigator;

    public IssueTypeViewModel(IssueTypeHomeNavigator issueTypeHomeNavigator, FetchIssueCategories fetchIssueCategories, FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        Log_OC.getArray(issueTypeHomeNavigator, "issueTypeNavigator");
        Log_OC.getArray(fetchIssueCategories, "fetchIssueCategories");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(analytics, "analytics");
        this.issueTypeNavigator = issueTypeHomeNavigator;
        this.fetchIssueCategories = fetchIssueCategories;
        this.fetchCurrentUser = fetchCurrentUser;
        this.analytics = analytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: logOnSupportButtonClicked$lambda-3  reason: not valid java name */
    public static final void m39537logOnSupportButtonClicked$lambda3(IssueTypeViewModel issueTypeViewModel, String str, User user) {
        Log_OC.getArray(issueTypeViewModel, "this$0");
        Log_OC.getArray(str, "$status");
        Analytics $r4 = issueTypeViewModel.analytics;
        String $r1 = user.getPhoneNumber();
        Log_OC.loadImage($r1, "it.phoneNumber");
        $r4.onSupportButtonClicked($r1, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:6:0x0038 */
    /* renamed from: start$lambda-1  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m39539start$lambda1(ai.kudi.agent.issues.p008ui.viewModels.IssueTypeViewModel r25, java.util.List r26) {
        /*
            java.lang.String r7 = "this$0"
            r0 = r25
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r7)
            java.lang.String r7 = "Success"
            r0 = r25
            r0.logOnSupportButtonClicked(r7)
            java.lang.String r7 = "it"
            r0 = r26
            kotlin.p483e0.p485d.Log_OC.loadImage(r0, r7)
            r0 = r26
            boolean r8 = r0.isEmpty()
            r9 = 1
            r8 = r8 ^ r9
            if (r8 == 0) goto L76
            r0 = r25
            ai.kudi.agent.core.mvvm.ViewData r10 = r0.getState()
            r12 = r10
            ai.kudi.agent.issues.ui.viewModels.data.IssueTypeViewData r12 = (ai.kudi.agent.issues.p008ui.viewModels.data.IssueTypeViewData) r12
            r11 = r12
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r0 = r26
            java.util.Iterator r14 = r0.iterator()
        L34:
            boolean r8 = r14.hasNext()
            if (r8 == 0) goto L58
            java.lang.Object r15 = r14.next()
            r17 = r15
            ai.kudi.agent.core.domain.room_entities.IssueCategory r17 = (ai.kudi.agent.core.domain.room_entities.IssueCategory) r17
            r16 = r17
            r0 = r16
            int r18 = r0.getParentIndex()
            r9 = -1
            r0 = r18
            if (r0 != r9) goto L51
            r8 = 1
            goto L52
        L51:
            r8 = 0
        L52:
            if (r8 == 0) goto L34
            r13.add(r15)
            goto L34
        L58:
            r9 = 0
            r19 = 0
            r20 = 0
            r21 = 12
            r22 = 0
            r0 = r11
            r1 = r9
            r2 = r13
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            ai.kudi.agent.issues.ui.viewModels.data.IssueTypeViewData r11 = ai.kudi.agent.issues.p008ui.viewModels.data.IssueTypeViewData.copy$default(r0, r1, r2, r3, r4, r5, r6)
            r0 = r25
            r0.publish(r11)
            return
        L76:
            r0 = r25
            ai.kudi.agent.issues.domain.FetchIssueCategories r0 = r0.fetchIssueCategories
            r23 = r0
            boolean r8 = r0.getIsFromDb()
            if (r8 == 0) goto Lac
            r0 = r25
            ai.kudi.agent.core.mvvm.ViewData r10 = r0.getState()
            r24 = r10
            ai.kudi.agent.issues.ui.viewModels.data.IssueTypeViewData r24 = (ai.kudi.agent.issues.p008ui.viewModels.data.IssueTypeViewData) r24
            r11 = r24
            r9 = 0
            r19 = 0
            r20 = 0
            r21 = 12
            r22 = 0
            r0 = r11
            r1 = r9
            r2 = r26
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            ai.kudi.agent.issues.ui.viewModels.data.IssueTypeViewData r11 = ai.kudi.agent.issues.p008ui.viewModels.data.IssueTypeViewData.copy$default(r0, r1, r2, r3, r4, r5, r6)
            r0 = r25
            r0.publish(r11)
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.issues.p008ui.viewModels.IssueTypeViewModel.m39539start$lambda1(ai.kudi.agent.issues.ui.viewModels.IssueTypeViewModel, java.util.List):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: start$lambda-2  reason: not valid java name */
    public static final void m39540start$lambda2(IssueTypeViewModel issueTypeViewModel, Throwable th) {
        Log_OC.getArray(issueTypeViewModel, "this$0");
        issueTypeViewModel.logOnSupportButtonClicked(IssueResolutionAnalyticsKt.STATUS_FAILURE);
        ViewData $r3 = issueTypeViewModel.getState();
        IssueTypeViewData $r4 = (IssueTypeViewData) $r3;
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default("Something went wrong", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        IssueTypeViewData.Error $r1 = new IssueTypeViewData.Error((String) $r6);
        issueTypeViewModel.publish(IssueTypeViewData.copy$default($r4, false, null, false, $r1, 6, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x002e */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002a A[SYNTHETIC] */
    /* renamed from: startWithData$lambda-6  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m39541startWithData$lambda6(ai.kudi.agent.issues.p008ui.viewModels.IssueTypeViewModel r24, ai.kudi.agent.core.domain.room_entities.IssueCategory r25, java.util.List r26) {
        /*
            java.lang.String r7 = "this$0"
            r0 = r24
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r7)
            java.lang.String r7 = "$parentData"
            r0 = r25
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r7)
            r0 = r24
            ai.kudi.agent.core.mvvm.ViewData r8 = r0.getState()
            r10 = r8
            ai.kudi.agent.issues.ui.viewModels.data.IssueTypeViewData r10 = (ai.kudi.agent.issues.p008ui.viewModels.data.IssueTypeViewData) r10
            r9 = r10
            java.lang.String r7 = "it"
            r0 = r26
            kotlin.p483e0.p485d.Log_OC.loadImage(r0, r7)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r0 = r26
            java.util.Iterator r12 = r0.iterator()
        L2a:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L5f
            java.lang.Object r14 = r12.next()
            r16 = r14
            ai.kudi.agent.core.domain.room_entities.IssueCategory r16 = (ai.kudi.agent.core.domain.room_entities.IssueCategory) r16
            r15 = r16
            int r17 = r15.getParentIndex()
            r18 = -1
            r0 = r17
            r1 = r18
            if (r0 <= r1) goto L58
            r0 = r25
            int r17 = r0.getIndex()
            int r19 = r15.getParentIndex()
            r0 = r17
            r1 = r19
            if (r0 != r1) goto L58
            r13 = 1
            goto L59
        L58:
            r13 = 0
        L59:
            if (r13 == 0) goto L2a
            r11.add(r14)
            goto L2a
        L5f:
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 12
            r23 = 0
            r0 = r9
            r1 = r18
            r2 = r11
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            ai.kudi.agent.issues.ui.viewModels.data.IssueTypeViewData r9 = ai.kudi.agent.issues.p008ui.viewModels.data.IssueTypeViewData.copy$default(r0, r1, r2, r3, r4, r5, r6)
            r0 = r24
            r0.publish(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.issues.p008ui.viewModels.IssueTypeViewModel.m39541startWithData$lambda6(ai.kudi.agent.issues.ui.viewModels.IssueTypeViewModel, ai.kudi.agent.core.domain.room_entities.IssueCategory, java.util.List):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: startWithData$lambda-7  reason: not valid java name */
    public static final void m39542startWithData$lambda7(IssueTypeViewModel issueTypeViewModel, Throwable th) {
        Log_OC.getArray(issueTypeViewModel, "this$0");
        ViewData $r3 = issueTypeViewModel.getState();
        IssueTypeViewData $r4 = (IssueTypeViewData) $r3;
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default("Something went wrong", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        IssueTypeViewData.Error $r1 = new IssueTypeViewData.Error((String) $r6);
        issueTypeViewModel.publish(IssueTypeViewData.copy$default($r4, false, null, false, $r1, 6, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        IssueTypeViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public IssueTypeViewData initialData() {
        IssueTypeViewData $r1 = new IssueTypeViewData(false, null, false, null, 15, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void logOnSupportButtonClicked(final String str) {
        Log_OC.getArray(str, TransactionField.STATUS);
        FetchCurrentUser $r2 = this.fetchCurrentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.issues.ui.viewModels.SimpleXYSeries
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                IssueTypeViewModel $r1 = IssueTypeViewModel.this;
                String $r22 = str;
                User $r4 = (User) obj;
                IssueTypeViewModel.m39537logOnSupportButtonClicked$lambda3($r1, $r22, $r4);
            }
        };
        Target $r5 = Target.VIBRANT;
        FavoritesArrayAdapter $r6 = $r3.s(object, $r5);
        Log_OC.loadImage($r6, "fetchCurrentUser.execute().subscribe(\n            {\n                analytics.onSupportButtonClicked(it.phoneNumber, status)\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r7 = getCompositeDisposable();
        RxExtKt.addTo($r6, $r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToNextFragment(IssueCategory issueCategory) {
        Log_OC.getArray(issueCategory, TransactionBreakDownItemType.DATA);
        Boolean $r2 = issueCategory.getHasChildren();
        Boolean $r3 = Boolean.FALSE;
        boolean $z0 = Log_OC.append($r2, $r3);
        if (!$z0) {
            IssueTypeHomeNavigator $r4 = this.issueTypeNavigator;
            $r4.toIssueTypeFragment(issueCategory);
            return;
        }
        String $r5 = issueCategory.getCategoryName();
        boolean $z02 = Log_OC.append($r5, "Contact Kudi");
        if (!$z02) {
            String $r52 = issueCategory.getCategoryName();
            boolean $z03 = Log_OC.append($r52, "Contact Nomba");
            if (!$z03) {
                IssueTypeHomeNavigator $r42 = this.issueTypeNavigator;
                $r42.toIssueDetailFragment(issueCategory);
                return;
            }
        }
        IssueTypeHomeNavigator $r43 = this.issueTypeNavigator;
        $r43.toIssueContactUsFragment();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void start(String str) {
        Log_OC.getArray(str, "customerType");
        ViewData $r2 = getState();
        IssueTypeViewData $r3 = (IssueTypeViewData) $r2;
        publish(IssueTypeViewData.copy$default($r3, true, null, false, null, 6, null));
        FetchIssueCategories $r4 = this.fetchIssueCategories;
        AbstractC11688p $r5 = $r4.execute(str);
        FavoritesArrayAdapter $r8 = $r5.e0(new Object() { // from class: ai.kudi.agent.issues.ui.viewModels.FlingerListView$ItemFlingerResponder
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                IssueTypeViewModel $r1 = IssueTypeViewModel.this;
                List $r32 = (List) obj;
                IssueTypeViewModel.m39539start$lambda1($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.issues.ui.viewModels.Category
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                IssueTypeViewModel $r1 = IssueTypeViewModel.this;
                Throwable $r32 = (Throwable) obj;
                IssueTypeViewModel.m39540start$lambda2($r1, $r32);
            }
        });
        Log_OC.loadImage($r8, "fetchIssueCategories.execute(customerType).subscribe(\n            {\n                logOnSupportButtonClicked(status = STATUS_SUCCESS)\n                if (it.isNotEmpty()) {\n                    publish(\n                        state.copy(\n                            isLoading = false,\n                            categories = it.filter { data -> data.parentIndex == -1 }\n                        )\n                    )\n                } else {\n                    if (fetchIssueCategories.getIsFromDb())\n                        publish(state.copy(isLoading = false, categories = it))\n                }\n            },\n            {\n                logOnSupportButtonClicked(status = STATUS_FAILURE)\n                publish(\n                    state.copy(\n                        isLoading = false,\n                        error = IssueTypeViewData.Error(parseHttpError2(\"Something went wrong\")(it))\n                    )\n                )\n            }\n        )");
        C11280b $r9 = getCompositeDisposable();
        RxExtKt.addTo($r8, $r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void startWithData(final IssueCategory issueCategory, String str) {
        Log_OC.getArray(issueCategory, "parentData");
        Log_OC.getArray(str, "customerType");
        ViewData $r3 = getState();
        IssueTypeViewData $r4 = (IssueTypeViewData) $r3;
        publish(IssueTypeViewData.copy$default($r4, true, null, false, null, 6, null));
        FetchIssueCategories $r5 = this.fetchIssueCategories;
        AbstractC11688p $r6 = $r5.execute(str);
        FavoritesArrayAdapter $r9 = $r6.e0(new Object() { // from class: ai.kudi.agent.issues.ui.viewModels.FileChooser
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                IssueTypeViewModel $r1 = IssueTypeViewModel.this;
                IssueCategory $r2 = issueCategory;
                List $r42 = (List) obj;
                IssueTypeViewModel.m39541startWithData$lambda6($r1, $r2, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.issues.ui.viewModels.AndFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                IssueTypeViewModel $r1 = IssueTypeViewModel.this;
                Throwable $r32 = (Throwable) obj;
                IssueTypeViewModel.m39542startWithData$lambda7($r1, $r32);
            }
        });
        Log_OC.loadImage($r9, "fetchIssueCategories.execute(customerType).subscribe(\n            {\n                publish(\n                    state.copy(\n                        isLoading = false,\n                        categories = it.filter { data -> data.parentIndex > -1 && parentData.index == data.parentIndex }\n                    )\n                )\n            },\n            {\n                publish(\n                    state.copy(\n                        isLoading = false,\n                        error = IssueTypeViewData.Error(parseHttpError2(\"Something went wrong\")(it))\n                    )\n                )\n            }\n        )");
        C11280b $r10 = getCompositeDisposable();
        RxExtKt.addTo($r9, $r10);
    }
}

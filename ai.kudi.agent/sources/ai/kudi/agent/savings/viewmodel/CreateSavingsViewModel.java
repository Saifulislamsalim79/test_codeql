package ai.kudi.agent.savings.viewmodel;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ResourceDelegate;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.savings.data.model.CreateSavingsModel;
import ai.kudi.agent.savings.data.viewdata.CreateSavingsViewData;
import ai.kudi.agent.savings.navigator.SavingsNavigator;
import ai.kudi.agent.savings.usecase.PlanDuration;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: CreateSavingsViewModel.kt */
@Metadata(m10422d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0019R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m10421d2 = {"Lai/kudi/agent/savings/viewmodel/CreateSavingsViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/savings/data/viewdata/CreateSavingsViewData;", "navigator", "Lai/kudi/agent/savings/navigator/SavingsNavigator;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "duration", "Lai/kudi/agent/savings/usecase/PlanDuration;", "resource", "Lai/kudi/agent/core/util/ResourceDelegate;", "(Lai/kudi/agent/savings/navigator/SavingsNavigator;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/savings/usecase/PlanDuration;Lai/kudi/agent/core/util/ResourceDelegate;)V", "getAnalytics", "()Lai/kudi/agent/core/analytics/Analytics;", "getDuration", "()Lai/kudi/agent/savings/usecase/PlanDuration;", "getNavigator", "()Lai/kudi/agent/savings/navigator/SavingsNavigator;", "getResource", "()Lai/kudi/agent/core/util/ResourceDelegate;", "", "initialData", "Lai/kudi/agent/savings/data/viewdata/CreateSavingsViewData$Initial;", "navigateToReview", "savingsModel", "Lai/kudi/agent/savings/data/model/CreateSavingsModel;", "toggleProgress", "visibility", "", "validateFields", "createSavingsModel", "Companion", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CreateSavingsViewModel extends BaseViewModel<CreateSavingsViewData> {
    public static final Companion Companion;
    public static final int MINIMUM_SAVING = 200;
    private final Analytics analytics;
    private final PlanDuration duration;
    private final SavingsNavigator navigator;
    private final ResourceDelegate resource;

    /* compiled from: CreateSavingsViewModel.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/savings/viewmodel/CreateSavingsViewModel$Companion;", "", "()V", "MINIMUM_SAVING", "", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    public CreateSavingsViewModel(SavingsNavigator savingsNavigator, Analytics analytics, PlanDuration planDuration, ResourceDelegate resourceDelegate) {
        Log_OC.getArray(savingsNavigator, "navigator");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(planDuration, "duration");
        Log_OC.getArray(resourceDelegate, "resource");
        this.navigator = savingsNavigator;
        this.analytics = analytics;
        this.duration = planDuration;
        this.resource = resourceDelegate;
        getDuration();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void getDuration() {
        CreateSavingsViewData.ShowProgress $r2 = new CreateSavingsViewData.ShowProgress(true);
        publish($r2);
        PlanDuration $r3 = this.duration;
        AbstractC11688p $r4 = $r3.getDuration();
        FavoritesArrayAdapter $r6 = $r4.e0(new Object() { // from class: ai.kudi.agent.savings.viewmodel.ReplaySubject$BoundedState
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CreateSavingsViewModel $r1 = CreateSavingsViewModel.this;
                List $r32 = (List) obj;
                CreateSavingsViewModel.m40614getDuration$lambda2($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.savings.viewmodel.Pair
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CreateSavingsViewModel $r1 = CreateSavingsViewModel.this;
                Throwable $r32 = (Throwable) obj;
                CreateSavingsViewModel.m40615getDuration$lambda3($r1, $r32);
            }
        });
        Log_OC.loadImage($r6, "duration.getDuration().subscribe(\n            {\n                publish(CreateSavingsViewData.ShowProgress(visibility = false))\n                val dayList = it.map { noOfDays ->\n                    resource.getString(R.string.day_suffix, noOfDays)\n                }\n                publish(CreateSavingsViewData.Duration(dayList))\n            },\n            {\n                publish(CreateSavingsViewData.ShowProgress(visibility = false))\n                publish(CreateSavingsViewData.Error(parseHttpError2()(it)))\n            }\n        )");
        C11280b $r7 = getCompositeDisposable();
        RxExtKt.addTo($r6, $r7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0030 */
    /* renamed from: getDuration$lambda-2  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m40614getDuration$lambda2(ai.kudi.agent.savings.viewmodel.CreateSavingsViewModel r18, java.util.List r19) {
        /*
            java.lang.String r2 = "this$0"
            r0 = r18
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r2)
            ai.kudi.agent.savings.data.viewdata.CreateSavingsViewData$ShowProgress r3 = new ai.kudi.agent.savings.data.viewdata.CreateSavingsViewData$ShowProgress
            r4 = 0
            r3.<init>(r4)
            r0 = r18
            r0.publish(r3)
            java.lang.String r2 = "it"
            r0 = r19
            kotlin.p483e0.p485d.Log_OC.loadImage(r0, r2)
            java.util.ArrayList r5 = new java.util.ArrayList
            r4 = 10
            r0 = r19
            int r6 = kotlin.p557z.C13722p.m3921o(r0, r4)
            r5.<init>(r6)
            r0 = r19
            java.util.Iterator r7 = r0.iterator()
        L2c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L5a
            java.lang.Object r9 = r7.next()
            r11 = r9
            java.lang.Number r11 = (java.lang.Number) r11
            r10 = r11
            int r12 = r10.intValue()
            r0 = r18
            ai.kudi.agent.core.util.ResourceDelegate r13 = r0.getResource()
            int r6 = ai.kudi.agent.savings.C0456R.string.day_suffix
            r4 = 1
            java.lang.Object[] r14 = new java.lang.Object[r4]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r12)
            r4 = 0
            r14[r4] = r15
            java.lang.String r16 = r13.getString(r6, r14)
            r0 = r16
            r5.add(r0)
            goto L2c
        L5a:
            ai.kudi.agent.savings.data.viewdata.CreateSavingsViewData$Duration r17 = new ai.kudi.agent.savings.data.viewdata.CreateSavingsViewData$Duration
            r0 = r17
            r0.<init>(r5)
            r0 = r18
            r1 = r17
            r0.publish(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.savings.viewmodel.CreateSavingsViewModel.m40614getDuration$lambda2(ai.kudi.agent.savings.viewmodel.CreateSavingsViewModel, java.util.List):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getDuration$lambda-3  reason: not valid java name */
    public static final void m40615getDuration$lambda3(CreateSavingsViewModel createSavingsViewModel, Throwable th) {
        Log_OC.getArray(createSavingsViewModel, "this$0");
        CreateSavingsViewData.ShowProgress $r2 = new CreateSavingsViewData.ShowProgress(false);
        createSavingsViewModel.publish($r2);
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r5 = $r4.invoke(th);
        CreateSavingsViewData.Error $r3 = new CreateSavingsViewData.Error((String) $r5, null, null, null, null, null, 62, null);
        createSavingsViewModel.publish($r3);
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
    /* renamed from: getDuration  reason: collision with other method in class */
    public final PlanDuration m40616getDuration() {
        PlanDuration r1 = this.duration;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SavingsNavigator getNavigator() {
        SavingsNavigator r1 = this.navigator;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ResourceDelegate getResource() {
        ResourceDelegate r1 = this.resource;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        CreateSavingsViewData.Initial $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public CreateSavingsViewData.Initial initialData() {
        CreateSavingsViewData.Initial r1 = CreateSavingsViewData.Initial.INSTANCE;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToReview(CreateSavingsModel createSavingsModel) {
        Log_OC.getArray(createSavingsModel, "savingsModel");
        SavingsNavigator $r2 = this.navigator;
        $r2.navigateToSavingsReview(createSavingsModel);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void toggleProgress(boolean z) {
        SavingsNavigator $r1 = this.navigator;
        $r1.displayProgressBar(z);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0182, code lost:
        if (r12 == 0) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void validateFields(ai.kudi.agent.savings.data.model.CreateSavingsModel r25) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.savings.viewmodel.CreateSavingsViewModel.validateFields(ai.kudi.agent.savings.data.model.CreateSavingsModel):void");
    }
}

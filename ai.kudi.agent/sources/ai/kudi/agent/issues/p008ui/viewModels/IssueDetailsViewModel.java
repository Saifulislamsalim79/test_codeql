package ai.kudi.agent.issues.p008ui.viewModels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.analytics.contracts.IssueResolutionAnalyticsKt;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.issues.domain.FetchIssueCategories;
import ai.kudi.agent.issues.navigators.IssueTypeNavigator;
import ai.kudi.agent.issues.p008ui.IssueTypeFragmentNew;
import ai.kudi.agent.issues.p008ui.viewModels.data.IssueDetailsViewData;
import ai.kudi.agent.issues.viewmodels.model.IssueLabels;
import ai.kudi.agent.issues.viewmodels.model.IssueTypeModel;
import ai.kudi.agent.issues.viewmodels.model.WithdrawalTypes;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.transactions.utils.TransactionsUtilKt;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import com.google.android.gms.tasks.InterfaceC4454e;
import com.google.android.gms.tasks.Item;
import com.google.firebase.remoteconfig.Frame;
import java.util.List;
import java.util.Map;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13727r0;
import kotlin.p557z.C13742z;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: IssueDetailsViewModel.kt */
@Metadata(m10422d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0016J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011H\u0002J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u000e\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m10421d2 = {"Lai/kudi/agent/issues/ui/viewModels/IssueDetailsViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/issues/ui/viewModels/data/IssueDetailsViewData;", "issueTypeNavigtor", "Lai/kudi/agent/issues/navigators/IssueTypeNavigator;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "fetchIssueCategories", "Lai/kudi/agent/issues/domain/FetchIssueCategories;", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "(Lai/kudi/agent/issues/navigators/IssueTypeNavigator;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/issues/domain/FetchIssueCategories;Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;)V", "fetchIssueDetails", "", "category", "", "getNavigationForGeneralEnquiries", "enquiry", "initialData", "logIssueType", "issueType", TransactionField.STATUS, "navigateToListFragmentIfTransactionsIsEmpty", "issueTypeModel", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "navigateToNextFragment", "Companion", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.viewModels.IssueDetailsViewModel */
/* loaded from: classes.dex */
public final class IssueDetailsViewModel extends BaseViewModel<IssueDetailsViewData> {
    public static final Companion Companion;
    private static final Map<String, String> issueTypeMap;
    private final Analytics analytics;
    private final FetchCurrentUser fetchCurrentUser;
    private final FetchIssueCategories fetchIssueCategories;
    private final IssueTypeNavigator issueTypeNavigtor;
    private final Frame remoteConfig;

    /* compiled from: IssueDetailsViewModel.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/issues/ui/viewModels/IssueDetailsViewModel$Companion;", "", "()V", "issueTypeMap", "", "", "getIssueTypeMap", "()Ljava/util/Map;", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.issues.ui.viewModels.IssueDetailsViewModel$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Map getIssueTypeMap() {
            Map $r1 = IssueDetailsViewModel.issueTypeMap;
            return $r1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Map $r3;
        Companion $r0 = new Companion(null);
        Companion = $r0;
        C13287o $r2 = C13664u.m4227a("Funds Transfer", "FUNDS_TRANSFER");
        C13287o $r22 = C13664u.m4227a("Cash Withdrawal", WithdrawalTypes.CASH);
        C13287o $r23 = C13664u.m4227a("Airtime and Data", "AIRTIME_DATA");
        C13287o $r24 = C13664u.m4227a("DsTV Subscription", "DSTV");
        C13287o $r25 = C13664u.m4227a("GoTV Subscription", "GOTV");
        C13287o $r26 = C13664u.m4227a("Electricity", "ELECTRICITY");
        C13287o $r27 = C13664u.m4227a("PHCN Bill Payment", "ELECTRICITY");
        C13287o $r28 = C13664u.m4227a("Startimes", "STARTIMES");
        C13287o $r29 = C13664u.m4227a("Wallet Topup", "WALLET_TOPUP");
        C13287o $r210 = C13664u.m4227a("P2P", "P2P");
        C13287o $r211 = C13664u.m4227a("POS Terminal Issues", "TERMINAL");
        C13287o $r212 = C13664u.m4227a("Data", IssueTypeFragmentNew.DATA);
        C13287o $r213 = C13664u.m4227a("Airtime Topup", "AIRTIME");
        C13287o[] $r1 = {$r2, $r22, $r23, $r24, $r25, $r26, $r27, $r28, $r29, $r210, $r211, $r212, $r213};
        $r3 = C13727r0.m3877o($r1);
        issueTypeMap = $r3;
    }

    public IssueDetailsViewModel(IssueTypeNavigator issueTypeNavigator, Analytics analytics, FetchCurrentUser fetchCurrentUser, FetchIssueCategories fetchIssueCategories, Frame frame) {
        Log_OC.getArray(issueTypeNavigator, "issueTypeNavigtor");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(fetchIssueCategories, "fetchIssueCategories");
        Log_OC.getArray(frame, "remoteConfig");
        this.issueTypeNavigtor = issueTypeNavigator;
        this.analytics = analytics;
        this.fetchCurrentUser = fetchCurrentUser;
        this.fetchIssueCategories = fetchIssueCategories;
        this.remoteConfig = frame;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchIssueDetails$lambda-0  reason: not valid java name */
    public static final void m39531fetchIssueDetails$lambda0(IssueDetailsViewModel issueDetailsViewModel, String str, List list) {
        List $r2;
        Log_OC.getArray(issueDetailsViewModel, "this$0");
        Log_OC.getArray(str, "$category");
        Log_OC.loadImage(list, "it");
        $r2 = C13742z.m3823D0(list);
        issueDetailsViewModel.logIssueType(str, IssueResolutionAnalyticsKt.STATUS_SUCCESS);
        ViewData $r3 = issueDetailsViewModel.getState();
        IssueDetailsViewData $r4 = (IssueDetailsViewData) $r3;
        issueDetailsViewModel.publish(IssueDetailsViewData.copy$default($r4, $r2, false, null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchIssueDetails$lambda-1  reason: not valid java name */
    public static final void m39532fetchIssueDetails$lambda1(IssueDetailsViewModel issueDetailsViewModel, String str, Throwable th) {
        Log_OC.getArray(issueDetailsViewModel, "this$0");
        Log_OC.getArray(str, "$category");
        issueDetailsViewModel.logIssueType(str, IssueResolutionAnalyticsKt.STATUS_FAILURE);
        ViewData $r4 = issueDetailsViewModel.getState();
        IssueDetailsViewData $r5 = (IssueDetailsViewData) $r4;
        InterfaceC11767l $r6 = KudiErrorParserKt.parseHttpError2$default("Something went wrong, please retry", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r7 = $r6.invoke(th);
        IssueDetailsViewData.Error $r2 = new IssueDetailsViewData.Error((String) $r7);
        issueDetailsViewModel.publish(IssueDetailsViewData.copy$default($r5, null, false, $r2, 1, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void getNavigationForGeneralEnquiries(final String str) {
        Frame $r4 = this.remoteConfig;
        Item $r3 = $r4.m20914c();
        $r3.m27799a(new InterfaceC4454e() { // from class: ai.kudi.agent.issues.ui.viewModels.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: c */
            public final void m38814c(Item item) {
                String $r2 = str;
                IssueDetailsViewModel $r32 = this;
                IssueDetailsViewModel.m39533getNavigationForGeneralEnquiries$lambda4($r2, $r32, item);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (r1 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (r1 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
        r3 = r6.issueTypeNavigtor;
        r4 = r6.remoteConfig;
        r5 = r4.getSetting("agent_referral_faq");
        kotlin.p483e0.p485d.Log_OC.loadImage(r5, "remoteConfig.getString(\"agent_referral_faq\")");
        r3.navigateToEnquiryLink(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
        if (r1 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0097, code lost:
        r3 = r6.issueTypeNavigtor;
        r4 = r6.remoteConfig;
        r5 = r4.getSetting("agent_referral_faq");
        kotlin.p483e0.p485d.Log_OC.loadImage(r5, "remoteConfig.getString(\"agent_referral_faq\")");
        r3.navigateToEnquiryLink(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cc, code lost:
        if (r1 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d5, code lost:
        if (r1 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d8, code lost:
        r3 = r6.issueTypeNavigtor;
        r4 = r6.remoteConfig;
        r5 = r4.getSetting("nomba_fees");
        kotlin.p483e0.p485d.Log_OC.loadImage(r5, "remoteConfig.getString(\"nomba_fees\")");
        r3.navigateToEnquiryLink(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ea, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r1 == false) goto L36;
     */
    /* renamed from: getNavigationForGeneralEnquiries$lambda-4  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m39533getNavigationForGeneralEnquiries$lambda4(java.lang.String r5, ai.kudi.agent.issues.p008ui.viewModels.IssueDetailsViewModel r6, com.google.android.gms.tasks.Item r7) {
        /*
            java.lang.String r0 = "$enquiry"
            kotlin.p483e0.p485d.Log_OC.getArray(r5, r0)
            java.lang.String r0 = "this$0"
            kotlin.p483e0.p485d.Log_OC.getArray(r6, r0)
            java.lang.String r0 = "it"
            kotlin.p483e0.p485d.Log_OC.getArray(r7, r0)
            boolean r1 = r7.m27801a()
            if (r1 == 0) goto Lf0
            int r2 = r5.hashCode()
            switch(r2) {
                case -1843377483: goto Lcf;
                case -1036199787: goto Lc6;
                case -550139252: goto Laa;
                case 398762729: goto L8e;
                case 514969620: goto L72;
                case 1203225975: goto L54;
                case 1578493895: goto L36;
                case 1917259626: goto L2b;
                case 2005093050: goto L20;
                default: goto L1c;
            }
        L1c:
            goto L1d
        L1d:
            goto Leb
        L20:
            java.lang.String r0 = "How can I refer an agent to earn commission?"
            boolean r1 = r5.equals(r0)
            if (r1 != 0) goto L41
            goto Leb
        L2b:
            java.lang.String r0 = "How can I become a Kudi agent?"
            boolean r1 = r5.equals(r0)
            if (r1 != 0) goto L97
            goto Leb
        L36:
            java.lang.String r0 = "How can I refer a business to earn commission?"
            boolean r1 = r5.equals(r0)
            if (r1 != 0) goto L41
            goto Leb
        L41:
            ai.kudi.agent.issues.navigators.IssueTypeNavigator r3 = r6.issueTypeNavigtor
            com.google.firebase.remoteconfig.Frame r4 = r6.remoteConfig
            java.lang.String r0 = "agent_referral_faq"
            java.lang.String r5 = r4.getSetting(r0)
            java.lang.String r0 = "remoteConfig.getString(\"agent_referral_faq\")"
            kotlin.p483e0.p485d.Log_OC.loadImage(r5, r0)
            r3.navigateToEnquiryLink(r5)
            return
        L54:
            java.lang.String r0 = "How can I get a POS terminal?"
            boolean r1 = r5.equals(r0)
            if (r1 != 0) goto L5f
            goto Leb
        L5f:
            ai.kudi.agent.issues.navigators.IssueTypeNavigator r3 = r6.issueTypeNavigtor
            com.google.firebase.remoteconfig.Frame r4 = r6.remoteConfig
            java.lang.String r0 = "get_pos_faq"
            java.lang.String r5 = r4.getSetting(r0)
            java.lang.String r0 = "remoteConfig.getString(\"get_pos_faq\")"
            kotlin.p483e0.p485d.Log_OC.loadImage(r5, r0)
            r3.navigateToEnquiryLink(r5)
            return
        L72:
            java.lang.String r0 = "How can I get branding material?"
            boolean r1 = r5.equals(r0)
            if (r1 != 0) goto L7b
            goto Leb
        L7b:
            ai.kudi.agent.issues.navigators.IssueTypeNavigator r3 = r6.issueTypeNavigtor
            com.google.firebase.remoteconfig.Frame r4 = r6.remoteConfig
            java.lang.String r0 = "branding_material_faq"
            java.lang.String r5 = r4.getSetting(r0)
            java.lang.String r0 = "remoteConfig.getString(\"branding_material_faq\")"
            kotlin.p483e0.p485d.Log_OC.loadImage(r5, r0)
            r3.navigateToEnquiryLink(r5)
            return
        L8e:
            java.lang.String r0 = "How can I become a Nomba business?"
            boolean r1 = r5.equals(r0)
            if (r1 != 0) goto L97
            goto Leb
        L97:
            ai.kudi.agent.issues.navigators.IssueTypeNavigator r3 = r6.issueTypeNavigtor
            com.google.firebase.remoteconfig.Frame r4 = r6.remoteConfig
            java.lang.String r0 = "agent_referral_faq"
            java.lang.String r5 = r4.getSetting(r0)
            java.lang.String r0 = "remoteConfig.getString(\"agent_referral_faq\")"
            kotlin.p483e0.p485d.Log_OC.loadImage(r5, r0)
            r3.navigateToEnquiryLink(r5)
            return
        Laa:
            java.lang.String r0 = "How can I have access to your loan?"
            boolean r1 = r5.equals(r0)
            if (r1 != 0) goto Lb3
            goto Leb
        Lb3:
            ai.kudi.agent.issues.navigators.IssueTypeNavigator r3 = r6.issueTypeNavigtor
            com.google.firebase.remoteconfig.Frame r4 = r6.remoteConfig
            java.lang.String r0 = "loan_access_faq"
            java.lang.String r5 = r4.getSetting(r0)
            java.lang.String r0 = "remoteConfig.getString(\"loan_access_faq\")"
            kotlin.p483e0.p485d.Log_OC.loadImage(r5, r0)
            r3.navigateToEnquiryLink(r5)
            return
        Lc6:
            java.lang.String r0 = "How can I know Kudi Transaction charges?"
            boolean r1 = r5.equals(r0)
            if (r1 != 0) goto Ld8
            goto Leb
        Lcf:
            java.lang.String r0 = "How can I know Nomba Transaction charges?"
            boolean r1 = r5.equals(r0)
            if (r1 != 0) goto Ld8
            goto Leb
        Ld8:
            ai.kudi.agent.issues.navigators.IssueTypeNavigator r3 = r6.issueTypeNavigtor
            com.google.firebase.remoteconfig.Frame r4 = r6.remoteConfig
            java.lang.String r0 = "nomba_fees"
            java.lang.String r5 = r4.getSetting(r0)
            java.lang.String r0 = "remoteConfig.getString(\"nomba_fees\")"
            kotlin.p483e0.p485d.Log_OC.loadImage(r5, r0)
            r3.navigateToEnquiryLink(r5)
            return
        Leb:
            ai.kudi.agent.issues.navigators.IssueTypeNavigator r3 = r6.issueTypeNavigtor
            r3.doFetch()
        Lf0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.issues.p008ui.viewModels.IssueDetailsViewModel.m39533getNavigationForGeneralEnquiries$lambda4(java.lang.String, ai.kudi.agent.issues.ui.viewModels.IssueDetailsViewModel, com.google.android.gms.tasks.Item):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void logIssueType(final String str, final String str2) {
        FetchCurrentUser $r3 = this.fetchCurrentUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.issues.ui.viewModels.ExtensionData
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                IssueDetailsViewModel $r1 = IssueDetailsViewModel.this;
                String $r2 = str;
                String $r32 = str2;
                User $r5 = (User) obj;
                IssueDetailsViewModel.m39534logIssueType$lambda2($r1, $r2, $r32, $r5);
            }
        };
        FormatedText $r6 = FormatedText.SINGLE_SPACE;
        FavoritesArrayAdapter $r7 = $r4.s(object, $r6);
        Log_OC.loadImage($r7, "fetchCurrentUser.execute().subscribe(\n            {\n                analytics.onIssueTypeClicked(\n                    issueType = issueType,\n                    status = status,\n                    phoneNumber = it.phoneNumber\n                )\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r8 = getCompositeDisposable();
        RxExtKt.addTo($r7, $r8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: logIssueType$lambda-2  reason: not valid java name */
    public static final void m39534logIssueType$lambda2(IssueDetailsViewModel issueDetailsViewModel, String str, String str2, User user) {
        Log_OC.getArray(issueDetailsViewModel, "this$0");
        Log_OC.getArray(str, "$issueType");
        Log_OC.getArray(str2, "$status");
        String $r2 = user.getPhoneNumber();
        Analytics $r5 = issueDetailsViewModel.analytics;
        Log_OC.loadImage($r2, "phoneNumber");
        $r5.onIssueTypeClicked(str, $r2, str2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void navigateToListFragmentIfTransactionsIsEmpty(IssueTypeModel issueTypeModel) {
        boolean $z0 = issueTypeModel.isFromTransactionPage();
        if ($z0) {
            IssueTypeNavigator $r2 = this.issueTypeNavigtor;
            $r2.toIssueResolutionFragment(issueTypeModel);
            return;
        }
        IssueTypeNavigator $r22 = this.issueTypeNavigtor;
        $r22.toTransactionListView(issueTypeModel);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchIssueDetails(final String str) {
        Log_OC.getArray(str, "category");
        ViewData $r2 = getState();
        IssueDetailsViewData $r3 = (IssueDetailsViewData) $r2;
        publish(IssueDetailsViewData.copy$default($r3, null, true, null, 5, null));
        FetchIssueCategories $r4 = this.fetchIssueCategories;
        AbstractC11688p $r5 = $r4.fetchIssueDetails(str);
        FavoritesArrayAdapter $r8 = $r5.e0(new Object() { // from class: ai.kudi.agent.issues.ui.viewModels.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                IssueDetailsViewModel $r1 = IssueDetailsViewModel.this;
                String $r22 = str;
                List $r42 = (List) obj;
                IssueDetailsViewModel.m39531fetchIssueDetails$lambda0($r1, $r22, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.issues.ui.viewModels.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                IssueDetailsViewModel $r1 = IssueDetailsViewModel.this;
                String $r22 = str;
                Throwable $r42 = (Throwable) obj;
                IssueDetailsViewModel.m39532fetchIssueDetails$lambda1($r1, $r22, $r42);
            }
        });
        Log_OC.loadImage($r8, "fetchIssueCategories.fetchIssueDetails(category).subscribe(\n            {\n                val categoryData = it.toMutableList()\n                logIssueType(status = STATUS_SUCCESS, issueType = category)\n                publish(state.copy(isLoading = false, categoryData = categoryData))\n            },\n            {\n                logIssueType(status = STATUS_FAILURE, issueType = category)\n                publish(\n                    state.copy(\n                        isLoading = false,\n                        error = IssueDetailsViewData.Error(\n                            message = parseHttpError2(\"Something went wrong, please retry\")(it)\n                        )\n                    )\n                )\n            }\n        )");
        C11280b $r9 = getCompositeDisposable();
        RxExtKt.addTo($r8, $r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        IssueDetailsViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public IssueDetailsViewData initialData() {
        IssueDetailsViewData $r1 = new IssueDetailsViewData(null, false, null, 7, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToNextFragment(IssueTypeModel issueTypeModel) {
        String $r4;
        Log_OC.getArray(issueTypeModel, "issueTypeModel");
        String $r2 = issueTypeModel.getLabel();
        IssueLabels $r3 = IssueLabels.DELAYED_KTA;
        String $r42 = $r3.getLabel();
        boolean $z0 = Log_OC.append($r2, $r42);
        if ($z0) {
            IssueTypeNavigator $r5 = this.issueTypeNavigtor;
            $r5.toDelayedKtaTopUp(issueTypeModel);
            return;
        }
        IssueLabels $r32 = IssueLabels.PENDING_KYC;
        String $r43 = $r32.getLabel();
        boolean $z02 = Log_OC.append($r2, $r43);
        if ($z02) {
            IssueTypeNavigator $r52 = this.issueTypeNavigtor;
            String $r6 = issueTypeModel.getPrettyName();
            String $r22 = $r6;
            if ($r6 == null) {
                $r22 = "";
            }
            String $r62 = issueTypeModel.getType();
            $r4 = $r62 != null ? $r62 : "";
            $r52.toKycFormIssue($r22, $r4);
            return;
        }
        IssueLabels $r33 = IssueLabels.CHARGE_BACK;
        String $r63 = $r33.getLabel();
        boolean $z03 = Log_OC.append($r2, $r63);
        if ($z03) {
            boolean $z04 = issueTypeModel.isFromTransactionPage();
            if ($z04) {
                IssueTypeNavigator $r53 = this.issueTypeNavigtor;
                $r53.toIssueResolutionFragment(issueTypeModel);
                return;
            }
            IssueTypeNavigator $r54 = this.issueTypeNavigtor;
            $r54.toTransactionListView(issueTypeModel);
            return;
        }
        IssueLabels $r34 = IssueLabels.DELAYED_CREDIT;
        String $r64 = $r34.getLabel();
        boolean $z05 = Log_OC.append($r2, $r64);
        if ($z05) {
            boolean $z06 = issueTypeModel.isFromTransactionPage();
            if ($z06) {
                IssueTypeNavigator $r55 = this.issueTypeNavigtor;
                $r55.toIssueResolutionFragment(issueTypeModel);
                return;
            }
            IssueTypeNavigator $r56 = this.issueTypeNavigtor;
            $r56.toWithdrawalIssue(issueTypeModel);
            return;
        }
        boolean $z07 = Log_OC.append($r2, "");
        if (!$z07) {
            navigateToListFragmentIfTransactionsIsEmpty(issueTypeModel);
            return;
        }
        String $r23 = issueTypeModel.getType();
        boolean $z08 = Log_OC.append($r23, "TERMINAL");
        if ($z08) {
            IssueTypeNavigator $r57 = this.issueTypeNavigtor;
            $r57.toPosTerminalIssue(issueTypeModel);
            return;
        }
        boolean $z09 = Log_OC.append($r23, "GENERAL");
        if ($z09) {
            String $r24 = issueTypeModel.getDescription();
            $r4 = $r24 != null ? $r24 : "";
            getNavigationForGeneralEnquiries($r4);
            return;
        }
        String $r44 = issueTypeModel.getType();
        boolean $z010 = Log_OC.append($r44, WithdrawalTypes.USSD);
        if (!$z010) {
            String $r45 = issueTypeModel.getType();
            boolean $z011 = Log_OC.append($r45, WithdrawalTypes.PAGE_KEY);
            if (!$z011) {
                String $r46 = issueTypeModel.getTypeSlug();
                if ($r46 != null) {
                    Map $r7 = TransactionsUtilKt.getTransactionMap();
                    String $r47 = issueTypeModel.getTypeSlug();
                    Log_OC.append($r47);
                    boolean $z012 = $r7.containsValue($r47);
                    if (!$z012) {
                        IssueTypeNavigator $r58 = this.issueTypeNavigtor;
                        $r58.doFetch();
                        return;
                    }
                }
                navigateToListFragmentIfTransactionsIsEmpty(issueTypeModel);
                return;
            }
        }
        navigateToListFragmentIfTransactionsIsEmpty(issueTypeModel);
    }
}

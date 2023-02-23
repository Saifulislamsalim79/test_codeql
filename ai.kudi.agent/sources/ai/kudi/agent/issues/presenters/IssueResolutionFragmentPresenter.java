package ai.kudi.agent.issues.presenters;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.usecases.CheckPermission;
import ai.kudi.agent.issues.navigators.IssueTypeNavigator;
import ai.kudi.agent.issues.p008ui.viewModels.IssueDetailsViewModelKt;
import ai.kudi.agent.issues.viewmodels.model.IssueLabels;
import ai.kudi.agent.issues.viewmodels.model.IssueTypeModel;
import ai.kudi.agent.issues.views.IssueResolutionFragmentView;
import ai.kudi.agent.transactions.domain.dto.Method;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13262h;
import kotlin.p549l0.C13276s;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13742z;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import p590o.p591a.Timber;
/* compiled from: IssueResolutionFragmentPresenter.kt */
@Metadata(m10422d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ&\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\b\u0010\u0016\u001a\u00020\u000fH\u0016J\u001e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0006\u0010\u001e\u001a\u00020\u000fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m10421d2 = {"Lai/kudi/agent/issues/presenters/IssueResolutionFragmentPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/issues/views/IssueResolutionFragmentView;", "hasStoragePermission", "Lai/kudi/agent/core/usecases/CheckPermission;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "issueTypeNavigator", "Lai/kudi/agent/issues/navigators/IssueTypeNavigator;", "(Lai/kudi/agent/core/usecases/CheckPermission;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/issues/navigators/IssueTypeNavigator;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "attemptToSubmitIssue", "", "issueTypeModel", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "isFromChargeBackDialog", "", "chargeBackIssueText", "", "destroy", "isKeyWordsInDescriptionSuggestingChargeback", "descriptionText", "isChargebackAlready", "isWithdrawalType", "logImageAdded", "count", "", "selectPictureFromFile", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class IssueResolutionFragmentPresenter extends C9410b<IssueResolutionFragmentView> {
    private final Analytics analytics;
    private final FetchCurrentUser currentUser;
    private final C11280b disposables;
    private final CheckPermission hasStoragePermission;
    private final IssueTypeNavigator issueTypeNavigator;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public IssueResolutionFragmentPresenter(CheckPermission checkPermission, FetchCurrentUser fetchCurrentUser, Analytics analytics, IssueTypeNavigator issueTypeNavigator) {
        Log_OC.getArray(checkPermission, "hasStoragePermission");
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(issueTypeNavigator, "issueTypeNavigator");
        this.hasStoragePermission = checkPermission;
        this.currentUser = fetchCurrentUser;
        this.analytics = analytics;
        this.issueTypeNavigator = issueTypeNavigator;
        C11280b $r5 = new C11280b();
        this.disposables = $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void attemptToSubmitIssue$default(IssueResolutionFragmentPresenter issueResolutionFragmentPresenter, IssueTypeModel issueTypeModel, boolean $z0, String $r2, int i, Object obj) {
        int $i1 = i & 2;
        if ($i1 != 0) {
            $z0 = false;
        }
        int $i0 = i & 4;
        if ($i0 != 0) {
            $r2 = null;
        }
        issueResolutionFragmentPresenter.attemptToSubmitIssue(issueTypeModel, $z0, $r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: attemptToSubmitIssue$lambda-7$lambda-5  reason: not valid java name */
    public static final void m39398attemptToSubmitIssue$lambda7$lambda5(IssueResolutionFragmentView issueResolutionFragmentView) {
        Log_OC.getArray(issueResolutionFragmentView, "view");
        issueResolutionFragmentView.addImagesIfExists();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: attemptToSubmitIssue$lambda-7$lambda-6  reason: not valid java name */
    public static final void m39399attemptToSubmitIssue$lambda7$lambda6(IssueResolutionFragmentView issueResolutionFragmentView) {
        Log_OC.getArray(issueResolutionFragmentView, "view");
        issueResolutionFragmentView.showErrorMessage("please add description");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isKeyWordsInDescriptionSuggestingChargeback$lambda-4  reason: not valid java name */
    public static final void m39400isKeyWordsInDescriptionSuggestingChargeback$lambda4(IssueResolutionFragmentView issueResolutionFragmentView) {
        Log_OC.getArray(issueResolutionFragmentView, "it");
        issueResolutionFragmentView.showIsChargeBackDialog();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void logImageAdded(final int i) {
        FetchCurrentUser $r1 = this.currentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.issues.presenters.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                IssueResolutionFragmentPresenter $r12 = IssueResolutionFragmentPresenter.this;
                int $i0 = i;
                User $r3 = (User) obj;
                IssueResolutionFragmentPresenter.m39401logImageAdded$lambda8($r12, $i0, $r3);
            }
        };
        Attributes $r4 = Attributes.f392TO;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        Log_OC.loadImage($r5, "currentUser.execute().subscribe(\n            {\n                analytics.onAttachmentAdded(it.phoneNumber, count)\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r6 = this.disposables;
        $r6.b($r5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: logImageAdded$lambda-8  reason: not valid java name */
    public static final void m39401logImageAdded$lambda8(IssueResolutionFragmentPresenter issueResolutionFragmentPresenter, int i, User user) {
        Log_OC.getArray(issueResolutionFragmentPresenter, "this$0");
        Analytics $r3 = issueResolutionFragmentPresenter.analytics;
        String $r0 = user.getPhoneNumber();
        Log_OC.loadImage($r0, "it.phoneNumber");
        $r3.onAttachmentAdded($r0, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: selectPictureFromFile$lambda-2  reason: not valid java name */
    public static final void m39403selectPictureFromFile$lambda2(IssueResolutionFragmentPresenter issueResolutionFragmentPresenter, Boolean bool) {
        Log_OC.getArray(issueResolutionFragmentPresenter, "this$0");
        Log_OC.loadImage(bool, "hasPermission");
        boolean $z0 = bool.booleanValue();
        if ($z0) {
            Core $r2 = Core.context;
            issueResolutionFragmentPresenter.ifViewAttached($r2);
            return;
        }
        Observable $r3 = Observable.EMPTY;
        issueResolutionFragmentPresenter.ifViewAttached($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: selectPictureFromFile$lambda-2$lambda-0  reason: not valid java name */
    public static final void m39404selectPictureFromFile$lambda2$lambda0(IssueResolutionFragmentView issueResolutionFragmentView) {
        Log_OC.getArray(issueResolutionFragmentView, "view");
        Object[] $r1 = new Object[0];
        Timber.wtf("got to opener", $r1);
        issueResolutionFragmentView.openFromFile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: selectPictureFromFile$lambda-2$lambda-1  reason: not valid java name */
    public static final void m39405selectPictureFromFile$lambda2$lambda1(IssueResolutionFragmentView issueResolutionFragmentView) {
        Log_OC.getArray(issueResolutionFragmentView, "it");
        Object[] $r1 = new Object[0];
        Timber.wtf("got to permission", $r1);
        issueResolutionFragmentView.requestForStoragePermission();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void attemptToSubmitIssue(IssueTypeModel issueTypeModel, boolean z, String str) {
        boolean $z2;
        if (issueTypeModel == null) {
            return;
        }
        if (z) {
            issueTypeModel.setTitle(str);
            IssueLabels $r3 = IssueLabels.CHARGE_BACK;
            issueTypeModel.setLabel($r3.getLabel());
        }
        List $r4 = issueTypeModel.getImgUrls();
        $r4.clear();
        UnsignedInteger $r5 = UnsignedInteger.ONE;
        ifViewAttached($r5);
        boolean $z1 = Log_OC.append(issueTypeModel.getType(), IssueDetailsViewModelKt.OTHER_ISSUES_LABEL);
        if ($z1) {
            String $r2 = issueTypeModel.getDescription();
            boolean $z12 = false;
            if ($r2 != null) {
                $z2 = C13276s.m5440u($r2);
                if ($z2) {
                    $z12 = true;
                }
            }
            if ($z12) {
                MXParser $r6 = MXParser.reader;
                ifViewAttached($r6);
                return;
            }
        }
        List $r42 = issueTypeModel.getImgUrls();
        boolean $z13 = $r42.isEmpty();
        if (!$z13) {
            List $r43 = issueTypeModel.getImgUrls();
            int $i0 = $r43.size();
            logImageAdded($i0);
        }
        if (z) {
            IssueTypeNavigator $r7 = this.issueTypeNavigator;
            $r7.toCustomerDetailsFragment(issueTypeModel, z);
            return;
        }
        IssueTypeNavigator $r72 = this.issueTypeNavigator;
        $r72.toIssueSummaryFragment(issueTypeModel);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.C9410b, p272h.p364d.p365a.p366c.InterfaceC9413d
    public void destroy() {
        super.destroy();
        C11280b $r1 = this.disposables;
        $r1.m11214d();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isKeyWordsInDescriptionSuggestingChargeback(String str, boolean z, boolean z2) {
        List $r3;
        String $r5;
        Log_OC.getArray(str, "descriptionText");
        String[] $r2 = {"customer", "debited", "charge back", "account", "debit", "credited", "credit", Method.WALLET, "chargeback"};
        $r3 = C13726r.m3888h($r2);
        C0254x4ac6795c $r4 = C0254x4ac6795c.INSTANCE;
        $r5 = C13742z.m3797a0($r3, "|", null, null, 0, null, $r4, 30, null);
        C13262h $r6 = new C13262h("\\b(?:" + $r5 + ")\\b");
        boolean $z2 = $r6.m5526a(str);
        if ($z2 && !z && z2) {
            Preferences $r8 = Preferences.prefs;
            ifViewAttached($r8);
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void selectPictureFromFile() {
        CheckPermission $r2 = this.hasStoragePermission;
        AbstractC11688p $r3 = $r2.execute();
        Object object = new Object() { // from class: ai.kudi.agent.issues.presenters.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                IssueResolutionFragmentPresenter $r1 = IssueResolutionFragmentPresenter.this;
                Boolean $r32 = (Boolean) obj;
                IssueResolutionFragmentPresenter.m39403selectPictureFromFile$lambda2($r1, $r32);
            }
        };
        FormatedText $r1 = FormatedText.SINGLE_SPACE;
        FavoritesArrayAdapter $r5 = $r3.e0(object, $r1);
        C11280b $r6 = this.disposables;
        $r6.b($r5);
    }
}

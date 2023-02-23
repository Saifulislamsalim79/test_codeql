package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.common_screens.success_screen.fragment.SuccessScreenDialogFragment;
import ai.kudi.agent.common_screens.success_screen.labs.SuccessScreenCustomOption;
import ai.kudi.agent.core.mvp.MvpFragment;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.agent.feature_issue_resolution.databinding.FragmentIssueSummaryBinding;
import ai.kudi.agent.issues.adapters.IssueSummaryAdapter;
import ai.kudi.agent.issues.data.model.Issue;
import ai.kudi.agent.issues.presenters.SubmitIssuePresenter;
import ai.kudi.agent.issues.viewmodels.model.IssueTypeModel;
import ai.kudi.agent.issues.views.SubmitIssueView;
import ai.kudi.dip.library.button.KudiButton;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import dagger.android.p197e.C7429a;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13742z;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import p590o.p591a.Timber;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: IssueSummaryFragment.kt */
@Metadata(m10422d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 42\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004:\u00014B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0013H\u0016J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aH\u0096\u0001J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0012\u0010\u001e\u001a\u00020\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J$\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020(H\u0016J\u001a\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\t\u0010+\u001a\u00020\u0005H\u0096\u0001J\u0010\u0010,\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0012\u0010-\u001a\u00020\u00132\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00100\u001a\u00020\u0013H\u0016J\u0010\u00101\u001a\u00020\u00132\u0006\u00102\u001a\u000203H\u0016R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u00065"}, m10421d2 = {"Lai/kudi/agent/issues/ui/IssueSummaryFragment;", "Lai/kudi/agent/core/mvp/MvpFragment;", "Lai/kudi/agent/issues/views/SubmitIssueView;", "Lai/kudi/agent/issues/presenters/SubmitIssuePresenter;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/feature_issue_resolution/databinding/FragmentIssueSummaryBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/feature_issue_resolution/databinding/FragmentIssueSummaryBinding;", "issueData", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "submitIssuePresenter", "getSubmitIssuePresenter", "()Lai/kudi/agent/issues/presenters/SubmitIssuePresenter;", "setSubmitIssuePresenter", "(Lai/kudi/agent/issues/presenters/SubmitIssuePresenter;)V", "createPresenter", "displayIssueData", "", "issueSummaryAdapter", "Lai/kudi/agent/issues/adapters/IssueSummaryAdapter;", "hideLoading", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onPrepareOptionsMenu", "menu", "Landroid/view/Menu;", "onViewCreated", "view", "requireBinding", "setUpView", "showErrorMsg", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "", "showLoading", "showTicketResponse", "ticket", "Lai/kudi/agent/issues/data/model/Issue$Ticket;", "Companion", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.IssueSummaryFragment */
/* loaded from: classes.dex */
public final class IssueSummaryFragment extends MvpFragment<SubmitIssueView, SubmitIssuePresenter> implements SubmitIssueView, BaseViewBinder<FragmentIssueSummaryBinding> {
    public static final Companion Companion;
    private static final String ISSUE_DATA = "Issue Data";
    private final /* synthetic */ BaseViewBinderImpl<FragmentIssueSummaryBinding> $$delegate_0;
    private IssueTypeModel issueData;
    public SubmitIssuePresenter submitIssuePresenter;

    /* compiled from: IssueSummaryFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/issues/ui/IssueSummaryFragment$Companion;", "", "()V", CustomerDetailsIssueFragment.ISSUE_DATA, "", "newInstance", "Lai/kudi/agent/issues/ui/IssueSummaryFragment;", "issueData", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.issues.ui.IssueSummaryFragment$Companion */
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
        public final IssueSummaryFragment newInstance(IssueTypeModel issueTypeModel) {
            Log_OC.getArray(issueTypeModel, "issueData");
            IssueSummaryFragment r5 = new IssueSummaryFragment();
            Bundle r6 = new Bundle();
            r6.putParcelable(IssueSummaryFragment.ISSUE_DATA, issueTypeModel);
            C13666w c13666w = C13666w.f30112a;
            IssueSummaryFragment r7 = r5;
            r7.setArguments(r6);
            return r5;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public IssueSummaryFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void displayIssueData(ai.kudi.agent.issues.viewmodels.model.IssueTypeModel r22, ai.kudi.agent.issues.adapters.IssueSummaryAdapter r23) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.issues.p008ui.IssueSummaryFragment.displayIssueData(ai.kudi.agent.issues.viewmodels.model.IssueTypeModel, ai.kudi.agent.issues.adapters.IssueSummaryAdapter):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setUpView(final IssueTypeModel issueTypeModel) {
        List $r8;
        String $r2 = Log_OC.m10359a("issueData ", issueTypeModel);
        Object[] $r3 = new Object[0];
        Timber.wtf($r2, $r3);
        IssueSummaryAdapter.DataToShow[] $r4 = new IssueSummaryAdapter.DataToShow[2];
        String $r6 = issueTypeModel.getTitle();
        String $r7 = $r6;
        if ($r6 == null) {
            $r7 = "";
        }
        IssueSummaryAdapter.DataToShow r18 = new IssueSummaryAdapter.DataToShow("Issue Title", $r7);
        $r4[0] = r18;
        String $r62 = issueTypeModel.getDescription();
        String $r22 = $r62 != null ? $r62 : "";
        IssueSummaryAdapter.DataToShow r182 = new IssueSummaryAdapter.DataToShow("comments", $r22);
        $r4[1] = r182;
        $r8 = C13726r.m3885k($r4);
        FragmentIssueSummaryBinding $r9 = requireBinding();
        RecyclerView $r10 = $r9.recyclerView2;
        IssueSummaryFragment r23 = this;
        FragmentActivity $r12 = r23.getActivity();
        LinearLayoutManager r19 = new LinearLayoutManager($r12);
        $r10.setLayoutManager(r19);
        RecyclerView $r102 = $r9.recyclerView2;
        $r102.setHasFixedSize(true);
        IssueSummaryAdapter r20 = new IssueSummaryAdapter($r8);
        RecyclerView $r103 = $r9.recyclerView2;
        $r103.setAdapter(r20);
        displayIssueData(issueTypeModel, r20);
        TextView $r14 = $r9.cancelButton;
        TextView r24 = $r14;
        r24.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.DebugActivity$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IssueSummaryFragment $r23 = IssueSummaryFragment.this;
                IssueSummaryFragment.m39490setUpView$lambda4$lambda2($r23, view);
            }
        });
        ViewGroup $r16 = $r9.submitIssueButton;
        ViewGroup r25 = $r16;
        r25.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IssueSummaryFragment $r23 = IssueSummaryFragment.this;
                IssueTypeModel $r32 = issueTypeModel;
                IssueSummaryFragment.m39491setUpView$lambda4$lambda3($r23, $r32, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpView$lambda-4$lambda-2  reason: not valid java name */
    public static final void m39490setUpView$lambda4$lambda2(IssueSummaryFragment issueSummaryFragment, View view) {
        Log_OC.getArray(issueSummaryFragment, "this$0");
        IssueSummaryFragment r3 = issueSummaryFragment;
        FragmentActivity $r0 = r3.getActivity();
        if ($r0 == null) {
            return;
        }
        $r0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpView$lambda-4$lambda-3  reason: not valid java name */
    public static final void m39491setUpView$lambda4$lambda3(IssueSummaryFragment issueSummaryFragment, IssueTypeModel issueTypeModel, View view) {
        List $r5;
        Log_OC.getArray(issueSummaryFragment, "this$0");
        Log_OC.getArray(issueTypeModel, "$issueData");
        SubmitIssuePresenter $r3 = issueSummaryFragment.getSubmitIssuePresenter();
        List $r4 = issueTypeModel.getImgUrls();
        List $r52 = issueTypeModel.getDefaultUrls();
        $r5 = C13742z.m3825B0($r52);
        $r3.submitIssue(issueTypeModel, $r4, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public SubmitIssuePresenter createPresenter() {
        SubmitIssuePresenter $r1 = getSubmitIssuePresenter();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public /* bridge */ /* synthetic */ InterfaceC9413d createPresenter() {
        InterfaceC9413d $r1 = createPresenter();
        InterfaceC9413d r2 = $r1;
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentIssueSummaryBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentIssueSummaryBinding $r3 = (FragmentIssueSummaryBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentIssueSummaryBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SubmitIssuePresenter getSubmitIssuePresenter() {
        SubmitIssuePresenter $r1 = this.submitIssuePresenter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("submitIssuePresenter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.views.SubmitIssueView
    public void hideLoading() {
        FragmentIssueSummaryBinding $r1 = requireBinding();
        KudiButton $r2 = $r1.submitIssueButton;
        $r2.m38033e();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentIssueSummaryBinding fragmentIssueSummaryBinding, Fragment fragment) {
        Log_OC.getArray(fragmentIssueSummaryBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentIssueSummaryBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentIssueSummaryBinding $r4 = (FragmentIssueSummaryBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        IssueSummaryFragment r2 = this;
        C7429a.m18752b(r2);
        IssueSummaryFragment r22 = this;
        super.onAttach(context);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        IssueSummaryFragment r6 = this;
        r6.setHasOptionsMenu(true);
        IssueSummaryFragment r62 = this;
        Bundle $r1 = r62.getArguments();
        if ($r1 == null) {
            return;
        }
        Parcelable $r2 = $r1.getParcelable(ISSUE_DATA);
        if ($r2 == null) {
            NullPointerException r5 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.issues.viewmodels.model.IssueTypeModel");
            throw r5;
        }
        IssueTypeModel $r3 = (IssueTypeModel) $r2;
        this.issueData = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentIssueSummaryBinding $r4 = FragmentIssueSummaryBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        IssueSummaryFragment r6 = this;
        View $r5 = initBinding($r4, (Fragment) r6);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        Log_OC.getArray(menu, "menu");
        IssueSummaryFragment r3 = this;
        super.onPrepareOptionsMenu(menu);
        int $i0 = C0214R.C0216id.search_menu;
        MenuItem $r1 = menu.findItem($i0);
        $r1.setVisible(false);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        IssueSummaryFragment r11 = this;
        FragmentActivity $r3 = r11.getActivity();
        if ($r3 == null) {
            NullPointerException r10 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.issues.ui.IssueActivity");
            throw r10;
        }
        IssueActivity $r4 = (IssueActivity) $r3;
        $r4.setIconVisibility(false);
        IssueSummaryFragment r112 = this;
        FragmentActivity $r32 = r112.getActivity();
        if ($r32 == null) {
            NullPointerException r102 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.issues.ui.IssueActivity");
            throw r102;
        }
        IssueActivity $r42 = (IssueActivity) $r32;
        AppCompatActivity r12 = (AppCompatActivity) $r42;
        AbstractC0925a $r5 = r12.getSupportActionBar();
        if ($r5 != null) {
            int $i0 = C0214R.string.issue_summary;
            IssueSummaryFragment r113 = this;
            String $r6 = r113.getString($i0);
            $r5.mo37631C($r6);
        }
        SubmitIssuePresenter $r7 = getSubmitIssuePresenter();
        $r7.logOnIssueSummaryReached();
        IssueTypeModel $r8 = this.issueData;
        if ($r8 == null) {
            return;
        }
        setUpView($r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentIssueSummaryBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentIssueSummaryBinding $r3 = (FragmentIssueSummaryBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentIssueSummaryBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setSubmitIssuePresenter(SubmitIssuePresenter submitIssuePresenter) {
        Log_OC.getArray(submitIssuePresenter, "<set-?>");
        this.submitIssuePresenter = submitIssuePresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.views.SubmitIssueView
    public void showErrorMsg(String str) {
        IssueSummaryFragment r3 = this;
        Context $r2 = r3.requireContext();
        Log_OC.loadImage($r2, "requireContext()");
        ContextExtKt.toast$default($r2, str, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.views.SubmitIssueView
    public void showLoading() {
        FragmentIssueSummaryBinding $r1 = requireBinding();
        KudiButton $r2 = $r1.submitIssueButton;
        $r2.m38032f();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.views.SubmitIssueView
    public void showTicketResponse(Issue.Ticket ticket) {
        Log_OC.getArray(ticket, "ticket");
        SuccessScreenDialogFragment.Companion $r2 = SuccessScreenDialogFragment.Companion;
        int $i0 = C0214R.C0215drawable.ic_send_plane;
        SuccessScreenCustomOption r7 = new SuccessScreenCustomOption("Issue Submitted", "We will get back to you soon", "Check Status", true, false, false, 0, 0, 0, 0, $i0, 0, false, 7152, null);
        IssueSummaryFragment$showTicketResponse$1 r8 = new IssueSummaryFragment$showTicketResponse$1(this, ticket);
        SuccessScreenDialogFragment $r5 = $r2.newInstance(r7, r8);
        IssueSummaryFragment r9 = this;
        FragmentManager $r6 = r9.getChildFragmentManager();
        $r5.show($r6, "Success Fragment");
    }
}

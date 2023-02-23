package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.agent.feature_issue_resolution.databinding.FragmentSupportIssueBinding;
import ai.kudi.agent.issues.presenters.SupportIssuePresenter;
import ai.kudi.agent.issues.viewmodels.model.IssueTypeModel;
import ai.kudi.agent.issues.views.SupportIssueView;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import dagger.android.p197e.C7429a;
import java.util.Locale;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.AbstractC9412c;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
/* compiled from: SupportIssueFragment.kt */
@Metadata(m10422d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001+B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0096\u0001J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0015H\u0002J\u0012\u0010\u001c\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J$\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020&H\u0016J\u001a\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\t\u0010)\u001a\u00020\u0005H\u0096\u0001J\b\u0010*\u001a\u00020\u0015H\u0002R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006,"}, m10421d2 = {"Lai/kudi/agent/issues/ui/SupportIssueFragment;", "Lcom/hannesdorfmann/mosby3/mvp/MvpFragment;", "Lai/kudi/agent/issues/views/SupportIssueView;", "Lai/kudi/agent/issues/presenters/SupportIssuePresenter;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/feature_issue_resolution/databinding/FragmentSupportIssueBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/feature_issue_resolution/databinding/FragmentSupportIssueBinding;", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/issues/presenters/SupportIssuePresenter;", "setThisPresenter", "(Lai/kudi/agent/issues/presenters/SupportIssuePresenter;)V", "createPresenter", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "navigateIssueCreationBasedOnTransactionType", "", "issueTypeModel", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "onAttach", "context", "Landroid/content/Context;", "onClickNo", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onPrepareOptionsMenu", "menu", "Landroid/view/Menu;", "onViewCreated", "view", "requireBinding", "setUpView", "Companion", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.SupportIssueFragment */
/* loaded from: classes.dex */
public final class SupportIssueFragment extends AbstractC9412c<SupportIssueView, SupportIssuePresenter> implements BaseViewBinder<FragmentSupportIssueBinding> {
    public static final Companion Companion;
    public static final String ISSUE_MODEL_SUPPORT = "ISSUE_MODEL_SUPPORT";
    private final /* synthetic */ BaseViewBinderImpl<FragmentSupportIssueBinding> $$delegate_0;
    public SupportIssuePresenter thisPresenter;

    /* compiled from: SupportIssueFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/issues/ui/SupportIssueFragment$Companion;", "", "()V", SupportIssueFragment.ISSUE_MODEL_SUPPORT, "", "newInstance", "Lai/kudi/agent/issues/ui/SupportIssueFragment;", "issueTypeModel", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.issues.ui.SupportIssueFragment$Companion */
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
        public final SupportIssueFragment newInstance(IssueTypeModel issueTypeModel) {
            Log_OC.getArray(issueTypeModel, "issueTypeModel");
            SupportIssueFragment r5 = new SupportIssueFragment();
            Bundle r6 = new Bundle();
            r6.putParcelable(SupportIssueFragment.ISSUE_MODEL_SUPPORT, issueTypeModel);
            C13666w c13666w = C13666w.f30112a;
            SupportIssueFragment r7 = r5;
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
    public SupportIssueFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void navigateIssueCreationBasedOnTransactionType(IssueTypeModel issueTypeModel) {
        String $r2;
        String $r22 = issueTypeModel.getTransactionType();
        if ($r22 == null) {
            $r2 = null;
        } else {
            Locale $r3 = Locale.getDefault();
            Log_OC.loadImage($r3, "getDefault()");
            String $r4 = $r22.toLowerCase($r3);
            $r2 = $r4;
            Log_OC.loadImage($r4, "(this as java.lang.String).toLowerCase(locale)");
        }
        Log_OC.append($r2, "pos");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final SupportIssueFragment newInstance(IssueTypeModel issueTypeModel) {
        Companion $r0 = Companion;
        SupportIssueFragment $r1 = $r0.newInstance(issueTypeModel);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onClickNo() {
        SupportIssueFragment r2 = this;
        FragmentActivity $r1 = r2.getActivity();
        if ($r1 == null) {
            return;
        }
        $r1.finish();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setUpView() {
        final IssueTypeModel $r2;
        SupportIssueFragment r14 = this;
        Bundle $r1 = r14.getArguments();
        if ($r1 == null) {
            $r2 = null;
        } else {
            Parcelable $r3 = $r1.getParcelable(ISSUE_MODEL_SUPPORT);
            $r2 = (IssueTypeModel) $r3;
        }
        if ($r2 == null) {
            NullPointerException r13 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.issues.viewmodels.model.IssueTypeModel");
            throw r13;
        }
        FragmentSupportIssueBinding $r4 = requireBinding();
        TextView $r5 = $r4.titleTextView;
        String $r6 = $r2.getTitle();
        $r5.setText($r6);
        TextView $r52 = $r4.descriptionTextView;
        String $r62 = $r2.getDescription();
        $r52.setText($r62);
        Button $r7 = $r4.noButton;
        $r7.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.NumberPicker
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SupportIssueFragment $r22 = SupportIssueFragment.this;
                IssueTypeModel $r32 = $r2;
                SupportIssueFragment.m39508setUpView$lambda3$lambda1($r22, $r32, view);
            }
        });
        Button $r72 = $r4.yesButton;
        $r72.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.AbstractFilePickerFragment$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SupportIssueFragment $r22 = SupportIssueFragment.this;
                IssueTypeModel $r32 = $r2;
                SupportIssueFragment.m39509setUpView$lambda3$lambda2($r22, $r32, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpView$lambda-3$lambda-1  reason: not valid java name */
    public static final void m39508setUpView$lambda3$lambda1(SupportIssueFragment supportIssueFragment, IssueTypeModel issueTypeModel, View view) {
        Log_OC.getArray(supportIssueFragment, "this$0");
        Log_OC.getArray(issueTypeModel, "$issueTypeModel");
        SupportIssuePresenter $r2 = supportIssueFragment.getThisPresenter();
        $r2.logEventOnUnHelpfulIssueButtonClicked(issueTypeModel);
        supportIssueFragment.navigateIssueCreationBasedOnTransactionType(issueTypeModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpView$lambda-3$lambda-2  reason: not valid java name */
    public static final void m39509setUpView$lambda3$lambda2(SupportIssueFragment supportIssueFragment, IssueTypeModel issueTypeModel, View view) {
        Log_OC.getArray(supportIssueFragment, "this$0");
        Log_OC.getArray(issueTypeModel, "$issueTypeModel");
        SupportIssuePresenter $r2 = supportIssueFragment.getThisPresenter();
        $r2.logEventOnHelpfulIssueButtonClicked(issueTypeModel);
        supportIssueFragment.onClickNo();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public SupportIssuePresenter createPresenter() {
        SupportIssuePresenter $r1 = getThisPresenter();
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
    public FragmentSupportIssueBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentSupportIssueBinding $r3 = (FragmentSupportIssueBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentSupportIssueBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SupportIssuePresenter getThisPresenter() {
        SupportIssuePresenter $r1 = this.thisPresenter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("thisPresenter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentSupportIssueBinding fragmentSupportIssueBinding, Fragment fragment) {
        Log_OC.getArray(fragmentSupportIssueBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentSupportIssueBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentSupportIssueBinding $r4 = (FragmentSupportIssueBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        SupportIssueFragment r2 = this;
        C7429a.m18752b(r2);
        SupportIssueFragment r22 = this;
        super.onAttach(context);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SupportIssueFragment r2 = this;
        r2.setHasOptionsMenu(true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentSupportIssueBinding $r4 = FragmentSupportIssueBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        SupportIssueFragment r6 = this;
        View $r5 = initBinding($r4, (Fragment) r6);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        Log_OC.getArray(menu, "menu");
        SupportIssueFragment r3 = this;
        super.onPrepareOptionsMenu(menu);
        int $i0 = C0214R.C0216id.search_menu;
        MenuItem $r1 = menu.findItem($i0);
        $r1.setVisible(false);
    }

    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        setUpView();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentSupportIssueBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentSupportIssueBinding $r3 = (FragmentSupportIssueBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentSupportIssueBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setThisPresenter(SupportIssuePresenter supportIssuePresenter) {
        Log_OC.getArray(supportIssuePresenter, "<set-?>");
        this.thisPresenter = supportIssuePresenter;
    }
}

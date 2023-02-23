package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.agent.feature_issue_resolution.databinding.FragmentPosIssueBinding;
import ai.kudi.agent.issues.p008ui.IssueTypeFragment;
import ai.kudi.agent.issues.presenters.PosIssuePresenter;
import ai.kudi.agent.issues.viewmodels.model.IssueTypeModelWithDuplicateChecker;
import ai.kudi.agent.issues.views.PosIssueView;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.fragment.app.AbstractC1449b0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import dagger.android.p197e.C7429a;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.AbstractC9412c;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
/* compiled from: PosIssueFragment.kt */
@Metadata(m10422d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001(B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0096\u0001J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J$\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\t\u0010\"\u001a\u00020\u0005H\u0096\u0001J\u0016\u0010#\u001a\u00020\u00112\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%H\u0016J\b\u0010'\u001a\u00020\u0011H\u0016R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006)"}, m10421d2 = {"Lai/kudi/agent/issues/ui/PosIssueFragment;", "Lcom/hannesdorfmann/mosby3/mvp/MvpFragment;", "Lai/kudi/agent/issues/views/PosIssueView;", "Lai/kudi/agent/issues/presenters/PosIssuePresenter;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/feature_issue_resolution/databinding/FragmentPosIssueBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/feature_issue_resolution/databinding/FragmentPosIssueBinding;", "posIssuePresenter", "getPosIssuePresenter", "()Lai/kudi/agent/issues/presenters/PosIssuePresenter;", "setPosIssuePresenter", "(Lai/kudi/agent/issues/presenters/PosIssuePresenter;)V", "createPresenter", "hideLoading", "", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "requireBinding", "showIssueType", "issueTypeList", "", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "showLoading", "Companion", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.PosIssueFragment */
/* loaded from: classes.dex */
public final class PosIssueFragment extends AbstractC9412c<PosIssueView, PosIssuePresenter> implements PosIssueView, BaseViewBinder<FragmentPosIssueBinding> {
    public static final Companion Companion;
    private final /* synthetic */ BaseViewBinderImpl<FragmentPosIssueBinding> $$delegate_0;
    public PosIssuePresenter posIssuePresenter;

    /* compiled from: PosIssueFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/issues/ui/PosIssueFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/issues/ui/PosIssueFragment;", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.issues.ui.PosIssueFragment$Companion */
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
        public final PosIssueFragment newInstance() {
            PosIssueFragment $r1 = new PosIssueFragment();
            return $r1;
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
    public PosIssueFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final PosIssueFragment newInstance() {
        Companion $r1 = Companion;
        PosIssueFragment $r0 = $r1.newInstance();
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public PosIssuePresenter createPresenter() {
        PosIssuePresenter $r1 = getPosIssuePresenter();
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
    public FragmentPosIssueBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentPosIssueBinding $r3 = (FragmentPosIssueBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentPosIssueBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PosIssuePresenter getPosIssuePresenter() {
        PosIssuePresenter $r1 = this.posIssuePresenter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("posIssuePresenter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.views.PosIssueView
    public void hideLoading() {
        FragmentPosIssueBinding $r1 = requireBinding();
        ProgressBar $r2 = $r1.posProgressBar;
        Log_OC.loadImage($r2, "requireBinding().posProgressBar");
        ViewExtKt.hide$default($r2, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentPosIssueBinding fragmentPosIssueBinding, Fragment fragment) {
        Log_OC.getArray(fragmentPosIssueBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentPosIssueBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentPosIssueBinding $r4 = (FragmentPosIssueBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        PosIssueFragment r2 = this;
        C7429a.m18752b(r2);
        PosIssueFragment r22 = this;
        super.onAttach(context);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentPosIssueBinding $r4 = FragmentPosIssueBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        PosIssueFragment r6 = this;
        View $r5 = initBinding($r4, (Fragment) r6);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        PosIssuePresenter $r2 = getPosIssuePresenter();
        $r2.getPosIssueInfo();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentPosIssueBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentPosIssueBinding $r3 = (FragmentPosIssueBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentPosIssueBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setPosIssuePresenter(PosIssuePresenter posIssuePresenter) {
        Log_OC.getArray(posIssuePresenter, "<set-?>");
        this.posIssuePresenter = posIssuePresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.views.PosIssueView
    public void showIssueType(List list) {
        Log_OC.getArray(list, "issueTypeList");
        IssueTypeModelWithDuplicateChecker r7 = new IssueTypeModelWithDuplicateChecker(null, list);
        IssueTypeFragment.Companion $r3 = IssueTypeFragment.Companion;
        IssueTypeFragment $r4 = $r3.newInstance("", "", "pos", r7);
        PosIssueFragment r8 = this;
        FragmentManager $r5 = r8.getChildFragmentManager();
        AbstractC1449b0 $r6 = $r5.m35924l();
        int $i0 = C0214R.C0216id.posIssueContainer;
        $r6.m35821r($i0, $r4);
        $r6.mo35805i();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.views.PosIssueView
    public void showLoading() {
        FragmentPosIssueBinding $r1 = requireBinding();
        ProgressBar $r2 = $r1.posProgressBar;
        Log_OC.loadImage($r2, "requireBinding().posProgressBar");
        ViewExtKt.show($r2);
    }
}

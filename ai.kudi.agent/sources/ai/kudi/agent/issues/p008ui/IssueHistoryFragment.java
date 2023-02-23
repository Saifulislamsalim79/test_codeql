package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.core.databinding.EmptyHistoryBinding;
import ai.kudi.agent.core.mvp.MvpFragment;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.agent.feature_issue_resolution.databinding.FragmentIssueHistoryBinding;
import ai.kudi.agent.filter.domain.FilteredDate;
import ai.kudi.agent.filter.p005ui.DateFilterFragment;
import ai.kudi.agent.issues.adapters.IssueHistoryAdapter;
import ai.kudi.agent.issues.presenters.IssueHistoryPresenter;
import ai.kudi.agent.issues.views.IssueHistoryView;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.dip.library.filter.KudiDateAndTypeFilterView;
import ai.kudi.dip.library.p043h.DialogC0809i;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import androidx.lifecycle.PreferenceActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import dagger.android.p197e.C7429a;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: IssueHistoryFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 R2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001RB\u0005¢\u0006\u0002\u0010\u0006J\b\u0010-\u001a\u00020\u0003H\u0016J\u0012\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u00020 H\u0002J\b\u00101\u001a\u00020/H\u0016J\b\u00102\u001a\u00020/H\u0016J\u0019\u00103\u001a\u0002042\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u00105\u001a\u000206H\u0096\u0001J\b\u00107\u001a\u00020/H\u0002J\u0010\u00108\u001a\u00020/2\u0006\u00109\u001a\u00020:H\u0016J$\u0010;\u001a\u0002042\u0006\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?2\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\b\u0010B\u001a\u00020/H\u0016J\b\u0010C\u001a\u00020/H\u0016J\b\u0010D\u001a\u00020/H\u0016J\u001a\u0010E\u001a\u00020/2\u0006\u0010F\u001a\u0002042\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\t\u0010G\u001a\u00020\u0005H\u0096\u0001J\b\u0010H\u001a\u00020/H\u0016J\u0018\u0010I\u001a\u00020/2\u0006\u0010J\u001a\u00020 2\u0006\u0010\"\u001a\u00020#H\u0016J\u001e\u0010K\u001a\u00020/2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020N0M2\u0006\u0010O\u001a\u00020\u000bH\u0016J\b\u0010P\u001a\u00020/H\u0016J\b\u0010Q\u001a\u00020/H\u0016R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010(\u001a\n **\u0004\u0018\u00010)0)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006S"}, m10421d2 = {"Lai/kudi/agent/issues/ui/IssueHistoryFragment;", "Lai/kudi/agent/core/mvp/MvpFragment;", "Lai/kudi/agent/issues/views/IssueHistoryView;", "Lai/kudi/agent/issues/presenters/IssueHistoryPresenter;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/feature_issue_resolution/databinding/FragmentIssueHistoryBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/feature_issue_resolution/databinding/FragmentIssueHistoryBinding;", "dateIsBeingFiltered", "", "filterBottomSheet", "Lai/kudi/dip/library/bottomSheets/FilterBottomSheet;", "getFilterBottomSheet", "()Lai/kudi/dip/library/bottomSheets/FilterBottomSheet;", "setFilterBottomSheet", "(Lai/kudi/dip/library/bottomSheets/FilterBottomSheet;)V", "filteredDate", "Lai/kudi/agent/filter/domain/FilteredDate;", "getFilteredDate", "()Lai/kudi/agent/filter/domain/FilteredDate;", "setFilteredDate", "(Lai/kudi/agent/filter/domain/FilteredDate;)V", "issueHistoryAdapter", "Lai/kudi/agent/issues/adapters/IssueHistoryAdapter;", "issueHistoryPresenter", "getIssueHistoryPresenter", "()Lai/kudi/agent/issues/presenters/IssueHistoryPresenter;", "setIssueHistoryPresenter", "(Lai/kudi/agent/issues/presenters/IssueHistoryPresenter;)V", "lastSelectedStatus", "", "listIsBeingFiltered", "page", "", "getPage", "()I", "setPage", "(I)V", "shimmerLoaderList", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "kotlin.jvm.PlatformType", "getShimmerLoaderList", "()Lcom/facebook/shimmer/ShimmerFrameLayout;", "createPresenter", "fetchFilteredIssueHistory", "", TransactionField.STATUS, "hideLoading", "hideNextLoading", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "initBottomSheet", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onStart", "onViewCreated", "view", "requireBinding", "showEmptyActivities", "showErrorMessage", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "showIssueList", "issueList", "", "Lai/kudi/agent/issues/data/model/Issue$Ticket;", "toAddList", "showLoading", "showNextLoading", "Companion", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.IssueHistoryFragment */
/* loaded from: classes.dex */
public final class IssueHistoryFragment extends MvpFragment<IssueHistoryView, IssueHistoryPresenter> implements IssueHistoryView, BaseViewBinder<FragmentIssueHistoryBinding> {
    public static final Companion Companion;
    private final /* synthetic */ BaseViewBinderImpl<FragmentIssueHistoryBinding> $$delegate_0;
    private boolean dateIsBeingFiltered;
    private DialogC0809i filterBottomSheet;
    public FilteredDate filteredDate;
    private IssueHistoryAdapter issueHistoryAdapter;
    public IssueHistoryPresenter issueHistoryPresenter;
    private String lastSelectedStatus;
    private boolean listIsBeingFiltered;
    private int page;

    /* compiled from: IssueHistoryFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/issues/ui/IssueHistoryFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/issues/ui/IssueHistoryFragment;", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.issues.ui.IssueHistoryFragment$Companion */
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
        public final IssueHistoryFragment newInstance() {
            IssueHistoryFragment r4 = new IssueHistoryFragment();
            Bundle r5 = new Bundle();
            C13666w c13666w = C13666w.f30112a;
            IssueHistoryFragment r6 = r4;
            r6.setArguments(r5);
            return r4;
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
    public IssueHistoryFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
        this.page = 1;
        this.lastSelectedStatus = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchFilteredIssueHistory(String str) {
        InterfaceC9413d $r2 = this.presenter;
        IssueHistoryPresenter $r3 = (IssueHistoryPresenter) $r2;
        $r3.logOnIssueHistoryFilterClicked();
        this.page = 1;
        this.listIsBeingFiltered = true;
        FilteredDate $r4 = getFilteredDate();
        Date $r5 = $r4.getFrom();
        String $r6 = DateExtKt.convertDateToGivenFormat($r5, "yyyy/MM/dd");
        FilteredDate $r42 = getFilteredDate();
        Date $r52 = $r42.getTo();
        String $r7 = DateExtKt.convertDateToGivenFormat($r52, "yyyy/MM/dd");
        int $i0 = this.page;
        IssueHistoryPresenter $r32 = getIssueHistoryPresenter();
        $r32.loadIssueHistory($r6, $r7, str, $i0, true, false);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ void fetchFilteredIssueHistory$default(IssueHistoryFragment issueHistoryFragment, String $r2, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $r2 = "";
        }
        issueHistoryFragment.fetchFilteredIssueHistory($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final ShimmerFrameLayout getShimmerLoaderList() {
        IssueHistoryFragment r3 = this;
        View $r1 = r3.requireView();
        int $i0 = C0214R.C0216id.shimmerLoaderList;
        ShimmerFrameLayout $r2 = (ShimmerFrameLayout) $r1.findViewById($i0);
        return $r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void initBottomSheet() {
        IssueHistoryFragment r6 = this;
        Context $r2 = r6.requireContext();
        Log_OC.loadImage($r2, "requireContext()");
        IssueHistoryFragment$initBottomSheet$1 r4 = new IssueHistoryFragment$initBottomSheet$1(this);
        DialogC0809i r5 = new DialogC0809i($r2, r4);
        this.filterBottomSheet = r5;
        if (r5 == null) {
            return;
        }
        DialogC0809i r7 = r5;
        r7.show();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final IssueHistoryFragment newInstance() {
        Companion $r1 = Companion;
        IssueHistoryFragment $r0 = $r1.newInstance();
        return $r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-2$lambda-1  reason: not valid java name */
    public static final void m39484onViewCreated$lambda2$lambda1(IssueHistoryFragment issueHistoryFragment, FragmentIssueHistoryBinding fragmentIssueHistoryBinding, String str, Bundle bundle) {
        Log_OC.getArray(issueHistoryFragment, "this$0");
        Log_OC.getArray(fragmentIssueHistoryBinding, "$this_apply");
        Log_OC.getArray(str, "requestKey");
        Log_OC.getArray(bundle, "result");
        boolean $z0 = Log_OC.append(str, DateFilterFragment.RESULT_KEY_FILTERED_DATE);
        if ($z0) {
            Serializable $r4 = bundle.getSerializable(DateFilterFragment.RESULT_KEY_FILTERED_DATE);
            boolean $z02 = $r4 instanceof FilteredDate;
            FilteredDate $r5 = $z02 ? (FilteredDate) $r4 : null;
            if ($r5 == null) {
                return;
            }
            issueHistoryFragment.setFilteredDate($r5);
            Date $r6 = $r5.getFrom();
            Date $r7 = $r5.getTo();
            String $r2 = DateExtKt.getDateDiff$default($r6, $r7, 0, null, 8, null);
            KudiDateAndTypeFilterView $r8 = fragmentIssueHistoryBinding.issueHistoryDateAndTypeFilterView;
            $r8.setDateText($r2);
            issueHistoryFragment.dateIsBeingFiltered = true;
            String $r22 = issueHistoryFragment.lastSelectedStatus;
            issueHistoryFragment.fetchFilteredIssueHistory($r22);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public IssueHistoryPresenter createPresenter() {
        IssueHistoryPresenter $r1 = getIssueHistoryPresenter();
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
    public FragmentIssueHistoryBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentIssueHistoryBinding $r3 = (FragmentIssueHistoryBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentIssueHistoryBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final DialogC0809i getFilterBottomSheet() {
        DialogC0809i r1 = this.filterBottomSheet;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FilteredDate getFilteredDate() {
        FilteredDate $r1 = this.filteredDate;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("filteredDate");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final IssueHistoryPresenter getIssueHistoryPresenter() {
        IssueHistoryPresenter $r1 = this.issueHistoryPresenter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("issueHistoryPresenter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getPage() {
        int i0 = this.page;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.views.IssueHistoryView
    public void hideLoading() {
        FragmentIssueHistoryBinding $r1 = requireBinding();
        View $r2 = $r1.issueHistoryRecyclerView;
        Log_OC.loadImage($r2, "issueHistoryRecyclerView");
        View r5 = $r2;
        ViewExtKt.show(r5);
        ShimmerFrameLayout $r3 = $r1.shimmerLoaderList;
        $r3.m32964d();
        FrameLayout $r4 = $r1.issueHistoryloadingStateView;
        Log_OC.loadImage($r4, "issueHistoryloadingStateView");
        ViewExtKt.hide$default($r4, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.views.IssueHistoryView
    public void hideNextLoading() {
        FragmentIssueHistoryBinding $r1 = requireBinding();
        ProgressBar $r2 = $r1.issueHistoryNextLoadingView;
        Log_OC.loadImage($r2, "requireBinding().issueHistoryNextLoadingView");
        ViewExtKt.hide$default($r2, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentIssueHistoryBinding fragmentIssueHistoryBinding, Fragment fragment) {
        Log_OC.getArray(fragmentIssueHistoryBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentIssueHistoryBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentIssueHistoryBinding $r4 = (FragmentIssueHistoryBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        IssueHistoryFragment r2 = this;
        C7429a.m18752b(r2);
        IssueHistoryFragment r22 = this;
        super.onAttach(context);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentIssueHistoryBinding $r4 = FragmentIssueHistoryBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        IssueHistoryFragment r6 = this;
        View $r5 = initBinding($r4, (Fragment) r6);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        DialogC0809i $r1 = this.filterBottomSheet;
        if ($r1 == null) {
            return;
        }
        $r1.dismiss();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        ShimmerFrameLayout $r1 = getShimmerLoaderList();
        $r1.m32964d();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        ShimmerFrameLayout $r1 = getShimmerLoaderList();
        $r1.m32965c();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        IssueHistoryAdapter r21 = new IssueHistoryAdapter();
        this.issueHistoryAdapter = r21;
        Date $r6 = new Date();
        Date r22 = new Date();
        FilteredDate r23 = new FilteredDate($r6, r22);
        setFilteredDate(r23);
        final FragmentIssueHistoryBinding $r7 = requireBinding();
        IssueHistoryFragment r30 = this;
        Context $r9 = r30.requireContext();
        LinearLayoutManager r24 = new LinearLayoutManager($r9);
        RecyclerView $r10 = $r7.issueHistoryRecyclerView;
        $r10.setLayoutManager(r24);
        RecyclerView $r102 = $r7.issueHistoryRecyclerView;
        $r102.setAdapter(this.issueHistoryAdapter);
        IssueHistoryAdapter $r3 = this.issueHistoryAdapter;
        if ($r3 != null) {
            IssueHistoryFragment$onViewCreated$1$1 r25 = new IssueHistoryFragment$onViewCreated$1$1(this);
            $r3.setOnClickListener(r25);
        }
        IssueHistoryPresenter $r12 = getIssueHistoryPresenter();
        IssueHistoryPresenter.loadIssueHistory$default($r12, null, null, null, 0, true, false, 15, null);
        RecyclerView $r103 = $r7.issueHistoryRecyclerView;
        Log_OC.loadImage($r103, "issueHistoryRecyclerView");
        IssueHistoryFragment$onViewCreated$1$2 r26 = new IssueHistoryFragment$onViewCreated$1$2(this);
        ViewExtKt.createInfiniteScrollListener($r103, 15, r24, r26);
        KudiDateAndTypeFilterView $r14 = $r7.issueHistoryDateAndTypeFilterView;
        Date $r62 = new Date();
        String $r15 = DateExtKt.convertDateToGivenFormat$default($r62, null, 2, null);
        $r14.setDateText($r15);
        KudiDateAndTypeFilterView $r142 = $r7.issueHistoryDateAndTypeFilterView;
        $r142.setTypeText("All");
        KudiDateAndTypeFilterView $r143 = $r7.issueHistoryDateAndTypeFilterView;
        IssueHistoryFragment$onViewCreated$1$3 r27 = new IssueHistoryFragment$onViewCreated$1$3(this);
        $r143.setTypeFilterClickListener(r27);
        InterfaceC1523w interfaceC1523w = new InterfaceC1523w() { // from class: ai.kudi.agent.issues.ui.Type
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.fragment.app.InterfaceC1523w
            /* renamed from: a */
            public final void mo35611a(String str, Bundle bundle2) {
                IssueHistoryFragment $r32 = IssueHistoryFragment.this;
                FragmentIssueHistoryBinding $r4 = $r7;
                IssueHistoryFragment.m39484onViewCreated$lambda2$lambda1($r32, $r4, str, bundle2);
            }
        };
        IssueHistoryFragment r302 = this;
        FragmentManager $r18 = r302.getChildFragmentManager();
        IssueHistoryFragment r303 = this;
        PreferenceActivity $r19 = r303.getViewLifecycleOwner();
        $r18.p1(DateFilterFragment.RESULT_KEY_FILTERED_DATE, $r19, interfaceC1523w);
        KudiDateAndTypeFilterView $r144 = $r7.issueHistoryDateAndTypeFilterView;
        IssueHistoryFragment$onViewCreated$1$4 r29 = new IssueHistoryFragment$onViewCreated$1$4(this);
        $r144.setDateFilterClickedListener(r29);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentIssueHistoryBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentIssueHistoryBinding $r3 = (FragmentIssueHistoryBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentIssueHistoryBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setFilterBottomSheet(DialogC0809i dialogC0809i) {
        this.filterBottomSheet = dialogC0809i;
    }

    public final void setFilteredDate(FilteredDate filteredDate) {
        Log_OC.getArray(filteredDate, "<set-?>");
        this.filteredDate = filteredDate;
    }

    public final void setIssueHistoryPresenter(IssueHistoryPresenter issueHistoryPresenter) {
        Log_OC.getArray(issueHistoryPresenter, "<set-?>");
        this.issueHistoryPresenter = issueHistoryPresenter;
    }

    public final void setPage(int i) {
        this.page = i;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.views.IssueHistoryView
    public void showEmptyActivities() {
        FragmentIssueHistoryBinding $r1 = requireBinding();
        EmptyHistoryBinding $r2 = $r1.issueHistoryEmptyState;
        View $r3 = $r2.getRoot();
        Log_OC.loadImage($r3, "requireBinding().issueHistoryEmptyState.root");
        View r4 = $r3;
        ViewExtKt.show(r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.views.IssueHistoryView
    public void showErrorMessage(String str, int i) {
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        IssueHistoryFragment r6 = this;
        FragmentActivity $r2 = r6.requireActivity();
        Log_OC.loadImage($r2, "requireActivity()");
        ContextExtKt.toast$default($r2, str, 0, 2, (Object) null);
        if (i == 1) {
            FragmentIssueHistoryBinding $r3 = requireBinding();
            EmptyHistoryBinding $r4 = $r3.issueHistoryEmptyState;
            View $r5 = $r4.getRoot();
            Log_OC.loadImage($r5, "requireBinding().issueHistoryEmptyState.root");
            View r7 = $r5;
            ViewExtKt.show(r7);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.views.IssueHistoryView
    public void showIssueList(List list, boolean z) {
        Log_OC.getArray(list, "issueList");
        FragmentIssueHistoryBinding $r2 = requireBinding();
        View $r3 = $r2.issueHistoryRecyclerView;
        Log_OC.loadImage($r3, "issueHistoryRecyclerView");
        View r7 = $r3;
        ViewExtKt.show(r7);
        EmptyHistoryBinding $r4 = $r2.issueHistoryEmptyState;
        View $r5 = $r4.getRoot();
        Log_OC.loadImage($r5, "issueHistoryEmptyState.root");
        View r72 = $r5;
        ViewExtKt.hide$default(r72, false, 1, null);
        if (z) {
            IssueHistoryAdapter $r6 = this.issueHistoryAdapter;
            if ($r6 != null) {
                $r6.addData(list);
            }
        } else {
            IssueHistoryAdapter $r62 = this.issueHistoryAdapter;
            if ($r62 != null) {
                $r62.setData(list);
            }
        }
        boolean $z1 = list.isEmpty();
        if ($z1 && !z) {
            showEmptyActivities();
        }
        ViewGroup r8 = $r2.issueHistoryRecyclerView;
        r8.invalidate();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.views.IssueHistoryView
    public void showLoading() {
        FragmentIssueHistoryBinding $r1 = requireBinding();
        View $r2 = $r1.issueHistoryRecyclerView;
        Log_OC.loadImage($r2, "issueHistoryRecyclerView");
        View r7 = $r2;
        ViewExtKt.hide$default(r7, false, 1, null);
        EmptyHistoryBinding $r3 = $r1.issueHistoryEmptyState;
        View $r4 = $r3.getRoot();
        Log_OC.loadImage($r4, "issueHistoryEmptyState.root");
        View r72 = $r4;
        ViewExtKt.hide$default(r72, false, 1, null);
        FrameLayout $r5 = $r1.issueHistoryloadingStateView;
        Log_OC.loadImage($r5, "issueHistoryloadingStateView");
        ViewExtKt.show($r5);
        ShimmerFrameLayout $r6 = $r1.shimmerLoaderList;
        $r6.m32965c();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.views.IssueHistoryView
    public void showNextLoading() {
        FragmentIssueHistoryBinding $r1 = requireBinding();
        ProgressBar $r2 = $r1.issueHistoryNextLoadingView;
        Log_OC.loadImage($r2, "requireBinding().issueHistoryNextLoadingView");
        ViewExtKt.show($r2);
    }
}

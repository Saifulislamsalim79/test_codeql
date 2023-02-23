package ai.kudi.agent.inbox.p007ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvp.MvpFragment;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.FragmentInboxIssueListBinding;
import ai.kudi.agent.inbox.adapters.InboxAdapter;
import ai.kudi.agent.inbox.game.components.InboxSubComponent;
import ai.kudi.agent.inbox.presenters.InboxListPresenter;
import ai.kudi.agent.inbox.views.InboxListView;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.C1335a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C1723k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: InboxIssueListFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 L2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001LB\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015H\u0002J\b\u0010\"\u001a\u00020\u0003H\u0016J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002J\b\u0010&\u001a\u00020 H\u0016J\b\u0010'\u001a\u00020 H\u0016J\u0019\u0010(\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010)\u001a\u00020*H\u0096\u0001J\u0010\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020-H\u0016J\u0012\u0010.\u001a\u00020 2\b\u0010/\u001a\u0004\u0018\u00010\u000bH\u0016J\u0018\u00100\u001a\u00020 2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0016J$\u00105\u001a\u00020\u00152\u0006\u00103\u001a\u0002062\b\u00107\u001a\u0004\u0018\u0001082\b\u0010/\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u00109\u001a\u00020 H\u0016J\u0010\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020 H\u0016J\t\u0010?\u001a\u00020\u0005H\u0096\u0001J\u0016\u0010@\u001a\u00020 2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002J\b\u0010B\u001a\u00020 H\u0016J\u0018\u0010C\u001a\u00020 2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GH\u0016J\u001e\u0010H\u001a\u00020 2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010I\u001a\u00020;H\u0016J\b\u0010J\u001a\u00020 H\u0016J\b\u0010K\u001a\u00020 H\u0016R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006M"}, m10421d2 = {"Lai/kudi/agent/inbox/ui/InboxIssueListFragment;", "Lai/kudi/agent/core/mvp/MvpFragment;", "Lai/kudi/agent/inbox/views/InboxListView;", "Lai/kudi/agent/inbox/presenters/InboxListPresenter;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/FragmentInboxIssueListBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/databinding/FragmentInboxIssueListBinding;", "bundle", "Landroid/os/Bundle;", "getBundle", "()Landroid/os/Bundle;", "setBundle", "(Landroid/os/Bundle;)V", "inboxAdapter", "Lai/kudi/agent/inbox/adapters/InboxAdapter;", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "mView", "Landroid/view/View;", "getMView", "()Landroid/view/View;", "setMView", "(Landroid/view/View;)V", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/inbox/presenters/InboxListPresenter;", "setThisPresenter", "(Lai/kudi/agent/inbox/presenters/InboxListPresenter;)V", "bindListView", "", "view", "createPresenter", "getFetchedList", "", "Lai/kudi/agent/issues/data/model/Issue$Ticket;", "hideLoading", "hideNextLoading", "initBinding", "fragment", "Landroidx/fragment/app/Fragment;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onStart", "requireBinding", "saveFetchedList", "issueList", "showEmptyActivities", "showErrorMessage", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "", "page", "", "showIssueList", "toAddList", "showLoading", "showNextLoading", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.inbox.ui.InboxIssueListFragment */
/* loaded from: classes.dex */
public final class InboxIssueListFragment extends MvpFragment<InboxListView, InboxListPresenter> implements InboxListView, BaseViewBinder<FragmentInboxIssueListBinding> {
    public static final Companion Companion;
    public static final String INBOX_BUNDLE = "INBOX_BUNDLE";
    private final /* synthetic */ BaseViewBinderImpl<FragmentInboxIssueListBinding> $$delegate_0;
    public Bundle bundle;
    private InboxAdapter inboxAdapter;
    private LinearLayoutManager layoutManager;
    public View mView;
    public InboxListPresenter thisPresenter;

    /* compiled from: InboxIssueListFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/inbox/ui/InboxIssueListFragment$Companion;", "", "()V", InboxIssueListFragment.INBOX_BUNDLE, "", "newInstance", "Lai/kudi/agent/inbox/ui/InboxIssueListFragment;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.inbox.ui.InboxIssueListFragment$Companion */
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
        public final InboxIssueListFragment newInstance() {
            InboxIssueListFragment r4 = new InboxIssueListFragment();
            Bundle r5 = new Bundle();
            C13666w c13666w = C13666w.f30112a;
            InboxIssueListFragment r6 = r4;
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
    public InboxIssueListFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void bindListView(View view) {
        FragmentInboxIssueListBinding $r4 = requireBinding();
        InboxListPresenter $r5 = createPresenter();
        $r5.start();
        Context $r6 = view.getContext();
        LinearLayoutManager $r1 = new LinearLayoutManager($r6);
        this.layoutManager = $r1;
        Log_OC.loadImage($r6, "context");
        InboxAdapter $r7 = new InboxAdapter($r6);
        this.inboxAdapter = $r7;
        if ($r7 != null) {
            InboxIssueListFragment$bindListView$1$1 $r8 = new InboxIssueListFragment$bindListView$1$1(this);
            $r7.setOnClickListener($r8);
        }
        RecyclerView $r9 = $r4.inboxRecylerview;
        LinearLayoutManager $r12 = this.layoutManager;
        $r9.setLayoutManager($r12);
        RecyclerView $r92 = $r4.inboxRecylerview;
        $r92.setAdapter(this.inboxAdapter);
        RecyclerView $r93 = $r4.inboxRecylerview;
        Log_OC.loadImage($r93, "inboxRecylerview");
        LinearLayoutManager $r13 = this.layoutManager;
        Log_OC.append($r13);
        InboxIssueListFragment$bindListView$1$2 $r2 = new InboxIssueListFragment$bindListView$1$2(this);
        ViewExtKt.createInfiniteScrollListener($r93, 15, $r13, $r2);
        LinearLayoutManager $r14 = this.layoutManager;
        Log_OC.append($r14);
        int $i0 = $r14.m35389v2();
        C1723k $r10 = new C1723k($r6, $i0);
        Drawable $r11 = C1335a.m36322f($r6, C0001R.C0002drawable.transactions_divider);
        Log_OC.append($r11);
        $r10.m34703f($r11);
        RecyclerView $r94 = $r4.inboxRecylerview;
        $r94.m35294h($r10);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final List getFetchedList() {
        List $r3;
        Bundle $r1 = getBundle();
        Object $r2 = $r1.get(INBOX_BUNDLE);
        if ($r2 != null) {
            List $r32 = (List) $r2;
            return $r32;
        }
        $r3 = C13726r.m3891e();
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final InboxIssueListFragment newInstance() {
        Companion $r1 = Companion;
        InboxIssueListFragment $r0 = $r1.newInstance();
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void saveFetchedList(List list) {
        Bundle $r2 = getBundle();
        $r2.clear();
        int $i0 = list.size();
        if ($i0 <= 30) {
            Bundle $r22 = getBundle();
            Serializable $r3 = (Serializable) list;
            $r22.putSerializable(INBOX_BUNDLE, $r3);
            return;
        }
        Bundle $r23 = getBundle();
        Serializable $r32 = (Serializable) list;
        $r23.putSerializable(INBOX_BUNDLE, $r32);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public InboxListPresenter createPresenter() {
        InboxListPresenter $r1 = getThisPresenter();
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
    public FragmentInboxIssueListBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentInboxIssueListBinding $r3 = (FragmentInboxIssueListBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentInboxIssueListBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Bundle getBundle() {
        Bundle $r1 = this.bundle;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("bundle");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final View getMView() {
        View $r1 = this.mView;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("mView");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InboxListPresenter getThisPresenter() {
        InboxListPresenter $r1 = this.thisPresenter;
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
    @Override // ai.kudi.agent.inbox.views.InboxListView
    public void hideLoading() {
        FragmentInboxIssueListBinding $r1 = requireBinding();
        ProgressBar $r2 = $r1.inboxProgressBar;
        Log_OC.loadImage($r2, "requireBinding().inboxProgressBar");
        ViewExtKt.hide$default($r2, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.inbox.views.InboxListView
    public void hideNextLoading() {
        FragmentInboxIssueListBinding $r1 = requireBinding();
        ProgressBar $r2 = $r1.nextProgressiveBar;
        Log_OC.loadImage($r2, "requireBinding().nextProgressiveBar");
        ViewExtKt.hide$default($r2, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentInboxIssueListBinding fragmentInboxIssueListBinding, Fragment fragment) {
        Log_OC.getArray(fragmentInboxIssueListBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentInboxIssueListBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentInboxIssueListBinding $r4 = (FragmentInboxIssueListBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        InboxIssueListFragment r7 = this;
        super.onAttach(context);
        InboxIssueListFragment r72 = this;
        FragmentActivity $r2 = r72.getActivity();
        if ($r2 == null) {
            NullPointerException r6 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.inbox.ui.InboxActivity");
            throw r6;
        }
        InboxActivity $r3 = (InboxActivity) $r2;
        InboxSubComponent $r4 = $r3.getInboxSubComponent();
        $r4.inject(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InboxIssueListFragment r3 = this;
        r3.setHasOptionsMenu(true);
        Bundle r2 = new Bundle();
        setBundle(r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        Log_OC.getArray(menu, "menu");
        Log_OC.getArray(menuInflater, "inflater");
        menuInflater.inflate(C0001R.C0005menu.refresh_menu, menu);
        InboxIssueListFragment r3 = this;
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentInboxIssueListBinding $r4 = FragmentInboxIssueListBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        InboxIssueListFragment r6 = this;
        View $r5 = initBinding($r4, (Fragment) r6);
        setMView($r5);
        View $r52 = getMView();
        return $r52;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Bundle $r1 = getBundle();
        $r1.clear();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Log_OC.getArray(menuItem, "item");
        int $i0 = menuItem.getItemId();
        if ($i0 == C0001R.C0003id.refresh) {
            Bundle $r2 = getBundle();
            $r2.clear();
            View $r3 = getMView();
            bindListView($r3);
        }
        InboxIssueListFragment r4 = this;
        boolean $z0 = super.onOptionsItemSelected(menuItem);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        InboxIssueListFragment r4 = this;
        FragmentActivity $r1 = r4.getActivity();
        if ($r1 != null) {
            InboxIssueListFragment r42 = this;
            String $r2 = r42.getString(C0001R.string.inbox_title);
            $r1.setTitle($r2);
        }
        View $r3 = getMView();
        bindListView($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentInboxIssueListBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentInboxIssueListBinding $r3 = (FragmentInboxIssueListBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentInboxIssueListBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setBundle(Bundle bundle) {
        Log_OC.getArray(bundle, "<set-?>");
        this.bundle = bundle;
    }

    public final void setMView(View view) {
        Log_OC.getArray(view, "<set-?>");
        this.mView = view;
    }

    public final void setThisPresenter(InboxListPresenter inboxListPresenter) {
        Log_OC.getArray(inboxListPresenter, "<set-?>");
        this.thisPresenter = inboxListPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.inbox.views.InboxListView
    public void showEmptyActivities() {
        FragmentInboxIssueListBinding $r1 = requireBinding();
        LinearLayout $r2 = $r1.emptyLayout;
        Log_OC.loadImage($r2, "emptyLayout");
        ViewExtKt.show($r2);
        ProgressBar $r3 = $r1.inboxProgressBar;
        Log_OC.loadImage($r3, "inboxProgressBar");
        ViewExtKt.hide$default($r3, false, 1, null);
        TextView $r4 = $r1.inboxText;
        InboxIssueListFragment r6 = this;
        String $r5 = r6.getString(C0001R.string.empty_inbox);
        $r4.setText($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.inbox.views.InboxListView
    public void showErrorMessage(String str, int i) {
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        FragmentInboxIssueListBinding $r2 = requireBinding();
        View $r3 = $r2.inboxRecylerview;
        Log_OC.loadImage($r3, "inboxRecylerview");
        View r7 = $r3;
        ViewExtKt.hide$default(r7, false, 1, null);
        LinearLayout $r4 = $r2.emptyLayout;
        Log_OC.loadImage($r4, "emptyLayout");
        ViewExtKt.show($r4);
        ProgressBar $r5 = $r2.inboxProgressBar;
        Log_OC.loadImage($r5, "inboxProgressBar");
        ViewExtKt.hide$default($r5, false, 1, null);
        ProgressBar $r52 = $r2.nextProgressiveBar;
        Log_OC.loadImage($r52, "nextProgressiveBar");
        ViewExtKt.hide$default($r52, false, 1, null);
        TextView $r6 = $r2.inboxText;
        InboxIssueListFragment r8 = this;
        String $r1 = r8.getString(C0001R.string.something_went_wrong);
        $r6.setText($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.inbox.views.InboxListView
    public void showIssueList(List list, boolean z) {
        Log_OC.getArray(list, "issueList");
        FragmentInboxIssueListBinding $r2 = requireBinding();
        ProgressBar $r3 = $r2.inboxProgressBar;
        Log_OC.loadImage($r3, "inboxProgressBar");
        ViewExtKt.hide$default($r3, false, 1, null);
        ProgressBar $r32 = $r2.nextProgressiveBar;
        Log_OC.loadImage($r32, "nextProgressiveBar");
        ViewExtKt.hide$default($r32, false, 1, null);
        LinearLayout $r4 = $r2.emptyLayout;
        Log_OC.loadImage($r4, "emptyLayout");
        ViewExtKt.hide$default($r4, false, 1, null);
        View $r5 = $r2.inboxRecylerview;
        Log_OC.loadImage($r5, "inboxRecylerview");
        View r7 = $r5;
        ViewExtKt.show(r7);
        InboxAdapter $r6 = this.inboxAdapter;
        if ($r6 != null) {
            $r6.setInbox(list);
        }
        ViewGroup r8 = $r2.inboxRecylerview;
        r8.invalidate();
        saveFetchedList(list);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.inbox.views.InboxListView
    public void showLoading() {
        FragmentInboxIssueListBinding $r1 = requireBinding();
        ProgressBar $r2 = $r1.inboxProgressBar;
        Log_OC.loadImage($r2, "inboxProgressBar");
        ViewExtKt.show($r2);
        View $r3 = $r1.inboxRecylerview;
        Log_OC.loadImage($r3, "inboxRecylerview");
        View r4 = $r3;
        ViewExtKt.hide$default(r4, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.inbox.views.InboxListView
    public void showNextLoading() {
        FragmentInboxIssueListBinding $r1 = requireBinding();
        ProgressBar $r2 = $r1.nextProgressiveBar;
        Log_OC.loadImage($r2, "requireBinding().nextProgressiveBar");
        ViewExtKt.show($r2);
    }
}

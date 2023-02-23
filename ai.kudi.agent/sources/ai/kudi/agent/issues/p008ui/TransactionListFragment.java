package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.core.databinding.EmptyHistoryBinding;
import ai.kudi.agent.core.navigation.GlobalNavigator;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.agent.feature_issue_resolution.databinding.FragmentTransactionListBinding;
import ai.kudi.agent.filter.domain.FilteredDate;
import ai.kudi.agent.filter.p005ui.DateFilterFragment;
import ai.kudi.agent.issues.adapters.TransactionRecyclerViewAdapter;
import ai.kudi.agent.issues.presenters.TransactionListPresenter;
import ai.kudi.agent.issues.viewmodels.model.IssueTypeModel;
import ai.kudi.agent.issues.views.TransactionListView;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.C1335a;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import androidx.lifecycle.PreferenceActivity;
import androidx.recyclerview.widget.C1723k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import dagger.android.p197e.C7429a;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p275b.p280b.p281a.p282a.AbstractC8228a;
import p272h.p364d.p365a.p366c.AbstractC9412c;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import p590o.p591a.Timber;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: TransactionListFragment.kt */
@Metadata(m10422d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 n2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001nB\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0002J\b\u0010@\u001a\u00020AH\u0002J\b\u0010B\u001a\u00020\u0003H\u0016J\u0012\u0010C\u001a\u00020=2\b\b\u0002\u0010D\u001a\u00020EH\u0002J\b\u0010F\u001a\u00020EH\u0002J\b\u0010G\u001a\u00020=H\u0016J\b\u0010H\u001a\u00020=H\u0016J\u0019\u0010I\u001a\u00020?2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010J\u001a\u00020KH\u0096\u0001J\u0010\u0010L\u001a\u00020=2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010M\u001a\u00020=2\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J\u0010\u0010P\u001a\u00020=2\u0006\u0010Q\u001a\u00020RH\u0016J\u0012\u0010S\u001a\u00020=2\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J\u0018\u0010T\u001a\u00020=2\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020XH\u0016J&\u0010Y\u001a\u0004\u0018\u00010?2\u0006\u0010W\u001a\u00020Z2\b\u0010[\u001a\u0004\u0018\u00010\\2\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J\b\u0010]\u001a\u00020=H\u0016J\u001a\u0010^\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J\t\u0010_\u001a\u00020\u0005H\u0096\u0001J\b\u0010`\u001a\u00020=H\u0002J\b\u0010a\u001a\u00020=H\u0016J\u0012\u0010b\u001a\u00020=2\b\u0010c\u001a\u0004\u0018\u00010EH\u0016J\u0010\u0010d\u001a\u00020=2\u0006\u0010e\u001a\u00020EH\u0016J\b\u0010f\u001a\u00020=H\u0016J\b\u0010g\u001a\u00020=H\u0016J\b\u0010h\u001a\u00020=H\u0016J&\u0010i\u001a\u00020=2\u001c\u0010j\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020E0lj\u0002`m0kH\u0016R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u00020*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u000200X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001e\u00105\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0010\u0010:\u001a\u0004\u0018\u00010;X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006o"}, m10421d2 = {"Lai/kudi/agent/issues/ui/TransactionListFragment;", "Lcom/hannesdorfmann/mosby3/mvp/MvpFragment;", "Lai/kudi/agent/issues/views/TransactionListView;", "Lai/kudi/agent/issues/presenters/TransactionListPresenter;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/feature_issue_resolution/databinding/FragmentTransactionListBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/feature_issue_resolution/databinding/FragmentTransactionListBinding;", "emptyHistoryTextView", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getEmptyHistoryTextView", "()Landroid/widget/TextView;", "filteredDate", "Lai/kudi/agent/filter/domain/FilteredDate;", "getFilteredDate", "()Lai/kudi/agent/filter/domain/FilteredDate;", "setFilteredDate", "(Lai/kudi/agent/filter/domain/FilteredDate;)V", "globalNavigator", "Lai/kudi/agent/core/navigation/GlobalNavigator;", "getGlobalNavigator", "()Lai/kudi/agent/core/navigation/GlobalNavigator;", "setGlobalNavigator", "(Lai/kudi/agent/core/navigation/GlobalNavigator;)V", "issueData", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "getIssueData", "()Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "setIssueData", "(Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;)V", "lastPosition", "", "getLastPosition", "()I", "setLastPosition", "(I)V", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "listIsBeingFiltered", "", "getListIsBeingFiltered", "()Z", "setListIsBeingFiltered", "(Z)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/issues/presenters/TransactionListPresenter;", "setThisPresenter", "(Lai/kudi/agent/issues/presenters/TransactionListPresenter;)V", "transactionAdapter", "Lai/kudi/agent/issues/adapters/TransactionRecyclerViewAdapter;", "bindListView", "", "view", "Landroid/view/View;", "createInfiniteScrollListener", "Lcom/github/pwittchen/infinitescroll/library/InfiniteScrollListener;", "createPresenter", "fetchFilteredTransactionHistory", TransactionField.STATUS, "", "getCurrentDate", "hideLoading", "hideNextLoading", "initBinding", "fragment", "Landroidx/fragment/app/Fragment;", "navigateToTransactionBreakDownPage", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onViewCreated", "requireBinding", "setUpView", "showEmptyTransactionView", "showError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "showFeedbackMsg", "msg", "showFilterDialog", "showLoading", "showNextLoading", "showTransactions", "transactions", "", "Ljava/util/HashMap;", "Lai/kudi/agent/transactions/domain/dto/Transaction;", "Companion", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.TransactionListFragment */
/* loaded from: classes.dex */
public final class TransactionListFragment extends AbstractC9412c<TransactionListView, TransactionListPresenter> implements TransactionListView, BaseViewBinder<FragmentTransactionListBinding> {
    public static final Companion Companion;
    private static final String ISSUE_DATA = "Issue Data";
    private final /* synthetic */ BaseViewBinderImpl<FragmentTransactionListBinding> $$delegate_0;
    public FilteredDate filteredDate;
    public GlobalNavigator globalNavigator;
    public IssueTypeModel issueData;
    private int lastPosition;
    private LinearLayoutManager layoutManager;
    private boolean listIsBeingFiltered;
    public SharedPreferences sharedPreferences;
    public TransactionListPresenter thisPresenter;
    private TransactionRecyclerViewAdapter transactionAdapter;

    /* compiled from: TransactionListFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/issues/ui/TransactionListFragment$Companion;", "", "()V", CustomerDetailsIssueFragment.ISSUE_DATA, "", "newInstance", "Lai/kudi/agent/issues/ui/TransactionListFragment;", "issueData", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.issues.ui.TransactionListFragment$Companion */
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
        public final TransactionListFragment newInstance(IssueTypeModel issueTypeModel) {
            Log_OC.getArray(issueTypeModel, "issueData");
            TransactionListFragment r5 = new TransactionListFragment();
            Bundle r6 = new Bundle();
            r6.putParcelable(TransactionListFragment.ISSUE_DATA, issueTypeModel);
            C13666w c13666w = C13666w.f30112a;
            TransactionListFragment r7 = r5;
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
    public TransactionListFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void bindListView(View view) {
        Context $r2 = view.getContext();
        LinearLayoutManager r12 = new LinearLayoutManager($r2);
        this.layoutManager = r12;
        Log_OC.loadImage($r2, "context");
        TransactionRecyclerViewAdapter r13 = new TransactionRecyclerViewAdapter($r2);
        this.transactionAdapter = r13;
        if (r13 != null) {
            TransactionListFragment$bindListView$1 r14 = new TransactionListFragment$bindListView$1(this);
            r13.setOnClickListener(r14);
        }
        FragmentTransactionListBinding $r6 = requireBinding();
        RecyclerView $r7 = $r6.recyclerView;
        $r7.setLayoutManager(this.layoutManager);
        RecyclerView $r72 = $r6.recyclerView;
        TransactionRecyclerViewAdapter $r4 = this.transactionAdapter;
        $r72.setAdapter($r4);
        RecyclerView $r73 = $r6.recyclerView;
        AbstractC8228a $r8 = createInfiniteScrollListener();
        $r73.m35282l($r8);
        LinearLayoutManager $r3 = this.layoutManager;
        Log_OC.append($r3);
        int $i0 = $r3.m35389v2();
        C1723k r15 = new C1723k($r2, $i0);
        int $i02 = C0214R.C0215drawable.transactions_divider;
        Drawable $r10 = C1335a.m36322f($r2, $i02);
        Log_OC.append($r10);
        r15.m34703f($r10);
        TransactionListFragment r16 = this;
        FragmentActivity $r11 = r16.getActivity();
        if ($r11 == null) {
            return;
        }
        $r11.invalidateOptionsMenu();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final AbstractC8228a createInfiniteScrollListener() {
        final LinearLayoutManager $r1 = this.layoutManager;
        return new AbstractC8228a(20, $r1) { // from class: ai.kudi.agent.issues.ui.TransactionListFragment$createInfiniteScrollListener$1
            final /* synthetic */ int $maxItemsPerRequest;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r2, $r1);
                this.$maxItemsPerRequest = r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p275b.p280b.p281a.p282a.AbstractC8228a
            public void onScrolledToEnd(int i) {
                String $r7;
                String $r8;
                Object[] $r12 = new Object[0];
                Timber.m1627e("Scrolled to the end", $r12);
                TransactionListFragment $r2 = TransactionListFragment.this;
                InterfaceC9413d $r3 = $r2.getPresenter();
                Log_OC.loadImage($r3, "getPresenter()");
                TransactionListPresenter transactionListPresenter = (TransactionListPresenter) $r3;
                TransactionListFragment $r22 = TransactionListFragment.this;
                boolean $z0 = $r22.getListIsBeingFiltered();
                if ($z0) {
                    TransactionListFragment $r23 = TransactionListFragment.this;
                    FilteredDate $r5 = $r23.getFilteredDate();
                    Date $r6 = $r5.getFrom();
                    $r7 = DateExtKt.convertDateToGivenFormat($r6, "yyyy/MM/dd");
                } else {
                    $r7 = "";
                }
                TransactionListFragment $r24 = TransactionListFragment.this;
                boolean $z02 = $r24.getListIsBeingFiltered();
                if ($z02) {
                    TransactionListFragment $r25 = TransactionListFragment.this;
                    FilteredDate $r52 = $r25.getFilteredDate();
                    Date $r62 = $r52.getTo();
                    $r8 = DateExtKt.convertDateToGivenFormat($r62, "yyyy/MM/dd");
                } else {
                    $r8 = "";
                }
                TransactionListPresenter.loadNext$default(transactionListPresenter, "transfer", null, $r7, $r8, false, false, false, null, 242, null);
            }
        };
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void fetchFilteredTransactionHistory(String str) {
        this.listIsBeingFiltered = true;
        TransactionListPresenter $r2 = getThisPresenter();
        FilteredDate $r3 = getFilteredDate();
        Date $r4 = $r3.getFrom();
        String $r5 = DateExtKt.convertDateToGivenFormat($r4, "yyyy/MM/dd");
        FilteredDate $r32 = getFilteredDate();
        Date $r42 = $r32.getTo();
        String $r6 = DateExtKt.convertDateToGivenFormat($r42, "yyyy/MM/dd");
        TransactionListPresenter.loadNext$default($r2, null, str, $r5, $r6, true, true, true, null, 129, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ void fetchFilteredTransactionHistory$default(TransactionListFragment transactionListFragment, String $r2, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $r2 = "";
        }
        transactionListFragment.fetchFilteredTransactionHistory($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final String getCurrentDate() {
        Date $r2 = new Date();
        String $r1 = DateExtKt.convertDateToGivenFormat$default($r2, null, 2, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final TextView getEmptyHistoryTextView() {
        TransactionListFragment r3 = this;
        View $r1 = r3.requireView();
        int $i0 = C0214R.C0216id.emptyHistoryTextView;
        TextView $r2 = (TextView) $r1.findViewById($i0);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setUpView() {
        FragmentTransactionListBinding $r2 = requireBinding();
        TextView $r3 = $r2.dateTextView;
        String $r4 = getCurrentDate();
        $r3.setText($r4);
        Date $r6 = new Date();
        Date $r1 = new Date();
        FilteredDate $r5 = new FilteredDate($r6, $r1);
        setFilteredDate($r5);
        TextView $r32 = $r2.dateTextView;
        $r32.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.Scheduler
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransactionListFragment $r22 = TransactionListFragment.this;
                TransactionListFragment.m39510setUpView$lambda4$lambda3($r22, view);
            }
        });
        TextView $r33 = $r2.filterAction;
        IssueTypeModel $r8 = getIssueData();
        String $r42 = $r8.getPrettyName();
        $r33.setText($r42);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpView$lambda-4$lambda-3  reason: not valid java name */
    public static final void m39510setUpView$lambda4$lambda3(TransactionListFragment transactionListFragment, View view) {
        Log_OC.getArray(transactionListFragment, "this$0");
        TransactionListPresenter $r0 = transactionListFragment.getThisPresenter();
        $r0.showDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: showFilterDialog$lambda-6  reason: not valid java name */
    public static final void m39511showFilterDialog$lambda6(TransactionListFragment transactionListFragment, String str, Bundle bundle) {
        Log_OC.getArray(transactionListFragment, "this$0");
        Log_OC.getArray(str, "requestKey");
        Log_OC.getArray(bundle, "result");
        boolean $z0 = Log_OC.append(str, DateFilterFragment.RESULT_KEY_FILTERED_DATE);
        if ($z0) {
            Serializable $r3 = bundle.getSerializable(DateFilterFragment.RESULT_KEY_FILTERED_DATE);
            boolean $z02 = $r3 instanceof FilteredDate;
            FilteredDate $r4 = $z02 ? (FilteredDate) $r3 : null;
            if ($r4 == null) {
                return;
            }
            transactionListFragment.setFilteredDate($r4);
            Date $r5 = $r4.getFrom();
            Date $r6 = $r4.getTo();
            String $r1 = DateExtKt.getDateDiff$default($r5, $r6, 0, null, 8, null);
            FragmentTransactionListBinding $r7 = transactionListFragment.requireBinding();
            TextView $r8 = $r7.dateTextView;
            $r8.setText($r1);
            IssueTypeModel $r9 = transactionListFragment.getIssueData();
            String $r12 = $r9.getTypeSlug();
            Log_OC.append($r12);
            Locale $r10 = Locale.getDefault();
            Log_OC.loadImage($r10, "getDefault()");
            if ($r12 == null) {
                NullPointerException $r11 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                throw $r11;
            }
            String $r13 = $r12.toLowerCase($r10);
            Log_OC.loadImage($r13, "(this as java.lang.String).toLowerCase(locale)");
            transactionListFragment.fetchFilteredTransactionHistory($r13);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public TransactionListPresenter createPresenter() {
        TransactionListPresenter $r1 = getThisPresenter();
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
    public FragmentTransactionListBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentTransactionListBinding $r3 = (FragmentTransactionListBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentTransactionListBinding $r1 = getBinding();
        return $r1;
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
    public final GlobalNavigator getGlobalNavigator() {
        GlobalNavigator $r1 = this.globalNavigator;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("globalNavigator");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final IssueTypeModel getIssueData() {
        IssueTypeModel $r1 = this.issueData;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("issueData");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getLastPosition() {
        int i0 = this.lastPosition;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getListIsBeingFiltered() {
        boolean z0 = this.listIsBeingFiltered;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SharedPreferences getSharedPreferences() {
        SharedPreferences $r1 = this.sharedPreferences;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("sharedPreferences");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TransactionListPresenter getThisPresenter() {
        TransactionListPresenter $r1 = this.thisPresenter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("thisPresenter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.issues.views.TransactionListView
    public void hideLoading() {
    }

    @Override // ai.kudi.agent.issues.views.TransactionListView
    public void hideNextLoading() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentTransactionListBinding fragmentTransactionListBinding, Fragment fragment) {
        Log_OC.getArray(fragmentTransactionListBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentTransactionListBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentTransactionListBinding $r4 = (FragmentTransactionListBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.views.TransactionListView
    public void navigateToTransactionBreakDownPage(FilteredDate filteredDate) {
        Log_OC.getArray(filteredDate, "filteredDate");
        GlobalNavigator $r2 = getGlobalNavigator();
        TransactionListFragment r4 = this;
        Context $r3 = r4.requireContext();
        Log_OC.loadImage($r3, "requireContext()");
        $r2.navigateToTransactionBreakDownPage($r3, filteredDate);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c4  */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityCreated(android.os.Bundle r33) {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            super.onActivityCreated(r1)
            r0 = r32
            ai.kudi.agent.issues.viewmodels.model.IssueTypeModel r11 = r0.getIssueData()
            java.lang.String r12 = r11.getType()
            java.lang.String r14 = "USSD-WITHDRAWAL"
            boolean r13 = kotlin.p483e0.p485d.Log_OC.append(r12, r14)
            if (r13 != 0) goto L5b
            r0 = r32
            ai.kudi.agent.issues.viewmodels.model.IssueTypeModel r11 = r0.getIssueData()
            java.lang.String r12 = r11.getType()
            java.lang.String r14 = "POS-WITHDRAWAL"
            boolean r13 = kotlin.p483e0.p485d.Log_OC.append(r12, r14)
            if (r13 != 0) goto L5b
            r0 = r32
            ai.kudi.agent.issues.viewmodels.model.IssueTypeModel r11 = r0.getIssueData()
            java.lang.String r12 = r11.getType()
            java.lang.String r14 = "CARD-WITHDRAWAL"
            boolean r13 = kotlin.p483e0.p485d.Log_OC.append(r12, r14)
            if (r13 != 0) goto L5b
            r0 = r32
            ai.kudi.agent.issues.viewmodels.model.IssueTypeModel r11 = r0.getIssueData()
            java.lang.String r12 = r11.getType()
            java.lang.String r14 = "CASH_WITHDRAWAL"
            boolean r13 = kotlin.p483e0.p485d.Log_OC.append(r12, r14)
            if (r13 == 0) goto L50
            goto L5b
        L50:
            r0 = r32
            ai.kudi.agent.issues.viewmodels.model.IssueTypeModel r11 = r0.getIssueData()
            java.lang.String r12 = r11.getTypeSlug()
            goto L69
        L5b:
            int r15 = ai.kudi.agent.feature_issue_resolution.C0214R.string.withdrawal
            r17 = r32
            androidx.fragment.app.Fragment r17 = (androidx.fragment.app.Fragment) r17
            r16 = r17
            r0 = r16
            java.lang.String r12 = r0.getString(r15)
        L69:
            r0 = r32
            h.d.a.c.d r18 = r0.getPresenter()
            java.lang.String r14 = "getPresenter()"
            r0 = r18
            kotlin.p483e0.p485d.Log_OC.loadImage(r0, r14)
            r20 = r18
            ai.kudi.agent.issues.presenters.TransactionListPresenter r20 = (ai.kudi.agent.issues.presenters.TransactionListPresenter) r20
            r19 = r20
            if (r12 == 0) goto L7f
            goto L81
        L7f:
            java.lang.String r12 = ""
        L81:
            java.util.Locale r21 = java.util.Locale.getDefault()
            java.lang.String r14 = "getDefault()"
            r0 = r21
            kotlin.p483e0.p485d.Log_OC.loadImage(r0, r14)
            if (r12 == 0) goto Lc4
            r0 = r21
            java.lang.String r12 = r12.toLowerCase(r0)
            java.lang.String r14 = "(this as java.lang.String).toLowerCase(locale)"
            kotlin.p483e0.p485d.Log_OC.loadImage(r12, r14)
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 253(0xfd, float:3.55E-43)
            r30 = 0
            r0 = r19
            r1 = r22
            r2 = r12
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r29
            r10 = r30
            ai.kudi.agent.issues.presenters.TransactionListPresenter.loadNext$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        Lc4:
            java.lang.NullPointerException r31 = new java.lang.NullPointerException
            java.lang.String r14 = "null cannot be cast to non-null type java.lang.String"
            r0 = r31
            r0.<init>(r14)
            throw r31
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.issues.p008ui.TransactionListFragment.onActivityCreated(android.os.Bundle):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        TransactionListFragment r2 = this;
        C7429a.m18752b(r2);
        TransactionListFragment r22 = this;
        super.onAttach(context);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TransactionListFragment r2 = this;
        r2.setHasOptionsMenu(true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        Log_OC.getArray(menu, "menu");
        Log_OC.getArray(menuInflater, "inflater");
        TransactionListFragment r3 = this;
        super.onCreateOptionsMenu(menu, menuInflater);
        menu.clear();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentTransactionListBinding $r4 = FragmentTransactionListBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        TransactionListFragment r6 = this;
        View $r5 = initBinding($r4, (Fragment) r6);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        SharedPreferences $r1 = this.sharedPreferences;
        if ($r1 != null) {
            SharedPreferences $r12 = getSharedPreferences();
            SharedPreferences.Editor $r2 = $r12.edit();
            $r2.clear().apply();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IssueTypeModel $r6;
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        TransactionListFragment r10 = this;
        FragmentActivity $r3 = r10.getActivity();
        if ($r3 == null) {
            NullPointerException r9 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.issues.ui.IssueActivity");
            throw r9;
        }
        IssueActivity $r4 = (IssueActivity) $r3;
        AppCompatActivity r11 = (AppCompatActivity) $r4;
        AbstractC0925a $r5 = r11.getSupportActionBar();
        if ($r5 != null) {
            $r5.mo37631C("Transaction List");
        }
        TransactionListFragment r102 = this;
        Bundle $r2 = r102.getArguments();
        if ($r2 == null) {
            $r6 = null;
        } else {
            Parcelable $r7 = $r2.getParcelable(ISSUE_DATA);
            $r6 = (IssueTypeModel) $r7;
        }
        if ($r6 == null) {
            NullPointerException r92 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.issues.viewmodels.model.IssueTypeModel");
            throw r92;
        }
        setIssueData($r6);
        bindListView(view);
        setUpView();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentTransactionListBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentTransactionListBinding $r3 = (FragmentTransactionListBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentTransactionListBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setFilteredDate(FilteredDate filteredDate) {
        Log_OC.getArray(filteredDate, "<set-?>");
        this.filteredDate = filteredDate;
    }

    public final void setGlobalNavigator(GlobalNavigator globalNavigator) {
        Log_OC.getArray(globalNavigator, "<set-?>");
        this.globalNavigator = globalNavigator;
    }

    public final void setIssueData(IssueTypeModel issueTypeModel) {
        Log_OC.getArray(issueTypeModel, "<set-?>");
        this.issueData = issueTypeModel;
    }

    public final void setLastPosition(int i) {
        this.lastPosition = i;
    }

    public final void setListIsBeingFiltered(boolean z) {
        this.listIsBeingFiltered = z;
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }

    public final void setThisPresenter(TransactionListPresenter transactionListPresenter) {
        Log_OC.getArray(transactionListPresenter, "<set-?>");
        this.thisPresenter = transactionListPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.views.TransactionListView
    public void showEmptyTransactionView() {
        FragmentTransactionListBinding $r1 = requireBinding();
        ViewGroup $r2 = $r1.recyclerView;
        ViewGroup r8 = $r2;
        r8.setVisibility(8);
        ProgressBar $r3 = $r1.loaderView;
        Log_OC.loadImage($r3, "loaderView");
        ViewExtKt.hide$default($r3, false, 1, null);
        EmptyHistoryBinding $r4 = $r1.emptyTransactionView;
        View $r5 = $r4.getRoot();
        Log_OC.loadImage($r5, "emptyTransactionView.root");
        View r9 = $r5;
        ViewExtKt.show(r9);
        TextView $r6 = getEmptyHistoryTextView();
        int $i0 = C0214R.string.no_transaction_message;
        TransactionListFragment r10 = this;
        String $r7 = r10.getString($i0);
        $r6.setText($r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.views.TransactionListView
    public void showError(String str) {
        TransactionListFragment r3 = this;
        FragmentActivity $r2 = r3.getActivity();
        if ($r2 == null) {
            return;
        }
        ContextExtKt.toast$default($r2, str, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.views.TransactionListView
    public void showFeedbackMsg(String str) {
        Log_OC.getArray(str, "msg");
        TransactionListFragment r3 = this;
        FragmentActivity $r2 = r3.getActivity();
        if ($r2 == null) {
            return;
        }
        ContextExtKt.toast$default($r2, str, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.views.TransactionListView
    public void showFilterDialog() {
        InterfaceC1523w interfaceC1523w = new InterfaceC1523w() { // from class: ai.kudi.agent.issues.ui.ByteVector
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: b */
            public final void m38849b(String str, Bundle bundle) {
                TransactionListFragment $r3 = TransactionListFragment.this;
                TransactionListFragment.m39511showFilterDialog$lambda6($r3, str, bundle);
            }
        };
        TransactionListFragment r7 = this;
        FragmentManager $r2 = r7.getChildFragmentManager();
        TransactionListFragment r72 = this;
        PreferenceActivity $r3 = r72.getViewLifecycleOwner();
        $r2.p1(DateFilterFragment.RESULT_KEY_FILTERED_DATE, $r3, interfaceC1523w);
        DateFilterFragment.Companion $r4 = DateFilterFragment.Companion;
        DateFilterFragment $r5 = $r4.newInstance();
        TransactionListFragment r73 = this;
        FragmentManager $r22 = r73.getChildFragmentManager();
        Chapter r8 = (Chapter) $r5;
        r8.show($r22, DateFilterFragment.PAGE_KEY);
    }

    @Override // ai.kudi.agent.issues.views.TransactionListView
    public void showLoading() {
    }

    @Override // ai.kudi.agent.issues.views.TransactionListView
    public void showNextLoading() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.views.TransactionListView
    public void showTransactions(List list) {
        Log_OC.getArray(list, "transactions");
        FragmentTransactionListBinding $r2 = requireBinding();
        ViewGroup $r3 = $r2.recyclerView;
        ViewGroup r5 = $r3;
        r5.setVisibility(0);
        TransactionRecyclerViewAdapter $r4 = this.transactionAdapter;
        if ($r4 != null) {
            $r4.setTransactions(list);
        }
        ViewGroup $r32 = $r2.recyclerView;
        ViewGroup r52 = $r32;
        r52.invalidate();
        int $i0 = list.size();
        setLastPosition($i0);
    }
}

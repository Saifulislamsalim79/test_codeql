package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.core.domain.room_entities.IssueCategory;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.agent.feature_issue_resolution.databinding.FragmentTransactionHelpBinding;
import ai.kudi.agent.issues.p008ui.IssueDetailAdapter;
import ai.kudi.agent.issues.p008ui.viewModels.IssueDetailsViewModel;
import ai.kudi.agent.issues.p008ui.viewModels.data.IssueDetailsViewData;
import ai.kudi.agent.issues.viewmodels.model.IssueTypeModel;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C1723k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import dagger.android.p197e.C7429a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: IssueDetailFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 52\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00015B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003H\u0014J\b\u0010\u001b\u001a\u00020\u0002H\u0014J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u0019H\u0002J\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!H\u0016J\u0012\u0010\"\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0018\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0016J$\u0010*\u001a\u00020+2\u0006\u0010(\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010/\u001a\u00020\u0019H\u0016J\u001a\u00100\u001a\u00020\u00192\u0006\u00101\u001a\u00020+2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0010\u00102\u001a\u00020\u00192\b\u00103\u001a\u0004\u0018\u000104R\u001c\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000¨\u00066"}, m10421d2 = {"Lai/kudi/agent/issues/ui/IssueDetailFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/issues/ui/viewModels/IssueDetailsViewModel;", "Lai/kudi/agent/issues/ui/viewModels/data/IssueDetailsViewData;", "Lai/kudi/agent/feature_issue_resolution/databinding/FragmentTransactionHelpBinding;", "()V", "emptyHistoryTextView", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getEmptyHistoryTextView", "()Landroid/widget/TextView;", "issueActivity", "Lai/kudi/agent/issues/ui/IssueActivity;", "issueDetailsViewModel", "getIssueDetailsViewModel", "()Lai/kudi/agent/issues/ui/viewModels/IssueDetailsViewModel;", "setIssueDetailsViewModel", "(Lai/kudi/agent/issues/ui/viewModels/IssueDetailsViewModel;)V", "issueModel", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "issueType", "Lai/kudi/agent/core/domain/room_entities/IssueCategory;", "issueTypeAdapter", "Lai/kudi/agent/issues/ui/IssueDetailAdapter;", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "handleSearch", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onResume", "onViewCreated", "view", "performSearch", "query", "", "Companion", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.IssueDetailFragment */
/* loaded from: classes.dex */
public final class IssueDetailFragment extends BaseMVVMViewBindingFragment<IssueDetailsViewModel, IssueDetailsViewData, FragmentTransactionHelpBinding> {
    public static final Companion Companion;
    public static final String DATA = "TITLE";
    public static final String ISSUE_MODEL = "TRANSACTION";
    private IssueActivity issueActivity;
    public IssueDetailsViewModel issueDetailsViewModel;
    private IssueTypeModel issueModel;
    private IssueCategory issueType;
    private IssueDetailAdapter issueTypeAdapter;

    /* compiled from: IssueDetailFragment.kt */
    @Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/issues/ui/IssueDetailFragment$Companion;", "", "()V", IssueTypeFragmentNew.DATA, "", IssueActivity.ISSUE_MODEL, "newInstance", "Lai/kudi/agent/issues/ui/IssueDetailFragment;", TransactionBreakDownItemType.DATA, "Lai/kudi/agent/core/domain/room_entities/IssueCategory;", "issueTypeModel", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.issues.ui.IssueDetailFragment$Companion */
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
        public final IssueDetailFragment newInstance(IssueCategory issueCategory) {
            Log_OC.getArray(issueCategory, TransactionBreakDownItemType.DATA);
            Bundle $r2 = new Bundle();
            $r2.putParcelable("TITLE", issueCategory);
            IssueDetailFragment $r3 = new IssueDetailFragment();
            $r3.setArguments($r2);
            return $r3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final IssueDetailFragment newInstance(IssueTypeModel issueTypeModel) {
            Log_OC.getArray(issueTypeModel, "issueTypeModel");
            Bundle $r2 = new Bundle();
            $r2.putParcelable(IssueDetailFragment.ISSUE_MODEL, issueTypeModel);
            IssueDetailFragment $r3 = new IssueDetailFragment();
            $r3.setArguments($r2);
            return $r3;
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
    private final TextView getEmptyHistoryTextView() {
        View $r1 = requireView();
        int $i0 = C0214R.C0216id.emptyHistoryTextView;
        TextView $r2 = (TextView) $r1.findViewById($i0);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handleSearch() {
        SearchView $r2;
        IssueActivity $r3 = this.issueActivity;
        if ($r3 == null || ($r2 = $r3.getSearchView()) == null) {
            return;
        }
        $r2.setOnQueryTextListener(new SearchView.InterfaceC1050l() { // from class: ai.kudi.agent.issues.ui.IssueDetailFragment$handleSearch$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.appcompat.widget.SearchView.InterfaceC1050l
            public boolean onQueryTextChange(String str) {
                IssueDetailFragment $r1 = IssueDetailFragment.this;
                $r1.performSearch(str);
                return true;
            }

            @Override // androidx.appcompat.widget.SearchView.InterfaceC1050l
            public boolean onQueryTextSubmit(String str) {
                return true;
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        IssueDetailsViewData $r2 = (IssueDetailsViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:14:0x00f7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void applyViewData(ai.kudi.agent.issues.p008ui.viewModels.data.IssueDetailsViewData r110) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.issues.p008ui.IssueDetailFragment.applyViewData(ai.kudi.agent.issues.ui.viewModels.data.IssueDetailsViewData):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        IssueDetailsViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public IssueDetailsViewModel createViewModel() {
        IssueDetailsViewModel $r1 = getIssueDetailsViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final IssueDetailsViewModel getIssueDetailsViewModel() {
        IssueDetailsViewModel $r1 = this.issueDetailsViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("issueDetailsViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return IssueDetailsViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        C7429a.m18752b(this);
        super.onAttach(context);
        IssueActivity $r2 = (IssueActivity) context;
        this.issueActivity = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IssueCategory $r3;
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        if (getArguments() == null) {
            return;
        }
        Bundle $r1 = getArguments();
        IssueTypeModel $r2 = null;
        if ($r1 == null) {
            $r3 = null;
        } else {
            Parcelable $r4 = $r1.getParcelable("TITLE");
            $r3 = (IssueCategory) $r4;
        }
        this.issueType = $r3;
        Bundle $r12 = getArguments();
        if ($r12 != null) {
            Parcelable $r42 = $r12.getParcelable(ISSUE_MODEL);
            $r2 = (IssueTypeModel) $r42;
        }
        this.issueModel = $r2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        Log_OC.getArray(menu, "menu");
        Log_OC.getArray(menuInflater, "inflater");
        super.onCreateOptionsMenu(menu, menuInflater);
        menu.clear();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentTransactionHelpBinding $r4 = FragmentTransactionHelpBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        FragmentActivity $r1 = getActivity();
        if ($r1 == null) {
            NullPointerException $r7 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.issues.ui.IssueActivity");
            throw $r7;
        }
        IssueActivity $r2 = (IssueActivity) $r1;
        IssueCategory $r3 = this.issueType;
        String $r5 = $r3 == null ? null : $r3.getCategoryName();
        if ($r5 == null) {
            IssueTypeModel $r6 = this.issueModel;
            String $r4 = $r6 != null ? $r6.getType() : null;
            $r5 = $r4 != null ? $r4 : "";
        }
        $r2.setTitle($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        Context $r4 = getContext();
        LinearLayoutManager $r3 = new LinearLayoutManager($r4);
        InterfaceC8209a $r5 = requireBinding();
        FragmentTransactionHelpBinding $r6 = (FragmentTransactionHelpBinding) $r5;
        RecyclerView $r7 = $r6.issueTypeRecyclerview;
        $r7.setLayoutManager($r3);
        RecyclerView $r72 = $r6.issueTypeRecyclerview;
        $r72.setHasFixedSize(true);
        Context $r42 = getContext();
        int $i0 = $r3.m35389v2();
        C1723k $r8 = new C1723k($r42, $i0);
        Context $r43 = requireContext();
        Log_OC.loadImage($r43, "requireContext()");
        int $i02 = C0214R.C0215drawable.transactions_divider;
        Drawable $r9 = ContextExtKt.getKudiDrawable($r43, $i02);
        if ($r9 != null) {
            $r8.m34703f($r9);
            RecyclerView $r73 = $r6.issueTypeRecyclerview;
            $r73.m35294h($r8);
        }
        IssueDetailsViewModel $r10 = getIssueDetailsViewModel();
        IssueCategory $r11 = this.issueType;
        String $r13 = $r11 == null ? null : $r11.getCategory();
        if ($r13 == null) {
            IssueDetailsViewModel.Companion $r14 = IssueDetailsViewModel.Companion;
            Map $r15 = $r14.getIssueTypeMap();
            IssueTypeModel $r16 = this.issueModel;
            String $r12 = $r16 != null ? $r16.getType() : null;
            Object $r17 = $r15.get($r12);
            $r13 = (String) $r17;
            if ($r13 == null) {
                $r13 = "";
            }
        }
        $r10.fetchIssueDetails($r13);
        IssueDetailAdapter.Companion $r18 = IssueDetailAdapter.Companion;
        IssueDetailFragment$onViewCreated$1$2 $r19 = new IssueDetailFragment$onViewCreated$1$2(this);
        $r18.setClickedListener($r19);
        handleSearch();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void performSearch(String str) {
        IssueDetailAdapter $r1 = this.issueTypeAdapter;
        if ($r1 != null) {
            if ($r1 != null) {
                IssueDetailFragment$performSearch$2 $r2 = new IssueDetailFragment$performSearch$2(this);
                $r1.search(str, $r2);
                return;
            }
            Log_OC.LogError("issueTypeAdapter");
            NullPointerException r4 = new NullPointerException("Null throw statement replaced by Soot");
            throw r4;
        }
    }

    public final void setIssueDetailsViewModel(IssueDetailsViewModel issueDetailsViewModel) {
        Log_OC.getArray(issueDetailsViewModel, "<set-?>");
        this.issueDetailsViewModel = issueDetailsViewModel;
    }
}

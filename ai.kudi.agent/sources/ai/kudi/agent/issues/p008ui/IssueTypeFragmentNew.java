package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.core.databinding.EmptyHistoryBinding;
import ai.kudi.agent.core.domain.room_entities.IssueCategory;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.agent.feature_issue_resolution.databinding.FragmentTransactionHelpBinding;
import ai.kudi.agent.issues.p008ui.viewModels.IssueTypeViewModel;
import ai.kudi.agent.issues.p008ui.viewModels.data.IssueTypeViewData;
import ai.kudi.agent.login.domain.LoginParams;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.core.content.C1335a;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C1723k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import dagger.android.p197e.C7429a;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13742z;
import p201g.p270x.InterfaceC8209a;
/* compiled from: IssueTypeFragmentNew.kt */
@Metadata(m10422d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 62\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00016B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003H\u0014J\b\u0010\"\u001a\u00020\u0002H\u0014J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020$H\u0014J\b\u0010%\u001a\u00020 H\u0002J\u0010\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020(H\u0016J$\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00101\u001a\u00020 H\u0016J\u001a\u00102\u001a\u00020 2\u0006\u00103\u001a\u00020*2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0010\u00104\u001a\u00020 2\b\u00105\u001a\u0004\u0018\u00010\u0007R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u001a\u0010\u0005\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u00067"}, m10421d2 = {"Lai/kudi/agent/issues/ui/IssueTypeFragmentNew;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/issues/ui/viewModels/IssueTypeViewModel;", "Lai/kudi/agent/issues/ui/viewModels/data/IssueTypeViewData;", "Lai/kudi/agent/feature_issue_resolution/databinding/FragmentTransactionHelpBinding;", "()V", "customerType", "", "getCustomerType", "()Ljava/lang/String;", "setCustomerType", "(Ljava/lang/String;)V", "emptyHistoryTextView", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getEmptyHistoryTextView", "()Landroid/widget/TextView;", "issueTypeAdapter", "Lai/kudi/agent/issues/ui/IssueTypeAdapterNew;", "issueTypeViewModel", "getIssueTypeViewModel", "()Lai/kudi/agent/issues/ui/viewModels/IssueTypeViewModel;", "setIssueTypeViewModel", "(Lai/kudi/agent/issues/ui/viewModels/IssueTypeViewModel;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences$annotations", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "handleSearchView", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onViewCreated", "view", "performSearch", "query", "Companion", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.IssueTypeFragmentNew */
/* loaded from: classes.dex */
public final class IssueTypeFragmentNew extends BaseMVVMViewBindingFragment<IssueTypeViewModel, IssueTypeViewData, FragmentTransactionHelpBinding> {
    public static final Companion Companion;
    public static final String DATA = "DATA";
    public String customerType;
    private IssueTypeAdapterNew issueTypeAdapter;
    public IssueTypeViewModel issueTypeViewModel;
    public SharedPreferences sharedPreferences;

    /* compiled from: IssueTypeFragmentNew.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/issues/ui/IssueTypeFragmentNew$Companion;", "", "()V", IssueTypeFragmentNew.DATA, "", "newInstance", "Lai/kudi/agent/issues/ui/IssueTypeFragmentNew;", TransactionBreakDownItemType.DATA, "Lai/kudi/agent/core/domain/room_entities/IssueCategory;", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.issues.ui.IssueTypeFragmentNew$Companion */
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
        public final IssueTypeFragmentNew newInstance(IssueCategory issueCategory) {
            Log_OC.getArray(issueCategory, TransactionBreakDownItemType.DATA);
            IssueTypeFragmentNew $r3 = new IssueTypeFragmentNew();
            Bundle $r1 = new Bundle();
            $r1.putParcelable(IssueTypeFragmentNew.DATA, issueCategory);
            C13666w c13666w = C13666w.f30112a;
            $r3.setArguments($r1);
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

    public static /* synthetic */ void getSharedPreferences$annotations() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handleSearchView() {
        boolean $z0 = getActivity() instanceof IssueActivity;
        if ($z0) {
            FragmentActivity $r1 = getActivity();
            if ($r1 == null) {
                NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.issues.ui.IssueActivity");
                throw $r5;
            }
            IssueActivity $r2 = (IssueActivity) $r1;
            SearchView $r3 = $r2.getSearchView();
            if ($r3 == null) {
                return;
            }
            $r3.setOnQueryTextListener(new SearchView.InterfaceC1050l() { // from class: ai.kudi.agent.issues.ui.IssueTypeFragmentNew$handleSearchView$1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // androidx.appcompat.widget.SearchView.InterfaceC1050l
                public boolean onQueryTextChange(String str) {
                    IssueTypeFragmentNew $r12 = IssueTypeFragmentNew.this;
                    $r12.performSearch(str);
                    return true;
                }

                @Override // androidx.appcompat.widget.SearchView.InterfaceC1050l
                public boolean onQueryTextSubmit(String str) {
                    return true;
                }
            });
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        IssueTypeViewData $r2 = (IssueTypeViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(IssueTypeViewData issueTypeViewData) {
        String $r11;
        FragmentActivity $r12;
        List $r5;
        Log_OC.getArray(issueTypeViewData, "viewData");
        InterfaceC8209a $r2 = requireBinding();
        FragmentTransactionHelpBinding $r3 = (FragmentTransactionHelpBinding) $r2;
        boolean $z0 = issueTypeViewData.isLoading();
        if ($z0) {
            ProgressBar $r4 = $r3.loader;
            Log_OC.loadImage($r4, "loader");
            ViewExtKt.show($r4);
        } else {
            ProgressBar $r42 = $r3.loader;
            Log_OC.loadImage($r42, "loader");
            ViewExtKt.hide$default($r42, false, 1, null);
        }
        List $r52 = issueTypeViewData.getCategories();
        if ($r52 != null) {
            boolean $z02 = $r52.isEmpty();
            if ($z02) {
                TextView $r6 = getEmptyHistoryTextView();
                Log_OC.loadImage($r6, "emptyHistoryTextView");
                ViewExtKt.hide$default($r6, false, 1, null);
                EmptyHistoryBinding $r7 = $r3.emptyHistoryView;
                View $r8 = $r7.getRoot();
                Log_OC.loadImage($r8, "emptyHistoryView.root");
                View r13 = $r8;
                ViewExtKt.show(r13);
            } else {
                IssueTypeAdapterNew $r9 = this.issueTypeAdapter;
                if ($r9 != null) {
                    $r5 = C13742z.m3823D0($r52);
                    $r9.setData($r5);
                }
                EmptyHistoryBinding $r72 = $r3.emptyHistoryView;
                View $r82 = $r72.getRoot();
                Log_OC.loadImage($r82, "emptyHistoryView.root");
                View r132 = $r82;
                ViewExtKt.hide$default(r132, false, 1, null);
            }
        }
        IssueTypeViewData.Error $r10 = issueTypeViewData.getError();
        if ($r10 == null || ($r11 = $r10.getMessage()) == null || ($r12 = getActivity()) == null) {
            return;
        }
        ContextExtKt.toast$default($r12, $r11, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        IssueTypeViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public IssueTypeViewModel createViewModel() {
        IssueTypeViewModel $r1 = getIssueTypeViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getCustomerType() {
        String $r1 = this.customerType;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("customerType");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final IssueTypeViewModel getIssueTypeViewModel() {
        IssueTypeViewModel $r1 = this.issueTypeViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("issueTypeViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
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

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return IssueTypeViewModel.class;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        C7429a.m18752b(this);
        super.onAttach(context);
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
        boolean $z0 = getActivity() instanceof IssueActivity;
        if ($z0) {
            FragmentActivity $r1 = getActivity();
            if ($r1 == null) {
                NullPointerException $r4 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.issues.ui.IssueActivity");
                throw $r4;
            }
            IssueActivity $r2 = (IssueActivity) $r1;
            int $i0 = C0214R.string.what_is_your_issue;
            String $r3 = getString($i0);
            Log_OC.loadImage($r3, "getString(R.string.what_is_your_issue)");
            $r2.setTitle($r3);
        }
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
        SharedPreferences $r8 = getSharedPreferences();
        String $r10 = $r8.getString(LoginParams.EXTRA_CUSTOMER_TYPE, "AGENT");
        String $r9 = $r10 != null ? $r10 : "AGENT";
        setCustomerType($r9);
        Context $r42 = getContext();
        int $i0 = $r3.m35389v2();
        C1723k $r11 = new C1723k($r42, $i0);
        FragmentActivity $r12 = requireActivity();
        Context $r43 = $r12.getApplicationContext();
        int $i02 = C0214R.C0215drawable.transactions_divider;
        Drawable $r13 = C1335a.m36322f($r43, $i02);
        Log_OC.append($r13);
        $r11.m34703f($r13);
        IssueCategory $r15 = null;
        IssueTypeAdapterNew $r14 = new IssueTypeAdapterNew(null, 1, null);
        this.issueTypeAdapter = $r14;
        RecyclerView $r73 = $r6.issueTypeRecyclerview;
        $r73.setAdapter($r14);
        RecyclerView $r74 = $r6.issueTypeRecyclerview;
        $r74.m35294h($r11);
        IssueTypeAdapterNew $r142 = this.issueTypeAdapter;
        if ($r142 != null) {
            IssueTypeFragmentNew$onViewCreated$1$1 $r16 = new IssueTypeFragmentNew$onViewCreated$1$1(this);
            $r142.setClickedListener($r16);
        }
        Bundle $r2 = getArguments();
        if ($r2 != null) {
            Parcelable $r17 = $r2.getParcelable(DATA);
            $r15 = (IssueCategory) $r17;
        }
        if ($r15 != null) {
            IssueTypeViewModel $r18 = getIssueTypeViewModel();
            String $r92 = getCustomerType();
            $r18.startWithData($r15, $r92);
        } else {
            IssueTypeViewModel $r182 = getIssueTypeViewModel();
            String $r93 = getCustomerType();
            $r182.start($r93);
        }
        handleSearchView();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void performSearch(String str) {
        IssueTypeAdapterNew $r2 = this.issueTypeAdapter;
        if ($r2 == null) {
            return;
        }
        IssueTypeFragmentNew$performSearch$1 $r3 = new IssueTypeFragmentNew$performSearch$1(this);
        $r2.search(str, $r3);
    }

    public final void setCustomerType(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.customerType = str;
    }

    public final void setIssueTypeViewModel(IssueTypeViewModel issueTypeViewModel) {
        Log_OC.getArray(issueTypeViewModel, "<set-?>");
        this.issueTypeViewModel = issueTypeViewModel;
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }
}

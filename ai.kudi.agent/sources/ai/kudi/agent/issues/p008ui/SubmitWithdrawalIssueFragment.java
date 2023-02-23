package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.dialogs.DatePickerFragment;
import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.agent.feature_issue_resolution.databinding.FragmentSubmitIssueBinding;
import ai.kudi.agent.issues.p008ui.viewModels.SubmitWidthrawalIssueViewModel;
import ai.kudi.agent.issues.p008ui.viewModels.data.SubmitWithdrawalIssueViewData;
import ai.kudi.agent.issues.viewmodels.model.IssueTypeModel;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import ai.kudi.dip.library.edittext.KudiNairaInputField;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import androidx.lifecycle.PreferenceActivity;
import dagger.android.p197e.C7429a;
import java.io.Serializable;
import java.util.Date;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13282v;
import p201g.p270x.InterfaceC8209a;
import p590o.p591a.Timber;
/* compiled from: SubmitWithdrawalIssueFragment.kt */
@Metadata(m10422d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 '2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001'B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003H\u0002J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0003H\u0014J\b\u0010\u0012\u001a\u00020\u0002H\u0014J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J$\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020#H\u0016J\u001a\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010&\u001a\u00020\u000eH\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006("}, m10421d2 = {"Lai/kudi/agent/issues/ui/SubmitWithdrawalIssueFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/issues/ui/viewModels/SubmitWidthrawalIssueViewModel;", "Lai/kudi/agent/issues/ui/viewModels/data/SubmitWithdrawalIssueViewData;", "Lai/kudi/agent/feature_issue_resolution/databinding/FragmentSubmitIssueBinding;", "()V", "issueData", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "submitWidthrawalIssueViewModel", "getSubmitWidthrawalIssueViewModel", "()Lai/kudi/agent/issues/ui/viewModels/SubmitWidthrawalIssueViewModel;", "setSubmitWidthrawalIssueViewModel", "(Lai/kudi/agent/issues/ui/viewModels/SubmitWidthrawalIssueViewModel;)V", "applyError", "", "submitWithdrawalIssueViewData", "applyViewData", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onPrepareOptionsMenu", "menu", "Landroid/view/Menu;", "onViewCreated", "view", "showDatePicker", "Companion", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.SubmitWithdrawalIssueFragment */
/* loaded from: classes.dex */
public final class SubmitWithdrawalIssueFragment extends BaseMVVMViewBindingFragment<SubmitWidthrawalIssueViewModel, SubmitWithdrawalIssueViewData, FragmentSubmitIssueBinding> {
    public static final Companion Companion;
    public static final String ISSUE_DATA = "IssueData";
    private IssueTypeModel issueData;
    public SubmitWidthrawalIssueViewModel submitWidthrawalIssueViewModel;

    /* compiled from: SubmitWithdrawalIssueFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/issues/ui/SubmitWithdrawalIssueFragment$Companion;", "", "()V", CustomerDetailsIssueFragment.ISSUE_DATA, "", "newInstance", "Lai/kudi/agent/issues/ui/SubmitWithdrawalIssueFragment;", "issueData", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.issues.ui.SubmitWithdrawalIssueFragment$Companion */
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
        public final SubmitWithdrawalIssueFragment newInstance(IssueTypeModel issueTypeModel) {
            Log_OC.getArray(issueTypeModel, "issueData");
            SubmitWithdrawalIssueFragment $r3 = new SubmitWithdrawalIssueFragment();
            Bundle $r1 = new Bundle();
            $r1.putParcelable(SubmitWithdrawalIssueFragment.ISSUE_DATA, issueTypeModel);
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
    private final void applyError(SubmitWithdrawalIssueViewData submitWithdrawalIssueViewData) {
        SubmitWithdrawalIssueViewData.Error $r2 = submitWithdrawalIssueViewData.getError();
        if ($r2 == null) {
            return;
        }
        InterfaceC8209a $r3 = requireBinding();
        FragmentSubmitIssueBinding $r4 = (FragmentSubmitIssueBinding) $r3;
        KudiInputField $r5 = $r4.rrnView;
        String $r6 = $r2.getRrn();
        String $r7 = $r6;
        if ($r6 == null) {
            $r7 = "";
        }
        $r5.setError($r7);
        KudiInputField $r52 = $r4.transactionDate;
        String $r62 = $r2.getDate();
        String $r72 = $r62;
        if ($r62 == null) {
            $r72 = "";
        }
        $r52.setError($r72);
        KudiNairaInputField $r9 = $r4.transactionAmountView;
        String $r63 = $r2.getAmount();
        String $r73 = $r63;
        if ($r63 == null) {
            $r73 = "";
        }
        $r9.setError($r73);
        KudiInputField $r53 = $r4.firstSixDigitsView;
        String $r64 = $r2.getFirstSixDigits();
        String $r74 = $r64;
        if ($r64 == null) {
            $r74 = "";
        }
        $r53.setError($r74);
        KudiInputField $r54 = $r4.lastFourDigitsView;
        String $r65 = $r2.getLastFourDigits();
        String $r8 = $r65 != null ? $r65 : "";
        $r54.setError($r8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-8$lambda-4$lambda-3  reason: not valid java name */
    public static final void m39504onViewCreated$lambda8$lambda4$lambda3(SubmitWithdrawalIssueFragment submitWithdrawalIssueFragment, View view) {
        Log_OC.getArray(submitWithdrawalIssueFragment, "this$0");
        submitWithdrawalIssueFragment.showDatePicker();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-8$lambda-5  reason: not valid java name */
    public static final void m39505onViewCreated$lambda8$lambda5(SubmitWithdrawalIssueFragment submitWithdrawalIssueFragment, View view) {
        Log_OC.getArray(submitWithdrawalIssueFragment, "this$0");
        submitWithdrawalIssueFragment.showDatePicker();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-8$lambda-7  reason: not valid java name */
    public static final void m39506onViewCreated$lambda8$lambda7(SubmitWithdrawalIssueFragment submitWithdrawalIssueFragment, FragmentSubmitIssueBinding fragmentSubmitIssueBinding, View view) {
        Log_OC.getArray(submitWithdrawalIssueFragment, "this$0");
        Log_OC.getArray(fragmentSubmitIssueBinding, "$this_apply");
        IssueTypeModel $r3 = submitWithdrawalIssueFragment.issueData;
        if ($r3 == null) {
            return;
        }
        SubmitWidthrawalIssueViewModel $r4 = submitWithdrawalIssueFragment.getSubmitWidthrawalIssueViewModel();
        KudiNairaInputField $r5 = fragmentSubmitIssueBinding.transactionAmountView;
        String $r6 = $r5.getText();
        KudiInputField $r7 = fragmentSubmitIssueBinding.transactionDate;
        String $r8 = $r7.getText();
        KudiInputField $r72 = fragmentSubmitIssueBinding.firstSixDigitsView;
        String $r9 = $r72.getText();
        KudiInputField $r73 = fragmentSubmitIssueBinding.lastFourDigitsView;
        String $r10 = $r73.getText();
        KudiInputField $r74 = fragmentSubmitIssueBinding.rrnView;
        String $r11 = $r74.getText();
        String $r12 = $r3.getTitle();
        if ($r12 == null) {
            $r12 = "";
        }
        String $r13 = $r3.getLabel();
        String $r14 = $r3.getIssueId();
        if ($r14 == null) {
            $r14 = "";
        }
        SubmitWidthrawalIssueViewModel.submitIssue$default($r4, $r6, $r8, $r9, $r10, $r11, $r12, $r13, $r14, null, 256, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showDatePicker() {
        ContextExtKt.hideKeyboard(this);
        DatePickerFragment.Companion $r1 = DatePickerFragment.Companion;
        DatePickerFragment $r2 = DatePickerFragment.Companion.newInstance$default($r1, false, null, false, 7, null);
        FragmentManager $r3 = getChildFragmentManager();
        PreferenceActivity $r4 = getViewLifecycleOwner();
        $r3.p1(DatePickerFragment.DATE_SET_KEY, $r4, new InterfaceC1523w() { // from class: ai.kudi.agent.issues.ui.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: c */
            public final void m38848c(String str, Bundle bundle) {
                SubmitWithdrawalIssueFragment $r32 = SubmitWithdrawalIssueFragment.this;
                SubmitWithdrawalIssueFragment.m39507showDatePicker$lambda9($r32, str, bundle);
            }
        });
        FragmentManager $r32 = getChildFragmentManager();
        $r2.show($r32, DatePickerFragment.year);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: showDatePicker$lambda-9  reason: not valid java name */
    public static final void m39507showDatePicker$lambda9(SubmitWithdrawalIssueFragment submitWithdrawalIssueFragment, String str, Bundle bundle) {
        Log_OC.getArray(submitWithdrawalIssueFragment, "this$0");
        Log_OC.getArray(str, "requestKey");
        Log_OC.getArray(bundle, "result");
        boolean $z0 = Log_OC.append(str, DatePickerFragment.DATE_SET_KEY);
        if ($z0) {
            Serializable $r3 = bundle.getSerializable(DatePickerFragment.DATE_KEY);
            if ($r3 == null) {
                NullPointerException $r8 = new NullPointerException("null cannot be cast to non-null type java.util.Date");
                throw $r8;
            }
            Date $r4 = (Date) $r3;
            String $r1 = DateExtKt.convertDateToGivenFormat($r4, "yyyy/MM/dd");
            InterfaceC8209a $r5 = submitWithdrawalIssueFragment.requireBinding();
            FragmentSubmitIssueBinding $r6 = (FragmentSubmitIssueBinding) $r5;
            KudiInputField $r7 = $r6.transactionDate;
            $r7.setText($r1);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        SubmitWithdrawalIssueViewData $r2 = (SubmitWithdrawalIssueViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(SubmitWithdrawalIssueViewData submitWithdrawalIssueViewData) {
        Log_OC.getArray(submitWithdrawalIssueViewData, "viewData");
        boolean $z0 = submitWithdrawalIssueViewData.isSubmittingIssue();
        if ($z0) {
            InterfaceC8209a $r2 = requireBinding();
            FragmentSubmitIssueBinding $r3 = (FragmentSubmitIssueBinding) $r2;
            KudiButton $r4 = $r3.submitIssueButton;
            $r4.m38032f();
        } else {
            InterfaceC8209a $r22 = requireBinding();
            FragmentSubmitIssueBinding $r32 = (FragmentSubmitIssueBinding) $r22;
            KudiButton $r42 = $r32.submitIssueButton;
            $r42.m38033e();
        }
        applyError(submitWithdrawalIssueViewData);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        SubmitWidthrawalIssueViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public SubmitWidthrawalIssueViewModel createViewModel() {
        SubmitWidthrawalIssueViewModel $r1 = getSubmitWidthrawalIssueViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SubmitWidthrawalIssueViewModel getSubmitWidthrawalIssueViewModel() {
        SubmitWidthrawalIssueViewModel $r1 = this.submitWidthrawalIssueViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("submitWidthrawalIssueViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return SubmitWidthrawalIssueViewModel.class;
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
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        Bundle $r1 = getArguments();
        if ($r1 == null) {
            return;
        }
        Parcelable $r2 = $r1.getParcelable(ISSUE_DATA);
        IssueTypeModel $r3 = (IssueTypeModel) $r2;
        this.issueData = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentSubmitIssueBinding $r4 = FragmentSubmitIssueBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        Log_OC.getArray(menu, "menu");
        super.onPrepareOptionsMenu(menu);
        int $i0 = C0214R.C0216id.search_menu;
        MenuItem $r1 = menu.findItem($i0);
        $r1.setVisible(false);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String $r12;
        String $r9;
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity $r3 = getActivity();
        if ($r3 == null) {
            NullPointerException r22 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.issues.ui.IssueActivity");
            throw r22;
        }
        IssueActivity $r4 = (IssueActivity) $r3;
        $r4.setTitle("Cash Withdrawal");
        InterfaceC8209a $r5 = requireBinding();
        final FragmentSubmitIssueBinding $r6 = (FragmentSubmitIssueBinding) $r5;
        IssueTypeModel $r7 = this.issueData;
        if ($r7 != null) {
            boolean $z0 = $r7.isFromTransactionPage();
            if ($z0) {
                KudiInputField $r8 = $r6.transactionDate;
                String $r92 = $r7.getTransactionDate();
                $r8.setText($r92);
                KudiNairaInputField $r10 = $r6.transactionAmountView;
                String $r93 = $r7.getTransactionValue();
                $r10.setText($r93);
                KudiInputField $r82 = $r6.rrnView;
                String $r94 = $r7.getRrn();
                $r82.setText($r94);
                String $r95 = $r7.getMaxedPan();
                Object[] $r11 = new Object[0];
                Timber.wtf(Log_OC.m10359a("maxed pan ", (Object) $r95), $r11);
                String $r96 = $r7.getMaxedPan();
                if ($r96 != null) {
                    KudiInputField $r83 = $r6.firstSixDigitsView;
                    $r12 = C13282v.m5369P0($r96, 6);
                    $r83.setText($r12);
                    KudiInputField $r84 = $r6.lastFourDigitsView;
                    $r9 = C13282v.m5368Q0($r96, 4);
                    $r84.setText($r9);
                }
            }
        }
        KudiInputField $r85 = $r6.transactionDate;
        EditText $r13 = $r85.getEditText();
        $r13.setFocusable(false);
        $r13.setClickable(true);
        $r13.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.EditEventView$5
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SubmitWithdrawalIssueFragment $r2 = SubmitWithdrawalIssueFragment.this;
                SubmitWithdrawalIssueFragment.m39504onViewCreated$lambda8$lambda4$lambda3($r2, view2);
            }
        });
        ViewGroup $r86 = $r6.transactionDate;
        ViewGroup r23 = $r86;
        r23.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.FileSelectionFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SubmitWithdrawalIssueFragment $r2 = SubmitWithdrawalIssueFragment.this;
                SubmitWithdrawalIssueFragment.m39505onViewCreated$lambda8$lambda5($r2, view2);
            }
        });
        ViewGroup $r16 = $r6.submitIssueButton;
        ViewGroup r232 = $r16;
        r232.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.SearchResultsFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SubmitWithdrawalIssueFragment $r2 = SubmitWithdrawalIssueFragment.this;
                FragmentSubmitIssueBinding $r32 = $r6;
                SubmitWithdrawalIssueFragment.m39506onViewCreated$lambda8$lambda7($r2, $r32, view2);
            }
        });
    }

    public final void setSubmitWidthrawalIssueViewModel(SubmitWidthrawalIssueViewModel submitWidthrawalIssueViewModel) {
        Log_OC.getArray(submitWidthrawalIssueViewModel, "<set-?>");
        this.submitWidthrawalIssueViewModel = submitWidthrawalIssueViewModel;
    }
}

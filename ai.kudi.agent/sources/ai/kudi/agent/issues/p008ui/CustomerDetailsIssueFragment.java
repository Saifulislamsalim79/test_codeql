package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.domain.room_entities.Bank;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.EditTextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.agent.feature_issue_resolution.databinding.CustomerDetailsIssueFragmentBinding;
import ai.kudi.agent.issues.p008ui.viewModels.CustomerDetailsIssueViewModel;
import ai.kudi.agent.issues.p008ui.viewModels.data.CustomerDetailsViewData;
import ai.kudi.agent.issues.viewmodels.model.IssueTypeModel;
import ai.kudi.agent.issues.viewmodels.model.WithdrawalTypes;
import ai.kudi.dip.library.edittext.KudiInputField;
import ai.kudi.dip.library.edittext.KudiNairaInputField;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import dagger.android.p197e.C7429a;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.C11810u;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import p590o.p591a.Timber;
/* compiled from: CustomerDetailsIssueFragment.kt */
@Metadata(m10422d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 .2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001.B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0003H\u0014J\b\u0010\u0016\u001a\u00020\u0002H\u0014J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0014J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J&\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010\"\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010)\u001a\u00020\u0014H\u0016J\u001a\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020%2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010,\u001a\u00020\u0014H\u0002J\b\u0010-\u001a\u00020\u0014H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, m10421d2 = {"Lai/kudi/agent/issues/ui/CustomerDetailsIssueFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/issues/ui/viewModels/CustomerDetailsIssueViewModel;", "Lai/kudi/agent/issues/ui/viewModels/data/CustomerDetailsViewData;", "Lai/kudi/agent/feature_issue_resolution/databinding/CustomerDetailsIssueFragmentBinding;", "()V", "accountNumberListener", "Lio/reactivex/disposables/Disposable;", "customerDetailsIssueViewModel", "getCustomerDetailsIssueViewModel", "()Lai/kudi/agent/issues/ui/viewModels/CustomerDetailsIssueViewModel;", "setCustomerDetailsIssueViewModel", "(Lai/kudi/agent/issues/ui/viewModels/CustomerDetailsIssueViewModel;)V", "isFromChargeBackDialog", "", "issueTypeModel", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "selectedBank", "Lai/kudi/agent/core/domain/room_entities/Bank;", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onViewCreated", "view", "setUpViews", "showBankDetails", "Companion", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.CustomerDetailsIssueFragment */
/* loaded from: classes.dex */
public final class CustomerDetailsIssueFragment extends BaseMVVMViewBindingFragment<CustomerDetailsIssueViewModel, CustomerDetailsViewData, CustomerDetailsIssueFragmentBinding> {
    public static final Companion Companion;
    public static final String ISSUE_DATA = "ISSUE_DATA";
    public static final String IS_FROM_CHARGE_BACK_DIALOG = "IS_FROM_DIALOG";
    private FavoritesArrayAdapter accountNumberListener;
    public CustomerDetailsIssueViewModel customerDetailsIssueViewModel;
    private boolean isFromChargeBackDialog;
    private IssueTypeModel issueTypeModel;
    private Bank selectedBank;

    /* compiled from: CustomerDetailsIssueFragment.kt */
    @Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/issues/ui/CustomerDetailsIssueFragment$Companion;", "", "()V", CustomerDetailsIssueFragment.ISSUE_DATA, "", "IS_FROM_CHARGE_BACK_DIALOG", "newInstance", "Lai/kudi/agent/issues/ui/CustomerDetailsIssueFragment;", "issueData", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "isFromChargeBackDialog", "", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.issues.ui.CustomerDetailsIssueFragment$Companion */
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
        public final CustomerDetailsIssueFragment newInstance(IssueTypeModel issueTypeModel, boolean z) {
            Log_OC.getArray(issueTypeModel, "issueData");
            CustomerDetailsIssueFragment $r3 = new CustomerDetailsIssueFragment();
            Bundle $r1 = new Bundle();
            $r1.putParcelable(CustomerDetailsIssueFragment.ISSUE_DATA, issueTypeModel);
            $r1.putBoolean(CustomerDetailsIssueFragment.IS_FROM_CHARGE_BACK_DIALOG, z);
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
    public static final CustomerDetailsIssueFragment newInstance(IssueTypeModel issueTypeModel, boolean z) {
        Companion $r0 = Companion;
        CustomerDetailsIssueFragment $r1 = $r0.newInstance(issueTypeModel, z);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setUpViews() {
        boolean $z0;
        IssueTypeModel $r1 = this.issueTypeModel;
        String $r2 = $r1 == null ? null : $r1.getType();
        boolean $z02 = Log_OC.append($r2, WithdrawalTypes.USSD);
        if ($z02) {
            InterfaceC8209a $r3 = requireBinding();
            CustomerDetailsIssueFragmentBinding $r4 = (CustomerDetailsIssueFragmentBinding) $r3;
            View $r5 = $r4.customerPhoneNumber;
            Log_OC.loadImage($r5, "requireBinding().customerPhoneNumber");
            View r32 = $r5;
            ViewExtKt.show(r32);
            InterfaceC8209a $r32 = requireBinding();
            CustomerDetailsIssueFragmentBinding $r42 = (CustomerDetailsIssueFragmentBinding) $r32;
            View $r8 = $r42.customerBankDetails;
            Log_OC.loadImage($r8, "requireBinding().customerBankDetails");
            View r322 = $r8;
            ViewExtKt.show(r322);
            InterfaceC8209a $r33 = requireBinding();
            CustomerDetailsIssueFragmentBinding $r43 = (CustomerDetailsIssueFragmentBinding) $r33;
            View $r52 = $r43.dateOfTransactionView;
            Log_OC.loadImage($r52, "requireBinding().dateOfTransactionView");
            View r323 = $r52;
            ViewExtKt.show(r323);
            InterfaceC8209a $r34 = requireBinding();
            CustomerDetailsIssueFragmentBinding $r44 = (CustomerDetailsIssueFragmentBinding) $r34;
            $r44.dateOfTransactionView.disableEditablity();
            InterfaceC8209a $r35 = requireBinding();
            CustomerDetailsIssueFragmentBinding $r45 = (CustomerDetailsIssueFragmentBinding) $r35;
            View $r9 = $r45.amountView;
            Log_OC.loadImage($r9, "requireBinding().amountView");
            View r324 = $r9;
            ViewExtKt.show(r324);
        } else {
            InterfaceC8209a $r36 = requireBinding();
            CustomerDetailsIssueFragmentBinding $r46 = (CustomerDetailsIssueFragmentBinding) $r36;
            View $r53 = $r46.customerPhoneNumber;
            Log_OC.loadImage($r53, "requireBinding().customerPhoneNumber");
            View r325 = $r53;
            ViewExtKt.show(r325);
            InterfaceC8209a $r37 = requireBinding();
            CustomerDetailsIssueFragmentBinding $r47 = (CustomerDetailsIssueFragmentBinding) $r37;
            RadioGroup $r6 = $r47.radioGroupYesOrNo;
            Log_OC.loadImage($r6, "requireBinding().radioGroupYesOrNo");
            ViewExtKt.show($r6);
            InterfaceC8209a $r38 = requireBinding();
            CustomerDetailsIssueFragmentBinding $r48 = (CustomerDetailsIssueFragmentBinding) $r38;
            TextView $r7 = $r48.settleCustomerQuestionView;
            Log_OC.loadImage($r7, "requireBinding().settleCustomerQuestionView");
            ViewExtKt.show($r7);
        }
        IssueTypeModel $r12 = this.issueTypeModel;
        if ($r12 == null) {
            $z0 = false;
        } else {
            Boolean $r10 = $r12.getShouldSettleCustomer();
            Boolean $r11 = Boolean.TRUE;
            $z0 = Log_OC.append($r10, $r11);
        }
        if ($z0) {
            showBankDetails();
        }
        final C11810u r25 = new C11810u();
        r25.f26497c = true;
        InterfaceC8209a $r39 = requireBinding();
        CustomerDetailsIssueFragmentBinding $r49 = (CustomerDetailsIssueFragmentBinding) $r39;
        $r49.customerBankView.disableEditablity();
        InterfaceC8209a $r310 = requireBinding();
        CustomerDetailsIssueFragmentBinding $r410 = (CustomerDetailsIssueFragmentBinding) $r310;
        KudiInputField $r54 = $r410.customerBankView;
        CustomerDetailsIssueFragment$setUpViews$1 r26 = new CustomerDetailsIssueFragment$setUpViews$1(this);
        $r54.setClickedListener(r26);
        InterfaceC8209a $r311 = requireBinding();
        CustomerDetailsIssueFragmentBinding $r411 = (CustomerDetailsIssueFragmentBinding) $r311;
        RadioButton $r14 = $r411.yesOption;
        RadioButton r33 = $r14;
        r33.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.MainActivity$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomerDetailsIssueFragment $r22 = CustomerDetailsIssueFragment.this;
                CustomerDetailsIssueFragment.m39463setUpViews$lambda1($r22, view);
            }
        });
        InterfaceC8209a $r312 = requireBinding();
        CustomerDetailsIssueFragmentBinding $r412 = (CustomerDetailsIssueFragmentBinding) $r312;
        RadioButton $r142 = $r412.noOption;
        RadioButton r332 = $r142;
        r332.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.Window$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomerDetailsIssueFragment $r22 = CustomerDetailsIssueFragment.this;
                CustomerDetailsIssueFragment.m39464setUpViews$lambda2($r22, view);
            }
        });
        InterfaceC8209a $r313 = requireBinding();
        CustomerDetailsIssueFragmentBinding $r413 = (CustomerDetailsIssueFragmentBinding) $r313;
        EditText $r17 = $r413.accountNumberInputField.getEditText();
        AbstractC11688p $r18 = EditTextExtKt.getTextChanges($r17);
        Object object = new Object() { // from class: ai.kudi.agent.issues.ui.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CustomerDetailsIssueFragment $r13 = CustomerDetailsIssueFragment.this;
                C11810u $r22 = r25;
                CharSequence $r414 = (CharSequence) obj;
                CustomerDetailsIssueFragment.m39465setUpViews$lambda3($r13, $r22, $r414);
            }
        };
        Button $r20 = Button.background;
        FavoritesArrayAdapter $r21 = $r18.e0(object, $r20);
        this.accountNumberListener = $r21;
        InterfaceC8209a $r314 = requireBinding();
        CustomerDetailsIssueFragmentBinding $r414 = (CustomerDetailsIssueFragmentBinding) $r314;
        ViewGroup $r22 = $r414.continueButton;
        ViewGroup r34 = $r22;
        r34.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.Settings$11
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomerDetailsIssueFragment $r23 = CustomerDetailsIssueFragment.this;
                CustomerDetailsIssueFragment.m39467setUpViews$lambda6($r23, view);
            }
        });
        InterfaceC8209a $r315 = requireBinding();
        CustomerDetailsIssueFragmentBinding $r415 = (CustomerDetailsIssueFragmentBinding) $r315;
        KudiInputField $r55 = $r415.dateOfTransactionView;
        CustomerDetailsIssueFragment$setUpViews$7 r31 = new CustomerDetailsIssueFragment$setUpViews$7(this);
        $r55.setClickedListener(r31);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpViews$lambda-1  reason: not valid java name */
    public static final void m39463setUpViews$lambda1(CustomerDetailsIssueFragment customerDetailsIssueFragment, View view) {
        Log_OC.getArray(customerDetailsIssueFragment, "this$0");
        IssueTypeModel $r3 = customerDetailsIssueFragment.issueTypeModel;
        if ($r3 != null) {
            Boolean $r1 = Boolean.TRUE;
            $r3.setShouldSettleCustomer($r1);
        }
        customerDetailsIssueFragment.showBankDetails();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpViews$lambda-2  reason: not valid java name */
    public static final void m39464setUpViews$lambda2(CustomerDetailsIssueFragment customerDetailsIssueFragment, View view) {
        Log_OC.getArray(customerDetailsIssueFragment, "this$0");
        IssueTypeModel $r3 = customerDetailsIssueFragment.issueTypeModel;
        if ($r3 != null) {
            Boolean $r4 = Boolean.FALSE;
            $r3.setShouldSettleCustomer($r4);
        }
        InterfaceC8209a $r0 = customerDetailsIssueFragment.requireBinding();
        CustomerDetailsIssueFragmentBinding $r5 = (CustomerDetailsIssueFragmentBinding) $r0;
        View $r6 = $r5.customerBankDetails;
        Log_OC.loadImage($r6, "requireBinding().customerBankDetails");
        View $r2 = $r6;
        ViewExtKt.hide$default($r2, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpViews$lambda-3  reason: not valid java name */
    public static final void m39465setUpViews$lambda3(CustomerDetailsIssueFragment customerDetailsIssueFragment, C11810u c11810u, CharSequence charSequence) {
        Log_OC.getArray(customerDetailsIssueFragment, "this$0");
        Log_OC.getArray(c11810u, "$reloadAccountLookup");
        InterfaceC8209a $r3 = customerDetailsIssueFragment.requireBinding();
        CustomerDetailsIssueFragmentBinding $r4 = (CustomerDetailsIssueFragmentBinding) $r3;
        KudiInputField $r5 = $r4.accountNumberInputField;
        String $r6 = $r5.getText();
        int $i0 = $r6.length();
        boolean $z0 = $i0 > 0;
        if ($z0) {
            int $i02 = $r6.length();
            if ($i02 < 7) {
                CustomerDetailsIssueViewModel $r7 = customerDetailsIssueFragment.getCustomerDetailsIssueViewModel();
                $r7.disposeLookupProcess();
                c11810u.f26497c = true;
                return;
            }
            int $i03 = $r6.length();
            if ($i03 != 10) {
                CustomerDetailsIssueViewModel $r72 = customerDetailsIssueFragment.getCustomerDetailsIssueViewModel();
                $r72.disposeLookupProcess();
                return;
            }
            Bank $r8 = customerDetailsIssueFragment.selectedBank;
            if ($r8 != null) {
                boolean $z02 = c11810u.f26497c;
                if ($z02) {
                    CustomerDetailsIssueViewModel $r73 = customerDetailsIssueFragment.getCustomerDetailsIssueViewModel();
                    $r73.disposeLookupProcess();
                    CustomerDetailsIssueViewModel $r74 = customerDetailsIssueFragment.getCustomerDetailsIssueViewModel();
                    InterfaceC8209a $r32 = customerDetailsIssueFragment.requireBinding();
                    CustomerDetailsIssueFragmentBinding $r42 = (CustomerDetailsIssueFragmentBinding) $r32;
                    KudiInputField $r52 = $r42.accountNumberInputField;
                    String $r62 = $r52.getText();
                    Bank $r82 = customerDetailsIssueFragment.selectedBank;
                    $r74.performLookup($r62, $r82);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpViews$lambda-4  reason: not valid java name */
    public static final void m39466setUpViews$lambda4(Throwable th) {
        String $r1 = Log_OC.m10359a("error acct number field ", th);
        Object[] $r2 = new Object[0];
        Timber.wtf($r1, $r2);
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpViews$lambda-6  reason: not valid java name */
    public static final void m39467setUpViews$lambda6(CustomerDetailsIssueFragment customerDetailsIssueFragment, View view) {
        Log_OC.getArray(customerDetailsIssueFragment, "this$0");
        IssueTypeModel $r0 = customerDetailsIssueFragment.issueTypeModel;
        if ($r0 == null) {
            return;
        }
        CustomerDetailsIssueViewModel $r4 = customerDetailsIssueFragment.getCustomerDetailsIssueViewModel();
        Bank $r1 = customerDetailsIssueFragment.selectedBank;
        InterfaceC8209a $r5 = customerDetailsIssueFragment.requireBinding();
        TextView $r7 = ((CustomerDetailsIssueFragmentBinding) $r5).accountNameInputField;
        CharSequence $r8 = $r7.getText();
        String $r9 = $r8.toString();
        boolean $z0 = customerDetailsIssueFragment.isFromChargeBackDialog;
        InterfaceC8209a $r52 = customerDetailsIssueFragment.requireBinding();
        KudiInputField $r10 = ((CustomerDetailsIssueFragmentBinding) $r52).customerNameView;
        String $r11 = $r10.getText();
        InterfaceC8209a $r53 = customerDetailsIssueFragment.requireBinding();
        CustomerDetailsIssueFragmentBinding $r6 = (CustomerDetailsIssueFragmentBinding) $r53;
        KudiInputField $r102 = $r6.customerPhoneNumber;
        String $r12 = $r102.getText();
        InterfaceC8209a $r54 = customerDetailsIssueFragment.requireBinding();
        CustomerDetailsIssueFragmentBinding $r62 = (CustomerDetailsIssueFragmentBinding) $r54;
        KudiNairaInputField $r13 = $r62.amountView;
        String $r14 = $r13.getText();
        InterfaceC8209a $r55 = customerDetailsIssueFragment.requireBinding();
        CustomerDetailsIssueFragmentBinding $r63 = (CustomerDetailsIssueFragmentBinding) $r55;
        KudiInputField $r103 = $r63.accountNumberInputField;
        String $r15 = $r103.getText();
        InterfaceC8209a $r56 = customerDetailsIssueFragment.requireBinding();
        CustomerDetailsIssueFragmentBinding $r64 = (CustomerDetailsIssueFragmentBinding) $r56;
        KudiInputField $r104 = $r64.dateOfTransactionView;
        String $r16 = $r104.getText();
        $r4.navigateToIssueResolutionFragment($r0, $r1, $r9, $z0, $r11, $r12, $r14, $r15, $r16);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showBankDetails() {
        InterfaceC8209a $r1 = requireBinding();
        CustomerDetailsIssueFragmentBinding $r2 = (CustomerDetailsIssueFragmentBinding) $r1;
        View $r3 = $r2.customerBankDetails;
        Log_OC.loadImage($r3, "requireBinding().customerBankDetails");
        View r4 = $r3;
        ViewExtKt.show(r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        CustomerDetailsViewData $r2 = (CustomerDetailsViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(CustomerDetailsViewData customerDetailsViewData) {
        Log_OC.getArray(customerDetailsViewData, "viewData");
        boolean $z0 = customerDetailsViewData.isAccountNameLoading();
        if ($z0) {
            InterfaceC8209a $r2 = requireBinding();
            CustomerDetailsIssueFragmentBinding $r3 = (CustomerDetailsIssueFragmentBinding) $r2;
            ProgressBar $r4 = $r3.accountNameProgressBar;
            Log_OC.loadImage($r4, "requireBinding().accountNameProgressBar");
            ViewExtKt.show($r4);
        } else {
            InterfaceC8209a $r22 = requireBinding();
            CustomerDetailsIssueFragmentBinding $r32 = (CustomerDetailsIssueFragmentBinding) $r22;
            ProgressBar $r42 = $r32.accountNameProgressBar;
            Log_OC.loadImage($r42, "requireBinding().accountNameProgressBar");
            ViewExtKt.hide$default($r42, false, 1, null);
        }
        String $r5 = customerDetailsViewData.getAccountName();
        if ($r5 != null) {
            InterfaceC8209a $r23 = requireBinding();
            CustomerDetailsIssueFragmentBinding $r33 = (CustomerDetailsIssueFragmentBinding) $r23;
            TextView $r6 = $r33.accountNameInputField;
            $r6.setText($r5);
        }
        CustomerDetailsViewData.Error $r7 = customerDetailsViewData.getError();
        if ($r7 == null) {
            return;
        }
        Integer $r8 = $r7.getCustomerName();
        if ($r8 != null) {
            int $i0 = $r8.intValue();
            InterfaceC8209a $r24 = requireBinding();
            CustomerDetailsIssueFragmentBinding $r34 = (CustomerDetailsIssueFragmentBinding) $r24;
            KudiInputField $r9 = $r34.customerNameView;
            $r9.setError(getString($i0));
        }
        Integer $r82 = $r7.getCustomerPhone();
        if ($r82 != null) {
            int $i02 = $r82.intValue();
            InterfaceC8209a $r25 = requireBinding();
            CustomerDetailsIssueFragmentBinding $r35 = (CustomerDetailsIssueFragmentBinding) $r25;
            KudiInputField $r92 = $r35.customerPhoneNumber;
            $r92.setError(getString($i02));
        }
        Integer $r83 = $r7.getCustomerBank();
        if ($r83 != null) {
            int $i03 = $r83.intValue();
            InterfaceC8209a $r26 = requireBinding();
            CustomerDetailsIssueFragmentBinding $r36 = (CustomerDetailsIssueFragmentBinding) $r26;
            KudiInputField $r93 = $r36.customerBankView;
            $r93.setError(getString($i03));
        }
        Integer $r84 = $r7.getAccountNumber();
        if ($r84 != null) {
            int $i04 = $r84.intValue();
            InterfaceC8209a $r27 = requireBinding();
            CustomerDetailsIssueFragmentBinding $r37 = (CustomerDetailsIssueFragmentBinding) $r27;
            KudiInputField $r94 = $r37.accountNumberInputField;
            $r94.setError(getString($i04));
        }
        Integer $r85 = $r7.getShouldSettleCustomer();
        if ($r85 != null) {
            int $i05 = $r85.intValue();
            Context $r10 = requireContext();
            Log_OC.loadImage($r10, "requireContext()");
            ContextExtKt.toast$default($r10, getString($i05), 0, 2, (Object) null);
        }
        String $r52 = $r7.getAccountName();
        if ($r52 != null) {
            Context $r102 = requireContext();
            Log_OC.loadImage($r102, "requireContext()");
            ContextExtKt.toast$default($r102, $r52, 0, 2, (Object) null);
        }
        Integer $r86 = $r7.getDate();
        if ($r86 != null) {
            int $i06 = $r86.intValue();
            InterfaceC8209a $r28 = requireBinding();
            CustomerDetailsIssueFragmentBinding $r38 = (CustomerDetailsIssueFragmentBinding) $r28;
            KudiInputField $r95 = $r38.dateOfTransactionView;
            $r95.setError(getString($i06));
        }
        Integer $r87 = $r7.getAmount();
        if ($r87 == null) {
            return;
        }
        int $i07 = $r87.intValue();
        InterfaceC8209a $r29 = requireBinding();
        CustomerDetailsIssueFragmentBinding $r39 = (CustomerDetailsIssueFragmentBinding) $r29;
        KudiNairaInputField $r11 = $r39.amountView;
        $r11.setError(getString($i07));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        CustomerDetailsIssueViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public CustomerDetailsIssueViewModel createViewModel() {
        CustomerDetailsIssueViewModel $r1 = getCustomerDetailsIssueViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final CustomerDetailsIssueViewModel getCustomerDetailsIssueViewModel() {
        CustomerDetailsIssueViewModel $r1 = this.customerDetailsIssueViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("customerDetailsIssueViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return CustomerDetailsIssueViewModel.class;
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
        Bundle $r1 = getArguments();
        if ($r1 != null) {
            Parcelable $r2 = $r1.getParcelable(ISSUE_DATA);
            IssueTypeModel $r3 = (IssueTypeModel) $r2;
            this.issueTypeModel = $r3;
            boolean $z0 = $r1.getBoolean(IS_FROM_CHARGE_BACK_DIALOG);
            this.isFromChargeBackDialog = $z0;
        }
        setHasOptionsMenu(true);
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
        CustomerDetailsIssueFragmentBinding $r4 = CustomerDetailsIssueFragmentBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        FavoritesArrayAdapter $r1 = this.accountNumberListener;
        if ($r1 == null) {
            return;
        }
        $r1.backup();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity $r3 = getActivity();
        if ($r3 == null) {
            NullPointerException $r6 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.issues.ui.IssueActivity");
            throw $r6;
        }
        IssueActivity $r4 = (IssueActivity) $r3;
        int $i0 = C0214R.string.customer_details;
        String $r5 = getString($i0);
        Log_OC.loadImage($r5, "getString(R.string.customer_details)");
        $r4.setTitle($r5);
        setUpViews();
    }

    public final void setCustomerDetailsIssueViewModel(CustomerDetailsIssueViewModel customerDetailsIssueViewModel) {
        Log_OC.getArray(customerDetailsIssueViewModel, "<set-?>");
        this.customerDetailsIssueViewModel = customerDetailsIssueViewModel;
    }
}

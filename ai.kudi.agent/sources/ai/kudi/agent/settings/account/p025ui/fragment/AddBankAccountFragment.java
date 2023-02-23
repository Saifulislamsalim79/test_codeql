package ai.kudi.agent.settings.account.p025ui.fragment;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.banks.p001ui.BanksFragment;
import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.domain.room_entities.Bank;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.EditTextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.FragmentAddBankAcctBinding;
import ai.kudi.agent.settings.account.ConstantsKt;
import ai.kudi.agent.settings.account.p025ui.activity.BankAccountActivity;
import ai.kudi.agent.settings.account.p025ui.data.AddBankAccountViewData;
import ai.kudi.agent.settings.account.p025ui.viewModel.AddBankAccountViewModel;
import ai.kudi.agent.settings.account.xpp3.BankAccountSubcomponent;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.C11810u;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p450e0.Object;
/* compiled from: AddBankAccountFragment.kt */
@Metadata(m10422d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 #2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0014J\b\u0010\u0012\u001a\u00020\u0002H\u0014J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0017J\b\u0010\"\u001a\u00020\u0010H\u0002R\u001e\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, m10421d2 = {"Lai/kudi/agent/settings/account/ui/fragment/AddBankAccountFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/settings/account/ui/viewModel/AddBankAccountViewModel;", "Lai/kudi/agent/settings/account/ui/data/AddBankAccountViewData;", "Lai/kudi/agent/databinding/FragmentAddBankAcctBinding;", "()V", "addBankAcctViewModel", "getAddBankAcctViewModel", "()Lai/kudi/agent/settings/account/ui/viewModel/AddBankAccountViewModel;", "setAddBankAcctViewModel", "(Lai/kudi/agent/settings/account/ui/viewModel/AddBankAccountViewModel;)V", "bankAccountActivity", "Lai/kudi/agent/settings/account/ui/activity/BankAccountActivity;", "selectedBank", "Lai/kudi/agent/core/domain/room_entities/Bank;", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showBankOptions", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.account.ui.fragment.AddBankAccountFragment */
/* loaded from: classes.dex */
public final class AddBankAccountFragment extends BaseMVVMViewBindingFragment<AddBankAccountViewModel, AddBankAccountViewData, FragmentAddBankAcctBinding> {
    public static final Companion Companion;
    public static final String KEY_ACCOUNT_TYPE = "key_account_type";
    public AddBankAccountViewModel addBankAcctViewModel;
    private BankAccountActivity bankAccountActivity;
    private Bank selectedBank;

    /* compiled from: AddBankAccountFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/settings/account/ui/fragment/AddBankAccountFragment$Companion;", "", "()V", "KEY_ACCOUNT_TYPE", "", "newInstance", "Lai/kudi/agent/settings/account/ui/fragment/AddBankAccountFragment;", BankAccountFragmentKt.ACCT_TYPE, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.account.ui.fragment.AddBankAccountFragment$Companion */
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
        public final AddBankAccountFragment newInstance(String str) {
            Log_OC.getArray(str, BankAccountFragmentKt.ACCT_TYPE);
            AddBankAccountFragment $r3 = new AddBankAccountFragment();
            Bundle $r1 = new Bundle();
            $r1.putString(AddBankAccountFragment.KEY_ACCOUNT_TYPE, str);
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
    public static final AddBankAccountFragment newInstance(String str) {
        Companion $r0 = Companion;
        AddBankAccountFragment $r1 = $r0.newInstance(str);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-11$lambda-10  reason: not valid java name */
    public static final void m40678onViewCreated$lambda11$lambda10(Throwable th) {
        th.printStackTrace();
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-11$lambda-6  reason: not valid java name */
    public static final void m40679onViewCreated$lambda11$lambda6(AddBankAccountFragment addBankAccountFragment, FragmentAddBankAcctBinding fragmentAddBankAcctBinding, String str, View view) {
        Log_OC.getArray(addBankAccountFragment, "this$0");
        Log_OC.getArray(fragmentAddBankAcctBinding, "$this_apply");
        Log_OC.getArray(str, "$accountPurpose");
        AddBankAccountViewModel $r4 = addBankAccountFragment.getAddBankAcctViewModel();
        TextView $r5 = fragmentAddBankAcctBinding.accountName;
        CharSequence $r6 = $r5.getText();
        String $r7 = $r6.toString();
        KudiInputField $r8 = fragmentAddBankAcctBinding.acctNoView;
        String $r9 = $r8.getText();
        KudiInputField $r82 = fragmentAddBankAcctBinding.selectedBankView;
        String $r10 = $r82.getText();
        Bank $r11 = addBankAccountFragment.selectedBank;
        String $r12 = $r11 == null ? null : $r11.getBankCode();
        if ($r12 == null) {
            $r12 = "";
        }
        $r4.addAccount($r7, $r9, $r10, $r12, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-11$lambda-8$lambda-7  reason: not valid java name */
    public static final void m40680onViewCreated$lambda11$lambda8$lambda7(AddBankAccountFragment addBankAccountFragment, View view) {
        Log_OC.getArray(addBankAccountFragment, "this$0");
        addBankAccountFragment.showBankOptions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-11$lambda-9  reason: not valid java name */
    public static final void m40681onViewCreated$lambda11$lambda9(FragmentAddBankAcctBinding fragmentAddBankAcctBinding, AddBankAccountFragment addBankAccountFragment, C11810u c11810u, CharSequence charSequence) {
        Log_OC.getArray(fragmentAddBankAcctBinding, "$this_apply");
        Log_OC.getArray(addBankAccountFragment, "this$0");
        Log_OC.getArray(c11810u, "$redoAcctLookUp");
        KudiInputField $r4 = fragmentAddBankAcctBinding.acctNoView;
        String $r5 = $r4.getText();
        int $i0 = $r5.length();
        if ($i0 < 10) {
            AddBankAccountViewModel $r6 = addBankAccountFragment.getAddBankAcctViewModel();
            $r6.disposeLookUpProcess();
            c11810u.f26497c = true;
            return;
        }
        KudiInputField $r42 = fragmentAddBankAcctBinding.acctNoView;
        String $r52 = $r42.getText();
        int $i02 = $r52.length();
        if ($i02 == 10) {
            Bank $r7 = addBankAccountFragment.selectedBank;
            if ($r7 != null) {
                boolean $z0 = c11810u.f26497c;
                if ($z0) {
                    AddBankAccountViewModel $r62 = addBankAccountFragment.getAddBankAcctViewModel();
                    KudiInputField $r43 = fragmentAddBankAcctBinding.acctNoView;
                    String $r53 = $r43.getText();
                    Bank $r72 = addBankAccountFragment.selectedBank;
                    $r62.performAcctNameLookup($r53, $r72);
                }
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showBankOptions() {
        BanksFragment.Companion $r1 = BanksFragment.Companion;
        Bank $r2 = this.selectedBank;
        String $r3 = $r2 == null ? null : $r2.getBankCode();
        BanksFragment $r4 = $r1.newInstance($r3);
        AddBankAccountFragment$showBankOptions$1 $r5 = new AddBankAccountFragment$showBankOptions$1($r4, this);
        $r4.setOnBankSelectedListener($r5);
        FragmentManager $r6 = getChildFragmentManager();
        String $r32 = BanksFragment.class.getCanonicalName();
        $r4.show($r6, $r32);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        AddBankAccountViewData $r2 = (AddBankAccountViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(AddBankAccountViewData addBankAccountViewData) {
        Log_OC.getArray(addBankAccountViewData, "viewData");
        InterfaceC8209a $r2 = requireBinding();
        FragmentAddBankAcctBinding $r3 = (FragmentAddBankAcctBinding) $r2;
        boolean $z0 = addBankAccountViewData.getCloseScreen();
        if ($z0) {
            FragmentActivity $r4 = getActivity();
            if ($r4 == null) {
                NullPointerException $r6 = new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                throw $r6;
            }
            AppCompatActivity $r5 = (AppCompatActivity) $r4;
            $r5.onBackPressed();
            return;
        }
        boolean $z02 = addBankAccountViewData.isAdding();
        if ($z02) {
            KudiButton $r7 = $r3.saveBankAccountView;
            $r7.m38032f();
        } else {
            KudiButton $r72 = $r3.saveBankAccountView;
            $r72.m38033e();
        }
        boolean $z03 = addBankAccountViewData.isPerformingAcctNameLookUp();
        if ($z03) {
            TextView $r8 = $r3.nameErrorView;
            Log_OC.loadImage($r8, "nameErrorView");
            ViewExtKt.hide$default($r8, false, 1, null);
            ProgressBar $r9 = $r3.acctNameLoadingProgress;
            Log_OC.loadImage($r9, "acctNameLoadingProgress");
            ViewExtKt.show($r9);
        } else {
            TextView $r82 = $r3.nameErrorView;
            Log_OC.loadImage($r82, "nameErrorView");
            ViewExtKt.hide$default($r82, false, 1, null);
            ProgressBar $r92 = $r3.acctNameLoadingProgress;
            Log_OC.loadImage($r92, "acctNameLoadingProgress");
            ViewExtKt.hide$default($r92, false, 1, null);
        }
        String $r10 = addBankAccountViewData.getAcctName();
        if ($r10 != null) {
            $r3.accountName.setText($r10);
        }
        AddBankAccountViewData.Error $r11 = addBankAccountViewData.getError();
        if ($r11 == null) {
            return;
        }
        KudiInputField $r12 = $r3.acctNoView;
        $r12.setError($r11.getAccountNumber());
        KudiInputField $r122 = $r3.selectedBankView;
        $r122.setError($r11.getBank());
        String $r102 = $r11.getAccountNameLookupError();
        TextView $r83 = $r3.nameErrorView;
        Log_OC.loadImage($r83, "nameErrorView");
        ViewExtKt.show($r83);
        $r3.nameErrorView.setText($r102);
        if ($r11.getMessage() == null) {
            return;
        }
        FragmentActivity $r42 = requireActivity();
        Log_OC.loadImage($r42, "requireActivity()");
        ContextExtKt.toast$default($r42, $r11.getMessage(), 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        AddBankAccountViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public AddBankAccountViewModel createViewModel() {
        AddBankAccountViewModel $r1 = getAddBankAcctViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AddBankAccountViewModel getAddBankAcctViewModel() {
        AddBankAccountViewModel $r1 = this.addBankAcctViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("addBankAcctViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return AddBankAccountViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        boolean $z0 = context instanceof BankAccountActivity;
        if ($z0) {
            this.bankAccountActivity = (BankAccountActivity) context;
        }
        BankAccountActivity $r3 = this.bankAccountActivity;
        if ($r3 != null) {
            BankAccountSubcomponent $r1 = $r3.getBankAccountSubcomponent();
            $r1.inject(this);
            return;
        }
        Log_OC.LogError("bankAccountActivity");
        NullPointerException r4 = new NullPointerException("Null throw statement replaced by Soot");
        throw r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentAddBankAcctBinding $r4 = FragmentAddBankAcctBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String $r7;
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity $r3 = getActivity();
        if ($r3 == null) {
            NullPointerException r24 = new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            throw r24;
        }
        AppCompatActivity $r4 = (AppCompatActivity) $r3;
        AbstractC0925a $r5 = $r4.getSupportActionBar();
        if ($r5 != null) {
            $r5.mo37629E();
        }
        final C11810u r20 = new C11810u();
        r20.f26497c = true;
        Bundle $r2 = requireArguments();
        final String $r72 = $r2.getString(KEY_ACCOUNT_TYPE);
        Log_OC.append($r72);
        Log_OC.loadImage($r72, "requireArguments().getString(KEY_ACCOUNT_TYPE)!!");
        InterfaceC8209a $r8 = requireBinding();
        final FragmentAddBankAcctBinding $r9 = (FragmentAddBankAcctBinding) $r8;
        ViewGroup $r10 = $r9.saveBankAccountView;
        ViewGroup r25 = $r10;
        r25.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.account.ui.fragment.e
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AddBankAccountFragment $r22 = AddBankAccountFragment.this;
                FragmentAddBankAcctBinding $r32 = $r9;
                String $r42 = $r72;
                AddBankAccountFragment.m40679onViewCreated$lambda11$lambda6($r22, $r32, $r42, view2);
            }
        });
        KudiInputField $r12 = $r9.selectedBankView;
        EditText $r13 = $r12.getEditText();
        $r13.setFocusable(false);
        $r13.setClickable(true);
        $r13.setLongClickable(false);
        $r13.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.account.ui.fragment.AboutFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AddBankAccountFragment $r22 = AddBankAccountFragment.this;
                AddBankAccountFragment.m40680onViewCreated$lambda11$lambda8$lambda7($r22, view2);
            }
        });
        KudiInputField $r122 = $r9.acctNoView;
        AbstractC11688p $r15 = EditTextExtKt.getTextChanges($r122.getEditText());
        Object object = new Object() { // from class: ai.kudi.agent.settings.account.ui.fragment.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                FragmentAddBankAcctBinding $r1 = FragmentAddBankAcctBinding.this;
                AddBankAccountFragment $r22 = this;
                C11810u $r32 = r20;
                CharSequence $r52 = (CharSequence) obj;
                AddBankAccountFragment.m40681onViewCreated$lambda11$lambda9($r1, $r22, $r32, $r52);
            }
        };
        Logger $r17 = Logger.log;
        $r15.e0(object, $r17);
        boolean $z0 = Log_OC.append($r72, ConstantsKt.ACCOUNT_TYPE_CASHOUT);
        if ($z0) {
            BankAccountActivity $r18 = this.bankAccountActivity;
            if ($r18 == null) {
                Log_OC.LogError("bankAccountActivity");
                NullPointerException $r19 = new NullPointerException("Null throw statement replaced by Soot");
                throw $r19;
            }
            $r7 = $r18.getString(C0001R.string.text_cashout_account);
        } else {
            BankAccountActivity $r182 = this.bankAccountActivity;
            if ($r182 == null) {
                Log_OC.LogError("bankAccountActivity");
                NullPointerException $r192 = new NullPointerException("Null throw statement replaced by Soot");
                throw $r192;
            }
            $r7 = $r182.getString(C0001R.string.text_wallet_funding_account);
        }
        Log_OC.loadImage($r7, "if (accountPurpose == ACCOUNT_TYPE_CASHOUT) {\n                bankAccountActivity.getString(R.string.text_cashout_account)\n            } else {\n                bankAccountActivity.getString(R.string.text_wallet_funding_account)\n            }");
        BankAccountActivity $r183 = this.bankAccountActivity;
        if ($r183 != null) {
            $r183.setToolbarTitle($r7);
            return;
        }
        Log_OC.LogError("bankAccountActivity");
        NullPointerException $r193 = new NullPointerException("Null throw statement replaced by Soot");
        throw $r193;
    }

    public final void setAddBankAcctViewModel(AddBankAccountViewModel addBankAccountViewModel) {
        Log_OC.getArray(addBankAccountViewModel, "<set-?>");
        this.addBankAcctViewModel = addBankAccountViewModel;
    }
}

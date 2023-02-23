package ai.kudi.agent.savings.p024ui;

import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.savings.C0456R;
import ai.kudi.agent.savings.adapter.SavingsPlanAdapter;
import ai.kudi.agent.savings.data.model.CreateSavingsModel;
import ai.kudi.agent.savings.data.model.SavingsRequest;
import ai.kudi.agent.savings.data.model.UpdateSavingPlanRequest;
import ai.kudi.agent.savings.data.model.WithdrawRequest;
import ai.kudi.agent.savings.data.viewdata.CreateSavingPinViewData;
import ai.kudi.agent.savings.databinding.CreateSavingPinFragmentBinding;
import ai.kudi.agent.savings.viewmodel.CreateSavingPinViewModel;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.p058os.C1372b;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import androidx.lifecycle.PreferenceActivity;
import dagger.android.p197e.C7429a;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: CreateSavingPinFragment.kt */
@Metadata(m10422d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 )2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001)B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0014J\b\u0010\u0014\u001a\u00020\u0002H\u0014J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0012H\u0002J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J$\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u001f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u000e\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020(R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, m10421d2 = {"Lai/kudi/agent/savings/ui/CreateSavingPinFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/savings/viewmodel/CreateSavingPinViewModel;", "Lai/kudi/agent/savings/data/viewdata/CreateSavingPinViewData;", "Lai/kudi/agent/savings/databinding/CreateSavingPinFragmentBinding;", "()V", "savingsModel", "Lai/kudi/agent/savings/data/model/CreateSavingsModel;", "updateSavingPlanRequest", "Lai/kudi/agent/savings/data/model/UpdateSavingPlanRequest;", "viewModel", "getViewModel", "()Lai/kudi/agent/savings/viewmodel/CreateSavingPinViewModel;", "setViewModel", "(Lai/kudi/agent/savings/viewmodel/CreateSavingPinViewModel;)V", "withDrawRequest", "Lai/kudi/agent/savings/data/model/WithdrawRequest;", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "launchPinDialog", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setTitle", "titleId", "", "Companion", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.savings.ui.CreateSavingPinFragment */
/* loaded from: classes.dex */
public final class CreateSavingPinFragment extends BaseMVVMViewBindingFragment<CreateSavingPinViewModel, CreateSavingPinViewData, CreateSavingPinFragmentBinding> {
    public static final Companion Companion;
    private static final String DEACTIVATE_KEY = "deactivate";
    private static final String SAVINGS_KEY = "savings";
    private static final String WITHDRAW_KEY = "withdraw";
    private CreateSavingsModel savingsModel;
    private UpdateSavingPlanRequest updateSavingPlanRequest;
    public CreateSavingPinViewModel viewModel;
    private WithdrawRequest withDrawRequest;

    /* compiled from: CreateSavingPinFragment.kt */
    @Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/savings/ui/CreateSavingPinFragment$Companion;", "", "()V", "DEACTIVATE_KEY", "", "SAVINGS_KEY", "WITHDRAW_KEY", "newInstance", "Lai/kudi/agent/savings/ui/CreateSavingPinFragment;", CreateSavingPinFragment.SAVINGS_KEY, "Lai/kudi/agent/savings/data/model/CreateSavingsModel;", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/savings/data/model/UpdateSavingPlanRequest;", "Lai/kudi/agent/savings/data/model/WithdrawRequest;", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.savings.ui.CreateSavingPinFragment$Companion */
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
        public final CreateSavingPinFragment newInstance(CreateSavingsModel createSavingsModel) {
            Log_OC.getArray(createSavingsModel, CreateSavingPinFragment.SAVINGS_KEY);
            CreateSavingPinFragment $r1 = new CreateSavingPinFragment();
            C13287o $r4 = C13664u.m4227a(CreateSavingPinFragment.SAVINGS_KEY, createSavingsModel);
            C13287o[] $r3 = {$r4};
            Bundle $r5 = C1372b.m36174a($r3);
            $r1.setArguments($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final CreateSavingPinFragment newInstance(UpdateSavingPlanRequest updateSavingPlanRequest) {
            Log_OC.getArray(updateSavingPlanRequest, TransactionRequest.TYPE_REQUEST);
            CreateSavingPinFragment $r2 = new CreateSavingPinFragment();
            C13287o $r4 = C13664u.m4227a(CreateSavingPinFragment.DEACTIVATE_KEY, updateSavingPlanRequest);
            C13287o[] $r3 = {$r4};
            Bundle $r5 = C1372b.m36174a($r3);
            $r2.setArguments($r5);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final CreateSavingPinFragment newInstance(WithdrawRequest withdrawRequest) {
            Log_OC.getArray(withdrawRequest, TransactionRequest.TYPE_REQUEST);
            CreateSavingPinFragment $r2 = new CreateSavingPinFragment();
            C13287o $r4 = C13664u.m4227a(CreateSavingPinFragment.WITHDRAW_KEY, withdrawRequest);
            C13287o[] $r3 = {$r4};
            Bundle $r5 = C1372b.m36174a($r3);
            $r2.setArguments($r5);
            return $r2;
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
    private final void launchPinDialog() {
        FragmentManager $r1 = getChildFragmentManager();
        PreferenceActivity $r2 = getViewLifecycleOwner();
        $r1.p1(KudiPin.KUDI_PIN_AUTH_SUCCESS_KEY, $r2, new InterfaceC1523w() { // from class: ai.kudi.agent.savings.ui.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.fragment.app.InterfaceC1523w
            /* renamed from: a */
            public final void mo35611a(String str, Bundle bundle) {
                CreateSavingPinFragment $r3 = CreateSavingPinFragment.this;
                CreateSavingPinFragment.m40521launchPinDialog$lambda4($r3, str, bundle);
            }
        });
        KudiPin.Companion $r4 = KudiPin.Companion;
        int $i0 = C0456R.string.confirm_saving_pin_title;
        String $r5 = getString($i0);
        int $i02 = C0456R.string.enter_pin_to_complete_saving_transaction;
        String $r6 = getString($i02);
        KudiPin $r7 = $r4.newInstance($r5, $r6, true);
        FragmentManager $r12 = getChildFragmentManager();
        Chapter r9 = (Chapter) $r7;
        r9.show($r12, ".AuthDialog.Dialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: launchPinDialog$lambda-4  reason: not valid java name */
    public static final void m40521launchPinDialog$lambda4(CreateSavingPinFragment createSavingPinFragment, String str, Bundle bundle) {
        SavingsRequest $r6;
        Integer $r5;
        Log_OC.getArray(createSavingPinFragment, "this$0");
        Log_OC.getArray(str, "requestKey");
        Log_OC.getArray(bundle, "result");
        boolean $z0 = Log_OC.append(str, KudiPin.KUDI_PIN_AUTH_SUCCESS_KEY);
        if ($z0) {
            String $r1 = bundle.getString(KudiPin.PASSWORD_KEY);
            CreateSavingsModel $r3 = createSavingPinFragment.savingsModel;
            CreateSavingsModel $r4 = null;
            if ($r3 != null) {
                if ($r1 == null) {
                    $r5 = null;
                } else {
                    int $i0 = Integer.parseInt($r1);
                    $r5 = Integer.valueOf($i0);
                }
                $r4 = CreateSavingsModel.copy$default($r3, null, null, null, null, null, null, $r5, 63, null);
            }
            if ($r4 == null || ($r6 = $r4.toSavingRequest()) == null) {
                return;
            }
            CreateSavingPinViewModel $r7 = createSavingPinFragment.getViewModel();
            $r7.createSavings($r6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-2$lambda-1  reason: not valid java name */
    public static final void m40522onViewCreated$lambda2$lambda1(CreateSavingPinFragment createSavingPinFragment, CreateSavingPinFragmentBinding createSavingPinFragmentBinding, View view) {
        Log_OC.getArray(createSavingPinFragment, "this$0");
        Log_OC.getArray(createSavingPinFragmentBinding, "$this_apply");
        CreateSavingPinViewModel $r6 = createSavingPinFragment.getViewModel();
        KudiInputField $r7 = createSavingPinFragmentBinding.newPinView;
        String $r8 = $r7.getText();
        KudiInputField $r72 = createSavingPinFragmentBinding.confirmNewPinView;
        String $r9 = $r72.getText();
        CreateSavingsModel $r1 = createSavingPinFragment.savingsModel;
        WithdrawRequest $r2 = createSavingPinFragment.withDrawRequest;
        UpdateSavingPlanRequest $r3 = createSavingPinFragment.updateSavingPlanRequest;
        $r6.validateInput($r8, $r9, $r1, $r2, $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        CreateSavingPinViewData $r2 = (CreateSavingPinViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(CreateSavingPinViewData createSavingPinViewData) {
        Log_OC.getArray(createSavingPinViewData, "viewData");
        boolean $z0 = createSavingPinViewData instanceof CreateSavingPinViewData.Error;
        if ($z0) {
            CreateSavingPinViewData.Error $r2 = (CreateSavingPinViewData.Error) createSavingPinViewData;
            String $r3 = $r2.getError();
            if ($r3 != null) {
                FragmentActivity $r4 = requireActivity();
                Log_OC.loadImage($r4, "requireActivity()");
                ContextExtKt.toast$default($r4, $r3, 0, 2, (Object) null);
            }
            String $r32 = $r2.getPinError();
            if ($r32 != null) {
                InterfaceC8209a $r5 = requireBinding();
                CreateSavingPinFragmentBinding $r6 = (CreateSavingPinFragmentBinding) $r5;
                KudiInputField $r7 = $r6.newPinView;
                $r7.setError($r32);
            }
            String $r33 = $r2.getConfirmPinError();
            if ($r33 == null) {
                return;
            }
            InterfaceC8209a $r52 = requireBinding();
            CreateSavingPinFragmentBinding $r62 = (CreateSavingPinFragmentBinding) $r52;
            KudiInputField $r72 = $r62.confirmNewPinView;
            $r72.setError($r33);
            return;
        }
        boolean $z02 = createSavingPinViewData instanceof CreateSavingPinViewData.ShowProgress;
        if ($z02) {
            CreateSavingPinViewData.ShowProgress $r8 = (CreateSavingPinViewData.ShowProgress) createSavingPinViewData;
            boolean $z03 = $r8.getVisibility();
            if ($z03) {
                InterfaceC8209a $r53 = requireBinding();
                CreateSavingPinFragmentBinding $r63 = (CreateSavingPinFragmentBinding) $r53;
                KudiButton $r9 = $r63.kbSendOtp;
                $r9.m38032f();
                return;
            }
            InterfaceC8209a $r54 = requireBinding();
            CreateSavingPinFragmentBinding $r64 = (CreateSavingPinFragmentBinding) $r54;
            KudiButton $r92 = $r64.kbSendOtp;
            $r92.m38033e();
            return;
        }
        boolean $z04 = createSavingPinViewData instanceof CreateSavingPinViewData.Success;
        if ($z04) {
            launchPinDialog();
            return;
        }
        boolean $z05 = createSavingPinViewData instanceof CreateSavingPinViewData.UserIfo;
        if (!$z05) {
            boolean $z06 = createSavingPinViewData instanceof CreateSavingPinViewData.SavingsCreatedSuccess;
            if ($z06) {
                CreateSavingPinViewModel $r15 = getViewModel();
                $r15.navigateToSavingSuccessDialog();
                return;
            }
            return;
        }
        CreateSavingPinViewData.UserIfo $r10 = (CreateSavingPinViewData.UserIfo) createSavingPinViewData;
        User $r11 = $r10.getUser();
        String $r34 = $r11.getSavingsCategory();
        SavingsPlanAdapter.UserCategory $r12 = SavingsPlanAdapter.UserCategory.NEW_USER;
        String $r13 = $r12.name();
        boolean $z07 = Log_OC.append($r34, $r13);
        if ($z07) {
            int $i0 = C0456R.string.create_savings_pin;
            setTitle($i0);
            return;
        }
        InterfaceC8209a $r55 = requireBinding();
        CreateSavingPinFragmentBinding $r65 = (CreateSavingPinFragmentBinding) $r55;
        TextView $r14 = $r65.tvCreatePinInfo;
        Log_OC.loadImage($r14, "requireBinding().tvCreatePinInfo");
        ViewExtKt.hide$default($r14, false, 1, null);
        int $i02 = C0456R.string.reset_savings_pin;
        setTitle($i02);
        InterfaceC8209a $r56 = requireBinding();
        CreateSavingPinFragmentBinding $r66 = (CreateSavingPinFragmentBinding) $r56;
        KudiButton $r93 = $r66.kbSendOtp;
        $r93.setText("Send OTP");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        CreateSavingPinViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public CreateSavingPinViewModel createViewModel() {
        CreateSavingPinViewModel $r1 = getViewModel();
        return $r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return CreateSavingPinViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public final CreateSavingPinViewModel getViewModel() {
        CreateSavingPinViewModel $r1 = this.viewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("viewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
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
        C13666w $r2;
        super.onCreate(bundle);
        Bundle $r1 = getArguments();
        if ($r1 == null) {
            $r2 = null;
        } else {
            Parcelable $r3 = $r1.getParcelable(SAVINGS_KEY);
            CreateSavingsModel $r4 = (CreateSavingsModel) $r3;
            this.savingsModel = $r4;
            Parcelable $r32 = $r1.getParcelable(WITHDRAW_KEY);
            WithdrawRequest $r5 = (WithdrawRequest) $r32;
            this.withDrawRequest = $r5;
            Parcelable $r33 = $r1.getParcelable(DEACTIVATE_KEY);
            UpdateSavingPlanRequest $r6 = (UpdateSavingPlanRequest) $r33;
            this.updateSavingPlanRequest = $r6;
            $r2 = C13666w.f30112a;
        }
        if ($r2 == null) {
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        CreateSavingPinFragmentBinding $r4 = CreateSavingPinFragmentBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        InterfaceC8209a $r2 = requireBinding();
        final CreateSavingPinFragmentBinding $r5 = (CreateSavingPinFragmentBinding) $r2;
        ViewGroup $r6 = $r5.kbSendOtp;
        ViewGroup r8 = $r6;
        r8.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.savings.ui.l
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CreateSavingPinFragment $r22 = CreateSavingPinFragment.this;
                CreateSavingPinFragmentBinding $r3 = $r5;
                CreateSavingPinFragment.m40522onViewCreated$lambda2$lambda1($r22, $r3, view2);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setTitle(int i) {
        FragmentActivity $r1 = getActivity();
        if ($r1 == null) {
            NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            throw $r5;
        }
        AppCompatActivity $r2 = (AppCompatActivity) $r1;
        AbstractC0925a $r3 = $r2.getSupportActionBar();
        if ($r3 == null) {
            return;
        }
        String $r4 = getString(i);
        $r3.mo37631C($r4);
    }

    public final void setViewModel(CreateSavingPinViewModel createSavingPinViewModel) {
        Log_OC.getArray(createSavingPinViewModel, "<set-?>");
        this.viewModel = createSavingPinViewModel;
    }
}

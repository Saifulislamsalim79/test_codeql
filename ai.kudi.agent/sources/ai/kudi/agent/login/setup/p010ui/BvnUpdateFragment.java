package ai.kudi.agent.login.setup.p010ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.databinding.FragmentBvnUpdateBinding;
import ai.kudi.agent.login.game.components.DeviceVerificationSubcomponent;
import ai.kudi.agent.login.setup.p010ui.AccountVerificationHolderActivity;
import ai.kudi.agent.login.setup.p010ui.EnforceBvnVerificationFragment;
import ai.kudi.agent.login.setup.presenters.EnforceBvnVerificationViewModel;
import ai.kudi.agent.login.setup.viewModels.data.BvnUpdateViewData;
import ai.kudi.agent.login.setup.viewModels.data.EnforceBvnVerificationData;
import ai.kudi.agent.register.domain.wiki.UpdateBvnModel;
import ai.kudi.agent.register.p022v2.p023ui.WhyWeCollectBvnBottomSheet;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p493j0.InterfaceC11863b;
import p201g.p270x.InterfaceC8209a;
/* compiled from: BvnUpdateFragment.kt */
@Metadata(m10422d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 &2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003H\u0014J\b\u0010\u0010\u001a\u00020\u0002H\u0014J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u000eH\u0002J\u0012\u0010\u001a\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010%\u001a\u00020\u000eH\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006'"}, m10421d2 = {"Lai/kudi/agent/login/setup/ui/BvnUpdateFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/login/setup/presenters/EnforceBvnVerificationViewModel;", "Lai/kudi/agent/login/setup/viewModels/data/BvnUpdateViewData;", "Lai/kudi/agent/databinding/FragmentBvnUpdateBinding;", "()V", "loginAttemptId", "", "viewModel", "getViewModel", "()Lai/kudi/agent/login/setup/presenters/EnforceBvnVerificationViewModel;", "setViewModel", "(Lai/kudi/agent/login/setup/presenters/EnforceBvnVerificationViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "goToEnforceBvnFragment", TransactionBreakDownItemType.DATA, "Lai/kudi/agent/login/setup/viewModels/data/EnforceBvnVerificationData;", "onAttach", "context", "Landroid/content/Context;", "onContinueClicked", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "updateView", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.login.setup.ui.BvnUpdateFragment */
/* loaded from: classes.dex */
public final class BvnUpdateFragment extends BaseMVVMViewBindingFragment<EnforceBvnVerificationViewModel, BvnUpdateViewData, FragmentBvnUpdateBinding> {
    public static final Companion Companion;
    private static final String TAG;
    private String loginAttemptId;
    public EnforceBvnVerificationViewModel viewModel;

    /* compiled from: BvnUpdateFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/login/setup/ui/BvnUpdateFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "newInstance", "Lai/kudi/agent/login/setup/ui/BvnUpdateFragment;", "loginAttemptId", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.login.setup.ui.BvnUpdateFragment$Companion */
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
        public final String getTAG() {
            String $r1 = BvnUpdateFragment.TAG;
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final BvnUpdateFragment newInstance(String str) {
            Log_OC.getArray(str, "loginAttemptId");
            BvnUpdateFragment $r4 = new BvnUpdateFragment();
            Bundle $r1 = new Bundle();
            AccountVerificationHolderActivity.Companion $r5 = AccountVerificationHolderActivity.Companion;
            String $r2 = $r5.getACCOUNT_HOLDER_EXTRA();
            $r1.putString($r2, str);
            C13666w c13666w = C13666w.f30112a;
            $r4.setArguments($r1);
            return $r4;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
        InterfaceC11863b $r1 = C11813x.m10316b(BvnUpdateFragment.class);
        String $r2 = $r1.mo10139g();
        TAG = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void goToEnforceBvnFragment(EnforceBvnVerificationData enforceBvnVerificationData) {
        FragmentActivity $r2 = requireActivity();
        AccountVerificationHolderActivity $r3 = (AccountVerificationHolderActivity) $r2;
        EnforceBvnVerificationFragment.Companion $r4 = EnforceBvnVerificationFragment.Companion;
        EnforceBvnVerificationFragment $r5 = $r4.newInstance(enforceBvnVerificationData);
        AppCompatActivity r6 = (AppCompatActivity) $r3;
        AppCompatActivityExtKt.startFragment$default(r6, $r5, C0001R.C0003id.container, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onContinueClicked() {
        EnforceBvnVerificationViewModel $r1 = getViewModel();
        String $r2 = this.loginAttemptId;
        if ($r2 == null) {
            $r2 = "";
        }
        InterfaceC8209a $r3 = requireBinding();
        FragmentBvnUpdateBinding $r4 = (FragmentBvnUpdateBinding) $r3;
        KudiInputField $r5 = $r4.bvnInputField;
        String $r6 = $r5.getText();
        $r1.verifyId($r2, $r6);
        ContextExtKt.hideKeyboard(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void updateView() {
        InterfaceC8209a $r1 = requireBinding();
        final FragmentBvnUpdateBinding $r2 = (FragmentBvnUpdateBinding) $r1;
        TextView $r3 = $r2.toolbarTitle;
        String $r4 = getString(C0001R.string.verify_bvn);
        $r3.setText($r4);
        KudiButton $r5 = $r2.verifyButton;
        $r5.m38035c();
        KudiInputField $r6 = $r2.bvnInputField;
        Log_OC.loadImage($r6, "");
        KudiInputField r17 = $r6;
        ViewExtKt.show(r17);
        EditText $r7 = $r6.getInputEditText();
        $r7.addTextChangedListener(new TextWatcher() { // from class: ai.kudi.agent.login.setup.ui.BvnUpdateFragment$updateView$lambda-6$lambda-2$$inlined$doOnTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                boolean $z0 = false;
                if (charSequence != null) {
                    int $i1 = charSequence.length();
                    if ($i1 == 11) {
                        $z0 = true;
                    }
                }
                if ($z0) {
                    FragmentBvnUpdateBinding $r22 = FragmentBvnUpdateBinding.this;
                    KudiButton $r32 = $r22.verifyButton;
                    $r32.m38034d();
                    return;
                }
                FragmentBvnUpdateBinding $r23 = FragmentBvnUpdateBinding.this;
                KudiButton $r33 = $r23.verifyButton;
                $r33.m38035c();
            }
        });
        ImageView $r9 = $r2.backIcon;
        $r9.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.login.setup.ui.NumberPicker
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BvnUpdateFragment $r22 = BvnUpdateFragment.this;
                BvnUpdateFragment.m39768updateView$lambda6$lambda3($r22, view);
            }
        });
        TextView $r32 = $r2.learnMore;
        Log_OC.loadImage($r32, "learnMore");
        ViewExtKt.show($r32);
        ViewGroup $r52 = $r2.verifyButton;
        ViewGroup r18 = $r52;
        r18.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.login.setup.ui.a
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BvnUpdateFragment $r22 = BvnUpdateFragment.this;
                BvnUpdateFragment.m39769updateView$lambda6$lambda4($r22, view);
            }
        });
        TextView $r33 = $r2.learnMore;
        $r33.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.login.setup.ui.Switch
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BvnUpdateFragment $r22 = BvnUpdateFragment.this;
                BvnUpdateFragment.m39770updateView$lambda6$lambda5($r22, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: updateView$lambda-6$lambda-3  reason: not valid java name */
    public static final void m39768updateView$lambda6$lambda3(BvnUpdateFragment bvnUpdateFragment, View view) {
        Log_OC.getArray(bvnUpdateFragment, "this$0");
        FragmentActivity $r0 = bvnUpdateFragment.requireActivity();
        $r0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateView$lambda-6$lambda-4  reason: not valid java name */
    public static final void m39769updateView$lambda6$lambda4(BvnUpdateFragment bvnUpdateFragment, View view) {
        Log_OC.getArray(bvnUpdateFragment, "this$0");
        bvnUpdateFragment.onContinueClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: updateView$lambda-6$lambda-5  reason: not valid java name */
    public static final void m39770updateView$lambda6$lambda5(BvnUpdateFragment bvnUpdateFragment, View view) {
        Log_OC.getArray(bvnUpdateFragment, "this$0");
        WhyWeCollectBvnBottomSheet r6 = new WhyWeCollectBvnBottomSheet();
        FragmentManager $r3 = bvnUpdateFragment.getChildFragmentManager();
        String $r5 = WhyWeCollectBvnBottomSheet.class.getCanonicalName();
        Chapter r7 = (Chapter) r6;
        r7.show($r3, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        BvnUpdateViewData $r2 = (BvnUpdateViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(BvnUpdateViewData bvnUpdateViewData) {
        Log_OC.getArray(bvnUpdateViewData, "viewData");
        boolean $z0 = bvnUpdateViewData.isLoading();
        if ($z0) {
            InterfaceC8209a $r2 = requireBinding();
            FragmentBvnUpdateBinding $r3 = (FragmentBvnUpdateBinding) $r2;
            KudiButton $r4 = $r3.verifyButton;
            $r4.m38032f();
        } else {
            InterfaceC8209a $r22 = requireBinding();
            FragmentBvnUpdateBinding $r32 = (FragmentBvnUpdateBinding) $r22;
            KudiButton $r42 = $r32.verifyButton;
            $r42.m38033e();
        }
        UpdateBvnModel $r5 = bvnUpdateViewData.getBvnUpdateData();
        if ($r5 != null) {
            InterfaceC8209a $r23 = requireBinding();
            FragmentBvnUpdateBinding $r33 = (FragmentBvnUpdateBinding) $r23;
            KudiButton $r43 = $r33.verifyButton;
            $r43.m38033e();
            Integer $r7 = Integer.valueOf((int) C0001R.C0002drawable.ic_follow);
            String $r8 = getString(C0001R.string.verified_message);
            String $r9 = getString(C0001R.string.close);
            EnforceBvnVerificationData $r6 = new EnforceBvnVerificationData($r7, null, $r8, $r9, EnforceBvnVerificationFragment.BUTTON_SUCCESS_VALUE, null, 32, null);
            goToEnforceBvnFragment($r6);
        }
        String $r82 = bvnUpdateViewData.getError();
        if ($r82 == null) {
            return;
        }
        InterfaceC8209a $r24 = requireBinding();
        FragmentBvnUpdateBinding $r34 = (FragmentBvnUpdateBinding) $r24;
        KudiButton $r44 = $r34.verifyButton;
        $r44.m38033e();
        Integer $r72 = Integer.valueOf((int) C0001R.C0002drawable.ic_bvn_verification_fail);
        String $r83 = getString(C0001R.string.kyc_upgrade_failed_message_title);
        String $r92 = getString(C0001R.string.invalid_provided_bvn);
        String $r10 = getString(C0001R.string.try_again);
        String $r11 = this.loginAttemptId;
        EnforceBvnVerificationData $r62 = new EnforceBvnVerificationData($r72, $r83, $r92, $r10, EnforceBvnVerificationFragment.BUTTON_ERROR_VALUE, $r11);
        goToEnforceBvnFragment($r62);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        EnforceBvnVerificationViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public EnforceBvnVerificationViewModel createViewModel() {
        EnforceBvnVerificationViewModel $r1 = getViewModel();
        return $r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return EnforceBvnVerificationViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public final EnforceBvnVerificationViewModel getViewModel() {
        EnforceBvnVerificationViewModel $r1 = this.viewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("viewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        boolean $z0 = context instanceof AccountVerificationHolderActivity;
        if ($z0) {
            AccountVerificationHolderActivity $r3 = (AccountVerificationHolderActivity) context;
            DeviceVerificationSubcomponent $r1 = $r3.getDeviceVerificationSubComponent();
            $r1.inject(this);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle $r1 = getArguments();
        if ($r1 == null) {
            return;
        }
        AccountVerificationHolderActivity.Companion $r2 = AccountVerificationHolderActivity.Companion;
        String $r3 = $r2.getACCOUNT_HOLDER_EXTRA();
        this.loginAttemptId = $r1.getString($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentBvnUpdateBinding $r4 = FragmentBvnUpdateBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        updateView();
    }

    public final void setViewModel(EnforceBvnVerificationViewModel enforceBvnVerificationViewModel) {
        Log_OC.getArray(enforceBvnVerificationViewModel, "<set-?>");
        this.viewModel = enforceBvnVerificationViewModel;
    }
}

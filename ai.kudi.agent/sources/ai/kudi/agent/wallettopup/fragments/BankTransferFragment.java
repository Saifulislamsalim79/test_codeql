package ai.kudi.agent.wallettopup.fragments;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.databinding.EmptyHistoryBinding;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.FragmentBankTransferBinding;
import ai.kudi.agent.settings.account.p025ui.activity.BankAccountActivity;
import ai.kudi.agent.wallettopup.WalletTopUpActivity;
import ai.kudi.agent.wallettopup.adapters.KtaAccoutsAdapter;
import ai.kudi.agent.wallettopup.data.MonnifyDetails;
import ai.kudi.agent.wallettopup.data.PaymentMethodsViewData;
import ai.kudi.agent.wallettopup.fragments.UssdTopUpBottomSheetFragment;
import ai.kudi.agent.wallettopup.labs.WalletTopupSubcomponent;
import ai.kudi.agent.wallettopup.viewmodels.PaymentMethodViewModel;
import ai.kudi.dip.library.button.KudiButton;
import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: BankTransferFragment.kt */
@Metadata(m10422d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 .2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001.B\u0005¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0003H\u0014J\b\u0010\u001b\u001a\u00020\u0002H\u0014J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u0018H\u0002J\b\u0010\u001f\u001a\u00020\u0018H\u0002J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"H\u0016J$\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u001a\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010-\u001a\u00020\u0018H\u0002R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006/"}, m10421d2 = {"Lai/kudi/agent/wallettopup/fragments/BankTransferFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/wallettopup/viewmodels/PaymentMethodViewModel;", "Lai/kudi/agent/wallettopup/data/PaymentMethodsViewData;", "Lai/kudi/agent/databinding/FragmentBankTransferBinding;", "()V", "ktaAdapter", "Lai/kudi/agent/wallettopup/adapters/KtaAccoutsAdapter;", "getKtaAdapter", "()Lai/kudi/agent/wallettopup/adapters/KtaAccoutsAdapter;", "setKtaAdapter", "(Lai/kudi/agent/wallettopup/adapters/KtaAccoutsAdapter;)V", "monnifyDetails", "Lai/kudi/agent/wallettopup/data/MonnifyDetails;", "getMonnifyDetails", "()Lai/kudi/agent/wallettopup/data/MonnifyDetails;", "setMonnifyDetails", "(Lai/kudi/agent/wallettopup/data/MonnifyDetails;)V", "viewModel", "getViewModel", "()Lai/kudi/agent/wallettopup/viewmodels/PaymentMethodViewModel;", "setViewModel", "(Lai/kudi/agent/wallettopup/viewmodels/PaymentMethodViewModel;)V", "applyMonnifyDetails", "", "applyViewData", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "handleInstructionToggle", "hideLoader", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showLoader", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class BankTransferFragment extends BaseMVVMViewBindingFragment<PaymentMethodViewModel, PaymentMethodsViewData, FragmentBankTransferBinding> {
    private static final String ARGS_MODE = "args_mode";
    public static final Companion Companion;
    private KtaAccoutsAdapter ktaAdapter;
    private MonnifyDetails monnifyDetails;
    public PaymentMethodViewModel viewModel;

    /* compiled from: BankTransferFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/wallettopup/fragments/BankTransferFragment$Companion;", "", "()V", "ARGS_MODE", "", "newInstance", "Lai/kudi/agent/wallettopup/fragments/BankTransferFragment;", WalletTopUpActivity.EXTRA_MODE, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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
        public final BankTransferFragment newInstance(String str) {
            BankTransferFragment $r1 = new BankTransferFragment();
            Bundle $r2 = new Bundle();
            $r2.putString("args_mode", str);
            C13666w c13666w = C13666w.f30112a;
            $r1.setArguments($r2);
            return $r1;
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
    private final void applyMonnifyDetails(final MonnifyDetails monnifyDetails) {
        InterfaceC8209a $r2 = requireBinding();
        FragmentBankTransferBinding $r3 = (FragmentBankTransferBinding) $r2;
        TextView $r4 = $r3.instructionView;
        String $r5 = getString(C0001R.string.bank_transfer_intro);
        Log_OC.loadImage($r5, "getString(R.string.bank_transfer_intro)");
        Spanned $r6 = StringExtKt.getGetSpannedText($r5);
        $r4.setText($r6);
        if (monnifyDetails == null) {
            return;
        }
        KtaAccoutsAdapter $r7 = getKtaAdapter();
        if ($r7 != null) {
            List $r8 = monnifyDetails.getAccount();
            $r7.setData($r8);
        }
        List $r82 = monnifyDetails.getAccount();
        boolean $z0 = $r82.isEmpty();
        if (!$z0) {
            KudiButton $r9 = $r3.payWithUssdButton;
            Log_OC.loadImage($r9, "payWithUssdButton");
            ViewExtKt.show($r9);
        } else {
            View $r92 = $r3.payWithUssdButton;
            Log_OC.loadImage($r92, "payWithUssdButton");
            View r15 = $r92;
            ViewExtKt.hide$default(r15, false, 1, null);
            EmptyHistoryBinding $r10 = $r3.emptyHistoryView;
            View $r11 = $r10.getRoot();
            Log_OC.loadImage($r11, "emptyHistoryView.root");
            View r152 = $r11;
            ViewExtKt.show(r152);
            EmptyHistoryBinding $r102 = $r3.emptyHistoryView;
            TextView $r12 = $r102.emptyHistoryTextView;
            TextView $r42 = $r12;
            $r42.setText(getString(C0001R.string.kta_details_not_found_text));
        }
        ViewGroup r16 = $r3.payWithUssdButton;
        r16.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.wallettopup.fragments.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MonnifyDetails $r22 = MonnifyDetails.this;
                BankTransferFragment $r32 = this;
                BankTransferFragment.m41749applyMonnifyDetails$lambda8$lambda7$lambda6($r22, $r32, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: applyMonnifyDetails$lambda-8$lambda-7$lambda-6  reason: not valid java name */
    public static final void m41749applyMonnifyDetails$lambda8$lambda7$lambda6(MonnifyDetails monnifyDetails, BankTransferFragment bankTransferFragment, View view) {
        Log_OC.getArray(bankTransferFragment, "this$0");
        UssdTopUpBottomSheetFragment.Companion $r3 = UssdTopUpBottomSheetFragment.Companion;
        PaymentMethodViewModel $r4 = bankTransferFragment.getViewModel();
        String $r5 = $r4.getPhoneNumber();
        UssdTopUpBottomSheetFragment $r6 = $r3.newInstance(monnifyDetails, $r5);
        FragmentManager $r7 = bankTransferFragment.getChildFragmentManager();
        String $r52 = UssdTopUpBottomSheetFragment.class.getCanonicalName();
        Chapter r9 = (Chapter) $r6;
        r9.show($r7, $r52);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handleInstructionToggle() {
        InterfaceC8209a $r1 = requireBinding();
        final FragmentBankTransferBinding $r2 = (FragmentBankTransferBinding) $r1;
        TextView $r3 = $r2.instructionTitle;
        $r3.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.wallettopup.fragments.Switch
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FragmentBankTransferBinding $r22 = FragmentBankTransferBinding.this;
                BankTransferFragment.m41750handleInstructionToggle$lambda4$lambda2($r22, view);
            }
        });
        ImageView $r5 = $r2.cancelInstruction;
        $r5.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.wallettopup.fragments.NoteEditor$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FragmentBankTransferBinding $r22 = FragmentBankTransferBinding.this;
                BankTransferFragment.m41751handleInstructionToggle$lambda4$lambda3($r22, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: handleInstructionToggle$lambda-4$lambda-2  reason: not valid java name */
    public static final void m41750handleInstructionToggle$lambda4$lambda2(FragmentBankTransferBinding fragmentBankTransferBinding, View view) {
        Log_OC.getArray(fragmentBankTransferBinding, "$this_apply");
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 < 21) {
            TextView $r4 = fragmentBankTransferBinding.instructionTitle;
            Log_OC.loadImage($r4, "instructionTitle");
            ViewExtKt.hide$default($r4, false, 1, null);
            LinearLayout $r5 = fragmentBankTransferBinding.instructionLayout;
            Log_OC.loadImage($r5, "instructionLayout");
            ViewExtKt.show($r5);
            return;
        }
        ViewGroup $r0 = fragmentBankTransferBinding.instructionTextView;
        ViewGroup r6 = $r0;
        int $i02 = r6.getWidth();
        int $i03 = $i02 / 2;
        ViewGroup $r02 = fragmentBankTransferBinding.instructionTextView;
        ViewGroup r62 = $r02;
        int $i1 = r62.getHeight() / 2;
        double $d0 = $i03;
        double $d1 = $i1;
        float $f0 = (float) Math.hypot($d0, $d1);
        ConstraintLayout $r03 = fragmentBankTransferBinding.instructionTextView;
        Animator $r3 = ViewAnimationUtils.createCircularReveal($r03, $i03, $i1, 0.0f, $f0);
        TextView $r42 = fragmentBankTransferBinding.instructionTitle;
        Log_OC.loadImage($r42, "instructionTitle");
        ViewExtKt.hide$default($r42, false, 1, null);
        LinearLayout $r52 = fragmentBankTransferBinding.instructionLayout;
        Log_OC.loadImage($r52, "instructionLayout");
        ViewExtKt.show($r52);
        $r3.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: handleInstructionToggle$lambda-4$lambda-3  reason: not valid java name */
    public static final void m41751handleInstructionToggle$lambda4$lambda3(FragmentBankTransferBinding fragmentBankTransferBinding, View view) {
        Log_OC.getArray(fragmentBankTransferBinding, "$this_apply");
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 < 21) {
            TextView $r4 = fragmentBankTransferBinding.instructionTitle;
            Log_OC.loadImage($r4, "instructionTitle");
            ViewExtKt.show($r4);
            LinearLayout $r5 = fragmentBankTransferBinding.instructionLayout;
            Log_OC.loadImage($r5, "instructionLayout");
            ViewExtKt.hide$default($r5, false, 1, null);
            return;
        }
        ViewGroup $r0 = fragmentBankTransferBinding.instructionTextView;
        ViewGroup r6 = $r0;
        int $i02 = r6.getWidth();
        int $i03 = $i02 / 2;
        ViewGroup $r02 = fragmentBankTransferBinding.instructionTextView;
        ViewGroup r62 = $r02;
        int $i1 = r62.getHeight() / 2;
        double $d0 = $i03;
        double $d1 = $i1;
        float $f0 = (float) Math.hypot($d0, $d1);
        ConstraintLayout $r03 = fragmentBankTransferBinding.instructionTextView;
        Animator $r3 = ViewAnimationUtils.createCircularReveal($r03, $i03, $i1, 0.0f, $f0);
        TextView $r42 = fragmentBankTransferBinding.instructionTitle;
        Log_OC.loadImage($r42, "instructionTitle");
        ViewExtKt.show($r42);
        LinearLayout $r52 = fragmentBankTransferBinding.instructionLayout;
        Log_OC.loadImage($r52, "instructionLayout");
        ViewExtKt.hide$default($r52, false, 1, null);
        $r3.start();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void hideLoader() {
        boolean $z0 = getActivity() instanceof WalletTopUpActivity;
        if ($z0) {
            FragmentActivity $r1 = getActivity();
            if ($r1 == null) {
                NullPointerException $r3 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.wallettopup.WalletTopUpActivity");
                throw $r3;
            }
            WalletTopUpActivity $r2 = (WalletTopUpActivity) $r1;
            $r2.hideLoading();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-1$lambda-0  reason: not valid java name */
    public static final void m41752onViewCreated$lambda1$lambda0(BankTransferFragment bankTransferFragment, View view) {
        Log_OC.getArray(bankTransferFragment, "this$0");
        Context $r1 = bankTransferFragment.requireContext();
        Intent $r3 = new Intent($r1, BankAccountActivity.class);
        bankTransferFragment.startActivity($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showLoader() {
        boolean $z0 = getActivity() instanceof WalletTopUpActivity;
        if ($z0) {
            FragmentActivity $r1 = getActivity();
            if ($r1 == null) {
                NullPointerException $r3 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.wallettopup.WalletTopUpActivity");
                throw $r3;
            }
            WalletTopUpActivity $r2 = (WalletTopUpActivity) $r1;
            $r2.showLoading();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        PaymentMethodsViewData $r2 = (PaymentMethodsViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(PaymentMethodsViewData paymentMethodsViewData) {
        Log_OC.getArray(paymentMethodsViewData, "viewData");
        PaymentMethodsViewData.Error $r2 = paymentMethodsViewData.getError();
        if ($r2 != null) {
            FragmentActivity $r3 = requireActivity();
            Log_OC.loadImage($r3, "requireActivity()");
            String $r4 = $r2.getGeneralError();
            ContextExtKt.toast$default($r3, $r4, 0, 2, (Object) null);
        }
        boolean $z0 = paymentMethodsViewData.getLoading();
        if ($z0) {
            showLoader();
        } else {
            hideLoader();
        }
        MonnifyDetails $r5 = paymentMethodsViewData.getMonnifyDetails();
        this.monnifyDetails = $r5;
        MonnifyDetails $r52 = paymentMethodsViewData.getMonnifyDetails();
        applyMonnifyDetails($r52);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        PaymentMethodViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public PaymentMethodViewModel createViewModel() {
        PaymentMethodViewModel $r1 = getViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final KtaAccoutsAdapter getKtaAdapter() {
        KtaAccoutsAdapter r1 = this.ktaAdapter;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final MonnifyDetails getMonnifyDetails() {
        MonnifyDetails r1 = this.monnifyDetails;
        return r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return PaymentMethodViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public final PaymentMethodViewModel getViewModel() {
        PaymentMethodViewModel $r1 = this.viewModel;
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
        FragmentActivity $r2 = getActivity();
        if ($r2 == null) {
            NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.wallettopup.WalletTopUpActivity");
            throw $r5;
        }
        WalletTopUpActivity $r3 = (WalletTopUpActivity) $r2;
        WalletTopupSubcomponent $r4 = $r3.getWalletTopupSubcomponent();
        $r4.inject(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentBankTransferBinding $r4 = FragmentBankTransferBinding.inflate(layoutInflater, viewGroup, false);
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
        super.onViewCreated(view, bundle);
        KtaAccoutsAdapter r10 = new KtaAccoutsAdapter();
        this.ktaAdapter = r10;
        PaymentMethodViewModel $r4 = getViewModel();
        $r4.getMonnifyDetails();
        InterfaceC8209a $r5 = requireBinding();
        FragmentBankTransferBinding $r6 = (FragmentBankTransferBinding) $r5;
        ViewGroup $r7 = $r6.instructionTextView;
        ViewGroup r12 = $r7;
        r12.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.wallettopup.fragments.BrowseFragment$3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BankTransferFragment $r2 = BankTransferFragment.this;
                BankTransferFragment.m41752onViewCreated$lambda1$lambda0($r2, view2);
            }
        });
        RecyclerView $r9 = $r6.ktaRecyclerView;
        KtaAccoutsAdapter $r3 = getKtaAdapter();
        $r9.setAdapter($r3);
        handleInstructionToggle();
    }

    public final void setKtaAdapter(KtaAccoutsAdapter ktaAccoutsAdapter) {
        this.ktaAdapter = ktaAccoutsAdapter;
    }

    public final void setMonnifyDetails(MonnifyDetails monnifyDetails) {
        this.monnifyDetails = monnifyDetails;
    }

    public final void setViewModel(PaymentMethodViewModel paymentMethodViewModel) {
        Log_OC.getArray(paymentMethodViewModel, "<set-?>");
        this.viewModel = paymentMethodViewModel;
    }
}

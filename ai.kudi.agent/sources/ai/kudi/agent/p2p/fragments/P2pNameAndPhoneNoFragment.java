package ai.kudi.agent.p2p.fragments;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.EditTextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.FragmentP2pNameAndPhoneNoBinding;
import ai.kudi.agent.p2p.viewmodels.P2pNameAndPhoneNoError;
import ai.kudi.agent.p2p.viewmodels.P2pNameAndPhoneNoViewData;
import ai.kudi.agent.p2p.viewmodels.P2pNameAndPhoneViewModel;
import ai.kudi.agent.transfer.generation.components.MainTransferSubComponent;
import ai.kudi.agent.transfer.p034ui.TransferActivity;
import ai.kudi.agent.users.data.model.LookUpUserRequest;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p450e0.Object;
/* compiled from: P2pNameAndPhoneNoFragment.kt */
@Metadata(m10422d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 $2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0014J\b\u0010\u0012\u001a\u00020\u0002H\u0014J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0010H\u0003J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u001e\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, m10421d2 = {"Lai/kudi/agent/p2p/fragments/P2pNameAndPhoneNoFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/p2p/viewmodels/P2pNameAndPhoneViewModel;", "Lai/kudi/agent/p2p/viewmodels/P2pNameAndPhoneNoViewData;", "Lai/kudi/agent/databinding/FragmentP2pNameAndPhoneNoBinding;", "()V", "p2pNameAndPhoneViewModel", "getP2pNameAndPhoneViewModel", "()Lai/kudi/agent/p2p/viewmodels/P2pNameAndPhoneViewModel;", "setP2pNameAndPhoneViewModel", "(Lai/kudi/agent/p2p/viewmodels/P2pNameAndPhoneViewModel;)V", "recipientPhoneNumber", "", "transferActivity", "Lai/kudi/agent/transfer/ui/TransferActivity;", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "observeEditTextChangesAndPerformLookUp", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class P2pNameAndPhoneNoFragment extends BaseMVVMViewBindingFragment<P2pNameAndPhoneViewModel, P2pNameAndPhoneNoViewData, FragmentP2pNameAndPhoneNoBinding> {
    public static final Companion Companion;
    public P2pNameAndPhoneViewModel p2pNameAndPhoneViewModel;
    private String recipientPhoneNumber;
    private TransferActivity transferActivity;

    /* compiled from: P2pNameAndPhoneNoFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/p2p/fragments/P2pNameAndPhoneNoFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/p2p/fragments/P2pNameAndPhoneNoFragment;", "recipientPhoneNumber", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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
        public static /* synthetic */ P2pNameAndPhoneNoFragment newInstance$default(Companion companion, String $r3, int i, Object obj) {
            int $i0 = i & 1;
            if ($i0 != 0) {
                $r3 = null;
            }
            P2pNameAndPhoneNoFragment $r1 = companion.newInstance($r3);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final P2pNameAndPhoneNoFragment newInstance(String str) {
            P2pNameAndPhoneNoFragment $r1 = new P2pNameAndPhoneNoFragment();
            Bundle $r2 = new Bundle();
            $r2.putString(TransferActivity.RECIPIENT_PHONE_NUMBER, str);
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
    public static final P2pNameAndPhoneNoFragment newInstance(String str) {
        Companion $r0 = Companion;
        P2pNameAndPhoneNoFragment $r1 = $r0.newInstance(str);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void observeEditTextChangesAndPerformLookUp() {
        InterfaceC8209a $r2 = requireBinding();
        final FragmentP2pNameAndPhoneNoBinding $r3 = (FragmentP2pNameAndPhoneNoBinding) $r2;
        KudiInputField $r4 = $r3.p2pRecipientPhoneEditText;
        EditText $r5 = $r4.getEditText();
        AbstractC11688p $r6 = EditTextExtKt.getTextChanges($r5);
        Object object = new Object() { // from class: ai.kudi.agent.p2p.fragments.RxRingBuffer
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                FragmentP2pNameAndPhoneNoBinding $r1 = FragmentP2pNameAndPhoneNoBinding.this;
                P2pNameAndPhoneNoFragment $r22 = this;
                CharSequence $r42 = (CharSequence) obj;
                P2pNameAndPhoneNoFragment.m39989observeEditTextChangesAndPerformLookUp$lambda7$lambda5($r1, $r22, $r42);
            }
        };
        C0359c $r7 = C0359c.f819d;
        $r6.e0(object, $r7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: observeEditTextChangesAndPerformLookUp$lambda-7$lambda-5  reason: not valid java name */
    public static final void m39989observeEditTextChangesAndPerformLookUp$lambda7$lambda5(FragmentP2pNameAndPhoneNoBinding fragmentP2pNameAndPhoneNoBinding, P2pNameAndPhoneNoFragment p2pNameAndPhoneNoFragment, CharSequence charSequence) {
        Log_OC.getArray(fragmentP2pNameAndPhoneNoBinding, "$this_apply");
        Log_OC.getArray(p2pNameAndPhoneNoFragment, "this$0");
        KudiInputField $r3 = fragmentP2pNameAndPhoneNoBinding.p2pRecipientPhoneEditText;
        String $r4 = $r3.getText();
        int $i0 = $r4.length();
        if ($i0 == 11) {
            P2pNameAndPhoneViewModel $r5 = p2pNameAndPhoneNoFragment.getP2pNameAndPhoneViewModel();
            KudiInputField $r32 = fragmentP2pNameAndPhoneNoBinding.p2pRecipientPhoneEditText;
            String $r42 = $r32.getText();
            $r5.checkAccountName($r42);
            return;
        }
        KudiInputField $r33 = fragmentP2pNameAndPhoneNoBinding.p2pRecipientPhoneEditText;
        String $r43 = $r33.getText();
        int $i02 = $r43.length();
        if ($i02 < 11) {
            View $r6 = fragmentP2pNameAndPhoneNoBinding.p2pcontinueButton;
            Log_OC.loadImage($r6, "p2pcontinueButton");
            View r7 = $r6;
            ViewExtKt.hide$default(r7, false, 1, null);
            P2pNameAndPhoneViewModel $r52 = p2pNameAndPhoneNoFragment.getP2pNameAndPhoneViewModel();
            $r52.disposeAccountNameLookUp();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: observeEditTextChangesAndPerformLookUp$lambda-7$lambda-6  reason: not valid java name */
    public static final void m39990observeEditTextChangesAndPerformLookUp$lambda7$lambda6(Throwable th) {
        th.printStackTrace();
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-4$lambda-3  reason: not valid java name */
    public static final void m39991onViewCreated$lambda4$lambda3(P2pNameAndPhoneNoFragment p2pNameAndPhoneNoFragment, FragmentP2pNameAndPhoneNoBinding fragmentP2pNameAndPhoneNoBinding, View view) {
        Log_OC.getArray(p2pNameAndPhoneNoFragment, "this$0");
        Log_OC.getArray(fragmentP2pNameAndPhoneNoBinding, "$this_apply");
        ContextExtKt.hideKeyboard(p2pNameAndPhoneNoFragment);
        TextView $r4 = fragmentP2pNameAndPhoneNoBinding.p2pAccountNameTextView;
        CharSequence $r5 = $r4.getText();
        String $r6 = $r5.toString();
        KudiInputField $r7 = fragmentP2pNameAndPhoneNoBinding.p2pRecipientPhoneEditText;
        String $r8 = $r7.getText();
        KudiInputField $r72 = fragmentP2pNameAndPhoneNoBinding.p2pRemarkEditText;
        String $r9 = $r72.getText();
        String $r10 = $r9;
        int $i0 = $r9.length();
        boolean $z0 = $i0 == 0;
        if ($z0) {
            String $r92 = p2pNameAndPhoneNoFragment.getString(C0001R.string.p2p_transaction);
            $r10 = $r92;
            Log_OC.loadImage($r92, "getString(R.string.p2p_transaction)");
        }
        P2pNameAndPhoneViewModel $r11 = p2pNameAndPhoneNoFragment.getP2pNameAndPhoneViewModel();
        P2pNameAndPhoneNoFragment$onViewCreated$1$2$1 $r1 = new P2pNameAndPhoneNoFragment$onViewCreated$1$2$1(p2pNameAndPhoneNoFragment, $r8, $r10, $r6);
        $r11.checkIfItIsAgentsPhoneNoAndPerformAction($r6, $r8, $r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        P2pNameAndPhoneNoViewData $r2 = (P2pNameAndPhoneNoViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(P2pNameAndPhoneNoViewData p2pNameAndPhoneNoViewData) {
        FragmentActivity $r10;
        FragmentActivity $r102;
        Log_OC.getArray(p2pNameAndPhoneNoViewData, "viewData");
        InterfaceC8209a $r2 = requireBinding();
        FragmentP2pNameAndPhoneNoBinding $r3 = (FragmentP2pNameAndPhoneNoBinding) $r2;
        boolean $z0 = p2pNameAndPhoneNoViewData.isAccountNameLoading();
        if ($z0) {
            ProgressBar $r4 = $r3.p2pAcctNameLoading;
            Log_OC.loadImage($r4, "p2pAcctNameLoading");
            ViewExtKt.show($r4);
        } else {
            ProgressBar $r42 = $r3.p2pAcctNameLoading;
            Log_OC.loadImage($r42, "p2pAcctNameLoading");
            ViewExtKt.hide$default($r42, false, 1, null);
        }
        LookUpUserRequest $r5 = p2pNameAndPhoneNoViewData.getLookUpUserRequest();
        if ($r5 != null) {
            $r3.p2pAccountNameTextView.setText($r5.getName());
            View $r8 = $r3.p2pcontinueButton;
            Log_OC.loadImage($r8, "p2pcontinueButton");
            View r12 = $r8;
            ViewExtKt.show(r12);
        }
        P2pNameAndPhoneNoError $r9 = p2pNameAndPhoneNoViewData.getError();
        if ($r9 == null) {
            return;
        }
        String $r7 = $r9.getMessage();
        if ($r7 != null && ($r102 = getActivity()) != null) {
            ContextExtKt.toast$default($r102, $r7, 0, 2, (Object) null);
        }
        String $r72 = $r9.getPhoneNo();
        if ($r72 != null) {
            KudiInputField $r11 = $r3.p2pRecipientPhoneEditText;
            $r11.setError($r72);
            TextView $r6 = $r3.p2pAccountNameTextView;
            if ($r6 != null) {
                $r6.setText("");
            }
        }
        String $r73 = $r9.getAccountName();
        if ($r73 == null || ($r10 = getActivity()) == null) {
            return;
        }
        ContextExtKt.toast$default($r10, $r73, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        P2pNameAndPhoneViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public P2pNameAndPhoneViewModel createViewModel() {
        P2pNameAndPhoneViewModel $r1 = getP2pNameAndPhoneViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final P2pNameAndPhoneViewModel getP2pNameAndPhoneViewModel() {
        P2pNameAndPhoneViewModel $r1 = this.p2pNameAndPhoneViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("p2pNameAndPhoneViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return P2pNameAndPhoneViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        MainTransferSubComponent $r1;
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        boolean $z0 = context instanceof TransferActivity;
        if ($z0) {
            TransferActivity $r3 = (TransferActivity) context;
            this.transferActivity = $r3;
            if ($r3 == null || ($r1 = $r3.getTransferSubComponent()) == null) {
                return;
            }
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
        String $r2 = $r1.getString(TransferActivity.RECIPIENT_PHONE_NUMBER);
        this.recipientPhoneNumber = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentP2pNameAndPhoneNoBinding $r4 = FragmentP2pNameAndPhoneNoBinding.inflate(layoutInflater, viewGroup, false);
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
        InterfaceC8209a $r1 = requireBinding();
        final FragmentP2pNameAndPhoneNoBinding $r4 = (FragmentP2pNameAndPhoneNoBinding) $r1;
        String $r5 = this.recipientPhoneNumber;
        if ($r5 != null) {
            KudiInputField $r6 = $r4.p2pRecipientPhoneEditText;
            $r6.setText($r5);
        }
        observeEditTextChangesAndPerformLookUp();
        ViewGroup $r7 = $r4.p2pcontinueButton;
        ViewGroup r10 = $r7;
        r10.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.p2p.fragments.FileSelectionFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                P2pNameAndPhoneNoFragment $r2 = P2pNameAndPhoneNoFragment.this;
                FragmentP2pNameAndPhoneNoBinding $r3 = $r4;
                P2pNameAndPhoneNoFragment.m39991onViewCreated$lambda4$lambda3($r2, $r3, view2);
            }
        });
    }

    public final void setP2pNameAndPhoneViewModel(P2pNameAndPhoneViewModel p2pNameAndPhoneViewModel) {
        Log_OC.getArray(p2pNameAndPhoneViewModel, "<set-?>");
        this.p2pNameAndPhoneViewModel = p2pNameAndPhoneViewModel;
    }
}

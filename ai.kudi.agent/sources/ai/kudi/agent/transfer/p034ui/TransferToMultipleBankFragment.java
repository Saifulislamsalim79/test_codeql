package ai.kudi.agent.transfer.p034ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.banks.p001ui.BanksFragment;
import ai.kudi.agent.common_screens.success_screen.fragment.SuccessScreenDialogFragment;
import ai.kudi.agent.common_screens.success_screen.labs.SuccessScreenCustomOption;
import ai.kudi.agent.constants.ConstantsKt;
import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.domain.room_entities.Bank;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.CustomDialog;
import ai.kudi.agent.core.util.EditTextExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.FragmentTransferToMultipleBankBinding;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.transfer.adapter.TransferRecipientsAdapter;
import ai.kudi.agent.transfer.domain.usecases.TransferToBankPayload;
import ai.kudi.agent.transfer.generation.components.MainTransferSubComponent;
import ai.kudi.agent.transfer.viewmodel.TransferToMultipleViewModel;
import ai.kudi.agent.transfer.viewmodel.TransferToMultipleViewState;
import ai.kudi.agent.voucher.cashin.view.MainTransferView;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.button.KudiSwitch;
import ai.kudi.dip.library.edittext.KudiInputField;
import ai.kudi.dip.library.edittext.KudiNairaInputField;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import androidx.lifecycle.PreferenceActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.trello.rxlifecycle2.p190e.p191a.p192a.C7390a;
import java.util.List;
import kotlin.C13287o;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13275r;
import p201g.p270x.InterfaceC8209a;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11680b;
/* compiled from: TransferToMultipleBankFragment.kt */
@Metadata(m10422d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 92\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00019B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0003H\u0014J\b\u0010!\u001a\u00020\u001fH\u0002J\b\u0010\"\u001a\u00020\u0002H\u0014J\b\u0010#\u001a\u00020\u001fH\u0002J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020%H\u0014J\b\u0010&\u001a\u00020\u001fH\u0003J\u0010\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020)H\u0016J$\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u001a\u00102\u001a\u00020\u001f2\u0006\u00103\u001a\u00020+2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00104\u001a\u00020\u001fH\u0003J\b\u00105\u001a\u00020\u001fH\u0002J\u0010\u00106\u001a\u00020\u001f2\u0006\u00107\u001a\u000208H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u0005\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006:"}, m10421d2 = {"Lai/kudi/agent/transfer/ui/TransferToMultipleBankFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/transfer/viewmodel/TransferToMultipleViewModel;", "Lai/kudi/agent/transfer/viewmodel/TransferToMultipleViewState;", "Lai/kudi/agent/databinding/FragmentTransferToMultipleBankBinding;", "()V", "confirmDialog", "Landroid/app/Dialog;", "mainTransferView", "Lai/kudi/agent/voucher/cashin/view/MainTransferView;", "getMainTransferView", "()Lai/kudi/agent/voucher/cashin/view/MainTransferView;", "setMainTransferView", "(Lai/kudi/agent/voucher/cashin/view/MainTransferView;)V", "selectedBank", "Lai/kudi/agent/core/domain/room_entities/Bank;", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences$annotations", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "transferRecipientsAdapter", "Lai/kudi/agent/transfer/adapter/TransferRecipientsAdapter;", "viewModel", "getViewModel", "()Lai/kudi/agent/transfer/viewmodel/TransferToMultipleViewModel;", "setViewModel", "(Lai/kudi/agent/transfer/viewmodel/TransferToMultipleViewModel;)V", "applyViewData", "", "viewData", "collectPin", "createViewModel", "dismissConfirmationDialog", "getVMType", "Ljava/lang/Class;", "observerViewModel", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setupUi", "showBankOptions", "toggleTabsAndAppBar", "show", "", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transfer.ui.TransferToMultipleBankFragment */
/* loaded from: classes.dex */
public final class TransferToMultipleBankFragment extends BaseMVVMViewBindingFragment<TransferToMultipleViewModel, TransferToMultipleViewState, FragmentTransferToMultipleBankBinding> {
    private static final String ARGS_PAYLOAD = "args_transfer_payload";
    public static final Companion Companion;
    private Dialog confirmDialog;
    public MainTransferView mainTransferView;
    private Bank selectedBank;
    public SharedPreferences sharedPreferences;
    private TransferRecipientsAdapter transferRecipientsAdapter;
    public TransferToMultipleViewModel viewModel;

    /* compiled from: TransferToMultipleBankFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/transfer/ui/TransferToMultipleBankFragment$Companion;", "", "()V", "ARGS_PAYLOAD", "", "newInstance", "Lai/kudi/agent/transfer/ui/TransferToMultipleBankFragment;", "payload", "Lai/kudi/agent/transfer/domain/usecases/TransferToBankPayload;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transfer.ui.TransferToMultipleBankFragment$Companion */
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
        public static /* synthetic */ TransferToMultipleBankFragment newInstance$default(Companion companion, TransferToBankPayload $r3, int i, Object obj) {
            int $i0 = i & 1;
            if ($i0 != 0) {
                $r3 = null;
            }
            TransferToMultipleBankFragment $r1 = companion.newInstance($r3);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TransferToMultipleBankFragment newInstance(TransferToBankPayload transferToBankPayload) {
            TransferToMultipleBankFragment $r1 = new TransferToMultipleBankFragment();
            Bundle $r2 = new Bundle();
            $r2.putParcelable("args_transfer_payload", transferToBankPayload);
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
    private final void collectPin() {
        FragmentManager $r2 = getChildFragmentManager();
        PreferenceActivity $r3 = getViewLifecycleOwner();
        $r2.p1(KudiPin.KUDI_PIN_AUTH_SUCCESS_KEY, $r3, new InterfaceC1523w() { // from class: ai.kudi.agent.transfer.ui.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: c */
            public final void m38185c(String str, Bundle bundle) {
                TransferToMultipleBankFragment $r32 = TransferToMultipleBankFragment.this;
                TransferToMultipleBankFragment.m41390collectPin$lambda22($r32, str, bundle);
            }
        });
        KudiPin.Companion $r1 = KudiPin.Companion;
        KudiPin $r5 = KudiPin.Companion.newInstance$default($r1, null, null, false, 7, null);
        FragmentManager $r22 = getChildFragmentManager();
        ((Chapter) $r5).show($r22, ".AuthDialog.Dialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: collectPin$lambda-22  reason: not valid java name */
    public static final void m41390collectPin$lambda22(TransferToMultipleBankFragment transferToMultipleBankFragment, String str, Bundle bundle) {
        Log_OC.getArray(transferToMultipleBankFragment, "this$0");
        Log_OC.getArray(str, "$noName_0");
        Log_OC.getArray(bundle, "$noName_1");
        TransferToMultipleViewModel $r1 = transferToMultipleBankFragment.getViewModel();
        $r1.performMultipleTransfer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void dismissConfirmationDialog() {
        Dialog $r1 = this.confirmDialog;
        if ($r1 != null) {
            $r1.dismiss();
        }
        this.confirmDialog = null;
    }

    public static /* synthetic */ void getSharedPreferences$annotations() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void observerViewModel() {
        InterfaceC8209a $r1 = requireBinding();
        final FragmentTransferToMultipleBankBinding $r2 = (FragmentTransferToMultipleBankBinding) $r1;
        KudiSwitch $r3 = $r2.sameAmountSwitch;
        TransferToMultipleBankFragment$observerViewModel$1$1 $r4 = new TransferToMultipleBankFragment$observerViewModel$1$1($r2);
        $r3.setOnCheckedChangeListener($r4);
        TransferToMultipleViewModel $r5 = getViewModel();
        C11680b $r6 = $r5.getOnRecipientAdded();
        PreferenceActivity $r7 = getViewLifecycleOwner();
        Log_OC.loadImage($r7, "viewLifecycleOwner");
        AbstractC11688p $r8 = C7390a.a($r6, $r7);
        Object object = new Object() { // from class: ai.kudi.agent.transfer.ui.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                FragmentTransferToMultipleBankBinding $r12 = FragmentTransferToMultipleBankBinding.this;
                TransferToMultipleBankFragment $r22 = this;
                Boolean $r42 = (Boolean) obj;
                TransferToMultipleBankFragment.m41391observerViewModel$lambda21$lambda11($r12, $r22, $r42);
            }
        };
        Button $r10 = Button.search;
        $r8.e0(object, $r10);
        TransferToMultipleViewModel $r52 = getViewModel();
        C11680b $r62 = $r52.getOnShowConfirmDialog();
        PreferenceActivity $r72 = getViewLifecycleOwner();
        Log_OC.loadImage($r72, "viewLifecycleOwner");
        AbstractC11688p $r82 = C7390a.a($r62, $r72);
        Object object2 = new Object() { // from class: ai.kudi.agent.transfer.ui.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransferToMultipleBankFragment $r12 = TransferToMultipleBankFragment.this;
                String $r32 = (String) obj;
                TransferToMultipleBankFragment.m41393observerViewModel$lambda21$lambda13($r12, $r32);
            }
        };
        Chunk $r12 = Chunk.NEWLINE;
        $r82.e0(object2, $r12);
        TransferToMultipleViewModel $r53 = getViewModel();
        C11680b $r63 = $r53.getToastMessage();
        PreferenceActivity $r73 = getViewLifecycleOwner();
        Log_OC.loadImage($r73, "viewLifecycleOwner");
        AbstractC11688p $r83 = C7390a.a($r63, $r73);
        Object object3 = new Object() { // from class: ai.kudi.agent.transfer.ui.PacketIDFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransferToMultipleBankFragment $r13 = TransferToMultipleBankFragment.this;
                String $r32 = (String) obj;
                TransferToMultipleBankFragment.m41395observerViewModel$lambda21$lambda15($r13, $r32);
            }
        };
        Pair $r14 = Pair.f1830b;
        $r83.e0(object3, $r14);
        TransferToMultipleViewModel $r54 = getViewModel();
        C11680b $r64 = $r54.getOnRequestTransferPin();
        PreferenceActivity $r74 = getViewLifecycleOwner();
        Log_OC.loadImage($r74, "viewLifecycleOwner");
        AbstractC11688p $r84 = C7390a.a($r64, $r74);
        Object object4 = new Object() { // from class: ai.kudi.agent.transfer.ui.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransferToMultipleBankFragment $r13 = TransferToMultipleBankFragment.this;
                Boolean $r32 = (Boolean) obj;
                TransferToMultipleBankFragment.m41397observerViewModel$lambda21$lambda17($r13, $r32);
            }
        };
        Coin $r16 = Coin.ZERO;
        $r84.e0(object4, $r16);
        TransferToMultipleViewModel $r55 = getViewModel();
        C11680b $r65 = $r55.getOnPaymentComplete();
        PreferenceActivity $r75 = getViewLifecycleOwner();
        Log_OC.loadImage($r75, "viewLifecycleOwner");
        AbstractC11688p $r85 = C7390a.a($r65, $r75);
        Object object5 = new Object() { // from class: ai.kudi.agent.transfer.ui.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransferToMultipleBankFragment $r13 = TransferToMultipleBankFragment.this;
                C13287o $r32 = (C13287o) obj;
                TransferToMultipleBankFragment.m41399observerViewModel$lambda21$lambda19($r13, $r32);
            }
        };
        Subscription $r18 = Subscription.none;
        $r85.e0(object5, $r18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: observerViewModel$lambda-21$lambda-11  reason: not valid java name */
    public static final void m41391observerViewModel$lambda21$lambda11(FragmentTransferToMultipleBankBinding fragmentTransferToMultipleBankBinding, TransferToMultipleBankFragment transferToMultipleBankFragment, Boolean bool) {
        Log_OC.getArray(fragmentTransferToMultipleBankBinding, "$this_apply");
        Log_OC.getArray(transferToMultipleBankFragment, "this$0");
        KudiInputField $r3 = fragmentTransferToMultipleBankBinding.accountNumberField;
        $r3.setText("");
        TextView $r4 = fragmentTransferToMultipleBankBinding.accountNameField;
        $r4.setText("");
        KudiInputField $r32 = fragmentTransferToMultipleBankBinding.bankField;
        $r32.setText("");
        CompoundButton $r5 = fragmentTransferToMultipleBankBinding.sameAmountSwitch;
        CompoundButton r7 = $r5;
        boolean $z0 = r7.isChecked();
        if ($z0) {
            View $r6 = fragmentTransferToMultipleBankBinding.amountEditText;
            Log_OC.loadImage($r6, "amountEditText");
            View r8 = $r6;
            ViewExtKt.hide$default(r8, false, 1, null);
            View $r33 = fragmentTransferToMultipleBankBinding.transferReasonEditText;
            Log_OC.loadImage($r33, "transferReasonEditText");
            View r82 = $r33;
            ViewExtKt.hide$default(r82, false, 1, null);
        } else {
            fragmentTransferToMultipleBankBinding.amountEditText.setText("");
            KudiInputField $r34 = fragmentTransferToMultipleBankBinding.transferReasonEditText;
            $r34.setText("");
        }
        transferToMultipleBankFragment.selectedBank = null;
        ViewGroup $r35 = fragmentTransferToMultipleBankBinding.accountNumberField;
        ViewGroup r9 = $r35;
        r9.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: observerViewModel$lambda-21$lambda-12  reason: not valid java name */
    public static final void m41392observerViewModel$lambda21$lambda12(Throwable th) {
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: observerViewModel$lambda-21$lambda-13  reason: not valid java name */
    public static final void m41393observerViewModel$lambda21$lambda13(TransferToMultipleBankFragment transferToMultipleBankFragment, String str) {
        Log_OC.getArray(transferToMultipleBankFragment, "this$0");
        Context $r4 = transferToMultipleBankFragment.requireContext();
        String $r5 = transferToMultipleBankFragment.getString(C0001R.string.continue_text);
        CustomDialog.Companion $r1 = CustomDialog.Companion;
        Log_OC.loadImage($r4, "requireContext()");
        Log_OC.loadImage(str, "it");
        Log_OC.loadImage($r5, "getString(R.string.continue_text)");
        TransferToMultipleBankFragment$observerViewModel$1$4$1 $r2 = new TransferToMultipleBankFragment$observerViewModel$1$4$1(transferToMultipleBankFragment);
        Dialog $r6 = CustomDialog.Companion.show$default($r1, $r4, str, $r5, false, true, false, (InterfaceC11756a) $r2, 32, (Object) null);
        transferToMultipleBankFragment.confirmDialog = $r6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: observerViewModel$lambda-21$lambda-14  reason: not valid java name */
    public static final void m41394observerViewModel$lambda21$lambda14(Throwable th) {
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: observerViewModel$lambda-21$lambda-15  reason: not valid java name */
    public static final void m41395observerViewModel$lambda21$lambda15(TransferToMultipleBankFragment transferToMultipleBankFragment, String str) {
        Log_OC.getArray(transferToMultipleBankFragment, "this$0");
        FragmentActivity $r1 = transferToMultipleBankFragment.requireActivity();
        Log_OC.loadImage($r1, "requireActivity()");
        ContextExtKt.toast$default($r1, str, 0, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: observerViewModel$lambda-21$lambda-16  reason: not valid java name */
    public static final void m41396observerViewModel$lambda21$lambda16(Throwable th) {
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: observerViewModel$lambda-21$lambda-17  reason: not valid java name */
    public static final void m41397observerViewModel$lambda21$lambda17(TransferToMultipleBankFragment transferToMultipleBankFragment, Boolean bool) {
        Log_OC.getArray(transferToMultipleBankFragment, "this$0");
        Boolean $r2 = Boolean.TRUE;
        boolean $z0 = Log_OC.append(bool, $r2);
        if ($z0) {
            transferToMultipleBankFragment.collectPin();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: observerViewModel$lambda-21$lambda-18  reason: not valid java name */
    public static final void m41398observerViewModel$lambda21$lambda18(Throwable th) {
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: observerViewModel$lambda-21$lambda-19  reason: not valid java name */
    public static final void m41399observerViewModel$lambda21$lambda19(TransferToMultipleBankFragment transferToMultipleBankFragment, C13287o c13287o) {
        SuccessScreenCustomOption $r6;
        TransferToMultipleBankFragment$observerViewModel$1$10$1 $r7;
        Log_OC.getArray(transferToMultipleBankFragment, "this$0");
        Object $r2 = c13287o.m5364c();
        boolean $z0 = ((Boolean) $r2).booleanValue();
        if ($z0) {
            String $r4 = transferToMultipleBankFragment.getString(C0001R.string.we_are_processing_your_transfers);
            String $r5 = transferToMultipleBankFragment.getString(C0001R.string.multiple_transfer_status_message);
            Log_OC.loadImage($r4, "getString(R.string.we_are_processing_your_transfers)");
            Log_OC.loadImage($r5, "getString(R.string.multiple_transfer_status_message)");
            $r6 = new SuccessScreenCustomOption($r4, $r5, null, false, false, false, 0, 0, 0, 0, C0001R.C0002drawable.ic_successful_transaction_status, 0, false, 7164, null);
            $r7 = new TransferToMultipleBankFragment$observerViewModel$1$10$1(transferToMultipleBankFragment);
        } else {
            String $r42 = transferToMultipleBankFragment.getString(C0001R.string.transfer_failed);
            Object $r22 = c13287o.m5363d();
            Log_OC.loadImage($r42, "getString(\n                                    R.string.transfer_failed\n                                )");
            $r6 = new SuccessScreenCustomOption($r42, (String) $r22, null, false, true, false, 0, C0001R.color.red, 0, 0, C0001R.C0002drawable.ic_failed_transaction_status, 0, false, 7020, null);
            $r7 = null;
        }
        SuccessScreenDialogFragment.Companion $r8 = SuccessScreenDialogFragment.Companion;
        SuccessScreenDialogFragment $r9 = $r8.newInstance($r6, $r7);
        FragmentManager $r10 = transferToMultipleBankFragment.getChildFragmentManager();
        $r9.show($r10, SuccessScreenDialogFragment.PAGE_KEY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: observerViewModel$lambda-21$lambda-20  reason: not valid java name */
    public static final void m41400observerViewModel$lambda21$lambda20(Throwable th) {
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setupUi() {
        InterfaceC8209a $r1 = requireBinding();
        final FragmentTransferToMultipleBankBinding $r2 = (FragmentTransferToMultipleBankBinding) $r1;
        KudiInputField $r3 = $r2.bankField;
        EditText $r4 = $r3.getEditText();
        $r4.setFocusable(false);
        $r4.setFocusableInTouchMode(false);
        $r4.setLongClickable(false);
        $r4.setClickable(true);
        KudiInputField $r32 = $r2.bankField;
        TransferToMultipleBankFragment$setupUi$1$2 r24 = new TransferToMultipleBankFragment$setupUi$1$2(this);
        $r32.setClickedListener(r24);
        KudiButton $r6 = $r2.continueButton;
        $r6.m38035c();
        ViewGroup $r62 = $r2.continueButton;
        ViewGroup r33 = $r62;
        r33.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transfer.ui.ErrorActivity$3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferToMultipleBankFragment $r22 = TransferToMultipleBankFragment.this;
                TransferToMultipleBankFragment.m41401setupUi$lambda10$lambda1($r22, view);
            }
        });
        TransferToMultipleBankFragment$setupUi$1$4 r26 = new TransferToMultipleBankFragment$setupUi$1$4(this, $r2);
        TransferRecipientsAdapter r27 = new TransferRecipientsAdapter(r26);
        this.transferRecipientsAdapter = r27;
        RecyclerView $r10 = $r2.recipientsList;
        Context $r12 = requireContext();
        LinearLayoutManager r28 = new LinearLayoutManager($r12);
        $r10.setLayoutManager(r28);
        TransferRecipientsAdapter $r8 = this.transferRecipientsAdapter;
        if ($r8 == null) {
            Log_OC.LogError("transferRecipientsAdapter");
            NullPointerException r23 = new NullPointerException("Null throw statement replaced by Soot");
            throw r23;
        }
        $r10.setAdapter($r8);
        ViewGroup $r63 = $r2.addMultipleButton;
        ViewGroup r332 = $r63;
        r332.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transfer.ui.EditEventView$5
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferToMultipleBankFragment $r22 = TransferToMultipleBankFragment.this;
                FragmentTransferToMultipleBankBinding $r33 = $r2;
                TransferToMultipleBankFragment.m41402setupUi$lambda10$lambda3($r22, $r33, view);
            }
        });
        KudiInputField $r33 = $r2.accountNumberField;
        AbstractC11688p $r14 = EditTextExtKt.getTextChanges($r33.getEditText());
        PreferenceActivity $r15 = getViewLifecycleOwner();
        Log_OC.loadImage($r15, "viewLifecycleOwner");
        AbstractC11688p $r142 = C7390a.a($r14, $r15);
        Object object = new Object() { // from class: ai.kudi.agent.transfer.ui.Point
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransferToMultipleBankFragment $r13 = TransferToMultipleBankFragment.this;
                FragmentTransferToMultipleBankBinding $r22 = $r2;
                CharSequence $r42 = (CharSequence) obj;
                TransferToMultipleBankFragment.m41403setupUi$lambda10$lambda4($r13, $r22, $r42);
            }
        };
        Logger $r17 = Logger.logger;
        $r142.e0(object, $r17);
        KudiInputField $r34 = $r2.bankField;
        AbstractC11688p $r143 = EditTextExtKt.getTextChanges($r34.getEditText());
        PreferenceActivity $r152 = getViewLifecycleOwner();
        Log_OC.loadImage($r152, "viewLifecycleOwner");
        AbstractC11688p $r144 = C7390a.a($r143, $r152);
        Object object2 = new Object() { // from class: ai.kudi.agent.transfer.ui.ToContainsFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                FragmentTransferToMultipleBankBinding $r13 = FragmentTransferToMultipleBankBinding.this;
                CharSequence $r35 = (CharSequence) obj;
                TransferToMultipleBankFragment.m41405setupUi$lambda10$lambda6($r13, $r35);
            }
        };
        Track $r19 = Track.mTrack;
        $r144.e0(object2, $r19);
        KudiNairaInputField $r20 = $r2.amountEditText;
        AbstractC11688p $r145 = EditTextExtKt.getTextChanges($r20.getEditText());
        PreferenceActivity $r153 = getViewLifecycleOwner();
        Log_OC.loadImage($r153, "viewLifecycleOwner");
        AbstractC11688p $r146 = C7390a.a($r145, $r153);
        Object object3 = new Object() { // from class: ai.kudi.agent.transfer.ui.Comment
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                FragmentTransferToMultipleBankBinding $r13 = FragmentTransferToMultipleBankBinding.this;
                CharSequence $r35 = (CharSequence) obj;
                TransferToMultipleBankFragment.m41407setupUi$lambda10$lambda8($r13, $r35);
            }
        };
        Target $r22 = Target.VIBRANT;
        $r146.e0(object3, $r22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupUi$lambda-10$lambda-1  reason: not valid java name */
    public static final void m41401setupUi$lambda10$lambda1(TransferToMultipleBankFragment transferToMultipleBankFragment, View view) {
        Log_OC.getArray(transferToMultipleBankFragment, "this$0");
        SharedPreferences $r2 = transferToMultipleBankFragment.getSharedPreferences();
        Double $r3 = null;
        String $r4 = $r2.getString(ConstantsKt.EXTRA_WALLET_BALANCE, null);
        if ($r4 != null) {
            double $d0 = Double.parseDouble($r4);
            $r3 = Double.valueOf($d0);
        }
        TransferToMultipleViewModel $r5 = transferToMultipleBankFragment.getViewModel();
        $r5.confirmPayment($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupUi$lambda-10$lambda-3  reason: not valid java name */
    public static final void m41402setupUi$lambda10$lambda3(TransferToMultipleBankFragment transferToMultipleBankFragment, FragmentTransferToMultipleBankBinding fragmentTransferToMultipleBankBinding, View view) {
        Integer $r14;
        Log_OC.getArray(transferToMultipleBankFragment, "this$0");
        Log_OC.getArray(fragmentTransferToMultipleBankBinding, "$this_apply");
        SharedPreferences $r4 = transferToMultipleBankFragment.getSharedPreferences();
        Double $r5 = null;
        String $r6 = $r4.getString(ConstantsKt.EXTRA_WALLET_BALANCE, null);
        if ($r6 != null) {
            double $d0 = Double.parseDouble($r6);
            $r5 = Double.valueOf($d0);
        }
        KudiInputField $r7 = fragmentTransferToMultipleBankBinding.accountNumberField;
        String $r62 = $r7.getText();
        TextView $r8 = fragmentTransferToMultipleBankBinding.accountNameField;
        CharSequence $r9 = $r8.getText();
        String $r10 = $r9.toString();
        Bank $r1 = transferToMultipleBankFragment.selectedBank;
        KudiInputField $r72 = fragmentTransferToMultipleBankBinding.transferReasonEditText;
        String $r11 = $r72.getText();
        KudiNairaInputField $r12 = fragmentTransferToMultipleBankBinding.amountEditText;
        String $r13 = $r12.getText();
        $r14 = C13275r.m5455k(StringExtKt.getRemoveAllLetters($r13));
        TransferToMultipleViewModel $r15 = transferToMultipleBankFragment.getViewModel();
        $r15.addRecipient($r5, $r62, $r1, $r10, $r14, $r11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupUi$lambda-10$lambda-4  reason: not valid java name */
    public static final void m41403setupUi$lambda10$lambda4(TransferToMultipleBankFragment transferToMultipleBankFragment, FragmentTransferToMultipleBankBinding fragmentTransferToMultipleBankBinding, CharSequence charSequence) {
        Log_OC.getArray(transferToMultipleBankFragment, "this$0");
        Log_OC.getArray(fragmentTransferToMultipleBankBinding, "$this_apply");
        String $r3 = charSequence.toString();
        boolean $z0 = StringExtKt.isAccountNumber($r3);
        if ($z0) {
            TransferToMultipleViewModel $r4 = transferToMultipleBankFragment.getViewModel();
            String $r32 = charSequence.toString();
            Bank $r5 = transferToMultipleBankFragment.selectedBank;
            $r4.performLookup($r32, $r5);
            TextView $r6 = fragmentTransferToMultipleBankBinding.accountNameField;
            $r6.setError(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupUi$lambda-10$lambda-5  reason: not valid java name */
    public static final void m41404setupUi$lambda10$lambda5(Throwable th) {
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupUi$lambda-10$lambda-6  reason: not valid java name */
    public static final void m41405setupUi$lambda10$lambda6(FragmentTransferToMultipleBankBinding fragmentTransferToMultipleBankBinding, CharSequence charSequence) {
        Log_OC.getArray(fragmentTransferToMultipleBankBinding, "$this_apply");
        KudiInputField $r2 = fragmentTransferToMultipleBankBinding.bankField;
        $r2.setError(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupUi$lambda-10$lambda-7  reason: not valid java name */
    public static final void m41406setupUi$lambda10$lambda7(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupUi$lambda-10$lambda-8  reason: not valid java name */
    public static final void m41407setupUi$lambda10$lambda8(FragmentTransferToMultipleBankBinding fragmentTransferToMultipleBankBinding, CharSequence charSequence) {
        Log_OC.getArray(fragmentTransferToMultipleBankBinding, "$this_apply");
        KudiNairaInputField $r2 = fragmentTransferToMultipleBankBinding.amountEditText;
        $r2.setError(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupUi$lambda-10$lambda-9  reason: not valid java name */
    public static final void m41408setupUi$lambda10$lambda9(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showBankOptions() {
        InterfaceC8209a $r1 = requireBinding();
        FragmentTransferToMultipleBankBinding $r2 = (FragmentTransferToMultipleBankBinding) $r1;
        BanksFragment.Companion $r3 = BanksFragment.Companion;
        Bank $r4 = this.selectedBank;
        String $r5 = $r4 == null ? null : $r4.getBankCode();
        BanksFragment $r6 = $r3.newInstance($r5);
        TransferToMultipleBankFragment$showBankOptions$1$1 $r7 = new TransferToMultipleBankFragment$showBankOptions$1$1($r6, this, $r2);
        $r6.setOnBankSelectedListener($r7);
        FragmentManager $r8 = getChildFragmentManager();
        String $r52 = BanksFragment.class.getCanonicalName();
        $r6.show($r8, $r52);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void toggleTabsAndAppBar(boolean z) {
        boolean $z1 = getActivity() instanceof TransferActivity;
        if ($z1) {
            FragmentActivity $r1 = getActivity();
            if ($r1 == null) {
                NullPointerException $r3 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.transfer.ui.TransferActivity");
                throw $r3;
            }
            TransferActivity $r2 = (TransferActivity) $r1;
            $r2.toggleAppBarAndTabLayout(z);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        TransferToMultipleViewState $r2 = (TransferToMultipleViewState) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(TransferToMultipleViewState transferToMultipleViewState) {
        Log_OC.getArray(transferToMultipleViewState, "viewData");
        InterfaceC8209a $r2 = requireBinding();
        FragmentTransferToMultipleBankBinding $r3 = (FragmentTransferToMultipleBankBinding) $r2;
        KudiInputField $r4 = $r3.accountNumberField;
        String $r5 = transferToMultipleViewState.getAccountNumberError();
        $r4.setError($r5);
        KudiInputField $r42 = $r3.bankField;
        String $r52 = transferToMultipleViewState.getBankError();
        $r42.setError($r52);
        KudiNairaInputField $r6 = $r3.amountEditText;
        String $r53 = transferToMultipleViewState.getAmountError();
        $r6.setError($r53);
        boolean $z0 = transferToMultipleViewState.isNextButtonEnabled();
        if ($z0) {
            KudiButton $r7 = $r3.continueButton;
            $r7.m38034d();
        } else {
            KudiButton $r72 = $r3.continueButton;
            $r72.m38035c();
        }
        boolean $z02 = transferToMultipleViewState.isLoadingAccountDetails();
        if ($z02) {
            ImageView $r8 = $r3.accountLookupLoader;
            Log_OC.loadImage($r8, "accountLookupLoader");
            ViewExtKt.show($r8);
            KudiButton $r73 = $r3.addMultipleButton;
            $r73.m38035c();
        } else {
            ImageView $r82 = $r3.accountLookupLoader;
            Log_OC.loadImage($r82, "accountLookupLoader");
            ViewExtKt.hide($r82, true);
            KudiButton $r74 = $r3.addMultipleButton;
            $r74.m38034d();
        }
        boolean $z03 = transferToMultipleViewState.isProcessingPayments();
        if ($z03) {
            KudiButton $r75 = $r3.continueButton;
            $r75.m38032f();
            KudiButton $r76 = $r3.addMultipleButton;
            $r76.m38035c();
        } else {
            KudiButton $r77 = $r3.continueButton;
            $r77.m38033e();
            KudiButton $r78 = $r3.addMultipleButton;
            $r78.m38034d();
        }
        TransferRecipientsAdapter $r9 = this.transferRecipientsAdapter;
        if ($r9 == null) {
            Log_OC.LogError("transferRecipientsAdapter");
            NullPointerException r12 = new NullPointerException("Null throw statement replaced by Soot");
            throw r12;
        }
        List $r10 = transferToMultipleViewState.getRecipients();
        $r9.setItems($r10);
        TextView $r11 = $r3.accountNameField;
        String $r54 = transferToMultipleViewState.getAccountName();
        $r11.setText($r54);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        TransferToMultipleViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public TransferToMultipleViewModel createViewModel() {
        TransferToMultipleViewModel $r1 = getViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final MainTransferView getMainTransferView() {
        MainTransferView $r1 = this.mainTransferView;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("mainTransferView");
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
        return TransferToMultipleViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public final TransferToMultipleViewModel getViewModel() {
        TransferToMultipleViewModel $r1 = this.viewModel;
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
            NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.transfer.ui.TransferActivity");
            throw $r5;
        }
        TransferActivity $r3 = (TransferActivity) $r2;
        MainTransferSubComponent $r4 = $r3.getTransferSubComponent();
        $r4.inject(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentTransferToMultipleBankBinding $r4 = FragmentTransferToMultipleBankBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(\n                inflater,\n                container,\n                false\n            )");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        toggleTabsAndAppBar(true);
        setupUi();
        observerViewModel();
    }

    public final void setMainTransferView(MainTransferView mainTransferView) {
        Log_OC.getArray(mainTransferView, "<set-?>");
        this.mainTransferView = mainTransferView;
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }

    public final void setViewModel(TransferToMultipleViewModel transferToMultipleViewModel) {
        Log_OC.getArray(transferToMultipleViewModel, "<set-?>");
        this.viewModel = transferToMultipleViewModel;
    }
}

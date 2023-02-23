package ai.kudi.agent.transactions.p032ui.bottomsheet;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseMvvmBottomSheetFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.SendReceiptToTerminalBottomSheetBinding;
import ai.kudi.agent.transactions.domain.dto.TerminalConnectionResponse;
import ai.kudi.agent.transactions.viewmodels.SendReceiptToTerminalViewModel;
import ai.kudi.agent.transactions.viewmodels.data.SendReceiptToTerminalViewData;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.p058os.C1372b;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.Fragment;
import dagger.android.p197e.C7429a;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: SendReceiptToTerminalConfirmationBottomSheet.kt */
@Metadata(m10422d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 /2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001/B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0003H\u0014J\b\u0010\u001a\u001a\u00020\u0002H\u0014J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0014J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 H\u0096\u0001J\u0010\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020#H\u0016J\u0012\u0010$\u001a\u00020\u00172\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J$\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u001a\u0010,\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u001e2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\t\u0010.\u001a\u00020\u0005H\u0096\u0001R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, m10421d2 = {"Lai/kudi/agent/transactions/ui/bottomsheet/SendReceiptToTerminalConfirmationBottomSheet;", "Lai/kudi/agent/core/mvvm/BaseMvvmBottomSheetFragment;", "Lai/kudi/agent/transactions/viewmodels/SendReceiptToTerminalViewModel;", "Lai/kudi/agent/transactions/viewmodels/data/SendReceiptToTerminalViewData;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/SendReceiptToTerminalBottomSheetBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/databinding/SendReceiptToTerminalBottomSheetBinding;", "connectionResponse", "Lai/kudi/agent/transactions/domain/dto/TerminalConnectionResponse;", "sendReceiptToTerminalViewModel", "getSendReceiptToTerminalViewModel", "()Lai/kudi/agent/transactions/viewmodels/SendReceiptToTerminalViewModel;", "setSendReceiptToTerminalViewModel", "(Lai/kudi/agent/transactions/viewmodels/SendReceiptToTerminalViewModel;)V", SendReceiptToTerminalConfirmationBottomSheet.STATE, "", "transaction", "Ljava/util/HashMap;", "Lai/kudi/agent/transactions/domain/dto/Transaction;", "applyBinding", "", "applyViewData", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "requireBinding", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactions.ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet */
/* loaded from: classes.dex */
public final class SendReceiptToTerminalConfirmationBottomSheet extends BaseMvvmBottomSheetFragment<SendReceiptToTerminalViewModel, SendReceiptToTerminalViewData> implements BaseViewBinder<SendReceiptToTerminalBottomSheetBinding> {
    public static final String CONNECTION_RESPONSE = "connection_response";
    public static final Companion Companion;
    public static final String FAILED_CONNECTION_STATE = "failed_connection";
    public static final String STATE = "state";
    public static final String SUCCESSFUL_CONNECTION_STATE = "successful_connection";
    public static final String TRANSACTION_PARAM = "transaction_param";
    private final /* synthetic */ BaseViewBinderImpl<SendReceiptToTerminalBottomSheetBinding> $$delegate_0;
    private TerminalConnectionResponse connectionResponse;
    public SendReceiptToTerminalViewModel sendReceiptToTerminalViewModel;
    private String state;
    private HashMap<String, String> transaction;

    /* compiled from: SendReceiptToTerminalConfirmationBottomSheet.kt */
    @Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u001c\b\u0002\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/transactions/ui/bottomsheet/SendReceiptToTerminalConfirmationBottomSheet$Companion;", "", "()V", "CONNECTION_RESPONSE", "", "FAILED_CONNECTION_STATE", "STATE", "SUCCESSFUL_CONNECTION_STATE", "TRANSACTION_PARAM", "newInstance", "Lai/kudi/agent/transactions/ui/bottomsheet/SendReceiptToTerminalConfirmationBottomSheet;", "response", "Lai/kudi/agent/transactions/domain/dto/TerminalConnectionResponse;", "transaction", "Ljava/util/HashMap;", "Lai/kudi/agent/transactions/domain/dto/Transaction;", SendReceiptToTerminalConfirmationBottomSheet.STATE, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transactions.ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet$Companion */
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
        public static /* synthetic */ SendReceiptToTerminalConfirmationBottomSheet newInstance$default(Companion companion, TerminalConnectionResponse $r2, HashMap $r3, String $r4, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $r2 = null;
            }
            int $i12 = i & 2;
            if ($i12 != 0) {
                $r3 = null;
            }
            int $i0 = i & 4;
            if ($i0 != 0) {
                $r4 = SendReceiptToTerminalConfirmationBottomSheet.SUCCESSFUL_CONNECTION_STATE;
            }
            SendReceiptToTerminalConfirmationBottomSheet $r0 = companion.newInstance($r2, $r3, $r4);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final SendReceiptToTerminalConfirmationBottomSheet newInstance(TerminalConnectionResponse terminalConnectionResponse, HashMap hashMap, String str) {
            Log_OC.getArray(str, SendReceiptToTerminalConfirmationBottomSheet.STATE);
            SendReceiptToTerminalConfirmationBottomSheet r8 = new SendReceiptToTerminalConfirmationBottomSheet();
            C13287o $r6 = C13664u.m4227a(SendReceiptToTerminalConfirmationBottomSheet.CONNECTION_RESPONSE, terminalConnectionResponse);
            C13287o $r62 = C13664u.m4227a(SendReceiptToTerminalConfirmationBottomSheet.TRANSACTION_PARAM, hashMap);
            C13287o $r63 = C13664u.m4227a(SendReceiptToTerminalConfirmationBottomSheet.STATE, str);
            C13287o[] $r5 = {$r6, $r62, $r63};
            Bundle $r7 = C1372b.m36174a($r5);
            Fragment r9 = (Fragment) r8;
            r9.setArguments($r7);
            return r8;
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
    public SendReceiptToTerminalConfirmationBottomSheet() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
        this.state = SUCCESSFUL_CONNECTION_STATE;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void applyBinding() {
        SendReceiptToTerminalBottomSheetBinding $r1 = requireBinding();
        String $r2 = this.state;
        boolean $z0 = Log_OC.append($r2, FAILED_CONNECTION_STATE);
        if ($z0) {
            TextView $r3 = $r1.completeButton;
            Log_OC.loadImage($r3, "completeButton");
            ViewExtKt.hide$default($r3, false, 1, null);
            TextView $r32 = $r1.closeButton;
            Log_OC.loadImage($r32, "closeButton");
            ViewExtKt.show($r32);
            $r1.closeButton.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactions.ui.bottomsheet.SearchResultsActivity$1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SendReceiptToTerminalConfirmationBottomSheet $r22 = SendReceiptToTerminalConfirmationBottomSheet.this;
                    SendReceiptToTerminalConfirmationBottomSheet.m41253applyBinding$lambda6$lambda1($r22, view);
                }
            });
            TextView $r33 = $r1.titleTextView;
            Fragment r13 = (Fragment) this;
            String $r22 = r13.getString(C0001R.string.failed_to_send);
            $r33.setText($r22);
            TextView $r34 = $r1.titleTextView;
            Fragment r132 = (Fragment) this;
            Context $r5 = r132.requireContext();
            Log_OC.loadImage($r5, "requireContext()");
            int $i0 = ContextExtKt.getKudiColor($r5, C0001R.color.KudiRed);
            $r34.setTextColor($i0);
            TextView $r6 = $r1.descriptionTextView;
            Fragment r133 = (Fragment) this;
            CharSequence $r23 = r133.getString(C0001R.string.due_to_network);
            $r6.setText($r23);
            ImageView $r7 = $r1.iconView;
            $r7.setImageResource(C0001R.C0002drawable.ic_pos_machine_fails);
        }
        String $r24 = this.state;
        boolean $z02 = Log_OC.append($r24, SUCCESSFUL_CONNECTION_STATE);
        if ($z02) {
            $r1.completeButton.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactions.ui.bottomsheet.c
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SendReceiptToTerminalConfirmationBottomSheet $r25 = SendReceiptToTerminalConfirmationBottomSheet.this;
                    SendReceiptToTerminalConfirmationBottomSheet.m41254applyBinding$lambda6$lambda4($r25, view);
                }
            });
        }
        ImageView $r72 = $r1.cancelButton;
        $r72.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactions.ui.bottomsheet.NoteEditor$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SendReceiptToTerminalConfirmationBottomSheet $r25 = SendReceiptToTerminalConfirmationBottomSheet.this;
                SendReceiptToTerminalConfirmationBottomSheet.m41255applyBinding$lambda6$lambda5($r25, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: applyBinding$lambda-6$lambda-1  reason: not valid java name */
    public static final void m41253applyBinding$lambda6$lambda1(SendReceiptToTerminalConfirmationBottomSheet sendReceiptToTerminalConfirmationBottomSheet, View view) {
        Log_OC.getArray(sendReceiptToTerminalConfirmationBottomSheet, "this$0");
        sendReceiptToTerminalConfirmationBottomSheet.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: applyBinding$lambda-6$lambda-4  reason: not valid java name */
    public static final void m41254applyBinding$lambda6$lambda4(SendReceiptToTerminalConfirmationBottomSheet sendReceiptToTerminalConfirmationBottomSheet, View view) {
        TerminalConnectionResponse $r0;
        Log_OC.getArray(sendReceiptToTerminalConfirmationBottomSheet, "this$0");
        HashMap $r4 = sendReceiptToTerminalConfirmationBottomSheet.transaction;
        if ($r4 == null || ($r0 = sendReceiptToTerminalConfirmationBottomSheet.connectionResponse) == null) {
            return;
        }
        SendReceiptToTerminalViewModel $r1 = sendReceiptToTerminalConfirmationBottomSheet.getSendReceiptToTerminalViewModel();
        $r1.verifyConnectionAndSendReceipt($r0, $r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: applyBinding$lambda-6$lambda-5  reason: not valid java name */
    public static final void m41255applyBinding$lambda6$lambda5(SendReceiptToTerminalConfirmationBottomSheet sendReceiptToTerminalConfirmationBottomSheet, View view) {
        Log_OC.getArray(sendReceiptToTerminalConfirmationBottomSheet, "this$0");
        sendReceiptToTerminalConfirmationBottomSheet.dismissAllowingStateLoss();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMvvmBottomSheetFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        SendReceiptToTerminalViewData $r2 = (SendReceiptToTerminalViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(SendReceiptToTerminalViewData sendReceiptToTerminalViewData) {
        Log_OC.getArray(sendReceiptToTerminalViewData, "viewData");
        boolean $z0 = sendReceiptToTerminalViewData instanceof SendReceiptToTerminalViewData.Error;
        if ($z0) {
            Fragment r10 = (Fragment) this;
            Context $r2 = r10.requireContext();
            Log_OC.loadImage($r2, "requireContext()");
            SendReceiptToTerminalViewData.Error $r3 = (SendReceiptToTerminalViewData.Error) sendReceiptToTerminalViewData;
            String $r4 = $r3.getMessage();
            ContextExtKt.toast$default($r2, $r4, 0, 2, (Object) null);
            return;
        }
        SendReceiptToTerminalViewData.Initial $r5 = SendReceiptToTerminalViewData.Initial.INSTANCE;
        boolean $z02 = Log_OC.append(sendReceiptToTerminalViewData, $r5);
        if ($z02) {
            return;
        }
        boolean $z03 = sendReceiptToTerminalViewData instanceof SendReceiptToTerminalViewData.Loading;
        if ($z03) {
            SendReceiptToTerminalBottomSheetBinding $r6 = requireBinding();
            TextView $r7 = $r6.completeButton;
            Log_OC.loadImage($r7, "completeButton");
            ViewExtKt.hide$default($r7, false, 1, null);
            ProgressBar $r8 = $r6.progressBar;
            Log_OC.loadImage($r8, "progressBar");
            ViewExtKt.show($r8);
            return;
        }
        boolean $z04 = sendReceiptToTerminalViewData instanceof SendReceiptToTerminalViewData.HideLoading;
        if ($z04) {
            SendReceiptToTerminalBottomSheetBinding $r62 = requireBinding();
            TextView $r72 = $r62.completeButton;
            Log_OC.loadImage($r72, "completeButton");
            ViewExtKt.show($r72);
            ProgressBar $r82 = $r62.progressBar;
            Log_OC.loadImage($r82, "progressBar");
            ViewExtKt.hide$default($r82, false, 1, null);
            return;
        }
        boolean $z05 = sendReceiptToTerminalViewData instanceof SendReceiptToTerminalViewData.ReceiptSent;
        if ($z05) {
            SendReceiptToTerminalBottomSheetBinding $r63 = requireBinding();
            TextView $r73 = $r63.completeButton;
            Log_OC.loadImage($r73, "completeButton");
            ViewExtKt.hide$default($r73, false, 1, null);
            TextView $r9 = $r63.descriptionTextView;
            Fragment r102 = (Fragment) this;
            CharSequence $r42 = r102.getString(C0001R.string.receipt_sent_text);
            $r9.setText($r42);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMvvmBottomSheetFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        SendReceiptToTerminalViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMvvmBottomSheetFragment
    public SendReceiptToTerminalViewModel createViewModel() {
        SendReceiptToTerminalViewModel $r1 = getSendReceiptToTerminalViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public SendReceiptToTerminalBottomSheetBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        SendReceiptToTerminalBottomSheetBinding $r3 = (SendReceiptToTerminalBottomSheetBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        SendReceiptToTerminalBottomSheetBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SendReceiptToTerminalViewModel getSendReceiptToTerminalViewModel() {
        SendReceiptToTerminalViewModel $r1 = this.sendReceiptToTerminalViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("sendReceiptToTerminalViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMvvmBottomSheetFragment
    protected Class getVMType() {
        return SendReceiptToTerminalViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(SendReceiptToTerminalBottomSheetBinding sendReceiptToTerminalBottomSheetBinding, Fragment fragment) {
        Log_OC.getArray(sendReceiptToTerminalBottomSheetBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(sendReceiptToTerminalBottomSheetBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        SendReceiptToTerminalBottomSheetBinding $r4 = (SendReceiptToTerminalBottomSheetBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        Fragment r2 = (Fragment) this;
        C7429a.m18752b(r2);
        Chapter r3 = (Chapter) this;
        super/*androidx.fragment.app.Chapter*/.onAttach(context);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onCreate(Bundle bundle) {
        Chapter r8 = (Chapter) this;
        super/*androidx.fragment.app.Chapter*/.onCreate(bundle);
        Chapter r82 = (Chapter) this;
        r82.setStyle(0, C0001R.style.CustomBottomSheetDialogTheme);
        Fragment r9 = (Fragment) this;
        Bundle $r1 = r9.getArguments();
        if ($r1 == null) {
            return;
        }
        String $r2 = $r1.getString(STATE);
        String $r3 = $r2;
        if ($r2 == null) {
            $r3 = SUCCESSFUL_CONNECTION_STATE;
        }
        this.state = $r3;
        Parcelable $r4 = $r1.getParcelable(CONNECTION_RESPONSE);
        TerminalConnectionResponse $r5 = (TerminalConnectionResponse) $r4;
        this.connectionResponse = $r5;
        Serializable $r6 = $r1.getSerializable(TRANSACTION_PARAM);
        boolean $z0 = $r6 instanceof HashMap;
        HashMap $r7 = $z0 ? (HashMap) $r6 : null;
        this.transaction = $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        Fragment r6 = (Fragment) this;
        LayoutInflater $r2 = r6.getLayoutInflater();
        SendReceiptToTerminalBottomSheetBinding $r4 = SendReceiptToTerminalBottomSheetBinding.inflate($r2);
        Log_OC.loadImage($r4, "inflate(layoutInflater)");
        Fragment r62 = (Fragment) this;
        View $r5 = initBinding($r4, r62);
        return $r5;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        applyBinding();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public SendReceiptToTerminalBottomSheetBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        SendReceiptToTerminalBottomSheetBinding $r3 = (SendReceiptToTerminalBottomSheetBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        SendReceiptToTerminalBottomSheetBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setSendReceiptToTerminalViewModel(SendReceiptToTerminalViewModel sendReceiptToTerminalViewModel) {
        Log_OC.getArray(sendReceiptToTerminalViewModel, "<set-?>");
        this.sendReceiptToTerminalViewModel = sendReceiptToTerminalViewModel;
    }
}

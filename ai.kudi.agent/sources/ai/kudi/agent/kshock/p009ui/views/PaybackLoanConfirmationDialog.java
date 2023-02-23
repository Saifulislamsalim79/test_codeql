package ai.kudi.agent.kshock.p009ui.views;

import ai.kudi.agent.feature_kshock.C0220R;
import ai.kudi.agent.feature_kshock.databinding.PayBackLoanDialogBinding;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0936d;
import androidx.core.p058os.C1372b;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.FragmentActivity;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: PaybackLoanConfirmationDialog.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0014"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/views/PaybackLoanConfirmationDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "listener", "Lai/kudi/agent/kshock/ui/views/PaybackLoanConfirmationDialog$PaybackLoanConfirmationDialogListener;", "getListener$feature_kshock_release", "()Lai/kudi/agent/kshock/ui/views/PaybackLoanConfirmationDialog$PaybackLoanConfirmationDialogListener;", "setListener$feature_kshock_release", "(Lai/kudi/agent/kshock/ui/views/PaybackLoanConfirmationDialog$PaybackLoanConfirmationDialogListener;)V", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "setupDialog", "", "dialog", "style", "", "Companion", "PaybackLoanConfirmationDialogListener", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.kshock.ui.views.PaybackLoanConfirmationDialog */
/* loaded from: classes.dex */
public final class PaybackLoanConfirmationDialog extends Chapter {
    public static final Companion Companion;
    public static final String SQL_UPDATE_6_4 = "AMOUNT";
    public PaybackLoanConfirmationDialogListener listener;

    /* compiled from: PaybackLoanConfirmationDialog.kt */
    @Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/views/PaybackLoanConfirmationDialog$Companion;", "", "()V", "AMT", "", "newInstance", "Lai/kudi/agent/kshock/ui/views/PaybackLoanConfirmationDialog;", TransactionField.AMOUNT, "listener", "Lai/kudi/agent/kshock/ui/views/PaybackLoanConfirmationDialog$PaybackLoanConfirmationDialogListener;", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.kshock.ui.views.PaybackLoanConfirmationDialog$Companion */
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
        public final PaybackLoanConfirmationDialog newInstance(String str, PaybackLoanConfirmationDialogListener paybackLoanConfirmationDialogListener) {
            Log_OC.getArray(str, TransactionField.AMOUNT);
            Log_OC.getArray(paybackLoanConfirmationDialogListener, "listener");
            PaybackLoanConfirmationDialog $r3 = new PaybackLoanConfirmationDialog();
            C13287o $r5 = C13664u.m4227a(PaybackLoanConfirmationDialog.SQL_UPDATE_6_4, str);
            C13287o[] $r4 = {$r5};
            Bundle $r6 = C1372b.m36174a($r4);
            $r3.setArguments($r6);
            $r3.setListener$feature_kshock_release(paybackLoanConfirmationDialogListener);
            return $r3;
        }
    }

    /* compiled from: PaybackLoanConfirmationDialog.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/views/PaybackLoanConfirmationDialog$PaybackLoanConfirmationDialogListener;", "", "onCancelClicked", "", "dialogFragment", "Lai/kudi/agent/kshock/ui/views/PaybackLoanConfirmationDialog;", "onProceedClicked", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.kshock.ui.views.PaybackLoanConfirmationDialog$PaybackLoanConfirmationDialogListener */
    /* loaded from: classes.dex */
    public interface PaybackLoanConfirmationDialogListener {
        void onCancelClicked(PaybackLoanConfirmationDialog paybackLoanConfirmationDialog);

        void onProceedClicked(PaybackLoanConfirmationDialog paybackLoanConfirmationDialog);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onCreateDialog$lambda-2$lambda-0  reason: not valid java name */
    public static final void m39676onCreateDialog$lambda2$lambda0(PaybackLoanConfirmationDialog paybackLoanConfirmationDialog, View view) {
        Log_OC.getArray(paybackLoanConfirmationDialog, "this$0");
        PaybackLoanConfirmationDialogListener $r1 = paybackLoanConfirmationDialog.getListener$feature_kshock_release();
        $r1.onProceedClicked(paybackLoanConfirmationDialog);
        paybackLoanConfirmationDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onCreateDialog$lambda-2$lambda-1  reason: not valid java name */
    public static final void m39677onCreateDialog$lambda2$lambda1(PaybackLoanConfirmationDialog paybackLoanConfirmationDialog, View view) {
        Log_OC.getArray(paybackLoanConfirmationDialog, "this$0");
        PaybackLoanConfirmationDialogListener $r1 = paybackLoanConfirmationDialog.getListener$feature_kshock_release();
        $r1.onCancelClicked(paybackLoanConfirmationDialog);
        paybackLoanConfirmationDialog.dismiss();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PaybackLoanConfirmationDialogListener getListener$feature_kshock_release() {
        PaybackLoanConfirmationDialogListener $r1 = this.listener;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("listener");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Chapter
    public Dialog onCreateDialog(Bundle bundle) {
        FragmentActivity $r2 = requireActivity();
        LayoutInflater $r3 = $r2.getLayoutInflater();
        PayBackLoanDialogBinding $r4 = PayBackLoanDialogBinding.inflate($r3);
        Log_OC.loadImage($r4, "inflate(requireActivity().layoutInflater)");
        Bundle $r1 = requireArguments();
        String $r5 = $r1.getString(SQL_UPDATE_6_4);
        TextView $r6 = $r4.amountText;
        $r6.setText($r5);
        TextView $r62 = $r4.cancelConfirmationTextView;
        int $i0 = C0220R.string.cancel_confirmation_text;
        Object[] $r7 = {$r5};
        $r62.setText(getString($i0, $r7));
        ViewGroup $r8 = $r4.proceedButton;
        ViewGroup r17 = $r8;
        r17.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.kshock.ui.views.BitmapFragment$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaybackLoanConfirmationDialog $r22 = PaybackLoanConfirmationDialog.this;
                PaybackLoanConfirmationDialog.m39676onCreateDialog$lambda2$lambda0($r22, view);
            }
        });
        TextView $r63 = $r4.cancelButton;
        $r63.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.kshock.ui.views.NavitAddressSearchActivity$7
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaybackLoanConfirmationDialog $r22 = PaybackLoanConfirmationDialog.this;
                PaybackLoanConfirmationDialog.m39677onCreateDialog$lambda2$lambda1($r22, view);
            }
        });
        FragmentActivity $r22 = requireActivity();
        DialogInterfaceC0936d.C0937a r16 = new DialogInterfaceC0936d.C0937a($r22);
        View $r12 = $r4.getRoot();
        View r18 = $r12;
        DialogInterfaceC0936d.C0937a $r11 = r16.setView(r18);
        Dialog $r13 = $r11.create();
        Log_OC.loadImage($r13, "Builder(requireActivity())\n            .setView(binding.root).create()");
        Dialog r19 = $r13;
        return r19;
    }

    public final void setListener$feature_kshock_release(PaybackLoanConfirmationDialogListener paybackLoanConfirmationDialogListener) {
        Log_OC.getArray(paybackLoanConfirmationDialogListener, "<set-?>");
        this.listener = paybackLoanConfirmationDialogListener;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Chapter
    public void setupDialog(Dialog dialog, int i) {
        Log_OC.getArray(dialog, "dialog");
        Window $r1 = dialog.getWindow();
        if ($r1 == null) {
            return;
        }
        ColorDrawable $r3 = new ColorDrawable(0);
        $r1.setBackgroundDrawable($r3);
    }
}

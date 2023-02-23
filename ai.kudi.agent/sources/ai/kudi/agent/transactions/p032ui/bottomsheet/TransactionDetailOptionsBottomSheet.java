package ai.kudi.agent.transactions.p032ui.bottomsheet;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.databinding.BottomSheetShareTransactionBinding;
import ai.kudi.agent.transactions.p032ui.bottomsheet.TransactionDetailOptionsBottomSheet;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.bottomsheet.DialogC4547a;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: TransactionDetailOptionsBottomSheet.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/transactions/ui/bottomsheet/TransactionDetailOptionsBottomSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "context", "Landroid/content/Context;", "listener", "Lai/kudi/agent/transactions/ui/bottomsheet/TransactionDetailOptionsBottomSheet$OnShareActionListener;", "(Landroid/content/Context;Lai/kudi/agent/transactions/ui/bottomsheet/TransactionDetailOptionsBottomSheet$OnShareActionListener;)V", "OnShareActionListener", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactions.ui.bottomsheet.TransactionDetailOptionsBottomSheet */
/* loaded from: classes.dex */
public final class TransactionDetailOptionsBottomSheet extends DialogC4547a {

    /* compiled from: TransactionDetailOptionsBottomSheet.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/transactions/ui/bottomsheet/TransactionDetailOptionsBottomSheet$OnShareActionListener;", "", "onDownloadPdf", "", "onRaiseComplaints", "onRefresh", "onShare", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transactions.ui.bottomsheet.TransactionDetailOptionsBottomSheet$OnShareActionListener */
    /* loaded from: classes.dex */
    public interface OnShareActionListener {
        void onDownloadPdf();

        void onRaiseComplaints();

        void onRefresh();

        void onShare();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionDetailOptionsBottomSheet(Context context, final OnShareActionListener onShareActionListener) {
        super(context, C0001R.style.FilterListDialog);
        Log_OC.getArray(context, "context");
        Log_OC.getArray(onShareActionListener, "listener");
        TransactionDetailOptionsBottomSheet r15 = this;
        LayoutInflater $r3 = r15.getLayoutInflater();
        BottomSheetShareTransactionBinding $r4 = BottomSheetShareTransactionBinding.inflate($r3, null, false);
        Log_OC.loadImage($r4, "inflate(layoutInflater, null, false)");
        LinearLayout $r5 = $r4.getRoot();
        setContentView($r5);
        TextView $r6 = $r4.downloadAsPdfView;
        TextView r16 = $r6;
        r16.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactions.ui.bottomsheet.e
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransactionDetailOptionsBottomSheet.OnShareActionListener $r2 = TransactionDetailOptionsBottomSheet.OnShareActionListener.this;
                TransactionDetailOptionsBottomSheet.m41256_init_$lambda0($r2, view);
            }
        });
        TextView $r62 = $r4.shareView;
        TextView r162 = $r62;
        r162.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactions.ui.bottomsheet.TimePicker$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransactionDetailOptionsBottomSheet.OnShareActionListener $r2 = TransactionDetailOptionsBottomSheet.OnShareActionListener.this;
                TransactionDetailOptionsBottomSheet.m41257_init_$lambda1($r2, view);
            }
        });
        TextView $r63 = $r4.raiseAComplaint;
        TextView r163 = $r63;
        r163.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactions.ui.bottomsheet.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransactionDetailOptionsBottomSheet.OnShareActionListener $r2 = TransactionDetailOptionsBottomSheet.OnShareActionListener.this;
                TransactionDetailOptionsBottomSheet.m41258_init_$lambda2($r2, view);
            }
        });
        TextView $r64 = $r4.refresh;
        TextView r164 = $r64;
        r164.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactions.ui.bottomsheet.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransactionDetailOptionsBottomSheet.OnShareActionListener $r2 = TransactionDetailOptionsBottomSheet.OnShareActionListener.this;
                TransactionDetailOptionsBottomSheet.m41259_init_$lambda3($r2, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-0  reason: not valid java name */
    public static final void m41256_init_$lambda0(OnShareActionListener onShareActionListener, View view) {
        Log_OC.getArray(onShareActionListener, "$listener");
        onShareActionListener.onDownloadPdf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-1  reason: not valid java name */
    public static final void m41257_init_$lambda1(OnShareActionListener onShareActionListener, View view) {
        Log_OC.getArray(onShareActionListener, "$listener");
        onShareActionListener.onShare();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-2  reason: not valid java name */
    public static final void m41258_init_$lambda2(OnShareActionListener onShareActionListener, View view) {
        Log_OC.getArray(onShareActionListener, "$listener");
        onShareActionListener.onRaiseComplaints();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-3  reason: not valid java name */
    public static final void m41259_init_$lambda3(OnShareActionListener onShareActionListener, View view) {
        Log_OC.getArray(onShareActionListener, "$listener");
        onShareActionListener.onRefresh();
    }
}

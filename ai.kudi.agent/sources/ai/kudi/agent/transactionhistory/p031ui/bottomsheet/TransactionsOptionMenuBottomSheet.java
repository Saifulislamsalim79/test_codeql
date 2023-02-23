package ai.kudi.agent.transactionhistory.p031ui.bottomsheet;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.BottomSheetTransactionsOptionMenuBinding;
import ai.kudi.agent.transactionhistory.p031ui.bottomsheet.TransactionsOptionMenuBottomSheet;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.bottomsheet.DialogC4547a;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: TransactionsOptionMenuBottomSheet.kt */
@Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\nB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\t¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/ui/bottomsheet/TransactionsOptionMenuBottomSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "context", "Landroid/content/Context;", "listener", "Lai/kudi/agent/transactionhistory/ui/bottomsheet/TransactionsOptionMenuBottomSheet$OnActionListener;", "shouldShowManageOutletOption", "", "shouldShowPendingKycCheck", "(Landroid/content/Context;Lai/kudi/agent/transactionhistory/ui/bottomsheet/TransactionsOptionMenuBottomSheet$OnActionListener;ZZ)V", "OnActionListener", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactionhistory.ui.bottomsheet.TransactionsOptionMenuBottomSheet */
/* loaded from: classes.dex */
public final class TransactionsOptionMenuBottomSheet extends DialogC4547a {

    /* compiled from: TransactionsOptionMenuBottomSheet.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/ui/bottomsheet/TransactionsOptionMenuBottomSheet$OnActionListener;", "", "onEmailTransactionReport", "", "onManageOutlet", "onPendingTransactions", "onRequestAccountStatement", "onWalletCashout", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transactionhistory.ui.bottomsheet.TransactionsOptionMenuBottomSheet$OnActionListener */
    /* loaded from: classes.dex */
    public interface OnActionListener {
        void onEmailTransactionReport();

        void onManageOutlet();

        void onPendingTransactions();

        void onRequestAccountStatement();

        void onWalletCashout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionsOptionMenuBottomSheet(Context context, final OnActionListener onActionListener, boolean z, boolean z2) {
        super(context, C0001R.style.FilterListDialog);
        Log_OC.getArray(context, "context");
        Log_OC.getArray(onActionListener, "listener");
        TransactionsOptionMenuBottomSheet r18 = this;
        LayoutInflater $r3 = r18.getLayoutInflater();
        BottomSheetTransactionsOptionMenuBinding $r4 = BottomSheetTransactionsOptionMenuBinding.inflate($r3, null, false);
        Log_OC.loadImage($r4, "inflate(layoutInflater, null, false)");
        LinearLayout $r5 = $r4.getRoot();
        setContentView($r5);
        if (z) {
            View $r6 = $r4.manageOutletView;
            Log_OC.loadImage($r6, "manageOutletView");
            ViewExtKt.show($r6);
            View $r7 = $r4.manageOutletViewDivider;
            Log_OC.loadImage($r7, "manageOutletViewDivider");
            ViewExtKt.show($r7);
            View $r62 = $r4.walletCashoutView;
            Log_OC.loadImage($r62, "walletCashoutView");
            ViewExtKt.hide$default($r62, false, 1, null);
            View $r72 = $r4.walletCashoutViewDivider;
            Log_OC.loadImage($r72, "walletCashoutViewDivider");
            ViewExtKt.hide$default($r72, false, 1, null);
            View $r63 = $r4.emailReportView;
            Log_OC.loadImage($r63, "emailReportView");
            ViewExtKt.hide$default($r63, false, 1, null);
            View $r73 = $r4.emailReportViewDivider;
            Log_OC.loadImage($r73, "emailReportViewDivider");
            ViewExtKt.hide$default($r73, false, 1, null);
        }
        if (!z2) {
            View $r64 = $r4.pendingTransactionView;
            Log_OC.loadImage($r64, "pendingTransactionView");
            ViewExtKt.hide$default($r64, false, 1, null);
            View $r74 = $r4.pendingTransactionViewDivider;
            Log_OC.loadImage($r74, "pendingTransactionViewDivider");
            ViewExtKt.hide$default($r74, false, 1, null);
        }
        TextView $r65 = $r4.requestAccountStatementView;
        TextView r19 = $r65;
        r19.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactionhistory.ui.bottomsheet.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransactionsOptionMenuBottomSheet.OnActionListener $r2 = TransactionsOptionMenuBottomSheet.OnActionListener.this;
                TransactionsOptionMenuBottomSheet $r32 = this;
                TransactionsOptionMenuBottomSheet.m41063lambda5$lambda0($r2, $r32, view);
            }
        });
        TextView $r66 = $r4.emailReportView;
        TextView r192 = $r66;
        r192.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactionhistory.ui.bottomsheet.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransactionsOptionMenuBottomSheet.OnActionListener $r2 = TransactionsOptionMenuBottomSheet.OnActionListener.this;
                TransactionsOptionMenuBottomSheet $r32 = this;
                TransactionsOptionMenuBottomSheet.m41064lambda5$lambda1($r2, $r32, view);
            }
        });
        TextView $r67 = $r4.walletCashoutView;
        TextView r193 = $r67;
        r193.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactionhistory.ui.bottomsheet.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransactionsOptionMenuBottomSheet.OnActionListener $r2 = TransactionsOptionMenuBottomSheet.OnActionListener.this;
                TransactionsOptionMenuBottomSheet $r32 = this;
                TransactionsOptionMenuBottomSheet.m41065lambda5$lambda2($r2, $r32, view);
            }
        });
        TextView $r68 = $r4.pendingTransactionView;
        TextView r194 = $r68;
        r194.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactionhistory.ui.bottomsheet.e
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransactionsOptionMenuBottomSheet.OnActionListener $r2 = TransactionsOptionMenuBottomSheet.OnActionListener.this;
                TransactionsOptionMenuBottomSheet $r32 = this;
                TransactionsOptionMenuBottomSheet.m41066lambda5$lambda3($r2, $r32, view);
            }
        });
        TextView $r69 = $r4.manageOutletView;
        TextView r195 = $r69;
        r195.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactionhistory.ui.bottomsheet.c
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransactionsOptionMenuBottomSheet.OnActionListener $r2 = TransactionsOptionMenuBottomSheet.OnActionListener.this;
                TransactionsOptionMenuBottomSheet $r32 = this;
                TransactionsOptionMenuBottomSheet.m41067lambda5$lambda4($r2, $r32, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TransactionsOptionMenuBottomSheet(android.content.Context r1, ai.kudi.agent.transactionhistory.p031ui.bottomsheet.TransactionsOptionMenuBottomSheet.OnActionListener r2, boolean r3, boolean r4, int r5, kotlin.p483e0.p485d.DBUtils$1 r6) {
        /*
            r0 = this;
            r5 = r5 & 4
            if (r5 == 0) goto L5
            r3 = 0
        L5:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactionhistory.p031ui.bottomsheet.TransactionsOptionMenuBottomSheet.<init>(android.content.Context, ai.kudi.agent.transactionhistory.ui.bottomsheet.TransactionsOptionMenuBottomSheet$OnActionListener, boolean, boolean, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: lambda-5$lambda-0  reason: not valid java name */
    public static final void m41063lambda5$lambda0(OnActionListener onActionListener, TransactionsOptionMenuBottomSheet transactionsOptionMenuBottomSheet, View view) {
        Log_OC.getArray(onActionListener, "$listener");
        Log_OC.getArray(transactionsOptionMenuBottomSheet, "this$0");
        onActionListener.onRequestAccountStatement();
        TransactionsOptionMenuBottomSheet r3 = transactionsOptionMenuBottomSheet;
        r3.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: lambda-5$lambda-1  reason: not valid java name */
    public static final void m41064lambda5$lambda1(OnActionListener onActionListener, TransactionsOptionMenuBottomSheet transactionsOptionMenuBottomSheet, View view) {
        Log_OC.getArray(onActionListener, "$listener");
        Log_OC.getArray(transactionsOptionMenuBottomSheet, "this$0");
        onActionListener.onEmailTransactionReport();
        TransactionsOptionMenuBottomSheet r3 = transactionsOptionMenuBottomSheet;
        r3.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: lambda-5$lambda-2  reason: not valid java name */
    public static final void m41065lambda5$lambda2(OnActionListener onActionListener, TransactionsOptionMenuBottomSheet transactionsOptionMenuBottomSheet, View view) {
        Log_OC.getArray(onActionListener, "$listener");
        Log_OC.getArray(transactionsOptionMenuBottomSheet, "this$0");
        onActionListener.onWalletCashout();
        TransactionsOptionMenuBottomSheet r3 = transactionsOptionMenuBottomSheet;
        r3.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: lambda-5$lambda-3  reason: not valid java name */
    public static final void m41066lambda5$lambda3(OnActionListener onActionListener, TransactionsOptionMenuBottomSheet transactionsOptionMenuBottomSheet, View view) {
        Log_OC.getArray(onActionListener, "$listener");
        Log_OC.getArray(transactionsOptionMenuBottomSheet, "this$0");
        onActionListener.onPendingTransactions();
        TransactionsOptionMenuBottomSheet r3 = transactionsOptionMenuBottomSheet;
        r3.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: lambda-5$lambda-4  reason: not valid java name */
    public static final void m41067lambda5$lambda4(OnActionListener onActionListener, TransactionsOptionMenuBottomSheet transactionsOptionMenuBottomSheet, View view) {
        Log_OC.getArray(onActionListener, "$listener");
        Log_OC.getArray(transactionsOptionMenuBottomSheet, "this$0");
        onActionListener.onManageOutlet();
        TransactionsOptionMenuBottomSheet r3 = transactionsOptionMenuBottomSheet;
        r3.dismiss();
    }
}

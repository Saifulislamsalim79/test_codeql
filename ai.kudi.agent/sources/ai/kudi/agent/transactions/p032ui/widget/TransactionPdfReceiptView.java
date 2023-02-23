package ai.kudi.agent.transactions.p032ui.widget;

import ai.kudi.agent.databinding.ViewTransactionPdfReceiptBinding;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: TransactionPdfReceiptView.kt */
@Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ*\u0010\u000f\u001a\u00020\u00102\"\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012j\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013`\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0015"}, m10421d2 = {"Lai/kudi/agent/transactions/ui/widget/TransactionPdfReceiptView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lai/kudi/agent/databinding/ViewTransactionPdfReceiptBinding;", "getBinding", "()Lai/kudi/agent/databinding/ViewTransactionPdfReceiptBinding;", "setBinding", "(Lai/kudi/agent/databinding/ViewTransactionPdfReceiptBinding;)V", "bindData", "", "transaction", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactions.ui.widget.TransactionPdfReceiptView */
/* loaded from: classes.dex */
public final class TransactionPdfReceiptView extends LinearLayout {
    private ViewTransactionPdfReceiptBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransactionPdfReceiptView(Context context) {
        this(context, null, 0, 6, null);
        Log_OC.getArray(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransactionPdfReceiptView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Log_OC.getArray(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionPdfReceiptView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Log_OC.getArray(context, "context");
        LayoutInflater $r3 = LayoutInflater.from(context);
        ViewTransactionPdfReceiptBinding $r4 = ViewTransactionPdfReceiptBinding.inflate($r3, this, true);
        this.binding = $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TransactionPdfReceiptView(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5, kotlin.p483e0.p485d.DBUtils$1 r6) {
        /*
            r1 = this;
            r0 = r5 & 2
            if (r0 == 0) goto L5
            r3 = 0
        L5:
            r5 = r5 & 4
            if (r5 == 0) goto La
            r4 = 0
        La:
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactions.p032ui.widget.TransactionPdfReceiptView.<init>(android.content.Context, android.util.AttributeSet, int, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:82:0x0419 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x057b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindData(java.util.HashMap r50) {
        /*
            Method dump skipped, instructions count: 1458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactions.p032ui.widget.TransactionPdfReceiptView.bindData(java.util.HashMap):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ViewTransactionPdfReceiptBinding getBinding() {
        ViewTransactionPdfReceiptBinding r1 = this.binding;
        return r1;
    }

    public final void setBinding(ViewTransactionPdfReceiptBinding viewTransactionPdfReceiptBinding) {
        this.binding = viewTransactionPdfReceiptBinding;
    }
}

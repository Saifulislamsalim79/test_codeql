package ai.kudi.agent.transactions.p032ui;

import java.io.OutputStream;
import java.util.HashMap;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TransactionDetailsActivity.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Ljava/io/OutputStream;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactions.ui.TransactionDetailsActivity$onPrinterClick$1 */
/* loaded from: classes.dex */
public final class TransactionDetailsActivity$onPrinterClick$1 extends AbstractC11802m implements InterfaceC11767l<OutputStream, C13666w> {
    final /* synthetic */ String $amount;
    final /* synthetic */ HashMap<String, String> $transaction;
    final /* synthetic */ String $transactionDate;
    final /* synthetic */ TransactionDetailsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionDetailsActivity$onPrinterClick$1(TransactionDetailsActivity transactionDetailsActivity, String str, HashMap hashMap, String str2) {
        super(1);
        this.this$0 = transactionDetailsActivity;
        this.$amount = str;
        this.$transaction = hashMap;
        this.$transactionDate = str2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(OutputStream outputStream) {
        OutputStream $r2 = outputStream;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01e3, code lost:
        if (r0.get(ai.kudi.agent.transactions.p032ui.widget.TransactionField.CUSTOMER_PHONE_NUMBER) != null) goto L56;
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2(java.io.OutputStream r42) {
        /*
            Method dump skipped, instructions count: 2030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactions.p032ui.TransactionDetailsActivity$onPrinterClick$1.invoke2(java.io.OutputStream):void");
    }
}

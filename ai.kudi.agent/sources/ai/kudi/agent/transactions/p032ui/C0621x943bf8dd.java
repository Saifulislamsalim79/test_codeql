package ai.kudi.agent.transactions.p032ui;

import ai.kudi.agent.databinding.ActivityTransactionEmailReportBinding;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.transactions.presenters.EmailTransactionReportPresenter;
import ai.kudi.dip.library.edittext.KudiInputField;
import java.util.Map;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13727r0;
import p201g.p270x.InterfaceC8209a;
/* compiled from: EmailTransactionReportActivity.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "email", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactions.ui.EmailTransactionReportActivity$showBottomSheet$emailAddressBottomSheet$1 */
/* loaded from: classes.dex */
final class C0621x943bf8dd extends AbstractC11802m implements InterfaceC11767l<String, C13666w> {
    final /* synthetic */ EmailTransactionReportActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0621x943bf8dd(EmailTransactionReportActivity emailTransactionReportActivity) {
        super(1);
        this.this$0 = emailTransactionReportActivity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(String str) {
        String $r2 = str;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        Map $r10;
        Log_OC.getArray(str, "email");
        EmailTransactionReportActivity $r2 = this.this$0;
        EmailTransactionReportPresenter $r3 = $r2.getThisPresenter();
        EmailTransactionReportActivity $r22 = this.this$0;
        String $r5 = $r22.getTransactionType();
        C13287o $r6 = C13664u.m4227a("type", $r5);
        EmailTransactionReportActivity $r23 = this.this$0;
        String $r52 = $r23.getStatusType();
        C13287o $r62 = C13664u.m4227a(TransactionField.STATUS, $r52);
        C13287o $r63 = C13664u.m4227a("email", str);
        EmailTransactionReportActivity $r24 = this.this$0;
        InterfaceC8209a $r7 = $r24.getBinding();
        ActivityTransactionEmailReportBinding $r8 = (ActivityTransactionEmailReportBinding) $r7;
        KudiInputField $r9 = $r8.toDateview;
        String $r1 = $r9.getText();
        C13287o $r64 = C13664u.m4227a("to", $r1);
        EmailTransactionReportActivity $r25 = this.this$0;
        String $r12 = $r25.getTransactionType();
        C13287o $r65 = C13664u.m4227a("type", $r12);
        EmailTransactionReportActivity $r26 = this.this$0;
        InterfaceC8209a $r72 = $r26.getBinding();
        ActivityTransactionEmailReportBinding $r82 = (ActivityTransactionEmailReportBinding) $r72;
        KudiInputField $r92 = $r82.fromDateView;
        String $r13 = $r92.getText();
        C13287o $r66 = C13664u.m4227a("from", $r13);
        C13287o[] $r4 = {$r6, $r62, $r63, $r64, $r65, $r66};
        $r10 = C13727r0.m3877o($r4);
        $r3.sendFilteredTransactionToMail($r10);
    }
}

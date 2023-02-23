package ai.kudi.agent.transactions.p032ui;

import ai.kudi.dip.library.edittext.KudiInputField;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import p590o.p591a.Timber;
/* compiled from: EmailTransactionReportActivity.kt */
@Metadata(m10422d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m10421d2 = {"<anonymous>", "", "selectedStatusOrType", "", "selectedPosition", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactions.ui.EmailTransactionReportActivity$performClick$1 */
/* loaded from: classes.dex */
final class EmailTransactionReportActivity$performClick$1 extends AbstractC11802m implements InterfaceC11771p<String, Integer, C13666w> {
    final /* synthetic */ KudiInputField $kudiInputField;
    final /* synthetic */ SelectStatusOrTypeFragment $selectStatusOrTypeFragment;
    final /* synthetic */ EmailTransactionReportActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailTransactionReportActivity$performClick$1(EmailTransactionReportActivity emailTransactionReportActivity, KudiInputField kudiInputField, SelectStatusOrTypeFragment selectStatusOrTypeFragment) {
        super(2);
        this.this$0 = emailTransactionReportActivity;
        this.$kudiInputField = kudiInputField;
        this.$selectStatusOrTypeFragment = selectStatusOrTypeFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11771p
    public /* bridge */ /* synthetic */ C13666w invoke(String str, Integer num) {
        String $r3 = str;
        Integer $r4 = num;
        int $i0 = $r4.intValue();
        invoke($r3, $i0);
        C13666w r5 = C13666w.f30112a;
        return r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void invoke(String str, int i) {
        Log_OC.getArray(str, "selectedStatusOrType");
        String $r2 = Log_OC.m10359a("Id Type ", (Object) str);
        Object[] $r3 = new Object[0];
        Timber.m1627e($r2, $r3);
        EmailTransactionReportActivity $r4 = this.this$0;
        $r4.setStatusOrType(str);
        EmailTransactionReportActivity $r42 = this.this$0;
        $r42.setPosition(i);
        KudiInputField $r5 = this.$kudiInputField;
        EmailTransactionReportActivity $r43 = this.this$0;
        String $r1 = $r43.getStatusOrType();
        $r5.setText($r1);
        SelectStatusOrTypeFragment $r6 = this.$selectStatusOrTypeFragment;
        $r6.dismiss();
    }
}

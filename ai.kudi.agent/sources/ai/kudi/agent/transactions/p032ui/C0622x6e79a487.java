package ai.kudi.agent.transactions.p032ui;

import ai.kudi.agent.databinding.ActivityRequestStatementBinding;
import ai.kudi.agent.transactions.presenters.RequestStatementPresenter;
import ai.kudi.dip.library.edittext.KudiInputField;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: RequestStatementActivity.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactions.ui.RequestStatementActivity$showBottomSheet$emailAddressBottomSheet$1 */
/* loaded from: classes.dex */
final class C0622x6e79a487 extends AbstractC11802m implements InterfaceC11767l<String, C13666w> {
    final /* synthetic */ RequestStatementActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0622x6e79a487(RequestStatementActivity requestStatementActivity) {
        super(1);
        this.this$0 = requestStatementActivity;
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
        Log_OC.getArray(str, "it");
        RequestStatementActivity $r2 = this.this$0;
        RequestStatementPresenter $r3 = $r2.getThisPresenter();
        RequestStatementActivity $r22 = this.this$0;
        InterfaceC8209a $r4 = $r22.getBinding();
        ActivityRequestStatementBinding $r5 = (ActivityRequestStatementBinding) $r4;
        KudiInputField $r6 = $r5.fromDateView;
        String $r7 = $r6.getText();
        RequestStatementActivity $r23 = this.this$0;
        InterfaceC8209a $r42 = $r23.getBinding();
        ActivityRequestStatementBinding $r52 = (ActivityRequestStatementBinding) $r42;
        KudiInputField $r62 = $r52.toDateview;
        String $r8 = $r62.getText();
        $r3.requestStatement(str, $r7, $r8);
    }
}

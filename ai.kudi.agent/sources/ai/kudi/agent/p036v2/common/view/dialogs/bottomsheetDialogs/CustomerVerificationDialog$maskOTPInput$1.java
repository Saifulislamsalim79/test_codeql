package ai.kudi.agent.p036v2.common.view.dialogs.bottomsheetDialogs;

import android.text.Editable;
import android.widget.EditText;
import io.intercom.android.sdk.views.holder.AttributeType;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11773r;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13277t;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CustomerVerificationDialog.kt */
@Metadata(m10422d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\n"}, m10421d2 = {"<anonymous>", "", AttributeType.TEXT, "", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "<anonymous parameter 3>"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.view.dialogs.bottomsheetDialogs.CustomerVerificationDialog$maskOTPInput$1 */
/* loaded from: classes.dex */
public final class CustomerVerificationDialog$maskOTPInput$1 extends AbstractC11802m implements InterfaceC11773r<String, Integer, Integer, Integer, C13666w> {
    final /* synthetic */ CustomerVerificationDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerVerificationDialog$maskOTPInput$1(CustomerVerificationDialog customerVerificationDialog) {
        super(4);
        this.this$0 = customerVerificationDialog;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11773r
    public /* bridge */ /* synthetic */ C13666w invoke(String str, Integer num, Integer num2, Integer num3) {
        String $r5 = str;
        Integer $r6 = num;
        int $i0 = $r6.intValue();
        Integer $r62 = num2;
        int $i1 = $r62.intValue();
        Integer $r63 = num3;
        int $i2 = $r63.intValue();
        invoke($r5, $i0, $i1, $i2);
        C13666w r7 = C13666w.f30112a;
        return r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void invoke(String str, int i, int i2, int i3) {
        CharSequence $r5;
        Log_OC.getArray(str, AttributeType.TEXT);
        CustomerVerificationDialog $r2 = this.this$0;
        EditText $r3 = $r2.etOtp;
        Editable $r4 = $r3 == null ? null : $r3.getText();
        String $r1 = String.valueOf($r4);
        if ($r1 == null) {
            NullPointerException $r6 = new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            throw $r6;
        }
        $r5 = C13277t.m5414M0($r1);
        $r2.setOtpCode($r5.toString());
    }
}

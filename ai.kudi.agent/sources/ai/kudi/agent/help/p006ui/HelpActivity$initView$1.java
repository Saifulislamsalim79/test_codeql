package ai.kudi.agent.help.p006ui;

import ai.kudi.agent.help.presenter.HelpPresenter;
import android.view.View;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: HelpActivity.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, m10421d2 = {"<anonymous>", "", "phoneNumber", "", "<anonymous parameter 1>", "Landroid/view/View;", "<anonymous parameter 2>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.help.ui.HelpActivity$initView$1 */
/* loaded from: classes.dex */
final class HelpActivity$initView$1 extends AbstractC11802m implements InterfaceC11772q<String, View, Integer, C13666w> {
    final /* synthetic */ HelpActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelpActivity$initView$1(HelpActivity helpActivity) {
        super(3);
        this.this$0 = helpActivity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11772q
    public /* bridge */ /* synthetic */ C13666w invoke(String str, View view, Integer num) {
        String $r4 = str;
        View $r5 = view;
        Integer $r6 = num;
        int $i0 = $r6.intValue();
        invoke($r4, $r5, $i0);
        C13666w r7 = C13666w.f30112a;
        return r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void invoke(String str, View view, int i) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(view, "$noName_1");
        HelpActivity $r3 = this.this$0;
        HelpPresenter $r4 = $r3.getThisPresenter();
        $r4.logCallEvent();
        HelpActivity $r32 = this.this$0;
        HelpPresenter $r42 = $r32.getThisPresenter();
        $r42.makePhoneCall(str);
    }
}

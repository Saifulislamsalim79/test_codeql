package ai.kudi.agent.settings.insurance.p026ui.widget;

import ai.kudi.agent.C0001R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NameValuePairView.kt */
@Metadata(m10422d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n"}, m10421d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.insurance.ui.widget.NameValuePairView$nameTextView$2 */
/* loaded from: classes.dex */
public final class NameValuePairView$nameTextView$2 extends AbstractC11802m implements InterfaceC11756a<TextView> {
    final /* synthetic */ NameValuePairView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NameValuePairView$nameTextView$2(NameValuePairView nameValuePairView) {
        super(0);
        this.this$0 = nameValuePairView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public final TextView invoke() {
        ViewGroup $r2 = this.this$0;
        ViewGroup r4 = $r2;
        View $r1 = r4.findViewById(C0001R.C0003id.name_text_view);
        TextView $r3 = (TextView) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ TextView invoke() {
        TextView $r1 = invoke();
        return $r1;
    }
}

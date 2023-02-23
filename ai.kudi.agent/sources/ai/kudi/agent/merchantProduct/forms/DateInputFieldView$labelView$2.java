package ai.kudi.agent.merchantProduct.forms;

import ai.kudi.agent.collections.R$id;
import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DateInputFieldView.kt */
@Metadata(m10422d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n"}, m10421d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class DateInputFieldView$labelView$2 extends AbstractC11802m implements InterfaceC11756a<TextView> {
    final /* synthetic */ DateInputFieldView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateInputFieldView$labelView$2(DateInputFieldView dateInputFieldView) {
        super(0);
        this.this$0 = dateInputFieldView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public final TextView invoke() {
        DateInputFieldView $r2 = this.this$0;
        int $i0 = R$id.label_view;
        View $r1 = $r2.findViewById($i0);
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

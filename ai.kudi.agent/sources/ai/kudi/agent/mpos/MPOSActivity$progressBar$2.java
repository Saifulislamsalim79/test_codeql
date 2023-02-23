package ai.kudi.agent.mpos;

import ai.kudi.agent.databinding.ActivityMposBinding;
import android.widget.ProgressBar;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* compiled from: MPOSActivity.kt */
@Metadata(m10422d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m10421d2 = {"<anonymous>", "Landroid/widget/ProgressBar;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class MPOSActivity$progressBar$2 extends AbstractC11802m implements InterfaceC11756a<ProgressBar> {
    final /* synthetic */ MPOSActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MPOSActivity$progressBar$2(MPOSActivity mPOSActivity) {
        super(0);
        this.this$0 = mPOSActivity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public final ProgressBar invoke() {
        MPOSActivity $r2 = this.this$0;
        ActivityMposBinding $r1 = $r2.getBinding();
        ProgressBar r3 = $r1.loadingProgressBar;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ ProgressBar invoke() {
        ProgressBar $r1 = invoke();
        return $r1;
    }
}

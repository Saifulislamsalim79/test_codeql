package ai.kudi.agent.pictureupload.p015ui;

import ai.kudi.agent.core.util.ContextExtKt;
import androidx.fragment.app.FragmentActivity;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
/* compiled from: PictureUploadFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "isSuccessful", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.pictureupload.ui.PictureUploadFragment$uploadImage$1 */
/* loaded from: classes.dex */
final class PictureUploadFragment$uploadImage$1 extends AbstractC11802m implements InterfaceC11767l<Boolean, C13666w> {
    final /* synthetic */ PictureUploadFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PictureUploadFragment$uploadImage$1(PictureUploadFragment pictureUploadFragment) {
        super(1);
        this.this$0 = pictureUploadFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Boolean bool) {
        Boolean $r2 = bool;
        boolean $z0 = $r2.booleanValue();
        invoke($z0);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void invoke(boolean z) {
        if (z) {
            return;
        }
        PictureUploadFragment $r2 = this.this$0;
        FragmentActivity $r1 = $r2.getActivity();
        if ($r1 == null) {
            return;
        }
        ContextExtKt.toast$default($r1, "Something went wrong. Please try again...", 0, 2, (Object) null);
    }
}

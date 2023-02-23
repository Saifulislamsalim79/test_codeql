package ai.kudi.agent.p036v2.common.view.fragment;

import android.graphics.Bitmap;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ImagePickerFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Landroid/graphics/Bitmap;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.view.fragment.ImagePickerFragment$setupOtherViews$3$2 */
/* loaded from: classes.dex */
public final class ImagePickerFragment$setupOtherViews$3$2 extends AbstractC11802m implements InterfaceC11767l<Bitmap, C13666w> {
    final /* synthetic */ ImagePickerFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagePickerFragment$setupOtherViews$3$2(ImagePickerFragment imagePickerFragment) {
        super(1);
        this.this$0 = imagePickerFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Bitmap bitmap) {
        Bitmap $r2 = bitmap;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Bitmap bitmap) {
        Log_OC.getArray(bitmap, "it");
        ImagePickerFragment $r2 = this.this$0;
        $r2.onPictureCaptured(bitmap);
    }
}

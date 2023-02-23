package ai.kudi.agent.picture_picker.p014ui;

import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.AbstractC11802m;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PicturePickerFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\n"}, m10421d2 = {"<anonymous>", "", "isSuccessful", "", "pictureId", "", "pictureUrl"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.picture_picker.ui.PicturePickerFragment$uploadPictureToMediaService$1 */
/* loaded from: classes.dex */
public final class PicturePickerFragment$uploadPictureToMediaService$1 extends AbstractC11802m implements InterfaceC11772q<Boolean, String, String, C13666w> {
    final /* synthetic */ PicturePickerFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PicturePickerFragment$uploadPictureToMediaService$1(PicturePickerFragment picturePickerFragment) {
        super(3);
        this.this$0 = picturePickerFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11772q
    public /* bridge */ /* synthetic */ C13666w invoke(Boolean bool, String str, String str2) {
        Boolean $r4 = bool;
        boolean $z0 = $r4.booleanValue();
        String $r5 = str;
        String $r6 = str2;
        invoke($z0, $r5, $r6);
        C13666w r7 = C13666w.f30112a;
        return r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void invoke(boolean z, String str, String str2) {
        PicturePickerFragment $r3 = this.this$0;
        $r3.onPictureUploadResponse(z, str, str2);
    }
}

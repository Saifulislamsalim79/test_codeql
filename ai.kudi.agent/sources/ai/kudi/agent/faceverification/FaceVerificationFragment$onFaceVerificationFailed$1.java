package ai.kudi.agent.faceverification;

import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FaceVerificationFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m10421d2 = {"<anonymous>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FaceVerificationFragment$onFaceVerificationFailed$1 extends AbstractC11802m implements InterfaceC11756a<C13666w> {
    final /* synthetic */ String $imagePath;
    final /* synthetic */ FaceVerificationFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceVerificationFragment$onFaceVerificationFailed$1(FaceVerificationFragment faceVerificationFragment, String str) {
        super(0);
        this.this$0 = faceVerificationFragment;
        this.$imagePath = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ C13666w invoke() {
        invoke2();
        C13666w r1 = C13666w.f30112a;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        FaceVerificationFragment $r3 = this.this$0;
        FaceVerificationViewModel $r2 = $r3.getViewModel();
        String $r1 = this.$imagePath;
        $r2.uploadImage($r1);
    }
}

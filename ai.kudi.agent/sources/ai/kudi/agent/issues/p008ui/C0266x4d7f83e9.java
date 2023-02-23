package ai.kudi.agent.issues.p008ui;

import io.intercom.android.sdk.Intercom;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* compiled from: RatingDialog.kt */
@Metadata(m10422d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m10421d2 = {"<anonymous>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.RatingDialog$navigateToDisputeConclusion$successScreenDialogFragment$2 */
/* loaded from: classes.dex */
final class C0266x4d7f83e9 extends AbstractC11802m implements InterfaceC11756a<C13666w> {
    public static final C0266x4d7f83e9 INSTANCE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0266x4d7f83e9 $r0 = new C0266x4d7f83e9();
        INSTANCE = $r0;
    }

    C0266x4d7f83e9() {
        super(0);
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
        Intercom $r1 = Intercom.client();
        $r1.displayMessageComposer();
    }
}

package ai.kudi.agent.postRegistrationSetUp.fragments;

import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.pos.p016ui.PosActivity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
/* compiled from: PosSetUpFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m10421d2 = {"<anonymous>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class PosSetUpFragment$onViewCreated$1 extends AbstractC11802m implements InterfaceC11756a<C13666w> {
    final /* synthetic */ PosSetUpFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PosSetUpFragment$onViewCreated$1(PosSetUpFragment posSetUpFragment) {
        super(0);
        this.this$0 = posSetUpFragment;
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
        PosSetUpFragment $r1 = this.this$0;
        FragmentActivity $r2 = $r1.getActivity();
        if ($r2 == null) {
            return;
        }
        ContextExtKt.launchActivity$default((Context) $r2, false, PosActivity.class, (InterfaceC11767l) null, 5, (Object) null);
    }
}
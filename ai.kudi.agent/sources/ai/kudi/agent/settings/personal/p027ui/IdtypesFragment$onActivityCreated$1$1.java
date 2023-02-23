package ai.kudi.agent.settings.personal.p027ui;

import ai.kudi.agent.core.domain.room_entities.IdType;
import ai.kudi.agent.settings.p029ui.SettingsActivity;
import androidx.fragment.app.FragmentActivity;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: IdtypesFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Lai/kudi/agent/core/domain/room_entities/IdType;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.personal.ui.IdtypesFragment$onActivityCreated$1$1 */
/* loaded from: classes.dex */
final class IdtypesFragment$onActivityCreated$1$1 extends AbstractC11802m implements InterfaceC11767l<IdType, C13666w> {
    final /* synthetic */ IdtypesFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdtypesFragment$onActivityCreated$1$1(IdtypesFragment idtypesFragment) {
        super(1);
        this.this$0 = idtypesFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(IdType idType) {
        IdType $r2 = idType;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(IdType idType) {
        Log_OC.getArray(idType, "it");
        IdtypesFragment $r2 = this.this$0;
        boolean $z0 = $r2.getActivity() instanceof SettingsActivity;
        if ($z0) {
            IdtypesFragment $r22 = this.this$0;
            FragmentActivity $r3 = $r22.getActivity();
            if ($r3 == null) {
                NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.settings.ui.SettingsActivity");
                throw $r5;
            } else {
                SettingsActivity $r4 = (SettingsActivity) $r3;
                $r4.toggleAppBarLayout(true);
            }
        }
        IdtypesFragment $r23 = this.this$0;
        InterfaceC11767l $r6 = $r23.getCallback();
        if ($r6 == null) {
            return;
        }
        $r6.invoke(idType);
    }
}

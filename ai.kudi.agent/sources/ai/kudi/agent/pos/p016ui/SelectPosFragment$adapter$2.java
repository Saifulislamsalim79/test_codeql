package ai.kudi.agent.pos.p016ui;

import ai.kudi.agent.pos.p016ui.adapter.SelectPosAdapter;
import ai.kudi.agent.pos.p016ui.model.SelectPosType;
import ai.kudi.agent.pos.p016ui.viewModels.SelectPosViewModel;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SelectPosFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m10421d2 = {"<anonymous>", "Lai/kudi/agent/pos/ui/adapter/SelectPosAdapter;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.pos.ui.SelectPosFragment$adapter$2 */
/* loaded from: classes.dex */
public final class SelectPosFragment$adapter$2 extends AbstractC11802m implements InterfaceC11756a<SelectPosAdapter> {
    final /* synthetic */ SelectPosFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectPosFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, m10421d2 = {"<anonymous>", "", "type", "Lai/kudi/agent/pos/ui/model/SelectPosType;", "allTerminals", "", "pos", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.pos.ui.SelectPosFragment$adapter$2$1 */
    /* loaded from: classes.dex */
    public static final class C03671 extends AbstractC11802m implements InterfaceC11772q<SelectPosType, List<? extends SelectPosType>, Integer, C13666w> {
        final /* synthetic */ SelectPosFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03671(SelectPosFragment selectPosFragment) {
            super(3);
            this.this$0 = selectPosFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // kotlin.p483e0.p484c.InterfaceC11772q
        public /* bridge */ /* synthetic */ C13666w invoke(SelectPosType selectPosType, List<? extends SelectPosType> list, Integer num) {
            SelectPosType $r4 = selectPosType;
            List<? extends SelectPosType> $r5 = list;
            Integer $r6 = num;
            int $i0 = $r6.intValue();
            invoke($r4, $r5, $i0);
            C13666w r7 = C13666w.f30112a;
            return r7;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void invoke(SelectPosType selectPosType, List list, int i) {
            Log_OC.getArray(selectPosType, "type");
            Log_OC.getArray(list, "allTerminals");
            SelectPosFragment $r4 = this.this$0;
            $r4.position = i;
            SelectPosFragment $r42 = this.this$0;
            SelectPosViewModel $r3 = $r42.getViewModel();
            $r3.handleUserChoice(selectPosType, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectPosFragment$adapter$2(SelectPosFragment selectPosFragment) {
        super(0);
        this.this$0 = selectPosFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public final SelectPosAdapter invoke() {
        SelectPosFragment $r3 = this.this$0;
        C03671 $r2 = new C03671($r3);
        SelectPosAdapter $r1 = new SelectPosAdapter($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ SelectPosAdapter invoke() {
        SelectPosAdapter $r1 = invoke();
        return $r1;
    }
}

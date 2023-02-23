package ai.kudi.agent.pos.p016ui;

import ai.kudi.agent.pos.p016ui.model.PosFilterType;
import ai.kudi.dip.library.bottomSheets.models.C0757a;
import java.util.ArrayList;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PosOrderHistoryFragment.kt */
@Metadata(m10422d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m10421d2 = {"<anonymous>", "", "Lai/kudi/dip/library/bottomSheets/models/FilterBottomSheetParams;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.pos.ui.PosOrderHistoryFragment$setupFilter$4$1 */
/* loaded from: classes.dex */
public final class PosOrderHistoryFragment$setupFilter$4$1 extends AbstractC11802m implements InterfaceC11767l<C0757a, C13666w> {
    final /* synthetic */ PosOrderHistoryFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PosOrderHistoryFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m10421d2 = {"<anonymous>", "", "type", "", "index", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.pos.ui.PosOrderHistoryFragment$setupFilter$4$1$2 */
    /* loaded from: classes.dex */
    public static final class C03662 extends AbstractC11802m implements InterfaceC11771p<String, Integer, C13666w> {
        final /* synthetic */ PosOrderHistoryFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03662(PosOrderHistoryFragment posOrderHistoryFragment) {
            super(2);
            this.this$0 = posOrderHistoryFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public /* bridge */ /* synthetic */ C13666w invoke(String str, Integer num) {
            String $r3 = str;
            Integer $r4 = num;
            int $i0 = $r4.intValue();
            invoke($r3, $i0);
            C13666w r5 = C13666w.f30112a;
            return r5;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void invoke(String str, int i) {
            Log_OC.getArray(str, "type");
            PosOrderHistoryFragment $r3 = this.this$0;
            PosFilterType[] $r1 = PosFilterType.values();
            PosFilterType $r4 = $r1[i];
            $r3.filterType = $r4;
            PosOrderHistoryFragment $r32 = this.this$0;
            $r32.updateStatusFilterText();
            PosOrderHistoryFragment $r33 = this.this$0;
            $r33.loadOrderHistory();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PosOrderHistoryFragment$setupFilter$4$1(PosOrderHistoryFragment posOrderHistoryFragment) {
        super(1);
        this.this$0 = posOrderHistoryFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(C0757a c0757a) {
        C0757a $r2 = c0757a;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(C0757a c0757a) {
        Log_OC.getArray(c0757a, "$this$$receiver");
        PosFilterType[] $r3 = PosFilterType.values();
        PosOrderHistoryFragment $r4 = this.this$0;
        int $i0 = $r3.length;
        ArrayList $r1 = new ArrayList($i0);
        for (PosFilterType $r5 : $r3) {
            int $i2 = $r5.getTextRes();
            String $r6 = $r4.getString($i2);
            $r1.add($r6);
        }
        c0757a.m38049e($r1);
        PosOrderHistoryFragment $r42 = this.this$0;
        PosFilterType $r52 = $r42.filterType;
        if ($r52 == null) {
            Log_OC.LogError("filterType");
            NullPointerException r8 = new NullPointerException("Null throw statement replaced by Soot");
            throw r8;
        }
        int $i02 = $r52.getTextRes();
        String $r62 = $r42.getString($i02);
        c0757a.m38048f($r62);
        PosOrderHistoryFragment $r43 = this.this$0;
        C03662 $r7 = new C03662($r43);
        c0757a.m38046h($r7);
    }
}

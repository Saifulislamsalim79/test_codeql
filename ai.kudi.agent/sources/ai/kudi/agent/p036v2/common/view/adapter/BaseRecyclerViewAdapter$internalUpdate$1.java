package ai.kudi.agent.p036v2.common.view.adapter;

import ai.kudi.agent.p036v2.common.view.adapter.utils.CustomIdiomsKt;
import androidx.recyclerview.widget.C1713j;
import java.util.ArrayDeque;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13742z;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseRecyclerViewAdapter.kt */
@Metadata(m10422d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0005H\n"}, m10421d2 = {"<anonymous>", "", "Type", "", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.view.adapter.BaseRecyclerViewAdapter$internalUpdate$1 */
/* loaded from: classes.dex */
public final class BaseRecyclerViewAdapter$internalUpdate$1 extends AbstractC11802m implements InterfaceC11756a<C13666w> {
    final /* synthetic */ List<Type> $newList;
    final /* synthetic */ BaseRecyclerViewAdapter<Type, VH> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseRecyclerViewAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0005H\n"}, m10421d2 = {"<anonymous>", "", "Type", "", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.v2.common.view.adapter.BaseRecyclerViewAdapter$internalUpdate$1$1 */
    /* loaded from: classes.dex */
    public static final class C06911 extends AbstractC11802m implements InterfaceC11756a<C13666w> {
        final /* synthetic */ List<Type> $newList;
        final /* synthetic */ C1713j.C1718e $result;
        final /* synthetic */ BaseRecyclerViewAdapter<Type, VH> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06911(BaseRecyclerViewAdapter baseRecyclerViewAdapter, List list, C1713j.C1718e c1718e) {
            super(0);
            this.this$0 = baseRecyclerViewAdapter;
            this.$newList = list;
            this.$result = c1718e;
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
            List $r2;
            BaseRecyclerViewAdapter $r1 = this.this$0;
            List $r22 = this.$newList;
            $r2 = C13742z.m3823D0($r22);
            $r1.mDataset = $r2;
            C1713j.C1718e $r3 = this.$result;
            BaseRecyclerViewAdapter $r12 = this.this$0;
            $r3.m34716d($r12);
            BaseRecyclerViewAdapter $r13 = this.this$0;
            ArrayDeque $r4 = $r13.mPendingUpdates;
            boolean $z0 = $r4.isEmpty();
            if ($z0) {
                return;
            }
            BaseRecyclerViewAdapter $r14 = this.this$0;
            ArrayDeque $r42 = $r14.mPendingUpdates;
            $r42.remove();
            BaseRecyclerViewAdapter $r15 = this.this$0;
            $r15.isCurrentlyProcessing = false;
            BaseRecyclerViewAdapter $r16 = this.this$0;
            ArrayDeque $r43 = $r16.mPendingUpdates;
            boolean $z02 = $r43.isEmpty();
            if ($z02) {
                return;
            }
            BaseRecyclerViewAdapter $r17 = this.this$0;
            ArrayDeque $r44 = $r17.mPendingUpdates;
            Object $r5 = $r44.peek();
            Log_OC.append($r5);
            List $r23 = (List) $r5;
            $r17.internalUpdate($r23);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseRecyclerViewAdapter$internalUpdate$1(BaseRecyclerViewAdapter baseRecyclerViewAdapter, List list) {
        super(0);
        this.this$0 = baseRecyclerViewAdapter;
        this.$newList = list;
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
        BaseRecyclerViewAdapter $r2 = this.this$0;
        List $r1 = $r2.mDataset;
        List $r3 = this.$newList;
        C1713j.C1718e $r4 = $r2.getDiffResult($r1, $r3);
        BaseRecyclerViewAdapter $r22 = this.this$0;
        List $r12 = this.$newList;
        C06911 $r5 = new C06911($r22, $r12, $r4);
        CustomIdiomsKt.runOnMainThread($r5);
    }
}

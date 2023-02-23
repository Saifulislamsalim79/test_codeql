package ai.kudi.agent.savings.adapter;

import ai.kudi.agent.savings.data.model.SavingResponse;
import androidx.recyclerview.widget.C1713j;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: SavingsPlanAdapter.kt */
@Metadata(m10422d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u0003"}, m10421d2 = {"diffUtil", "ai/kudi/agent/savings/adapter/SavingsPlanAdapterKt$diffUtil$1", "Lai/kudi/agent/savings/adapter/SavingsPlanAdapterKt$diffUtil$1;", "feature-savings_release"}, k = 2, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SavingsPlanAdapterKt {
    private static final SavingsPlanAdapterKt$diffUtil$1 diffUtil = new C1713j.AbstractC1719f<SavingResponse>() { // from class: ai.kudi.agent.savings.adapter.SavingsPlanAdapterKt$diffUtil$1
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        /* renamed from: areContentsTheSame  reason: avoid collision after fix types in other method */
        public boolean areContentsTheSame2(SavingResponse savingResponse, SavingResponse savingResponse2) {
            Log_OC.getArray(savingResponse, "oldItem");
            Log_OC.getArray(savingResponse2, "newItem");
            boolean $z0 = Log_OC.append(savingResponse, savingResponse2);
            return $z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        @Override // androidx.recyclerview.widget.C1713j.AbstractC1719f
        public /* bridge */ /* synthetic */ boolean areContentsTheSame(SavingResponse savingResponse, SavingResponse savingResponse2) {
            SavingResponse $r3 = savingResponse;
            SavingResponse $r4 = savingResponse2;
            boolean $z0 = areContentsTheSame2($r3, $r4);
            return $z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        /* renamed from: areItemsTheSame  reason: avoid collision after fix types in other method */
        public boolean areItemsTheSame2(SavingResponse savingResponse, SavingResponse savingResponse2) {
            Log_OC.getArray(savingResponse, "oldItem");
            Log_OC.getArray(savingResponse2, "newItem");
            String $r3 = savingResponse.getId();
            String $r4 = savingResponse2.getId();
            boolean $z0 = Log_OC.append($r3, $r4);
            return $z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        @Override // androidx.recyclerview.widget.C1713j.AbstractC1719f
        public /* bridge */ /* synthetic */ boolean areItemsTheSame(SavingResponse savingResponse, SavingResponse savingResponse2) {
            SavingResponse $r3 = savingResponse;
            SavingResponse $r4 = savingResponse2;
            boolean $z0 = areItemsTheSame2($r3, $r4);
            return $z0;
        }
    };
}

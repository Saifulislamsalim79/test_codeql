package ai.kudi.agent.transfer.generation.modules;

import ai.kudi.agent.voucher.cashin.view.MainTransferView;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: MainTransferModule.kt */
@Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/transfer/di/modules/MainTransferModule;", "", "mainTransferView", "Lai/kudi/agent/voucher/cashin/view/MainTransferView;", "(Lai/kudi/agent/voucher/cashin/view/MainTransferView;)V", "providesMainTransferView", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class MainTransferModule {
    private final MainTransferView mainTransferView;

    public MainTransferModule(MainTransferView mainTransferView) {
        Log_OC.getArray(mainTransferView, "mainTransferView");
        this.mainTransferView = mainTransferView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final MainTransferView providesMainTransferView() {
        MainTransferView r1 = this.mainTransferView;
        return r1;
    }
}

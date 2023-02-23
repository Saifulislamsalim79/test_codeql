package ai.kudi.agent.product.other_bills.presenter;

import ai.kudi.agent.transfer.views.TransferToBankAmountView;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
/* compiled from: AmountPresenter.kt */
@Metadata(m10422d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/product/other_bills/presenter/AmountPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/transfer/views/TransferToBankAmountView;", "()V", "editAccountDetails", "", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AmountPresenter extends C9410b<TransferToBankAmountView> {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: editAccountDetails$lambda-0  reason: not valid java name */
    public static final void m40175editAccountDetails$lambda0(TransferToBankAmountView transferToBankAmountView) {
        Log_OC.getArray(transferToBankAmountView, "it");
        transferToBankAmountView.toBillInfo();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final void editAccountDetails() {
        ClassWriter $r1 = ClassWriter.f918b;
        ifViewAttached($r1);
    }
}

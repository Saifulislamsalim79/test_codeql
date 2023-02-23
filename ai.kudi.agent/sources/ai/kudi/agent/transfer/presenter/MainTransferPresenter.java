package ai.kudi.agent.transfer.presenter;

import ai.kudi.agent.voucher.cashin.view.MainTransferView;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
/* compiled from: MainTransferPresenter.kt */
@Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0003J4\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/transfer/presenter/MainTransferPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/voucher/cashin/view/MainTransferView;", "()V", "showDialog", "", MetricTracker.Object.MESSAGE, "", "buttonText", "upperCase", "", "cancelable", "action", "Lkotlin/Function0;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class MainTransferPresenter extends C9410b<MainTransferView> {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showDialog$lambda-0  reason: not valid java name */
    public static final void m41318showDialog$lambda0(String str, String str2, boolean z, boolean z2, InterfaceC11756a interfaceC11756a, MainTransferView mainTransferView) {
        Log_OC.getArray(str, "$message");
        Log_OC.getArray(str2, "$buttonText");
        Log_OC.getArray(interfaceC11756a, "$action");
        Log_OC.getArray(mainTransferView, "view");
        mainTransferView.showAlertDialog(str, str2, z, z2, interfaceC11756a);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final void showDialog(final String str, final String str2, final boolean z, final boolean z2, final InterfaceC11756a interfaceC11756a) {
        Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
        Log_OC.getArray(str2, "buttonText");
        Log_OC.getArray(interfaceC11756a, "action");
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.transfer.presenter.e
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
            	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                String $r2 = str;
                String $r3 = str2;
                boolean $z0 = z;
                boolean $z1 = z2;
                InterfaceC11756a $r4 = interfaceC11756a;
                MainTransferView $r5 = (MainTransferView) obj;
                MainTransferPresenter.m41318showDialog$lambda0($r2, $r3, $z0, $z1, $r4, $r5);
            }
        });
    }
}

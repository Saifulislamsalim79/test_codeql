package org.org.org.org.android.util.lib.app;

import android.view.MotionEvent;
import android.view.Window;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* renamed from: org.org.org.org.android.util.lib.app.x */
/* loaded from: classes.dex */
public final class C14566x extends AbstractC11802m implements InterfaceC11756a<Boolean> {
    public final /* synthetic */ FragmentActivity mActivity;
    public final /* synthetic */ MotionEvent mContainer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14566x(FragmentActivity fragmentActivity, MotionEvent motionEvent) {
        super(0);
        this.mActivity = fragmentActivity;
        this.mContainer = motionEvent;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: a */
    public final boolean m1206a() {
        FragmentActivity $r2 = this.mActivity;
        Window.Callback $r3 = $r2.f32254r;
        if ($r3 != null) {
            MotionEvent $r1 = this.mContainer;
            boolean $z0 = $r3.dispatchGenericMotionEvent($r1);
            return $z0;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ Boolean invoke() {
        boolean $z0 = m1206a();
        Boolean $r1 = Boolean.valueOf($z0);
        return $r1;
    }
}

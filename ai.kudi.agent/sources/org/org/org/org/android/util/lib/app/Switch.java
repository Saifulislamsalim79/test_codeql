package org.org.org.org.android.util.lib.app;

import android.os.Build;
import android.view.ActionMode;
import android.view.Window;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* loaded from: classes.dex */
public final class Switch extends AbstractC11802m implements InterfaceC11756a<ActionMode> {

    /* renamed from: b */
    public final /* synthetic */ int f32258b;

    /* renamed from: c */
    public final /* synthetic */ FragmentActivity f32259c;

    /* renamed from: l */
    public final /* synthetic */ ActionMode.Callback f32260l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Switch(FragmentActivity fragmentActivity, ActionMode.Callback callback, int i) {
        super(0);
        this.f32259c = fragmentActivity;
        this.f32260l = callback;
        this.f32258b = i;
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
    public final ActionMode m1208a() {
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 >= 23) {
            FragmentActivity $r1 = this.f32259c;
            Window.Callback $r2 = $r1.f32254r;
            if ($r2 != null) {
                ActionMode.Callback $r3 = this.f32260l;
                int $i02 = this.f32258b;
                ActionMode $r4 = $r2.onWindowStartingActionMode($r3, $i02);
                return $r4;
            }
            return null;
        }
        return null;
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
    public /* bridge */ /* synthetic */ ActionMode invoke() {
        ActionMode $r1 = m1208a();
        return $r1;
    }
}

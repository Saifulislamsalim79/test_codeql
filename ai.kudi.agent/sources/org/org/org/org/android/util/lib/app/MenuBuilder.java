package org.org.org.org.android.util.lib.app;

import android.view.Menu;
import android.view.View;
import android.view.Window;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* loaded from: classes.dex */
public final class MenuBuilder extends AbstractC11802m implements InterfaceC11756a<Boolean> {
    public final /* synthetic */ int menu;
    public final /* synthetic */ FragmentActivity this$0;
    public final /* synthetic */ View this$1;
    public final /* synthetic */ Menu val$menu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuBuilder(FragmentActivity fragmentActivity, int i, View view, Menu menu) {
        super(0);
        this.this$0 = fragmentActivity;
        this.menu = i;
        this.this$1 = view;
        this.val$menu = menu;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean add() {
        FragmentActivity $r3 = this.this$0;
        Window.Callback $r4 = $r3.f32254r;
        if ($r4 != null) {
            int $i0 = this.menu;
            View $r1 = this.this$1;
            Menu $r2 = this.val$menu;
            boolean $z0 = $r4.onPreparePanel($i0, $r1, $r2);
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
        boolean $z0 = add();
        Boolean $r1 = Boolean.valueOf($z0);
        return $r1;
    }
}

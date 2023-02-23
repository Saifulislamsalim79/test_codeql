package org.org.org.org.android.util.lib.app;

import android.os.Build;
import android.view.SearchEvent;
import android.view.Window;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* loaded from: classes.dex */
public final class BaseActivity extends AbstractC11802m implements InterfaceC11756a<Boolean> {
    public final /* synthetic */ FragmentActivity mActivity;
    public final /* synthetic */ SearchEvent mPreferences;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseActivity(FragmentActivity fragmentActivity, SearchEvent searchEvent) {
        super(0);
        this.mActivity = fragmentActivity;
        this.mPreferences = searchEvent;
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
        boolean $z0 = onOptionsItemSelected();
        Boolean $r1 = Boolean.valueOf($z0);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean onOptionsItemSelected() {
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 >= 23) {
            FragmentActivity $r1 = this.mActivity;
            Window.Callback $r2 = $r1.f32254r;
            if ($r2 != null) {
                SearchEvent $r3 = this.mPreferences;
                boolean $z0 = $r2.onSearchRequested($r3);
                return $z0;
            }
            return false;
        }
        return false;
    }
}

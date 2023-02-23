package org.org.org.org.android.util.lib.app;

import android.view.ActionMode;
import android.view.Window;
import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* loaded from: classes.dex */
public final class ActionBarActivityDelegateBase extends AbstractC11802m implements InterfaceC11756a<C13666w> {
    public final /* synthetic */ ActionMode mActionMode;
    public final /* synthetic */ FragmentActivity mMenu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionBarActivityDelegateBase(FragmentActivity fragmentActivity, ActionMode actionMode) {
        super(0);
        this.mMenu = fragmentActivity;
        this.mActionMode = actionMode;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ C13666w invoke() {
        onConfigurationChanged();
        C13666w r1 = C13666w.f30112a;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onConfigurationChanged() {
        FragmentActivity $r3 = this.mMenu;
        Window.Callback $r2 = $r3.f32254r;
        if ($r2 != null) {
            ActionMode $r1 = this.mActionMode;
            $r2.onActionModeStarted($r1);
        }
    }
}

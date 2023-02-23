package org.org.org.org.android.util.lib.app;

import android.view.Window;
import android.view.WindowManager;
import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* loaded from: classes.dex */
public final class ActionBarSherlock extends AbstractC11802m implements InterfaceC11756a<C13666w> {
    public final /* synthetic */ FragmentActivity mActivity;
    public final /* synthetic */ WindowManager.LayoutParams mAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionBarSherlock(FragmentActivity fragmentActivity, WindowManager.LayoutParams layoutParams) {
        super(0);
        this.mActivity = fragmentActivity;
        this.mAdapter = layoutParams;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ C13666w invoke() {
        setContentView();
        C13666w r1 = C13666w.f30112a;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setContentView() {
        FragmentActivity $r3 = this.mActivity;
        Window.Callback $r2 = $r3.f32254r;
        if ($r2 != null) {
            WindowManager.LayoutParams $r1 = this.mAdapter;
            $r2.onWindowAttributesChanged($r1);
        }
    }
}

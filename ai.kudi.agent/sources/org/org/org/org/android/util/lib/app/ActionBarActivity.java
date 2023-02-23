package org.org.org.org.android.util.lib.app;

import android.view.Window;
import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* loaded from: classes.dex */
public final class ActionBarActivity extends AbstractC11802m implements InterfaceC11756a<C13666w> {
    public final /* synthetic */ FragmentActivity mActivity;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionBarActivity(FragmentActivity fragmentActivity) {
        super(0);
        this.mActivity = fragmentActivity;
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
        FragmentActivity $r2 = this.mActivity;
        Window.Callback $r1 = $r2.f32254r;
        if ($r1 != null) {
            $r1.onContentChanged();
        }
    }
}

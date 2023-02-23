package org.org.org.org.android.util.lib.app;

import android.view.Menu;
import android.view.Window;
import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* loaded from: classes.dex */
public final class AppCompatDelegateImplBase extends AbstractC11802m implements InterfaceC11756a<C13666w> {
    public final /* synthetic */ int mContext;
    public final /* synthetic */ Menu mWindow;
    public final /* synthetic */ FragmentActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatDelegateImplBase(FragmentActivity fragmentActivity, int i, Menu menu) {
        super(0);
        this.this$0 = fragmentActivity;
        this.mContext = i;
        this.mWindow = menu;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ C13666w invoke() {
        onCreate();
        C13666w r1 = C13666w.f30112a;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onCreate() {
        FragmentActivity $r3 = this.this$0;
        Window.Callback $r2 = $r3.f32254r;
        if ($r2 != null) {
            int $i0 = this.mContext;
            Menu $r1 = this.mWindow;
            $r2.onPanelClosed($i0, $r1);
        }
    }
}

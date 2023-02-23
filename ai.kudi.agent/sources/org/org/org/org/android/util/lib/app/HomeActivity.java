package org.org.org.org.android.util.lib.app;

import android.view.Window;
import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* loaded from: classes.dex */
public final class HomeActivity extends AbstractC11802m implements InterfaceC11756a<C13666w> {
    public final /* synthetic */ boolean service;
    public final /* synthetic */ FragmentActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeActivity(FragmentActivity fragmentActivity, boolean z) {
        super(0);
        this.this$0 = fragmentActivity;
        this.service = z;
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
        FragmentActivity $r2 = this.this$0;
        Window.Callback $r1 = $r2.f32254r;
        if ($r1 != null) {
            boolean $z0 = this.service;
            $r1.onWindowFocusChanged($z0);
        }
    }
}

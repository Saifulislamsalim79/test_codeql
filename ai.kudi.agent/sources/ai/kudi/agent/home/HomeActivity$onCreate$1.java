package ai.kudi.agent.home;

import ai.kudi.agent.databinding.ViewDashboardHomeBinding;
import ai.kudi.agent.home.adapter.NavigationListViewAdapter;
import androidx.drawerlayout.widget.DrawerLayout;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: HomeActivity.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Lai/kudi/agent/home/adapter/NavigationListViewAdapter$MenuItem;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class HomeActivity$onCreate$1 extends AbstractC11802m implements InterfaceC11767l<NavigationListViewAdapter.MenuItem, C13666w> {
    final /* synthetic */ HomeActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeActivity$onCreate$1(HomeActivity homeActivity) {
        super(1);
        this.this$0 = homeActivity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(NavigationListViewAdapter.MenuItem menuItem) {
        NavigationListViewAdapter.MenuItem $r2 = menuItem;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(NavigationListViewAdapter.MenuItem menuItem) {
        Log_OC.getArray(menuItem, "it");
        HomeActivity $r2 = this.this$0;
        String $r3 = menuItem.getKey();
        $r2.openPageByType($r3);
        NavigationListViewAdapter.MenuItem.State $r4 = menuItem.getState();
        NavigationListViewAdapter.MenuItem.State $r5 = NavigationListViewAdapter.MenuItem.State.LOADED;
        if ($r4 == $r5) {
            HomeActivity $r22 = this.this$0;
            InterfaceC8209a $r6 = $r22.getBinding();
            ViewDashboardHomeBinding $r7 = (ViewDashboardHomeBinding) $r6;
            DrawerLayout $r8 = $r7.drawerLayout;
            $r8.m36050d(8388611);
        }
    }
}

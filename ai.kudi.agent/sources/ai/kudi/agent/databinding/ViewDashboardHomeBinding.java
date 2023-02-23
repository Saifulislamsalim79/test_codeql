package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.navigation.NavigationView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ViewDashboardHomeBinding implements InterfaceC8209a {
    public final AppBarHomeBinding appBarHomeBinding;
    public final DrawerLayout drawerLayout;
    public final RecyclerView menuItem;
    public final NavigationViewBottomBinding navBottom;
    public final NavHeaderHomeBinding navHeader;
    public final NavigationView navView;
    private final DrawerLayout rootView;

    private ViewDashboardHomeBinding(DrawerLayout drawerLayout, AppBarHomeBinding appBarHomeBinding, DrawerLayout drawerLayout2, RecyclerView recyclerView, NavigationViewBottomBinding navigationViewBottomBinding, NavHeaderHomeBinding navHeaderHomeBinding, NavigationView navigationView) {
        this.rootView = drawerLayout;
        this.appBarHomeBinding = appBarHomeBinding;
        this.drawerLayout = drawerLayout2;
        this.menuItem = recyclerView;
        this.navBottom = navigationViewBottomBinding;
        this.navHeader = navHeaderHomeBinding;
        this.navView = navigationView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewDashboardHomeBinding bind(View view) {
        int $i0 = C0001R.C0003id.app_bar_home_binding;
        View $r1 = view.findViewById(C0001R.C0003id.app_bar_home_binding);
        if ($r1 != null) {
            AppBarHomeBinding $r2 = AppBarHomeBinding.bind($r1);
            DrawerLayout $r3 = (DrawerLayout) view;
            $i0 = C0001R.C0003id.menu_item;
            RecyclerView $r4 = (RecyclerView) view.findViewById(C0001R.C0003id.menu_item);
            if ($r4 != null) {
                $i0 = C0001R.C0003id.nav_bottom;
                View $r12 = view.findViewById(C0001R.C0003id.nav_bottom);
                if ($r12 != null) {
                    NavigationViewBottomBinding $r5 = NavigationViewBottomBinding.bind($r12);
                    $i0 = C0001R.C0003id.nav_header;
                    View $r13 = view.findViewById(C0001R.C0003id.nav_header);
                    if ($r13 != null) {
                        NavHeaderHomeBinding $r6 = NavHeaderHomeBinding.bind($r13);
                        $i0 = C0001R.C0003id.nav_view;
                        NavigationView navigationView = (NavigationView) view.findViewById(C0001R.C0003id.nav_view);
                        if (navigationView != null) {
                            ViewDashboardHomeBinding $r8 = new ViewDashboardHomeBinding($r3, $r2, $r3, $r4, $r5, $r6, navigationView);
                            return $r8;
                        }
                    }
                }
            }
        }
        Resources $r9 = view.getResources();
        String $r10 = $r9.getResourceName($i0);
        NullPointerException $r11 = new NullPointerException("Missing required view with ID: ".concat($r10));
        throw $r11;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewDashboardHomeBinding inflate(LayoutInflater layoutInflater) {
        ViewDashboardHomeBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewDashboardHomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.view_dashboard_home, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ViewDashboardHomeBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        View $r1 = getRoot();
        View r2 = $r1;
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public DrawerLayout getRoot() {
        DrawerLayout r1 = this.rootView;
        return r1;
    }
}

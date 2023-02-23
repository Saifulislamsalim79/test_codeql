package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentAppPermissionsBinding implements InterfaceC8209a {
    public final RecyclerView appPermissionsRecyclerView;
    private final ScrollView rootView;

    private FragmentAppPermissionsBinding(ScrollView scrollView, RecyclerView recyclerView) {
        this.rootView = scrollView;
        this.appPermissionsRecyclerView = recyclerView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentAppPermissionsBinding bind(View view) {
        View $r1 = view.findViewById(C0001R.C0003id.app_permissions_recycler_view);
        RecyclerView $r2 = (RecyclerView) $r1;
        if ($r2 != null) {
            ScrollView $r4 = (ScrollView) view;
            FragmentAppPermissionsBinding $r3 = new FragmentAppPermissionsBinding($r4, $r2);
            return $r3;
        }
        Resources $r5 = view.getResources();
        String $r6 = $r5.getResourceName(C0001R.C0003id.app_permissions_recycler_view);
        NullPointerException $r7 = new NullPointerException("Missing required view with ID: ".concat($r6));
        throw $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentAppPermissionsBinding inflate(LayoutInflater layoutInflater) {
        FragmentAppPermissionsBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentAppPermissionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_app_permissions, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentAppPermissionsBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        ScrollView $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public ScrollView getRoot() {
        ScrollView r1 = this.rootView;
        return r1;
    }
}

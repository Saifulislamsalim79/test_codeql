package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ContentHomeBinding implements InterfaceC8209a {
    public final BottomNavigationView bottomNavigationView;
    public final LinearLayout container;
    public final FrameLayout contentFrameLayout;
    private final LinearLayout rootView;

    private ContentHomeBinding(LinearLayout linearLayout, BottomNavigationView bottomNavigationView, LinearLayout linearLayout2, FrameLayout frameLayout) {
        this.rootView = linearLayout;
        this.bottomNavigationView = bottomNavigationView;
        this.container = linearLayout2;
        this.contentFrameLayout = frameLayout;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ContentHomeBinding bind(View view) {
        int $i0 = C0001R.C0003id.bottomNavigationView;
        View $r1 = view.findViewById(C0001R.C0003id.bottomNavigationView);
        BottomNavigationView $r2 = (BottomNavigationView) $r1;
        if ($r2 != null) {
            LinearLayout $r3 = (LinearLayout) view;
            View $r12 = view.findViewById(C0001R.C0003id.contentFrameLayout);
            FrameLayout $r4 = (FrameLayout) $r12;
            if ($r4 != null) {
                ContentHomeBinding $r5 = new ContentHomeBinding($r3, $r2, $r3, $r4);
                return $r5;
            }
            $i0 = C0001R.C0003id.contentFrameLayout;
        }
        Resources $r6 = view.getResources();
        String $r7 = $r6.getResourceName($i0);
        NullPointerException $r8 = new NullPointerException("Missing required view with ID: ".concat($r7));
        throw $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ContentHomeBinding inflate(LayoutInflater layoutInflater) {
        ContentHomeBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ContentHomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.content_home, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ContentHomeBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        LinearLayout $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public LinearLayout getRoot() {
        LinearLayout r1 = this.rootView;
        return r1;
    }
}

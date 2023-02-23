package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActivityOutletMgtBinding implements InterfaceC8209a {
    public final FrameLayout contentFrameLayout;
    public final ViewLoaderBinding outletMgtLoaderView;
    private final LinearLayout rootView;
    public final Toolbar toolbar;

    private ActivityOutletMgtBinding(LinearLayout linearLayout, FrameLayout frameLayout, ViewLoaderBinding viewLoaderBinding, Toolbar toolbar) {
        this.rootView = linearLayout;
        this.contentFrameLayout = frameLayout;
        this.outletMgtLoaderView = viewLoaderBinding;
        this.toolbar = toolbar;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityOutletMgtBinding bind(View view) {
        int $i0 = C0001R.C0003id.contentFrameLayout;
        FrameLayout $r2 = (FrameLayout) view.findViewById(C0001R.C0003id.contentFrameLayout);
        if ($r2 != null) {
            $i0 = C0001R.C0003id.outletMgtLoaderView;
            View $r1 = view.findViewById(C0001R.C0003id.outletMgtLoaderView);
            if ($r1 != null) {
                ViewLoaderBinding $r3 = ViewLoaderBinding.bind($r1);
                Toolbar $r4 = (Toolbar) view.findViewById(C0001R.C0003id.toolbar);
                if ($r4 != null) {
                    LinearLayout $r6 = (LinearLayout) view;
                    ActivityOutletMgtBinding $r5 = new ActivityOutletMgtBinding($r6, $r2, $r3, $r4);
                    return $r5;
                }
                $i0 = C0001R.C0003id.toolbar;
            }
        }
        Resources $r7 = view.getResources();
        String $r8 = $r7.getResourceName($i0);
        NullPointerException $r9 = new NullPointerException("Missing required view with ID: ".concat($r8));
        throw $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityOutletMgtBinding inflate(LayoutInflater layoutInflater) {
        ActivityOutletMgtBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityOutletMgtBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.activity_outlet_mgt, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivityOutletMgtBinding $r3 = bind($r2);
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

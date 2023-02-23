package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.databinding.ListLoaderViewBinding;
import ai.kudi.dip.library.SafeViewPager;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentViewpagerContainerBinding implements InterfaceC8209a {
    public final ListLoaderViewBinding loadingState;
    private final ConstraintLayout rootView;
    public final TabLayout tabLayout;
    public final SafeViewPager viewPager;

    private FragmentViewpagerContainerBinding(ConstraintLayout constraintLayout, ListLoaderViewBinding listLoaderViewBinding, TabLayout tabLayout, SafeViewPager safeViewPager) {
        this.rootView = constraintLayout;
        this.loadingState = listLoaderViewBinding;
        this.tabLayout = tabLayout;
        this.viewPager = safeViewPager;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentViewpagerContainerBinding bind(View view) {
        int $i0 = C0001R.C0003id.loadingState;
        View $r1 = view.findViewById(C0001R.C0003id.loadingState);
        if ($r1 != null) {
            ListLoaderViewBinding $r2 = ListLoaderViewBinding.bind($r1);
            TabLayout $r3 = (TabLayout) view.findViewById(C0001R.C0003id.tabLayout);
            if ($r3 != null) {
                SafeViewPager $r4 = (SafeViewPager) view.findViewById(C0001R.C0003id.viewPager);
                if ($r4 != null) {
                    ConstraintLayout $r6 = (ConstraintLayout) view;
                    FragmentViewpagerContainerBinding $r5 = new FragmentViewpagerContainerBinding($r6, $r2, $r3, $r4);
                    return $r5;
                }
                $i0 = C0001R.C0003id.viewPager;
            } else {
                $i0 = C0001R.C0003id.tabLayout;
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
    public static FragmentViewpagerContainerBinding inflate(LayoutInflater layoutInflater) {
        FragmentViewpagerContainerBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentViewpagerContainerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_viewpager_container, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentViewpagerContainerBinding $r3 = bind($r2);
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
    public ConstraintLayout getRoot() {
        ConstraintLayout r1 = this.rootView;
        return r1;
    }
}

package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.SafeViewPager;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActivityIncompleteTransactionsBinding implements InterfaceC8209a {
    public final AppBarLayout appBar;
    public final AppCompatImageButton backButton;
    public final FrameLayout frame;
    private final LinearLayout rootView;
    public final TabLayout tabLayout;
    public final TextView title;
    public final SafeViewPager viewPager;

    private ActivityIncompleteTransactionsBinding(LinearLayout linearLayout, AppBarLayout appBarLayout, AppCompatImageButton appCompatImageButton, FrameLayout frameLayout, TabLayout tabLayout, TextView textView, SafeViewPager safeViewPager) {
        this.rootView = linearLayout;
        this.appBar = appBarLayout;
        this.backButton = appCompatImageButton;
        this.frame = frameLayout;
        this.tabLayout = tabLayout;
        this.title = textView;
        this.viewPager = safeViewPager;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityIncompleteTransactionsBinding bind(View view) {
        int $i0 = C0001R.C0003id.app_bar;
        View $r1 = view.findViewById(C0001R.C0003id.app_bar);
        AppBarLayout $r2 = (AppBarLayout) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.back_button;
            View $r12 = view.findViewById(C0001R.C0003id.back_button);
            AppCompatImageButton $r3 = (AppCompatImageButton) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.frame;
                View $r13 = view.findViewById(C0001R.C0003id.frame);
                FrameLayout frameLayout = (FrameLayout) $r13;
                if (frameLayout != null) {
                    $i0 = C0001R.C0003id.tab_layout;
                    View $r14 = view.findViewById(C0001R.C0003id.tab_layout);
                    TabLayout tabLayout = (TabLayout) $r14;
                    if (tabLayout != null) {
                        $i0 = C0001R.C0003id.title;
                        View $r15 = view.findViewById(C0001R.C0003id.title);
                        TextView textView = (TextView) $r15;
                        if (textView != null) {
                            $i0 = C0001R.C0003id.view_pager;
                            View $r16 = view.findViewById(C0001R.C0003id.view_pager);
                            SafeViewPager safeViewPager = (SafeViewPager) $r16;
                            if (safeViewPager != null) {
                                LinearLayout $r9 = (LinearLayout) view;
                                ActivityIncompleteTransactionsBinding $r8 = new ActivityIncompleteTransactionsBinding($r9, $r2, $r3, frameLayout, tabLayout, textView, safeViewPager);
                                return $r8;
                            }
                        }
                    }
                }
            }
        }
        Resources $r10 = view.getResources();
        String $r11 = $r10.getResourceName($i0);
        NullPointerException $r122 = new NullPointerException("Missing required view with ID: ".concat($r11));
        throw $r122;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityIncompleteTransactionsBinding inflate(LayoutInflater layoutInflater) {
        ActivityIncompleteTransactionsBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityIncompleteTransactionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.activity_incomplete_transactions, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivityIncompleteTransactionsBinding $r3 = bind($r2);
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

package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentTransactionContainerBinding implements InterfaceC8209a {
    private final ConstraintLayout rootView;
    public final TabLayout transactionTabLayout;
    public final ViewPager2 transactionsViewPager;

    private FragmentTransactionContainerBinding(ConstraintLayout constraintLayout, TabLayout tabLayout, ViewPager2 viewPager2) {
        this.rootView = constraintLayout;
        this.transactionTabLayout = tabLayout;
        this.transactionsViewPager = viewPager2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentTransactionContainerBinding bind(View view) {
        int $i0 = C0001R.C0003id.transaction_tab_layout;
        View $r1 = view.findViewById(C0001R.C0003id.transaction_tab_layout);
        TabLayout $r2 = (TabLayout) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.transactions_view_pager;
            View $r12 = view.findViewById(C0001R.C0003id.transactions_view_pager);
            ViewPager2 $r3 = (ViewPager2) $r12;
            if ($r3 != null) {
                ConstraintLayout $r5 = (ConstraintLayout) view;
                FragmentTransactionContainerBinding $r4 = new FragmentTransactionContainerBinding($r5, $r2, $r3);
                return $r4;
            }
        }
        Resources $r6 = view.getResources();
        String $r7 = $r6.getResourceName($i0);
        NullPointerException $r8 = new NullPointerException("Missing required view with ID: ".concat($r7));
        throw $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentTransactionContainerBinding inflate(LayoutInflater layoutInflater) {
        FragmentTransactionContainerBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentTransactionContainerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_transaction_container, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentTransactionContainerBinding $r3 = bind($r2);
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
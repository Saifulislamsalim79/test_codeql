package ai.kudi.agent.collections.databinding;

import ai.kudi.agent.collections.R$id;
import ai.kudi.agent.collections.R$layout;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.gmail.samehadar.iosdialog.CamomileSpinner;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentProductHomeBinding implements InterfaceC8209a {
    public final LayoutListHeaderBinding inBestCommissionHeader;
    public final LayoutListHeaderBinding inTopPicksHeader;
    public final CamomileSpinner ivSectorLoader;
    public final LinearLayout llCategorySectorNotFound;
    public final LinearLayout llFragmentProductWrapper;
    public final LinearLayout llReloadBtn;
    public final RecyclerView recyclerViewProductCategoriesSector;
    private final SwipeRefreshLayout rootView;
    public final LayoutProductRecyclerviewBinding rvProductBestCommissionList;
    public final LayoutProductRecyclerviewBinding rvProductTopPicksList;
    public final SwipeRefreshLayout srProductHomeWrapper;
    public final TextView textViewFragmentProductsSearchbar;
    public final View viewDivider;

    private FragmentProductHomeBinding(SwipeRefreshLayout swipeRefreshLayout, LayoutListHeaderBinding layoutListHeaderBinding, LayoutListHeaderBinding layoutListHeaderBinding2, CamomileSpinner camomileSpinner, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, RecyclerView recyclerView, LayoutProductRecyclerviewBinding layoutProductRecyclerviewBinding, LayoutProductRecyclerviewBinding layoutProductRecyclerviewBinding2, SwipeRefreshLayout swipeRefreshLayout2, TextView textView, View view) {
        this.rootView = swipeRefreshLayout;
        this.inBestCommissionHeader = layoutListHeaderBinding;
        this.inTopPicksHeader = layoutListHeaderBinding2;
        this.ivSectorLoader = camomileSpinner;
        this.llCategorySectorNotFound = linearLayout;
        this.llFragmentProductWrapper = linearLayout2;
        this.llReloadBtn = linearLayout3;
        this.recyclerViewProductCategoriesSector = recyclerView;
        this.rvProductBestCommissionList = layoutProductRecyclerviewBinding;
        this.rvProductTopPicksList = layoutProductRecyclerviewBinding2;
        this.srProductHomeWrapper = swipeRefreshLayout2;
        this.textViewFragmentProductsSearchbar = textView;
        this.viewDivider = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentProductHomeBinding bind(View view) {
        View $r1;
        View $r12;
        int $i0 = R$id.in_best_commission_header;
        View $r13 = view.findViewById($i0);
        if ($r13 != null) {
            LayoutListHeaderBinding $r2 = LayoutListHeaderBinding.bind($r13);
            $i0 = R$id.in_top_picks_header;
            View $r14 = view.findViewById($i0);
            if ($r14 != null) {
                LayoutListHeaderBinding $r3 = LayoutListHeaderBinding.bind($r14);
                $i0 = R$id.iv_sector_loader;
                CamomileSpinner camomileSpinner = (CamomileSpinner) view.findViewById($i0);
                if (camomileSpinner != null) {
                    $i0 = R$id.ll_category_sector_not_found;
                    LinearLayout linearLayout = (LinearLayout) view.findViewById($i0);
                    if (linearLayout != null) {
                        $i0 = R$id.ll_fragment_product_wrapper;
                        LinearLayout linearLayout2 = (LinearLayout) view.findViewById($i0);
                        if (linearLayout2 != null) {
                            $i0 = R$id.ll_reload_btn;
                            LinearLayout linearLayout3 = (LinearLayout) view.findViewById($i0);
                            if (linearLayout3 != null) {
                                $i0 = R$id.recyclerView_product_categories_sector;
                                RecyclerView recyclerView = (RecyclerView) view.findViewById($i0);
                                if (recyclerView != null && ($r1 = view.findViewById(($i0 = R$id.rv_product_best_commission_list))) != null) {
                                    LayoutProductRecyclerviewBinding $r9 = LayoutProductRecyclerviewBinding.bind($r1);
                                    $i0 = R$id.rv_product_top_picks_list;
                                    View $r15 = view.findViewById($i0);
                                    if ($r15 != null) {
                                        LayoutProductRecyclerviewBinding $r10 = LayoutProductRecyclerviewBinding.bind($r15);
                                        SwipeRefreshLayout $r11 = (SwipeRefreshLayout) view;
                                        $i0 = R$id.textView_fragment_products_searchbar;
                                        TextView $r122 = (TextView) view.findViewById($i0);
                                        if ($r122 != null && ($r12 = view.findViewById(($i0 = R$id.view_divider))) != null) {
                                            FragmentProductHomeBinding $r132 = new FragmentProductHomeBinding($r11, $r2, $r3, camomileSpinner, linearLayout, linearLayout2, linearLayout3, recyclerView, $r9, $r10, $r11, $r122, $r12);
                                            return $r132;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r142 = view.getResources();
        String $r152 = $r142.getResourceName($i0);
        NullPointerException $r16 = new NullPointerException("Missing required view with ID: ".concat($r152));
        throw $r16;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentProductHomeBinding inflate(LayoutInflater layoutInflater) {
        FragmentProductHomeBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentProductHomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = R$layout.fragment_product_home;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentProductHomeBinding $r3 = bind($r2);
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
    public SwipeRefreshLayout getRoot() {
        SwipeRefreshLayout r1 = this.rootView;
        return r1;
    }
}

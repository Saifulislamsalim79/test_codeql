package ai.kudi.agent.collections.databinding;

import ai.kudi.agent.collections.R$id;
import ai.kudi.agent.collections.R$layout;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.gmail.samehadar.iosdialog.CamomileSpinner;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentProductListBinding implements InterfaceC8209a {
    public final FrameLayout flProductListWrapper;
    public final LayoutListHeaderBinding inCategoryHeader;
    public final LayoutReloadContentBinding inNotFoundWrapper;
    public final CamomileSpinner ivProductListLoader;
    public final CamomileSpinner ivSectorLoader;
    public final LinearLayout llCategorySectorNotFound;
    public final LinearLayout llFragmentProductWrapper;
    public final LinearLayout llReloadBtn;
    public final RecyclerView recyclerViewProductCategoriesSector;
    private final FrameLayout rootView;
    public final RecyclerView rvProductList;
    public final TextView textViewFragmentProductsSearchbar;
    public final View viewDivider;

    private FragmentProductListBinding(FrameLayout frameLayout, FrameLayout frameLayout2, LayoutListHeaderBinding layoutListHeaderBinding, LayoutReloadContentBinding layoutReloadContentBinding, CamomileSpinner camomileSpinner, CamomileSpinner camomileSpinner2, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView, View view) {
        this.rootView = frameLayout;
        this.flProductListWrapper = frameLayout2;
        this.inCategoryHeader = layoutListHeaderBinding;
        this.inNotFoundWrapper = layoutReloadContentBinding;
        this.ivProductListLoader = camomileSpinner;
        this.ivSectorLoader = camomileSpinner2;
        this.llCategorySectorNotFound = linearLayout;
        this.llFragmentProductWrapper = linearLayout2;
        this.llReloadBtn = linearLayout3;
        this.recyclerViewProductCategoriesSector = recyclerView;
        this.rvProductList = recyclerView2;
        this.textViewFragmentProductsSearchbar = textView;
        this.viewDivider = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentProductListBinding bind(View view) {
        View $r1;
        View $r12;
        int $i0 = R$id.fl_product_list_wrapper;
        FrameLayout frameLayout = (FrameLayout) view.findViewById($i0);
        if (frameLayout != null && ($r1 = view.findViewById(($i0 = R$id.in_category_header))) != null) {
            LayoutListHeaderBinding $r3 = LayoutListHeaderBinding.bind($r1);
            $i0 = R$id.in_not_found_wrapper;
            View $r13 = view.findViewById($i0);
            if ($r13 != null) {
                LayoutReloadContentBinding $r4 = LayoutReloadContentBinding.bind($r13);
                $i0 = R$id.iv_product_list_loader;
                CamomileSpinner camomileSpinner = (CamomileSpinner) view.findViewById($i0);
                if (camomileSpinner != null) {
                    $i0 = R$id.iv_sector_loader;
                    CamomileSpinner camomileSpinner2 = (CamomileSpinner) view.findViewById($i0);
                    if (camomileSpinner2 != null) {
                        $i0 = R$id.ll_category_sector_not_found;
                        LinearLayout linearLayout = (LinearLayout) view.findViewById($i0);
                        if (linearLayout != null) {
                            $i0 = R$id.ll_fragment_product_wrapper;
                            LinearLayout linearLayout2 = (LinearLayout) view.findViewById($i0);
                            if (linearLayout2 != null) {
                                $i0 = R$id.ll_reload_btn;
                                LinearLayout $r9 = (LinearLayout) view.findViewById($i0);
                                if ($r9 != null) {
                                    $i0 = R$id.recyclerView_product_categories_sector;
                                    RecyclerView $r10 = (RecyclerView) view.findViewById($i0);
                                    if ($r10 != null) {
                                        $i0 = R$id.rv_product_list;
                                        RecyclerView $r11 = (RecyclerView) view.findViewById($i0);
                                        if ($r11 != null) {
                                            $i0 = R$id.textView_fragment_products_searchbar;
                                            TextView $r122 = (TextView) view.findViewById($i0);
                                            if ($r122 != null && ($r12 = view.findViewById(($i0 = R$id.view_divider))) != null) {
                                                FrameLayout $r14 = (FrameLayout) view;
                                                FragmentProductListBinding $r132 = new FragmentProductListBinding($r14, frameLayout, $r3, $r4, camomileSpinner, camomileSpinner2, linearLayout, linearLayout2, $r9, $r10, $r11, $r122, $r12);
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
        }
        Resources $r15 = view.getResources();
        String $r16 = $r15.getResourceName($i0);
        NullPointerException $r17 = new NullPointerException("Missing required view with ID: ".concat($r16));
        throw $r17;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentProductListBinding inflate(LayoutInflater layoutInflater) {
        FragmentProductListBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentProductListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = R$layout.fragment_product_list;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentProductListBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        FrameLayout $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public FrameLayout getRoot() {
        FrameLayout r1 = this.rootView;
        return r1;
    }
}

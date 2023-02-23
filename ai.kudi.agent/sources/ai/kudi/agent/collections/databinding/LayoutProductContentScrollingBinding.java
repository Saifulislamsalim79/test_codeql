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
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class LayoutProductContentScrollingBinding implements InterfaceC8209a {
    public final LinearLayout constraintScrollingContainer;
    public final LinearLayout llNoResultFound;
    public final LayoutListHeaderBinding productListHeader;
    public final RecyclerView recyclerViewProductCategoriesList;
    public final RecyclerView recyclerViewProductCategoriesSector;
    private final LinearLayout rootView;
    public final SwipeRefreshLayout srProductListWrapper;
    public final TextView tvNotFoundLabel;
    public final TextView tvNotFoundText;
    public final TextView tvReloadBtn;
    public final View viewDivider;

    private LayoutProductContentScrollingBinding(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LayoutListHeaderBinding layoutListHeaderBinding, RecyclerView recyclerView, RecyclerView recyclerView2, SwipeRefreshLayout swipeRefreshLayout, TextView textView, TextView textView2, TextView textView3, View view) {
        this.rootView = linearLayout;
        this.constraintScrollingContainer = linearLayout2;
        this.llNoResultFound = linearLayout3;
        this.productListHeader = layoutListHeaderBinding;
        this.recyclerViewProductCategoriesList = recyclerView;
        this.recyclerViewProductCategoriesSector = recyclerView2;
        this.srProductListWrapper = swipeRefreshLayout;
        this.tvNotFoundLabel = textView;
        this.tvNotFoundText = textView2;
        this.tvReloadBtn = textView3;
        this.viewDivider = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutProductContentScrollingBinding bind(View view) {
        View $r2;
        View $r22;
        LinearLayout $r1 = (LinearLayout) view;
        int $i0 = R$id.ll_no_result_found;
        LinearLayout linearLayout = (LinearLayout) view.findViewById($i0);
        if (linearLayout != null && ($r2 = view.findViewById(($i0 = R$id.product_list_header))) != null) {
            LayoutListHeaderBinding $r4 = LayoutListHeaderBinding.bind($r2);
            $i0 = R$id.recyclerView_product_categories_list;
            RecyclerView recyclerView = (RecyclerView) view.findViewById($i0);
            if (recyclerView != null) {
                $i0 = R$id.recyclerView_product_categories_sector;
                RecyclerView recyclerView2 = (RecyclerView) view.findViewById($i0);
                if (recyclerView2 != null) {
                    $i0 = R$id.sr_product_list_wrapper;
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById($i0);
                    if (swipeRefreshLayout != null) {
                        $i0 = R$id.tv_not_found_label;
                        TextView textView = (TextView) view.findViewById($i0);
                        if (textView != null) {
                            $i0 = R$id.tv_not_found_text;
                            TextView $r9 = (TextView) view.findViewById($i0);
                            if ($r9 != null) {
                                $i0 = R$id.tv_reload_btn;
                                TextView $r10 = (TextView) view.findViewById($i0);
                                if ($r10 != null && ($r22 = view.findViewById(($i0 = R$id.view_divider))) != null) {
                                    LayoutProductContentScrollingBinding $r11 = new LayoutProductContentScrollingBinding($r1, $r1, linearLayout, $r4, recyclerView, recyclerView2, swipeRefreshLayout, textView, $r9, $r10, $r22);
                                    return $r11;
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r12 = view.getResources();
        String $r13 = $r12.getResourceName($i0);
        NullPointerException $r14 = new NullPointerException("Missing required view with ID: ".concat($r13));
        throw $r14;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutProductContentScrollingBinding inflate(LayoutInflater layoutInflater) {
        LayoutProductContentScrollingBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutProductContentScrollingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = R$layout.layout_product_content_scrolling;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        LayoutProductContentScrollingBinding $r3 = bind($r2);
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

package ai.kudi.agent.collections.databinding;

import ai.kudi.agent.collections.R$id;
import ai.kudi.agent.collections.R$layout;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.gmail.samehadar.iosdialog.CamomileSpinner;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class LayoutProductRecyclerviewBinding implements InterfaceC8209a {
    public final CardView cdProductListWrapper;
    public final LayoutReloadContentBinding inNotFoundWrapper;
    public final CamomileSpinner ivProductListLoader;
    private final CardView rootView;
    public final RecyclerView rvProductList;

    private LayoutProductRecyclerviewBinding(CardView cardView, CardView cardView2, LayoutReloadContentBinding layoutReloadContentBinding, CamomileSpinner camomileSpinner, RecyclerView recyclerView) {
        this.rootView = cardView;
        this.cdProductListWrapper = cardView2;
        this.inNotFoundWrapper = layoutReloadContentBinding;
        this.ivProductListLoader = camomileSpinner;
        this.rvProductList = recyclerView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutProductRecyclerviewBinding bind(View view) {
        CardView $r1 = (CardView) view;
        int $i0 = R$id.in_not_found_wrapper;
        View $r2 = view.findViewById($i0);
        if ($r2 != null) {
            LayoutReloadContentBinding $r3 = LayoutReloadContentBinding.bind($r2);
            $i0 = R$id.iv_product_list_loader;
            CamomileSpinner $r4 = (CamomileSpinner) view.findViewById($i0);
            if ($r4 != null) {
                $i0 = R$id.rv_product_list;
                RecyclerView $r5 = (RecyclerView) view.findViewById($i0);
                if ($r5 != null) {
                    LayoutProductRecyclerviewBinding $r6 = new LayoutProductRecyclerviewBinding($r1, $r1, $r3, $r4, $r5);
                    return $r6;
                }
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
    public static LayoutProductRecyclerviewBinding inflate(LayoutInflater layoutInflater) {
        LayoutProductRecyclerviewBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutProductRecyclerviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = R$layout.layout_product_recyclerview;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        LayoutProductRecyclerviewBinding $r3 = bind($r2);
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
    public CardView getRoot() {
        CardView r1 = this.rootView;
        return r1;
    }
}

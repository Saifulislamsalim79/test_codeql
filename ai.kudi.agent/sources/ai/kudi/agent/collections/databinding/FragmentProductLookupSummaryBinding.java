package ai.kudi.agent.collections.databinding;

import ai.kudi.agent.collections.R$id;
import ai.kudi.agent.collections.R$layout;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentProductLookupSummaryBinding implements InterfaceC8209a {
    public final ImageView ivSummaryFirstDependencyLoader;
    private final FrameLayout rootView;
    public final RecyclerView rvProductLookupFirstDependencySummary;
    public final RecyclerView rvProductLookupSummary;
    public final KudiButton tvProceedBtn;

    private FragmentProductLookupSummaryBinding(FrameLayout frameLayout, ImageView imageView, RecyclerView recyclerView, RecyclerView recyclerView2, KudiButton kudiButton) {
        this.rootView = frameLayout;
        this.ivSummaryFirstDependencyLoader = imageView;
        this.rvProductLookupFirstDependencySummary = recyclerView;
        this.rvProductLookupSummary = recyclerView2;
        this.tvProceedBtn = kudiButton;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentProductLookupSummaryBinding bind(View view) {
        int $i0 = R$id.iv_summary_first_dependency_loader;
        View $r1 = view.findViewById($i0);
        ImageView $r2 = (ImageView) $r1;
        if ($r2 != null) {
            $i0 = R$id.rv_product_lookup_first_dependency_summary;
            View $r12 = view.findViewById($i0);
            RecyclerView $r3 = (RecyclerView) $r12;
            if ($r3 != null) {
                $i0 = R$id.rv_product_lookup_summary;
                View $r13 = view.findViewById($i0);
                RecyclerView $r4 = (RecyclerView) $r13;
                if ($r4 != null) {
                    $i0 = R$id.tv_proceed_btn;
                    View $r14 = view.findViewById($i0);
                    KudiButton $r5 = (KudiButton) $r14;
                    if ($r5 != null) {
                        FragmentProductLookupSummaryBinding $r6 = new FragmentProductLookupSummaryBinding((FrameLayout) view, $r2, $r3, $r4, $r5);
                        return $r6;
                    }
                }
            }
        }
        Resources $r8 = view.getResources();
        String $r9 = $r8.getResourceName($i0);
        NullPointerException $r10 = new NullPointerException("Missing required view with ID: ".concat($r9));
        throw $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentProductLookupSummaryBinding inflate(LayoutInflater layoutInflater) {
        FragmentProductLookupSummaryBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentProductLookupSummaryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = R$layout.fragment_product_lookup_summary;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentProductLookupSummaryBinding $r3 = bind($r2);
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

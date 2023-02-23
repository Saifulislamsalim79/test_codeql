package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentOutletsListingBinding implements InterfaceC8209a {
    public final ConstraintLayout clEmptyState;
    public final FloatingActionButton fabLinkOutlet;
    public final ImageView ivIcon;
    public final LayoutListShimmerLoaderBinding layoutListShimmerLoader;
    public final LinearLayout llFilter;
    private final ConstraintLayout rootView;
    public final RecyclerView rvOutletRequest;
    public final TextView tvDesc;
    public final TextView tvStatusFilter;
    public final TextView tvTitle;
    public final View view24;

    private FragmentOutletsListingBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, FloatingActionButton floatingActionButton, ImageView imageView, LayoutListShimmerLoaderBinding layoutListShimmerLoaderBinding, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, View view) {
        this.rootView = constraintLayout;
        this.clEmptyState = constraintLayout2;
        this.fabLinkOutlet = floatingActionButton;
        this.ivIcon = imageView;
        this.layoutListShimmerLoader = layoutListShimmerLoaderBinding;
        this.llFilter = linearLayout;
        this.rvOutletRequest = recyclerView;
        this.tvDesc = textView;
        this.tvStatusFilter = textView2;
        this.tvTitle = textView3;
        this.view24 = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentOutletsListingBinding bind(View view) {
        int $i0 = C0001R.C0003id.cl_empty_state;
        View $r1 = view.findViewById(C0001R.C0003id.cl_empty_state);
        ConstraintLayout constraintLayout = (ConstraintLayout) $r1;
        if (constraintLayout != null) {
            $i0 = C0001R.C0003id.fab_link_outlet;
            View $r12 = view.findViewById(C0001R.C0003id.fab_link_outlet);
            FloatingActionButton floatingActionButton = (FloatingActionButton) $r12;
            if (floatingActionButton != null) {
                $i0 = C0001R.C0003id.iv_icon;
                View $r13 = view.findViewById(C0001R.C0003id.iv_icon);
                ImageView imageView = (ImageView) $r13;
                if (imageView != null) {
                    $i0 = C0001R.C0003id.layout_list_shimmer_loader;
                    View $r14 = view.findViewById(C0001R.C0003id.layout_list_shimmer_loader);
                    if ($r14 != null) {
                        LayoutListShimmerLoaderBinding $r5 = LayoutListShimmerLoaderBinding.bind($r14);
                        $i0 = C0001R.C0003id.ll_filter;
                        View $r15 = view.findViewById(C0001R.C0003id.ll_filter);
                        LinearLayout linearLayout = (LinearLayout) $r15;
                        if (linearLayout != null) {
                            $i0 = C0001R.C0003id.rv_outlet_request;
                            View $r16 = view.findViewById(C0001R.C0003id.rv_outlet_request);
                            RecyclerView recyclerView = (RecyclerView) $r16;
                            if (recyclerView != null) {
                                $i0 = C0001R.C0003id.tv_desc;
                                View $r17 = view.findViewById(C0001R.C0003id.tv_desc);
                                TextView $r8 = (TextView) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.tv_status_filter;
                                    View $r18 = view.findViewById(C0001R.C0003id.tv_status_filter);
                                    TextView $r9 = (TextView) $r18;
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.tv_title;
                                        View $r19 = view.findViewById(C0001R.C0003id.tv_title);
                                        TextView $r10 = (TextView) $r19;
                                        if ($r10 != null) {
                                            $i0 = C0001R.C0003id.view24;
                                            View $r110 = view.findViewById(C0001R.C0003id.view24);
                                            if ($r110 != null) {
                                                ConstraintLayout $r122 = (ConstraintLayout) view;
                                                FragmentOutletsListingBinding $r11 = new FragmentOutletsListingBinding($r122, constraintLayout, floatingActionButton, imageView, $r5, linearLayout, recyclerView, $r8, $r9, $r10, $r110);
                                                return $r11;
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
        Resources $r132 = view.getResources();
        String $r142 = $r132.getResourceName($i0);
        NullPointerException $r152 = new NullPointerException("Missing required view with ID: ".concat($r142));
        throw $r152;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentOutletsListingBinding inflate(LayoutInflater layoutInflater) {
        FragmentOutletsListingBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentOutletsListingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_outlets_listing, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentOutletsListingBinding $r3 = bind($r2);
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

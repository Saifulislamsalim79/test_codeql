package ai.kudi.agent.collections.databinding;

import ai.kudi.agent.collections.R$id;
import ai.kudi.agent.collections.R$layout;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.gmail.samehadar.iosdialog.CamomileSpinner;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentProductDetailsBinding implements InterfaceC8209a {
    public final ImageView imgProductImage;
    public final LayoutBottomButtonBinding inBottomButton;
    public final CamomileSpinner ivPlansLoader;
    public final LinearLayout llFragmentDetailsWrapper;
    private final FrameLayout rootView;
    public final RecyclerView rvProductDetailsPlans;
    public final RecyclerView rvProductFeatures;
    public final FrameLayout svFragmentProductContainer;
    public final TextView textView2;
    public final TextView textViewProductsTitle;
    public final TextView tvAgentCommission;
    public final TextView tvProductAmount;
    public final TextView tvProductBusinessCategory;
    public final TextView tvProductDescription;
    public final TextView tvProductFeatureTitle;
    public final View vwDividerDecorOne;
    public final View vwDividerDecorThree;
    public final View vwDividerDecorTwo;

    private FragmentProductDetailsBinding(FrameLayout frameLayout, ImageView imageView, LayoutBottomButtonBinding layoutBottomButtonBinding, CamomileSpinner camomileSpinner, LinearLayout linearLayout, RecyclerView recyclerView, RecyclerView recyclerView2, FrameLayout frameLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, View view, View view2, View view3) {
        this.rootView = frameLayout;
        this.imgProductImage = imageView;
        this.inBottomButton = layoutBottomButtonBinding;
        this.ivPlansLoader = camomileSpinner;
        this.llFragmentDetailsWrapper = linearLayout;
        this.rvProductDetailsPlans = recyclerView;
        this.rvProductFeatures = recyclerView2;
        this.svFragmentProductContainer = frameLayout2;
        this.textView2 = textView;
        this.textViewProductsTitle = textView2;
        this.tvAgentCommission = textView3;
        this.tvProductAmount = textView4;
        this.tvProductBusinessCategory = textView5;
        this.tvProductDescription = textView6;
        this.tvProductFeatureTitle = textView7;
        this.vwDividerDecorOne = view;
        this.vwDividerDecorThree = view2;
        this.vwDividerDecorTwo = view3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentProductDetailsBinding bind(View view) {
        int $i0 = R$id.img_product_image;
        ImageView imageView = (ImageView) view.findViewById($i0);
        if (imageView != null) {
            $i0 = R$id.in_bottom_button;
            View $r1 = view.findViewById($i0);
            if ($r1 != null) {
                LayoutBottomButtonBinding $r3 = LayoutBottomButtonBinding.bind($r1);
                $i0 = R$id.iv_plans_loader;
                CamomileSpinner camomileSpinner = (CamomileSpinner) view.findViewById($i0);
                if (camomileSpinner != null) {
                    $i0 = R$id.ll_fragment_details_wrapper;
                    LinearLayout linearLayout = (LinearLayout) view.findViewById($i0);
                    if (linearLayout != null) {
                        $i0 = R$id.rv_product_details_plans;
                        RecyclerView recyclerView = (RecyclerView) view.findViewById($i0);
                        if (recyclerView != null) {
                            $i0 = R$id.rv_product_features;
                            RecyclerView recyclerView2 = (RecyclerView) view.findViewById($i0);
                            if (recyclerView2 != null) {
                                FrameLayout frameLayout = (FrameLayout) view;
                                $i0 = R$id.textView2;
                                TextView $r9 = (TextView) view.findViewById($i0);
                                if ($r9 != null) {
                                    $i0 = R$id.textView_products_title;
                                    TextView $r10 = (TextView) view.findViewById($i0);
                                    if ($r10 != null) {
                                        $i0 = R$id.tv_agent_commission;
                                        TextView $r11 = (TextView) view.findViewById($i0);
                                        if ($r11 != null) {
                                            $i0 = R$id.tv_product_amount;
                                            TextView $r12 = (TextView) view.findViewById($i0);
                                            if ($r12 != null) {
                                                $i0 = R$id.tv_product_business_category;
                                                TextView $r13 = (TextView) view.findViewById($i0);
                                                if ($r13 != null) {
                                                    $i0 = R$id.tv_product_description;
                                                    TextView $r14 = (TextView) view.findViewById($i0);
                                                    if ($r14 != null) {
                                                        $i0 = R$id.tv_product_feature_title;
                                                        TextView $r15 = (TextView) view.findViewById($i0);
                                                        if ($r15 != null) {
                                                            $i0 = R$id.vw_divider_decor_one;
                                                            View $r16 = view.findViewById($i0);
                                                            if ($r16 != null) {
                                                                $i0 = R$id.vw_divider_decor_three;
                                                                View $r162 = view.findViewById($i0);
                                                                if ($r162 != null) {
                                                                    $i0 = R$id.vw_divider_decor_two;
                                                                    View $r17 = view.findViewById($i0);
                                                                    if ($r17 != null) {
                                                                        FragmentProductDetailsBinding $r18 = new FragmentProductDetailsBinding(frameLayout, imageView, $r3, camomileSpinner, linearLayout, recyclerView, recyclerView2, frameLayout, $r9, $r10, $r11, $r12, $r13, $r14, $r15, $r16, $r162, $r17);
                                                                        return $r18;
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
                            }
                        }
                    }
                }
            }
        }
        Resources $r19 = view.getResources();
        String $r20 = $r19.getResourceName($i0);
        NullPointerException $r21 = new NullPointerException("Missing required view with ID: ".concat($r20));
        throw $r21;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentProductDetailsBinding inflate(LayoutInflater layoutInflater) {
        FragmentProductDetailsBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentProductDetailsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = R$layout.fragment_product_details;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentProductDetailsBinding $r3 = bind($r2);
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

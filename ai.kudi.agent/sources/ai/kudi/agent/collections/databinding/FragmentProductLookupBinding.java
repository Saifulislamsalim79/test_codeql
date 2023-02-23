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
import android.widget.LinearLayout;
import com.gmail.samehadar.iosdialog.CamomileSpinner;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentProductLookupBinding implements InterfaceC8209a {
    public final FrameLayout flProductLookupLoaderContainer;
    public final CamomileSpinner ivProductLookupLoader;
    public final ImageView ivReloadBtn;
    public final LinearLayout llProductLookupWrapper;
    public final LinearLayout llReloadBtn;
    private final FrameLayout rootView;
    public final KudiButton tvProceedBtn;

    private FragmentProductLookupBinding(FrameLayout frameLayout, FrameLayout frameLayout2, CamomileSpinner camomileSpinner, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, KudiButton kudiButton) {
        this.rootView = frameLayout;
        this.flProductLookupLoaderContainer = frameLayout2;
        this.ivProductLookupLoader = camomileSpinner;
        this.ivReloadBtn = imageView;
        this.llProductLookupWrapper = linearLayout;
        this.llReloadBtn = linearLayout2;
        this.tvProceedBtn = kudiButton;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentProductLookupBinding bind(View view) {
        int $i0 = R$id.fl_product_lookup_loader_container;
        View $r1 = view.findViewById($i0);
        FrameLayout $r2 = (FrameLayout) $r1;
        if ($r2 != null) {
            $i0 = R$id.iv_product_lookup_loader;
            View $r12 = view.findViewById($i0);
            CamomileSpinner $r3 = (CamomileSpinner) $r12;
            if ($r3 != null) {
                $i0 = R$id.iv_reload_btn;
                View $r13 = view.findViewById($i0);
                ImageView $r4 = (ImageView) $r13;
                if ($r4 != null) {
                    $i0 = R$id.ll_product_lookup_wrapper;
                    View $r14 = view.findViewById($i0);
                    LinearLayout linearLayout = (LinearLayout) $r14;
                    if (linearLayout != null) {
                        $i0 = R$id.ll_reload_btn;
                        View $r15 = view.findViewById($i0);
                        LinearLayout linearLayout2 = (LinearLayout) $r15;
                        if (linearLayout2 != null) {
                            $i0 = R$id.tv_proceed_btn;
                            View $r16 = view.findViewById($i0);
                            KudiButton kudiButton = (KudiButton) $r16;
                            if (kudiButton != null) {
                                FrameLayout $r9 = (FrameLayout) view;
                                FragmentProductLookupBinding $r8 = new FragmentProductLookupBinding($r9, $r2, $r3, $r4, linearLayout, linearLayout2, kudiButton);
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
    public static FragmentProductLookupBinding inflate(LayoutInflater layoutInflater) {
        FragmentProductLookupBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentProductLookupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = R$layout.fragment_product_lookup;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentProductLookupBinding $r3 = bind($r2);
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

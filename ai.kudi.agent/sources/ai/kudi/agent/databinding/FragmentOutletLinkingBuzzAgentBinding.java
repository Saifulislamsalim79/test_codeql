package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentOutletLinkingBuzzAgentBinding implements InterfaceC8209a {
    public final ConstraintLayout btnAction;
    public final ImageView closeButtonBuzz;
    public final ScrollView container;
    public final ImageView ivBtnIcon;
    public final ImageView ivIcon;
    public final ViewLoaderBinding loaderView;
    private final ScrollView rootView;
    public final TextView tvBtnBuzz;
    public final TextView tvBtnLabel;
    public final TextView tvMsg;
    public final TextView tvTitle;

    private FragmentOutletLinkingBuzzAgentBinding(ScrollView scrollView, ConstraintLayout constraintLayout, ImageView imageView, ScrollView scrollView2, ImageView imageView2, ImageView imageView3, ViewLoaderBinding viewLoaderBinding, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = scrollView;
        this.btnAction = constraintLayout;
        this.closeButtonBuzz = imageView;
        this.container = scrollView2;
        this.ivBtnIcon = imageView2;
        this.ivIcon = imageView3;
        this.loaderView = viewLoaderBinding;
        this.tvBtnBuzz = textView;
        this.tvBtnLabel = textView2;
        this.tvMsg = textView3;
        this.tvTitle = textView4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentOutletLinkingBuzzAgentBinding bind(View view) {
        int $i0 = C0001R.C0003id.btn_action;
        View $r1 = view.findViewById(C0001R.C0003id.btn_action);
        ConstraintLayout constraintLayout = (ConstraintLayout) $r1;
        if (constraintLayout != null) {
            $i0 = C0001R.C0003id.close_button_buzz;
            View $r12 = view.findViewById(C0001R.C0003id.close_button_buzz);
            ImageView imageView = (ImageView) $r12;
            if (imageView != null) {
                ScrollView scrollView = (ScrollView) view;
                $i0 = C0001R.C0003id.iv_btn_icon;
                View $r13 = view.findViewById(C0001R.C0003id.iv_btn_icon);
                ImageView imageView2 = (ImageView) $r13;
                if (imageView2 != null) {
                    $i0 = C0001R.C0003id.iv_icon;
                    View $r14 = view.findViewById(C0001R.C0003id.iv_icon);
                    ImageView imageView3 = (ImageView) $r14;
                    if (imageView3 != null) {
                        $i0 = C0001R.C0003id.loaderView;
                        View $r15 = view.findViewById(C0001R.C0003id.loaderView);
                        if ($r15 != null) {
                            ViewLoaderBinding $r7 = ViewLoaderBinding.bind($r15);
                            $i0 = C0001R.C0003id.tv_btn_buzz;
                            View $r16 = view.findViewById(C0001R.C0003id.tv_btn_buzz);
                            TextView $r8 = (TextView) $r16;
                            if ($r8 != null) {
                                $i0 = C0001R.C0003id.tv_btn_label;
                                View $r17 = view.findViewById(C0001R.C0003id.tv_btn_label);
                                TextView $r9 = (TextView) $r17;
                                if ($r9 != null) {
                                    $i0 = C0001R.C0003id.tv_msg;
                                    View $r18 = view.findViewById(C0001R.C0003id.tv_msg);
                                    TextView $r10 = (TextView) $r18;
                                    if ($r10 != null) {
                                        $i0 = C0001R.C0003id.tv_title;
                                        View $r19 = view.findViewById(C0001R.C0003id.tv_title);
                                        TextView $r11 = (TextView) $r19;
                                        if ($r11 != null) {
                                            FragmentOutletLinkingBuzzAgentBinding $r122 = new FragmentOutletLinkingBuzzAgentBinding(scrollView, constraintLayout, imageView, scrollView, imageView2, imageView3, $r7, $r8, $r9, $r10, $r11);
                                            return $r122;
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
    public static FragmentOutletLinkingBuzzAgentBinding inflate(LayoutInflater layoutInflater) {
        FragmentOutletLinkingBuzzAgentBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentOutletLinkingBuzzAgentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_outlet_linking_buzz_agent, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentOutletLinkingBuzzAgentBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        ScrollView $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public ScrollView getRoot() {
        ScrollView r1 = this.rootView;
        return r1;
    }
}

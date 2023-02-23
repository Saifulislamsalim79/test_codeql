package ai.kudi.agent.core.databinding;

import ai.kudi.agent.core.C0038R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentSuccessScreenBinding implements InterfaceC8209a {
    public final BottomLoginViewBinding bottomView;
    public final KudiButton btnAction;
    public final ImageView closeImageView;
    public final ConstraintLayout container;
    public final ImageView ivIcon;
    private final ConstraintLayout rootView;
    public final KudiTextView tvMsg;
    public final KudiTextView tvTitle;

    private FragmentSuccessScreenBinding(ConstraintLayout constraintLayout, BottomLoginViewBinding bottomLoginViewBinding, KudiButton kudiButton, ImageView imageView, ConstraintLayout constraintLayout2, ImageView imageView2, KudiTextView kudiTextView, KudiTextView kudiTextView2) {
        this.rootView = constraintLayout;
        this.bottomView = bottomLoginViewBinding;
        this.btnAction = kudiButton;
        this.closeImageView = imageView;
        this.container = constraintLayout2;
        this.ivIcon = imageView2;
        this.tvMsg = kudiTextView;
        this.tvTitle = kudiTextView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentSuccessScreenBinding bind(View view) {
        int $i0 = C0038R.C0040id.bottomView;
        View $r1 = view.findViewById($i0);
        if ($r1 != null) {
            BottomLoginViewBinding $r2 = BottomLoginViewBinding.bind($r1);
            $i0 = C0038R.C0040id.btn_action;
            KudiButton $r3 = (KudiButton) view.findViewById($i0);
            if ($r3 != null) {
                $i0 = C0038R.C0040id.closeImageView;
                ImageView $r4 = (ImageView) view.findViewById($i0);
                if ($r4 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    $i0 = C0038R.C0040id.iv_icon;
                    ImageView imageView = (ImageView) view.findViewById($i0);
                    if (imageView != null) {
                        $i0 = C0038R.C0040id.tv_msg;
                        KudiTextView kudiTextView = (KudiTextView) view.findViewById($i0);
                        if (kudiTextView != null) {
                            $i0 = C0038R.C0040id.tv_title;
                            KudiTextView kudiTextView2 = (KudiTextView) view.findViewById($i0);
                            if (kudiTextView2 != null) {
                                FragmentSuccessScreenBinding $r9 = new FragmentSuccessScreenBinding(constraintLayout, $r2, $r3, $r4, constraintLayout, imageView, kudiTextView, kudiTextView2);
                                return $r9;
                            }
                        }
                    }
                }
            }
        }
        Resources $r10 = view.getResources();
        String $r11 = $r10.getResourceName($i0);
        NullPointerException $r12 = new NullPointerException("Missing required view with ID: ".concat($r11));
        throw $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentSuccessScreenBinding inflate(LayoutInflater layoutInflater) {
        FragmentSuccessScreenBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentSuccessScreenBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0038R.C0041layout.fragment_success_screen;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentSuccessScreenBinding $r3 = bind($r2);
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

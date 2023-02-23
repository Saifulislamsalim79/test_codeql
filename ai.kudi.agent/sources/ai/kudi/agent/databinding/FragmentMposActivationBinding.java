package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentMposActivationBinding implements InterfaceC8209a {
    public final ConstraintLayout btnActivate;
    public final ImageView ivBtnIcon;
    public final ImageView ivIcon;
    private final ConstraintLayout rootView;
    public final TextView tvBtnLabel;
    public final TextView tvDesc;

    private FragmentMposActivationBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.btnActivate = constraintLayout2;
        this.ivBtnIcon = imageView;
        this.ivIcon = imageView2;
        this.tvBtnLabel = textView;
        this.tvDesc = textView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentMposActivationBinding bind(View view) {
        int $i0 = C0001R.C0003id.btn_activate;
        View $r1 = view.findViewById(C0001R.C0003id.btn_activate);
        ConstraintLayout $r2 = (ConstraintLayout) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.iv_btn_icon;
            View $r12 = view.findViewById(C0001R.C0003id.iv_btn_icon);
            ImageView $r3 = (ImageView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.iv_icon;
                View $r13 = view.findViewById(C0001R.C0003id.iv_icon);
                ImageView $r4 = (ImageView) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.tv_btn_label;
                    View $r14 = view.findViewById(C0001R.C0003id.tv_btn_label);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        $i0 = C0001R.C0003id.tv_desc;
                        View $r15 = view.findViewById(C0001R.C0003id.tv_desc);
                        TextView textView2 = (TextView) $r15;
                        if (textView2 != null) {
                            ConstraintLayout $r8 = (ConstraintLayout) view;
                            FragmentMposActivationBinding $r7 = new FragmentMposActivationBinding($r8, $r2, $r3, $r4, textView, textView2);
                            return $r7;
                        }
                    }
                }
            }
        }
        Resources $r9 = view.getResources();
        String $r10 = $r9.getResourceName($i0);
        NullPointerException $r11 = new NullPointerException("Missing required view with ID: ".concat($r10));
        throw $r11;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentMposActivationBinding inflate(LayoutInflater layoutInflater) {
        FragmentMposActivationBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentMposActivationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_mpos_activation, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentMposActivationBinding $r3 = bind($r2);
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

package ai.kudi.agent.collections.databinding;

import ai.kudi.agent.collections.R$id;
import ai.kudi.agent.collections.R$layout;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
import pl.droidsonroids.gif.GifImageView;
/* loaded from: classes.dex */
public final class LayoutMarketplaceProductDialogBinding implements InterfaceC8209a {
    public final GifImageView GIVDialog;
    public final ImageView IVCloseBtn;
    private final ConstraintLayout rootView;
    public final KudiButton tvDialogBtn;
    public final TextView tvDialogLabelText;

    private LayoutMarketplaceProductDialogBinding(ConstraintLayout constraintLayout, GifImageView gifImageView, ImageView imageView, KudiButton kudiButton, TextView textView) {
        this.rootView = constraintLayout;
        this.GIVDialog = gifImageView;
        this.IVCloseBtn = imageView;
        this.tvDialogBtn = kudiButton;
        this.tvDialogLabelText = textView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutMarketplaceProductDialogBinding bind(View view) {
        int $i0 = R$id.GIV_dialog;
        View $r1 = view.findViewById($i0);
        GifImageView $r2 = (GifImageView) $r1;
        if ($r2 != null) {
            $i0 = R$id.IV_close_btn;
            View $r12 = view.findViewById($i0);
            ImageView $r3 = (ImageView) $r12;
            if ($r3 != null) {
                $i0 = R$id.tv_dialog_btn;
                View $r13 = view.findViewById($i0);
                KudiButton $r4 = (KudiButton) $r13;
                if ($r4 != null) {
                    $i0 = R$id.tv_dialog_label_text;
                    View $r14 = view.findViewById($i0);
                    TextView $r5 = (TextView) $r14;
                    if ($r5 != null) {
                        LayoutMarketplaceProductDialogBinding $r6 = new LayoutMarketplaceProductDialogBinding((ConstraintLayout) view, $r2, $r3, $r4, $r5);
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
    public static LayoutMarketplaceProductDialogBinding inflate(LayoutInflater layoutInflater) {
        LayoutMarketplaceProductDialogBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutMarketplaceProductDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = R$layout.layout_marketplace_product_dialog;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        LayoutMarketplaceProductDialogBinding $r3 = bind($r2);
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

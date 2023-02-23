package ai.kudi.agent.collections.databinding;

import ai.kudi.agent.collections.R$id;
import ai.kudi.agent.collections.R$layout;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class LayoutProductItemBinding implements InterfaceC8209a {
    public final ConstraintLayout clProductContainer;
    public final CardView cvProductImage;
    public final ImageView imgProductImage;
    private final ConstraintLayout rootView;
    public final TextView textViewProductsSubtitle;
    public final TextView textViewProductsTitle;

    private LayoutProductItemBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, CardView cardView, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.clProductContainer = constraintLayout2;
        this.cvProductImage = cardView;
        this.imgProductImage = imageView;
        this.textViewProductsSubtitle = textView;
        this.textViewProductsTitle = textView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutProductItemBinding bind(View view) {
        ConstraintLayout $r1 = (ConstraintLayout) view;
        int $i0 = R$id.cv_product_image;
        View $r2 = view.findViewById($i0);
        CardView $r3 = (CardView) $r2;
        if ($r3 != null) {
            $i0 = R$id.img_product_image;
            View $r22 = view.findViewById($i0);
            ImageView $r4 = (ImageView) $r22;
            if ($r4 != null) {
                $i0 = R$id.textView_products_subtitle;
                View $r23 = view.findViewById($i0);
                TextView textView = (TextView) $r23;
                if (textView != null) {
                    $i0 = R$id.textView_products_title;
                    View $r24 = view.findViewById($i0);
                    TextView textView2 = (TextView) $r24;
                    if (textView2 != null) {
                        LayoutProductItemBinding $r7 = new LayoutProductItemBinding($r1, $r1, $r3, $r4, textView, textView2);
                        return $r7;
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
    public static LayoutProductItemBinding inflate(LayoutInflater layoutInflater) {
        LayoutProductItemBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutProductItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = R$layout.layout_product_item;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        LayoutProductItemBinding $r3 = bind($r2);
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

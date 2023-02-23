package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class LayoutCarouselDashboardBinding implements InterfaceC8209a {
    public final CardView cardViewItemWrapper;
    public final ImageView imageViewItemImage;
    private final CardView rootView;
    public final TextView textViewItemDescription;
    public final TextView textViewItemTitle;

    private LayoutCarouselDashboardBinding(CardView cardView, CardView cardView2, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = cardView;
        this.cardViewItemWrapper = cardView2;
        this.imageViewItemImage = imageView;
        this.textViewItemDescription = textView;
        this.textViewItemTitle = textView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutCarouselDashboardBinding bind(View view) {
        CardView $r1 = (CardView) view;
        int $i0 = C0001R.C0003id.imageView_item_image;
        View $r2 = view.findViewById(C0001R.C0003id.imageView_item_image);
        ImageView $r3 = (ImageView) $r2;
        if ($r3 != null) {
            $i0 = C0001R.C0003id.textView_item_description;
            View $r22 = view.findViewById(C0001R.C0003id.textView_item_description);
            TextView $r4 = (TextView) $r22;
            if ($r4 != null) {
                $i0 = C0001R.C0003id.textView_item_title;
                View $r23 = view.findViewById(C0001R.C0003id.textView_item_title);
                TextView textView = (TextView) $r23;
                if (textView != null) {
                    LayoutCarouselDashboardBinding $r6 = new LayoutCarouselDashboardBinding($r1, $r1, $r3, $r4, textView);
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
    public static LayoutCarouselDashboardBinding inflate(LayoutInflater layoutInflater) {
        LayoutCarouselDashboardBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutCarouselDashboardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.layout_carousel_dashboard, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        LayoutCarouselDashboardBinding $r3 = bind($r2);
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

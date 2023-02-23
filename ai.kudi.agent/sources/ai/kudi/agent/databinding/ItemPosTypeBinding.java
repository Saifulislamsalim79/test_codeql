package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ItemPosTypeBinding implements InterfaceC8209a {
    public final CardView cvPosType;
    public final AppCompatImageView ivChecked;
    public final AppCompatImageView ivPosType;
    private final CardView rootView;
    public final TextView tvPosDesc;
    public final TextView tvPosType;

    private ItemPosTypeBinding(CardView cardView, CardView cardView2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, TextView textView, TextView textView2) {
        this.rootView = cardView;
        this.cvPosType = cardView2;
        this.ivChecked = appCompatImageView;
        this.ivPosType = appCompatImageView2;
        this.tvPosDesc = textView;
        this.tvPosType = textView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ItemPosTypeBinding bind(View view) {
        CardView $r1 = (CardView) view;
        int $i0 = C0001R.C0003id.iv_checked;
        View $r2 = view.findViewById(C0001R.C0003id.iv_checked);
        AppCompatImageView $r3 = (AppCompatImageView) $r2;
        if ($r3 != null) {
            $i0 = C0001R.C0003id.ivPosType;
            View $r22 = view.findViewById(C0001R.C0003id.ivPosType);
            AppCompatImageView $r4 = (AppCompatImageView) $r22;
            if ($r4 != null) {
                $i0 = C0001R.C0003id.tvPosDesc;
                View $r23 = view.findViewById(C0001R.C0003id.tvPosDesc);
                TextView textView = (TextView) $r23;
                if (textView != null) {
                    $i0 = C0001R.C0003id.tvPosType;
                    View $r24 = view.findViewById(C0001R.C0003id.tvPosType);
                    TextView textView2 = (TextView) $r24;
                    if (textView2 != null) {
                        ItemPosTypeBinding $r7 = new ItemPosTypeBinding($r1, $r1, $r3, $r4, textView, textView2);
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
    public static ItemPosTypeBinding inflate(LayoutInflater layoutInflater) {
        ItemPosTypeBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ItemPosTypeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.item_pos_type, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ItemPosTypeBinding $r3 = bind($r2);
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

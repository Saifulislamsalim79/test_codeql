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
public final class LayoutOptionBinding implements InterfaceC8209a {
    public final ImageView ivIcon;
    private final CardView rootView;
    public final TextView tvBadge;
    public final TextView tvDesc;
    public final TextView tvLabel;

    private LayoutOptionBinding(CardView cardView, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = cardView;
        this.ivIcon = imageView;
        this.tvBadge = textView;
        this.tvDesc = textView2;
        this.tvLabel = textView3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutOptionBinding bind(View view) {
        int $i0 = C0001R.C0003id.iv_icon;
        View $r1 = view.findViewById(C0001R.C0003id.iv_icon);
        ImageView $r2 = (ImageView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.tv_badge;
            View $r12 = view.findViewById(C0001R.C0003id.tv_badge);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.tv_desc;
                View $r13 = view.findViewById(C0001R.C0003id.tv_desc);
                TextView $r4 = (TextView) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.tv_label;
                    View $r14 = view.findViewById(C0001R.C0003id.tv_label);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        LayoutOptionBinding $r6 = new LayoutOptionBinding((CardView) view, $r2, $r3, $r4, textView);
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
    public static LayoutOptionBinding inflate(LayoutInflater layoutInflater) {
        LayoutOptionBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutOptionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.layout_option, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        LayoutOptionBinding $r3 = bind($r2);
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

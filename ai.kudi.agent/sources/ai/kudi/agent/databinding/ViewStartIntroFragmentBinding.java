package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ViewStartIntroFragmentBinding implements InterfaceC8209a {
    public final CardView introImageCard;
    public final ImageView introImageView;
    public final Guideline midGuideline;
    private final ConstraintLayout rootView;
    public final TextView subTitle;
    public final TextView title;

    private ViewStartIntroFragmentBinding(ConstraintLayout constraintLayout, CardView cardView, ImageView imageView, Guideline guideline, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.introImageCard = cardView;
        this.introImageView = imageView;
        this.midGuideline = guideline;
        this.subTitle = textView;
        this.title = textView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewStartIntroFragmentBinding bind(View view) {
        int $i0 = C0001R.C0003id.introImageCard;
        View $r1 = view.findViewById(C0001R.C0003id.introImageCard);
        CardView $r2 = (CardView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.introImageView;
            View $r12 = view.findViewById(C0001R.C0003id.introImageView);
            ImageView $r3 = (ImageView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.midGuideline;
                View $r13 = view.findViewById(C0001R.C0003id.midGuideline);
                Guideline $r4 = (Guideline) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.sub_title;
                    View $r14 = view.findViewById(C0001R.C0003id.sub_title);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        $i0 = C0001R.C0003id.title;
                        View $r15 = view.findViewById(C0001R.C0003id.title);
                        TextView textView2 = (TextView) $r15;
                        if (textView2 != null) {
                            ConstraintLayout $r8 = (ConstraintLayout) view;
                            ViewStartIntroFragmentBinding $r7 = new ViewStartIntroFragmentBinding($r8, $r2, $r3, $r4, textView, textView2);
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
    public static ViewStartIntroFragmentBinding inflate(LayoutInflater layoutInflater) {
        ViewStartIntroFragmentBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewStartIntroFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.view_start_intro_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ViewStartIntroFragmentBinding $r3 = bind($r2);
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

package ai.kudi.agent.feature_issue_resolution.databinding;

import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class LayoutChargeBackQuestionBinding implements InterfaceC8209a {
    public final ImageView imageView10;
    public final TextView noItWasntButton;
    private final CardView rootView;
    public final TextView textView42;
    public final TextView textView43;
    public final KudiButton yesItWasButton;

    private LayoutChargeBackQuestionBinding(CardView cardView, ImageView imageView, TextView textView, TextView textView2, TextView textView3, KudiButton kudiButton) {
        this.rootView = cardView;
        this.imageView10 = imageView;
        this.noItWasntButton = textView;
        this.textView42 = textView2;
        this.textView43 = textView3;
        this.yesItWasButton = kudiButton;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutChargeBackQuestionBinding bind(View view) {
        int $i0 = C0214R.C0216id.imageView10;
        View $r1 = view.findViewById($i0);
        ImageView $r2 = (ImageView) $r1;
        if ($r2 != null) {
            $i0 = C0214R.C0216id.no_it_wasnt_button;
            View $r12 = view.findViewById($i0);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0214R.C0216id.textView42;
                View $r13 = view.findViewById($i0);
                TextView $r4 = (TextView) $r13;
                if ($r4 != null) {
                    $i0 = C0214R.C0216id.textView43;
                    View $r14 = view.findViewById($i0);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        $i0 = C0214R.C0216id.yes_it_was_button;
                        View $r15 = view.findViewById($i0);
                        KudiButton kudiButton = (KudiButton) $r15;
                        if (kudiButton != null) {
                            LayoutChargeBackQuestionBinding $r7 = new LayoutChargeBackQuestionBinding((CardView) view, $r2, $r3, $r4, textView, kudiButton);
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
    public static LayoutChargeBackQuestionBinding inflate(LayoutInflater layoutInflater) {
        LayoutChargeBackQuestionBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutChargeBackQuestionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0214R.C0217layout.layout_charge_back_question;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        LayoutChargeBackQuestionBinding $r3 = bind($r2);
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

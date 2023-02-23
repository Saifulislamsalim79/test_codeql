package ai.kudi.agent.feature_issue_resolution.databinding;

import ai.kudi.agent.feature_issue_resolution.C0214R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentKycformIssueBinding implements InterfaceC8209a {
    public final ImageView helpfulImage;
    public final TextView helpfulText;
    public final ImageView helplessImage;
    public final TextView helplessText;
    private final ConstraintLayout rootView;
    public final TextView textView26;
    public final TextView textView27;

    private FragmentKycformIssueBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, ImageView imageView2, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = constraintLayout;
        this.helpfulImage = imageView;
        this.helpfulText = textView;
        this.helplessImage = imageView2;
        this.helplessText = textView2;
        this.textView26 = textView3;
        this.textView27 = textView4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentKycformIssueBinding bind(View view) {
        int $i0 = C0214R.C0216id.helpfulImage;
        View $r1 = view.findViewById($i0);
        ImageView $r2 = (ImageView) $r1;
        if ($r2 != null) {
            $i0 = C0214R.C0216id.helpfulText;
            View $r12 = view.findViewById($i0);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0214R.C0216id.helplessImage;
                View $r13 = view.findViewById($i0);
                ImageView $r4 = (ImageView) $r13;
                if ($r4 != null) {
                    $i0 = C0214R.C0216id.helplessText;
                    View $r14 = view.findViewById($i0);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        $i0 = C0214R.C0216id.textView26;
                        View $r15 = view.findViewById($i0);
                        TextView textView2 = (TextView) $r15;
                        if (textView2 != null) {
                            $i0 = C0214R.C0216id.textView27;
                            View $r16 = view.findViewById($i0);
                            TextView textView3 = (TextView) $r16;
                            if (textView3 != null) {
                                ConstraintLayout $r9 = (ConstraintLayout) view;
                                FragmentKycformIssueBinding $r8 = new FragmentKycformIssueBinding($r9, $r2, $r3, $r4, textView, textView2, textView3);
                                return $r8;
                            }
                        }
                    }
                }
            }
        }
        Resources $r10 = view.getResources();
        String $r11 = $r10.getResourceName($i0);
        NullPointerException $r122 = new NullPointerException("Missing required view with ID: ".concat($r11));
        throw $r122;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentKycformIssueBinding inflate(LayoutInflater layoutInflater) {
        FragmentKycformIssueBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentKycformIssueBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0214R.C0217layout.fragment_kycform_issue;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentKycformIssueBinding $r3 = bind($r2);
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

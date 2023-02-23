package ai.kudi.agent.feature_issue_resolution.databinding;

import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentContactUsBinding implements InterfaceC8209a {
    public final TextView checkAppBuildView;
    public final TextView checkFaqsView;
    public final ImageView faceBookView;
    public final ConstraintLayout footer;
    public final ImageView instagramView;
    public final KudiButton kudiButton;
    public final KudiButton kudiButton2;
    public final TextView reveiwAppView;
    private final ConstraintLayout rootView;
    public final TextView termsandConditionView;
    public final TextView textView16;
    public final TextView textView22;
    public final ImageView twitterView;
    public final View view15;
    public final View view16;
    public final View view17;
    public final View view18;
    public final View view19;
    public final TextView visitWebsiteView;

    private FragmentContactUsBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView, ConstraintLayout constraintLayout2, ImageView imageView2, KudiButton kudiButton, KudiButton kudiButton2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, ImageView imageView3, View view, View view2, View view3, View view4, View view5, TextView textView7) {
        this.rootView = constraintLayout;
        this.checkAppBuildView = textView;
        this.checkFaqsView = textView2;
        this.faceBookView = imageView;
        this.footer = constraintLayout2;
        this.instagramView = imageView2;
        this.kudiButton = kudiButton;
        this.kudiButton2 = kudiButton2;
        this.reveiwAppView = textView3;
        this.termsandConditionView = textView4;
        this.textView16 = textView5;
        this.textView22 = textView6;
        this.twitterView = imageView3;
        this.view15 = view;
        this.view16 = view2;
        this.view17 = view3;
        this.view18 = view4;
        this.view19 = view5;
        this.visitWebsiteView = textView7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentContactUsBinding bind(View view) {
        int $i0 = C0214R.C0216id.checkAppBuildView;
        View $r1 = view.findViewById($i0);
        TextView textView = (TextView) $r1;
        if (textView != null) {
            $i0 = C0214R.C0216id.checkFaqsView;
            View $r12 = view.findViewById($i0);
            TextView textView2 = (TextView) $r12;
            if (textView2 != null) {
                $i0 = C0214R.C0216id.faceBookView;
                View $r13 = view.findViewById($i0);
                ImageView imageView = (ImageView) $r13;
                if (imageView != null) {
                    $i0 = C0214R.C0216id.footer;
                    View $r14 = view.findViewById($i0);
                    ConstraintLayout constraintLayout = (ConstraintLayout) $r14;
                    if (constraintLayout != null) {
                        $i0 = C0214R.C0216id.instagramView;
                        View $r15 = view.findViewById($i0);
                        ImageView imageView2 = (ImageView) $r15;
                        if (imageView2 != null) {
                            $i0 = C0214R.C0216id.kudiButton;
                            View $r16 = view.findViewById($i0);
                            KudiButton kudiButton = (KudiButton) $r16;
                            if (kudiButton != null) {
                                $i0 = C0214R.C0216id.kudiButton2;
                                View $r17 = view.findViewById($i0);
                                KudiButton $r8 = (KudiButton) $r17;
                                if ($r8 != null) {
                                    $i0 = C0214R.C0216id.reveiwAppView;
                                    View $r18 = view.findViewById($i0);
                                    TextView $r9 = (TextView) $r18;
                                    if ($r9 != null) {
                                        $i0 = C0214R.C0216id.termsandConditionView;
                                        View $r19 = view.findViewById($i0);
                                        TextView $r10 = (TextView) $r19;
                                        if ($r10 != null) {
                                            $i0 = C0214R.C0216id.textView16;
                                            View $r110 = view.findViewById($i0);
                                            TextView $r11 = (TextView) $r110;
                                            if ($r11 != null) {
                                                $i0 = C0214R.C0216id.textView22;
                                                View $r111 = view.findViewById($i0);
                                                TextView $r122 = (TextView) $r111;
                                                if ($r122 != null) {
                                                    $i0 = C0214R.C0216id.twitterView;
                                                    View $r112 = view.findViewById($i0);
                                                    ImageView $r132 = (ImageView) $r112;
                                                    if ($r132 != null) {
                                                        $i0 = C0214R.C0216id.view15;
                                                        View $r113 = view.findViewById($i0);
                                                        if ($r113 != null) {
                                                            $i0 = C0214R.C0216id.view16;
                                                            View $r142 = view.findViewById($i0);
                                                            if ($r142 != null) {
                                                                $i0 = C0214R.C0216id.view17;
                                                                View $r152 = view.findViewById($i0);
                                                                if ($r152 != null) {
                                                                    $i0 = C0214R.C0216id.view18;
                                                                    View $r162 = view.findViewById($i0);
                                                                    if ($r162 != null) {
                                                                        $i0 = C0214R.C0216id.view19;
                                                                        View $r172 = view.findViewById($i0);
                                                                        if ($r172 != null) {
                                                                            $i0 = C0214R.C0216id.visitWebsiteView;
                                                                            View $r182 = view.findViewById($i0);
                                                                            TextView $r192 = (TextView) $r182;
                                                                            if ($r192 != null) {
                                                                                ConstraintLayout $r21 = (ConstraintLayout) view;
                                                                                FragmentContactUsBinding $r20 = new FragmentContactUsBinding($r21, textView, textView2, imageView, constraintLayout, imageView2, kudiButton, $r8, $r9, $r10, $r11, $r122, $r132, $r113, $r142, $r152, $r162, $r172, $r192);
                                                                                return $r20;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r22 = view.getResources();
        String $r23 = $r22.getResourceName($i0);
        NullPointerException $r24 = new NullPointerException("Missing required view with ID: ".concat($r23));
        throw $r24;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentContactUsBinding inflate(LayoutInflater layoutInflater) {
        FragmentContactUsBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentContactUsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0214R.C0217layout.fragment_contact_us;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentContactUsBinding $r3 = bind($r2);
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

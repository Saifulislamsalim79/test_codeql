package ai.kudi.agent.core.databinding;

import ai.kudi.agent.core.C0038R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentFilterBinding implements InterfaceC8209a {
    public final KudiTextView chooseDateLabelTextView;
    public final KudiTextView chooseDateTextView;
    public final ImageView close;
    public final ConstraintLayout constraintLayout2;
    public final TextView dateCheckerTextView;
    public final View dividerOne;
    public final View dividerTwo;
    public final KudiButton filterButton;
    public final TextView fromDateTextView;
    public final KudiTextView fromTextLabel;
    public final TextView lastSevenDaysCheckTextView;
    public final KudiTextView lastSevenDaysTextView;
    public final KudiTextView lastSevenDaysTextViewLabel;
    public final ConstraintLayout layoutOne;
    public final ConstraintLayout layoutThree;
    public final ConstraintLayout layoutTwo;
    private final ScrollView rootView;
    public final TextView thisMonthCheckTextView;
    public final KudiTextView thisMonthTextView;
    public final KudiTextView thisMonthTextViewLabel;
    public final TextView toDateTextView;
    public final TextView toTextLabel;
    public final TextView todayCheckTextView;
    public final KudiTextView todayDateTextView;
    public final KudiTextView todayTextViewLabel;

    private FragmentFilterBinding(ScrollView scrollView, KudiTextView kudiTextView, KudiTextView kudiTextView2, ImageView imageView, ConstraintLayout constraintLayout, TextView textView, View view, View view2, KudiButton kudiButton, TextView textView2, KudiTextView kudiTextView3, TextView textView3, KudiTextView kudiTextView4, KudiTextView kudiTextView5, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, TextView textView4, KudiTextView kudiTextView6, KudiTextView kudiTextView7, TextView textView5, TextView textView6, TextView textView7, KudiTextView kudiTextView8, KudiTextView kudiTextView9) {
        this.rootView = scrollView;
        this.chooseDateLabelTextView = kudiTextView;
        this.chooseDateTextView = kudiTextView2;
        this.close = imageView;
        this.constraintLayout2 = constraintLayout;
        this.dateCheckerTextView = textView;
        this.dividerOne = view;
        this.dividerTwo = view2;
        this.filterButton = kudiButton;
        this.fromDateTextView = textView2;
        this.fromTextLabel = kudiTextView3;
        this.lastSevenDaysCheckTextView = textView3;
        this.lastSevenDaysTextView = kudiTextView4;
        this.lastSevenDaysTextViewLabel = kudiTextView5;
        this.layoutOne = constraintLayout2;
        this.layoutThree = constraintLayout3;
        this.layoutTwo = constraintLayout4;
        this.thisMonthCheckTextView = textView4;
        this.thisMonthTextView = kudiTextView6;
        this.thisMonthTextViewLabel = kudiTextView7;
        this.toDateTextView = textView5;
        this.toTextLabel = textView6;
        this.todayCheckTextView = textView7;
        this.todayDateTextView = kudiTextView8;
        this.todayTextViewLabel = kudiTextView9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentFilterBinding bind(View view) {
        int $i0 = C0038R.C0040id.chooseDateLabelTextView;
        View $r1 = view.findViewById($i0);
        KudiTextView kudiTextView = (KudiTextView) $r1;
        if (kudiTextView != null) {
            $i0 = C0038R.C0040id.chooseDateTextView;
            View $r12 = view.findViewById($i0);
            KudiTextView kudiTextView2 = (KudiTextView) $r12;
            if (kudiTextView2 != null) {
                $i0 = C0038R.C0040id.close;
                View $r13 = view.findViewById($i0);
                ImageView imageView = (ImageView) $r13;
                if (imageView != null) {
                    $i0 = C0038R.C0040id.constraintLayout2;
                    View $r14 = view.findViewById($i0);
                    ConstraintLayout constraintLayout = (ConstraintLayout) $r14;
                    if (constraintLayout != null) {
                        $i0 = C0038R.C0040id.dateCheckerTextView;
                        View $r15 = view.findViewById($i0);
                        TextView textView = (TextView) $r15;
                        if (textView != null) {
                            $i0 = C0038R.C0040id.dividerOne;
                            View $r16 = view.findViewById($i0);
                            if ($r16 != null) {
                                $i0 = C0038R.C0040id.dividerTwo;
                                View $r7 = view.findViewById($i0);
                                if ($r7 != null) {
                                    $i0 = C0038R.C0040id.filterButton;
                                    View $r8 = view.findViewById($i0);
                                    KudiButton $r9 = (KudiButton) $r8;
                                    if ($r9 != null) {
                                        $i0 = C0038R.C0040id.fromDateTextView;
                                        View $r82 = view.findViewById($i0);
                                        TextView $r10 = (TextView) $r82;
                                        if ($r10 != null) {
                                            $i0 = C0038R.C0040id.fromTextLabel;
                                            View $r83 = view.findViewById($i0);
                                            KudiTextView $r11 = (KudiTextView) $r83;
                                            if ($r11 != null) {
                                                $i0 = C0038R.C0040id.lastSevenDaysCheckTextView;
                                                View $r84 = view.findViewById($i0);
                                                TextView $r122 = (TextView) $r84;
                                                if ($r122 != null) {
                                                    $i0 = C0038R.C0040id.lastSevenDaysTextView;
                                                    View $r85 = view.findViewById($i0);
                                                    KudiTextView $r132 = (KudiTextView) $r85;
                                                    if ($r132 != null) {
                                                        $i0 = C0038R.C0040id.lastSevenDaysTextViewLabel;
                                                        View $r86 = view.findViewById($i0);
                                                        KudiTextView $r142 = (KudiTextView) $r86;
                                                        if ($r142 != null) {
                                                            $i0 = C0038R.C0040id.layoutOne;
                                                            View $r87 = view.findViewById($i0);
                                                            ConstraintLayout $r152 = (ConstraintLayout) $r87;
                                                            if ($r152 != null) {
                                                                $i0 = C0038R.C0040id.layoutThree;
                                                                View $r88 = view.findViewById($i0);
                                                                ConstraintLayout $r162 = (ConstraintLayout) $r88;
                                                                if ($r162 != null) {
                                                                    $i0 = C0038R.C0040id.layoutTwo;
                                                                    View $r89 = view.findViewById($i0);
                                                                    ConstraintLayout $r17 = (ConstraintLayout) $r89;
                                                                    if ($r17 != null) {
                                                                        $i0 = C0038R.C0040id.thisMonthCheckTextView;
                                                                        View $r810 = view.findViewById($i0);
                                                                        TextView $r18 = (TextView) $r810;
                                                                        if ($r18 != null) {
                                                                            $i0 = C0038R.C0040id.thisMonthTextView;
                                                                            View $r811 = view.findViewById($i0);
                                                                            KudiTextView $r19 = (KudiTextView) $r811;
                                                                            if ($r19 != null) {
                                                                                $i0 = C0038R.C0040id.thisMonthTextViewLabel;
                                                                                View $r812 = view.findViewById($i0);
                                                                                KudiTextView $r20 = (KudiTextView) $r812;
                                                                                if ($r20 != null) {
                                                                                    $i0 = C0038R.C0040id.toDateTextView;
                                                                                    View $r813 = view.findViewById($i0);
                                                                                    TextView $r21 = (TextView) $r813;
                                                                                    if ($r21 != null) {
                                                                                        $i0 = C0038R.C0040id.toTextLabel;
                                                                                        View $r814 = view.findViewById($i0);
                                                                                        TextView $r22 = (TextView) $r814;
                                                                                        if ($r22 != null) {
                                                                                            $i0 = C0038R.C0040id.todayCheckTextView;
                                                                                            View $r815 = view.findViewById($i0);
                                                                                            TextView $r23 = (TextView) $r815;
                                                                                            if ($r23 != null) {
                                                                                                $i0 = C0038R.C0040id.todayDateTextView;
                                                                                                View $r816 = view.findViewById($i0);
                                                                                                KudiTextView $r24 = (KudiTextView) $r816;
                                                                                                if ($r24 != null) {
                                                                                                    $i0 = C0038R.C0040id.todayTextViewLabel;
                                                                                                    View $r817 = view.findViewById($i0);
                                                                                                    KudiTextView $r25 = (KudiTextView) $r817;
                                                                                                    if ($r25 != null) {
                                                                                                        ScrollView $r27 = (ScrollView) view;
                                                                                                        FragmentFilterBinding $r26 = new FragmentFilterBinding($r27, kudiTextView, kudiTextView2, imageView, constraintLayout, textView, $r16, $r7, $r9, $r10, $r11, $r122, $r132, $r142, $r152, $r162, $r17, $r18, $r19, $r20, $r21, $r22, $r23, $r24, $r25);
                                                                                                        return $r26;
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
                            }
                        }
                    }
                }
            }
        }
        Resources $r28 = view.getResources();
        String $r29 = $r28.getResourceName($i0);
        NullPointerException $r30 = new NullPointerException("Missing required view with ID: ".concat($r29));
        throw $r30;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentFilterBinding inflate(LayoutInflater layoutInflater) {
        FragmentFilterBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentFilterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0038R.C0041layout.fragment_filter;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentFilterBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        ScrollView $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public ScrollView getRoot() {
        ScrollView r1 = this.rootView;
        return r1;
    }
}

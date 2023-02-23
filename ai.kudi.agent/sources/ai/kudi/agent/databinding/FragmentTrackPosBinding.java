package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentTrackPosBinding implements InterfaceC8209a {
    public final ConstraintLayout disclaimerContainer;
    public final View iconDisclaimer;
    public final View indicatorPhase1;
    public final View indicatorPhase2;
    public final View indicatorPhase3;
    public final ConstraintLayout main;
    private final ConstraintLayout rootView;
    public final TextView textDisclaimer;
    public final TextView textEmpty;
    public final TextView textPhase1;
    public final TextView textPhase2;
    public final TextView textPhase3;

    private FragmentTrackPosBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, View view, View view2, View view3, View view4, ConstraintLayout constraintLayout3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = constraintLayout;
        this.disclaimerContainer = constraintLayout2;
        this.iconDisclaimer = view;
        this.indicatorPhase1 = view2;
        this.indicatorPhase2 = view3;
        this.indicatorPhase3 = view4;
        this.main = constraintLayout3;
        this.textDisclaimer = textView;
        this.textEmpty = textView2;
        this.textPhase1 = textView3;
        this.textPhase2 = textView4;
        this.textPhase3 = textView5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentTrackPosBinding bind(View view) {
        int $i0 = C0001R.C0003id.disclaimer_container;
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(C0001R.C0003id.disclaimer_container);
        if (constraintLayout != null) {
            $i0 = C0001R.C0003id.icon_disclaimer;
            View $r1 = view.findViewById(C0001R.C0003id.icon_disclaimer);
            if ($r1 != null) {
                $i0 = C0001R.C0003id.indicator_phase_1;
                View $r3 = view.findViewById(C0001R.C0003id.indicator_phase_1);
                if ($r3 != null) {
                    $i0 = C0001R.C0003id.indicator_phase_2;
                    View $r4 = view.findViewById(C0001R.C0003id.indicator_phase_2);
                    if ($r4 != null) {
                        $i0 = C0001R.C0003id.indicator_phase_3;
                        View $r5 = view.findViewById(C0001R.C0003id.indicator_phase_3);
                        if ($r5 != null) {
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                            $i0 = C0001R.C0003id.text_disclaimer;
                            View $r7 = view.findViewById(C0001R.C0003id.text_disclaimer);
                            TextView textView = (TextView) $r7;
                            if (textView != null) {
                                $i0 = C0001R.C0003id.text_empty;
                                View $r72 = view.findViewById(C0001R.C0003id.text_empty);
                                TextView textView2 = (TextView) $r72;
                                if (textView2 != null) {
                                    $i0 = C0001R.C0003id.text_phase_1;
                                    View $r73 = view.findViewById(C0001R.C0003id.text_phase_1);
                                    TextView $r10 = (TextView) $r73;
                                    if ($r10 != null) {
                                        $i0 = C0001R.C0003id.text_phase_2;
                                        View $r74 = view.findViewById(C0001R.C0003id.text_phase_2);
                                        TextView $r11 = (TextView) $r74;
                                        if ($r11 != null) {
                                            $i0 = C0001R.C0003id.text_phase_3;
                                            View $r75 = view.findViewById(C0001R.C0003id.text_phase_3);
                                            TextView $r12 = (TextView) $r75;
                                            if ($r12 != null) {
                                                FragmentTrackPosBinding $r13 = new FragmentTrackPosBinding(constraintLayout2, constraintLayout, $r1, $r3, $r4, $r5, constraintLayout2, textView, textView2, $r10, $r11, $r12);
                                                return $r13;
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
        Resources $r14 = view.getResources();
        String $r15 = $r14.getResourceName($i0);
        NullPointerException $r16 = new NullPointerException("Missing required view with ID: ".concat($r15));
        throw $r16;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentTrackPosBinding inflate(LayoutInflater layoutInflater) {
        FragmentTrackPosBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentTrackPosBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_track_pos, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentTrackPosBinding $r3 = bind($r2);
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

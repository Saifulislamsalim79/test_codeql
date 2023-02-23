package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiBadgeButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ViewTrackPosBinding implements InterfaceC8209a {
    public final KudiBadgeButton activateTerminal;
    public final View divider;
    public final Guideline guideline33;
    public final Guideline guideline66;
    public final TextView indicatorPhase1;
    public final TextView indicatorPhase2;
    public final TextView indicatorPhase3;
    private final ConstraintLayout rootView;
    public final TextView textPhase1;
    public final TextView textPhase2;
    public final TextView textPhase3;
    public final TextView textView57;

    private ViewTrackPosBinding(ConstraintLayout constraintLayout, KudiBadgeButton kudiBadgeButton, View view, Guideline guideline, Guideline guideline2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.rootView = constraintLayout;
        this.activateTerminal = kudiBadgeButton;
        this.divider = view;
        this.guideline33 = guideline;
        this.guideline66 = guideline2;
        this.indicatorPhase1 = textView;
        this.indicatorPhase2 = textView2;
        this.indicatorPhase3 = textView3;
        this.textPhase1 = textView4;
        this.textPhase2 = textView5;
        this.textPhase3 = textView6;
        this.textView57 = textView7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewTrackPosBinding bind(View view) {
        int $i0 = C0001R.C0003id.activateTerminal;
        KudiBadgeButton kudiBadgeButton = (KudiBadgeButton) view.findViewById(C0001R.C0003id.activateTerminal);
        if (kudiBadgeButton != null) {
            $i0 = C0001R.C0003id.divider;
            View $r1 = view.findViewById(C0001R.C0003id.divider);
            if ($r1 != null) {
                $i0 = C0001R.C0003id.guideline33;
                View $r3 = view.findViewById(C0001R.C0003id.guideline33);
                Guideline guideline = (Guideline) $r3;
                if (guideline != null) {
                    $i0 = C0001R.C0003id.guideline66;
                    View $r32 = view.findViewById(C0001R.C0003id.guideline66);
                    Guideline guideline2 = (Guideline) $r32;
                    if (guideline2 != null) {
                        $i0 = C0001R.C0003id.indicator_phase_1;
                        View $r33 = view.findViewById(C0001R.C0003id.indicator_phase_1);
                        TextView textView = (TextView) $r33;
                        if (textView != null) {
                            $i0 = C0001R.C0003id.indicator_phase_2;
                            View $r34 = view.findViewById(C0001R.C0003id.indicator_phase_2);
                            TextView textView2 = (TextView) $r34;
                            if (textView2 != null) {
                                $i0 = C0001R.C0003id.indicator_phase_3;
                                View $r35 = view.findViewById(C0001R.C0003id.indicator_phase_3);
                                TextView $r8 = (TextView) $r35;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.text_phase_1;
                                    View $r36 = view.findViewById(C0001R.C0003id.text_phase_1);
                                    TextView $r9 = (TextView) $r36;
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.text_phase_2;
                                        View $r37 = view.findViewById(C0001R.C0003id.text_phase_2);
                                        TextView $r10 = (TextView) $r37;
                                        if ($r10 != null) {
                                            $i0 = C0001R.C0003id.text_phase_3;
                                            View $r38 = view.findViewById(C0001R.C0003id.text_phase_3);
                                            TextView $r11 = (TextView) $r38;
                                            if ($r11 != null) {
                                                $i0 = C0001R.C0003id.textView57;
                                                View $r39 = view.findViewById(C0001R.C0003id.textView57);
                                                TextView $r12 = (TextView) $r39;
                                                if ($r12 != null) {
                                                    ConstraintLayout $r14 = (ConstraintLayout) view;
                                                    ViewTrackPosBinding $r13 = new ViewTrackPosBinding($r14, kudiBadgeButton, $r1, guideline, guideline2, textView, textView2, $r8, $r9, $r10, $r11, $r12);
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
        }
        Resources $r15 = view.getResources();
        String $r16 = $r15.getResourceName($i0);
        NullPointerException $r17 = new NullPointerException("Missing required view with ID: ".concat($r16));
        throw $r17;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewTrackPosBinding inflate(LayoutInflater layoutInflater) {
        ViewTrackPosBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewTrackPosBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.view_track_pos, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ViewTrackPosBinding $r3 = bind($r2);
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

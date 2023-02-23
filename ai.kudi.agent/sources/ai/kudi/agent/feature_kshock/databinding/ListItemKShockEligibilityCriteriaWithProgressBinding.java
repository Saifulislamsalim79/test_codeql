package ai.kudi.agent.feature_kshock.databinding;

import ai.kudi.agent.feature_kshock.C0220R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ListItemKShockEligibilityCriteriaWithProgressBinding implements InterfaceC8209a {
    public final TextView currentValueLabel;
    public final TextView currentValueText;
    public final TextView descriptionText;
    public final CheckBox eligibilityCheckBox;
    public final SeekBar eligibilityProgressBar;
    public final ConstraintLayout kshockEligibilityCriteriaWithPrrogressLayout;
    public final TextView progressCurrentLabel;
    public final TextView progressStartLabel;
    private final ConstraintLayout rootView;

    private ListItemKShockEligibilityCriteriaWithProgressBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, CheckBox checkBox, SeekBar seekBar, ConstraintLayout constraintLayout2, TextView textView4, TextView textView5) {
        this.rootView = constraintLayout;
        this.currentValueLabel = textView;
        this.currentValueText = textView2;
        this.descriptionText = textView3;
        this.eligibilityCheckBox = checkBox;
        this.eligibilityProgressBar = seekBar;
        this.kshockEligibilityCriteriaWithPrrogressLayout = constraintLayout2;
        this.progressCurrentLabel = textView4;
        this.progressStartLabel = textView5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ListItemKShockEligibilityCriteriaWithProgressBinding bind(View view) {
        int $i0 = C0220R.C0222id.current_value_label;
        View $r1 = view.findViewById($i0);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0220R.C0222id.current_value_text;
            View $r12 = view.findViewById($i0);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0220R.C0222id.description_text;
                View $r13 = view.findViewById($i0);
                TextView textView = (TextView) $r13;
                if (textView != null) {
                    $i0 = C0220R.C0222id.eligibility_check_box;
                    View $r14 = view.findViewById($i0);
                    CheckBox checkBox = (CheckBox) $r14;
                    if (checkBox != null) {
                        $i0 = C0220R.C0222id.eligibility_progress_bar;
                        View $r15 = view.findViewById($i0);
                        SeekBar seekBar = (SeekBar) $r15;
                        if (seekBar != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            $i0 = C0220R.C0222id.progress_current_label;
                            View $r16 = view.findViewById($i0);
                            TextView $r8 = (TextView) $r16;
                            if ($r8 != null) {
                                $i0 = C0220R.C0222id.progress_start_label;
                                View $r17 = view.findViewById($i0);
                                TextView $r9 = (TextView) $r17;
                                if ($r9 != null) {
                                    ListItemKShockEligibilityCriteriaWithProgressBinding $r10 = new ListItemKShockEligibilityCriteriaWithProgressBinding(constraintLayout, $r2, $r3, textView, checkBox, seekBar, constraintLayout, $r8, $r9);
                                    return $r10;
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r11 = view.getResources();
        String $r122 = $r11.getResourceName($i0);
        NullPointerException $r132 = new NullPointerException("Missing required view with ID: ".concat($r122));
        throw $r132;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ListItemKShockEligibilityCriteriaWithProgressBinding inflate(LayoutInflater layoutInflater) {
        ListItemKShockEligibilityCriteriaWithProgressBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ListItemKShockEligibilityCriteriaWithProgressBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0220R.C0223layout.list_item_k_shock_eligibility_criteria_with_progress;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ListItemKShockEligibilityCriteriaWithProgressBinding $r3 = bind($r2);
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

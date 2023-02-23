package ai.kudi.agent.feature_issue_resolution.databinding;

import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import ai.kudi.dip.library.edittext.KudiNairaInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentSubmitIssueBinding implements InterfaceC8209a {
    public final KudiInputField firstSixDigitsView;
    public final KudiInputField lastFourDigitsView;
    private final ConstraintLayout rootView;
    public final KudiInputField rrnView;
    public final KudiButton submitIssueButton;
    public final KudiNairaInputField transactionAmountView;
    public final KudiInputField transactionDate;

    private FragmentSubmitIssueBinding(ConstraintLayout constraintLayout, KudiInputField kudiInputField, KudiInputField kudiInputField2, KudiInputField kudiInputField3, KudiButton kudiButton, KudiNairaInputField kudiNairaInputField, KudiInputField kudiInputField4) {
        this.rootView = constraintLayout;
        this.firstSixDigitsView = kudiInputField;
        this.lastFourDigitsView = kudiInputField2;
        this.rrnView = kudiInputField3;
        this.submitIssueButton = kudiButton;
        this.transactionAmountView = kudiNairaInputField;
        this.transactionDate = kudiInputField4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentSubmitIssueBinding bind(View view) {
        int $i0 = C0214R.C0216id.firstSixDigitsView;
        View $r1 = view.findViewById($i0);
        KudiInputField $r2 = (KudiInputField) $r1;
        if ($r2 != null) {
            $i0 = C0214R.C0216id.lastFourDigitsView;
            View $r12 = view.findViewById($i0);
            KudiInputField $r3 = (KudiInputField) $r12;
            if ($r3 != null) {
                $i0 = C0214R.C0216id.rrnView;
                View $r13 = view.findViewById($i0);
                KudiInputField $r4 = (KudiInputField) $r13;
                if ($r4 != null) {
                    $i0 = C0214R.C0216id.submitIssueButton;
                    View $r14 = view.findViewById($i0);
                    KudiButton kudiButton = (KudiButton) $r14;
                    if (kudiButton != null) {
                        $i0 = C0214R.C0216id.transactionAmountView;
                        View $r15 = view.findViewById($i0);
                        KudiNairaInputField kudiNairaInputField = (KudiNairaInputField) $r15;
                        if (kudiNairaInputField != null) {
                            $i0 = C0214R.C0216id.transactionDate;
                            View $r16 = view.findViewById($i0);
                            KudiInputField kudiInputField = (KudiInputField) $r16;
                            if (kudiInputField != null) {
                                ConstraintLayout $r9 = (ConstraintLayout) view;
                                FragmentSubmitIssueBinding $r8 = new FragmentSubmitIssueBinding($r9, $r2, $r3, $r4, kudiButton, kudiNairaInputField, kudiInputField);
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
    public static FragmentSubmitIssueBinding inflate(LayoutInflater layoutInflater) {
        FragmentSubmitIssueBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentSubmitIssueBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0214R.C0217layout.fragment_submit_issue;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentSubmitIssueBinding $r3 = bind($r2);
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

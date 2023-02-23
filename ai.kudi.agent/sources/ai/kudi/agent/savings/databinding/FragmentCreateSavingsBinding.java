package ai.kudi.agent.savings.databinding;

import ai.kudi.agent.savings.C0456R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.button.KudiRadioButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentCreateSavingsBinding implements InterfaceC8209a {
    public final KudiInputField kiAmount;
    public final KudiInputField kiDuration;
    public final KudiInputField kiSavingName;
    public final KudiInputField kiStartDate;
    public final KudiRadioButton rbNo;
    public final KudiRadioButton rbYes;
    public final RadioGroup rgLockSaving;
    private final ScrollView rootView;
    public final KudiButton startButton;
    public final TextView tvLockAccount;

    private FragmentCreateSavingsBinding(ScrollView scrollView, KudiInputField kudiInputField, KudiInputField kudiInputField2, KudiInputField kudiInputField3, KudiInputField kudiInputField4, KudiRadioButton kudiRadioButton, KudiRadioButton kudiRadioButton2, RadioGroup radioGroup, KudiButton kudiButton, TextView textView) {
        this.rootView = scrollView;
        this.kiAmount = kudiInputField;
        this.kiDuration = kudiInputField2;
        this.kiSavingName = kudiInputField3;
        this.kiStartDate = kudiInputField4;
        this.rbNo = kudiRadioButton;
        this.rbYes = kudiRadioButton2;
        this.rgLockSaving = radioGroup;
        this.startButton = kudiButton;
        this.tvLockAccount = textView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentCreateSavingsBinding bind(View view) {
        int $i0 = C0456R.C0458id.kiAmount;
        View $r1 = view.findViewById($i0);
        KudiInputField $r2 = (KudiInputField) $r1;
        if ($r2 != null) {
            $i0 = C0456R.C0458id.kiDuration;
            View $r12 = view.findViewById($i0);
            KudiInputField kudiInputField = (KudiInputField) $r12;
            if (kudiInputField != null) {
                $i0 = C0456R.C0458id.kiSavingName;
                View $r13 = view.findViewById($i0);
                KudiInputField kudiInputField2 = (KudiInputField) $r13;
                if (kudiInputField2 != null) {
                    $i0 = C0456R.C0458id.kiStartDate;
                    View $r14 = view.findViewById($i0);
                    KudiInputField kudiInputField3 = (KudiInputField) $r14;
                    if (kudiInputField3 != null) {
                        $i0 = C0456R.C0458id.rbNo;
                        View $r15 = view.findViewById($i0);
                        KudiRadioButton kudiRadioButton = (KudiRadioButton) $r15;
                        if (kudiRadioButton != null) {
                            $i0 = C0456R.C0458id.rbYes;
                            View $r16 = view.findViewById($i0);
                            KudiRadioButton kudiRadioButton2 = (KudiRadioButton) $r16;
                            if (kudiRadioButton2 != null) {
                                $i0 = C0456R.C0458id.rgLockSaving;
                                View $r17 = view.findViewById($i0);
                                RadioGroup $r8 = (RadioGroup) $r17;
                                if ($r8 != null) {
                                    $i0 = C0456R.C0458id.startButton;
                                    View $r18 = view.findViewById($i0);
                                    KudiButton $r9 = (KudiButton) $r18;
                                    if ($r9 != null) {
                                        $i0 = C0456R.C0458id.tvLockAccount;
                                        View $r19 = view.findViewById($i0);
                                        TextView $r10 = (TextView) $r19;
                                        if ($r10 != null) {
                                            ScrollView $r122 = (ScrollView) view;
                                            FragmentCreateSavingsBinding $r11 = new FragmentCreateSavingsBinding($r122, $r2, kudiInputField, kudiInputField2, kudiInputField3, kudiRadioButton, kudiRadioButton2, $r8, $r9, $r10);
                                            return $r11;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r132 = view.getResources();
        String $r142 = $r132.getResourceName($i0);
        NullPointerException $r152 = new NullPointerException("Missing required view with ID: ".concat($r142));
        throw $r152;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentCreateSavingsBinding inflate(LayoutInflater layoutInflater) {
        FragmentCreateSavingsBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentCreateSavingsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0456R.C0459layout.fragment_create_savings;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentCreateSavingsBinding $r3 = bind($r2);
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

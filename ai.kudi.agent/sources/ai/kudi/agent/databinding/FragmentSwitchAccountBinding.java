package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.button.KudiRadioButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentSwitchAccountBinding implements InterfaceC8209a {
    public final KudiRadioButton agentRadioButton;
    public final LinearLayout layout;
    public final KudiRadioButton merchantAgentRadioButton;
    public final KudiRadioButton merchantRadioButton;
    public final ProgressBar primaryBusinessProgressBar;
    public final ProgressBar progressBar5;
    private final ScrollView rootView;
    public final KudiButton saveButton;
    public final KudiInputField specifyPrimaryBusiness;

    private FragmentSwitchAccountBinding(ScrollView scrollView, KudiRadioButton kudiRadioButton, LinearLayout linearLayout, KudiRadioButton kudiRadioButton2, KudiRadioButton kudiRadioButton3, ProgressBar progressBar, ProgressBar progressBar2, KudiButton kudiButton, KudiInputField kudiInputField) {
        this.rootView = scrollView;
        this.agentRadioButton = kudiRadioButton;
        this.layout = linearLayout;
        this.merchantAgentRadioButton = kudiRadioButton2;
        this.merchantRadioButton = kudiRadioButton3;
        this.primaryBusinessProgressBar = progressBar;
        this.progressBar5 = progressBar2;
        this.saveButton = kudiButton;
        this.specifyPrimaryBusiness = kudiInputField;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentSwitchAccountBinding bind(View view) {
        int $i0 = C0001R.C0003id.agent_radio_button;
        View $r1 = view.findViewById(C0001R.C0003id.agent_radio_button);
        KudiRadioButton $r2 = (KudiRadioButton) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.layout;
            View $r12 = view.findViewById(C0001R.C0003id.layout);
            LinearLayout linearLayout = (LinearLayout) $r12;
            if (linearLayout != null) {
                $i0 = C0001R.C0003id.merchant_agent_radio_button;
                View $r13 = view.findViewById(C0001R.C0003id.merchant_agent_radio_button);
                KudiRadioButton kudiRadioButton = (KudiRadioButton) $r13;
                if (kudiRadioButton != null) {
                    $i0 = C0001R.C0003id.merchant_radio_button;
                    View $r14 = view.findViewById(C0001R.C0003id.merchant_radio_button);
                    KudiRadioButton kudiRadioButton2 = (KudiRadioButton) $r14;
                    if (kudiRadioButton2 != null) {
                        $i0 = C0001R.C0003id.primaryBusinessProgressBar;
                        View $r15 = view.findViewById(C0001R.C0003id.primaryBusinessProgressBar);
                        ProgressBar progressBar = (ProgressBar) $r15;
                        if (progressBar != null) {
                            $i0 = C0001R.C0003id.progressBar5;
                            View $r16 = view.findViewById(C0001R.C0003id.progressBar5);
                            ProgressBar progressBar2 = (ProgressBar) $r16;
                            if (progressBar2 != null) {
                                $i0 = C0001R.C0003id.save_button;
                                View $r17 = view.findViewById(C0001R.C0003id.save_button);
                                KudiButton $r8 = (KudiButton) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.specifyPrimaryBusiness;
                                    View $r18 = view.findViewById(C0001R.C0003id.specifyPrimaryBusiness);
                                    KudiInputField $r9 = (KudiInputField) $r18;
                                    if ($r9 != null) {
                                        ScrollView $r11 = (ScrollView) view;
                                        FragmentSwitchAccountBinding $r10 = new FragmentSwitchAccountBinding($r11, $r2, linearLayout, kudiRadioButton, kudiRadioButton2, progressBar, progressBar2, $r8, $r9);
                                        return $r10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r122 = view.getResources();
        String $r132 = $r122.getResourceName($i0);
        NullPointerException $r142 = new NullPointerException("Missing required view with ID: ".concat($r132));
        throw $r142;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentSwitchAccountBinding inflate(LayoutInflater layoutInflater) {
        FragmentSwitchAccountBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentSwitchAccountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_switch_account, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentSwitchAccountBinding $r3 = bind($r2);
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

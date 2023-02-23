package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.button.KudiRadioButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentSelectBusinessTypeBinding implements InterfaceC8209a {
    public final KudiRadioButton agentRadioButton;
    public final KudiButton continueButton;
    public final KudiRadioButton merchantAgentRadioButton;
    public final KudiRadioButton merchantRadioButton;
    private final ScrollView rootView;
    public final TextView welcomeText;

    private FragmentSelectBusinessTypeBinding(ScrollView scrollView, KudiRadioButton kudiRadioButton, KudiButton kudiButton, KudiRadioButton kudiRadioButton2, KudiRadioButton kudiRadioButton3, TextView textView) {
        this.rootView = scrollView;
        this.agentRadioButton = kudiRadioButton;
        this.continueButton = kudiButton;
        this.merchantAgentRadioButton = kudiRadioButton2;
        this.merchantRadioButton = kudiRadioButton3;
        this.welcomeText = textView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentSelectBusinessTypeBinding bind(View view) {
        int $i0 = C0001R.C0003id.agent_radio_button;
        View $r1 = view.findViewById(C0001R.C0003id.agent_radio_button);
        KudiRadioButton $r2 = (KudiRadioButton) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.continue_button;
            View $r12 = view.findViewById(C0001R.C0003id.continue_button);
            KudiButton $r3 = (KudiButton) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.merchant_agent_radio_button;
                View $r13 = view.findViewById(C0001R.C0003id.merchant_agent_radio_button);
                KudiRadioButton $r4 = (KudiRadioButton) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.merchant_radio_button;
                    View $r14 = view.findViewById(C0001R.C0003id.merchant_radio_button);
                    KudiRadioButton kudiRadioButton = (KudiRadioButton) $r14;
                    if (kudiRadioButton != null) {
                        $i0 = C0001R.C0003id.welcomeText;
                        View $r15 = view.findViewById(C0001R.C0003id.welcomeText);
                        TextView textView = (TextView) $r15;
                        if (textView != null) {
                            ScrollView $r8 = (ScrollView) view;
                            FragmentSelectBusinessTypeBinding $r7 = new FragmentSelectBusinessTypeBinding($r8, $r2, $r3, $r4, kudiRadioButton, textView);
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
    public static FragmentSelectBusinessTypeBinding inflate(LayoutInflater layoutInflater) {
        FragmentSelectBusinessTypeBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentSelectBusinessTypeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_select_business_type, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentSelectBusinessTypeBinding $r3 = bind($r2);
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

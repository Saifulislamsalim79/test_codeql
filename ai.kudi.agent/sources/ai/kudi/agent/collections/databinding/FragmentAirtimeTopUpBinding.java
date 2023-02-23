package ai.kudi.agent.collections.databinding;

import ai.kudi.agent.collections.R$id;
import ai.kudi.agent.collections.R$layout;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentAirtimeTopUpBinding implements InterfaceC8209a {
    public final KudiButton buttonContinue;
    public final KudiInputField kifRecipientPhoneNumber;
    private final ConstraintLayout rootView;
    public final TextView spinnerDataPlan;
    public final TextView spinnerNetwork;
    public final TextView textNetworkError;

    private FragmentAirtimeTopUpBinding(ConstraintLayout constraintLayout, KudiButton kudiButton, KudiInputField kudiInputField, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.buttonContinue = kudiButton;
        this.kifRecipientPhoneNumber = kudiInputField;
        this.spinnerDataPlan = textView;
        this.spinnerNetwork = textView2;
        this.textNetworkError = textView3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentAirtimeTopUpBinding bind(View view) {
        int $i0 = R$id.button_continue;
        View $r1 = view.findViewById($i0);
        KudiButton $r2 = (KudiButton) $r1;
        if ($r2 != null) {
            $i0 = R$id.kif_recipient_phone_number;
            View $r12 = view.findViewById($i0);
            KudiInputField $r3 = (KudiInputField) $r12;
            if ($r3 != null) {
                $i0 = R$id.spinner_data_plan;
                View $r13 = view.findViewById($i0);
                TextView $r4 = (TextView) $r13;
                if ($r4 != null) {
                    $i0 = R$id.spinner_network;
                    View $r14 = view.findViewById($i0);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        $i0 = R$id.text_network_error;
                        View $r15 = view.findViewById($i0);
                        TextView textView2 = (TextView) $r15;
                        if (textView2 != null) {
                            FragmentAirtimeTopUpBinding $r7 = new FragmentAirtimeTopUpBinding((ConstraintLayout) view, $r2, $r3, $r4, textView, textView2);
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
    public static FragmentAirtimeTopUpBinding inflate(LayoutInflater layoutInflater) {
        FragmentAirtimeTopUpBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentAirtimeTopUpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = R$layout.fragment_airtime_top_up;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentAirtimeTopUpBinding $r3 = bind($r2);
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

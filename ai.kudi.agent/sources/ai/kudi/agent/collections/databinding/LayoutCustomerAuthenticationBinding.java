package ai.kudi.agent.collections.databinding;

import ai.kudi.agent.collections.R$id;
import ai.kudi.agent.collections.R$layout;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class LayoutCustomerAuthenticationBinding implements InterfaceC8209a {
    public final EditText etOtpInput;
    public final KudiButton rlVerifyOtpBtn;
    private final LinearLayout rootView;
    public final TextView tvErrorMessage;

    private LayoutCustomerAuthenticationBinding(LinearLayout linearLayout, EditText editText, KudiButton kudiButton, TextView textView) {
        this.rootView = linearLayout;
        this.etOtpInput = editText;
        this.rlVerifyOtpBtn = kudiButton;
        this.tvErrorMessage = textView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutCustomerAuthenticationBinding bind(View view) {
        int $i0 = R$id.et_otp_input;
        View $r1 = view.findViewById($i0);
        EditText $r2 = (EditText) $r1;
        if ($r2 != null) {
            $i0 = R$id.rl_verify_otp_btn;
            View $r12 = view.findViewById($i0);
            KudiButton $r3 = (KudiButton) $r12;
            if ($r3 != null) {
                $i0 = R$id.tv_error_message;
                View $r13 = view.findViewById($i0);
                TextView $r4 = (TextView) $r13;
                if ($r4 != null) {
                    LinearLayout $r6 = (LinearLayout) view;
                    LayoutCustomerAuthenticationBinding $r5 = new LayoutCustomerAuthenticationBinding($r6, $r2, $r3, $r4);
                    return $r5;
                }
            }
        }
        Resources $r7 = view.getResources();
        String $r8 = $r7.getResourceName($i0);
        NullPointerException $r9 = new NullPointerException("Missing required view with ID: ".concat($r8));
        throw $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutCustomerAuthenticationBinding inflate(LayoutInflater layoutInflater) {
        LayoutCustomerAuthenticationBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutCustomerAuthenticationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = R$layout.layout_customer_authentication;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        LayoutCustomerAuthenticationBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        LinearLayout $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public LinearLayout getRoot() {
        LinearLayout r1 = this.rootView;
        return r1;
    }
}

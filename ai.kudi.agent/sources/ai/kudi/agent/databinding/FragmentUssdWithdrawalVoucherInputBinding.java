package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentUssdWithdrawalVoucherInputBinding implements InterfaceC8209a {
    public final KudiButton btnContinue;
    public final KudiButton btnRetry;
    public final KudiInputField etPhoneNum;
    public final KudiInputField etProvider;
    public final KudiInputField etVoucher;
    public final LinearLayout filledState;
    public final LinearLayout retryState;
    private final ScrollView rootView;
    public final TextView tvDesc;
    public final TextView tvPhoneNumNotif;

    private FragmentUssdWithdrawalVoucherInputBinding(ScrollView scrollView, KudiButton kudiButton, KudiButton kudiButton2, KudiInputField kudiInputField, KudiInputField kudiInputField2, KudiInputField kudiInputField3, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        this.rootView = scrollView;
        this.btnContinue = kudiButton;
        this.btnRetry = kudiButton2;
        this.etPhoneNum = kudiInputField;
        this.etProvider = kudiInputField2;
        this.etVoucher = kudiInputField3;
        this.filledState = linearLayout;
        this.retryState = linearLayout2;
        this.tvDesc = textView;
        this.tvPhoneNumNotif = textView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentUssdWithdrawalVoucherInputBinding bind(View view) {
        int $i0 = C0001R.C0003id.btn_continue;
        View $r1 = view.findViewById(C0001R.C0003id.btn_continue);
        KudiButton $r2 = (KudiButton) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.btn_retry;
            View $r12 = view.findViewById(C0001R.C0003id.btn_retry);
            KudiButton kudiButton = (KudiButton) $r12;
            if (kudiButton != null) {
                $i0 = C0001R.C0003id.et_phone_num;
                View $r13 = view.findViewById(C0001R.C0003id.et_phone_num);
                KudiInputField kudiInputField = (KudiInputField) $r13;
                if (kudiInputField != null) {
                    $i0 = C0001R.C0003id.et_provider;
                    View $r14 = view.findViewById(C0001R.C0003id.et_provider);
                    KudiInputField kudiInputField2 = (KudiInputField) $r14;
                    if (kudiInputField2 != null) {
                        $i0 = C0001R.C0003id.et_voucher;
                        View $r15 = view.findViewById(C0001R.C0003id.et_voucher);
                        KudiInputField kudiInputField3 = (KudiInputField) $r15;
                        if (kudiInputField3 != null) {
                            $i0 = C0001R.C0003id.filledState;
                            View $r16 = view.findViewById(C0001R.C0003id.filledState);
                            LinearLayout linearLayout = (LinearLayout) $r16;
                            if (linearLayout != null) {
                                $i0 = C0001R.C0003id.retryState;
                                View $r17 = view.findViewById(C0001R.C0003id.retryState);
                                LinearLayout $r8 = (LinearLayout) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.tv_desc;
                                    View $r18 = view.findViewById(C0001R.C0003id.tv_desc);
                                    TextView $r9 = (TextView) $r18;
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.tv_phone_num_notif;
                                        View $r19 = view.findViewById(C0001R.C0003id.tv_phone_num_notif);
                                        TextView $r10 = (TextView) $r19;
                                        if ($r10 != null) {
                                            ScrollView $r122 = (ScrollView) view;
                                            FragmentUssdWithdrawalVoucherInputBinding $r11 = new FragmentUssdWithdrawalVoucherInputBinding($r122, $r2, kudiButton, kudiInputField, kudiInputField2, kudiInputField3, linearLayout, $r8, $r9, $r10);
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
    public static FragmentUssdWithdrawalVoucherInputBinding inflate(LayoutInflater layoutInflater) {
        FragmentUssdWithdrawalVoucherInputBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentUssdWithdrawalVoucherInputBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_ussd_withdrawal_voucher_input, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentUssdWithdrawalVoucherInputBinding $r3 = bind($r2);
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

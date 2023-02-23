package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentPendingVerificationBinding implements InterfaceC8209a {
    public final TextView btnClose;
    public final KudiButton btnContinue;
    public final KudiInputField customersOccupation;
    public final KudiInputField etCustomerName;
    public final KudiInputField etCustomerPhone;
    public final ImageView ivHeaderIcon;
    public final KudiInputField pendingKycDateOfBirth;
    public final KudiInputField pendingKycIdNumber;
    public final KudiInputField pendingKycIdType;
    public final KudiInputField reasonForWidthrawal;
    private final ScrollView rootView;
    public final TextView tvDescBody;
    public final TextView tvDescTitle;

    private FragmentPendingVerificationBinding(ScrollView scrollView, TextView textView, KudiButton kudiButton, KudiInputField kudiInputField, KudiInputField kudiInputField2, KudiInputField kudiInputField3, ImageView imageView, KudiInputField kudiInputField4, KudiInputField kudiInputField5, KudiInputField kudiInputField6, KudiInputField kudiInputField7, TextView textView2, TextView textView3) {
        this.rootView = scrollView;
        this.btnClose = textView;
        this.btnContinue = kudiButton;
        this.customersOccupation = kudiInputField;
        this.etCustomerName = kudiInputField2;
        this.etCustomerPhone = kudiInputField3;
        this.ivHeaderIcon = imageView;
        this.pendingKycDateOfBirth = kudiInputField4;
        this.pendingKycIdNumber = kudiInputField5;
        this.pendingKycIdType = kudiInputField6;
        this.reasonForWidthrawal = kudiInputField7;
        this.tvDescBody = textView2;
        this.tvDescTitle = textView3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPendingVerificationBinding bind(View view) {
        int $i0 = C0001R.C0003id.btn_close;
        View $r1 = view.findViewById(C0001R.C0003id.btn_close);
        TextView textView = (TextView) $r1;
        if (textView != null) {
            $i0 = C0001R.C0003id.btn_continue;
            View $r12 = view.findViewById(C0001R.C0003id.btn_continue);
            KudiButton kudiButton = (KudiButton) $r12;
            if (kudiButton != null) {
                $i0 = C0001R.C0003id.customers_occupation;
                View $r13 = view.findViewById(C0001R.C0003id.customers_occupation);
                KudiInputField kudiInputField = (KudiInputField) $r13;
                if (kudiInputField != null) {
                    $i0 = C0001R.C0003id.et_customer_name;
                    View $r14 = view.findViewById(C0001R.C0003id.et_customer_name);
                    KudiInputField kudiInputField2 = (KudiInputField) $r14;
                    if (kudiInputField2 != null) {
                        $i0 = C0001R.C0003id.et_customer_phone;
                        View $r15 = view.findViewById(C0001R.C0003id.et_customer_phone);
                        KudiInputField kudiInputField3 = (KudiInputField) $r15;
                        if (kudiInputField3 != null) {
                            $i0 = C0001R.C0003id.iv_header_icon;
                            View $r16 = view.findViewById(C0001R.C0003id.iv_header_icon);
                            ImageView imageView = (ImageView) $r16;
                            if (imageView != null) {
                                $i0 = C0001R.C0003id.pending_kyc_date_of_birth;
                                View $r17 = view.findViewById(C0001R.C0003id.pending_kyc_date_of_birth);
                                KudiInputField $r8 = (KudiInputField) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.pending_kyc_id_number;
                                    View $r18 = view.findViewById(C0001R.C0003id.pending_kyc_id_number);
                                    KudiInputField $r9 = (KudiInputField) $r18;
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.pending_kyc_id_type;
                                        View $r19 = view.findViewById(C0001R.C0003id.pending_kyc_id_type);
                                        KudiInputField $r10 = (KudiInputField) $r19;
                                        if ($r10 != null) {
                                            $i0 = C0001R.C0003id.reason_for_widthrawal;
                                            View $r110 = view.findViewById(C0001R.C0003id.reason_for_widthrawal);
                                            KudiInputField $r11 = (KudiInputField) $r110;
                                            if ($r11 != null) {
                                                $i0 = C0001R.C0003id.tv_desc_body;
                                                View $r111 = view.findViewById(C0001R.C0003id.tv_desc_body);
                                                TextView $r122 = (TextView) $r111;
                                                if ($r122 != null) {
                                                    $i0 = C0001R.C0003id.tv_desc_title;
                                                    View $r112 = view.findViewById(C0001R.C0003id.tv_desc_title);
                                                    TextView $r132 = (TextView) $r112;
                                                    if ($r132 != null) {
                                                        ScrollView $r152 = (ScrollView) view;
                                                        FragmentPendingVerificationBinding $r142 = new FragmentPendingVerificationBinding($r152, textView, kudiButton, kudiInputField, kudiInputField2, kudiInputField3, imageView, $r8, $r9, $r10, $r11, $r122, $r132);
                                                        return $r142;
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
        }
        Resources $r162 = view.getResources();
        String $r172 = $r162.getResourceName($i0);
        NullPointerException $r182 = new NullPointerException("Missing required view with ID: ".concat($r172));
        throw $r182;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPendingVerificationBinding inflate(LayoutInflater layoutInflater) {
        FragmentPendingVerificationBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPendingVerificationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_pending_verification, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentPendingVerificationBinding $r3 = bind($r2);
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

package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.button.KudiTextView;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentUpgradeAccountBinding implements InterfaceC8209a {
    public final KudiTextView enterNoTextView;
    public final KudiInputField idCardNumberView;
    public final KudiTextView idNumberLabel;
    public final KudiInputField idNumberView;
    public final ImageView idPreview;
    public final ImageView imageView3;
    public final KudiTextView nextOfKinLabel;
    public final KudiInputField nextOfKinPhoneView;
    public final KudiInputField nextOfKinView;
    public final KudiInputField picUrlView;
    public final KudiInputField residentialAddressView;
    private final ScrollView rootView;
    public final ScrollView scrollView;
    public final KudiInputField selectCardView;
    public final KudiButton submitButton;
    public final KudiTextView textView39;
    public final KudiTextView utilityBillLabel;

    private FragmentUpgradeAccountBinding(ScrollView scrollView, KudiTextView kudiTextView, KudiInputField kudiInputField, KudiTextView kudiTextView2, KudiInputField kudiInputField2, ImageView imageView, ImageView imageView2, KudiTextView kudiTextView3, KudiInputField kudiInputField3, KudiInputField kudiInputField4, KudiInputField kudiInputField5, KudiInputField kudiInputField6, ScrollView scrollView2, KudiInputField kudiInputField7, KudiButton kudiButton, KudiTextView kudiTextView4, KudiTextView kudiTextView5) {
        this.rootView = scrollView;
        this.enterNoTextView = kudiTextView;
        this.idCardNumberView = kudiInputField;
        this.idNumberLabel = kudiTextView2;
        this.idNumberView = kudiInputField2;
        this.idPreview = imageView;
        this.imageView3 = imageView2;
        this.nextOfKinLabel = kudiTextView3;
        this.nextOfKinPhoneView = kudiInputField3;
        this.nextOfKinView = kudiInputField4;
        this.picUrlView = kudiInputField5;
        this.residentialAddressView = kudiInputField6;
        this.scrollView = scrollView2;
        this.selectCardView = kudiInputField7;
        this.submitButton = kudiButton;
        this.textView39 = kudiTextView4;
        this.utilityBillLabel = kudiTextView5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentUpgradeAccountBinding bind(View view) {
        int $i0 = C0001R.C0003id.enter_no_text_view;
        View $r1 = view.findViewById(C0001R.C0003id.enter_no_text_view);
        KudiTextView kudiTextView = (KudiTextView) $r1;
        if (kudiTextView != null) {
            $i0 = C0001R.C0003id.idCardNumberView;
            View $r12 = view.findViewById(C0001R.C0003id.idCardNumberView);
            KudiInputField kudiInputField = (KudiInputField) $r12;
            if (kudiInputField != null) {
                $i0 = C0001R.C0003id.idNumberLabel;
                View $r13 = view.findViewById(C0001R.C0003id.idNumberLabel);
                KudiTextView kudiTextView2 = (KudiTextView) $r13;
                if (kudiTextView2 != null) {
                    $i0 = C0001R.C0003id.idNumberView;
                    View $r14 = view.findViewById(C0001R.C0003id.idNumberView);
                    KudiInputField kudiInputField2 = (KudiInputField) $r14;
                    if (kudiInputField2 != null) {
                        $i0 = C0001R.C0003id.id_preview;
                        View $r15 = view.findViewById(C0001R.C0003id.id_preview);
                        ImageView imageView = (ImageView) $r15;
                        if (imageView != null) {
                            $i0 = C0001R.C0003id.imageView3;
                            View $r16 = view.findViewById(C0001R.C0003id.imageView3);
                            ImageView imageView2 = (ImageView) $r16;
                            if (imageView2 != null) {
                                $i0 = C0001R.C0003id.nextOfKinLabel;
                                View $r17 = view.findViewById(C0001R.C0003id.nextOfKinLabel);
                                KudiTextView $r8 = (KudiTextView) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.nextOfKinPhoneView;
                                    View $r18 = view.findViewById(C0001R.C0003id.nextOfKinPhoneView);
                                    KudiInputField $r9 = (KudiInputField) $r18;
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.nextOfKinView;
                                        View $r19 = view.findViewById(C0001R.C0003id.nextOfKinView);
                                        KudiInputField $r10 = (KudiInputField) $r19;
                                        if ($r10 != null) {
                                            $i0 = C0001R.C0003id.picUrlView;
                                            View $r110 = view.findViewById(C0001R.C0003id.picUrlView);
                                            KudiInputField $r11 = (KudiInputField) $r110;
                                            if ($r11 != null) {
                                                $i0 = C0001R.C0003id.residentialAddressView;
                                                View $r111 = view.findViewById(C0001R.C0003id.residentialAddressView);
                                                KudiInputField $r122 = (KudiInputField) $r111;
                                                if ($r122 != null) {
                                                    ScrollView $r132 = (ScrollView) view;
                                                    $i0 = C0001R.C0003id.selectCardView;
                                                    View $r112 = view.findViewById(C0001R.C0003id.selectCardView);
                                                    KudiInputField $r142 = (KudiInputField) $r112;
                                                    if ($r142 != null) {
                                                        $i0 = C0001R.C0003id.submitButton;
                                                        View $r113 = view.findViewById(C0001R.C0003id.submitButton);
                                                        KudiButton $r152 = (KudiButton) $r113;
                                                        if ($r152 != null) {
                                                            $i0 = C0001R.C0003id.textView39;
                                                            View $r114 = view.findViewById(C0001R.C0003id.textView39);
                                                            KudiTextView $r162 = (KudiTextView) $r114;
                                                            if ($r162 != null) {
                                                                $i0 = C0001R.C0003id.utilityBillLabel;
                                                                View $r115 = view.findViewById(C0001R.C0003id.utilityBillLabel);
                                                                KudiTextView $r172 = (KudiTextView) $r115;
                                                                if ($r172 != null) {
                                                                    FragmentUpgradeAccountBinding $r182 = new FragmentUpgradeAccountBinding($r132, kudiTextView, kudiInputField, kudiTextView2, kudiInputField2, imageView, imageView2, $r8, $r9, $r10, $r11, $r122, $r132, $r142, $r152, $r162, $r172);
                                                                    return $r182;
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
                }
            }
        }
        Resources $r192 = view.getResources();
        String $r20 = $r192.getResourceName($i0);
        NullPointerException $r21 = new NullPointerException("Missing required view with ID: ".concat($r20));
        throw $r21;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentUpgradeAccountBinding inflate(LayoutInflater layoutInflater) {
        FragmentUpgradeAccountBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentUpgradeAccountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_upgrade_account, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentUpgradeAccountBinding $r3 = bind($r2);
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

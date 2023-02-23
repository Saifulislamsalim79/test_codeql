package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import ai.kudi.dip.library.edittext.KudiNairaInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class KtaBottomSheetLayoutBinding implements InterfaceC8209a {
    public final KudiInputField accountNumberInputField;
    public final KudiNairaInputField amtInputField;
    public final TextView copyCode;
    public final KudiButton dialUssd;
    private final ScrollView rootView;
    public final KudiInputField selectBank;
    public final TextView topUpWithUssdText;
    public final TextView ussdCode;
    public final View view;

    private KtaBottomSheetLayoutBinding(ScrollView scrollView, KudiInputField kudiInputField, KudiNairaInputField kudiNairaInputField, TextView textView, KudiButton kudiButton, KudiInputField kudiInputField2, TextView textView2, TextView textView3, View view) {
        this.rootView = scrollView;
        this.accountNumberInputField = kudiInputField;
        this.amtInputField = kudiNairaInputField;
        this.copyCode = textView;
        this.dialUssd = kudiButton;
        this.selectBank = kudiInputField2;
        this.topUpWithUssdText = textView2;
        this.ussdCode = textView3;
        this.view = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static KtaBottomSheetLayoutBinding bind(View view) {
        int $i0 = C0001R.C0003id.accountNumberInputField;
        View $r1 = view.findViewById(C0001R.C0003id.accountNumberInputField);
        KudiInputField $r2 = (KudiInputField) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.amtInputField;
            View $r12 = view.findViewById(C0001R.C0003id.amtInputField);
            KudiNairaInputField kudiNairaInputField = (KudiNairaInputField) $r12;
            if (kudiNairaInputField != null) {
                $i0 = C0001R.C0003id.copyCode;
                View $r13 = view.findViewById(C0001R.C0003id.copyCode);
                TextView textView = (TextView) $r13;
                if (textView != null) {
                    $i0 = C0001R.C0003id.dialUssd;
                    View $r14 = view.findViewById(C0001R.C0003id.dialUssd);
                    KudiButton kudiButton = (KudiButton) $r14;
                    if (kudiButton != null) {
                        $i0 = C0001R.C0003id.select_bank;
                        View $r15 = view.findViewById(C0001R.C0003id.select_bank);
                        KudiInputField kudiInputField = (KudiInputField) $r15;
                        if (kudiInputField != null) {
                            $i0 = C0001R.C0003id.top_up_with_ussd_text;
                            View $r16 = view.findViewById(C0001R.C0003id.top_up_with_ussd_text);
                            TextView textView2 = (TextView) $r16;
                            if (textView2 != null) {
                                $i0 = C0001R.C0003id.ussd_code;
                                View $r17 = view.findViewById(C0001R.C0003id.ussd_code);
                                TextView $r8 = (TextView) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.view;
                                    View $r18 = view.findViewById(C0001R.C0003id.view);
                                    if ($r18 != null) {
                                        ScrollView $r10 = (ScrollView) view;
                                        KtaBottomSheetLayoutBinding $r9 = new KtaBottomSheetLayoutBinding($r10, $r2, kudiNairaInputField, textView, kudiButton, kudiInputField, textView2, $r8, $r18);
                                        return $r9;
                                    }
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
    public static KtaBottomSheetLayoutBinding inflate(LayoutInflater layoutInflater) {
        KtaBottomSheetLayoutBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static KtaBottomSheetLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.kta_bottom_sheet_layout, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        KtaBottomSheetLayoutBinding $r3 = bind($r2);
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

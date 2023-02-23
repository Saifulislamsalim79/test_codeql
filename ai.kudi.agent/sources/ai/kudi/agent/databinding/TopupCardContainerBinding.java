package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class TopupCardContainerBinding implements InterfaceC8209a {
    public final EditText cardCvv;
    public final TextView cardCvvLabel;
    public final EditText cardExpiry;
    public final TextView cardExpiryLabel;
    public final TextView cardInstruction;
    public final EditText cardNumber;
    public final TextView cardNumberLabel;
    public final Guideline guideline;
    private final ConstraintLayout rootView;

    private TopupCardContainerBinding(ConstraintLayout constraintLayout, EditText editText, TextView textView, EditText editText2, TextView textView2, TextView textView3, EditText editText3, TextView textView4, Guideline guideline) {
        this.rootView = constraintLayout;
        this.cardCvv = editText;
        this.cardCvvLabel = textView;
        this.cardExpiry = editText2;
        this.cardExpiryLabel = textView2;
        this.cardInstruction = textView3;
        this.cardNumber = editText3;
        this.cardNumberLabel = textView4;
        this.guideline = guideline;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TopupCardContainerBinding bind(View view) {
        int $i0 = C0001R.C0003id.card_cvv;
        View $r1 = view.findViewById(C0001R.C0003id.card_cvv);
        EditText $r2 = (EditText) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.card_cvv_label;
            View $r12 = view.findViewById(C0001R.C0003id.card_cvv_label);
            TextView textView = (TextView) $r12;
            if (textView != null) {
                $i0 = C0001R.C0003id.card_expiry;
                View $r13 = view.findViewById(C0001R.C0003id.card_expiry);
                EditText editText = (EditText) $r13;
                if (editText != null) {
                    $i0 = C0001R.C0003id.card_expiry_label;
                    View $r14 = view.findViewById(C0001R.C0003id.card_expiry_label);
                    TextView textView2 = (TextView) $r14;
                    if (textView2 != null) {
                        $i0 = C0001R.C0003id.card_instruction;
                        View $r15 = view.findViewById(C0001R.C0003id.card_instruction);
                        TextView textView3 = (TextView) $r15;
                        if (textView3 != null) {
                            $i0 = C0001R.C0003id.card_number;
                            View $r16 = view.findViewById(C0001R.C0003id.card_number);
                            EditText editText2 = (EditText) $r16;
                            if (editText2 != null) {
                                $i0 = C0001R.C0003id.card_number_label;
                                View $r17 = view.findViewById(C0001R.C0003id.card_number_label);
                                TextView $r8 = (TextView) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.guideline;
                                    View $r18 = view.findViewById(C0001R.C0003id.guideline);
                                    Guideline $r9 = (Guideline) $r18;
                                    if ($r9 != null) {
                                        ConstraintLayout $r11 = (ConstraintLayout) view;
                                        TopupCardContainerBinding $r10 = new TopupCardContainerBinding($r11, $r2, textView, editText, textView2, textView3, editText2, $r8, $r9);
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
    public static TopupCardContainerBinding inflate(LayoutInflater layoutInflater) {
        TopupCardContainerBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TopupCardContainerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.topup_card_container, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        TopupCardContainerBinding $r3 = bind($r2);
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

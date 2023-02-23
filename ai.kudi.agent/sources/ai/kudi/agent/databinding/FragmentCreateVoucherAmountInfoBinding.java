package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentCreateVoucherAmountInfoBinding implements InterfaceC8209a {
    public final EditText amountEditText;
    public final RecyclerView amountSuggestionRecyclerView;
    public final ConstraintLayout constraintLayout3;
    public final TextView editLabelTextView;
    public final TextView enterAmountTextViewLabel;
    public final FloatingActionButton moveToNextButton;
    public final TextView nairaSymbolTextView;
    public final TextView nameTextViewLabel;
    public final TextView phoneLabelTextView;
    public final TextView recipientNameTextView;
    public final TextView recipientPhoneNumberTextView;
    private final ConstraintLayout rootView;

    private FragmentCreateVoucherAmountInfoBinding(ConstraintLayout constraintLayout, EditText editText, RecyclerView recyclerView, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, FloatingActionButton floatingActionButton, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.rootView = constraintLayout;
        this.amountEditText = editText;
        this.amountSuggestionRecyclerView = recyclerView;
        this.constraintLayout3 = constraintLayout2;
        this.editLabelTextView = textView;
        this.enterAmountTextViewLabel = textView2;
        this.moveToNextButton = floatingActionButton;
        this.nairaSymbolTextView = textView3;
        this.nameTextViewLabel = textView4;
        this.phoneLabelTextView = textView5;
        this.recipientNameTextView = textView6;
        this.recipientPhoneNumberTextView = textView7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentCreateVoucherAmountInfoBinding bind(View view) {
        int $i0 = C0001R.C0003id.amountEditText;
        View $r1 = view.findViewById(C0001R.C0003id.amountEditText);
        EditText editText = (EditText) $r1;
        if (editText != null) {
            $i0 = C0001R.C0003id.amountSuggestionRecyclerView;
            View $r12 = view.findViewById(C0001R.C0003id.amountSuggestionRecyclerView);
            RecyclerView recyclerView = (RecyclerView) $r12;
            if (recyclerView != null) {
                $i0 = C0001R.C0003id.constraintLayout3;
                View $r13 = view.findViewById(C0001R.C0003id.constraintLayout3);
                ConstraintLayout constraintLayout = (ConstraintLayout) $r13;
                if (constraintLayout != null) {
                    $i0 = C0001R.C0003id.editLabelTextView;
                    View $r14 = view.findViewById(C0001R.C0003id.editLabelTextView);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        $i0 = C0001R.C0003id.enterAmountTextViewLabel;
                        View $r15 = view.findViewById(C0001R.C0003id.enterAmountTextViewLabel);
                        TextView textView2 = (TextView) $r15;
                        if (textView2 != null) {
                            $i0 = C0001R.C0003id.moveToNextButton;
                            View $r16 = view.findViewById(C0001R.C0003id.moveToNextButton);
                            FloatingActionButton floatingActionButton = (FloatingActionButton) $r16;
                            if (floatingActionButton != null) {
                                $i0 = C0001R.C0003id.nairaSymbolTextView;
                                View $r17 = view.findViewById(C0001R.C0003id.nairaSymbolTextView);
                                TextView $r8 = (TextView) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.nameTextViewLabel;
                                    View $r18 = view.findViewById(C0001R.C0003id.nameTextViewLabel);
                                    TextView $r9 = (TextView) $r18;
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.phoneLabelTextView;
                                        View $r19 = view.findViewById(C0001R.C0003id.phoneLabelTextView);
                                        TextView $r10 = (TextView) $r19;
                                        if ($r10 != null) {
                                            $i0 = C0001R.C0003id.recipientNameTextView;
                                            View $r110 = view.findViewById(C0001R.C0003id.recipientNameTextView);
                                            TextView $r11 = (TextView) $r110;
                                            if ($r11 != null) {
                                                $i0 = C0001R.C0003id.recipientPhoneNumberTextView;
                                                View $r111 = view.findViewById(C0001R.C0003id.recipientPhoneNumberTextView);
                                                TextView $r122 = (TextView) $r111;
                                                if ($r122 != null) {
                                                    ConstraintLayout $r142 = (ConstraintLayout) view;
                                                    FragmentCreateVoucherAmountInfoBinding $r132 = new FragmentCreateVoucherAmountInfoBinding($r142, editText, recyclerView, constraintLayout, textView, textView2, floatingActionButton, $r8, $r9, $r10, $r11, $r122);
                                                    return $r132;
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
        Resources $r152 = view.getResources();
        String $r162 = $r152.getResourceName($i0);
        NullPointerException $r172 = new NullPointerException("Missing required view with ID: ".concat($r162));
        throw $r172;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentCreateVoucherAmountInfoBinding inflate(LayoutInflater layoutInflater) {
        FragmentCreateVoucherAmountInfoBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentCreateVoucherAmountInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_create_voucher_amount_info, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentCreateVoucherAmountInfoBinding $r3 = bind($r2);
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

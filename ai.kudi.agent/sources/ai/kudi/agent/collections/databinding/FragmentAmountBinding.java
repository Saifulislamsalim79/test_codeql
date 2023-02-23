package ai.kudi.agent.collections.databinding;

import ai.kudi.agent.collections.R$id;
import ai.kudi.agent.collections.R$layout;
import ai.kudi.dip.library.keypad.PinpadView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentAmountBinding implements InterfaceC8209a {
    public final TextView accountNameLabel;
    public final TextView amountEditText;
    public final RecyclerView amountSuggestionRecyclerView;
    public final TextView bankDetailsLabel;
    public final ConstraintLayout constraintLayout3;
    public final TextView currency;
    public final TextView editLabelTextView;
    public final TextView enterAmountTextViewLabel;
    public final TextView errorMessage;
    public final View footer;
    public final ImageView ivLoader;
    public final PinpadView keyboard;
    public final FloatingActionButton nextButton;
    private final ConstraintLayout rootView;

    private FragmentAmountBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, RecyclerView recyclerView, TextView textView3, ConstraintLayout constraintLayout2, TextView textView4, TextView textView5, TextView textView6, TextView textView7, View view, ImageView imageView, PinpadView pinpadView, FloatingActionButton floatingActionButton) {
        this.rootView = constraintLayout;
        this.accountNameLabel = textView;
        this.amountEditText = textView2;
        this.amountSuggestionRecyclerView = recyclerView;
        this.bankDetailsLabel = textView3;
        this.constraintLayout3 = constraintLayout2;
        this.currency = textView4;
        this.editLabelTextView = textView5;
        this.enterAmountTextViewLabel = textView6;
        this.errorMessage = textView7;
        this.footer = view;
        this.ivLoader = imageView;
        this.keyboard = pinpadView;
        this.nextButton = floatingActionButton;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentAmountBinding bind(View view) {
        View $r1;
        int $i0 = R$id.accountNameLabel;
        View $r12 = view.findViewById($i0);
        TextView textView = (TextView) $r12;
        if (textView != null) {
            $i0 = R$id.amountEditText;
            View $r13 = view.findViewById($i0);
            TextView textView2 = (TextView) $r13;
            if (textView2 != null) {
                $i0 = R$id.amountSuggestionRecyclerView;
                View $r14 = view.findViewById($i0);
                RecyclerView recyclerView = (RecyclerView) $r14;
                if (recyclerView != null) {
                    $i0 = R$id.bankDetailsLabel;
                    View $r15 = view.findViewById($i0);
                    TextView textView3 = (TextView) $r15;
                    if (textView3 != null) {
                        $i0 = R$id.constraintLayout3;
                        View $r16 = view.findViewById($i0);
                        ConstraintLayout constraintLayout = (ConstraintLayout) $r16;
                        if (constraintLayout != null) {
                            $i0 = R$id.currency;
                            View $r17 = view.findViewById($i0);
                            TextView textView4 = (TextView) $r17;
                            if (textView4 != null) {
                                $i0 = R$id.editLabelTextView;
                                View $r18 = view.findViewById($i0);
                                TextView $r8 = (TextView) $r18;
                                if ($r8 != null) {
                                    $i0 = R$id.enterAmountTextViewLabel;
                                    View $r19 = view.findViewById($i0);
                                    TextView $r9 = (TextView) $r19;
                                    if ($r9 != null) {
                                        $i0 = R$id.error_message;
                                        View $r110 = view.findViewById($i0);
                                        TextView $r10 = (TextView) $r110;
                                        if ($r10 != null && ($r1 = view.findViewById(($i0 = R$id.footer))) != null) {
                                            $i0 = R$id.iv_loader;
                                            View $r11 = view.findViewById($i0);
                                            ImageView $r122 = (ImageView) $r11;
                                            if ($r122 != null) {
                                                $i0 = R$id.keyboard;
                                                View $r112 = view.findViewById($i0);
                                                PinpadView $r132 = (PinpadView) $r112;
                                                if ($r132 != null) {
                                                    $i0 = R$id.nextButton;
                                                    View $r113 = view.findViewById($i0);
                                                    FloatingActionButton $r142 = (FloatingActionButton) $r113;
                                                    if ($r142 != null) {
                                                        ConstraintLayout $r162 = (ConstraintLayout) view;
                                                        FragmentAmountBinding $r152 = new FragmentAmountBinding($r162, textView, textView2, recyclerView, textView3, constraintLayout, textView4, $r8, $r9, $r10, $r1, $r122, $r132, $r142);
                                                        return $r152;
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
        Resources $r172 = view.getResources();
        String $r182 = $r172.getResourceName($i0);
        NullPointerException $r192 = new NullPointerException("Missing required view with ID: ".concat($r182));
        throw $r192;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentAmountBinding inflate(LayoutInflater layoutInflater) {
        FragmentAmountBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentAmountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = R$layout.fragment_amount;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentAmountBinding $r3 = bind($r2);
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

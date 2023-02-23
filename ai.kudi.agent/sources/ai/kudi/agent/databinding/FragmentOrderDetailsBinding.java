package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentOrderDetailsBinding implements InterfaceC8209a {
    public final TextView amtPayableValue;
    public final CardView cardView2;
    public final TextView changeDeliveryAddressView;
    public final TextView deliveryAddressView;
    public final ImageView minusImageView;
    public final EditText numberTextView;
    public final KudiButton payForPos;
    public final ImageView plusImageView;
    public final TextView quantityValue;
    private final NestedScrollView rootView;
    public final TextView textView10;
    public final TextView textView11;
    public final TextView textView15;
    public final TextView textView29;
    public final TextView titleText;
    public final View view4;
    public final View view5;
    public final View view6;
    public final TextView walletBalanceErrorMessageView;

    private FragmentOrderDetailsBinding(NestedScrollView nestedScrollView, TextView textView, CardView cardView, TextView textView2, TextView textView3, ImageView imageView, EditText editText, KudiButton kudiButton, ImageView imageView2, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, View view, View view2, View view3, TextView textView10) {
        this.rootView = nestedScrollView;
        this.amtPayableValue = textView;
        this.cardView2 = cardView;
        this.changeDeliveryAddressView = textView2;
        this.deliveryAddressView = textView3;
        this.minusImageView = imageView;
        this.numberTextView = editText;
        this.payForPos = kudiButton;
        this.plusImageView = imageView2;
        this.quantityValue = textView4;
        this.textView10 = textView5;
        this.textView11 = textView6;
        this.textView15 = textView7;
        this.textView29 = textView8;
        this.titleText = textView9;
        this.view4 = view;
        this.view5 = view2;
        this.view6 = view3;
        this.walletBalanceErrorMessageView = textView10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentOrderDetailsBinding bind(View view) {
        int $i0 = C0001R.C0003id.amtPayableValue;
        View $r1 = view.findViewById(C0001R.C0003id.amtPayableValue);
        TextView textView = (TextView) $r1;
        if (textView != null) {
            $i0 = C0001R.C0003id.cardView2;
            View $r12 = view.findViewById(C0001R.C0003id.cardView2);
            CardView cardView = (CardView) $r12;
            if (cardView != null) {
                $i0 = C0001R.C0003id.change_delivery_address_view;
                View $r13 = view.findViewById(C0001R.C0003id.change_delivery_address_view);
                TextView textView2 = (TextView) $r13;
                if (textView2 != null) {
                    $i0 = C0001R.C0003id.deliveryAddressView;
                    View $r14 = view.findViewById(C0001R.C0003id.deliveryAddressView);
                    TextView textView3 = (TextView) $r14;
                    if (textView3 != null) {
                        $i0 = C0001R.C0003id.minusImageView;
                        View $r15 = view.findViewById(C0001R.C0003id.minusImageView);
                        ImageView imageView = (ImageView) $r15;
                        if (imageView != null) {
                            $i0 = C0001R.C0003id.numberTextView;
                            View $r16 = view.findViewById(C0001R.C0003id.numberTextView);
                            EditText editText = (EditText) $r16;
                            if (editText != null) {
                                $i0 = C0001R.C0003id.payForPos;
                                View $r17 = view.findViewById(C0001R.C0003id.payForPos);
                                KudiButton $r8 = (KudiButton) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.plusImageView;
                                    View $r18 = view.findViewById(C0001R.C0003id.plusImageView);
                                    ImageView $r9 = (ImageView) $r18;
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.quantityValue;
                                        View $r19 = view.findViewById(C0001R.C0003id.quantityValue);
                                        TextView $r10 = (TextView) $r19;
                                        if ($r10 != null) {
                                            $i0 = C0001R.C0003id.textView10;
                                            View $r110 = view.findViewById(C0001R.C0003id.textView10);
                                            TextView $r11 = (TextView) $r110;
                                            if ($r11 != null) {
                                                $i0 = C0001R.C0003id.textView11;
                                                View $r111 = view.findViewById(C0001R.C0003id.textView11);
                                                TextView $r122 = (TextView) $r111;
                                                if ($r122 != null) {
                                                    $i0 = C0001R.C0003id.textView15;
                                                    View $r112 = view.findViewById(C0001R.C0003id.textView15);
                                                    TextView $r132 = (TextView) $r112;
                                                    if ($r132 != null) {
                                                        $i0 = C0001R.C0003id.textView29;
                                                        View $r113 = view.findViewById(C0001R.C0003id.textView29);
                                                        TextView $r142 = (TextView) $r113;
                                                        if ($r142 != null) {
                                                            $i0 = C0001R.C0003id.title_text;
                                                            View $r114 = view.findViewById(C0001R.C0003id.title_text);
                                                            TextView $r152 = (TextView) $r114;
                                                            if ($r152 != null) {
                                                                $i0 = C0001R.C0003id.view4;
                                                                View $r115 = view.findViewById(C0001R.C0003id.view4);
                                                                if ($r115 != null) {
                                                                    $i0 = C0001R.C0003id.view5;
                                                                    View $r162 = view.findViewById(C0001R.C0003id.view5);
                                                                    if ($r162 != null) {
                                                                        $i0 = C0001R.C0003id.view6;
                                                                        View $r172 = view.findViewById(C0001R.C0003id.view6);
                                                                        if ($r172 != null) {
                                                                            $i0 = C0001R.C0003id.wallet_balance_error_message_view;
                                                                            View $r182 = view.findViewById(C0001R.C0003id.wallet_balance_error_message_view);
                                                                            TextView $r192 = (TextView) $r182;
                                                                            if ($r192 != null) {
                                                                                NestedScrollView $r21 = (NestedScrollView) view;
                                                                                FragmentOrderDetailsBinding $r20 = new FragmentOrderDetailsBinding($r21, textView, cardView, textView2, textView3, imageView, editText, $r8, $r9, $r10, $r11, $r122, $r132, $r142, $r152, $r115, $r162, $r172, $r192);
                                                                                return $r20;
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
                }
            }
        }
        Resources $r22 = view.getResources();
        String $r23 = $r22.getResourceName($i0);
        NullPointerException $r24 = new NullPointerException("Missing required view with ID: ".concat($r23));
        throw $r24;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentOrderDetailsBinding inflate(LayoutInflater layoutInflater) {
        FragmentOrderDetailsBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentOrderDetailsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_order_details, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentOrderDetailsBinding $r3 = bind($r2);
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
    public NestedScrollView getRoot() {
        NestedScrollView r1 = this.rootView;
        return r1;
    }
}

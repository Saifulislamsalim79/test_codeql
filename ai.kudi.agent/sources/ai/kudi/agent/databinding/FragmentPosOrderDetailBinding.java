package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.databinding.ListLoaderViewBinding;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentPosOrderDetailBinding implements InterfaceC8209a {
    public final View assignedDateDivider;
    public final Group assignedStatusViews;
    public final View dateDivider;
    public final ListLoaderViewBinding listLoaderView;
    public final TextView orderAssignedDate;
    public final TextView orderAssignedDateLabel;
    public final TextView orderDate;
    public final TextView orderDateLabel;
    public final CardView orderDetailsCard;
    public final TextView orderQuantity;
    public final TextView orderQuantityLabel;
    public final TextView orderReference;
    public final TextView orderReferenceLabel;
    public final TextView orderStatus;
    public final TextView orderStatusLabel;
    public final TextView orderTerminalId;
    public final TextView orderTerminalIdLabel;
    public final TextView orderWalletNumber;
    public final TextView orderWalletNumberLabel;
    public final View quantityDivider;
    public final View referenceDivider;
    private final CoordinatorLayout rootView;
    public final View statusDivider;
    public final View terminalIdDivider;

    private FragmentPosOrderDetailBinding(CoordinatorLayout coordinatorLayout, View view, Group group, View view2, ListLoaderViewBinding listLoaderViewBinding, TextView textView, TextView textView2, TextView textView3, TextView textView4, CardView cardView, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, View view3, View view4, View view5, View view6) {
        this.rootView = coordinatorLayout;
        this.assignedDateDivider = view;
        this.assignedStatusViews = group;
        this.dateDivider = view2;
        this.listLoaderView = listLoaderViewBinding;
        this.orderAssignedDate = textView;
        this.orderAssignedDateLabel = textView2;
        this.orderDate = textView3;
        this.orderDateLabel = textView4;
        this.orderDetailsCard = cardView;
        this.orderQuantity = textView5;
        this.orderQuantityLabel = textView6;
        this.orderReference = textView7;
        this.orderReferenceLabel = textView8;
        this.orderStatus = textView9;
        this.orderStatusLabel = textView10;
        this.orderTerminalId = textView11;
        this.orderTerminalIdLabel = textView12;
        this.orderWalletNumber = textView13;
        this.orderWalletNumberLabel = textView14;
        this.quantityDivider = view3;
        this.referenceDivider = view4;
        this.statusDivider = view5;
        this.terminalIdDivider = view6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPosOrderDetailBinding bind(View view) {
        int $i0 = C0001R.C0003id.assigned_date_divider;
        View $r1 = view.findViewById(C0001R.C0003id.assigned_date_divider);
        if ($r1 != null) {
            $i0 = C0001R.C0003id.assigned_status_views;
            Group group = (Group) view.findViewById(C0001R.C0003id.assigned_status_views);
            if (group != null) {
                $i0 = C0001R.C0003id.date_divider;
                View $r2 = view.findViewById(C0001R.C0003id.date_divider);
                if ($r2 != null) {
                    $i0 = C0001R.C0003id.list_loader_view;
                    View $r4 = view.findViewById(C0001R.C0003id.list_loader_view);
                    if ($r4 != null) {
                        ListLoaderViewBinding $r5 = ListLoaderViewBinding.bind($r4);
                        $i0 = C0001R.C0003id.order_assigned_date;
                        TextView textView = (TextView) view.findViewById(C0001R.C0003id.order_assigned_date);
                        if (textView != null) {
                            $i0 = C0001R.C0003id.order_assigned_date_label;
                            TextView textView2 = (TextView) view.findViewById(C0001R.C0003id.order_assigned_date_label);
                            if (textView2 != null) {
                                $i0 = C0001R.C0003id.order_date;
                                TextView textView3 = (TextView) view.findViewById(C0001R.C0003id.order_date);
                                if (textView3 != null) {
                                    $i0 = C0001R.C0003id.order_date_label;
                                    TextView $r9 = (TextView) view.findViewById(C0001R.C0003id.order_date_label);
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.order_details_card;
                                        CardView $r10 = (CardView) view.findViewById(C0001R.C0003id.order_details_card);
                                        if ($r10 != null) {
                                            $i0 = C0001R.C0003id.order_quantity;
                                            TextView $r11 = (TextView) view.findViewById(C0001R.C0003id.order_quantity);
                                            if ($r11 != null) {
                                                $i0 = C0001R.C0003id.order_quantity_label;
                                                TextView $r12 = (TextView) view.findViewById(C0001R.C0003id.order_quantity_label);
                                                if ($r12 != null) {
                                                    $i0 = C0001R.C0003id.order_reference;
                                                    TextView $r13 = (TextView) view.findViewById(C0001R.C0003id.order_reference);
                                                    if ($r13 != null) {
                                                        $i0 = C0001R.C0003id.order_reference_label;
                                                        TextView $r14 = (TextView) view.findViewById(C0001R.C0003id.order_reference_label);
                                                        if ($r14 != null) {
                                                            $i0 = C0001R.C0003id.order_status;
                                                            TextView $r15 = (TextView) view.findViewById(C0001R.C0003id.order_status);
                                                            if ($r15 != null) {
                                                                $i0 = C0001R.C0003id.order_status_label;
                                                                TextView $r16 = (TextView) view.findViewById(C0001R.C0003id.order_status_label);
                                                                if ($r16 != null) {
                                                                    $i0 = C0001R.C0003id.order_terminal_id;
                                                                    TextView $r17 = (TextView) view.findViewById(C0001R.C0003id.order_terminal_id);
                                                                    if ($r17 != null) {
                                                                        $i0 = C0001R.C0003id.order_terminal_id_label;
                                                                        TextView $r18 = (TextView) view.findViewById(C0001R.C0003id.order_terminal_id_label);
                                                                        if ($r18 != null) {
                                                                            $i0 = C0001R.C0003id.order_wallet_number;
                                                                            TextView $r19 = (TextView) view.findViewById(C0001R.C0003id.order_wallet_number);
                                                                            if ($r19 != null) {
                                                                                $i0 = C0001R.C0003id.order_wallet_number_label;
                                                                                TextView $r20 = (TextView) view.findViewById(C0001R.C0003id.order_wallet_number_label);
                                                                                if ($r20 != null) {
                                                                                    $i0 = C0001R.C0003id.quantity_divider;
                                                                                    View $r42 = view.findViewById(C0001R.C0003id.quantity_divider);
                                                                                    if ($r42 != null) {
                                                                                        $i0 = C0001R.C0003id.reference_divider;
                                                                                        View $r21 = view.findViewById(C0001R.C0003id.reference_divider);
                                                                                        if ($r21 != null) {
                                                                                            $i0 = C0001R.C0003id.status_divider;
                                                                                            View $r22 = view.findViewById(C0001R.C0003id.status_divider);
                                                                                            if ($r22 != null) {
                                                                                                $i0 = C0001R.C0003id.terminal_id_divider;
                                                                                                View $r23 = view.findViewById(C0001R.C0003id.terminal_id_divider);
                                                                                                if ($r23 != null) {
                                                                                                    CoordinatorLayout $r25 = (CoordinatorLayout) view;
                                                                                                    FragmentPosOrderDetailBinding $r24 = new FragmentPosOrderDetailBinding($r25, $r1, group, $r2, $r5, textView, textView2, textView3, $r9, $r10, $r11, $r12, $r13, $r14, $r15, $r16, $r17, $r18, $r19, $r20, $r42, $r21, $r22, $r23);
                                                                                                    return $r24;
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
                        }
                    }
                }
            }
        }
        Resources $r26 = view.getResources();
        String $r27 = $r26.getResourceName($i0);
        NullPointerException $r28 = new NullPointerException("Missing required view with ID: ".concat($r27));
        throw $r28;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPosOrderDetailBinding inflate(LayoutInflater layoutInflater) {
        FragmentPosOrderDetailBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPosOrderDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_pos_order_detail, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentPosOrderDetailBinding $r3 = bind($r2);
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
    public CoordinatorLayout getRoot() {
        CoordinatorLayout r1 = this.rootView;
        return r1;
    }
}

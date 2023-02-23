package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import de.hdodenhof.circleimageview.CircleImageView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ItemListOutletRequestBinding implements InterfaceC8209a {
    public final ConstraintLayout container;
    public final CircleImageView ivAvatar;
    public final LinearLayout linearLayout2;
    private final ConstraintLayout rootView;
    public final KudiTextView tvName;
    public final KudiTextView tvPhoneNum;
    public final KudiTextView tvSignature;
    public final KudiTextView tvStatus;
    public final View viewStatusColor;

    private ItemListOutletRequestBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, CircleImageView circleImageView, LinearLayout linearLayout, KudiTextView kudiTextView, KudiTextView kudiTextView2, KudiTextView kudiTextView3, KudiTextView kudiTextView4, View view) {
        this.rootView = constraintLayout;
        this.container = constraintLayout2;
        this.ivAvatar = circleImageView;
        this.linearLayout2 = linearLayout;
        this.tvName = kudiTextView;
        this.tvPhoneNum = kudiTextView2;
        this.tvSignature = kudiTextView3;
        this.tvStatus = kudiTextView4;
        this.viewStatusColor = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ItemListOutletRequestBinding bind(View view) {
        ConstraintLayout $r1 = (ConstraintLayout) view;
        int $i0 = C0001R.C0003id.iv_avatar;
        View $r2 = view.findViewById(C0001R.C0003id.iv_avatar);
        CircleImageView circleImageView = (CircleImageView) $r2;
        if (circleImageView != null) {
            $i0 = C0001R.C0003id.linearLayout2;
            View $r22 = view.findViewById(C0001R.C0003id.linearLayout2);
            LinearLayout linearLayout = (LinearLayout) $r22;
            if (linearLayout != null) {
                $i0 = C0001R.C0003id.tv_name;
                View $r23 = view.findViewById(C0001R.C0003id.tv_name);
                KudiTextView kudiTextView = (KudiTextView) $r23;
                if (kudiTextView != null) {
                    $i0 = C0001R.C0003id.tv_phone_num;
                    View $r24 = view.findViewById(C0001R.C0003id.tv_phone_num);
                    KudiTextView kudiTextView2 = (KudiTextView) $r24;
                    if (kudiTextView2 != null) {
                        $i0 = C0001R.C0003id.tv_signature;
                        View $r25 = view.findViewById(C0001R.C0003id.tv_signature);
                        KudiTextView kudiTextView3 = (KudiTextView) $r25;
                        if (kudiTextView3 != null) {
                            $i0 = C0001R.C0003id.tv_status;
                            View $r26 = view.findViewById(C0001R.C0003id.tv_status);
                            KudiTextView $r8 = (KudiTextView) $r26;
                            if ($r8 != null) {
                                $i0 = C0001R.C0003id.view_status_color;
                                View $r27 = view.findViewById(C0001R.C0003id.view_status_color);
                                if ($r27 != null) {
                                    ItemListOutletRequestBinding $r9 = new ItemListOutletRequestBinding($r1, $r1, circleImageView, linearLayout, kudiTextView, kudiTextView2, kudiTextView3, $r8, $r27);
                                    return $r9;
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r10 = view.getResources();
        String $r11 = $r10.getResourceName($i0);
        NullPointerException $r12 = new NullPointerException("Missing required view with ID: ".concat($r11));
        throw $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ItemListOutletRequestBinding inflate(LayoutInflater layoutInflater) {
        ItemListOutletRequestBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ItemListOutletRequestBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.item_list_outlet_request, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ItemListOutletRequestBinding $r3 = bind($r2);
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

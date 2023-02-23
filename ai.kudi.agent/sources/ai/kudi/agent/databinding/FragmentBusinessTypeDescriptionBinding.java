package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentBusinessTypeDescriptionBinding implements InterfaceC8209a {
    public final KudiButton continueButton;
    public final TextView descriptionView;
    public final LinearLayout reasonsContainer;
    private final ConstraintLayout rootView;
    public final TextView tipView;
    public final TextView titleView;
    public final TextView whatYouCanDoHeader;
    public final RecyclerView whatYouCanDoRv;

    private FragmentBusinessTypeDescriptionBinding(ConstraintLayout constraintLayout, KudiButton kudiButton, TextView textView, LinearLayout linearLayout, TextView textView2, TextView textView3, TextView textView4, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.continueButton = kudiButton;
        this.descriptionView = textView;
        this.reasonsContainer = linearLayout;
        this.tipView = textView2;
        this.titleView = textView3;
        this.whatYouCanDoHeader = textView4;
        this.whatYouCanDoRv = recyclerView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentBusinessTypeDescriptionBinding bind(View view) {
        int $i0 = C0001R.C0003id.continue_button;
        View $r1 = view.findViewById(C0001R.C0003id.continue_button);
        KudiButton $r2 = (KudiButton) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.description_view;
            View $r12 = view.findViewById(C0001R.C0003id.description_view);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.reasons_container;
                View $r13 = view.findViewById(C0001R.C0003id.reasons_container);
                LinearLayout linearLayout = (LinearLayout) $r13;
                if (linearLayout != null) {
                    $i0 = C0001R.C0003id.tip_view;
                    View $r14 = view.findViewById(C0001R.C0003id.tip_view);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        $i0 = C0001R.C0003id.title_view;
                        View $r15 = view.findViewById(C0001R.C0003id.title_view);
                        TextView textView2 = (TextView) $r15;
                        if (textView2 != null) {
                            $i0 = C0001R.C0003id.what_you_can_do_header;
                            View $r16 = view.findViewById(C0001R.C0003id.what_you_can_do_header);
                            TextView textView3 = (TextView) $r16;
                            if (textView3 != null) {
                                $i0 = C0001R.C0003id.what_you_can_do_rv;
                                View $r17 = view.findViewById(C0001R.C0003id.what_you_can_do_rv);
                                RecyclerView $r8 = (RecyclerView) $r17;
                                if ($r8 != null) {
                                    ConstraintLayout $r10 = (ConstraintLayout) view;
                                    FragmentBusinessTypeDescriptionBinding $r9 = new FragmentBusinessTypeDescriptionBinding($r10, $r2, $r3, linearLayout, textView, textView2, textView3, $r8);
                                    return $r9;
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
    public static FragmentBusinessTypeDescriptionBinding inflate(LayoutInflater layoutInflater) {
        FragmentBusinessTypeDescriptionBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentBusinessTypeDescriptionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_business_type_description, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentBusinessTypeDescriptionBinding $r3 = bind($r2);
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

package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentWhyWeCollectBvnBottomSheetListDialogBinding implements InterfaceC8209a {
    public final RecyclerView bvnDetailsForRv;
    public final TextView close;
    public final ConstraintLayout list;
    private final ConstraintLayout rootView;
    public final TextView textView44;
    public final TextView textView45;
    public final TextView textView46;
    public final TextView textView47;
    public final View view;
    public final View view3;

    private FragmentWhyWeCollectBvnBottomSheetListDialogBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, TextView textView, ConstraintLayout constraintLayout2, TextView textView2, TextView textView3, TextView textView4, TextView textView5, View view, View view2) {
        this.rootView = constraintLayout;
        this.bvnDetailsForRv = recyclerView;
        this.close = textView;
        this.list = constraintLayout2;
        this.textView44 = textView2;
        this.textView45 = textView3;
        this.textView46 = textView4;
        this.textView47 = textView5;
        this.view = view;
        this.view3 = view2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentWhyWeCollectBvnBottomSheetListDialogBinding bind(View view) {
        int $i0 = C0001R.C0003id.bvn_details_for_rv;
        View $r1 = view.findViewById(C0001R.C0003id.bvn_details_for_rv);
        RecyclerView $r2 = (RecyclerView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.close;
            View $r12 = view.findViewById(C0001R.C0003id.close);
            TextView textView = (TextView) $r12;
            if (textView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                $i0 = C0001R.C0003id.textView44;
                View $r13 = view.findViewById(C0001R.C0003id.textView44);
                TextView textView2 = (TextView) $r13;
                if (textView2 != null) {
                    $i0 = C0001R.C0003id.textView45;
                    View $r14 = view.findViewById(C0001R.C0003id.textView45);
                    TextView textView3 = (TextView) $r14;
                    if (textView3 != null) {
                        $i0 = C0001R.C0003id.textView46;
                        View $r15 = view.findViewById(C0001R.C0003id.textView46);
                        TextView textView4 = (TextView) $r15;
                        if (textView4 != null) {
                            $i0 = C0001R.C0003id.textView47;
                            View $r16 = view.findViewById(C0001R.C0003id.textView47);
                            TextView $r8 = (TextView) $r16;
                            if ($r8 != null) {
                                $i0 = C0001R.C0003id.view;
                                View $r17 = view.findViewById(C0001R.C0003id.view);
                                if ($r17 != null) {
                                    $i0 = C0001R.C0003id.view3;
                                    View $r9 = view.findViewById(C0001R.C0003id.view3);
                                    if ($r9 != null) {
                                        FragmentWhyWeCollectBvnBottomSheetListDialogBinding $r10 = new FragmentWhyWeCollectBvnBottomSheetListDialogBinding(constraintLayout, $r2, textView, constraintLayout, textView2, textView3, textView4, $r8, $r17, $r9);
                                        return $r10;
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
    public static FragmentWhyWeCollectBvnBottomSheetListDialogBinding inflate(LayoutInflater layoutInflater) {
        FragmentWhyWeCollectBvnBottomSheetListDialogBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentWhyWeCollectBvnBottomSheetListDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_why_we_collect_bvn_bottom_sheet_list_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentWhyWeCollectBvnBottomSheetListDialogBinding $r3 = bind($r2);
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

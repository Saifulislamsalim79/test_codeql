package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.databinding.ListLoaderViewBinding;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentOutletMgtPersonalBinding implements InterfaceC8209a {
    public final TextView editProfileView;
    public final ConstraintLayout filledState;
    public final ListLoaderViewBinding loaderView;
    public final RecyclerView outletMgtProfileRv;
    private final ConstraintLayout rootView;
    public final TextView statusView;
    public final TextView textView12;
    public final View view23;

    private FragmentOutletMgtPersonalBinding(ConstraintLayout constraintLayout, TextView textView, ConstraintLayout constraintLayout2, ListLoaderViewBinding listLoaderViewBinding, RecyclerView recyclerView, TextView textView2, TextView textView3, View view) {
        this.rootView = constraintLayout;
        this.editProfileView = textView;
        this.filledState = constraintLayout2;
        this.loaderView = listLoaderViewBinding;
        this.outletMgtProfileRv = recyclerView;
        this.statusView = textView2;
        this.textView12 = textView3;
        this.view23 = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentOutletMgtPersonalBinding bind(View view) {
        int $i0 = C0001R.C0003id.editProfileView;
        View $r1 = view.findViewById(C0001R.C0003id.editProfileView);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.filledState;
            View $r12 = view.findViewById(C0001R.C0003id.filledState);
            ConstraintLayout $r3 = (ConstraintLayout) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.loaderView;
                View $r13 = view.findViewById(C0001R.C0003id.loaderView);
                if ($r13 != null) {
                    ListLoaderViewBinding $r4 = ListLoaderViewBinding.bind($r13);
                    $i0 = C0001R.C0003id.outletMgtProfileRv;
                    View $r14 = view.findViewById(C0001R.C0003id.outletMgtProfileRv);
                    RecyclerView recyclerView = (RecyclerView) $r14;
                    if (recyclerView != null) {
                        $i0 = C0001R.C0003id.statusView;
                        View $r15 = view.findViewById(C0001R.C0003id.statusView);
                        TextView textView = (TextView) $r15;
                        if (textView != null) {
                            $i0 = C0001R.C0003id.textView12;
                            View $r16 = view.findViewById(C0001R.C0003id.textView12);
                            TextView textView2 = (TextView) $r16;
                            if (textView2 != null) {
                                $i0 = C0001R.C0003id.view23;
                                View $r17 = view.findViewById(C0001R.C0003id.view23);
                                if ($r17 != null) {
                                    ConstraintLayout $r9 = (ConstraintLayout) view;
                                    FragmentOutletMgtPersonalBinding $r8 = new FragmentOutletMgtPersonalBinding($r9, $r2, $r3, $r4, recyclerView, textView, textView2, $r17);
                                    return $r8;
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r10 = view.getResources();
        String $r11 = $r10.getResourceName($i0);
        NullPointerException $r122 = new NullPointerException("Missing required view with ID: ".concat($r11));
        throw $r122;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentOutletMgtPersonalBinding inflate(LayoutInflater layoutInflater) {
        FragmentOutletMgtPersonalBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentOutletMgtPersonalBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_outlet_mgt_personal, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentOutletMgtPersonalBinding $r3 = bind($r2);
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

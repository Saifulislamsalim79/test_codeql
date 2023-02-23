package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class LayoutOutletInformationBinding implements InterfaceC8209a {
    public final KudiTextView editProfile;
    public final RecyclerView recyclerViewOutletMgT;
    private final LinearLayout rootView;
    public final TextView textView17;
    public final View view6;

    private LayoutOutletInformationBinding(LinearLayout linearLayout, KudiTextView kudiTextView, RecyclerView recyclerView, TextView textView, View view) {
        this.rootView = linearLayout;
        this.editProfile = kudiTextView;
        this.recyclerViewOutletMgT = recyclerView;
        this.textView17 = textView;
        this.view6 = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutOutletInformationBinding bind(View view) {
        int $i0 = C0001R.C0003id.editProfile;
        View $r1 = view.findViewById(C0001R.C0003id.editProfile);
        KudiTextView $r2 = (KudiTextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.recyclerViewOutletMgT;
            View $r12 = view.findViewById(C0001R.C0003id.recyclerViewOutletMgT);
            RecyclerView $r3 = (RecyclerView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.textView17;
                View $r13 = view.findViewById(C0001R.C0003id.textView17);
                TextView $r4 = (TextView) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.view6;
                    View $r14 = view.findViewById(C0001R.C0003id.view6);
                    if ($r14 != null) {
                        LayoutOutletInformationBinding $r5 = new LayoutOutletInformationBinding((LinearLayout) view, $r2, $r3, $r4, $r14);
                        return $r5;
                    }
                }
            }
        }
        Resources $r7 = view.getResources();
        String $r8 = $r7.getResourceName($i0);
        NullPointerException $r9 = new NullPointerException("Missing required view with ID: ".concat($r8));
        throw $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutOutletInformationBinding inflate(LayoutInflater layoutInflater) {
        LayoutOutletInformationBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutOutletInformationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.layout_outlet_information, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        LayoutOutletInformationBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        LinearLayout $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public LinearLayout getRoot() {
        LinearLayout r1 = this.rootView;
        return r1;
    }
}

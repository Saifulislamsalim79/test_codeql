package ai.kudi.agent.collections.databinding;

import ai.kudi.agent.collections.R$id;
import ai.kudi.agent.collections.R$layout;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentProductSummaryBinding implements InterfaceC8209a {
    public final KudiButton createVoucherButton;
    private final NestedScrollView rootView;
    public final RecyclerView summaryRecyclerView;
    public final KudiTextView summaryWaringTextView;
    public final TextView textErrorMessage;

    private FragmentProductSummaryBinding(NestedScrollView nestedScrollView, KudiButton kudiButton, RecyclerView recyclerView, KudiTextView kudiTextView, TextView textView) {
        this.rootView = nestedScrollView;
        this.createVoucherButton = kudiButton;
        this.summaryRecyclerView = recyclerView;
        this.summaryWaringTextView = kudiTextView;
        this.textErrorMessage = textView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentProductSummaryBinding bind(View view) {
        int $i0 = R$id.createVoucherButton;
        View $r1 = view.findViewById($i0);
        KudiButton $r2 = (KudiButton) $r1;
        if ($r2 != null) {
            $i0 = R$id.summaryRecyclerView;
            View $r12 = view.findViewById($i0);
            RecyclerView $r3 = (RecyclerView) $r12;
            if ($r3 != null) {
                $i0 = R$id.summary_waring_text_view;
                View $r13 = view.findViewById($i0);
                KudiTextView $r4 = (KudiTextView) $r13;
                if ($r4 != null) {
                    $i0 = R$id.text_error_message;
                    View $r14 = view.findViewById($i0);
                    TextView $r5 = (TextView) $r14;
                    if ($r5 != null) {
                        FragmentProductSummaryBinding $r6 = new FragmentProductSummaryBinding((NestedScrollView) view, $r2, $r3, $r4, $r5);
                        return $r6;
                    }
                }
            }
        }
        Resources $r8 = view.getResources();
        String $r9 = $r8.getResourceName($i0);
        NullPointerException $r10 = new NullPointerException("Missing required view with ID: ".concat($r9));
        throw $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentProductSummaryBinding inflate(LayoutInflater layoutInflater) {
        FragmentProductSummaryBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentProductSummaryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = R$layout.fragment_product_summary;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentProductSummaryBinding $r3 = bind($r2);
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

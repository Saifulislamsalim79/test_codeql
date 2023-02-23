package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentTransferSummaryBinding implements InterfaceC8209a {
    public final KudiButton createVoucherButton;
    public final ProgressBar progressBar;
    private final NestedScrollView rootView;
    public final RecyclerView summaryRecyclerView;
    public final KudiTextView summaryWaringTextView;
    public final TextView textErrorMessage;

    private FragmentTransferSummaryBinding(NestedScrollView nestedScrollView, KudiButton kudiButton, ProgressBar progressBar, RecyclerView recyclerView, KudiTextView kudiTextView, TextView textView) {
        this.rootView = nestedScrollView;
        this.createVoucherButton = kudiButton;
        this.progressBar = progressBar;
        this.summaryRecyclerView = recyclerView;
        this.summaryWaringTextView = kudiTextView;
        this.textErrorMessage = textView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentTransferSummaryBinding bind(View view) {
        int $i0 = C0001R.C0003id.createVoucherButton;
        View $r1 = view.findViewById(C0001R.C0003id.createVoucherButton);
        KudiButton $r2 = (KudiButton) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.progressBar;
            View $r12 = view.findViewById(C0001R.C0003id.progressBar);
            ProgressBar $r3 = (ProgressBar) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.summaryRecyclerView;
                View $r13 = view.findViewById(C0001R.C0003id.summaryRecyclerView);
                RecyclerView $r4 = (RecyclerView) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.summary_waring_text_view;
                    View $r14 = view.findViewById(C0001R.C0003id.summary_waring_text_view);
                    KudiTextView kudiTextView = (KudiTextView) $r14;
                    if (kudiTextView != null) {
                        $i0 = C0001R.C0003id.text_error_message;
                        View $r15 = view.findViewById(C0001R.C0003id.text_error_message);
                        TextView textView = (TextView) $r15;
                        if (textView != null) {
                            NestedScrollView $r8 = (NestedScrollView) view;
                            FragmentTransferSummaryBinding $r7 = new FragmentTransferSummaryBinding($r8, $r2, $r3, $r4, kudiTextView, textView);
                            return $r7;
                        }
                    }
                }
            }
        }
        Resources $r9 = view.getResources();
        String $r10 = $r9.getResourceName($i0);
        NullPointerException $r11 = new NullPointerException("Missing required view with ID: ".concat($r10));
        throw $r11;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentTransferSummaryBinding inflate(LayoutInflater layoutInflater) {
        FragmentTransferSummaryBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentTransferSummaryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_transfer_summary, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentTransferSummaryBinding $r3 = bind($r2);
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
